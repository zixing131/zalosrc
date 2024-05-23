package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19051f0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {

    /* renamed from: p */
    final /* synthetic */ C19051f0 f106723p;

    /* renamed from: q */
    final /* synthetic */ FlowCollector f106724q;

    /* renamed from: r */
    final /* synthetic */ InterfaceC18509p f106725r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlowKt__LimitKt$dropWhile$1$1(C19051f0 c19051f0, FlowCollector flowCollector, InterfaceC18509p interfaceC18509p) {
        this.f106723p = c19051f0;
        this.f106724q = flowCollector;
        this.f106725r = interfaceC18509p;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo12109b(Object obj, Continuation continuation) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        Object m142578e;
        int i11;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
            int i12 = flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w = i12 - Integer.MIN_VALUE;
                Object obj2 = flowKt__LimitKt$dropWhile$1$1$emit$1.f106728u;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                AbstractC24862s.m129228b(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            obj = flowKt__LimitKt$dropWhile$1$1$emit$1.f106727t;
                            flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.f106726s;
                            AbstractC24862s.m129228b(obj2);
                            if (((Boolean) obj2).booleanValue()) {
                                flowKt__LimitKt$dropWhile$1$1.f106723p.f94928p = true;
                                FlowCollector flowCollector = flowKt__LimitKt$dropWhile$1$1.f106724q;
                                flowKt__LimitKt$dropWhile$1$1$emit$1.f106726s = null;
                                flowKt__LimitKt$dropWhile$1$1$emit$1.f106727t = null;
                                flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w = 3;
                                if (flowCollector.mo12109b(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == m142578e) {
                                    return m142578e;
                                }
                            } else {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        return C24848g0.f119245a;
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    if (this.f106723p.f94928p) {
                        FlowCollector flowCollector2 = this.f106724q;
                        flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w = 1;
                        if (flowCollector2.mo12109b(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                        return C24848g0.f119245a;
                    }
                    InterfaceC18509p interfaceC18509p = this.f106725r;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f106726s = this;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f106727t = obj;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w = 2;
                    obj2 = interfaceC18509p.mo240pC(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    flowKt__LimitKt$dropWhile$1$1 = this;
                    if (((Boolean) obj2).booleanValue()) {
                    }
                }
                return C24848g0.f119245a;
            }
        }
        flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
        Object obj22 = flowKt__LimitKt$dropWhile$1$1$emit$1.f106728u;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.f106730w;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
