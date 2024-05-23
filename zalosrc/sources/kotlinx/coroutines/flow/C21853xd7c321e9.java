package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18513t;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4", m145345f = "Zip.kt", m145346l = {273}, m145347m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4 */
/* loaded from: classes7.dex */
public final class C21853xd7c321e9 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107039t;

    /* renamed from: u */
    private /* synthetic */ Object f107040u;

    /* renamed from: v */
    final /* synthetic */ Flow[] f107041v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18513t f107042w;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1", m145345f = "Zip.kt", m145346l = {333}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f107043t;

        /* renamed from: u */
        private /* synthetic */ Object f107044u;

        /* renamed from: v */
        /* synthetic */ Object f107045v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18513t f107046w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, InterfaceC18513t interfaceC18513t) {
            super(3, continuation);
            this.f107046w = interfaceC18513t;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107043t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f107044u;
                Object[] objArr = (Object[]) this.f107045v;
                InterfaceC18513t interfaceC18513t = this.f107046w;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                Object obj5 = objArr[3];
                this.f107043t = 1;
                AbstractC19072r.m100202c(6);
                Object mo11750Ng = interfaceC18513t.mo11750Ng(flowCollector, obj2, obj3, obj4, obj5, this);
                AbstractC19072r.m100202c(7);
                if (mo11750Ng == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f107046w);
            anonymousClass1.f107044u = flowCollector;
            anonymousClass1.f107045v = objArr;
            return anonymousClass1.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21853xd7c321e9(Flow[] flowArr, Continuation continuation, InterfaceC18513t interfaceC18513t) {
        super(2, continuation);
        this.f107041v = flowArr;
        this.f107042w = interfaceC18513t;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        C21853xd7c321e9 c21853xd7c321e9 = new C21853xd7c321e9(this.f107041v, continuation, this.f107042w);
        c21853xd7c321e9.f107040u = obj;
        return c21853xd7c321e9;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        InterfaceC18494a m113403c;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107039t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107040u;
            Flow[] flowArr = this.f107041v;
            m113403c = FlowKt__ZipKt.m113403c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f107042w);
            this.f107039t = 1;
            if (CombineKt.m113542a(flowCollector, flowArr, m113403c, anonymousClass1, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((C21853xd7c321e9) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
