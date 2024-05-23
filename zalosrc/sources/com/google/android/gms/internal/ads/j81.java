package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class j81 extends kd1 implements a81 {

    /* renamed from: q */
    private final ScheduledExecutorService f22721q;

    /* renamed from: r */
    private ScheduledFuture f22722r;

    /* renamed from: s */
    private boolean f22723s;

    public j81(i81 i81Var, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f22723s = false;
        this.f22721q = scheduledExecutorService;
        m23890s0(i81Var, executor);
    }

    @Override // com.google.android.gms.internal.ads.a81
    /* renamed from: a */
    public final void mo20033a(final zze zzeVar) {
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.c81
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((a81) obj).mo20033a(zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a81
    /* renamed from: l0 */
    public final void mo20034l0(final zzdmo zzdmoVar) {
        if (this.f22723s) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f22722r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.b81
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((a81) obj).mo20034l0(zzdmo.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.a81
    public final void zzb() {
        m23892x0(new jd1() { // from class: com.google.android.gms.internal.ads.e81
            @Override // com.google.android.gms.internal.ads.jd1
            public final void zza(Object obj) {
                ((a81) obj).zzb();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        synchronized (this) {
            yk0.zzg("Timeout waiting for show call succeed to be called.");
            mo20034l0(new zzdmo("Timeout for show call succeed."));
            this.f22723s = true;
        }
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f22722r;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.f22722r = this.f22721q.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.d81
            @Override // java.lang.Runnable
            public final void run() {
                j81.this.zzd();
            }
        }, ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21385t8)).intValue(), TimeUnit.MILLISECONDS);
    }
}
