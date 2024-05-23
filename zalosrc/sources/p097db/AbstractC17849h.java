package p097db;

import org.webrtc.videofilter.ZVideoFilter;
import p127eb.C18373b;

/* renamed from: db.h */
/* loaded from: classes3.dex */
public abstract class AbstractC17849h {

    /* renamed from: a */
    private static int f90164a;

    /* renamed from: a */
    public static int m94292a() {
        return f90164a;
    }

    /* renamed from: b */
    public static boolean m94293b() {
        int i11 = f90164a;
        if (i11 == 0) {
            return C17843b.m94137o().m94209x();
        }
        if (i11 == 2) {
            return C17846e.m94223f().m94239j();
        }
        return false;
    }

    /* renamed from: c */
    public static int m94294c() {
        if (f90164a == 0) {
            return C17843b.m94137o().m94207w();
        }
        return ZVideoFilter.SupportType.UNKNOWN.getValue();
    }

    /* renamed from: d */
    public static void m94295d(boolean z11) {
        if (C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94139B(z11);
        } else if (C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94243n(z11);
        }
    }

    /* renamed from: e */
    public static void m94296e(boolean z11) {
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94141D(z11);
            return;
        }
        if (f90164a == 2 && C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94246q(z11);
        } else if (f90164a == 1) {
            C18373b.m97334c().m97340g(z11);
        }
    }

    /* renamed from: f */
    public static int m94297f(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, long j11) {
        int i17;
        long currentTimeMillis = System.currentTimeMillis();
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            i17 = C17843b.m94137o().m94143F(bArr, i11, i12, i13, i14, i15, i16, j11);
        } else {
            if (f90164a == 2) {
                C17846e.m94223f().m94239j();
            }
            i17 = 0;
        }
        ZVideoFilter.Stat.nativeTime.addValue((int) (System.currentTimeMillis() - currentTimeMillis));
        return i17;
    }

    /* renamed from: g */
    public static int m94298g(byte[] bArr, int i11, int i12, int i13, long j11) {
        int i14;
        long currentTimeMillis = System.currentTimeMillis();
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            i14 = C17843b.m94137o().m94144G(bArr, i11, i12, i13, j11);
        } else if (f90164a == 2 && C17846e.m94223f().m94239j()) {
            i14 = C17846e.m94223f().m94247r(bArr, i11, i12, i13, j11);
        } else if (f90164a == 1) {
            i14 = C18373b.m97334c().m97341h(bArr, i11, i12, i13, j11);
        } else {
            i14 = 0;
        }
        ZVideoFilter.Stat.nativeTime.addValue((int) (System.currentTimeMillis() - currentTimeMillis));
        return i14;
    }

    /* renamed from: h */
    public static int m94299h(int i11, int i12, int i13, float[] fArr, int i14, long j11, int i15) {
        int i16;
        long currentTimeMillis = System.currentTimeMillis();
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            i16 = C17843b.m94137o().m94145H(i11, i12, i13, fArr, i14, j11, i15);
        } else if (f90164a == 2 && C17846e.m94223f().m94239j()) {
            i16 = C17846e.m94223f().m94248s(i11, i12, i13, fArr, i14, j11);
        } else if (f90164a == 1) {
            i16 = C18373b.m97334c().m97342i(i11, i12, i13, fArr, i14, j11);
        } else {
            i16 = 0;
        }
        ZVideoFilter.Stat.nativeTime.addValue((int) (System.currentTimeMillis() - currentTimeMillis));
        return i16;
    }

    /* renamed from: i */
    public static boolean m94300i() {
        if (C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94148K();
            return false;
        }
        if (C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94252w();
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public static void m94301j() {
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94155R();
        } else if (f90164a == 2 && C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94253x();
        }
    }

    /* renamed from: k */
    public static void m94302k(int i11) {
        f90164a = i11;
    }

    /* renamed from: l */
    public static void m94303l(boolean z11) {
        if (C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94183j0(z11);
        } else if (C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94226C(z11);
        }
    }

    /* renamed from: m */
    public static void m94304m(boolean z11, int i11) {
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94187l0(z11, i11);
        } else if (f90164a == 2 && C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94227D(!z11);
        }
    }

    /* renamed from: n */
    public static void m94305n() {
        if (C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94189m0();
        } else if (C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94228E();
        }
    }

    /* renamed from: o */
    public static void m94306o() {
        if (f90164a == 0 && C17843b.m94137o().m94209x()) {
            C17843b.m94137o().m94191n0();
        } else if (f90164a == 2 && C17846e.m94223f().m94239j()) {
            C17846e.m94223f().m94229F();
        }
    }
}
