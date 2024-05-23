package nn0;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: nn0.e */
/* loaded from: classes.dex */
public final class C23896e implements InterfaceC23898g {

    /* renamed from: a */
    private final InterfaceC23898g f115501a;

    /* renamed from: b */
    private final boolean f115502b;

    /* renamed from: c */
    private final InterfaceC18505l f115503c;

    /* renamed from: nn0.e$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private final Iterator f115504p;

        /* renamed from: q */
        private int f115505q = -1;

        /* renamed from: r */
        private Object f115506r;

        a() {
            this.f115504p = C23896e.this.f115501a.iterator();
        }

        /* renamed from: a */
        private final void m124986a() {
            while (this.f115504p.hasNext()) {
                Object next = this.f115504p.next();
                if (((Boolean) C23896e.this.f115503c.mo205i9(next)).booleanValue() == C23896e.this.f115502b) {
                    this.f115506r = next;
                    this.f115505q = 1;
                    return;
                }
            }
            this.f115505q = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f115505q == -1) {
                m124986a();
            }
            if (this.f115505q == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f115505q == -1) {
                m124986a();
            }
            if (this.f115505q != 0) {
                Object obj = this.f115506r;
                this.f115506r = null;
                this.f115505q = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C23896e(InterfaceC23898g interfaceC23898g, boolean z11, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC23898g, "sequence");
        AbstractC19074t.m100208f(interfaceC18505l, "predicate");
        this.f115501a = interfaceC23898g;
        this.f115502b = z11;
        this.f115503c = interfaceC18505l;
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        return new a();
    }
}
