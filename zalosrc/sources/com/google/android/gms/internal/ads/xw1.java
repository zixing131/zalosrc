package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzdh;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xw1 {

    /* renamed from: a */
    final Map f30647a = new HashMap();

    /* renamed from: b */
    private final Context f30648b;

    /* renamed from: c */
    private final kw1 f30649c;

    /* renamed from: d */
    private final uc3 f30650d;

    /* renamed from: e */
    private cw1 f30651e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xw1(Context context, kw1 kw1Var, uc3 uc3Var) {
        this.f30648b = context;
        this.f30649c = kw1Var;
        this.f30650d = uc3Var;
    }

    /* renamed from: h */
    private static AdRequest m28044h() {
        return new AdRequest.Builder().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static String m28045i(Object obj) {
        ResponseInfo responseInfo;
        zzdh zzc;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (obj instanceof NativeAd) {
                responseInfo = ((NativeAd) obj).getResponseInfo();
            }
            return "";
        }
        if (responseInfo == null || (zzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzc.zzh();
        } catch (RemoteException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public final synchronized void m28046j(String str, String str2) {
        try {
            kc3.m23886r(this.f30651e.m21171b(str), new vw1(this, str2), this.f30650d);
        } catch (NullPointerException e11) {
            zzt.zzo().m22945t(e11, "OutOfContextTester.setAdAsOutOfContext");
            this.f30649c.m24053e(str2);
        }
    }

    /* renamed from: k */
    private final synchronized void m28047k(String str, String str2) {
        try {
            kc3.m23886r(this.f30651e.m21171b(str), new ww1(this, str2), this.f30650d);
        } catch (NullPointerException e11) {
            zzt.zzo().m22945t(e11, "OutOfContextTester.setAdAsShown");
            this.f30649c.m24053e(str2);
        }
    }

    /* renamed from: d */
    public final void m28048d(cw1 cw1Var) {
        this.f30651e = cw1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final synchronized void m28049e(String str, Object obj, String str2) {
        this.f30647a.put(str, obj);
        m28046j(m28045i(obj), str2);
    }

    /* renamed from: f */
    public final synchronized void m28050f(final String str, String str2, final String str3) {
        char c11;
        try {
            switch (str2.hashCode()) {
                case -1999289321:
                    if (str2.equals("NATIVE")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1372958932:
                    if (str2.equals("INTERSTITIAL")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -428325382:
                    if (str2.equals("APP_OPEN_AD")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 543046670:
                    if (str2.equals("REWARDED")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1854800829:
                    if (str2.equals("REWARDED_INTERSTITIAL")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 1951953708:
                    if (str2.equals("BANNER")) {
                        c11 = 1;
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
                            if (c11 != 4) {
                                if (c11 != 5) {
                                    return;
                                }
                                RewardedInterstitialAd.load(this.f30648b, str, m28044h(), new tw1(this, str, str3));
                                return;
                            }
                            RewardedAd.load(this.f30648b, str, m28044h(), new rw1(this, str, str3));
                            return;
                        }
                        AdLoader.Builder builder = new AdLoader.Builder(this.f30648b, str);
                        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.nw1
                            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                            public final void onNativeAdLoaded(NativeAd nativeAd) {
                                xw1.this.m28049e(str, nativeAd, str3);
                            }
                        });
                        builder.withAdListener(new uw1(this, str3));
                        builder.build().loadAd(m28044h());
                        return;
                    }
                    InterstitialAd.load(this.f30648b, str, m28044h(), new qw1(this, str, str3));
                    return;
                }
                AdView adView = new AdView(this.f30648b);
                adView.setAdSize(AdSize.BANNER);
                adView.setAdUnitId(str);
                adView.setAdListener(new pw1(this, str, adView, str3));
                adView.loadAd(m28044h());
                return;
            }
            AppOpenAd.load(this.f30648b, str, m28044h(), 1, new ow1(this, str, str3));
        } finally {
        }
    }

    /* renamed from: g */
    public final synchronized void m28051g(String str, String str2) {
        Activity m24049a = this.f30649c.m24049a();
        if (m24049a == null) {
            return;
        }
        Object obj = this.f30647a.get(str);
        if (obj == null) {
            return;
        }
        this.f30647a.remove(str);
        m28047k(m28045i(obj), str2);
        if (obj instanceof AppOpenAd) {
            ((AppOpenAd) obj).show(m24049a);
            return;
        }
        if (obj instanceof InterstitialAd) {
            ((InterstitialAd) obj).show(m24049a);
        } else if (obj instanceof RewardedAd) {
            ((RewardedAd) obj).show(m24049a, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.lw1
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        } else if (obj instanceof RewardedInterstitialAd) {
            ((RewardedInterstitialAd) obj).show(m24049a, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.mw1
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                }
            });
        }
    }
}
