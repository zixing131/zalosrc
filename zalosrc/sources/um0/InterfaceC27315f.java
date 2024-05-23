package um0;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import um0.InterfaceC27313d;

/* renamed from: um0.f */
/* loaded from: classes.dex */
public interface InterfaceC27315f {

    /* renamed from: um0.f$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: um0.f$a$a */
        /* loaded from: classes.dex */
        public static final class C32993a extends AbstractC19075u implements InterfaceC18509p {

            /* renamed from: q */
            public static final C32993a f128558q = new C32993a();

            C32993a() {
                super(2);
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: a */
            public final InterfaceC27315f mo240pC(InterfaceC27315f interfaceC27315f, b bVar) {
                C27312c c27312c;
                AbstractC19074t.m100208f(interfaceC27315f, "acc");
                AbstractC19074t.m100208f(bVar, "element");
                InterfaceC27315f mo112625i = interfaceC27315f.mo112625i(bVar.getKey());
                C27316g c27316g = C27316g.f128559p;
                if (mo112625i != c27316g) {
                    InterfaceC27313d.b bVar2 = InterfaceC27313d.f128556o;
                    InterfaceC27313d interfaceC27313d = (InterfaceC27313d) mo112625i.mo112624d(bVar2);
                    if (interfaceC27313d == null) {
                        c27312c = new C27312c(mo112625i, bVar);
                    } else {
                        InterfaceC27315f mo112625i2 = mo112625i.mo112625i(bVar2);
                        if (mo112625i2 == c27316g) {
                            return new C27312c(bVar, interfaceC27313d);
                        }
                        c27312c = new C27312c(new C27312c(mo112625i2, bVar), interfaceC27313d);
                    }
                    return c27312c;
                }
                return bVar;
            }
        }

        /* renamed from: a */
        public static InterfaceC27315f m139850a(InterfaceC27315f interfaceC27315f, InterfaceC27315f interfaceC27315f2) {
            AbstractC19074t.m100208f(interfaceC27315f2, "context");
            if (interfaceC27315f2 != C27316g.f128559p) {
                return (InterfaceC27315f) interfaceC27315f2.mo112826h(interfaceC27315f, C32993a.f128558q);
            }
            return interfaceC27315f;
        }
    }

    /* renamed from: um0.f$b */
    /* loaded from: classes.dex */
    public interface b extends InterfaceC27315f {

        /* renamed from: um0.f$b$a */
        /* loaded from: classes.dex */
        public static final class a {
            /* renamed from: a */
            public static Object m139852a(b bVar, Object obj, InterfaceC18509p interfaceC18509p) {
                AbstractC19074t.m100208f(interfaceC18509p, "operation");
                return interfaceC18509p.mo240pC(obj, bVar);
            }

            /* renamed from: b */
            public static b m139853b(b bVar, c cVar) {
                AbstractC19074t.m100208f(cVar, "key");
                if (AbstractC19074t.m100204b(bVar.getKey(), cVar)) {
                    AbstractC19074t.m100206d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                    return bVar;
                }
                return null;
            }

            /* renamed from: c */
            public static InterfaceC27315f m139854c(b bVar, c cVar) {
                AbstractC19074t.m100208f(cVar, "key");
                if (AbstractC19074t.m100204b(bVar.getKey(), cVar)) {
                    return C27316g.f128559p;
                }
                return bVar;
            }

            /* renamed from: d */
            public static InterfaceC27315f m139855d(b bVar, InterfaceC27315f interfaceC27315f) {
                AbstractC19074t.m100208f(interfaceC27315f, "context");
                return a.m139850a(bVar, interfaceC27315f);
            }
        }

        @Override // um0.InterfaceC27315f
        /* renamed from: d */
        b mo112624d(c cVar);

        c getKey();

        @Override // um0.InterfaceC27315f
        /* renamed from: h */
        Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p);

        @Override // um0.InterfaceC27315f
        /* renamed from: i */
        InterfaceC27315f mo112625i(c cVar);
    }

    /* renamed from: um0.f$c */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* renamed from: d */
    b mo112624d(c cVar);

    /* renamed from: d0 */
    InterfaceC27315f mo112823d0(InterfaceC27315f interfaceC27315f);

    /* renamed from: h */
    Object mo112826h(Object obj, InterfaceC18509p interfaceC18509p);

    /* renamed from: i */
    InterfaceC27315f mo112625i(c cVar);
}
