package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class rn1 {

    /* renamed from: a */
    private final dr2 f27318a;

    /* renamed from: b */
    private final Executor f27319b;

    /* renamed from: c */
    private final jq1 f27320c;

    /* renamed from: d */
    private final dp1 f27321d;

    /* renamed from: e */
    private final Context f27322e;

    /* renamed from: f */
    private final dt1 f27323f;

    /* renamed from: g */
    private final rv2 f27324g;

    /* renamed from: h */
    private final ox2 f27325h;

    /* renamed from: i */
    private final n22 f27326i;

    public rn1(dr2 dr2Var, Executor executor, jq1 jq1Var, Context context, dt1 dt1Var, rv2 rv2Var, ox2 ox2Var, n22 n22Var, dp1 dp1Var) {
        this.f27318a = dr2Var;
        this.f27319b = executor;
        this.f27320c = jq1Var;
        this.f27322e = context;
        this.f27323f = dt1Var;
        this.f27324g = rv2Var;
        this.f27325h = ox2Var;
        this.f27326i = n22Var;
        this.f27321d = dp1Var;
    }

    /* renamed from: h */
    private final void m26136h(zq0 zq0Var) {
        m26137i(zq0Var);
        zq0Var.mo26687S("/video", b40.f17563l);
        zq0Var.mo26687S("/videoMeta", b40.f17564m);
        zq0Var.mo26687S("/precache", new lp0());
        zq0Var.mo26687S("/delayPageLoaded", b40.f17567p);
        zq0Var.mo26687S("/instrument", b40.f17565n);
        zq0Var.mo26687S("/log", b40.f17558g);
        zq0Var.mo26687S("/click", b40.m20393a(null));
        if (this.f27318a.f19396b != null) {
            zq0Var.zzP().mo23360H(true);
            zq0Var.mo26687S("/open", new n40(null, null, null, null, null));
        } else {
            zq0Var.zzP().mo23360H(false);
        }
        if (zzt.zzn().m21425z(zq0Var.getContext())) {
            zq0Var.mo26687S("/logScionEvent", new i40(zq0Var.getContext()));
        }
    }

    /* renamed from: i */
    private static final void m26137i(zq0 zq0Var) {
        zq0Var.mo26687S("/videoClicked", b40.f17559h);
        zq0Var.zzP().mo23371h0(true);
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21124T2)).booleanValue()) {
            zq0Var.mo26687S("/getNativeAdViewSignals", b40.f17570s);
        }
        zq0Var.mo26687S("/getNativeClickMeta", b40.f17571t);
    }

    /* renamed from: a */
    public final tc3 m26138a(final JSONObject jSONObject) {
        return kc3.m23882n(kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.gn1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return rn1.this.m26142e(obj);
            }
        }, this.f27319b), new qb3() { // from class: com.google.android.gms.internal.ads.hn1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return rn1.this.m26140c(jSONObject, (zq0) obj);
            }
        }, this.f27319b);
    }

    /* renamed from: b */
    public final tc3 m26139b(final String str, final String str2, final iq2 iq2Var, final lq2 lq2Var, final zzq zzqVar) {
        return kc3.m23882n(kc3.m23877i(null), new qb3() { // from class: com.google.android.gms.internal.ads.kn1
            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return rn1.this.m26141d(zzqVar, iq2Var, lq2Var, str, str2, obj);
            }
        }, this.f27319b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ tc3 m26140c(JSONObject jSONObject, final zq0 zq0Var) {
        final ol0 m25206c = ol0.m25206c(zq0Var);
        if (this.f27318a.f19396b != null) {
            zq0Var.mo26684O(ps0.m25534d());
        } else {
            zq0Var.mo26684O(ps0.m25535e());
        }
        zq0Var.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.fn1
            @Override // com.google.android.gms.internal.ads.ls0
            public final void zza(boolean z11) {
                rn1.this.m26143f(zq0Var, m25206c, z11);
            }
        });
        zq0Var.mo23550C0("google.afma.nativeAds.renderVideo", jSONObject);
        return m25206c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ tc3 m26141d(zzq zzqVar, iq2 iq2Var, lq2 lq2Var, String str, String str2, Object obj) {
        final zq0 m23723a = this.f27320c.m23723a(zzqVar, iq2Var, lq2Var);
        final ol0 m25206c = ol0.m25206c(m23723a);
        if (this.f27318a.f19396b != null) {
            m26136h(m23723a);
            m23723a.mo26684O(ps0.m25534d());
        } else {
            ap1 m21520b = this.f27321d.m21520b();
            m23723a.zzP().mo23372i0(m21520b, m21520b, m21520b, m21520b, m21520b, false, null, new zzb(this.f27322e, null, null), null, null, this.f27326i, this.f27325h, this.f27323f, this.f27324g, null, m21520b, null, null);
            m26137i(m23723a);
        }
        m23723a.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.ln1
            @Override // com.google.android.gms.internal.ads.ls0
            public final void zza(boolean z11) {
                rn1.this.m26144g(m23723a, m25206c, z11);
            }
        });
        m23723a.mo26703p0(str, str2, null);
        return m25206c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ tc3 m26142e(Object obj) {
        zq0 m23723a = this.f27320c.m23723a(zzq.zzc(), null, null);
        final ol0 m25206c = ol0.m25206c(m23723a);
        m26136h(m23723a);
        m23723a.zzP().mo23362J(new ms0() { // from class: com.google.android.gms.internal.ads.jn1
            @Override // com.google.android.gms.internal.ads.ms0
            public final void zza() {
                ol0.this.m25207d();
            }
        });
        m23723a.loadUrl((String) zzay.zzc().m21823b(AbstractC4554gx.f21114S2));
        return m25206c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m26143f(zq0 zq0Var, ol0 ol0Var, boolean z11) {
        if (this.f27318a.f19395a != null && zq0Var.zzs() != null) {
            zq0Var.zzs().m27700W4(this.f27318a.f19395a);
        }
        ol0Var.m25207d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m26144g(zq0 zq0Var, ol0 ol0Var, boolean z11) {
        if (z11) {
            if (this.f27318a.f19395a != null && zq0Var.zzs() != null) {
                zq0Var.zzs().m27700W4(this.f27318a.f19395a);
            }
            ol0Var.m25207d();
            return;
        }
        ol0Var.zze(new zzekr(1, "Html video Web View failed to load."));
    }
}
