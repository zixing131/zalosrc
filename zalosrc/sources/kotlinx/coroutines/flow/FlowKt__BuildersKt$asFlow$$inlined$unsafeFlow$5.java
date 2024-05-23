package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import nn0.InterfaceC23898g;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC23898g f106454p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5", m145345f = "Builders.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5$1 */
    /* loaded from: classes7.dex */
    public static final class C218051 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106455s;

        /* renamed from: t */
        int f106456t;

        /* renamed from: v */
        Object f106458v;

        /* renamed from: w */
        Object f106459w;

        public C218051(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106455s = obj;
            this.f106456t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5.this.mo97893a(null, this);
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
        C218051 c218051;
        Object m142578e;
        int i11;
        FlowCollector flowCollector2;
        Iterator it;
        if (continuation instanceof C218051) {
            c218051 = (C218051) continuation;
            int i12 = c218051.f106456t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218051.f106456t = i12 - Integer.MIN_VALUE;
                Object obj = c218051.f106455s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218051.f106456t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) c218051.f106459w;
                        FlowCollector flowCollector3 = (FlowCollector) c218051.f106458v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    flowCollector2 = flowCollector;
                    it = this.f106454p.iterator();
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c218051.f106458v = flowCollector2;
                    c218051.f106459w = it;
                    c218051.f106456t = 1;
                    if (flowCollector2.mo12109b(next, c218051) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218051 = new C218051(continuation);
        Object obj2 = c218051.f106455s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218051.f106456t;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }
}
