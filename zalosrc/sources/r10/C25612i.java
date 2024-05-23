package r10;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.SupervisorKt;
import p185gc.AbstractC19383g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import um0.AbstractC27310a;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import x00.InterfaceC29280a;

/* renamed from: r10.i */
/* loaded from: classes5.dex */
public final class C25612i extends AbstractC19383g {

    /* renamed from: a */
    private final InterfaceC29280a f122453a;

    /* renamed from: b */
    private final CoroutineScope f122454b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r10.i$a */
    /* loaded from: classes5.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f122455t;

        /* renamed from: v */
        final /* synthetic */ boolean f122457v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z11, Continuation continuation) {
            super(2, continuation);
            this.f122457v = z11;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f122457v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f122455t == 0) {
                AbstractC24862s.m129228b(obj);
                C25612i.this.f122453a.mo146302D(this.f122457v);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: r10.i$b */
    /* loaded from: classes5.dex */
    public static final class b extends AbstractC27310a implements CoroutineExceptionHandler {
        public b(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        /* renamed from: G */
        public void mo35525G(InterfaceC27315f interfaceC27315f, Throwable th2) {
            AbstractC20110a.f98889a.mo104552e(th2);
        }
    }

    public C25612i(InterfaceC29280a interfaceC29280a) {
        AbstractC19074t.m100208f(interfaceC29280a, "cacheRepository");
        this.f122453a = interfaceC29280a;
        this.f122454b = CoroutineScopeKt.m112637a(SupervisorKt.m112864b(null, 1, null).mo112823d0(new b(CoroutineExceptionHandler.f105837l)));
    }

    @Override // p185gc.AbstractC19383g
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo12006b(Object obj) {
        m132290d(((Boolean) obj).booleanValue());
    }

    /* renamed from: d */
    protected void m132290d(boolean z11) {
        BuildersKt__Builders_commonKt.m112540d(this.f122454b, null, null, new a(z11, null), 3, null);
    }
}
