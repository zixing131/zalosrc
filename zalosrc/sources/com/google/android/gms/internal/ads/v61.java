package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class v61 implements w71, ze1, rc1, m81, InterfaceC4880pp {

    /* renamed from: p */
    private final o81 f29203p;

    /* renamed from: q */
    private final iq2 f29204q;

    /* renamed from: r */
    private final ScheduledExecutorService f29205r;

    /* renamed from: s */
    private final Executor f29206s;

    /* renamed from: u */
    private ScheduledFuture f29208u;

    /* renamed from: t */
    private final cd3 f29207t = cd3.m20862D();

    /* renamed from: v */
    private final AtomicBoolean f29209v = new AtomicBoolean();

    public v61(o81 o81Var, iq2 iq2Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f29203p = o81Var;
        this.f29204q = iq2Var;
        this.f29205r = scheduledExecutorService;
        this.f29206s = executor;
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: G */
    public final void mo20101G(cg0 cg0Var, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.w71
    /* renamed from: Q */
    public final void mo20102Q() {
    }

    /* renamed from: c */
    public final /* synthetic */ void m27169c() {
        synchronized (this) {
            try {
                if (this.f29207t.isDone()) {
                    return;
                }
                this.f29207t.mo20863g(Boolean.TRUE);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
    /* renamed from: m0 */
    public final void mo21778m0(C4842op c4842op) {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21120S8)).booleanValue() && this.f29204q.f22312Z != 2 && c4842op.f25735j && this.f29209v.compareAndSet(false, true)) {
            zze.zza("Full screen 1px impression occurred");
            this.f29203p.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.m81
    /* renamed from: z */
    public final synchronized void mo22412z(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.f29207t.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f29208u;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f29207t.mo20864h(new Exception());
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.rc1
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.rc1
    public final synchronized void zze() {
        try {
            if (this.f29207t.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f29208u;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f29207t.mo20863g(Boolean.TRUE);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.ze1
    public final void zzf() {
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21338p1)).booleanValue()) {
            iq2 iq2Var = this.f29204q;
            if (iq2Var.f22312Z == 2) {
                if (iq2Var.f22346r == 0) {
                    this.f29203p.zza();
                } else {
                    kc3.m23886r(this.f29207t, new t61(this), this.f29206s);
                    this.f29208u = this.f29205r.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.s61
                        public /* synthetic */ s61() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            v61.this.m27169c();
                        }
                    }, this.f29204q.f22346r, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ze1
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzo() {
        int i11 = this.f29204q.f22312Z;
        if (i11 == 0 || i11 == 1) {
            if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21120S8)).booleanValue()) {
                this.f29203p.zza();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.w71
    public final void zzr() {
    }
}
