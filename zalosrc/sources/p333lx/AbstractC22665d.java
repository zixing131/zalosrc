package p333lx;

import android.content.Context;
import fg0.ThreadFactoryC18928a;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: lx.d */
/* loaded from: classes4.dex */
public abstract class AbstractC22665d {

    /* renamed from: a */
    private static HashMap f111107a = new HashMap();

    /* renamed from: b */
    private static HashMap f111108b = new HashMap();

    /* renamed from: c */
    private static final ScheduledExecutorService f111109c = Executors.newSingleThreadScheduledExecutor(new ThreadFactoryC18928a("SystemStats"));

    /* renamed from: d */
    private static int f111110d = 20;

    /* renamed from: lx.d$a */
    /* loaded from: classes4.dex */
    private static class a implements Runnable {

        /* renamed from: p */
        private long f111111p;

        /* renamed from: q */
        private b f111112q;

        public a(long j11, b bVar) {
            this.f111111p = j11;
            this.f111112q = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f111112q.mo100541a(AbstractC22664c.m117291f(this.f111111p));
            } catch (IOException e11) {
                e11.printStackTrace();
                this.f111112q.mo100542b();
            } catch (InterruptedException e12) {
                e12.printStackTrace();
                this.f111112q.mo100542b();
                Thread.currentThread().interrupt();
            }
            AbstractC22664c.m117289d(this.f111111p);
        }
    }

    /* renamed from: lx.d$b */
    /* loaded from: classes4.dex */
    public interface b {
        /* renamed from: a */
        void mo100541a(C22662a c22662a);

        /* renamed from: b */
        void mo100542b();
    }

    /* renamed from: a */
    public static void m117292a(Context context) {
        AbstractC22664c.m117290e(context);
    }

    /* renamed from: b */
    public static void m117293b(b bVar) {
        f111109c.execute(new a(Thread.currentThread().getId(), bVar));
    }
}
