package org.webrtc;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes7.dex */
public class GlUtil {
    private GlUtil() {
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        throw new RuntimeException(str + ": GLES20 error: " + glGetError);
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static int generateTexture(int i11) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i12 = iArr[0];
        GLES20.glBindTexture(i11, i12);
        GLES20.glTexParameterf(i11, 10241, 9729.0f);
        GLES20.glTexParameterf(i11, 10240, 9729.0f);
        GLES20.glTexParameterf(i11, 10242, 33071.0f);
        GLES20.glTexParameterf(i11, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i12;
    }
}
