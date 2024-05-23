package c30;

import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8012e0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.C23212s8;
import org.json.JSONObject;
import p588vw.C28644j;

/* renamed from: c30.a */
/* loaded from: classes5.dex */
public final class C3229a {

    /* renamed from: a */
    public static final C3229a f13790a;

    /* renamed from: b */
    private static boolean f13791b;

    /* renamed from: c */
    private static String f13792c;

    /* renamed from: d */
    private static String f13793d;

    /* renamed from: e */
    private static String f13794e;

    /* renamed from: f */
    private static String f13795f;

    /* renamed from: g */
    private static long f13796g;

    /* renamed from: h */
    private static JSONObject f13797h;

    /* renamed from: i */
    private static boolean f13798i;

    static {
        C3229a c3229a = new C3229a();
        f13790a = c3229a;
        f13792c = "";
        f13793d = "";
        f13794e = "";
        f13795f = "zSticker AI";
        f13798i = c3229a.m16394h();
        try {
            String m3735d = AbstractC0924m0.m3735d();
            if (m3735d != null && m3735d.length() > 0) {
                c3229a.m16396j(new JSONObject(m3735d));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    private C3229a() {
    }

    /* renamed from: l */
    private final void m16386l() {
        String str;
        JSONObject jSONObject = f13797h;
        if (jSONObject != null) {
            str = jSONObject.toString();
        } else {
            str = null;
        }
        AbstractC0924m0.m3050Fd(str);
    }

    /* renamed from: a */
    public final int m16387a() {
        if (C23212s8.m119603k()) {
            return AbstractC8012e0.ai_sticker_badge_light;
        }
        return AbstractC8012e0.ai_sticker_badge_dark;
    }

    /* renamed from: b */
    public final String m16388b() {
        return f13795f;
    }

    /* renamed from: c */
    public final String m16389c() {
        return f13793d;
    }

    /* renamed from: d */
    public final String m16390d() {
        return f13794e;
    }

    /* renamed from: e */
    public final boolean m16391e() {
        return f13791b;
    }

    /* renamed from: f */
    public final String m16392f() {
        return f13792c;
    }

    /* renamed from: g */
    public final long m16393g() {
        return f13796g;
    }

    /* renamed from: h */
    public final boolean m16394h() {
        return AbstractC0924m0.m3132I8();
    }

    /* renamed from: i */
    public final boolean m16395i() {
        return f13798i;
    }

    /* renamed from: j */
    public final void m16396j(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "config");
        try {
            boolean z11 = false;
            if (jSONObject.optInt("enable", 0) == 1) {
                z11 = true;
            }
            m16399n(z11);
            String optString = jSONObject.optString("mini_app", "");
            AbstractC19074t.m100207e(optString, "optString(...)");
            f13792c = optString;
            JSONObject optJSONObject = jSONObject.optJSONObject("empty_info");
            if (optJSONObject != null) {
                String optString2 = optJSONObject.optString("thumb");
                AbstractC19074t.m100207e(optString2, "optString(...)");
                f13793d = optString2;
                String optString3 = optJSONObject.optString("title");
                AbstractC19074t.m100207e(optString3, "optString(...)");
                f13794e = optString3;
            }
            if (jSONObject.has("version")) {
                f13796g = jSONObject.optLong("version", f13796g);
            } else {
                jSONObject.put("version", f13796g);
            }
            f13797h = jSONObject;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: k */
    public final void m16397k() {
        f13797h = null;
        f13796g = 0L;
        m16399n(true);
        f13792c = "";
        f13793d = "";
        f13794e = "";
        AbstractC0924m0.m3438So(0L);
    }

    /* renamed from: m */
    public final void m16398m(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "config");
        try {
            m16396j(jSONObject);
            m16386l();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: n */
    public final void m16399n(boolean z11) {
        if (f13791b != z11) {
            f13791b = z11;
            C28644j.m143233Y().m143276F();
        }
    }

    /* renamed from: o */
    public final void m16400o(boolean z11) {
        f13798i = z11;
    }

    /* renamed from: p */
    public final void m16401p(long j11) {
        f13796g = j11;
        JSONObject jSONObject = f13797h;
        if (jSONObject != null) {
            jSONObject.put("version", j11);
        }
        m16386l();
    }
}
