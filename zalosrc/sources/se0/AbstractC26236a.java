package se0;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.ETC1;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import ho0.AbstractC20110a;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import mm0.AbstractC23350e;
import p575vf.C27998a;
import p575vf.C28000c;

/* renamed from: se0.a */
/* loaded from: classes4.dex */
public abstract class AbstractC26236a {
    /* renamed from: a */
    public static void m134894a(String str) {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                AbstractC20110a.m104538g("%s: glError %d", str, Integer.valueOf(glGetError));
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static int m134895b(String str) {
        return m134896c(35632, str);
    }

    /* renamed from: c */
    public static int m134896c(int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteShader(glCreateShader);
            return 0;
        }
        return glCreateShader;
    }

    /* renamed from: d */
    public static int m134897d(String str) {
        return m134896c(35633, str);
    }

    /* renamed from: e */
    public static void m134898e(int i11) {
        if (i11 < 0) {
            return;
        }
        m134899f(new int[]{i11}, 0);
    }

    /* renamed from: f */
    public static void m134899f(int[] iArr, int i11) {
        if (iArr == null) {
            return;
        }
        String.format("glDeleteTextures: %d - %s", Integer.valueOf(iArr[0]), Thread.currentThread().getName());
        GLES20.glDeleteTextures(1, iArr, i11);
    }

    /* renamed from: g */
    public static void m134900g(C27998a c27998a) {
        if (c27998a != null) {
            C28000c.m141116b().m141119d(c27998a);
        }
    }

    /* renamed from: h */
    private static void m134901h(int[] iArr, int i11) {
        GLES20.glGenTextures(1, iArr, i11);
        GLES20.glBindTexture(3553, iArr[i11]);
        GLES20.glTexParameterf(3553, 10240, 9729.0f);
        GLES20.glTexParameterf(3553, 10241, 9729.0f);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        int i12 = iArr[i11];
    }

    /* renamed from: i */
    public static void m134902i(int[] iArr, int i11) {
        if (iArr == null) {
            return;
        }
        GLES20.glGenTextures(1, iArr, i11);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glBindTexture(36197, 0);
        String.format("genOESTextureName: %d - %s", Integer.valueOf(iArr[0]), Thread.currentThread().getName());
    }

