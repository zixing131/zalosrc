package p165fp;

import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;

/* renamed from: fp.e */
/* loaded from: classes4.dex */
public abstract class AbstractC19099e {

    /* renamed from: fp.e$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f95072t;

        /* renamed from: u */
        /* synthetic */ Object f95073u;

        /* renamed from: v */
        final /* synthetic */ InterfaceC18505l f95074v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC18505l interfaceC18505l, Continuation continuation) {
            super(3, continuation);
            this.f95074v = interfaceC18505l;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            AbstractC28298d.m142578e();
            if (this.f95072t == 0) {
                AbstractC24862s.m129228b(obj);
                this.f95074v.mo205i9((Throwable) this.f95073u);
                return C24848g0.f119245a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
            a aVar = new a(this.f95074v, continuation);
            aVar.f95073u = th2;
            return aVar.mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: a */
    public static final Flow m100324a(Flow flow, InterfaceC18505l interfaceC18505l) {
        AbstractC19074t.m100208f(flow, "<this>");
        AbstractC19074t.m100208f(interfaceC18505l, "action");
        return FlowKt.m113288f(flow, new a(interfaceC18505l, null));
    }
}
