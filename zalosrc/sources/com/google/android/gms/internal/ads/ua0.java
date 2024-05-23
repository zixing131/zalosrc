package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.mediation.OnImmersiveModeUpdatedListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.zzb;
import com.google.android.gms.dynamic.BinderC4273d;
import com.google.android.gms.dynamic.InterfaceC4271b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ua0 extends x90 {

    /* renamed from: p */
    private final Object f28797p;

    /* renamed from: q */
    private wa0 f28798q;

    /* renamed from: r */
    private ng0 f28799r;

    /* renamed from: s */
    private InterfaceC4271b f28800s;

    /* renamed from: t */
    private View f28801t;

    /* renamed from: u */
    private MediationInterstitialAd f28802u;

    /* renamed from: v */
    private UnifiedNativeAdMapper f28803v;

    /* renamed from: w */
    private MediationRewardedAd f28804w;

    /* renamed from: x */
    private MediationInterscrollerAd f28805x;

    /* renamed from: y */
    private final String f28806y = "";

    public ua0(Adapter adapter) {
        this.f28797p = adapter;
    }

    /* renamed from: W4 */
    private final Bundle m26880W4(zzl zzlVar) {
        Bundle bundle;
        Bundle bundle2 = zzlVar.zzm;
        if (bundle2 != null && (bundle = bundle2.getBundle(this.f28797p.getClass().getName())) != null) {
            return bundle;
        }
        return new Bundle();
    }

    /* renamed from: X4 */
    private final Bundle m26881X4(String str, zzl zzlVar, String str2) {
        yk0.zze("Server parameters: ".concat(String.valueOf(str)));
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
                bundle = bundle2;
            }
            if (this.f28797p instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (zzlVar != null) {
                    bundle.putInt("tagForChildDirectedTreatment", zzlVar.zzg);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            yk0.zzh("", th2);
            throw new RemoteException();
        }
    }

    /* renamed from: Y4 */
    private static final boolean m26882Y4(zzl zzlVar) {
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
    private static final String m26883Z4(String str, zzl zzlVar) {
        String str2 = zzlVar.zzu;
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: G0 */
    public final void mo26887G0(InterfaceC4271b interfaceC4271b, f60 f60Var, List list) {
        char c11;
        AdFormat adFormat;
        if (this.f28797p instanceof Adapter) {
            pa0 pa0Var = new pa0(this, f60Var);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzbsa zzbsaVar = (zzbsa) it.next();
                String str = zzbsaVar.f31919p;
                switch (str.hashCode()) {
                    case -1396342996:
                        if (str.equals("banner")) {
                            c11 = 0;
                            break;
                        }
                        break;
                    case -1052618729:
                        if (str.equals("native")) {
                            c11 = 4;
                            break;
                        }
                        break;
                    case -239580146:
                        if (str.equals("rewarded")) {
                            c11 = 2;
                            break;
                        }
                        break;
                    case 604727084:
                        if (str.equals("interstitial")) {
                            c11 = 1;
                            break;
                        }
                        break;
                    case 1911491517:
                        if (str.equals("rewarded_interstitial")) {
                            c11 = 3;
                            break;
                        }
                        break;
                }
                c11 = 65535;
                if (c11 != 0) {
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    adFormat = null;
                                } else {
                                    adFormat = AdFormat.NATIVE;
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
                if (adFormat != null) {
                    arrayList.add(new MediationConfiguration(adFormat, zzbsaVar.f31920q));
                }
            }
            ((Adapter) this.f28797p).initialize((Context) BinderC4273d.m19914Q(interfaceC4271b), pa0Var, arrayList);
            return;
        }
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: I1 */
    public final void mo26888I1(InterfaceC4271b interfaceC4271b, zzq zzqVar, zzl zzlVar, String str, String str2, ba0 ba0Var) {
        if (this.f28797p instanceof Adapter) {
            yk0.zze("Requesting interscroller ad from adapter.");
            try {
                Adapter adapter = (Adapter) this.f28797p;
                adapter.loadInterscrollerAd(new MediationBannerAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), "", m26881X4(str, zzlVar, str2), m26880W4(zzlVar), m26882Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m26883Z4(str, zzlVar), zzb.zze(zzqVar.zze, zzqVar.zzb), ""), new oa0(this, ba0Var, adapter));
                return;
            } catch (Exception e11) {
                yk0.zzh("", e11);
                throw new RemoteException();
            }
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: J2 */
    public final void mo26889J2(zzl zzlVar, String str, String str2) {
        Object obj = this.f28797p;
        if (obj instanceof Adapter) {
            mo26901l0(this.f28800s, zzlVar, str, new xa0((Adapter) obj, this.f28799r));
            return;
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: J3 */
    public final void mo26890J3(InterfaceC4271b interfaceC4271b, zzq zzqVar, zzl zzlVar, String str, ba0 ba0Var) {
        mo26902m1(interfaceC4271b, zzqVar, zzlVar, str, null, ba0Var);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: P2 */
    public final void mo26891P2(InterfaceC4271b interfaceC4271b) {
        Context context = (Context) BinderC4273d.m19914Q(interfaceC4271b);
        Object obj = this.f28797p;
        if (obj instanceof OnContextChangedListener) {
            ((OnContextChangedListener) obj).onContextChanged(context);
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: S0 */
    public final void mo26892S0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ba0 ba0Var) {
        mo26907z0(interfaceC4271b, zzlVar, str, null, ba0Var);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: V0 */
    public final void mo26893V0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, String str2, ba0 ba0Var, zzbls zzblsVar, List list) {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.f28797p;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Adapter)) {
            yk0.zzj(MediationNativeAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
            throw new RemoteException();
        }
        yk0.zze("Requesting native ad from adapter.");
        Object obj2 = this.f28797p;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = zzlVar.zze;
                if (list2 != null) {
                    hashSet = new HashSet(list2);
                } else {
                    hashSet = null;
                }
                long j11 = zzlVar.zzb;
                if (j11 == -1) {
                    date = null;
                } else {
                    date = new Date(j11);
                }
                ya0 ya0Var = new ya0(date, zzlVar.zzd, hashSet, zzlVar.zzk, m26882Y4(zzlVar), zzlVar.zzg, zzblsVar, list, zzlVar.zzr, zzlVar.zzt, m26883Z4(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationNativeAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                this.f28798q = new wa0(ba0Var);
                mediationNativeAdapter.requestNativeAd((Context) BinderC4273d.m19914Q(interfaceC4271b), this.f28798q, m26881X4(str, zzlVar, str2), ya0Var, bundle);
                return;
            } catch (Throwable th2) {
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadNativeAd(new MediationNativeAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), "", m26881X4(str, zzlVar, str2), m26880W4(zzlVar), m26882Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m26883Z4(str, zzlVar), this.f28806y, zzblsVar), new sa0(this, ba0Var));
            } finally {
                yk0.zzh("", th2);
                RemoteException remoteException = new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: X3 */
    public final void mo26894X3(InterfaceC4271b interfaceC4271b) {
        Object obj = this.f28797p;
        if (!(obj instanceof Adapter) && !(obj instanceof MediationInterstitialAdapter)) {
            yk0.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
            throw new RemoteException();
        }
        if (obj instanceof MediationInterstitialAdapter) {
            mo26898e();
            return;
        }
        yk0.zze("Show interstitial ad from adapter.");
        MediationInterstitialAd mediationInterstitialAd = this.f28802u;
        if (mediationInterstitialAd != null) {
            mediationInterstitialAd.showAd((Context) BinderC4273d.m19914Q(interfaceC4271b));
        } else {
            yk0.zzg("Can not show null mediation interstitial ad.");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: a2 */
    public final void mo26895a2(zzl zzlVar, String str) {
        mo26889J2(zzlVar, str, null);
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: d */
    public final boolean mo26896d() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: d4 */
    public final void mo26897d4(InterfaceC4271b interfaceC4271b) {
        if (this.f28797p instanceof Adapter) {
            yk0.zze("Show rewarded ad from adapter.");
            MediationRewardedAd mediationRewardedAd = this.f28804w;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) BinderC4273d.m19914Q(interfaceC4271b));
                return;
            } else {
                yk0.zzg("Can not show null mediation rewarded ad.");
                throw new RemoteException();
            }
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: e */
    public final void mo26898e() {
        if (this.f28797p instanceof MediationInterstitialAdapter) {
            yk0.zze("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f28797p).showInterstitial();
                return;
            } catch (Throwable th2) {
                yk0.zzh("", th2);
                throw new RemoteException();
            }
        }
        yk0.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: h */
    public final void mo26899h() {
        if (this.f28797p instanceof Adapter) {
            MediationRewardedAd mediationRewardedAd = this.f28804w;
            if (mediationRewardedAd != null) {
                mediationRewardedAd.showAd((Context) BinderC4273d.m19914Q(this.f28800s));
                return;
            } else {
                yk0.zzg("Can not show null mediated rewarded ad.");
                throw new RemoteException();
            }
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: i3 */
    public final void mo26900i3(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ng0 ng0Var, String str2) {
        Object obj = this.f28797p;
        if (obj instanceof Adapter) {
            this.f28800s = interfaceC4271b;
            this.f28799r = ng0Var;
            ng0Var.zzl(BinderC4273d.m19913I3(obj));
            return;
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: l0 */
    public final void mo26901l0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ba0 ba0Var) {
        if (this.f28797p instanceof Adapter) {
            yk0.zze("Requesting rewarded ad from adapter.");
            try {
                ((Adapter) this.f28797p).loadRewardedAd(new MediationRewardedAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), "", m26881X4(str, zzlVar, null), m26880W4(zzlVar), m26882Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m26883Z4(str, zzlVar), ""), new ta0(this, ba0Var));
                return;
            } catch (Exception e11) {
                yk0.zzh("", e11);
                throw new RemoteException();
            }
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: m1 */
    public final void mo26902m1(InterfaceC4271b interfaceC4271b, zzq zzqVar, zzl zzlVar, String str, String str2, ba0 ba0Var) {
        AdSize zzc;
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.f28797p;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Adapter)) {
            yk0.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
            throw new RemoteException();
        }
        yk0.zze("Requesting banner ad from adapter.");
        if (zzqVar.zzn) {
            zzc = zzb.zzd(zzqVar.zze, zzqVar.zzb);
        } else {
            zzc = zzb.zzc(zzqVar.zze, zzqVar.zzb, zzqVar.zza);
        }
        AdSize adSize = zzc;
        Object obj2 = this.f28797p;
        if (obj2 instanceof MediationBannerAdapter) {
            try {
                MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j11 = zzlVar.zzb;
                if (j11 == -1) {
                    date = null;
                } else {
                    date = new Date(j11);
                }
                na0 na0Var = new na0(date, zzlVar.zzd, hashSet, zzlVar.zzk, m26882Y4(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m26883Z4(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationBannerAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationBannerAdapter.requestBannerAd((Context) BinderC4273d.m19914Q(interfaceC4271b), new wa0(ba0Var), m26881X4(str, zzlVar, str2), adSize, na0Var, bundle);
                return;
            } catch (Throwable th2) {
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadBannerAd(new MediationBannerAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), "", m26881X4(str, zzlVar, str2), m26880W4(zzlVar), m26882Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m26883Z4(str, zzlVar), adSize, this.f28806y), new qa0(this, ba0Var));
            } finally {
                yk0.zzh("", th2);
                RemoteException remoteException = new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: q0 */
    public final void mo26903q0(InterfaceC4271b interfaceC4271b, ng0 ng0Var, List list) {
        yk0.zzj("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: q1 */
    public final void mo26904q1(boolean z11) {
        Object obj = this.f28797p;
        if (obj instanceof OnImmersiveModeUpdatedListener) {
            try {
                ((OnImmersiveModeUpdatedListener) obj).onImmersiveModeUpdated(z11);
                return;
            } catch (Throwable th2) {
                yk0.zzh("", th2);
                return;
            }
        }
        yk0.zze(OnImmersiveModeUpdatedListener.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: s1 */
    public final void mo26905s1(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, ba0 ba0Var) {
        if (this.f28797p instanceof Adapter) {
            yk0.zze("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Adapter) this.f28797p).loadRewardedInterstitialAd(new MediationRewardedAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), "", m26881X4(str, zzlVar, null), m26880W4(zzlVar), m26882Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m26883Z4(str, zzlVar), ""), new ta0(this, ba0Var));
                return;
            } catch (Exception e11) {
                yk0.zzh("", e11);
                throw new RemoteException();
            }
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: u */
    public final boolean mo26906u() {
        if (this.f28797p instanceof Adapter) {
            if (this.f28799r != null) {
                return true;
            }
            return false;
        }
        yk0.zzj(Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    /* renamed from: z0 */
    public final void mo26907z0(InterfaceC4271b interfaceC4271b, zzl zzlVar, String str, String str2, ba0 ba0Var) {
        HashSet hashSet;
        Date date;
        Bundle bundle;
        Object obj = this.f28797p;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Adapter)) {
            yk0.zzj(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
            throw new RemoteException();
        }
        yk0.zze("Requesting interstitial ad from adapter.");
        Object obj2 = this.f28797p;
        if (obj2 instanceof MediationInterstitialAdapter) {
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
                List list = zzlVar.zze;
                if (list != null) {
                    hashSet = new HashSet(list);
                } else {
                    hashSet = null;
                }
                long j11 = zzlVar.zzb;
                if (j11 == -1) {
                    date = null;
                } else {
                    date = new Date(j11);
                }
                na0 na0Var = new na0(date, zzlVar.zzd, hashSet, zzlVar.zzk, m26882Y4(zzlVar), zzlVar.zzg, zzlVar.zzr, zzlVar.zzt, m26883Z4(str, zzlVar));
                Bundle bundle2 = zzlVar.zzm;
                if (bundle2 != null) {
                    bundle = bundle2.getBundle(mediationInterstitialAdapter.getClass().getName());
                } else {
                    bundle = null;
                }
                mediationInterstitialAdapter.requestInterstitialAd((Context) BinderC4273d.m19914Q(interfaceC4271b), new wa0(ba0Var), m26881X4(str, zzlVar, str2), na0Var, bundle);
                return;
            } catch (Throwable th2) {
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Adapter) {
            try {
                ((Adapter) obj2).loadInterstitialAd(new MediationInterstitialAdConfiguration((Context) BinderC4273d.m19914Q(interfaceC4271b), "", m26881X4(str, zzlVar, str2), m26880W4(zzlVar), m26882Y4(zzlVar), zzlVar.zzk, zzlVar.zzg, zzlVar.zzt, m26883Z4(str, zzlVar), this.f28806y), new ra0(this, ba0Var));
            } finally {
                yk0.zzh("", th2);
                RemoteException remoteException = new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void zzD() {
        Object obj = this.f28797p;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onPause();
        } catch (Throwable th2) {
            yk0.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void zzE() {
        Object obj = this.f28797p;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onResume();
        } catch (Throwable th2) {
            yk0.zzh("", th2);
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ga0 zzM() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ha0 zzN() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final Bundle zze() {
        Object obj = this.f28797p;
        if (!(obj instanceof zzcok)) {
            yk0.zzj(zzcok.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
            return new Bundle();
        }
        return ((zzcok) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final Bundle zzf() {
        Object obj = this.f28797p;
        if (!(obj instanceof zzcol)) {
            yk0.zzj(zzcol.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
            return new Bundle();
        }
        return ((zzcol) obj).getInterstitialAdapterInfo();
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final com.google.android.gms.ads.internal.client.zzdk zzh() {
        Object obj = this.f28797p;
        if (obj instanceof com.google.android.gms.ads.mediation.zzb) {
            try {
                return ((com.google.android.gms.ads.mediation.zzb) obj).getVideoController();
            } catch (Throwable th2) {
                yk0.zzh("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final e10 zzi() {
        wa0 wa0Var = this.f28798q;
        if (wa0Var != null) {
            NativeCustomTemplateAd m27582a = wa0Var.m27582a();
            if (m27582a instanceof f10) {
                return ((f10) m27582a).m21864a();
            }
            return null;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ea0 zzj() {
        MediationInterscrollerAd mediationInterscrollerAd = this.f28805x;
        if (mediationInterscrollerAd != null) {
            return new va0(mediationInterscrollerAd);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final ka0 zzk() {
        UnifiedNativeAdMapper unifiedNativeAdMapper;
        UnifiedNativeAdMapper m27583b;
        Object obj = this.f28797p;
        if (obj instanceof MediationNativeAdapter) {
            wa0 wa0Var = this.f28798q;
            if (wa0Var != null && (m27583b = wa0Var.m27583b()) != null) {
                return new za0(m27583b);
            }
            return null;
        }
        if ((obj instanceof Adapter) && (unifiedNativeAdMapper = this.f28803v) != null) {
            return new za0(unifiedNativeAdMapper);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final zzbxq zzl() {
        Object obj = this.f28797p;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbxq.m28714t(((Adapter) obj).getVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final zzbxq zzm() {
        Object obj = this.f28797p;
        if (!(obj instanceof Adapter)) {
            return null;
        }
        return zzbxq.m28714t(((Adapter) obj).getSDKVersionInfo());
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final InterfaceC4271b zzn() {
        Object obj = this.f28797p;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return BinderC4273d.m19913I3(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                yk0.zzh("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof Adapter) {
            return BinderC4273d.m19913I3(this.f28801t);
        }
        yk0.zzj(MediationBannerAdapter.class.getCanonicalName() + " or " + Adapter.class.getCanonicalName() + " #009 Class mismatch: " + this.f28797p.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.y90
    public final void zzo() {
        Object obj = this.f28797p;
        if (!(obj instanceof MediationAdapter)) {
            return;
        }
        try {
            ((MediationAdapter) obj).onDestroy();
        } catch (Throwable th2) {
            yk0.zzh("", th2);
            throw new RemoteException();
        }
    }

    public ua0(MediationAdapter mediationAdapter) {
        this.f28797p = mediationAdapter;
    }
}
