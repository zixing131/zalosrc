package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import p229i5.InterfaceC20285f;

/* loaded from: classes2.dex */
public final class gj1 implements j04 {

    /* renamed from: a */
    private final w04 f20613a;

    /* renamed from: b */
    private final w04 f20614b;

    /* renamed from: c */
    private final w04 f20615c;

    /* renamed from: d */
    private final w04 f20616d;

    public gj1(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f20613a = w04Var;
        this.f20614b = w04Var2;
        this.f20615c = w04Var3;
        this.f20616d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        C4730lp c4730lp = (C4730lp) this.f20613a.zzb();
        Executor executor = (Executor) this.f20614b.zzb();
        Context context = (Context) this.f20615c.zzb();
        return new i01(executor, new uz0(context, c4730lp), (InterfaceC20285f) this.f20616d.zzb());
    }
}
