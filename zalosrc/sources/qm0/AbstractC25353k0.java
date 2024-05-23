package qm0;

import gn0.InterfaceC19517a;
import java.util.Iterator;

/* renamed from: qm0.k0 */
/* loaded from: classes7.dex */
public abstract class AbstractC25353k0 implements Iterator, InterfaceC19517a {
    /* renamed from: a */
    public abstract long mo116561a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Long.valueOf(mo116561a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
