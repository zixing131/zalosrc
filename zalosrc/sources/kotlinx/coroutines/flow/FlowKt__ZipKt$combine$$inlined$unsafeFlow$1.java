package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f107002p;

    /* renamed from: q */
    final /* synthetic */ Flow f107003q;

    /* renamed from: r */
    final /* synthetic */ InterfaceC18510q f107004r;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        InterfaceC18494a m113403c;
        Object m142578e;
        Flow[] flowArr = {this.f107002p, this.f107003q};
        m113403c = FlowKt__ZipKt.m113403c();
        Object m113542a = CombineKt.m113542a(flowCollector, flowArr, m113403c, new FlowKt__ZipKt$combine$1$1(this.f107004r, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113542a == m142578e) {
            return m113542a;
        }
        return C24848g0.f119245a;
    }
}
