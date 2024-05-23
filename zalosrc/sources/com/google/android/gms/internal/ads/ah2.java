package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class ah2 implements j04 {

    /* renamed from: a */
    private final w04 f17034a;

    /* renamed from: b */
    private final w04 f17035b;

    /* renamed from: c */
    private final w04 f17036c;

    /* renamed from: d */
    private final w04 f17037d;

    /* renamed from: e */
    private final w04 f17038e;

    /* renamed from: f */
    private final w04 f17039f;

    public ah2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6) {
        this.f17034a = w04Var;
        this.f17035b = w04Var2;
        this.f17036c = w04Var3;
        this.f17037d = w04Var4;
        this.f17038e = w04Var5;
        this.f17039f = w04Var6;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new yg2(uc3Var, (ScheduledExecutorService) this.f17035b.zzb(), (String) this.f17036c.zzb(), (Context) this.f17037d.zzb(), ((m71) this.f17038e).m24483a(), (vs0) this.f17039f.zzb());
    }
}
