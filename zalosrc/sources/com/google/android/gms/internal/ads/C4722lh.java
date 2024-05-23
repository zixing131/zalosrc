package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lh */
/* loaded from: classes2.dex */
public final class C4722lh {

    /* renamed from: d */
    public static final C4722lh f23914d = new C4722lh(1.0f, 1.0f);

    /* renamed from: a */
    public final float f23915a;

    /* renamed from: b */
    public final float f23916b = 1.0f;

    /* renamed from: c */
    private final int f23917c;

    public C4722lh(float f11, float f12) {
        this.f23915a = f11;
        this.f23917c = Math.round(f11 * 1000.0f);
    }

    /* renamed from: a */
    public final long m24289a(long j11) {
        return j11 * this.f23917c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4722lh.class == obj.getClass() && this.f23915a == ((C4722lh) obj).f23915a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f23915a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
