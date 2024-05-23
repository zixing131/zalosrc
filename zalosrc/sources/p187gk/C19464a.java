package p187gk;

import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import qm0.AbstractC25368s;

/* renamed from: gk.a */
/* loaded from: classes3.dex */
public final class C19464a {

    /* renamed from: a */
    public static final C19464a f96605a = new C19464a();

    /* renamed from: b */
    private static final InterfaceC19468e f96606b = new C19472i(new C19469f(10), 3);

    /* renamed from: c */
    private static final InterfaceC19468e f96607c = new C19472i(new C19469f(1), 4);

    /* renamed from: d */
    private static final InterfaceC19468e f96608d = new C19472i(new C19469f(5), 6);

    /* renamed from: e */
    private static final InterfaceC19468e f96609e = new C19472i(new C19469f(1), 5);

    private C19464a() {
    }

    /* renamed from: a */
    public static final void m101782a() {
        List m131505m;
        m131505m = AbstractC25368s.m131505m(3, 4, 5, 6);
        Iterator it = m131505m.iterator();
        while (it.hasNext()) {
            InterfaceC19468e m101786e = f96605a.m101786e(((Number) it.next()).intValue());
            if (m101786e != null) {
                m101786e.mo101800a();
            }
        }
    }

    /* renamed from: b */
    public static final String m101783b(String str, int i11) {
        InterfaceC19466c interfaceC19466c;
        C19471h c19471h;
        AbstractC19074t.m100208f(str, "name");
        InterfaceC19468e m101786e = f96605a.m101786e(i11);
        if (m101786e != null) {
            interfaceC19466c = m101786e.mo101804e(str);
        } else {
            interfaceC19466c = null;
        }
        if (interfaceC19466c instanceof C19471h) {
            c19471h = (C19471h) interfaceC19466c;
        } else {
            c19471h = null;
        }
        if (c19471h == null) {
            return null;
        }
        return c19471h.m101806c();
    }

    /* renamed from: c */
    public static final HashMap m101784c(String str, int i11) {
        InterfaceC19466c interfaceC19466c;
        C19470g c19470g;
        AbstractC19074t.m100208f(str, "name");
        InterfaceC19468e m101786e = f96605a.m101786e(i11);
        if (m101786e != null) {
            interfaceC19466c = m101786e.mo101804e(str);
        } else {
            interfaceC19466c = null;
        }
        if (interfaceC19466c instanceof C19470g) {
            c19470g = (C19470g) interfaceC19466c;
        } else {
            c19470g = null;
        }
        if (c19470g == null) {
            return null;
        }
        return c19470g.m101805c();
    }

    /* renamed from: d */
    public static final JSONObject m101785d(String str, int i11) {
        AbstractC19074t.m100208f(str, "name");
        try {
            String m101783b = m101783b(str, i11);
            if (m101783b != null) {
                return new JSONObject(m101783b);
            }
            return null;
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
            return null;
        }
    }

    /* renamed from: e */
    private final InterfaceC19468e m101786e(int i11) {
        if (i11 == 3) {
            return f96606b;
        }
        if (i11 == 4) {
            return f96607c;
        }
        if (i11 == 5) {
            return f96609e;
        }
        if (i11 != 6) {
            return null;
        }
        return f96608d;
    }

    /* renamed from: f */
    public static final boolean m101787f(int i11) {
        InterfaceC19468e m101786e = f96605a.m101786e(i11);
        if (m101786e != null) {
            return m101786e.mo101802c();
        }
        return false;
    }

    /* renamed from: g */
    public static final void m101788g() {
        List m131505m;
        m131505m = AbstractC25368s.m131505m(6, 4, 3, 5);
        Iterator it = m131505m.iterator();
        while (it.hasNext()) {
            InterfaceC19468e m101786e = f96605a.m101786e(((Number) it.next()).intValue());
            if (m101786e != null) {
                m101786e.mo101801b();
            }
        }
    }

    /* renamed from: h */
    public static final void m101789h(String str, String str2, int i11) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(str2, "stringData");
        InterfaceC19468e m101786e = f96605a.m101786e(i11);
        if (m101786e != null) {
            m101786e.mo101803d(str, C19465b.m101792c(i11, str, str2));
        }
    }

    /* renamed from: i */
    public static final void m101790i(String str, HashMap hashMap, int i11) {
        AbstractC19074t.m100208f(str, "name");
        AbstractC19074t.m100208f(hashMap, "data");
        InterfaceC19468e m101786e = f96605a.m101786e(i11);
        if (m101786e != null) {
            m101786e.mo101803d(str, C19465b.f96610a.m101793b(str, hashMap));
        }
    }
}
