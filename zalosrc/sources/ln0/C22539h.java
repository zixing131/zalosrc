package ln0;

import java.util.NoSuchElementException;
import qm0.AbstractC25353k0;

/* renamed from: ln0.h */
/* loaded from: classes7.dex */
public final class C22539h extends AbstractC25353k0 {

    /* renamed from: p */
    private final long f110313p;

    /* renamed from: q */
    private final long f110314q;

    /* renamed from: r */
    private boolean f110315r;

    /* renamed from: s */
    private long f110316s;

    public C22539h(long j11, long j12, long j13) {
        this.f110313p = j13;
        this.f110314q = j12;
        boolean z11 = true;
        if (j13 <= 0 ? j11 < j12 : j11 > j12) {
            z11 = false;
        }
        this.f110315r = z11;
        this.f110316s = z11 ? j11 : j12;
    }

    @Override // qm0.AbstractC25353k0
    /* renamed from: a */
    public long mo116561a() {
        long j11 = this.f110316s;
        if (j11 == this.f110314q) {
            if (this.f110315r) {
                this.f110315r = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f110316s = this.f110313p + j11;
        }
        return j11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f110315r;
    }
}
