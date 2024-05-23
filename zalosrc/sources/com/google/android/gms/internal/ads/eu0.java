package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.AbstractC4150d;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
final class eu0 extends li2 {

    /* renamed from: A */
    private final w04 f19781A;

    /* renamed from: a */
    private final zj2 f19782a;

    /* renamed from: b */
    private final gu0 f19783b;

    /* renamed from: c */
    private final eu0 f19784c = this;

    /* renamed from: d */
    private final w04 f19785d;

    /* renamed from: e */
    private final w04 f19786e;

    /* renamed from: f */
    private final w04 f19787f;

    /* renamed from: g */
    private final w04 f19788g;

    /* renamed from: h */
    private final w04 f19789h;

    /* renamed from: i */
    private final w04 f19790i;

    /* renamed from: j */
    private final w04 f19791j;

    /* renamed from: k */
    private final w04 f19792k;

    /* renamed from: l */
    private final w04 f19793l;

    /* renamed from: m */
    private final w04 f19794m;

    /* renamed from: n */
    private final w04 f19795n;

    /* renamed from: o */
    private final w04 f19796o;

    /* renamed from: p */
    private final w04 f19797p;

    /* renamed from: q */
    private final w04 f19798q;

    /* renamed from: r */
    private final w04 f19799r;

    /* renamed from: s */
    private final w04 f19800s;

    /* renamed from: t */
    private final w04 f19801t;

    /* renamed from: u */
    private final w04 f19802u;

    /* renamed from: v */
    private final w04 f19803v;

    /* renamed from: w */
    private final w04 f19804w;

    /* renamed from: x */
    private final w04 f19805x;

    /* renamed from: y */
    private final w04 f19806y;

