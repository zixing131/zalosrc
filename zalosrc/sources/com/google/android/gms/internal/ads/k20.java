package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class k20 extends UnifiedNativeAd {

    /* renamed from: a */
    private final j20 f23069a;

    /* renamed from: c */
    private final l00 f23071c;

    /* renamed from: e */
    private final NativeAd.AdChoicesInfo f23073e;

    /* renamed from: b */
    private final List f23070b = new ArrayList();

    /* renamed from: d */
    private final VideoController f23072d = new VideoController();

    /* renamed from: f */
    private final List f23074f = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|2|3|(2:5|(5:8|(1:22)(2:12|(1:14)(1:21))|(3:16|17|18)(1:20)|19|6))|24|25|(2:27|(5:30|(1:32)(1:39)|(3:34|35|36)(1:38)|37|28))|(2:41|42)|(7:44|45|46|47|(2:49|50)|52|53)|58|45|46|47|(0)|52|53) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c0, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c1, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r6);     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3 A[Catch: RemoteException -> 0x00c0, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00c0, blocks: (B:47:0x00ab, B:49:0x00b3), top: B:46:0x00ab }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k20(j20 j20Var) {
        l00 l00Var;
        k00 zzk;
        zzcu zzcuVar;
        k00 k00Var;
        IBinder iBinder;
        this.f23069a = j20Var;
        c00 c00Var = null;
        try {
            List mo22109a = j20Var.mo22109a();
            if (mo22109a != null) {
                for (Object obj : mo22109a) {
                    if (!(obj instanceof IBinder) || (iBinder = (IBinder) obj) == null) {
                        k00Var = null;
                    } else {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                        if (queryLocalInterface instanceof k00) {
                            k00Var = (k00) queryLocalInterface;
                        } else {
                            k00Var = new i00(iBinder);
                        }
                    }
                    if (k00Var != null) {
                        this.f23070b.add(new l00(k00Var));
                    }
                }
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        try {
            List zzv = this.f23069a.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    if (obj2 instanceof IBinder) {
                        zzcuVar = zzct.zzb((IBinder) obj2);
                    } else {
                        zzcuVar = null;
                    }
                    if (zzcuVar != null) {
                        this.f23074f.add(new zzcv(zzcuVar));
                    }
                }
            }
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
        try {
            zzk = this.f23069a.zzk();
        } catch (RemoteException e13) {
            yk0.zzh("", e13);
        }
        if (zzk != null) {
            l00Var = new l00(zzk);
            this.f23071c = l00Var;
            if (this.f23069a.zzi() != null) {
                c00Var = new c00(this.f23069a.zzi());
            }
            this.f23073e = c00Var;
        }
        l00Var = null;
        this.f23071c = l00Var;
        if (this.f23069a.zzi() != null) {
        }
        this.f23073e = c00Var;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f23069a.mo22112g();
        } catch (RemoteException e11) {
            yk0.zzh("Failed to cancelUnconfirmedClick", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void destroy() {
        try {
            this.f23069a.zzx();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f23069a.zzC();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f23073e;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getAdvertiser() {
        try {
            return this.f23069a.zzn();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getBody() {
        try {
            return this.f23069a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getCallToAction() {
        try {
            return this.f23069a.zzp();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.f23069a.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getHeadline() {
        try {
            return this.f23069a.zzq();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final NativeAd.Image getIcon() {
        return this.f23071c;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getImages() {
        return this.f23070b;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.f23069a.zzj() != null) {
                return new zzej(this.f23069a.zzj(), null);
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getMediationAdapterClassName() {
        try {
            return this.f23069a.zzr();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final List getMuteThisAdReasons() {
        return this.f23074f;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getPrice() {
        try {
            return this.f23069a.zzs();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final ResponseInfo getResponseInfo() {
        zzdh zzdhVar;
        try {
            zzdhVar = this.f23069a.zzg();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            zzdhVar = null;
        }
        return ResponseInfo.zza(zzdhVar);
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Double getStarRating() {
        try {
            double zze = this.f23069a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final String getStore() {
        try {
            return this.f23069a.zzt();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final VideoController getVideoController() {
        try {
            if (this.f23069a.zzh() != null) {
                this.f23072d.zzb(this.f23069a.zzh());
            }
        } catch (RemoteException e11) {
            yk0.zzh("Exception occurred while getting video controller", e11);
        }
        return this.f23072d;
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f23069a.mo22110e();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f23069a.mo22113i();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.f23069a.mo22113i()) {
                    if (muteThisAdReason == null) {
                        this.f23069a.mo22108Y0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcv) {
                        this.f23069a.mo22108Y0(((zzcv) muteThisAdReason).zza());
                        return;
                    } else {
                        yk0.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e11) {
                yk0.zzh("", e11);
            }
            yk0.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f23069a.mo22114v2(bundle);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f23069a.zzA();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f23069a.mo22106T1(bundle);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f23069a.mo22116z3(bundle);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f23069a.mo22111e2(new zzcr(muteThisAdListener));
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f23069a.mo22107W1(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
        } catch (RemoteException e11) {
            yk0.zzh("Failed to setOnPaidEventListener", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final void setUnconfirmedClickListener(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f23069a.mo22115x4(new v20(unconfirmedClickListener));
        } catch (RemoteException e11) {
            yk0.zzh("Failed to setUnconfirmedClickListener", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.UnifiedNativeAd
    public final Object zza() {
        try {
            InterfaceC4271b zzl = this.f23069a.zzl();
            if (zzl != null) {
                return BinderC4273d.m19914Q(zzl);
            }
            return null;
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }
}
