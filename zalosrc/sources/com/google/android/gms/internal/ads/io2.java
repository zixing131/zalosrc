package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class io2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ cb2 f22247a;

    /* renamed from: b */
    final /* synthetic */ vw2 f22248b;

    /* renamed from: c */
    final /* synthetic */ kw2 f22249c;

    /* renamed from: d */
    final /* synthetic */ lh1 f22250d;

    /* renamed from: e */
    final /* synthetic */ jo2 f22251e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public io2(jo2 jo2Var, cb2 cb2Var, vw2 vw2Var, kw2 kw2Var, lh1 lh1Var) {
        this.f22251e = jo2Var;
        this.f22247a = cb2Var;
        this.f22248b = vw2Var;
        this.f22249c = kw2Var;
        this.f22250d = lh1Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        xw2 xw2Var;
        vw2 vw2Var;
        Executor executor;
        Executor executor2;
        final zze m19989a = this.f22250d.mo20305a().m19989a(th2);
        synchronized (this.f22251e) {
            try {
                this.f22251e.f22911i = null;
                this.f22250d.mo20306b().mo20715a(m19989a);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21194a7)).booleanValue()) {
                    executor = this.f22251e.f22904b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.go2
                        @Override // java.lang.Runnable
                        public final void run() {
                            na2 na2Var;
                            io2 io2Var = io2.this;
                            zze zzeVar = m19989a;
                            na2Var = io2Var.f22251e.f22906d;
                            na2Var.mo20715a(zzeVar);
                        }
                    });
                    executor2 = this.f22251e.f22904b;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ho2
                        @Override // java.lang.Runnable
                        public final void run() {
                            kp2 kp2Var;
                            io2 io2Var = io2.this;
                            zze zzeVar = m19989a;
                            kp2Var = io2Var.f22251e.f22907e;
                            kp2Var.mo20715a(zzeVar);
                        }
                    });
                }
                wr2.m27705b(m19989a.zza, th2, "InterstitialAdLoader.onFailure");
                this.f22247a.zza();
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f22248b) == null) {
                    xw2Var = this.f22251e.f22909g;
                    kw2 kw2Var = this.f22249c;
                    kw2Var.mo23063a(m19989a);
                    kw2Var.mo23067q(false);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27362c(m19989a);
                    kw2 kw2Var2 = this.f22249c;
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
        xw2 xw2Var;
        vw2 vw2Var;
        Executor executor;
        Executor executor2;
        na2 na2Var;
        kp2 kp2Var;
        jg1 jg1Var = (jg1) obj;
        synchronized (this.f22251e) {
            try {
                this.f22251e.f22911i = null;
                AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21194a7;
                if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                    ec1 m27147e = jg1Var.m27147e();
                    na2Var = this.f22251e.f22906d;
                    m27147e.m21686a(na2Var);
                    kp2Var = this.f22251e.f22907e;
                    m27147e.m21689d(kp2Var);
                }
                this.f22247a.zzb(jg1Var);
                if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                    executor = this.f22251e.f22904b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.eo2
                        @Override // java.lang.Runnable
                        public final void run() {
                            na2 na2Var2;
                            na2Var2 = io2.this.f22251e.f22906d;
                            na2Var2.zzn();
                        }
                    });
                    executor2 = this.f22251e.f22904b;
                    executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fo2
                        @Override // java.lang.Runnable
                        public final void run() {
                            kp2 kp2Var2;
                            kp2Var2 = io2.this.f22251e.f22907e;
                            kp2Var2.zzn();
                        }
                    });
                }
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f22248b) == null) {
                    xw2Var = this.f22251e.f22909g;
                    kw2 kw2Var = this.f22249c;
                    kw2Var.mo23064b(jg1Var.m27149g().f28473b);
                    kw2Var.mo23068t(jg1Var.m27145c().zzg());
                    kw2Var.mo23067q(true);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27365f(jg1Var.m27149g().f28473b);
                    vw2Var.m27364e(jg1Var.m27145c().zzg());
                    kw2 kw2Var2 = this.f22249c;
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
