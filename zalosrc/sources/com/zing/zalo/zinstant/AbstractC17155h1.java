package com.zing.zalo.zinstant;

import ag0.C0815e1;
import com.zing.zalo.zinstant.zom.properties.ZOMInsight;
import nh0.C23793c;
import org.json.JSONObject;
import p604wb.C28905e;

/* renamed from: com.zing.zalo.zinstant.h1 */
/* loaded from: classes7.dex */
public abstract class AbstractC17155h1 {
    /* renamed from: a */
    private static void m91734a(int i11, String str, String str2, ZOMInsight zOMInsight) {
        JSONObject valueJson = zOMInsight.getValueJson();
        String optString = valueJson.optString("campaignId");
        int optInt = valueJson.optInt("contentType", -1);
        int optInt2 = valueJson.optInt("sourceIndex", -1);
        JSONObject optJSONObject = valueJson.optJSONObject("params");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        optJSONObject.put("zinstantDataId", str);
        optJSONObject.put("category", zOMInsight.mCategory);
        optJSONObject.put("label", zOMInsight.mLabel);
        C28905e.m144373n().m144398t(optString, i11, optInt, str2, optInt2, C23793c.m124316k().mo124311f(), optJSONObject.toString());
    }

    /* renamed from: b */
    public static void m91735b(int i11, String str, String str2, ZOMInsight zOMInsight) {
        String str3;
        String str4;
        String str5;
        int i12;
        if (zOMInsight != null && (i12 = zOMInsight.mProtocol) != 0) {
            if (i12 == 1) {
                m91734a(20, str, str2, zOMInsight);
                return;
            }
            return;
        }
        C0815e1 m2075D = C0815e1.m2075D();
        if (zOMInsight == null) {
            str3 = null;
        } else {
            str3 = zOMInsight.mCategory;
        }
        if (zOMInsight == null) {
            str4 = null;
        } else {
            str4 = zOMInsight.mLabel;
        }
        if (zOMInsight == null) {
            str5 = null;
        } else {
            str5 = zOMInsight.mValue;
        }
        m2075D.m2104Z(5, 1, i11, str, str2, str3, str4, str5);
    }

    /* renamed from: c */
    public static void m91736c(int i11, String str, String str2, ZOMInsight zOMInsight) {
        String str3;
        String str4;
        String str5;
        int i12;
        if (zOMInsight != null && (i12 = zOMInsight.mProtocol) != 0) {
            if (i12 != 1) {
                return;
            } else {
                throw new Exception("Long click tracking isn't supported");
            }
        }
        C0815e1 m2075D = C0815e1.m2075D();
        if (zOMInsight == null) {
            str3 = null;
        } else {
            str3 = zOMInsight.mCategory;
        }
        if (zOMInsight == null) {
            str4 = null;
        } else {
            str4 = zOMInsight.mLabel;
        }
        if (zOMInsight == null) {
            str5 = null;
        } else {
            str5 = zOMInsight.mValue;
        }
        m2075D.m2104Z(5, 2, i11, str, str2, str3, str4, str5);
    }

    /* renamed from: d */
    public static void m91737d(int i11, String str) {
        C0815e1.m2075D().m2104Z(5, 6, i11, str, null, null, null, null);
    }

    /* renamed from: e */
    public static void m91738e(int i11, String str, String str2, ZOMInsight zOMInsight) {
        String str3;
        String str4;
        String str5;
        int i12;
        if (zOMInsight != null && (i12 = zOMInsight.mProtocol) != 0) {
            if (i12 == 1) {
                m91734a(10, str, str2, zOMInsight);
                return;
            }
            return;
        }
        C0815e1 m2075D = C0815e1.m2075D();
        if (zOMInsight == null) {
            str3 = null;
        } else {
            str3 = zOMInsight.mCategory;
        }
        if (zOMInsight == null) {
            str4 = null;
        } else {
            str4 = zOMInsight.mLabel;
        }
        if (zOMInsight == null) {
            str5 = null;
        } else {
            str5 = zOMInsight.mValue;
        }
        m2075D.m2104Z(5, 4, i11, str, str2, str3, str4, str5);
    }

    /* renamed from: f */
    public static void m91739f(int i11, String str, long j11) {
        C0815e1.m2075D().m2104Z(5, 8, i11, str, String.valueOf(j11), null, null, null);
    }
}
