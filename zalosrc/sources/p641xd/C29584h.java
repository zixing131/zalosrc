package p641xd;

import am.AbstractC0924m0;
import com.zing.zalo.AbstractC8020f0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.concurrent.atomic.AtomicBoolean;
import me0.AbstractC23136l9;
import org.json.JSONObject;
import pm0.C24848g0;
import vg.AbstractC28207v1;
import vg.C28211v5;

/* renamed from: xd.h */
/* loaded from: classes3.dex */
public final class C29584h {

    /* renamed from: b */
    private static JSONObject f136524b;

    /* renamed from: e */
    private static C28211v5 f136527e;

    /* renamed from: f */
    private static C28211v5 f136528f;

    /* renamed from: i */
    private static C28211v5 f136531i;

    /* renamed from: j */
    private static C28211v5 f136532j;

    /* renamed from: a */
    public static final C29584h f136523a = new C29584h();

    /* renamed from: c */
    private static AtomicBoolean f136525c = new AtomicBoolean(false);

    /* renamed from: d */
    private static AtomicBoolean f136526d = new AtomicBoolean(false);

    /* renamed from: g */
    private static String f136529g = "";

    /* renamed from: h */
    private static String f136530h = "";

    /* renamed from: k */
    private static String f136533k = "";

    /* renamed from: l */
    private static String f136534l = "";

    private C29584h() {
    }

    /* renamed from: g */
    private final void m147000g() {
        try {
            String m4360y = AbstractC0924m0.m4360y();
            AbstractC19074t.m100205c(m4360y);
            if (m4360y.length() > 0) {
                f136524b = new JSONObject(m4360y);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        f136525c.set(true);
        f136526d.set(false);
    }

    /* renamed from: h */
    private final void m147001h() {
        C28211v5 c28211v5;
        C28211v5 c28211v52;
        C28211v5 c28211v53;
        m147002i();
        try {
            JSONObject jSONObject = f136524b;
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ba");
                C28211v5 c28211v54 = null;
                if (optJSONObject != null) {
                    AbstractC19074t.m100205c(optJSONObject);
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("text");
                    if (optJSONObject2 != null) {
                        c28211v52 = new C28211v5(optJSONObject2);
                    } else {
                        c28211v52 = null;
                    }
                    f136527e = c28211v52;
                    JSONObject optJSONObject3 = optJSONObject.optJSONObject("cta");
                    if (optJSONObject3 != null) {
                        AbstractC19074t.m100205c(optJSONObject3);
                        JSONObject optJSONObject4 = optJSONObject3.optJSONObject("text");
                        if (optJSONObject4 != null) {
                            c28211v53 = new C28211v5(optJSONObject4);
                        } else {
                            c28211v53 = null;
                        }
                        f136528f = c28211v53;
                        String optString = optJSONObject3.optString("action", "");
                        AbstractC19074t.m100207e(optString, "optString(...)");
                        f136529g = optString;
                        String optString2 = optJSONObject3.optString("action_data", "");
                        AbstractC19074t.m100207e(optString2, "optString(...)");
                        f136530h = optString2;
                    }
                }
                JSONObject optJSONObject5 = jSONObject.optJSONObject("non_ba");
                if (optJSONObject5 != null) {
                    AbstractC19074t.m100205c(optJSONObject5);
                    JSONObject optJSONObject6 = optJSONObject5.optJSONObject("text");
                    if (optJSONObject6 != null) {
                        c28211v5 = new C28211v5(optJSONObject6);
                    } else {
                        c28211v5 = null;
                    }
                    f136531i = c28211v5;
                    JSONObject optJSONObject7 = optJSONObject5.optJSONObject("cta");
                    if (optJSONObject7 != null) {
                        AbstractC19074t.m100205c(optJSONObject7);
                        JSONObject optJSONObject8 = optJSONObject7.optJSONObject("text");
                        if (optJSONObject8 != null) {
                            c28211v54 = new C28211v5(optJSONObject8);
                        }
                        f136532j = c28211v54;
                        String optString3 = optJSONObject7.optString("action", "");
                        AbstractC19074t.m100207e(optString3, "optString(...)");
                        f136533k = optString3;
                        String optString4 = optJSONObject7.optString("action_data", "");
                        AbstractC19074t.m100207e(optString4, "optString(...)");
                        f136534l = optString4;
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        f136526d.set(true);
    }

    /* renamed from: i */
    private final void m147002i() {
        f136527e = null;
        f136528f = null;
        f136529g = "";
        f136530h = "";
        f136531i = null;
        f136532j = null;
        f136533k = "";
        f136534l = "";
    }

    /* renamed from: a */
    public final String m147003a(boolean z11) {
        String str;
        if (z11) {
            str = f136529g;
            if (str.length() == 0) {
                return "action.open.inapp";
            }
        } else {
            str = f136533k;
            if (str.length() == 0) {
                return "action.open.inapp";
            }
        }
        return str;
    }

    /* renamed from: b */
    public final String m147004b(boolean z11) {
        String str;
        if (z11) {
            str = f136530h;
            if (str.length() == 0) {
                return "https://zalo.me/lienhe.html";
            }
        } else {
            str = f136534l;
            if (str.length() == 0) {
                return "https://zalo.me/lienhe.html";
            }
        }
        return str;
    }

    /* renamed from: c */
    public final String m147005c(boolean z11) {
        String c28211v5;
        String c28211v52;
        if (z11) {
            C28211v5 c28211v53 = f136528f;
            if (c28211v53 == null || (c28211v52 = c28211v53.toString()) == null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            }
            return c28211v52;
        }
        C28211v5 c28211v54 = f136532j;
        if (c28211v54 == null || (c28211v5 = c28211v54.toString()) == null) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_learn_more);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        return c28211v5;
    }

    /* renamed from: d */
    public final C29584h m147006d() {
        if (!f136525c.get()) {
            m147000g();
        }
        if (!f136526d.get()) {
            m147001h();
        }
        return this;
    }

    /* renamed from: e */
    public final String m147007e(boolean z11) {
        String c28211v5;
        String c28211v52;
        if (z11) {
            C28211v5 c28211v53 = f136527e;
            if (c28211v53 == null || (c28211v52 = c28211v53.toString()) == null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_block_reply_stranger_cannot_chat_ba_text);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                return m118743r0;
            }
            return c28211v52;
        }
        C28211v5 c28211v54 = f136531i;
        if (c28211v54 == null || (c28211v5 = c28211v54.toString()) == null) {
            String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_block_reply_stranger_cannot_chat_non_ba_text);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
            return m118743r02;
        }
        return c28211v5;
    }

    /* renamed from: f */
    public final boolean m147008f() {
        if (f136525c.get() && f136526d.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void m147009j(JSONObject jSONObject) {
        C24848g0 c24848g0;
        f136524b = jSONObject;
        f136525c.set(true);
        f136526d.set(false);
        JSONObject jSONObject2 = f136524b;
        if (jSONObject2 != null) {
            AbstractC0924m0.m3840ge(String.valueOf(jSONObject2));
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            AbstractC0924m0.m3840ge("");
        }
    }

    /* renamed from: k */
    public final boolean m147010k(boolean z11) {
        if (m147005c(z11).length() > 0 && m147003a(z11).length() > 0 && AbstractC28207v1.m141992i1(m147003a(z11))) {
            return true;
        }
        return false;
    }
}
