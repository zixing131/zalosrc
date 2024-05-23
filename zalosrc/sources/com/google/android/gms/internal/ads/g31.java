package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class g31 implements j04 {

    /* renamed from: a */
    private final w04 f20377a;

    /* renamed from: b */
    private final w04 f20378b;

    /* renamed from: c */
    private final w04 f20379c;

    /* renamed from: d */
    private final w04 f20380d;

    public g31(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f20377a = w04Var;
        this.f20378b = w04Var2;
        this.f20379c = w04Var3;
        this.f20380d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new b31(((s51) this.f20377a).zzb(), ((f31) this.f20378b).m21874a(), ((e31) this.f20379c).m21610a(), (Executor) this.f20380d.zzb());
    }
}
