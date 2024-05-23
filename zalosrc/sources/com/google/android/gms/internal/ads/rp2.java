package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class rp2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ cb2 f27337a;

    /* renamed from: b */
    final /* synthetic */ vw2 f27338b;

    /* renamed from: c */
    final /* synthetic */ kw2 f27339c;

    /* renamed from: d */
    final /* synthetic */ tp2 f27340d;

    /* renamed from: e */
    final /* synthetic */ up2 f27341e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rp2(up2 up2Var, cb2 cb2Var, vw2 vw2Var, kw2 kw2Var, tp2 tp2Var) {
        this.f27341e = up2Var;
        this.f27337a = cb2Var;
        this.f27338b = vw2Var;
        this.f27339c = kw2Var;
        this.f27340d = tp2Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        un2 un2Var;
        final zze m19989a;
        kp2 kp2Var;
        rp1 m27035j;
        xw2 xw2Var;
        vw2 vw2Var;
        Executor executor;
        un2Var = this.f27341e.f29020e;
        sp1 sp1Var = (sp1) un2Var.zzd();
        if (sp1Var == null) {
            m19989a = cs2.m20997b(th2, null);
        } else {
            m19989a = sp1Var.zzb().m19989a(th2);
        }
        synchronized (this.f27341e) {
            try {
                if (sp1Var == null) {
                    kp2Var = this.f27341e.f29019d;
                    kp2Var.mo20715a(m19989a);
                    m27035j = this.f27341e.m27035j(this.f27340d);
                    m27035j.zzh().zzb().m19990c().zzd();
                } else {
                    sp1Var.mo25607a().mo20715a(m19989a);
                    executor = this.f27341e.f29017b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qp2
                        @Override // java.lang.Runnable
                        public final void run() {
                            kp2 kp2Var2;
                            rp2 rp2Var = rp2.this;
                            zze zzeVar = m19989a;
                            kp2Var2 = rp2Var.f27341e.f29019d;
                            kp2Var2.mo20715a(zzeVar);
                        }
                    });
                }
                wr2.m27705b(m19989a.zza, th2, "RewardedAdLoader.onFailure");
                this.f27337a.zza();
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f27338b) == null) {
                    xw2Var = this.f27341e.f29022g;
                    kw2 kw2Var = this.f27339c;
                    kw2Var.mo23063a(m19989a);
                    kw2Var.mo23067q(false);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27362c(m19989a);
                    kw2 kw2Var2 = this.f27339c;
                    kw2Var2.mo23067q(false);
                    vw2Var.m27360a(kw2Var2);
                    vw2Var.m27366g();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        kp2 kp2Var;
        Executor executor;
        final kp2 kp2Var2;
        kp2 kp2Var3;
        xw2 xw2Var;
        vw2 vw2Var;
        np1 np1Var = (np1) obj;
        synchronized (this.f27341e) {
            try {
                ec1 m27147e = np1Var.m27147e();
                kp2Var = this.f27341e.f29019d;
                m27147e.m21689d(kp2Var);
                this.f27337a.zzb(np1Var);
                up2 up2Var = this.f27341e;
                executor = up2Var.f29017b;
                kp2Var2 = up2Var.f29019d;
                kp2Var2.getClass();
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.pp2
                    @Override // java.lang.Runnable
                    public final void run() {
                        kp2.this.zzn();
                    }
                });
                kp2Var3 = this.f27341e.f29019d;
                kp2Var3.mo21779j();
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f27338b) == null) {
                    xw2Var = this.f27341e.f29022g;
                    kw2 kw2Var = this.f27339c;
                    kw2Var.mo23064b(np1Var.m27149g().f28473b);
                    kw2Var.mo23068t(np1Var.m27145c().zzg());
                    kw2Var.mo23067q(true);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27365f(np1Var.m27149g().f28473b);
                    vw2Var.m27364e(np1Var.m27145c().zzg());
                    kw2 kw2Var2 = this.f27339c;
                    kw2Var2.mo23067q(true);
                    vw2Var.m27360a(kw2Var2);
                    vw2Var.m27366g();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
