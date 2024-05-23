package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class i02 implements j04 {

    /* renamed from: a */
    private final w04 f21996a;

    /* renamed from: b */
    private final w04 f21997b;

    /* renamed from: c */
    private final w04 f21998c;

    /* renamed from: d */
    private final w04 f21999d;

    /* renamed from: e */
    private final w04 f22000e;

    /* renamed from: f */
    private final w04 f22001f;

    /* renamed from: g */
    private final w04 f22002g;

    /* renamed from: h */
    private final w04 f22003h;

    /* renamed from: i */
    private final w04 f22004i;

    public i02(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9) {
        this.f21996a = w04Var;
        this.f21997b = w04Var2;
        this.f21998c = w04Var3;
        this.f21999d = w04Var4;
        this.f22000e = w04Var5;
        this.f22001f = w04Var6;
        this.f22002g = w04Var7;
        this.f22003h = w04Var8;
        this.f22004i = w04Var9;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* synthetic */ Object zzb() {
        Context m20710a = ((bt0) this.f21996a).m20710a();
        Executor executor = (Executor) this.f21997b.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new h02(m20710a, executor, uc3Var, new yf0(), ((it0) this.f22000e).zzb(), ((vt0) this.f22001f).zzb(), (ArrayDeque) this.f22002g.zzb(), new m02(), (xw2) this.f22004i.zzb(), null);
    }
}
