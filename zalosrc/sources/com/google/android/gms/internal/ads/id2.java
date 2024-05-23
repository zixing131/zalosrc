package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class id2 implements j04 {

    /* renamed from: a */
    private final w04 f22150a;

    /* renamed from: b */
    private final w04 f22151b;

    /* renamed from: c */
    private final w04 f22152c;

    /* renamed from: d */
    private final w04 f22153d;

    public id2(w04 w04Var, w04 w04Var2, w04 w04Var3, w04 w04Var4) {
        this.f22150a = w04Var;
        this.f22151b = w04Var2;
        this.f22152c = w04Var3;
        this.f22153d = w04Var4;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context m20710a = ((bt0) this.f22150a).m20710a();
        hk0 hk0Var = (hk0) this.f22151b.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f22152c.zzb();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        return new gd2(m20710a, hk0Var, scheduledExecutorService, uc3Var);
    }
}
