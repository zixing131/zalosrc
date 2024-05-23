package p670y5;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: y5.p0 */
/* loaded from: classes2.dex */
abstract class AbstractC30583p0 implements Iterator {

    /* renamed from: p */
    int f141605p;

    /* renamed from: q */
    int f141606q;

    /* renamed from: r */
    int f141607r;

    /* renamed from: s */
    final /* synthetic */ C30659t0 f141608s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ AbstractC30583p0(C30659t0 c30659t0, AbstractC30564o0 abstractC30564o0) {
        int i11;
        this.f141608s = c30659t0;
        i11 = c30659t0.f141811t;
        this.f141605p = i11;
        this.f141606q = c30659t0.m149644e();
        this.f141607r = -1;
    }

    /* renamed from: c */
    private final void m149603c() {
        int i11;
        i11 = this.f141608s.f141811t;
        if (i11 == this.f141605p) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: a */
    abstract Object mo149554a(int i11);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f141606q >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        m149603c();
        if (hasNext()) {
            int i11 = this.f141606q;
            this.f141607r = i11;
            Object mo149554a = mo149554a(i11);
            this.f141606q = this.f141608s.m149645f(this.f141606q);
            return mo149554a;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z11;
        m149603c();
        if (this.f141607r >= 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC30582p.m149601d(z11, "no calls to next() since the last call to remove()");
        this.f141605p += 32;
        C30659t0 c30659t0 = this.f141608s;
        int i11 = this.f141607r;
        Object[] objArr = c30659t0.f141809r;
        objArr.getClass();
        c30659t0.remove(objArr[i11]);
        this.f141606q--;
        this.f141607r = -1;
    }
}
