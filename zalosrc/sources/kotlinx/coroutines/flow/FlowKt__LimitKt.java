package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19051f0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__LimitKt {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113365b(Flow flow, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        FlowKt__LimitKt$collectWhile$1 flowKt__LimitKt$collectWhile$1;
        Object m142578e;
        int i11;
        FlowCollector flowCollector;
        if (continuation instanceof FlowKt__LimitKt$collectWhile$1) {
            flowKt__LimitKt$collectWhile$1 = (FlowKt__LimitKt$collectWhile$1) continuation;
            int i12 = flowKt__LimitKt$collectWhile$1.f106711u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$collectWhile$1.f106711u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__LimitKt$collectWhile$1.f106710t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__LimitKt$collectWhile$1.f106711u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowCollector = (FlowKt__LimitKt$collectWhile$collector$1) flowKt__LimitKt$collectWhile$1.f106709s;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (AbortFlowException e11) {
                            e = e11;
                            FlowExceptions_commonKt.m113553a(e, flowCollector);
                            return C24848g0.f119245a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    FlowCollector flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(interfaceC18509p);
                    try {
                        flowKt__LimitKt$collectWhile$1.f106709s = flowKt__LimitKt$collectWhile$collector$1;
                        flowKt__LimitKt$collectWhile$1.f106711u = 1;
                        if (flow.mo97893a(flowKt__LimitKt$collectWhile$collector$1, flowKt__LimitKt$collectWhile$1) == m142578e) {
                            return m142578e;
                        }
                    } catch (AbortFlowException e12) {
                        e = e12;
                        flowCollector = flowKt__LimitKt$collectWhile$collector$1;
                        FlowExceptions_commonKt.m113553a(e, flowCollector);
                        return C24848g0.f119245a;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__LimitKt$collectWhile$1 = new FlowKt__LimitKt$collectWhile$1(continuation);
        Object obj2 = flowKt__LimitKt$collectWhile$1.f106710t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__LimitKt$collectWhile$1.f106711u;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }

    /* renamed from: c */
    public static final Flow m113366c(Flow flow, InterfaceC18509p interfaceC18509p) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1

            /* renamed from: q */
            final /* synthetic */ InterfaceC18509p f106683q;

            public FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1(InterfaceC18509p interfaceC18509p2) {
                r2 = interfaceC18509p2;
            }

            @Override // kotlinx.coroutines.flow.Flow
            /* renamed from: a */
            public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                Object m142578e;
                Object mo97893a = Flow.this.mo97893a(new FlowKt__LimitKt$dropWhile$1$1(new C19051f0(), flowCollector, r2), continuation);
                m142578e = AbstractC28298d.m142578e();
                if (mo97893a == m142578e) {
                    return mo97893a;
                }
                return C24848g0.f119245a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113367d(FlowCollector flowCollector, Object obj, Continuation continuation) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        Object m142578e;
        int i11;
        if (continuation instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) continuation;
            int i12 = flowKt__LimitKt$emitAbort$1.f106733u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.f106733u = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$emitAbort$1.f106732t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__LimitKt$emitAbort$1.f106733u;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) flowKt__LimitKt$emitAbort$1.f106731s;
                    AbstractC24862s.m129228b(obj2);
                } else {
                    AbstractC24862s.m129228b(obj2);
                    flowKt__LimitKt$emitAbort$1.f106731s = flowCollector;
                    flowKt__LimitKt$emitAbort$1.f106733u = 1;
                    if (flowCollector.mo12109b(obj, flowKt__LimitKt$emitAbort$1) == m142578e) {
                        return m142578e;
                    }
                }
                throw new AbortFlowException(flowCollector);
            }
        }
        flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(continuation);
        Object obj22 = flowKt__LimitKt$emitAbort$1.f106732t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__LimitKt$emitAbort$1.f106733u;
        if (i11 == 0) {
        }
        throw new AbortFlowException(flowCollector);
    }
}
