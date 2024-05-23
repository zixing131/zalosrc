package qm0;

import gn0.InterfaceC19517a;
import java.util.Iterator;

/* renamed from: qm0.j0 */
/* loaded from: classes.dex */
public abstract class AbstractC25351j0 implements Iterator, InterfaceC19517a {
    /* renamed from: a */
    public abstract int mo116552a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(mo116552a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
