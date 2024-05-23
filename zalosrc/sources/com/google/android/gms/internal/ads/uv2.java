package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class uv2 implements rv2 {

    /* renamed from: a */
    private final rv2 f29063a;

    /* renamed from: b */
    private final Queue f29064b = new LinkedBlockingQueue();

    /* renamed from: c */
    private final int f29065c = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21404v7)).intValue();

    /* renamed from: d */
    private final AtomicBoolean f29066d = new AtomicBoolean(false);

    public uv2(rv2 rv2Var, ScheduledExecutorService scheduledExecutorService) {
        this.f29063a = rv2Var;
        long intValue = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21394u7)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.tv2
            @Override // java.lang.Runnable
            public final void run() {
                uv2.m27071c(uv2.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    /* renamed from: c */
    public static /* synthetic */ void m27071c(uv2 uv2Var) {
        while (!uv2Var.f29064b.isEmpty()) {
            uv2Var.f29063a.mo22194a((qv2) uv2Var.f29064b.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.rv2
    /* renamed from: a */
    public final void mo22194a(qv2 qv2Var) {
        if (this.f29064b.size() >= this.f29065c) {
            if (!this.f29066d.getAndSet(true)) {
                Queue queue = this.f29064b;
                qv2 m25905b = qv2.m25905b("dropped_event");
                Map m25914j = qv2Var.m25914j();
                if (m25914j.containsKey("action")) {
                    m25905b.m25907a("dropped_action", (String) m25914j.get("action"));
                }
                queue.offer(m25905b);
                return;
            }
            return;
        }
        this.f29064b.offer(qv2Var);
    }

    @Override // com.google.android.gms.internal.ads.rv2
    /* renamed from: b */
    public final String mo22195b(qv2 qv2Var) {
        return this.f29063a.mo22195b(qv2Var);
    }
}
