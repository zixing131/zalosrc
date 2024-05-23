package p485rj;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rj.b */
/* loaded from: classes3.dex */
public final class C25810b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public String f123105a;

    /* renamed from: b */
    public int f123106b;

    /* renamed from: c */
    public int f123107c;

    /* renamed from: rj.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C25810b(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "js");
        this.f123105a = "";
        try {
            String optString = jSONObject.optString(ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            AbstractC19074t.m100207e(optString, "optString(...)");
            this.f123105a = optString;
            this.f123106b = jSONObject.optInt("width");
            this.f123107c = jSONObject.optInt("height");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a */
    public final boolean m133086a() {
        if (this.f123105a.length() > 0 && this.f123106b > 0 && this.f123107c > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final JSONObject m133087b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f123105a);
            jSONObject.put("width", this.f123106b);
            jSONObject.put("height", this.f123107c);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    public C25810b(String str, int i11, int i12) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        this.f123105a = str;
        this.f123106b = i11;
        this.f123107c = i12;
    }
}
