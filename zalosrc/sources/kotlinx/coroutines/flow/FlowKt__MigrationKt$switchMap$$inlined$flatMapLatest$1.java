package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", m145345f = "Migration.kt", m145346l = {193, 193}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    int f106774t;

    /* renamed from: u */
    private /* synthetic */ Object f106775u;

    /* renamed from: v */
    /* synthetic */ Object f106776v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18509p f106777w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(InterfaceC18509p interfaceC18509p, Continuation continuation) {
        super(3, continuation);
        this.f106777w = interfaceC18509p;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        FlowCollector flowCollector;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106774t;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    AbstractC24862s.m129228b(obj);
                    return C24848g0.f119245a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowCollector = (FlowCollector) this.f106775u;
            AbstractC24862s.m129228b(obj);
        } else {
            AbstractC24862s.m129228b(obj);
            flowCollector = (FlowCollector) this.f106775u;
            Object obj2 = this.f106776v;
            InterfaceC18509p interfaceC18509p = this.f106777w;
            this.f106775u = flowCollector;
            this.f106774t = 1;
            obj = interfaceC18509p.mo240pC(obj2, this);
            if (obj == m142578e) {
                return m142578e;
            }
        }
        this.f106775u = null;
        this.f106774t = 2;
        if (FlowKt.m113301s(flowCollector, (Flow) obj, this) == m142578e) {
            return m142578e;
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(FlowCollector flowCollector, Object obj, Continuation continuation) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.f106777w, continuation);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f106775u = flowCollector;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.f106776v = obj;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.mo239o(C24848g0.f119245a);
    }
}
