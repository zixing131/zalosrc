package kotlinx.coroutines.flow;

import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import en0.InterfaceC18509p;
import fn0.AbstractC19072r;
import fn0.C19051f0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.SafeCollector;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106605p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18509p f106606q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", m145345f = "Emitters.kt", m145346l = {114, ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218141 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106607s;

        /* renamed from: t */
        int f106608t;

        /* renamed from: v */
        Object f106610v;

        /* renamed from: w */
        Object f106611w;

        /* renamed from: x */
        Object f106612x;

        public C218141(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106607s = obj;
            this.f106608t |= Integer.MIN_VALUE;
            return FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlinx.coroutines.flow.FlowCollector, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218141 c218141;
        Object m142578e;
        int i11;
        FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1;
        FlowCollector flowCollector2;
        C19051f0 c19051f0;
        try {
            if (continuation instanceof C218141) {
                c218141 = (C218141) continuation;
                int i12 = c218141.f106608t;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    c218141.f106608t = i12 - Integer.MIN_VALUE;
                    Object obj = c218141.f106607s;
                    m142578e = AbstractC28298d.m142578e();
                    i11 = c218141.f106608t;
                    if (i11 == 0) {
                        if (i11 != 1) {
                            if (i11 == 2) {
                                SafeCollector safeCollector = (SafeCollector) c218141.f106610v;
                                AbstractC24862s.m129228b(obj);
                                flowCollector = safeCollector;
                                return C24848g0.f119245a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c19051f0 = (C19051f0) c218141.f106612x;
                        flowCollector2 = (FlowCollector) c218141.f106611w;
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) c218141.f106610v;
                        AbstractC24862s.m129228b(obj);
                    } else {
                        AbstractC24862s.m129228b(obj);
                        C19051f0 c19051f02 = new C19051f0();
                        c19051f02.f94928p = true;
                        Flow flow = this.f106605p;
                        FlowKt__EmittersKt$onEmpty$1$1 flowKt__EmittersKt$onEmpty$1$1 = new FlowKt__EmittersKt$onEmpty$1$1(c19051f02, flowCollector);
                        c218141.f106610v = this;
                        c218141.f106611w = flowCollector;
                        c218141.f106612x = c19051f02;
                        c218141.f106608t = 1;
                        if (flow.mo97893a(flowKt__EmittersKt$onEmpty$1$1, c218141) == m142578e) {
                            return m142578e;
                        }
                        flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 = this;
                        flowCollector2 = flowCollector;
                        c19051f0 = c19051f02;
                    }
                    if (c19051f0.f94928p) {
                        SafeCollector safeCollector2 = new SafeCollector(flowCollector2, c218141.getContext());
                        InterfaceC18509p interfaceC18509p = flowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.f106606q;
                        c218141.f106610v = safeCollector2;
                        c218141.f106611w = null;
                        c218141.f106612x = null;
                        c218141.f106608t = 2;
                        AbstractC19072r.m100202c(6);
                        Object mo240pC = interfaceC18509p.mo240pC(safeCollector2, c218141);
                        AbstractC19072r.m100202c(7);
                        flowCollector = safeCollector2;
                        if (mo240pC == m142578e) {
                            return m142578e;
                        }
                    }
                    return C24848g0.f119245a;
                }
            }
            if (i11 == 0) {
            }
            if (c19051f0.f94928p) {
            }
            return C24848g0.f119245a;
        } finally {
            flowCollector.mo113558p();
        }
        c218141 = new C218141(continuation);
        Object obj2 = c218141.f106607s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218141.f106608t;
    }
}
