package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", m145345f = "ChannelFlow.kt", m145346l = {212}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class UndispatchedContextCollector$emitRef$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107335t;

    /* renamed from: u */
    /* synthetic */ Object f107336u;

    /* renamed from: v */
    final /* synthetic */ FlowCollector f107337v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndispatchedContextCollector$emitRef$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f107337v = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.f107337v, continuation);
        undispatchedContextCollector$emitRef$1.f107336u = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107335t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            Object obj2 = this.f107336u;
            FlowCollector flowCollector = this.f107337v;
            this.f107335t = 1;
            if (flowCollector.mo12109b(obj2, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(Object obj, Continuation continuation) {
        return ((UndispatchedContextCollector$emitRef$1) mo238a(obj, continuation)).mo239o(C24848g0.f119245a);
    }
}
