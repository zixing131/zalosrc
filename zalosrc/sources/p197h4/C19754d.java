package p197h4;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;
import p010a4.AbstractC0123p;
import p121e4.AbstractC18197a;
import p228i4.InterfaceC20230d;
import p314l4.AbstractC22060a;

/* renamed from: h4.d */
/* loaded from: classes.dex */
public class C19754d implements InterfaceC19774x {

    /* renamed from: a */
    private final Context f97860a;

    /* renamed from: b */
    private final InterfaceC20230d f97861b;

    /* renamed from: c */
    private final AbstractC19756f f97862c;

    public C19754d(Context context, InterfaceC20230d interfaceC20230d, AbstractC19756f abstractC19756f) {
        this.f97860a = context;
        this.f97861b = interfaceC20230d;
        this.f97862c = abstractC19756f;
    }

    /* renamed from: d */
    private boolean m103476d(JobScheduler jobScheduler, int i11, int i12) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i13 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i11) {
                if (i13 < i12) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // p197h4.InterfaceC19774x
    /* renamed from: a */
    public void mo103477a(AbstractC0123p abstractC0123p, int i11, boolean z11) {
        ComponentName componentName = new ComponentName(this.f97860a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f97860a.getSystemService("jobscheduler");
        int m103479c = m103479c(abstractC0123p);
        if (!z11 && m103476d(jobScheduler, m103479c, i11)) {
            AbstractC18197a.m96964b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", abstractC0123p);
            return;
        }
        long mo105724k0 = this.f97861b.mo105724k0(abstractC0123p);
        JobInfo.Builder m103486c = this.f97862c.m103486c(new JobInfo.Builder(m103479c, componentName), abstractC0123p.mo515d(), mo105724k0, i11);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i11);
        persistableBundle.putString("backendName", abstractC0123p.mo513b());
        persistableBundle.putInt("priority", AbstractC22060a.m115180a(abstractC0123p.mo515d()));
        if (abstractC0123p.mo514c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC0123p.mo514c(), 0));
        }
        m103486c.setExtras(persistableBundle);
        AbstractC18197a.m96965c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC0123p, Integer.valueOf(m103479c), Long.valueOf(this.f97862c.m103487g(abstractC0123p.mo515d(), mo105724k0, i11)), Long.valueOf(mo105724k0), Integer.valueOf(i11));
        jobScheduler.schedule(m103486c.build());
    }

    @Override // p197h4.InterfaceC19774x
    /* renamed from: b */
    public void mo103478b(AbstractC0123p abstractC0123p, int i11) {
        mo103477a(abstractC0123p, i11, false);
    }

    /* renamed from: c */
    int m103479c(AbstractC0123p abstractC0123p) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f97860a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC0123p.mo513b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(AbstractC22060a.m115180a(abstractC0123p.mo515d())).array());
        if (abstractC0123p.mo514c() != null) {
            adler32.update(abstractC0123p.mo514c());
        }
        return (int) adler32.getValue();
    }
}
