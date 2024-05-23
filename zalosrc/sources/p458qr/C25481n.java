package p458qr;

import ac.C0708i;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Map;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONObject;

/* renamed from: qr.n */
/* loaded from: classes4.dex */
public final class C25481n {

    /* renamed from: a */
    public static final C25481n f122071a = new C25481n();

    /* renamed from: b */
    private static final Map f122072b = new HashMap();

    /* renamed from: c */
    private static final Map f122073c = new HashMap();

    /* renamed from: d */
    private static final String f122074d = "SocialPerfLogger";

    private C25481n() {
    }

    /* renamed from: a */
    private final long m131968a() {
        return System.currentTimeMillis();
    }

    /* renamed from: c */
    private final String m131969c(C0708i c0708i, C0708i c0708i2) {
        String str;
        JSONObject m1071b;
        String jSONObject;
        JSONObject m1071b2;
        String str2 = "";
        if (c0708i == null || (m1071b2 = c0708i.m1071b()) == null || (str = m1071b2.toString()) == null) {
            str = "";
        }
        if (c0708i2 != null && (m1071b = c0708i2.m1071b()) != null && (jSONObject = m1071b.toString()) != null) {
            str2 = jSONObject;
        }
        return str + "_" + str2;
    }

    /* renamed from: d */
    private final String m131970d(String str, String str2) {
        String str3;
        if (str2.length() > 0) {
            str3 = "_" + str2;
        } else {
            str3 = "";
        }
        return str + str3;
    }

    /* renamed from: f */
    private final void m131971f(String str, String str2, long j11, long j12, String str3) {
        AbstractC20110a.f98889a.m104564x("SOCIAL_PERFORMANCE").mo104556o(8, "Task [" + str + "][" + str2 + "] finished: Start at [" + AbstractC23160o0.m119279p0(j11) + "], duration " + j12 + " ms, extra data: " + str3, new Object[0]);
    }

    /* renamed from: b */
    public final void m131972b(String str, String str2, C0708i c0708i) {
        Long l11;
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "subId");
        try {
            try {
                l11 = (Long) f122072b.remove(m131970d(str, str2));
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f122074d, e11);
            }
            if (l11 != null) {
                long longValue = l11.longValue();
                long m131968a = m131968a() - longValue;
                if (m131968a > 0) {
                    m131971f(str, str2, longValue, m131968a, m131969c((C0708i) f122073c.get(str), c0708i));
                }
            }
        } finally {
            f122073c.remove(str);
        }
    }

    /* renamed from: e */
    public final void m131973e(String str, String str2, C0708i c0708i) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "subId");
        try {
            f122072b.put(m131970d(str, str2), Long.valueOf(m131968a()));
            if (c0708i != null) {
                f122073c.put(str, c0708i);
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f(f122074d, e11);
        }
    }
}
