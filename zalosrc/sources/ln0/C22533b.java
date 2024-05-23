package ln0;

import fn0.AbstractC19074t;
import java.util.NoSuchElementException;
import qm0.AbstractC25362p;

/* renamed from: ln0.b */
/* loaded from: classes7.dex */
public final class C22533b extends AbstractC25362p {

    /* renamed from: p */
    private final int f110293p;

    /* renamed from: q */
    private final int f110294q;

    /* renamed from: r */
    private boolean f110295r;

    /* renamed from: s */
    private int f110296s;

    public C22533b(char c11, char c12, int i11) {
        this.f110293p = i11;
        this.f110294q = c12;
        boolean z11 = true;
        if (i11 <= 0 ? AbstractC19074t.m100209g(c11, c12) < 0 : AbstractC19074t.m100209g(c11, c12) > 0) {
            z11 = false;
        }
        this.f110295r = z11;
        this.f110296s = z11 ? c11 : c12;
    }

    @Override // qm0.AbstractC25362p
    /* renamed from: a */
    public char mo116545a() {
        int i11 = this.f110296s;
        if (i11 == this.f110294q) {
            if (this.f110295r) {
                this.f110295r = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f110296s = this.f110293p + i11;
        }
        return (char) i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f110295r;
    }
}
