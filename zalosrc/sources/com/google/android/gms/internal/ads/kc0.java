package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class kc0 {

    /* renamed from: d */
    public static final kc0 f23208d = new kc0(1.0f, 1.0f);

    /* renamed from: e */
    public static final g94 f23209e = new g94() { // from class: com.google.android.gms.internal.ads.lb0
    };

    /* renamed from: a */
    public final float f23210a;

    /* renamed from: b */
    public final float f23211b;

    /* renamed from: c */
    private final int f23212c;

    public kc0(float f11, float f12) {
        boolean z11;
        if (f11 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        v71.m27173d(z11);
        v71.m27173d(f12 > 0.0f);
        this.f23210a = f11;
        this.f23211b = f12;
        this.f23212c = Math.round(f11 * 1000.0f);
    }

    /* renamed from: a */
    public final long m23868a(long j11) {
        return j11 * this.f23212c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kc0.class == obj.getClass()) {
            kc0 kc0Var = (kc0) obj;
            if (this.f23210a == kc0Var.f23210a && this.f23211b == kc0Var.f23211b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f23210a) + 527) * 31) + Float.floatToRawIntBits(this.f23211b);
    }

    public final String toString() {
        return g92.m22349i("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f23210a), Float.valueOf(this.f23211b));
    }
}
