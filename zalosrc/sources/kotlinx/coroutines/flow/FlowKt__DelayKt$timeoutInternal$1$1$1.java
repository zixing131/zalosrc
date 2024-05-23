package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ChannelResult;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m145345f = "Delay.kt", m145346l = {394}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106589t;

    /* renamed from: u */
    /* synthetic */ Object f106590u;

    /* renamed from: v */
    final /* synthetic */ FlowCollector f106591v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f106591v = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.f106591v, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.f106590u = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c  */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        Object m113090k;
        Object obj2;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106589t;
        if (i11 != 0) {
            if (i11 == 1) {
                obj2 = this.f106590u;
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            m113090k = ((ChannelResult) this.f106590u).m113090k();
            FlowCollector flowCollector = this.f106591v;
            if (!(m113090k instanceof ChannelResult.Failed)) {
                this.f106590u = m113090k;
                this.f106589t = 1;
                if (flowCollector.mo12109b(m113090k, this) == m142578e) {
                    return m142578e;
                }
                obj2 = m113090k;
            }
            if (!(m113090k instanceof ChannelResult.Closed)) {
                ChannelResult.m113084e(m113090k);
                return AbstractC29094b.m145339a(false);
            }
            return AbstractC29094b.m145339a(true);
        }
        m113090k = obj2;
        if (!(m113090k instanceof ChannelResult.Closed)) {
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: pC */
    public /* bridge */ /* synthetic */ Object mo240pC(Object obj, Object obj2) {
        return m113348r(((ChannelResult) obj).m113090k(), (Continuation) obj2);
    }

    /* renamed from: r */
    public final Object m113348r(Object obj, Continuation continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) mo238a(ChannelResult.m113081b(obj), continuation)).mo239o(C24848g0.f119245a);
    }
}
