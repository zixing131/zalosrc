package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;

/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106621p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106622q;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218161 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106623s;

        /* renamed from: t */
        int f106624t;

        /* renamed from: u */
        final /* synthetic */ FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1 f106625u;

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106623s = obj;
            this.f106624t |= Integer.MIN_VALUE;
            return this.f106625u.mo97893a(null, this);
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f106621p.mo97893a(new FlowKt__EmittersKt$unsafeTransform$1$1(this.f106622q, flowCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
