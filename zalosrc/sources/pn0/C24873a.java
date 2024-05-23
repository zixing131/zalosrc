package pn0;

import androidx.work.AbstractC2147g0;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ln0.AbstractC22543l;
import ln0.C22540i;
import on0.AbstractC24342w;
import p227i3.C20215s;

/* renamed from: pn0.a */
/* loaded from: classes7.dex */
public final class C24873a implements Comparable {

    /* renamed from: q */
    public static final a f119357q = new a(null);

    /* renamed from: r */
    private static final long f119358r = m129328j(0);

    /* renamed from: s */
    private static final long f119359s = AbstractC24875c.m129347b(4611686018427387903L);

    /* renamed from: t */
    private static final long f119360t = AbstractC24875c.m129347b(-4611686018427387903L);

    /* renamed from: p */
    private final long f119361p;

    /* renamed from: pn0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final long m129342a() {
            return C24873a.f119359s;
        }

        /* renamed from: b */
        public final long m129343b() {
            return C24873a.f119358r;
        }

        /* renamed from: c */
        public final long m129344c(String str) {
            long m129361p;
            AbstractC19074t.m100208f(str, "value");
            try {
                m129361p = AbstractC24875c.m129361p(str, true);
                return m129361p;
            } catch (IllegalArgumentException e11) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + str + "'.", e11);
            }
        }
    }

    static {
        long m129355j;
        long m129355j2;
        m129355j = AbstractC24875c.m129355j(4611686018427387903L);
        f119359s = m129355j;
        m129355j2 = AbstractC24875c.m129355j(-4611686018427387903L);
        f119360t = m129355j2;
    }

    private /* synthetic */ C24873a(long j11) {
        this.f119361p = j11;
    }

    /* renamed from: A */
    private static final EnumC24876d m129309A(long j11) {
        if (m129314F(j11)) {
            return EnumC24876d.f119364q;
        }
        return EnumC24876d.f119366s;
    }

    /* renamed from: B */
    private static final long m129310B(long j11) {
        return j11 >> 1;
    }

    /* renamed from: C */
    public static int m129311C(long j11) {
        return AbstractC2147g0.m11521a(j11);
    }

    /* renamed from: D */
    public static final boolean m129312D(long j11) {
        return !m129315G(j11);
    }

    /* renamed from: E */
    private static final boolean m129313E(long j11) {
        return (((int) j11) & 1) == 1;
    }

    /* renamed from: F */
    private static final boolean m129314F(long j11) {
        return (((int) j11) & 1) == 0;
    }

    /* renamed from: G */
    public static final boolean m129315G(long j11) {
        return j11 == f119359s || j11 == f119360t;
    }

    /* renamed from: H */
    public static final boolean m129316H(long j11) {
        return j11 < 0;
    }

    /* renamed from: I */
    public static final long m129317I(long j11, long j12) {
        long m129356k;
        long m129358m;
        if (m129315G(j11)) {
            if (!m129312D(j12) && (j12 ^ j11) < 0) {
                throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
            }
            return j11;
        }
        if (m129315G(j12)) {
            return j12;
        }
        if ((((int) j11) & 1) == (((int) j12) & 1)) {
            long m129310B = m129310B(j11) + m129310B(j12);
            if (m129314F(j11)) {
                m129358m = AbstractC24875c.m129358m(m129310B);
                return m129358m;
            }
            m129356k = AbstractC24875c.m129356k(m129310B);
            return m129356k;
        }
        if (m129313E(j11)) {
            return m129324d(j11, m129310B(j11), m129310B(j12));
        }
        return m129324d(j11, m129310B(j12), m129310B(j11));
    }

    /* renamed from: J */
    public static final String m129318J(long j11) {
        boolean z11;
        boolean z12;
        StringBuilder sb2 = new StringBuilder();
        if (m129316H(j11)) {
            sb2.append('-');
        }
        sb2.append("PT");
        long m129330q = m129330q(j11);
        long m129333t = m129333t(m129330q);
        int m129337x = m129337x(m129330q);
        int m129339z = m129339z(m129330q);
        int m129338y = m129338y(m129330q);
        if (m129315G(j11)) {
            m129333t = 9999999999999L;
        }
        boolean z13 = false;
        if (m129333t != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m129339z == 0 && m129338y == 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (m129337x != 0 || (z12 && z11)) {
            z13 = true;
        }
        if (z11) {
            sb2.append(m129333t);
            sb2.append('H');
        }
        if (z13) {
            sb2.append(m129337x);
            sb2.append('M');
        }
        if (z12 || (!z11 && !z13)) {
            m129325e(j11, sb2, m129339z, m129338y, 9, "S", true);
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: K */
    public static final long m129319K(long j11, EnumC24876d enumC24876d) {
        AbstractC19074t.m100208f(enumC24876d, "unit");
        if (j11 == f119359s) {
            return Long.MAX_VALUE;
        }
        if (j11 == f119360t) {
            return Long.MIN_VALUE;
        }
        return AbstractC24877e.m129368b(m129310B(j11), m129309A(j11), enumC24876d);
    }

    /* renamed from: L */
    public static String m129320L(long j11) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        if (j11 == 0) {
            return "0s";
        }
        if (j11 == f119359s) {
            return "Infinity";
        }
        if (j11 == f119360t) {
            return "-Infinity";
        }
        boolean m129316H = m129316H(j11);
        StringBuilder sb2 = new StringBuilder();
        if (m129316H) {
            sb2.append('-');
        }
        long m129330q = m129330q(j11);
        long m129332s = m129332s(m129330q);
        int m129331r = m129331r(m129330q);
        int m129337x = m129337x(m129330q);
        int m129339z = m129339z(m129330q);
        int m129338y = m129338y(m129330q);
        int i11 = 0;
        if (m129332s != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (m129331r != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (m129337x != 0) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (m129339z == 0 && m129338y == 0) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (z11) {
            sb2.append(m129332s);
            sb2.append('d');
            i11 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(m129331r);
            sb2.append('h');
            i11 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(m129337x);
            sb2.append('m');
            i11 = i13;
        }
        if (z14) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (m129339z == 0 && !z11 && !z12 && !z13) {
                if (m129338y >= 1000000) {
                    m129325e(j11, sb2, m129338y / 1000000, m129338y % 1000000, 6, "ms", false);
                } else if (m129338y >= 1000) {
                    m129325e(j11, sb2, m129338y / 1000, m129338y % 1000, 3, "us", false);
                } else {
                    sb2.append(m129338y);
                    sb2.append("ns");
                }
            } else {
                m129325e(j11, sb2, m129339z, m129338y, 9, C20215s.f99966b, false);
            }
            i11 = i14;
        }
        if (m129316H && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        String sb3 = sb2.toString();
        AbstractC19074t.m100207e(sb3, "toString(...)");
        return sb3;
    }

    /* renamed from: M */
    public static final long m129321M(long j11) {
        long m129354i;
        m129354i = AbstractC24875c.m129354i(-m129310B(j11), ((int) j11) & 1);
        return m129354i;
    }

    /* renamed from: d */
    private static final long m129324d(long j11, long j12, long j13) {
        long m129360o;
        long m116589l;
        long m129355j;
        long m129359n;
        long m129359n2;
        long m129357l;
        m129360o = AbstractC24875c.m129360o(j13);
        long j14 = j12 + m129360o;
        if (new C22540i(-4611686018426L, 4611686018426L).m116562j(j14)) {
            m129359n = AbstractC24875c.m129359n(m129360o);
            long j15 = j13 - m129359n;
            m129359n2 = AbstractC24875c.m129359n(j14);
            m129357l = AbstractC24875c.m129357l(m129359n2 + j15);
            return m129357l;
        }
        m116589l = AbstractC22543l.m116589l(j14, -4611686018427387903L, 4611686018427387903L);
        m129355j = AbstractC24875c.m129355j(m116589l);
        return m129355j;
    }

    /* renamed from: e */
    private static final void m129325e(long j11, StringBuilder sb2, int i11, int i12, int i13, String str, boolean z11) {
        String m127183l0;
        sb2.append(i11);
        if (i12 != 0) {
            sb2.append('.');
            m127183l0 = AbstractC24342w.m127183l0(String.valueOf(i12), i13, '0');
            int i14 = -1;
            int length = m127183l0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (m127183l0.charAt(length) != '0') {
                        i14 = length;
                        break;
                    } else if (i15 < 0) {
                        break;
                    } else {
                        length = i15;
                    }
                }
            }
            int i16 = i14 + 1;
            if (!z11 && i16 < 3) {
                sb2.append((CharSequence) m127183l0, 0, i16);
                AbstractC19074t.m100207e(sb2, "append(...)");
            } else {
                sb2.append((CharSequence) m127183l0, 0, ((i14 + 3) / 3) * 3);
                AbstractC19074t.m100207e(sb2, "append(...)");
            }
        }
        sb2.append(str);
    }

    /* renamed from: g */
    public static final /* synthetic */ C24873a m129326g(long j11) {
        return new C24873a(j11);
    }

    /* renamed from: i */
    public static int m129327i(long j11, long j12) {
        long j13 = j11 ^ j12;
        if (j13 >= 0 && (((int) j13) & 1) != 0) {
            int i11 = (((int) j11) & 1) - (((int) j12) & 1);
            if (m129316H(j11)) {
                return -i11;
            }
            return i11;
        }
        return AbstractC19074t.m100210h(j11, j12);
    }

    /* renamed from: j */
    public static long m129328j(long j11) {
        if (AbstractC24874b.m129345a()) {
            if (m129314F(j11)) {
                if (!new C22540i(-4611686018426999999L, 4611686018426999999L).m116562j(m129310B(j11))) {
                    throw new AssertionError(m129310B(j11) + " ns is out of nanoseconds range");
                }
            } else if (new C22540i(-4611686018427387903L, 4611686018427387903L).m116562j(m129310B(j11))) {
                if (new C22540i(-4611686018426L, 4611686018426L).m116562j(m129310B(j11))) {
                    throw new AssertionError(m129310B(j11) + " ms is denormalized");
                }
            } else {
                throw new AssertionError(m129310B(j11) + " ms is out of milliseconds range");
            }
        }
        return j11;
    }

    /* renamed from: m */
    public static boolean m129329m(long j11, Object obj) {
        return (obj instanceof C24873a) && j11 == ((C24873a) obj).m129340N();
    }

    /* renamed from: q */
    public static final long m129330q(long j11) {
        if (m129316H(j11)) {
            return m129321M(j11);
        }
        return j11;
    }

    /* renamed from: r */
    public static final int m129331r(long j11) {
        if (m129315G(j11)) {
            return 0;
        }
        return (int) (m129333t(j11) % 24);
    }

    /* renamed from: s */
    public static final long m129332s(long j11) {
        return m129319K(j11, EnumC24876d.f119370w);
    }

    /* renamed from: t */
    public static final long m129333t(long j11) {
        return m129319K(j11, EnumC24876d.f119369v);
    }

    /* renamed from: u */
    public static final long m129334u(long j11) {
        if (m129313E(j11) && m129312D(j11)) {
            return m129310B(j11);
        }
        return m129319K(j11, EnumC24876d.f119366s);
    }

    /* renamed from: v */
    public static final long m129335v(long j11) {
        return m129319K(j11, EnumC24876d.f119368u);
    }

    /* renamed from: w */
    public static final long m129336w(long j11) {
        return m129319K(j11, EnumC24876d.f119367t);
    }

    /* renamed from: x */
    public static final int m129337x(long j11) {
        if (m129315G(j11)) {
            return 0;
        }
        return (int) (m129335v(j11) % 60);
    }

    /* renamed from: y */
    public static final int m129338y(long j11) {
        long m129310B;
        if (m129315G(j11)) {
            return 0;
        }
        if (m129313E(j11)) {
            m129310B = AbstractC24875c.m129359n(m129310B(j11) % 1000);
        } else {
            m129310B = m129310B(j11) % 1000000000;
        }
        return (int) m129310B;
    }

    /* renamed from: z */
    public static final int m129339z(long j11) {
        if (m129315G(j11)) {
            return 0;
        }
        return (int) (m129336w(j11) % 60);
    }

    /* renamed from: N */
    public final /* synthetic */ long m129340N() {
        return this.f119361p;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m129341h(((C24873a) obj).m129340N());
    }

    public boolean equals(Object obj) {
        return m129329m(this.f119361p, obj);
    }

    /* renamed from: h */
    public int m129341h(long j11) {
        return m129327i(this.f119361p, j11);
    }

    public int hashCode() {
        return m129311C(this.f119361p);
    }

    public String toString() {
        return m129320L(this.f119361p);
    }
}
