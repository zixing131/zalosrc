package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.SafeCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ InterfaceC18509p f106613p;

    /* renamed from: q */
    final /* synthetic */ Flow f106614q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1", m145345f = "Emitters.kt", m145346l = {116, 120}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218151 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106615s;

        /* renamed from: t */
        int f106616t;

        /* renamed from: v */
        Object f106618v;

        /* renamed from: w */
        Object f106619w;

        /* renamed from: x */
        Object f106620x;

        public C218151(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106615s = obj;
            this.f106616t |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218151 c218151;
        Object m142578e;
        int i11;
        Throwable th2;
        SafeCollector safeCollector;
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        FlowCollector flowCollector2;
        Flow flow;
        if (continuation instanceof C218151) {
            c218151 = (C218151) continuation;
            int i12 = c218151.f106616t;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c218151.f106616t = i12 - Integer.MIN_VALUE;
                Object obj = c218151.f106615s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218151.f106616t;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            AbstractC24862s.m129228b(obj);
                            return C24848g0.f119245a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    safeCollector = (SafeCollector) c218151.f106620x;
                    flowCollector2 = (FlowCollector) c218151.f106619w;
                    flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1) c218151.f106618v;
                    try {
                        AbstractC24862s.m129228b(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        safeCollector.mo113558p();
                        throw th2;
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    SafeCollector safeCollector2 = new SafeCollector(flowCollector, c218151.getContext());
                    try {
                        InterfaceC18509p interfaceC18509p = this.f106613p;
                        c218151.f106618v = this;
                        c218151.f106619w = flowCollector;
                        c218151.f106620x = safeCollector2;
                        c218151.f106616t = 1;
                        AbstractC19072r.m100202c(6);
                        Object mo240pC = interfaceC18509p.mo240pC(safeCollector2, c218151);
                        AbstractC19072r.m100202c(7);
                        if (mo240pC == m142578e) {
                            return m142578e;
                        }
                        flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this;
                        flowCollector2 = flowCollector;
                        safeCollector = safeCollector2;
                    } catch (Throwable th4) {
                        th2 = th4;
                        safeCollector = safeCollector2;
                        safeCollector.mo113558p();
                        throw th2;
                    }
                }
                safeCollector.mo113558p();
                flow = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f106614q;
                c218151.f106618v = null;
                c218151.f106619w = null;
                c218151.f106620x = null;
                c218151.f106616t = 2;
                if (flow.mo97893a(flowCollector2, c218151) == m142578e) {
                    return m142578e;
                }
                return C24848g0.f119245a;
            }
        }
        c218151 = new C218151(continuation);
        Object obj2 = c218151.f106615s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218151.f106616t;
        if (i11 == 0) {
        }
        safeCollector.mo113558p();
        flow = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.f106614q;
        c218151.f106618v = null;
        c218151.f106619w = null;
        c218151.f106620x = null;
        c218151.f106616t = 2;
        if (flow.mo97893a(flowCollector2, c218151) == m142578e) {
        }
        return C24848g0.f119245a;
    }
}
