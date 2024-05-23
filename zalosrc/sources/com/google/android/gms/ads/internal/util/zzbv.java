package com.google.android.gms.ads.internal.util;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.m23;

/* loaded from: classes2.dex */
public final class zzbv {
    private HandlerThread zza = null;
    private Handler zzb = null;
    private int zzc = 0;
    private final Object zzd = new Object();

    public final Handler zza() {
        return this.zzb;
    }

    public final Looper zzb() {
        Looper looper;
        synchronized (this.zzd) {
            try {
                if (this.zzc == 0) {
                    if (this.zza == null) {
                        zze.zza("Starting the looper thread.");
                        HandlerThread handlerThread = new HandlerThread("LooperProvider");
                        this.zza = handlerThread;
                        handlerThread.start();
                        this.zzb = new m23(this.zza.getLooper());
                        zze.zza("Looper thread started.");
                    } else {
                        zze.zza("Resuming the looper thread");
                        this.zzd.notifyAll();
                    }
                } else {
                    AbstractC4205o.m19723l(this.zza, "Invalid state: mHandlerThread should already been initialized.");
                }
                this.zzc++;
                looper = this.zza.getLooper();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }
}
