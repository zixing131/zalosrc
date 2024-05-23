package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Object f106951p;

    /* renamed from: q */
    final /* synthetic */ Flow f106952q;

    /* renamed from: r */
    final /* synthetic */ InterfaceC18510q f106953r;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", m145345f = "Transform.kt", m145346l = {114, 115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218441 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106954s;

        /* renamed from: t */
        int f106955t;

        /* renamed from: v */
        Object f106957v;

        /* renamed from: w */
        Object f106958w;

        /* renamed from: x */
        Object f106959x;

        public C218441(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106954s = obj;
            this.f106955t |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218441 c218441;
        Object m142578e;
        int i11;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        FlowCollector flowCollector2;
        C19059j0 c19059j0;
        Flow flow;
        FlowKt__TransformKt$runningFold$1$1 flowKt__TransformKt$runningFold$1$1;
        if (continuation instanceof C218441) {
            c218441 = (C218441) continuation;
            int i12 = c218441.f106955t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218441.f106955t = i12 - Integer.MIN_VALUE;
                Object obj = c218441.f106954s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218441.f106955t;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c19059j0 = (C19059j0) c218441.f106959x;
                    flowCollector2 = (FlowCollector) c218441.f106958w;
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) c218441.f106957v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19059j0 c19059j02 = new C19059j0();
                    Object obj2 = this.f106951p;
                    c19059j02.f94941p = obj2;
                    c218441.f106957v = this;
                    c218441.f106958w = flowCollector;
                    c218441.f106959x = c19059j02;
                    c218441.f106955t = 1;
                    if (flowCollector.mo12109b(obj2, c218441) == m142578e) {
                        return m142578e;
                    }
                    flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
                    flowCollector2 = flowCollector;
                    c19059j0 = c19059j02;
                }
                flow = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f106952q;
                flowKt__TransformKt$runningFold$1$1 = new FlowKt__TransformKt$runningFold$1$1(c19059j0, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f106953r, flowCollector2);
                c218441.f106957v = null;
                c218441.f106958w = null;
                c218441.f106959x = null;
                c218441.f106955t = 2;
                if (flow.mo97893a(flowKt__TransformKt$runningFold$1$1, c218441) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        c218441 = new C218441(continuation);
        Object obj3 = c218441.f106954s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218441.f106955t;
        if (i11 == 0) {
        }
        flow = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f106952q;
        flowKt__TransformKt$runningFold$1$1 = new FlowKt__TransformKt$runningFold$1$1(c19059j0, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.f106953r, flowCollector2);
        c218441.f106957v = null;
        c218441.f106958w = null;
        c218441.f106959x = null;
        c218441.f106955t = 2;
        if (flow.mo97893a(flowKt__TransformKt$runningFold$1$1, c218441) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
