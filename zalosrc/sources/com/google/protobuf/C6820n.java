package com.google.protobuf;

import com.google.protobuf.AbstractC6810i1;
import com.google.protobuf.AbstractC6830s;
import com.zing.zalo.zinstant.zom.node.ZOM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p664y.AbstractC30228a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.protobuf.n */
/* loaded from: classes3.dex */
public final class C6820n {

    /* renamed from: d */
    private static final C6820n f37383d = new C6820n(true);

    /* renamed from: a */
    private final AbstractC6845z0 f37384a;

    /* renamed from: b */
    private boolean f37385b;

    /* renamed from: c */
    private boolean f37386c;

    /* renamed from: com.google.protobuf.n$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f37387a;

        /* renamed from: b */
        static final /* synthetic */ int[] f37388b;

        static {
            int[] iArr = new int[AbstractC6810i1.b.values().length];
            f37388b = iArr;
            try {
                iArr[AbstractC6810i1.b.f37329r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37330s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37331t.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37332u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37333v.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37334w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37335x.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37336y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37319A.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37320B.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37337z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37321C.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37322D.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37324F.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37325G.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37326H.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37327I.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37388b[AbstractC6810i1.b.f37323E.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[AbstractC6810i1.c.values().length];
            f37387a = iArr2;
            try {
                iArr2[AbstractC6810i1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f37387a[AbstractC6810i1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f37387a[AbstractC6810i1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f37387a[AbstractC6810i1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f37387a[AbstractC6810i1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f37387a[AbstractC6810i1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f37387a[AbstractC6810i1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f37387a[AbstractC6810i1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f37387a[AbstractC6810i1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* renamed from: com.google.protobuf.n$b */
    /* loaded from: classes3.dex */
    public interface b extends Comparable {
        /* renamed from: a */
        int m35080a();

        /* renamed from: k */
        boolean m35081k();

        /* renamed from: l */
        AbstractC6810i1.b m35082l();

        /* renamed from: p */
        boolean m35083p();
    }

    private C6820n() {
        this.f37384a = AbstractC6845z0.m35230t(16);
    }

    /* renamed from: b */
    public static int m35058b(AbstractC6810i1.b bVar, int i11, Object obj) {
        int m34622P = CodedOutputStream.m34622P(i11);
        if (bVar == AbstractC6810i1.b.f37319A) {
            m34622P *= 2;
        }
        return m34622P + m35059c(bVar, obj);
    }

    /* renamed from: c */
    static int m35059c(AbstractC6810i1.b bVar, Object obj) {
        switch (a.f37388b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m34638j(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m34646r(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m34653y(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m34626T(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m34651w(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m34644p(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m34642n(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m34633e(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m34648t((InterfaceC6809i0) obj);
            case 10:
                return CodedOutputStream.m34608B((InterfaceC6809i0) obj);
            case 11:
                if (obj instanceof AbstractC6799f) {
                    return CodedOutputStream.m34636h((AbstractC6799f) obj);
                }
                return CodedOutputStream.m34621O((String) obj);
            case 12:
                if (obj instanceof AbstractC6799f) {
                    return CodedOutputStream.m34636h((AbstractC6799f) obj);
                }
                return CodedOutputStream.m34634f((byte[]) obj);
            case 13:
                return CodedOutputStream.m34624R(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.m34613G(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m34615I(((Long) obj).longValue());
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                return CodedOutputStream.m34617K(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.m34619M(((Long) obj).longValue());
            case 18:
                if (obj instanceof AbstractC6830s.a) {
                    return CodedOutputStream.m34640l(((AbstractC6830s.a) obj).mo35139a());
                }
                return CodedOutputStream.m34640l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: d */
    public static int m35060d(b bVar, Object obj) {
        AbstractC6810i1.b m35082l = bVar.m35082l();
        int m35080a = bVar.m35080a();
        if (bVar.m35081k()) {
            int i11 = 0;
            if (bVar.m35083p()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    i11 += m35059c(m35082l, it.next());
                }
                return CodedOutputStream.m34622P(m35080a) + i11 + CodedOutputStream.m34611E(i11);
            }
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                i11 += m35058b(m35082l, m35080a, it2.next());
            }
            return i11;
        }
        return m35058b(m35082l, m35080a, obj);
    }

    /* renamed from: g */
    private int m35061g(Map.Entry entry) {
        AbstractC30228a.m149044a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: i */
    static int m35062i(AbstractC6810i1.b bVar, boolean z11) {
        if (z11) {
            return 2;
        }
        return bVar.m34985c();
    }

    /* renamed from: l */
    private static boolean m35063l(Map.Entry entry) {
        AbstractC30228a.m149044a(entry.getKey());
        throw null;
    }

    /* renamed from: m */
    private static boolean m35064m(AbstractC6810i1.b bVar, Object obj) {
        AbstractC6830s.m35129a(obj);
        switch (a.f37387a[bVar.m34984b().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                if ((obj instanceof AbstractC6799f) || (obj instanceof byte[])) {
                    return true;
                }
                return false;
            case 8:
                if ((obj instanceof Integer) || (obj instanceof AbstractC6830s.a)) {
                    return true;
                }
                return false;
            case 9:
                return obj instanceof InterfaceC6809i0;
            default:
                return false;
        }
    }

    /* renamed from: q */
    private void m35065q(Map.Entry entry) {
        AbstractC30228a.m149044a(entry.getKey());
        entry.getValue();
        throw null;
    }

    /* renamed from: r */
    public static C6820n m35066r() {
        return new C6820n();
    }

    /* renamed from: t */
    private void m35067t(b bVar, Object obj) {
        if (m35064m(bVar.m35082l(), obj)) {
        } else {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(bVar.m35080a()), bVar.m35082l().m34984b(), obj.getClass().getName()));
        }
    }

    /* renamed from: u */
    public static void m35068u(CodedOutputStream codedOutputStream, AbstractC6810i1.b bVar, int i11, Object obj) {
        if (bVar == AbstractC6810i1.b.f37319A) {
            codedOutputStream.m34696s0(i11, (InterfaceC6809i0) obj);
        } else {
            codedOutputStream.mo34669O0(i11, m35062i(bVar, false));
            m35069v(codedOutputStream, bVar, obj);
        }
    }

    /* renamed from: v */
    static void m35069v(CodedOutputStream codedOutputStream, AbstractC6810i1.b bVar, Object obj) {
        switch (a.f37388b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.m34687j0(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.m34695r0(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.m34703z0(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo34673S0(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo34701x0(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo34693p0(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo34691n0(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.m34681d0(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.m34698u0((InterfaceC6809i0) obj);
                return;
            case 10:
                codedOutputStream.mo34656B0((InterfaceC6809i0) obj);
                return;
            case 11:
                if (obj instanceof AbstractC6799f) {
                    codedOutputStream.mo34685h0((AbstractC6799f) obj);
                    return;
                } else {
                    codedOutputStream.mo34668N0((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof AbstractC6799f) {
                    codedOutputStream.mo34685h0((AbstractC6799f) obj);
                    return;
                } else {
                    codedOutputStream.m34682e0((byte[]) obj);
                    return;
                }
            case 13:
                codedOutputStream.mo34671Q0(((Integer) obj).intValue());
                return;
            case 14:
                codedOutputStream.m34660F0(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.m34662H0(((Long) obj).longValue());
                return;
            case ZOM.FLAG_CHILDREN_CHANGE /* 16 */:
                codedOutputStream.m34664J0(((Integer) obj).intValue());
                return;
            case 17:
                codedOutputStream.m34666L0(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof AbstractC6830s.a) {
                    codedOutputStream.m34689l0(((AbstractC6830s.a) obj).mo35139a());
                    return;
                } else {
                    codedOutputStream.m34689l0(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public C6820n clone() {
        C6820n m35066r = m35066r();
        for (int i11 = 0; i11 < this.f37384a.m35234l(); i11++) {
            Map.Entry m35233k = this.f37384a.m35233k(i11);
            AbstractC30228a.m149044a(m35233k.getKey());
            m35066r.m35079s(null, m35233k.getValue());
        }
        for (Map.Entry entry : this.f37384a.m35236o()) {
            AbstractC30228a.m149044a(entry.getKey());
            m35066r.m35079s(null, entry.getValue());
        }
        m35066r.f37386c = this.f37386c;
        return m35066r;
    }

    /* renamed from: e */
    public Iterator m35071e() {
        if (this.f37386c) {
            return new C6836v(this.f37384a.m35232h().iterator());
        }
        return this.f37384a.m35232h().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6820n)) {
            return false;
        }
        return this.f37384a.equals(((C6820n) obj).f37384a);
    }

    /* renamed from: f */
    public int m35072f() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37384a.m35234l(); i12++) {
            i11 += m35061g(this.f37384a.m35233k(i12));
        }
        Iterator it = this.f37384a.m35236o().iterator();
        while (it.hasNext()) {
            i11 += m35061g((Map.Entry) it.next());
        }
        return i11;
    }

    /* renamed from: h */
    public int m35073h() {
        int i11 = 0;
        for (int i12 = 0; i12 < this.f37384a.m35234l(); i12++) {
            Map.Entry m35233k = this.f37384a.m35233k(i12);
            AbstractC30228a.m149044a(m35233k.getKey());
            i11 += m35060d(null, m35233k.getValue());
        }
        for (Map.Entry entry : this.f37384a.m35236o()) {
            AbstractC30228a.m149044a(entry.getKey());
            i11 += m35060d(null, entry.getValue());
        }
        return i11;
    }

    public int hashCode() {
        return this.f37384a.hashCode();
    }

    /* renamed from: j */
    public boolean m35074j() {
        return this.f37384a.isEmpty();
    }

    /* renamed from: k */
    public boolean m35075k() {
        for (int i11 = 0; i11 < this.f37384a.m35234l(); i11++) {
            if (!m35063l(this.f37384a.m35233k(i11))) {
                return false;
            }
        }
        Iterator it = this.f37384a.m35236o().iterator();
        while (it.hasNext()) {
            if (!m35063l((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public Iterator m35076n() {
        if (this.f37386c) {
            return new C6836v(this.f37384a.entrySet().iterator());
        }
        return this.f37384a.entrySet().iterator();
    }

    /* renamed from: o */
    public void m35077o() {
        if (this.f37385b) {
            return;
        }
        this.f37384a.mo35238r();
        this.f37385b = true;
    }

    /* renamed from: p */
    public void m35078p(C6820n c6820n) {
        for (int i11 = 0; i11 < c6820n.f37384a.m35234l(); i11++) {
            m35065q(c6820n.f37384a.m35233k(i11));
        }
        Iterator it = c6820n.f37384a.m35236o().iterator();
        while (it.hasNext()) {
            m35065q((Map.Entry) it.next());
        }
    }

    /* renamed from: s */
    public void m35079s(b bVar, Object obj) {
        if (bVar.m35081k()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m35067t(bVar, it.next());
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            m35067t(bVar, obj);
        }
        this.f37384a.m35239u(bVar, obj);
    }

    private C6820n(boolean z11) {
        this(AbstractC6845z0.m35230t(0));
        m35077o();
    }

    private C6820n(AbstractC6845z0 abstractC6845z0) {
        this.f37384a = abstractC6845z0;
        m35077o();
    }
}
