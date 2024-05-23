package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class up2 implements db2 {

    /* renamed from: a */
    private final Context f29016a;

    /* renamed from: b */
    private final Executor f29017b;

    /* renamed from: c */
    private final vs0 f29018c;

    /* renamed from: d */
    private final kp2 f29019d;

    /* renamed from: e */
    private final un2 f29020e;

    /* renamed from: f */
    private final uq2 f29021f;

    /* renamed from: g */
    private final xw2 f29022g;

    /* renamed from: h */
    private final br2 f29023h;

    /* renamed from: i */
    private tc3 f29024i;

    public up2(Context context, Executor executor, vs0 vs0Var, un2 un2Var, kp2 kp2Var, br2 br2Var, uq2 uq2Var) {
        this.f29016a = context;
        this.f29017b = executor;
        this.f29018c = vs0Var;
        this.f29020e = un2Var;
        this.f29019d = kp2Var;
        this.f29023h = br2Var;
        this.f29021f = uq2Var;
        this.f29022g = vs0Var.mo22590B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final rp1 m27035j(sn2 sn2Var) {
        rp1 mo22601m = this.f29018c.mo22601m();
        f71 f71Var = new f71();
        f71Var.m21958c(this.f29016a);
        f71Var.m21961f(((tp2) sn2Var).f28466a);
        f71Var.m21960e(this.f29021f);
        mo22601m.mo25027a(f71Var.m21962g());
        mo22601m.mo25028b(new ld1().m24228q());
        return mo22601m;
    }

    @Override // com.google.android.gms.internal.ads.db2
    /* renamed from: a */
    public final boolean mo21338a(zzl zzlVar, String str, bb2 bb2Var, cb2 cb2Var) {
        vw2 vw2Var;
        zzcbz zzcbzVar = new zzcbz(zzlVar, str);
        if (zzcbzVar.f32013q == null) {
            yk0.zzg("Ad unit ID should not be null for rewarded video ad.");
            this.f29017b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.np2
                @Override // java.lang.Runnable
                public final void run() {
                    up2.this.m27036h();
                }
            });
            return false;
        }
        tc3 tc3Var = this.f29024i;
        if (tc3Var != null && !tc3Var.isDone()) {
            return false;
        }
        if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
            un2 un2Var = this.f29020e;
            if (un2Var.zzd() != null) {
                vw2 zzh = ((sp1) un2Var.zzd()).zzh();
                zzh.m27367h(5);
                zzh.m27361b(zzcbzVar.f32012p.zzp);
                vw2Var = zzh;
                wr2.m27704a(this.f29016a, zzcbzVar.f32012p.zzf);
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && zzcbzVar.f32012p.zzf) {
                    this.f29018c.mo22603o().m21182m(true);
                }
                br2 br2Var = this.f29023h;
                br2Var.m20681J(zzcbzVar.f32013q);
                br2Var.m20680I(zzq.zzd());
                br2Var.m20693e(zzcbzVar.f32012p);
                dr2 m20695g = br2Var.m20695g();
                kw2 m23765b = jw2.m23765b(this.f29016a, uw2.m27080f(m20695g), 5, zzcbzVar.f32012p);
                tp2 tp2Var = new tp2(null);
                tp2Var.f28466a = m20695g;
                tp2Var.f28467b = null;
                tc3 mo20182a = this.f29020e.mo20182a(new wn2(tp2Var, null), new tn2() { // from class: com.google.android.gms.internal.ads.op2
                    @Override // com.google.android.gms.internal.ads.tn2
                    /* renamed from: a */
                    public final d71 mo20933a(sn2 sn2Var) {
                        rp1 m27035j;
                        m27035j = up2.this.m27035j(sn2Var);
                        return m27035j;
                    }
                }, null);
                this.f29024i = mo20182a;
                kc3.m23886r(mo20182a, new rp2(this, cb2Var, vw2Var, m23765b, tp2Var), this.f29017b);
                return true;
            }
        }
        vw2Var = null;
        wr2.m27704a(this.f29016a, zzcbzVar.f32012p.zzf);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
            this.f29018c.mo22603o().m21182m(true);
        }
        br2 br2Var2 = this.f29023h;
        br2Var2.m20681J(zzcbzVar.f32013q);
        br2Var2.m20680I(zzq.zzd());
        br2Var2.m20693e(zzcbzVar.f32012p);
        dr2 m20695g2 = br2Var2.m20695g();
        kw2 m23765b2 = jw2.m23765b(this.f29016a, uw2.m27080f(m20695g2), 5, zzcbzVar.f32012p);
        tp2 tp2Var2 = new tp2(null);
        tp2Var2.f28466a = m20695g2;
        tp2Var2.f28467b = null;
        tc3 mo20182a2 = this.f29020e.mo20182a(new wn2(tp2Var2, null), new tn2() { // from class: com.google.android.gms.internal.ads.op2
            @Override // com.google.android.gms.internal.ads.tn2
            /* renamed from: a */
            public final d71 mo20933a(sn2 sn2Var) {
                rp1 m27035j;
                m27035j = up2.this.m27035j(sn2Var);
                return m27035j;
            }
        }, null);
        this.f29024i = mo20182a2;
        kc3.m23886r(mo20182a2, new rp2(this, cb2Var, vw2Var, m23765b2, tp2Var2), this.f29017b);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void m27036h() {
        this.f29019d.mo20715a(cs2.m20999d(6, null, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final void m27037i(int i11) {
        this.f29023h.m20677F().m24979a(i11);
    }

    @Override // com.google.android.gms.internal.ads.db2
    public final boolean zza() {
        throw null;
    }
}
