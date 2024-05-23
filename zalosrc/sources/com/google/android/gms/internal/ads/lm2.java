package com.google.android.gms.internal.ads;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class lm2 implements gc3 {

    /* renamed from: a */
    final /* synthetic */ cb2 f23985a;

    /* renamed from: b */
    final /* synthetic */ vw2 f23986b;

    /* renamed from: c */
    final /* synthetic */ kw2 f23987c;

    /* renamed from: d */
    final /* synthetic */ p21 f23988d;

    /* renamed from: e */
    final /* synthetic */ mm2 f23989e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public lm2(mm2 mm2Var, cb2 cb2Var, vw2 vw2Var, kw2 kw2Var, p21 p21Var) {
        this.f23989e = mm2Var;
        this.f23985a = cb2Var;
        this.f23986b = vw2Var;
        this.f23987c = kw2Var;
        this.f23988d = p21Var;
    }

    @Override // com.google.android.gms.internal.ads.gc3
    public final void zza(Throwable th2) {
        na1 na1Var;
        vc1 vc1Var;
        xw2 xw2Var;
        vw2 vw2Var;
        Executor executor;
        final zze m19989a = this.f23988d.mo21156d().m19989a(th2);
        synchronized (this.f23989e) {
            try {
                this.f23989e.f24667l = null;
                this.f23988d.mo21157e().mo20715a(m19989a);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21175Y6)).booleanValue()) {
                    executor = this.f23989e.f24657b;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.km2
                        @Override // java.lang.Runnable
                        public final void run() {
                            na2 na2Var;
                            lm2 lm2Var = lm2.this;
                            zze zzeVar = m19989a;
                            na2Var = lm2Var.f23989e.f24659d;
                            na2Var.mo20715a(zzeVar);
                        }
                    });
                }
                mm2 mm2Var = this.f23989e;
                na1Var = mm2Var.f24663h;
                vc1Var = mm2Var.f24665j;
                na1Var.m24866B0(vc1Var.m27207a());
                wr2.m27705b(m19989a.zza, th2, "BannerAdLoader.onFailure");
                this.f23985a.zza();
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f23986b) == null) {
                    xw2Var = this.f23989e.f24664i;
                    kw2 kw2Var = this.f23987c;
                    kw2Var.mo23063a(m19989a);
                    kw2Var.mo23067q(false);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27362c(m19989a);
                    kw2 kw2Var2 = this.f23987c;
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
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        na1 na1Var;
        xw2 xw2Var;
        vw2 vw2Var;
        Executor executor;
        final na2 na2Var;
        na2 na2Var2;
        ra2 ra2Var;
        s11 s11Var = (s11) obj;
        synchronized (this.f23989e) {
            try {
                this.f23989e.f24667l = null;
                viewGroup = this.f23989e.f24661f;
                viewGroup.removeAllViews();
                if (s11Var.mo20377i() != null) {
                    ViewParent parent = s11Var.mo20377i().getParent();
                    if (parent instanceof ViewGroup) {
                        String str = "";
                        if (s11Var.m27145c() != null) {
                            str = s11Var.m27145c().zzg();
                        }
                        yk0.zzj("Banner view provided from " + str + " already has a parent view. Removing its old parent.");
                        ((ViewGroup) parent).removeView(s11Var.mo20377i());
                    }
                }
                AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21175Y6;
                if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                    ec1 m27147e = s11Var.m27147e();
                    na2Var2 = this.f23989e.f24659d;
                    m27147e.m21686a(na2Var2);
                    ra2Var = this.f23989e.f24660e;
                    m27147e.m21688c(ra2Var);
                }
                viewGroup2 = this.f23989e.f24661f;
                viewGroup2.addView(s11Var.mo20377i());
                this.f23985a.zzb(s11Var);
                if (((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue()) {
                    mm2 mm2Var = this.f23989e;
                    executor = mm2Var.f24657b;
                    na2Var = mm2Var.f24659d;
                    na2Var.getClass();
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jm2
                        @Override // java.lang.Runnable
                        public final void run() {
                            na2.this.zzn();
                        }
                    });
                }
                na1Var = this.f23989e.f24663h;
                na1Var.m24866B0(s11Var.mo20376h());
                if (!((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue() || (vw2Var = this.f23986b) == null) {
                    xw2Var = this.f23989e.f24664i;
                    kw2 kw2Var = this.f23987c;
                    kw2Var.mo23064b(s11Var.m27149g().f28473b);
                    kw2Var.mo23068t(s11Var.m27145c().zzg());
                    kw2Var.mo23067q(true);
                    xw2Var.m28055b(kw2Var.zzj());
                } else {
                    vw2Var.m27365f(s11Var.m27149g().f28473b);
                    vw2Var.m27364e(s11Var.m27145c().zzg());
                    kw2 kw2Var2 = this.f23987c;
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
