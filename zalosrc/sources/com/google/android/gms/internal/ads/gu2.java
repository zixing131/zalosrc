package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class gu2 implements j04 {

    /* renamed from: a */
    private final w04 f20899a;

    public gu2(w04 w04Var) {
        this.f20899a = w04Var;
    }

    @Override // com.google.android.gms.internal.ads.w04
    public final /* bridge */ /* synthetic */ Object zzb() {
        ThreadFactory threadFactory = (ThreadFactory) this.f20899a.zzb();
        l23.m24108a();
        ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, threadFactory));
        r04.m25935b(unconfigurableScheduledExecutorService);
        return unconfigurableScheduledExecutorService;
    }
}
