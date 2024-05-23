package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class oz0 implements j04 {

    /* renamed from: a */
    private final w04 f25999a;

    /* renamed from: b */
    private final w04 f26000b;

    /* renamed from: c */
    private final w04 f26001c;

    /* renamed from: d */
    private final w04 f26002d;

    /* renamed from: e */
    private final w04 f26003e;

    /* renamed from: f */
    private final w04 f26004f;

    /* renamed from: g */
    private final w04 f26005g;

    /* renamed from: h */
    private final w04 f26006h;

    /* renamed from: i */
    private final w04 f26007i;

    /* renamed from: j */
    private final w04 f26008j;

    /* renamed from: k */
    private final w04 f26009k;

    /* renamed from: l */
    private final w04 f26010l;

    /* renamed from: m */
    private final w04 f26011m;

    /* renamed from: n */
    private final w04 f26012n;

    public oz0(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4, w04 w04Var5, w04 w04Var6, w04 w04Var7, w04 w04Var8, w04 w04Var9, w04 w04Var10, w04 w04Var11, w04 w04Var12, w04 w04Var13, w04 w04Var14) {
        this.f25999a = w04Var;
        this.f26000b = w04Var2;
        this.f26001c = w04Var3;
        this.f26002d = w04Var4;
        this.f26003e = w04Var5;
        this.f26004f = w04Var6;
        this.f26005g = w04Var7;
        this.f26006h = w04Var8;
        this.f26007i = w04Var9;
        this.f26008j = w04Var10;
        this.f26009k = w04Var11;
        this.f26010l = w04Var12;
        this.f26011m = w04Var13;
        this.f26012n = w04Var14;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* synthetic */ Object zzb() {
        Context m20710a = ((bt0) this.f25999a).m20710a();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new mz0(m20710a, uc3Var, (Executor) this.f26001c.zzb(), (ScheduledExecutorService) this.f26002d.zzb(), ((o41) this.f26003e).m25077a(), ((l41) this.f26004f).m24112a(), (kx2) this.f26005g.zzb(), (lr2) this.f26006h.zzb(), (View) this.f26007i.zzb(), (zq0) this.f26008j.zzb(), (C4830od) this.f26009k.zzb(), (C4592hy) this.f26010l.zzb(), new C4665jy(), (vw2) this.f26012n.zzb(), null);
    }
}
