package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Object[] f106460p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6", m145345f = "Builders.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6$1 */
    /* loaded from: classes7.dex */
    public static final class C218061 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106461s;

        /* renamed from: t */
        int f106462t;

        /* renamed from: v */
        Object f106464v;

        /* renamed from: w */
        Object f106465w;

        /* renamed from: x */
        int f106466x;

        /* renamed from: y */
        int f106467y;

        public C218061(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106461s = obj;
            this.f106462t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218061 c218061;
        Object m142578e;
        int i11;
        Object[] objArr;
        FlowCollector flowCollector2;
        int i12;
        int i13;
        if (continuation instanceof C218061) {
            c218061 = (C218061) continuation;
            int i14 = c218061.f106462t;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c218061.f106462t = i14 - Integer.MIN_VALUE;
                Object obj = c218061.f106461s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218061.f106462t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i12 = c218061.f106467y;
                        i13 = c218061.f106466x;
                        objArr = (Object[]) c218061.f106465w;
                        FlowCollector flowCollector3 = (FlowCollector) c218061.f106464v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                        i13++;
                        if (i13 < i12) {
                            Object obj2 = objArr[i13];
                            c218061.f106464v = flowCollector2;
                            c218061.f106465w = objArr;
                            c218061.f106466x = i13;
                            c218061.f106467y = i12;
                            c218061.f106462t = 1;
                            if (flowCollector2.mo12109b(obj2, c218061) == m142578e) {
                                return m142578e;
                            }
                            i13++;
                            if (i13 < i12) {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    Object[] objArr2 = this.f106460p;
                    int length = objArr2.length;
                    objArr = objArr2;
                    flowCollector2 = flowCollector;
                    i12 = length;
                    i13 = 0;
                    if (i13 < i12) {
                    }
                }
            }
        }
        c218061 = new C218061(continuation);
        Object obj3 = c218061.f106461s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218061.f106462t;
        if (i11 == 0) {
        }
    }
}
