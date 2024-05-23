package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.AbstractC4205o;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class hl2 implements db2 {

    /* renamed from: a */
    private final Context f21827a;

    /* renamed from: b */
    private final Executor f21828b;

    /* renamed from: c */
    protected final vs0 f21829c;

    /* renamed from: d */
    private final yl2 f21830d;

    /* renamed from: e */
    private final un2 f21831e;

    /* renamed from: f */
    private final zzcgv f21832f;

    /* renamed from: g */
    private final ViewGroup f21833g;

    /* renamed from: h */
    private final xw2 f21834h;

    /* renamed from: i */
    private final br2 f21835i;

    /* renamed from: j */
    private tc3 f21836j;

    public hl2(Context context, Executor executor, vs0 vs0Var, un2 un2Var, yl2 yl2Var, br2 br2Var, zzcgv zzcgvVar) {
        this.f21827a = context;
        this.f21828b = executor;
        this.f21829c = vs0Var;
        this.f21831e = un2Var;
        this.f21830d = yl2Var;
        this.f21835i = br2Var;
        this.f21832f = zzcgvVar;
        this.f21833g = new FrameLayout(context);
        this.f21834h = vs0Var.mo22590B();
    }

    /* renamed from: l */
    public final synchronized d71 m22965l(sn2 sn2Var) {
        gl2 gl2Var = (gl2) sn2Var;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21184Z6)).booleanValue()) {
            o11 o11Var = new o11(this.f21833g);
            f71 f71Var = new f71();
            f71Var.m21958c(this.f21827a);
            f71Var.m21961f(gl2Var.f20727a);
            h71 m21962g = f71Var.m21962g();
            ld1 ld1Var = new ld1();
            ld1Var.m24217f(this.f21830d, this.f21828b);
            ld1Var.m24226o(this.f21830d, this.f21828b);
            return mo20179b(o11Var, m21962g, ld1Var.m24228q());
        }
        yl2 m28225j = yl2.m28225j(this.f21830d);
        ld1 ld1Var2 = new ld1();
        ld1Var2.m24216e(m28225j, this.f21828b);
        ld1Var2.m24221j(m28225j, this.f21828b);
        ld1Var2.m24222k(m28225j, this.f21828b);
        ld1Var2.m24223l(m28225j, this.f21828b);
        ld1Var2.m24217f(m28225j, this.f21828b);
        ld1Var2.m24226o(m28225j, this.f21828b);
        ld1Var2.m24227p(m28225j);
        o11 o11Var2 = new o11(this.f21833g);
        f71 f71Var2 = new f71();
        f71Var2.m21958c(this.f21827a);
        f71Var2.m21961f(gl2Var.f20727a);
        return mo20179b(o11Var2, f71Var2.m21962g(), ld1Var2.m24228q());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0027, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x002a, B:12:0x0049, B:16:0x005a, B:20:0x0060, B:22:0x0070, B:24:0x0078, B:25:0x008d, B:27:0x00a6, B:29:0x00aa, B:30:0x00b3, B:34:0x0042), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x0027, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:5:0x0011, B:8:0x002a, B:12:0x0049, B:16:0x005a, B:20:0x0060, B:22:0x0070, B:24:0x0078, B:25:0x008d, B:27:0x00a6, B:29:0x00aa, B:30:0x00b3, B:34:0x0042), top: B:2:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.db2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean mo21338a(zzl zzlVar, String str, bb2 bb2Var, cb2 cb2Var) {
        boolean z11;
        vw2 vw2Var;
        try {
            if (((Boolean) AbstractC5149wy.f30256d.m24091e()).booleanValue()) {
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                    z11 = true;
                    if (this.f21832f.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue() || !z11) {
                        AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
                    }
                    if (str != null) {
                        yk0.zzg("Ad unit ID should not be null for app open ad.");
                        this.f21828b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.bl2
                            public /* synthetic */ bl2() {
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                hl2.this.m22966j();
                            }
                        });
                        return false;
                    }
                    if (this.f21836j != null) {
                        return false;
                    }
                    if (((Boolean) AbstractC4963ry.f27408c.m24091e()).booleanValue()) {
                        un2 un2Var = this.f21831e;
                        if (un2Var.zzd() != null) {
                            vw2 zzh = ((z01) un2Var.zzd()).zzh();
                            zzh.m27367h(7);
                            zzh.m27361b(zzlVar.zzp);
                            vw2Var = zzh;
                            wr2.m27704a(this.f21827a, zzlVar.zzf);
                            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue() && zzlVar.zzf) {
                                this.f21829c.mo22603o().m21182m(true);
                            }
                            br2 br2Var = this.f21835i;
                            br2Var.m20681J(str);
                            br2Var.m20680I(zzq.zzb());
                            br2Var.m20693e(zzlVar);
                            dr2 m20695g = br2Var.m20695g();
                            kw2 m23765b = jw2.m23765b(this.f21827a, uw2.m27080f(m20695g), 7, zzlVar);
                            gl2 gl2Var = new gl2(null);
                            gl2Var.f20727a = m20695g;
                            tc3 mo20182a = this.f21831e.mo20182a(new wn2(gl2Var, null), new tn2() { // from class: com.google.android.gms.internal.ads.cl2
                                public /* synthetic */ cl2() {
                                }

                                @Override // com.google.android.gms.internal.ads.tn2
                                /* renamed from: a */
                                public final d71 mo20933a(sn2 sn2Var) {
                                    d71 m22965l;
                                    m22965l = hl2.this.m22965l(sn2Var);
                                    return m22965l;
                                }
                            }, null);
                            this.f21836j = mo20182a;
                            kc3.m23886r(mo20182a, new el2(this, cb2Var, vw2Var, m23765b, gl2Var), this.f21828b);
                            return true;
                        }
                    }
                    vw2Var = null;
                    wr2.m27704a(this.f21827a, zzlVar.zzf);
                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f20979E7)).booleanValue()) {
                        this.f21829c.mo22603o().m21182m(true);
                    }
                    br2 br2Var2 = this.f21835i;
                    br2Var2.m20681J(str);
                    br2Var2.m20680I(zzq.zzb());
                    br2Var2.m20693e(zzlVar);
                    dr2 m20695g2 = br2Var2.m20695g();
                    kw2 m23765b2 = jw2.m23765b(this.f21827a, uw2.m27080f(m20695g2), 7, zzlVar);
                    gl2 gl2Var2 = new gl2(null);
                    gl2Var2.f20727a = m20695g2;
                    tc3 mo20182a2 = this.f21831e.mo20182a(new wn2(gl2Var2, null), new tn2() { // from class: com.google.android.gms.internal.ads.cl2
                        public /* synthetic */ cl2() {
                        }

                        @Override // com.google.android.gms.internal.ads.tn2
                        /* renamed from: a */
                        public final d71 mo20933a(sn2 sn2Var) {
                            d71 m22965l;
                            m22965l = hl2.this.m22965l(sn2Var);
                            return m22965l;
                        }
                    }, null);
                    this.f21836j = mo20182a2;
                    kc3.m23886r(mo20182a2, new el2(this, cb2Var, vw2Var, m23765b2, gl2Var2), this.f21828b);
                    return true;
                }
            }
            z11 = false;
            if (this.f21832f.f32032r >= ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21070N8)).intValue()) {
            }
            AbstractC4205o.m19717f("loadAd must be called on the main UI thread.");
            if (str != null) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: b */
    protected abstract d71 mo20179b(o11 o11Var, h71 h71Var, nd1 nd1Var);

    /* renamed from: j */
    public final /* synthetic */ void m22966j() {
        this.f21830d.mo20715a(cs2.m20999d(6, null, null));
    }

    /* renamed from: k */
    public final void m22967k(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.f21835i.m20682K(zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.db2
    public final boolean zza() {
        tc3 tc3Var = this.f21836j;
        if (tc3Var != null && !tc3Var.isDone()) {
            return true;
        }
        return false;
    }
}
