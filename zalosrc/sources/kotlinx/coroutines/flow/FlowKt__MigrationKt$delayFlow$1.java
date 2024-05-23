package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DelayKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$delayFlow$1", m145345f = "Migration.kt", m145346l = {415}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__MigrationKt$delayFlow$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106780t;

    /* renamed from: u */
    final /* synthetic */ long f106781u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$delayFlow$1(long j11, Continuation continuation) {
        super(2, continuation);
        this.f106781u = j11;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        return new FlowKt__MigrationKt$delayFlow$1(this.f106781u, continuation);
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106780t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            long j11 = this.f106781u;
            this.f106780t = 1;
            if (DelayKt.m112666b(j11, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__MigrationKt$delayFlow$1) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
