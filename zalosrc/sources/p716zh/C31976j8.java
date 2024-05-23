package p716zh;

import android.text.TextUtils;
import java.util.ArrayList;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zh.j8 */
/* loaded from: classes3.dex */
public class C31976j8 {

    /* renamed from: a */
    private int f147006a;

    /* renamed from: b */
    private int f147007b;

    /* renamed from: c */
    private String f147008c;

    /* renamed from: d */
    private String f147009d;

    /* renamed from: e */
    private int f147010e;

    public C31976j8(int i11, int i12, String str) {
        this.f147006a = i11;
        this.f147007b = i12;
        this.f147008c = str;
    }

    /* renamed from: c */
    public static ArrayList m153803c(String str, boolean z11) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && !str.equalsIgnoreCase("null")) {
            int i11 = -1;
            try {
                if (!z11) {
                    JSONArray jSONArray = new JSONArray(str);
                    int i12 = 0;
                    while (i12 < jSONArray.length()) {
                        try {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i12);
                            int optInt = jSONObject3.optInt("code", i11);
                            int optInt2 = jSONObject3.optInt("has", i11);
                            String optString = jSONObject3.optString("res");
                            if (!TextUtils.isEmpty(optString) && !optString.equalsIgnoreCase("null")) {
                                jSONObject2 = new JSONObject(optString);
                            } else {
                                jSONObject2 = null;
                            }
                            C31976j8 c31976j8 = new C31976j8(optInt, optInt2, optString);
                            if (optInt == 1) {
                                if (jSONObject2 != null && !jSONObject2.isNull("pkgname")) {
                                    c31976j8.m153808f(jSONObject2.optString("pkgname"));
                                }
                            } else if (optInt == 4 && jSONObject2 != null && !jSONObject2.isNull("sticker_cate_id")) {
                                c31976j8.m153809g(jSONObject2.optInt("sticker_cate_id"));
                            }
                            arrayList.add(c31976j8);
                        } catch (Exception e11) {
                            e11.printStackTrace();
                        }
                        i12++;
                        i11 = -1;
                    }
                } else {
                    JSONObject jSONObject4 = new JSONObject(str);
                    int optInt3 = jSONObject4.optInt("code", -1);
                    int optInt4 = jSONObject4.optInt("has", -1);
                    String optString2 = jSONObject4.optString("res");
                    if (!TextUtils.isEmpty(optString2) && !optString2.equalsIgnoreCase("null")) {
                        jSONObject = new JSONObject(optString2);
                    } else {
                        jSONObject = null;
                    }
                    C31976j8 c31976j82 = new C31976j8(optInt3, optInt4, optString2);
                    if (optInt3 == 1) {
                        if (jSONObject != null && !jSONObject.isNull("pkgname")) {
                            c31976j82.m153808f(jSONObject.optString("pkgname"));
                        }
                    } else if (optInt3 == 4 && jSONObject != null && !jSONObject.isNull("sticker_cate_id")) {
                        c31976j82.m153809g(jSONObject.optInt("sticker_cate_id"));
                    }
                    arrayList.add(c31976j82);
                }
            } catch (Exception e12) {
                AbstractC23350e.m122776f("", e12);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public int m153804a() {
        return this.f147006a;
    }

    /* renamed from: b */
    public int m153805b() {
        return this.f147007b;
    }

    /* renamed from: d */
    public String m153806d() {
        return this.f147009d;
    }

    /* renamed from: e */
    public int m153807e() {
        return this.f147010e;
    }

    /* renamed from: f */
    public void m153808f(String str) {
        this.f147009d = str;
    }

    /* renamed from: g */
    public void m153809g(int i11) {
        this.f147010e = i11;
    }
}
