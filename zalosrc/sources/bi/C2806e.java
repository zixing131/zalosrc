package bi;

import fn0.AbstractC19074t;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* renamed from: bi.e */
/* loaded from: classes3.dex */
public final class C2806e {

    /* renamed from: a */
    public static final C2806e f11255a;

    /* renamed from: b */
    private static long f11256b;

    /* renamed from: c */
    private static long f11257c;

    /* renamed from: d */
    private static long f11258d;

    /* renamed from: e */
    private static int f11259e;

    /* renamed from: f */
    private static int f11260f;

    /* renamed from: g */
    private static int f11261g;

    /* renamed from: h */
    private static int f11262h;

    /* renamed from: i */
    private static boolean f11263i;

    static {
        C2806e c2806e = new C2806e();
        f11255a = c2806e;
        f11261g = -1;
        f11262h = -1;
        String m122455u4 = AbstractC23309i.m122455u4();
        if (m122455u4 != null && m122455u4.length() > 0) {
            c2806e.m13584i(m122455u4);
        }
        AbstractC19074t.m100205c(m122455u4);
        if (m122455u4.length() > 0 && f11261g == -1) {
            f11261g = f11260f;
        }
    }

    private C2806e() {
    }

    /* renamed from: a */
    public final long m13576a() {
        return f11258d;
    }

    /* renamed from: b */
    public final int m13577b() {
        return f11261g;
    }

    /* renamed from: c */
    public final long m13578c() {
        return f11256b;
    }

    /* renamed from: d */
    public final boolean m13579d() {
        return f11263i;
    }

    /* renamed from: e */
    public final int m13580e() {
        return f11259e;
    }

    /* renamed from: f */
    public final int m13581f() {
        return f11262h;
    }

    /* renamed from: g */
    public final int m13582g() {
        return f11260f;
    }

    /* renamed from: h */
    public final void m13583h(JSONObject jSONObject) {
        AbstractC19074t.m100208f(jSONObject, "jsonObject");
        try {
            f11256b = jSONObject.optLong("expireTime");
            long optLong = jSONObject.optLong("lastInviteTime");
            f11257c = optLong;
            if (f11258d == 0) {
                f11258d = optLong;
            }
            f11259e = jSONObject.optInt("lastGroupId");
            int optInt = jSONObject.optInt("total");
            f11260f = optInt;
            if (f11261g == -1) {
                f11261g = optInt;
            }
            f11263i = jSONObject.optBoolean("isHasMore");
            f11262h = jSONObject.optInt("page");
            AbstractC23309i.m121168Lo(f11255a.m13591p().toString());
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: i */
    public final void m13584i(String str) {
        AbstractC19074t.m100208f(str, "stringObject");
        try {
            if (str.length() == 0) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            f11256b = jSONObject.optLong("expireTime");
            f11257c = jSONObject.optLong("lastInviteTime");
            f11258d = jSONObject.optLong("displayLastInviteTime");
            f11259e = jSONObject.optInt("lastGroupId");
            f11260f = jSONObject.optInt("total");
            f11261g = jSONObject.optInt("displayTotal");
            f11263i = jSONObject.optBoolean("isHasMore");
            f11262h = jSONObject.optInt("page");
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
    }

    /* renamed from: j */
    public final void m13585j(long j11) {
        f11258d = j11;
    }

    /* renamed from: k */
    public final void m13586k(int i11) {
        f11261g = i11;
    }

    /* renamed from: l */
    public final void m13587l(boolean z11) {
        f11263i = z11;
    }

    /* renamed from: m */
    public final void m13588m(long j11) {
        f11257c = j11;
    }

    /* renamed from: n */
    public final void m13589n(int i11) {
        f11262h = i11;
    }

    /* renamed from: o */
    public final void m13590o(int i11) {
        f11260f = i11;
    }

    /* renamed from: p */
    public final JSONObject m13591p() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("expireTime", f11256b);
        jSONObject.put("lastInviteTime", f11257c);
        jSONObject.put("displayLastInviteTime", f11258d);
        jSONObject.put("lastGroupId", f11259e);
        jSONObject.put("total", f11260f);
        jSONObject.put("displayTotal", f11261g);
        jSONObject.put("isHasMore", f11263i);
        jSONObject.put("page", f11262h);
        return jSONObject;
    }
}
