package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdn;

/* loaded from: classes2.dex */
public final class uj1 extends zzdj {

    /* renamed from: p */
    private final Object f28955p = new Object();

    /* renamed from: q */
    private final com.google.android.gms.ads.internal.client.zzdk f28956q;

    /* renamed from: r */
    private final ka0 f28957r;

    public uj1(com.google.android.gms.ads.internal.client.zzdk zzdkVar, ka0 ka0Var) {
        this.f28956q = zzdkVar;
        this.f28957r = ka0Var;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zze() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzf() {
        ka0 ka0Var = this.f28957r;
        if (ka0Var != null) {
            return ka0Var.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final float zzg() {
        ka0 ka0Var = this.f28957r;
        if (ka0Var != null) {
            return ka0Var.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final int zzh() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final zzdn zzi() {
        synchronized (this.f28955p) {
            try {
                com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.f28956q;
                if (zzdkVar != null) {
                    return zzdkVar.zzi();
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzj(boolean z11) {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzk() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzl() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzm(zzdn zzdnVar) {
        synchronized (this.f28955p) {
            try {
                com.google.android.gms.ads.internal.client.zzdk zzdkVar = this.f28956q;
                if (zzdkVar != null) {
                    zzdkVar.zzm(zzdnVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final void zzn() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzo() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzp() {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzdk
    public final boolean zzq() {
        throw new RemoteException();
    }
}
