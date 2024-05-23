package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class z52 implements j04 {

    /* renamed from: a */
    private final w04 f31373a;

    /* renamed from: b */
    private final w04 f31374b;

    /* renamed from: c */
    private final w04 f31375c;

    public z52(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f31373a = w04Var;
        this.f31374b = w04Var2;
        this.f31375c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new y52((Context) this.f31373a.zzb(), (hi1) this.f31374b.zzb(), (Executor) this.f31375c.zzb());
    }
}
