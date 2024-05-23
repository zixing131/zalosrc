package kotlinx.coroutines.flow;

import en0.InterfaceC18511r;
import fn0.AbstractC19072r;
import kotlin.coroutines.Continuation;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28298d;
import wm0.AbstractC29094b;
import wm0.AbstractC29096d;
import wm0.InterfaceC29098f;

/* loaded from: classes7.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements Flow<Object> {

    /* renamed from: p */
    final /* synthetic */ Flow f106655p;

    /* renamed from: q */
    final /* synthetic */ InterfaceC18511r f106656q;

    @InterfaceC29098f(m145344c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", m145345f = "Errors.kt", m145346l = {117, 119}, m145347m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 */
    /* loaded from: classes7.dex */
    public static final class C218191 extends AbstractC29096d {

        /* renamed from: s */
        /* synthetic */ Object f106657s;

        /* renamed from: t */
        int f106658t;

        /* renamed from: v */
        Object f106660v;

        /* renamed from: w */
        Object f106661w;

        /* renamed from: x */
        Object f106662x;

        /* renamed from: y */
        long f106663y;

        /* renamed from: z */
        int f106664z;

        public C218191(Continuation continuation) {
            super(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            this.f106657s = obj;
            this.f106658t |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.mo97893a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0096 -> B:11:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a8 -> B:14:0x00a9). Please report as a decompilation issue!!! */
    @Override // kotlinx.coroutines.flow.Flow
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo97893a(FlowCollector flowCollector, Continuation continuation) {
        C218191 c218191;
        Object m142578e;
        int i11;
        long j11;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
        int i12;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
        FlowCollector flowCollector2;
        Throwable th2;
        Object m113289g;
        if (continuation instanceof C218191) {
            c218191 = (C218191) continuation;
            int i13 = c218191.f106658t;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c218191.f106658t = i13 - Integer.MIN_VALUE;
                Object obj = c218191.f106657s;
                m142578e = AbstractC28298d.m142578e();
                i11 = c218191.f106658t;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            j11 = c218191.f106663y;
                            Throwable th3 = (Throwable) c218191.f106662x;
                            flowCollector2 = (FlowCollector) c218191.f106661w;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) c218191.f106660v;
                            AbstractC24862s.m129228b(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                j11++;
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                                i12 = 1;
                                if (i12 != 0) {
                                    return C24848g0.f119245a;
                                }
                                flowCollector = flowCollector2;
                                Flow flow = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.f106655p;
                                c218191.f106660v = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                                c218191.f106661w = flowCollector;
                                c218191.f106662x = null;
                                c218191.f106663y = j11;
                                c218191.f106664z = 0;
                                c218191.f106658t = 1;
                                m113289g = FlowKt.m113289g(flow, flowCollector, c218191);
                                if (m113289g != m142578e) {
                                    return m142578e;
                                }
                                flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                                obj = m113289g;
                                flowCollector2 = flowCollector;
                                i12 = 0;
                                th2 = (Throwable) obj;
                                if (th2 == null) {
                                    InterfaceC18511r interfaceC18511r = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.f106656q;
                                    Long m145342d = AbstractC29094b.m145342d(j11);
                                    c218191.f106660v = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                                    c218191.f106661w = flowCollector2;
                                    c218191.f106662x = th2;
                                    c218191.f106663y = j11;
                                    c218191.f106658t = 2;
                                    AbstractC19072r.m100202c(6);
                                    Object mo49340Uc = interfaceC18511r.mo49340Uc(flowCollector2, th2, m145342d, c218191);
                                    AbstractC19072r.m100202c(7);
                                    if (mo49340Uc == m142578e) {
                                        return m142578e;
                                    }
                                    obj = mo49340Uc;
                                    th3 = th2;
                                    if (!((Boolean) obj).booleanValue()) {
                                        throw th3;
                                    }
                                } else {
                                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                                    if (i12 != 0) {
                                    }
                                }
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        i12 = c218191.f106664z;
                        j11 = c218191.f106663y;
                        flowCollector2 = (FlowCollector) c218191.f106661w;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) c218191.f106660v;
                        AbstractC24862s.m129228b(obj);
                        th2 = (Throwable) obj;
                        if (th2 == null) {
                        }
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    j11 = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = this;
                    Flow flow2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.f106655p;
                    c218191.f106660v = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                    c218191.f106661w = flowCollector;
                    c218191.f106662x = null;
                    c218191.f106663y = j11;
                    c218191.f106664z = 0;
                    c218191.f106658t = 1;
                    m113289g = FlowKt.m113289g(flow2, flowCollector, c218191);
                    if (m113289g != m142578e) {
                    }
                }
            }
        }
        c218191 = new C218191(continuation);
        Object obj2 = c218191.f106657s;
        m142578e = AbstractC28298d.m142578e();
        i11 = c218191.f106658t;
        if (i11 == 0) {
        }
    }
}
