package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class u32 implements j04 {

    /* renamed from: a */
    private final w04 f28731a;

    /* renamed from: b */
    private final w04 f28732b;

    /* renamed from: c */
    private final w04 f28733c;

    /* renamed from: d */
    private final w04 f28734d;

    public u32(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f28731a = w04Var;
        this.f28732b = w04Var2;
        this.f28733c = w04Var3;
        this.f28734d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new t32((u01) this.f28731a.zzb(), (Context) this.f28732b.zzb(), (Executor) this.f28733c.zzb(), (jq1) this.f28734d.zzb());
    }
}
