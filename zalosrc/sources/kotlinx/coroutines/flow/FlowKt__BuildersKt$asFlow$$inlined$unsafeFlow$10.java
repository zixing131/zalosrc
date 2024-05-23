package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ln0.C22540i;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25353k0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10 implements Flow<Long> {

    /* renamed from: p */
    final /* synthetic */ C22540i f106431p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10", m145345f = "Builders.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10$1 */
    /* loaded from: classes7.dex */
    public static final class C218011 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106432s;

        /* renamed from: t */
        int f106433t;

        /* renamed from: v */
        Object f106435v;

        /* renamed from: w */
        Object f106436w;

        public C218011(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106432s = obj;
            this.f106433t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218011 c218011;
        Object m142578e;
        int i11;
        FlowCollector flowCollector2;
        Iterator it;
        if (continuation instanceof C218011) {
            c218011 = (C218011) continuation;
            int i12 = c218011.f106433t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218011.f106433t = i12 - Integer.MIN_VALUE;
                Object obj = c218011.f106432s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218011.f106433t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) c218011.f106436w;
                        FlowCollector flowCollector3 = (FlowCollector) c218011.f106435v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    flowCollector2 = flowCollector;
                    it = this.f106431p.iterator();
                }
                while (it.hasNext()) {
                    Long m145342d = AbstractC29094b.m145342d(((AbstractC25353k0) it).mo116561a());
                    c218011.f106435v = flowCollector2;
                    c218011.f106436w = it;
                    c218011.f106433t = 1;
                    if (flowCollector2.mo12109b(m145342d, c218011) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218011 = new C218011(continuation);
        Object obj2 = c218011.f106432s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218011.f106433t;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }
}
