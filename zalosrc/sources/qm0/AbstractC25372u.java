package qm0;

import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Enumeration;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: qm0.u */
/* loaded from: classes.dex */
public abstract class AbstractC25372u extends AbstractC25370t {

    /* renamed from: qm0.u$a */
    /* loaded from: classes7.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        final /* synthetic */ Enumeration f121552p;

        a(Enumeration enumeration) {
            this.f121552p = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f121552p.hasMoreElements();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f121552p.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: u */
    public static Iterator m131515u(Enumeration enumeration) {
        AbstractC19074t.m100208f(enumeration, "<this>");
        return new a(enumeration);
    }
}
