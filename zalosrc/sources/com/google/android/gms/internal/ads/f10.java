package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.dynamic.BinderC4273d;
import java.util.List;

/* loaded from: classes2.dex */
public final class f10 implements NativeCustomTemplateAd {

    /* renamed from: a */
    private final e10 f19923a;

    /* renamed from: b */
    private final MediaView f19924b;

    /* renamed from: c */
    private final VideoController f19925c = new VideoController();

    /* renamed from: d */
    private NativeCustomTemplateAd.DisplayOpenMeasurement f19926d;

    public f10(e10 e10Var) {
        Context context;
        this.f19923a = e10Var;
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
                if (true == this.f19923a.mo20783r(BinderC4273d.m19913I3(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e12) {
                yk0.zzh("", e12);
            }
        }
        this.f19924b = mediaView;
    }

    /* renamed from: a */
    public final e10 m21864a() {
        return this.f19923a;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.f19923a.zzl();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final List getAvailableAssetNames() {
        try {
            return this.f19923a.zzk();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final String getCustomTemplateId() {
        try {
            return this.f19923a.zzi();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.f19926d == null && this.f19923a.zzq()) {
                this.f19926d = new d00(this.f19923a);
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return this.f19926d;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeAd.Image getImage(String str) {
        try {
            k00 mo20781Z = this.f19923a.mo20781Z(str);
            if (mo20781Z != null) {
                return new l00(mo20781Z);
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final CharSequence getText(String str) {
        try {
            return this.f19923a.mo20780B4(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            com.google.android.gms.ads.internal.client.zzdk zze = this.f19923a.zze();
            if (zze != null) {
                this.f19925c.zzb(zze);
            }
        } catch (RemoteException e11) {
            yk0.zzh("Exception occurred while getting video controller", e11);
        }
        return this.f19925c;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.f19924b;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.f19923a.zzn(str);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.f19923a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }
}
