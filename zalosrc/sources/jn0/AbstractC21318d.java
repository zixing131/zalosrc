package jn0;

import fn0.AbstractC19074t;
import ln0.C22537f;

/* renamed from: jn0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC21318d {
    /* renamed from: a */
    public static final AbstractC21317c m110381a(long j11) {
        return new C21319e((int) j11, (int) (j11 >> 32));
    }

    /* renamed from: b */
    public static final String m110382b(Object obj, Object obj2) {
        AbstractC19074t.m100208f(obj, "from");
        AbstractC19074t.m100208f(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    /* renamed from: c */
    public static final void m110383c(int i11, int i12) {
        if (i12 > i11) {
        } else {
            throw new IllegalArgumentException(m110382b(Integer.valueOf(i11), Integer.valueOf(i12)).toString());
        }
    }

    /* renamed from: d */
    public static final void m110384d(long j11, long j12) {
        if (j12 > j11) {
        } else {
            throw new IllegalArgumentException(m110382b(Long.valueOf(j11), Long.valueOf(j12)).toString());
        }
    }

    /* renamed from: e */
    public static final int m110385e(int i11) {
        return 31 - Integer.numberOfLeadingZeros(i11);
    }

    /* renamed from: f */
    public static final int m110386f(AbstractC21317c abstractC21317c, C22537f c22537f) {
        AbstractC19074t.m100208f(abstractC21317c, "<this>");
        AbstractC19074t.m100208f(c22537f, "range");
        if (!c22537f.isEmpty()) {
            if (c22537f.m116548e() < Integer.MAX_VALUE) {
                return abstractC21317c.mo110378f(c22537f.m116547d(), c22537f.m116548e() + 1);
            }
            if (c22537f.m116547d() > Integer.MIN_VALUE) {
                return abstractC21317c.mo110378f(c22537f.m116547d() - 1, c22537f.m116548e()) + 1;
            }
            return abstractC21317c.mo110372d();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c22537f);
    }

    /* renamed from: g */
    public static final int m110387g(int i11, int i12) {
        return (i11 >>> (32 - i12)) & ((-i12) >> 31);
    }
}
