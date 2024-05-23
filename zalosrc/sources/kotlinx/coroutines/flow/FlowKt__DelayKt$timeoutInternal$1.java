package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pn0.C24873a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m145345f = "Delay.kt", m145346l = {414}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$timeoutInternal$1 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    long f106583t;

    /* renamed from: u */
    int f106584u;

    /* renamed from: v */
    private /* synthetic */ Object f106585v;

    /* renamed from: w */
    /* synthetic */ Object f106586w;

    /* renamed from: x */
    final /* synthetic */ long f106587x;

    /* renamed from: y */
    final /* synthetic */ Flow f106588y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$timeoutInternal$1(long j11, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.f106587x = j11;
        this.f106588y = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007d -> B:5:0x0084). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Flow m113325b;
        long j11;
        FlowCollector flowCollector;
        ReceiveChannel receiveChannel;
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1;
        Object mo113858p;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106584u;
        if (i11 != 0) {
            if (i11 == 1) {
                long j12 = this.f106583t;
                ReceiveChannel receiveChannel2 = (ReceiveChannel) this.f106586w;
                FlowCollector flowCollector2 = (FlowCollector) this.f106585v;
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector3 = flowCollector2;
                long j13 = j12;
                ReceiveChannel receiveChannel3 = receiveChannel2;
                Object obj2 = m142578e;
                FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$12 = this;
                if (((Boolean) obj).booleanValue()) {
                    return C24848g0.f119245a;
                }
                flowKt__DelayKt$timeoutInternal$1 = flowKt__DelayKt$timeoutInternal$12;
                m142578e = obj2;
                receiveChannel = receiveChannel3;
                j11 = j13;
                flowCollector = flowCollector3;
                SelectImplementation selectImplementation = new SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
                selectImplementation.mo113831c(receiveChannel.mo113017w(), new FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
                OnTimeoutKt.m113829b(selectImplementation, j11, new FlowKt__DelayKt$timeoutInternal$1$1$2(j11, null));
                flowKt__DelayKt$timeoutInternal$1.f106585v = flowCollector;
                flowKt__DelayKt$timeoutInternal$1.f106586w = receiveChannel;
                flowKt__DelayKt$timeoutInternal$1.f106583t = j11;
                flowKt__DelayKt$timeoutInternal$1.f106584u = 1;
                mo113858p = selectImplementation.mo113858p(flowKt__DelayKt$timeoutInternal$1);
                if (mo113858p != m142578e) {
                    return m142578e;
                }
                Object obj3 = m142578e;
                flowKt__DelayKt$timeoutInternal$12 = flowKt__DelayKt$timeoutInternal$1;
                obj = mo113858p;
                flowCollector3 = flowCollector;
                j13 = j11;
                receiveChannel3 = receiveChannel;
                obj2 = obj3;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f106585v;
            FlowCollector flowCollector4 = (FlowCollector) this.f106586w;
            if (C24873a.m129327i(this.f106587x, C24873a.f119357q.m129343b()) > 0) {
                m113325b = FlowKt__ContextKt.m113325b(this.f106588y, 0, null, 2, null);
                ReceiveChannel m113273I = FlowKt.m113273I(m113325b, coroutineScope);
                j11 = this.f106587x;
                flowCollector = flowCollector4;
                receiveChannel = m113273I;
                flowKt__DelayKt$timeoutInternal$1 = this;
                SelectImplementation selectImplementation2 = new SelectImplementation(flowKt__DelayKt$timeoutInternal$1.getContext());
                selectImplementation2.mo113831c(receiveChannel.mo113017w(), new FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
                OnTimeoutKt.m113829b(selectImplementation2, j11, new FlowKt__DelayKt$timeoutInternal$1$1$2(j11, null));
                flowKt__DelayKt$timeoutInternal$1.f106585v = flowCollector;
                flowKt__DelayKt$timeoutInternal$1.f106586w = receiveChannel;
                flowKt__DelayKt$timeoutInternal$1.f106583t = j11;
                flowKt__DelayKt$timeoutInternal$1.f106584u = 1;
                mo113858p = selectImplementation2.mo113858p(flowKt__DelayKt$timeoutInternal$1);
                if (mo113858p != m142578e) {
                }
            } else {
                throw new TimeoutCancellationException("Timed out immediately");
            }
        }
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(CoroutineScope coroutineScope, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.f106587x, this.f106588y, continuation);
        flowKt__DelayKt$timeoutInternal$1.f106585v = coroutineScope;
        flowKt__DelayKt$timeoutInternal$1.f106586w = flowCollector;
        return flowKt__DelayKt$timeoutInternal$1.mo239o(C24848g0.f119245a);
    }
}