    /* renamed from: z */
    private final w04 f19807z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ eu0(gu0 gu0Var, zj2 zj2Var, du0 du0Var) {
        w04 w04Var;
        by0 by0Var;
        w04 w04Var2;
        w04 w04Var3;
        qt0 qt0Var;
        w04 w04Var4;
        by0 by0Var2;
        w04 w04Var5;
        w04 w04Var6;
        w04 w04Var7;
        vx0 vx0Var;
        w04 w04Var8;
        xx0 xx0Var;
        zx0 zx0Var;
        w04 w04Var9;
        w04 w04Var10;
        w04 w04Var11;
        dy0 dy0Var;
        w04 w04Var12;
        tx0 tx0Var;
        w04 w04Var13;
        w04 w04Var14;
        w04 w04Var15;
        w04 w04Var16;
        this.f19783b = gu0Var;
        this.f19782a = zj2Var;
        w04Var = gu0Var.f20828G;
        this.f19785d = i04.m23104b(new ww2(w04Var));
        bk2 bk2Var = new bk2(zj2Var);
        this.f19786e = bk2Var;
        by0Var = ay0.f17479a;
        w04Var2 = gu0Var.f20863i;
        w04Var3 = gu0Var.f20875o;
        this.f19787f = new ki2(by0Var, w04Var2, w04Var3, bu2.m20725a(), bk2Var);
        ak2 ak2Var = new ak2(zj2Var);
        this.f19788g = ak2Var;
        qt0Var = pt0.f26330a;
        w04Var4 = gu0Var.f20863i;
        this.f19789h = new ui2(qt0Var, w04Var4, ak2Var, bu2.m20725a());
        by0Var2 = ay0.f17479a;
        w04Var5 = gu0Var.f20863i;
        w04Var6 = gu0Var.f20856e0;
        w04Var7 = gu0Var.f20875o;
        this.f19790i = new fj2(by0Var2, bk2Var, w04Var5, w04Var6, w04Var7, bu2.m20725a(), ak2Var);
        vx0Var = ux0.f29071a;
        bu2 m20725a = bu2.m20725a();
        w04Var8 = gu0Var.f20863i;
        this.f19791j = new jj2(vx0Var, m20725a, w04Var8);
        xx0Var = wx0.f30245a;
        this.f19792k = new rj2(xx0Var, bu2.m20725a(), ak2Var);
        zx0Var = yx0.f31246a;
        w04Var9 = gu0Var.f20875o;
        w04Var10 = gu0Var.f20863i;
        this.f19793l = new yj2(zx0Var, w04Var9, w04Var10);
        this.f19794m = new qk2(bu2.m20725a());
        ck2 ck2Var = new ck2(zj2Var);
        this.f19795n = ck2Var;
        dk2 dk2Var = new dk2(zj2Var);
        this.f19796o = dk2Var;
        w04Var11 = gu0Var.f20856e0;
        dy0Var = cy0.f19030a;
        bu2 m20725a2 = bu2.m20725a();
        w04Var12 = gu0Var.f20875o;
        this.f19797p = new mk2(w04Var11, ck2Var, dk2Var, dy0Var, m20725a2, ak2Var, w04Var12);
        tx0Var = sx0.f28054a;
        w04Var13 = gu0Var.f20856e0;
        w04Var14 = gu0Var.f20875o;
        this.f19798q = new zi2(ak2Var, tx0Var, w04Var13, w04Var14, bu2.m20725a());
        ek2 ek2Var = new ek2(zj2Var);
        this.f19799r = ek2Var;
        w04 m23104b = i04.m23104b(bs1.m20705a());
        this.f19800s = m23104b;
        w04 m23104b2 = i04.m23104b(zr1.m28590a());
        this.f19801t = m23104b2;
        w04 m23104b3 = i04.m23104b(ds1.m21536a());
        this.f19802u = m23104b3;
        w04 m23104b4 = i04.m23104b(fs1.m22156a());
        this.f19803v = m23104b4;
        m04 m24789b = n04.m24789b(4);
        m24789b.m24432b(bv2.GMS_SIGNALS, m23104b);
        m24789b.m24432b(bv2.BUILD_URL, m23104b2);
        m24789b.m24432b(bv2.HTTP, m23104b3);
        m24789b.m24432b(bv2.PRE_PROCESS, m23104b4);
        n04 m24433c = m24789b.m24433c();
        this.f19804w = m24433c;
        w04Var15 = gu0Var.f20863i;
        w04 m23104b5 = i04.m23104b(new gs1(ek2Var, w04Var15, bu2.m20725a(), m24433c));
        this.f19805x = m23104b5;
        t04 m26813a = u04.m26813a(0, 1);
        m26813a.m26467a(m23104b5);
        u04 m26469c = m26813a.m26469c();
        this.f19806y = m26469c;
        kv2 kv2Var = new kv2(m26469c);
        this.f19807z = kv2Var;
        bu2 m20725a3 = bu2.m20725a();
        w04Var16 = gu0Var.f20875o;
        this.f19781A = i04.m23104b(new jv2(m20725a3, w04Var16, kv2Var));
    }

    /* renamed from: e */
    private final oi2 m21805e() {
        yj0 yj0Var = new yj0();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        String m28527d = this.f19782a.m28527d();
        r04.m25935b(m28527d);
        return new oi2(yj0Var, uc3Var, m28527d, this.f19782a.m28525b(), this.f19782a.m28524a(), null);
    }

    /* renamed from: f */
    private final tj2 m21806f() {
        C4924qw c4924qw = new C4924qw();
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        List m28529f = this.f19782a.m28529f();
        r04.m25935b(m28529f);
        return new tj2(c4924qw, uc3Var, m28529f, null);
    }

