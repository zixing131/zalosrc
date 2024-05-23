package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", m145345f = "Delay.kt", m145346l = {299}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$sample$2$1$2 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106573t;

    /* renamed from: u */
    final /* synthetic */ C19059j0 f106574u;

    /* renamed from: v */
    final /* synthetic */ FlowCollector f106575v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$2(C19059j0 c19059j0, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f106574u = c19059j0;
        this.f106575v = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new FlowKt__DelayKt$sample$2$1$2(this.f106574u, this.f106575v, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106573t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            C19059j0 c19059j0 = this.f106574u;
            Object obj2 = c19059j0.f94941p;
            if (obj2 == null) {
                return C24848g0.f119245a;
            }
            c19059j0.f94941p = null;
            FlowCollector flowCollector = this.f106575v;
            if (obj2 == NullSurrogateKt.f107313a) {
                obj2 = null;
            }
            this.f106573t = 1;
            if (flowCollector.mo12109b(obj2, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(C24848g0 c24848g0, Continuation continuation) {
        return ((FlowKt__DelayKt$sample$2$1$2) mo238a(c24848g0, continuation)).mo239o(C24848g0.f119245a);
    }
}
