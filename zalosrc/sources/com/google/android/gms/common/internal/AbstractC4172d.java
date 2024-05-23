package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p669y4.AbstractC30284a;

/* renamed from: com.google.android.gms.common.internal.d */
/* loaded from: classes2.dex */
public abstract class AbstractC4172d {
    public static final int CONNECT_STATE_CONNECTED = 4;
    public static final int CONNECT_STATE_DISCONNECTED = 1;
    public static final int CONNECT_STATE_DISCONNECTING = 5;
    public static final String DEFAULT_ACCOUNT = "<<default account>>";
    public static final String KEY_PENDING_INTENT = "pendingIntent";
    private volatile String zzA;
    private ConnectionResult zzB;
    private boolean zzC;
    private volatile zzj zzD;
    C4225u1 zza;
    final Handler zzb;
    protected c zzc;
    protected AtomicInteger zzd;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private volatile String zzk;
    private final Context zzl;
    private final Looper zzm;
    private final AbstractC4181g zzn;
    private final C4148b zzo;
    private final Object zzp;
    private final Object zzq;
    private InterfaceC4193k zzr;
    private IInterface zzs;
    private final ArrayList zzt;
    private ServiceConnectionC4177e1 zzu;
    private int zzv;
    private final a zzw;
    private final b zzx;
    private final int zzy;
    private final String zzz;
    private static final Feature[] zze = new Feature[0];
    public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};

    /* renamed from: com.google.android.gms.common.internal.d$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: E */
        void mo19635E(Bundle bundle);

        /* renamed from: N */
        void mo19636N(int i11);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: Q */
        void mo19643Q(ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        void mo19548a(ConnectionResult connectionResult);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: com.google.android.gms.common.internal.d$d */
    /* loaded from: classes2.dex */
    public class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.AbstractC4172d.c
        /* renamed from: a */
        public final void mo19548a(ConnectionResult connectionResult) {
            if (connectionResult.m19187M()) {
                AbstractC4172d abstractC4172d = AbstractC4172d.this;
                abstractC4172d.getRemoteService(null, abstractC4172d.getScopes());
            } else if (AbstractC4172d.this.zzx != null) {
                AbstractC4172d.this.zzx.mo19643Q(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    /* loaded from: classes2.dex */
    public interface e {
        /* renamed from: a */
        void mo19508a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC4172d(Context context, Looper looper, int i11, a aVar, b bVar, String str) {
        this(context, looper, r3, r4, i11, aVar, bVar, str);
        AbstractC4181g m19678c = AbstractC4181g.m19678c(context);
        C4148b m19567h = C4148b.m19567h();
        AbstractC4205o.m19722k(aVar);
        AbstractC4205o.m19722k(bVar);
    }

    /* renamed from: f */
    public final void m19642f(int i11, IInterface iInterface) {
        boolean z11;
        boolean z12;
        C4225u1 c4225u1;
        C4225u1 c4225u12;
        boolean z13 = false;
        if (i11 != 4) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (iInterface == null) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (z11 == z12) {
            z13 = true;
        }
        AbstractC4205o.m19712a(z13);
        synchronized (this.zzp) {
            try {
                this.zzv = i11;
                this.zzs = iInterface;
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 == 4) {
                            AbstractC4205o.m19722k(iInterface);
                            onConnectedLocked(iInterface);
                        }
                    } else {
                        ServiceConnectionC4177e1 serviceConnectionC4177e1 = this.zzu;
                        if (serviceConnectionC4177e1 != null && (c4225u12 = this.zza) != null) {
                            String m19806c = c4225u12.m19806c();
                            String m19805b = c4225u12.m19805b();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Calling connect() while still connected, missing disconnect() for ");
                            sb2.append(m19806c);
                            sb2.append(" on ");
                            sb2.append(m19805b);
                            AbstractC4181g abstractC4181g = this.zzn;
                            String m19806c2 = this.zza.m19806c();
                            AbstractC4205o.m19722k(m19806c2);
                            abstractC4181g.m19683g(m19806c2, this.zza.m19805b(), this.zza.m19804a(), serviceConnectionC4177e1, zze(), this.zza.m19807d());
                            this.zzd.incrementAndGet();
                        }
                        ServiceConnectionC4177e1 serviceConnectionC4177e12 = new ServiceConnectionC4177e1(this, this.zzd.get());
                        this.zzu = serviceConnectionC4177e12;
                        if (this.zzv == 3 && getLocalStartServiceAction() != null) {
                            c4225u1 = new C4225u1(getContext().getPackageName(), getLocalStartServiceAction(), true, AbstractC4181g.m19677b(), false);
                        } else {
                            c4225u1 = new C4225u1(getStartServicePackage(), getStartServiceAction(), false, AbstractC4181g.m19677b(), getUseDynamicLookup());
                        }
                        this.zza = c4225u1;
                        if (c4225u1.m19807d() && getMinApkVersion() < 17895000) {
                            throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.m19806c())));
                        }
                        AbstractC4181g abstractC4181g2 = this.zzn;
                        String m19806c3 = this.zza.m19806c();
                        AbstractC4205o.m19722k(m19806c3);
                        String m19805b2 = this.zza.m19805b();
                        int m19804a = this.zza.m19804a();
                        if (!abstractC4181g2.mo19684h(new C4201m1(m19806c3, m19805b2, m19804a, this.zza.m19807d()), serviceConnectionC4177e12, zze(), getBindServiceExecutor())) {
                            String m19806c4 = this.zza.m19806c();
                            String m19805b3 = this.zza.m19805b();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("unable to connect to service: ");
                            sb3.append(m19806c4);
                            sb3.append(" on ");
                            sb3.append(m19805b3);
                            zzl(16, null, this.zzd.get());
                        }
                    }
                } else {
                    ServiceConnectionC4177e1 serviceConnectionC4177e13 = this.zzu;
                    if (serviceConnectionC4177e13 != null) {
                        AbstractC4181g abstractC4181g3 = this.zzn;
                        String m19806c5 = this.zza.m19806c();
                        AbstractC4205o.m19722k(m19806c5);
                        abstractC4181g3.m19683g(m19806c5, this.zza.m19805b(), this.zza.m19804a(), serviceConnectionC4177e13, zze(), this.zza.m19807d());
                        this.zzu = null;
                    }
                }
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ void zzj(AbstractC4172d abstractC4172d, zzj zzjVar) {
        RootTelemetryConfiguration m19615Q;
        abstractC4172d.zzD = zzjVar;
        if (abstractC4172d.usesClientTelemetry()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f16696s;
            C4208p m19739b = C4208p.m19739b();
            if (connectionTelemetryConfiguration == null) {
                m19615Q = null;
            } else {
                m19615Q = connectionTelemetryConfiguration.m19615Q();
            }
            m19739b.m19741c(m19615Q);
        }
    }

    public static /* bridge */ /* synthetic */ void zzk(AbstractC4172d abstractC4172d, int i11) {
        int i12;
        int i13;
        synchronized (abstractC4172d.zzp) {
            i12 = abstractC4172d.zzv;
        }
        if (i12 == 3) {
            abstractC4172d.zzC = true;
            i13 = 5;
        } else {
            i13 = 4;
        }
        Handler handler = abstractC4172d.zzb;
        handler.sendMessage(handler.obtainMessage(i13, abstractC4172d.zzd.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean zzn(AbstractC4172d abstractC4172d, int i11, int i12, IInterface iInterface) {
        synchronized (abstractC4172d.zzp) {
            try {
                if (abstractC4172d.zzv != i11) {
                    return false;
                }
                abstractC4172d.m19642f(i12, iInterface);
                return true;
            } finally {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: RegionMakerVisitor
        java.lang.NullPointerException
        */
    static /* bridge */ /* synthetic */ boolean zzo(com.google.android.gms.common.internal.AbstractC4172d r2) {
        /*
            boolean r0 = r2.zzC
            r1 = 0
            if (r0 == 0) goto L6
            goto L24
        L6:
            java.lang.String r0 = r2.getServiceDescriptor()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L11
            goto L24
        L11:
            java.lang.String r0 = r2.getLocalStartServiceAction()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            java.lang.String r2 = r2.getServiceDescriptor()     // Catch: java.lang.ClassNotFoundException -> L24
            java.lang.Class.forName(r2)     // Catch: java.lang.ClassNotFoundException -> L24
            r1 = 1
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.AbstractC4172d.zzo(com.google.android.gms.common.internal.d):boolean");
    }

    public void checkAvailabilityAndConnect() {
        int mo19201j = this.zzo.mo19201j(this.zzl, getMinApkVersion());
        if (mo19201j != 0) {
            m19642f(1, null);
            triggerNotAvailable(new d(), mo19201j, null);
        } else {
            connect(new d());
        }
    }

    public final void checkConnected() {
        if (isConnected()) {
        } else {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public void connect(c cVar) {
        AbstractC4205o.m19723l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        m19642f(2, null);
    }

    public abstract IInterface createServiceInterface(IBinder iBinder);

    public void disconnect() {
        this.zzd.incrementAndGet();
        synchronized (this.zzt) {
            try {
                int size = this.zzt.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((AbstractC4171c1) this.zzt.get(i11)).m19640d();
                }
                this.zzt.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.zzq) {
            this.zzr = null;
        }
        m19642f(1, null);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i11;
        IInterface iInterface;
        InterfaceC4193k interfaceC4193k;
        synchronized (this.zzp) {
            i11 = this.zzv;
            iInterface = this.zzs;
        }
        synchronized (this.zzq) {
            interfaceC4193k = this.zzr;
        }
        printWriter.append((CharSequence) str).append("mConnectState=");
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            printWriter.print("UNKNOWN");
                        } else {
                            printWriter.print("DISCONNECTING");
                        }
                    } else {
                        printWriter.print("CONNECTED");
                    }
                } else {
                    printWriter.print("LOCAL_CONNECTING");
                }
            } else {
                printWriter.print("REMOTE_CONNECTING");
            }
        } else {
            printWriter.print("DISCONNECTED");
        }
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (interfaceC4193k == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(interfaceC4193k.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.zzh > 0) {
            PrintWriter append = printWriter.append((CharSequence) str).append("lastConnectedTime=");
            long j11 = this.zzh;
            append.println(j11 + " " + simpleDateFormat.format(new Date(j11)));
        }
        if (this.zzg > 0) {
            printWriter.append((CharSequence) str).append("lastSuspendedCause=");
            int i12 = this.zzf;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        printWriter.append((CharSequence) String.valueOf(i12));
                    } else {
                        printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                    }
                } else {
                    printWriter.append("CAUSE_NETWORK_LOST");
                }
            } else {
                printWriter.append("CAUSE_SERVICE_DISCONNECTED");
            }
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j12 = this.zzg;
            append2.println(j12 + " " + simpleDateFormat.format(new Date(j12)));
        }
        if (this.zzj > 0) {
            printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) AbstractC30284a.m149433a(this.zzi));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j13 = this.zzj;
            append3.println(j13 + " " + simpleDateFormat.format(new Date(j13)));
        }
    }

    public boolean enableLocalFallback() {
        return false;
    }

    public Account getAccount() {
        return null;
    }

    public Feature[] getApiFeatures() {
        return zze;
    }

    public final Feature[] getAvailableFeatures() {
        zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f16694q;
    }

    protected Executor getBindServiceExecutor() {
        return null;
    }

    public Bundle getConnectionHint() {
        return null;
    }

    public final Context getContext() {
        return this.zzl;
    }

    public String getEndpointPackageName() {
        C4225u1 c4225u1;
        if (isConnected() && (c4225u1 = this.zza) != null) {
            return c4225u1.m19805b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    public int getGCoreServiceId() {
        return this.zzy;
    }

    protected Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    public String getLastDisconnectMessage() {
        return this.zzk;
    }

    protected String getLocalStartServiceAction() {
        return null;
    }

    public final Looper getLooper() {
        return this.zzm;
    }

    public int getMinApkVersion() {
        return C4148b.f16477a;
    }

    public void getRemoteService(InterfaceC4187i interfaceC4187i, Set<Scope> set) {
        Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
        int i11 = this.zzy;
        String str = this.zzA;
        int i12 = C4148b.f16477a;
        Scope[] scopeArr = GetServiceRequest.f16536D;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.f16537E;
        GetServiceRequest getServiceRequest = new GetServiceRequest(6, i11, i12, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
        getServiceRequest.f16544s = this.zzl.getPackageName();
        getServiceRequest.f16547v = getServiceRequestExtraArgs;
        if (set != null) {
            getServiceRequest.f16546u = (Scope[]) set.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            Account account = getAccount();
            if (account == null) {
                account = new Account(DEFAULT_ACCOUNT, "com.google");
            }
            getServiceRequest.f16548w = account;
            if (interfaceC4187i != null) {
                getServiceRequest.f16545t = interfaceC4187i.asBinder();
            }
        } else if (requiresAccount()) {
            getServiceRequest.f16548w = getAccount();
        }
        getServiceRequest.f16549x = zze;
        getServiceRequest.f16550y = getApiFeatures();
        if (usesClientTelemetry()) {
            getServiceRequest.f16539B = true;
        }
        try {
            try {
                synchronized (this.zzq) {
                    try {
                        InterfaceC4193k interfaceC4193k = this.zzr;
                        if (interfaceC4193k != null) {
                            interfaceC4193k.mo19697b3(new BinderC4174d1(this, this.zzd.get()), getServiceRequest);
                        }
                    } finally {
                    }
                }
            } catch (DeadObjectException unused) {
                triggerConnectionSuspended(3);
            } catch (SecurityException e11) {
                throw e11;
            }
        } catch (RemoteException | RuntimeException unused2) {
            onPostInitHandler(8, null, null, this.zzd.get());
        }
    }

    protected Set<Scope> getScopes() {
        return Collections.emptySet();
    }

    public final IInterface getService() throws DeadObjectException {
        IInterface iInterface;
        synchronized (this.zzp) {
            try {
                if (this.zzv != 5) {
                    checkConnected();
                    iInterface = this.zzs;
                    AbstractC4205o.m19723l(iInterface, "Client is connected but service is null");
                } else {
                    throw new DeadObjectException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    public IBinder getServiceBrokerBinder() {
        synchronized (this.zzq) {
            try {
                InterfaceC4193k interfaceC4193k = this.zzr;
                if (interfaceC4193k == null) {
                    return null;
                }
                return interfaceC4193k.asBinder();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract String getServiceDescriptor();

    public Intent getSignInIntent() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    protected abstract String getStartServiceAction();

    protected String getStartServicePackage() {
        return "com.google.android.gms";
    }

    public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
        zzj zzjVar = this.zzD;
        if (zzjVar == null) {
            return null;
        }
        return zzjVar.f16696s;
    }

    protected boolean getUseDynamicLookup() {
        if (getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean hasConnectionInfo() {
        return this.zzD != null;
    }

    public boolean isConnected() {
        boolean z11;
        synchronized (this.zzp) {
            if (this.zzv == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        return z11;
    }

    public boolean isConnecting() {
        boolean z11;
        synchronized (this.zzp) {
            int i11 = this.zzv;
            z11 = true;
            if (i11 != 2 && i11 != 3) {
                z11 = false;
            }
        }
        return z11;
    }

    protected void onConnectedLocked(IInterface iInterface) {
        this.zzh = System.currentTimeMillis();
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.zzi = connectionResult.m19188t();
        this.zzj = System.currentTimeMillis();
    }

    public void onConnectionSuspended(int i11) {
        this.zzf = i11;
        this.zzg = System.currentTimeMillis();
    }

    public void onPostInitHandler(int i11, IBinder iBinder, Bundle bundle, int i12) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(1, i12, -1, new C4180f1(this, i11, iBinder, bundle)));
    }

    public void onUserSignOut(e eVar) {
        eVar.mo19508a();
    }

    public boolean providesSignIn() {
        return false;
    }

    public boolean requiresAccount() {
        return false;
    }

    public boolean requiresGooglePlayServices() {
        return true;
    }

    public boolean requiresSignIn() {
        return false;
    }

    public void setAttributionTag(String str) {
        this.zzA = str;
    }

    public void triggerConnectionSuspended(int i11) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(6, this.zzd.get(), i11));
    }

    protected void triggerNotAvailable(c cVar, int i11, PendingIntent pendingIntent) {
        AbstractC4205o.m19723l(cVar, "Connection progress callbacks cannot be null.");
        this.zzc = cVar;
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(3, this.zzd.get(), i11, pendingIntent));
    }

    public boolean usesClientTelemetry() {
        return false;
    }

    protected final String zze() {
        String str = this.zzz;
        if (str == null) {
            return this.zzl.getClass().getName();
        }
        return str;
    }

    public final void zzl(int i11, Bundle bundle, int i12) {
        Handler handler = this.zzb;
        handler.sendMessage(handler.obtainMessage(7, i12, -1, new C4183g1(this, i11, null)));
    }

    public AbstractC4172d(Context context, Looper looper, AbstractC4181g abstractC4181g, C4148b c4148b, int i11, a aVar, b bVar, String str) {
        this.zzk = null;
        this.zzp = new Object();
        this.zzq = new Object();
        this.zzt = new ArrayList();
        this.zzv = 1;
        this.zzB = null;
        this.zzC = false;
        this.zzD = null;
        this.zzd = new AtomicInteger(0);
        AbstractC4205o.m19723l(context, "Context must not be null");
        this.zzl = context;
        AbstractC4205o.m19723l(looper, "Looper must not be null");
        this.zzm = looper;
        AbstractC4205o.m19723l(abstractC4181g, "Supervisor must not be null");
        this.zzn = abstractC4181g;
        AbstractC4205o.m19723l(c4148b, "API availability must not be null");
        this.zzo = c4148b;
        this.zzb = new HandlerC4168b1(this, looper);
        this.zzy = i11;
        this.zzw = aVar;
        this.zzx = bVar;
        this.zzz = str;
    }

    public void disconnect(String str) {
        this.zzk = str;
        disconnect();
    }
}
