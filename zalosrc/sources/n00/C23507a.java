package n00;

import ai.InterfaceC0861a;
import com.zing.zalo.control.ContactProfile;
import ea0.C18316b;
import ea0.InterfaceC18319c;
import fn0.AbstractC19074t;
import java.util.Iterator;
import java.util.List;
import mm0.AbstractC23350e;
import pm0.C24848g0;
import sk.C26301b;
import sk.C26302c;
import sk.C26303d;
import sk.C26304e;
import sk.EnumC26306g;

/* renamed from: n00.a */
/* loaded from: classes4.dex */
public final class C23507a extends AbstractC23514h {

    /* renamed from: t */
    private final C18316b f114151t;

    /* renamed from: n00.a$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f114152a;

        static {
            int[] iArr = new int[EnumC26306g.values().length];
            try {
                iArr[EnumC26306g.f124953q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC26306g.f124954r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC26306g.f124955s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f114152a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23507a(InterfaceC18319c interfaceC18319c, String str, C18316b c18316b) {
        super(interfaceC18319c, str);
        AbstractC19074t.m100208f(interfaceC18319c, "host");
        AbstractC19074t.m100208f(str, "query");
        AbstractC19074t.m100208f(c18316b, "action");
        this.f114151t = c18316b;
    }

    /* renamed from: m */
    private final void m123382m(C26301b c26301b) {
        C26301b.m135393b(c26301b, null, 1, null);
    }

    /* renamed from: n */
    private final void m123383n(List list) {
        try {
            int size = list.size();
            if (size != 0 && size != 1) {
                for (int i11 = 0; i11 < size; i11++) {
                    int m123384o = m123384o((InterfaceC0861a) list.get(i11));
                    if (m123384o >= 0 && m123384o != i11) {
                        int i12 = size - 1;
                        if (m123384o > i12) {
                            m123384o = i12;
                        }
                        list.add(m123384o, list.remove(i11));
                    }
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SearchDiscovery", e11);
        }
    }

    /* renamed from: o */
    private final int m123384o(InterfaceC0861a interfaceC0861a) {
        if (interfaceC0861a instanceof ContactProfile) {
            return ((ContactProfile) interfaceC0861a).f42353K1;
        }
        return -1;
    }

    /* renamed from: p */
    private final void m123385p(C26301b c26301b, C26304e c26304e) {
        Iterator it = c26304e.m135429a().iterator();
        while (it.hasNext()) {
            m123386q(c26301b, (C26303d) it.next());
        }
    }

    /* renamed from: q */
    private final void m123386q(C26301b c26301b, C26303d c26303d) {
        if (isCancelled()) {
            return;
        }
        int i11 = a.f114152a[c26303d.m135425c().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    m123387r(c26301b.m135397d(), c26303d);
                    return;
                }
                return;
            }
            m123387r(c26301b.m135396c(), c26303d);
            return;
        }
        m123387r(c26301b.m135398e(), c26303d);
    }

    /* renamed from: r */
    private final void m123387r(C26303d c26303d, C26303d c26303d2) {
        synchronized (c26303d) {
            try {
                if (isCancelled()) {
                    return;
                }
                c26303d.m135427e(c26303d2.m135424b());
                c26303d.m135423a().clear();
                c26303d.m135423a().addAll(c26303d2.m135423a());
                if (c26303d.m135425c() != EnumC26306g.f124953q) {
                    m123383n(c26303d.m135423a());
                }
                c26303d.m135428f(c26303d2.m135426d());
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: s */
    private final void m123388s(C26301b c26301b) {
        if (isCancelled()) {
            return;
        }
        new C23515i(this, new C18316b("SearchDiscovery.Task.TransformPreStateResultData", c26301b, null, null, 12, null)).m101441i();
    }

    @Override // ga0.AbstractRunnableC19355q1, java.lang.Runnable
    public void run() {
        Object obj;
        C18316b c18316b;
        if (isCancelled()) {
            return;
        }
        InterfaceC18319c m101438e = m101438e();
        C26302c c26302c = null;
        if (m101438e != null && (c18316b = (C18316b) m101438e.mo205i9(new C18316b("Search.GetSearchSessionData", null, null, null, 14, null))) != null) {
            obj = c18316b.m97245a();
        } else {
            obj = null;
        }
        if (obj instanceof C26302c) {
            c26302c = (C26302c) obj;
        }
        if (c26302c == null) {
            return;
        }
        C26301b m135409j = c26302c.m135409j();
        String m97246b = this.f114151t.m97246b();
        if (AbstractC19074t.m100204b(m97246b, "ACTION_SEARCH_DISCOVERY_TASK_RESULT_SET_DATA")) {
            if (this.f114151t.m97245a() instanceof C26304e) {
                m123385p(m135409j, (C26304e) this.f114151t.m97245a());
                m123388s(m135409j);
                return;
            }
            return;
        }
        if (AbstractC19074t.m100204b(m97246b, "ACTION_SEARCH_DISCOVERY_TASK_RESULT_CLEAR_DATA")) {
            m123382m(m135409j);
            m123388s(m135409j);
        }
    }
}
