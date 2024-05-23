package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.BinderC4473eq;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.s90;
import com.google.android.gms.internal.ads.yk0;
import java.util.concurrent.atomic.AtomicBoolean;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public final class zzdu {
    final zzax zza;
    private final s90 zzb;
    private final zzp zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;
    private AppEventListener zzi;
    private zzbs zzj;
    private VideoOptions zzk;
    private String zzl;

    @NotOnlyInitialized
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;
    private OnPaidEventListener zzp;

    public zzdu(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzp.zza, null, 0);
    }

    private static zzq zzC(Context context, AdSize[] adSizeArr, int i11) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return zzq.zze();
            }
        }
        zzq zzqVar = new zzq(context, adSizeArr);
        zzqVar.zzj = zzD(i11);
        return zzqVar;
    }

    private static boolean zzD(int i11) {
        return i11 == 1;
    }

    public final boolean zzA() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                return zzbsVar.zzY();
            }
            return false;
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            return false;
        }
    }

    public final AdSize[] zzB() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    public final AdSize zzb() {
        zzq zzg;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null && (zzg = zzbsVar.zzg()) != null) {
                return com.google.android.gms.ads.zzb.zzc(zzg.zze, zzg.zzb, zzg.zza);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    public final ResponseInfo zzd() {
        zzdh zzdhVar = null;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzdhVar = zzbsVar.zzk();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        return ResponseInfo.zza(zzdhVar);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    public final AppEventListener zzh() {
        return this.zzi;
    }

    public final zzdk zzi() {
        zzbs zzbsVar = this.zzj;
        if (zzbsVar != null) {
            try {
                return zzbsVar.zzl();
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
        return null;
    }

    public final String zzj() {
        zzbs zzbsVar;
        if (this.zzl == null && (zzbsVar = this.zzj) != null) {
            try {
                this.zzl = zzbsVar.zzr();
            } catch (RemoteException e11) {
                yk0.zzl("#007 Could not call remote method.", e11);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzx();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final /* synthetic */ void zzl(InterfaceC4271b interfaceC4271b) {
        this.zzm.addView((View) BinderC4273d.m19914Q(interfaceC4271b));
    }

    public final void zzm(zzdr zzdrVar) {
        zzbs zzbsVar;
        try {
            if (this.zzj == null) {
                if (this.zzh != null && this.zzl != null) {
                    Context context = this.zzm.getContext();
                    zzq zzC = zzC(context, this.zzh, this.zzn);
                    if ("search_v2".equals(zzC.zza)) {
                        zzbsVar = (zzbs) new zzaj(zzaw.zza(), context, zzC, this.zzl).zzd(context, false);
                    } else {
                        zzbsVar = (zzbs) new zzah(zzaw.zza(), context, zzC, this.zzl, this.zzb).zzd(context, false);
                    }
                    this.zzj = zzbsVar;
                    zzbsVar.zzD(new zzg(this.zza));
                    zza zzaVar = this.zzf;
                    if (zzaVar != null) {
                        this.zzj.zzC(new zzb(zzaVar));
                    }
                    AppEventListener appEventListener = this.zzi;
                    if (appEventListener != null) {
                        this.zzj.zzG(new BinderC4473eq(appEventListener));
                    }
                    if (this.zzk != null) {
                        this.zzj.zzU(new zzff(this.zzk));
                    }
                    this.zzj.zzP(new zzey(this.zzp));
                    this.zzj.zzN(this.zzo);
                    zzbs zzbsVar2 = this.zzj;
                    if (zzbsVar2 != null) {
                        try {
                            InterfaceC4271b zzn = zzbsVar2.zzn();
                            if (zzn != null) {
                                if (((Boolean) AbstractC5149wy.f30258f.m24091e()).booleanValue()) {
                                    if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                                        rk0.f27282b.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzds
                                            public final /* synthetic */ InterfaceC4271b zzb;

                                            public /* synthetic */ zzds(InterfaceC4271b zzn2) {
                                                r2 = zzn2;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzdu.this.zzl(r2);
                                            }
                                        });
                                    }
                                }
                                this.zzm.addView((View) BinderC4273d.m19914Q(zzn2));
                            }
                        } catch (RemoteException e11) {
                            yk0.zzl("#007 Could not call remote method.", e11);
                        }
                    }
                } else {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
            }
            zzbs zzbsVar3 = this.zzj;
            zzbsVar3.getClass();
            zzbsVar3.zzaa(this.zzc.zza(this.zzm.getContext(), zzdrVar));
        } catch (RemoteException e12) {
            yk0.zzl("#007 Could not call remote method.", e12);
        }
    }

    public final void zzn() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzz();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzA();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzp() {
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzB();
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzq(zza zzaVar) {
        zzb zzbVar;
        try {
            this.zzf = zzaVar;
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                if (zzaVar != null) {
                    zzbVar = new zzb(zzaVar);
                } else {
                    zzbVar = null;
                }
                zzbsVar.zzC(zzbVar);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh == null) {
            zzt(adSizeArr);
            return;
        }
        throw new IllegalStateException("The ad size can only be set once on AdView.");
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzF(zzC(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl == null) {
            this.zzl = str;
            return;
        }
        throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
    }

    public final void zzv(AppEventListener appEventListener) {
        BinderC4473eq binderC4473eq;
        try {
            this.zzi = appEventListener;
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                if (appEventListener != null) {
                    binderC4473eq = new BinderC4473eq(appEventListener);
                } else {
                    binderC4473eq = null;
                }
                zzbsVar.zzG(binderC4473eq);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzw(boolean z11) {
        this.zzo = z11;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzN(z11);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzx(OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                zzbsVar.zzP(new zzey(onPaidEventListener));
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        zzff zzffVar;
        this.zzk = videoOptions;
        try {
            zzbs zzbsVar = this.zzj;
            if (zzbsVar != null) {
                if (videoOptions == null) {
                    zzffVar = null;
                } else {
                    zzffVar = new zzff(videoOptions);
                }
                zzbsVar.zzU(zzffVar);
            }
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
        }
    }

    public final boolean zzz(zzbs zzbsVar) {
        try {
            InterfaceC4271b zzn = zzbsVar.zzn();
            if (zzn == null || ((View) BinderC4273d.m19914Q(zzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) BinderC4273d.m19914Q(zzn));
            this.zzj = zzbsVar;
            return true;
        } catch (RemoteException e11) {
            yk0.zzl("#007 Could not call remote method.", e11);
            return false;
        }
    }

    public zzdu(ViewGroup viewGroup, int i11) {
        this(viewGroup, null, false, zzp.zza, null, i11);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z11) {
        this(viewGroup, attributeSet, z11, zzp.zza, null, 0);
    }

    public zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z11, int i11) {
        this(viewGroup, attributeSet, z11, zzp.zza, null, i11);
    }

    zzdu(ViewGroup viewGroup, AttributeSet attributeSet, boolean z11, zzp zzpVar, zzbs zzbsVar, int i11) {
        zzq zzqVar;
        this.zzb = new s90();
        this.zze = new VideoController();
        this.zza = new zzdt(this);
        this.zzm = viewGroup;
        this.zzc = zzpVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i11;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzy zzyVar = new zzy(context, attributeSet);
                this.zzh = zzyVar.zzb(z11);
                this.zzl = zzyVar.zza();
                if (viewGroup.isInEditMode()) {
                    rk0 zzb = zzaw.zzb();
                    AdSize adSize = this.zzh[0];
                    int i12 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzqVar = zzq.zze();
                    } else {
                        zzq zzqVar2 = new zzq(context, adSize);
                        zzqVar2.zzj = zzD(i12);
                        zzqVar = zzqVar2;
                    }
                    zzb.m26123n(viewGroup, zzqVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e11) {
                zzaw.zzb().m26122m(viewGroup, new zzq(context, AdSize.BANNER), e11.getMessage(), e11.getMessage());
            }
        }
    }
}
