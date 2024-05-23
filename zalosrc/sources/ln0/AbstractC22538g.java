package ln0;

import fn0.AbstractC19060k;
import gn0.InterfaceC19517a;
import qm0.AbstractC25353k0;
import ym0.AbstractC31022c;

/* renamed from: ln0.g */
/* loaded from: classes7.dex */
public abstract class AbstractC22538g implements Iterable, InterfaceC19517a {

    /* renamed from: s */
    public static final a f110309s = new a(null);

    /* renamed from: p */
    private final long f110310p;

    /* renamed from: q */
    private final long f110311q;

    /* renamed from: r */
    private final long f110312r;

    /* renamed from: ln0.g$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public AbstractC22538g(long j11, long j12, long j13) {
        if (j13 != 0) {
            if (j13 != Long.MIN_VALUE) {
                this.f110310p = j11;
                this.f110311q = AbstractC31022c.m150828d(j11, j12, j13);
                this.f110312r = j13;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: d */
    public final long m116558d() {
        return this.f110310p;
    }

    /* renamed from: e */
    public final long m116559e() {
        return this.f110311q;
    }

    @Override // java.lang.Iterable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC25353k0 iterator() {
        return new C22539h(this.f110310p, this.f110311q, this.f110312r);
    }
}
