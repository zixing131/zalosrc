package com.google.android.gms.internal.ads;

import android.os.IBinder;

/* loaded from: classes2.dex */
final class w23 extends p33 {

    /* renamed from: a */
    private final IBinder f29673a;

    /* renamed from: b */
    private final String f29674b;

    /* renamed from: c */
    private final int f29675c;

    /* renamed from: d */
    private final float f29676d;

    /* renamed from: e */
    private final int f29677e;

    /* renamed from: f */
    private final String f29678f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ w23(IBinder iBinder, boolean z11, String str, int i11, float f11, int i12, String str2, int i13, String str3, v23 v23Var) {
        this.f29673a = iBinder;
        this.f29674b = str;
        this.f29675c = i11;
        this.f29676d = f11;
        this.f29677e = i13;
        this.f29678f = str3;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: a */
    public final float mo25387a() {
        return this.f29676d;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: b */
    public final int mo25388b() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: c */
    public final int mo25389c() {
        return this.f29675c;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: d */
    public final int mo25390d() {
        return this.f29677e;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: e */
    public final IBinder mo25391e() {
        return this.f29673a;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof p33) {
            p33 p33Var = (p33) obj;
            if (this.f29673a.equals(p33Var.mo25391e())) {
                p33Var.mo25395i();
                String str2 = this.f29674b;
                if (str2 != null ? str2.equals(p33Var.mo25393g()) : p33Var.mo25393g() == null) {
                    if (this.f29675c == p33Var.mo25389c() && Float.floatToIntBits(this.f29676d) == Float.floatToIntBits(p33Var.mo25387a())) {
                        p33Var.mo25388b();
                        p33Var.mo25394h();
                        if (this.f29677e == p33Var.mo25390d() && ((str = this.f29678f) != null ? str.equals(p33Var.mo25392f()) : p33Var.mo25392f() == null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: f */
    public final String mo25392f() {
        return this.f29678f;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: g */
    public final String mo25393g() {
        return this.f29674b;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: h */
    public final String mo25394h() {
        return null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f29673a.hashCode() ^ 1000003) * 1000003) ^ 1237) * 1000003;
        String str = this.f29674b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int floatToIntBits = (((((((hashCode2 ^ hashCode) * 1000003) ^ this.f29675c) * 1000003) ^ Float.floatToIntBits(this.f29676d)) * 583896283) ^ this.f29677e) * 1000003;
        String str2 = this.f29678f;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return floatToIntBits ^ i11;
    }

    @Override // com.google.android.gms.internal.ads.p33
    /* renamed from: i */
    public final boolean mo25395i() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f29673a.toString() + ", stableSessionToken=false, appId=" + this.f29674b + ", layoutGravity=" + this.f29675c + ", layoutVerticalMargin=" + this.f29676d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.f29677e + ", adFieldEnifd=" + this.f29678f + "}";
    }
}
