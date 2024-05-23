package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.e10;
import com.google.android.gms.internal.ads.h00;
import com.google.android.gms.internal.ads.yk0;

/* loaded from: classes2.dex */
public final class zzej implements MediaContent {
    private final h00 zza;
    private final VideoController zzb = new VideoController();
    private final e10 zzc;

    public zzej(h00 h00Var, e10 e10Var) {
        this.zza = h00Var;
        this.zzc = e10Var;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            InterfaceC4271b zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) BinderC4273d.m19914Q(zzi);
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e11) {
            yk0.zzh("Exception occurred while getting video controller", e11);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.zza.zzj(BinderC4273d.m19913I3(drawable));
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final e10 zza() {
        return this.zzc;
    }

    public final h00 zzb() {
        return this.zza;
    }
}
