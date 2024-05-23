package o00;

import ai.C0862b;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import com.zing.zalo.control.ContactProfile;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.List;
import me0.AbstractC23217t2;
import mm0.AbstractC23350e;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.C21927m;
import p461qu.AbstractC25495a;
import pm0.C24848g0;

/* renamed from: o00.b */
/* loaded from: classes4.dex */
public final class C23976b {

    /* renamed from: a */
    public static final C23976b f116043a = new C23976b();

    private C23976b() {
    }

    /* renamed from: a */
    public final ContactProfile m125472a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "<this>");
        try {
            ContactProfile contactProfile = new ContactProfile(jSONObject.getString("uid"));
            contactProfile.f42437s = jSONObject.optString("name");
            contactProfile.f42446v = jSONObject.optString("avt");
            contactProfile.f42436r1 = new SpannableStringBuilder(jSONObject.optString("desc"));
            contactProfile.f42352K0 = jSONObject.optInt("type_contact");
            contactProfile.f42370Q0 = jSONObject.optBoolean("is_ads");
            JSONObject optJSONObject = jSONObject.optJSONObject("ads_info");
            if (optJSONObject != null) {
                AbstractC19074t.m100205c(optJSONObject);
                contactProfile.f42350J1 = optJSONObject.optInt("campid");
                contactProfile.f42376S0 = optJSONObject.optInt("srcidx");
                contactProfile.f42422m0 = optJSONObject.optString("distribute_id");
            }
            contactProfile.f42365O1 = jSONObject.optInt("typeBonusSearch");
            return contactProfile;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: b */
    public final C0862b m125473b(JSONObject jSONObject) {
        String[] strArr;
        AbstractC19074t.m100208f(jSONObject, "<this>");
        try {
            String string = jSONObject.getString("mpUrl");
            JSONObject jSONObject2 = jSONObject.getJSONObject("mpInfo");
            String string2 = jSONObject2.getString("appId");
            String string3 = jSONObject2.getString("appName");
            JSONArray optJSONArray = jSONObject2.optJSONArray("appFeatureImages");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                strArr = new String[length];
                for (int i11 = 0; i11 < length; i11++) {
                    String optString = optJSONArray.optString(i11);
                    AbstractC19074t.m100207e(optString, "optString(...)");
                    strArr[i11] = optString;
                }
            } else {
                strArr = new String[0];
            }
            String optString2 = jSONObject2.optString("appAvtUrl");
            String optString3 = jSONObject2.optString("appVersion");
            String optString4 = jSONObject2.optString("appDesc");
            AbstractC19074t.m100205c(string2);
            AbstractC19074t.m100205c(string);
            AbstractC19074t.m100205c(string3);
            AbstractC19074t.m100205c(optString2);
            AbstractC19074t.m100205c(optString3);
            AbstractC19074t.m100205c(optString4);
            C0862b c0862b = new C0862b(string2, string, string3, optString2, optString3, strArr, optString4, jSONObject);
            c0862b.mo2484j(jSONObject.optInt("typeBonusSearch"));
            return c0862b;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return null;
        }
    }

    /* renamed from: c */
    public final JSONObject m125474c(C0862b c0862b) {
        AbstractC19074t.m100208f(c0862b, "<this>");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mpUrl", c0862b.m2490p());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("appVersion", c0862b.m2491q());
            jSONObject2.put("appName", c0862b.m2489o());
            jSONObject2.put("appId", c0862b.m2487m());
            jSONObject2.put("appDesc", c0862b.m2485k());
            jSONObject2.put("appAvtUrl", c0862b.m2477a());
            jSONObject2.put("appFeatureImages", new JSONArray(c0862b.m2486l()));
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("mpInfo", jSONObject2);
            jSONObject.put("typeBonusSearch", c0862b.mo2481g());
            if (c0862b.m2489o() instanceof Spanned) {
                List m119656h = AbstractC23217t2.m119656h((Spanned) c0862b.m2489o());
                AbstractC19074t.m100205c(m119656h);
                if (!m119656h.isEmpty()) {
                    jSONObject.put("name_highlight_data", new JSONArray((Collection) m119656h));
                }
            }
            if (c0862b.m2485k() instanceof Spanned) {
                List m119656h2 = AbstractC23217t2.m119656h((Spanned) c0862b.m2485k());
                AbstractC19074t.m100205c(m119656h2);
                if (!m119656h2.isEmpty()) {
                    jSONObject.put("desc_highlight_data", new JSONArray((Collection) m119656h2));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }

    /* renamed from: d */
    public final JSONObject m125475d(ContactProfile contactProfile) {
        String str;
        CharSequence m127168X0;
        AbstractC19074t.m100208f(contactProfile, "<this>");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", contactProfile.mo2478b());
            boolean z11 = false;
            String m40383Q = contactProfile.m40383Q(true, false);
            if (m40383Q != null) {
                AbstractC19074t.m100205c(m40383Q);
                m127168X0 = AbstractC24342w.m127168X0(m40383Q);
                str = m127168X0.toString();
            } else {
                str = null;
            }
            jSONObject.put("name", str);
            jSONObject.put("avt", contactProfile.f42446v);
            jSONObject.put("desc", contactProfile.f42436r1);
            jSONObject.put("is_follow", C21927m.m114302u().m114322U(contactProfile.f42434r));
            if (contactProfile.m40359B0() || AbstractC25495a.m132086k(contactProfile.f42434r)) {
                z11 = true;
            }
            jSONObject.put("is_verified", z11);
            jSONObject.put("is_ads", contactProfile.f42370Q0);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("campid", contactProfile.f42350J1);
            jSONObject2.put("srcidx", contactProfile.f42376S0);
            jSONObject2.put("distribute_id", contactProfile.f42422m0);
            C24848g0 c24848g0 = C24848g0.f119245a;
            jSONObject.put("ads_info", jSONObject2);
            jSONObject.put("typeBonusSearch", contactProfile.f42365O1);
            jSONObject.put("type_contact", contactProfile.f42352K0);
            AbstractC19074t.m100207e(contactProfile.f42399a1, "arrPosToHighlight");
            if (!r1.isEmpty()) {
                jSONObject.put("name_highlight_data", new JSONArray((Collection) contactProfile.f42399a1));
            }
            List m119656h = AbstractC23217t2.m119656h(contactProfile.f42436r1);
            AbstractC19074t.m100205c(m119656h);
            if (!m119656h.isEmpty()) {
                jSONObject.put("desc_highlight_data", new JSONArray((Collection) m119656h));
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return jSONObject;
    }
}
