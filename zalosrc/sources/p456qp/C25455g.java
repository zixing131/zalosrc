package p456qp;

import com.zing.zalo.feed.mvp.music.data.ExceptionNoNetwork;
import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import p185gc.AbstractC19383g;
import p399op.C24405q;
import p426pp.C24898a;
import p426pp.C24902e;
import p426pp.C24903f;
import p458qr.C25478k;
import p458qr.InterfaceC25469b;
import p509sp.C26359h;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.g */
/* loaded from: classes4.dex */
public final class C25455g extends AbstractC19383g {

    /* renamed from: a */
    private final C24405q f121896a;

    /* renamed from: b */
    private final InterfaceC25469b f121897b;

    /* renamed from: c */
    private Job f121898c;

    /* renamed from: qp.g$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo104705a(C24903f c24903f);

        /* renamed from: b */
        void mo104706b(C24898a c24898a);

        /* renamed from: c */
        void mo104707c(Exception exc);

        /* renamed from: d */
        void mo104708d(C24902e c24902e);
    }

    /* renamed from: qp.g$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final String f121899a;

        /* renamed from: b */
        private final CoroutineScope f121900b;

        /* renamed from: c */
        private final a f121901c;

        public b(String str, CoroutineScope coroutineScope, a aVar) {
            AbstractC19074t.m100208f(str, "idSong");
            AbstractC19074t.m100208f(coroutineScope, "scope");
            AbstractC19074t.m100208f(aVar, "callback");
            this.f121899a = str;
            this.f121900b = coroutineScope;
            this.f121901c = aVar;
        }

        /* renamed from: a */
        public final a m131853a() {
            return this.f121901c;
        }

        /* renamed from: b */
        public final String m131854b() {
            return this.f121899a;
        }

        /* renamed from: c */
        public final CoroutineScope m131855c() {
            return this.f121900b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC19074t.m100204b(this.f121899a, bVar.f121899a) && AbstractC19074t.m100204b(this.f121900b, bVar.f121900b) && AbstractC19074t.m100204b(this.f121901c, bVar.f121901c);
        }

        public int hashCode() {
            return (((this.f121899a.hashCode() * 31) + this.f121900b.hashCode()) * 31) + this.f121901c.hashCode();
        }

        public String toString() {
            return "Param(idSong=" + this.f121899a + ", scope=" + this.f121900b + ", callback=" + this.f121901c + ")";
        }
    }

    /* renamed from: qp.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ b f121902q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, b bVar) {
            super(key);
            this.f121902q = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_LOAD_MUSIC", new f(this.f121902q, th2));
            a m131853a = this.f121902q.m131853a();
            AbstractC19074t.m100206d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            m131853a.mo104707c((Exception) th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ b f121903q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar) {
            super(0);
            this.f121903q = bVar;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "params " + this.f121903q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f121904t;

        /* renamed from: u */
        private /* synthetic */ Object f121905u;

        /* renamed from: w */
        final /* synthetic */ b f121907w;

        /* renamed from: x */
        final /* synthetic */ CoroutineExceptionHandler f121908x;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.g$e$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC19075u implements InterfaceC18494a {

            /* renamed from: q */
            final /* synthetic */ b f121909q;

            /* renamed from: r */
            final /* synthetic */ C24902e f121910r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b bVar, C24902e c24902e) {
                super(0);
                this.f121909q = bVar;
                this.f121910r = c24902e;
            }

            @Override // en0.InterfaceC18494a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String mo12V4() {
                return "song " + this.f121909q.m131854b() + " song info " + this.f121910r;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.g$e$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f121911t;

            /* renamed from: u */
            private /* synthetic */ Object f121912u;

            /* renamed from: v */
            final /* synthetic */ C25455g f121913v;

            /* renamed from: w */
            final /* synthetic */ C24902e f121914w;

            /* renamed from: x */
            final /* synthetic */ b f121915x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qp.g$e$b$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ b f121916q;

                /* renamed from: r */
                final /* synthetic */ C24903f f121917r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(b bVar, C24903f c24903f) {
                    super(0);
                    this.f121916q = bVar;
                    this.f121917r = c24903f;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "song " + this.f121916q.m131854b() + " song streaming " + this.f121917r;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C25455g c25455g, C24902e c24902e, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f121913v = c25455g;
                this.f121914w = c24902e;
                this.f121915x = bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                b bVar = new b(this.f121913v, this.f121914w, this.f121915x, continuation);
                bVar.f121912u = obj;
                return bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f121911t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f121912u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f121912u;
                    C24405q m131851d = this.f121913v.m131851d();
                    String m129490f = this.f121914w.m129490f();
                    String m129493i = this.f121914w.m129493i();
                    this.f121912u = coroutineScope2;
                    this.f121911t = 1;
                    Object mo127590i = m131851d.mo127590i(m129490f, m129493i, this);
                    if (mo127590i == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                    obj = mo127590i;
                }
                C24903f c24903f = (C24903f) obj;
                C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_LOAD_MUSIC", new a(this.f121915x, c24903f));
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f121915x.m131853a().mo104705a(c24903f);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: qp.g$e$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC29104l implements InterfaceC18509p {

            /* renamed from: t */
            int f121918t;

            /* renamed from: u */
            private /* synthetic */ Object f121919u;

            /* renamed from: v */
            final /* synthetic */ C25455g f121920v;

            /* renamed from: w */
            final /* synthetic */ C24902e f121921w;

            /* renamed from: x */
            final /* synthetic */ b f121922x;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: qp.g$e$c$a */
            /* loaded from: classes4.dex */
            public static final class a extends AbstractC19075u implements InterfaceC18494a {

                /* renamed from: q */
                final /* synthetic */ b f121923q;

                /* renamed from: r */
                final /* synthetic */ C24898a f121924r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(b bVar, C24898a c24898a) {
                    super(0);
                    this.f121923q = bVar;
                    this.f121924r = c24898a;
                }

                @Override // en0.InterfaceC18494a
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String mo12V4() {
                    return "song " + this.f121923q.m131854b() + " lyric " + this.f121924r;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C25455g c25455g, C24902e c24902e, b bVar, Continuation continuation) {
                super(2, continuation);
                this.f121920v = c25455g;
                this.f121921w = c24902e;
                this.f121922x = bVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: a */
            public final Continuation mo238a(Object obj, Continuation continuation) {
                c cVar = new c(this.f121920v, this.f121921w, this.f121922x, continuation);
                cVar.f121919u = obj;
                return cVar;
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                Object m142578e;
                CoroutineScope coroutineScope;
                m142578e = AbstractC28298d.m142578e();
                int i11 = this.f121918t;
                if (i11 != 0) {
                    if (i11 == 1) {
                        coroutineScope = (CoroutineScope) this.f121919u;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f121919u;
                    C24405q m131851d = this.f121920v.m131851d();
                    C24902e c24902e = this.f121921w;
                    this.f121919u = coroutineScope2;
                    this.f121918t = 1;
                    Object m127647v = m131851d.m127647v(c24902e, this);
                    if (m127647v == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope2;
                    obj = m127647v;
                }
                C24898a c24898a = (C24898a) obj;
                C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_LOAD_MUSIC", new a(this.f121922x, c24898a));
                if (CoroutineScopeKt.m112642f(coroutineScope)) {
                    this.f121922x.m131853a().mo104706b(c24898a);
                }
                return C24848g0.f119245a;
            }

            @Override // en0.InterfaceC18509p
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(b bVar, CoroutineExceptionHandler coroutineExceptionHandler, Continuation continuation) {
            super(2, continuation);
            this.f121907w = bVar;
            this.f121908x = coroutineExceptionHandler;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            e eVar = new e(this.f121907w, this.f121908x, continuation);
            eVar.f121905u = obj;
            return eVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            CoroutineScope coroutineScope;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f121904t;
            if (i11 != 0) {
                if (i11 == 1) {
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.f121905u;
                    AbstractC24862s.m129228b(obj);
                    coroutineScope = coroutineScope2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.f121905u;
                if (C25455g.this.m131850c().mo131936a(false)) {
                    C24405q m131851d = C25455g.this.m131851d();
                    String m131854b = this.f121907w.m131854b();
                    this.f121905u = coroutineScope3;
                    this.f121904t = 1;
                    Object mo127588f = m131851d.mo127588f(m131854b, this);
                    if (mo127588f == m142578e) {
                        return m142578e;
                    }
                    coroutineScope = coroutineScope3;
                    obj = mo127588f;
                } else {
                    throw ExceptionNoNetwork.f46313p;
                }
            }
            C24902e c24902e = (C24902e) obj;
            C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_LOAD_MUSIC", new a(this.f121907w, c24902e));
            this.f121907w.m131853a().mo104708d(c24902e);
            if (c24902e.m129486b() && CoroutineScopeKt.m112642f(coroutineScope)) {
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f121908x, null, new b(C25455g.this, c24902e, this.f121907w, null), 2, null);
            }
            if (c24902e.m129485a() && CoroutineScopeKt.m112642f(coroutineScope)) {
                BuildersKt__Builders_commonKt.m112540d(coroutineScope, this.f121908x, null, new c(C25455g.this, c24902e, this.f121907w, null), 2, null);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((e) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: qp.g$f */
    /* loaded from: classes4.dex */
    static final class f extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ b f121925q;

        /* renamed from: r */
        final /* synthetic */ Throwable f121926r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(b bVar, Throwable th2) {
            super(0);
            this.f121925q = bVar;
            this.f121926r = th2;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String mo12V4() {
            return "song " + this.f121925q.m131854b() + " exception " + this.f121926r;
        }
    }

    public /* synthetic */ C25455g(C24405q c24405q, InterfaceC25469b interfaceC25469b, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? C24405q.Companion.m127651a() : c24405q, (i11 & 2) != 0 ? new C25478k() : interfaceC25469b);
    }

    /* renamed from: c */
    public final InterfaceC25469b m131850c() {
        return this.f121897b;
    }

    /* renamed from: d */
    public final C24405q m131851d() {
        return this.f121896a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        Job m112540d;
        AbstractC19074t.m100208f(bVar, "params");
        C26359h.f125209a.mo135685a("FEED_MUSIC", "USECASE_LOAD_MUSIC", new d(bVar));
        c cVar = new c(CoroutineExceptionHandler.f105837l, bVar);
        m112540d = BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(bVar.m131855c().mo9207O().mo112823d0(SupervisorKt.m112864b(null, 1, null))), cVar, null, new e(bVar, cVar, null), 2, null);
        this.f121898c = m112540d;
    }

    public C25455g(C24405q c24405q, InterfaceC25469b interfaceC25469b) {
        AbstractC19074t.m100208f(c24405q, "repo");
        AbstractC19074t.m100208f(interfaceC25469b, "networkInfoProvider");
        this.f121896a = c24405q;
        this.f121897b = interfaceC25469b;
    }
}
