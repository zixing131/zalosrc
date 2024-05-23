package p142ey;

import am.AbstractC0924m0;
import android.text.TextUtils;
import fn0.AbstractC19074t;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: ey.d */
/* loaded from: classes4.dex */
public final class C18634d {

    /* renamed from: b */
    private static boolean f93779b;

    /* renamed from: a */
    public static final C18634d f93778a = new C18634d();

    /* renamed from: c */
    private static String f93780c = "";

    /* renamed from: d */
    private static String f93781d = "";

    /* renamed from: e */
    private static String f93782e = "";

    /* renamed from: f */
    private static String f93783f = "";

    /* renamed from: g */
    private static String f93784g = "";

    /* renamed from: h */
    private static String f93785h = "";

    /* renamed from: i */
    private static String f93786i = "";

    /* renamed from: j */
    private static String f93787j = "";

    private C18634d() {
    }

    /* renamed from: k */
    private final void m98475k(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            synchronized (this) {
                try {
                    boolean z11 = false;
                    if (jSONObject.optInt("enable", 0) == 1) {
                        z11 = true;
                    }
                    f93779b = z11;
                    if (jSONObject.has("title")) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject("title");
                        String string = jSONObject2.getString("vi");
                        AbstractC19074t.m100207e(string, "getString(...)");
                        f93780c = string;
                        String string2 = jSONObject2.getString("en");
                        AbstractC19074t.m100207e(string2, "getString(...)");
                        f93781d = string2;
                    }
                    if (jSONObject.has("subTitle")) {
                        JSONObject jSONObject3 = jSONObject.getJSONObject("subTitle");
                        String string3 = jSONObject3.getString("vi");
                        AbstractC19074t.m100207e(string3, "getString(...)");
                        f93782e = string3;
                        String string4 = jSONObject3.getString("en");
                        AbstractC19074t.m100207e(string4, "getString(...)");
                        f93783f = string4;
                    }
                    if (jSONObject.has("thumbUrl")) {
                        JSONObject jSONObject4 = jSONObject.getJSONObject("thumbUrl");
                        String string5 = jSONObject4.getString("l");
                        AbstractC19074t.m100207e(string5, "getString(...)");
                        f93785h = string5;
                        String string6 = jSONObject4.getString("d");
                        AbstractC19074t.m100207e(string6, "getString(...)");
                        f93784g = string6;
                    }
                    if (jSONObject.has("actionType")) {
                        String string7 = jSONObject.getString("actionType");
                        AbstractC19074t.m100207e(string7, "getString(...)");
                        f93786i = string7;
                    }
                    if (jSONObject.has("actionData")) {
                        String string8 = jSONObject.getString("actionData");
                        AbstractC19074t.m100207e(string8, "getString(...)");
                        f93787j = string8;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    private final void m98476l(JSONObject jSONObject) {
        try {
            AbstractC0924m0.m4405zf(String.valueOf(jSONObject));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public final String m98477a() {
        return f93787j;
    }

    /* renamed from: b */
    public final String m98478b() {
        return f93786i;
    }

    /* renamed from: c */
    public final boolean m98479c() {
        return f93779b;
    }

    /* renamed from: d */
    public final String m98480d() {
        return f93783f;
    }

    /* renamed from: e */
    public final String m98481e() {
        return f93782e;
    }

    /* renamed from: f */
    public final String m98482f() {
        return f93784g;
    }

    /* renamed from: g */
    public final String m98483g() {
        return f93785h;
    }

    /* renamed from: h */
    public final String m98484h() {
        return f93781d;
    }

    /* renamed from: i */
    public final String m98485i() {
        return f93780c;
    }

    /* renamed from: j */
    public final void m98486j(boolean z11) {
        String m3037F0 = AbstractC0924m0.m3037F0();
        if (!TextUtils.isEmpty(m3037F0)) {
            m98487m(new JSONObject(m3037F0), z11);
        }
    }

    /* renamed from: m */
    public final void m98487m(JSONObject jSONObject, boolean z11) {
        m98475k(jSONObject);
        if (z11) {
            m98476l(jSONObject);
        }
    }
}
