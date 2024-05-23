package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zj1 extends ak1 {

    /* renamed from: b */
    private final JSONObject f31531b;

    /* renamed from: c */
    private final boolean f31532c;

    /* renamed from: d */
    private final boolean f31533d;

    /* renamed from: e */
    private final boolean f31534e;

    /* renamed from: f */
    private final boolean f31535f;

    /* renamed from: g */
    private final String f31536g;

    /* renamed from: h */
    private final JSONObject f31537h;

    public zj1(iq2 iq2Var, JSONObject jSONObject) {
        super(iq2Var);
        JSONObject jSONObject2;
        this.f31531b = com.google.android.gms.ads.internal.util.zzbu.zzg(jSONObject, "tracking_urls_and_actions", "active_view");
        this.f31532c = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "allow_pub_owned_ad_view");
        this.f31533d = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "attribution", "allow_pub_rendering");
        this.f31534e = com.google.android.gms.ads.internal.util.zzbu.zzk(false, jSONObject, "enable_omid");
        this.f31536g = com.google.android.gms.ads.internal.util.zzbu.zzb("", jSONObject, "watermark_overlay_png_base64");
        this.f31535f = jSONObject.optJSONObject("overlay") != null;
        if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21291k4)).booleanValue()) {
            jSONObject2 = jSONObject.optJSONObject("omid_settings");
        } else {
            jSONObject2 = null;
        }
        this.f31537h = jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: a */
    public final gr2 mo20161a() {
        JSONObject jSONObject = this.f31537h;
        if (jSONObject != null) {
            return new gr2(jSONObject);
        }
        return this.f17152a.f22309W;
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: b */
    public final String mo20162b() {
        return this.f31536g;
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: c */
    public final JSONObject mo20163c() {
        JSONObject jSONObject = this.f31531b;
        if (jSONObject != null) {
            return jSONObject;
        }
        try {
            return new JSONObject(this.f17152a.f22287A);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: d */
    public final boolean mo20164d() {
        return this.f31534e;
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: e */
    public final boolean mo20165e() {
        return this.f31532c;
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: f */
    public final boolean mo20166f() {
        return this.f31533d;
    }

    @Override // com.google.android.gms.internal.ads.ak1
    /* renamed from: g */
    public final boolean mo20167g() {
        return this.f31535f;
    }
}
