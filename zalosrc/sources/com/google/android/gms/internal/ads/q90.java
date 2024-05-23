package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q90 {

    /* renamed from: a */
    public final List f26679a;

    /* renamed from: b */
    public final List f26680b;

    /* renamed from: c */
    public final List f26681c;

    /* renamed from: d */
    public final List f26682d;

    /* renamed from: e */
    public final List f26683e;

    /* renamed from: f */
    public final List f26684f;

    /* renamed from: g */
    public final String f26685g;

    /* renamed from: h */
    public final String f26686h;

    public q90(JSONObject jSONObject) {
        if (yk0.zzm(2)) {
            zze.zza("Mediation Response JSON: ".concat(String.valueOf(jSONObject.toString(2))));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i11 = -1;
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            try {
                p90 p90Var = new p90(jSONArray.getJSONObject(i12));
                "banner".equalsIgnoreCase(p90Var.f26134v);
                arrayList.add(p90Var);
                if (i11 < 0) {
                    Iterator it = p90Var.f26115c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((String) it.next()).equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i11 = i12;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.f26679a = Collections.unmodifiableList(arrayList);
        this.f26685g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject optJSONObject = jSONObject.optJSONObject("settings");
        if (optJSONObject != null) {
            optJSONObject.optLong("ad_network_timeout_millis", -1L);
            zzt.zzg();
            this.f26680b = r90.m25996a(optJSONObject, "click_urls");
            zzt.zzg();
            this.f26681c = r90.m25996a(optJSONObject, "imp_urls");
            zzt.zzg();
            this.f26682d = r90.m25996a(optJSONObject, "downloaded_imp_urls");
            zzt.zzg();
            this.f26683e = r90.m25996a(optJSONObject, "nofill_urls");
            zzt.zzg();
            this.f26684f = r90.m25996a(optJSONObject, "remote_ping_urls");
            optJSONObject.optBoolean("render_in_browser", false);
            optJSONObject.optLong("refresh", -1L);
            zzcce m28718t = zzcce.m28718t(optJSONObject.optJSONArray("rewards"));
            if (m28718t == null) {
                this.f26686h = null;
            } else {
                this.f26686h = m28718t.f32014p;
            }
            optJSONObject.optBoolean("use_displayed_impression", false);
            optJSONObject.optBoolean("allow_pub_rendered_attribution", false);
            optJSONObject.optBoolean("allow_pub_owned_ad_view", false);
            optJSONObject.optBoolean("allow_custom_click_gesture", false);
            return;
        }
        this.f26680b = null;
        this.f26681c = null;
        this.f26682d = null;
        this.f26683e = null;
        this.f26684f = null;
        this.f26686h = null;
    }
}
