package ln0;

import fn0.AbstractC19074t;
import java.util.NoSuchElementException;
import jn0.AbstractC21317c;
import jn0.AbstractC21318d;
import ln0.C22535d;

/* renamed from: ln0.l */
/* loaded from: classes.dex */
public abstract class AbstractC22543l extends AbstractC22542k {
    /* renamed from: b */
    public static float m116579b(float f11, float f12) {
        return f11 < f12 ? f12 : f11;
    }

    /* renamed from: c */
    public static int m116580c(int i11, int i12) {
        return i11 < i12 ? i12 : i11;
    }

    /* renamed from: d */
    public static long m116581d(long j11, long j12) {
        return j11 < j12 ? j12 : j11;
    }

    /* renamed from: e */
    public static double m116582e(double d11, double d12) {
        return d11 > d12 ? d12 : d11;
    }

    /* renamed from: f */
    public static float m116583f(float f11, float f12) {
        return f11 > f12 ? f12 : f11;
    }

    /* renamed from: g */
    public static int m116584g(int i11, int i12) {
        return i11 > i12 ? i12 : i11;
    }

    /* renamed from: h */
    public static long m116585h(long j11, long j12) {
        return j11 > j12 ? j12 : j11;
    }

    /* renamed from: i */
    public static double m116586i(double d11, double d12, double d13) {
        if (d12 <= d13) {
            if (d11 < d12) {
                return d12;
            }
            if (d11 > d13) {
                return d13;
            }
            return d11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d13 + " is less than minimum " + d12 + '.');
    }

    /* renamed from: j */
    public static float m116587j(float f11, float f12, float f13) {
        if (f12 <= f13) {
            if (f11 < f12) {
                return f12;
            }
            if (f11 > f13) {
                return f13;
            }
            return f11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f13 + " is less than minimum " + f12 + '.');
    }

    /* renamed from: k */
    public static int m116588k(int i11, int i12, int i13) {
        if (i12 <= i13) {
            if (i11 < i12) {
                return i12;
            }
            if (i11 > i13) {
                return i13;
            }
            return i11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i13 + " is less than minimum " + i12 + '.');
    }

    /* renamed from: l */
    public static long m116589l(long j11, long j12, long j13) {
        if (j12 <= j13) {
            if (j11 < j12) {
                return j12;
            }
            if (j11 > j13) {
                return j13;
            }
            return j11;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j13 + " is less than minimum " + j12 + '.');
    }

    /* renamed from: m */
    public static C22535d m116590m(int i11, int i12) {
        return C22535d.f110299s.m116551a(i11, i12, -1);
    }

    /* renamed from: n */
    public static int m116591n(C22537f c22537f, AbstractC21317c abstractC21317c) {
        AbstractC19074t.m100208f(c22537f, "<this>");
        AbstractC19074t.m100208f(abstractC21317c, "random");
        try {
            return AbstractC21318d.m110386f(abstractC21317c, c22537f);
        } catch (IllegalArgumentException e11) {
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    /* renamed from: o */
    public static C22535d m116592o(C22535d c22535d, int i11) {
        boolean z11;
        AbstractC19074t.m100208f(c22535d, "<this>");
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC22542k.m116578a(z11, Integer.valueOf(i11));
        C22535d.a aVar = C22535d.f110299s;
        int m116547d = c22535d.m116547d();
        int m116548e = c22535d.m116548e();
        if (c22535d.m116549g() <= 0) {
            i11 = -i11;
        }
        return aVar.m116551a(m116547d, m116548e, i11);
    }

    /* renamed from: p */
    public static C22537f m116593p(int i11, int i12) {
        if (i12 <= Integer.MIN_VALUE) {
            return C22537f.f110307t.m116557a();
        }
        return new C22537f(i11, i12 - 1);
    }
}
