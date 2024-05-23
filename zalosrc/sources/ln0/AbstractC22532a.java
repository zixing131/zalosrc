package ln0;

import fn0.AbstractC19060k;
import gn0.InterfaceC19517a;
import qm0.AbstractC25362p;
import ym0.AbstractC31022c;

/* renamed from: ln0.a */
/* loaded from: classes7.dex */
public abstract class AbstractC22532a implements Iterable, InterfaceC19517a {

    /* renamed from: s */
    public static final a f110289s = new a(null);

    /* renamed from: p */
    private final char f110290p;

    /* renamed from: q */
    private final char f110291q;

    /* renamed from: r */
    private final int f110292r;

    /* renamed from: ln0.a$a */
    /* loaded from: classes7.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public AbstractC22532a(char c11, char c12, int i11) {
        if (i11 != 0) {
            if (i11 != Integer.MIN_VALUE) {
                this.f110290p = c11;
                this.f110291q = (char) AbstractC31022c.m150827c(c11, c12, i11);
                this.f110292r = i11;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: d */
    public final char m116542d() {
        return this.f110290p;
    }

    /* renamed from: e */
    public final char m116543e() {
        return this.f110291q;
    }

    @Override // java.lang.Iterable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC25362p iterator() {
        return new C22533b(this.f110290p, this.f110291q, this.f110292r);
    }
}
