package th;

import am.AbstractC0924m0;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import pm0.C24848g0;

/* renamed from: th.i */
/* loaded from: classes3.dex */
public final class C26688i {

    /* renamed from: b */
    private static boolean f126428b;

    /* renamed from: c */
    private static boolean f126429c;

    /* renamed from: e */
    private static boolean f126431e;

    /* renamed from: h */
    private static long f126434h;

    /* renamed from: a */
    public static final C26688i f126427a = new C26688i();

    /* renamed from: d */
    private static int f126430d = 3;

    /* renamed from: f */
    private static final C26690k f126432f = new C26690k(false, 0, false, 0, false, 31, null);

    /* renamed from: g */
    private static boolean f126433g = true;

    private C26688i() {
    }

    /* renamed from: f */
    private final void m137066f() {
        boolean z11;
        boolean z12;
        try {
            synchronized (this) {
                if (!f126429c) {
                    String str = CoreUtility.f89233i;
                    if (str != null && str.length() != 0) {
                        boolean z13 = false;
                        if (AbstractC0924m0.m3472U0() > 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        int m3830g4 = AbstractC0924m0.m3830g4();
                        if (m3830g4 < 0) {
                            m3830g4 = 3;
                        }
                        if (AbstractC0924m0.m3501V0() > 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (AbstractC0924m0.m3414S0() > 0) {
                            z13 = true;
                        }
                        int m4277v3 = AbstractC0924m0.m4277v3();
                        if (m4277v3 < 0) {
                            m4277v3 = 200;
                        }
                        C26690k c26690k = f126432f;
                        c26690k.m137123f(z11);
                        c26690k.m137127j(m3830g4);
                        c26690k.m137125h(z12);
                        c26690k.m137126i(m4277v3);
                        c26690k.m137124g(z13);
                        f126429c = true;
                    }
                    return;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: a */
    public final void m137067a() {
        synchronized (this) {
            f126428b = false;
            f126429c = false;
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }

    /* renamed from: b */
    public final long m137068b() {
        m137071e();
        return f126434h;
    }

    /* renamed from: c */
    public final boolean m137069c() {
        return f126433g;
    }

    /* renamed from: d */
    public final C26690k m137070d() {
        m137066f();
        return f126432f;
    }

    /* renamed from: e */
    public final void m137071e() {
        try {
            synchronized (this) {
                try {
                    if (!f126428b) {
                        String str = CoreUtility.f89233i;
                        if (str != null && str.length() != 0) {
                            f126431e = AbstractC0924m0.m2959C9();
                            int m3011E3 = AbstractC0924m0.m3011E3();
                            f126430d = m3011E3;
                            if (m3011E3 <= 0) {
                                f126430d = 3;
                            }
                            f126434h = AbstractC0924m0.m2982D3();
                            f126428b = true;
                        }
                        return;
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } finally {
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: g */
    public final void m137072g(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "config");
        JSONObject optJSONObject = jSONObject.optJSONObject("auto_sync_msg");
        int i11 = 3;
        if (optJSONObject != null) {
            i11 = optJSONObject.optInt("ms_max_page_msg", 3);
        }
        AbstractC0924m0.m3057Fk(i11);
    }

    /* renamed from: h */
    public final void m137073h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "config");
        long optLong = jSONObject.optLong("group_expire_time");
        AbstractC0924m0.m3028Ek(optLong);
        f126434h = optLong;
    }
}
