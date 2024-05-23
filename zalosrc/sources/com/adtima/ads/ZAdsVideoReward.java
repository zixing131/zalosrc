package com.adtima.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.adtima.AbstractC3873d;
import com.adtima.AbstractC3874e;
import com.adtima.AbstractC3875f;
import com.adtima.Adtima;
import com.adtima.control.CustomWebView;
import com.adtima.control.ZVideoControl;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p009a3.C0098c;
import p009a3.C0100e;
import p029b3.C2504b;
import p047c3.C3228a;
import p090d3.C17719b;
import p178g3.AbstractC19214i;
import p196h3.InterfaceC19747i;
import p227i3.AbstractC20216t;
import p227i3.C20212p;
import p227i3.C20217u;
import p227i3.C20218v;
import p313l3.AbstractC22010c;
import p350n.C23498d;
import p350n.EnumC23496b;

/* loaded from: classes2.dex */
public final class ZAdsVideoReward extends Activity implements InterfaceC19747i {
    private static final String TAG = "ZAdsVideoReward";
    private static ZAdsListener mAdsListener;
    private static Object mAdsRewardExtras;
    private static C3228a mQoSEntity;
    private static C2504b mVideoProfile;
    private Context mAdsContext = null;
    private Dialog mAlertDialog = null;
    private ZVideoControl mAdsVideoControl = null;
    private Configuration mConfiguration = null;
    private RelativeLayout mVideoContainerView = null;
    private CustomWebView mWvAdBackground = null;
    private RelativeLayout mCardContainerView = null;
    private CustomWebView mWvAdsInterstitial = null;
    private RelativeLayout mAdsContainer = null;
    private FrameLayout mVideoAdClosePanel = null;
    private FrameLayout mInterstitialAdClosePanel = null;
    private ImageButton mVideoAdCloseButton = null;
    private TextView mTvSkipAdPanel = null;
    private ImageButton mAdsSoundButton = null;
    private int mSoundOnDrawable = -1;
    private int mSoundOffDrawable = -1;
    private C17719b mAdsData = null;
    private boolean mAdsVastImpressionWaiting = false;
    private List<String> mAdsVastImpressionUrl = null;
    private boolean mAdsAutoPlayPrefer = true;
    private boolean mAdsSoundOnPrefer = true;
    private boolean mAdsDismissOnBackground = false;
    private CountDownTimer mCountDownTimer = null;
    private BroadcastReceiver mAdsPowerKeyReceiver = null;
    private int mAdsWidth = 0;
    private int mAdsHeight = 0;
    private int mAdsOrientationPrefer = 0;
    private String mAdsContentId = "";
    private boolean mAdsCanRewarded = false;
    private boolean mAdsReceivedReward = false;
    private boolean mShouldLoadAdsBackground = true;
    private boolean mIsAdBackup = false;

