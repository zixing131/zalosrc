package com.google.android.gms.internal.ads;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class pf0 {

    /* renamed from: a */
    private final List f26191a;

    /* renamed from: b */
    private final String f26192b;

    /* renamed from: c */
    private final String f26193c;

    /* renamed from: d */
    private final String f26194d;

    /* renamed from: e */
    private final boolean f26195e;

    /* renamed from: f */
    private final boolean f26196f;

    /* renamed from: g */
    private final String f26197g;

    /* renamed from: h */
    private final String f26198h;

    /* renamed from: i */
    private final String f26199i;

    /* renamed from: j */
    private final int f26200j;

    /* renamed from: k */
    private final JSONObject f26201k;

    /* renamed from: l */
    private final String f26202l;

    /* renamed from: m */
    private final String f26203m;

    public pf0(JSONObject jSONObject) {
        List asList;
        this.f26199i = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f26192b = jSONObject.optString("base_uri");
        this.f26193c = jSONObject.optString("post_parameters");
        this.f26195e = m25427j(jSONObject.optString("drt_include"));
        this.f26196f = m25427j(jSONObject.optString("cookies_include", "true"));
        this.f26197g = jSONObject.optString("request_id");
        this.f26194d = jSONObject.optString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
        String optString = jSONObject.optString("errors");
        if (optString == null) {
            asList = null;
        } else {
            asList = Arrays.asList(optString.split(","));
        }
        this.f26191a = asList;
        this.f26200j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f26198h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject optJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f26201k = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.f26202l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f26203m = jSONObject.optString("pool_key");
    }

    /* renamed from: j */
    private static boolean m25427j(String str) {
        if (str == null) {
            return false;
        }
        if (!str.equals("1") && !str.equals("true")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int m25428a() {
        return this.f26200j;
    }

    /* renamed from: b */
    public final String m25429b() {
        return this.f26192b;
    }

    /* renamed from: c */
    public final String m25430c() {
        return this.f26203m;
    }

    /* renamed from: d */
    public final String m25431d() {
        return this.f26193c;
    }

    /* renamed from: e */
    public final String m25432e() {
        return this.f26199i;
    }

    /* renamed from: f */
    public final List m25433f() {
        return this.f26191a;
    }

    /* renamed from: g */
    public final JSONObject m25434g() {
        return this.f26201k;
    }

    /* renamed from: h */
    public final boolean m25435h() {
        return this.f26196f;
    }

    /* renamed from: i */
    public final boolean m25436i() {
        return this.f26195e;
    }
}
