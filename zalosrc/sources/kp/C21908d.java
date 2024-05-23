package kp;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.List;
import jp.C21337a;
import jp.C21338b;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import qm0.AbstractC25366r;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* renamed from: kp.d */
/* loaded from: classes4.dex */
public final class C21908d implements InterfaceC21906b {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static volatile InterfaceC21906b f107685b;

    /* renamed from: a */
    private final InterfaceC21905a f107686a;

    /* renamed from: kp.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        private final InterfaceC21906b m114145a(InterfaceC21905a interfaceC21905a) {
            if (interfaceC21905a != null) {
                return new C21908d(interfaceC21905a);
            }
            return new C21908d(new C21907c());
        }

        /* renamed from: c */
        public static /* synthetic */ InterfaceC21906b m114146c(a aVar, InterfaceC21905a interfaceC21905a, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                interfaceC21905a = null;
            }
            return aVar.m114147b(interfaceC21905a);
        }

        /* renamed from: b */
        public final InterfaceC21906b m114147b(InterfaceC21905a interfaceC21905a) {
            InterfaceC21906b interfaceC21906b = C21908d.f107685b;
            if (interfaceC21906b == null) {
                synchronized (this) {
                    interfaceC21906b = C21908d.f107685b;
                    if (interfaceC21906b == null) {
                        InterfaceC21906b m114145a = C21908d.Companion.m114145a(interfaceC21905a);
                        C21908d.f107685b = m114145a;
                        interfaceC21906b = m114145a;
                    }
                }
            }
            return interfaceC21906b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kp.d$b */
    /* loaded from: classes4.dex */
    public static final class b extends AbstractC29096d {

        /* renamed from: s */
        Object f107687s;

        /* renamed from: t */
        /* synthetic */ Object f107688t;

        /* renamed from: v */
        int f107690v;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f107688t = obj;
            this.f107690v |= Integer.MIN_VALUE;
            return C21908d.this.mo114140c(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kp.d$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC29096d {

        /* renamed from: s */
        Object f107691s;

        /* renamed from: t */
        /* synthetic */ Object f107692t;

        /* renamed from: v */
        int f107694v;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f107692t = obj;
            this.f107694v |= Integer.MIN_VALUE;
            return C21908d.this.mo114138a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kp.d$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29096d {

        /* renamed from: s */
        Object f107695s;

        /* renamed from: t */
        /* synthetic */ Object f107696t;

        /* renamed from: v */
        int f107698v;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f107696t = obj;
            this.f107698v |= Integer.MIN_VALUE;
            return C21908d.this.mo114139b(null, this);
        }
    }

    public C21908d(InterfaceC21905a interfaceC21905a) {
        AbstractC19074t.m100208f(interfaceC21905a, "likeDetailAPI");
        this.f107686a = interfaceC21905a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // kp.InterfaceC21906b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo114138a(C21338b c21338b, Continuation continuation) {
        c cVar;
        Object m142578e;
        int i11;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i12 = cVar.f107694v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cVar.f107694v = i12 - Integer.MIN_VALUE;
                c cVar2 = cVar;
                Object obj = cVar2.f107692t;
                m142578e = AbstractC28298d.m142578e();
                i11 = cVar2.f107694v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c21338b = (C21338b) cVar2.f107691s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!c21338b.m110531d()) {
                        return c21338b;
                    }
                    int m110536i = c21338b.m110536i() + 1;
                    InterfaceC21905a interfaceC21905a = this.f107686a;
                    String m110532e = c21338b.m110532e();
                    int m110535h = c21338b.m110535h();
                    String m110533f = c21338b.m110533f();
                    cVar2.f107691s = c21338b;
                    cVar2.f107694v = 1;
                    obj = interfaceC21905a.mo114137c(m110532e, m110535h, m110536i, m110533f, cVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                C21338b c21338b2 = (C21338b) obj;
                return c21338b.m110529a(c21338b2.m110534g(), c21338b2.m110531d(), c21338b2.m110536i(), c21338b2.m110533f(), c21338b2.m110537j());
            }
        }
        cVar = new c(continuation);
        c cVar22 = cVar;
        Object obj2 = cVar22.f107692t;
        m142578e = AbstractC28298d.m142578e();
        i11 = cVar22.f107694v;
        if (i11 == 0) {
        }
        C21338b c21338b22 = (C21338b) obj2;
        return c21338b.m110529a(c21338b22.m110534g(), c21338b22.m110531d(), c21338b22.m110536i(), c21338b22.m110533f(), c21338b22.m110537j());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // kp.InterfaceC21906b
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo114139b(C21338b c21338b, Continuation continuation) {
        d dVar;
        Object m142578e;
        int i11;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i12 = dVar.f107698v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                dVar.f107698v = i12 - Integer.MIN_VALUE;
                d dVar2 = dVar;
                Object obj = dVar2.f107696t;
                m142578e = AbstractC28298d.m142578e();
                i11 = dVar2.f107698v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c21338b = (C21338b) dVar2.f107695s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!c21338b.m110531d()) {
                        return c21338b;
                    }
                    int m110536i = c21338b.m110536i() + 1;
                    InterfaceC21905a interfaceC21905a = this.f107686a;
                    String m110532e = c21338b.m110532e();
                    int m110535h = c21338b.m110535h();
                    String m110533f = c21338b.m110533f();
                    dVar2.f107695s = c21338b;
                    dVar2.f107698v = 1;
                    obj = interfaceC21905a.mo114136b(m110532e, m110535h, m110536i, m110533f, dVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                C21338b c21338b2 = (C21338b) obj;
                return c21338b.m110529a(c21338b2.m110534g(), c21338b2.m110531d(), c21338b2.m110536i(), c21338b2.m110533f(), c21338b2.m110537j());
            }
        }
        dVar = new d(continuation);
        d dVar22 = dVar;
        Object obj2 = dVar22.f107696t;
        m142578e = AbstractC28298d.m142578e();
        i11 = dVar22.f107698v;
        if (i11 == 0) {
        }
        C21338b c21338b22 = (C21338b) obj2;
        return c21338b.m110529a(c21338b22.m110534g(), c21338b22.m110531d(), c21338b22.m110536i(), c21338b22.m110533f(), c21338b22.m110537j());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // kp.InterfaceC21906b
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo114140c(C21337a c21337a, Continuation continuation) {
        b bVar;
        Object m142578e;
        int i11;
        List m131496e;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i12 = bVar.f107690v;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.f107690v = i12 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                Object obj = bVar2.f107688t;
                m142578e = AbstractC28298d.m142578e();
                i11 = bVar2.f107690v;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c21337a = (C21337a) bVar2.f107687s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    if (!c21337a.m110513f()) {
                        return c21337a;
                    }
                    int m110517j = c21337a.m110517j() + 1;
                    InterfaceC21905a interfaceC21905a = this.f107686a;
                    m131496e = AbstractC25366r.m131496e(c21337a.m110511d());
                    int m110516i = c21337a.m110516i();
                    String m110512e = c21337a.m110512e();
                    String m110519l = c21337a.m110519l();
                    int m110518k = c21337a.m110518k();
                    bVar2.f107687s = c21337a;
                    bVar2.f107690v = 1;
                    obj = interfaceC21905a.mo114135a(m131496e, m110516i, m110512e, m110519l, m110517j, m110518k, bVar2);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                C21337a c21337a2 = (C21337a) obj;
                return c21337a.m110509a(c21337a2.m110515h(), c21337a2.m110513f(), c21337a2.m110517j(), c21337a2.m110514g(), c21337a2.m110520m());
            }
        }
        bVar = new b(continuation);
        b bVar22 = bVar;
        Object obj2 = bVar22.f107688t;
        m142578e = AbstractC28298d.m142578e();
        i11 = bVar22.f107690v;
        if (i11 == 0) {
        }
        C21337a c21337a22 = (C21337a) obj2;
        return c21337a.m110509a(c21337a22.m110515h(), c21337a22.m110513f(), c21337a22.m110517j(), c21337a22.m110514g(), c21337a22.m110520m());
    }
}
