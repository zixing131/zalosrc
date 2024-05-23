package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$onErrorReturn$2", m145345f = "Migration.kt", m145346l = {306}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__MigrationKt$onErrorReturn$2 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    int f106783t;

    /* renamed from: u */
    private /* synthetic */ Object f106784u;

    /* renamed from: v */
    /* synthetic */ Object f106785v;

    /* renamed from: w */
    final /* synthetic */ InterfaceC18505l f106786w;

    /* renamed from: x */
    final /* synthetic */ Object f106787x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__MigrationKt$onErrorReturn$2(InterfaceC18505l interfaceC18505l, Object obj, Continuation continuation) {
        super(3, continuation);
        this.f106786w = interfaceC18505l;
        this.f106787x = obj;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106783t;
        if (i11 != 0) {
            if (i11 == 1) {
                AbstractC24862s.m129228b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC24862s.m129228b(obj);
            FlowCollector flowCollector = (FlowCollector) this.f106784u;
            Throwable th2 = (Throwable) this.f106785v;
            if (((Boolean) this.f106786w.mo205i9(th2)).booleanValue()) {
                Object obj2 = this.f106787x;
                this.f106784u = null;
                this.f106783t = 1;
                if (flowCollector.mo12109b(obj2, this) == m142578e) {
                    return m142578e;
                }
            } else {
                throw th2;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(FlowCollector flowCollector, Throwable th2, Continuation continuation) {
        FlowKt__MigrationKt$onErrorReturn$2 flowKt__MigrationKt$onErrorReturn$2 = new FlowKt__MigrationKt$onErrorReturn$2(this.f106786w, this.f106787x, continuation);
        flowKt__MigrationKt$onErrorReturn$2.f106784u = flowCollector;
        flowKt__MigrationKt$onErrorReturn$2.f106785v = th2;
        return flowKt__MigrationKt$onErrorReturn$2.mo239o(C24848g0.f119245a);
    }
}
