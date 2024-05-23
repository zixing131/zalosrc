package com.adtima.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.ads.partner.ZAdsPartnerViewListener;
import com.adtima.ads.partner.helper.ZAdsGoogleNativeWrapper;
import p227i3.AbstractC20216t;

/* loaded from: classes2.dex */
public final class ZAdsNetwork extends Activity {
    private static final String TAG = "ZAdsNetwork";
    private static ZAdsPartnerViewListener mAdsListener;
    private static String mAdsNetwork;
    private static Object mTransporter;
    private Context mAdsContext = null;
    private RelativeLayout mAdsContainer = null;
    private int mAdsOrientationPrefer = 0;

    public static void handleNetwork(String str, Object obj, ZAdsPartnerViewListener zAdsPartnerViewListener) {
        mTransporter = obj;
        mAdsNetwork = str;
        mAdsListener = zAdsPartnerViewListener;
    }

    private void initView() {
        setContentView(AbstractC3875f.zad__activity_network);
        this.mAdsContainer = (RelativeLayout) findViewById(AbstractC3874e.zad__network_content);
        registerNetwork();
        this.mAdsContainer.postDelayed(new Runnable() { // from class: com.adtima.ads.ZAdsNetwork.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ZAdsNetwork.this.findViewById(AbstractC3874e.zad__close_btn).setVisibility(0);
                } catch (Exception e11) {
                    Adtima.m18329e(ZAdsNetwork.TAG, "onCreate", e11);
                }
            }
        }, 1000L);
        findViewById(AbstractC3874e.zad__close_btn).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsNetwork.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (ZAdsNetwork.mAdsListener != null) {
                    ZAdsNetwork.mAdsListener.onClosed(true);
                }
                ZAdsNetwork.this.finish();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[Catch: Exception -> 0x0026, TRY_LEAVE, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:7:0x002b, B:10:0x002f, B:12:0x000c, B:14:0x0014, B:17:0x001d), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002b A[Catch: Exception -> 0x0026, TryCatch #0 {Exception -> 0x0026, blocks: (B:2:0x0000, B:7:0x002b, B:10:0x002f, B:12:0x000c, B:14:0x0014, B:17:0x001d), top: B:1:0x0000 }] */
    @SuppressLint({"SourceLockedOrientationActivity"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void registerNetwork() {
        View register;
        try {
            String str = mAdsNetwork;
            if (str.hashCode() == 92668925 && str.equals("admob")) {
                int i11 = 2;
                if (AbstractC20216t.m105522c(this) != 2) {
                    i11 = 1;
                }
                register = ZAdsGoogleNativeWrapper.register(this.mAdsContext, mTransporter, i11);
                if (register != null) {
                    finish();
                    return;
                } else {
                    this.mAdsContainer.addView(register);
                    return;
                }
            }
            register = null;
            if (register != null) {
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "registerNetwork", e11);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            String str = mAdsNetwork;
            if (str.hashCode() == 92668925 && str.equals("admob")) {
                ZAdsGoogleNativeWrapper.destroy(mTransporter);
            }
            mAdsNetwork = null;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "finish", e11);
        }
        super.finish();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            int i11 = configuration.orientation;
            if ((i11 == 2 || i11 == 1) && mAdsNetwork == "admob") {
                if (this.mAdsOrientationPrefer == 0) {
                    View register = ZAdsGoogleNativeWrapper.register(this.mAdsContext, mTransporter, i11);
                    if (register != null) {
                        this.mAdsContainer.removeAllViews();
                        this.mAdsContainer.addView(register);
                    }
                } else {
                    initView();
                }
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onConfigurationChanged", e11);
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            getWindow().setFlags(1024, 1024);
            requestWindowFeature(1);
            getWindow().addFlags(Integer.MIN_VALUE);
            getWindow().clearFlags(67108864);
            getWindow().setStatusBarColor(0);
            getWindow().getDecorView().setSystemUiVisibility(1280);
            if (Build.VERSION.SDK_INT >= 28) {
                getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
            }
            if (mAdsNetwork == null) {
                finish();
                return;
            }
            this.mAdsContext = Adtima.SharedContext;
            int intExtra = getIntent().getIntExtra("adsOrientationPrefer", 0);
            this.mAdsOrientationPrefer = intExtra;
            if (mAdsNetwork == "admob") {
                if (intExtra == 1) {
                    setRequestedOrientation(1);
                    if (AbstractC20216t.m105522c(this) != 1) {
                        return;
                    }
                } else if (intExtra == 2) {
                    setRequestedOrientation(6);
                    if (AbstractC20216t.m105522c(this) != 2) {
                        return;
                    }
                }
            }
            initView();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onCreate", e11);
            finish();
        }
    }
}
