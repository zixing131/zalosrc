package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.common.internal.AbstractC4205o;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.AbstractC5149wy;
import com.google.android.gms.internal.ads.C4956rr;
import com.google.android.gms.internal.ads.nk0;
import com.google.android.gms.internal.ads.se0;

/* loaded from: classes2.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* loaded from: classes2.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* loaded from: classes2.dex */
    public @interface AppOpenAdOrientation {
    }

    public static void load(Context context, String str, AdRequest adRequest, @AppOpenAdOrientation int i11, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AbstractC4205o.m19723l(context, "Context cannot be null.");
        AbstractC4205o.m19723l(str, "adUnitId cannot be null.");
        AbstractC4205o.m19723l(adRequest, "AdRequest cannot be null.");
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30256d.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    public final /* synthetic */ Context zza;
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ AdRequest zzc;
                    public final /* synthetic */ int zzd;
                    public final /* synthetic */ AppOpenAd.AppOpenAdLoadCallback zze;

                    public /* synthetic */ zzb(Context context2, String str2, AdRequest adRequest2, int i112, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback2) {
                        r1 = context2;
                        r2 = str2;
                        r3 = adRequest2;
                        r4 = i112;
                        r5 = appOpenAdLoadCallback2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = r1;
                        String str2 = r2;
                        AdRequest adRequest2 = r3;
                        try {
                            new C4956rr(context2, str2, adRequest2.zza(), r4, r5).m26155a();
                        } catch (IllegalStateException e11) {
                            se0.m26287c(context2).mo26290b(e11, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new C4956rr(context2, str2, adRequest2.zza(), i112, appOpenAdLoadCallback2).m26155a();
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z11);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(Context context, String str, AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation int i11, AppOpenAdLoadCallback appOpenAdLoadCallback) {
        AbstractC4205o.m19723l(context, "Context cannot be null.");
        AbstractC4205o.m19723l(str, "adUnitId cannot be null.");
        AbstractC4205o.m19723l(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        AbstractC4205o.m19717f("#008 Must be called on the main UI thread.");
        AbstractC4554gx.m22622c(context);
        if (((Boolean) AbstractC5149wy.f30256d.m24091e()).booleanValue()) {
            if (((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21060M8)).booleanValue()) {
                nk0.f25222b.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    public final /* synthetic */ Context zza;
                    public final /* synthetic */ String zzb;
                    public final /* synthetic */ AdManagerAdRequest zzc;
                    public final /* synthetic */ int zzd;
                    public final /* synthetic */ AppOpenAd.AppOpenAdLoadCallback zze;

                    public /* synthetic */ zza(Context context2, String str2, AdManagerAdRequest adManagerAdRequest2, int i112, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback2) {
                        r1 = context2;
                        r2 = str2;
                        r3 = adManagerAdRequest2;
                        r4 = i112;
                        r5 = appOpenAdLoadCallback2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = r1;
                        String str2 = r2;
                        AdManagerAdRequest adManagerAdRequest2 = r3;
                        try {
                            new C4956rr(context2, str2, adManagerAdRequest2.zza(), r4, r5).m26155a();
                        } catch (IllegalStateException e11) {
                            se0.m26287c(context2).mo26290b(e11, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new C4956rr(context2, str2, adManagerAdRequest2.zza(), i112, appOpenAdLoadCallback2).m26155a();
    }
}
