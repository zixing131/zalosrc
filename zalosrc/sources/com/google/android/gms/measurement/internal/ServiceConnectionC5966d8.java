package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC4172d;
import com.google.android.gms.common.internal.AbstractC4205o;
import p198h5.C19879b;
import p230i6.InterfaceC20314f;

/* renamed from: com.google.android.gms.measurement.internal.d8 */
/* loaded from: classes.dex */
public final class ServiceConnectionC5966d8 implements ServiceConnection, AbstractC4172d.a, AbstractC4172d.b {

    /* renamed from: p */
    private volatile boolean f33863p;

    /* renamed from: q */
    private volatile C6038k3 f33864q;

    /* renamed from: r */
    final /* synthetic */ C5977e8 f33865r;

    /* JADX INFO: Access modifiers changed from: protected */
    public ServiceConnectionC5966d8(C5977e8 c5977e8) {
        this.f33865r = c5977e8;
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: E */
    public final void mo19635E(Bundle bundle) {
        AbstractC4205o.m19717f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                AbstractC4205o.m19722k(this.f33864q);
                this.f33865r.f34158a.mo31037v().m31296z(new RunnableC5930a8(this, (InterfaceC20314f) this.f33864q.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f33864q = null;
                this.f33863p = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.a
    /* renamed from: N */
    public final void mo19636N(int i11) {
        AbstractC4205o.m19717f("MeasurementServiceConnection.onConnectionSuspended");
        this.f33865r.f34158a.mo31033c().m31196p().m31108a("Service connection suspended");
        this.f33865r.f34158a.mo31037v().m31296z(new RunnableC5942b8(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC4172d.b
    /* renamed from: Q */
    public final void mo19643Q(ConnectionResult connectionResult) {
        AbstractC4205o.m19717f("MeasurementServiceConnection.onConnectionFailed");
        C6082o3 m31373E = this.f33865r.f34158a.m31373E();
        if (m31373E != null) {
            m31373E.m31202w().m31109b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f33863p = false;
            this.f33864q = null;
        }
        this.f33865r.f34158a.mo31037v().m31296z(new RunnableC5954c8(this));
    }

    /* renamed from: b */
    public final void m30830b(Intent intent) {
        ServiceConnectionC5966d8 serviceConnectionC5966d8;
        this.f33865r.mo31036g();
        Context mo31032b = this.f33865r.f34158a.mo31032b();
        C19879b m103558b = C19879b.m103558b();
        synchronized (this) {
            try {
                if (this.f33863p) {
                    this.f33865r.f34158a.mo31033c().m31201u().m31108a("Connection attempt already in progress");
                    return;
                }
                this.f33865r.f34158a.mo31033c().m31201u().m31108a("Using local app measurement service");
                this.f33863p = true;
                serviceConnectionC5966d8 = this.f33865r.f33979c;
                m103558b.m103563a(mo31032b, intent, serviceConnectionC5966d8, 129);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public final void m30831c() {
        this.f33865r.mo31036g();
        Context mo31032b = this.f33865r.f34158a.mo31032b();
        synchronized (this) {
            try {
                if (this.f33863p) {
                    this.f33865r.f34158a.mo31033c().m31201u().m31108a("Connection attempt already in progress");
                    return;
                }
                if (this.f33864q != null && (this.f33864q.isConnecting() || this.f33864q.isConnected())) {
                    this.f33865r.f34158a.mo31033c().m31201u().m31108a("Already awaiting connection attempt");
                    return;
                }
                this.f33864q = new C6038k3(mo31032b, Looper.getMainLooper(), this, this);
                this.f33865r.f34158a.mo31033c().m31201u().m31108a("Connecting to remote service");
                this.f33863p = true;
                AbstractC4205o.m19722k(this.f33864q);
                this.f33864q.checkAvailabilityAndConnect();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: d */
    public final void m30832d() {
        if (this.f33864q != null && (this.f33864q.isConnected() || this.f33864q.isConnecting())) {
            this.f33864q.disconnect();
        }
        this.f33864q = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ServiceConnectionC5966d8 serviceConnectionC5966d8;
        InterfaceC20314f c5983f3;
        AbstractC4205o.m19717f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f33863p = false;
                this.f33865r.f34158a.mo31033c().m31197q().m31108a("Service connected with null binder");
                return;
            }
            InterfaceC20314f interfaceC20314f = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof InterfaceC20314f) {
                        c5983f3 = (InterfaceC20314f) queryLocalInterface;
                    } else {
                        c5983f3 = new C5983f3(iBinder);
                    }
                    interfaceC20314f = c5983f3;
                    this.f33865r.f34158a.mo31033c().m31201u().m31108a("Bound to IMeasurementService interface");
                } else {
                    this.f33865r.f34158a.mo31033c().m31197q().m31109b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f33865r.f34158a.mo31033c().m31197q().m31108a("Service connect failed to get IMeasurementService");
            }
            if (interfaceC20314f == null) {
                this.f33863p = false;
                try {
                    C19879b m103558b = C19879b.m103558b();
                    Context mo31032b = this.f33865r.f34158a.mo31032b();
                    serviceConnectionC5966d8 = this.f33865r.f33979c;
                    m103558b.m103564c(mo31032b, serviceConnectionC5966d8);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f33865r.f34158a.mo31037v().m31296z(new RunnableC6196y7(this, interfaceC20314f));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4205o.m19717f("MeasurementServiceConnection.onServiceDisconnected");
        this.f33865r.f34158a.mo31033c().m31196p().m31108a("Service disconnected");
        this.f33865r.f34158a.mo31037v().m31296z(new RunnableC6207z7(this, componentName));
    }
}
