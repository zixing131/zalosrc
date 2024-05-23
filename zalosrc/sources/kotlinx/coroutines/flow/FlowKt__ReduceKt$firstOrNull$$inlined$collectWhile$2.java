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
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 implements FlowCollector<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106797p;

    /* renamed from: q */
    final /* synthetic */ C19059j0 f106798q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", m145345f = "Reduce.kt", m145346l = {142}, m145347m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1 */
    /* loaded from: classes7.dex */
    public static final class C218271 extends AbstractC29096d {

        /* renamed from: s */
        Object f106799s;

        /* renamed from: t */
        /* synthetic */ Object f106800t;

        /* renamed from: u */
        int f106801u;

        /* renamed from: w */
        Object f106803w;

        public C218271(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106800t = obj;
            this.f106801u |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.mo12109b(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(InterfaceC18509p interfaceC18509p, C19059j0 c19059j0) {
        this.f106797p = interfaceC18509p;
        this.f106798q = c19059j0;
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
        C218271 c218271;
        Object obj2;
        Object m142578e;
        int i11;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
        if (continuation instanceof C218271) {
            c218271 = (C218271) continuation;
            int i12 = c218271.f106801u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218271.f106801u = i12 - Integer.MIN_VALUE;
                obj2 = c218271.f106800t;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218271.f106801u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        obj = c218271.f106803w;
                        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c218271.f106799s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    InterfaceC18509p interfaceC18509p = this.f106797p;
                    c218271.f106799s = this;
                    c218271.f106803w = obj;
                    c218271.f106801u = 1;
                    AbstractC19072r.m100202c(6);
                    obj2 = interfaceC18509p.mo240pC(obj, c218271);
                    AbstractC19072r.m100202c(7);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = this;
                }
                if (((Boolean) obj2).booleanValue()) {
                    return C24848g0.f119245a;
                }
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.f106798q.f94941p = obj;
                throw new AbortFlowException(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
            }
        }
        c218271 = new C218271(continuation);
        obj2 = c218271.f106800t;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218271.f106801u;
        if (i11 == 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }
}
