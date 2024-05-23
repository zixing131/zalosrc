package p189gv;

import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import on0.AbstractC24341v;
import on0.C24329j;
import on0.InterfaceC24327h;
import p307kv.AbstractC21954k;
import pm0.C24848g0;

/* renamed from: gv.d */
/* loaded from: classes4.dex */
public final class C19605d {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static C19605d f97378b;

    /* renamed from: a */
    private final HashMap f97379a = new HashMap();

    /* renamed from: gv.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C19605d m102595a() {
            if (C19605d.f97378b == null) {
                C19605d.f97378b = new C19605d();
            }
            C19605d c19605d = C19605d.f97378b;
            AbstractC19074t.m100205c(c19605d);
            return c19605d;
        }

        /* renamed from: b */
        public final String m102596b(String str) {
            boolean m127125u;
            String str2;
            if (str != null) {
                m127125u = AbstractC24341v.m127125u(str, "/", false, 2, null);
                if (!m127125u) {
                    str = str + "/";
                }
                if (AbstractC21954k.Companion.m114625t(str)) {
                    InterfaceC24327h m127013c = C24329j.m127013c(new C24329j("(https://h5.zdn.vn/zapps/[A-Za-z0-9]*/)"), str, 0, 2, null);
                    if (m127013c != null) {
                        str2 = m127013c.getValue();
                    } else {
                        str2 = null;
                    }
                    if (str2 != null && str2.length() > 0) {
                        return str2;
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public final C19609h m102592c(String str) {
        String m102613g;
        boolean m127120J;
        synchronized (this.f97379a) {
            String m102596b = Companion.m102596b(str);
            if (m102596b != null && m102596b.length() > 0) {
                return (C19609h) this.f97379a.get(m102596b);
            }
            for (Map.Entry entry : this.f97379a.entrySet()) {
                C19609h c19609h = (C19609h) entry.getValue();
                if (c19609h != null && (m102613g = c19609h.m102613g()) != null && str != null) {
                    m127120J = AbstractC24341v.m127120J(str, m102613g, false, 2, null);
                    if (m127120J) {
                        return (C19609h) entry.getValue();
                    }
                }
            }
            return null;
        }
    }

    /* renamed from: d */
    public final void m102593d(WebBackForwardList webBackForwardList) {
        synchronized (this.f97379a) {
            if (webBackForwardList != null) {
                try {
                    int size = webBackForwardList.getSize();
                    ArrayList arrayList = new ArrayList();
                    if (size >= 0) {
                        int i11 = 0;
                        while (true) {
                            WebHistoryItem itemAtIndex = webBackForwardList.getItemAtIndex(i11);
                            if (itemAtIndex != null) {
                                AbstractC19074t.m100205c(itemAtIndex);
                                String m102596b = Companion.m102596b(itemAtIndex.getUrl());
                                if (m102596b != null) {
                                    arrayList.add(m102596b);
                                }
                            }
                            if (i11 == size) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (arrayList.size() <= 0) {
                        return;
                    }
                    Iterator it = this.f97379a.entrySet().iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        AbstractC19074t.m100207e(next, "next(...)");
                        if (!arrayList.contains(((Map.Entry) next).getKey())) {
                            it.remove();
                        }
                    }
                    C24848g0 c24848g0 = C24848g0.f119245a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* renamed from: e */
    public final void m102594e(String str, C19609h c19609h) {
        AbstractC19074t.m100208f(str, "baseUrlKey");
        AbstractC19074t.m100208f(c19609h, "miniProgramInfo");
        synchronized (this.f97379a) {
            this.f97379a.put(str, c19609h);
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
