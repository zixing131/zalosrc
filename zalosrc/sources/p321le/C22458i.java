package p321le;

import com.zing.zalo.p077ui.call.settingringtone.data.model.ExceptionNoNetwork;
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
import me0.C23055e5;
import p185gc.AbstractC19383g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: le.i */
/* loaded from: classes3.dex */
public final class C22458i extends AbstractC19383g {

    /* renamed from: a */
    private Job f109850a;

    /* renamed from: le.i$a */
    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: le.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C32886a {
            /* renamed from: a */
            public static void m116110a(a aVar, String str) {
                AbstractC19074t.m100208f(str, "idSong");
            }

            /* renamed from: b */
            public static void m116111b(a aVar, String str, int i11, int i12) {
                AbstractC19074t.m100208f(str, "id");
            }
        }

        /* renamed from: a */
        void mo37781a(String str, int i11);

        /* renamed from: b */
        void mo37782b(String str);

        /* renamed from: c */
        void mo37783c(String str, int i11, int i12);

        /* renamed from: d */
        void mo37784d(String str);

        /* renamed from: e */
        void mo37785e(String str, Exception exc);

        /* renamed from: f */
        void mo37786f(String str);
    }

    /* renamed from: le.i$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final String f109851a;

        /* renamed from: b */
        private final String f109852b;

        /* renamed from: c */
        private final a f109853c;

        public b(String str, String str2, a aVar) {
            AbstractC19074t.m100208f(str, "id");
            AbstractC19074t.m100208f(str2, "streamUrl");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f109851a = str;
            this.f109852b = str2;
            this.f109853c = aVar;
        }

        /* renamed from: a */
        public final a m116112a() {
            return this.f109853c;
        }

        /* renamed from: b */
        public final String m116113b() {
            return this.f109851a;
        }

        /* renamed from: c */
        public final String m116114c() {
            return this.f109852b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f109851a, bVar.f109851a) && AbstractC19074t.m100204b(this.f109852b, bVar.f109852b) && AbstractC19074t.m100204b(this.f109853c, bVar.f109853c);
        }

        public int hashCode() {
            return (((this.f109851a.hashCode() * 31) + this.f109852b.hashCode()) * 31) + this.f109853c.hashCode();
        }

        public String toString() {
            return "Param(id=" + this.f109851a + ", streamUrl=" + this.f109852b + ", callback=" + this.f109853c + ")";
        }
    }

    /* renamed from: le.i$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ b f109854q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, b bVar) {
            super(key);
            this.f109854q = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            a m116112a = this.f109854q.m116112a();
            String m116113b = this.f109854q.m116113b();
            AbstractC19074t.m100206d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            m116112a.mo37785e(m116113b, (Exception) th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.i$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109855t;

        /* renamed from: u */
        private /* synthetic */ Object f109856u;

        /* renamed from: v */
        final /* synthetic */ b f109857v;

        /* renamed from: w */
        final /* synthetic */ CoroutineExceptionHandler f109858w;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: le.i$d$a */
        /* loaded from: classes3.dex */
        public static final class a extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            Object f109859t;

            /* renamed from: u */
            int f109860u;

            /* renamed from: v */
            private /* synthetic */ Object f109861v;

            /* renamed from: w */
            final /* synthetic */ b f109862w;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: le.i$d$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C32887a extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f109863t;

                C32887a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new C32887a(continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f109863t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C22090l.f108732a.m115271o();
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C32887a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: le.i$d$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends AbstractC29104l implements InterfaceC18509p {

                /* renamed from: t */
                int f109864t;

                /* renamed from: u */
                final /* synthetic */ b f109865u;

                /* renamed from: v */
                final /* synthetic */ c f109866v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(b bVar, c cVar, Continuation continuation) {
                    super(2, continuation);
                    this.f109865u = bVar;
                    this.f109866v = cVar;
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: a */
                public final Continuation mo238a(Object obj, Continuation continuation) {
                    return new b(this.f109865u, this.f109866v, continuation);
                }

                @Override // wm0.AbstractC29093a
                /* renamed from: o */
                public final Object mo239o(Object obj) {
                    AbstractC28298d.m142578e();
                    if (this.f109864t == 0) {
                        AbstractC24862s.m129228b(obj);
                        C22090l.f108732a.m115276v(new C21477e(this.f109865u.m116113b(), this.f109865u.m116114c(), 0L, 0, 12, null), false, false, 0, this.f109866v);
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                @Override // en0.InterfaceC18509p
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
                }
            }

            /* renamed from: le.i$d$a$c */
            /* loaded from: classes3.dex */
            public static final class c implements C22090l.a {

                /* renamed from: a */
                private int f109867a;

                /* renamed from: b */
                final /* synthetic */ b f109868b;

                c(b bVar) {
                    this.f109868b = bVar;
                }

                @Override // l50.C22090l.a
                /* renamed from: a */
                public void mo115251a(int i11, int i12) {
                    this.f109868b.m116112a().mo37783c(this.f109868b.m116113b(), i11, i12);
                    this.f109867a = i12;
                }

                @Override // l50.C22090l.a
                /* renamed from: c */
                public void mo115252c(Exception exc) {
                    AbstractC19074t.m100208f(exc, "exception");
                    this.f109868b.m116112a().mo37785e(this.f109868b.m116113b(), exc);
                }

                @Override // l50.C22090l.a
                /* renamed from: d */
                public void mo115253d() {
                    this.f109868b.m116112a().mo37784d(this.f109868b.m116113b());
                }

                @Override // l50.C22090l.a
                public void onPause() {
                    this.f109868b.m116112a().mo37786f(this.f109868b.m116113b());
                }

                @Override // l50.C22090l.a
                public void onProgressChanged(int i11) {
                    this.f109868b.m116112a().mo37781a(this.f109868b.m116113b(), i11);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, Continuation continuation) {
                super(2, continuation);
                this.f109862w = bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                a aVar = new a(this.f109862w, continuation);
                aVar.f109861v = obj;
                return aVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                c cVar;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f109860u;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) this.f109859t;
                    coroutineScope = (CoroutineScope) this.f109861v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f109861v;
                    cVar = new c(this.f109862w);
                    CoroutineDispatcher m112680b = Dispatchers.m112680b();
                    C32887a c32887a = new C32887a(null);
                    this.f109861v = coroutineScope2;
                    this.f109859t = cVar;
                    this.f109860u = 1;
                    if (BuildersKt.m112534g(m112680b, c32887a, this) == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                }
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f109862w.m116112a().mo37782b(this.f109862w.m116113b());
                    CoroutineDispatcher m112680b2 = Dispatchers.m112680b();
                    b bVar = new b(this.f109862w, cVar, null);
                    this.f109861v = null;
                    this.f109859t = null;
                    this.f109860u = 2;
                    if (BuildersKt.m112534g(m112680b2, bVar, this) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, CoroutineExceptionHandler coroutineExceptionHandler, Continuation continuation) {
            super(2, continuation);
            this.f109857v = bVar;
            this.f109858w = coroutineExceptionHandler;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            d dVar = new d(this.f109857v, this.f109858w, continuation);
            dVar.f109856u = obj;
            return dVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f109855t == 0) {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f109856u;
                if (C23055e5.m118273h(false, 1, null)) {
                    BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f109858w, null, new a(this.f109857v, null), 2, null);
                    return C24848g0.f119245a;
                }
                this.f109857v.m116112a().mo37785e(this.f109857v.m116113b(), ExceptionNoNetwork.f56345p);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        Job m112540d;
        AbstractC19074t.m100208f(bVar, "params");
        CompletableJob m112864b = SupervisorKt.m112864b(null, 1, null);
        c cVar = new c(CoroutineExceptionHandler.f105837l, bVar);
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b().mo112823d0(m112864b)), cVar, null, new d(bVar, cVar, null), 2, null);
        this.f109850a = m112540d;
    }
}
