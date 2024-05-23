package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", m145345f = "Zip.kt", m145346l = {251}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combineTransform$6 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107072t;

    /* renamed from: u */
    private /* synthetic */ Object f107073u;

    /* renamed from: v */
    final /* synthetic */ Flow[] f107074v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18510q f107075w;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1 */
    /* loaded from: classes7.dex */
    public static final class C218561 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Flow[] f107076q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C218561(Flow[] flowArr) {
            super(0);
            this.f107076q = flowArr;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object[] mo12V4() {
            int length = this.f107076q.length;
            AbstractC19074t.m100213k(0, "T?");
            return new Object[length];
        }
    }

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", m145345f = "Zip.kt", m145346l = {251}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2 */
    /* loaded from: classes7.dex */
    public static final class C218572 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f107077t;

        /* renamed from: u */
        private /* synthetic */ Object f107078u;

        /* renamed from: v */
        /* synthetic */ Object f107079v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18510q f107080w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C218572(InterfaceC18510q interfaceC18510q, Continuation continuation) {
            super(3, continuation);
            this.f107080w = interfaceC18510q;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107077t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f107078u;
                Object[] objArr = (Object[]) this.f107079v;
                InterfaceC18510q interfaceC18510q = this.f107080w;
                this.f107078u = null;
                this.f107077t = 1;
                if (interfaceC18510q.mo45599Hr(flowCollector, objArr, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18510q
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo45599Hr(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            AbstractC19074t.m100212j();
            C218572 c218572 = new C218572(this.f107080w, continuation);
            c218572.f107078u = flowCollector;
            c218572.f107079v = objArr;
            return c218572.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$6(Flow[] flowArr, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f107074v = flowArr;
        this.f107075w = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__ZipKt$combineTransform$6 flowKt__ZipKt$combineTransform$6 = new FlowKt__ZipKt$combineTransform$6(this.f107074v, this.f107075w, continuation);
        flowKt__ZipKt$combineTransform$6.f107073u = obj;
        return flowKt__ZipKt$combineTransform$6;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107072t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107073u;
            Flow[] flowArr = this.f107074v;
            AbstractC19074t.m100212j();
            C218561 c218561 = new C218561(this.f107074v);
            AbstractC19074t.m100212j();
            C218572 c218572 = new C218572(this.f107075w, null);
            this.f107072t = 1;
            if (CombineKt.m113542a(flowCollector, flowArr, c218561, c218572, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__ZipKt$combineTransform$6) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
