package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow[] f107053p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f107054q;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218551 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f107055s;

        /* renamed from: t */
        int f107056t;

        /* renamed from: u */
        final /* synthetic */ FlowKt__ZipKt$combineUnsafe$$inlined$unsafeFlow$1 f107057u;

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f107055s = obj;
            this.f107056t |= Integer.MIN_VALUE;
            return this.f107057u.mo97893a(null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        InterfaceC18494a m113403c;
        Object m142578e;
        Flow[] flowArr = this.f107053p;
        m113403c = FlowKt__ZipKt.m113403c();
        AbstractC19074t.m100212j();
        Object m113542a = CombineKt.m113542a(flowCollector, flowArr, m113403c, new FlowKt__ZipKt$combineUnsafe$1$1(this.f107054q, null), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (m113542a == m142578e) {
            return m113542a;
        }
        return C24848g0.f119245a;
    }
}
