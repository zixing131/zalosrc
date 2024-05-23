package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.core.util.InterfaceC1479a;
import androidx.work.AbstractC2253u;
import androidx.work.C2138c;
import androidx.work.C2149h0;
import androidx.work.EnumC2258z;
import androidx.work.impl.InterfaceC2233w;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p535u2.AbstractC26966m;
import p535u2.AbstractC26979z;
import p535u2.C26962i;
import p535u2.C26967n;
import p535u2.C26976w;
import p535u2.InterfaceC26977x;
import p565v2.C27457k;

/* renamed from: androidx.work.impl.background.systemjob.m */
/* loaded from: classes.dex */
public class C2182m implements InterfaceC2233w {

    /* renamed from: u */
    private static final String f9227u = AbstractC2253u.m11897i("SystemJobScheduler");

    /* renamed from: p */
    private final Context f9228p;

    /* renamed from: q */
    private final JobScheduler f9229q;

    /* renamed from: r */
    private final C2181l f9230r;

    /* renamed from: s */
    private final WorkDatabase f9231s;

    /* renamed from: t */
    private final C2138c f9232t;

    public C2182m(Context context, WorkDatabase workDatabase, C2138c c2138c) {
        this(context, workDatabase, c2138c, (JobScheduler) context.getSystemService("jobscheduler"), new C2181l(context, c2138c.m11470a()));
    }

    /* renamed from: b */
    public static void m11664b(Context context) {
        List m11667g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (m11667g = m11667g(context, jobScheduler)) != null && !m11667g.isEmpty()) {
            Iterator it = m11667g.iterator();
            while (it.hasNext()) {
                m11665e(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
    }

    /* renamed from: e */
    private static void m11665e(JobScheduler jobScheduler, int i11) {
        try {
            jobScheduler.cancel(i11);
        } catch (Throwable th2) {
            AbstractC2253u.m11895e().mo11901d(f9227u, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i11)), th2);
        }
    }

