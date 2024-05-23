package p012a6;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: a6.a0 */
/* loaded from: classes2.dex */
abstract class AbstractC0145a0 implements Iterator {

    /* renamed from: p */
    int f740p;

    /* renamed from: q */
    int f741q;

    /* renamed from: r */
    int f742r;

    /* renamed from: s */
    final /* synthetic */ C0240f0 f743s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC0145a0(C0240f0 c0240f0, AbstractC0614z abstractC0614z) {
        int i11;
        this.f743s = c0240f0;
        i11 = c0240f0.f1113t;
        this.f740p = i11;
        this.f741q = c0240f0.m708e();
        this.f742r = -1;
    }

    /* renamed from: c */
    private final void m609c() {
        int i11;
        i11 = this.f743s.f1113t;
        if (i11 == this.f740p) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    abstract Object mo610a(int i11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f741q >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m609c();
        if (hasNext()) {
            int i11 = this.f741q;
            this.f742r = i11;
            Object mo610a = mo610a(i11);
            this.f741q = this.f743s.m709f(this.f741q);
            return mo610a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        m609c();
        if (this.f742r >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC0163b.m620d(z11, "no calls to next() since the last call to remove()");
        this.f740p += 32;
        C0240f0 c0240f0 = this.f743s;
        int i11 = this.f742r;
        Object[] objArr = c0240f0.f1111r;
        objArr.getClass();
        c0240f0.remove(objArr[i11]);
        this.f741q--;
        this.f742r = -1;
    }
}
