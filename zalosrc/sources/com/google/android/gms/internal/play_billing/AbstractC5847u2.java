package com.google.android.gms.internal.play_billing;

import java.util.List;

/* renamed from: com.google.android.gms.internal.play_billing.u2 */
/* loaded from: classes2.dex */
public abstract class AbstractC5847u2 {

    /* renamed from: a */
    private static final Class f33435a;

    /* renamed from: b */
    private static final AbstractC5865x2 f33436b;

    /* renamed from: c */
    private static final AbstractC5865x2 f33437c;

    /* renamed from: d */
    public static final /* synthetic */ int f33438d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        AbstractC5865x2 abstractC5865x2 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f33435a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                abstractC5865x2 = (AbstractC5865x2) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        f33436b = abstractC5865x2;
        f33437c = new C5877z2();
    }

    /* renamed from: A */
    public static void m30492A(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30409v(i11, list, z11);
        }
    }

    /* renamed from: B */
    public static void m30493B(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30397j(i11, list, z11);
        }
    }

    /* renamed from: C */
    public static void m30494C(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30401n(i11, list, z11);
        }
    }

    /* renamed from: D */
    public static void m30495D(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30395h(i11, list, z11);
        }
    }

    /* renamed from: E */
    public static void m30496E(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30380B(i11, list, z11);
        }
    }

    /* renamed from: F */
    public static void m30497F(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30381C(i11, list, z11);
        }
    }

    /* renamed from: a */
    public static void m30498a(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30404q(i11, list, z11);
        }
    }

    /* renamed from: b */
    public static void m30499b(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30379A(i11, list, z11);
        }
    }

    /* renamed from: c */
    public static void m30500c(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30384F(i11, list, z11);
        }
    }

    /* renamed from: d */
    public static void m30501d(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30408u(i11, list, z11);
        }
    }

    /* renamed from: e */
    public static void m30502e(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30400m(i11, list, z11);
        }
    }

    /* renamed from: f */
    public static boolean m30503f(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static int m30504g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5780j1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5845u0.m30485v(((Integer) list.get(i12)).intValue());
        }
        return i11;
    }

    /* renamed from: h */
    public static int m30505h(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5845u0.m30488y(i11 << 3) + 4);
    }

    /* renamed from: i */
    public static int m30506i(List list) {
        return list.size() * 4;
    }

    /* renamed from: j */
    public static int m30507j(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC5845u0.m30488y(i11 << 3) + 8);
    }

    /* renamed from: k */
    public static int m30508k(List list) {
        return list.size() * 8;
    }

    /* renamed from: l */
    public static int m30509l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5780j1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5845u0.m30485v(((Integer) list.get(i12)).intValue());
        }
        return i11;
    }

    /* renamed from: m */
    public static int m30510m(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5864x1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5845u0.m30489z(((Long) list.get(i12)).longValue());
        }
        return i11;
    }

    /* renamed from: n */
    public static int m30511n(int i11, Object obj, InterfaceC5835s2 interfaceC5835s2) {
        return AbstractC5845u0.m30488y(i11 << 3) + AbstractC5845u0.m30486w((InterfaceC5775i2) obj, interfaceC5835s2);
    }

    /* renamed from: o */
    public static int m30512o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5780j1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int intValue = ((Integer) list.get(i12)).intValue();
            i11 += AbstractC5845u0.m30488y((intValue >> 31) ^ (intValue + intValue));
        }
        return i11;
    }

    /* renamed from: p */
    public static int m30513p(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5864x1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            long longValue = ((Long) list.get(i12)).longValue();
            i11 += AbstractC5845u0.m30489z((longValue >> 63) ^ (longValue + longValue));
        }
        return i11;
    }

    /* renamed from: q */
    public static int m30514q(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5780j1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5845u0.m30488y(((Integer) list.get(i12)).intValue());
        }
        return i11;
    }

    /* renamed from: r */
    public static int m30515r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC5864x1) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += AbstractC5845u0.m30489z(((Long) list.get(i12)).longValue());
        }
        return i11;
    }

    /* renamed from: s */
    public static AbstractC5865x2 m30516s() {
        return f33436b;
    }

    /* renamed from: t */
    public static AbstractC5865x2 m30517t() {
        return f33437c;
    }

    /* renamed from: u */
    public static Object m30518u(Object obj, int i11, int i12, Object obj2, AbstractC5865x2 abstractC5865x2) {
        if (obj2 == null) {
            obj2 = abstractC5865x2.mo30555c(obj);
        }
        abstractC5865x2.mo30558f(obj2, i11, i12);
        return obj2;
    }

    /* renamed from: v */
    public static void m30519v(AbstractC5865x2 abstractC5865x2, Object obj, Object obj2) {
        abstractC5865x2.mo30560h(obj, abstractC5865x2.mo30557e(abstractC5865x2.mo30556d(obj), abstractC5865x2.mo30556d(obj2)));
    }

    /* renamed from: w */
    public static void m30520w(Class cls) {
        Class cls2;
        if (!AbstractC5774i1.class.isAssignableFrom(cls) && (cls2 = f33435a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: x */
    public static void m30521x(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30394g(i11, list, z11);
        }
    }

    /* renamed from: y */
    public static void m30522y(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30382D(i11, list, z11);
        }
    }

    /* renamed from: z */
    public static void m30523z(int i11, List list, InterfaceC5806n3 interfaceC5806n3, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC5806n3.mo30411x(i11, list, z11);
        }
    }
}
