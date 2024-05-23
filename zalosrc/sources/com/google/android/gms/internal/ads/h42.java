package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class h42 implements j04 {

    /* renamed from: a */
    private final w04 f21534a;

    /* renamed from: b */
    private final w04 f21535b;

    /* renamed from: c */
    private final w04 f21536c;

    public h42(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f21534a = w04Var;
        this.f21535b = w04Var2;
        this.f21536c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new g42((Context) this.f21534a.zzb(), (p21) this.f21535b.zzb(), (Executor) this.f21536c.zzb());
    }
}
