package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.SafeCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106598p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18510q f106599q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", m145345f = "Emitters.kt", m145346l = {114, 121, 128}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218131 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106600s;

        /* renamed from: t */
        int f106601t;

        /* renamed from: v */
        Object f106603v;

        /* renamed from: w */
        Object f106604w;

        public C218131(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106600s = obj;
            this.f106601t |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218131 c218131;
        Object m142578e;
        int i11;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        Object m113356c;
        SafeCollector safeCollector;
        Throwable th2;
        SafeCollector safeCollector2;
        Object mo45599Hr;
        try {
            if (continuation instanceof C218131) {
                c218131 = (C218131) continuation;
                int i12 = c218131.f106601t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c218131.f106601t = i12 - Integer.MIN_VALUE;
                    Object obj = c218131.f106600s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c218131.f106601t;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    safeCollector2 = (SafeCollector) c218131.f106603v;
                                    try {
                                        AbstractC24862s.m129228b(obj);
                                        safeCollector2.mo113558p();
                                        return C24848g0.f119245a;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        safeCollector2.mo113558p();
                                        throw th2;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th4 = (Throwable) c218131.f106603v;
                            AbstractC24862s.m129228b(obj);
                            throw th4;
                        }
                        flowCollector = (FlowCollector) c218131.f106604w;
                        flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) c218131.f106603v;
                        try {
                            AbstractC24862s.m129228b(obj);
                        } catch (Throwable th5) {
                            th = th5;
                            ThrowingCollector throwingCollector = new ThrowingCollector(th);
                            InterfaceC18510q interfaceC18510q = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f106599q;
                            c218131.f106603v = th;
                            c218131.f106604w = null;
                            c218131.f106601t = 2;
                            m113356c = FlowKt__EmittersKt.m113356c(throwingCollector, interfaceC18510q, th, c218131);
                            if (m113356c != m142578e) {
                                return m142578e;
                            }
                            throw th;
                        }
                    } else {
                        AbstractC24862s.m129228b(obj);
                        try {
                            Flow flow = this.f106598p;
                            c218131.f106603v = this;
                            c218131.f106604w = flowCollector;
                            c218131.f106601t = 1;
                            if (flow.mo97893a(flowCollector, c218131) == m142578e) {
                                return m142578e;
                            }
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                        } catch (Throwable th6) {
                            th = th6;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                            ThrowingCollector throwingCollector2 = new ThrowingCollector(th);
                            InterfaceC18510q interfaceC18510q2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f106599q;
                            c218131.f106603v = th;
                            c218131.f106604w = null;
                            c218131.f106601t = 2;
                            m113356c = FlowKt__EmittersKt.m113356c(throwingCollector2, interfaceC18510q2, th, c218131);
                            if (m113356c != m142578e) {
                            }
                        }
                    }
                    safeCollector = new SafeCollector(flowCollector, c218131.getContext());
                    InterfaceC18510q interfaceC18510q3 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f106599q;
                    c218131.f106603v = safeCollector;
                    c218131.f106604w = null;
                    c218131.f106601t = 3;
                    AbstractC19072r.m100202c(6);
                    mo45599Hr = interfaceC18510q3.mo45599Hr(safeCollector, null, c218131);
                    AbstractC19072r.m100202c(7);
                    if (mo45599Hr != m142578e) {
                        return m142578e;
                    }
                    safeCollector2 = safeCollector;
                    safeCollector2.mo113558p();
                    return C24848g0.f119245a;
                }
            }
            InterfaceC18510q interfaceC18510q32 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.f106599q;
            c218131.f106603v = safeCollector;
            c218131.f106604w = null;
            c218131.f106601t = 3;
            AbstractC19072r.m100202c(6);
            mo45599Hr = interfaceC18510q32.mo45599Hr(safeCollector, null, c218131);
            AbstractC19072r.m100202c(7);
            if (mo45599Hr != m142578e) {
            }
        } catch (Throwable th7) {
            th2 = th7;
            safeCollector2 = safeCollector;
            safeCollector2.mo113558p();
            throw th2;
        }
        c218131 = new C218131(continuation);
        Object obj2 = c218131.f106600s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218131.f106601t;
        if (i11 == 0) {
        }
        safeCollector = new SafeCollector(flowCollector, c218131.getContext());
    }
}
