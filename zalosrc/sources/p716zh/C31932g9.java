package p716zh;

import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import on0.AbstractC24342w;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: zh.g9 */
/* loaded from: classes3.dex */
public final class C31932g9 {

    /* renamed from: b */
    private static long f146711b;

    /* renamed from: c */
    private static long f146712c;

    /* renamed from: g */
    private static final InterfaceC24854k f146716g;

    /* renamed from: a */
    public static final C31932g9 f146710a = new C31932g9();

    /* renamed from: d */
    private static String f146713d = "";

    /* renamed from: e */
    private static String f146714e = "";

    /* renamed from: f */
    private static int f146715f = -1;

    /* renamed from: zh.g9$a */
    /* loaded from: classes3.dex */
    static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final a f146717q = new a();

        a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinkedHashMap mo12V4() {
            return new LinkedHashMap();
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(a.f146717q);
        f146716g = m129210a;
    }

    private C31932g9() {
    }

    /* renamed from: a */
    public final void m153444a(String str, List list) {
        Object obj;
        Object obj2;
        boolean m127149O;
        boolean m127149O2;
        AbstractC19074t.m100208f(str, "kw");
        AbstractC19074t.m100208f(list, "result");
        Set keySet = m153448e().keySet();
        AbstractC19074t.m100207e(keySet, "<get-keys>(...)");
        Iterator it = keySet.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                String str2 = (String) obj2;
                AbstractC19074t.m100205c(str2);
                m127149O2 = AbstractC24342w.m127149O(str2, str, false, 2, null);
                if (m127149O2) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        String str3 = (String) obj2;
        if (str3 != null) {
            List list2 = (List) f146710a.m153448e().get(str3);
            List list3 = list2;
            if ((list3 != null && !list3.isEmpty()) || !list.isEmpty()) {
                if (list2 != null && (!list2.isEmpty()) && (!list.isEmpty())) {
                    return;
                }
            } else {
                return;
            }
        }
        Set keySet2 = m153448e().keySet();
        AbstractC19074t.m100207e(keySet2, "<get-keys>(...)");
        Iterator it2 = keySet2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            String str4 = (String) next;
            AbstractC19074t.m100205c(str4);
            m127149O = AbstractC24342w.m127149O(str, str4, false, 2, null);
            if (m127149O) {
                obj = next;
                break;
            }
        }
        String str5 = (String) obj;
        if (str5 != null) {
            C31932g9 c31932g9 = f146710a;
            List list4 = (List) c31932g9.m153448e().get(str5);
            List list5 = list4;
            if (((list5 == null || list5.isEmpty()) && list.isEmpty()) || (list4 != null && (!list4.isEmpty()) && (true ^ list.isEmpty()))) {
                c31932g9.m153448e().remove(str5);
            }
        }
        m153448e().put(str, list);
    }

    /* renamed from: b */
    public final long m153445b() {
        return f146712c;
    }

    /* renamed from: c */
    public final String m153446c() {
        return f146713d;
    }

    /* renamed from: d */
    public final long m153447d() {
        return f146711b;
    }

    /* renamed from: e */
    public final LinkedHashMap m153448e() {
        return (LinkedHashMap) f146716g.getValue();
    }

    /* renamed from: f */
    public final int m153449f() {
        return f146715f;
    }

    /* renamed from: g */
    public final String m153450g() {
        return f146714e;
    }

    /* renamed from: h */
    public final boolean m153451h() {
        return f146711b > 0;
    }

    /* renamed from: i */
    public final void m153452i() {
        f146711b = 0L;
        f146712c = 0L;
        f146713d = "";
        f146714e = "";
        f146715f = -1;
        m153448e().clear();
    }

    /* renamed from: j */
    public final void m153453j(long j11) {
        f146712c = j11;
    }

    /* renamed from: k */
    public final void m153454k(String str) {
        AbstractC19074t.m100208f(str, "<set-?>");
        f146713d = str;
    }

    /* renamed from: l */
    public final void m153455l(long j11) {
        f146711b = j11;
    }

    /* renamed from: m */
    public final void m153456m(int i11) {
        f146715f = i11;
    }
}
