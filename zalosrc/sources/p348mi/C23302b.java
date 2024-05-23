package p348mi;

import am.AbstractC0924m0;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import qm0.AbstractC25332a0;

/* renamed from: mi.b */
/* loaded from: classes3.dex */
public final class C23302b {

    /* renamed from: d */
    private static volatile boolean f113250d;

    /* renamed from: e */
    private static volatile boolean f113251e;

    /* renamed from: a */
    public static final C23302b f113247a = new C23302b();

    /* renamed from: b */
    private static final List f113248b = new ArrayList();

    /* renamed from: c */
    private static final List f113249c = new ArrayList();

    /* renamed from: f */
    private static volatile String f113252f = "";

    private C23302b() {
    }

    /* renamed from: c */
    private final String m120519c() {
        if (f113252f.length() == 0) {
            String m122003i1 = AbstractC23309i.m122003i1();
            if (m122003i1 == null) {
                m122003i1 = "";
            }
            f113252f = m122003i1;
        }
        return f113252f;
    }

    /* renamed from: g */
    private final synchronized void m120520g(JSONArray jSONArray, boolean z11) {
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                String optString = jSONArray.optString(i11);
                AbstractC19074t.m100205c(optString);
                if (optString.length() > 0) {
                    arrayList.add(optString);
                }
            }
            if (!z11) {
                List list = f113248b;
                list.clear();
                if (!arrayList.isEmpty()) {
                    list.addAll(arrayList);
                }
            } else {
                if (arrayList.isEmpty()) {
                    String m122078k1 = AbstractC23309i.m122078k1();
                    AbstractC19074t.m100207e(m122078k1, "getDefaultGroupAvtUrl(...)");
                    arrayList.add(m122078k1);
                }
                List list2 = f113249c;
                list2.clear();
                list2.addAll(arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: a */
    public final String m120521a() {
        m120526h(false);
        List list = f113248b;
        if (!list.isEmpty()) {
            return (String) list.get(0);
        }
        return m120519c();
    }

    /* renamed from: b */
    public final String m120522b() {
        m120526h(true);
        List list = f113249c;
        if (true ^ list.isEmpty()) {
            return (String) list.get(0);
        }
        String m122078k1 = AbstractC23309i.m122078k1();
        AbstractC19074t.m100207e(m122078k1, "getDefaultGroupAvtUrl(...)");
        return m122078k1;
    }

    /* renamed from: d */
    public final boolean m120523d(String str) {
        boolean m131196V;
        m120526h(false);
        List list = f113248b;
        if (!list.isEmpty()) {
            m131196V = AbstractC25332a0.m131196V(list, str);
            return m131196V;
        }
        if (str == null || str.length() == 0 || !AbstractC19074t.m100204b(str, m120519c())) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m120524e(String str) {
        boolean m131196V;
        m120526h(true);
        List list = f113249c;
        if (!list.isEmpty()) {
            m131196V = AbstractC25332a0.m131196V(list, str);
            return m131196V;
        }
        if (str != null && str.length() != 0 && AbstractC19074t.m100204b(str, AbstractC23309i.m122078k1())) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final synchronized void m120525f(String str, boolean z11) {
        if (str != null) {
            try {
                try {
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                if (str.length() != 0) {
                    m120520g(new JSONArray(str), z11);
                    if (z11) {
                        f113251e = true;
                    } else {
                        f113250d = true;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m120520g(new JSONArray(), z11);
    }

    /* renamed from: h */
    public final synchronized void m120526h(boolean z11) {
        try {
            if (!z11) {
                if (!f113250d) {
                    m120525f(AbstractC0924m0.m3682b6(), z11);
                    f113250d = true;
                }
            } else if (!f113251e) {
                m120525f(AbstractC0924m0.m3712c6(), z11);
                f113251e = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* renamed from: i */
    public final void m120527i(String str, boolean z11) {
        m120525f(str, z11);
        if (!z11) {
            if (str == null) {
                str = "";
            }
            AbstractC0924m0.m3119Ho(str);
        } else {
            if (str == null) {
                str = "";
            }
            AbstractC0924m0.m3148Io(str);
        }
    }

    /* renamed from: j */
    public final void m120528j(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f113252f = str;
    }
}
