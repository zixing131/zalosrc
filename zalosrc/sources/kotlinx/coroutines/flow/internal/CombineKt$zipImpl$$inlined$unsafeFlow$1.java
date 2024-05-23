package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import pm0.C24848g0;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final class CombineKt$zipImpl$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f107244p;

    /* renamed from: q */
    final /* synthetic */ Flow f107245q;

    /* renamed from: r */
    final /* synthetic */ InterfaceC18510q f107246r;

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object m112640d = CoroutineScopeKt.m112640d(new CombineKt$zipImpl$1$1(flowCollector, this.f107244p, this.f107245q, this.f107246r, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m112640d == m142578e) {
            return m112640d;
        }
        return C24848g0.f119245a;
    }
}
