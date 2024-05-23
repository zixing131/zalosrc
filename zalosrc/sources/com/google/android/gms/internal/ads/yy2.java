package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class yy2 {

    /* renamed from: a */
    private static WindowManager f31272a;

    /* renamed from: b */
    private static final String[] f31273b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f31274c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m28388a(int i11, int i12, int i13, int i14) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i11 / f31274c);
            jSONObject.put("y", i12 / f31274c);
            jSONObject.put("width", i13 / f31274c);
            jSONObject.put("height", i14 / f31274c);
        } catch (JSONException e11) {
            zy2.m28668a("Error with creating viewStateObject", e11);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m28389b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e11) {
            zy2.m28668a("Error with setting ad session id", e11);
        }
    }

    /* renamed from: c */
    public static void m28390c(JSONObject jSONObject, JSONObject jSONObject2) {
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

    /* renamed from: d */
    public static void m28391d(JSONObject jSONObject, cz2 cz2Var) {
        ky2 m21242a = cz2Var.m21242a();
        JSONArray jSONArray = new JSONArray();
        ArrayList m21243b = cz2Var.m21243b();
        int size = m21243b.size();
        for (int i11 = 0; i11 < size; i11++) {
            jSONArray.put((String) m21243b.get(i11));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m21242a.m24095d());
            jSONObject.put("friendlyObstructionPurpose", m21242a.m24092a());
            jSONObject.put("friendlyObstructionReason", m21242a.m24094c());
        } catch (JSONException e11) {
            zy2.m28668a("Error with setting friendly obstruction", e11);
        }
    }

    /* renamed from: e */
    public static void m28392e(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e11) {
            zy2.m28668a("Error with setting not visible reason", e11);
        }
    }

    /* renamed from: f */
    public static void m28393f(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e11) {
            zy2.m28668a("Error with setting not visible reason", e11);
        }
    }

    /* renamed from: g */
    public static void m28394g(Context context) {
        if (context != null) {
            f31274c = context.getResources().getDisplayMetrics().density;
            f31272a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: h */
    public static void m28395h(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e11) {
            zy2.m28668a("JSONException during JSONObject.put for name [" + str + "]", e11);
        }
    }

    /* renamed from: i */
    public static void m28396i(JSONObject jSONObject) {
        float f11;
        float f12;
        if (f31272a != null) {
            Point point = new Point(0, 0);
            f31272a.getDefaultDisplay().getRealSize(point);
            float f13 = point.x;
            float f14 = f31274c;
            f11 = f13 / f14;
            f12 = point.y / f14;
        } else {
            f11 = 0.0f;
            f12 = 0.0f;
        }
        try {
            jSONObject.put("width", f11);
            jSONObject.put("height", f12);
        } catch (JSONException e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static boolean m28397j(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f31273b;
            int i11 = 0;
            while (true) {
                if (i11 < 4) {
                    String str = strArr[i11];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i11++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m28398k(optJSONArray, optJSONArray2)) {
                            for (int i12 = 0; i12 < optJSONArray.length(); i12++) {
                                if (!optJSONArray.optString(i12, "").equals(optJSONArray2.optString(i12, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if (m28398k(optJSONArray3, optJSONArray4)) {
                            for (int i13 = 0; i13 < optJSONArray3.length(); i13++) {
                                if (m28397j(optJSONArray3.optJSONObject(i13), optJSONArray4.optJSONObject(i13))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private static boolean m28398k(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        if (jSONArray != null && jSONArray2 != null && jSONArray.length() == jSONArray2.length()) {
            return true;
        }
        return false;
    }
}
