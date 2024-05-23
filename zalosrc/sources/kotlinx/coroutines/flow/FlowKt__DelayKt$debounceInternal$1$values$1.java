package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", m145345f = "Delay.kt", m145346l = {210}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$debounceInternal$1$values$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106551t;

    /* renamed from: u */
    private /* synthetic */ Object f106552u;

    /* renamed from: v */
    final /* synthetic */ Flow f106553v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218111<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ ProducerScope f106554p;

        C218111(ProducerScope producerScope) {
            this.f106554p = producerScope;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(Object obj, Continuation continuation) {
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            Object m142578e;
            int i11;
            if (continuation instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) continuation;
                int i12 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106557u;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106557u = i12 - Integer.MIN_VALUE;
                    Object obj2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106555s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106557u;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        ProducerScope producerScope = this.f106554p;
                        if (obj == null) {
                            obj = NullSurrogateKt.f107313a;
                        }
                        flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106557u = 1;
                        if (producerScope.mo112908S(obj, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
            Object obj22 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106555s;
            m142578e = AbstractC28298d.m142578e();
            i11 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f106557u;
            if (i11 == 0) {
            }
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$values$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.f106553v = flow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.f106553v, continuation);
        flowKt__DelayKt$debounceInternal$1$values$1.f106552u = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106551t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            ProducerScope producerScope = (ProducerScope) this.f106552u;
            Flow flow = this.f106553v;
            C218111 c218111 = new C218111(producerScope);
            this.f106551t = 1;
            if (flow.mo97893a(c218111, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(ProducerScope producerScope, Continuation continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) mo238a(producerScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
