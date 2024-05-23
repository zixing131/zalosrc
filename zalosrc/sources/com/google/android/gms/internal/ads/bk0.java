package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class bk0 {

    /* renamed from: d */
    private String f17834d;

    /* renamed from: e */
    private String f17835e;

    /* renamed from: f */
    private long f17836f;

    /* renamed from: g */
    private JSONObject f17837g;

    /* renamed from: h */
    private boolean f17838h;

    /* renamed from: j */
    private boolean f17840j;

    /* renamed from: a */
    private final List f17831a = new ArrayList();

    /* renamed from: b */
    private final List f17832b = new ArrayList();

    /* renamed from: c */
    private final Map f17833c = new HashMap();

    /* renamed from: i */
    private final List f17839i = new ArrayList();

    public bk0(String str, long j11) {
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONArray optJSONArray;
        JSONObject optJSONObject3;
        this.f17838h = false;
        this.f17840j = false;
        this.f17835e = str;
        this.f17836f = j11;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f17837g = jSONObject;
                if (jSONObject.optInt("status", -1) != 1) {
                    this.f17838h = false;
                    yk0.zzj("App settings could not be fetched successfully.");
                    return;
                }
                this.f17838h = true;
                this.f17834d = this.f17837g.optString("app_id");
                JSONArray optJSONArray2 = this.f17837g.optJSONArray("ad_unit_id_settings");
                if (optJSONArray2 != null) {
                    for (int i11 = 0; i11 < optJSONArray2.length(); i11++) {
                        JSONObject jSONObject2 = optJSONArray2.getJSONObject(i11);
                        String optString = jSONObject2.optString("format");
                        String optString2 = jSONObject2.optString("ad_unit_id");
                        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2)) {
                            if ("interstitial".equalsIgnoreCase(optString)) {
                                this.f17832b.add(optString2);
                            } else if (("rewarded".equalsIgnoreCase(optString) || "rewarded_interstitial".equals(optString)) && (optJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                                this.f17833c.put(optString2, new q90(optJSONObject3));
                            }
                        }
                    }
                }
                JSONArray optJSONArray3 = this.f17837g.optJSONArray("persistable_banner_ad_unit_ids");
                if (optJSONArray3 != null) {
                    for (int i12 = 0; i12 < optJSONArray3.length(); i12++) {
                        this.f17831a.add(optJSONArray3.optString(i12));
                    }
                }
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21165X5)).booleanValue() && (optJSONObject2 = this.f17837g.optJSONObject("common_settings")) != null && (optJSONArray = optJSONObject2.optJSONArray("loeid")) != null) {
                    for (int i13 = 0; i13 < optJSONArray.length(); i13++) {
                        this.f17839i.add(optJSONArray.get(i13).toString());
                    }
                }
                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21372s5)).booleanValue() && (optJSONObject = this.f17837g.optJSONObject("common_settings")) != null) {
                    this.f17840j = optJSONObject.optBoolean("is_prefetching_enabled", false);
                }
            } catch (JSONException e11) {
                yk0.zzk("Exception occurred while processing app setting json", e11);
                zzt.zzo().m22945t(e11, "AppSettings.parseAppSettingsJson");
            }
        }
    }

    /* renamed from: a */
    public final long m20553a() {
        return this.f17836f;
    }

    /* renamed from: b */
    public final String m20554b() {
        return this.f17834d;
    }

    /* renamed from: c */
    public final String m20555c() {
        return this.f17835e;
    }

    /* renamed from: d */
    public final List m20556d() {
        return this.f17839i;
    }

    /* renamed from: e */
    public final Map m20557e() {
        return this.f17833c;
    }

    /* renamed from: f */
    public final JSONObject m20558f() {
        return this.f17837g;
    }

    /* renamed from: g */
    public final void m20559g(long j11) {
        this.f17836f = j11;
    }

    /* renamed from: h */
    public final boolean m20560h() {
        return this.f17840j;
    }

    /* renamed from: i */
    public final boolean m20561i() {
        return this.f17838h;
    }
}
