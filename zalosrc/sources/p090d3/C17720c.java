package p090d3;

import com.adtima.Adtima;
import org.json.JSONObject;
import p009a3.C0098c;
import p148f3.C18711c;

/* renamed from: d3.c */
/* loaded from: classes2.dex */
public final class C17720c {

    /* renamed from: c */
    private static final String f89807c = "c";

    /* renamed from: a */
    public C0098c f89808a = null;

    /* renamed from: b */
    public C18711c f89809b = null;

    /* renamed from: a */
    public JSONObject m93795a() {
        Exception e11;
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e12) {
            e11 = e12;
            jSONObject = null;
        }
        try {
            try {
                C0098c c0098c = this.f89808a;
                if (c0098c != null) {
                    jSONObject.put("adsInfo", c0098c.m446i());
                }
            } catch (Exception e13) {
                Adtima.m18329e(f89807c, "serialize", e13);
            }
            try {
                C18711c c18711c = this.f89809b;
                if (c18711c != null) {
                    jSONObject.put("adsRender", c18711c.m98682c());
                }
            } catch (Exception e14) {
                Adtima.m18329e(f89807c, "serialize", e14);
            }
        } catch (Exception e15) {
            e11 = e15;
            Adtima.m18329e(f89807c, "serialize", e11);
            return jSONObject;
        }
        return jSONObject;
    }
}