    /* renamed from: f */
    private static List m11666f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> m11667g = m11667g(context, jobScheduler);
        if (m11667g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : m11667g) {
            C26967n m11668h = m11668h(jobInfo);
            if (m11668h != null && str.equals(m11668h.m138955b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static List m11667g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th2) {
            AbstractC2253u.m11895e().mo11901d(f9227u, "getAllPendingJobs() is not reliable on this device.", th2);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    private static C26967n m11668h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new C26967n(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: i */
    public static boolean m11669i(Context context, WorkDatabase workDatabase) {
        int i11;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> m11667g = m11667g(context, jobScheduler);
        List mo138945d = workDatabase.mo11562I().mo138945d();
        boolean z11 = false;
        if (m11667g != null) {
            i11 = m11667g.size();
        } else {
            i11 = 0;
        }
        HashSet hashSet = new HashSet(i11);
        if (m11667g != null && !m11667g.isEmpty()) {
            for (JobInfo jobInfo : m11667g) {
                C26967n m11668h = m11668h(jobInfo);
                if (m11668h != null) {
                    hashSet.add(m11668h.m138955b());
                } else {
                    m11665e(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator it = mo138945d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                AbstractC2253u.m11895e().mo11898a(f9227u, "Reconciling jobs");
                z11 = true;
                break;
            }
        }
        if (z11) {
            workDatabase.m342e();
            try {
                InterfaceC26977x mo11565L = workDatabase.mo11565L();
                Iterator it2 = mo138945d.iterator();
                while (it2.hasNext()) {
                    mo11565L.mo139015q((String) it2.next(), -1L);
                }
                workDatabase.m339E();
                workDatabase.m347j();
            } catch (Throwable th2) {
                workDatabase.m347j();
                throw th2;
            }
        }
        return z11;
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: a */
    public void mo11640a(String str) {
        List m11666f = m11666f(this.f9228p, this.f9229q, str);
        if (m11666f != null && !m11666f.isEmpty()) {
            Iterator it = m11666f.iterator();
            while (it.hasNext()) {
                m11665e(this.f9229q, ((Integer) it.next()).intValue());
            }
            this.f9231s.mo11562I().mo138948g(str);
        }
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: c */
    public boolean mo11641c() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC2233w
    /* renamed from: d */
    public void mo11642d(C26976w... c26976wArr) {
        int m140499e;
        List m11666f;
        int m140499e2;
        C27457k c27457k = new C27457k(this.f9231s);
        for (C26976w c26976w : c26976wArr) {
            this.f9231s.m342e();
            try {
                C26976w mo139008j = this.f9231s.mo11565L().mo139008j(c26976w.f127497a);
                if (mo139008j == null) {
                    AbstractC2253u.m11895e().mo11905k(f9227u, "Skipping scheduling " + c26976w.f127497a + " because it's no longer in the DB");
                    this.f9231s.m339E();
                } else if (mo139008j.f127498b != C2149h0.c.ENQUEUED) {
                    AbstractC2253u.m11895e().mo11905k(f9227u, "Skipping scheduling " + c26976w.f127497a + " because it is no longer enqueued");
                    this.f9231s.m339E();
                } else {
                    C26967n m139035a = AbstractC26979z.m139035a(c26976w);
                    C26962i mo138942a = this.f9231s.mo11562I().mo138942a(m139035a);
                    if (mo138942a != null) {
                        m140499e = mo138942a.f127470c;
                    } else {
                        m140499e = c27457k.m140499e(this.f9232t.m11478i(), this.f9232t.m11476g());
                    }
                    if (mo138942a == null) {
                        this.f9231s.mo11562I().mo138946e(AbstractC26966m.m138953a(m139035a, m140499e));
                    }
                    m11670j(c26976w, m140499e);
                    if (Build.VERSION.SDK_INT == 23 && (m11666f = m11666f(this.f9228p, this.f9229q, c26976w.f127497a)) != null) {
                        int indexOf = m11666f.indexOf(Integer.valueOf(m140499e));
                        if (indexOf >= 0) {
                            m11666f.remove(indexOf);
                        }
                        if (!m11666f.isEmpty()) {
                            m140499e2 = ((Integer) m11666f.get(0)).intValue();
                        } else {
                            m140499e2 = c27457k.m140499e(this.f9232t.m11478i(), this.f9232t.m11476g());
                        }
                        m11670j(c26976w, m140499e2);
                    }
                    this.f9231s.m339E();
                }
            } finally {
                this.f9231s.m347j();
            }
        }
    }

    /* renamed from: j */
    public void m11670j(C26976w c26976w, int i11) {
        int i12;
        JobInfo m11663a = this.f9230r.m11663a(c26976w, i11);
        AbstractC2253u m11895e = AbstractC2253u.m11895e();
        String str = f9227u;
        m11895e.mo11898a(str, "Scheduling work ID " + c26976w.f127497a + "Job ID " + i11);
        try {
            if (this.f9229q.schedule(m11663a) == 0) {
                AbstractC2253u.m11895e().mo11905k(str, "Unable to schedule work ID " + c26976w.f127497a);
                if (c26976w.f127513q && c26976w.f127514r == EnumC2258z.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    c26976w.f127513q = false;
                    AbstractC2253u.m11895e().mo11898a(str, String.format("Scheduling a non-expedited job (work ID %s)", c26976w.f127497a));
                    m11670j(c26976w, i11);
                }
            }
        } catch (IllegalStateException e11) {
            List m11667g = m11667g(this.f9228p, this.f9229q);
            if (m11667g != null) {
                i12 = m11667g.size();
            } else {
                i12 = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i12), Integer.valueOf(this.f9231s.mo11565L().mo139005g().size()), Integer.valueOf(this.f9232t.m11477h()));
            AbstractC2253u.m11895e().mo11900c(f9227u, format);
            IllegalStateException illegalStateException = new IllegalStateException(format, e11);
            InterfaceC1479a m11481l = this.f9232t.m11481l();
            if (m11481l != null) {
                m11481l.accept(illegalStateException);
                return;
            }
            throw illegalStateException;
        } catch (Throwable th2) {
            AbstractC2253u.m11895e().mo11901d(f9227u, "Unable to schedule " + c26976w, th2);
        }
    }

    public C2182m(Context context, WorkDatabase workDatabase, C2138c c2138c, JobScheduler jobScheduler, C2181l c2181l) {
        this.f9228p = context;
        this.f9229q = jobScheduler;
        this.f9230r = c2181l;
        this.f9231s = workDatabase;
        this.f9232t = c2138c;
    }
}
