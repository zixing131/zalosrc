package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.ib */
/* loaded from: classes.dex */
public abstract class AbstractC5427ib {

    /* renamed from: a */
    private static final Class f32418a;

    /* renamed from: b */
    private static final AbstractC5478lb f32419b;

    /* renamed from: c */
    private static final AbstractC5478lb f32420c;

    /* renamed from: d */
    private static final AbstractC5478lb f32421d;

    /* renamed from: e */
    public static final /* synthetic */ int f32422e = 0;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f32418a = cls;
        f32419b = m29261x(false);
        f32420c = m29261x(true);
        f32421d = new C5512nb();
    }

    /* renamed from: A */
    public static int m29214A(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29215B(list) + (size * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: B */
    public static int m29215B(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5629u9) {
            C5629u9 c5629u9 = (C5629u9) list;
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29086v(c5629u9.m29685e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29086v(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: C */
    public static int m29216C(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5357e9.m29089y(i11 << 3) + 4);
    }

    /* renamed from: D */
    public static int m29217D(List list) {
        return list.size() * 4;
    }

    /* renamed from: E */
    public static int m29218E(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5357e9.m29089y(i11 << 3) + 8);
    }

    /* renamed from: F */
    public static int m29219F(List list) {
        return list.size() * 8;
    }

    /* renamed from: G */
    public static int m29220G(int i11, List list, InterfaceC5393gb interfaceC5393gb) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += AbstractC5357e9.m29085u(i11, (InterfaceC5647va) list.get(i13), interfaceC5393gb);
        }
        return i12;
    }

    /* renamed from: H */
    public static int m29221H(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29222I(list) + (size * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: I */
    public static int m29222I(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5629u9) {
            C5629u9 c5629u9 = (C5629u9) list;
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29086v(c5629u9.m29685e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29086v(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: J */
    public static int m29223J(int i11, List list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return m29224K(list) + (list.size() * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: K */
    public static int m29224K(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5460ka) {
            C5460ka c5460ka = (C5460ka) list;
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29090z(c5460ka.mo29366a(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29090z(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: L */
    public static int m29225L(int i11, Object obj, InterfaceC5393gb interfaceC5393gb) {
        return AbstractC5357e9.m29089y(i11 << 3) + AbstractC5357e9.m29087w((InterfaceC5647va) obj, interfaceC5393gb);
    }

    /* renamed from: M */
    public static int m29226M(int i11, List list, InterfaceC5393gb interfaceC5393gb) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m29089y = AbstractC5357e9.m29089y(i11 << 3) * size;
        for (int i12 = 0; i12 < size; i12++) {
            m29089y += AbstractC5357e9.m29087w((InterfaceC5647va) list.get(i12), interfaceC5393gb);
        }
        return m29089y;
    }

    /* renamed from: N */
    public static int m29227N(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29228O(list) + (size * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: O */
    public static int m29228O(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5629u9) {
            C5629u9 c5629u9 = (C5629u9) list;
            i11 = 0;
            while (i12 < size) {
                int m29685e = c5629u9.m29685e(i12);
                i11 += AbstractC5357e9.m29089y((m29685e >> 31) ^ (m29685e + m29685e));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += AbstractC5357e9.m29089y((intValue >> 31) ^ (intValue + intValue));
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: P */
    public static int m29229P(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29230Q(list) + (size * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: Q */
    public static int m29230Q(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5460ka) {
            C5460ka c5460ka = (C5460ka) list;
            i11 = 0;
            while (i12 < size) {
                long mo29366a = c5460ka.mo29366a(i12);
                i11 += AbstractC5357e9.m29090z((mo29366a >> 63) ^ (mo29366a + mo29366a));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += AbstractC5357e9.m29090z((longValue >> 63) ^ (longValue + longValue));
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: R */
    public static int m29231R(int i11, List list) {
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int i13 = AbstractC5357e9.f32354d;
        boolean z11 = list instanceof InterfaceC5341da;
        int m29089y = AbstractC5357e9.m29089y(i11 << 3) * size;
        if (z11) {
            InterfaceC5341da interfaceC5341da = (InterfaceC5341da) list;
            while (i12 < size) {
                Object zzf = interfaceC5341da.zzf(i12);
                if (zzf instanceof AbstractC5679x8) {
                    int mo29551g = ((AbstractC5679x8) zzf).mo29551g();
                    m29089y += AbstractC5357e9.m29089y(mo29551g) + mo29551g;
                } else {
                    m29089y += AbstractC5357e9.m29088x((String) zzf);
                }
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof AbstractC5679x8) {
                    int mo29551g2 = ((AbstractC5679x8) obj).mo29551g();
                    m29089y += AbstractC5357e9.m29089y(mo29551g2) + mo29551g2;
                } else {
                    m29089y += AbstractC5357e9.m29088x((String) obj);
                }
                i12++;
            }
        }
        return m29089y;
    }

    /* renamed from: S */
    public static int m29232S(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29233T(list) + (size * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: T */
    public static int m29233T(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5629u9) {
            C5629u9 c5629u9 = (C5629u9) list;
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29089y(c5629u9.m29685e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29089y(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: U */
    public static int m29234U(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m29235V(list) + (size * AbstractC5357e9.m29089y(i11 << 3));
    }

    /* renamed from: V */
    public static int m29235V(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5460ka) {
            C5460ka c5460ka = (C5460ka) list;
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29090z(c5460ka.mo29366a(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += AbstractC5357e9.m29090z(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: W */
    public static AbstractC5478lb m29236W() {
        return f32419b;
    }

    /* renamed from: X */
    public static AbstractC5478lb m29237X() {
        return f32420c;
    }

    /* renamed from: a */
    public static AbstractC5478lb m29238a() {
        return f32421d;
    }

    /* renamed from: b */
    public static Object m29239b(Object obj, int i11, int i12, Object obj2, AbstractC5478lb abstractC5478lb) {
        if (obj2 == null) {
            obj2 = abstractC5478lb.mo29426c(obj);
        }
        abstractC5478lb.mo29429f(obj2, i11, i12);
        return obj2;
    }

    /* renamed from: c */
    public static void m29240c(AbstractC5478lb abstractC5478lb, Object obj, Object obj2) {
        abstractC5478lb.mo29431h(obj, abstractC5478lb.mo29428e(abstractC5478lb.mo29427d(obj), abstractC5478lb.mo29427d(obj2)));
    }

    /* renamed from: d */
    public static void m29241d(Class cls) {
        Class cls2;
        if (!AbstractC5612t9.class.isAssignableFrom(cls) && (cls2 = f32418a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: e */
    public static void m29242e(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29009g(i11, list, z11);
        }
    }

    /* renamed from: f */
    public static void m29243f(int i11, List list, InterfaceC5326cc interfaceC5326cc) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29004b(i11, list);
        }
    }

    /* renamed from: g */
    public static void m29244g(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo28997D(i11, list, z11);
        }
    }

    /* renamed from: h */
    public static void m29245h(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29026x(i11, list, z11);
        }
    }

    /* renamed from: i */
    public static void m29246i(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29024v(i11, list, z11);
        }
    }

    /* renamed from: j */
    public static void m29247j(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29012j(i11, list, z11);
        }
    }

    /* renamed from: k */
    public static void m29248k(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29016n(i11, list, z11);
        }
    }

    /* renamed from: l */
    public static void m29249l(int i11, List list, InterfaceC5326cc interfaceC5326cc, InterfaceC5393gb interfaceC5393gb) {
        if (list != null && !list.isEmpty()) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((C5374f9) interfaceC5326cc).mo29000G(i11, list.get(i12), interfaceC5393gb);
            }
        }
    }

    /* renamed from: m */
    public static void m29250m(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29010h(i11, list, z11);
        }
    }

    /* renamed from: n */
    public static void m29251n(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo28995B(i11, list, z11);
        }
    }

    /* renamed from: o */
    public static void m29252o(int i11, List list, InterfaceC5326cc interfaceC5326cc, InterfaceC5393gb interfaceC5393gb) {
        if (list != null && !list.isEmpty()) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                ((C5374f9) interfaceC5326cc).mo29001H(i11, list.get(i12), interfaceC5393gb);
            }
        }
    }

    /* renamed from: p */
    public static void m29253p(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo28996C(i11, list, z11);
        }
    }

    /* renamed from: q */
    public static void m29254q(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29019q(i11, list, z11);
        }
    }

    /* renamed from: r */
    public static void m29255r(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo28994A(i11, list, z11);
        }
    }

    /* renamed from: s */
    public static void m29256s(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo28999F(i11, list, z11);
        }
    }

    /* renamed from: t */
    public static void m29257t(int i11, List list, InterfaceC5326cc interfaceC5326cc) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29027y(i11, list);
        }
    }

    /* renamed from: u */
    public static void m29258u(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29023u(i11, list, z11);
        }
    }

    /* renamed from: v */
    public static void m29259v(int i11, List list, InterfaceC5326cc interfaceC5326cc, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5326cc.mo29015m(i11, list, z11);
        }
    }

    /* renamed from: w */
    public static boolean m29260w(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: x */
    private static AbstractC5478lb m29261x(boolean z11) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (AbstractC5478lb) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: y */
    public static int m29262y(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5357e9.m29089y(i11 << 3) + 1);
    }

    /* renamed from: z */
    public static int m29263z(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m29089y = size * AbstractC5357e9.m29089y(i11 << 3);
        for (int i12 = 0; i12 < list.size(); i12++) {
            int mo29551g = ((AbstractC5679x8) list.get(i12)).mo29551g();
            m29089y += AbstractC5357e9.m29089y(mo29551g) + mo29551g;
        }
        return m29089y;
    }
}
