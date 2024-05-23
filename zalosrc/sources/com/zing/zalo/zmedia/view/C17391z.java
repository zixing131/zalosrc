package com.zing.zalo.zmedia.view;

import android.text.TextUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.cache.AbstractC17297a;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import me0.AbstractC23041d2;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zing.zalo.zmedia.view.z */
/* loaded from: classes7.dex */
public class C17391z {

    /* renamed from: a */
    public String f88618a;

    /* renamed from: b */
    public String f88619b;

    /* renamed from: c */
    public String f88620c;

    /* renamed from: d */
    public String f88621d;

    /* renamed from: e */
    public String f88622e;

    /* renamed from: f */
    public int f88623f;

    /* renamed from: g */
    public boolean f88624g;

    /* renamed from: h */
    public int f88625h;

    /* renamed from: i */
    public float f88626i;

    /* renamed from: j */
    public String f88627j;

    /* renamed from: k */
    public String f88628k;

    /* renamed from: l */
    public int f88629l;

    /* renamed from: m */
    public boolean f88630m;

    /* renamed from: n */
    public String f88631n;

    /* renamed from: o */
    public long f88632o;

    /* renamed from: p */
    public int f88633p;

    /* renamed from: q */
    public String f88634q;

    /* renamed from: r */
    public String f88635r;

    public C17391z(String str, String str2, String str3, String str4, String str5, int i11, boolean z11, int i12, float f11, int i13, String str6, String str7, int i14) {
        this.f88628k = "";
        this.f88618a = str;
        this.f88619b = str2;
        this.f88620c = str3;
        this.f88621d = str4;
        this.f88622e = str5;
        this.f88623f = i11;
        this.f88624g = z11;
        this.f88625h = i12;
        this.f88626i = f11;
        this.f88629l = i13;
        this.f88630m = false;
        this.f88631n = str7;
        this.f88633p = i14;
        if (i12 != 3) {
            m92541f(str6);
        }
    }

    /* renamed from: a */
    public String m92536a(ZMediaPlayerSettings.VideoConfig videoConfig) {
        if (videoConfig != null && videoConfig.getPriorityFormat() == 1 && !TextUtils.isEmpty(this.f88621d)) {
            return this.f88621d;
        }
        return this.f88620c;
    }

    /* renamed from: b */
    public boolean m92537b() {
        return !TextUtils.isEmpty(this.f88620c);
    }

    /* renamed from: c */
    public boolean m92538c() {
        if (TextUtils.isEmpty(this.f88620c) || !TextUtils.isEmpty(this.f88621d)) {
            return false;
        }
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!AbstractC23041d2.m118194A(this.f88620c)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m92539d(ZMediaPlayerSettings.VideoConfig videoConfig) {
        if (videoConfig != null && videoConfig.getPriorityFormat() != 1) {
            return !TextUtils.isEmpty(this.f88620c);
        }
        if (!TextUtils.isEmpty(this.f88620c) || !TextUtils.isEmpty(this.f88621d)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public JSONObject m92540e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f88618a);
            jSONObject.put("title", this.f88619b);
            jSONObject.put("uri", this.f88620c);
            jSONObject.put("hls_url", this.f88621d);
            jSONObject.put("thumb_url", this.f88622e);
            jSONObject.put("thumb_target_width", this.f88623f);
            jSONObject.put("is_streaming", this.f88624g);
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, this.f88625h);
            jSONObject.put("ratio", this.f88626i);
            jSONObject.put("cache_key", this.f88627j);
            jSONObject.put("cache_path", this.f88628k);
            jSONObject.put("source", this.f88629l);
            jSONObject.put("auto_play", this.f88630m);
            jSONObject.put("uid", this.f88631n);
            jSONObject.put("index", this.f88633p);
            jSONObject.put("media_id", this.f88634q);
            jSONObject.put("duration", this.f88632o);
            jSONObject.put("video_ext", this.f88635r);
            return jSONObject;
        } catch (JSONException e11) {
            e11.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object obj) {
        boolean z11;
        boolean z12;
        if (!(obj instanceof C17391z)) {
            return false;
        }
        C17391z c17391z = (C17391z) obj;
        if (!TextUtils.isEmpty(this.f88620c) && TextUtils.equals(this.f88620c, c17391z.f88620c)) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!TextUtils.isEmpty(this.f88621d) && TextUtils.equals(this.f88621d, c17391z.f88621d)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if ((!z11 && !z12) || !this.f88618a.equals(c17391z.f88618a) || this.f88624g != c17391z.f88624g || this.f88625h != c17391z.f88625h || this.f88629l != c17391z.f88629l) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public void m92541f(String str) {
        String m92224b = AbstractC17297a.m92224b(this.f88620c);
        this.f88627j = m92224b;
        if (str == null) {
            this.f88628k = AbstractC17297a.m92225c(m92224b);
        } else {
            this.f88628k = str;
        }
    }

    public int hashCode() {
        return super.hashCode() + ((int) (System.currentTimeMillis() % 1000000));
    }

    public String toString() {
        return "ZVideo{id='" + this.f88618a + "', userId='" + this.f88631n + "', title='" + this.f88619b + "', uri='" + this.f88620c + "', type=" + this.f88625h + '}';
    }

    public C17391z(JSONObject jSONObject) {
        this.f88626i = 1.0f;
        this.f88628k = "";
        this.f88629l = 8;
        try {
            this.f88618a = jSONObject.optString("id");
            this.f88619b = jSONObject.optString("title");
            this.f88620c = jSONObject.optString("uri");
            this.f88621d = jSONObject.optString("hls_url");
            this.f88622e = jSONObject.optString("thumb_url");
            this.f88623f = jSONObject.optInt("thumb_target_width");
            this.f88624g = jSONObject.optBoolean("is_streaming");
            this.f88625h = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            this.f88626i = (float) jSONObject.optDouble("ratio", 1.0d);
            this.f88627j = jSONObject.optString("cache_key");
            this.f88628k = jSONObject.optString("cache_path");
            this.f88629l = jSONObject.optInt("source");
            this.f88630m = jSONObject.optBoolean("auto_play");
            this.f88631n = jSONObject.optString("uid");
            this.f88633p = jSONObject.optInt("index");
            this.f88634q = jSONObject.optString("media_id");
            this.f88632o = jSONObject.optLong("duration");
            this.f88635r = jSONObject.optString("video_ext");
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
