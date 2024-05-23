package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class em1 implements j04 {

    /* renamed from: a */
    private final xl1 f19688a;

    /* renamed from: b */
    private final w04 f19689b;

    /* renamed from: c */
    private final w04 f19690c;

    public em1(xl1 xl1Var, w04 w04Var, w04 w04Var2) {
        this.f19688a = xl1Var;
        this.f19689b = w04Var;
        this.f19690c = w04Var2;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new if1(((ip1) this.f19689b).zzb(), (Executor) this.f19690c.zzb());
    }
}
