package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p010a4.AbstractC0123p;
import p010a4.C0128u;
import p314l4.AbstractC22060a;

/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    /* renamed from: b */
    public /* synthetic */ void m18909b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i11 = jobParameters.getExtras().getInt("priority");
        int i12 = jobParameters.getExtras().getInt("attemptNumber");
        C0128u.m563f(getApplicationContext());
        AbstractC0123p.a mo519d = AbstractC0123p.m549a().mo517b(string).mo519d(AbstractC22060a.m115181b(i11));
        if (string2 != null) {
            mo519d.mo518c(Base64.decode(string2, 0));
        }
        C0128u.m561c().m564e().m103513v(mo519d.mo516a(), i12, new Runnable() { // from class: h4.e

            /* renamed from: q */
            public final /* synthetic */ JobParameters f97864q;

            public /* synthetic */ RunnableC19755e(JobParameters jobParameters2) {
                r2 = jobParameters2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.m18909b(r2);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
