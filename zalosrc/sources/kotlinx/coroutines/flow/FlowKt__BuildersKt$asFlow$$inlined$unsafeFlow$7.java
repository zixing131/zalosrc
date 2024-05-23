package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7 implements Flow<Integer> {

    /* renamed from: p */
    final /* synthetic */ int[] f106468p;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7", m145345f = "Builders.kt", m145346l = {115}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7$1 */
    /* loaded from: classes7.dex */
    public static final class C218071 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106469s;

        /* renamed from: t */
        int f106470t;

        /* renamed from: v */
        Object f106472v;

        /* renamed from: w */
        Object f106473w;

        /* renamed from: x */
        int f106474x;

        /* renamed from: y */
        int f106475y;

        public C218071(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106469s = obj;
            this.f106470t |= Integer.MIN_VALUE;
            return FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218071 c218071;
        Object m142578e;
        int i11;
        int[] iArr;
        FlowCollector flowCollector2;
        int i12;
        int i13;
        if (continuation instanceof C218071) {
            c218071 = (C218071) continuation;
            int i14 = c218071.f106470t;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c218071.f106470t = i14 - Integer.MIN_VALUE;
                Object obj = c218071.f106469s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218071.f106470t;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i12 = c218071.f106475y;
                        i13 = c218071.f106474x;
                        iArr = (int[]) c218071.f106473w;
                        FlowCollector flowCollector3 = (FlowCollector) c218071.f106472v;
                        AbstractC24862s.m129228b(obj);
                        flowCollector2 = flowCollector3;
                        i13++;
                        if (i13 < i12) {
                            Integer m145341c = AbstractC29094b.m145341c(iArr[i13]);
                            c218071.f106472v = flowCollector2;
                            c218071.f106473w = iArr;
                            c218071.f106474x = i13;
                            c218071.f106475y = i12;
                            c218071.f106470t = 1;
                            if (flowCollector2.mo12109b(m145341c, c218071) == m142578e) {
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
                    int[] iArr2 = this.f106468p;
                    int length = iArr2.length;
                    iArr = iArr2;
                    flowCollector2 = flowCollector;
                    i12 = length;
                    i13 = 0;
                    if (i13 < i12) {
                    }
                }
            }
        }
        c218071 = new C218071(continuation);
        Object obj2 = c218071.f106469s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218071.f106470t;
        if (i11 == 0) {
        }
    }
}
