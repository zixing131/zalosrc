package p509sp;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: sp.i */
/* loaded from: classes.dex */
public final class C26360i {

    /* renamed from: a */
    public static final C26360i f125213a;

    /* renamed from: b */
    private static final Map f125214b;

    static {
        C26360i c26360i = new C26360i();
        f125213a = c26360i;
        f125214b = Collections.synchronizedMap(new LinkedHashMap());
        String m3471U = AbstractC0924m0.m3471U();
        if (m3471U == null) {
            m3471U = "";
        }
        c26360i.m135692a(m3471U);
    }

    private C26360i() {
    }

    /* renamed from: a */
    public final void m135692a(String str) {
        AbstractC19074t.m100208f(str, "str");
        try {
            if (str.length() > 0) {
                m135693b(new JSONObject(str));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final void m135693b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("log");
            if (optJSONObject != null) {
                Map map = f125214b;
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("GENERAL", Integer.valueOf(optJSONObject.optInt("general", 0)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("FEED_MUSIC", Integer.valueOf(optJSONObject.optInt("feed_music", 0)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("SETTING_INLINE", Integer.valueOf(optJSONObject.optInt("setting_inline", 0)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("POST_FEED", Integer.valueOf(optJSONObject.optInt("post_feed", 1)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("POST_STORY", Integer.valueOf(optJSONObject.optInt("post_story", 1)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("REAL_TIME_LIKE_COMMENT", Integer.valueOf(optJSONObject.optInt("realtime_like_comment", 0)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("FEED_TIMELINE", Integer.valueOf(optJSONObject.optInt("feed_timeline", 0)));
                AbstractC19074t.m100207e(map, "mapConfigFeature");
                map.put("FEED_MULTI_REACTIONS", Integer.valueOf(optJSONObject.optInt("feed_reactions", 0)));
            }
            AbstractC0924m0.m3022Ee(jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final boolean m135694c(String str) {
        AbstractC19074t.m100208f(str, "feature");
        Integer num = (Integer) f125214b.get(str);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        return false;
    }
}
