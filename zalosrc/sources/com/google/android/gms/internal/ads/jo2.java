package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class jo2 implements db2 {

    /* renamed from: a */
    private final Context f22903a;

    /* renamed from: b */
    private final Executor f22904b;

    /* renamed from: c */
    private final vs0 f22905c;

    /* renamed from: d */
    private final na2 f22906d;

    /* renamed from: e */
    private final kp2 f22907e;

    /* renamed from: f */
    private InterfaceC4407cy f22908f;

    /* renamed from: g */
    private final xw2 f22909g;

    /* renamed from: h */
    private final br2 f22910h;

    /* renamed from: i */
    private tc3 f22911i;

    public jo2(Context context, Executor executor, vs0 vs0Var, na2 na2Var, kp2 kp2Var, br2 br2Var) {
        this.f22903a = context;
        this.f22904b = executor;
        this.f22905c = vs0Var;
        this.f22906d = na2Var;
        this.f22910h = br2Var;
        this.f22907e = kp2Var;
        this.f22909g = vs0Var.mo22590B();
    }

    @Override // com.google.android.gms.internal.ads.db2
    /* renamed from: a */
    public final boolean mo21338a(zzl zzlVar, String str, bb2 bb2Var, cb2 cb2Var) {
        lh1 zzf;
        vw2 vw2Var;
        if (str == null) {
            yk0.zzg("Ad unit ID should not be null for interstitial ad.");
            this.f22904b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.do2
                @Override // java.lang.Runnable
                public final void run() {
                    jo2.this.m23700g();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && zzlVar.zzf) {
            this.f22905c.mo22603o().m21182m(true);
        }
        zzq zzqVar = ((co2) bb2Var).f18509a;
        br2 br2Var = this.f22910h;
        br2Var.m20681J(str);
        br2Var.m20680I(zzqVar);
        br2Var.m20693e(zzlVar);
        dr2 m20695g = br2Var.m20695g();
        kw2 m23765b = jw2.m23765b(this.f22903a, uw2.m27080f(m20695g), 4, zzlVar);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21194a7)).booleanValue()) {
            kh1 mo22599k = this.f22905c.mo22599k();
            f71 f71Var = new f71();
            f71Var.m21958c(this.f22903a);
            f71Var.m21961f(m20695g);
            mo22599k.mo23949g(f71Var.m21962g());
            ld1 ld1Var = new ld1();
            ld1Var.m24224m(this.f22906d, this.f22904b);
            ld1Var.m24225n(this.f22906d, this.f22904b);
            mo22599k.mo23950i(ld1Var.m24228q());
            mo22599k.mo23951k(new r82(this.f22908f));
            zzf = mo22599k.zzf();
        } else {
            ld1 ld1Var2 = new ld1();
            kp2 kp2Var = this.f22907e;
            if (kp2Var != null) {
                ld1Var2.m24219h(kp2Var, this.f22904b);
                ld1Var2.m24220i(this.f22907e, this.f22904b);
                ld1Var2.m24216e(this.f22907e, this.f22904b);
            }
            kh1 mo22599k2 = this.f22905c.mo22599k();
            f71 f71Var2 = new f71();
            f71Var2.m21958c(this.f22903a);
            f71Var2.m21961f(m20695g);
            mo22599k2.mo23949g(f71Var2.m21962g());
            ld1Var2.m24224m(this.f22906d, this.f22904b);
            ld1Var2.m24219h(this.f22906d, this.f22904b);
            ld1Var2.m24220i(this.f22906d, this.f22904b);
            ld1Var2.m24216e(this.f22906d, this.f22904b);
            ld1Var2.m24215d(this.f22906d, this.f22904b);
            ld1Var2.m24226o(this.f22906d, this.f22904b);
            ld1Var2.m24225n(this.f22906d, this.f22904b);
            ld1Var2.m24223l(this.f22906d, this.f22904b);
            ld1Var2.m24217f(this.f22906d, this.f22904b);
            mo22599k2.mo23950i(ld1Var2.m24228q());
            mo22599k2.mo23951k(new r82(this.f22908f));
            zzf = mo22599k2.zzf();
        }
        lh1 lh1Var = zzf;
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            vw2 mo20308d = lh1Var.mo20308d();
            mo20308d.m27367h(4);
            mo20308d.m27361b(zzlVar.zzp);
            vw2Var = mo20308d;
        } else {
            vw2Var = null;
        }
        a51 mo20305a = lh1Var.mo20305a();
        tc3 m19995h = mo20305a.m19995h(mo20305a.m19996i());
        this.f22911i = m19995h;
        kc3.m23886r(m19995h, new io2(this, cb2Var, vw2Var, m23765b, lh1Var), this.f22904b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m23700g() {
        this.f22906d.mo20715a(cs2.m20999d(6, null, null));
    }

    /* renamed from: h */
    public final void m23701h(InterfaceC4407cy interfaceC4407cy) {
        this.f22908f = interfaceC4407cy;
    }

    @Override // com.google.android.gms.internal.ads.db2
    public final boolean zza() {
        tc3 tc3Var = this.f22911i;
        if (tc3Var != null && !tc3Var.isDone()) {
            return true;
        }
        return false;
    }
}
