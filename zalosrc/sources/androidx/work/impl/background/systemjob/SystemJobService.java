package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.AbstractC2253u;
import androidx.work.WorkerParameters;
import androidx.work.impl.C2155a0;
import androidx.work.impl.C2157b0;
import androidx.work.impl.C2217p0;
import androidx.work.impl.C2221r0;
import androidx.work.impl.C2226u;
import androidx.work.impl.InterfaceC2189f;
import androidx.work.impl.InterfaceC2215o0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p535u2.C26967n;

/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC2189f {

    /* renamed from: t */
    private static final String f9218t = AbstractC2253u.m11897i("SystemJobService");

    /* renamed from: p */
    private C2221r0 f9219p;

    /* renamed from: q */
    private final Map f9220q = new HashMap();

    /* renamed from: r */
    private final C2157b0 f9221r = new C2157b0();

    /* renamed from: s */
    private InterfaceC2215o0 f9222s;

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$a */
    /* loaded from: classes2.dex */
    static class C2167a {
        /* renamed from: a */
        static String[] m11645a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        /* renamed from: b */
        static Uri[] m11646b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$b */
    /* loaded from: classes2.dex */
    static class C2168b {
        /* renamed from: a */
        static Network m11647a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* renamed from: androidx.work.impl.background.systemjob.SystemJobService$c */
    /* loaded from: classes2.dex */
    static class C2169c {
        /* renamed from: a */
        static int m11648a(JobParameters jobParameters) {
            return SystemJobService.m11643a(jobParameters.getStopReason());
        }
    }

    /* renamed from: a */
    static int m11643a(int i11) {
        switch (i11) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i11;
            default:
                return -512;
        }
    }

    /* renamed from: b */
    private static C26967n m11644b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new C26967n(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // androidx.work.impl.InterfaceC2189f
    /* renamed from: e */
    public void mo11614e(C26967n c26967n, boolean z11) {
        JobParameters jobParameters;
        AbstractC2253u.m11895e().mo11898a(f9218t, c26967n.m138955b() + " executed on JobScheduler");
        synchronized (this.f9220q) {
            jobParameters = (JobParameters) this.f9220q.remove(c26967n);
        }
        this.f9221r.m11585b(c26967n);
        if (jobParameters != null) {
            jobFinished(jobParameters, z11);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            C2221r0 m11729r = C2221r0.m11729r(getApplicationContext());
            this.f9219p = m11729r;
            C2226u m11737t = m11729r.m11737t();
            this.f9222s = new C2217p0(m11737t, this.f9219p.m11741x());
            m11737t.m11764e(this);
        } catch (IllegalStateException e11) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC2253u.m11895e().mo11905k(f9218t, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e11);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        C2221r0 c2221r0 = this.f9219p;
        if (c2221r0 != null) {
            c2221r0.m11737t().m11768p(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.C2133a c2133a;
        if (this.f9219p == null) {
            AbstractC2253u.m11895e().mo11898a(f9218t, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C26967n m11644b = m11644b(jobParameters);
        if (m11644b == null) {
            AbstractC2253u.m11895e().mo11900c(f9218t, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f9220q) {
            try {
                if (this.f9220q.containsKey(m11644b)) {
                    AbstractC2253u.m11895e().mo11898a(f9218t, "Job is already being executed by SystemJobService: " + m11644b);
                    return false;
                }
                AbstractC2253u.m11895e().mo11898a(f9218t, "onStartJob for " + m11644b);
                this.f9220q.put(m11644b, jobParameters);
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 24) {
                    c2133a = new WorkerParameters.C2133a();
                    if (C2167a.m11646b(jobParameters) != null) {
                        c2133a.f9054b = Arrays.asList(C2167a.m11646b(jobParameters));
                    }
                    if (C2167a.m11645a(jobParameters) != null) {
                        c2133a.f9053a = Arrays.asList(C2167a.m11645a(jobParameters));
                    }
                    if (i11 >= 28) {
                        c2133a.f9055c = C2168b.m11647a(jobParameters);
                    }
                } else {
                    c2133a = null;
                }
                this.f9222s.mo11720a(this.f9221r.m11587d(m11644b), c2133a);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        int i11;
        if (this.f9219p == null) {
            AbstractC2253u.m11895e().mo11898a(f9218t, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C26967n m11644b = m11644b(jobParameters);
        if (m11644b == null) {
            AbstractC2253u.m11895e().mo11900c(f9218t, "WorkSpec id not found!");
            return false;
        }
        AbstractC2253u.m11895e().mo11898a(f9218t, "onStopJob for " + m11644b);
        synchronized (this.f9220q) {
            this.f9220q.remove(m11644b);
        }
        C2155a0 m11585b = this.f9221r.m11585b(m11644b);
        if (m11585b != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                i11 = C2169c.m11648a(jobParameters);
            } else {
                i11 = -512;
            }
            this.f9222s.mo11721b(m11585b, i11);
        }
        return !this.f9219p.m11737t().m11766j(m11644b.m138955b());
    }
}
