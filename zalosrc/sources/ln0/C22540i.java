package ln0;

import fn0.AbstractC19060k;

/* renamed from: ln0.i */
/* loaded from: classes7.dex */
public final class C22540i extends AbstractC22538g {

    /* renamed from: t */
    public static final a f110317t = new a(null);

    /* renamed from: u */
    private static final C22540i f110318u = new C22540i(1, 0);

    /* renamed from: ln0.i$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public C22540i(long j11, long j12) {
        super(j11, j12, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22540i) {
            if (!isEmpty() || !((C22540i) obj).isEmpty()) {
                C22540i c22540i = (C22540i) obj;
                if (m116558d() != c22540i.m116558d() || m116559e() != c22540i.m116559e()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((31 * (m116558d() ^ (m116558d() >>> 32))) + (m116559e() ^ (m116559e() >>> 32)));
    }

    public boolean isEmpty() {
        if (m116558d() > m116559e()) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m116562j(long j11) {
        if (m116558d() <= j11 && j11 <= m116559e()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return m116558d() + ".." + m116559e();
    }
}
