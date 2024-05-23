package p716zh;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;
import qm0.AbstractC25332a0;

/* renamed from: zh.l4 */
/* loaded from: classes3.dex */
public final class C32002l4 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private ArrayList f147250a;

    /* renamed from: zh.l4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C32002l4 m154287a(int i11) {
            return m154291e().m154271a(i11);
        }

        /* renamed from: b */
        public final C32002l4 m154288b(int i11, int i12) {
            return m154291e().m154272b(new C31987k4(i11, i12));
        }

        /* renamed from: c */
        public final C32002l4 m154289c(C31987k4 c31987k4) {
            AbstractC19074t.m100208f(c31987k4, "entryPoint");
            return m154291e().m154272b(c31987k4);
        }

        /* renamed from: d */
        public final C32002l4 m154290d(C32002l4 c32002l4) {
            AbstractC19074t.m100208f(c32002l4, "entryPointChain");
            return c32002l4.m154275e();
        }

        /* renamed from: e */
        public final C32002l4 m154291e() {
            return new C32002l4(null);
        }

        /* renamed from: f */
        public final C32002l4 m154292f(String str) {
            C32002l4 c32002l4 = new C32002l4(null);
            if (str != null) {
                try {
                    if (str.length() > 0) {
                        JSONObject jSONObject = new JSONObject(str);
                        if (jSONObject.has("entryPoints")) {
                            JSONArray jSONArray = jSONObject.getJSONArray("entryPoints");
                            int length = jSONArray.length();
                            for (int i11 = 0; i11 < length; i11++) {
                                C31987k4 m154201d = C31987k4.m154201d(jSONArray.getJSONObject(i11));
                                AbstractC19074t.m100207e(m154201d, "fromJson(...)");
                                c32002l4.m154272b(m154201d);
                            }
                        }
                    }
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
            }
            return c32002l4;
        }
    }

    public /* synthetic */ C32002l4(AbstractC19060k abstractC19060k) {
        this();
    }

    /* renamed from: g */
    public static final C32002l4 m154264g(int i11) {
        return Companion.m154287a(i11);
    }

    /* renamed from: h */
    public static final C32002l4 m154265h(int i11, int i12) {
        return Companion.m154288b(i11, i12);
    }

    /* renamed from: i */
    public static final C32002l4 m154266i(C31987k4 c31987k4) {
        return Companion.m154289c(c31987k4);
    }

    /* renamed from: j */
    public static final C32002l4 m154267j(C32002l4 c32002l4) {
        return Companion.m154290d(c32002l4);
    }

    /* renamed from: k */
    public static final C32002l4 m154268k() {
        return Companion.m154291e();
    }

    /* renamed from: m */
    public static final C32002l4 m154269m(String str) {
        return Companion.m154292f(str);
    }

    /* renamed from: p */
    private final JSONArray m154270p() {
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f147250a.iterator();
        while (it.hasNext()) {
            jSONArray.put(((C31987k4) it.next()).m154216p());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public final C32002l4 m154271a(int i11) {
        return m154272b(new C31987k4(i11));
    }

    /* renamed from: b */
    public final C32002l4 m154272b(C31987k4 c31987k4) {
        AbstractC19074t.m100208f(c31987k4, "entryPoint");
        this.f147250a.add(c31987k4);
        if (this.f147250a.size() > 10) {
            this.f147250a.remove(0);
        }
        return this;
    }

    /* renamed from: c */
    public final void m154273c(C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        if (!c32002l4.f147250a.isEmpty()) {
            this.f147250a.addAll(0, c32002l4.f147250a);
        }
    }

    /* renamed from: d */
    public final C32002l4 m154274d(int i11, int i12) {
        C32002l4 m154275e = m154275e();
        for (C31987k4 c31987k4 : m154275e.f147250a) {
            if (c31987k4.m154207g() == i11 && c31987k4.f147197b == i12) {
                c31987k4.f147197b = 0;
            }
        }
        return m154275e;
    }

    /* renamed from: e */
    public final C32002l4 m154275e() {
        C32002l4 m154291e = Companion.m154291e();
        Iterator it = this.f147250a.iterator();
        while (it.hasNext()) {
            C31987k4 clone = ((C31987k4) it.next()).clone();
            AbstractC19074t.m100207e(clone, "clone(...)");
            m154291e.m154272b(clone);
        }
        return m154291e;
    }

    /* renamed from: f */
    public final boolean m154276f(C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "entryPointLink");
        try {
            if (m154286w() < c32002l4.m154286w()) {
                return false;
            }
            int m154286w = c32002l4.m154286w();
            for (int i11 = 0; i11 < m154286w; i11++) {
                C31987k4 m154278n = c32002l4.m154278n((c32002l4.m154286w() - 1) - i11);
                AbstractC19074t.m100205c(m154278n);
                if (!m154278n.m154209i(m154278n((m154286w() - 1) - i11))) {
                    return false;
                }
            }
            return true;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return false;
        }
    }

    /* renamed from: l */
    public final String m154277l() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("entryPoints", m154270p());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject2, "toString(...)");
            return jSONObject2;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            String jSONObject3 = jSONObject.toString();
            AbstractC19074t.m100207e(jSONObject3, "toString(...)");
            return jSONObject3;
        }
    }

    /* renamed from: n */
    public final C31987k4 m154278n(int i11) {
        if (i11 >= 0 && i11 < this.f147250a.size()) {
            return (C31987k4) this.f147250a.get(i11);
        }
        return null;
    }

    /* renamed from: o */
    public final C31987k4 m154279o(int i11) {
        for (C31987k4 c31987k4 : this.f147250a) {
            if (c31987k4.m154207g() == i11) {
                return c31987k4;
            }
        }
        return null;
    }

    /* renamed from: q */
    public final C31987k4 m154280q() {
        if (this.f147250a.size() > 0) {
            return (C31987k4) this.f147250a.get(r0.size() - 1);
        }
        return null;
    }

    /* renamed from: r */
    public final boolean m154281r() {
        if (m154286w() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final String m154282s() {
        String m131214n0;
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f147250a.iterator();
            while (it.hasNext()) {
                String m154211k = ((C31987k4) it.next()).m154211k();
                AbstractC19074t.m100207e(m154211k, "log(...)");
                arrayList.add(m154211k);
            }
            m131214n0 = AbstractC25332a0.m131214n0(arrayList, "-", null, null, 0, null, null, 62, null);
            return m131214n0;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return "";
        }
    }

    /* renamed from: t */
    public final void m154283t(int i11, C31987k4 c31987k4) {
        AbstractC19074t.m100208f(c31987k4, "newEntryPoint");
        for (C31987k4 c31987k42 : this.f147250a) {
            if (c31987k42.m154207g() == i11) {
                c31987k42.m154215o(c31987k4.m154207g());
                c31987k42.f147197b = c31987k4.f147197b;
            }
        }
    }

    /* renamed from: u */
    public final C32002l4 m154284u(int i11) {
        C32002l4 m154275e = m154275e();
        C31987k4 m154280q = m154275e.m154280q();
        if (m154280q != null) {
            m154280q.m154212l(i11);
        }
        return m154275e;
    }

    /* renamed from: v */
    public final C32002l4 m154285v(String str, Object obj) {
        AbstractC19074t.m100208f(str, "key");
        AbstractC19074t.m100208f(obj, "value");
        C32002l4 m154275e = m154275e();
        C31987k4 m154280q = m154275e.m154280q();
        if (m154280q != null) {
            m154280q.m154202a(str, obj);
        }
        return m154275e;
    }

    /* renamed from: w */
    public final int m154286w() {
        return this.f147250a.size();
    }

    private C32002l4() {
        this.f147250a = new ArrayList();
    }
}
