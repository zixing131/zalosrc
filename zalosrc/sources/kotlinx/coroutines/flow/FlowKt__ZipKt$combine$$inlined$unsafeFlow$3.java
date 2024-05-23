package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow[] f107010p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f107011q;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$3$1 */
    /* loaded from: classes7.dex */
    public static final class C218491 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f107012s;

        /* renamed from: t */
        int f107013t;

        /* renamed from: u */
        final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$3 f107014u;

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f107012s = obj;
            this.f107013t |= Integer.MIN_VALUE;
            return this.f107014u.mo97893a(null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Flow[] flowArr = this.f107010p;
        AbstractC19074t.m100212j();
        FlowKt__ZipKt$combine$6$1 flowKt__ZipKt$combine$6$1 = new FlowKt__ZipKt$combine$6$1(this.f107010p);
        AbstractC19074t.m100212j();
        Object m113542a = CombineKt.m113542a(flowCollector, flowArr, flowKt__ZipKt$combine$6$1, new FlowKt__ZipKt$combine$6$2(this.f107011q, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113542a == m142578e) {
            return m113542a;
        }
        return C24848g0.f119245a;
    }
}
