package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class tg2 implements j04 {

    /* renamed from: a */
    private final w04 f28318a;

    /* renamed from: b */
    private final w04 f28319b;

    /* renamed from: c */
    private final w04 f28320c;

    /* renamed from: d */
    private final w04 f28321d;

    /* renamed from: e */
    private final w04 f28322e;

    /* renamed from: f */
    private final w04 f28323f;

    /* renamed from: g */
    private final w04 f28324g;

    /* renamed from: h */
    private final w04 f28325h;

    public tg2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8) {
        this.f28318a = w04Var;
        this.f28319b = w04Var2;
        this.f28320c = w04Var3;
        this.f28321d = w04Var4;
        this.f28322e = w04Var5;
        this.f28323f = w04Var6;
        this.f28324g = w04Var7;
        this.f28325h = w04Var8;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new rg2(uc3Var, (ScheduledExecutorService) this.f28319b.zzb(), (String) this.f28320c.zzb(), (j92) this.f28321d.zzb(), (Context) this.f28322e.zzb(), ((m71) this.f28323f).m24483a(), (a92) this.f28324g.zzb(), (wq1) this.f28325h.zzb());
    }
}
