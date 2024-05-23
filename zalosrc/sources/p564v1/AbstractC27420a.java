package p564v1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.os.OperationCanceledException;
import androidx.core.util.AbstractC1489k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: v1.a */
/* loaded from: classes2.dex */
public abstract class AbstractC27420a extends AbstractC27421b {

    /* renamed from: i */
    private final Executor f129069i;

    /* renamed from: j */
    volatile a f129070j;

    /* renamed from: k */
    volatile a f129071k;

    /* renamed from: l */
    long f129072l;

    /* renamed from: m */
    long f129073m;

    /* renamed from: n */
    Handler f129074n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v1.a$a */
    /* loaded from: classes2.dex */
    public final class a extends AbstractC27422c implements Runnable {

        /* renamed from: A */
        boolean f129075A;

        /* renamed from: z */
        private final CountDownLatch f129077z = new CountDownLatch(1);

        a() {
        }

        @Override // p564v1.AbstractC27422c
        /* renamed from: g */
        protected void mo140433g(Object obj) {
            try {
                AbstractC27420a.this.m140429x(this, obj);
            } finally {
                this.f129077z.countDown();
            }
        }

        @Override // p564v1.AbstractC27422c
        /* renamed from: h */
        protected void mo140434h(Object obj) {
            try {
                AbstractC27420a.this.m140430y(this, obj);
            } finally {
                this.f129077z.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p564v1.AbstractC27422c
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public Object mo140432b(Void... voidArr) {
            try {
                return AbstractC27420a.this.m140424C();
            } catch (OperationCanceledException e11) {
                if (m140458f()) {
                    return null;
                }
                throw e11;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f129075A = false;
            AbstractC27420a.this.m140431z();
        }
    }

    public AbstractC27420a(Context context) {
        this(context, AbstractC27422c.f129088w);
    }

    /* renamed from: A */
    public abstract Object mo139156A();

    /* renamed from: B */
    public void m140423B(Object obj) {
    }

    /* renamed from: C */
    protected Object m140424C() {
        return mo139156A();
    }

    @Override // p564v1.AbstractC27421b
    /* renamed from: g */
    public void mo140425g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo140425g(str, fileDescriptor, printWriter, strArr);
        if (this.f129070j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f129070j);
            printWriter.print(" waiting=");
            printWriter.println(this.f129070j.f129075A);
        }
        if (this.f129071k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f129071k);
            printWriter.print(" waiting=");
            printWriter.println(this.f129071k.f129075A);
        }
        if (this.f129072l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            AbstractC1489k.m7499c(this.f129072l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            AbstractC1489k.m7498b(this.f129073m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // p564v1.AbstractC27421b
    /* renamed from: k */
    protected boolean mo140426k() {
        if (this.f129070j == null) {
            return false;
        }
        if (!this.f129081d) {
            this.f129084g = true;
        }
        if (this.f129071k != null) {
            if (this.f129070j.f129075A) {
                this.f129070j.f129075A = false;
                this.f129074n.removeCallbacks(this.f129070j);
            }
            this.f129070j = null;
            return false;
        }
        if (this.f129070j.f129075A) {
            this.f129070j.f129075A = false;
            this.f129074n.removeCallbacks(this.f129070j);
            this.f129070j = null;
            return false;
        }
        boolean m140455a = this.f129070j.m140455a(false);
        if (m140455a) {
            this.f129071k = this.f129070j;
            m140428w();
        }
        this.f129070j = null;
        return m140455a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p564v1.AbstractC27421b
    /* renamed from: m */
    public void mo140427m() {
        super.mo140427m();
        m140437b();
        this.f129070j = new a();
        m140431z();
    }

    /* renamed from: w */
    public void m140428w() {
    }

    /* renamed from: x */
    void m140429x(a aVar, Object obj) {
        m140423B(obj);
        if (this.f129071k == aVar) {
            m140450s();
            this.f129073m = SystemClock.uptimeMillis();
            this.f129071k = null;
            m140440e();
            m140431z();
        }
    }

    /* renamed from: y */
    void m140430y(a aVar, Object obj) {
        if (this.f129070j != aVar) {
            m140429x(aVar, obj);
            return;
        }
        if (m140443i()) {
            m140423B(obj);
            return;
        }
        m140438c();
        this.f129073m = SystemClock.uptimeMillis();
        this.f129070j = null;
        m140441f(obj);
    }

    /* renamed from: z */
    void m140431z() {
        if (this.f129071k == null && this.f129070j != null) {
            if (this.f129070j.f129075A) {
                this.f129070j.f129075A = false;
                this.f129074n.removeCallbacks(this.f129070j);
            }
            if (this.f129072l > 0 && SystemClock.uptimeMillis() < this.f129073m + this.f129072l) {
                this.f129070j.f129075A = true;
                this.f129074n.postAtTime(this.f129070j, this.f129073m + this.f129072l);
            } else {
                this.f129070j.m140456c(this.f129069i, null);
            }
        }
    }

    private AbstractC27420a(Context context, Executor executor) {
        super(context);
        this.f129073m = -10000L;
        this.f129069i = executor;
    }
}
