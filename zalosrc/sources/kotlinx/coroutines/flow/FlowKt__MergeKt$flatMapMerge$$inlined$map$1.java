package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__MergeKt$flatMapMerge$$inlined$map$1 implements Flow<Flow<Object>> {

    /* renamed from: p */
    final /* synthetic */ Flow f106753p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f106754q;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2 */
    /* loaded from: classes7.dex */
    public static final class C218252<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ FlowCollector f106755p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f106756q;

        @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", m145345f = "Merge.kt", m145346l = {223, 223}, m145347m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass1 extends AbstractC29096d {

            /* renamed from: s */
            /* synthetic */ Object f106757s;

            /* renamed from: t */
            int f106758t;

            /* renamed from: u */
            Object f106759u;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f106757s = obj;
                this.f106758t |= Integer.MIN_VALUE;
                return C218252.this.mo12109b(null, this);
            }
        }

        public C218252(FlowCollector flowCollector, InterfaceC18509p interfaceC18509p) {
            this.f106755p = flowCollector;
            this.f106756q = interfaceC18509p;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
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
                int i12 = anonymousClass1.f106758t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f106758t = i12 - Integer.MIN_VALUE;
                    obj2 = anonymousClass1.f106757s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = anonymousClass1.f106758t;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj2);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) anonymousClass1.f106759u;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        FlowCollector flowCollector2 = this.f106755p;
                        InterfaceC18509p interfaceC18509p = this.f106756q;
                        anonymousClass1.f106759u = flowCollector2;
                        anonymousClass1.f106758t = 1;
                        Object mo240pC = interfaceC18509p.mo240pC(obj, anonymousClass1);
                        if (mo240pC == m142578e) {
                            return m142578e;
                        }
                        obj2 = mo240pC;
                        flowCollector = flowCollector2;
                    }
                    anonymousClass1.f106759u = null;
                    anonymousClass1.f106758t = 2;
                    if (flowCollector.mo12109b(obj2, anonymousClass1) == m142578e) {
                        return m142578e;
                    }
                    return C24848g0.f119245a;
                }
            }
            anonymousClass1 = new AnonymousClass1(continuation);
            obj2 = anonymousClass1.f106757s;
            m142578e = AbstractC28298d.m142578e();
            i11 = anonymousClass1.f106758t;
            if (i11 == 0) {
            }
            anonymousClass1.f106759u = null;
            anonymousClass1.f106758t = 2;
            if (flowCollector.mo12109b(obj2, anonymousClass1) == m142578e) {
            }
            return C24848g0.f119245a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f106753p.mo97893a(new C218252(flowCollector, this.f106754q), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
