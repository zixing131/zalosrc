package fn0;

import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: fn0.b */
/* loaded from: classes7.dex */
final class C19042b implements Iterator, InterfaceC19517a {

    /* renamed from: p */
    private final Object[] f94915p;

    /* renamed from: q */
    private int f94916q;

    public C19042b(Object[] objArr) {
        AbstractC19074t.m100208f(objArr, "array");
        this.f94915p = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f94916q < this.f94915p.length) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f94915p;
            int i11 = this.f94916q;
            this.f94916q = i11 + 1;
            return objArr[i11];
        } catch (ArrayIndexOutOfBoundsException e11) {
            this.f94916q--;
            throw new NoSuchElementException(e11.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
