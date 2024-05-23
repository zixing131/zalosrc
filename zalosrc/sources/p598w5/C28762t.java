package p598w5;

import java.util.NoSuchElementException;

/* renamed from: w5.t */
/* loaded from: classes2.dex */
final class C28762t extends AbstractC28766x {

    /* renamed from: p */
    boolean f133288p;

    /* renamed from: q */
    final /* synthetic */ Object f133289q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28762t(Object obj) {
        this.f133289q = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f133288p;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f133288p) {
            this.f133288p = true;
            return this.f133289q;
        }
        throw new NoSuchElementException();
    }
}
