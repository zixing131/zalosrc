package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.TimeoutCancellationException;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import pn0.C24873a;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", m145345f = "Delay.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends AbstractC29104l implements InterfaceC18505l {

    /* renamed from: t */
    int f106592t;

    /* renamed from: u */
    final /* synthetic */ long f106593u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j11, Continuation continuation) {
        super(1, continuation);
        this.f106593u = j11;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        AbstractC28298d.m142578e();
        if (this.f106592t != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC24862s.m129228b(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) C24873a.m129320L(this.f106593u)));
    }

    /* renamed from: r */
    public final Continuation m113349r(Continuation continuation) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.f106593u, continuation);
    }

    @Override // en0.InterfaceC18505l
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final Object mo205i9(Continuation continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) m113349r(continuation)).mo239o(C24848g0.f119245a);
    }
}
