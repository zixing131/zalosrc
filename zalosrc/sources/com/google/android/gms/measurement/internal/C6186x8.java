package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC5620u0;
import com.google.android.gms.internal.measurement.AbstractC5654w0;

/* renamed from: com.google.android.gms.measurement.internal.x8 */
/* loaded from: classes.dex */
public final class C6186x8 extends AbstractC6208z8 {

    /* renamed from: d */
    private final AlarmManager f34601d;

    /* renamed from: e */
    private AbstractC6067n f34602e;

    /* renamed from: f */
    private Integer f34603f;

    /* JADX INFO: Access modifiers changed from: protected */
    public C6186x8(C6055l9 c6055l9) {
        super(c6055l9);
        this.f34601d = (AlarmManager) this.f34158a.mo31032b().getSystemService("alarm");
    }

    /* renamed from: n */
    private final int m31486n() {
        if (this.f34603f == null) {
            this.f34603f = Integer.valueOf("measurement".concat(String.valueOf(this.f34158a.mo31032b().getPackageName())).hashCode());
        }
        return this.f34603f.intValue();
    }

    /* renamed from: o */
    private final PendingIntent m31487o() {
        Context mo31032b = this.f34158a.mo31032b();
        return PendingIntent.getBroadcast(mo31032b, 0, new Intent().setClassName(mo31032b, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC5620u0.f32818a);
    }

    /* renamed from: p */
    private final AbstractC6067n m31488p() {
        if (this.f34602e == null) {
            this.f34602e = new C6175w8(this, this.f34628b.m31079c0());
        }
        return this.f34602e;
    }

    /* renamed from: q */
    private final void m31489q() {
        JobScheduler jobScheduler = (JobScheduler) this.f34158a.mo31032b().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m31486n());
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC6208z8
    /* renamed from: k */
    protected final boolean mo30801k() {
        AlarmManager alarmManager = this.f34601d;
        if (alarmManager != null) {
            alarmManager.cancel(m31487o());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m31489q();
            return false;
        }
        return false;
    }

    /* renamed from: l */
    public final void m31490l() {
        m31504h();
        this.f34158a.mo31033c().m31201u().m31108a("Unscheduling upload");
        AlarmManager alarmManager = this.f34601d;
        if (alarmManager != null) {
            alarmManager.cancel(m31487o());
        }
        m31488p().m31146b();
        if (Build.VERSION.SDK_INT >= 24) {
            m31489q();
        }
    }

    /* renamed from: m */
    public final void m31491m(long j11) {
        m31504h();
        this.f34158a.mo31035f();
        Context mo31032b = this.f34158a.mo31032b();
        if (!C6121r9.m31302a0(mo31032b)) {
            this.f34158a.mo31033c().m31196p().m31108a("Receiver not registered/enabled");
        }
        if (!C6121r9.m31303b0(mo31032b, false)) {
            this.f34158a.mo31033c().m31196p().m31108a("Service not registered/enabled");
        }
        m31490l();
        this.f34158a.mo31033c().m31201u().m31109b("Scheduling upload, millis", Long.valueOf(j11));
        long mo105914b = this.f34158a.mo31031a().mo105914b() + j11;
        this.f34158a.m31401z();
        if (j11 < Math.max(0L, ((Long) AbstractC5972e3.f33957z.m30827a(null)).longValue()) && !m31488p().m31149e()) {
            m31488p().m31148d(j11);
        }
        this.f34158a.mo31035f();
        if (Build.VERSION.SDK_INT >= 24) {
            Context mo31032b2 = this.f34158a.mo31032b();
            ComponentName componentName = new ComponentName(mo31032b2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int m31486n = m31486n();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            AbstractC5654w0.m29812a(mo31032b2, new JobInfo.Builder(m31486n, componentName).setMinimumLatency(j11).setOverrideDeadline(j11 + j11).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
            return;
        }
        AlarmManager alarmManager = this.f34601d;
        if (alarmManager != null) {
            this.f34158a.m31401z();
            alarmManager.setInexactRepeating(2, mo105914b, Math.max(((Long) AbstractC5972e3.f33947u.m30827a(null)).longValue(), j11), m31487o());
        }
    }
}
