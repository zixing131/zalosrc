package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", m145345f = "FlowCoroutine.kt", m145346l = {51}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowCoroutineKt$scopedFlow$1$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107306t;

    /* renamed from: u */
    private /* synthetic */ Object f107307u;

    /* renamed from: v */
    final /* synthetic */ InterfaceC18510q f107308v;

    /* renamed from: w */
    final /* synthetic */ FlowCollector f107309w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowCoroutineKt$scopedFlow$1$1(InterfaceC18510q interfaceC18510q, FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.f107308v = interfaceC18510q;
        this.f107309w = flowCollector;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f107308v, this.f107309w, continuation);
        flowCoroutineKt$scopedFlow$1$1.f107307u = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107306t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f107307u;
            InterfaceC18510q interfaceC18510q = this.f107308v;
            FlowCollector flowCollector = this.f107309w;
            this.f107306t = 1;
            if (interfaceC18510q.mo45599Hr(coroutineScope, flowCollector, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FlowCoroutineKt$scopedFlow$1$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
