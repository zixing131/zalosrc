package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", m145345f = "Delay.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$sample$2$1$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106569t;

    /* renamed from: u */
    /* synthetic */ Object f106570u;

    /* renamed from: v */
    final /* synthetic */ C19059j0 f106571v;

    /* renamed from: w */
    final /* synthetic */ ReceiveChannel f106572w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(C19059j0 c19059j0, ReceiveChannel receiveChannel, Continuation continuation) {
        super(2, continuation);
        this.f106571v = c19059j0;
        this.f106572w = receiveChannel;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.f106571v, this.f106572w, continuation);
        flowKt__DelayKt$sample$2$1$1.f106570u = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        AbstractC28298d.m142578e();
        if (this.f106569t == 0) {
            AbstractC24862s.m129228b(obj);
            Object m113090k = ((ChannelResult) this.f106570u).m113090k();
            C19059j0 c19059j0 = this.f106571v;
            boolean z11 = m113090k instanceof ChannelResult.Failed;
            if (!z11) {
                c19059j0.f94941p = m113090k;
            }
            ReceiveChannel receiveChannel = this.f106572w;
            if (z11) {
                Throwable m113084e = ChannelResult.m113084e(m113090k);
                if (m113084e == null) {
                    receiveChannel.mo113009a(new ChildCancelledException());
                    c19059j0.f94941p = NullSurrogateKt.f107315c;
                } else {
                    throw m113084e;
                }
            }
            return C24848g0.f119245a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113344r(((ChannelResult) obj).m113090k(), (Continuation) obj2);
    }

    /* renamed from: r */
    public final Object m113344r(Object obj, Continuation continuation) {
        return ((FlowKt__DelayKt$sample$2$1$1) mo238a(ChannelResult.m113081b(obj), continuation)).mo239o(C24848g0.f119245a);
    }
}
