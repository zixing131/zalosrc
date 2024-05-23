package hn0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: hn0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC20104d extends AbstractC20103c {
    /* renamed from: a */
    public static int m104525a(int i11) {
        if (i11 < 0) {
            return -1;
        }
        return i11 > 0 ? 1 : 0;
    }

    /* renamed from: b */
    public static int m104526b(long j11) {
        if (j11 < 0) {
            return -1;
        }
        return j11 > 0 ? 1 : 0;
    }

    /* renamed from: c */
    public static double m104527c(double d11) {
        return Math.log(d11) / C20101a.f98873b;
    }

    /* renamed from: d */
    public static int m104528d(double d11) {
        if (!Double.isNaN(d11)) {
            if (d11 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d11 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d11);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: e */
    public static int m104529e(float f11) {
        if (!Float.isNaN(f11)) {
            return Math.round(f11);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: f */
    public static long m104530f(double d11) {
        if (!Double.isNaN(d11)) {
            return Math.round(d11);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: g */
    public static long m104531g(float f11) {
        long m104530f;
        m104530f = m104530f(f11);
        return m104530f;
    }
}
