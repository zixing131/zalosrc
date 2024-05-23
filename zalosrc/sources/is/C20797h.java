package is;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: is.h */
/* loaded from: classes4.dex */
public final class C20797h {

    /* renamed from: a */
    public static final C20797h f102195a;

    /* renamed from: b */
    private static boolean f102196b;

    static {
        C20797h c20797h = new C20797h();
        f102195a = c20797h;
        f102196b = true;
        String m3676b0 = AbstractC0924m0.m3676b0();
        if (m3676b0 == null) {
            m3676b0 = "";
        }
        c20797h.m108526b(m3676b0);
    }

    private C20797h() {
    }

    /* renamed from: a */
    public final boolean m108525a() {
        return f102196b;
    }

    /* renamed from: b */
    public final void m108526b(String str) {
        AbstractC19074t.m100208f(str, "str");
        try {
            if (str.length() > 0) {
                m108527c(new JSONObject(str));
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: c */
    public final void m108527c(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            boolean z11 = true;
            if (jSONObject.optInt("enable_tabmore", 1) != 1) {
                z11 = false;
            }
            f102196b = z11;
            AbstractC0924m0.m3225Le(jSONObject.toString());
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }
}
