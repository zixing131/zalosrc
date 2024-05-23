package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class j41 {

    /* renamed from: a */
    private final Executor f22631a;

    /* renamed from: b */
    private final ScheduledExecutorService f22632b;

    /* renamed from: c */
    private final tc3 f22633c;

    /* renamed from: d */
    private volatile boolean f22634d = true;

    public j41(Executor executor, ScheduledExecutorService scheduledExecutorService, tc3 tc3Var) {
        this.f22631a = executor;
        this.f22632b = scheduledExecutorService;
        this.f22633c = tc3Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* bridge */ /* synthetic */ void m23515b(final j41 j41Var, List list, final gc3 gc3Var) {
        if (list != null && !list.isEmpty()) {
            tc3 m23877i = kc3.m23877i(null);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final tc3 tc3Var = (tc3) it.next();
                m23877i = kc3.m23882n(kc3.m23875g(m23877i, Throwable.class, new qb3() { // from class: com.google.android.gms.internal.ads.e41
                    @Override // com.google.android.gms.internal.ads.qb3
                    public final tc3 zza(Object obj) {
                        gc3.this.zza((Throwable) obj);
                        return kc3.m23877i(null);
                    }
                }, j41Var.f22631a), new qb3() { // from class: com.google.android.gms.internal.ads.f41
                    @Override // com.google.android.gms.internal.ads.qb3
                    public final tc3 zza(Object obj) {
                        return j41.this.m23517a(gc3Var, tc3Var, (v31) obj);
                    }
                }, j41Var.f22631a);
            }
            kc3.m23886r(m23877i, new i41(j41Var, gc3Var), j41Var.f22631a);
            return;
        }
        j41Var.f22631a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.d41
            @Override // java.lang.Runnable
            public final void run() {
                gc3.this.zza(new zzebh(3));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ tc3 m23517a(gc3 gc3Var, tc3 tc3Var, v31 v31Var) {
        if (v31Var != null) {
            gc3Var.zzb(v31Var);
        }
        return kc3.m23883o(tc3Var, ((Long) AbstractC4740lz.f24313b.m24091e()).longValue(), TimeUnit.MILLISECONDS, this.f22632b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m23518d() {
        this.f22634d = false;
    }

    /* renamed from: e */
    public final void m23519e(gc3 gc3Var) {
        kc3.m23886r(this.f22633c, new h41(this, gc3Var), this.f22631a);
    }

    /* renamed from: f */
    public final boolean m23520f() {
        return this.f22634d;
    }
}
