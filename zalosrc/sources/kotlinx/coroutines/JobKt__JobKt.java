package kotlinx.coroutines;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import nn0.InterfaceC23898g;
import pm0.C24848g0;
import um0.InterfaceC27315f;
import vm0.AbstractC28298d;

/* loaded from: classes7.dex */
public final /* synthetic */ class JobKt__JobKt {
    /* renamed from: a */
    public static final CompletableJob m112762a(Job job) {
        return new JobImpl(job);
    }

    /* renamed from: b */
    public static /* synthetic */ CompletableJob m112763b(Job job, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            job = null;
        }
        return JobKt.m112748a(job);
    }

    /* renamed from: c */
    public static final void m112764c(InterfaceC27315f interfaceC27315f, CancellationException cancellationException) {
        Job job = (Job) interfaceC27315f.mo112624d(Job.f105897m);
        if (job != null) {
            job.mo112734a(cancellationException);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m112765d(InterfaceC27315f interfaceC27315f, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.m112750c(interfaceC27315f, cancellationException);
    }

    /* renamed from: e */
    public static final Object m112766e(Job job, Continuation continuation) {
        Object m142578e;
        Job.DefaultImpls.m112740a(job, null, 1, null);
        Object mo112736c0 = job.mo112736c0(continuation);
        m142578e = AbstractC28298d.m142578e();
        if (mo112736c0 == m142578e) {
            return mo112736c0;
        }
        return C24848g0.f119245a;
    }

    /* renamed from: f */
    public static final void m112767f(InterfaceC27315f interfaceC27315f, CancellationException cancellationException) {
        InterfaceC23898g mo112735b;
        Job job = (Job) interfaceC27315f.mo112624d(Job.f105897m);
        if (job != null && (mo112735b = job.mo112735b()) != null) {
            Iterator it = mo112735b.iterator();
            while (it.hasNext()) {
                ((Job) it.next()).mo112734a(cancellationException);
            }
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m112768g(InterfaceC27315f interfaceC27315f, CancellationException cancellationException, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cancellationException = null;
        }
        JobKt.m112753f(interfaceC27315f, cancellationException);
    }

    /* renamed from: h */
    public static final DisposableHandle m112769h(Job job, DisposableHandle disposableHandle) {
        return job.mo112733M(new DisposeOnCompletion(disposableHandle));
    }

    /* renamed from: i */
    public static final void m112770i(Job job) {
        if (job.mo112496c()) {
        } else {
            throw job.mo112732A();
        }
    }

    /* renamed from: j */
    public static final void m112771j(InterfaceC27315f interfaceC27315f) {
        Job job = (Job) interfaceC27315f.mo112624d(Job.f105897m);
        if (job != null) {
            JobKt.m112757j(job);
        }
    }

    /* renamed from: k */
    public static final Job m112772k(InterfaceC27315f interfaceC27315f) {
        Job job = (Job) interfaceC27315f.mo112624d(Job.f105897m);
        if (job != null) {
            return job;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + interfaceC27315f).toString());
    }

    /* renamed from: l */
    public static final boolean m112773l(InterfaceC27315f interfaceC27315f) {
        Job job = (Job) interfaceC27315f.mo112624d(Job.f105897m);
        if (job != null) {
            return job.mo112496c();
        }
        return true;
    }
}
