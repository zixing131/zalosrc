package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbSignalData;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ac0 extends ob0 {

    /* renamed from: p */
    private final RtbAdapter f16989p;

    /* renamed from: q */
    private MediationInterstitialAd f16990q;

    /* renamed from: r */
    private MediationRewardedAd f16991r;

    /* renamed from: s */
    private String f16992s = "";

    public ac0(RtbAdapter rtbAdapter) {
        this.f16989p = rtbAdapter;
    }

    /* renamed from: W4 */
    private final Bundle m20056W4(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.f16989p.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    /* renamed from: X4 */
    private static final Bundle m20057X4(String str) {
        yk0.zzj("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                return bundle2;
            }
            return bundle;
        } catch (JSONException e11) {
            yk0.zzh("", e11);
            throw new RemoteException();
        }
    }

    /* renamed from: Y4 */
    private static final boolean m20058Y4(zzl zzlVar) {
        if (!zzlVar.zzf) {
            zzaw.zzb();
            if (!rk0.m26109s()) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: Z4 */
    private static final String m20059Z4(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: C0 */
    public final void mo20060C0(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, cb0 cb0Var, ba0 ba0Var, zzq zzqVar) {
        try {
            this.f16989p.loadRtbInterscrollerAd(new MediationBannerAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), str, m20057X4(str2), m20056W4(zzlVar), m20058Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m20059Z4(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f16992s), new vb0(this, cb0Var, ba0Var));
        } catch (Throwable th2) {
            yk0.zzh("Adapter failed to render interscroller ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: Q1 */
    public final void mo20061Q1(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, mb0 mb0Var, ba0 ba0Var) {
        try {
            this.f16989p.loadRtbRewardedAd(new MediationRewardedAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), str, m20057X4(str2), m20056W4(zzlVar), m20058Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m20059Z4(str2, zzlVar), this.f16992s), new zb0(this, mb0Var, ba0Var));
        } catch (Throwable th2) {
            yk0.zzh("Adapter failed to render rewarded ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: R2 */
    public final void mo20062R2(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, ib0 ib0Var, ba0 ba0Var) {
        mo20070y1(str, str2, zzlVar, interfaceC4271b, ib0Var, ba0Var, null);
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: W0 */
    public final boolean mo20063W0(InterfaceC4271b interfaceC4271b) {
        MediationInterstitialAd mediationInterstitialAd = this.f16990q;
        if (mediationInterstitialAd != null) {
            try {
                mediationInterstitialAd.showAd((Context) BinderC4273d.m19914Q(interfaceC4271b));
                return true;
            } catch (Throwable th2) {
                yk0.zzh("", th2);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: b0 */
    public final void mo20064b0(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, cb0 cb0Var, ba0 ba0Var, zzq zzqVar) {
        try {
            this.f16989p.loadRtbBannerAd(new MediationBannerAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), str, m20057X4(str2), m20056W4(zzlVar), m20058Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m20059Z4(str2, zzlVar), zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza), this.f16992s), new ub0(this, cb0Var, ba0Var));
        } catch (Throwable th2) {
            yk0.zzh("Adapter failed to render banner ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: c2 */
    public final void mo20065c2(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, mb0 mb0Var, ba0 ba0Var) {
        try {
            this.f16989p.loadRtbRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), str, m20057X4(str2), m20056W4(zzlVar), m20058Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m20059Z4(str2, zzlVar), this.f16992s), new zb0(this, mb0Var, ba0Var));
        } catch (Throwable th2) {
            yk0.zzh("Adapter failed to render rewarded interstitial ad.", th2);
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: c4 */
    public final void mo20066c4(InterfaceC4271b interfaceC4271b, String str, Bundle bundle, Bundle bundle2, zzq zzqVar, sb0 sb0Var) {
        char c11;
        AdFormat adFormat;
        try {
            yb0 yb0Var = new yb0(this, sb0Var);
            RtbAdapter rtbAdapter = this.f16989p;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1911491517:
                    if (str.equals("rewarded_interstitial")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            if (c11 != 0) {
                if (c11 != 1) {
                    if (c11 != 2) {
                        if (c11 != 3) {
                            if (c11 == 4) {
                                adFormat = AdFormat.NATIVE;
                            } else {
                                throw new IllegalArgumentException("Internal Error");
                            }
                        } else {
                            adFormat = AdFormat.REWARDED_INTERSTITIAL;
                        }
                    } else {
                        adFormat = AdFormat.REWARDED;
                    }
                } else {
                    adFormat = AdFormat.INTERSTITIAL;
                }
            } else {
                adFormat = AdFormat.BANNER;
            }
            MediationConfiguration mediationConfiguration = new MediationConfiguration(adFormat, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mediationConfiguration);
            rtbAdapter.collectSignals(new RtbSignalData((Context) BinderC4273d.m19914Q(interfaceC4271b), arrayList, bundle, zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza)), yb0Var);
        } catch (Throwable th2) {
            yk0.zzh("Error generating signals for RTB", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: l */
    public final void mo20067l(String str) {
        this.f16992s = str;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: n0 */
    public final void mo20068n0(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, fb0 fb0Var, ba0 ba0Var) {
        try {
            this.f16989p.loadRtbInterstitialAd(new MediationInterstitialAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), str, m20057X4(str2), m20056W4(zzlVar), m20058Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m20059Z4(str2, zzlVar), this.f16992s), new wb0(this, fb0Var, ba0Var));
        } catch (Throwable th2) {
            yk0.zzh("Adapter failed to render interstitial ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: r */
    public final boolean mo20069r(InterfaceC4271b interfaceC4271b) {
        MediationRewardedAd mediationRewardedAd = this.f16991r;
        if (mediationRewardedAd != null) {
            try {
                mediationRewardedAd.showAd((Context) BinderC4273d.m19914Q(interfaceC4271b));
                return true;
            } catch (Throwable th2) {
                yk0.zzh("", th2);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    /* renamed from: y1 */
    public final void mo20070y1(String str, String str2, zzl zzlVar, InterfaceC4271b interfaceC4271b, ib0 ib0Var, ba0 ba0Var, zzbls zzblsVar) {
        try {
            this.f16989p.loadRtbNativeAd(new MediationNativeAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), str, m20057X4(str2), m20056W4(zzlVar), m20058Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m20059Z4(str2, zzlVar), this.f16992s, zzblsVar), new xb0(this, ib0Var, ba0Var));
        } catch (Throwable th2) {
            yk0.zzh("Adapter failed to render native ad.", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final com.google.android.gms.ads.internal.client.zzdk zze() {
        MediationExtrasReceiver mediationExtrasReceiver = this.f16989p;
        if (mediationExtrasReceiver instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) mediationExtrasReceiver).getVideoController();
            } catch (Throwable th2) {
                yk0.zzh("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final zzbxq zzf() {
        return zzbxq.m28714t(this.f16989p.getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.pb0
    public final zzbxq zzg() {
        return zzbxq.m28714t(this.f16989p.getSDKVersionInfo());
    }
}
