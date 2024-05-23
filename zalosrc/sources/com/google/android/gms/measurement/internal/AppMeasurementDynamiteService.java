package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.measurement.AbstractBinderC5366f1;
import com.google.android.gms.internal.measurement.InterfaceC5434j1;
import com.google.android.gms.internal.measurement.InterfaceC5485m1;
import com.google.android.gms.internal.measurement.InterfaceC5519o1;
import com.google.android.gms.internal.measurement.zzcl;
import java.util.Map;
import p230i6.AbstractC20331w;
import p230i6.InterfaceC20329u;
import p665y0.C30239a;

@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends AbstractBinderC5366f1 {

    /* renamed from: p */
    C6127s4 f33752p = null;

    /* renamed from: q */
    private final Map f33753q = new C30239a();

    /* renamed from: N */
    private final void m30788N(InterfaceC5434j1 interfaceC5434j1, String str) {
        zzb();
        this.f33752p.m31381N().m31325K(interfaceC5434j1, str);
    }

    private final void zzb() {
        if (this.f33752p != null) {
        } else {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void beginAdUnitExposure(String str, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31400y().m31481k(str, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31434n(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void clearMeasurementEnabled(long j11) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31416I(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void endAdUnitExposure(String str, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31400y().m31482l(str, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void generateEventId(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        long m31354t0 = this.f33752p.m31381N().m31354t0();
        zzb();
        this.f33752p.m31381N().m31324J(interfaceC5434j1, m31354t0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getAppInstanceId(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        this.f33752p.mo31037v().m31296z(new RunnableC6030j6(this, interfaceC5434j1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getCachedAppInstanceId(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        m30788N(interfaceC5434j1, this.f33752p.m31376I().m31427V());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getConditionalUserProperties(String str, String str2, InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        this.f33752p.mo31037v().m31296z(new RunnableC6132s9(this, interfaceC5434j1, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getCurrentScreenClass(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        m30788N(interfaceC5434j1, this.f33752p.m31376I().m31428W());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getCurrentScreenName(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        m30788N(interfaceC5434j1, this.f33752p.m31376I().m31429X());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getGmpAppId(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        String str;
        zzb();
        C6129s6 m31376I = this.f33752p.m31376I();
        if (m31376I.f34158a.m31382O() != null) {
            str = m31376I.f34158a.m31382O();
        } else {
            try {
                str = AbstractC20331w.m106028c(m31376I.f34158a.mo31032b(), "google_app_id", m31376I.f34158a.m31385R());
            } catch (IllegalStateException e11) {
                m31376I.f34158a.mo31033c().m31197q().m31109b("getGoogleAppId failed with exception", e11);
                str = null;
            }
        }
        m30788N(interfaceC5434j1, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getMaxUserProperties(String str, InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31422Q(str);
        zzb();
        this.f33752p.m31381N().m31323I(interfaceC5434j1, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getSessionId(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        C6129s6 m31376I = this.f33752p.m31376I();
        m31376I.f34158a.mo31037v().m31296z(new RunnableC5986f6(m31376I, interfaceC5434j1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getTestFlag(InterfaceC5434j1 interfaceC5434j1, int i11) throws RemoteException {
        zzb();
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            return;
                        }
                        this.f33752p.m31381N().m31319E(interfaceC5434j1, this.f33752p.m31376I().m31423R().booleanValue());
                        return;
                    }
                    this.f33752p.m31381N().m31323I(interfaceC5434j1, this.f33752p.m31376I().m31425T().intValue());
                    return;
                }
                C6121r9 m31381N = this.f33752p.m31381N();
                double doubleValue = this.f33752p.m31376I().m31424S().doubleValue();
                Bundle bundle = new Bundle();
                bundle.putDouble("r", doubleValue);
                try {
                    interfaceC5434j1.mo28962J(bundle);
                    return;
                } catch (RemoteException e11) {
                    m31381N.f34158a.mo31033c().m31202w().m31109b("Error returning double value to wrapper", e11);
                    return;
                }
            }
            this.f33752p.m31381N().m31324J(interfaceC5434j1, this.f33752p.m31376I().m31426U().longValue());
            return;
        }
        this.f33752p.m31381N().m31325K(interfaceC5434j1, this.f33752p.m31376I().m31430Y());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void getUserProperties(String str, String str2, boolean z11, InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        this.f33752p.mo31037v().m31296z(new RunnableC6010h8(this, interfaceC5434j1, str, str2, z11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void initForTests(Map map) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void initialize(InterfaceC4271b interfaceC4271b, zzcl zzclVar, long j11) throws RemoteException {
        C6127s4 c6127s4 = this.f33752p;
        if (c6127s4 == null) {
            this.f33752p = C6127s4.m31363H((Context) AbstractC4205o.m19722k((Context) BinderC4273d.m19914Q(interfaceC4271b)), zzclVar, Long.valueOf(j11));
        } else {
            c6127s4.mo31033c().m31202w().m31108a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void isDataCollectionEnabled(InterfaceC5434j1 interfaceC5434j1) throws RemoteException {
        zzb();
        this.f33752p.mo31037v().m31296z(new RunnableC6143t9(this, interfaceC5434j1));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void logEvent(String str, String str2, Bundle bundle, boolean z11, boolean z12, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31438r(str, str2, bundle, z11, z12, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC5434j1 interfaceC5434j1, long j11) throws RemoteException {
        Bundle bundle2;
        zzb();
        AbstractC4205o.m19718g(str2);
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_o", "app");
        this.f33752p.mo31037v().m31296z(new RunnableC5998g7(this, interfaceC5434j1, new zzaw(str2, new zzau(bundle), "app", j11), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void logHealthData(int i11, String str, InterfaceC4271b interfaceC4271b, InterfaceC4271b interfaceC4271b2, InterfaceC4271b interfaceC4271b3) throws RemoteException {
        Object m19914Q;
        Object m19914Q2;
        zzb();
        Object obj = null;
        if (interfaceC4271b == null) {
            m19914Q = null;
        } else {
            m19914Q = BinderC4273d.m19914Q(interfaceC4271b);
        }
        if (interfaceC4271b2 == null) {
            m19914Q2 = null;
        } else {
            m19914Q2 = BinderC4273d.m19914Q(interfaceC4271b2);
        }
        if (interfaceC4271b3 != null) {
            obj = BinderC4273d.m19914Q(interfaceC4271b3);
        }
        this.f33752p.mo31033c().m31195G(i11, true, false, str, m19914Q, m19914Q2, obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivityCreated(InterfaceC4271b interfaceC4271b, Bundle bundle, long j11) throws RemoteException {
        zzb();
        C6118r6 c6118r6 = this.f33752p.m31376I().f34456c;
        if (c6118r6 != null) {
            this.f33752p.m31376I().m31435o();
            c6118r6.onActivityCreated((Activity) BinderC4273d.m19914Q(interfaceC4271b), bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivityDestroyed(InterfaceC4271b interfaceC4271b, long j11) throws RemoteException {
        zzb();
        C6118r6 c6118r6 = this.f33752p.m31376I().f34456c;
        if (c6118r6 != null) {
            this.f33752p.m31376I().m31435o();
            c6118r6.onActivityDestroyed((Activity) BinderC4273d.m19914Q(interfaceC4271b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivityPaused(InterfaceC4271b interfaceC4271b, long j11) throws RemoteException {
        zzb();
        C6118r6 c6118r6 = this.f33752p.m31376I().f34456c;
        if (c6118r6 != null) {
            this.f33752p.m31376I().m31435o();
            c6118r6.onActivityPaused((Activity) BinderC4273d.m19914Q(interfaceC4271b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivityResumed(InterfaceC4271b interfaceC4271b, long j11) throws RemoteException {
        zzb();
        C6118r6 c6118r6 = this.f33752p.m31376I().f34456c;
        if (c6118r6 != null) {
            this.f33752p.m31376I().m31435o();
            c6118r6.onActivityResumed((Activity) BinderC4273d.m19914Q(interfaceC4271b));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivitySaveInstanceState(InterfaceC4271b interfaceC4271b, InterfaceC5434j1 interfaceC5434j1, long j11) throws RemoteException {
        zzb();
        C6118r6 c6118r6 = this.f33752p.m31376I().f34456c;
        Bundle bundle = new Bundle();
        if (c6118r6 != null) {
            this.f33752p.m31376I().m31435o();
            c6118r6.onActivitySaveInstanceState((Activity) BinderC4273d.m19914Q(interfaceC4271b), bundle);
        }
        try {
            interfaceC5434j1.mo28962J(bundle);
        } catch (RemoteException e11) {
            this.f33752p.mo31033c().m31202w().m31109b("Error returning bundle value to wrapper", e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivityStarted(InterfaceC4271b interfaceC4271b, long j11) throws RemoteException {
        zzb();
        if (this.f33752p.m31376I().f34456c != null) {
            this.f33752p.m31376I().m31435o();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void onActivityStopped(InterfaceC4271b interfaceC4271b, long j11) throws RemoteException {
        zzb();
        if (this.f33752p.m31376I().f34456c != null) {
            this.f33752p.m31376I().m31435o();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void performAction(Bundle bundle, InterfaceC5434j1 interfaceC5434j1, long j11) throws RemoteException {
        zzb();
        interfaceC5434j1.mo28962J(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void registerOnMeasurementEventListener(InterfaceC5485m1 interfaceC5485m1) throws RemoteException {
        InterfaceC20329u interfaceC20329u;
        zzb();
        synchronized (this.f33753q) {
            try {
                interfaceC20329u = (InterfaceC20329u) this.f33753q.get(Integer.valueOf(interfaceC5485m1.zzd()));
                if (interfaceC20329u == null) {
                    interfaceC20329u = new C6165v9(this, interfaceC5485m1);
                    this.f33753q.put(Integer.valueOf(interfaceC5485m1.zzd()), interfaceC20329u);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f33752p.m31376I().m31443x(interfaceC20329u);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void resetAnalyticsData(long j11) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31444y(j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setConditionalUserProperty(Bundle bundle, long j11) throws RemoteException {
        zzb();
        if (bundle == null) {
            this.f33752p.mo31033c().m31197q().m31108a("Conditional user property must not be null");
        } else {
            this.f33752p.m31376I().m31412E(bundle, j11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setConsent(final Bundle bundle, final long j11) throws RemoteException {
        zzb();
        final C6129s6 m31376I = this.f33752p.m31376I();
        m31376I.f34158a.mo31037v().m31290A(new Runnable() { // from class: com.google.android.gms.measurement.internal.r5
            @Override // java.lang.Runnable
            public final void run() {
                C6129s6 c6129s6 = C6129s6.this;
                Bundle bundle2 = bundle;
                long j12 = j11;
                if (TextUtils.isEmpty(c6129s6.f34158a.m31370B().m30942s())) {
                    c6129s6.m31413F(bundle2, 0, j12);
                } else {
                    c6129s6.f34158a.mo31033c().m31203x().m31108a("Using developer consent only; google app id found");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setConsentThirdParty(Bundle bundle, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31413F(bundle, -20, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setCurrentScreen(InterfaceC4271b interfaceC4271b, String str, String str2, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31378K().m30850D((Activity) BinderC4273d.m19914Q(interfaceC4271b), str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setDataCollectionEnabled(boolean z11) throws RemoteException {
        zzb();
        C6129s6 m31376I = this.f33752p.m31376I();
        m31376I.m31455h();
        m31376I.f34158a.mo31037v().m31296z(new RunnableC6096p6(m31376I, z11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setDefaultEventParameters(Bundle bundle) {
        final Bundle bundle2;
        zzb();
        final C6129s6 m31376I = this.f33752p.m31376I();
        if (bundle == null) {
            bundle2 = null;
        } else {
            bundle2 = new Bundle(bundle);
        }
        m31376I.f34158a.mo31037v().m31296z(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
            @Override // java.lang.Runnable
            public final void run() {
                C6129s6.this.m31436p(bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setEventInterceptor(InterfaceC5485m1 interfaceC5485m1) throws RemoteException {
        zzb();
        C6154u9 c6154u9 = new C6154u9(this, interfaceC5485m1);
        if (this.f33752p.mo31037v().m31291C()) {
            this.f33752p.m31376I().m31415H(c6154u9);
        } else {
            this.f33752p.mo31037v().m31296z(new RunnableC6011h9(this, c6154u9));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setInstanceIdProvider(InterfaceC5519o1 interfaceC5519o1) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setMeasurementEnabled(boolean z11, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31416I(Boolean.valueOf(z11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setMinimumSessionDuration(long j11) throws RemoteException {
        zzb();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setSessionTimeoutDuration(long j11) throws RemoteException {
        zzb();
        C6129s6 m31376I = this.f33752p.m31376I();
        m31376I.f34158a.mo31037v().m31296z(new RunnableC6172w5(m31376I, j11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setUserId(final String str, long j11) throws RemoteException {
        zzb();
        final C6129s6 m31376I = this.f33752p.m31376I();
        if (str != null && TextUtils.isEmpty(str)) {
            m31376I.f34158a.mo31033c().m31202w().m31108a("User ID must be non-empty or null");
        } else {
            m31376I.f34158a.mo31037v().m31296z(new Runnable() { // from class: com.google.android.gms.measurement.internal.t5
                @Override // java.lang.Runnable
                public final void run() {
                    C6129s6 c6129s6 = C6129s6.this;
                    if (c6129s6.f34158a.m31370B().m30945w(str)) {
                        c6129s6.f34158a.m31370B().m30944u();
                    }
                }
            });
            m31376I.m31419L(null, "_id", str, true, j11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void setUserProperty(String str, String str2, InterfaceC4271b interfaceC4271b, boolean z11, long j11) throws RemoteException {
        zzb();
        this.f33752p.m31376I().m31419L(str, str2, BinderC4273d.m19914Q(interfaceC4271b), z11, j11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5383g1
    public void unregisterOnMeasurementEventListener(InterfaceC5485m1 interfaceC5485m1) throws RemoteException {
        InterfaceC20329u interfaceC20329u;
        zzb();
        synchronized (this.f33753q) {
            interfaceC20329u = (InterfaceC20329u) this.f33753q.remove(Integer.valueOf(interfaceC5485m1.zzd()));
        }
        if (interfaceC20329u == null) {
            interfaceC20329u = new C6165v9(this, interfaceC5485m1);
        }
        this.f33752p.m31376I().m31421N(interfaceC20329u);
    }
}
