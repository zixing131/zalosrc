package org.webrtc;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

/* loaded from: classes7.dex */
class YuvConverter {
    private static final String OES_FRAGMENT_SHADER = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 interp_tc;\n\nuniform samplerExternalOES tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String RGB_FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 interp_tc;\n\nuniform sampler2D tex;\nuniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      texture2D(tex, interp_tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String VERTEX_SHADER = "varying vec2 interp_tc;\nattribute vec4 in_pos;\nattribute vec4 in_tc;\n\nuniform mat4 texMatrix;\n\nvoid main() {\n    gl_Position = in_pos;\n    interp_tc = (texMatrix * in_tc).xy;\n}\n";
    private final int coeffsLoc;
    private int frameBufferHeight;
    private final int frameBufferId;
    private int frameBufferWidth;
    private final int frameTextureId;
    private boolean released = false;
    private final GlShader shader;
    private final int texMatrixLoc;
    private final int xUnitLoc;
    private static final FloatBuffer DEVICE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
    private static final FloatBuffer TEXTURE_RECTANGLE = GlUtil.createFloatBuffer(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});

    public YuvConverter() {
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
        GlShader glShader = new GlShader(VERTEX_SHADER, RGB_FRAGMENT_SHADER);
        this.shader = glShader;
        glShader.useProgram();
        this.texMatrixLoc = glShader.getUniformLocation("texMatrix");
        this.xUnitLoc = glShader.getUniformLocation("xUnit");
        this.coeffsLoc = glShader.getUniformLocation("coeffs");
        GLES20.glUniform1i(glShader.getUniformLocation("tex"), 0);
        GlUtil.checkNoGLES2Error("Initialize fragment shader uniform values.");
        glShader.setVertexAttribArray("in_pos", 2, DEVICE_RECTANGLE);
        glShader.setVertexAttribArray("in_tc", 2, TEXTURE_RECTANGLE);
    }

    public void convert(ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, float[] fArr) {
        if (!this.released) {
            if (i13 % 8 == 0) {
                if (i13 >= i11) {
                    int i15 = (i11 + 3) / 4;
                    int i16 = (i11 + 7) / 8;
                    int i17 = (i12 + 1) / 2;
                    int i18 = i12 + i17;
                    if (byteBuffer.capacity() >= i13 * i18) {
                        float[] multiplyMatrices = RendererCommon.multiplyMatrices(fArr, RendererCommon.verticalFlipMatrix());
                        GLES20.glBindFramebuffer(36160, this.frameBufferId);
                        GlUtil.checkNoGLES2Error("glBindFramebuffer");
                        int i19 = i13 / 4;
                        if (this.frameBufferWidth != i19 || this.frameBufferHeight != i18) {
                            this.frameBufferWidth = i19;
                            this.frameBufferHeight = i18;
                            GLES20.glActiveTexture(33984);
                            GLES20.glBindTexture(3553, this.frameTextureId);
                            GLES20.glTexImage2D(3553, 0, 6408, this.frameBufferWidth, this.frameBufferHeight, 0, 6408, 5121, null);
                            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                            if (glCheckFramebufferStatus != 36053) {
                                throw new IllegalStateException("Framebuffer not complete, status: " + glCheckFramebufferStatus);
                            }
                        }
                        GLES20.glActiveTexture(33984);
                        GLES20.glBindTexture(3553, i14);
                        GLES20.glUniformMatrix4fv(this.texMatrixLoc, 1, false, multiplyMatrices, 0);
                        GLES20.glViewport(0, 0, i15, i12);
                        float f11 = i11;
                        GLES20.glUniform2f(this.xUnitLoc, multiplyMatrices[0] / f11, multiplyMatrices[1] / f11);
                        GLES20.glUniform4f(this.coeffsLoc, 0.256788f, 0.504129f, 0.0979059f, 0.0627451f);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glViewport(0, i12, i16, i17);
                        GLES20.glUniform2f(this.xUnitLoc, (multiplyMatrices[0] * 2.0f) / f11, (multiplyMatrices[1] * 2.0f) / f11);
                        GLES20.glUniform4f(this.coeffsLoc, -0.148223f, -0.290993f, 0.439216f, 0.501961f);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glViewport(i13 / 8, i12, i16, i17);
                        GLES20.glUniform4f(this.coeffsLoc, 0.439216f, -0.367788f, -0.0714274f, 0.501961f);
                        GLES20.glDrawArrays(5, 0, 4);
                        GLES20.glReadPixels(0, 0, this.frameBufferWidth, this.frameBufferHeight, 6408, 5121, byteBuffer);
                        GlUtil.checkNoGLES2Error("YuvConverter.convert");
                        GLES20.glBindFramebuffer(36160, 0);
                        GLES20.glBindTexture(3553, 0);
                        GLES20.glBindTexture(36197, 0);
                        return;
                    }
                    throw new IllegalArgumentException("YuvConverter.convert called with too small buffer");
                }
                throw new IllegalArgumentException("Invalid stride, must >= width");
            }
            throw new IllegalArgumentException("Invalid stride, must be a multiple of 8");
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
