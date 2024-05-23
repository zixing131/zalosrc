package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.internal.ads.AbstractC4554gx;
import com.google.android.gms.internal.ads.C4830od;
import com.google.android.gms.internal.ads.it1;
import com.google.android.gms.internal.ads.kl0;
import com.google.android.gms.internal.ads.yk0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final C4830od zzc;
    private final int zzd;
    private final it1 zze;
    private final boolean zzf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TaggingLibraryJsInterface(WebView webView, C4830od c4830od, it1 it1Var) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = c4830od;
        this.zze = it1Var;
        AbstractC4554gx.m22622c(context);
        this.zzd = ((Integer) zzay.zzc().m21823b(AbstractC4554gx.f21225d8)).intValue();
        this.zzf = ((Boolean) zzay.zzc().m21823b(AbstractC4554gx.f21235e8)).booleanValue();
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignals(String str) {
        try {
            long mo105913a = com.google.android.gms.ads.internal.zzt.zzB().mo105913a();
            String zze = this.zzc.m25160c().zze(this.zza, str, this.zzb);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().mo105913a() - mo105913a)));
            }
            return zze;
        } catch (RuntimeException e11) {
            yk0.zzh("Exception getting click signals. ", e11);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getClickSignalsWithTimeout(final String str, int i11) {
        if (i11 <= 0) {
            yk0.zzg("Invalid timeout for getting click signals. Timeout=" + i11);
            return "";
        }
        try {
            return (String) kl0.f23363a.mo21339R(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getClickSignals(str);
                }
            }).get(Math.min(i11, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            yk0.zzh("Exception getting click signals with timeout. ", e11);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            if (!(e11 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzp();
        String uuid = UUID.randomUUID().toString();
        Bundle bundle = new Bundle();
        bundle.putString("query_info_type", "requester_type_6");
        Context context = this.zza;
        AdFormat adFormat = AdFormat.BANNER;
        AdRequest.Builder builder = new AdRequest.Builder();
        builder.addNetworkExtrasBundle(AdMobAdapter.class, bundle);
        QueryInfo.generate(context, adFormat, builder.build(), new zzap(this, uuid));
        return uuid;
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignals() {
        try {
            long mo105913a = com.google.android.gms.ads.internal.zzt.zzB().mo105913a();
            String zzh = this.zzc.m25160c().zzh(this.zza, this.zzb, null);
            if (this.zzf) {
                zzf.zzc(this.zze, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().mo105913a() - mo105913a)));
            }
            return zzh;
        } catch (RuntimeException e11) {
            yk0.zzh("Exception getting view signals. ", e11);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public String getViewSignalsWithTimeout(int i11) {
        if (i11 <= 0) {
            yk0.zzg("Invalid timeout for getting view signals. Timeout=" + i11);
            return "";
        }
        try {
            return (String) kl0.f23363a.mo21339R(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return TaggingLibraryJsInterface.this.getViewSignals();
                }
            }).get(Math.min(i11, this.zzd), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e11) {
            yk0.zzh("Exception getting view signals with timeout. ", e11);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e11, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            if (!(e11 instanceof TimeoutException)) {
                return "";
            }
            return "17";
        }
    }

    @JavascriptInterface
    @TargetApi(21)
    public void reportTouchEvent(String str) {
        int i11;
        int i12;
        int i13;
        float f11;
        int i14;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i11 = jSONObject.getInt("x");
            i12 = jSONObject.getInt("y");
            i13 = jSONObject.getInt("duration_ms");
            f11 = (float) jSONObject.getDouble("force");
            int i15 = jSONObject.getInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            i14 = -1;
                        } else {
                            i14 = 3;
                        }
                    } else {
                        i14 = 2;
                    }
                } else {
                    i14 = 1;
                }
            } else {
                i14 = 0;
            }
        } catch (RuntimeException | JSONException e11) {
            e = e11;
        }
        try {
            this.zzc.m25161d(MotionEvent.obtain(0L, i13, i14, i11, i12, f11, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e12) {
            e = e12;
            yk0.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e13) {
            e = e13;
            yk0.zzh("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzo().m22945t(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }
}
