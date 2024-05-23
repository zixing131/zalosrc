package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Object[] f106490p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", m145345f = "Builders.kt", m145346l = {114}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218101 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106491s;

        /* renamed from: t */
        int f106492t;

        /* renamed from: v */
        Object f106494v;

        /* renamed from: w */
        Object f106495w;

        /* renamed from: x */
        int f106496x;

        /* renamed from: y */
        int f106497y;

        public C218101(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106491s = obj;
            this.f106492t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005d -> B:10:0x0060). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218101 c218101;
        Object m142578e;
        int i11;
        int i12;
        FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
        FlowCollector flowCollector2;
        int length;
        if (continuation instanceof C218101) {
            c218101 = (C218101) continuation;
            int i13 = c218101.f106492t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c218101.f106492t = i13 - Integer.MIN_VALUE;
                Object obj = c218101.f106491s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218101.f106492t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        length = c218101.f106497y;
                        i12 = c218101.f106496x;
                        FlowCollector flowCollector3 = (FlowCollector) c218101.f106495w;
                        flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = (FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1) c218101.f106494v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                        i12++;
                        if (i12 < length) {
                            Object obj2 = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1.f106490p[i12];
                            c218101.f106494v = flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1;
                            c218101.f106495w = flowCollector2;
                            c218101.f106496x = i12;
                            c218101.f106497y = length;
                            c218101.f106492t = 1;
                            if (flowCollector2.mo12109b(obj2, c218101) == m142578e) {
                                return m142578e;
                            }
                            i12++;
                            if (i12 < length) {
                                return C24848g0.f119245a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    i12 = 0;
                    flowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1 = this;
                    flowCollector2 = flowCollector;
                    length = this.f106490p.length;
                    if (i12 < length) {
                    }
                }
            }
        }
        c218101 = new C218101(continuation);
        Object obj3 = c218101.f106491s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218101.f106492t;
        if (i11 == 0) {
        }
    }
}
