package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class p90 {

    /* renamed from: a */
    public final String f26113a;

    /* renamed from: b */
    public final String f26114b;

    /* renamed from: c */
    public final List f26115c;

    /* renamed from: d */
    public final String f26116d;

    /* renamed from: e */
    public final String f26117e;

    /* renamed from: f */
    public final List f26118f;

    /* renamed from: g */
    public final List f26119g;

    /* renamed from: h */
    public final List f26120h;

    /* renamed from: i */
    public final List f26121i;

    /* renamed from: j */
    public final List f26122j;

    /* renamed from: k */
    public final String f26123k;

    /* renamed from: l */
    public final List f26124l;

    /* renamed from: m */
    public final List f26125m;

    /* renamed from: n */
    public final List f26126n;

    /* renamed from: o */
    public final String f26127o;

    /* renamed from: p */
    public final String f26128p;

    /* renamed from: q */
    public final String f26129q;

    /* renamed from: r */
    public final String f26130r;

    /* renamed from: s */
    public final String f26131s;

    /* renamed from: t */
    public final List f26132t;

    /* renamed from: u */
    public final String f26133u;

    /* renamed from: v */
    public final String f26134v;

    public p90(JSONObject jSONObject) {
        List list;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        this.f26114b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(jSONArray.getString(i11));
        }
        this.f26115c = Collections.unmodifiableList(arrayList);
        this.f26116d = jSONObject.optString("allocation_id", null);
        zzt.zzg();
        this.f26118f = r90.m25996a(jSONObject, "clickurl");
        zzt.zzg();
        this.f26119g = r90.m25996a(jSONObject, "imp_urls");
        zzt.zzg();
        this.f26120h = r90.m25996a(jSONObject, "downloaded_imp_urls");
        zzt.zzg();
        this.f26122j = r90.m25996a(jSONObject, "fill_urls");
        zzt.zzg();
        this.f26124l = r90.m25996a(jSONObject, "video_start_urls");
        zzt.zzg();
        this.f26126n = r90.m25996a(jSONObject, "video_complete_urls");
        zzt.zzg();
        this.f26125m = r90.m25996a(jSONObject, "video_reward_urls");
        this.f26127o = jSONObject.optString("transaction_id");
        this.f26128p = jSONObject.optString("valid_from_timestamp");
        JSONObject optJSONObject = jSONObject.optJSONObject("ad");
        if (optJSONObject != null) {
            zzt.zzg();
            list = r90.m25996a(optJSONObject, "manual_impression_urls");
        } else {
            list = null;
        }
        this.f26121i = list;
        if (optJSONObject != null) {
            str = optJSONObject.toString();
        } else {
            str = null;
        }
        this.f26113a = str;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("data");
        if (optJSONObject2 != null) {
            str2 = optJSONObject2.toString();
        } else {
            str2 = null;
        }
        this.f26123k = str2;
        if (optJSONObject2 != null) {
            str3 = optJSONObject2.optString("class_name");
        } else {
            str3 = null;
        }
        this.f26117e = str3;
        this.f26129q = jSONObject.optString("html_template", null);
        this.f26130r = jSONObject.optString("ad_base_url", null);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("assets");
        if (optJSONObject3 != null) {
            str4 = optJSONObject3.toString();
        } else {
            str4 = null;
        }
        this.f26131s = str4;
        zzt.zzg();
        this.f26132t = r90.m25996a(jSONObject, "template_ids");
        JSONObject optJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        if (optJSONObject4 != null) {
            str5 = optJSONObject4.toString();
        } else {
            str5 = null;
        }
        this.f26133u = str5;
        this.f26134v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}
