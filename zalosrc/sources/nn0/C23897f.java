package nn0;

import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import gn0.InterfaceC19517a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: nn0.f */
/* loaded from: classes.dex */
public final class C23897f implements InterfaceC23898g {

    /* renamed from: a */
    private final InterfaceC18494a f115508a;

    /* renamed from: b */
    private final InterfaceC18505l f115509b;

    /* renamed from: nn0.f$a */
    /* loaded from: classes.dex */
    public static final class a implements Iterator, InterfaceC19517a {

        /* renamed from: p */
        private Object f115510p;

        /* renamed from: q */
        private int f115511q = -2;

        a() {
        }

        /* renamed from: a */
        private final void m124989a() {
            Object mo205i9;
            int i11;
            if (this.f115511q != -2) {
                InterfaceC18505l interfaceC18505l = C23897f.this.f115509b;
                Object obj = this.f115510p;
                AbstractC19074t.m100205c(obj);
                mo205i9 = interfaceC18505l.mo205i9(obj);
            } else {
                mo205i9 = C23897f.this.f115508a.mo12V4();
            }
            this.f115510p = mo205i9;
            if (mo205i9 == null) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            this.f115511q = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f115511q < 0) {
                m124989a();
            }
            if (this.f115511q == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f115511q < 0) {
                m124989a();
            }
            if (this.f115511q != 0) {
                Object obj = this.f115510p;
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f115511q = -1;
                return obj;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C23897f(InterfaceC18494a interfaceC18494a, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(interfaceC18494a, "getInitialValue");
        AbstractC19074t.m100208f(interfaceC18505l, "getNextValue");
        this.f115508a = interfaceC18494a;
        this.f115509b = interfaceC18505l;
    }

    @Override // nn0.InterfaceC23898g
    public Iterator iterator() {
        return new a();
    }
}
