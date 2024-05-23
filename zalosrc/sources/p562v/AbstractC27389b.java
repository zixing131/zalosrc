package p562v;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p512t.C26437c;
import p664y.C30230c;

/* renamed from: v.b */
/* loaded from: classes2.dex */
public abstract class AbstractC27389b {

    /* renamed from: a */
    private static WindowManager f129034a;

    /* renamed from: b */
    private static String[] f129035b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f129036c = Resources.getSystem().getDisplayMetrics().density;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v.b$a */
    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a */
        final float f129037a;

        /* renamed from: b */
        final float f129038b;

        a(float f11, float f12) {
            this.f129037a = f11;
            this.f129038b = f12;
        }
    }

    /* renamed from: a */
    static float m140316a(int i11) {
        return i11 / f129036c;
    }

    /* renamed from: b */
    public static JSONObject m140317b(int i11, int i12, int i13, int i14) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m140316a(i11));
            jSONObject.put("y", m140316a(i12));
            jSONObject.put("width", m140316a(i13));
            jSONObject.put("height", m140316a(i14));
        } catch (JSONException e11) {
            AbstractC27390c.m140333b("Error with creating viewStateObject", e11);
        }
        return jSONObject;
    }

    /* renamed from: c */
    public static void m140318c(Context context) {
        if (context != null) {
            f129036c = context.getResources().getDisplayMetrics().density;
            f129034a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: d */
    public static void m140319d(JSONObject jSONObject) {
        a m140325j = m140325j(jSONObject);
        try {
            jSONObject.put("width", m140325j.f129037a);
            jSONObject.put("height", m140325j.f129038b);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m140320e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e11) {
            AbstractC27390c.m140333b("Error with setting ad session id", e11);
        }
    }

    /* renamed from: f */
    public static void m140321f(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e11) {
            AbstractC27390c.m140333b("JSONException during JSONObject.put for name [" + str + "]", e11);
        }
    }

    /* renamed from: g */
    public static void m140322g(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m140323h(JSONObject jSONObject, C30230c.a aVar) {
        C26437c m149078a = aVar.m149078a();
        JSONArray jSONArray = new JSONArray();
        Iterator it = aVar.m149080c().iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m149078a.m136291b());
            jSONObject.put("friendlyObstructionPurpose", m149078a.m136292c());
            jSONObject.put("friendlyObstructionReason", m149078a.m136293d());
        } catch (JSONException e11) {
            AbstractC27390c.m140333b("Error with setting friendly obstruction", e11);
        }
    }

    /* renamed from: i */
    private static boolean m140324i(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: j */
    private static a m140325j(JSONObject jSONObject) {
        float f11;
        float f12;
        if (f129034a != null) {
            Point point = new Point(0, 0);
            f129034a.getDefaultDisplay().getRealSize(point);
            f11 = m140316a(point.x);
            f12 = m140316a(point.y);
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        return new a(f11, f12);
    }

    /* renamed from: k */
    public static void m140326k(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e11) {
            AbstractC27390c.m140333b("Error with setting not visible reason", e11);
        }
    }

    /* renamed from: l */
    public static boolean m140327l(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && m140328m(jSONObject, jSONObject2) && m140329n(jSONObject, jSONObject2) && m140330o(jSONObject, jSONObject2) && m140331p(jSONObject, jSONObject2);
    }

    /* renamed from: m */
    private static boolean m140328m(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f129035b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private static boolean m140329n(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: o */
    private static boolean m140330o(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m140324i(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
            if (!optJSONArray.optString(i11, "").equals(optJSONArray2.optString(i11, ""))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private static boolean m140331p(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!m140324i(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
            if (!m140327l(optJSONArray.optJSONObject(i11), optJSONArray2.optJSONObject(i11))) {
                return false;
            }
        }
        return true;
    }
}
