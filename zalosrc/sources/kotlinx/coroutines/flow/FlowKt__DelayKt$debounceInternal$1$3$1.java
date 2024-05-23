package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m145345f = "Delay.kt", m145346l = {232}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends AbstractC29104l implements InterfaceC18505l {

    /* renamed from: t */
    int f106543t;

    /* renamed from: u */
    final /* synthetic */ FlowCollector f106544u;

    /* renamed from: v */
    final /* synthetic */ C19059j0 f106545v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(FlowCollector flowCollector, C19059j0 c19059j0, Continuation continuation) {
        super(1, continuation);
        this.f106544u = flowCollector;
        this.f106545v = c19059j0;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106543t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = this.f106544u;
            Symbol symbol = NullSurrogateKt.f107313a;
            Object obj2 = this.f106545v.f94941p;
            if (obj2 == symbol) {
                obj2 = null;
            }
            this.f106543t = 1;
            if (flowCollector.mo12109b(obj2, this) == m142578e) {
                return m142578e;
            }
        }
        this.f106545v.f94941p = null;
        return C24848g0.f119245a;
    }

    /* renamed from: r */
    public final Continuation m113338r(Continuation continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f106544u, this.f106545v, continuation);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Object mo205i9(Continuation continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) m113338r(continuation)).mo239o(C24848g0.f119245a);
    }
}
