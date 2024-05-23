package ac;

import com.zing.zalo.analytics.ZaloAnalytics;
import fn0.AbstractC19074t;
import org.json.JSONObject;

/* renamed from: ac.i */
/* loaded from: classes.dex */
public final class C0708i {

    /* renamed from: a */
    private final JSONObject f2328a = new JSONObject();

    /* renamed from: a */
    private final void m1070a(String str, Object obj) {
        if (!this.f2328a.has(str) && this.f2328a.length() >= ZaloAnalytics.Companion.m37219b().m37200Q()) {
            return;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            int length = str2.length();
            ZaloAnalytics.C7293b c7293b = ZaloAnalytics.Companion;
            if (length > c7293b.m37219b().m37201R()) {
                obj = str2.substring(0, c7293b.m37219b().m37201R());
                AbstractC19074t.m100207e(obj, "this as java.lang.String…ing(startIndex, endIndex)");
            }
        }
        this.f2328a.put(str, obj);
    }

    /* renamed from: b */
    public final JSONObject m1071b() {
        return this.f2328a;
    }

    /* renamed from: c */
    public final void m1072c(String str, int i11) {
        AbstractC19074t.m100208f(str, "key");
        m1070a(str, Integer.valueOf(i11));
    }

    /* renamed from: d */
    public final void m1073d(String str, long j11) {
        AbstractC19074t.m100208f(str, "key");
        m1070a(str, Long.valueOf(j11));
    }

    /* renamed from: e */
    public final void m1074e(String str, Object obj) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(obj, "value");
        m1075f(str, obj.toString());
    }

    /* renamed from: f */
    public final void m1075f(String str, String str2) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(str2, "value");
        m1070a(str, str2);
    }

    /* renamed from: g */
    public final void m1076g(String str, boolean z11) {
        AbstractC19074t.m100208f(str, "key");
        m1070a(str, Boolean.valueOf(z11));
    }
}
