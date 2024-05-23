package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzu;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class nv1 implements z71, ta1, p91 {

    /* renamed from: p */
    private final cw1 f25346p;

    /* renamed from: q */
    private final String f25347q;

    /* renamed from: r */
    private final String f25348r;

    /* renamed from: s */
    private int f25349s = 0;

    /* renamed from: t */
    private mv1 f25350t = mv1.AD_REQUESTED;

    /* renamed from: u */
    private o71 f25351u;

    /* renamed from: v */
    private zze f25352v;

    /* renamed from: w */
    private String f25353w;

    /* renamed from: x */
    private String f25354x;

    /* renamed from: y */
    private boolean f25355y;

    /* renamed from: z */
    private boolean f25356z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public nv1(cw1 cw1Var, dr2 dr2Var, String str) {
        this.f25346p = cw1Var;
        this.f25348r = str;
        this.f25347q = dr2Var.f19400f;
    }

    /* renamed from: h */
    private static JSONObject m25015h(zze zzeVar) {
        JSONObject m25015h;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        zze zzeVar2 = zzeVar.zzd;
        if (zzeVar2 == null) {
            m25015h = null;
        } else {
            m25015h = m25015h(zzeVar2);
        }
        jSONObject.put("underlyingError", m25015h);
        return jSONObject;
    }

    /* renamed from: i */
    private final JSONObject m25016i(o71 o71Var) {
        JSONObject m25015h;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", o71Var.zzg());
        jSONObject.put("responseSecsSinceEpoch", o71Var.zzc());
        jSONObject.put("responseId", o71Var.zzi());
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21149V7)).booleanValue()) {
            String zzd = o71Var.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                yk0.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.f25353w)) {
            jSONObject.put("adRequestUrl", this.f25353w);
        }
        if (!TextUtils.isEmpty(this.f25354x)) {
            jSONObject.put("postBody", this.f25354x);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : o71Var.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21158W7)).booleanValue()) {
                jSONObject2.put("credentials", zzaw.zzb().m26119j(zzuVar.zzd));
            }
            zze zzeVar = zzuVar.zzc;
            if (zzeVar == null) {
                m25015h = null;
            } else {
                m25015h = m25015h(zzeVar);
            }
            jSONObject2.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, m25015h);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.z71
    /* renamed from: a */
    public final void mo20715a(zze zzeVar) {
        this.f25350t = mv1.AD_LOAD_FAILED;
        this.f25352v = zzeVar;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue()) {
            this.f25346p.m21175f(this.f25347q, this);
        }
    }

    /* renamed from: b */
    public final String m25017b() {
        return this.f25348r;
    }

    /* renamed from: c */
    public final JSONObject m25018c() {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.f25350t);
        jSONObject2.put("format", iq2.m23338a(this.f25349s));
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.f25355y);
            if (this.f25355y) {
                jSONObject2.put("shown", this.f25356z);
            }
        }
        o71 o71Var = this.f25351u;
        if (o71Var != null) {
            jSONObject = m25016i(o71Var);
        } else {
            zze zzeVar = this.f25352v;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                o71 o71Var2 = (o71) iBinder;
                jSONObject3 = m25016i(o71Var2);
                if (o71Var2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(m25015h(this.f25352v));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    /* renamed from: d */
    public final void m25019d() {
        this.f25355y = true;
    }

    /* renamed from: e */
    public final void m25020e() {
        this.f25356z = true;
    }

    /* renamed from: f */
    public final boolean m25021f() {
        if (this.f25350t != mv1.AD_REQUESTED) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p91
    /* renamed from: g */
    public final void mo24864g(v31 v31Var) {
        this.f25351u = v31Var.m27145c();
        this.f25350t = mv1.AD_LOADED;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue()) {
            this.f25346p.m21175f(this.f25347q, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: j */
    public final void mo20718j(tq2 tq2Var) {
        if (!tq2Var.f28473b.f27822a.isEmpty()) {
            this.f25349s = ((iq2) tq2Var.f28473b.f27822a.get(0)).f22315b;
        }
        if (!TextUtils.isEmpty(tq2Var.f28473b.f27823b.f24023k)) {
            this.f25353w = tq2Var.f28473b.f27823b.f24023k;
        }
        if (!TextUtils.isEmpty(tq2Var.f28473b.f27823b.f24024l)) {
            this.f25354x = tq2Var.f28473b.f27823b.f24024l;
        }
    }

    @Override // com.google.android.gms.internal.ads.ta1
    /* renamed from: k */
    public final void mo20719k(zzcbc zzcbcVar) {
        if (!((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21195a8)).booleanValue()) {
            this.f25346p.m21175f(this.f25347q, this);
        }
    }
}
