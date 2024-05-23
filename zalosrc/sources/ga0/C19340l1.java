package ga0;

import com.zing.zalo.AbstractC8020f0;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import me0.AbstractC23136l9;
import p142ey.C18639i;
import p348mi.AbstractC23304d;
import p716zh.C32178x9;
import pm0.AbstractC24856m;
import pm0.AbstractC24862s;
import pm0.C24861r;
import pm0.InterfaceC24854k;
import qm0.AbstractC25358n;

/* renamed from: ga0.l1 */
/* loaded from: classes6.dex */
public final class C19340l1 {

    /* renamed from: c */
    private static boolean f96078c;

    /* renamed from: e */
    private static final InterfaceC24854k f96080e;

    /* renamed from: f */
    private static final HashMap f96081f;

    /* renamed from: g */
    private static final HashMap f96082g;

    /* renamed from: h */
    private static final HashMap f96083h;

    /* renamed from: a */
    public static final C19340l1 f96076a = new C19340l1();

    /* renamed from: b */
    private static final int f96077b = AbstractC8020f0.setting_title;

    /* renamed from: d */
    private static boolean f96079d = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ga0.l1$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18505l {

        /* renamed from: q */
        public static final a f96084q = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence m101308a(int i11) {
            String m101304k;
            C19354q0 c19354q0 = (C19354q0) C19340l1.f96081f.get(Integer.valueOf(i11));
            if (c19354q0 == null || (m101304k = C19340l1.f96076a.m101304k(c19354q0)) == null) {
                return "";
            }
            return m101304k;
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            return m101308a(((Number) obj).intValue());
        }
    }

    /* renamed from: ga0.l1$b */
    /* loaded from: classes6.dex */
    static final class b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final b f96085q = new b();

