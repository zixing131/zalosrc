package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzcr;
import com.google.android.gms.ads.internal.client.zzct;
import com.google.android.gms.ads.internal.client.zzcu;
import com.google.android.gms.ads.internal.client.zzcv;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class vc0 extends NativeAd {

    /* renamed from: a */
    private final j20 f29268a;

    /* renamed from: c */
    private final uc0 f29270c;

    /* renamed from: d */
    private final NativeAd.AdChoicesInfo f29271d;

    /* renamed from: b */
    private final List f29269b = new ArrayList();

    /* renamed from: e */
    private final List f29272e = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(17:1|2|3|(2:5|(5:8|(1:10)(1:17)|(3:12|13|14)(1:16)|15|6))|19|20|(2:22|(5:25|(1:27)(1:34)|(3:29|30|31)(1:33)|32|23))|36|37|(7:39|40|41|42|(2:44|45)|47|48)|53|40|41|42|(0)|47|48) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a9, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00aa, code lost:            com.google.android.gms.internal.ads.yk0.zzh("", r6);     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c A[Catch: RemoteException -> 0x00a9, TRY_LEAVE, TryCatch #0 {RemoteException -> 0x00a9, blocks: (B:42:0x0094, B:44:0x009c), top: B:41:0x0094 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vc0(j20 j20Var) {
        uc0 uc0Var;
        k00 zzk;
        zzcu zzcuVar;
        k00 k00Var;
        this.f29268a = j20Var;
        sc0 sc0Var = null;
        try {
            List mo22109a = j20Var.mo22109a();
            if (mo22109a != null) {
                for (Object obj : mo22109a) {
                    if (obj instanceof IBinder) {
                        k00Var = j00.m23497N((IBinder) obj);
                    } else {
                        k00Var = null;
                    }
                    if (k00Var != null) {
                        this.f29269b.add(new uc0(k00Var));
                    }
                }
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        try {
            List zzv = this.f29268a.zzv();
            if (zzv != null) {
                for (Object obj2 : zzv) {
                    if (obj2 instanceof IBinder) {
                        zzcuVar = zzct.zzb((IBinder) obj2);
                    } else {
                        zzcuVar = null;
                    }
                    if (zzcuVar != null) {
                        this.f29272e.add(new zzcv(zzcuVar));
                    }
                }
            }
        } catch (RemoteException e12) {
            yk0.zzh("", e12);
        }
        try {
            zzk = this.f29268a.zzk();
        } catch (RemoteException e13) {
            yk0.zzh("", e13);
        }
        if (zzk != null) {
            uc0Var = new uc0(zzk);
            this.f29270c = uc0Var;
            if (this.f29268a.zzi() != null) {
                sc0Var = new sc0(this.f29268a.zzi());
            }
            this.f29271d = sc0Var;
        }
        uc0Var = null;
        this.f29270c = uc0Var;
        if (this.f29268a.zzi() != null) {
        }
        this.f29271d = sc0Var;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.f29268a.mo22112g();
        } catch (RemoteException e11) {
            yk0.zzh("Failed to cancelUnconfirmedClick", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.f29268a.zzx();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.f29268a.zzC();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.f29271d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.f29268a.zzn();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.f29268a.zzo();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.f29268a.zzp();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzf = this.f29268a.zzf();
            if (zzf != null) {
                return zzf;
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.f29268a.zzq();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.f29270c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getImages() {
        return this.f29269b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            if (this.f29268a.zzj() != null) {
                return new zzej(this.f29268a.zzj(), null);
            }
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List getMuteThisAdReasons() {
        return this.f29272e;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.f29268a.zzs();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        zzdh zzdhVar;
        try {
            zzdhVar = this.f29268a.zzg();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            zzdhVar = null;
        }
        return ResponseInfo.zza(zzdhVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double zze = this.f29268a.zze();
            if (zze == -1.0d) {
                return null;
            }
            return Double.valueOf(zze);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.f29268a.zzt();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.f29268a.mo22110e();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.f29268a.mo22113i();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.f29268a.mo22113i()) {
                    if (muteThisAdReason == null) {
                        this.f29268a.mo22108Y0(null);
                        return;
                    } else if (muteThisAdReason instanceof zzcv) {
                        this.f29268a.mo22108Y0(((zzcv) muteThisAdReason).zza());
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

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.f29268a.mo22114v2(bundle);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.f29268a.zzA();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.f29268a.mo22106T1(bundle);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.f29268a.mo22116z3(bundle);
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.f29268a.mo22111e2(new zzcr(muteThisAdListener));
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f29268a.mo22107W1(new com.google.android.gms.ads.internal.client.zzey(onPaidEventListener));
        } catch (RemoteException e11) {
            yk0.zzh("Failed to setOnPaidEventListener", e11);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.f29268a.mo22115x4(new dd0(unconfirmedClickListener));
        } catch (RemoteException e11) {
            yk0.zzh("Failed to setUnconfirmedClickListener", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.f29268a.zzm();
        } catch (RemoteException e11) {
            yk0.zzh("", e11);
            return null;
        }
    }
}
