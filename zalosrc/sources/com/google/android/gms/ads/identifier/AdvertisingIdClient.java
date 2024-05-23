package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.AbstractC4150d;
import com.google.android.gms.common.C4148b;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import p198h5.C19879b;
import p356n5.AbstractBinderC23562e;
import p356n5.InterfaceC23563f;
import p632x4.ServiceConnectionC29315a;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    ServiceConnectionC29315a zza;
    InterfaceC23563f zzb;
    boolean zzc;
    final Object zzd;
    zzb zze;
    final long zzf;
    private final Context zzg;

    /* loaded from: classes2.dex */
    public static final class Info {
        private final String zza;
        private final boolean zzb;

        @Deprecated
        public Info(String str, boolean z11) {
            this.zza = str;
            this.zzb = z11;
        }

        public String getId() {
            return this.zza;
        }

        public boolean isLimitAdTrackingEnabled() {
            return this.zzb;
        }

        public String toString() {
            String str = this.zza;
            boolean z11 = this.zzb;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 7);
            sb2.append("{");
            sb2.append(str);
            sb2.append("}");
            sb2.append(z11);
            return sb2.toString();
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, true, false);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zzb(false);
            Info zzd = advertisingIdClient.zzd(-1);
            advertisingIdClient.zzc(zzd, true, 0.0f, SystemClock.elapsedRealtime() - elapsedRealtime, "", null);
            return zzd;
        } finally {
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean zzd;
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, false, false);
        try {
            advertisingIdClient.zzb(false);
            AbstractC4205o.m19721j("Calling this from your main thread can lead to deadlock");
            synchronized (advertisingIdClient) {
                try {
                    if (!advertisingIdClient.zzc) {
                        synchronized (advertisingIdClient.zzd) {
                            zzb zzbVar = advertisingIdClient.zze;
                            if (zzbVar == null || !zzbVar.zzb) {
                                throw new IOException("AdvertisingIdClient is not connected.");
                            }
                        }
                        try {
                            advertisingIdClient.zzb(false);
                            if (!advertisingIdClient.zzc) {
                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                            }
                        } catch (Exception e11) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                        }
                    }
                    AbstractC4205o.m19722k(advertisingIdClient.zza);
                    AbstractC4205o.m19722k(advertisingIdClient.zzb);
                    try {
                        zzd = advertisingIdClient.zzb.zzd();
                    } catch (RemoteException unused) {
                        throw new IOException("Remote exception");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            advertisingIdClient.zze();
            return zzd;
        } finally {
            advertisingIdClient.zza();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z11) {
    }

    private final Info zzd(int i11) throws IOException {
        Info info;
        AbstractC4205o.m19721j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.zzc) {
                    synchronized (this.zzd) {
                        zzb zzbVar = this.zze;
                        if (zzbVar == null || !zzbVar.zzb) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        zzb(false);
                        if (!this.zzc) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e11) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e11);
                    }
                }
                AbstractC4205o.m19722k(this.zza);
                AbstractC4205o.m19722k(this.zzb);
                try {
                    info = new Info(this.zzb.zzc(), this.zzb.mo123629q(true));
                } catch (RemoteException unused) {
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        zze();
        return info;
    }

    private final void zze() {
        synchronized (this.zzd) {
            zzb zzbVar = this.zze;
            if (zzbVar != null) {
                zzbVar.zza.countDown();
                try {
                    this.zze.join();
                } catch (InterruptedException unused) {
                }
            }
            long j11 = this.zzf;
            if (j11 > 0) {
                this.zze = new zzb(this, j11);
            }
        }
    }

    protected final void finalize() throws Throwable {
        zza();
        super.finalize();
    }

    public Info getInfo() throws IOException {
        return zzd(-1);
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzb(true);
    }

    public final void zza() {
        AbstractC4205o.m19721j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzg != null && this.zza != null) {
                    try {
                        if (this.zzc) {
                            C19879b.m103558b().m103564c(this.zzg, this.zza);
                        }
                    } catch (Throwable unused) {
                    }
                    this.zzc = false;
                    this.zzb = null;
                    this.zza = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final void zzb(boolean z11) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        AbstractC4205o.m19721j("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.zzc) {
                    zza();
                }
                Context context = this.zzg;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int mo19201j = C4148b.m19567h().mo19201j(context, AbstractC4150d.f16480a);
                    if (mo19201j != 0 && mo19201j != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC29315a serviceConnectionC29315a = new ServiceConnectionC29315a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (C19879b.m103558b().m103563a(context, intent, serviceConnectionC29315a, 1)) {
                            this.zza = serviceConnectionC29315a;
                            try {
                                this.zzb = AbstractBinderC23562e.m123630E(serviceConnectionC29315a.m146463b(10000L, TimeUnit.MILLISECONDS));
                                this.zzc = true;
                                if (z11) {
                                    zze();
                                }
                            } catch (InterruptedException unused) {
                                throw new IOException("Interrupted exception");
                            } catch (Throwable th2) {
                                throw new IOException(th2);
                            }
                        } else {
                            throw new IOException("Connection failure");
                        }
                    } finally {
                        IOException iOException = new IOException(th2);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new GooglePlayServicesNotAvailableException(9);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    final boolean zzc(Info info, boolean z11, float f11, long j11, String str, Throwable th2) {
        if (Math.random() <= 0.0d) {
            HashMap hashMap = new HashMap();
            String str2 = "1";
            hashMap.put("app_context", "1");
            if (info != null) {
                if (true != info.isLimitAdTrackingEnabled()) {
                    str2 = "0";
                }
                hashMap.put("limit_ad_tracking", str2);
                String id2 = info.getId();
                if (id2 != null) {
                    hashMap.put("ad_id_size", Integer.toString(id2.length()));
                }
            }
            if (th2 != null) {
                hashMap.put(ZMediaPlayer.OnNativeInvokeListener.ARG_ERROR, th2.getClass().getName());
            }
            hashMap.put("tag", "AdvertisingIdClient");
            hashMap.put("time_spent", Long.toString(j11));
            new zza(this, hashMap).start();
            return true;
        }
        return false;
    }

    public AdvertisingIdClient(Context context, long j11, boolean z11, boolean z12) {
        Context applicationContext;
        this.zzd = new Object();
        AbstractC4205o.m19722k(context);
        if (z11 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.zzg = context;
        this.zzc = false;
        this.zzf = j11;
    }
}
