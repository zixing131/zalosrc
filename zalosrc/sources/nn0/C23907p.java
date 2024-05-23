package nn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;

/* renamed from: nn0.p */
/* loaded from: classes.dex */
public final class C23907p implements InterfaceC23898g {

    /* renamed from: a */
    private final InterfaceC23898g f115525a;

    /* renamed from: b */
    private final InterfaceC18505l f115526b;

    /* renamed from: nn0.p$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private final Iterator f115527p;

        a() {
            this.f115527p = C23907p.this.f115525a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f115527p.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C23907p.this.f115526b.mo205i9(this.f115527p.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C23907p(InterfaceC23898g interfaceC23898g, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "sequence");
        AbstractC19074t.m100208f(interfaceC18505l, "transformer");
        this.f115525a = interfaceC23898g;
        this.f115526b = interfaceC18505l;
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        return new a();
    }
}
