package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", m145345f = "Limit.kt", m145346l = {152}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__LimitKt$transformWhile$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106740t;

    /* renamed from: u */
    private /* synthetic */ Object f106741u;

    /* renamed from: v */
    final /* synthetic */ Flow f106742v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18510q f106743w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__LimitKt$transformWhile$1(Flow flow, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f106742v = flow;
        this.f106743w = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f106742v, this.f106743w, continuation);
        flowKt__LimitKt$transformWhile$1.f106741u = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        C21823xdf1aa1b6 c21823xdf1aa1b6;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106740t;
        if (i11 != 0) {
            if (i11 == 1) {
                c21823xdf1aa1b6 = (C21823xdf1aa1b6) this.f106741u;
                try {
                    AbstractC24862s.m129228b(obj);
                } catch (AbortFlowException e11) {
                    e = e11;
                    FlowExceptions_commonKt.m113553a(e, c21823xdf1aa1b6);
                    return C24848g0.f119245a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f106741u;
            Flow flow = this.f106742v;
            C21823xdf1aa1b6 c21823xdf1aa1b62 = new C21823xdf1aa1b6(this.f106743w, flowCollector);
            try {
                this.f106741u = c21823xdf1aa1b62;
                this.f106740t = 1;
                if (flow.mo97893a(c21823xdf1aa1b62, this) == m142578e) {
                    return m142578e;
                }
            } catch (AbortFlowException e12) {
                e = e12;
                c21823xdf1aa1b6 = c21823xdf1aa1b62;
                FlowExceptions_commonKt.m113553a(e, c21823xdf1aa1b6);
                return C24848g0.f119245a;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__LimitKt$transformWhile$1) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
