package com.adtima.ads;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import com.adtima.AbstractC3640a;
import com.adtima.AbstractC3840b;
import com.adtima.AbstractC3873d;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.AbstractC3877h;
import com.adtima.Adtima;
import com.adtima.control.FlowLayout;
import com.adtima.control.ObservableWebView;
import com.adtima.feedback.ZAdsFeedbackData;
import com.adtima.feedback.ZAdsFeedbackEntity;
import com.adtima.feedback.ZAdsFeedbackListener;
import java.net.URI;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import p001a.p005d.AbstractRunnableC0008c;
import p001a.p005d.C0009d;
import p178g3.AbstractC19207b;
import p227i3.AbstractC20202f;
import p227i3.C20207k;
import p227i3.C20217u;
import p227i3.C20218v;
import p313l3.AbstractC22011d;

/* loaded from: classes2.dex */
public class ZAdsLanding extends Activity implements View.OnClickListener {
    private static final String TAG = "ZAdsLanding";
    private String mAdsLandingUrl = null;
    private String mAdsFeedbackUrl = null;
    private String mAdsPerformanceUrl = null;
    private String mAdsActionType = null;
    private boolean mAdsFirstLoad = true;
    private View mAdsBodyLayout = null;
    private View mAdsLoadingGroup = null;
    private View mAdsActionGroup = null;
    private View mAdsOutAppActionGroup = null;
    private View mAdsErrorGroup = null;
    private View mAdsChipBottomSheet = null;
    private View mAdsDoneBottomSheet = null;
    private View mAdsNavigationBar = null;
    private LinearLayout mAdsSiteInfoLayout = null;
    private LinearLayout mChipContainer = null;
    private FlowLayout mChipGroupLayout = null;
    private CompoundButton.OnCheckedChangeListener mOnRadioButtonCheckedListener = null;
    private CompoundButton mCurrentSelectedAction = null;
    private ObservableWebView mAdsContentView = null;
    private ProgressBar mAdsProgressBar = null;
    private ImageView mIvGoBack = null;
    private ImageView mIvMenu = null;
    private ImageView mIvPageInfo = null;
    private ImageView mIvCbsClose = null;
    private ImageView mIvDbsClose = null;
    private ImageView mIvDbsFeedback = null;
    private TextView mTvConfirm = null;
    private TextView mTvUrl = null;
    private TextView mTvOutAppTitle = null;
    private TextView mTvOutAppDesc = null;
    private ImageButton mIvCloseForm = null;
    private int mHttpIconResId = -1;
    private int mHttpsIconResId = -1;
    private int mBackIconResId = -1;
    private int mMenuIconResId = -1;
    private int mCopyIconResId = -1;
    private int mOpenIconResId = -1;
    private int mRefreshIconResId = -1;
    private int mReportIconResId = -1;
    private int mGoBackPosIconResId = 1;
    private int mFeedbackIconResId = -1;
    private View mMenuFeedbackView = null;
    private AbstractRunnableC0008c mAdsTask = null;
    private long mStartLoad = 0;
    private boolean mIsPageLoading = false;
    private boolean mIsOpeningReport = false;
    private boolean mIsZaloFormMode = false;
    private String mOutappUrl = null;
    private boolean mShouldShowDialog = false;
    private boolean mIsShowingOutappDialog = false;
    private final int ACTION_OPEN_BROWSER = 0;
    private final int ACTION_OPEN_INTENT = 1;
    private final int ACTION_OPEN_APP = 2;
    private final int ACTION_OPEN_MARKET = 3;
    private int mOutappAction = 0;
    private Bundle mAdsCookieBundle = null;

