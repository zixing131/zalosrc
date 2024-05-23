package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class el2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ cb2 f19669a;

    /* renamed from: b */
    final /* synthetic */ vw2 f19670b;

    /* renamed from: c */
    final /* synthetic */ kw2 f19671c;

    /* renamed from: d */
    final /* synthetic */ gl2 f19672d;

    /* renamed from: e */
    final /* synthetic */ hl2 f19673e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public el2(hl2 hl2Var, cb2 cb2Var, vw2 vw2Var, kw2 kw2Var, gl2 gl2Var) {
        this.f19673e = hl2Var;
        this.f19669a = cb2Var;
        this.f19670b = vw2Var;
        this.f19671c = kw2Var;
        this.f19672d = gl2Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        un2 un2Var;
        final zze m19989a;
        yl2 yl2Var;
        d71 m22965l;
        xw2 xw2Var;
        vw2 vw2Var;
        Executor executor;
        un2Var = this.f19673e.f21831e;
        z01 z01Var = (z01) un2Var.zzd();
        if (z01Var == null) {
            m19989a = cs2.m20997b(th2, null);
        } else {
            m19989a = z01Var.zzb().m19989a(th2);
        }
        synchronized (this.f19673e) {
            try {
                this.f19673e.f21836j = null;
                if (z01Var == null) {
                    yl2Var = this.f19673e.f21830d;
                    yl2Var.mo20715a(m19989a);
                    m22965l = this.f19673e.m22965l(this.f19672d);
                    ((z01) m22965l.zzh()).zzb().m19990c().zzd();
                } else {
                    z01Var.zzc().mo20715a(m19989a);
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21184Z6)).booleanValue()) {
                        executor = this.f19673e.f21828b;
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dl2
                            @Override // java.lang.Runnable
                            public final void run() {
                                yl2 yl2Var2;
                                el2 el2Var = el2.this;
                                zze zzeVar = m19989a;
                                yl2Var2 = el2Var.f19673e.f21830d;
                                yl2Var2.mo20715a(zzeVar);
                            }
                        });
                    }
                }
                wr2.m27705b(m19989a.zza, th2, "AppOpenAdLoader.onFailure");
                this.f19669a.zza();
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f19670b) == null) {
                    xw2Var = this.f19673e.f21834h;
                    kw2 kw2Var = this.f19671c;
                    kw2Var.mo23063a(m19989a);
                    kw2Var.mo23067q(false);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27362c(m19989a);
                    kw2 kw2Var2 = this.f19671c;
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
        yl2 yl2Var;
        v31 v31Var = (v31) obj;
        synchronized (this.f19673e) {
            try {
                this.f19673e.f21836j = null;
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21184Z6)).booleanValue()) {
                    ec1 m27147e = v31Var.m27147e();
                    yl2Var = this.f19673e.f21830d;
                    m27147e.m21687b(yl2Var);
                }
                this.f19669a.zzb(v31Var);
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f19670b) == null) {
                    xw2Var = this.f19673e.f21834h;
                    kw2 kw2Var = this.f19671c;
                    kw2Var.mo23064b(v31Var.m27149g().f28473b);
                    kw2Var.mo23068t(v31Var.m27145c().zzg());
                    kw2Var.mo23067q(true);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27365f(v31Var.m27149g().f28473b);
                    vw2Var.m27364e(v31Var.m27145c().zzg());
                    kw2 kw2Var2 = this.f19671c;
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
