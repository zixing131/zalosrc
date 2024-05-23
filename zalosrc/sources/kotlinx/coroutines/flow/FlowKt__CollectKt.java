package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__CollectKt {
    /* renamed from: a */
    public static final Object m113318a(Flow flow, Continuation continuation) {
        Object m142578e;
        Object mo97893a = flow.mo97893a(NopCollector.f107312p, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: b */
    public static final Object m113319b(Flow flow, InterfaceC18509p interfaceC18509p, Continuation continuation) {
        Flow m113325b;
        Object m142578e;
        m113325b = FlowKt__ContextKt.m113325b(FlowKt.m113271G(flow, interfaceC18509p), 0, null, 2, null);
        Object m113291i = FlowKt.m113291i(m113325b, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113291i == m142578e) {
            return m113291i;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: c */
    public static final Object m113320c(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        Object m142578e;
        FlowKt.m113302t(flowCollector);
        Object mo97893a = flow.mo97893a(flowCollector, continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: d */
    public static final Job m113321d(Flow flow, CoroutineScope coroutineScope) {
        Job m112540d;
        m112540d = BuildersKt__Builders_commonKt.m112540d(coroutineScope, null, null, new FlowKt__CollectKt$launchIn$1(flow, null), 3, null);
        return m112540d;
    }
}
