package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 implements FlowCollector<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106696p;

    /* renamed from: q */
    final /* synthetic */ FlowCollector f106697q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", m145345f = "Limit.kt", m145346l = {142, 143}, m145347m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218221 extends AbstractC29096d {

        /* renamed from: s */
        Object f106698s;

        /* renamed from: t */
        /* synthetic */ Object f106699t;

        /* renamed from: u */
        int f106700u;

        /* renamed from: w */
        Object f106702w;

        public C218221(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106699t = obj;
            this.f106700u |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.this.mo12109b(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(InterfaceC18509p interfaceC18509p, FlowCollector flowCollector) {
        this.f106696p = interfaceC18509p;
        this.f106697q = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12109b(Object obj, Continuation continuation) {
        C218221 c218221;
        Object m142578e;
        int i11;
        boolean z11;
        Object obj2;
        Object obj3;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof C218221) {
            c218221 = (C218221) continuation;
            int i12 = c218221.f106700u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218221.f106700u = i12 - Integer.MIN_VALUE;
                Object obj4 = c218221.f106699t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218221.f106700u;
                z11 = true;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c218221.f106698s;
                            AbstractC24862s.m129228b(obj4);
                            if (z11) {
                                return C24848g0.f119245a;
                            }
                            throw new AbortFlowException(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj5 = c218221.f106702w;
                    FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c218221.f106698s;
                    AbstractC24862s.m129228b(obj4);
                    obj3 = obj5;
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                    obj2 = obj4;
                } else {
                    AbstractC24862s.m129228b(obj4);
                    InterfaceC18509p interfaceC18509p = this.f106696p;
                    c218221.f106698s = this;
                    c218221.f106702w = obj;
                    c218221.f106700u = 1;
                    AbstractC19072r.m100202c(6);
                    Object mo240pC = interfaceC18509p.mo240pC(obj, c218221);
                    AbstractC19072r.m100202c(7);
                    if (mo240pC == m142578e) {
                        return m142578e;
                    }
                    obj2 = mo240pC;
                    obj3 = obj;
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = this;
                }
                if (!((Boolean) obj2).booleanValue()) {
                    FlowCollector flowCollector = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1.f106697q;
                    c218221.f106698s = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
                    c218221.f106702w = null;
                    c218221.f106700u = 2;
                    if (flowCollector.mo12109b(obj3, c218221) == m142578e) {
                        return m142578e;
                    }
                } else {
                    z11 = false;
                }
                if (z11) {
                }
            }
        }
        c218221 = new C218221(continuation);
        Object obj42 = c218221.f106699t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218221.f106700u;
        z11 = true;
        if (i11 == 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
        if (z11) {
        }
    }
}
