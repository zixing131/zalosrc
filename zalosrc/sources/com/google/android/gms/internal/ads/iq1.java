package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.overlay.zzz;
import com.google.android.gms.ads.internal.zzb;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class iq1 {

    /* renamed from: a */
    private final t71 f22270a;

    /* renamed from: b */
    private final nf1 f22271b;

    /* renamed from: c */
    private final e91 f22272c;

    /* renamed from: d */
    private final r91 f22273d;

    /* renamed from: e */
    private final ea1 f22274e;

    /* renamed from: f */
    private final tc1 f22275f;

    /* renamed from: g */
    private final Executor f22276g;

    /* renamed from: h */
    private final kf1 f22277h;

    /* renamed from: i */
    private final yz0 f22278i;

    /* renamed from: j */
    private final zzb f22279j;

    /* renamed from: k */
    private final yh0 f22280k;

    /* renamed from: l */
    private final C4830od f22281l;

    /* renamed from: m */
    private final kc1 f22282m;

    /* renamed from: n */
    private final n22 f22283n;

    /* renamed from: o */
    private final ox2 f22284o;

    /* renamed from: p */
    private final dt1 f22285p;

    /* renamed from: q */
    private final rv2 f22286q;

    public iq1(t71 t71Var, e91 e91Var, r91 r91Var, ea1 ea1Var, tc1 tc1Var, Executor executor, kf1 kf1Var, yz0 yz0Var, zzb zzbVar, yh0 yh0Var, C4830od c4830od, kc1 kc1Var, n22 n22Var, ox2 ox2Var, dt1 dt1Var, rv2 rv2Var, nf1 nf1Var) {
        this.f22270a = t71Var;
        this.f22272c = e91Var;
        this.f22273d = r91Var;
        this.f22274e = ea1Var;
        this.f22275f = tc1Var;
        this.f22276g = executor;
        this.f22277h = kf1Var;
        this.f22278i = yz0Var;
        this.f22279j = zzbVar;
        this.f22280k = yh0Var;
        this.f22281l = c4830od;
        this.f22282m = kc1Var;
        this.f22283n = n22Var;
        this.f22284o = ox2Var;
        this.f22285p = dt1Var;
        this.f22286q = rv2Var;
        this.f22271b = nf1Var;
    }

    /* renamed from: j */
    public static final tc3 m23330j(zq0 zq0Var, String str, String str2) {
        pl0 pl0Var = new pl0();
        zq0Var.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.gq1
            public /* synthetic */ gq1() {
            }

            @Override // com.google.android.gms.internal.ads.ls0
            public final void zza(boolean z11) {
                pl0 pl0Var2 = pl0.this;
                if (z11) {
                    pl0Var2.zzd(null);
                } else {
                    pl0Var2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zq0Var.mo26703p0(str, str2, null);
        return pl0Var;
    }

    /* renamed from: c */
    public final /* synthetic */ void m23331c() {
        this.f22270a.onAdClicked();
    }

    /* renamed from: d */
    public final /* synthetic */ void m23332d(String str, String str2) {
        this.f22275f.mo20210j0(str, str2);
    }

    /* renamed from: e */
    public final /* synthetic */ void m23333e() {
        this.f22272c.zzb();
    }

    /* renamed from: f */
    public final /* synthetic */ void m23334f(View view) {
        this.f22279j.zza();
    }

    /* renamed from: g */
    public final /* synthetic */ void m23335g(zq0 zq0Var, zq0 zq0Var2, Map map) {
        this.f22278i.m28404c(zq0Var);
    }

    /* renamed from: h */
    public final /* synthetic */ boolean m23336h(View view, MotionEvent motionEvent) {
        this.f22279j.zza();
        if (view != null) {
            view.performClick();
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final void m23337i(zq0 zq0Var, boolean z11, f40 f40Var) {
        InterfaceC4681kd m25160c;
        zq0Var.zzP().mo23372i0(new zza() { // from class: com.google.android.gms.internal.ads.zp1
            public /* synthetic */ zp1() {
            }

            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                iq1.this.m23331c();
            }
        }, this.f22273d, this.f22274e, new z20() { // from class: com.google.android.gms.internal.ads.aq1
            public /* synthetic */ aq1() {
            }

            @Override // com.google.android.gms.internal.ads.z20
            /* renamed from: j0 */
            public final void mo20210j0(String str, String str2) {
                iq1.this.m23332d(str, str2);
            }
        }, new zzz() { // from class: com.google.android.gms.internal.ads.bq1
            public /* synthetic */ bq1() {
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                iq1.this.m23333e();
            }
        }, z11, f40Var, this.f22279j, new hq1(this), this.f22280k, this.f22283n, this.f22284o, this.f22285p, this.f22286q, null, this.f22271b, null, null);
        zq0Var.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.cq1
            public /* synthetic */ cq1() {
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                iq1.this.m23336h(view, motionEvent);
                return false;
            }
        });
        zq0Var.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.dq1
            public /* synthetic */ dq1() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iq1.this.m23334f(view);
            }
        });
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21259h2)).booleanValue() && (m25160c = this.f22281l.m25160c()) != null) {
            m25160c.zzn((View) zq0Var);
        }
        this.f22277h.m23890s0(zq0Var, this.f22276g);
        this.f22277h.m23890s0(new InterfaceC4880pp() { // from class: com.google.android.gms.internal.ads.eq1
            public /* synthetic */ eq1() {
            }

            @Override // com.google.android.gms.internal.ads.InterfaceC4880pp
            /* renamed from: m0 */
            public final void mo21778m0(C4842op c4842op) {
                ns0 zzP = zq0.this.zzP();
                Rect rect = c4842op.f25729d;
                zzP.mo23361I(rect.left, rect.top, false);
            }
        }, this.f22276g);
        this.f22277h.m23936B0((View) zq0Var);
        zq0Var.mo26687S("/trackActiveViewUnit", new c40() { // from class: com.google.android.gms.internal.ads.fq1

            /* renamed from: b */
            public final /* synthetic */ zq0 f20246b;

            public /* synthetic */ fq1(zq0 zq0Var2) {
                r2 = zq0Var2;
            }

            @Override // com.google.android.gms.internal.ads.c40
            /* renamed from: a */
            public final void mo19973a(Object obj, Map map) {
                iq1.this.m23335g(r2, (zq0) obj, map);
            }
        });
        this.f22278i.m28405g(zq0Var2);
    }
}
