package on0;

import fn0.AbstractC19074t;
import kotlin.KotlinNothingValueException;
import pm0.C24838b0;
import pm0.C24844e0;
import pm0.C24867x;
import pm0.C24869z;

/* renamed from: on0.d0 */
/* loaded from: classes7.dex */
public abstract class AbstractC24322d0 {
    /* renamed from: a */
    public static final String m126982a(int i11, int i12) {
        int m126975a;
        long j11 = i11 & 4294967295L;
        m126975a = AbstractC24317b.m126975a(i12);
        String l11 = Long.toString(j11, m126975a);
        AbstractC19074t.m100207e(l11, "toString(...)");
        return l11;
    }

    /* renamed from: b */
    public static final byte m126983b(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        C24867x m126984c = m126984c(str);
        if (m126984c != null) {
            return m126984c.m129241h();
        }
        AbstractC24340u.m127106l(str);
        throw new KotlinNothingValueException();
    }

    /* renamed from: c */
    public static final C24867x m126984c(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m126985d(str, 10);
    }

    /* renamed from: d */
    public static final C24867x m126985d(String str, int i11) {
        int compare;
        AbstractC19074t.m100208f(str, "<this>");
        C24869z m126988g = m126988g(str, i11);
        if (m126988g == null) {
            return null;
        }
        int m129264h = m126988g.m129264h();
        compare = Integer.compare(m129264h ^ Integer.MIN_VALUE, C24869z.m129260c(255) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return C24867x.m129236b(C24867x.m129237c((byte) m129264h));
    }

    /* renamed from: e */
    public static final int m126986e(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        C24869z m126987f = m126987f(str);
        if (m126987f != null) {
            return m126987f.m129264h();
        }
        AbstractC24340u.m127106l(str);
        throw new KotlinNothingValueException();
    }

    /* renamed from: f */
    public static final C24869z m126987f(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m126988g(str, 10);
    }

    /* renamed from: g */
    public static final C24869z m126988g(String str, int i11) {
        int i12;
        int compare;
        int compare2;
        int compare3;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC24317b.m126975a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i13 = 0;
        char charAt = str.charAt(0);
        if (AbstractC19074t.m100209g(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        } else {
            i12 = 0;
        }
        int m129260c = C24869z.m129260c(i11);
        int i14 = 119304647;
        while (i12 < length) {
            int m126976b = AbstractC24317b.m126976b(str.charAt(i12), i11);
            if (m126976b >= 0) {
                compare = Integer.compare(i13 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE);
                if (compare > 0) {
                    if (i14 == 119304647) {
                        i14 = AbstractC24320c0.m126981a(-1, m129260c);
                        compare3 = Integer.compare(i13 ^ Integer.MIN_VALUE, i14 ^ Integer.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                int m129260c2 = C24869z.m129260c(i13 * m129260c);
                int m129260c3 = C24869z.m129260c(C24869z.m129260c(m126976b) + m129260c2);
                compare2 = Integer.compare(m129260c3 ^ Integer.MIN_VALUE, m129260c2 ^ Integer.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i12++;
                i13 = m129260c3;
            } else {
                return null;
            }
        }
        return C24869z.m129259b(i13);
    }

    /* renamed from: h */
    public static final long m126989h(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        C24838b0 m126990i = m126990i(str);
        if (m126990i != null) {
            return m126990i.m129154h();
        }
        AbstractC24340u.m127106l(str);
        throw new KotlinNothingValueException();
    }

    /* renamed from: i */
    public static final C24838b0 m126990i(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m126991j(str, 10);
    }

    /* renamed from: j */
    public static final C24838b0 m126991j(String str, int i11) {
        int compare;
        int compare2;
        int compare3;
        AbstractC19074t.m100208f(str, "<this>");
        AbstractC24317b.m126975a(i11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i12 = 0;
        char charAt = str.charAt(0);
        if (AbstractC19074t.m100209g(charAt, 48) < 0) {
            i12 = 1;
            if (length == 1 || charAt != '+') {
                return null;
            }
        }
        long m129150c = C24838b0.m129150c(i11);
        long j11 = 0;
        long j12 = 512409557603043100L;
        while (i12 < length) {
            if (AbstractC24317b.m126976b(str.charAt(i12), i11) >= 0) {
                compare = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
                if (compare > 0) {
                    if (j12 == 512409557603043100L) {
                        j12 = AbstractC24318b0.m126978a(-1L, m129150c);
                        compare3 = Long.compare(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
                        if (compare3 > 0) {
                        }
                    }
                    return null;
                }
                long m129150c2 = C24838b0.m129150c(j11 * m129150c);
                long m129150c3 = C24838b0.m129150c(C24838b0.m129150c(C24869z.m129260c(r13) & 4294967295L) + m129150c2);
                compare2 = Long.compare(m129150c3 ^ Long.MIN_VALUE, m129150c2 ^ Long.MIN_VALUE);
                if (compare2 < 0) {
                    return null;
                }
                i12++;
                j11 = m129150c3;
            } else {
                return null;
            }
        }
        return C24838b0.m129149b(j11);
    }

    /* renamed from: k */
    public static final short m126992k(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        C24844e0 m126993l = m126993l(str);
        if (m126993l != null) {
            return m126993l.m129181h();
        }
        AbstractC24340u.m127106l(str);
        throw new KotlinNothingValueException();
    }

    /* renamed from: l */
    public static final C24844e0 m126993l(String str) {
        AbstractC19074t.m100208f(str, "<this>");
        return m126994m(str, 10);
    }

    /* renamed from: m */
    public static final C24844e0 m126994m(String str, int i11) {
        int compare;
        AbstractC19074t.m100208f(str, "<this>");
        C24869z m126988g = m126988g(str, i11);
        if (m126988g == null) {
            return null;
        }
        int m129264h = m126988g.m129264h();
        compare = Integer.compare(m129264h ^ Integer.MIN_VALUE, C24869z.m129260c(65535) ^ Integer.MIN_VALUE);
        if (compare > 0) {
            return null;
        }
        return C24844e0.m129176b(C24844e0.m129177c((short) m129264h));
    }
}
