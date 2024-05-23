package com.zing.zalo.zinstant.utils;

/* renamed from: com.zing.zalo.zinstant.utils.r */
/* loaded from: classes7.dex */
public final class C17206r {

    /* renamed from: a */
    public static final C17206r f87764a = new C17206r();

    private C17206r() {
    }

    /* renamed from: a */
    public static final boolean m91843a(float f11, float f12, double d11) {
        if (f11 != f12) {
            double d12 = f11;
            double d13 = f12;
            if (d12 < d13 - d11 || d12 > d13 + d11) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m91844b(float f11, float f12, double d11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            d11 = 1.0E-6d;
        }
        return m91843a(f11, f12, d11);
    }

    /* renamed from: c */
    public final boolean m91845c(float f11) {
        return m91844b(f11, 0.0f, 0.0d, 4, null);
    }
}
