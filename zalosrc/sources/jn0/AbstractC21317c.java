package jn0;

import fn0.AbstractC19060k;
import java.io.Serializable;
import ym0.AbstractC31021b;

/* renamed from: jn0.c */
/* loaded from: classes.dex */
public abstract class AbstractC21317c {

    /* renamed from: p */
    public static final a f103810p = new a(null);

    /* renamed from: q */
    private static final AbstractC21317c f103811q = AbstractC31021b.f143085a.mo4511b();

    /* renamed from: jn0.c$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC21317c implements Serializable {

        /* renamed from: jn0.c$a$a */
        /* loaded from: classes7.dex */
        private static final class C32852a implements Serializable {

            /* renamed from: p */
            public static final C32852a f103812p = new C32852a();
            private static final long serialVersionUID = 0;

            private C32852a() {
            }

            private final Object readResolve() {
                return AbstractC21317c.f103810p;
            }
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        private final Object writeReplace() {
            return C32852a.f103812p;
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: b */
        public int mo110370b(int i11) {
            return AbstractC21317c.f103811q.mo110370b(i11);
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: c */
        public float mo110371c() {
            return AbstractC21317c.f103811q.mo110371c();
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: d */
        public int mo110372d() {
            return AbstractC21317c.f103811q.mo110372d();
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: e */
        public int mo110373e(int i11) {
            return AbstractC21317c.f103811q.mo110373e(i11);
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: f */
        public int mo110378f(int i11, int i12) {
            return AbstractC21317c.f103811q.mo110378f(i11, i12);
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: g */
        public long mo110374g() {
            return AbstractC21317c.f103811q.mo110374g();
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: h */
        public long mo110379h(long j11) {
            return AbstractC21317c.f103811q.mo110379h(j11);
        }

        @Override // jn0.AbstractC21317c
        /* renamed from: i */
        public long mo110380i(long j11, long j12) {
            return AbstractC21317c.f103811q.mo110380i(j11, j12);
        }

        private a() {
        }
    }

    /* renamed from: b */
    public abstract int mo110370b(int i11);

    /* renamed from: c */
    public float mo110371c() {
        return mo110370b(24) / 1.6777216E7f;
    }

    /* renamed from: d */
    public abstract int mo110372d();

    /* renamed from: e */
    public int mo110373e(int i11) {
        return mo110378f(0, i11);
    }

    /* renamed from: f */
    public int mo110378f(int i11, int i12) {
        int mo110372d;
        int i13;
        int i14;
        AbstractC21318d.m110383c(i11, i12);
        int i15 = i12 - i11;
        if (i15 > 0 || i15 == Integer.MIN_VALUE) {
            if (((-i15) & i15) == i15) {
                i14 = mo110370b(AbstractC21318d.m110385e(i15));
                return i11 + i14;
            }
            do {
                mo110372d = mo110372d() >>> 1;
                i13 = mo110372d % i15;
            } while ((mo110372d - i13) + (i15 - 1) < 0);
            i14 = i13;
            return i11 + i14;
        }
        while (true) {
            int mo110372d2 = mo110372d();
            if (i11 <= mo110372d2 && mo110372d2 < i12) {
                return mo110372d2;
            }
        }
    }

    /* renamed from: g */
    public long mo110374g() {
        return (mo110372d() << 32) + mo110372d();
    }

    /* renamed from: h */
    public long mo110379h(long j11) {
        return mo110380i(0L, j11);
    }

    /* renamed from: i */
    public long mo110380i(long j11, long j12) {
        long mo110374g;
        long j13;
        long j14;
        int mo110372d;
        AbstractC21318d.m110384d(j11, j12);
        long j15 = j12 - j11;
        if (j15 > 0) {
            if (((-j15) & j15) == j15) {
                int i11 = (int) j15;
                int i12 = (int) (j15 >>> 32);
                if (i11 != 0) {
                    mo110372d = mo110370b(AbstractC21318d.m110385e(i11));
                } else if (i12 == 1) {
                    mo110372d = mo110372d();
                } else {
                    j14 = (mo110370b(AbstractC21318d.m110385e(i12)) << 32) + (mo110372d() & 4294967295L);
                    return j11 + j14;
                }
                j14 = mo110372d & 4294967295L;
                return j11 + j14;
            }
            do {
                mo110374g = mo110374g() >>> 1;
                j13 = mo110374g % j15;
            } while ((mo110374g - j13) + (j15 - 1) < 0);
            j14 = j13;
            return j11 + j14;
        }
        while (true) {
            long mo110374g2 = mo110374g();
            if (j11 <= mo110374g2 && mo110374g2 < j12) {
                return mo110374g2;
            }
        }
    }
}
