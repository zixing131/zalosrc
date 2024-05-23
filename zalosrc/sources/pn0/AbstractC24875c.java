package pn0;

import fn0.AbstractC19074t;
import hn0.AbstractC20104d;
import java.util.Collection;
import java.util.Iterator;
import ln0.AbstractC22543l;
import ln0.C22534c;
import ln0.C22537f;
import ln0.C22540i;
import on0.AbstractC24341v;
import on0.AbstractC24342w;
import on0.AbstractC24344y;
import pn0.C24873a;
import qm0.AbstractC25351j0;

/* renamed from: pn0.c */
/* loaded from: classes7.dex */
public abstract class AbstractC24875c {
    /* renamed from: i */
    public static final long m129354i(long j11, int i11) {
        return C24873a.m129328j((j11 << 1) + i11);
    }

    /* renamed from: j */
    public static final long m129355j(long j11) {
        return C24873a.m129328j((j11 << 1) + 1);
    }

    /* renamed from: k */
    public static final long m129356k(long j11) {
        long m116589l;
        if (!new C22540i(-4611686018426L, 4611686018426L).m116562j(j11)) {
            m116589l = AbstractC22543l.m116589l(j11, -4611686018427387903L, 4611686018427387903L);
            return m129355j(m116589l);
        }
        return m129357l(m129359n(j11));
    }

    /* renamed from: l */
    public static final long m129357l(long j11) {
        return C24873a.m129328j(j11 << 1);
    }

    /* renamed from: m */
    public static final long m129358m(long j11) {
        if (new C22540i(-4611686018426999999L, 4611686018426999999L).m116562j(j11)) {
            return m129357l(j11);
        }
        return m129355j(m129360o(j11));
    }

    /* renamed from: n */
    public static final long m129359n(long j11) {
        return j11 * 1000000;
    }

