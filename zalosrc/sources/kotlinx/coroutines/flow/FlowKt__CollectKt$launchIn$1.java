package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", m145345f = "Collect.kt", m145346l = {50}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__CollectKt$launchIn$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106515t;

    /* renamed from: u */
    final /* synthetic */ Flow f106516u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__CollectKt$launchIn$1(Flow flow, Continuation continuation) {
        super(2, continuation);
        this.f106516u = flow;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new FlowKt__CollectKt$launchIn$1(this.f106516u, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106515t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            Flow flow = this.f106516u;
            this.f106515t = 1;
            if (FlowKt.m113291i(flow, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FlowKt__CollectKt$launchIn$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
