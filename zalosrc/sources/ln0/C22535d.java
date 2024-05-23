package ln0;

import fn0.AbstractC19060k;
import gn0.InterfaceC19517a;
import qm0.AbstractC25351j0;
import ym0.AbstractC31022c;

/* renamed from: ln0.d */
/* loaded from: classes.dex */
public class C22535d implements Iterable, InterfaceC19517a {

    /* renamed from: s */
    public static final a f110299s = new a(null);

    /* renamed from: p */
    private final int f110300p;

    /* renamed from: q */
    private final int f110301q;

    /* renamed from: r */
    private final int f110302r;

    /* renamed from: ln0.d$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C22535d m116551a(int i11, int i12, int i13) {
            return new C22535d(i11, i12, i13);
        }
    }

    public C22535d(int i11, int i12, int i13) {
        if (i13 != 0) {
            if (i13 != Integer.MIN_VALUE) {
                this.f110300p = i11;
                this.f110301q = AbstractC31022c.m150827c(i11, i12, i13);
                this.f110302r = i13;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    /* renamed from: d */
    public final int m116547d() {
        return this.f110300p;
    }

    /* renamed from: e */
    public final int m116548e() {
        return this.f110301q;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C22535d) {
            if (!isEmpty() || !((C22535d) obj).isEmpty()) {
                C22535d c22535d = (C22535d) obj;
                if (this.f110300p != c22535d.f110300p || this.f110301q != c22535d.f110301q || this.f110302r != c22535d.f110302r) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final int m116549g() {
        return this.f110302r;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f110300p * 31) + this.f110301q) * 31) + this.f110302r;
    }

    public boolean isEmpty() {
        if (this.f110302r > 0) {
            if (this.f110300p <= this.f110301q) {
                return false;
            }
        } else if (this.f110300p >= this.f110301q) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Iterable
    /* renamed from: j */
    public AbstractC25351j0 iterator() {
        return new C22536e(this.f110300p, this.f110301q, this.f110302r);
    }

    public String toString() {
        StringBuilder sb2;
        int i11;
        if (this.f110302r > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f110300p);
            sb2.append("..");
            sb2.append(this.f110301q);
            sb2.append(" step ");
            i11 = this.f110302r;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f110300p);
            sb2.append(" downTo ");
            sb2.append(this.f110301q);
            sb2.append(" step ");
            i11 = -this.f110302r;
        }
        sb2.append(i11);
        return sb2.toString();
    }
}
