package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class sn1 implements j04 {

    /* renamed from: a */
    private final w04 f27790a;

    /* renamed from: b */
    private final w04 f27791b;

    /* renamed from: c */
    private final w04 f27792c;

    public sn1(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f27790a = w04Var;
        this.f27791b = w04Var2;
        this.f27792c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new qn1((Executor) this.f27790a.zzb(), (i01) this.f27791b.zzb(), (kf1) this.f27792c.zzb());
    }
}
