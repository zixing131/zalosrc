package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19072r;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__ReduceKt$first$$inlined$collectWhile$2 implements FlowCollector<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106789p;

    /* renamed from: q */
    final /* synthetic */ C19059j0 f106790q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2", m145345f = "Reduce.kt", m145346l = {142}, m145347m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 */
    /* loaded from: classes7.dex */
    public static final class C218261 extends AbstractC29096d {

        /* renamed from: s */
        Object f106791s;

        /* renamed from: t */
        /* synthetic */ Object f106792t;

        /* renamed from: u */
        int f106793u;

        /* renamed from: w */
        Object f106795w;

        public C218261(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106792t = obj;
            this.f106793u |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$first$$inlined$collectWhile$2.this.mo12109b(null, this);
        }
    }

    public FlowKt__ReduceKt$first$$inlined$collectWhile$2(InterfaceC18509p interfaceC18509p, C19059j0 c19059j0) {
        this.f106789p = interfaceC18509p;
        this.f106790q = c19059j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12109b(Object obj, Continuation continuation) {
        C218261 c218261;
        Object obj2;
        Object m142578e;
        int i11;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        if (continuation instanceof C218261) {
            c218261 = (C218261) continuation;
            int i12 = c218261.f106793u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218261.f106793u = i12 - Integer.MIN_VALUE;
                obj2 = c218261.f106792t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218261.f106793u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        obj = c218261.f106795w;
                        flowKt__ReduceKt$first$$inlined$collectWhile$2 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) c218261.f106791s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    InterfaceC18509p interfaceC18509p = this.f106789p;
                    c218261.f106791s = this;
                    c218261.f106795w = obj;
                    c218261.f106793u = 1;
                    AbstractC19072r.m100202c(6);
                    obj2 = interfaceC18509p.mo240pC(obj, c218261);
                    AbstractC19072r.m100202c(7);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    flowKt__ReduceKt$first$$inlined$collectWhile$2 = this;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return C24848g0.f119245a;
                }
                flowKt__ReduceKt$first$$inlined$collectWhile$2.f106790q.f94941p = obj;
                throw new AbortFlowException(flowKt__ReduceKt$first$$inlined$collectWhile$2);
            }
        }
        c218261 = new C218261(continuation);
        obj2 = c218261.f106792t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218261.f106793u;
        if (i11 == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
