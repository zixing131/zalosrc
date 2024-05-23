package kotlinx.coroutines.flow;

import en0.InterfaceC18494a;
import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.internal.CombineKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1", m145345f = "Zip.kt", m145346l = {273}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__ZipKt$combineTransformUnsafe$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f107090t;

    /* renamed from: u */
    private /* synthetic */ Object f107091u;

    /* renamed from: v */
    final /* synthetic */ Flow[] f107092v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18510q f107093w;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1", m145345f = "Zip.kt", m145346l = {273}, m145347m = "invokeSuspend")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransformUnsafe$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218601 extends AbstractC29104l implements InterfaceC18510q {

        /* renamed from: t */
        int f107094t;

        /* renamed from: u */
        private /* synthetic */ Object f107095u;

        /* renamed from: v */
        /* synthetic */ Object f107096v;

        /* renamed from: w */
        final /* synthetic */ InterfaceC18510q f107097w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C218601(InterfaceC18510q interfaceC18510q, Continuation continuation) {
            super(3, continuation);
            this.f107097w = interfaceC18510q;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f107094t;
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f107095u;
                Object[] objArr = (Object[]) this.f107096v;
                InterfaceC18510q interfaceC18510q = this.f107097w;
                this.f107095u = null;
                this.f107094t = 1;
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
            C218601 c218601 = new C218601(this.f107097w, continuation);
            c218601.f107095u = flowCollector;
            c218601.f107096v = objArr;
            return c218601.mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combineTransformUnsafe$1(Flow[] flowArr, InterfaceC18510q interfaceC18510q, Continuation continuation) {
        super(2, continuation);
        this.f107092v = flowArr;
        this.f107093w = interfaceC18510q;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__ZipKt$combineTransformUnsafe$1 flowKt__ZipKt$combineTransformUnsafe$1 = new FlowKt__ZipKt$combineTransformUnsafe$1(this.f107092v, this.f107093w, continuation);
        flowKt__ZipKt$combineTransformUnsafe$1.f107091u = obj;
        return flowKt__ZipKt$combineTransformUnsafe$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        InterfaceC18494a m113403c;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f107090t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f107091u;
            Flow[] flowArr = this.f107092v;
            m113403c = FlowKt__ZipKt.m113403c();
            AbstractC19074t.m100212j();
            C218601 c218601 = new C218601(this.f107093w, null);
            this.f107090t = 1;
            if (CombineKt.m113542a(flowCollector, flowArr, m113403c, c218601, this) == m142578e) {
                return m142578e;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(FlowCollector flowCollector, Continuation continuation) {
        return ((FlowKt__ZipKt$combineTransformUnsafe$1) mo238a(flowCollector, continuation)).mo239o(C24848g0.f119245a);
    }
}
