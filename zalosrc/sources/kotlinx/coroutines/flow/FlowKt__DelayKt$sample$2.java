package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", m145345f = "Delay.kt", m145346l = {413}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$sample$2 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    Object f106562t;

    /* renamed from: u */
    Object f106563u;

    /* renamed from: v */
    int f106564v;

    /* renamed from: w */
    private /* synthetic */ Object f106565w;

    /* renamed from: x */
    /* synthetic */ Object f106566x;

    /* renamed from: y */
    final /* synthetic */ long f106567y;

    /* renamed from: z */
    final /* synthetic */ Flow f106568z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2(long j11, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.f106567y = j11;
        this.f106568z = flow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        ReceiveChannel m113334d;
        FlowCollector flowCollector;
        ReceiveChannel receiveChannel;
        C19059j0 c19059j0;
        ReceiveChannel receiveChannel2;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106564v;
        if (i11 != 0) {
            if (i11 == 1) {
                receiveChannel2 = (ReceiveChannel) this.f106563u;
                c19059j0 = (C19059j0) this.f106562t;
                receiveChannel = (ReceiveChannel) this.f106566x;
                flowCollector = (FlowCollector) this.f106565w;
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f106565w;
            FlowCollector flowCollector2 = (FlowCollector) this.f106566x;
            ReceiveChannel m113188e = ProduceKt.m113188e(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.f106568z, null), 1, null);
            C19059j0 c19059j02 = new C19059j0();
            m113334d = FlowKt__DelayKt.m113334d(coroutineScope, this.f106567y, 0L, 2, null);
            flowCollector = flowCollector2;
            receiveChannel = m113188e;
            c19059j0 = c19059j02;
            receiveChannel2 = m113334d;
        }
        while (c19059j0.f94941p != NullSurrogateKt.f107315c) {
            SelectImplementation selectImplementation = new SelectImplementation(getContext());
            selectImplementation.mo113831c(receiveChannel.mo113017w(), new FlowKt__DelayKt$sample$2$1$1(c19059j0, receiveChannel2, null));
            selectImplementation.mo113831c(receiveChannel2.mo113016u(), new FlowKt__DelayKt$sample$2$1$2(c19059j0, flowCollector, null));
            this.f106565w = flowCollector;
            this.f106566x = receiveChannel;
            this.f106562t = c19059j0;
            this.f106563u = receiveChannel2;
            this.f106564v = 1;
            if (selectImplementation.mo113858p(this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(CoroutineScope coroutineScope, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__DelayKt$sample$2 flowKt__DelayKt$sample$2 = new FlowKt__DelayKt$sample$2(this.f106567y, this.f106568z, continuation);
        flowKt__DelayKt$sample$2.f106565w = coroutineScope;
        flowKt__DelayKt$sample$2.f106566x = flowCollector;
        return flowKt__DelayKt$sample$2.mo239o(C24848g0.f119245a);
    }
}
