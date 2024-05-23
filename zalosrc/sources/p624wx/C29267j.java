package p624wx;

import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ln0.AbstractC22543l;
import p624wx.AbstractC29261d;
import pm0.C24848g0;

/* renamed from: wx.j */
/* loaded from: classes4.dex */
public final class C29267j {

    /* renamed from: a */
    private final String f135651a;

    /* renamed from: b */
    private final List f135652b;

    /* renamed from: c */
    private final Set f135653c;

    /* renamed from: d */
    private C29260c f135654d;

    /* renamed from: e */
    private boolean f135655e;

    /* renamed from: f */
    private int f135656f;

    public C29267j(String str) {
        AbstractC19074t.m100208f(str, "uid");
        this.f135651a = str;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC19074t.m100207e(synchronizedList, "synchronizedList(...)");
        this.f135652b = synchronizedList;
        Set synchronizedSet = Collections.synchronizedSet(new LinkedHashSet());
        AbstractC19074t.m100207e(synchronizedSet, "synchronizedSet(...)");
        this.f135653c = synchronizedSet;
        this.f135655e = true;
    }

    /* renamed from: a */
    public final void m146246a(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        synchronized (this) {
            try {
                if (!this.f135653c.contains(Long.valueOf(c29259b.m146158m()))) {
                    this.f135652b.add(c29259b);
                    this.f135653c.add(Long.valueOf(c29259b.m146158m()));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    public final void m146247b(C29259b c29259b) {
        AbstractC19074t.m100208f(c29259b, "catalog");
        synchronized (this) {
            try {
                if (!this.f135653c.contains(Long.valueOf(c29259b.m146158m()))) {
                    this.f135652b.add(0, c29259b);
                    this.f135653c.add(Long.valueOf(c29259b.m146158m()));
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final C29260c m146248c(C29260c c29260c, Map map) {
        AbstractC19074t.m100208f(c29260c, "catalogPage");
        AbstractC19074t.m100208f(map, "cachedCatalogs");
        ArrayList arrayList = new ArrayList();
        for (C29259b c29259b : c29260c.m146173b()) {
            C29259b c29259b2 = (C29259b) map.get(c29259b.m146152g());
            if (c29259b2 != null && c29259b2.m146167v() >= c29259b.m146167v()) {
                arrayList.add(c29259b2);
            } else {
                arrayList.add(c29259b);
            }
        }
        synchronized (this) {
            try {
                C29260c c29260c2 = this.f135654d;
                if (c29260c2 == null) {
                    this.f135654d = c29260c;
                    this.f135652b.clear();
                    this.f135653c.clear();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m146246a((C29259b) it.next());
                    }
                } else {
                    AbstractC19074t.m100205c(c29260c2);
                    if (c29260c2.m146177f() == c29260c.m146179h()) {
                        this.f135654d = c29260c;
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            m146246a((C29259b) it2.next());
                        }
                    } else if (AbstractC19074t.m100204b(c29260c2.m146174c(), AbstractC29261d.a.f135578a) && AbstractC19074t.m100204b(c29260c.m146174c(), AbstractC29261d.b.f135579a) && c29260c.m146179h() == 0) {
                        this.f135654d = c29260c;
                        this.f135652b.clear();
                        this.f135653c.clear();
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            m146246a((C29259b) it3.next());
                        }
                    }
                    c29260c = this.f135654d;
                    AbstractC19074t.m100205c(c29260c);
                }
                C29260c c29260c3 = this.f135654d;
                if (c29260c3 != null) {
                    this.f135656f = c29260c3.m146172a();
                    C24848g0 c24848g0 = C24848g0.f119245a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c29260c;
    }

    /* renamed from: d */
    public final void m146249d(boolean z11) {
        synchronized (this) {
            try {
                this.f135652b.clear();
                this.f135653c.clear();
                this.f135654d = null;
                this.f135655e = true;
                if (z11) {
                    this.f135656f = 0;
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: e */
    public final void m146250e(List list) {
        int m116580c;
        AbstractC19074t.m100208f(list, "deletedCatalogIds");
        synchronized (this) {
            try {
                Iterator it = this.f135652b.iterator();
                while (it.hasNext()) {
                    if (list.contains(Long.valueOf(((C29259b) it.next()).m146158m()))) {
                        it.remove();
                        C29260c c29260c = this.f135654d;
                        if (c29260c != null) {
                            m116580c = AbstractC22543l.m116580c(c29260c.m146178g() - 1, 0);
                            c29260c.m146180i(m116580c);
                        }
                    }
                }
                this.f135653c.removeAll(list);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29267j) && AbstractC19074t.m100204b(this.f135651a, ((C29267j) obj).f135651a);
    }

    /* renamed from: f */
    public final C29259b m146251f(long j11) {
        for (C29259b c29259b : this.f135652b) {
            if (c29259b.m146158m() == j11) {
                return c29259b;
            }
        }
        return null;
    }

    /* renamed from: g */
    public final List m146252g() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f135652b);
        }
        return arrayList;
    }

    /* renamed from: h */
    public final int m146253h() {
        return this.f135656f;
    }

    public int hashCode() {
        return this.f135651a.hashCode();
    }

    /* renamed from: i */
    public final List m146254i() {
        return this.f135652b;
    }

    /* renamed from: j */
    public final C29260c m146255j() {
        return this.f135654d;
    }

    /* renamed from: k */
    public final boolean m146256k() {
        return this.f135655e;
    }

    /* renamed from: l */
    public final String m146257l() {
        return "[uid:" + this.f135651a + ", version:" + this.f135656f + ", catalogs:" + this.f135652b.size() + "]";
    }

    /* renamed from: m */
    public final String m146258m() {
        return this.f135651a;
    }

    /* renamed from: n */
    public final void m146259n(int i11) {
        this.f135656f = i11;
    }

    /* renamed from: o */
    public final void m146260o(boolean z11) {
        this.f135655e = z11;
    }

    public String toString() {
        return "UserCatalogs(uid=" + this.f135651a + ")";
    }
}
