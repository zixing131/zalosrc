package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class x62 implements j04 {

    /* renamed from: a */
    private final w04 f30365a;

    /* renamed from: b */
    private final w04 f30366b;

    /* renamed from: c */
    private final w04 f30367c;

    public x62(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f30365a = w04Var;
        this.f30366b = w04Var2;
        this.f30367c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new w62((Context) this.f30365a.zzb(), (Executor) this.f30366b.zzb(), (sp1) this.f30367c.zzb());
    }
}
