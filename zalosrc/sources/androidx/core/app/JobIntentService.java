package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class JobIntentService extends Service {

    /* renamed from: w */
    static final Object f5840w = new Object();

    /* renamed from: x */
    static final HashMap f5841x = new HashMap();

    /* renamed from: p */
    InterfaceC1313b f5842p;

    /* renamed from: q */
    AbstractC1319h f5843q;

    /* renamed from: r */
    AsyncTaskC1312a f5844r;

    /* renamed from: s */
    boolean f5845s = false;

    /* renamed from: t */
    boolean f5846t = false;

    /* renamed from: u */
    boolean f5847u = false;

    /* renamed from: v */
    final ArrayList f5848v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$a */
    /* loaded from: classes.dex */
    public final class AsyncTaskC1312a extends AsyncTask {
        AsyncTaskC1312a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                InterfaceC1316e mo6612a = JobIntentService.this.mo6612a();
                if (mo6612a != null) {
                    JobIntentService.this.mo6615g(mo6612a.getIntent());
                    mo6612a.mo6627a();
                } else {
                    return null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r12) {
            JobIntentService.this.m6617i();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r12) {
            JobIntentService.this.m6617i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1313b {
        /* renamed from: a */
        IBinder mo6621a();

        /* renamed from: b */
        InterfaceC1316e mo6622b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$c */
    /* loaded from: classes2.dex */
    public static final class C1314c extends AbstractC1319h {

        /* renamed from: d */
        private final Context f5850d;

        /* renamed from: e */
        private final PowerManager.WakeLock f5851e;

        /* renamed from: f */
        private final PowerManager.WakeLock f5852f;

        /* renamed from: g */
        boolean f5853g;

        /* renamed from: h */
        boolean f5854h;

        C1314c(Context context, ComponentName componentName) {
            super(componentName);
            this.f5850d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f5851e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f5852f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.JobIntentService.AbstractC1319h
        /* renamed from: a */
        void mo6623a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f5865a);
            if (this.f5850d.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.f5853g) {
                            this.f5853g = true;
                            if (!this.f5854h) {
                                this.f5851e.acquire(60000L);
                            }
                        }
                    } finally {
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC1319h
        /* renamed from: c */
        public void mo6624c() {
            synchronized (this) {
                try {
                    if (this.f5854h) {
                        if (this.f5853g) {
                            this.f5851e.acquire(60000L);
                        }
                        this.f5854h = false;
                        this.f5852f.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC1319h
        /* renamed from: d */
        public void mo6625d() {
            synchronized (this) {
                try {
                    if (!this.f5854h) {
                        this.f5854h = true;
                        this.f5852f.acquire(600000L);
                        this.f5851e.release();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.AbstractC1319h
        /* renamed from: e */
        public void mo6626e() {
            synchronized (this) {
                this.f5853g = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    /* loaded from: classes2.dex */
    final class C1315d implements InterfaceC1316e {

        /* renamed from: a */
        final Intent f5855a;

        /* renamed from: b */
        final int f5856b;

        C1315d(Intent intent, int i11) {
            this.f5855a = intent;
            this.f5856b = i11;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC1316e
        /* renamed from: a */
        public void mo6627a() {
            JobIntentService.this.stopSelf(this.f5856b);
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC1316e
        public Intent getIntent() {
            return this.f5855a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC1316e {
        /* renamed from: a */
        void mo6627a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    /* loaded from: classes.dex */
    static final class JobServiceEngineC1317f extends JobServiceEngine implements InterfaceC1313b {

        /* renamed from: a */
        final JobIntentService f5858a;

        /* renamed from: b */
        final Object f5859b;

        /* renamed from: c */
        JobParameters f5860c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        /* loaded from: classes.dex */
        final class a implements InterfaceC1316e {

            /* renamed from: a */
            final JobWorkItem f5861a;

            a(JobWorkItem jobWorkItem) {
                this.f5861a = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC1316e
            /* renamed from: a */
            public void mo6627a() {
                synchronized (JobServiceEngineC1317f.this.f5859b) {
                    try {
                        JobParameters jobParameters = JobServiceEngineC1317f.this.f5860c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f5861a);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.InterfaceC1316e
            public Intent getIntent() {
                Intent intent;
                intent = this.f5861a.getIntent();
                return intent;
            }
        }

        JobServiceEngineC1317f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f5859b = new Object();
            this.f5858a = jobIntentService;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC1313b
        /* renamed from: a */
        public IBinder mo6621a() {
            IBinder binder;
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.JobIntentService.InterfaceC1313b
        /* renamed from: b */
        public InterfaceC1316e mo6622b() {
            JobWorkItem dequeueWork;
            Intent intent;
            synchronized (this.f5859b) {
                try {
                    JobParameters jobParameters = this.f5860c;
                    if (jobParameters != null) {
                        dequeueWork = jobParameters.dequeueWork();
                        if (dequeueWork != null) {
                            intent = dequeueWork.getIntent();
                            intent.setExtrasClassLoader(this.f5858a.getClassLoader());
                            return new a(dequeueWork);
                        }
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f5860c = jobParameters;
            this.f5858a.m6614e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean m6613b = this.f5858a.m6613b();
            synchronized (this.f5859b) {
                this.f5860c = null;
            }
            return m6613b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$g */
    /* loaded from: classes.dex */
    public static final class C1318g extends AbstractC1319h {

        /* renamed from: d */
        private final JobInfo f5863d;

        /* renamed from: e */
        private final JobScheduler f5864e;

        C1318g(Context context, ComponentName componentName, int i11) {
            super(componentName);
            m6628b(i11);
            this.f5863d = new JobInfo.Builder(i11, this.f5865a).setOverrideDeadline(0L).build();
            this.f5864e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.JobIntentService.AbstractC1319h
        /* renamed from: a */
        void mo6623a(Intent intent) {
            this.f5864e.enqueue(this.f5863d, AbstractC1354l.m6781a(intent));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.JobIntentService$h */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1319h {

        /* renamed from: a */
        final ComponentName f5865a;

        /* renamed from: b */
        boolean f5866b;

        /* renamed from: c */
        int f5867c;

        AbstractC1319h(ComponentName componentName) {
            this.f5865a = componentName;
        }

        /* renamed from: a */
        abstract void mo6623a(Intent intent);

        /* renamed from: b */
        void m6628b(int i11) {
            if (!this.f5866b) {
                this.f5866b = true;
                this.f5867c = i11;
            } else {
                if (this.f5867c == i11) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i11 + " is different than previous " + this.f5867c);
            }
        }

        /* renamed from: c */
        public void mo6624c() {
        }

        /* renamed from: d */
        public void mo6625d() {
        }

        /* renamed from: e */
        public void mo6626e() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5848v = null;
        } else {
            this.f5848v = new ArrayList();
        }
    }

    /* renamed from: c */
    public static void m6609c(Context context, ComponentName componentName, int i11, Intent intent) {
        if (intent != null) {
            synchronized (f5840w) {
                AbstractC1319h m6611f = m6611f(context, componentName, true, i11);
                m6611f.m6628b(i11);
                m6611f.mo6623a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: d */
    public static void m6610d(Context context, Class cls, int i11, Intent intent) {
        m6609c(context, new ComponentName(context, (Class<?>) cls), i11, intent);
    }

    /* renamed from: f */
    static AbstractC1319h m6611f(Context context, ComponentName componentName, boolean z11, int i11) {
        AbstractC1319h c1314c;
        HashMap hashMap = f5841x;
        AbstractC1319h abstractC1319h = (AbstractC1319h) hashMap.get(componentName);
        if (abstractC1319h == null) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (z11) {
                    c1314c = new C1318g(context, componentName, i11);
                } else {
                    throw new IllegalArgumentException("Can't be here without a job id");
                }
            } else {
                c1314c = new C1314c(context, componentName);
            }
            abstractC1319h = c1314c;
            hashMap.put(componentName, abstractC1319h);
        }
        return abstractC1319h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public InterfaceC1316e mo6612a() {
        InterfaceC1313b interfaceC1313b = this.f5842p;
        if (interfaceC1313b != null) {
            return interfaceC1313b.mo6622b();
        }
        synchronized (this.f5848v) {
            try {
                if (this.f5848v.size() > 0) {
                    return (InterfaceC1316e) this.f5848v.remove(0);
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: b */
    boolean m6613b() {
        AsyncTaskC1312a asyncTaskC1312a = this.f5844r;
        if (asyncTaskC1312a != null) {
            asyncTaskC1312a.cancel(this.f5845s);
        }
        this.f5846t = true;
        return m6616h();
    }

    /* renamed from: e */
    void m6614e(boolean z11) {
        if (this.f5844r == null) {
            this.f5844r = new AsyncTaskC1312a();
            AbstractC1319h abstractC1319h = this.f5843q;
            if (abstractC1319h != null && z11) {
                abstractC1319h.mo6625d();
            }
            this.f5844r.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* renamed from: g */
    protected abstract void mo6615g(Intent intent);

    /* renamed from: h */
    public boolean m6616h() {
        return true;
    }

    /* renamed from: i */
    void m6617i() {
        ArrayList arrayList = this.f5848v;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f5844r = null;
                    ArrayList arrayList2 = this.f5848v;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        m6614e(false);
                    } else if (!this.f5847u) {
                        this.f5843q.mo6624c();
                    }
                } finally {
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        InterfaceC1313b interfaceC1313b = this.f5842p;
        if (interfaceC1313b != null) {
            return interfaceC1313b.mo6621a();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f5842p = new JobServiceEngineC1317f(this);
            this.f5843q = null;
        } else {
            this.f5842p = null;
            this.f5843q = m6611f(this, new ComponentName(this, getClass()), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList arrayList = this.f5848v;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f5847u = true;
                this.f5843q.mo6624c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        if (this.f5848v != null) {
            this.f5843q.mo6626e();
            synchronized (this.f5848v) {
                ArrayList arrayList = this.f5848v;
                if (intent == null) {
                    intent = new Intent();
                }
                arrayList.add(new C1315d(intent, i12));
                m6614e(true);
            }
            return 3;
        }
        return 2;
    }
}
