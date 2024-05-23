package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes2.dex */
public final class yj2 implements j04 {

    /* renamed from: a */
    private final w04 f30966a;

    /* renamed from: b */
    private final w04 f30967b;

    /* renamed from: c */
    private final w04 f30968c;

    public yj2(w04 w04Var, w04 w04Var2, w04 w04Var3) {
        this.f30966a = w04Var;
        this.f30967b = w04Var2;
        this.f30968c = w04Var3;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new wj2(new sd0(), (ScheduledExecutorService) this.f30967b.zzb(), ((bt0) this.f30968c).m20710a(), null);
    }
}
