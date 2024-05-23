package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106931p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f106932q;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218411 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106933s;

        /* renamed from: t */
        int f106934t;

        /* renamed from: u */
        final /* synthetic */ FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1 f106935u;

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106933s = obj;
            this.f106934t |= Integer.MIN_VALUE;
            return this.f106935u.mo97893a(null, this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2 */
    /* loaded from: classes7.dex */
    public static final class C218422<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ FlowCollector f106936p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f106937q;

        @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", m145345f = "Transform.kt", m145346l = {223, 224}, m145347m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass1 extends AbstractC29096d {

            /* renamed from: s */
            /* synthetic */ Object f106938s;

            /* renamed from: t */
            int f106939t;

            /* renamed from: v */
            Object f106941v;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f106938s = obj;
                this.f106939t |= Integer.MIN_VALUE;
                return C218422.this.mo12109b(null, this);
            }
        }

        public C218422(FlowCollector flowCollector, InterfaceC18509p interfaceC18509p) {
            this.f106936p = flowCollector;
            this.f106937q = interfaceC18509p;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo12109b(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            Object obj2;
            Object m142578e;
            int i11;
            FlowCollector flowCollector;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i12 = anonymousClass1.f106939t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f106939t = i12 - Integer.MIN_VALUE;
                    obj2 = anonymousClass1.f106938s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = anonymousClass1.f106939t;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj2);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) anonymousClass1.f106941v;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        FlowCollector flowCollector2 = this.f106936p;
                        InterfaceC18509p interfaceC18509p = this.f106937q;
                        anonymousClass1.f106941v = flowCollector2;
                        anonymousClass1.f106939t = 1;
                        Object mo240pC = interfaceC18509p.mo240pC(obj, anonymousClass1);
                        if (mo240pC == m142578e) {
                            return m142578e;
                        }
                        obj2 = mo240pC;
                        flowCollector = flowCollector2;
                    }
                    if (obj2 != null) {
                        anonymousClass1.f106941v = null;
                        anonymousClass1.f106939t = 2;
                        if (flowCollector.mo12109b(obj2, anonymousClass1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            anonymousClass1 = new AnonymousClass1(continuation);
            obj2 = anonymousClass1.f106938s;
            m142578e = AbstractC28298d.m142578e();
            i11 = anonymousClass1.f106939t;
            if (i11 == 0) {
            }
            if (obj2 != null) {
            }
            return C24848g0.f119245a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f106931p.mo97893a(new C218422(flowCollector, this.f106932q), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
