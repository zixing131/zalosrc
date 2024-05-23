package tr;

import am.AbstractC0924m0;
import bo.C2986i1;
import bo.C2998k3;
import bo.C3000l0;
import com.zing.zalo.feed.data.TextLocalization;
import com.zing.zalo.zinstant.C17244x0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.List;
import me0.AbstractC23136l9;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25368s;

/* renamed from: tr.h */
/* loaded from: classes4.dex */
public final class C26884h {
    /* renamed from: a */
    private final C3000l0 m138542a(C2986i1 c2986i1) {
        C3000l0 c3000l0 = new C3000l0();
        c3000l0.f11893p = 1004;
        c3000l0.f11895q = "feed_content_id_sug_video_channel";
        c3000l0.f11902t0 = c2986i1;
        return c3000l0;
    }

    /* renamed from: b */
    public final String m138543b(String str) {
        AbstractC19074t.m100208f(str, "baseJsonString");
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("sug_video_channel")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("sug_video_channel");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sug_video_channel", optJSONArray);
                String jSONObject3 = jSONObject2.toString();
                AbstractC19074t.m100207e(jSONObject3, "toString(...)");
                return jSONObject3;
            }
            return "";
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: c */
    public final C2998k3 m138544c(String str) {
        AbstractC19074t.m100208f(str, "jsonString");
        try {
            return m138545d(new JSONObject(str));
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: d */
    public final C2998k3 m138545d(JSONObject jSONObject) {
        JSONArray optJSONArray;
        String str;
        String str2;
        String str3;
        int i11;
        List m131506n;
        String str4;
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
        } catch (Exception e11) {
            e = e11;
        }
        if (!jSONObject.has("sug_video_channel") || (optJSONArray = jSONObject.optJSONArray("sug_video_channel")) == null || optJSONArray.length() <= 0) {
            return null;
        }
        JSONObject jSONObject2 = optJSONArray.getJSONObject(0);
        int m118742r = AbstractC23136l9.m118742r(jSONObject2.optInt("height", 0));
        int optInt = jSONObject2.optInt("pos", -1);
        String str5 = "";
        if (!jSONObject2.has("title")) {
            str = "";
            str2 = str;
        } else {
            JSONObject optJSONObject = jSONObject2.optJSONObject("title");
            if (optJSONObject != null) {
                str2 = optJSONObject.optString("en");
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            if (optJSONObject != null) {
                str = optJSONObject.optString("vi");
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
        }
        if (!jSONObject2.has(ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE)) {
            str3 = "";
        } else {
            JSONObject optJSONObject2 = jSONObject2.optJSONObject(ZMediaPlayer.OPTION_PLAYER_KEY_SUBTITLE);
            if (optJSONObject2 != null) {
                str3 = optJSONObject2.optString("en");
            } else {
                str3 = null;
            }
            if (str3 == null) {
                str3 = "";
            }
            if (optJSONObject2 != null) {
                str4 = optJSONObject2.optString("vi");
            } else {
                str4 = null;
            }
            if (str4 != null) {
                str5 = str4;
            }
        }
        if (optInt >= 0) {
            optInt--;
        }
        C17244x0 c17244x0 = new C17244x0(51, jSONObject2.optJSONObject("zInstantAPIInfo"));
        int m4043n7 = AbstractC0924m0.m4043n7();
        if (m4043n7 > 0) {
            i11 = m4043n7;
        } else {
            i11 = m118742r;
        }
        try {
            m131506n = AbstractC25368s.m131506n(m138542a(new C2986i1(c17244x0, i11, optInt, new TextLocalization(str, str2), new TextLocalization(str5, str3))));
            return new C2998k3(m131506n, optInt);
        } catch (Exception e12) {
            e = e12;
            AbstractC20110a.f98889a.mo104552e(e);
            return null;
        }
    }
}
