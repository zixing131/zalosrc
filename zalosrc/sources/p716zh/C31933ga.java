package p716zh;

import am.AbstractC0924m0;
import c30.C3245i;
import fn0.AbstractC19074t;
import nh0.InterfaceC23792b;
import org.json.JSONObject;
import p348mi.AbstractC23306f;
import y90.EnumC30858b;
import y90.EnumC30859c;

/* renamed from: zh.ga */
/* loaded from: classes3.dex */
public final class C31933ga {

    /* renamed from: a */
    public static final C31933ga f146718a;

    /* renamed from: b */
    private static int f146719b;

    /* renamed from: c */
    private static int f146720c;

    /* renamed from: d */
    private static int f146721d;

    /* renamed from: e */
    private static C3245i f146722e;

    /* renamed from: f */
    private static long f146723f;

    /* renamed from: g */
    private static int f146724g;

    /* renamed from: h */
    private static int f146725h;

    /* renamed from: i */
    private static EnumC30858b f146726i;

    /* renamed from: j */
    private static EnumC30859c f146727j;

    /* renamed from: k */
    private static final InterfaceC23792b f146728k;

    static {
        C31933ga c31933ga = new C31933ga();
        f146718a = c31933ga;
        f146719b = 2;
        f146724g = -1;
        f146725h = -1;
        f146726i = EnumC30858b.f142392p;
        f146727j = EnumC30859c.f142396p;
        InterfaceC23792b m120579F1 = AbstractC23306f.m120579F1();
        AbstractC19074t.m100207e(m120579F1, "provideTimeProvider(...)");
        f146728k = m120579F1;
        c31933ga.m153459j();
    }

    private C31933ga() {
    }

    /* renamed from: i */
    private final void m153458i() {
        f146719b = 2;
        f146720c = -2;
        f146723f = -1L;
        f146724g = -1;
    }

    /* renamed from: j */
    private final void m153459j() {
        try {
            String m3503V2 = AbstractC0924m0.m3503V2();
            if (m3503V2 != null && m3503V2.length() > 0) {
                JSONObject jSONObject = new JSONObject(m3503V2);
                f146719b = jSONObject.optInt("tab_type", 2);
                f146720c = jSONObject.optInt("cate_id", -2);
                f146721d = jSONObject.optInt("last_emoji_system_id", 0);
                f146723f = jSONObject.optLong("last_selected_time", -1L);
            } else {
                m153458i();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            m153458i();
        }
    }

    /* renamed from: a */
    public final int m153460a() {
        return f146724g;
    }

    /* renamed from: b */
    public final EnumC30858b m153461b() {
        return f146726i;
    }

    /* renamed from: c */
    public final int m153462c() {
        return f146725h;
    }

    /* renamed from: d */
    public final EnumC30859c m153463d() {
        return f146727j;
    }

    /* renamed from: e */
    public final int m153464e() {
        return f146719b;
    }

    /* renamed from: f */
    public final int m153465f() {
        return f146721d;
    }

    /* renamed from: g */
    public final long m153466g() {
        return f146723f;
    }

    /* renamed from: h */
    public final int m153467h() {
        return f146720c;
    }

    /* renamed from: k */
    public final void m153468k(int i11) {
        f146721d = i11;
    }

    /* renamed from: l */
    public final void m153469l(int i11) {
        f146719b = 1;
        if (i11 == 250) {
            f146723f = f146728k.mo124314i();
        }
    }

    /* renamed from: m */
    public final void m153470m(int i11) {
        f146719b = 4;
        if (i11 == 250) {
            f146723f = f146728k.mo124314i();
        }
    }

    /* renamed from: n */
    public final void m153471n(C3245i c3245i, int i11) {
        int i12;
        f146719b = 2;
        if (c3245i != null) {
            i12 = c3245i.f13854b;
        } else {
            i12 = -2;
        }
        f146720c = i12;
        f146722e = c3245i;
        if (i11 == 250) {
            f146723f = f146728k.mo124314i();
        }
    }

    /* renamed from: o */
    public final void m153472o(int i11) {
        f146719b = 5;
        if (i11 == 250) {
            f146723f = f146728k.mo124314i();
        }
    }

    /* renamed from: p */
    public final void m153473p() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tab_type", f146719b);
            jSONObject.put("cate_id", f146720c);
            jSONObject.put("last_selected_time", f146723f);
            jSONObject.put("last_emoji_system_id", f146721d);
            AbstractC0924m0.m3462Tj(jSONObject.toString());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q */
    public final void m153474q(int i11) {
        f146724g = i11;
    }

    /* renamed from: r */
    public final void m153475r(EnumC30858b enumC30858b) {
        AbstractC19074t.m100208f(enumC30858b, "<set-?>");
        f146726i = enumC30858b;
    }

    /* renamed from: s */
    public final void m153476s(int i11) {
        f146725h = i11;
    }

    /* renamed from: t */
    public final void m153477t(EnumC30859c enumC30859c) {
        AbstractC19074t.m100208f(enumC30859c, "<set-?>");
        f146727j = enumC30859c;
    }
}
