package p394oj;

import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import mm0.AbstractC23350e;
import org.json.JSONException;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: oj.f */
/* loaded from: classes3.dex */
public final class C24280f {

    /* renamed from: a */
    public String f117261a;

    /* renamed from: b */
    public int f117262b;

    /* renamed from: c */
    public int f117263c;

    /* renamed from: d */
    public String f117264d;

    public C24280f(JSONObject jSONObject) {
        this.f117261a = "";
        this.f117264d = "";
        if (jSONObject != null) {
            try {
                String m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                this.f117261a = m96089h;
                this.f117262b = AbstractC18069a.m96085d(jSONObject, "width");
                this.f117263c = AbstractC18069a.m96085d(jSONObject, "height");
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "thumb");
                AbstractC19074t.m100207e(m96089h2, "getJSONValue(...)");
                this.f117264d = m96089h2;
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: a */
    public final JSONObject m126784a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(ZMediaPlayer.OnNativeInvokeListener.ARG_URL, this.f117261a);
            jSONObject.put("width", this.f117262b);
            jSONObject.put("height", this.f117263c);
            jSONObject.put("thumb", this.f117264d);
        } catch (JSONException e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    public C24280f(String str) {
        AbstractC19074t.m100208f(str, "stringJs");
        this.f117261a = "";
        this.f117264d = "";
        try {
            if (str.length() > 0) {
                JSONObject jSONObject = new JSONObject(str);
                String m96089h = AbstractC18069a.m96089h(jSONObject, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
                AbstractC19074t.m100207e(m96089h, "getJSONValue(...)");
                this.f117261a = m96089h;
                this.f117262b = AbstractC18069a.m96085d(jSONObject, "width");
                this.f117263c = AbstractC18069a.m96085d(jSONObject, "height");
                String m96089h2 = AbstractC18069a.m96089h(jSONObject, "thumb");
                AbstractC19074t.m100207e(m96089h2, "getJSONValue(...)");
                this.f117264d = m96089h2;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            this.f117261a = "";
            this.f117262b = 1;
            this.f117263c = 1;
            this.f117264d = "";
        }
    }

    public C24280f(String str, int i11, int i12, String str2) {
        AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
        AbstractC19074t.m100208f(str2, "thumb");
        this.f117261a = str;
        this.f117262b = i11;
        this.f117263c = i12;
        this.f117264d = str2;
    }
}
