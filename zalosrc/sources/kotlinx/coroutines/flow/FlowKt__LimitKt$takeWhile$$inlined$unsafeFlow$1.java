package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106690p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f106691q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", m145345f = "Limit.kt", m145346l = {124}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218211 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106692s;

        /* renamed from: t */
        int f106693t;

        /* renamed from: v */
        Object f106695v;

        public C218211(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106692s = obj;
            this.f106693t |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218211 c218211;
        Object m142578e;
        int i11;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
        if (continuation instanceof C218211) {
            c218211 = (C218211) continuation;
            int i12 = c218211.f106693t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218211.f106693t = i12 - Integer.MIN_VALUE;
                Object obj = c218211.f106692s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218211.f106693t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) c218211.f106695v;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (AbortFlowException e11) {
                            e = e11;
                            FlowExceptions_commonKt.m113553a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                            return C24848g0.f119245a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow flow = this.f106690p;
                    FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.f106691q, flowCollector);
                    try {
                        c218211.f106695v = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                        c218211.f106693t = 1;
                        if (flow.mo97893a(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12, c218211) == m142578e) {
                            return m142578e;
                        }
                    } catch (AbortFlowException e12) {
                        e = e12;
                        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                        FlowExceptions_commonKt.m113553a(e, flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1);
                        return C24848g0.f119245a;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218211 = new C218211(continuation);
        Object obj2 = c218211.f106692s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218211.f106693t;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
