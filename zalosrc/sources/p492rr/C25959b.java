package p492rr;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import me0.AbstractC23148n;
import org.json.JSONObject;
import p111du.AbstractC18069a;

/* renamed from: rr.b */
/* loaded from: classes4.dex */
public final class C25959b {

    /* renamed from: a */
    public static final C25959b f123885a;

    /* renamed from: b */
    private static int f123886b;

    /* renamed from: c */
    private static long f123887c;

    static {
        C25959b c25959b = new C25959b();
        f123885a = c25959b;
        f123887c = -1L;
        c25959b.m133735e();
    }

    private C25959b() {
    }

    /* renamed from: d */
    private final void m133730d(JSONObject jSONObject) {
        try {
            f123886b = AbstractC18069a.m96085d(jSONObject, "value");
            f123887c = AbstractC18069a.m96087f(jSONObject, "ts");
        } catch (Exception e11) {
            e11.printStackTrace();
            m133731f();
        }
    }

    /* renamed from: f */
    private final void m133731f() {
        f123886b = 0;
        f123887c = -1L;
    }

    /* renamed from: a */
    public final long m133732a() {
        return f123887c;
    }

    /* renamed from: b */
    public final int m133733b() {
        return f123886b;
    }

    /* renamed from: c */
    public final void m133734c(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        m133730d(jSONObject);
    }

    /* renamed from: e */
    public final void m133735e() {
        String m4070o4 = AbstractC0924m0.m4070o4();
        AbstractC19074t.m100205c(m4070o4);
        if (m4070o4.length() > 0) {
            m133734c(new JSONObject(m4070o4));
        }
    }

    /* renamed from: g */
    public final void m133736g() {
        AbstractC23148n.m118849w(m133739j().toString());
    }

    /* renamed from: h */
    public final void m133737h(long j11) {
        f123887c = j11;
    }

    /* renamed from: i */
    public final void m133738i(int i11) {
        f123886b = i11;
    }

    /* renamed from: j */
    public final JSONObject m133739j() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("value", f123886b);
        jSONObject.put("ts", f123887c);
        return jSONObject;
    }
}
