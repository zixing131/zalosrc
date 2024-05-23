package kotlinx.coroutines.flow;

import en0.InterfaceC18505l;
import en0.InterfaceC18510q;
import fn0.C19057i0;
import fn0.C19059j0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29104l;
import wm0.InterfaceC29098f;

@InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m145345f = "Delay.kt", m145346l = {221, 416}, m145347m = "invokeSuspend")
/* loaded from: classes7.dex */
final class FlowKt__DelayKt$debounceInternal$1 extends AbstractC29104l implements InterfaceC18510q {

    /* renamed from: t */
    Object f106536t;

    /* renamed from: u */
    Object f106537u;

    /* renamed from: v */
    int f106538v;

    /* renamed from: w */
    private /* synthetic */ Object f106539w;

    /* renamed from: x */
    /* synthetic */ Object f106540x;

    /* renamed from: y */
    final /* synthetic */ InterfaceC18505l f106541y;

    /* renamed from: z */
    final /* synthetic */ Flow f106542z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(InterfaceC18505l interfaceC18505l, Flow flow, Continuation continuation) {
        super(3, continuation);
        this.f106541y = interfaceC18505l;
        this.f106542z = flow;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f4 -> B:6:0x006a). Please report as a decompilation issue!!! */
    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo239o(Object obj) {
        Object m142578e;
        FlowCollector flowCollector;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1;
        ReceiveChannel m113188e;
        C19059j0 c19059j0;
        C19057i0 c19057i0;
        C19059j0 c19059j02;
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$12;
        SelectImplementation selectImplementation;
        m142578e = AbstractC28298d.m142578e();
        int i11 = this.f106538v;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    C19059j0 c19059j03 = (C19059j0) this.f106536t;
                    ReceiveChannel receiveChannel = (ReceiveChannel) this.f106540x;
                    FlowCollector flowCollector2 = (FlowCollector) this.f106539w;
                    AbstractC24862s.m129228b(obj);
                    flowCollector = flowCollector2;
                    m113188e = receiveChannel;
                    c19059j0 = c19059j03;
                    flowKt__DelayKt$debounceInternal$1 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C19057i0 c19057i02 = (C19057i0) this.f106537u;
                c19059j0 = (C19059j0) this.f106536t;
                m113188e = (ReceiveChannel) this.f106540x;
                flowCollector = (FlowCollector) this.f106539w;
                AbstractC24862s.m129228b(obj);
                c19057i0 = c19057i02;
                flowKt__DelayKt$debounceInternal$1 = this;
                c19059j0.f94941p = null;
                c19059j02 = c19059j0;
                flowKt__DelayKt$debounceInternal$12 = flowKt__DelayKt$debounceInternal$1;
                selectImplementation = new SelectImplementation(flowKt__DelayKt$debounceInternal$12.getContext());
                if (c19059j02.f94941p != null) {
                    OnTimeoutKt.m113828a(selectImplementation, c19057i0.f94939p, new FlowKt__DelayKt$debounceInternal$1$3$1(flowCollector, c19059j02, null));
                }
                selectImplementation.mo113831c(m113188e.mo113017w(), new FlowKt__DelayKt$debounceInternal$1$3$2(c19059j02, flowCollector, null));
                flowKt__DelayKt$debounceInternal$12.f106539w = flowCollector;
                flowKt__DelayKt$debounceInternal$12.f106540x = m113188e;
                flowKt__DelayKt$debounceInternal$12.f106536t = c19059j02;
                flowKt__DelayKt$debounceInternal$12.f106537u = null;
                flowKt__DelayKt$debounceInternal$12.f106538v = 2;
                if (selectImplementation.mo113858p(flowKt__DelayKt$debounceInternal$12) != m142578e) {
                    return m142578e;
                }
                c19059j0 = c19059j02;
                flowKt__DelayKt$debounceInternal$1 = flowKt__DelayKt$debounceInternal$12;
            }
        } else {
            AbstractC24862s.m129228b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f106539w;
            flowCollector = (FlowCollector) this.f106540x;
            flowKt__DelayKt$debounceInternal$1 = this;
            m113188e = ProduceKt.m113188e(coroutineScope, null, 0, new FlowKt__DelayKt$debounceInternal$1$values$1(this.f106542z, null), 3, null);
            c19059j0 = new C19059j0();
        }
        if (c19059j0.f94941p != NullSurrogateKt.f107315c) {
            c19057i0 = new C19057i0();
            Object obj2 = c19059j0.f94941p;
            if (obj2 != null) {
                InterfaceC18505l interfaceC18505l = flowKt__DelayKt$debounceInternal$1.f106541y;
                Symbol symbol = NullSurrogateKt.f107313a;
                if (obj2 == symbol) {
                    obj2 = null;
                }
                long longValue = ((Number) interfaceC18505l.mo205i9(obj2)).longValue();
                c19057i0.f94939p = longValue;
                if (longValue >= 0) {
                    if (longValue == 0) {
                        Object obj3 = c19059j0.f94941p;
                        if (obj3 == symbol) {
                            obj3 = null;
                        }
                        flowKt__DelayKt$debounceInternal$1.f106539w = flowCollector;
                        flowKt__DelayKt$debounceInternal$1.f106540x = m113188e;
                        flowKt__DelayKt$debounceInternal$1.f106536t = c19059j0;
                        flowKt__DelayKt$debounceInternal$1.f106537u = c19057i0;
                        flowKt__DelayKt$debounceInternal$1.f106538v = 1;
                        if (flowCollector.mo12109b(obj3, flowKt__DelayKt$debounceInternal$1) == m142578e) {
                            return m142578e;
                        }
                        c19059j0.f94941p = null;
                    }
                } else {
                    throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
                }
            }
            c19059j02 = c19059j0;
            flowKt__DelayKt$debounceInternal$12 = flowKt__DelayKt$debounceInternal$1;
            selectImplementation = new SelectImplementation(flowKt__DelayKt$debounceInternal$12.getContext());
            if (c19059j02.f94941p != null) {
            }
            selectImplementation.mo113831c(m113188e.mo113017w(), new FlowKt__DelayKt$debounceInternal$1$3$2(c19059j02, flowCollector, null));
            flowKt__DelayKt$debounceInternal$12.f106539w = flowCollector;
            flowKt__DelayKt$debounceInternal$12.f106540x = m113188e;
            flowKt__DelayKt$debounceInternal$12.f106536t = c19059j02;
            flowKt__DelayKt$debounceInternal$12.f106537u = null;
            flowKt__DelayKt$debounceInternal$12.f106538v = 2;
            if (selectImplementation.mo113858p(flowKt__DelayKt$debounceInternal$12) != m142578e) {
            }
        } else {
            return C24848g0.f119245a;
        }
    }

    @Override // en0.InterfaceC18510q
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object mo45599Hr(CoroutineScope coroutineScope, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f106541y, this.f106542z, continuation);
        flowKt__DelayKt$debounceInternal$1.f106539w = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.f106540x = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.mo239o(C24848g0.f119245a);
    }
}