    /* renamed from: o */
    public static final long m129360o(long j11) {
        return j11 / 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m129361p(String str, boolean z11) {
        boolean z12;
        boolean m127129y;
        boolean z13;
        long j11;
        boolean z14;
        int m127172a0;
        char m127208g1;
        int m127163V;
        int m127172a02;
        int i11;
        boolean m127147N;
        boolean m127137G0;
        int length = str.length();
        if (length != 0) {
            C24873a.a aVar = C24873a.f119357q;
            long m129343b = aVar.m129343b();
            char charAt = str.charAt(0);
            int i12 = (charAt == '+' || charAt == '-') ? 1 : 0;
            boolean z15 = i12 > 0;
            if (z15) {
                m127137G0 = AbstractC24342w.m127137G0(str, '-', false, 2, null);
                if (m127137G0) {
                    z12 = true;
                    if (length <= i12) {
                        char c11 = '9';
                        char c12 = '0';
                        if (str.charAt(i12) == 'P') {
                            int i13 = i12 + 1;
                            if (i13 == length) {
                                throw new IllegalArgumentException();
                            }
                            boolean z16 = false;
                            EnumC24876d enumC24876d = null;
                            while (i13 < length) {
                                if (str.charAt(i13) != 'T') {
                                    int i14 = i13;
                                    while (i14 < str.length()) {
                                        char charAt2 = str.charAt(i14);
                                        if (!new C22534c(c12, c11).m116546j(charAt2)) {
                                            m127147N = AbstractC24342w.m127147N("+-.", charAt2, false, 2, null);
                                            if (!m127147N) {
                                                break;
                                            }
                                        }
                                        i14++;
                                        c12 = '0';
                                        c11 = '9';
                                    }
                                    AbstractC19074t.m100206d(str, "null cannot be cast to non-null type java.lang.String");
                                    String substring = str.substring(i13, i14);
                                    AbstractC19074t.m100207e(substring, "substring(...)");
                                    if (substring.length() != 0) {
                                        int length2 = i13 + substring.length();
                                        if (length2 >= 0) {
                                            m127163V = AbstractC24342w.m127163V(str);
                                            if (length2 <= m127163V) {
                                                char charAt3 = str.charAt(length2);
                                                int i15 = length2 + 1;
                                                EnumC24876d m129370d = AbstractC24878f.m129370d(charAt3, z16);
                                                if (enumC24876d != null && enumC24876d.compareTo(m129370d) <= 0) {
                                                    throw new IllegalArgumentException("Unexpected order of duration components");
                                                }
                                                m127172a02 = AbstractC24342w.m127172a0(substring, '.', 0, false, 6, null);
                                                if (m129370d == EnumC24876d.f119367t && m127172a02 > 0) {
                                                    AbstractC19074t.m100206d(substring, "null cannot be cast to non-null type java.lang.String");
                                                    String substring2 = substring.substring(0, m127172a02);
                                                    AbstractC19074t.m100207e(substring2, "substring(...)");
                                                    i11 = i15;
                                                    long m129317I = C24873a.m129317I(m129343b, m129364s(m129362q(substring2), m129370d));
                                                    AbstractC19074t.m100206d(substring, "null cannot be cast to non-null type java.lang.String");
                                                    String substring3 = substring.substring(m127172a02);
                                                    AbstractC19074t.m100207e(substring3, "substring(...)");
                                                    m129343b = C24873a.m129317I(m129317I, m129363r(Double.parseDouble(substring3), m129370d));
                                                } else {
                                                    i11 = i15;
                                                    m129343b = C24873a.m129317I(m129343b, m129364s(m129362q(substring), m129370d));
                                                }
                                                i13 = i11;
                                                enumC24876d = m129370d;
                                                c12 = '0';
                                                c11 = '9';
                                            }
                                        }
                                        throw new IllegalArgumentException("Missing unit for value " + substring);
                                    }
                                    throw new IllegalArgumentException();
                                }
                                if (z16 || (i13 = i13 + 1) == length) {
                                    throw new IllegalArgumentException();
                                }
                                z16 = true;
                            }
                        } else if (!z11) {
                            String str2 = "Unexpected order of duration components";
                            char c13 = '9';
                            m127129y = AbstractC24341v.m127129y(str, i12, "Infinity", 0, Math.max(length - i12, 8), true);
                            if (m127129y) {
                                m129343b = aVar.m129342a();
                            } else {
                                boolean z17 = !z15;
                                if (z15 && str.charAt(i12) == '(') {
                                    m127208g1 = AbstractC24344y.m127208g1(str);
                                    if (m127208g1 == ')') {
                                        i12++;
                                        length--;
                                        if (i12 == length) {
                                            throw new IllegalArgumentException("No components");
                                        }
                                        j11 = m129343b;
                                        z14 = false;
                                        z13 = true;
                                        EnumC24876d enumC24876d2 = null;
                                        while (i12 < length) {
                                            if (z14 && z13) {
                                                while (i12 < str.length() && str.charAt(i12) == ' ') {
                                                    i12++;
                                                }
                                            }
                                            int i16 = i12;
                                            while (i16 < str.length()) {
                                                char charAt4 = str.charAt(i16);
                                                if (!new C22534c('0', c13).m116546j(charAt4) && charAt4 != '.') {
                                                    break;
                                                }
                                                i16++;
                                            }
                                            AbstractC19074t.m100206d(str, "null cannot be cast to non-null type java.lang.String");
                                            String substring4 = str.substring(i12, i16);
                                            AbstractC19074t.m100207e(substring4, "substring(...)");
                                            if (substring4.length() != 0) {
                                                int length3 = i12 + substring4.length();
                                                int i17 = length3;
                                                while (i17 < str.length()) {
                                                    if (!new C22534c('a', 'z').m116546j(str.charAt(i17))) {
                                                        break;
                                                    }
                                                    i17++;
                                                }
                                                AbstractC19074t.m100206d(str, "null cannot be cast to non-null type java.lang.String");
                                                String substring5 = str.substring(length3, i17);
                                                AbstractC19074t.m100207e(substring5, "substring(...)");
                                                i12 = length3 + substring5.length();
                                                EnumC24876d m129371e = AbstractC24878f.m129371e(substring5);
                                                if (enumC24876d2 != null && enumC24876d2.compareTo(m129371e) <= 0) {
                                                    throw new IllegalArgumentException(str2);
                                                }
                                                String str3 = str2;
                                                m127172a0 = AbstractC24342w.m127172a0(substring4, '.', 0, false, 6, null);
                                                if (m127172a0 > 0) {
                                                    AbstractC19074t.m100206d(substring4, "null cannot be cast to non-null type java.lang.String");
                                                    String substring6 = substring4.substring(0, m127172a0);
                                                    AbstractC19074t.m100207e(substring6, "substring(...)");
                                                    long m129317I2 = C24873a.m129317I(j11, m129364s(Long.parseLong(substring6), m129371e));
                                                    AbstractC19074t.m100206d(substring4, "null cannot be cast to non-null type java.lang.String");
                                                    String substring7 = substring4.substring(m127172a0);
                                                    AbstractC19074t.m100207e(substring7, "substring(...)");
                                                    j11 = C24873a.m129317I(m129317I2, m129363r(Double.parseDouble(substring7), m129371e));
                                                    if (i12 < length) {
                                                        throw new IllegalArgumentException("Fractional component must be last");
                                                    }
                                                } else {
                                                    j11 = C24873a.m129317I(j11, m129364s(Long.parseLong(substring4), m129371e));
                                                }
                                                str2 = str3;
                                                enumC24876d2 = m129371e;
                                                z14 = true;
                                                c13 = '9';
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        }
                                        m129343b = j11;
                                    }
                                }
                                z13 = z17;
                                j11 = m129343b;
                                z14 = false;
                                EnumC24876d enumC24876d22 = null;
                                while (i12 < length) {
                                }
                                m129343b = j11;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                        return z12 ? C24873a.m129321M(m129343b) : m129343b;
                    }
                    throw new IllegalArgumentException("No components");
                }
            }
            z12 = false;
            if (length <= i12) {
            }
        } else {
            throw new IllegalArgumentException("The string is empty");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final long m129362q(String str) {
        int i11;
        boolean m127120J;
        int m127163V;
        boolean m127147N;
        int length = str.length();
        if (length > 0) {
            m127147N = AbstractC24342w.m127147N("+-", str.charAt(0), false, 2, null);
            if (m127147N) {
                i11 = 1;
                if (length - i11 > 16) {
                    m127163V = AbstractC24342w.m127163V(str);
                    Iterable c22537f = new C22537f(i11, m127163V);
                    if (!(c22537f instanceof Collection) || !((Collection) c22537f).isEmpty()) {
                        Iterator it = c22537f.iterator();
                        while (it.hasNext()) {
                            if (!new C22534c('0', '9').m116546j(str.charAt(((AbstractC25351j0) it).mo116552a()))) {
                            }
                        }
                    }
                    if (str.charAt(0) == '-') {
                        return Long.MIN_VALUE;
                    }
                    return Long.MAX_VALUE;
                }
                m127120J = AbstractC24341v.m127120J(str, "+", false, 2, null);
                if (m127120J) {
                    str = AbstractC24344y.m127202a1(str, 1);
                }
                return Long.parseLong(str);
            }
        }
        i11 = 0;
        if (length - i11 > 16) {
        }
        m127120J = AbstractC24341v.m127120J(str, "+", false, 2, null);
        if (m127120J) {
        }
        return Long.parseLong(str);
    }

    /* renamed from: r */
    public static final long m129363r(double d11, EnumC24876d enumC24876d) {
        long m104530f;
        long m104530f2;
        AbstractC19074t.m100208f(enumC24876d, "unit");
        double m129367a = AbstractC24877e.m129367a(d11, enumC24876d, EnumC24876d.f119364q);
        if (!Double.isNaN(m129367a)) {
            m104530f = AbstractC20104d.m104530f(m129367a);
            if (!new C22540i(-4611686018426999999L, 4611686018426999999L).m116562j(m104530f)) {
                m104530f2 = AbstractC20104d.m104530f(AbstractC24877e.m129367a(d11, enumC24876d, EnumC24876d.f119366s));
                return m129356k(m104530f2);
            }
            return m129357l(m104530f);
        }
        throw new IllegalArgumentException("Duration value cannot be NaN.".toString());
    }

    /* renamed from: s */
    public static final long m129364s(long j11, EnumC24876d enumC24876d) {
        long m116589l;
        AbstractC19074t.m100208f(enumC24876d, "unit");
        EnumC24876d enumC24876d2 = EnumC24876d.f119364q;
        long m129369c = AbstractC24877e.m129369c(4611686018426999999L, enumC24876d2, enumC24876d);
        if (!new C22540i(-m129369c, m129369c).m116562j(j11)) {
            m116589l = AbstractC22543l.m116589l(AbstractC24877e.m129368b(j11, enumC24876d, EnumC24876d.f119366s), -4611686018427387903L, 4611686018427387903L);
            return m129355j(m116589l);
        }
        return m129357l(AbstractC24877e.m129369c(j11, enumC24876d, enumC24876d2));
    }
}
