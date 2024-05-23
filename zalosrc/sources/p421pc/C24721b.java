package p421pc;

import ho0.AbstractC20110a;
import org.json.JSONObject;

/* renamed from: pc.b */
/* loaded from: classes3.dex */
public final class C24721b {

    /* renamed from: a */
    public static final C24721b f118742a = new C24721b();

    /* renamed from: b */
    private static int f118743b = 1;

    /* renamed from: c */
    private static long f118744c = 604800;

    /* renamed from: d */
    private static long f118745d = 259200;

    /* renamed from: e */
    private static int f118746e = 1;

    /* renamed from: f */
    private static int f118747f = 1;

    private C24721b() {
    }

    /* renamed from: a */
    public final long m128436a() {
        return f118745d;
    }

    /* renamed from: b */
    public final int m128437b() {
        return f118747f;
    }

    /* renamed from: c */
    public final boolean m128438c() {
        return f118743b == 1;
    }

    /* renamed from: d */
    public final boolean m128439d() {
        return f118746e == 1;
    }

    /* renamed from: e */
    public final void m128440e(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    m128441f(new JSONObject(str));
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    /* renamed from: f */
    public final void m128441f(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                f118743b = jSONObject.optInt("enable", 1);
                f118744c = jSONObject.optLong("timeout", 604800L);
                f118745d = jSONObject.optLong("icon_delay", 259200L);
                f118746e = jSONObject.optInt("cancel_button", 1);
                f118747f = jSONObject.optInt("icon_type", 1);
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }
}
