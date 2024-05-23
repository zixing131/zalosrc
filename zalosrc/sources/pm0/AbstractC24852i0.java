package pm0;

import fn0.AbstractC19074t;
import on0.AbstractC24317b;

/* renamed from: pm0.i0 */
/* loaded from: classes7.dex */
public abstract class AbstractC24852i0 {
    /* renamed from: a */
    public static final int m129203a(int i11, int i12) {
        return AbstractC19074t.m100209g(i11 ^ Integer.MIN_VALUE, i12 ^ Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public static final int m129204b(long j11, long j12) {
        return AbstractC19074t.m100210h(j11 ^ Long.MIN_VALUE, j12 ^ Long.MIN_VALUE);
    }

    /* renamed from: c */
    public static final String m129205c(long j11) {
        return m129206d(j11, 10);
    }

    /* renamed from: d */
    public static final String m129206d(long j11, int i11) {
        int m126975a;
        int m126975a2;
        int m126975a3;
        if (j11 >= 0) {
            m126975a3 = AbstractC24317b.m126975a(i11);
            String l11 = Long.toString(j11, m126975a3);
            AbstractC19074t.m100207e(l11, "toString(...)");
            return l11;
        }
        long j12 = i11;
        long j13 = ((j11 >>> 1) / j12) << 1;
        long j14 = j11 - (j13 * j12);
        if (j14 >= j12) {
            j14 -= j12;
            j13++;
        }
        StringBuilder sb2 = new StringBuilder();
        m126975a = AbstractC24317b.m126975a(i11);
        String l12 = Long.toString(j13, m126975a);
        AbstractC19074t.m100207e(l12, "toString(...)");
        sb2.append(l12);
        m126975a2 = AbstractC24317b.m126975a(i11);
        String l13 = Long.toString(j14, m126975a2);
        AbstractC19074t.m100207e(l13, "toString(...)");
        sb2.append(l13);
        return sb2.toString();
    }
}
