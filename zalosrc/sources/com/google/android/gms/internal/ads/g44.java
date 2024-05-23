package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes2.dex */
public final class g44 {

    /* renamed from: a */
    private final l14 f20403a;

    public g44(Context context, hq0 hq0Var, byte[] bArr) {
        this.f20403a = new l14(context, hq0Var, null);
    }

    /* renamed from: a */
    public final g44 m22280a(final i34 i34Var) {
        l14 l14Var = this.f20403a;
        v71.m27175f(!l14Var.f23691q);
        i34Var.getClass();
        l14Var.f23680f = new a63() { // from class: com.google.android.gms.internal.ads.d14
            @Override // com.google.android.gms.internal.ads.a63
            public final Object zza() {
                return i34.this;
            }
        };
        return this;
    }

    /* renamed from: b */
    public final g44 m22281b(final aj4 aj4Var) {
        l14 l14Var = this.f20403a;
        v71.m27175f(!l14Var.f23691q);
        aj4Var.getClass();
        l14Var.f23679e = new a63() { // from class: com.google.android.gms.internal.ads.e14
            @Override // com.google.android.gms.internal.ads.a63
            public final Object zza() {
                return aj4.this;
            }
        };
        return this;
    }

    /* renamed from: c */
    public final h44 m22282c() {
        l14 l14Var = this.f20403a;
        v71.m27175f(!l14Var.f23691q);
        l14Var.f23691q = true;
        return new h44(l14Var);
    }
}
