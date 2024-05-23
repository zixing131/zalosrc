package um0;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19055h0;
import java.io.Serializable;
import pm0.C24848g0;
import um0.InterfaceC27315f;

/* renamed from: um0.c */
/* loaded from: classes.dex */
public final class C27312c implements InterfaceC27315f, Serializable {

    /* renamed from: p */
    private final InterfaceC27315f f128549p;

    /* renamed from: q */
    private final InterfaceC27315f.b f128550q;

    /* renamed from: um0.c$a */
    /* loaded from: classes7.dex */
    private static final class a implements Serializable {

        /* renamed from: q */
        public static final C32992a f128551q = new C32992a(null);
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        private final InterfaceC27315f[] f128552p;

        /* renamed from: um0.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32992a {
            private C32992a() {
            }

            public /* synthetic */ C32992a(AbstractC19060k abstractC19060k) {
                this();
            }
        }

        public a(InterfaceC27315f[] interfaceC27315fArr) {
            AbstractC19074t.m100208f(interfaceC27315fArr, "elements");
            this.f128552p = interfaceC27315fArr;
        }

        private final Object readResolve() {
            InterfaceC27315f[] interfaceC27315fArr = this.f128552p;
            InterfaceC27315f interfaceC27315f = C27316g.f128559p;
            for (InterfaceC27315f interfaceC27315f2 : interfaceC27315fArr) {
                interfaceC27315f = interfaceC27315f.mo112823d0(interfaceC27315f2);
            }
            return interfaceC27315f;
        }
    }

    /* renamed from: um0.c$b */
    /* loaded from: classes7.dex */
    static final class b extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        public static final b f128553q = new b();

        b() {
            super(2);
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo240pC(String str, InterfaceC27315f.b bVar) {
            AbstractC19074t.m100208f(str, "acc");
            AbstractC19074t.m100208f(bVar, "element");
            if (str.length() == 0) {
                return bVar.toString();
            }
            return str + ", " + bVar;
        }
    }

    /* renamed from: um0.c$c */
    /* loaded from: classes7.dex */
    static final class c extends AbstractC19075u implements InterfaceC18509p {

        /* renamed from: q */
        final /* synthetic */ InterfaceC27315f[] f128554q;

        /* renamed from: r */
        final /* synthetic */ C19055h0 f128555r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC27315f[] interfaceC27315fArr, C19055h0 c19055h0) {
            super(2);
            this.f128554q = interfaceC27315fArr;
            this.f128555r = c19055h0;
        }

        /* renamed from: a */
        public final void m139846a(C24848g0 c24848g0, InterfaceC27315f.b bVar) {
            AbstractC19074t.m100208f(c24848g0, "<anonymous parameter 0>");
            AbstractC19074t.m100208f(bVar, "element");
            InterfaceC27315f[] interfaceC27315fArr = this.f128554q;
            C19055h0 c19055h0 = this.f128555r;
            int i11 = c19055h0.f94931p;
            c19055h0.f94931p = i11 + 1;
            interfaceC27315fArr[i11] = bVar;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: pC */
        public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
            m139846a((C24848g0) obj, (InterfaceC27315f.b) obj2);
            return C24848g0.f119245a;
        }
    }

    public C27312c(InterfaceC27315f interfaceC27315f, InterfaceC27315f.b bVar) {
        AbstractC19074t.m100208f(interfaceC27315f, "left");
        AbstractC19074t.m100208f(bVar, "element");
        this.f128549p = interfaceC27315f;
        this.f128550q = bVar;
    }

    /* renamed from: e */
    private final boolean m139842e(InterfaceC27315f.b bVar) {
        return AbstractC19074t.m100204b(mo112624d(bVar.getKey()), bVar);
    }

    /* renamed from: g */
    private final boolean m139843g(C27312c c27312c) {
        while (m139842e(c27312c.f128550q)) {
            InterfaceC27315f interfaceC27315f = c27312c.f128549p;
            if (interfaceC27315f instanceof C27312c) {
                c27312c = (C27312c) interfaceC27315f;
            } else {
                AbstractC19074t.m100206d(interfaceC27315f, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return m139842e((InterfaceC27315f.b) interfaceC27315f);
            }
        }
        return false;
    }

    /* renamed from: j */
    private final int m139844j() {
        int i11 = 2;
        C27312c c27312c = this;
        while (true) {
            InterfaceC27315f interfaceC27315f = c27312c.f128549p;
            if (interfaceC27315f instanceof C27312c) {
                c27312c = (C27312c) interfaceC27315f;
            } else {
                c27312c = null;
            }
            if (c27312c == null) {
                return i11;
            }
            i11++;
        }
    }

    private final Object writeReplace() {
        int m139844j = m139844j();
        InterfaceC27315f[] interfaceC27315fArr = new InterfaceC27315f[m139844j];
        C19055h0 c19055h0 = new C19055h0();
        mo112826h(C24848g0.f119245a, new c(interfaceC27315fArr, c19055h0));
        if (c19055h0.f94931p == m139844j) {
            return new a(interfaceC27315fArr);
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d */
    public InterfaceC27315f.b mo112624d(InterfaceC27315f.c cVar) {
        AbstractC19074t.m100208f(cVar, "key");
        C27312c c27312c = this;
        while (true) {
            InterfaceC27315f.b mo112624d = c27312c.f128550q.mo112624d(cVar);
            if (mo112624d != null) {
                return mo112624d;
            }
            InterfaceC27315f interfaceC27315f = c27312c.f128549p;
            if (interfaceC27315f instanceof C27312c) {
                c27312c = (C27312c) interfaceC27315f;
            } else {
                return interfaceC27315f.mo112624d(cVar);
            }
        }
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: d0 */
    public InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f) {
        return InterfaceC27315f.a.m139850a(this, interfaceC27315f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27312c) {
                C27312c c27312c = (C27312c) obj;
                if (c27312c.m139844j() != m139844j() || !c27312c.m139843g(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: h */
    public Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p) {
        AbstractC19074t.m100208f(interfaceC18509p, "operation");
        return interfaceC18509p.mo240pC(this.f128549p.mo112826h(obj, interfaceC18509p), this.f128550q);
    }

    public int hashCode() {
        return this.f128549p.hashCode() + this.f128550q.hashCode();
    }

    @Override // um0.InterfaceC27315f
    /* renamed from: i */
    public InterfaceC27315f mo112625i(InterfaceC27315f.c cVar) {
        AbstractC19074t.m100208f(cVar, "key");
        if (this.f128550q.mo112624d(cVar) != null) {
            return this.f128549p;
        }
        InterfaceC27315f mo112625i = this.f128549p.mo112625i(cVar);
        if (mo112625i == this.f128549p) {
            return this;
        }
        if (mo112625i == C27316g.f128559p) {
            return this.f128550q;
        }
        return new C27312c(mo112625i, this.f128550q);
    }

    public String toString() {
        return '[' + ((String) mo112826h("", b.f128553q)) + ']';
    }
}
