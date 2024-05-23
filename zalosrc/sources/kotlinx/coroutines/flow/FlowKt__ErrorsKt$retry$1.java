package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", m145345f = "Errors.kt", m145346l = {}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__ErrorsKt$retry$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106674t;

    FlowKt__ErrorsKt$retry$1(Continuation continuation) {
        super(2, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new FlowKt__ErrorsKt$retry$1(continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        AbstractC28298d.m142578e();
        if (this.f106674t == 0) {
            AbstractC24862s.m129228b(obj);
            return AbstractC29094b.m145339a(true);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(Throwable th2, Continuation continuation) {
        return ((FlowKt__ErrorsKt$retry$1) mo238a(th2, continuation)).mo239o(C24848g0.f119245a);
    }
}