    private void buildAdtimaInterstitial() {
        try {
            CustomWebView customWebView = new CustomWebView(Adtima.SharedContext);
            this.mWvAdsInterstitial = customWebView;
            customWebView.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsVideoReward.5
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return true;
                    }
                    try {
                        if (str.equals(ZAdsAction.URL_ACTION_CLOSE)) {
                            ZAdsVideoReward.this.finish();
                            return true;
                        }
                        if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsOpened");
                            if (ZAdsVideoReward.mAdsListener != null) {
                                ZAdsVideoReward.mAdsListener.onAdsOpened();
                            }
                            ZAdsVideoReward.this.checkIfHaveClick();
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsInteracted");
                            if (ZAdsVideoReward.mAdsListener == null) {
                                return true;
                            }
                        } else {
                            if (!str.equals(ZAdsAction.URL_ACTION_CTA)) {
                                if (!str.contains("adtima")) {
                                    return true;
                                }
                                C20218v.m105636a().m105643h(str);
                                return true;
                            }
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsOpened");
                            if (ZAdsVideoReward.mAdsListener != null) {
                                ZAdsVideoReward.mAdsListener.onAdsOpened();
                            }
                            ZAdsVideoReward.this.checkIfHaveAction();
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsInteracted");
                            if (ZAdsVideoReward.mAdsListener == null) {
                                return true;
                            }
                        }
                        ZAdsVideoReward.mAdsListener.onAdsInteracted();
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsVideoReward.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            int i11 = AbstractC22010c.f108378a;
            this.mWvAdsInterstitial.setLayoutParams(new RelativeLayout.LayoutParams(i11, i11));
            Configuration configuration = this.mConfiguration;
            this.mWvAdsInterstitial.loadDataWithBaseURL(null, (configuration == null || configuration.orientation != 2) ? this.mAdsData.f89806b.f94012c : this.mAdsData.f89806b.f94013d, "text/html", "UTF-8", null);
            int i12 = AbstractC22010c.f108378a;
            new RelativeLayout.LayoutParams(i12, i12).addRule(13);
            this.mCardContainerView.removeAllViews();
            this.mCardContainerView.addView(this.mWvAdsInterstitial);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"NewApi", "SourceLockedOrientationActivity"})
    private void buildAdtimaVideoReward(final boolean z11) {
        int i11;
        try {
            ZVideoControl zVideoControl = new ZVideoControl(this.mAdsContext, this);
            this.mAdsVideoControl = zVideoControl;
            zVideoControl.setSoundIconVisible(false);
            this.mAdsVideoControl.setSoundOn(this.mAdsSoundOnPrefer);
            this.mAdsVideoControl.setVisibility(0);
            this.mAdsVideoControl.setProgressModel(ZVideoControl.EnumC3872k.BAR);
            this.mAdsVideoControl.setClickPanelEnable(false);
            this.mAdsVideoControl.setVastModel(mVideoProfile.f10200a);
            this.mAdsVideoControl.m18507A(this.mAdsData.f89805a.f521n);
            this.mAdsVideoControl.setIsAdtimaVideo(this.mAdsData.f89805a.f546z0);
            this.mVideoAdCloseButton = null;
            this.mAdsSoundButton = null;
            this.mTvSkipAdPanel = null;
            if (!this.mAdsReceivedReward) {
                this.mAdsVideoControl.setListener(new ZVideoControl.C3871j() { // from class: com.adtima.ads.ZAdsVideoReward.4
                    @Override // com.adtima.control.ZVideoControl.C3871j
                    public void onCurrentDuration(int i12, int i13) {
                        String format;
                        Adtima.m18328e(ZAdsVideoReward.TAG, "Current " + i12 + " Total " + i13);
                        if (ZAdsVideoReward.this.mAdsData.f89805a.f504e0) {
                            if (!ZAdsVideoReward.this.mAdsData.f89805a.f504e0 || ZAdsVideoReward.this.mAdsData.f89805a.f506f0 <= 0) {
                                return;
                            }
                            long j11 = i12;
                            if (j11 >= ZAdsVideoReward.this.mAdsData.f89805a.f506f0) {
                                if (ZAdsVideoReward.this.mTvSkipAdPanel != null && ZAdsVideoReward.this.mTvSkipAdPanel.getVisibility() == 0) {
                                    ZAdsVideoReward.this.mTvSkipAdPanel.setVisibility(4);
                                    ZAdsVideoReward.this.mTvSkipAdPanel = null;
                                }
                                if (ZAdsVideoReward.this.mVideoAdCloseButton != null) {
                                    ZAdsVideoReward.this.mVideoAdCloseButton.setVisibility(0);
                                }
                                ZAdsVideoReward.this.mAdsCanRewarded = true;
                                ZAdsVideoReward.this.mAdsVideoControl.setListener(null);
                                return;
                            }
                            if (ZAdsVideoReward.this.mTvSkipAdPanel == null || z11) {
                                return;
                            }
                            ZAdsVideoReward.this.mTvSkipAdPanel.setVisibility(0);
                            format = String.format("Bỏ qua sau %d giây", Long.valueOf(ZAdsVideoReward.this.mAdsData.f89805a.f506f0 - j11));
                        } else {
                            if (ZAdsVideoReward.this.mTvSkipAdPanel == null) {
                                return;
                            }
                            ZAdsVideoReward.this.mTvSkipAdPanel.setVisibility(0);
                            format = String.format("Bỏ qua sau %d giây", Integer.valueOf(i13 - i12));
                        }
                        ZAdsVideoReward.this.mTvSkipAdPanel.setText(format);
                    }
                });
            }
            int i12 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, i12);
            int i13 = this.mAdsOrientationPrefer;
            if (i13 == 1) {
                int i14 = this.mAdsWidth;
                if (i14 > 0 && (i11 = this.mAdsHeight) > 0) {
                    if (i14 > i11) {
                        i14 = i11;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(i14, (i14 * 9) / 16);
                    layoutParams.topMargin = i14 / 2;
                }
                initAdsBackground();
                this.mWvAdBackground.setVisibility(0);
            } else if (i13 != 2) {
                if (this.mAdsWidth > 0 && this.mAdsHeight > 0) {
                    int i15 = this.mAdsWidth;
                    layoutParams = new RelativeLayout.LayoutParams(i15, (i15 * 9) / 16);
                }
                Configuration configuration = this.mConfiguration;
                if (configuration != null && configuration.orientation == 1) {
                    layoutParams.topMargin = this.mAdsWidth / 2;
                }
            }
            this.mAdsVideoControl.setLayoutParams(layoutParams);
            this.mAdsContainer.addView(this.mAdsVideoControl, layoutParams);
            this.mVideoAdClosePanel = buildClosePanel(true);
            TextView buildSkipPanel = buildSkipPanel();
            this.mTvSkipAdPanel = buildSkipPanel;
            buildSkipPanel.setVisibility(4);
            ImageButton buildCloseButton = buildCloseButton(true);
            this.mVideoAdCloseButton = buildCloseButton;
            buildCloseButton.setVisibility(0);
            ImageButton buildSoundButton = buildSoundButton();
            this.mAdsSoundButton = buildSoundButton;
            buildSoundButton.setVisibility(0);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "buildAdtimaVideoReward", e11);
        }
    }

    private ImageButton buildCloseButton(boolean z11) {
        try {
            C0100e m105520a = AbstractC20216t.m105520a(this.mAdsContext);
            int min = (int) (((Math.min(m105520a.f572a, m105520a.f573b) * 0.15f) * 2.0f) / 3.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(min, min);
            layoutParams.gravity = 3;
            ImageButton imageButton = new ImageButton(this.mAdsContext);
            try {
                imageButton.setBackgroundColor(0);
                imageButton.bringToFront();
                imageButton.setLayoutParams(layoutParams);
                imageButton.setImageResource(AbstractC3873d.zad__ic_rewarded_close);
                imageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageButton.setPadding(5, 5, 5, 5);
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsVideoReward.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        try {
                            ZAdsVideoReward.this.handleBackAndClose();
                        } catch (Exception unused) {
                        }
                    }
                });
                (z11 ? this.mVideoAdClosePanel : this.mInterstitialAdClosePanel).addView(imageButton, layoutParams);
                return imageButton;
            } catch (Exception unused) {
                return imageButton;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private FrameLayout buildClosePanel(boolean z11) {
        FrameLayout frameLayout;
        try {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC22010c.f108379b, AbstractC22010c.f108378a);
            layoutParams.addRule(9);
            layoutParams.addRule(10);
            layoutParams.addRule(15);
            frameLayout = new FrameLayout(this.mAdsContext);
        } catch (Exception e11) {
            e = e11;
            frameLayout = null;
        }
        try {
            frameLayout.setPadding(20, 20, 20, 20);
            (z11 ? this.mVideoContainerView : this.mCardContainerView).addView(frameLayout);
        } catch (Exception e12) {
            e = e12;
            Adtima.m18328e(TAG, e.toString());
            return frameLayout;
        }
        return frameLayout;
    }

    private TextView buildSkipPanel() {
        try {
            C0100e m105520a = AbstractC20216t.m105520a(this.mAdsContext);
            double min = (int) (((Math.min(m105520a.f572a, m105520a.f573b) * 0.15f) * 2.0f) / 3.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AbstractC22010c.f108379b, (int) (0.75d * min));
            layoutParams.gravity = 17;
            layoutParams.setMargins((int) (min * 0.45d), 0, 50, 0);
            TextView textView = new TextView(this.mAdsContext);
            try {
                textView.setTextSize(0, 44.0f);
                textView.bringToFront();
                textView.setGravity(17);
                textView.setId(AbstractC19214i.m100835a());
                textView.setLayoutParams(layoutParams);
                textView.setTextColor(-16777216);
                textView.setBackground(getResources().getDrawable(AbstractC3873d.zad__skip_pannel_background));
                textView.setVisibility(4);
                this.mVideoAdClosePanel.addView(textView);
                return textView;
            } catch (Exception unused) {
                return textView;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private ImageButton buildSoundButton() {
        try {
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            boolean m18511d0 = zVideoControl != null ? zVideoControl.m18511d0() : false;
            this.mSoundOnDrawable = AbstractC3873d.zad__ic_rewarded_sound_on;
            this.mSoundOffDrawable = AbstractC3873d.zad__ic_rewarded_sound_off;
            C0100e m105520a = AbstractC20216t.m105520a(this.mAdsContext);
            int min = (int) (((Math.min(m105520a.f572a, m105520a.f573b) * 0.15f) * 2.0f) / 3.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(min, min);
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.addRule(15);
            layoutParams.setMargins(20, 20, 20, 5);
            ImageButton imageButton = new ImageButton(this.mAdsContext);
            try {
                imageButton.setBackgroundColor(0);
                imageButton.bringToFront();
                imageButton.setLayoutParams(layoutParams);
                imageButton.setImageResource(m18511d0 ? this.mSoundOnDrawable : this.mSoundOffDrawable);
                imageButton.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageButton.setPadding(5, 5, 5, 5);
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsVideoReward.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (ZAdsVideoReward.this.mAdsVideoControl != null) {
                            ZAdsVideoReward.this.mAdsVideoControl.m18509a();
                        }
                    }
                });
                this.mAdsContainer.addView(imageButton, layoutParams);
                return imageButton;
            } catch (Exception unused) {
                return imageButton;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    private RelativeLayout buildVideoLayout() {
        try {
            int i11 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i11, i11);
            RelativeLayout relativeLayout = new RelativeLayout(this.mAdsContext);
            try {
                relativeLayout.setLayoutParams(layoutParams);
                relativeLayout.setClipChildren(false);
                relativeLayout.setBackgroundColor(0);
                return relativeLayout;
            } catch (Exception unused) {
                return relativeLayout;
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveAction() {
        String str;
        C20217u m105538N0;
        C0098c c0098c;
        String str2;
        int i11;
        try {
            try {
                C17719b c17719b = this.mAdsData;
                if (c17719b != null && (str = c17719b.f89805a.f505f) != null) {
                    if (str.equals("default")) {
                        checkIfHaveClick();
                    } else {
                        if (this.mAdsData.f89805a.f505f.equals("call")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData.f89805a;
                            str2 = this.mAdsContentId;
                            i11 = 6;
                        } else if (this.mAdsData.f89805a.f505f.equals("chat")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData.f89805a;
                            str2 = this.mAdsContentId;
                            i11 = 5;
                        } else if (this.mAdsData.f89805a.f505f.equals("follow")) {
                            m105538N0 = C20217u.m105538N0();
                            c0098c = this.mAdsData.f89805a;
                            str2 = this.mAdsContentId;
                            i11 = 7;
                        }
                        m105538N0.m105608p(i11, c0098c, str2);
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveAction", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void checkIfHaveClick() {
        ZAdsListener zAdsListener;
        try {
            try {
                C17719b c17719b = this.mAdsData;
                if (c17719b != null) {
                    String str = c17719b.f89805a.f505f;
                    if (str != null && str.length() != 0 && this.mAdsData.f89805a.f505f.equals("follow")) {
                        C20217u.m105538N0().m105608p(7, this.mAdsData.f89805a, this.mAdsContentId);
                    } else if (mVideoProfile.f10200a != null) {
                        String str2 = this.mAdsData.f89805a.f512i0;
                        if (str2 == null || str2.length() == 0 || (zAdsListener = mAdsListener) == null || !zAdsListener.onAdsContentHandler(this.mAdsData.f89805a.f512i0)) {
                            if (!this.mIsAdBackup) {
                                C20217u.m105538N0().m105596X(this.mAdsVastImpressionUrl, this.mAdsContentId);
                            }
                            C20217u.m105538N0().m105596X(mVideoProfile.f10200a.m123359s().m125455d(), this.mAdsContentId);
                            C20217u.m105538N0().m105616w(this.mAdsData.f89805a, mVideoProfile.f10200a.m123359s().m125453a(), this.mAdsContentId);
                        } else {
                            if (!this.mIsAdBackup) {
                                C20217u.m105538N0().m105596X(this.mAdsVastImpressionUrl, this.mAdsContentId);
                            }
                            C20217u.m105538N0().m105596X(mVideoProfile.f10200a.m123359s().m125455d(), this.mAdsContentId);
                        }
                    }
                }
                ZAdsListener zAdsListener2 = mAdsListener;
                if (zAdsListener2 != null) {
                    zAdsListener2.onAdsClicked();
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveClick", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void checkIfHaveConversion() {
        try {
            if (this.mAdsData != null) {
                C20217u.m105538N0().m105608p(3, this.mAdsData.f89805a, this.mAdsContentId);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "checkIfHaveConversion", e11);
        }
    }

    private synchronized void checkIfHaveImpressionAndActiveView() {
        List<String> list;
        C17719b c17719b;
        try {
            try {
                if (this.mAdsVideoControl != null) {
                    ZAdsListener zAdsListener = mAdsListener;
                    if (zAdsListener != null) {
                        zAdsListener.onAdsVideoStage(this.mAdsData.f89805a.f502d0 ? ZAdsVideoStage.AUTO_PLAY : ZAdsVideoStage.CLICK_TO_PLAY);
                    }
                    if (this.mAdsVastImpressionWaiting && (list = this.mAdsVastImpressionUrl) != null && list.size() != 0) {
                        this.mAdsVastImpressionWaiting = false;
                        if (!this.mIsAdBackup) {
                            C20217u.m105538N0().m105596X(this.mAdsVastImpressionUrl, this.mAdsContentId);
                        }
                        ZVideoControl zVideoControl = this.mAdsVideoControl;
                        if (zVideoControl != null && (c17719b = this.mAdsData) != null && !zVideoControl.m18510b0() && c17719b.f89805a.f502d0 && this.mAdsAutoPlayPrefer) {
                            this.mAdsVideoControl.m18514l0();
                        }
                    }
                }
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "checkIfHaveImpressionAndActiveView", e11);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void clearAllDataAndView() {
        try {
            this.mAdsData = null;
            this.mAdsVastImpressionUrl = null;
            this.mAdsVastImpressionWaiting = false;
            CountDownTimer countDownTimer = this.mCountDownTimer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.mCountDownTimer = null;
            }
            AbstractC19214i.m100836b(this.mVideoAdClosePanel);
            this.mVideoAdClosePanel = null;
            AbstractC19214i.m100836b(this.mWvAdsInterstitial);
            this.mWvAdsInterstitial = null;
            AbstractC19214i.m100840f(this.mAdsVideoControl);
            this.mAdsVideoControl = null;
            unregisterScreenOffReceiver();
            AbstractC19214i.m100836b(this.mAdsContainer);
            this.mAdsContainer = null;
            if (mQoSEntity != null) {
                mQoSEntity = C20212p.m105468m().m105471b(mQoSEntity, "incvideo", false);
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "clearAllDataAndView", e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissConfirmCancelAd() {
        try {
            Dialog dialog = this.mAlertDialog;
            if (dialog == null || !dialog.isShowing()) {
                return;
            }
            this.mAlertDialog.dismiss();
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    public static void handleAdsListener(ZAdsListener zAdsListener) {
        mAdsListener = zAdsListener;
    }

    public static void handleAdsRewardExtras(Object obj) {
        mAdsRewardExtras = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBackAndClose() {
        try {
            if (!this.mAdsCanRewarded) {
                showConfirmCancelAd();
            } else if (this.mAdsVideoControl.getVisibility() == 0) {
                transitToLandingPage();
            } else {
                finish();
            }
        } catch (Exception unused) {
        }
    }

    public static void handleQoSEntity(C3228a c3228a) {
        mQoSEntity = c3228a;
    }

    public static void handleVideoProfile(C2504b c2504b) {
        mVideoProfile = c2504b;
    }

    private void initAdConfirmDialog() {
        try {
            View inflate = getLayoutInflater().inflate(AbstractC3875f.zad__rewarded_confirm_dialog, (ViewGroup) null);
            Dialog dialog = new Dialog(this);
            this.mAlertDialog = dialog;
            dialog.setContentView(inflate);
            inflate.findViewById(AbstractC3874e.zad__crd_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsVideoReward.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ZAdsVideoReward.this.finish();
                }
            });
            inflate.findViewById(AbstractC3874e.zad__crd_btn_continue).setOnClickListener(new View.OnClickListener() { // from class: com.adtima.ads.ZAdsVideoReward.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    try {
                        ZAdsVideoReward.this.dismissConfirmCancelAd();
                        if (ZAdsVideoReward.this.mAdsVideoControl == null || ZAdsVideoReward.this.mAlertDialog == null || ZAdsVideoReward.this.mAlertDialog.isShowing()) {
                            return;
                        }
                        ZAdsVideoReward.this.mAdsVideoControl.m18514l0();
                    } catch (Exception e11) {
                        Adtima.m18328e(ZAdsVideoReward.TAG, e11.toString());
                    }
                }
            });
            if (this.mAlertDialog.getWindow() != null) {
                this.mAlertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            this.mAlertDialog.setCancelable(false);
            this.mAlertDialog.setCanceledOnTouchOutside(false);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    private void initAdsBackground() {
        if (this.mShouldLoadAdsBackground) {
            this.mWvAdBackground.setWebViewClient(new WebViewClient() { // from class: com.adtima.ads.ZAdsVideoReward.1
                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (str == null) {
                        return true;
                    }
                    try {
                        if (str.equals(ZAdsAction.URL_ACTION_CLOSE)) {
                            ZAdsVideoReward.this.finish();
                            return true;
                        }
                        if (str.equals(ZAdsAction.URL_ACTION_TARGET)) {
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsOpened");
                            if (ZAdsVideoReward.mAdsListener != null) {
                                ZAdsVideoReward.mAdsListener.onAdsOpened();
                            }
                            ZAdsVideoReward.this.checkIfHaveClick();
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsInteracted");
                            if (ZAdsVideoReward.mAdsListener == null) {
                                return true;
                            }
                        } else {
                            if (!str.equals(ZAdsAction.URL_ACTION_CTA)) {
                                if (!str.contains("adtima")) {
                                    return true;
                                }
                                C20218v.m105636a().m105643h(str);
                                return true;
                            }
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsOpened");
                            if (ZAdsVideoReward.mAdsListener != null) {
                                ZAdsVideoReward.mAdsListener.onAdsOpened();
                            }
                            ZAdsVideoReward.this.checkIfHaveAction();
                            Adtima.m18326d(ZAdsVideoReward.TAG, "Adtima onAdsInteracted");
                            if (ZAdsVideoReward.mAdsListener == null) {
                                return true;
                            }
                        }
                        ZAdsVideoReward.mAdsListener.onAdsInteracted();
                        return true;
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsVideoReward.TAG, "Adtima shouldOverrideUrlLoading", e11);
                        return true;
                    }
                }
            });
            this.mWvAdBackground.loadDataWithBaseURL(null, this.mAdsData.f89806b.f94011b, "text/html", "UTF-8", null);
            this.mShouldLoadAdsBackground = false;
        }
    }

    private void initInterstitialAdPage() {
        try {
            buildAdtimaInterstitial();
            this.mInterstitialAdClosePanel = buildClosePanel(false);
            buildCloseButton(false);
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    private void initVideoAdPage() {
        try {
            this.mVideoContainerView.removeAllViews();
            RelativeLayout buildVideoLayout = buildVideoLayout();
            this.mAdsContainer = buildVideoLayout;
            this.mVideoContainerView.addView(buildVideoLayout);
            Configuration configuration = this.mConfiguration;
            if (configuration == null || configuration.orientation != 1) {
                this.mWvAdBackground.setVisibility(4);
            } else {
                initAdsBackground();
                this.mWvAdBackground.setVisibility(0);
            }
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    private void initView() {
        try {
            Adtima.m18328e(TAG, "InitView");
            initAdConfirmDialog();
            setContentView(AbstractC3875f.zad__activity_adtima_rewarded);
            this.mWvAdBackground = (CustomWebView) findViewById(AbstractC3874e.zad__arv_wv_background);
            this.mVideoContainerView = (RelativeLayout) findViewById(AbstractC3874e.zad__arv_v_video);
            this.mCardContainerView = (RelativeLayout) findViewById(AbstractC3874e.zad__arv_v_interstitial);
            this.mVideoContainerView.setVisibility(0);
            this.mCardContainerView.setVisibility(8);
            initVideoAdPage();
            initInterstitialAdPage();
            buildAdtimaVideoReward(false);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onCreate", e11);
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsLoadFailed(-3);
            }
            finish();
        }
    }

    private void registerScreenOffReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.adtima.ads.ZAdsVideoReward.6
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    try {
                        if (intent.getAction().equals("android.intent.action.SCREEN_OFF") && ZAdsVideoReward.this.mAdsVideoControl != null && ZAdsVideoReward.this.mAdsVideoControl.m18510b0()) {
                            ZAdsVideoReward.this.mAdsVideoControl.m18513j0();
                        }
                    } catch (Exception e11) {
                        Adtima.m18329e(ZAdsVideoReward.TAG, "unregisterReceiver", e11);
                    }
                }
            };
            this.mAdsPowerKeyReceiver = broadcastReceiver;
            registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception unused) {
        }
    }

    private void showConfirmCancelAd() {
        try {
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                zVideoControl.m18513j0();
            }
            Dialog dialog = this.mAlertDialog;
            if (dialog == null || dialog.isShowing()) {
                return;
            }
            this.mAlertDialog.show();
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    private void transitToLandingPage() {
        try {
            this.mCardContainerView.setVisibility(0);
            try {
                if (this.mAdsVideoControl != null) {
                    CountDownTimer countDownTimer = this.mCountDownTimer;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    CountDownTimer countDownTimer2 = new CountDownTimer(500L, 500L) { // from class: com.adtima.ads.ZAdsVideoReward.7
                        @Override // android.os.CountDownTimer
                        public void onFinish() {
                            ZAdsVideoReward.this.mAdsVideoControl.setVisibility(8);
                            ZAdsVideoReward.this.mAdsVideoControl.m18517x();
                            ZAdsVideoReward.this.mVideoContainerView.setVisibility(4);
                            ZAdsVideoReward.this.mVideoContainerView.removeAllViews();
                        }

                        @Override // android.os.CountDownTimer
                        public void onTick(long j11) {
                        }
                    };
                    this.mCountDownTimer = countDownTimer2;
                    countDownTimer2.start();
                }
                if (!this.mAdsCanRewarded || this.mAdsReceivedReward) {
                    return;
                }
                checkIfHaveConversion();
                this.mAdsReceivedReward = true;
                ZAdsListener zAdsListener = mAdsListener;
                if (zAdsListener != null) {
                    zAdsListener.onAdsRewarded(mAdsRewardExtras, this.mAdsData.f89805a.f511i);
                }
            } catch (Exception unused) {
                ZVideoControl zVideoControl = this.mAdsVideoControl;
                if (zVideoControl != null) {
                    zVideoControl.setVisibility(8);
                }
            }
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    private void unregisterScreenOffReceiver() {
        try {
            BroadcastReceiver broadcastReceiver = this.mAdsPowerKeyReceiver;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
                this.mAdsPowerKeyReceiver = null;
            }
        } catch (Exception e11) {
            this.mAdsPowerKeyReceiver = null;
            Adtima.m18329e(TAG, "unregisterReceiver", e11);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        try {
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsClosed();
            }
            clearAllDataAndView();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "finish", e11);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            handleBackAndClose();
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i11;
        super.onConfigurationChanged(configuration);
        Adtima.m18328e(TAG, "onConfigurationChanged");
        try {
            if (this.mAdsOrientationPrefer != 0) {
                initView();
                return;
            }
            int i12 = AbstractC22010c.f108378a;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i12, i12);
            int i13 = configuration.orientation;
            if (i13 == 2) {
                this.mAdsContainer.getChildAt(0).setLayoutParams(layoutParams);
            } else if (i13 == 1) {
                int i14 = this.mAdsWidth;
                if (i14 > 0 && (i11 = this.mAdsHeight) > 0) {
                    if (i14 > i11) {
                        i14 = i11;
                    }
                    layoutParams = new RelativeLayout.LayoutParams(i14, (i14 * 9) / 16);
                    layoutParams.topMargin = i14 / 2;
                }
                this.mAdsContainer.getChildAt(0).setLayoutParams(layoutParams);
                initAdsBackground();
                this.mWvAdBackground.setVisibility(0);
            }
            buildAdtimaInterstitial();
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"SourceLockedOrientationActivity"})
    protected void onCreate(Bundle bundle) {
        ZAdsListener zAdsListener;
        Adtima.m18328e(TAG, "onCreate");
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Context context = Adtima.SharedContext;
            this.mAdsContext = context;
            this.mConfiguration = context.getResources().getConfiguration();
            String stringExtra = getIntent().getStringExtra("adsData");
            this.mAdsContentId = getIntent().getStringExtra("adsContentId");
            this.mAdsSoundOnPrefer = getIntent().getBooleanExtra("adsSoundOnPrefer", false);
            this.mAdsAutoPlayPrefer = getIntent().getBooleanExtra("adsAutoPlayPrefer", true);
            this.mAdsDismissOnBackground = getIntent().getBooleanExtra("adsDismissOnBackground", false);
            this.mAdsOrientationPrefer = getIntent().getIntExtra("adsOrientationPrefer", 0);
            C17719b m93793a = C17719b.m93793a(new JSONObject(stringExtra));
            this.mAdsData = m93793a;
            if (m93793a == null && (zAdsListener = mAdsListener) != null) {
                zAdsListener.onAdsLoadFailed(-3);
                finish();
            }
            this.mIsAdBackup = this.mAdsData.f89805a.f467A0;
            this.mAdsWidth = AbstractC20216t.m105523d(this);
            this.mAdsHeight = AbstractC20216t.m105521b(this);
            int i11 = this.mAdsOrientationPrefer;
            if (i11 == 1) {
                setRequestedOrientation(1);
                if (AbstractC20216t.m105522c(this) != 1) {
                    return;
                }
            } else if (i11 == 2) {
                setRequestedOrientation(6);
                if (AbstractC20216t.m105522c(this) != 2) {
                    return;
                }
            }
            initView();
        } catch (JSONException e11) {
            Adtima.m18329e(TAG, "onCreate", e11);
            ZAdsListener zAdsListener2 = mAdsListener;
            if (zAdsListener2 != null) {
                zAdsListener2.onAdsLoadFailed(-3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            clearAllDataAndView();
            Dialog dialog = this.mAlertDialog;
            if (dialog != null) {
                if (dialog.isShowing()) {
                    this.mAlertDialog.dismiss();
                }
                this.mAlertDialog = null;
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "finish", e11);
        }
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        try {
            unregisterScreenOffReceiver();
            Adtima.m18326d(TAG, "onPause");
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                zVideoControl.m18513j0();
            }
            if (this.mAdsCanRewarded || !this.mAdsDismissOnBackground) {
                return;
            }
            finish();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onPause", e11);
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        Dialog dialog;
        super.onResume();
        try {
            registerScreenOffReceiver();
            if (this.mAdsVideoControl == null || (dialog = this.mAlertDialog) == null || dialog.isShowing()) {
                return;
            }
            this.mAdsVideoControl.m18514l0();
        } catch (Exception e11) {
            Adtima.m18328e(TAG, e11.toString());
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        try {
            Adtima.m18326d(TAG, "onStop");
            ZVideoControl zVideoControl = this.mAdsVideoControl;
            if (zVideoControl != null) {
                zVideoControl.m18513j0();
            }
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onStop", e11);
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastClick(String str, List<String> list) {
        Adtima.m18326d(TAG, "onVastClick");
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastError(String str, List<String> list) {
        Adtima.m18326d(TAG, "onVastError");
        try {
            mQoSEntity = C20212p.m105468m().m105471b(mQoSEntity, "incvideo", false);
            if (list != null && list.size() != 0) {
                C20217u.m105538N0().m105594V(str, list);
            }
            ZAdsListener zAdsListener = mAdsListener;
            if (zAdsListener != null) {
                zAdsListener.onAdsVideoStage(ZAdsVideoStage.ERROR);
                mAdsListener.onAdsLoadFailed(-3);
            }
            finish();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onVastError", e11);
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastEvent(EnumC23496b enumC23496b, List<String> list) {
        ZAdsListener zAdsListener;
        ZAdsVideoStage zAdsVideoStage;
        int i11;
        Adtima.m18326d(TAG, "onVastEvent: " + enumC23496b);
        try {
            ImageButton imageButton = this.mAdsSoundButton;
            if (imageButton != null) {
                if (enumC23496b == EnumC23496b.mute) {
                    i11 = this.mSoundOffDrawable;
                } else if (enumC23496b == EnumC23496b.unmute) {
                    i11 = this.mSoundOnDrawable;
                }
                imageButton.setImageResource(i11);
            }
            if (list != null && list.size() != 0 && !this.mIsAdBackup) {
                C20217u.m105538N0().m105596X(list, this.mAdsContentId);
            }
            if (enumC23496b == EnumC23496b.creativeView) {
                zAdsListener = mAdsListener;
                if (zAdsListener == null) {
                    return;
                } else {
                    zAdsVideoStage = ZAdsVideoStage.OPENED;
                }
            } else if (enumC23496b == EnumC23496b.start) {
                C20217u.m105538N0().m105608p(8, this.mAdsData.f89805a, this.mAdsContentId);
                zAdsListener = mAdsListener;
                if (zAdsListener == null) {
                    return;
                } else {
                    zAdsVideoStage = ZAdsVideoStage.STARTED;
                }
            } else {
                if (enumC23496b == EnumC23496b.complete) {
                    this.mAdsCanRewarded = true;
                    ZAdsListener zAdsListener2 = mAdsListener;
                    if (zAdsListener2 != null) {
                        zAdsListener2.onAdsVideoStage(ZAdsVideoStage.COMPLETED);
                    }
                    transitToLandingPage();
                    return;
                }
                if (enumC23496b != EnumC23496b.close || (zAdsListener = mAdsListener) == null) {
                    return;
                } else {
                    zAdsVideoStage = ZAdsVideoStage.CLOSED;
                }
            }
            zAdsListener.onAdsVideoStage(zAdsVideoStage);
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onVastEvent", e11);
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastImpression(List<String> list) {
        Adtima.m18326d(TAG, "onVastImpression");
        if (list != null) {
            try {
                if (list.size() == 0 || this.mIsAdBackup) {
                    return;
                }
                C20217u.m105538N0().m105596X(list, this.mAdsContentId);
            } catch (Exception e11) {
                Adtima.m18329e(TAG, "onVastImpression", e11);
            }
        }
    }

    @Override // p196h3.InterfaceC19747i
    public void onVastLoadFinished(C23498d c23498d) {
        Adtima.m18326d(TAG, "onVastLoadFinished");
        try {
            mQoSEntity = C20212p.m105468m().m105471b(mQoSEntity, "incvideo", true);
            this.mAdsVideoControl.setVisibility(0);
            this.mAdsVastImpressionWaiting = true;
            this.mAdsVastImpressionUrl = mVideoProfile.f10200a.m123356p();
            checkIfHaveImpressionAndActiveView();
        } catch (Exception e11) {
            Adtima.m18329e(TAG, "onVastLoadFinished", e11);
        }
    }
}
