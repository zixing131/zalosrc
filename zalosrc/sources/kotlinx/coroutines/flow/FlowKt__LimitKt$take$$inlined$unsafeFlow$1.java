package kotlinx.coroutines.flow;

import fn0.C19055h0;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106684p;

    /* renamed from: q */
    final /* synthetic */ int f106685q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", m145345f = "Limit.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218201 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106686s;

        /* renamed from: t */
        int f106687t;

        /* renamed from: v */
        Object f106689v;

        public C218201(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106686s = obj;
            this.f106687t |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002d, code lost:            r8 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.m113553a(r8, r7);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218201 c218201;
        Object m142578e;
        int i11;
        if (continuation instanceof C218201) {
            c218201 = (C218201) continuation;
            int i12 = c218201.f106687t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218201.f106687t = i12 - Integer.MIN_VALUE;
                Object obj = c218201.f106686s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218201.f106687t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        FlowCollector flowCollector2 = (FlowCollector) c218201.f106689v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector = flowCollector2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19055h0 c19055h0 = new C19055h0();
                    Flow flow = this.f106684p;
                    FlowKt__LimitKt$take$2$1 flowKt__LimitKt$take$2$1 = new FlowKt__LimitKt$take$2$1(c19055h0, this.f106685q, flowCollector);
                    c218201.f106689v = flowCollector;
                    c218201.f106687t = 1;
                    Object mo97893a = flow.mo97893a(flowKt__LimitKt$take$2$1, c218201);
                    flowCollector = mo97893a;
                    if (mo97893a == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218201 = new C218201(continuation);
        Object obj2 = c218201.f106686s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218201.f106687t;
        if (i11 == 0) {
        }
        return C24848g0.f119245a;
    }
}
