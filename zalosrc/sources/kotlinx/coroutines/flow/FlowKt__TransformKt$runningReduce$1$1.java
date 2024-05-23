package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ C19059j0 f106971p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106972q;

    /* renamed from: r */
    final /* synthetic */ FlowCollector f106973r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__TransformKt$runningReduce$1$1(C19059j0 c19059j0, InterfaceC18510q interfaceC18510q, FlowCollector flowCollector) {
        this.f106971p = c19059j0;
        this.f106972q = interfaceC18510q;
        this.f106973r = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__TransformKt$runningReduce$1$1$emit$1 flowKt__TransformKt$runningReduce$1$1$emit$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        FlowKt__TransformKt$runningReduce$1$1<T> flowKt__TransformKt$runningReduce$1$1;
        C19059j0 c19059j02;
        FlowCollector flowCollector;
        Object obj2;
        if (continuation instanceof FlowKt__TransformKt$runningReduce$1$1$emit$1) {
            flowKt__TransformKt$runningReduce$1$1$emit$1 = (FlowKt__TransformKt$runningReduce$1$1$emit$1) continuation;
            int i12 = flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w = i12 - Integer.MIN_VALUE;
                Object obj3 = flowKt__TransformKt$runningReduce$1$1$emit$1.f106976u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj3);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19059j02 = (C19059j0) flowKt__TransformKt$runningReduce$1$1$emit$1.f106975t;
                    flowKt__TransformKt$runningReduce$1$1 = (FlowKt__TransformKt$runningReduce$1$1) flowKt__TransformKt$runningReduce$1$1$emit$1.f106974s;
                    AbstractC24862s.m129228b(obj3);
                } else {
                    AbstractC24862s.m129228b(obj3);
                    c19059j0 = this.f106971p;
                    Object obj4 = c19059j0.f94941p;
                    if (obj4 == NullSurrogateKt.f107313a) {
                        flowKt__TransformKt$runningReduce$1$1 = this;
                        c19059j0.f94941p = obj;
                        flowCollector = flowKt__TransformKt$runningReduce$1$1.f106973r;
                        obj2 = flowKt__TransformKt$runningReduce$1$1.f106971p.f94941p;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.f106974s = null;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.f106975t = null;
                        flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w = 2;
                        if (flowCollector.mo12109b(obj2, flowKt__TransformKt$runningReduce$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    InterfaceC18510q interfaceC18510q = this.f106972q;
                    flowKt__TransformKt$runningReduce$1$1$emit$1.f106974s = this;
                    flowKt__TransformKt$runningReduce$1$1$emit$1.f106975t = c19059j0;
                    flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w = 1;
                    Object mo45599Hr = interfaceC18510q.mo45599Hr(obj4, obj, flowKt__TransformKt$runningReduce$1$1$emit$1);
                    if (mo45599Hr == m142578e) {
                        return m142578e;
                    }
                    flowKt__TransformKt$runningReduce$1$1 = this;
                    obj3 = mo45599Hr;
                    c19059j02 = c19059j0;
                }
                Object obj5 = obj3;
                c19059j0 = c19059j02;
                obj = obj5;
                c19059j0.f94941p = obj;
                flowCollector = flowKt__TransformKt$runningReduce$1$1.f106973r;
                obj2 = flowKt__TransformKt$runningReduce$1$1.f106971p.f94941p;
                flowKt__TransformKt$runningReduce$1$1$emit$1.f106974s = null;
                flowKt__TransformKt$runningReduce$1$1$emit$1.f106975t = null;
                flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w = 2;
                if (flowCollector.mo12109b(obj2, flowKt__TransformKt$runningReduce$1$1$emit$1) == m142578e) {
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__TransformKt$runningReduce$1$1$emit$1 = new FlowKt__TransformKt$runningReduce$1$1$emit$1(this, continuation);
        Object obj32 = flowKt__TransformKt$runningReduce$1$1$emit$1.f106976u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w;
        if (i11 == 0) {
        }
        Object obj52 = obj32;
        c19059j0 = c19059j02;
        obj = obj52;
        c19059j0.f94941p = obj;
        flowCollector = flowKt__TransformKt$runningReduce$1$1.f106973r;
        obj2 = flowKt__TransformKt$runningReduce$1$1.f106971p.f94941p;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f106974s = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f106975t = null;
        flowKt__TransformKt$runningReduce$1$1$emit$1.f106978w = 2;
        if (flowCollector.mo12109b(obj2, flowKt__TransformKt$runningReduce$1$1$emit$1) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
