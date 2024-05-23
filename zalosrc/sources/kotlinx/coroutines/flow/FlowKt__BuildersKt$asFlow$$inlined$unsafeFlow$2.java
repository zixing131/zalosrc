package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18505l f106437p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2", m145345f = "Builders.kt", m145346l = {113, 113}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2$1 */
    /* loaded from: classes7.dex */
    public static final class C218021 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106438s;

        /* renamed from: t */
        int f106439t;

        /* renamed from: v */
        Object f106441v;

        public C218021(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106438s = obj;
            this.f106439t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218021 c218021;
        Object obj;
        Object m142578e;
        int i11;
        if (continuation instanceof C218021) {
            c218021 = (C218021) continuation;
            int i12 = c218021.f106439t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218021.f106439t = i12 - Integer.MIN_VALUE;
                obj = c218021.f106438s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218021.f106439t;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowCollector = (FlowCollector) c218021.f106441v;
                    AbstractC24862s.m129228b(obj);
                } else {
                    AbstractC24862s.m129228b(obj);
                    InterfaceC18505l interfaceC18505l = this.f106437p;
                    c218021.f106441v = flowCollector;
                    c218021.f106439t = 1;
                    AbstractC19072r.m100202c(6);
                    obj = interfaceC18505l.mo205i9(c218021);
                    AbstractC19072r.m100202c(7);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                c218021.f106441v = null;
                c218021.f106439t = 2;
                if (flowCollector.mo12109b(obj, c218021) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        c218021 = new C218021(continuation);
        obj = c218021.f106438s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218021.f106439t;
        if (i11 == 0) {
        }
        c218021.f106441v = null;
        c218021.f106439t = 2;
        if (flowCollector.mo12109b(obj, c218021) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