    @Override // com.google.android.gms.internal.ads.li2
    /* renamed from: a */
    public final vh2 mo21807a() {
        ys0 ys0Var;
        w04 w04Var;
        w04 w04Var2;
        ys0Var = this.f19783b.f20849b;
        Context m28330a = ys0Var.m28330a();
        r04.m25935b(m28330a);
        vj0 vj0Var = new vj0();
        wj0 wj0Var = new wj0();
        w04Var = this.f19783b.f20826E0;
        Object zzb = w04Var.zzb();
        oi2 m21805e = m21805e();
        tj2 m21806f = m21806f();
        d04 m23103a = i04.m23103a(this.f19787f);
        d04 m23103a2 = i04.m23103a(this.f19789h);
        d04 m23103a3 = i04.m23103a(this.f19790i);
        d04 m23103a4 = i04.m23103a(this.f19791j);
        d04 m23103a5 = i04.m23103a(this.f19792k);
        d04 m23103a6 = i04.m23103a(this.f19793l);
        d04 m23103a7 = i04.m23103a(this.f19794m);
        d04 m23103a8 = i04.m23103a(this.f19797p);
        d04 m23103a9 = i04.m23103a(this.f19798q);
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        vw2 vw2Var = (vw2) this.f19785d.zzb();
        w04Var2 = this.f19783b.f20845X;
        return hk2.m22957a(m28330a, vj0Var, wj0Var, zzb, m21805e, m21806f, m23103a, m23103a2, m23103a3, m23103a4, m23103a5, m23103a6, m23103a7, m23103a8, m23103a9, uc3Var, vw2Var, (dt1) w04Var2.zzb());
    }

