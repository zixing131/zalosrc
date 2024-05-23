package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", m145345f = "Emitters.kt", m145346l = {40}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$transform$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106634t;

    /* renamed from: u */
    private /* synthetic */ Object f106635u;

    /* renamed from: v */
    final /* synthetic */ Flow f106636v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18510q f106637w;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218171<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ InterfaceC18510q f106638p;

        /* renamed from: q */
        final /* synthetic */ FlowCollector f106639q;

        public C218171(InterfaceC18510q interfaceC18510q, FlowCollector flowCollector) {
            this.f106638p = interfaceC18510q;
            this.f106639q = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(Object obj, Continuation continuation) {
            FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
            Object m142578e;
            int i11;
            if (continuation instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) continuation;
                int i12 = flowKt__EmittersKt$transform$1$1$emit$1.f106642u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    flowKt__EmittersKt$transform$1$1$emit$1.f106642u = i12 - Integer.MIN_VALUE;
                    Object obj2 = flowKt__EmittersKt$transform$1$1$emit$1.f106640s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = flowKt__EmittersKt$transform$1$1$emit$1.f106642u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        InterfaceC18510q interfaceC18510q = this.f106638p;
                        FlowCollector flowCollector = this.f106639q;
                        flowKt__EmittersKt$transform$1$1$emit$1.f106642u = 1;
                        if (interfaceC18510q.mo45599Hr(flowCollector, obj, flowKt__EmittersKt$transform$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, continuation);
            Object obj22 = flowKt__EmittersKt$transform$1$1$emit$1.f106640s;
            m142578e = AbstractC28298d.m142578e();
            i11 = flowKt__EmittersKt$transform$1$1$emit$1.f106642u;
            if (i11 == 0) {
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$transform$1(Flow flow, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f106636v = flow;
        this.f106637w = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__EmittersKt$transform$1 flowKt__EmittersKt$transform$1 = new FlowKt__EmittersKt$transform$1(this.f106636v, this.f106637w, continuation);
        flowKt__EmittersKt$transform$1.f106635u = obj;
        return flowKt__EmittersKt$transform$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106634t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f106635u;
            Flow flow = this.f106636v;
            C218171 c218171 = new C218171(this.f106637w, flowCollector);
            this.f106634t = 1;
            if (flow.mo97893a(c218171, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__EmittersKt$transform$1) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
