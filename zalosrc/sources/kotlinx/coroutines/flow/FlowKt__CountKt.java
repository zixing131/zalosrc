package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19055h0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__CountKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113329a(Flow flow, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        FlowKt__CountKt$count$3 flowKt__CountKt$count$3;
        Object m142578e;
        int i11;
        C19055h0 c19055h0;
        if (continuation instanceof FlowKt__CountKt$count$3) {
            flowKt__CountKt$count$3 = (FlowKt__CountKt$count$3) continuation;
            int i12 = flowKt__CountKt$count$3.f106527u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$3.f106527u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__CountKt$count$3.f106526t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__CountKt$count$3.f106527u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19055h0 = (C19055h0) flowKt__CountKt$count$3.f106525s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19055h0 c19055h02 = new C19055h0();
                    FlowCollector flowKt__CountKt$count$4 = new FlowKt__CountKt$count$4(interfaceC18509p, c19055h02);
                    flowKt__CountKt$count$3.f106525s = c19055h02;
                    flowKt__CountKt$count$3.f106527u = 1;
                    if (flow.mo97893a(flowKt__CountKt$count$4, flowKt__CountKt$count$3) == m142578e) {
                        return m142578e;
                    }
                    c19055h0 = c19055h02;
                }
                return AbstractC29094b.m145341c(c19055h0.f94931p);
            }
        }
        flowKt__CountKt$count$3 = new FlowKt__CountKt$count$3(continuation);
        Object obj2 = flowKt__CountKt$count$3.f106526t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__CountKt$count$3.f106527u;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145341c(c19055h0.f94931p);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113330b(Flow flow, Continuation continuation) {
        FlowKt__CountKt$count$1 flowKt__CountKt$count$1;
        Object m142578e;
        int i11;
        C19055h0 c19055h0;
        if (continuation instanceof FlowKt__CountKt$count$1) {
            flowKt__CountKt$count$1 = (FlowKt__CountKt$count$1) continuation;
            int i12 = flowKt__CountKt$count$1.f106523u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__CountKt$count$1.f106523u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__CountKt$count$1.f106522t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__CountKt$count$1.f106523u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19055h0 = (C19055h0) flowKt__CountKt$count$1.f106521s;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    final C19055h0 c19055h02 = new C19055h0();
                    FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CountKt$count$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* renamed from: b */
                        public final Object mo12109b(Object obj2, Continuation continuation2) {
                            C19055h0.this.f94931p++;
                            return C24848g0.f119245a;
                        }
                    };
                    flowKt__CountKt$count$1.f106521s = c19055h02;
                    flowKt__CountKt$count$1.f106523u = 1;
                    if (flow.mo97893a(flowCollector, flowKt__CountKt$count$1) == m142578e) {
                        return m142578e;
                    }
                    c19055h0 = c19055h02;
                }
                return AbstractC29094b.m145341c(c19055h0.f94931p);
            }
        }
        flowKt__CountKt$count$1 = new FlowKt__CountKt$count$1(continuation);
        Object obj2 = flowKt__CountKt$count$1.f106522t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__CountKt$count$1.f106523u;
        if (i11 == 0) {
        }
        return AbstractC29094b.m145341c(c19055h0.f94931p);
    }
}
