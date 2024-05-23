package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28296b;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
final /* synthetic */ class FlowKt__TransformKt {
    /* renamed from: a */
    public static final Flow m113400a(final Flow flow, final InterfaceC18509p interfaceC18509p) {
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1

            /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2 */
            /* loaded from: classes7.dex */
            public static final class C218432<T> implements FlowCollector {

                /* renamed from: p */
                final /* synthetic */ FlowCollector f106944p;

                /* renamed from: q */
                final /* synthetic */ InterfaceC18509p f106945q;

                @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", m145345f = "Transform.kt", m145346l = {223, 224}, m145347m = "emit")
                /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
                /* loaded from: classes7.dex */
                public static final class AnonymousClass1 extends AbstractC29096d {

                    /* renamed from: s */
                    /* synthetic */ Object f106946s;

                    /* renamed from: t */
                    int f106947t;

                    /* renamed from: v */
                    Object f106949v;

                    /* renamed from: w */
                    Object f106950w;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // wm0.AbstractC29093a
                    /* renamed from: o */
                    public final Object mo239o(Object obj) {
                        this.f106946s = obj;
                        this.f106947t |= Integer.MIN_VALUE;
                        return C218432.this.mo12109b(null, this);
                    }
                }

                public C218432(FlowCollector flowCollector, InterfaceC18509p interfaceC18509p) {
                    this.f106944p = flowCollector;
                    this.f106945q = interfaceC18509p;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: b */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object mo12109b(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object m142573e;
                    int i11;
                    Object obj2;
                    FlowCollector flowCollector;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i12 = anonymousClass1.f106947t;
                        if ((i12 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f106947t = i12 - Integer.MIN_VALUE;
                            Object obj3 = anonymousClass1.f106946s;
                            m142573e = AbstractC28296b.m142573e();
                            i11 = anonymousClass1.f106947t;
                            if (i11 == 0) {
                                if (i11 != 1) {
                                    if (i11 == 2) {
                                        AbstractC24862s.m129228b(obj3);
                                        return C24848g0.f119245a;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                flowCollector = (FlowCollector) anonymousClass1.f106950w;
                                obj2 = anonymousClass1.f106949v;
                                AbstractC24862s.m129228b(obj3);
                            } else {
                                AbstractC24862s.m129228b(obj3);
                                FlowCollector flowCollector2 = this.f106944p;
                                InterfaceC18509p interfaceC18509p = this.f106945q;
                                anonymousClass1.f106949v = obj;
                                anonymousClass1.f106950w = flowCollector2;
                                anonymousClass1.f106947t = 1;
                                AbstractC19072r.m100202c(6);
                                Object mo240pC = interfaceC18509p.mo240pC(obj, anonymousClass1);
                                AbstractC19072r.m100202c(7);
                                if (mo240pC == m142573e) {
                                    return m142573e;
                                }
                                obj2 = obj;
                                flowCollector = flowCollector2;
                            }
                            anonymousClass1.f106949v = null;
                            anonymousClass1.f106950w = null;
                            anonymousClass1.f106947t = 2;
                            if (flowCollector.mo12109b(obj2, anonymousClass1) == m142573e) {
                                return m142573e;
                            }
                            return C24848g0.f119245a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj32 = anonymousClass1.f106946s;
                    m142573e = AbstractC28296b.m142573e();
                    i11 = anonymousClass1.f106947t;
                    if (i11 == 0) {
                    }
                    anonymousClass1.f106949v = null;
                    anonymousClass1.f106950w = null;
                    anonymousClass1.f106947t = 2;
                    if (flowCollector.mo12109b(obj2, anonymousClass1) == m142573e) {
                    }
                    return C24848g0.f119245a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            /* renamed from: a */
            public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
                Object mo97893a = Flow.this.mo97893a(new C218432(flowCollector, interfaceC18509p), continuation);
                if (mo97893a == AbstractC28296b.m142573e()) {
                    return mo97893a;
                }
                return C24848g0.f119245a;
            }
        };
    }
}
