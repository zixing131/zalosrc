package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import en0.InterfaceC18511r;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1", m145345f = "Zip.kt", m145346l = {273}, m145347m = "invokeSuspend")
/* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1 */
/* loaded from: classes7.dex */
public final class C21850xd7c321e6 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107015t;

    /* renamed from: u */
    private /* synthetic */ Object f107016u;

    /* renamed from: v */
    final /* synthetic */ Flow[] f107017v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18511r f107018w;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1", m145345f = "Zip.kt", m145346l = {333}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static final class AnonymousClass1 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f107019t;

        /* renamed from: u */
        private /* synthetic */ Object f107020u;

        /* renamed from: v */
        /* synthetic */ Object f107021v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18511r f107022w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, InterfaceC18511r interfaceC18511r) {
            super(3, continuation);
            this.f107022w = interfaceC18511r;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107019t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f107020u;
                Object[] objArr = (Object[]) this.f107021v;
                InterfaceC18511r interfaceC18511r = this.f107022w;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                this.f107019t = 1;
                AbstractC19072r.m100202c(6);
                Object mo49340Uc = interfaceC18511r.mo49340Uc(flowCollector, obj2, obj3, this);
                AbstractC19072r.m100202c(7);
                if (mo49340Uc == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f107022w);
            anonymousClass1.f107020u = flowCollector;
            anonymousClass1.f107021v = objArr;
            return anonymousClass1.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21850xd7c321e6(Flow[] flowArr, Continuation continuation, InterfaceC18511r interfaceC18511r) {
        super(2, continuation);
        this.f107017v = flowArr;
        this.f107018w = interfaceC18511r;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        C21850xd7c321e6 c21850xd7c321e6 = new C21850xd7c321e6(this.f107017v, continuation, this.f107018w);
        c21850xd7c321e6.f107016u = obj;
        return c21850xd7c321e6;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        InterfaceC18494a m113403c;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107015t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107016u;
            Flow[] flowArr = this.f107017v;
            m113403c = FlowKt__ZipKt.m113403c();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f107018w);
            this.f107015t = 1;
            if (CombineKt.m113542a(flowCollector, flowArr, m113403c, anonymousClass1, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((C21850xd7c321e6) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
