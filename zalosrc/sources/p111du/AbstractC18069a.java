package p111du;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: du.a */
/* loaded from: classes4.dex */
public abstract class AbstractC18069a {
    /* renamed from: a */
    private static List m96082a(JSONArray jSONArray, int i11) {
        ArrayList arrayList;
        int length = jSONArray.length();
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                return new ArrayList(length);
            }
            arrayList = new ArrayList();
            while (i12 < length) {
                arrayList.add(Integer.valueOf(jSONArray.optInt(i12)));
                i12++;
            }
        } else {
            arrayList = new ArrayList();
            while (i12 < length) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i12);
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
                i12++;
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m96083b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean(str);
    }

    /* renamed from: c */
    public static double m96084c(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0.0d;
        }
        return jSONObject.optDouble(str, 0.0d);
    }

    /* renamed from: d */
    public static int m96085d(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0;
        }
        return jSONObject.optInt(str);
    }

    /* renamed from: e */
    public static int m96086e(JSONObject jSONObject, String str, int i11) {
        if (jSONObject == null) {
            return i11;
        }
        return jSONObject.optInt(str, i11);
    }

    /* renamed from: f */
    public static long m96087f(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return 0L;
        }
        return jSONObject.optLong(str);
    }

    /* renamed from: g */
    public static long m96088g(JSONObject jSONObject, String str, long j11) {
        if (jSONObject == null) {
            return j11;
        }
        return jSONObject.optLong(str, j11);
    }

    /* renamed from: h */
    public static String m96089h(JSONObject jSONObject, String str) {
        return jSONObject.optString(str).trim();
    }

    /* renamed from: i */
    public static JSONArray m96090i(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONArray(str);
    }

    /* renamed from: j */
    public static JSONObject m96091j(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optJSONObject(str);
    }

    /* renamed from: k */
    public static List m96092k(JSONArray jSONArray) {
        return m96093l(jSONArray, false);
    }

    /* renamed from: l */
    public static List m96093l(JSONArray jSONArray, boolean z11) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i11 = 0; i11 < length; i11++) {
            Object opt = jSONArray.opt(i11);
            if (opt != null && (!z11 || !arrayList.contains(opt))) {
                arrayList.add(opt);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    public static long m96094m(String str, String str2, long j11) {
        if (TextUtils.isEmpty(str)) {
            return j11;
        }
        return new JSONObject(str).optLong(str2, j11);
    }

    /* renamed from: n */
    public static String m96095n(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new JSONObject(str).optString(str2);
    }

    /* renamed from: o */
    public static String m96096o(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return new JSONObject(str).optString(str2, str3);
    }

    /* renamed from: p */
    public static ArrayList m96097p(String str, String str2) {
        JSONArray optJSONArray;
        if (TextUtils.isEmpty(str) || (optJSONArray = new JSONObject(str).optJSONArray(str2)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
            arrayList.add(optJSONArray.getString(i11));
        }
        return arrayList;
    }

    /* renamed from: q */
    public static JSONObject m96098q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: r */
    public static JSONArray m96099r(int i11, JSONArray jSONArray, int i12) {
        List m96082a = m96082a(jSONArray, i12);
        if (m96082a != null && !m96082a.isEmpty()) {
            m96082a.remove(i11);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = m96082a.iterator();
            while (it.hasNext()) {
                jSONArray2.put(it.next());
            }
            return jSONArray2;
        }
        return jSONArray;
    }
}
