package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$filter$$inlined$unsafeTransform$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106876p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f106877q;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218311 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106878s;

        /* renamed from: t */
        int f106879t;

        /* renamed from: u */
        final /* synthetic */ FlowKt__TransformKt$filter$$inlined$unsafeTransform$1 f106880u;

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106878s = obj;
            this.f106879t |= Integer.MIN_VALUE;
            return this.f106880u.mo97893a(null, this);
        }
    }

    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2 */
    /* loaded from: classes7.dex */
    public static final class C218322<T> implements FlowCollector {

        /* renamed from: p */
        final /* synthetic */ FlowCollector f106881p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18509p f106882q;

        @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", m145345f = "Transform.kt", m145346l = {223, 223}, m145347m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* loaded from: classes7.dex */
        public static final class AnonymousClass1 extends AbstractC29096d {

            /* renamed from: s */
            /* synthetic */ Object f106883s;

            /* renamed from: t */
            int f106884t;

            /* renamed from: v */
            Object f106886v;

            /* renamed from: w */
            Object f106887w;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // wm0.AbstractC29093a
            /* renamed from: o */
            public final Object mo239o(Object obj) {
                this.f106883s = obj;
                this.f106884t |= Integer.MIN_VALUE;
                return C218322.this.mo12109b(null, this);
            }
        }

        public C218322(FlowCollector flowCollector, InterfaceC18509p interfaceC18509p) {
            this.f106881p = flowCollector;
            this.f106882q = interfaceC18509p;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
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
            Object obj3;
            FlowCollector flowCollector;
            if (continuation instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) continuation;
                int i12 = anonymousClass1.f106884t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.f106884t = i12 - Integer.MIN_VALUE;
                    obj2 = anonymousClass1.f106883s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = anonymousClass1.f106884t;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                AbstractC24862s.m129228b(obj2);
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        flowCollector = (FlowCollector) anonymousClass1.f106887w;
                        obj3 = anonymousClass1.f106886v;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        AbstractC24862s.m129228b(obj2);
                        FlowCollector flowCollector2 = this.f106881p;
                        InterfaceC18509p interfaceC18509p = this.f106882q;
                        anonymousClass1.f106886v = obj;
                        anonymousClass1.f106887w = flowCollector2;
                        anonymousClass1.f106884t = 1;
                        Object mo240pC = interfaceC18509p.mo240pC(obj, anonymousClass1);
                        if (mo240pC == m142578e) {
                            return m142578e;
                        }
                        obj3 = obj;
                        flowCollector = flowCollector2;
                        obj2 = mo240pC;
                    }
                    if (((Boolean) obj2).booleanValue()) {
                        anonymousClass1.f106886v = null;
                        anonymousClass1.f106887w = null;
                        anonymousClass1.f106884t = 2;
                        if (flowCollector.mo12109b(obj3, anonymousClass1) == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            anonymousClass1 = new AnonymousClass1(continuation);
            obj2 = anonymousClass1.f106883s;
            m142578e = AbstractC28298d.m142578e();
            i11 = anonymousClass1.f106884t;
            if (i11 == 0) {
            }
            if (((Boolean) obj2).booleanValue()) {
            }
            return C24848g0.f119245a;
        }
    }

    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        Object m142578e;
        Object mo97893a = this.f106876p.mo97893a(new C218322(flowCollector, this.f106877q), continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo97893a == m142578e) {
            return mo97893a;
        }
        return C24848g0.f119245a;
    }
}
