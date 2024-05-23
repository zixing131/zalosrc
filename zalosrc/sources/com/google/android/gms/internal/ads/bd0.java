package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.List;

/* loaded from: classes2.dex */
public final class bd0 implements NativeCustomFormatAd {

    /* renamed from: a */
    private final e10 f17700a;

    /* renamed from: b */
    private final MediaView f17701b;

    /* renamed from: c */
    private final VideoController f17702c = new VideoController();

    /* renamed from: d */
    private NativeCustomFormatAd.DisplayOpenMeasurement f17703d;

    public bd0(e10 e10Var) {
        Context context;
        this.f17700a = e10Var;
        MediaView mediaView = null;
        try {
            context = (Context) BinderC4273d.m19914Q(e10Var.zzh());
        } catch (RemoteException | NullPointerException e11) {
            yk0.zzh("", e11);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.f17700a.mo20783r(BinderC4273d.m19913I3(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e12) {
                yk0.zzh("", e12);
            }
        }
        this.f17701b = mediaView;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void destroy() {
        try {
            this.f17700a.zzl();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final List getAvailableAssetNames() {
        try {
            return this.f17700a.zzk();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final String getCustomFormatId() {
        try {
            return this.f17700a.zzi();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f17703d == null && this.f17700a.zzq()) {
                this.f17703d = new tc0(this.f17700a);
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return this.f17703d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final NativeAd.Image getImage(String str) {
        try {
            k00 mo20781Z = this.f17700a.mo20781Z(str);
            if (mo20781Z != null) {
                return new uc0(mo20781Z);
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaContent getMediaContent() {
        try {
            if (this.f17700a.zzf() != null) {
                return new zzej(this.f17700a.zzf(), this.f17700a);
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final CharSequence getText(String str) {
        try {
            return this.f17700a.mo20780B4(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final VideoController getVideoController() {
        try {
            com.google.android.gms.ads.internal.client.zzdk zze = this.f17700a.zze();
            if (zze != null) {
                this.f17702c.zzb(zze);
            }
        } catch (RemoteException e11) {
            yk0.zzh("Exception occurred while getting video controller", e11);
        }
        return this.f17702c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final MediaView getVideoMediaView() {
        return this.f17701b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void performClick(String str) {
        try {
            this.f17700a.zzn(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeCustomFormatAd
    public final void recordImpression() {
        try {
            this.f17700a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }
}