        b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HashMap mo12V4() {
            HashMap hashMap = new HashMap();
            hashMap.put(0, Integer.MAX_VALUE);
            hashMap.put(1, 0);
            hashMap.put(2, 0);
            hashMap.put(3, 0);
            hashMap.put(78, 0);
            hashMap.put(4, 0);
            hashMap.put(5, 0);
            hashMap.put(6, 0);
            hashMap.put(123, 0);
            hashMap.put(79, 0);
            hashMap.put(7, 0);
            hashMap.put(8, 0);
            hashMap.put(9, 0);
            hashMap.put(10, 0);
            hashMap.put(11, 0);
            hashMap.put(12, 0);
            hashMap.put(75, 52);
            hashMap.put(76, 52);
            return hashMap;
        }
    }

    static {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(b.f96085q);
        f96080e = m129210a;
        f96081f = new HashMap();
        f96082g = new HashMap();
        f96083h = new HashMap();
    }

    private C19340l1() {
    }

    /* renamed from: c */
    private static final void m101298c() {
        C19340l1 c19340l1 = f96076a;
        C18639i c18639i = AbstractC23304d.f113372d;
        AbstractC19074t.m100207e(c18639i, "arrSettings");
        c19340l1.m101299d(c18639i);
    }

    /* renamed from: d */
    private final void m101299d(C18639i c18639i) {
        int i11;
        f96081f.clear();
        f96082g.clear();
        f96083h.clear();
        HashMap hashMap = new HashMap();
        hashMap.putAll(m101305l());
        Iterator<E> it = c18639i.iterator();
        while (it.hasNext()) {
            C32178x9 c32178x9 = (C32178x9) it.next();
            if (!hashMap.containsKey(Integer.valueOf(c32178x9.f148384r))) {
                hashMap.put(Integer.valueOf(c32178x9.f148384r), Integer.valueOf(c32178x9.f148383q));
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            HashMap hashMap2 = f96081f;
            if (!hashMap2.containsKey(entry.getKey())) {
                C32178x9 m98514g = c18639i.m98514g(((Number) entry.getKey()).intValue());
                Object key = entry.getKey();
                int intValue = ((Number) entry.getKey()).intValue();
                int intValue2 = ((Number) entry.getValue()).intValue();
                if (m98514g != null) {
                    i11 = m98514g.f148388v;
                } else {
                    i11 = f96077b;
                }
                hashMap2.put(key, new C19354q0(intValue, intValue2, i11, null, 8, null));
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            C19354q0 c19354q0 = (C19354q0) f96081f.get(entry2.getValue());
            if (c19354q0 != null) {
                if (c19354q0.m101427a() == null) {
                    c19354q0.m101431e(new HashSet());
                }
                Set m101427a = c19354q0.m101427a();
                if (m101427a != null) {
                    m101427a.add(entry2.getKey());
                }
            }
        }
        C19354q0 c19354q02 = (C19354q0) f96081f.get(0);
        if (c19354q02 != null) {
            f96076a.m101301g(c19354q02);
        }
    }

    /* renamed from: f */
    private final void m101300f(C19354q0 c19354q0, int[] iArr, int i11, Map map) {
        int m101428b = c19354q0.m101428b();
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr2[i12] = iArr[i12];
        }
        map.put(Integer.valueOf(m101428b), new C19360s0(m101428b, iArr2));
    }

    /* renamed from: g */
    private final void m101301g(C19354q0 c19354q0) {
        m101302h(c19354q0, new int[10], 0, f96081f, f96082g);
    }

    /* renamed from: h */
    private final void m101302h(C19354q0 c19354q0, int[] iArr, int i11, Map map, Map map2) {
        iArr[i11] = c19354q0.m101428b();
        m101300f(c19354q0, iArr, i11, map2);
        Set m101427a = c19354q0.m101427a();
        if (m101427a != null) {
            Iterator it = m101427a.iterator();
            while (it.hasNext()) {
                C19354q0 c19354q02 = (C19354q0) map.get(Integer.valueOf(((Number) it.next()).intValue()));
                if (c19354q02 != null) {
                    f96076a.m101302h(c19354q02, iArr, i11 + 1, map, map2);
                }
            }
        }
    }

    /* renamed from: i */
    private final C19362t0 m101303i(int i11) {
        C19360s0 c19360s0;
        String m131374V;
        if (!f96078c) {
            m101298c();
        }
        C19354q0 c19354q0 = (C19354q0) f96081f.get(Integer.valueOf(i11));
        if (c19354q0 == null || (c19360s0 = (C19360s0) f96082g.get(Integer.valueOf(i11))) == null) {
            return null;
        }
        int m101428b = c19354q0.m101428b();
        int m101429c = c19354q0.m101429c();
        String m101304k = m101304k(c19354q0);
        m131374V = AbstractC25358n.m131374V(c19360s0.m101456a(), " > ", null, null, 0, null, a.f96084q, 30, null);
        return new C19362t0(m101428b, m101429c, m101304k, m131374V);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public final String m101304k(C19354q0 c19354q0) {
        String m118743r0 = AbstractC23136l9.m118743r0(c19354q0.m101430d());
        AbstractC19074t.m100207e(m118743r0, "getString(...)");
        return m118743r0;
    }

    /* renamed from: l */
    private final HashMap m101305l() {
        return (HashMap) f96080e.getValue();
    }

    /* renamed from: e */
    public final void m101306e() {
        f96079d = false;
    }

    /* renamed from: j */
    public final String m101307j(int i11) {
        Object m129218b;
        String str;
        Object obj = null;
        try {
            C24861r.a aVar = C24861r.f119264q;
            if (f96079d) {
                f96083h.clear();
            }
            HashMap hashMap = f96083h;
            C19362t0 c19362t0 = (C19362t0) hashMap.get(Integer.valueOf(i11));
            if (c19362t0 == null) {
                c19362t0 = m101303i(i11);
                if (c19362t0 != null) {
                    hashMap.put(Integer.valueOf(i11), c19362t0);
                } else {
                    c19362t0 = null;
                }
            }
            if (c19362t0 != null) {
                str = c19362t0.m101457a();
            } else {
                str = null;
            }
            m129218b = C24861r.m129218b(str);
        } catch (Throwable th2) {
            C24861r.a aVar2 = C24861r.f119264q;
            m129218b = C24861r.m129218b(AbstractC24862s.m129227a(th2));
        }
        if (!C24861r.m129223g(m129218b)) {
            obj = m129218b;
        }
        return (String) obj;
    }
}
