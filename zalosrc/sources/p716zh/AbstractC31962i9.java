package p716zh;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import nh0.C23793c;
import org.json.JSONArray;
import org.json.JSONObject;
import p227i3.C20219w;
import p471r3.C25630b;
import p588vw.C28644j;
import p647xj.C29678d;
import p647xj.C29679e;
import p667y2.C30271h;

/* renamed from: zh.i9 */
/* loaded from: classes3.dex */
public abstract class AbstractC31962i9 {
    /* renamed from: a */
    public static final C31947h9 m153675a(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "<this>");
        String optString = jSONObject.optString("title", "");
        AbstractC19074t.m100207e(optString, "optString(...)");
        String optString2 = jSONObject.optString("desc", "");
        AbstractC19074t.m100207e(optString2, "optString(...)");
        String optString3 = jSONObject.optString("bannerUrl", "");
        AbstractC19074t.m100207e(optString3, "optString(...)");
        long optLong = jSONObject.optLong("startedTime", 0L);
        long optLong2 = jSONObject.optLong("endTime", 0L);
        String optString4 = jSONObject.optString("showCase", "");
        AbstractC19074t.m100207e(optString4, "optString(...)");
        String optString5 = jSONObject.optString("seasonalId", "");
        AbstractC19074t.m100207e(optString5, "optString(...)");
        String optString6 = jSONObject.optString("iconUrl", "");
        AbstractC19074t.m100207e(optString6, "optString(...)");
        return new C31947h9(optString, optString2, optString3, optLong, optLong2, optString4, optString5, optString6, m153676b(jSONObject), m153679e(jSONObject.optJSONObject("conditionGroup")), m153680f(jSONObject.optJSONObject("conditionChat")));
    }

    /* renamed from: b */
    private static final List m153676b(JSONObject jSONObject) {
        int i11;
        int i12;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("stickers");
        if (optJSONArray != null) {
            AbstractC19074t.m100205c(optJSONArray);
            int length = optJSONArray.length();
            for (int i13 = 0; i13 < length; i13++) {
                try {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i13);
                    String string = jSONObject2.getString(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                    AbstractC19074t.m100207e(string, "getString(...)");
                    int parseInt = Integer.parseInt(string);
                    String string2 = jSONObject2.getString("catId");
                    AbstractC19074t.m100207e(string2, "getString(...)");
                    int parseInt2 = Integer.parseInt(string2);
                    String string3 = jSONObject2.getString("id");
                    AbstractC19074t.m100207e(string3, "getString(...)");
                    int parseInt3 = Integer.parseInt(string3);
                    int optInt = jSONObject2.optInt("subtype", 0);
                    String optString = jSONObject2.optString("thumb", "");
                    JSONObject optJSONObject = jSONObject2.optJSONObject("dimension");
                    if (optJSONObject != null) {
                        i11 = optJSONObject.optInt(C20219w.f100062c, 0);
                    } else {
                        i11 = 0;
                    }
                    if (optJSONObject != null) {
                        i12 = optJSONObject.optInt(C30271h.f140642d, 0);
                    } else {
                        i12 = 0;
                    }
                    C25630b c25630b = new C25630b();
                    c25630b.m132404N(parseInt2);
                    c25630b.m132414X(parseInt2);
                    c25630b.m132410T(parseInt);
                    c25630b.m132405O(parseInt3);
                    String m143232X = C28644j.m143232X();
                    AbstractC19074t.m100207e(m143232X, "getDomainStickerUrl(...)");
                    c25630b.m132419b(m143232X, C28644j.m143248i0());
                    c25630b.m132420b0(optInt);
                    AbstractC19074t.m100205c(optString);
                    c25630b.m132424d0(optString);
                    c25630b.m132422c0(i11, i12);
                    arrayList.add(c25630b);
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final C31947h9 m153677c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "json");
        return m153675a(jSONObject);
    }

    /* renamed from: d */
    public static final boolean m153678d(C31947h9 c31947h9) {
        AbstractC19074t.m100208f(c31947h9, "seasonalStickerInfo");
        if (c31947h9.m153585g() <= 0 || c31947h9.m153580b() <= 0 || c31947h9.m153585g() > c31947h9.m153580b()) {
            return false;
        }
        long mo124311f = C23793c.Companion.m124321a().mo124311f();
        long m153585g = c31947h9.m153585g();
        if (mo124311f > c31947h9.m153580b() || m153585g > mo124311f) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static final C29678d m153679e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C29678d c29678d = new C29678d();
        try {
            boolean z11 = true;
            if (jSONObject.has("isgroup")) {
                if (jSONObject.optInt("isgroup", 0) != 1) {
                    z11 = false;
                }
                c29678d.f137108a = z11;
            } else {
                c29678d.f137108a = true;
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return c29678d;
    }

    /* renamed from: f */
    private static final C29679e m153680f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C29679e c29679e = new C29679e();
        try {
            if (jSONObject.has("chatgender")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("chatgender");
                if (optJSONArray != null) {
                    c29679e.f137109a = new int[optJSONArray.length()];
                    int length = optJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        c29679e.f137109a[i11] = optJSONArray.getInt(i11);
                    }
                }
            } else {
                c29679e.f137109a = new int[]{0, 1, 2, 3};
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        return c29679e;
    }
}
