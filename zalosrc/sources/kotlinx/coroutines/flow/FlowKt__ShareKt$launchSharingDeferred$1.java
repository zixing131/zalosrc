package kotlinx.coroutines.flow;

import en0.InterfaceC18509p;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", m145345f = "Share.kt", m145346l = {340}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__ShareKt$launchSharingDeferred$1 extends AbstractC29104l implements InterfaceC18509p {

    /* renamed from: t */
    int f106869t;

    /* renamed from: u */
    private /* synthetic */ Object f106870u;

    /* renamed from: v */
    final /* synthetic */ Flow f106871v;

    /* renamed from: w */
    final /* synthetic */ CompletableDeferred f106872w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FlowKt__ShareKt$launchSharingDeferred$1(Flow flow, CompletableDeferred completableDeferred, Continuation continuation) {
        super(2, continuation);
        this.f106871v = flow;
        this.f106872w = completableDeferred;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: a */
    public final Continuation mo238a(Object obj, Continuation continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.f106871v, this.f106872w, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.f106870u = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public final Object mo239o(Object obj) {
        Object m142578e;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106869t;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.f106870u;
                final C19059j0 c19059j0 = new C19059j0();
                Flow flow = this.f106871v;
                final CompletableDeferred completableDeferred = this.f106872w;
                FlowCollector flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: b */
                    public final Object mo12109b(Object obj2, Continuation continuation) {
                        C24848g0 c24848g0;
                        MutableStateFlow mutableStateFlow = (MutableStateFlow) C19059j0.this.f94941p;
                        if (mutableStateFlow != null) {
                            mutableStateFlow.setValue(obj2);
                            c24848g0 = C24848g0.f119245a;
                        } else {
                            c24848g0 = null;
                        }
                        if (c24848g0 == null) {
                            CoroutineScope coroutineScope2 = coroutineScope;
                            C19059j0 c19059j02 = C19059j0.this;
                            CompletableDeferred completableDeferred2 = completableDeferred;
                            MutableStateFlow m113503a = StateFlowKt.m113503a(obj2);
                            completableDeferred2.mo112596N(new ReadonlyStateFlow(m113503a, JobKt.m112759l(coroutineScope2.mo9207O())));
                            c19059j02.f94941p = m113503a;
                        }
                        return C24848g0.f119245a;
                    }
                };
                this.f106869t = 1;
                if (flow.mo97893a(flowCollector, this) == m142578e) {
                    return m142578e;
                }
            }
            return C24848g0.f119245a;
        } catch (Throwable th2) {
            this.f106872w.mo112595L(th2);
            throw th2;
        }
    }

    @Override // en0.InterfaceC18509p
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
    }
}
