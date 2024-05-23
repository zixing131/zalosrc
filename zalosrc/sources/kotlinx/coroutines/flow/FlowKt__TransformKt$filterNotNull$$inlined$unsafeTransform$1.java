package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106915p;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2 */
    /* loaded from: classes7.dex */
    public static final class C218382<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ FlowCollector f106916p;

        @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", m145345f = "Transform.kt", m145346l = {223}, m145347m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass1 extends AbstractC29096d {

            /* renamed from: s */
            /* synthetic */ Object f106917s;

            /* renamed from: t */
            int f106918t;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f106917s = obj;
                this.f106918t |= Integer.MIN_VALUE;
                return C218382.this.mo12109b(null, this);
            }
        }

        public C218382(FlowCollector flowCollector) {
            this.f106916p = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            Object m142578e;
            int i11;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i12 = anonymousClass1.f106918t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f106918t = i12 - Integer.MIN_VALUE;
                    Object obj2 = anonymousClass1.f106917s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = anonymousClass1.f106918t;
                    if (i11 == 0) {
                        if (i11 == 1) {
                            AbstractC24862s.m129228b(obj2);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        FlowCollector flowCollector = this.f106916p;
                        if (obj != null) {
                            anonymousClass1.f106918t = 1;
                            if (flowCollector.mo12109b(obj, anonymousClass1) == m142578e) {
                                return m142578e;
                            }
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            anonymousClass1 = new AnonymousClass1(continuation);
            Object obj22 = anonymousClass1.f106917s;
            m142578e = AbstractC28298d.m142578e();
            i11 = anonymousClass1.f106918t;
            if (i11 == 0) {
            }
            return C24848g0.f119245a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f106915p.mo97893a(new C218382(flowCollector), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
