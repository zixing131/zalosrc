package androidx.work;

import android.content.Context;
import androidx.work.AbstractC2252t;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;

/* loaded from: classes.dex */
public abstract class Worker extends AbstractC2252t {
    C2230c mFuture;

    /* renamed from: androidx.work.Worker$a */
    /* loaded from: classes2.dex */
    class RunnableC2131a implements Runnable {
        RunnableC2131a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.mFuture.mo11798p(Worker.this.doWork());
            } catch (Throwable th2) {
                Worker.this.mFuture.mo11799q(th2);
            }
        }
    }

    /* renamed from: androidx.work.Worker$b */
    /* loaded from: classes2.dex */
    class RunnableC2132b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ C2230c f9040p;

        RunnableC2132b(C2230c c2230c) {
            this.f9040p = c2230c;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9040p.mo11798p(Worker.this.getForegroundInfo());
            } catch (Throwable th2) {
                this.f9040p.mo11799q(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract AbstractC2252t.a doWork();

    public C2244l getForegroundInfo() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
    }

    @Override // androidx.work.AbstractC2252t
    public InterfaceFutureC6534a getForegroundInfoAsync() {
        C2230c m11809t = C2230c.m11809t();
        getBackgroundExecutor().execute(new RunnableC2132b(m11809t));
        return m11809t;
    }

    @Override // androidx.work.AbstractC2252t
    public final InterfaceFutureC6534a startWork() {
        this.mFuture = C2230c.m11809t();
        getBackgroundExecutor().execute(new RunnableC2131a());
        return this.mFuture;
    }
}
