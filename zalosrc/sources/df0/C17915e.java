package df0;

import ag0.C0815e1;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;
import p361nb.C23648e;

/* renamed from: df0.e */
/* loaded from: classes4.dex */
public final class C17915e {

    /* renamed from: a */
    public static final C17915e f90453a = new C17915e();

    private C17915e() {
    }

    /* renamed from: a */
    private final String m94513a(int i11) {
        return i11 == 68 ? "csc_msgmenu" : "";
    }

    /* renamed from: b */
    public final void m94514b(String str, int i11) {
        String str2;
        AbstractC19074t.m100208f(str, "chatType");
        if (i11 == 68) {
            str2 = "voice_to_text_e2ee_select";
        } else {
            str2 = "";
        }
        try {
            C0815e1.m2075D().m2100V(new C23648e(i11, m94513a(i11), 0, str2, str), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m94515c(String str, int i11) {
        String str2;
        AbstractC19074t.m100208f(str, "chatType");
        if (i11 == 68) {
            str2 = "voice_to_text_e2ee_permission";
        } else {
            str2 = "";
        }
        try {
            C0815e1.m2075D().m2100V(new C23648e(i11, m94513a(i11), 1, str2, str), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    public final void m94516d(String str, int i11) {
        String str2;
        AbstractC19074t.m100208f(str, "chatType");
        if (i11 == 68) {
            str2 = "voice_to_text_e2ee_find_more";
        } else {
            str2 = "";
        }
        try {
            C0815e1.m2075D().m2100V(new C23648e(i11, m94513a(i11), 0, str2, str), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: e */
    public final void m94517e(String str, boolean z11, boolean z12) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ZinstantMetaConstant.IMPRESSION_META_TYPE, z11 ? 1 : 0);
            jSONObject.put("csc", z12 ? 1 : 0);
            String m94513a = m94513a(16);
            String[] strArr = new String[2];
            if (str == null) {
                str = "0";
            }
            strArr[0] = str;
            strArr[1] = jSONObject.toString();
            C0815e1.m2075D().m2100V(new C23648e(16, m94513a, 0, "speech_to_text_toggle", strArr), false);
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
