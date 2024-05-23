package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class jb2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ cb2 f22741a;

    /* renamed from: b */
    final /* synthetic */ vw2 f22742b;

    /* renamed from: c */
    final /* synthetic */ kw2 f22743c;

    /* renamed from: d */
    final /* synthetic */ hi1 f22744d;

    /* renamed from: e */
    final /* synthetic */ kb2 f22745e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jb2(kb2 kb2Var, cb2 cb2Var, vw2 vw2Var, kw2 kw2Var, hi1 hi1Var) {
        this.f22745e = kb2Var;
        this.f22741a = cb2Var;
        this.f22742b = vw2Var;
        this.f22743c = kw2Var;
        this.f22744d = hi1Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        vs0 vs0Var;
        xw2 xw2Var;
        vw2 vw2Var;
        final zze m19989a = this.f22744d.mo21060a().m19989a(th2);
        this.f22744d.mo21061b().mo20715a(m19989a);
        vs0Var = this.f22745e.f23202b;
        vs0Var.mo22592b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ib2
            @Override // java.lang.Runnable
            public final void run() {
                ab2 ab2Var;
                jb2 jb2Var = jb2.this;
                zze zzeVar = m19989a;
                ab2Var = jb2Var.f22745e.f23204d;
                ab2Var.m20048a().mo20715a(zzeVar);
            }
        });
        wr2.m27705b(m19989a.zza, th2, "NativeAdLoader.onFailure");
        this.f22741a.zza();
        if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f22742b) == null) {
            xw2Var = this.f22745e.f23205e;
            kw2 kw2Var = this.f22743c;
            kw2Var.mo23063a(m19989a);
            kw2Var.mo23067q(false);
            xw2Var.m28055b(kw2Var.zzj());
            return;
        }
        vw2Var.m27362c(m19989a);
        kw2 kw2Var2 = this.f22743c;
        kw2Var2.mo23067q(false);
        vw2Var.m27360a(kw2Var2);
        vw2Var.m27366g();
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ab2 ab2Var;
        vs0 vs0Var;
        xw2 xw2Var;
        vw2 vw2Var;
        v31 v31Var = (v31) obj;
        synchronized (this.f22745e) {
            try {
                ec1 m27147e = v31Var.m27147e();
                ab2Var = this.f22745e.f23204d;
                m27147e.m21686a(ab2Var.m20051d());
                this.f22741a.zzb(v31Var);
                vs0Var = this.f22745e.f23202b;
                vs0Var.mo22592b().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hb2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ab2 ab2Var2;
                        ab2Var2 = jb2.this.f22745e.f23204d;
                        ab2Var2.m20049b().zzn();
                    }
                });
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f22742b) == null) {
                    xw2Var = this.f22745e.f23205e;
                    kw2 kw2Var = this.f22743c;
                    kw2Var.mo23064b(v31Var.m27149g().f28473b);
                    kw2Var.mo23068t(v31Var.m27145c().zzg());
                    kw2Var.mo23067q(true);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27365f(v31Var.m27149g().f28473b);
                    vw2Var.m27364e(v31Var.m27145c().zzg());
                    kw2 kw2Var2 = this.f22743c;
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
