package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class en0 {

    /* renamed from: a */
    public final boolean f19699a;

    /* renamed from: b */
    public final int f19700b;

    /* renamed from: c */
    public final int f19701c;

    /* renamed from: d */
    public final int f19702d;

    /* renamed from: e */
    public final String f19703e;

    /* renamed from: f */
    public final int f19704f;

    /* renamed from: g */
    public final int f19705g;

    /* renamed from: h */
    public final int f19706h;

    /* renamed from: i */
    public final int f19707i;

    /* renamed from: j */
    public final boolean f19708j;

    /* renamed from: k */
    public final int f19709k;

    /* renamed from: l */
    public final boolean f19710l;

    /* renamed from: m */
    public final boolean f19711m;

    /* renamed from: n */
    public final boolean f19712n;

    /* renamed from: o */
    public final boolean f19713o;

    /* renamed from: p */
    public final long f19714p;

    /* renamed from: q */
    public final long f19715q;

    public en0(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f19699a = m21761a(jSONObject, "aggressive_media_codec_release", AbstractC4554gx.f20991G);
        this.f19700b = m21762b(jSONObject, "byte_buffer_precache_limit", AbstractC4554gx.f21276j);
        this.f19701c = m21762b(jSONObject, "exo_cache_buffer_size", AbstractC4554gx.f21386u);
        this.f19702d = m21762b(jSONObject, "exo_connect_timeout_millis", AbstractC4554gx.f21236f);
        AbstractC5184xw abstractC5184xw = AbstractC4554gx.f21226e;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
            }
            this.f19703e = string;
            this.f19704f = m21762b(jSONObject, "exo_read_timeout_millis", AbstractC4554gx.f21246g);
            this.f19705g = m21762b(jSONObject, "load_check_interval_bytes", AbstractC4554gx.f21256h);
            this.f19706h = m21762b(jSONObject, "player_precache_limit", AbstractC4554gx.f21266i);
            this.f19707i = m21762b(jSONObject, "socket_receive_buffer_size", AbstractC4554gx.f21286k);
            this.f19708j = m21761a(jSONObject, "use_cache_data_source", AbstractC4554gx.f21380t3);
            this.f19709k = m21762b(jSONObject, "min_retry_count", AbstractC4554gx.f21296l);
            this.f19710l = m21761a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC4554gx.f21326o);
            this.f19711m = m21761a(jSONObject, "using_official_simple_exo_player", AbstractC4554gx.f20973E1);
            this.f19712n = m21761a(jSONObject, "enable_multiple_video_playback", AbstractC4554gx.f20983F1);
            this.f19713o = m21761a(jSONObject, "use_range_http_data_source", AbstractC4554gx.f21003H1);
            this.f19714p = m21763c(jSONObject, "range_http_data_source_high_water_mark", AbstractC4554gx.f21013I1);
            this.f19715q = m21763c(jSONObject, "range_http_data_source_low_water_mark", AbstractC4554gx.f21023J1);
        }
        string = (String) zzay.zzc().m21823b(abstractC5184xw);
        this.f19703e = string;
        this.f19704f = m21762b(jSONObject, "exo_read_timeout_millis", AbstractC4554gx.f21246g);
        this.f19705g = m21762b(jSONObject, "load_check_interval_bytes", AbstractC4554gx.f21256h);
        this.f19706h = m21762b(jSONObject, "player_precache_limit", AbstractC4554gx.f21266i);
        this.f19707i = m21762b(jSONObject, "socket_receive_buffer_size", AbstractC4554gx.f21286k);
        this.f19708j = m21761a(jSONObject, "use_cache_data_source", AbstractC4554gx.f21380t3);
        this.f19709k = m21762b(jSONObject, "min_retry_count", AbstractC4554gx.f21296l);
        this.f19710l = m21761a(jSONObject, "treat_load_exception_as_non_fatal", AbstractC4554gx.f21326o);
        this.f19711m = m21761a(jSONObject, "using_official_simple_exo_player", AbstractC4554gx.f20973E1);
        this.f19712n = m21761a(jSONObject, "enable_multiple_video_playback", AbstractC4554gx.f20983F1);
        this.f19713o = m21761a(jSONObject, "use_range_http_data_source", AbstractC4554gx.f21003H1);
        this.f19714p = m21763c(jSONObject, "range_http_data_source_high_water_mark", AbstractC4554gx.f21013I1);
        this.f19715q = m21763c(jSONObject, "range_http_data_source_low_water_mark", AbstractC4554gx.f21023J1);
    }

    /* renamed from: a */
    private static final boolean m21761a(JSONObject jSONObject, String str, AbstractC5184xw abstractC5184xw) {
        boolean booleanValue = ((Boolean) zzay.zzc().m21823b(abstractC5184xw)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
                return booleanValue;
            }
        }
        return booleanValue;
    }

    /* renamed from: b */
    private static final int m21762b(JSONObject jSONObject, String str, AbstractC5184xw abstractC5184xw) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) zzay.zzc().m21823b(abstractC5184xw)).intValue();
    }

    /* renamed from: c */
    private static final long m21763c(JSONObject jSONObject, String str, AbstractC5184xw abstractC5184xw) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) zzay.zzc().m21823b(abstractC5184xw)).longValue();
    }
}