    @Override // com.google.android.gms.internal.ads.li2
    /* renamed from: b */
    public final vh2 mo21808b() {
        ys0 ys0Var;
        w04 w04Var;
        w04 w04Var2;
        ys0 ys0Var2;
        w04 w04Var3;
        ys0 ys0Var3;
        w04 w04Var4;
        w04 w04Var5;
        w04 w04Var6;
        ys0 ys0Var4;
        ys0 ys0Var5;
        ys0 ys0Var6;
        w04 w04Var7;
        w04 w04Var8;
        w04 w04Var9;
        w04 w04Var10;
        w04 w04Var11;
        w04 w04Var12;
        ys0Var = this.f19783b.f20849b;
        Context m28330a = ys0Var.m28330a();
        r04.m25935b(m28330a);
        uc3 uc3Var = kl0.f23363a;
        r04.m25935b(uc3Var);
        vj0 vj0Var = new vj0();
        r04.m25935b(uc3Var);
        String m28526c = this.f19782a.m28526c();
        r04.m25935b(m28526c);
        oj2 oj2Var = new oj2(vj0Var, uc3Var, m28526c, null);
        w04Var = this.f19783b.f20875o;
        bg2 bg2Var = new bg2(oj2Var, 0L, (ScheduledExecutorService) w04Var.zzb());
        sd0 sd0Var = new sd0();
        w04Var2 = this.f19783b.f20875o;
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) w04Var2.zzb();
        ys0Var2 = this.f19783b.f20849b;
        Context m28330a2 = ys0Var2.m28330a();
        r04.m25935b(m28330a2);
        wj2 wj2Var = new wj2(sd0Var, scheduledExecutorService, m28330a2, null);
        w04Var3 = this.f19783b.f20875o;
        bg2 bg2Var2 = new bg2(wj2Var, ((Long) zzay.zzc().m21823b(AbstractC4554gx.f21280j3)).longValue(), (ScheduledExecutorService) w04Var3.zzb());
        yj0 yj0Var = new yj0();
        ys0Var3 = this.f19783b.f20849b;
        Context m28330a3 = ys0Var3.m28330a();
        r04.m25935b(m28330a3);
        w04Var4 = this.f19783b.f20875o;
        ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) w04Var4.zzb();
        r04.m25935b(uc3Var);
        ii2 ii2Var = new ii2(yj0Var, m28330a3, scheduledExecutorService2, uc3Var, this.f19782a.m28524a(), null);
        w04Var5 = this.f19783b.f20875o;
        bg2 bg2Var3 = new bg2(ii2Var, 0L, (ScheduledExecutorService) w04Var5.zzb());
        r04.m25935b(uc3Var);
        ok2 ok2Var = new ok2(uc3Var);
        w04Var6 = this.f19783b.f20875o;
        bg2 bg2Var4 = new bg2(ok2Var, 0L, (ScheduledExecutorService) w04Var6.zzb());
        fk2 fk2Var = new sh2() { // from class: com.google.android.gms.internal.ads.fk2
            @Override // com.google.android.gms.internal.ads.sh2
            public final /* synthetic */ int zza() {
                return 0;
            }

            @Override // com.google.android.gms.internal.ads.sh2
            public final tc3 zzb() {
                return kc3.m23877i(new rh2() { // from class: com.google.android.gms.internal.ads.gk2
                    @Override // com.google.android.gms.internal.ads.rh2
                    /* renamed from: a */
                    public final void mo20086a(Object obj) {
                        try {
                            ((JSONObject) obj).getJSONObject("sdk_env").put("container_version", AbstractC4150d.f16480a);
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
        };
        ys0Var4 = this.f19783b.f20849b;
        Context m28330a4 = ys0Var4.m28330a();
        r04.m25935b(m28330a4);
        String m28526c2 = this.f19782a.m28526c();
        r04.m25935b(m28526c2);
        r04.m25935b(uc3Var);
        si2 si2Var = new si2(null, m28330a4, m28526c2, uc3Var);
        C4401cs c4401cs = new C4401cs();
        r04.m25935b(uc3Var);
        ys0Var5 = this.f19783b.f20849b;
        Context m28330a5 = ys0Var5.m28330a();
        r04.m25935b(m28330a5);
        yj0 yj0Var2 = new yj0();
        int m28524a = this.f19782a.m28524a();
        ys0Var6 = this.f19783b.f20849b;
        Context m28330a6 = ys0Var6.m28330a();
        r04.m25935b(m28330a6);
        w04Var7 = this.f19783b.f20856e0;
        hk0 hk0Var = (hk0) w04Var7.zzb();
        w04Var8 = this.f19783b.f20875o;
        ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) w04Var8.zzb();
        r04.m25935b(uc3Var);
        String m28526c3 = this.f19782a.m28526c();
        r04.m25935b(m28526c3);
        w04Var9 = this.f19783b.f20826E0;
        String m28526c4 = this.f19782a.m28526c();
        r04.m25935b(m28526c4);
        C4993sr c4993sr = new C4993sr();
        w04Var10 = this.f19783b.f20856e0;
        hk0 hk0Var2 = (hk0) w04Var10.zzb();
        w04Var11 = this.f19783b.f20875o;
        ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) w04Var11.zzb();
        r04.m25935b(uc3Var);
        h83 m22734u = h83.m22734u(bg2Var, bg2Var2, bg2Var3, bg2Var4, fk2Var, si2Var, new hj2(c4401cs, uc3Var, m28330a5, null), m21806f(), m21805e(), new dj2(yj0Var2, m28524a, m28330a6, hk0Var, scheduledExecutorService3, uc3Var, m28526c3, null), (sh2) w04Var9.zzb(), zi2.m28515a(m28526c4, c4993sr, hk0Var2, scheduledExecutorService4, uc3Var));
        vw2 vw2Var = (vw2) this.f19785d.zzb();
        w04Var12 = this.f19783b.f20845X;
        return new vh2(m28330a, uc3Var, m22734u, vw2Var, (dt1) w04Var12.zzb());
    }

    @Override // com.google.android.gms.internal.ads.li2
    /* renamed from: c */
    public final hv2 mo21809c() {
        return (hv2) this.f19781A.zzb();
    }

    @Override // com.google.android.gms.internal.ads.li2
    /* renamed from: d */
    public final vw2 mo21810d() {
        return (vw2) this.f19785d.zzb();
    }
}
