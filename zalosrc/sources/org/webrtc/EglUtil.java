package org.webrtc;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.opengl.GLUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes7.dex */
public class EglUtil {
    private static final int FLOAT_SIZE_BYTES = 4;
    public static final int NO_TEXTURE = -1;

    private EglUtil() {
    }

    public static int createBuffer(float[] fArr) {
        return createBuffer(toFloatBuffer(fArr));
    }

    public static int createProgram(int i11, int i12) throws GLException {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram != 0) {
            GLES20.glAttachShader(glCreateProgram, i11);
            GLES20.glAttachShader(glCreateProgram, i12);
            GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] == 1) {
                return glCreateProgram;
            }
            GLES20.glDeleteProgram(glCreateProgram);
            throw new RuntimeException("Could not link program");
        }
        throw new RuntimeException("Could not create program");
    }

    public static int loadShader(String str, int i11) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Compilation\n");
            sb2.append(GLES20.glGetShaderInfoLog(glCreateShader));
            return 0;
        }
        return glCreateShader;
    }

    public static int loadTexture(Bitmap bitmap, int i11, boolean z11) {
        int[] iArr = new int[1];
        if (i11 == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i11);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i11;
        }
        if (z11) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static void setupSampler(int i11, int i12, int i13) {
        GLES20.glTexParameterf(i11, 10240, i12);
        GLES20.glTexParameterf(i11, 10241, i13);
        GLES20.glTexParameteri(i11, 10242, 33071);
        GLES20.glTexParameteri(i11, 10243, 33071);
    }

    public static FloatBuffer toFloatBuffer(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        return asFloatBuffer;
    }

    public static void updateBufferData(int i11, FloatBuffer floatBuffer) {
        GLES20.glBindBuffer(34962, i11);
        GLES20.glBufferData(34962, floatBuffer.capacity() * 4, floatBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
    }

    public static int createBuffer(FloatBuffer floatBuffer) {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        updateBufferData(iArr[0], floatBuffer);
        return iArr[0];
    }
}
