package androidx.work;

import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.futures.C2230c;
import com.google.common.util.concurrent.InterfaceFutureC6534a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p595w2.InterfaceC28696c;

/* renamed from: androidx.work.t */
/* loaded from: classes.dex */
public abstract class AbstractC2252t {
    private Context mAppContext;
    private volatile int mStopReason = -256;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.t$a */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: androidx.work.t$a$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C32643a extends a {

            /* renamed from: a */
            private final C2148h f9466a;

            public C32643a() {
                this(C2148h.f9115c);
            }

            /* renamed from: e */
            public C2148h m11893e() {
                return this.f9466a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && C32643a.class == obj.getClass()) {
                    return this.f9466a.equals(((C32643a) obj).f9466a);
                }
                return false;
            }

            public int hashCode() {
                return (C32643a.class.getName().hashCode() * 31) + this.f9466a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f9466a + '}';
            }

            public C32643a(C2148h c2148h) {
                this.f9466a = c2148h;
            }
        }

        /* renamed from: androidx.work.t$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && b.class == obj.getClass()) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.t$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a */
            private final C2148h f9467a;

            public c() {
                this(C2148h.f9115c);
            }

            /* renamed from: e */
            public C2148h m11894e() {
                return this.f9467a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && c.class == obj.getClass()) {
                    return this.f9467a.equals(((c) obj).f9467a);
                }
                return false;
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f9467a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f9467a + '}';
            }

            public c(C2148h c2148h) {
                this.f9467a = c2148h;
            }
        }

        a() {
        }

        /* renamed from: a */
        public static a m11889a() {
            return new C32643a();
        }

        /* renamed from: b */
        public static a m11890b() {
            return new b();
        }

        /* renamed from: c */
        public static a m11891c() {
            return new c();
        }

        /* renamed from: d */
        public static a m11892d(C2148h c2148h) {
            return new c(c2148h);
        }
    }

    public AbstractC2252t(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.m11451a();
    }

    public InterfaceFutureC6534a getForegroundInfoAsync() {
        C2230c m11809t = C2230c.m11809t();
        m11809t.mo11799q(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return m11809t;
    }

    public final UUID getId() {
        return this.mWorkerParams.m11453c();
    }

    public final C2148h getInputData() {
        return this.mWorkerParams.m11454d();
    }

    public final Network getNetwork() {
        return this.mWorkerParams.m11455e();
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.m11457g();
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.m11458h();
    }

    public InterfaceC28696c getTaskExecutor() {
        return this.mWorkerParams.m11459i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.m11460j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.m11461k();
    }

    public AbstractC2243k0 getWorkerFactory() {
        return this.mWorkerParams.m11462l();
    }

    public final boolean isStopped() {
        return this.mStopReason != -256;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final InterfaceFutureC6534a setForegroundAsync(C2244l c2244l) {
        return this.mWorkerParams.m11452b().mo11881a(getApplicationContext(), getId(), c2244l);
    }

    public InterfaceFutureC6534a setProgressAsync(C2148h c2148h) {
        return this.mWorkerParams.m11456f().mo11469a(getApplicationContext(), getId(), c2148h);
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract InterfaceFutureC6534a startWork();

    public final void stop(int i11) {
        this.mStopReason = i11;
        onStopped();
    }
}
