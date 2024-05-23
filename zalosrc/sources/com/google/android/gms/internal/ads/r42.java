package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class r42 implements j04 {

    /* renamed from: a */
    private final w04 f27082a;

    /* renamed from: b */
    private final w04 f27083b;

    /* renamed from: c */
    private final w04 f27084c;

    /* renamed from: d */
    private final w04 f27085d;

    public r42(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f27082a = w04Var;
        this.f27083b = w04Var2;
        this.f27084c = w04Var3;
        this.f27085d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new q42((Context) this.f27082a.zzb(), (Executor) this.f27083b.zzb(), (lh1) this.f27084c.zzb(), (hq2) this.f27085d.zzb());
    }
}
