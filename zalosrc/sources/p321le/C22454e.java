package p321le;

import bp0.AbstractC3082b0;
import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import ie.C20525a;
import je.C21228a;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.SupervisorKt;
import p185gc.AbstractC19383g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;

/* renamed from: le.e */
/* loaded from: classes3.dex */
public final class C22454e extends AbstractC19383g {

    /* renamed from: a */
    private final InterfaceC21698a f109824a;

    /* renamed from: b */
    private final C22452c f109825b;

    /* renamed from: c */
    private final CoroutineScope f109826c;

    /* renamed from: le.e$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo102111a(C21228a c21228a, String str);
    }

    /* renamed from: le.e$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final int f109827a;

        /* renamed from: b */
        private final a f109828b;

        public b(int i11, a aVar) {
            this.f109827a = i11;
            this.f109828b = aVar;
        }

        /* renamed from: a */
        public final a m116095a() {
            return this.f109828b;
        }

        /* renamed from: b */
        public final int m116096b() {
            return this.f109827a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f109827a == bVar.f109827a && AbstractC19074t.m100204b(this.f109828b, bVar.f109828b);
        }

        public int hashCode() {
            int i11 = this.f109827a * 31;
            a aVar = this.f109828b;
            return i11 + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "Params(rbtId=" + this.f109827a + ", onResult=" + this.f109828b + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.e$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f109829t;

        /* renamed from: u */
        Object f109830u;

        /* renamed from: v */
        int f109831v;

        /* renamed from: x */
        final /* synthetic */ b f109833x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f109833x = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new c(this.f109833x, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x006d  */
        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C21228a c21228a;
            b bVar;
            a m116095a;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109831v;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        c21228a = (C21228a) this.f109830u;
                        bVar = (b) this.f109829t;
                        AbstractC24862s.m129228b(obj);
                        String str = (String) obj;
                        m116095a = bVar.m116095a();
                        if (m116095a != null) {
                            m116095a.mo102111a(c21228a, str);
                        }
                        return C24848g0.f119245a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
            } else {
                AbstractC24862s.m129228b(obj);
                C22452c c22452c = C22454e.this.f109825b;
                Integer m145341c = AbstractC29094b.m145341c(this.f109833x.m116096b());
                this.f109831v = 1;
                obj = c22452c.m101498a(m145341c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            C21228a c21228a2 = (C21228a) obj;
            if (c21228a2 != null) {
                C22454e c22454e = C22454e.this;
                b bVar2 = this.f109833x;
                AbstractC3082b0.m15424f("rbt", "GetDetailsRingBackToneById success");
                InterfaceC21698a interfaceC21698a = c22454e.f109824a;
                this.f109829t = bVar2;
                this.f109830u = c21228a2;
                this.f109831v = 2;
                Object mo106624e = interfaceC21698a.mo106624e(c21228a2, this);
                if (mo106624e == m142578e) {
                    return m142578e;
                }
                c21228a = c21228a2;
                obj = mo106624e;
                bVar = bVar2;
                String str2 = (String) obj;
                m116095a = bVar.m116095a();
                if (m116095a != null) {
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: le.e$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC27310a implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    public C22454e() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo12006b(b bVar) {
        AbstractC19074t.m100208f(bVar, "params");
        BuildersKt__Builders_commonKt.m112540d(this.f109826c, Dispatchers.m112680b(), null, new c(bVar, null), 2, null);
    }

    public /* synthetic */ C22454e(InterfaceC21698a interfaceC21698a, C22452c c22452c, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20525a() : interfaceC21698a, (i11 & 2) != 0 ? new C22452c(null, 1, null) : c22452c);
    }

    public C22454e(InterfaceC21698a interfaceC21698a, C22452c c22452c) {
        AbstractC19074t.m100208f(interfaceC21698a, "repo");
        AbstractC19074t.m100208f(c22452c, "getDetailsRingBackToneActor");
        this.f109824a = interfaceC21698a;
        this.f109825b = c22452c;
        this.f109826c = CoroutineScopeKt.m112637a(SupervisorKt.m112864b(null, 1, null).mo112823d0(new d(CoroutineExceptionHandler.f105837l)));
    }
}
