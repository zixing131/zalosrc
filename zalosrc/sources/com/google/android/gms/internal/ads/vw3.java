package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class vw3 {

    /* renamed from: a */
    private static final Class f29596a;

    /* renamed from: b */
    private static final xw3 f29597b;

    /* renamed from: c */
    private static final xw3 f29598c;

    /* renamed from: d */
    private static final xw3 f29599d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f29596a = cls;
        f29597b = m27370C(false);
        f29598c = m27370C(true);
        f29599d = new ax3();
    }

    /* renamed from: A */
    public static int m27368A(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (bu3.m20733f(i11 << 3) + 1);
    }

    /* renamed from: B */
    public static void m27369B(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21088k(i11, list, z11);
        }
    }

    /* renamed from: C */
    private static xw3 m27370C(boolean z11) {
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
            return (xw3) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: D */
    public static int m27371D(List list) {
        return list.size();
    }

    /* renamed from: E */
    public static int m27372E(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20732e = size * bu3.m20732e(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            m20732e += bu3.m20726E((mt3) list.get(i12));
        }
        return m20732e;
    }

    /* renamed from: F */
    public static int m27373F(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m27374G(list) + (size * bu3.m20732e(i11));
    }

    /* renamed from: G */
    public static int m27374G(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20728G(uu3Var.m27067e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20728G(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: H */
    public static int m27375H(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (bu3.m20733f(i11 << 3) + 4);
    }

    /* renamed from: I */
    public static int m27376I(List list) {
        return list.size() * 4;
    }

    /* renamed from: J */
    public static int m27377J(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (bu3.m20733f(i11 << 3) + 8);
    }

    /* renamed from: K */
    public static int m27378K(List list) {
        return list.size() * 8;
    }

    /* renamed from: L */
    public static int m27379L(int i11, List list, tw3 tw3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += bu3.m20727F(i11, (zv3) list.get(i13), tw3Var);
        }
        return i12;
    }

    /* renamed from: M */
    public static int m27380M(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m27381N(list) + (size * bu3.m20732e(i11));
    }

    /* renamed from: N */
    public static int m27381N(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20728G(uu3Var.m27067e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20728G(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: O */
    public static int m27382O(int i11, List list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        return m27383P(list) + (list.size() * bu3.m20732e(i11));
    }

    /* renamed from: P */
    public static int m27383P(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20734g(pv3Var.m25558e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20734g(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: Q */
    public static int m27384Q(int i11, Object obj, tw3 tw3Var) {
        return bu3.m20733f(i11 << 3) + bu3.m20729b((zv3) obj, tw3Var);
    }

    /* renamed from: R */
    public static int m27385R(int i11, List list, tw3 tw3Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m20732e = bu3.m20732e(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            m20732e += bu3.m20729b((zv3) list.get(i12), tw3Var);
        }
        return m20732e;
    }

    /* renamed from: S */
    public static int m27386S(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m27387T(list) + (size * bu3.m20732e(i11));
    }

    /* renamed from: T */
    public static int m27387T(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            i11 = 0;
            while (i12 < size) {
                int m27067e = uu3Var.m27067e(i12);
                i11 += bu3.m20733f((m27067e >> 31) ^ (m27067e + m27067e));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                int intValue = ((Integer) list.get(i12)).intValue();
                i11 += bu3.m20733f((intValue >> 31) ^ (intValue + intValue));
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: U */
    public static int m27388U(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m27389V(list) + (size * bu3.m20732e(i11));
    }

    /* renamed from: V */
    public static int m27389V(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            i11 = 0;
            while (i12 < size) {
                long m25558e = pv3Var.m25558e(i12);
                i11 += bu3.m20734g((m25558e >> 63) ^ (m25558e + m25558e));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                long longValue = ((Long) list.get(i12)).longValue();
                i11 += bu3.m20734g((longValue >> 63) ^ (longValue + longValue));
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: W */
    public static int m27390W(int i11, List list) {
        int m20731d;
        int m20731d2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int m20732e = bu3.m20732e(i11) * size;
        if (list instanceof hv3) {
            hv3 hv3Var = (hv3) list;
            while (i12 < size) {
                Object zzf = hv3Var.zzf(i12);
                if (zzf instanceof mt3) {
                    m20731d2 = bu3.m20726E((mt3) zzf);
                } else {
                    m20731d2 = bu3.m20731d((String) zzf);
                }
                m20732e += m20731d2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof mt3) {
                    m20731d = bu3.m20726E((mt3) obj);
                } else {
                    m20731d = bu3.m20731d((String) obj);
                }
                m20732e += m20731d;
                i12++;
            }
        }
        return m20732e;
    }

    /* renamed from: X */
    public static int m27391X(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m27392Y(list) + (size * bu3.m20732e(i11));
    }

    /* renamed from: Y */
    public static int m27392Y(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof uu3) {
            uu3 uu3Var = (uu3) list;
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20733f(uu3Var.m27067e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20733f(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: Z */
    public static int m27393Z(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m27395a0(list) + (size * bu3.m20732e(i11));
    }

    /* renamed from: a */
    public static xw3 m27394a() {
        return f29598c;
    }

    /* renamed from: a0 */
    public static int m27395a0(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof pv3) {
            pv3 pv3Var = (pv3) list;
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20734g(pv3Var.m25558e(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += bu3.m20734g(((Long) list.get(i12)).longValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: b */
    public static xw3 m27396b() {
        return f29599d;
    }

    /* renamed from: b0 */
    public static xw3 m27397b0() {
        return f29597b;
    }

    /* renamed from: c */
    public static Object m27398c(int i11, List list, xu3 xu3Var, Object obj, xw3 xw3Var) {
        if (xu3Var == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                int intValue = ((Integer) list.get(i13)).intValue();
                if (xu3Var.mo20775a(intValue)) {
                    if (i13 != i12) {
                        list.set(i12, Integer.valueOf(intValue));
                    }
                    i12++;
                } else {
                    obj = m27399d(i11, intValue, obj, xw3Var);
                }
            }
            if (i12 != size) {
                list.subList(i12, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!xu3Var.mo20775a(intValue2)) {
                    obj = m27399d(i11, intValue2, obj, xw3Var);
                    it.remove();
                }
            }
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m27399d(int i11, int i12, Object obj, xw3 xw3Var) {
        if (obj == null) {
            obj = xw3Var.mo20334f();
        }
        xw3Var.mo20340l(obj, i11, i12);
        return obj;
    }

    /* renamed from: e */
    public static void m27400e(hu3 hu3Var, Object obj, Object obj2) {
        hu3Var.mo23023a(obj2);
        throw null;
    }

    /* renamed from: f */
    public static void m27401f(xw3 xw3Var, Object obj, Object obj2) {
        xw3Var.mo20343o(obj, xw3Var.mo20333e(xw3Var.mo20332d(obj), xw3Var.mo20332d(obj2)));
    }

    /* renamed from: g */
    public static void m27402g(Class cls) {
        Class cls2;
        if (!tu3.class.isAssignableFrom(cls) && (cls2 = f29596a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: h */
    public static boolean m27403h(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static void m27404i(uv3 uv3Var, Object obj, Object obj2, long j11) {
        ix3.m23434D(obj, j11, uv3.m27074c(ix3.m23454p(obj, j11), ix3.m23454p(obj2, j11)));
    }

    /* renamed from: j */
    public static void m27405j(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21090n(i11, list, z11);
        }
    }

    /* renamed from: k */
    public static void m27406k(int i11, List list, cu3 cu3Var) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21092p(i11, list);
        }
    }

    /* renamed from: l */
    public static void m27407l(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21094r(i11, list, z11);
        }
    }

    /* renamed from: m */
    public static void m27408m(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21097u(i11, list, z11);
        }
    }

    /* renamed from: n */
    public static void m27409n(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21099w(i11, list, z11);
        }
    }

    /* renamed from: o */
    public static void m27410o(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21101y(i11, list, z11);
        }
    }

    /* renamed from: p */
    public static void m27411p(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21067A(i11, list, z11);
        }
    }

    /* renamed from: q */
    public static void m27412q(int i11, List list, cu3 cu3Var, tw3 tw3Var) {
        if (list != null && !list.isEmpty()) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                cu3Var.m21068B(i11, list.get(i12), tw3Var);
            }
        }
    }

    /* renamed from: r */
    public static void m27413r(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21070D(i11, list, z11);
        }
    }

    /* renamed from: s */
    public static void m27414s(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21072F(i11, list, z11);
        }
    }

    /* renamed from: t */
    public static void m27415t(int i11, List list, cu3 cu3Var, tw3 tw3Var) {
        if (list != null && !list.isEmpty()) {
            for (int i12 = 0; i12 < list.size(); i12++) {
                cu3Var.m21073G(i11, list.get(i12), tw3Var);
            }
        }
    }

    /* renamed from: u */
    public static void m27416u(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21075I(i11, list, z11);
        }
    }

    /* renamed from: v */
    public static void m27417v(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21077K(i11, list, z11);
        }
    }

    /* renamed from: w */
    public static void m27418w(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21079b(i11, list, z11);
        }
    }

    /* renamed from: x */
    public static void m27419x(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21081d(i11, list, z11);
        }
    }

    /* renamed from: y */
    public static void m27420y(int i11, List list, cu3 cu3Var) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21084g(i11, list);
        }
    }

    /* renamed from: z */
    public static void m27421z(int i11, List list, cu3 cu3Var, boolean z11) {
        if (list != null && !list.isEmpty()) {
            cu3Var.m21086i(i11, list, z11);
        }
    }
}
