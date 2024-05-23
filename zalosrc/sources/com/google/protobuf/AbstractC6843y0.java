package com.google.protobuf;

import java.util.List;

/* renamed from: com.google.protobuf.y0 */
/* loaded from: classes3.dex */
public abstract class AbstractC6843y0 {

    /* renamed from: a */
    private static final Class f37513a = m35220z();

    /* renamed from: b */
    private static final AbstractC6792c1 f37514b = m35167A(false);

    /* renamed from: c */
    private static final AbstractC6792c1 f37515c = m35167A(true);

    /* renamed from: d */
    private static final AbstractC6792c1 f37516d = new C6798e1();

    /* renamed from: A */
    private static AbstractC6792c1 m35167A(boolean z11) {
        try {
            Class m35168B = m35168B();
            if (m35168B == null) {
                return null;
            }
            return (AbstractC6792c1) m35168B.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z11));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: B */
    private static Class m35168B() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: C */
    public static void m35169C(AbstractC6814k abstractC6814k, Object obj, Object obj2) {
        C6820n mo34989b = abstractC6814k.mo34989b(obj2);
        if (!mo34989b.m35074j()) {
            abstractC6814k.mo34990c(obj).m35078p(mo34989b);
        }
    }

    /* renamed from: D */
    public static void m35170D(InterfaceC6794d0 interfaceC6794d0, Object obj, Object obj2, long j11) {
        AbstractC6804g1.m34855R(obj, j11, interfaceC6794d0.mo34763a(AbstractC6804g1.m34840C(obj, j11), AbstractC6804g1.m34840C(obj2, j11)));
    }

    /* renamed from: E */
    public static void m35171E(AbstractC6792c1 abstractC6792c1, Object obj, Object obj2) {
        abstractC6792c1.mo34757f(obj, abstractC6792c1.mo34756e(abstractC6792c1.mo34752a(obj), abstractC6792c1.mo34752a(obj2)));
    }

    /* renamed from: F */
    public static AbstractC6792c1 m35172F() {
        return f37514b;
    }

    /* renamed from: G */
    public static AbstractC6792c1 m35173G() {
        return f37515c;
    }

    /* renamed from: H */
    public static void m35174H(Class cls) {
        Class cls2;
        if (!AbstractC6826q.class.isAssignableFrom(cls) && (cls2 = f37513a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: I */
    public static boolean m35175I(Object obj, Object obj2) {
        if (obj != obj2 && (obj == null || !obj.equals(obj2))) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static AbstractC6792c1 m35176J() {
        return f37516d;
    }

    /* renamed from: K */
    public static void m35177K(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34916F(i11, list, z11);
        }
    }

    /* renamed from: L */
    public static void m35178L(int i11, List list, InterfaceC6813j1 interfaceC6813j1) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34925O(i11, list);
        }
    }

    /* renamed from: M */
    public static void m35179M(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34923M(i11, list, z11);
        }
    }

