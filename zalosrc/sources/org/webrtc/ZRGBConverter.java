package org.webrtc;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* loaded from: classes7.dex */
class ZRGBConverter {
    private static final String FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES oesTex;\n\nvoid main() {\n  gl_FragColor = texture2D(oesTex, interp_tc);\n}\n";
    private static final String VERTEX_SHADER = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n";
    private int frameBufferHeight;
    private final int frameBufferId;
    private int frameBufferWidth;
    private final int frameTextureId;
    private boolean released = false;
    private final GlShader shader;
    private final int texMatrixLoc;
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    public ZRGBConverter() {
        int generateTexture = GlUtil.generateTexture(3553);
        this.frameTextureId = generateTexture;
        this.frameBufferWidth = 0;
        this.frameBufferHeight = 0;
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        int i11 = iArr[0];
        this.frameBufferId = i11;
        GLES20.glBindFramebuffer(36160, i11);
        GlUtil.checkNoGLES2Error("Generate framebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, generateTexture, 0);
        GlUtil.checkNoGLES2Error("Attach texture to framebuffer");
        GLES20.glBindFramebuffer(36160, 0);
        GlShader glShader = new GlShader(VERTEX_SHADER, FRAGMENT_SHADER);
        this.shader = glShader;
        glShader.useProgram();
        this.texMatrixLoc = glShader.getUniformLocation("texMatrix");
        GLES20.glUniform1i(glShader.getUniformLocation("oesTex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        glShader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        glShader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public void convert(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, float[] fArr) {
        if (!this.released) {
            if (i13 >= i11) {
                if (byteBuffer.capacity() >= i13 * i12) {
                    float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                    GLES20.glBindFramebuffer(36160, this.frameBufferId);
                    GlUtil.checkNoGLES2Error("glBindFramebuffer");
                    int i15 = i13 / 4;
                    if (this.frameBufferWidth != i15 || this.frameBufferHeight != i12) {
                        this.frameBufferWidth = i15;
                        this.frameBufferHeight = i12;
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, this.frameTextureId);
                        GLES20.glTexImage2D(3553, 0, 6408, this.frameBufferWidth, this.frameBufferHeight, 0, 6408, 5121, null);
                        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                        if (glCheckFramebufferStatus != 36053) {
                            throw new IllegalStateException("Framebuffer not complete, status: " + glCheckFramebufferStatus);
                        }
                    }
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(36197, i14);
                    GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, multiplyMatrices, 0);
                    GLES20.glViewport(0, 0, i11, i12);
                    GLES20.glDrawArrays(5, 0, 4);
                    GLES20.glReadPixels(0, 0, this.frameBufferWidth, this.frameBufferHeight, 6408, 5121, byteBuffer);
                    GlUtil.checkNoGLES2Error("ZOesToBufferConverter.convert");
                    GLES20.glBindFramebuffer(36160, 0);
                    GLES20.glBindTexture(3553, 0);
                    GLES20.glBindTexture(36197, 0);
                    return;
                }
                throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
            }
            throw new IllegalArgumentException("Invalid stride, must >= width");
        }
        throw new IllegalStateException("YuvConverter.convert called on released object");
    }

    public void release() {
        this.released = true;
        this.shader.release();
        GLES20.glDeleteTextures(1, new int[]{this.frameTextureId}, 0);
        GLES20.glDeleteFramebuffers(1, new int[]{this.frameBufferId}, 0);
        this.frameBufferWidth = 0;
        this.frameBufferHeight = 0;
    }
}
