package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import ln0.C22537f;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import qm0.AbstractC25351j0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9 implements Flow<Integer> {

    /* renamed from: p */
    final /* synthetic */ C22537f f106484p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9", m145345f = "Builders.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9$1 */
    /* loaded from: classes7.dex */
    public static final class C218091 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106485s;

        /* renamed from: t */
        int f106486t;

        /* renamed from: v */
        Object f106488v;

        /* renamed from: w */
        Object f106489w;

        public C218091(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106485s = obj;
            this.f106486t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9.this.mo97893a(null, this);
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
        C218091 c218091;
        Object m142578e;
        int i11;
        FlowCollector flowCollector2;
        Iterator it;
        if (continuation instanceof C218091) {
            c218091 = (C218091) continuation;
            int i12 = c218091.f106486t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218091.f106486t = i12 - Integer.MIN_VALUE;
                Object obj = c218091.f106485s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218091.f106486t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) c218091.f106489w;
                        FlowCollector flowCollector3 = (FlowCollector) c218091.f106488v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    flowCollector2 = flowCollector;
                    it = this.f106484p.iterator();
                }
                while (it.hasNext()) {
                    Integer m145341c = AbstractC29094b.m145341c(((AbstractC25351j0) it).mo116552a());
                    c218091.f106488v = flowCollector2;
                    c218091.f106489w = it;
                    c218091.f106486t = 1;
                    if (flowCollector2.mo12109b(m145341c, c218091) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218091 = new C218091(continuation);
        Object obj2 = c218091.f106485s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218091.f106486t;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }
}
