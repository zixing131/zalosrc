package l50;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import k50.C21477e;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import l50.C22090l;
import p185gc.AbstractC19382f;
import p456qp.C25451c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: l50.k */
/* loaded from: classes5.dex */
public final class C22089k extends AbstractC19382f {

    /* renamed from: a */
    private Job f108715a;

    /* renamed from: l50.k$a */
    /* loaded from: classes5.dex */
    public interface a {

        /* renamed from: l50.k$a$a */
        /* loaded from: classes5.dex */
        public static final class C32878a {
            /* renamed from: a */
            public static void m115244a(a aVar) {
            }

            /* renamed from: b */
            public static void m115245b(a aVar, int i11, int i12) {
            }
        }

        /* renamed from: a */
        void mo115240a(Exception exc);

        /* renamed from: b */
        void mo115241b(int i11, int i12);

        /* renamed from: c */
        void mo115242c();

        /* renamed from: d */
        void mo115243d();

        void onProgressChanged(int i11);

        void onStop();
    }

    /* renamed from: l50.k$b */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private final String f108716a;

        /* renamed from: b */
        private final a f108717b;

        public b(String str, a aVar) {
            AbstractC19074t.m100208f(str, "path");
            this.f108716a = str;
            this.f108717b = aVar;
        }

        /* renamed from: a */
        public final a m115246a() {
            return this.f108717b;
        }

        /* renamed from: b */
        public final String m115247b() {
            return this.f108716a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f108716a, bVar.f108716a) && AbstractC19074t.m100204b(this.f108717b, bVar.f108717b);
        }

        public int hashCode() {
            int hashCode = this.f108716a.hashCode() * 31;
            a aVar = this.f108717b;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Param(path=" + this.f108716a + ", callback=" + this.f108717b + ")";
        }
    }

    /* renamed from: l50.k$c */
    /* loaded from: classes5.dex */
    public static final class c extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ a f108718q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, a aVar) {
            super(key);
            this.f108718q = aVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            a aVar = this.f108718q;
            if (aVar != null) {
                AbstractC19074t.m100206d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
                aVar.mo115240a((Exception) th2);
            }
        }
    }

    /* renamed from: l50.k$d */
    /* loaded from: classes5.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f108719t;

        /* renamed from: u */
        private /* synthetic */ Object f108720u;

        /* renamed from: v */
        final /* synthetic */ CoroutineExceptionHandler f108721v;

        /* renamed from: w */
        final /* synthetic */ a f108722w;

        /* renamed from: x */
        final /* synthetic */ b f108723x;

        /* renamed from: l50.k$d$a */
        /* loaded from: classes5.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f108724t;

            /* renamed from: u */
            int f108725u;

            /* renamed from: v */
            private /* synthetic */ Object f108726v;

            /* renamed from: w */
            final /* synthetic */ a f108727w;

            /* renamed from: x */
            final /* synthetic */ b f108728x;

            /* renamed from: l50.k$d$a$a */
            /* loaded from: classes5.dex */
            public static final class C32879a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f108729t;

                C32879a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32879a(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f108729t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C25451c.f121865a.m131824n();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32879a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: l50.k$d$a$b */
            /* loaded from: classes5.dex */
            public static final class b implements C22090l.a {

                /* renamed from: a */
                private int f108730a;

                /* renamed from: b */
                final /* synthetic */ a f108731b;

                b(a aVar) {
                    this.f108731b = aVar;
                }

                @Override // l50.C22090l.a
                /* renamed from: a */
                public void mo115251a(int i11, int i12) {
                    a aVar = this.f108731b;
                    if (aVar != null) {
                        aVar.mo115241b(i11, i12);
                    }
                    this.f108730a = i12;
                }

                @Override // l50.C22090l.a
                /* renamed from: c */
                public void mo115252c(Exception exc) {
                    AbstractC19074t.m100208f(exc, "exception");
                    a aVar = this.f108731b;
                    if (aVar != null) {
                        aVar.mo115240a(exc);
                    }
                }

                @Override // l50.C22090l.a
                /* renamed from: d */
                public void mo115253d() {
                    a aVar = this.f108731b;
                    if (aVar != null) {
                        aVar.mo115243d();
                    }
                }

                @Override // l50.C22090l.a
                public void onPause() {
                    a aVar = this.f108731b;
                    if (aVar != null) {
                        aVar.onStop();
                    }
                }

                @Override // l50.C22090l.a
                public void onProgressChanged(int i11) {
                    a aVar = this.f108731b;
                    if (aVar != null) {
                        aVar.onProgressChanged(i11);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f108727w = aVar;
                this.f108728x = bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f108727w, this.f108728x, continuation);
                aVar.f108726v = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                b bVar;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f108725u;
                if (i11 != 0) {
                    if (i11 == 1) {
                        b bVar2 = (b) this.f108724t;
                        coroutineScope = (CoroutineScope) this.f108726v;
                        AbstractC24862s.m129228b(obj);
                        bVar = bVar2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = (CoroutineScope) this.f108726v;
                    b bVar3 = new b(this.f108727w);
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    C32879a c32879a = new C32879a(null);
                    this.f108726v = coroutineScope;
                    this.f108724t = bVar3;
                    this.f108725u = 1;
                    if (BuildersKt.m112534g(m112680b, c32879a, this) == m142578e) {
                        return m142578e;
                    }
                    bVar = bVar3;
                }
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    a aVar = this.f108727w;
                    if (aVar != null) {
                        aVar.mo115242c();
                    }
                    C22090l.f108732a.m115270m(new C21477e(null, this.f108728x.m115247b(), 0L, 0, 13, null), true, false, 0, bVar);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(CoroutineExceptionHandler coroutineExceptionHandler, a aVar, b bVar, Continuation continuation) {
            super(2, continuation);
            this.f108721v = coroutineExceptionHandler;
            this.f108722w = aVar;
            this.f108723x = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f108721v, this.f108722w, this.f108723x, continuation);
            dVar.f108720u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f108719t == 0) {
                AbstractC24862s.m129228b(obj);
                BuildersKt__Builders_commonKt.m112540d((CoroutineScope) this.f108720u, this.f108721v, null, new a(this.f108722w, this.f108723x, null), 2, null);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    @Override // p185gc.AbstractC19382f
    /* renamed from: c */
    public Object mo13397b(b bVar, Continuation continuation) {
        Job m112540d;
        a m115246a = bVar.m115246a();
        CompletableJob m112864b = SupervisorKt.m112864b(null, 1, null);
        c cVar = new c(CoroutineExceptionHandler.f105837l, m115246a);
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(continuation.getContext().mo112823d0(m112864b)), cVar, null, new d(cVar, m115246a, bVar, null), 2, null);
        this.f108715a = m112540d;
        return C24848g0.f119245a;
    }
}
