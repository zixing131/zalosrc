package p001a.p005d;

import com.adtima.Adtima;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: a.d.c */
/* loaded from: classes2.dex */
public abstract class AbstractRunnableC0008c implements Runnable {
    private static final String TAG = "Task";
    private AtomicBoolean mCanceledAtomic = new AtomicBoolean(false);
    private AtomicReference<Thread> mTaskThread = new AtomicReference<>();
    private volatile d mStatus = d.PENDING;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.d.c$a */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractRunnableC0008c.this.onCancel();
        }
    }

    /* renamed from: a.d.c$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ Object f3p;

        b(Object obj) {
            this.f3p = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractRunnableC0008c.this.isCanceled()) {
                return;
            }
            AbstractRunnableC0008c.this.onPostExecute(this.f3p);
            AbstractRunnableC0008c.this.mStatus = d.FINISHED;
        }
    }

    /* renamed from: a.d.c$c */
    /* loaded from: classes2.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractRunnableC0008c.this.isCanceled()) {
                return;
            }
            AbstractRunnableC0008c.this.onPostExecute(null);
            AbstractRunnableC0008c.this.mStatus = d.FINISHED;
        }
    }

    /* renamed from: a.d.c$d */
    /* loaded from: classes2.dex */
    public enum d {
        PENDING,
        RUNNING,
        FINISHED
    }

    public void cancel() {
        try {
            this.mCanceledAtomic.set(true);
            Thread thread = this.mTaskThread.get();
            if (thread != null) {
                Adtima.m18326d(TAG, "Task cancel: " + thread.getName());
                thread.interrupt();
            }
            C0009d.m8d(new a());
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cancel ", e11);
        }
    }

    public abstract Object doInBackground();

    public final d getStatus() {
        return this.mStatus;
    }

    public boolean isCanceled() {
        return this.mCanceledAtomic.get();
    }

    public void onCancel() {
    }

    public void onPostExecute(Object obj) {
    }

    public void onPreExecute() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            Adtima.m18326d(TAG, "Task : " + Thread.currentThread().getName());
            AbstractC0007b.m4a(this.mTaskThread, null, Thread.currentThread());
            this.mCanceledAtomic.set(false);
            C0009d.m8d(new b(doInBackground()));
        } catch (Throwable th2) {
            Adtima.m18328e(TAG, "handle background Task  error " + th2);
            C0009d.m8d(new c());
        }
    }

    public void setStatus(d dVar) {
        this.mStatus = dVar;
    }
}
