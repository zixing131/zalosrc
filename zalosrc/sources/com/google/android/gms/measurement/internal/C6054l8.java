package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.AbstractC4205o;
import p230i6.InterfaceC20333y;

/* renamed from: com.google.android.gms.measurement.internal.l8 */
/* loaded from: classes.dex */
public final class C6054l8 {

    /* renamed from: a */
    private final Context f34163a;

    public C6054l8(Context context) {
        AbstractC4205o.m19722k(context);
        this.f34163a = context;
    }

    /* renamed from: k */
    private final C6082o3 m31038k() {
        return C6127s4.m31363H(this.f34163a, null, null).mo31033c();
    }

    /* renamed from: a */
    public final int m31039a(final Intent intent, int i11, final int i12) {
        C6127s4 m31363H = C6127s4.m31363H(this.f34163a, null, null);
        final C6082o3 mo31033c = m31363H.mo31033c();
        if (intent == null) {
            mo31033c.m31202w().m31108a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        m31363H.mo31035f();
        mo31033c.m31201u().m31110c("Local AppMeasurementService called. startId, action", Integer.valueOf(i12), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            m31046h(new Runnable() { // from class: com.google.android.gms.measurement.internal.j8
                @Override // java.lang.Runnable
                public final void run() {
                    C6054l8.this.m31041c(i12, mo31033c, intent);
                }
            });
        }
        return 2;
    }

    /* renamed from: b */
    public final IBinder m31040b(Intent intent) {
        if (intent == null) {
            m31038k().m31197q().m31108a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC6040k5(C6055l9.m31062f0(this.f34163a), null);
        }
        m31038k().m31202w().m31109b("onBind received unknown action", action);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void m31041c(int i11, C6082o3 c6082o3, Intent intent) {
        if (((InterfaceC20333y) this.f34163a).mo30778c(i11)) {
            c6082o3.m31201u().m31109b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i11));
            m31038k().m31201u().m31108a("Completed wakeful intent.");
            ((InterfaceC20333y) this.f34163a).mo30776a(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void m31042d(C6082o3 c6082o3, JobParameters jobParameters) {
        c6082o3.m31201u().m31108a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC20333y) this.f34163a).mo30777b(jobParameters, false);
    }

    /* renamed from: e */
    public final void m31043e() {
        C6127s4 m31363H = C6127s4.m31363H(this.f34163a, null, null);
        C6082o3 mo31033c = m31363H.mo31033c();
        m31363H.mo31035f();
        mo31033c.m31201u().m31108a("Local AppMeasurementService is starting up");
    }

    /* renamed from: f */
    public final void m31044f() {
        C6127s4 m31363H = C6127s4.m31363H(this.f34163a, null, null);
        C6082o3 mo31033c = m31363H.mo31033c();
        m31363H.mo31035f();
        mo31033c.m31201u().m31108a("Local AppMeasurementService is shutting down");
    }

    /* renamed from: g */
    public final void m31045g(Intent intent) {
        if (intent == null) {
            m31038k().m31197q().m31108a("onRebind called with null intent");
        } else {
            m31038k().m31201u().m31109b("onRebind called. action", intent.getAction());
        }
    }

    /* renamed from: h */
    public final void m31046h(Runnable runnable) {
        C6055l9 m31062f0 = C6055l9.m31062f0(this.f34163a);
        m31062f0.mo31037v().m31296z(new RunnableC6043k8(this, m31062f0, runnable));
    }

    /* renamed from: i */
    public final boolean m31047i(final JobParameters jobParameters) {
        C6127s4 m31363H = C6127s4.m31363H(this.f34163a, null, null);
        final C6082o3 mo31033c = m31363H.mo31033c();
        String string = jobParameters.getExtras().getString("action");
        m31363H.mo31035f();
        mo31033c.m31201u().m31109b("Local AppMeasurementJobService called. action", string);
        if ("com.google.android.gms.measurement.UPLOAD".equals(string)) {
            m31046h(new Runnable() { // from class: com.google.android.gms.measurement.internal.i8
                @Override // java.lang.Runnable
                public final void run() {
                    C6054l8.this.m31042d(mo31033c, jobParameters);
                }
            });
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public final boolean m31048j(Intent intent) {
        if (intent == null) {
            m31038k().m31197q().m31108a("onUnbind called with null intent");
            return true;
        }
        m31038k().m31201u().m31109b("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
