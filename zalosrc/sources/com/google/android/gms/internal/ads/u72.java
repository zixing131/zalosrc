package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class u72 implements j04 {

    /* renamed from: a */
    private final w04 f28782a;

    /* renamed from: b */
    private final w04 f28783b;

    /* renamed from: c */
    private final w04 f28784c;

    public u72(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f28782a = w04Var;
        this.f28783b = w04Var2;
        this.f28784c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new t72((Context) this.f28782a.zzb(), (Executor) this.f28783b.zzb(), (sp1) this.f28784c.zzb());
    }
}
