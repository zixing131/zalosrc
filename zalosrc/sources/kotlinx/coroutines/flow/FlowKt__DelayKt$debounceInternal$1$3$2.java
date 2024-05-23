package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m145345f = "Delay.kt", m145346l = {242}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    Object f106546t;

    /* renamed from: u */
    int f106547u;

    /* renamed from: v */
    /* synthetic */ Object f106548v;

    /* renamed from: w */
    final /* synthetic */ C19059j0 f106549w;

    /* renamed from: x */
    final /* synthetic */ FlowCollector f106550x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(C19059j0 c19059j0, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f106549w = c19059j0;
        this.f106550x = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f106549w, this.f106550x, continuation);
        flowKt__DelayKt$debounceInternal$1$3$2.f106548v = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        C19059j0 c19059j0;
        C19059j0 c19059j02;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106547u;
        if (i11 != 0) {
            if (i11 == 1) {
                c19059j02 = (C19059j0) this.f106546t;
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            Object m113090k = ((ChannelResult) this.f106548v).m113090k();
            c19059j0 = this.f106549w;
            boolean z11 = m113090k instanceof ChannelResult.Failed;
            if (!z11) {
                c19059j0.f94941p = m113090k;
            }
            FlowCollector flowCollector = this.f106550x;
            if (z11) {
                Throwable m113084e = ChannelResult.m113084e(m113090k);
                if (m113084e == null) {
                    Object obj2 = c19059j0.f94941p;
                    if (obj2 != null) {
                        if (obj2 == NullSurrogateKt.f107313a) {
                            obj2 = null;
                        }
                        this.f106548v = m113090k;
                        this.f106546t = c19059j0;
                        this.f106547u = 1;
                        if (flowCollector.mo12109b(obj2, this) == m142578e) {
                            return m142578e;
                        }
                        c19059j02 = c19059j0;
                    }
                    c19059j0.f94941p = NullSurrogateKt.f107315c;
                } else {
                    throw m113084e;
                }
            }
            return C24848g0.f119245a;
        }
        c19059j0 = c19059j02;
        c19059j0.f94941p = NullSurrogateKt.f107315c;
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113340r(((ChannelResult) obj).m113090k(), (Continuation) obj2);
    }

    /* renamed from: r */
    public final Object m113340r(Object obj, Continuation continuation) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) mo238a(ChannelResult.m113081b(obj), continuation)).mo239o(C24848g0.f119245a);
    }
}
