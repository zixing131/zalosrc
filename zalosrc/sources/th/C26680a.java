package th;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p173fz.C19172a;
import p716zh.C31986k3;

/* renamed from: th.a */
/* loaded from: classes3.dex */
public final class C26680a {

    /* renamed from: a */
    public static final C26680a f126349a = new C26680a();

    /* renamed from: b */
    private static int f126350b;

    /* renamed from: c */
    private static String f126351c;

    /* renamed from: d */
    private static String f126352d;

    /* renamed from: e */
    private static String f126353e;

    /* renamed from: f */
    private static String f126354f;

    /* renamed from: g */
    private static List f126355g;

    private C26680a() {
    }

    /* renamed from: f */
    private final int m137022f() {
        return C19172a.m100600k("features@qr@bank_card@canForward", 0);
    }

    /* renamed from: g */
    public static final int m137023g() {
        return f126350b;
    }

    /* renamed from: h */
    private final int m137024h() {
        return C19172a.m100600k("features@qr@bank_card@enable_send_msg_bank_card_client", 0);
    }

    /* renamed from: n */
    private final List m137025n() {
        ArrayList arrayList = new ArrayList();
        String m100608s = C19172a.m100608s("features@qr@bank_card@list_bank_exclude_send_bank_card_client", null, 2, null);
        if (m100608s.length() > 0) {
            try {
                JSONArray jSONArray = new JSONArray(m100608s);
                int length = jSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    arrayList.add(jSONArray.optString(i11));
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final boolean m137026a() {
        if (m137024h() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m137027b() {
        if (m137024h() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final String m137028c() {
        return f126353e;
    }

    /* renamed from: d */
    public final String m137029d() {
        return f126354f;
    }

    /* renamed from: e */
    public final String m137030e() {
        return f126352d;
    }

    /* renamed from: i */
    public final String m137031i() {
        return C19172a.m100607r("features@qr@bank_card@zinstant_bank_card_template", "");
    }

    /* renamed from: j */
    public final List m137032j() {
        return f126355g;
    }

    /* renamed from: k */
    public final String m137033k() {
        return f126351c;
    }

    /* renamed from: l */
    public final boolean m137034l(String str) {
        AbstractC19074t.m100208f(str, "threadId");
        if (m137022f() == 0) {
            return false;
        }
        if (m137022f() == 2) {
            return true;
        }
        if (m137022f() != 1 || C31986k3.f147083a.m154105P1(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final void m137035m(JSONObject jSONObject) {
        JSONObject jSONObject2;
        Integer num;
        int i11;
        String str;
        String str2;
        JSONObject jSONObject3;
        String str3;
        String str4 = null;
        if (jSONObject != null) {
            jSONObject2 = jSONObject.optJSONObject("bank_card");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            num = Integer.valueOf(jSONObject2.optInt("enable"));
        } else {
            num = null;
        }
        if ((num == null || num.intValue() != 0) && ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 2))) {
            num = null;
        }
        if (num != null) {
            i11 = num.intValue();
        } else {
            i11 = 0;
        }
        AbstractC0924m0.m3025Eh(i11);
        if (jSONObject2 != null) {
            str = jSONObject2.optString("bank_list");
        } else {
            str = null;
        }
        String str5 = "";
        if (str == null) {
            str = "";
        } else {
            AbstractC19074t.m100205c(str);
        }
        AbstractC0924m0.m3112Hh(str);
        if (jSONObject2 != null) {
            str2 = jSONObject2.optString("bank_list_checksum");
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        } else {
            AbstractC19074t.m100205c(str2);
        }
        AbstractC0924m0.m3141Ih(str2);
        if (jSONObject2 != null) {
            jSONObject3 = jSONObject2.optJSONObject("android");
        } else {
            jSONObject3 = null;
        }
        if (jSONObject3 != null) {
            str3 = jSONObject3.optString("config");
        } else {
            str3 = null;
        }
        if (str3 == null) {
            str3 = "";
        } else {
            AbstractC19074t.m100205c(str3);
        }
        AbstractC0924m0.m3083Gh(str3);
        if (jSONObject3 != null) {
            str4 = jSONObject3.optString("checksum");
        }
        if (str4 != null) {
            AbstractC19074t.m100205c(str4);
            str5 = str4;
        }
        AbstractC0924m0.m3054Fh(str5);
    }

    /* renamed from: o */
    public final void m137036o() {
        f126350b = AbstractC0924m0.m3707c1();
        f126351c = AbstractC0924m0.m3767e1();
        f126352d = AbstractC0924m0.m3737d1();
        f126353e = AbstractC0924m0.m3797f1();
        f126354f = AbstractC0924m0.m3827g1();
        f126355g = m137025n();
    }
}