    /* renamed from: com.adtima.ads.ZAdsLanding$1 */
    /* loaded from: classes2.dex */
    public class C37041 extends WebViewClient {
        C37041() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            Adtima.m18326d(ZAdsLanding.TAG, "Adtima onPageFinished : " + str);
            try {
                ZAdsLanding.this.mIsPageLoading = false;
                ZAdsLanding.this.checkIfHaveTrackPerformance(str, 1000);
                ZAdsLanding.this.mAdsProgressBar.setVisibility(8);
                String cookie = CookieManager.getInstance().getCookie(str);
                Adtima.m18328e(ZAdsLanding.TAG, "All the cookies : " + cookie);
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsLanding.TAG, "Adtima onPageFinished", e11);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            Adtima.m18326d(ZAdsLanding.TAG, "Adtima onPageStarted : " + str);
            try {
                ZAdsLanding.this.mAdsProgressBar.setVisibility(0);
                if (ZAdsLanding.this.mTvUrl != null && str != null) {
                    ZAdsLanding.this.mTvUrl.setText(new URI(str).getHost());
                }
                ZAdsLanding.this.mIsPageLoading = true;
                ZAdsLanding.this.mStartLoad = System.currentTimeMillis();
                if (ZAdsLanding.this.mAdsErrorGroup != null) {
                    ZAdsLanding.this.mAdsErrorGroup.setVisibility(8);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsLanding.TAG, "Adtima onPageStarted", e11);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i11, String str, String str2) {
            Adtima.m18326d(ZAdsLanding.TAG, "Adtima onReceivedError : " + str2);
            try {
                ZAdsLanding.this.mIsPageLoading = false;
                ZAdsLanding.this.checkIfHaveTrackPerformance(str2, i11);
                ZAdsLanding.this.mOutappUrl = str2;
                if (AbstractC19207b.m100801g(ZAdsLanding.this)) {
                    if (str2.startsWith("http")) {
                        URL url = new URL(str2);
                        String str3 = url.getProtocol() + "://" + url.getHost();
                        ZAdsLanding.this.setVisibilityOutappDialog(true);
                        if (ZAdsLanding.this.mAdsContentView != null && AbstractC22011d.m114909j(str3)) {
                            ZAdsLanding.this.mAdsContentView.loadUrl(str3);
                        }
                    } else if (str2.startsWith("intent")) {
                        ZAdsLanding.this.handleIntent(webView, str2);
                    } else if (ZAdsLanding.this.mAdsContentView != null) {
                        ZAdsLanding.this.mAdsContentView.loadUrl("about:blank");
                    }
                }
                if (ZAdsLanding.this.mAdsErrorGroup != null) {
                    ZAdsLanding.this.mAdsErrorGroup.setVisibility(0);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsLanding.TAG, "Adtima onReceivedError", e11);
            }
            super.onReceivedError(webView, i11, str, str2);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                Adtima.m18328e(ZAdsLanding.TAG, "shouldOverrideUrlLoading url : " + str);
                if (!str.equals(ZAdsLanding.this.mAdsLandingUrl) && str.length() != 0) {
                    if (ZAdsLanding.this.mIsShowingOutappDialog) {
                        return true;
                    }
                    if (str.equals(ZAdsAction.URL_ACTION_LANDING_CLOSE)) {
                        ZAdsLanding.this.finish();
                    } else {
                        if (!str.startsWith("http")) {
                            if (!str.startsWith("intent://") && !str.startsWith("market://")) {
                                ZAdsLanding.this.setVisibilityOutappDialog(true);
                                if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(ZAdsLanding.this.getPackageManager()) != null) {
                                    ZAdsLanding.this.mOutappUrl = str;
                                    ZAdsLanding.this.mOutappAction = 2;
                                }
                                return true;
                            }
                            ZAdsLanding.this.handleIntent(webView, str);
                            return false;
                        }
                        if (AbstractC22011d.m114922w(str)) {
                            ZAdsLanding.this.setVisibilityOutappDialog(true);
                            ZAdsLanding.this.mOutappUrl = str;
                            ZAdsLanding.this.mOutappAction = 0;
                            return false;
                        }
                        ZAdsLanding.this.mAdsLandingUrl = str;
                        ZAdsLanding.this.mAdsContentView.loadUrl(str);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsLanding.TAG, "Adtima shouldOverrideUrlLoading", e11);
            }
            return false;
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$10 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC370510 implements View.OnClickListener {
        ViewOnClickListenerC370510() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ZAdsLanding.this.mAdsContentView != null) {
                ZAdsLanding.this.mAdsContentView.loadUrl(ZAdsLanding.this.mAdsLandingUrl);
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$11 */
    /* loaded from: classes2.dex */
    public class C370611 implements CompoundButton.OnCheckedChangeListener {
        C370611() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            if (z11) {
                try {
                    if (ZAdsLanding.this.mCurrentSelectedAction != null) {
                        ZAdsLanding.this.mCurrentSelectedAction.setChecked(false);
                    }
                    ZAdsLanding.this.mCurrentSelectedAction = compoundButton;
                    ZAdsLanding.this.mTvConfirm.setEnabled(true);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$12 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC370712 implements View.OnClickListener {
        ViewOnClickListenerC370712() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ZAdsLanding.this.mAdsFeedbackUrl == null || ZAdsLanding.this.mAdsFeedbackUrl.trim().length() == 0 || ZAdsLanding.this.mCurrentSelectedAction == null) {
                Adtima.m18328e(ZAdsLanding.TAG, "Condition not match.");
                return;
            }
            C20217u.m105538N0().m105578J(ZAdsLanding.this.mAdsFeedbackUrl, ZAdsLanding.this.mCurrentSelectedAction.getId());
            ZAdsLanding.this.resetFeedbackData();
            ZAdsLanding.this.toggleDoneBottomSheet();
            ZAdsLanding.this.toggleChipBottomSheet();
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$13 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC370813 implements View.OnClickListener {
        ViewOnClickListenerC370813() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAdsLanding.this.toggleDoneBottomSheet();
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$14 */
    /* loaded from: classes2.dex */
    public class C370914 extends ZAdsFeedbackListener {
        C370914() {
        }

        @Override // com.adtima.feedback.ZAdsFeedbackListener
        public void onFetchFailed() {
            super.onFetchFailed();
            if (ZAdsLanding.this.mMenuFeedbackView != null) {
                ZAdsLanding.this.mMenuFeedbackView.setVisibility(8);
            }
        }

        @Override // com.adtima.feedback.ZAdsFeedbackListener
        public void onFetchFinished(ZAdsFeedbackData zAdsFeedbackData) {
            super.onFetchFinished(zAdsFeedbackData);
            if (ZAdsLanding.this.mMenuFeedbackView == null || ZAdsLanding.this.mAdsFeedbackUrl == null || ZAdsLanding.this.mAdsFeedbackUrl.trim().length() == 0) {
                return;
            }
            ZAdsLanding.this.mMenuFeedbackView.setVisibility(0);
            ZAdsLanding.this.buildChipUi(zAdsFeedbackData);
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$15 */
    /* loaded from: classes2.dex */
    public class C371015 extends AbstractRunnableC0008c {
        C371015() {
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPreExecute() {
            try {
                ZAdsLanding.this.initUIView();
            } catch (Exception unused) {
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public Void doInBackground() {
            try {
                ZAdsLanding.this.initUIData();
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // p001a.p005d.AbstractRunnableC0008c
        public void onPostExecute(Void r22) {
            try {
                if (ZAdsLanding.this.mIsZaloFormMode) {
                    ZAdsLanding.this.mIvCloseForm.setVisibility(0);
                    ZAdsLanding.this.mAdsNavigationBar.setVisibility(8);
                }
                ZAdsLanding.this.setupUI();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$2 */
    /* loaded from: classes2.dex */
    public class C37112 extends WebChromeClient {
        C37112() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i11) {
            try {
                if (ZAdsLanding.this.mAdsLoadingGroup != null && ZAdsLanding.this.mAdsFirstLoad) {
                    if (i11 < 10) {
                        ZAdsLanding.this.mAdsLoadingGroup.setVisibility(0);
                    } else {
                        ZAdsLanding.this.mAdsFirstLoad = false;
                        ZAdsLanding.this.mAdsLoadingGroup.setVisibility(8);
                    }
                }
                if (i11 < 10) {
                    i11 = 10;
                }
                if (ZAdsLanding.this.mAdsProgressBar != null) {
                    ZAdsLanding.this.mAdsProgressBar.setProgress(i11);
                }
            } catch (Exception e11) {
                Adtima.m18329e(ZAdsLanding.TAG, "Adtima onProgressChanged", e11);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            super.onReceivedTitle(webView, str);
            Adtima.m18326d(ZAdsLanding.TAG, "onReceivedTitle :" + str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            ZAdsLanding.this.mTvUrl.setText(str);
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$3 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37123 implements View.OnClickListener {
        ViewOnClickListenerC37123() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                ZAdsLanding.this.finish();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$4 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37134 implements View.OnClickListener {
        ViewOnClickListenerC37134() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            try {
                if (ZAdsLanding.this.mIsPageLoading) {
                    ZAdsLanding zAdsLanding = ZAdsLanding.this;
                    zAdsLanding.checkIfHaveTrackPerformance(zAdsLanding.mAdsContentView.getUrl(), 1001);
                }
                if (ZAdsLanding.this.mAdsContentView.canGoBack()) {
                    ZAdsLanding.this.mAdsContentView.goBack();
                } else {
                    ZAdsLanding.this.finish();
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$5 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37145 implements View.OnClickListener {
        ViewOnClickListenerC37145() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAdsLanding.this.toggleActionGroup();
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$6 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37156 implements View.OnClickListener {
        ViewOnClickListenerC37156() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAdsLanding.this.toggleActionGroup();
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$7 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37167 implements View.OnClickListener {
        ViewOnClickListenerC37167() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAdsLanding.this.setVisibilityOutappDialog(false);
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$8 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37178 implements View.OnClickListener {
        ViewOnClickListenerC37178() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAdsLanding.this.toggleActionGroup();
            ZAdsLanding.this.toggleChipBottomSheet();
        }
    }

    /* renamed from: com.adtima.ads.ZAdsLanding$9 */
    /* loaded from: classes2.dex */
    public class ViewOnClickListenerC37189 implements View.OnClickListener {
        ViewOnClickListenerC37189() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ZAdsLanding.this.toggleChipBottomSheet();
            ZAdsLanding.this.resetFeedbackData();
        }
    }

    public void buildChipUi(ZAdsFeedbackData zAdsFeedbackData) {
        try {
            if (this.mChipContainer == null || zAdsFeedbackData == null || zAdsFeedbackData.getList() == null || zAdsFeedbackData.getList().size() == 0) {
                this.mChipContainer.setVisibility(8);
                return;
            }
            this.mChipContainer.setVisibility(0);
            if (this.mChipGroupLayout.getChildCount() != 0) {
                this.mChipGroupLayout.removeAllViews();
            }
            Iterator<ZAdsFeedbackEntity> it = zAdsFeedbackData.getList().iterator();
            while (it.hasNext()) {
                ZAdsFeedbackEntity next = it.next();
                RadioButton radioButton = new RadioButton(this);
                radioButton.setOnCheckedChangeListener(this.mOnRadioButtonCheckedListener);
                radioButton.setId(next.f15454id);
                radioButton.setBackground(getDrawable(AbstractC3873d.zad__chip_background));
                radioButton.setButtonDrawable(R.color.transparent);
                radioButton.setTextColor(Build.VERSION.SDK_INT >= 23 ? getColorStateList(AbstractC3840b.zad__chip_text_selector) : getResources().getColorStateList(AbstractC3840b.zad__chip_text_selector));
                radioButton.setTextSize(2, 12.0f);
                radioButton.setLines(1);
                radioButton.setText(next.content);
                this.mChipGroupLayout.addView(radioButton, new FlowLayout.C3850a(20, 15));
                if (this.mCurrentSelectedAction != null) {
                    this.mTvConfirm.setEnabled(true);
                } else {
                    this.mTvConfirm.setEnabled(false);
                }
            }
        } catch (Exception e11) {
            Adtima.m18328e(TAG, "buildChipUi " + e11.toString());
        }
    }

    private void buildLayout() {
        try {
            AbstractRunnableC0008c abstractRunnableC0008c = this.mAdsTask;
            if (abstractRunnableC0008c != null && abstractRunnableC0008c.getStatus() == AbstractRunnableC0008c.d.RUNNING) {
                C0009d.m7c(this.mAdsTask);
                this.mAdsTask = null;
            }
            C371015 c371015 = new AbstractRunnableC0008c() { // from class: com.adtima.ads.ZAdsLanding.15
                C371015() {
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPreExecute() {
                    try {
                        ZAdsLanding.this.initUIView();
                    } catch (Exception unused) {
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public Void doInBackground() {
                    try {
                        ZAdsLanding.this.initUIData();
                        return null;
                    } catch (Exception unused) {
                        return null;
                    }
                }

                @Override // p001a.p005d.AbstractRunnableC0008c
                public void onPostExecute(Void r22) {
                    try {
                        if (ZAdsLanding.this.mIsZaloFormMode) {
                            ZAdsLanding.this.mIvCloseForm.setVisibility(0);
                            ZAdsLanding.this.mAdsNavigationBar.setVisibility(8);
                        }
                        ZAdsLanding.this.setupUI();
                    } catch (Exception unused) {
                    }
                }
            };
            this.mAdsTask = c371015;
            C0009d.m11g(c371015);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildLayout", e11);
        }
    }

    public void checkIfHaveTrackPerformance(String str, int i11) {
        String str2;
        try {
            long currentTimeMillis = System.currentTimeMillis() - this.mStartLoad;
            if (!AbstractC20202f.f99818j0 || !this.mAdsLandingUrl.contains(str) || currentTimeMillis <= 0 || (str2 = this.mAdsPerformanceUrl) == null || str2.trim().length() == 0) {
                return;
            }
            C20217u.m105538N0().m105580K(this.mAdsPerformanceUrl, currentTimeMillis, i11);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, "checkIfHaveTrackPerformance" + e11.toString());
        }
    }

    private void cleanUp() {
        try {
            this.mAdsLandingUrl = null;
            this.mAdsActionGroup = null;
            this.mAdsOutAppActionGroup = null;
            ObservableWebView observableWebView = this.mAdsContentView;
            if (observableWebView != null) {
                observableWebView.clearCache(true);
                this.mAdsContentView.destroyDrawingCache();
                this.mAdsContentView.destroy();
                this.mAdsContentView = null;
            }
            this.mAdsProgressBar = null;
            this.mIvMenu = null;
            this.mIvCloseForm = null;
            this.mIvGoBack = null;
            this.mIvPageInfo = null;
            this.mIvCbsClose = null;
            this.mIvDbsClose = null;
            this.mIvDbsFeedback = null;
            C0009d.m7c(this.mAdsTask);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "cleanUp", e11);
        }
    }

    @SuppressLint({"NewApi"})
    private boolean copyToClipboard(String str) {
        try {
            ((ClipboardManager) getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("Copied text", str));
            return true;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "copyToClipboard", e11);
            return false;
        }
    }

    private String getAppName(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
            if (applicationInfo != null) {
                return (String) packageManager.getApplicationLabel(applicationInfo);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "getAppName", e11);
        }
        return "App";
    }

    public void handleIntent(WebView webView, String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri != null) {
                if (str.startsWith("market://")) {
                    this.mOutappUrl = str;
                    this.mOutappAction = 3;
                } else {
                    String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                    if (getPackageManager().resolveActivity(parseUri, 65536) != null) {
                        this.mOutappUrl = str;
                        this.mOutappAction = 1;
                        if (TextUtils.isEmpty(stringExtra)) {
                            webView.stopLoading();
                        } else {
                            webView.loadUrl(stringExtra);
                        }
                    } else if (TextUtils.isEmpty(stringExtra)) {
                        webView.stopLoading();
                        if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(getPackageManager()) != null) {
                            this.mOutappUrl = str;
                            this.mOutappAction = 2;
                        } else {
                            String str2 = parseUri.getPackage();
                            if (TextUtils.isEmpty(str2)) {
                                this.mOutappAction = 0;
                            } else {
                                this.mOutappUrl = str2;
                                this.mOutappAction = 3;
                            }
                        }
                    } else {
                        this.mOutappUrl = stringExtra;
                        this.mOutappAction = 0;
                        webView.loadUrl(stringExtra);
                    }
                }
                setVisibilityOutappDialog(true);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "handleIntent", e11);
        }
    }

    private void initListeners() {
        try {
            this.mIvCloseForm.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.3
                ViewOnClickListenerC37123() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        ZAdsLanding.this.finish();
                    } catch (Exception unused) {
                    }
                }
            });
            this.mIvGoBack.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.4
                ViewOnClickListenerC37134() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        if (ZAdsLanding.this.mIsPageLoading) {
                            ZAdsLanding zAdsLanding = ZAdsLanding.this;
                            zAdsLanding.checkIfHaveTrackPerformance(zAdsLanding.mAdsContentView.getUrl(), 1001);
                        }
                        if (ZAdsLanding.this.mAdsContentView.canGoBack()) {
                            ZAdsLanding.this.mAdsContentView.goBack();
                        } else {
                            ZAdsLanding.this.finish();
                        }
                    } catch (Exception unused) {
                    }
                }
            });
            this.mIvMenu.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.5
                ViewOnClickListenerC37145() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsLanding.this.toggleActionGroup();
                }
            });
            this.mAdsActionGroup.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.6
                ViewOnClickListenerC37156() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsLanding.this.toggleActionGroup();
                }
            });
            this.mAdsOutAppActionGroup.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.7
                ViewOnClickListenerC37167() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsLanding.this.setVisibilityOutappDialog(false);
                }
            });
            this.mMenuFeedbackView.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.8
                ViewOnClickListenerC37178() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsLanding.this.toggleActionGroup();
                    ZAdsLanding.this.toggleChipBottomSheet();
                }
            });
            this.mIvCbsClose.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.9
                ViewOnClickListenerC37189() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsLanding.this.toggleChipBottomSheet();
                    ZAdsLanding.this.resetFeedbackData();
                }
            });
            this.mAdsErrorGroup.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.10
                ViewOnClickListenerC370510() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ZAdsLanding.this.mAdsContentView != null) {
                        ZAdsLanding.this.mAdsContentView.loadUrl(ZAdsLanding.this.mAdsLandingUrl);
                    }
                }
            });
            this.mOnRadioButtonCheckedListener = new CompoundButton.OnCheckedChangeListener() { // from class: com.adtima.ads.ZAdsLanding.11
                C370611() {
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    if (z11) {
                        try {
                            if (ZAdsLanding.this.mCurrentSelectedAction != null) {
                                ZAdsLanding.this.mCurrentSelectedAction.setChecked(false);
                            }
                            ZAdsLanding.this.mCurrentSelectedAction = compoundButton;
                            ZAdsLanding.this.mTvConfirm.setEnabled(true);
                        } catch (Exception unused) {
                        }
                    }
                }
            };
            this.mTvConfirm.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.12
                ViewOnClickListenerC370712() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ZAdsLanding.this.mAdsFeedbackUrl == null || ZAdsLanding.this.mAdsFeedbackUrl.trim().length() == 0 || ZAdsLanding.this.mCurrentSelectedAction == null) {
                        Adtima.m18328e(ZAdsLanding.TAG, "Condition not match.");
                        return;
                    }
                    C20217u.m105538N0().m105578J(ZAdsLanding.this.mAdsFeedbackUrl, ZAdsLanding.this.mCurrentSelectedAction.getId());
                    ZAdsLanding.this.resetFeedbackData();
                    ZAdsLanding.this.toggleDoneBottomSheet();
                    ZAdsLanding.this.toggleChipBottomSheet();
                }
            });
            this.mIvDbsClose.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsLanding.13
                ViewOnClickListenerC370813() {
                }

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsLanding.this.toggleDoneBottomSheet();
                }
            });
        } catch (Exception e11) {
            Adtima.m18328e(TAG, "initListeners " + e11.toString());
        }
    }

    public void initUIData() {
        try {
            this.mHttpIconResId = AbstractC3873d.zad__ic_land_http;
            this.mHttpsIconResId = AbstractC3873d.zad__ic_land_https;
            this.mBackIconResId = AbstractC3873d.zad__ic_land_back;
            this.mMenuIconResId = AbstractC3873d.zad__ic_land_menu;
            this.mCopyIconResId = AbstractC3873d.zad__ic_land_copy_link;
            this.mOpenIconResId = AbstractC3873d.zad__ic_land_open_browser;
            this.mRefreshIconResId = AbstractC3873d.zad__ic_land_refresh;
            this.mReportIconResId = AbstractC3873d.zad__ic_land_warning;
            this.mGoBackPosIconResId = AbstractC3873d.zad__ic_land_prev_pos;
            this.mFeedbackIconResId = AbstractC3873d.zad__ic_land_feedback;
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initUIData", e11);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void initUIView() {
        try {
            this.mAdsBodyLayout = findViewById(AbstractC3874e.zad__landing_body);
            View findViewById = findViewById(AbstractC3874e.zad__landing_loading);
            this.mAdsLoadingGroup = findViewById;
            findViewById.setVisibility(8);
            this.mAdsSiteInfoLayout = (LinearLayout) findViewById(AbstractC3874e.zad__landing_site_info_layout);
            View findViewById2 = findViewById(AbstractC3874e.zad__landing_error);
            this.mAdsErrorGroup = findViewById2;
            findViewById2.setOnClickListener(this);
            this.mAdsErrorGroup.setVisibility(8);
            this.mAdsProgressBar = (ProgressBar) findViewById(AbstractC3874e.zad__landing_progress);
            this.mMenuFeedbackView = findViewById(AbstractC3874e.zad__landing_report);
            ObservableWebView observableWebView = (ObservableWebView) findViewById(AbstractC3874e.zad__landing_content);
            this.mAdsContentView = observableWebView;
            observableWebView.setScrollContainer(true);
            this.mAdsContentView.setBackgroundColor(-1);
            View findViewById3 = findViewById(AbstractC3874e.zad__landing_chip_bottom_sheet);
            this.mAdsChipBottomSheet = findViewById3;
            findViewById3.setVisibility(8);
            this.mChipContainer = (LinearLayout) findViewById(AbstractC3874e.zad__landing_chip_container);
            this.mChipGroupLayout = (FlowLayout) findViewById(AbstractC3874e.zad__landing_chip_group_layout);
            View findViewById4 = findViewById(AbstractC3874e.zad__landing_done_bottom_sheet);
            this.mAdsDoneBottomSheet = findViewById4;
            findViewById4.setVisibility(8);
            this.mAdsNavigationBar = findViewById(AbstractC3874e.zad__iab_navigation_bar);
            this.mIvCloseForm = (ImageButton) findViewById(AbstractC3874e.zad__landing_close_form);
            this.mIvDbsClose = (ImageView) findViewById(AbstractC3874e.zad__landing_done_bottom_sheet_close);
            this.mIvDbsFeedback = (ImageView) findViewById(AbstractC3874e.zad__landing_done_bottom_sheet_feedback);
            this.mIvGoBack = (ImageView) findViewById(AbstractC3874e.zad__landing_go_back);
            this.mIvPageInfo = (ImageView) findViewById(AbstractC3874e.zad__landing_site_info);
            this.mIvMenu = (ImageView) findViewById(AbstractC3874e.zad__landing_menu);
            this.mIvCbsClose = (ImageView) findViewById(AbstractC3874e.zad__landing_bottom_sheet_close);
            this.mTvUrl = (TextView) findViewById(AbstractC3874e.zad__landing_url);
            this.mTvConfirm = (TextView) findViewById(AbstractC3874e.zad__landing_btn_confirm);
            this.mTvOutAppTitle = (TextView) findViewById(AbstractC3874e.zad__outapp_title);
            this.mTvOutAppDesc = (TextView) findViewById(AbstractC3874e.zad__outapp_desc);
            findViewById(AbstractC3874e.zad__landing_copy_link).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__landing_open_browser).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__landing_refresh).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__landing_bottom_sheet_dismiss_container).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__landing_btn_close_feedback).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__landing_done_bottom_sheet_dismiss_container).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__outapp_deny).setOnClickListener(this);
            findViewById(AbstractC3874e.zad__outapp_confirm).setOnClickListener(this);
            View findViewById5 = findViewById(AbstractC3874e.zad__landing_action);
            this.mAdsActionGroup = findViewById5;
            findViewById5.setVisibility(8);
            this.mAdsOutAppActionGroup = findViewById(AbstractC3874e.zad__outapp_action);
            initWebView();
            initListeners();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "initUIView", e11);
        }
    }

    private void initWebView() {
        try {
            WebSettings settings = this.mAdsContentView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
                settings.setJavaScriptCanOpenWindowsAutomatically(true);
                settings.setAllowContentAccess(true);
                settings.setAllowFileAccess(true);
                settings.setCacheMode(2);
                settings.setDomStorageEnabled(true);
                settings.setDatabaseEnabled(true);
                settings.setLoadWithOverviewMode(true);
                settings.setMixedContentMode(2);
            }
            Bundle bundle = this.mAdsCookieBundle;
            if (bundle != null) {
                Adtima.setCookies(this.mAdsLandingUrl, bundle);
            }
            this.mAdsContentView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsLanding.1
                C37041() {
                }

                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    Adtima.m18326d(ZAdsLanding.TAG, "Adtima onPageFinished : " + str);
                    try {
                        ZAdsLanding.this.mIsPageLoading = false;
                        ZAdsLanding.this.checkIfHaveTrackPerformance(str, 1000);
                        ZAdsLanding.this.mAdsProgressBar.setVisibility(8);
                        String cookie = CookieManager.getInstance().getCookie(str);
                        Adtima.m18328e(ZAdsLanding.TAG, "All the cookies : " + cookie);
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsLanding.TAG, "Adtima onPageFinished", e11);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    Adtima.m18326d(ZAdsLanding.TAG, "Adtima onPageStarted : " + str);
                    try {
                        ZAdsLanding.this.mAdsProgressBar.setVisibility(0);
                        if (ZAdsLanding.this.mTvUrl != null && str != null) {
                            ZAdsLanding.this.mTvUrl.setText(new URI(str).getHost());
                        }
                        ZAdsLanding.this.mIsPageLoading = true;
                        ZAdsLanding.this.mStartLoad = System.currentTimeMillis();
                        if (ZAdsLanding.this.mAdsErrorGroup != null) {
                            ZAdsLanding.this.mAdsErrorGroup.setVisibility(8);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsLanding.TAG, "Adtima onPageStarted", e11);
                    }
                }

                @Override // android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i11, String str, String str2) {
                    Adtima.m18326d(ZAdsLanding.TAG, "Adtima onReceivedError : " + str2);
                    try {
                        ZAdsLanding.this.mIsPageLoading = false;
                        ZAdsLanding.this.checkIfHaveTrackPerformance(str2, i11);
                        ZAdsLanding.this.mOutappUrl = str2;
                        if (AbstractC19207b.m100801g(ZAdsLanding.this)) {
                            if (str2.startsWith("http")) {
                                URL url = new URL(str2);
                                String str3 = url.getProtocol() + "://" + url.getHost();
                                ZAdsLanding.this.setVisibilityOutappDialog(true);
                                if (ZAdsLanding.this.mAdsContentView != null && AbstractC22011d.m114909j(str3)) {
                                    ZAdsLanding.this.mAdsContentView.loadUrl(str3);
                                }
                            } else if (str2.startsWith("intent")) {
                                ZAdsLanding.this.handleIntent(webView, str2);
                            } else if (ZAdsLanding.this.mAdsContentView != null) {
                                ZAdsLanding.this.mAdsContentView.loadUrl("about:blank");
                            }
                        }
                        if (ZAdsLanding.this.mAdsErrorGroup != null) {
                            ZAdsLanding.this.mAdsErrorGroup.setVisibility(0);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsLanding.TAG, "Adtima onReceivedError", e11);
                    }
                    super.onReceivedError(webView, i11, str, str2);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    try {
                        Adtima.m18328e(ZAdsLanding.TAG, "shouldOverrideUrlLoading url : " + str);
                        if (!str.equals(ZAdsLanding.this.mAdsLandingUrl) && str.length() != 0) {
                            if (ZAdsLanding.this.mIsShowingOutappDialog) {
                                return true;
                            }
                            if (str.equals(ZAdsAction.URL_ACTION_LANDING_CLOSE)) {
                                ZAdsLanding.this.finish();
                            } else {
                                if (!str.startsWith("http")) {
                                    if (!str.startsWith("intent://") && !str.startsWith("market://")) {
                                        ZAdsLanding.this.setVisibilityOutappDialog(true);
                                        if (new Intent("android.intent.action.VIEW", Uri.parse(str)).resolveActivity(ZAdsLanding.this.getPackageManager()) != null) {
                                            ZAdsLanding.this.mOutappUrl = str;
                                            ZAdsLanding.this.mOutappAction = 2;
                                        }
                                        return true;
                                    }
                                    ZAdsLanding.this.handleIntent(webView, str);
                                    return false;
                                }
                                if (AbstractC22011d.m114922w(str)) {
                                    ZAdsLanding.this.setVisibilityOutappDialog(true);
                                    ZAdsLanding.this.mOutappUrl = str;
                                    ZAdsLanding.this.mOutappAction = 0;
                                    return false;
                                }
                                ZAdsLanding.this.mAdsLandingUrl = str;
                                ZAdsLanding.this.mAdsContentView.loadUrl(str);
                            }
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsLanding.TAG, "Adtima shouldOverrideUrlLoading", e11);
                    }
                    return false;
                }
            });
            this.mAdsContentView.setWebChromeClient(new WebChromeClient() { // from class: com.adtima.ads.ZAdsLanding.2
                C37112() {
                }

                @Override // android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i11) {
                    try {
                        if (ZAdsLanding.this.mAdsLoadingGroup != null && ZAdsLanding.this.mAdsFirstLoad) {
                            if (i11 < 10) {
                                ZAdsLanding.this.mAdsLoadingGroup.setVisibility(0);
                            } else {
                                ZAdsLanding.this.mAdsFirstLoad = false;
                                ZAdsLanding.this.mAdsLoadingGroup.setVisibility(8);
                            }
                        }
                        if (i11 < 10) {
                            i11 = 10;
                        }
                        if (ZAdsLanding.this.mAdsProgressBar != null) {
                            ZAdsLanding.this.mAdsProgressBar.setProgress(i11);
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsLanding.TAG, "Adtima onProgressChanged", e11);
                    }
                }

                @Override // android.webkit.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
                    super.onReceivedTitle(webView, str);
                    Adtima.m18326d(ZAdsLanding.TAG, "onReceivedTitle :" + str);
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    ZAdsLanding.this.mTvUrl.setText(str);
                }
            });
            this.mAdsContentView.setVerticalScrollBarEnabled(false);
            this.mAdsContentView.setHorizontalScrollBarEnabled(false);
            if (AbstractC22011d.m114915p(this.mAdsLandingUrl) == null) {
                this.mAdsContentView.loadUrl(this.mAdsLandingUrl);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("secrx", AbstractC22011d.m114915p(this.mAdsLandingUrl));
            this.mAdsContentView.loadUrl(this.mAdsLandingUrl, hashMap);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setupWebView", e11);
        }
    }

    public void resetFeedbackData() {
        try {
            CompoundButton compoundButton = this.mCurrentSelectedAction;
            if (compoundButton != null) {
                compoundButton.setChecked(false);
            }
            this.mCurrentSelectedAction = null;
            this.mTvConfirm.setEnabled(false);
        } catch (Exception unused) {
        }
    }

    private void setTextColor(TextView textView, int i11) {
        try {
            textView.setTextColor(Build.VERSION.SDK_INT < 23 ? getResources().getColor(i11) : getResources().getColor(i11, getTheme()));
        } catch (Exception unused) {
        }
    }

    public void setVisibilityOutappDialog(boolean z11) {
        try {
            if (this.mShouldShowDialog) {
                View view = this.mAdsOutAppActionGroup;
                if (view != null) {
                    if (z11) {
                        view.setVisibility(0);
                        this.mIsShowingOutappDialog = true;
                        return;
                    } else {
                        view.setVisibility(8);
                        this.mIsShowingOutappDialog = false;
                        return;
                    }
                }
                return;
            }
            int i11 = this.mOutappAction;
            if (i11 == 0) {
                C20218v.m105636a().m105643h(this.mOutappUrl);
            } else if (i11 == 1) {
                C20218v.m105636a().m105644i(this.mOutappUrl);
            } else if (i11 == 2) {
                C20218v.m105636a().m105641f(this.mOutappUrl);
            } else if (i11 == 3) {
                this.mOutappUrl = this.mOutappUrl.replace("market://details?id=", "");
                C20218v.m105636a().m105642g(this.mOutappUrl);
            }
            finish();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setVisiableOutappDialog", e11);
        }
    }

    public void setupUI() {
        TextView textView;
        int i11;
        try {
            this.mIvCbsClose.setImageResource(this.mBackIconResId);
            this.mIvMenu.setImageResource(this.mMenuIconResId);
            String str = this.mAdsLandingUrl;
            if (str == null || str.trim().length() == 0 || !this.mAdsLandingUrl.startsWith("https")) {
                this.mIvPageInfo.setImageResource(this.mHttpIconResId);
                textView = this.mTvUrl;
                i11 = AbstractC3840b.zad__iab_http_color;
            } else {
                this.mIvPageInfo.setImageResource(this.mHttpsIconResId);
                textView = this.mTvUrl;
                i11 = AbstractC3840b.zad__iab_https_color;
            }
            setTextColor(textView, i11);
            ((ImageView) findViewById(AbstractC3874e.zad__landing_copy)).setImageResource(this.mCopyIconResId);
            ((ImageView) findViewById(AbstractC3874e.zad__landing_open)).setImageResource(this.mOpenIconResId);
            ((ImageView) findViewById(AbstractC3874e.zad__landing_refresh_icon)).setImageResource(this.mRefreshIconResId);
            ((ImageView) findViewById(AbstractC3874e.zad__landing_iv_report)).setImageResource(this.mReportIconResId);
            this.mIvGoBack.setImageResource(this.mGoBackPosIconResId);
            this.mIvDbsFeedback.setImageResource(this.mFeedbackIconResId);
            this.mIvDbsClose.setImageResource(this.mBackIconResId);
            if (this.mIsOpeningReport) {
                this.mIvMenu.setVisibility(4);
                this.mIvPageInfo.setVisibility(8);
                setTextColor(this.mTvUrl, AbstractC3840b.zad__iab_http_color);
            }
            this.mTvUrl.setText(new URI(this.mAdsLandingUrl).getHost());
            String appName = getAppName(Adtima.SharedContext);
            this.mTvOutAppTitle.setText(getResources().getString(AbstractC3877h.zad__mn_outapp_title, appName));
            this.mTvOutAppDesc.setText(getResources().getString(AbstractC3877h.zad__mn_outapp_description, appName));
            C20207k.m105398c(this).m105401e(Adtima.SDK_VERSION_CODE, new ZAdsFeedbackListener() { // from class: com.adtima.ads.ZAdsLanding.14
                C370914() {
                }

                @Override // com.adtima.feedback.ZAdsFeedbackListener
                public void onFetchFailed() {
                    super.onFetchFailed();
                    if (ZAdsLanding.this.mMenuFeedbackView != null) {
                        ZAdsLanding.this.mMenuFeedbackView.setVisibility(8);
                    }
                }

                @Override // com.adtima.feedback.ZAdsFeedbackListener
                public void onFetchFinished(ZAdsFeedbackData zAdsFeedbackData) {
                    super.onFetchFinished(zAdsFeedbackData);
                    if (ZAdsLanding.this.mMenuFeedbackView == null || ZAdsLanding.this.mAdsFeedbackUrl == null || ZAdsLanding.this.mAdsFeedbackUrl.trim().length() == 0) {
                        return;
                    }
                    ZAdsLanding.this.mMenuFeedbackView.setVisibility(0);
                    ZAdsLanding.this.buildChipUi(zAdsFeedbackData);
                }
            });
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "setupUI", e11);
        }
    }

    public void toggleActionGroup() {
        try {
            if (this.mAdsActionGroup.getVisibility() == 8) {
                this.mAdsActionGroup.setVisibility(0);
            } else {
                this.mAdsActionGroup.setVisibility(8);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "showActionGroup", e11);
        }
    }

    public void toggleChipBottomSheet() {
        try {
            if (this.mAdsChipBottomSheet.getVisibility() == 8) {
                this.mAdsChipBottomSheet.setVisibility(0);
            } else {
                this.mAdsChipBottomSheet.setVisibility(8);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "toggleChipBottomSheet", e11);
        }
    }

    public void toggleDoneBottomSheet() {
        try {
            if (this.mAdsDoneBottomSheet.getVisibility() == 8) {
                this.mAdsDoneBottomSheet.setVisibility(0);
            } else {
                this.mAdsDoneBottomSheet.setVisibility(8);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "toggleDoneBottomSheet", e11);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            overridePendingTransition(AbstractC3640a.zad__slide_in_right, AbstractC3640a.zad__slide_out_right);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "finish", e11);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            if (this.mAdsContentView.canGoBack()) {
                this.mAdsContentView.goBack();
            } else {
                super.onBackPressed();
            }
            if (this.mIsPageLoading) {
                checkIfHaveTrackPerformance(this.mAdsContentView.getUrl(), 1001);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onBackPressed", e11);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC3874e.zad__landing_copy_link) {
                Toast.makeText(this, copyToClipboard(this.mAdsLandingUrl) ? "Đã sao chép địa chỉ liên kết!" : "Có lỗi xãy ra, vui lòng thử lại!", 0).show();
            } else if (id2 == AbstractC3874e.zad__landing_open_browser) {
                C20218v.m105636a().m105643h(this.mAdsLandingUrl);
            } else {
                if (id2 != AbstractC3874e.zad__landing_refresh) {
                    if (id2 == AbstractC3874e.zad__landing_bottom_sheet_dismiss_container) {
                        toggleChipBottomSheet();
                        return;
                    }
                    if (id2 != AbstractC3874e.zad__landing_done_bottom_sheet_dismiss_container && id2 != AbstractC3874e.zad__landing_btn_close_feedback) {
                        if (id2 == AbstractC3874e.zad__outapp_deny) {
                            setVisibilityOutappDialog(false);
                            return;
                        }
                        if (id2 == AbstractC3874e.zad__outapp_confirm) {
                            setVisibilityOutappDialog(false);
                            int i11 = this.mOutappAction;
                            if (i11 == 0) {
                                C20218v.m105636a().m105643h(this.mOutappUrl);
                            } else if (i11 == 1) {
                                C20218v.m105636a().m105644i(this.mOutappUrl);
                            } else if (i11 == 2) {
                                C20218v.m105636a().m105641f(this.mOutappUrl);
                            } else if (i11 == 3) {
                                this.mOutappUrl = this.mOutappUrl.replace("market://details?id=", "");
                                C20218v.m105636a().m105642g(this.mOutappUrl);
                            }
                            finish();
                            return;
                        }
                        return;
                    }
                    toggleDoneBottomSheet();
                    return;
                }
                this.mAdsContentView.loadUrl(this.mAdsLandingUrl);
            }
            toggleActionGroup();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onClick", e11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:3:0x0006, B:5:0x0011, B:7:0x0055, B:10:0x005c, B:12:0x0066, B:13:0x007f, B:14:0x0082, B:15:0x0093, B:17:0x009a, B:19:0x00a2, B:20:0x00be, B:22:0x00c5, B:24:0x00d4, B:25:0x00e8, B:29:0x00a7, B:31:0x00b1, B:32:0x00b6, B:33:0x00b8, B:34:0x00bb, B:35:0x0073, B:36:0x0087), top: B:2:0x0006 }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onCreate(Bundle bundle) {
        int i11;
        int i12;
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                this.mAdsLandingUrl = extras.getString("adsLanding");
                this.mAdsFeedbackUrl = extras.getString("adsFeedback");
                this.mAdsPerformanceUrl = extras.getString("adsPerformance");
                this.mIsOpeningReport = extras.getBoolean("openReport");
                this.mIsZaloFormMode = extras.getBoolean("zaloForm");
                this.mShouldShowDialog = extras.getBoolean("shouldShowDialog");
                this.mAdsCookieBundle = extras.getBundle("adsCookie");
                this.mAdsActionType = extras.getString("adsActionType");
                String str = this.mAdsLandingUrl;
                if (str != null && str.length() != 0) {
                    if (!this.mAdsLandingUrl.startsWith("http")) {
                        C20218v.m105636a().m105643h(this.mAdsLandingUrl);
                        finish();
                    }
                    this.mOutappUrl = this.mAdsLandingUrl;
                }
                Toast.makeText(this, "Có lỗi xảy ra, vui lòng thử lại!", 0).show();
                checkIfHaveTrackPerformance(this.mAdsPerformanceUrl, 1);
                finish();
                this.mOutappUrl = this.mAdsLandingUrl;
            } else {
                C20218v.m105636a().m105643h(this.mAdsLandingUrl);
                finish();
            }
            requestWindowFeature(1);
            String str2 = this.mAdsActionType;
            if (str2 != null) {
                if (str2.equals("swiperight")) {
                    i11 = AbstractC3640a.zad__slide_in_from_left;
                    i12 = AbstractC3640a.zad__slide_out_to_right;
                } else if (this.mAdsActionType.equals("swipeup")) {
                    i11 = AbstractC3640a.zad__slide_in_bottom;
                    i12 = AbstractC3640a.zad__slide_out_bottom;
                } else {
                    i11 = AbstractC3640a.zad__slide_in_left;
                }
                overridePendingTransition(i11, i12);
                if (this.mIsZaloFormMode) {
                    getWindow().setFlags(1024, 1024);
                    if (Build.VERSION.SDK_INT >= 28) {
                        getWindow().setFlags(512, 512);
                        getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                    }
                }
                setContentView(AbstractC3875f.zad__activity_landing);
                buildLayout();
            }
            i11 = AbstractC3640a.zad__slide_in_left;
            i12 = AbstractC3640a.zad__slide_out_left;
            overridePendingTransition(i11, i12);
            if (this.mIsZaloFormMode) {
            }
            setContentView(AbstractC3875f.zad__activity_landing);
            buildLayout();
        } catch (Exception e11) {
            Toast.makeText(this, "Có lỗi xảy ra, vui lòng thử lại!", 0).show();
            finish();
            Adtima.m18329e(TAG, "onCreate", e11);
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            cleanUp();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onStop", e11);
        }
    }
}
