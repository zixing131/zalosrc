package qm0;

import gn0.InterfaceC19517a;
import java.util.Iterator;

/* renamed from: qm0.p */
/* loaded from: classes7.dex */
public abstract class AbstractC25362p implements Iterator, InterfaceC19517a {
    /* renamed from: a */
    public abstract char mo116545a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(mo116545a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
