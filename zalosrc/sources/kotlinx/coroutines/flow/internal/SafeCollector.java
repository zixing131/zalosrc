package kotlinx.coroutines.flow.internal;

import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import on0.AbstractC24334o;
import pm0.C24848g0;
import pm0.C24861r;
import um0.C27316g;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;
import wm0.AbstractC29096d;
import wm0.AbstractC29100h;
import wm0.InterfaceC29097e;

/* loaded from: classes7.dex */
public final class SafeCollector<T> extends AbstractC29096d implements FlowCollector<T>, InterfaceC29097e {

    /* renamed from: s */
    public final FlowCollector f107316s;

    /* renamed from: t */
    public final InterfaceC27315f f107317t;

    /* renamed from: u */
    public final int f107318u;

    /* renamed from: v */
    private InterfaceC27315f f107319v;

    /* renamed from: w */
    private Continuation f107320w;

    public SafeCollector(FlowCollector flowCollector, InterfaceC27315f interfaceC27315f) {
        super(NoOpContinuation.f107310p, C27316g.f128559p);
        this.f107316s = flowCollector;
        this.f107317t = interfaceC27315f;
        this.f107318u = ((Number) interfaceC27315f.mo112826h(0, SafeCollector$collectContextSize$1.f107321q)).intValue();
    }

    /* renamed from: r */
    private final void m113555r(InterfaceC27315f interfaceC27315f, InterfaceC27315f interfaceC27315f2, Object obj) {
        if (interfaceC27315f2 instanceof DownstreamExceptionContext) {
            m113557t((DownstreamExceptionContext) interfaceC27315f2, obj);
        }
        SafeCollector_commonKt.m113562a(this, interfaceC27315f);
    }

    /* renamed from: s */
    private final Object m113556s(Continuation continuation, Object obj) {
        InterfaceC18510q interfaceC18510q;
        Object m142578e;
        InterfaceC27315f context = continuation.getContext();
        JobKt.m112758k(context);
        InterfaceC27315f interfaceC27315f = this.f107319v;
        if (interfaceC27315f != context) {
            m113555r(context, interfaceC27315f, obj);
            this.f107319v = context;
        }
        this.f107320w = continuation;
        interfaceC18510q = SafeCollectorKt.f107322a;
        FlowCollector flowCollector = this.f107316s;
        AbstractC19074t.m100206d(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC19074t.m100206d(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object mo45599Hr = interfaceC18510q.mo45599Hr(flowCollector, obj, this);
        m142578e = AbstractC28298d.m142578e();
        if (!AbstractC19074t.m100204b(mo45599Hr, m142578e)) {
            this.f107320w = null;
        }
        return mo45599Hr;
    }

    /* renamed from: t */
    private final void m113557t(DownstreamExceptionContext downstreamExceptionContext, Object obj) {
        String m127098f;
        m127098f = AbstractC24334o.m127098f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + downstreamExceptionContext.f107303p + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(m127098f.toString());
    }

    @Override // wm0.AbstractC29093a, wm0.InterfaceC29097e
    /* renamed from: C */
    public StackTraceElement mo112573C() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    /* renamed from: b */
    public Object mo12109b(Object obj, Continuation continuation) {
        Object m142578e;
        Object m142578e2;
        try {
            Object m113556s = m113556s(continuation, obj);
            m142578e = AbstractC28298d.m142578e();
            if (m113556s == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            m142578e2 = AbstractC28298d.m142578e();
            if (m113556s == m142578e2) {
                return m113556s;
            }
            return C24848g0.f119245a;
        } catch (Throwable th2) {
            this.f107319v = new DownstreamExceptionContext(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // wm0.AbstractC29093a, wm0.InterfaceC29097e
    /* renamed from: e */
    public InterfaceC29097e mo112582e() {
        Continuation continuation = this.f107320w;
        if (continuation instanceof InterfaceC29097e) {
            return (InterfaceC29097e) continuation;
        }
        return null;
    }

    @Override // wm0.AbstractC29096d, kotlin.coroutines.Continuation
    public InterfaceC27315f getContext() {
        InterfaceC27315f interfaceC27315f = this.f107319v;
        if (interfaceC27315f == null) {
            return C27316g.f128559p;
        }
        return interfaceC27315f;
    }

    @Override // wm0.AbstractC29093a
    /* renamed from: o */
    public Object mo239o(Object obj) {
        Object m142578e;
        Throwable m129221e = C24861r.m129221e(obj);
        if (m129221e != null) {
            this.f107319v = new DownstreamExceptionContext(m129221e, getContext());
        }
        Continuation continuation = this.f107320w;
        if (continuation != null) {
            continuation.mo112492g(obj);
        }
        m142578e = AbstractC28298d.m142578e();
        return m142578e;
    }

    @Override // wm0.AbstractC29096d, wm0.AbstractC29093a
    /* renamed from: p */
    public void mo113558p() {
        super.mo113558p();
    }
}
