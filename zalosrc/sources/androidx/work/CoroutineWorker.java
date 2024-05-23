package androidx.work;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import en0.InterfaceC18509p;
import fn0.AbstractC19074t;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import pm0.AbstractC24862s;
import pm0.C24848g0;
import vm0.AbstractC28297c;
import vm0.AbstractC28298d;
import wm0.AbstractC29100h;
import wm0.AbstractC29104l;

/* loaded from: classes2.dex */
public abstract class CoroutineWorker extends AbstractC2252t {

    /* renamed from: p */
    private final CompletableJob f9029p;

    /* renamed from: q */
    private final C2230c f9030q;

    /* renamed from: r */
    private final CoroutineDispatcher f9031r;

    /* renamed from: androidx.work.CoroutineWorker$a */
    /* loaded from: classes2.dex */
    static final class C2129a extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        Object f9032t;

        /* renamed from: u */
        int f9033u;

        /* renamed from: v */
        final /* synthetic */ C2249q f9034v;

        /* renamed from: w */
        final /* synthetic */ CoroutineWorker f9035w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2129a(C2249q c2249q, CoroutineWorker coroutineWorker, Continuation continuation) {
            super(2, continuation);
            this.f9034v = c2249q;
            this.f9035w = coroutineWorker;
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C2129a(this.f9034v, this.f9035w, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            C2249q c2249q;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f9033u;
            if (i11 != 0) {
                if (i11 == 1) {
                    c2249q = (C2249q) this.f9032t;
                    AbstractC24862s.m129228b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                AbstractC24862s.m129228b(obj);
                C2249q c2249q2 = this.f9034v;
                CoroutineWorker coroutineWorker = this.f9035w;
                this.f9032t = c2249q2;
                this.f9033u = 1;
                Object m11445f = coroutineWorker.m11445f(this);
                if (m11445f == m142578e) {
                    return m142578e;
                }
                c2249q = c2249q2;
                obj = m11445f;
            }
            c2249q.m11886c(obj);
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C2129a) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* renamed from: androidx.work.CoroutineWorker$b */
    /* loaded from: classes2.dex */
    static final class C2130b extends AbstractC29104l implements InterfaceC18509p {

        /* renamed from: t */
        int f9036t;

        C2130b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: a */
        public final Continuation mo238a(Object obj, Continuation continuation) {
            return new C2130b(continuation);
        }

        @Override // wm0.AbstractC29093a
        /* renamed from: o */
        public final Object mo239o(Object obj) {
            Object m142578e;
            m142578e = AbstractC28298d.m142578e();
            int i11 = this.f9036t;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC24862s.m129228b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC24862s.m129228b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f9036t = 1;
                    obj = coroutineWorker.mo11443d(this);
                    if (obj == m142578e) {
                        return m142578e;
                    }
                }
                CoroutineWorker.this.m11446h().mo11798p((AbstractC2252t.a) obj);
            } catch (Throwable th2) {
                CoroutineWorker.this.m11446h().mo11799q(th2);
            }
            return C24848g0.f119245a;
        }

        @Override // en0.InterfaceC18509p
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object mo240pC(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C2130b) mo238a(coroutineScope, continuation)).mo239o(C24848g0.f119245a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        CompletableJob m112763b;
        AbstractC19074t.m100208f(context, "appContext");
        AbstractC19074t.m100208f(workerParameters, "params");
        m112763b = JobKt__JobKt.m112763b(null, 1, null);
        this.f9029p = m112763b;
        C2230c m11809t = C2230c.m11809t();
        AbstractC19074t.m100207e(m11809t, "create()");
        this.f9030q = m11809t;
        m11809t.mo5907b(new Runnable() { // from class: androidx.work.g
            @Override // java.lang.Runnable
            public final void run() {
                CoroutineWorker.m11441c(CoroutineWorker.this);
            }
        }, getTaskExecutor().mo143751c());
        this.f9031r = Dispatchers.m112679a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m11441c(CoroutineWorker coroutineWorker) {
        AbstractC19074t.m100208f(coroutineWorker, "this$0");
        if (coroutineWorker.f9030q.isCancelled()) {
            Job.DefaultImpls.m112740a(coroutineWorker.f9029p, null, 1, null);
        }
    }

    /* renamed from: g */
    static /* synthetic */ Object m11442g(CoroutineWorker coroutineWorker, Continuation continuation) {
        throw new IllegalStateException("Not implemented");
    }

    /* renamed from: d */
    public abstract Object mo11443d(Continuation continuation);

    /* renamed from: e */
    public CoroutineDispatcher m11444e() {
        return this.f9031r;
    }

    /* renamed from: f */
    public Object m11445f(Continuation continuation) {
        return m11442g(this, continuation);
    }

    @Override // androidx.work.AbstractC2252t
    public final InterfaceFutureC6534a getForegroundInfoAsync() {
        CompletableJob m112763b;
        m112763b = JobKt__JobKt.m112763b(null, 1, null);
        CoroutineScope m112637a = CoroutineScopeKt.m112637a(m11444e().mo112823d0(m112763b));
        C2249q c2249q = new C2249q(m112763b, null, 2, null);
        BuildersKt__Builders_commonKt.m112540d(m112637a, null, null, new C2129a(c2249q, this, null), 3, null);
        return c2249q;
    }

    /* renamed from: h */
    public final C2230c m11446h() {
        return this.f9030q;
    }

    /* renamed from: i */
    public final Object m11447i(C2244l c2244l, Continuation continuation) {
        Continuation m142576c;
        Object m142578e;
        Object m142578e2;
        InterfaceFutureC6534a foregroundAsync = setForegroundAsync(c2244l);
        AbstractC19074t.m100207e(foregroundAsync, "setForegroundAsync(foregroundInfo)");
        if (!foregroundAsync.isDone()) {
            m142576c = AbstractC28297c.m142576c(continuation);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(m142576c, 1);
            cancellableContinuationImpl.m112574F();
            foregroundAsync.mo5907b(new RunnableC2250r(cancellableContinuationImpl, foregroundAsync), EnumC2150i.INSTANCE);
            cancellableContinuationImpl.mo112543I(new C2251s(foregroundAsync));
            Object m112571A = cancellableContinuationImpl.m112571A();
            m142578e = AbstractC28298d.m142578e();
            if (m112571A == m142578e) {
                AbstractC29100h.m145355c(continuation);
            }
            m142578e2 = AbstractC28298d.m142578e();
            if (m112571A == m142578e2) {
                return m112571A;
            }
        } else {
            try {
                foregroundAsync.get();
            } catch (ExecutionException e11) {
                Throwable cause = e11.getCause();
                if (cause == null) {
                    throw e11;
                }
                throw cause;
            }
        }
        return C24848g0.f119245a;
    }

    @Override // androidx.work.AbstractC2252t
    public final void onStopped() {
        super.onStopped();
        this.f9030q.cancel(false);
    }

    @Override // androidx.work.AbstractC2252t
    public final InterfaceFutureC6534a startWork() {
        BuildersKt__Builders_commonKt.m112540d(CoroutineScopeKt.m112637a(m11444e().mo112823d0(this.f9029p)), null, null, new C2130b(null), 3, null);
        return this.f9030q;
    }
}
