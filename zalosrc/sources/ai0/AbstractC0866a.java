package ai0;

import android.opengl.GLES20;
import fn0.AbstractC19074t;
import fn0.C19067n0;
import java.util.Arrays;

/* renamed from: ai0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC0866a {
    /* renamed from: a */
    public static final void m2492a(int[] iArr, int i11) {
        if (iArr != null) {
            C19067n0 c19067n0 = C19067n0.f94947a;
            AbstractC19074t.m100207e(String.format("glDeleteTextures: %d - %s", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[0]), Thread.currentThread().getName()}, 2)), "format(format, *args)");
            GLES20.glDeleteTextures(1, iArr, i11);
        }
    }

    /* renamed from: b */
    public static final void m2493b(int[] iArr, int i11) {
        if (iArr != null) {
            GLES20.glGenTextures(1, iArr, i11);
            GLES20.glBindTexture(36197, iArr[0]);
            GLES20.glTexParameteri(36197, 10242, 33071);
            GLES20.glTexParameteri(36197, 10243, 33071);
            GLES20.glTexParameteri(36197, 10241, 9729);
            GLES20.glTexParameteri(36197, 10240, 9729);
            GLES20.glBindTexture(36197, 0);
            C19067n0 c19067n0 = C19067n0.f94947a;
            AbstractC19074t.m100207e(String.format("genOESTextureName: %d - %s", Arrays.copyOf(new Object[]{Integer.valueOf(iArr[0]), Thread.currentThread().getName()}, 2)), "format(format, *args)");
        }
    }
}
