package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.work.AbstractC2252t;
import androidx.work.AbstractC2253u;
import androidx.work.WorkerParameters;
import androidx.work.impl.C2221r0;
import androidx.work.impl.utils.futures.C2230c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import fn0.AbstractC19074t;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import p470r2.AbstractC25616b;
import p470r2.AbstractC25620f;
import p470r2.C25619e;
import p470r2.InterfaceC25618d;
import p515t2.C26463n;
import p535u2.C26976w;
import p535u2.InterfaceC26977x;
import p565v2.ExecutorC27472z;
import p630x2.AbstractC29297d;
import pm0.C24848g0;

/* loaded from: classes2.dex */
public final class ConstraintTrackingWorker extends AbstractC2252t implements InterfaceC25618d {

    /* renamed from: p */
    private final WorkerParameters f9388p;

    /* renamed from: q */
    private final Object f9389q;

    /* renamed from: r */
    private volatile boolean f9390r;

    /* renamed from: s */
    private final C2230c f9391s;

    /* renamed from: t */
    private AbstractC2252t f9392t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "workerParameters");
        this.f9388p = workerParameters;
        this.f9389q = new Object();
        this.f9391s = C2230c.m11809t();
    }

    /* renamed from: e */
    private final void m11822e() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.f9391s.isCancelled()) {
            return;
        }
        String m11532j = getInputData().m11532j("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        AbstractC19074t.m100207e(m11895e, "get()");
        if (m11532j == null || m11532j.length() == 0) {
            str = AbstractC29297d.f135736a;
            m11895e.mo11900c(str, "No worker to delegate to.");
            C2230c c2230c = this.f9391s;
            AbstractC19074t.m100207e(c2230c, "future");
            AbstractC29297d.m146390d(c2230c);
            return;
        }
        AbstractC2252t m11877b = getWorkerFactory().m11877b(getApplicationContext(), m11532j, this.f9388p);
        this.f9392t = m11877b;
        if (m11877b == null) {
            str6 = AbstractC29297d.f135736a;
            m11895e.mo11898a(str6, "No worker to delegate to.");
            C2230c c2230c2 = this.f9391s;
            AbstractC19074t.m100207e(c2230c2, "future");
            AbstractC29297d.m146390d(c2230c2);
            return;
        }
        C2221r0 m11729r = C2221r0.m11729r(getApplicationContext());
        AbstractC19074t.m100207e(m11729r, "getInstance(applicationContext)");
        InterfaceC26977x mo11565L = m11729r.m11740w().mo11565L();
        String uuid = getId().toString();
        AbstractC19074t.m100207e(uuid, "id.toString()");
        C26976w mo139008j = mo11565L.mo139008j(uuid);
        if (mo139008j == null) {
            C2230c c2230c3 = this.f9391s;
            AbstractC19074t.m100207e(c2230c3, "future");
            AbstractC29297d.m146390d(c2230c3);
            return;
        }
        C26463n m11739v = m11729r.m11739v();
        AbstractC19074t.m100207e(m11739v, "workManagerImpl.trackers");
        C25619e c25619e = new C25619e(m11739v);
        CoroutineDispatcher mo143750b = m11729r.m11741x().mo143750b();
        AbstractC19074t.m100207e(mo143750b, "workManagerImpl.workTask…r.taskCoroutineDispatcher");
        final Job m132310b = AbstractC25620f.m132310b(c25619e, mo139008j, mo143750b, this);
        this.f9391s.mo5907b(new Runnable() { // from class: x2.b
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.m11823f(Job.this);
            }
        }, new ExecutorC27472z());
        if (c25619e.m132304a(mo139008j)) {
            str3 = AbstractC29297d.f135736a;
            m11895e.mo11898a(str3, "Constraints met for delegate " + m11532j);
            try {
                AbstractC2252t abstractC2252t = this.f9392t;
                AbstractC19074t.m100205c(abstractC2252t);
                final InterfaceFutureC6534a startWork = abstractC2252t.startWork();
                AbstractC19074t.m100207e(startWork, "delegate!!.startWork()");
                startWork.mo5907b(new Runnable() { // from class: x2.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.m11824g(ConstraintTrackingWorker.this, startWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th2) {
                str4 = AbstractC29297d.f135736a;
                m11895e.mo11899b(str4, "Delegated worker " + m11532j + " threw exception in startWork.", th2);
                synchronized (this.f9389q) {
                    try {
                        if (this.f9390r) {
                            str5 = AbstractC29297d.f135736a;
                            m11895e.mo11898a(str5, "Constraints were unmet, Retrying.");
                            C2230c c2230c4 = this.f9391s;
                            AbstractC19074t.m100207e(c2230c4, "future");
                            AbstractC29297d.m146391e(c2230c4);
                            return;
                        }
                        C2230c c2230c5 = this.f9391s;
                        AbstractC19074t.m100207e(c2230c5, "future");
                        AbstractC29297d.m146390d(c2230c5);
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        str2 = AbstractC29297d.f135736a;
        m11895e.mo11898a(str2, "Constraints not met for delegate " + m11532j + ". Requesting retry.");
        C2230c c2230c6 = this.f9391s;
        AbstractC19074t.m100207e(c2230c6, "future");
        AbstractC29297d.m146391e(c2230c6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m11823f(Job job) {
        AbstractC19074t.m100208f(job, "$job");
        job.mo112734a(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m11824g(ConstraintTrackingWorker constraintTrackingWorker, InterfaceFutureC6534a interfaceFutureC6534a) {
        AbstractC19074t.m100208f(constraintTrackingWorker, "this$0");
        AbstractC19074t.m100208f(interfaceFutureC6534a, "$innerFuture");
        synchronized (constraintTrackingWorker.f9389q) {
            try {
                if (constraintTrackingWorker.f9390r) {
                    C2230c c2230c = constraintTrackingWorker.f9391s;
                    AbstractC19074t.m100207e(c2230c, "future");
                    AbstractC29297d.m146391e(c2230c);
                } else {
                    constraintTrackingWorker.f9391s.mo11800r(interfaceFutureC6534a);
                }
                C24848g0 c24848g0 = C24848g0.f119245a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m11825h(ConstraintTrackingWorker constraintTrackingWorker) {
        AbstractC19074t.m100208f(constraintTrackingWorker, "this$0");
        constraintTrackingWorker.m11822e();
    }

    @Override // p470r2.InterfaceC25618d
    /* renamed from: b */
    public void mo11624b(C26976w c26976w, AbstractC25616b abstractC25616b) {
        String str;
        AbstractC19074t.m100208f(c26976w, "workSpec");
        AbstractC19074t.m100208f(abstractC25616b, "state");
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        str = AbstractC29297d.f135736a;
        m11895e.mo11898a(str, "Constraints changed for " + c26976w);
        if (abstractC25616b instanceof AbstractC25616b.b) {
            synchronized (this.f9389q) {
                this.f9390r = true;
                C24848g0 c24848g0 = C24848g0.f119245a;
            }
        }
    }

    @Override // androidx.work.AbstractC2252t
    public void onStopped() {
        int i11;
        super.onStopped();
        AbstractC2252t abstractC2252t = this.f9392t;
        if (abstractC2252t != null && !abstractC2252t.isStopped()) {
            if (Build.VERSION.SDK_INT >= 31) {
                i11 = getStopReason();
            } else {
                i11 = 0;
            }
            abstractC2252t.stop(i11);
        }
    }

    @Override // androidx.work.AbstractC2252t
    public InterfaceFutureC6534a startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: x2.a
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.m11825h(ConstraintTrackingWorker.this);
            }
        });
        C2230c c2230c = this.f9391s;
        AbstractC19074t.m100207e(c2230c, "future");
        return c2230c;
    }
}
