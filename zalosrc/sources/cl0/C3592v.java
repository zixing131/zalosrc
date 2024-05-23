package cl0;

import bl0.AbstractC2841g;
import bl0.C2837c;
import bl0.C2839e;
import com.zing.zalo.zinstant.zom.node.ZOMDocument;
import dl0.C18024a;
import dl0.C18025b;
import dl0.C18026c;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import vk0.C28284f;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import zk0.InterfaceC32222a;

/* renamed from: cl0.v */
/* loaded from: classes7.dex */
public final class C3592v extends AbstractC2841g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.v$a */
    /* loaded from: classes7.dex */
    public static final class a extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f15155s;

        /* renamed from: u */
        int f15157u;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15155s = obj;
            this.f15157u |= Integer.MIN_VALUE;
            return C3592v.this.m18197l(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.v$b */
    /* loaded from: classes7.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f15158s;

        /* renamed from: t */
        /* synthetic */ Object f15159t;

        /* renamed from: v */
        int f15161v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15159t = obj;
            this.f15161v |= Integer.MIN_VALUE;
            return C3592v.this.m18202q(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.v$c */
    /* loaded from: classes7.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f15162s;

        /* renamed from: t */
        /* synthetic */ Object f15163t;

        /* renamed from: v */
        int f15165v;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15163t = obj;
            this.f15165v |= Integer.MIN_VALUE;
            return C3592v.this.m18203r(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.v$d */
    /* loaded from: classes7.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f15166s;

        /* renamed from: t */
        /* synthetic */ Object f15167t;

        /* renamed from: v */
        int f15169v;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15167t = obj;
            this.f15169v |= Integer.MIN_VALUE;
            return C3592v.this.m18205t(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cl0.v$e */
    /* loaded from: classes7.dex */
    public static final class e extends AbstractC29096d {

        /* renamed from: s */
        Object f15170s;

        /* renamed from: t */
        /* synthetic */ Object f15171t;

        /* renamed from: v */
        int f15173v;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f15171t = obj;
            this.f15173v |= Integer.MIN_VALUE;
            return C3592v.this.mo13721j(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3592v(C3591u c3591u, InterfaceC32222a interfaceC32222a) {
        super(c3591u, interfaceC32222a);
        AbstractC19074t.m100208f(c3591u, "info");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0059 A[PHI: r6
  0x0059: PHI (r6v6 java.lang.Object) = (r6v5 java.lang.Object), (r6v1 java.lang.Object) binds: [B:17:0x0056, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // bl0.AbstractC2841g
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo13721j(Continuation continuation) {
        e eVar;
        Object obj;
        Object m142578e;
        int i11;
        C3592v c3592v;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i12 = eVar.f15173v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                eVar.f15173v = i12 - Integer.MIN_VALUE;
                obj = eVar.f15171t;
                m142578e = AbstractC28298d.m142578e();
                i11 = eVar.f15173v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3592v = (C3592v) eVar.f15170s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    eVar.f15170s = this;
                    eVar.f15173v = 1;
                    obj = m18202q(eVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c3592v = this;
                }
                eVar.f15170s = null;
                eVar.f15173v = 2;
                obj = c3592v.m18197l((C2839e) obj, eVar);
                if (obj != m142578e) {
                    return m142578e;
                }
                return obj;
            }
        }
        eVar = new e(continuation);
        obj = eVar.f15171t;
        m142578e = AbstractC28298d.m142578e();
        i11 = eVar.f15173v;
        if (i11 == 0) {
        }
        eVar.f15170s = null;
        eVar.f15173v = 2;
        obj = c3592v.m18197l((C2839e) obj, eVar);
        if (obj != m142578e) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18197l(C2839e c2839e, Continuation continuation) {
        a aVar;
        Object m142578e;
        int i11;
        C2839e c2839e2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i12 = aVar.f15157u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                aVar.f15157u = i12 - Integer.MIN_VALUE;
                Object obj = aVar.f15155s;
                m142578e = AbstractC28298d.m142578e();
                i11 = aVar.f15157u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    aVar.f15157u = 1;
                    obj = m18204s(c2839e, aVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                c2839e2 = (C2839e) obj;
                if (c2839e2.mo13723d()) {
                    c2839e2.m142538c();
                    Object m142538c = c2839e2.m142538c();
                    AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.node.ZOMDocument");
                    ((ZOMDocument) m142538c).onPlatformReady();
                }
                return c2839e2;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f15155s;
        m142578e = AbstractC28298d.m142578e();
        i11 = aVar.f15157u;
        if (i11 == 0) {
        }
        c2839e2 = (C2839e) obj2;
        if (c2839e2.mo13723d()) {
        }
        return c2839e2;
    }

    /* renamed from: m */
    public final C3581k m18198m(C2839e c2839e) {
        AbstractC19074t.m100208f(c2839e, "currentResponse");
        return new C3581k(new C3579i(c2839e, ((C3591u) m142531b()).m13703h(), ((C3591u) m142531b()).m13700e(), ((C3591u) m142531b()).m13701f(), ((C3591u) m142531b()).m13704i(), ((C3591u) m142531b()).m13702g(), ((C3591u) m142531b()).m99746a()), m142532c());
    }

    /* renamed from: n */
    public final Object m18199n(ZOMDocument zOMDocument, Continuation continuation) {
        return new C18025b(zOMDocument, (C2837c) m142531b(), m142532c()).mo13718g(continuation);
    }

    /* renamed from: o */
    public final Object m18200o(Continuation continuation) {
        return new C18024a((C2837c) m142531b(), m142532c()).mo13718g(continuation);
    }

    /* renamed from: p */
    public final Object m18201p(Continuation continuation) {
        return new C18026c((C3591u) m142531b(), m142532c()).mo13718g(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008b A[PHI: r7
  0x008b: PHI (r7v13 java.lang.Object) = (r7v10 java.lang.Object), (r7v1 java.lang.Object) binds: [B:21:0x0088, B:11:0x002b] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18202q(Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        C3592v c3592v;
        C2839e c2839e;
        C2839e c2839e2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f15161v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f15161v = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f15159t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar.f15161v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c3592v = (C3592v) bVar.f15158s;
                        AbstractC24862s.m129228b(obj);
                        c2839e2 = (C2839e) obj;
                        if (c2839e2.mo13723d()) {
                            return c2839e2;
                        }
                        bVar.f15158s = null;
                        bVar.f15161v = 3;
                        obj = c3592v.m18201p(bVar);
                        if (obj != m142578e) {
                            return m142578e;
                        }
                        return obj;
                    }
                    c3592v = (C3592v) bVar.f15158s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    bVar.f15158s = this;
                    bVar.f15161v = 1;
                    obj = m18200o(bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c3592v = this;
                }
                c2839e = (C2839e) obj;
                if (!c2839e.mo13723d()) {
                    return c2839e;
                }
                ZOMDocument m13716v = ((C3591u) c3592v.m142531b()).m13716v();
                if (m13716v != null) {
                    bVar.f15158s = c3592v;
                    bVar.f15161v = 2;
                    obj = c3592v.m18199n(m13716v, bVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c2839e2 = (C2839e) obj;
                    if (c2839e2.mo13723d()) {
                    }
                }
                bVar.f15158s = null;
                bVar.f15161v = 3;
                obj = c3592v.m18201p(bVar);
                if (obj != m142578e) {
                }
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f15159t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar.f15161v;
        if (i11 == 0) {
        }
        c2839e = (C2839e) obj2;
        if (!c2839e.mo13723d()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18203r(C2839e c2839e, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        C3592v c3592v;
        C2839e c2839e2;
        C2839e c2839e3;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f15165v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f15165v = i12 - Integer.MIN_VALUE;
                Object obj = cVar.f15163t;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar.f15165v;
                ZOMDocument zOMDocument = null;
                byte b11 = 0;
                int i13 = 1;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            c2839e3 = (C2839e) obj;
                            if (!c2839e3.mo13723d()) {
                                return c2839e3;
                            }
                            return new C2839e(zOMDocument, new C28284f(404, "native layout - relayout error"), i13, b11 == true ? 1 : 0);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3592v = (C3592v) cVar.f15162s;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    c2839e.m142538c();
                    Object m142538c = c2839e.m142538c();
                    AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.node.ZOMDocument");
                    cVar.f15162s = this;
                    cVar.f15165v = 1;
                    obj = m18199n((ZOMDocument) m142538c, cVar);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    c3592v = this;
                }
                c2839e2 = (C2839e) obj;
                if (!c2839e2.mo13723d()) {
                    return c2839e2;
                }
                cVar.f15162s = null;
                cVar.f15165v = 2;
                obj = c3592v.m18201p(cVar);
                if (obj == m142578e) {
                    return m142578e;
                }
                c2839e3 = (C2839e) obj;
                if (!c2839e3.mo13723d()) {
                }
            }
        }
        cVar = new c(continuation);
        Object obj2 = cVar.f15163t;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar.f15165v;
        ZOMDocument zOMDocument2 = null;
        byte b112 = 0;
        int i132 = 1;
        if (i11 == 0) {
        }
        c2839e2 = (C2839e) obj2;
        if (!c2839e2.mo13723d()) {
        }
    }

    /* renamed from: s */
    public final Object m18204s(C2839e c2839e, Continuation continuation) {
        if (c2839e.mo13723d()) {
            c2839e.m142538c();
            Object m142538c = c2839e.m142538c();
            AbstractC19074t.m100206d(m142538c, "null cannot be cast to non-null type com.zing.zalo.zinstant.zom.node.ZOMDocument");
            if (((ZOMDocument) m142538c).isRequireResources()) {
                return m18205t(c2839e, continuation);
            }
            return c2839e;
        }
        return c2839e;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m18205t(C2839e c2839e, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        C3592v c3592v;
        Object obj;
        boolean mo13723d;
        Object obj2;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f15169v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f15169v = i12 - Integer.MIN_VALUE;
                Object obj3 = dVar.f15167t;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar.f15169v;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj3);
                            obj2 = obj3;
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C3592v c3592v2 = (C3592v) dVar.f15166s;
                    AbstractC24862s.m129228b(obj3);
                    c3592v = c3592v2;
                    obj = obj3;
                } else {
                    AbstractC24862s.m129228b(obj3);
                    C3581k m18198m = m18198m(c2839e);
                    dVar.f15166s = this;
                    dVar.f15169v = 1;
                    Object mo18187a = m18198m.mo18187a(dVar);
                    if (mo18187a == m142578e) {
                        return m142578e;
                    }
                    c3592v = this;
                    obj = mo18187a;
                }
                C2839e c2839e2 = (C2839e) obj;
                mo13723d = c2839e2.mo13723d();
                obj2 = c2839e2;
                if (mo13723d) {
                    dVar.f15166s = null;
                    dVar.f15169v = 2;
                    Object m18203r = c3592v.m18203r(c2839e2, dVar);
                    obj2 = m18203r;
                    if (m18203r == m142578e) {
                        return m142578e;
                    }
                }
                return obj2;
            }
        }
        dVar = new d(continuation);
        Object obj32 = dVar.f15167t;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar.f15169v;
        if (i11 == 0) {
        }
        C2839e c2839e22 = (C2839e) obj;
        mo13723d = c2839e22.mo13723d();
        obj2 = c2839e22;
        if (mo13723d) {
        }
        return obj2;
    }
}
