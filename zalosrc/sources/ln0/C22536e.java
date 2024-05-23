package ln0;

import java.util.NoSuchElementException;
import qm0.AbstractC25351j0;

/* renamed from: ln0.e */
/* loaded from: classes.dex */
public final class C22536e extends AbstractC25351j0 {

    /* renamed from: p */
    private final int f110303p;

    /* renamed from: q */
    private final int f110304q;

    /* renamed from: r */
    private boolean f110305r;

    /* renamed from: s */
    private int f110306s;

    public C22536e(int i11, int i12, int i13) {
        this.f110303p = i13;
        this.f110304q = i12;
        boolean z11 = true;
        if (i13 <= 0 ? i11 < i12 : i11 > i12) {
            z11 = false;
        }
        this.f110305r = z11;
        this.f110306s = z11 ? i11 : i12;
    }

    @Override // qm0.AbstractC25351j0
    /* renamed from: a */
    public int mo116552a() {
        int i11 = this.f110306s;
        if (i11 == this.f110304q) {
            if (this.f110305r) {
                this.f110305r = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f110306s = this.f110303p + i11;
        }
        return i11;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f110305r;
    }
}
