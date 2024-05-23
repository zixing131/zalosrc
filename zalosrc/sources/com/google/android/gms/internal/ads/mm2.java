package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class mm2 implements db2 {

    /* renamed from: a */
    private final Context f24656a;

    /* renamed from: b */
    private final Executor f24657b;

    /* renamed from: c */
    private final vs0 f24658c;

    /* renamed from: d */
    private final na2 f24659d;

    /* renamed from: e */
    private final ra2 f24660e;

    /* renamed from: f */
    private final ViewGroup f24661f;

    /* renamed from: g */
    private InterfaceC4407cy f24662g;

    /* renamed from: h */
    private final na1 f24663h;

    /* renamed from: i */
    private final xw2 f24664i;

    /* renamed from: j */
    private final vc1 f24665j;

    /* renamed from: k */
    private final br2 f24666k;

    /* renamed from: l */
    private tc3 f24667l;

    public mm2(Context context, Executor executor, zzq zzqVar, vs0 vs0Var, na2 na2Var, ra2 ra2Var, br2 br2Var, vc1 vc1Var) {
        this.f24656a = context;
        this.f24657b = executor;
        this.f24658c = vs0Var;
        this.f24659d = na2Var;
        this.f24660e = ra2Var;
        this.f24666k = br2Var;
        this.f24663h = vs0Var.mo22598j();
        this.f24664i = vs0Var.mo22590B();
        this.f24661f = new FrameLayout(context);
        this.f24665j = vc1Var;
        br2Var.m20680I(zzqVar);
    }

    @Override // com.google.android.gms.internal.ads.db2
    /* renamed from: a */
    public final boolean mo21338a(zzl zzlVar, String str, bb2 bb2Var, cb2 cb2Var) {
        p21 zzh;
        vw2 vw2Var;
        if (str == null) {
            yk0.zzg("Ad unit ID should not be null for banner ad.");
            this.f24657b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.im2
                public /* synthetic */ im2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mm2.this.m24643l();
                }
            });
            return false;
        }
        if (zza()) {
            return false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && zzlVar.zzf) {
            this.f24658c.mo22603o().m21182m(true);
        }
        br2 br2Var = this.f24666k;
        br2Var.m20681J(str);
        br2Var.m20693e(zzlVar);
        dr2 m20695g = br2Var.m20695g();
        kw2 m23765b = jw2.m23765b(this.f24656a, uw2.m27080f(m20695g), 3, zzlVar);
        if (((Boolean) AbstractC4445dz.f19448c.m24091e()).booleanValue() && this.f24666k.m20700x().zzk) {
            na2 na2Var = this.f24659d;
            if (na2Var != null) {
                na2Var.mo20715a(cs2.m20999d(7, null, null));
            }
            return false;
        }
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21175Y6)).booleanValue()) {
            o21 mo22597i = this.f24658c.mo22597i();
            f71 f71Var = new f71();
            f71Var.m21958c(this.f24656a);
            f71Var.m21961f(m20695g);
            mo22597i.mo20258o(f71Var.m21962g());
            ld1 ld1Var = new ld1();
            ld1Var.m24224m(this.f24659d, this.f24657b);
            ld1Var.m24225n(this.f24659d, this.f24657b);
            mo22597i.mo20255f(ld1Var.m24228q());
            mo22597i.mo20256j(new r82(this.f24662g));
            mo22597i.mo20253c(new bi1(hk1.f21815h, null));
            mo22597i.mo20257n(new m31(this.f24663h, this.f24665j));
            mo22597i.mo20254d(new o11(this.f24661f));
            zzh = mo22597i.zzh();
        } else {
            o21 mo22597i2 = this.f24658c.mo22597i();
            f71 f71Var2 = new f71();
            f71Var2.m21958c(this.f24656a);
            f71Var2.m21961f(m20695g);
            mo22597i2.mo20258o(f71Var2.m21962g());
            ld1 ld1Var2 = new ld1();
            ld1Var2.m24224m(this.f24659d, this.f24657b);
            ld1Var2.m24215d(this.f24659d, this.f24657b);
            ld1Var2.m24215d(this.f24660e, this.f24657b);
            ld1Var2.m24226o(this.f24659d, this.f24657b);
            ld1Var2.m24218g(this.f24659d, this.f24657b);
            ld1Var2.m24219h(this.f24659d, this.f24657b);
            ld1Var2.m24220i(this.f24659d, this.f24657b);
            ld1Var2.m24216e(this.f24659d, this.f24657b);
            ld1Var2.m24225n(this.f24659d, this.f24657b);
            ld1Var2.m24223l(this.f24659d, this.f24657b);
            mo22597i2.mo20255f(ld1Var2.m24228q());
            mo22597i2.mo20256j(new r82(this.f24662g));
            mo22597i2.mo20253c(new bi1(hk1.f21815h, null));
            mo22597i2.mo20257n(new m31(this.f24663h, this.f24665j));
            mo22597i2.mo20254d(new o11(this.f24661f));
            zzh = mo22597i2.zzh();
        }
        p21 p21Var = zzh;
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            vw2 mo21158f = p21Var.mo21158f();
            mo21158f.m27367h(3);
            mo21158f.m27361b(zzlVar.zzp);
            vw2Var = mo21158f;
        } else {
            vw2Var = null;
        }
        a51 mo21156d = p21Var.mo21156d();
        tc3 m19995h = mo21156d.m19995h(mo21156d.m19996i());
        this.f24667l = m19995h;
        kc3.m23886r(m19995h, new lm2(this, cb2Var, vw2Var, m23765b, p21Var), this.f24657b);
        return true;
    }

    /* renamed from: c */
    public final ViewGroup m24641c() {
        return this.f24661f;
    }

    /* renamed from: h */
    public final br2 m24642h() {
        return this.f24666k;
    }

    /* renamed from: l */
    public final /* synthetic */ void m24643l() {
        this.f24659d.mo20715a(cs2.m20999d(6, null, null));
    }

    /* renamed from: m */
    public final void m24644m() {
        this.f24663h.m24866B0(this.f24665j.m27207a());
    }

    /* renamed from: n */
    public final void m24645n(zzbc zzbcVar) {
        this.f24660e.m26056a(zzbcVar);
    }

    /* renamed from: o */
    public final void m24646o(oa1 oa1Var) {
        this.f24663h.m23890s0(oa1Var, this.f24657b);
    }

    /* renamed from: p */
    public final void m24647p(InterfaceC4407cy interfaceC4407cy) {
        this.f24662g = interfaceC4407cy;
    }

    /* renamed from: q */
    public final boolean m24648q() {
        Object parent = this.f24661f.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        View view = (View) parent;
        zzt.zzp();
        return zzs.zzS(view, view.getContext());
    }

    @Override // com.google.android.gms.internal.ads.db2
    public final boolean zza() {
        tc3 tc3Var = this.f24667l;
        if (tc3Var != null && !tc3Var.isDone()) {
            return true;
        }
        return false;
    }
}
