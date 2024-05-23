package gl0;

import bl0.AbstractC2838d;
import bl0.C2837c;
import bl0.C2839e;
import cl0.C3578h;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vk0.InterfaceC28281c;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import yk0.C31016a;
import zk0.InterfaceC32222a;

/* renamed from: gl0.b */
/* loaded from: classes7.dex */
public final class C19480b extends AbstractC2838d {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private static final C31016a f96633c = new C31016a();

    /* renamed from: gl0.b$a */
    /* loaded from: classes7.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: gl0.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes7.dex */
        public static final class C32829a extends AbstractC29096d {

            /* renamed from: s */
            Object f96634s;

            /* renamed from: t */
            Object f96635t;

            /* renamed from: u */
            /* synthetic */ Object f96636u;

            /* renamed from: w */
            int f96638w;

            C32829a(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f96636u = obj;
                this.f96638w |= Integer.MIN_VALUE;
                return a.this.m101843b(null, null, this);
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final boolean m101842a(String str, InterfaceC28281c interfaceC28281c) {
            AbstractC19074t.m100208f(str, "key");
            AbstractC19074t.m100208f(interfaceC28281c, "signal");
            return C19480b.f96633c.m150801a(str, interfaceC28281c);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object m101843b(C2839e c2839e, String str, Continuation continuation) {
            C32829a c32829a;
            Object m142578e;
            int i11;
            C2839e c2839e2;
            Iterator it;
            if (continuation instanceof C32829a) {
                c32829a = (C32829a) continuation;
                int i12 = c32829a.f96638w;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c32829a.f96638w = i12 - Integer.MIN_VALUE;
                    Object obj = c32829a.f96636u;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c32829a.f96638w;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            it = (Iterator) c32829a.f96635t;
                            c2839e2 = (C2839e) c32829a.f96634s;
                            AbstractC24862s.m129228b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        Collection m150802b = C19480b.f96633c.m150802b(str);
                        if (m150802b != null) {
                            Iterator it2 = m150802b.iterator();
                            c2839e2 = c2839e;
                            it = it2;
                        }
                        return C24848g0.f119245a;
                    }
                    while (it.hasNext()) {
                        InterfaceC28281c interfaceC28281c = (InterfaceC28281c) it.next();
                        c32829a.f96634s = c2839e2;
                        c32829a.f96635t = it;
                        c32829a.f96638w = 1;
                        if (interfaceC28281c.mo101895a(c2839e2, c32829a) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            c32829a = new C32829a(continuation);
            Object obj2 = c32829a.f96636u;
            m142578e = AbstractC28298d.m142578e();
            i11 = c32829a.f96638w;
            if (i11 == 0) {
            }
            while (it.hasNext()) {
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: gl0.b$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f96639s;

        /* renamed from: t */
        /* synthetic */ Object f96640t;

        /* renamed from: v */
        int f96642v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f96640t = obj;
            this.f96642v |= Integer.MIN_VALUE;
            return C19480b.this.m101841i(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19480b(C19479a c19479a, InterfaceC32222a interfaceC32222a) {
        super(c19479a, interfaceC32222a);
        AbstractC19074t.m100208f(c19479a, "info");
    }

    @Override // vk0.AbstractC28287i
    /* renamed from: g */
    public Object mo13718g(Continuation continuation) {
        return new C3578h((C2837c) m142531b(), m142532c()).mo18187a(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m101841i(Continuation continuation) {
        b bVar;
        Object obj;
        Object m142578e;
        int i11;
        String m13706k;
        a aVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f96642v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f96642v = i12 - Integer.MIN_VALUE;
                obj = bVar.f96640t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f96642v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m13706k = (String) bVar.f96639s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    m13706k = ((C19479a) m142531b()).m13706k(((C19479a) m142531b()).m13702g());
                    if (Companion.m101842a(m13706k, ((C19479a) m142531b()).m101839x())) {
                        return C24848g0.f119245a;
                    }
                    bVar.f96639s = m13706k;
                    bVar.f96642v = 1;
                    obj = mo142530a(bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                aVar = Companion;
                bVar.f96639s = null;
                bVar.f96642v = 2;
                if (aVar.m101843b((C2839e) obj, m13706k, bVar) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        bVar = new b(continuation);
        obj = bVar.f96640t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f96642v;
        if (i11 == 0) {
        }
        aVar = Companion;
        bVar.f96639s = null;
        bVar.f96642v = 2;
        if (aVar.m101843b((C2839e) obj, m13706k, bVar) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
