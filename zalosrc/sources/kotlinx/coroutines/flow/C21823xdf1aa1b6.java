package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 */
/* loaded from: classes7.dex */
public final class C21823xdf1aa1b6 implements FlowCollector<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18510q f106703p;

    /* renamed from: q */
    final /* synthetic */ FlowCollector f106704q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", m145345f = "Limit.kt", m145346l = {142}, m145347m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends AbstractC29096d {

        /* renamed from: s */
        Object f106705s;

        /* renamed from: t */
        /* synthetic */ Object f106706t;

        /* renamed from: u */
        int f106707u;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106706t = obj;
            this.f106707u |= Integer.MIN_VALUE;
            return C21823xdf1aa1b6.this.mo12109b(null, this);
        }
    }

    public C21823xdf1aa1b6(InterfaceC18510q interfaceC18510q, FlowCollector flowCollector) {
        this.f106703p = interfaceC18510q;
        this.f106704q = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12109b(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        Object obj2;
        Object m142578e;
        int i11;
        C21823xdf1aa1b6 c21823xdf1aa1b6;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i12 = anonymousClass1.f106707u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f106707u = i12 - Integer.MIN_VALUE;
                obj2 = anonymousClass1.f106706t;
                m142578e = AbstractC28298d.m142578e();
                i11 = anonymousClass1.f106707u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c21823xdf1aa1b6 = (C21823xdf1aa1b6) anonymousClass1.f106705s;
                        AbstractC24862s.m129228b(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj2);
                    InterfaceC18510q interfaceC18510q = this.f106703p;
                    FlowCollector flowCollector = this.f106704q;
                    anonymousClass1.f106705s = this;
                    anonymousClass1.f106707u = 1;
                    AbstractC19072r.m100202c(6);
                    obj2 = interfaceC18510q.mo45599Hr(flowCollector, obj, anonymousClass1);
                    AbstractC19072r.m100202c(7);
                    if (obj2 == m142578e) {
                        return m142578e;
                    }
                    c21823xdf1aa1b6 = this;
                }
                if (!((Boolean) obj2).booleanValue()) {
                    return C24848g0.f119245a;
                }
                throw new AbortFlowException(c21823xdf1aa1b6);
            }
        }
        anonymousClass1 = new AnonymousClass1(continuation);
        obj2 = anonymousClass1.f106706t;
        m142578e = AbstractC28298d.m142578e();
        i11 = anonymousClass1.f106707u;
        if (i11 == 0) {
        }
        if (!((Boolean) obj2).booleanValue()) {
        }
    }
}