    /* renamed from: N */
    public static void m35180N(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34942q(i11, list, z11);
        }
    }

    /* renamed from: O */
    public static void m35181O(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34938m(i11, list, z11);
        }
    }

    /* renamed from: P */
    public static void m35182P(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34914D(i11, list, z11);
        }
    }

    /* renamed from: Q */
    public static void m35183Q(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34927b(i11, list, z11);
        }
    }

    /* renamed from: R */
    public static void m35184R(int i11, List list, InterfaceC6813j1 interfaceC6813j1, InterfaceC6839w0 interfaceC6839w0) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34943r(i11, list, interfaceC6839w0);
        }
    }

    /* renamed from: S */
    public static void m35185S(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34933h(i11, list, z11);
        }
    }

    /* renamed from: T */
    public static void m35186T(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34922L(i11, list, z11);
        }
    }

    /* renamed from: U */
    public static void m35187U(int i11, List list, InterfaceC6813j1 interfaceC6813j1, InterfaceC6839w0 interfaceC6839w0) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34926a(i11, list, interfaceC6839w0);
        }
    }

    /* renamed from: V */
    public static void m35188V(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34915E(i11, list, z11);
        }
    }

    /* renamed from: W */
    public static void m35189W(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34946u(i11, list, z11);
        }
    }

    /* renamed from: X */
    public static void m35190X(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34920J(i11, list, z11);
        }
    }

    /* renamed from: Y */
    public static void m35191Y(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34940o(i11, list, z11);
        }
    }

    /* renamed from: Z */
    public static void m35192Z(int i11, List list, InterfaceC6813j1 interfaceC6813j1) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34930e(i11, list);
        }
    }

    /* renamed from: a */
    public static int m35193a(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(size);
        }
        return size * CodedOutputStream.m34632d(i11, true);
    }

    /* renamed from: a0 */
    public static void m35194a0(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34939n(i11, list, z11);
        }
    }

    /* renamed from: b */
    public static int m35195b(List list) {
        return list.size();
    }

    /* renamed from: b0 */
    public static void m35196b0(int i11, List list, InterfaceC6813j1 interfaceC6813j1, boolean z11) {
        if (list != null && !list.isEmpty()) {
            interfaceC6813j1.mo34947v(i11, list, z11);
        }
    }

    /* renamed from: c */
    public static int m35197c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m34622P = size * CodedOutputStream.m34622P(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            m34622P += CodedOutputStream.m34636h((AbstractC6799f) list.get(i12));
        }
        return m34622P;
    }

    /* renamed from: d */
    public static int m35198d(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35199e = m35199e(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35199e);
        }
        return m35199e + (size * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: e */
    public static int m35199e(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6828r) {
            C6828r c6828r = (C6828r) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34640l(c6828r.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34640l(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: f */
    public static int m35200f(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(size * 4);
        }
        return size * CodedOutputStream.m34641m(i11, 0);
    }

    /* renamed from: g */
    public static int m35201g(List list) {
        return list.size() * 4;
    }

    /* renamed from: h */
    public static int m35202h(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(size * 8);
        }
        return size * CodedOutputStream.m34643o(i11, 0L);
    }

    /* renamed from: i */
    public static int m35203i(List list) {
        return list.size() * 8;
    }

    /* renamed from: j */
    public static int m35204j(int i11, List list, InterfaceC6839w0 interfaceC6839w0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            i12 += CodedOutputStream.m34647s(i11, (InterfaceC6809i0) list.get(i13), interfaceC6839w0);
        }
        return i12;
    }

    /* renamed from: k */
    public static int m35205k(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35206l = m35206l(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35206l);
        }
        return m35206l + (size * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: l */
    public static int m35206l(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6828r) {
            C6828r c6828r = (C6828r) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34651w(c6828r.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34651w(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: m */
    public static int m35207m(int i11, List list, boolean z11) {
        if (list.size() == 0) {
            return 0;
        }
        int m35208n = m35208n(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35208n);
        }
        return m35208n + (list.size() * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: n */
    public static int m35208n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC6844z) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.m34653y(((Long) list.get(i12)).longValue());
        }
        return i11;
    }

    /* renamed from: o */
    public static int m35209o(int i11, Object obj, InterfaceC6839w0 interfaceC6839w0) {
        return CodedOutputStream.m34607A(i11, (InterfaceC6809i0) obj, interfaceC6839w0);
    }

    /* renamed from: p */
    public static int m35210p(int i11, List list, InterfaceC6839w0 interfaceC6839w0) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m34622P = CodedOutputStream.m34622P(i11) * size;
        for (int i12 = 0; i12 < size; i12++) {
            m34622P += CodedOutputStream.m34609C((InterfaceC6809i0) list.get(i12), interfaceC6839w0);
        }
        return m34622P;
    }

    /* renamed from: q */
    public static int m35211q(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35212r = m35212r(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35212r);
        }
        return m35212r + (size * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: r */
    public static int m35212r(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6828r) {
            C6828r c6828r = (C6828r) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34617K(c6828r.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34617K(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: s */
    public static int m35213s(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35214t = m35214t(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35214t);
        }
        return m35214t + (size * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: t */
    public static int m35214t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC6844z) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.m34619M(((Long) list.get(i12)).longValue());
        }
        return i11;
    }

    /* renamed from: u */
    public static int m35215u(int i11, List list) {
        int m34621O;
        int m34621O2;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        int m34622P = CodedOutputStream.m34622P(i11) * size;
        if (list instanceof InterfaceC6840x) {
            InterfaceC6840x interfaceC6840x = (InterfaceC6840x) list;
            while (i12 < size) {
                Object mo34823z0 = interfaceC6840x.mo34823z0(i12);
                if (mo34823z0 instanceof AbstractC6799f) {
                    m34621O2 = CodedOutputStream.m34636h((AbstractC6799f) mo34823z0);
                } else {
                    m34621O2 = CodedOutputStream.m34621O((String) mo34823z0);
                }
                m34622P += m34621O2;
                i12++;
            }
        } else {
            while (i12 < size) {
                Object obj = list.get(i12);
                if (obj instanceof AbstractC6799f) {
                    m34621O = CodedOutputStream.m34636h((AbstractC6799f) obj);
                } else {
                    m34621O = CodedOutputStream.m34621O((String) obj);
                }
                m34622P += m34621O;
                i12++;
            }
        }
        return m34622P;
    }

    /* renamed from: v */
    public static int m35216v(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35217w = m35217w(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35217w);
        }
        return m35217w + (size * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: w */
    public static int m35217w(List list) {
        int i11;
        int size = list.size();
        int i12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C6828r) {
            C6828r c6828r = (C6828r) list;
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34624R(c6828r.getInt(i12));
                i12++;
            }
        } else {
            i11 = 0;
            while (i12 < size) {
                i11 += CodedOutputStream.m34624R(((Integer) list.get(i12)).intValue());
                i12++;
            }
        }
        return i11;
    }

    /* renamed from: x */
    public static int m35218x(int i11, List list, boolean z11) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int m35219y = m35219y(list);
        if (z11) {
            return CodedOutputStream.m34622P(i11) + CodedOutputStream.m34654z(m35219y);
        }
        return m35219y + (size * CodedOutputStream.m34622P(i11));
    }

    /* renamed from: y */
    public static int m35219y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof AbstractC6844z) {
            if (size <= 0) {
                return 0;
            }
            throw null;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i11 += CodedOutputStream.m34626T(((Long) list.get(i12)).longValue());
        }
        return i11;
    }

    /* renamed from: z */
    private static Class m35220z() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }
}
