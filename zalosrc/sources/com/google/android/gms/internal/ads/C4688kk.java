package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.kk */
/* loaded from: classes2.dex */
public final class C4688kk {

    /* renamed from: f */
    public static final C4688kk f23345f = new C4688kk(new C4613ii());

    /* renamed from: g */
    public static final g94 f23346g = new g94() { // from class: com.google.android.gms.internal.ads.kh
    };

    /* renamed from: a */
    public final long f23347a;

    /* renamed from: b */
    public final long f23348b;

    /* renamed from: c */
    public final long f23349c;

    /* renamed from: d */
    public final float f23350d;

    /* renamed from: e */
    public final float f23351e;

    private C4688kk(C4613ii c4613ii) {
        this.f23347a = -9223372036854775807L;
        this.f23348b = -9223372036854775807L;
        this.f23349c = -9223372036854775807L;
        this.f23350d = -3.4028235E38f;
        this.f23351e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4688kk)) {
            return false;
        }
        long j11 = ((C4688kk) obj).f23347a;
        return true;
    }

    public final int hashCode() {
        int i11 = (int) (-9223372034707292159L);
        return (((((((i11 * 31) + i11) * 31) + i11) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
