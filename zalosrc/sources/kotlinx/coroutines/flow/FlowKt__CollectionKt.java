package kotlinx.coroutines.flow;

import java.util.Collection;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__CollectionKt {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113323a(Flow flow, final Collection collection, Continuation continuation) {
        FlowKt__CollectionKt$toCollection$1 flowKt__CollectionKt$toCollection$1;
        Object m142578e;
        int i11;
        if (continuation instanceof FlowKt__CollectionKt$toCollection$1) {
            flowKt__CollectionKt$toCollection$1 = (FlowKt__CollectionKt$toCollection$1) continuation;
            int i12 = flowKt__CollectionKt$toCollection$1.f106519u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__CollectionKt$toCollection$1.f106519u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__CollectionKt$toCollection$1.f106518t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__CollectionKt$toCollection$1.f106519u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        Collection collection2 = (Collection) flowKt__CollectionKt$toCollection$1.f106517s;
                        AbstractC24862s.m129228b(obj);
                        return collection2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CollectionKt$toCollection$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    public final Object mo12109b(Object obj2, Continuation continuation2) {
                        collection.add(obj2);
                        return C24848g0.f119245a;
                    }
                };
                flowKt__CollectionKt$toCollection$1.f106517s = collection;
                flowKt__CollectionKt$toCollection$1.f106519u = 1;
                if (flow.mo97893a(flowCollector, flowKt__CollectionKt$toCollection$1) == m142578e) {
                    return m142578e;
                }
                return collection;
            }
        }
        flowKt__CollectionKt$toCollection$1 = new FlowKt__CollectionKt$toCollection$1(continuation);
        Object obj2 = flowKt__CollectionKt$toCollection$1.f106518t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__CollectionKt$toCollection$1.f106519u;
        if (i11 == 0) {
        }
    }
}
