package p539u6;

/* renamed from: u6.a */
/* loaded from: classes3.dex */
public abstract class AbstractC27041a {
    /* renamed from: a */
    public static float m139196a(float f11, float f12, float f13, float f14) {
        return (float) Math.hypot(f13 - f11, f14 - f12);
    }

    /* renamed from: b */
    public static float m139197b(float f11, float f12, float f13, float f14, float f15, float f16) {
        return m139200e(m139196a(f11, f12, f13, f14), m139196a(f11, f12, f15, f14), m139196a(f11, f12, f15, f16), m139196a(f11, f12, f13, f16));
    }

    /* renamed from: c */
    public static boolean m139198c(float f11, float f12, float f13) {
        return f11 + f13 >= f12;
    }

    /* renamed from: d */
    public static float m139199d(float f11, float f12, float f13) {
        return ((1.0f - f13) * f11) + (f13 * f12);
    }

    /* renamed from: e */
    private static float m139200e(float f11, float f12, float f13, float f14) {
        return (f11 <= f12 || f11 <= f13 || f11 <= f14) ? (f12 <= f13 || f12 <= f14) ? f13 > f14 ? f13 : f14 : f12 : f11;
    }
}
