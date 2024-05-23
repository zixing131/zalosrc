package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Iterable f106442p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", m145345f = "Builders.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3$1 */
    /* loaded from: classes7.dex */
    public static final class C218031 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106443s;

        /* renamed from: t */
        int f106444t;

        /* renamed from: v */
        Object f106446v;

        /* renamed from: w */
        Object f106447w;

        public C218031(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106443s = obj;
            this.f106444t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3.this.mo97893a(null, this);
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
        C218031 c218031;
        Object m142578e;
        int i11;
        FlowCollector flowCollector2;
        Iterator it;
        if (continuation instanceof C218031) {
            c218031 = (C218031) continuation;
            int i12 = c218031.f106444t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218031.f106444t = i12 - Integer.MIN_VALUE;
                Object obj = c218031.f106443s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218031.f106444t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        it = (Iterator) c218031.f106447w;
                        FlowCollector flowCollector3 = (FlowCollector) c218031.f106446v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    flowCollector2 = flowCollector;
                    it = this.f106442p.iterator();
                }
                while (it.hasNext()) {
                    Object next = it.next();
                    c218031.f106446v = flowCollector2;
                    c218031.f106447w = it;
                    c218031.f106444t = 1;
                    if (flowCollector2.mo12109b(next, c218031) == m142578e) {
                        return m142578e;
                    }
                }
                return C24848g0.f119245a;
            }
        }
        c218031 = new C218031(continuation);
        Object obj2 = c218031.f106443s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218031.f106444t;
        if (i11 == 0) {
        }
        while (it.hasNext()) {
        }
        return C24848g0.f119245a;
    }
}
