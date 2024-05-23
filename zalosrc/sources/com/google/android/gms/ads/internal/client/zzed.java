package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.j60;
import com.google.android.gms.internal.ads.k60;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.o90;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.yk0;
import com.google.android.gms.internal.ads.z53;
import com.google.android.gms.internal.ads.zzbrq;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzed {
    private static zzed zza;
    private zzcm zzg;
    private final Object zzb = new Object();
    private boolean zzd = false;
    private boolean zze = false;
    private final Object zzf = new Object();
    private OnAdInspectorClosedListener zzh = null;
    private RequestConfiguration zzi = new RequestConfiguration.Builder().build();
    private final ArrayList zzc = new ArrayList();

    private zzed() {
    }

    public static zzed zzf() {
        zzed zzedVar;
        synchronized (zzed.class) {
            try {
                if (zza == null) {
                    zza = new zzed();
                }
                zzedVar = zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzedVar;
    }

    public static InitializationStatus zzw(List list) {
        AdapterStatus.State state;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbrq zzbrqVar = (zzbrq) it.next();
            String str = zzbrqVar.f31915p;
            if (zzbrqVar.f31916q) {
                state = AdapterStatus.State.READY;
            } else {
                state = AdapterStatus.State.NOT_READY;
            }
            hashMap.put(str, new j60(state, zzbrqVar.f31918s, zzbrqVar.f31917r));
        }
        return new k60(hashMap);
    }

    private final void zzx(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        try {
            o90.m25103a().m25104b(context, null);
            this.zzg.zzj();
            this.zzg.zzk(null, BinderC4273d.m19913I3(null));
        } catch (RemoteException e11) {
            yk0.zzk("MobileAdsSettingManager initialization failed", e11);
        }
    }

    private final void zzy(Context context) {
        if (this.zzg == null) {
            this.zzg = (zzcm) new zzao(zzaw.zza(), context).zzd(context, false);
        }
    }

    private final void zzz(RequestConfiguration requestConfiguration) {
        try {
            this.zzg.zzs(new zzez(requestConfiguration));
        } catch (RemoteException e11) {
            yk0.zzh("Unable to set request configuration parcel.", e11);
        }
    }

    public final float zza() {
        synchronized (this.zzf) {
            zzcm zzcmVar = this.zzg;
            float f11 = 1.0f;
            if (zzcmVar == null) {
                return 1.0f;
            }
            try {
                f11 = zzcmVar.zze();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to get app volume.", e11);
            }
            return f11;
        }
    }

    public final RequestConfiguration zzc() {
        return this.zzi;
    }

    public final InitializationStatus zze() {
        boolean z11;
        InitializationStatus zzw;
        synchronized (this.zzf) {
            try {
                if (this.zzg != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC4205o.m19727p(z11, "MobileAds.initialize() must be called prior to getting initialization status.");
                try {
                    zzw = zzw(this.zzg.zzg());
                } catch (RemoteException unused) {
                    yk0.zzg("Unable to get Initialization status.");
                    return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzdv
                        public /* synthetic */ zzdv() {
                        }

                        @Override // com.google.android.gms.ads.initialization.InitializationStatus
                        public final Map getAdapterStatusMap() {
                            zzed zzedVar = zzed.this;
                            HashMap hashMap = new HashMap();
                            hashMap.put("com.google.android.gms.ads.MobileAds", new zzdy(zzedVar));
                            return hashMap;
                        }
                    };
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzw;
    }

    @Deprecated
    public final String zzh() {
        boolean z11;
        String m28437c;
        synchronized (this.zzf) {
            try {
                if (this.zzg != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                AbstractC4205o.m19727p(z11, "MobileAds.initialize() must be called prior to getting version string.");
                try {
                    m28437c = z53.m28437c(this.zzg.zzf());
                } catch (RemoteException e11) {
                    yk0.zzh("Unable to get version string.", e11);
                    return "";
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return m28437c;
    }

    public final void zzl(Context context) {
        synchronized (this.zzf) {
            zzy(context);
            try {
                this.zzg.zzi();
            } catch (RemoteException unused) {
                yk0.zzg("Unable to disable mediation adapter initialization.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:31:0x006d, B:33:0x007e, B:35:0x0090, B:36:0x00d3, B:39:0x00a0, B:41:0x00ae, B:43:0x00c0, B:44:0x00cb, B:45:0x0062, B:49:0x0068), top: B:25:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae A[Catch: all -> 0x005d, TryCatch #1 {all -> 0x005d, RemoteException -> 0x0060, blocks: (B:26:0x0034, B:28:0x0054, B:31:0x006d, B:33:0x007e, B:35:0x0090, B:36:0x00d3, B:39:0x00a0, B:41:0x00ae, B:43:0x00c0, B:44:0x00cb, B:45:0x0062, B:49:0x0068), top: B:25:0x0034 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzm(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzb) {
            try {
                if (this.zzd) {
                    if (onInitializationCompleteListener != null) {
                        this.zzc.add(onInitializationCompleteListener);
                    }
                    return;
                }
                if (this.zze) {
                    if (onInitializationCompleteListener != null) {
                        onInitializationCompleteListener.onInitializationComplete(zze());
                    }
                    return;
                }
                this.zzd = true;
                if (onInitializationCompleteListener != null) {
                    this.zzc.add(onInitializationCompleteListener);
                }
                if (context != null) {
                    synchronized (this.zzf) {
                        try {
                            zzy(context);
                            this.zzg.zzr(new zzec(this, null));
                            this.zzg.zzn(new s90());
                        } catch (RemoteException e11) {
                            yk0.zzk("MobileAdsSettingManager initialization failed", e11);
                        } finally {
                        }
                        if (this.zzi.getTagForChildDirectedTreatment() == -1) {
                            if (this.zzi.getTagForUnderAgeOfConsent() != -1) {
                            }
                            AbstractC4554gx.m22622c(context);
                            if (((Boolean) AbstractC5149wy.f30253a.m24091e()).booleanValue()) {
                                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21050L8)).booleanValue()) {
                                    yk0.zze("Initializing on bg thread");
                                    nk0.f25221a.execute(new Runnable(context, null, onInitializationCompleteListener) { // from class: com.google.android.gms.ads.internal.client.zzdw
                                        public final /* synthetic */ Context zzb;
                                        public final /* synthetic */ OnInitializationCompleteListener zzc;

                                        public /* synthetic */ zzdw(Context context2, String str2, OnInitializationCompleteListener onInitializationCompleteListener2) {
                                            this.zzb = context2;
                                            this.zzc = onInitializationCompleteListener2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzed.this.zzn(this.zzb, null, this.zzc);
                                        }
                                    });
                                }
                            }
                            if (((Boolean) AbstractC5149wy.f30254b.m24091e()).booleanValue()) {
                                if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21050L8)).booleanValue()) {
                                    nk0.f25222b.execute(new Runnable(context2, null, onInitializationCompleteListener2) { // from class: com.google.android.gms.ads.internal.client.zzdx
                                        public final /* synthetic */ Context zzb;
                                        public final /* synthetic */ OnInitializationCompleteListener zzc;

                                        public /* synthetic */ zzdx(Context context2, String str2, OnInitializationCompleteListener onInitializationCompleteListener2) {
                                            this.zzb = context2;
                                            this.zzc = onInitializationCompleteListener2;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            zzed.this.zzo(this.zzb, null, this.zzc);
                                        }
                                    });
                                }
                            }
                            yk0.zze("Initializing on calling thread");
                            zzx(context2, null, onInitializationCompleteListener2);
                        }
                        zzz(this.zzi);
                        AbstractC4554gx.m22622c(context2);
                        if (((Boolean) AbstractC5149wy.f30253a.m24091e()).booleanValue()) {
                        }
                        if (((Boolean) AbstractC5149wy.f30254b.m24091e()).booleanValue()) {
                        }
                        yk0.zze("Initializing on calling thread");
                        zzx(context2, null, onInitializationCompleteListener2);
                    }
                    return;
                }
                throw new IllegalArgumentException("Context cannot be null.");
            } finally {
            }
        }
    }

    public final /* synthetic */ void zzn(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final /* synthetic */ void zzo(Context context, String str, OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            zzx(context, null, onInitializationCompleteListener);
        }
    }

    public final void zzp(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzf) {
            zzy(context);
            this.zzh = onAdInspectorClosedListener;
            try {
                this.zzg.zzl(new zzea(null));
            } catch (RemoteException unused) {
                yk0.zzg("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final void zzq(Context context, String str) {
        boolean z11;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC4205o.m19727p(z11, "MobileAds.initialize() must be called prior to opening debug menu.");
            try {
                this.zzg.zzm(BinderC4273d.m19913I3(context), str);
            } catch (RemoteException e11) {
                yk0.zzh("Unable to open debug menu.", e11);
            }
        }
    }

    public final void zzr(Class cls) {
        synchronized (this.zzf) {
            try {
                this.zzg.zzh(cls.getCanonicalName());
            } catch (RemoteException e11) {
                yk0.zzh("Unable to register RtbAdapter", e11);
            }
        }
    }

    public final void zzs(boolean z11) {
        boolean z12;
        synchronized (this.zzf) {
            if (this.zzg != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            AbstractC4205o.m19727p(z12, "MobileAds.initialize() must be called prior to setting app muted state.");
            try {
                this.zzg.zzo(z11);
            } catch (RemoteException e11) {
                yk0.zzh("Unable to set app mute state.", e11);
            }
        }
    }

    public final void zzt(float f11) {
        boolean z11;
        boolean z12 = true;
        if (f11 >= 0.0f && f11 <= 1.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzf) {
            if (this.zzg == null) {
                z12 = false;
            }
            AbstractC4205o.m19727p(z12, "MobileAds.initialize() must be called prior to setting the app volume.");
            try {
                this.zzg.zzp(f11);
            } catch (RemoteException e11) {
                yk0.zzh("Unable to set app volume.", e11);
            }
        }
    }

    public final void zzu(RequestConfiguration requestConfiguration) {
        boolean z11;
        if (requestConfiguration != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        AbstractC4205o.m19713b(z11, "Null passed to setRequestConfiguration.");
        synchronized (this.zzf) {
            try {
                RequestConfiguration requestConfiguration2 = this.zzi;
                this.zzi = requestConfiguration;
                if (this.zzg == null) {
                    return;
                }
                if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                    zzz(requestConfiguration);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean zzv() {
        synchronized (this.zzf) {
            zzcm zzcmVar = this.zzg;
            boolean z11 = false;
            if (zzcmVar == null) {
                return false;
            }
            try {
                z11 = zzcmVar.zzt();
            } catch (RemoteException e11) {
                yk0.zzh("Unable to get app mute state.", e11);
            }
            return z11;
        }
    }
}
