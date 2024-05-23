package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class xo1 {

    /* renamed from: b */
    private final zza f30550b;

    /* renamed from: c */
    private final nr0 f30551c;

    /* renamed from: d */
    private final Context f30552d;

    /* renamed from: e */
    private final dt1 f30553e;

    /* renamed from: f */
    private final rv2 f30554f;

    /* renamed from: g */
    private final Executor f30555g;

    /* renamed from: h */
    private final C4830od f30556h;

    /* renamed from: i */
    private final zzcgv f30557i;

    /* renamed from: k */
    private final n22 f30559k;

    /* renamed from: l */
    private final ox2 f30560l;

    /* renamed from: m */
    private tc3 f30561m;

    /* renamed from: a */
    private final ro1 f30549a = new ro1(null);

    /* renamed from: j */
    private final r40 f30558j = new r40();

    public xo1(uo1 uo1Var) {
        Context context;
        Executor executor;
        C4830od c4830od;
        zzcgv zzcgvVar;
        zza zzaVar;
        nr0 nr0Var;
        n22 n22Var;
        ox2 ox2Var;
        dt1 dt1Var;
        rv2 rv2Var;
        context = uo1Var.f29001c;
        this.f30552d = context;
        executor = uo1Var.f29005g;
        this.f30555g = executor;
        c4830od = uo1Var.f29006h;
        this.f30556h = c4830od;
        zzcgvVar = uo1Var.f29007i;
        this.f30557i = zzcgvVar;
        zzaVar = uo1Var.f28999a;
        this.f30550b = zzaVar;
        this.f30549a = new ro1(null);
        nr0Var = uo1Var.f29000b;
        this.f30551c = nr0Var;
        this.f30558j = new r40();
        n22Var = uo1Var.f29004f;
        this.f30559k = n22Var;
        ox2Var = uo1Var.f29008j;
        this.f30560l = ox2Var;
        dt1Var = uo1Var.f29002d;
        this.f30553e = dt1Var;
        rv2Var = uo1Var.f29003e;
        this.f30554f = rv2Var;
    }

    /* renamed from: a */
    public final /* synthetic */ zq0 m27951a(zq0 zq0Var) {
        zq0Var.mo26687S("/result", this.f30558j);
        ns0 zzP = zq0Var.zzP();
        ro1 ro1Var = this.f30549a;
        zzP.mo23372i0(null, ro1Var, ro1Var, ro1Var, ro1Var, false, null, new zzb(this.f30552d, null, null), null, null, this.f30559k, this.f30560l, this.f30553e, this.f30554f, null, null, null, null);
        return zq0Var;
    }

    /* renamed from: c */
    public final /* synthetic */ tc3 m27952c(String str, JSONObject jSONObject, zq0 zq0Var) {
        return this.f30558j.m25955b(zq0Var, str, jSONObject);
    }

    /* renamed from: d */
    public final synchronized tc3 m27953d(String str, JSONObject jSONObject) {
        tc3 tc3Var = this.f30561m;
        if (tc3Var == null) {
            return kc3.m23877i(null);
        }
        return kc3.m23882n(tc3Var, new qb3() { // from class: com.google.android.gms.internal.ads.io1

            /* renamed from: b */
            public final /* synthetic */ String f22245b;

            /* renamed from: c */
            public final /* synthetic */ JSONObject f22246c;

            public /* synthetic */ io1(String str2, JSONObject jSONObject2) {
                r2 = str2;
                r3 = jSONObject2;
            }

            @Override // com.google.android.gms.internal.ads.qb3
            public final tc3 zza(Object obj) {
                return xo1.this.m27952c(r2, r3, (zq0) obj);
            }
        }, this.f30555g);
    }

    /* renamed from: e */
    public final synchronized void m27954e(iq2 iq2Var, lq2 lq2Var) {
        tc3 tc3Var = this.f30561m;
        if (tc3Var == null) {
            return;
        }
        kc3.m23886r(tc3Var, new po1(this, iq2Var, lq2Var), this.f30555g);
    }

    /* renamed from: f */
    public final synchronized void m27955f() {
        tc3 tc3Var = this.f30561m;
        if (tc3Var == null) {
            return;
        }
        kc3.m23886r(tc3Var, new lo1(this), this.f30555g);
        this.f30561m = null;
    }

    /* renamed from: g */
    public final synchronized void m27956g(String str, Map map) {
        tc3 tc3Var = this.f30561m;
        if (tc3Var == null) {
            return;
        }
        kc3.m23886r(tc3Var, new oo1(this, "sendMessageToNativeJs", map), this.f30555g);
    }

    /* renamed from: h */
    public final synchronized void m27957h() {
        tc3 m23881m = kc3.m23881m(kc3.m23880l(new pb3() { // from class: com.google.android.gms.internal.ads.kr0

            /* renamed from: a */
            public final /* synthetic */ Context f23454a;

            /* renamed from: b */
            public final /* synthetic */ C4830od f23455b;

            /* renamed from: c */
            public final /* synthetic */ zzcgv f23456c;

            /* renamed from: d */
            public final /* synthetic */ zza f23457d;

            /* renamed from: e */
            public final /* synthetic */ String f23458e;

            public /* synthetic */ kr0(Context context, C4830od c4830od, zzcgv zzcgvVar, zza zzaVar, String str) {
                r1 = context;
                r2 = c4830od;
                r3 = zzcgvVar;
                r4 = zzaVar;
                r5 = str;
            }

            @Override // com.google.android.gms.internal.ads.pb3
            public final tc3 zza() {
                Context context = r1;
                C4830od c4830od = r2;
                zzcgv zzcgvVar = r3;
                zza zzaVar = r4;
                String str = r5;
                zzt.zzz();
                zq0 m24980a = nr0.m24980a(context, ps0.m25531a(), "", false, false, c4830od, null, zzcgvVar, null, null, zzaVar, C4808ns.m24989a(), null, null);
                ol0 m25206c = ol0.m25206c(m24980a);
                m24980a.zzP().mo23358F(new ls0() { // from class: com.google.android.gms.internal.ads.lr0
                    public /* synthetic */ lr0() {
                    }

                    @Override // com.google.android.gms.internal.ads.ls0
                    public final void zza(boolean z11) {
                        ol0.this.m25207d();
                    }
                });
                m24980a.loadUrl(str);
                return m25206c;
            }
        }, kl0.f23367e), new y43() { // from class: com.google.android.gms.internal.ads.ko1
            public /* synthetic */ ko1() {
            }

            @Override // com.google.android.gms.internal.ads.y43
            public final Object apply(Object obj) {
                zq0 zq0Var = (zq0) obj;
                xo1.this.m27951a(zq0Var);
                return zq0Var;
            }
        }, this.f30555g);
        this.f30561m = m23881m;
        nl0.m24944a(m23881m, "NativeJavascriptExecutor.initializeEngine");
    }

    /* renamed from: i */
    public final synchronized void m27958i(String str, c40 c40Var) {
        tc3 tc3Var = this.f30561m;
        if (tc3Var == null) {
            return;
        }
        kc3.m23886r(tc3Var, new mo1(this, str, c40Var), this.f30555g);
    }

    /* renamed from: j */
    public final void m27959j(WeakReference weakReference, String str, c40 c40Var) {
        m27958i(str, new wo1(this, weakReference, str, c40Var, null));
    }

    /* renamed from: k */
    public final synchronized void m27960k(String str, c40 c40Var) {
        tc3 tc3Var = this.f30561m;
        if (tc3Var == null) {
            return;
        }
        kc3.m23886r(tc3Var, new no1(this, str, c40Var), this.f30555g);
    }
}
