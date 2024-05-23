package org.webrtc;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes7.dex */
public class GlFramebufferObject {
    static final String TAG = "FBO";
    private int framebufferName;
    private int height;
    private int renderBufferName;
    private int texName;
    private int width;

    public Bitmap createBitmapFromGLSurface(int i11, int i12, GL10 gl10) {
        int i13 = i11 * i12;
        int[] iArr = new int[i13];
        int[] iArr2 = new int[i13];
        IntBuffer wrap = IntBuffer.wrap(iArr);
        wrap.position(0);
        try {
            gl10.glReadPixels(0, 0, i11, i12, 6408, 5121, wrap);
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = i14 * i11;
                int i16 = ((i12 - i14) - 1) * i11;
                for (int i17 = 0; i17 < i11; i17++) {
                    int i18 = iArr[i15 + i17];
                    iArr2[i16 + i17] = (i18 & (-16711936)) | ((i18 << 16) & 16711680) | ((i18 >> 16) & 255);
                }
            }
            return Bitmap.createBitmap(iArr2, i11, i12, Bitmap.Config.ARGB_8888);
        } catch (GLException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("createBitmapFromGLSurface: ");
            sb2.append(e11.getMessage());
            return null;
        }
    }

    public void enable() {
        GLES20.glBindFramebuffer(36160, this.framebufferName);
    }

    public int getFrameBufferName() {
        return this.framebufferName;
    }

    public int getHeight() {
        return this.height;
    }

    public int getTexName() {
        return this.texName;
    }

    public int getWidth() {
        return this.width;
    }

    public void glTexImage2D(int i11, int i12, int i13, int i14, int i15, int i16, ByteBuffer byteBuffer) {
        GLES20.glBindTexture(3553, this.texName);
        GLES20.glTexSubImage2D(i11, i12, 0, 0, i13, i14, i15, i16, byteBuffer);
    }

    public void release() {
        int[] iArr = {this.texName};
        GLES20.glDeleteTextures(1, iArr, 0);
        this.texName = 0;
        iArr[0] = this.renderBufferName;
        GLES20.glDeleteRenderbuffers(1, iArr, 0);
        this.renderBufferName = 0;
        iArr[0] = this.framebufferName;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        this.framebufferName = 0;
    }

    public void saveAsPngImage(Bitmap bitmap, String str) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
        } catch (FileNotFoundException e11) {
            e11.printStackTrace();
        } catch (IOException e12) {
            e12.printStackTrace();
        }
    }

    public void setup(int i11, int i12) {
        this.width = i11;
        this.height = i12;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i13 = iArr[0];
        if (i11 <= i13 && i12 <= i13) {
            GLES20.glGetIntegerv(34024, iArr, 0);
            int i14 = iArr[0];
            if (i11 <= i14 && i12 <= i14) {
                GLES20.glGetIntegerv(36006, iArr, 0);
                int i15 = iArr[0];
                GLES20.glGetIntegerv(36007, iArr, 0);
                int i16 = iArr[0];
                GLES20.glGetIntegerv(32873, iArr, 0);
                int i17 = iArr[0];
                release();
                try {
                    this.width = i11;
                    this.height = i12;
                    GLES20.glGenFramebuffers(1, iArr, 0);
                    int i18 = iArr[0];
                    this.framebufferName = i18;
                    GLES20.glBindFramebuffer(36160, i18);
                    GLES20.glGenRenderbuffers(1, iArr, 0);
                    int i19 = iArr[0];
                    this.renderBufferName = i19;
                    GLES20.glBindRenderbuffer(36161, i19);
                    GLES20.glRenderbufferStorage(36161, 33189, i11, i12);
                    GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.renderBufferName);
                    GLES20.glGenTextures(1, iArr, 0);
                    int i21 = iArr[0];
                    this.texName = i21;
                    GLES20.glBindTexture(3553, i21);
                    EglUtil.setupSampler(3553, 9729, 9728);
                    GLES20.glTexImage2D(3553, 0, 6408, i11, i12, 0, 6408, 5121, null);
                    GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.texName, 0);
                    int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
                    if (glCheckFramebufferStatus == 36053) {
                        GLES20.glBindFramebuffer(36160, i15);
                        GLES20.glBindRenderbuffer(36161, i16);
                        GLES20.glBindTexture(3553, i17);
                        return;
                    } else {
                        throw new RuntimeException("Failed to initialize framebuffer object " + glCheckFramebufferStatus);
                    }
                } catch (RuntimeException e11) {
                    e11.getMessage();
                    release();
                    throw e11;
                }
            }
            throw new IllegalArgumentException("GL_MAX_RENDERBUFFER_SIZE " + iArr[0]);
        }
        throw new IllegalArgumentException("GL_MAX_TEXTURE_SIZE " + iArr[0]);
    }
}
