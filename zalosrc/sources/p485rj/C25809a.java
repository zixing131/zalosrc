package p485rj;

import android.text.TextUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rj.a */
/* loaded from: classes3.dex */
public final class C25809a implements Serializable {

    /* renamed from: p */
    private String f123098p;

    /* renamed from: q */
    private String f123099q;

    /* renamed from: r */
    private int f123100r;

    /* renamed from: s */
    private int f123101s;

    /* renamed from: t */
    private String f123102t;

    /* renamed from: u */
    private String f123103u;

    /* renamed from: v */
    private String f123104v;

    public C25809a(String str, String str2, int i11, int i12, String str3, String str4) {
        AbstractC19074t.m100208f(str, "thumbUrl");
        AbstractC19074t.m100208f(str2, "gifUrl");
        AbstractC19074t.m100208f(str3, "smallGifPath");
        AbstractC19074t.m100208f(str4, "id");
        this.f123098p = str;
        this.f123099q = str2;
        this.f123100r = i11;
        this.f123101s = i12;
        this.f123102t = str3;
        this.f123104v = str4;
        m133078h();
    }

    /* renamed from: h */
    private final void m133078h() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("thumb_url", this.f123098p);
            jSONObject.put("gif_url", this.f123099q);
            jSONObject.put("width", this.f123100r);
            jSONObject.put("height", this.f123101s);
            jSONObject.put("small_gif_url", this.f123102t);
            String str = this.f123104v;
            if (str == null) {
                str = "";
            }
            jSONObject.put("id", str);
            this.f123103u = jSONObject.toString();
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public final String m133079a() {
        return this.f123099q;
    }

    /* renamed from: b */
    public final int m133080b() {
        return this.f123101s;
    }

    /* renamed from: c */
    public final String m133081c() {
        return this.f123104v;
    }

    /* renamed from: d */
    public final String m133082d() {
        return this.f123103u;
    }

    /* renamed from: e */
    public final String m133083e() {
        return this.f123102t;
    }

    /* renamed from: f */
    public final String m133084f() {
        return this.f123098p;
    }

    /* renamed from: g */
    public final int m133085g() {
        return this.f123100r;
    }

    public C25809a(String str) {
        this.f123098p = "";
        this.f123099q = "";
        this.f123102t = "";
        this.f123104v = "";
        this.f123103u = str;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("thumb_url");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f123098p = string;
            String string2 = jSONObject.getString("gif_url");
            AbstractC19074t.m100207e(string2, "getString(...)");
            this.f123099q = string2;
            String string3 = jSONObject.getString("small_gif_url");
            AbstractC19074t.m100207e(string3, "getString(...)");
            this.f123102t = string3;
            this.f123100r = jSONObject.getInt("width");
            this.f123101s = jSONObject.getInt("height");
            String string4 = jSONObject.getString("id");
            AbstractC19074t.m100207e(string4, "getString(...)");
            this.f123104v = string4;
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    public C25809a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        String str = "";
        this.f123098p = "";
        this.f123099q = "";
        this.f123102t = "";
        this.f123104v = "";
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("thumbGif");
            String optString = optJSONObject != null ? optJSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) : null;
            this.f123098p = optString == null ? "" : optString;
            JSONObject optJSONObject2 = jSONObject.optJSONObject("mediumGif");
            if (optJSONObject2 != null) {
                String optString2 = optJSONObject2.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(optString2, "optString(...)");
                this.f123099q = optString2;
                this.f123100r = optJSONObject2.optInt("width");
                this.f123101s = optJSONObject2.optInt("height");
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("smallGif");
            String optString3 = optJSONObject3 != null ? optJSONObject3.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL) : null;
            if (optString3 != null) {
                str = optString3;
            }
            this.f123102t = str;
            String optString4 = jSONObject.optString("id");
            AbstractC19074t.m100207e(optString4, "optString(...)");
            this.f123104v = optString4;
            m133078h();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
