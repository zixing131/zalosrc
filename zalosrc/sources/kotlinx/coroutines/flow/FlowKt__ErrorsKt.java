package kotlinx.coroutines.flow;

import en0.InterfaceC18510q;
import fn0.AbstractC19074t;
import fn0.C19059j0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import pm0.AbstractC24845f;
import pm0.AbstractC24862s;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final /* synthetic */ class FlowKt__ErrorsKt {
    /* renamed from: a */
    public static final Flow m113358a(Flow flow, InterfaceC18510q interfaceC18510q) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(flow, interfaceC18510q);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m113359b(Flow flow, FlowCollector flowCollector, Continuation continuation) {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Object m142578e;
        int i11;
        C19059j0 c19059j0;
        Throwable th2;
        if (continuation instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) continuation;
            int i12 = flowKt__ErrorsKt$catchImpl$1.f106667u;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.f106667u = i12 - Integer.MIN_VALUE;
                Object obj = flowKt__ErrorsKt$catchImpl$1.f106666t;
                m142578e = AbstractC28298d.m142578e();
                i11 = flowKt__ErrorsKt$catchImpl$1.f106667u;
                if (i11 == 0) {
                    if (i11 == 1) {
                        c19059j0 = (C19059j0) flowKt__ErrorsKt$catchImpl$1.f106665s;
                        try {
                            AbstractC24862s.m129228b(obj);
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    C19059j0 c19059j02 = new C19059j0();
                    try {
                        FlowCollector flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(flowCollector, c19059j02);
                        flowKt__ErrorsKt$catchImpl$1.f106665s = c19059j02;
                        flowKt__ErrorsKt$catchImpl$1.f106667u = 1;
                        if (flow.mo97893a(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == m142578e) {
                            return m142578e;
                        }
                        return null;
                    } catch (Throwable th4) {
                        th = th4;
                        c19059j0 = c19059j02;
                    }
                }
                th2 = (Throwable) c19059j0.f94941p;
                if (m113361d(th, th2) && !m113360c(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
                    if (th2 == null) {
                        return th;
                    }
                    if (th instanceof CancellationException) {
                        AbstractC24845f.m129182a(th2, th);
                        throw th2;
                    }
                    AbstractC24845f.m129182a(th, th2);
                    throw th;
                }
                throw th;
            }
        }
        flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(continuation);
        Object obj2 = flowKt__ErrorsKt$catchImpl$1.f106666t;
        m142578e = AbstractC28298d.m142578e();
        i11 = flowKt__ErrorsKt$catchImpl$1.f106667u;
        if (i11 == 0) {
        }
        th2 = (Throwable) c19059j0.f94941p;
        if (m113361d(th, th2)) {
        }
        throw th;
    }

    /* renamed from: c */
    private static final boolean m113360c(Throwable th2, InterfaceC27315f interfaceC27315f) {
        Job job = (Job) interfaceC27315f.mo112624d(Job.f105897m);
        if (job != null && job.isCancelled()) {
            return m113361d(th2, job.mo112732A());
        }
        return false;
    }

    /* renamed from: d */
    private static final boolean m113361d(Throwable th2, Throwable th3) {
        if (th3 != null && AbstractC19074t.m100204b(th3, th2)) {
            return true;
        }
        return false;
    }
}