    /* renamed from: j */
    public static void m134903j(int[] iArr, int i11, int i12, int i13, Buffer buffer) {
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(32873, iArr2, 0);
        m134901h(iArr, i11);
        GLES20.glTexImage2D(3553, 0, 6408, i12, i13, 0, 6408, 5121, buffer);
        int i14 = iArr2[0];
        if (i14 > 0) {
            GLES20.glBindTexture(3553, i14);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: k */
    public static void m134904k(int[] iArr, int i11, Bitmap bitmap) {
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(32873, iArr2, 0);
        m134901h(iArr, i11);
        if (bitmap != null) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        int i12 = iArr2[0];
        if (i12 > 0) {
            GLES20.glBindTexture(3553, i12);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: l */
    public static void m134905l(int[] iArr, int i11, int i12, int i13, Buffer buffer) {
        if (ETC1Util.isETC1Supported()) {
            int[] iArr2 = new int[1];
            GLES20.glGetIntegerv(32873, iArr2, 0);
            m134901h(iArr, i11);
            GLES20.glCompressedTexImage2D(3553, 0, 36196, i12, i13, 0, buffer.remaining(), buffer);
            int i14 = iArr2[0];
            if (i14 > 0) {
                GLES20.glBindTexture(3553, i14);
                return;
            } else {
                GLES20.glBindTexture(3553, 0);
                return;
            }
        }
        int i15 = i12 * 3;
        ByteBuffer order = ByteBuffer.allocateDirect(i15 * i13).order(ByteOrder.nativeOrder());
        ETC1.decodeImage(buffer, order, i12, i13, 3, i15);
        m134903j(iArr, i11, i12, i13, order);
    }

    /* renamed from: m */
    public static C27998a m134906m(int i11, int i12) {
        C27998a m141118c = C28000c.m141116b().m141118c(i11, i12);
        m141118c.m141108a();
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        m141118c.m141115j();
        return m141118c;
    }

    /* renamed from: n */
    public static int m134907n(int i11, int i12) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, i11);
        GLES20.glAttachShader(glCreateProgram, i12);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            GLES20.glDeleteProgram(glCreateProgram);
            return 0;
        }
        return glCreateProgram;
    }

    /* renamed from: o */
    public static int m134908o(String str, String str2) {
        int m134897d = m134897d(str);
        if (m134897d == 0) {
            AbstractC23350e.m122774d("Load Program", "Vertex Shader Failed");
            return 0;
        }
        int m134895b = m134895b(str2);
        if (m134895b == 0) {
            AbstractC23350e.m122774d("Load Program", "Fragment Shader Failed");
            return 0;
        }
        int m134907n = m134907n(m134897d, m134895b);
        GLES20.glDeleteShader(m134897d);
        GLES20.glDeleteShader(m134895b);
        return m134907n;
    }

    /* renamed from: p */
    public static int m134909p(Bitmap bitmap, int i11, boolean z11) {
        int[] iArr = new int[1];
        if (i11 == -1) {
            m134901h(iArr, 0);
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

    /* renamed from: q */
    public static Bitmap m134910q(Bitmap bitmap, ByteBuffer byteBuffer, int i11, int i12, int i13, int i14, boolean z11) {
        if (byteBuffer == null) {
            return bitmap;
        }
        int[] iArr = new int[byteBuffer.remaining() / 4];
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN).asIntBuffer().get(iArr);
        return m134911r(bitmap, IntBuffer.wrap(iArr), i11, i12, i13, i14, z11);
    }

    /* renamed from: r */
    public static Bitmap m134911r(Bitmap bitmap, IntBuffer intBuffer, int i11, int i12, int i13, int i14, boolean z11) {
        if (intBuffer == null) {
            return bitmap;
        }
        int[] iArr = new int[i13];
        int[] array = intBuffer.array();
        for (int i15 = 0; i15 < i14 / 2; i15++) {
            int i16 = i15 * i13;
            System.arraycopy(array, i16, iArr, 0, i13);
            int i17 = ((i14 - i15) - 1) * i13;
            System.arraycopy(array, i17, array, i16, i13);
            System.arraycopy(iArr, 0, array, i17, i13);
        }
        int i18 = (i13 - i11) / 2;
        int i19 = (i14 - i12) / 2;
        for (int i21 = 0; i21 < i12; i21++) {
            System.arraycopy(array, ((i19 + i21) * i13) + i18, iArr, 0, i11);
            System.arraycopy(iArr, 0, array, i21 * i11, i11);
        }
        if (z11) {
            IntBuffer allocate = IntBuffer.allocate(i11 * i12);
            int[] array2 = allocate.array();
            int i22 = (i12 - 1) * i11;
            int i23 = i22;
            int i24 = 0;
            for (int i25 = 0; i25 < array2.length; i25++) {
                array2[i25] = array[i23];
                i23 -= i11;
                if (i23 < 0) {
                    i24++;
                    i23 = i22 + i24;
                }
            }
            bitmap.copyPixelsFromBuffer(allocate);
        } else {
            bitmap.copyPixelsFromBuffer(intBuffer);
        }
        return bitmap;
    }

    /* renamed from: s */
    public static Bitmap m134912s(int i11, int i12, int i13, int i14, boolean z11) {
        int i15;
        int i16;
        if (z11) {
            i15 = i12;
        } else {
            i15 = i11;
        }
        if (z11) {
            i16 = i11;
        } else {
            i16 = i12;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
            IntBuffer allocate = IntBuffer.allocate(i13 * i14);
            allocate.rewind();
            GLES20.glReadPixels(0, 0, i13, i14, 6408, 5121, allocate);
            Bitmap m134911r = m134911r(createBitmap, allocate, i11, i12, i13, i14, z11);
            allocate.rewind();
            return m134911r;
        } catch (Exception | OutOfMemoryError e11) {
            AbstractC20110a.m104539h(e11);
            return null;
        }
    }

    /* renamed from: t */
    public static boolean m134913t(Context context) {
        if (((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >= 131072) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static void m134914u(int i11, Bitmap bitmap) {
        m134915v(new int[]{i11}, 0, bitmap);
    }

    /* renamed from: v */
    public static void m134915v(int[] iArr, int i11, Bitmap bitmap) {
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(32873, iArr2, 0);
        GLES20.glBindTexture(3553, iArr[i11]);
        if (bitmap != null) {
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        }
        int i12 = iArr[i11];
        int i13 = iArr2[0];
        if (i13 > 0) {
            GLES20.glBindTexture(3553, i13);
        } else {
            GLES20.glBindTexture(3553, 0);
        }
    }
}
