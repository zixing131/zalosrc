package p321le;

import en0.InterfaceC18509p;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ie.C20525a;
import je.C21228a;
import ke.InterfaceC21698a;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import p185gc.AbstractC19383g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: le.f */
/* loaded from: classes3.dex */
public final class C22455f extends AbstractC19383g {

    /* renamed from: a */
    private final InterfaceC21698a f109834a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: le.f$a */
    /* loaded from: classes3.dex */
    public static final class a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f109835t;

        /* renamed from: v */
        final /* synthetic */ C21228a f109837v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C21228a c21228a, Continuation continuation) {
            super(2, continuation);
            this.f109837v = c21228a;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new a(this.f109837v, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f109835t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                InterfaceC21698a interfaceC21698a = C22455f.this.f109834a;
                C21228a c21228a = this.f109837v;
                this.f109835t = 1;
                if (interfaceC21698a.mo106627h(c21228a, this) == m142578e) {
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

    public C22455f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p185gc.AbstractC19383g
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo12006b(C21228a c21228a) {
        AbstractC19074t.m100208f(c21228a, "params");
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(Dispatchers.m112680b()), null, null, new a(c21228a, null), 3, null);
    }

    public C22455f(InterfaceC21698a interfaceC21698a) {
        AbstractC19074t.m100208f(interfaceC21698a, "repo");
        this.f109834a = interfaceC21698a;
    }

    public /* synthetic */ C22455f(InterfaceC21698a interfaceC21698a, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? new C20525a() : interfaceC21698a);
    }
}
