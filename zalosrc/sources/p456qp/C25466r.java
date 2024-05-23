package p456qp;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import p185gc.AbstractC19383g;
import p399op.C24405q;
import p509sp.C26354c;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: qp.r */
/* loaded from: classes4.dex */
public final class C25466r extends AbstractC19383g {

    /* renamed from: qp.r$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: a */
        void mo45839a(int i11);

        /* renamed from: c */
        void mo45840c(Exception exc);
    }

    /* renamed from: qp.r$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a */
        private final int f122037a;

        /* renamed from: b */
        private final a f122038b;

        /* renamed from: c */
        private final CoroutineScope f122039c;

        public b(int i11, a aVar, CoroutineScope coroutineScope) {
            AbstractC19074t.m100208f(aVar, "callback");
            AbstractC19074t.m100208f(coroutineScope, "externalScope");
            this.f122037a = i11;
            this.f122038b = aVar;
            this.f122039c = coroutineScope;
        }

        /* renamed from: a */
        public final a m131928a() {
            return this.f122038b;
        }

        /* renamed from: b */
        public final CoroutineScope m131929b() {
            return this.f122039c;
        }

        /* renamed from: c */
        public final int m131930c() {
            return this.f122037a;
        }
    }

    /* renamed from: qp.r$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC27310a implements CoroutineExceptionHandler {

        /* renamed from: q */
        final /* synthetic */ b f122040q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, b bVar) {
            super(key);
            this.f122040q = bVar;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            a m131928a = this.f122040q.m131928a();
            AbstractC19074t.m100206d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            m131928a.mo45840c((Exception) th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qp.r$d */
    /* loaded from: classes4.dex */
    public static final class d extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122041t;

        /* renamed from: u */
        final /* synthetic */ b f122042u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f122042u = bVar;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new d(this.f122042u, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f122041t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C24405q m127651a = C24405q.Companion.m127651a();
                int m131930c = this.f122042u.m131930c();
                this.f122041t = 1;
                obj = m127651a.mo127591j(m131930c, this);
                if (obj == m142578e) {
                    return m142578e;
                }
            }
            int intValue = ((Number) obj).intValue();
            C26354c.f125196a.m135674e(intValue);
            this.f122042u.m131928a().mo45839a(intValue);
            return C24848g0.f119245a;
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
        AbstractC19074t.m100208f(bVar, "params");
        BuildersKt__Builders_commonKt.m112540d(bVar.m131929b(), new c(CoroutineExceptionHandler.f105837l, bVar), null, new d(bVar, null), 2, null);
    }
}
