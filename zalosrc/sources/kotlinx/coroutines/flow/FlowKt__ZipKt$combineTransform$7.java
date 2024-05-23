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

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", m145345f = "Zip.kt", m145346l = {308}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combineTransform$7 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107081t;

    /* renamed from: u */
    private /* synthetic */ Object f107082u;

    /* renamed from: v */
    final /* synthetic */ Flow[] f107083v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18510q f107084w;

    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1 */
    /* loaded from: classes7.dex */
    public static final class C218581 extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Flow[] f107085q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C218581(Flow[] flowArr) {
            super(0);
            this.f107085q = flowArr;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object[] mo12V4() {
            int length = this.f107085q.length;
            AbstractC19074t.m100213k(0, "T?");
            return new Object[length];
        }
    }

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", m145345f = "Zip.kt", m145346l = {308}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2 */
    /* loaded from: classes7.dex */
    public static final class C218592 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f107086t;

        /* renamed from: u */
        private /* synthetic */ Object f107087u;

        /* renamed from: v */
        /* synthetic */ Object f107088v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18510q f107089w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C218592(InterfaceC18510q interfaceC18510q, Continuation continuation) {
            super(3, continuation);
            this.f107089w = interfaceC18510q;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107086t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f107087u;
                Object[] objArr = (Object[]) this.f107088v;
                InterfaceC18510q interfaceC18510q = this.f107089w;
                this.f107087u = null;
                this.f107086t = 1;
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
            C218592 c218592 = new C218592(this.f107089w, continuation);
            c218592.f107087u = flowCollector;
            c218592.f107088v = objArr;
            return c218592.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransform$7(Flow[] flowArr, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f107083v = flowArr;
        this.f107084w = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__ZipKt$combineTransform$7 flowKt__ZipKt$combineTransform$7 = new FlowKt__ZipKt$combineTransform$7(this.f107083v, this.f107084w, continuation);
        flowKt__ZipKt$combineTransform$7.f107082u = obj;
        return flowKt__ZipKt$combineTransform$7;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107081t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107082u;
            Flow[] flowArr = this.f107083v;
            AbstractC19074t.m100212j();
            C218581 c218581 = new C218581(this.f107083v);
            AbstractC19074t.m100212j();
            C218592 c218592 = new C218592(this.f107084w, null);
            this.f107081t = 1;
            if (CombineKt.m113542a(flowCollector, flowArr, c218581, c218592, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__ZipKt$combineTransform$7) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
