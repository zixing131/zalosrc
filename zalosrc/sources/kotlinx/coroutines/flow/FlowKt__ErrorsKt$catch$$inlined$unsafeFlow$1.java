package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106648p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106649q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", m145345f = "Errors.kt", m145346l = {113, 114}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218181 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106650s;

        /* renamed from: t */
        int f106651t;

        /* renamed from: v */
        Object f106653v;

        /* renamed from: w */
        Object f106654w;

        public C218181(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106650s = obj;
            this.f106651t |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(Flow flow, InterfaceC18510q interfaceC18510q) {
        this.f106648p = flow;
        this.f106649q = interfaceC18510q;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218181 c218181;
        Object m142578e;
        int i11;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        Throwable th2;
        if (continuation instanceof C218181) {
            c218181 = (C218181) continuation;
            int i12 = c218181.f106651t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218181.f106651t = i12 - Integer.MIN_VALUE;
                Object obj = c218181.f106650s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218181.f106651t;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) c218181.f106654w;
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) c218181.f106653v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    Flow flow = this.f106648p;
                    c218181.f106653v = this;
                    c218181.f106654w = flowCollector;
                    c218181.f106651t = 1;
                    obj = FlowKt.m113289g(flow, flowCollector, c218181);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                    flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
                }
                th2 = (Throwable) obj;
                if (th2 != null) {
                    InterfaceC18510q interfaceC18510q = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.f106649q;
                    c218181.f106653v = null;
                    c218181.f106654w = null;
                    c218181.f106651t = 2;
                    AbstractC19072r.m100202c(6);
                    Object mo45599Hr = interfaceC18510q.mo45599Hr(flowCollector, th2, c218181);
                    AbstractC19072r.m100202c(7);
                    if (mo45599Hr == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218181 = new C218181(continuation);
        Object obj2 = c218181.f106650s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218181.f106651t;
        if (i11 == 0) {
        }
        th2 = (Throwable) obj2;
        if (th2 != null) {
        }
        return C24848g0.f119245a;
    }
}
