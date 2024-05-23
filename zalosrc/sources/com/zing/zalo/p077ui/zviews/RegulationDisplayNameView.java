package com.zing.zalo.p077ui.zviews;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.net.URISyntaxException;
import me0.AbstractC23136l9;
import on0.AbstractC24341v;

/* loaded from: classes6.dex */
public final class RegulationDisplayNameView extends SlidableZaloView {
    public static final C14928a Companion = new C14928a(null);

    /* renamed from: P0 */
    private String f76892P0 = "https://help.zalo.me/article/quy-dinh-ve-viec-dat-ten-hien-thi-cua-zalo";

    /* renamed from: Q0 */
    private ZWebView f76893Q0;

    /* renamed from: R0 */
    private RelativeLayout f76894R0;

    /* renamed from: com.zing.zalo.ui.zviews.RegulationDisplayNameView$a */
    /* loaded from: classes6.dex */
    public static final class C14928a {
        private C14928a() {
        }

        public /* synthetic */ C14928a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.RegulationDisplayNameView$b */
    /* loaded from: classes6.dex */
    public static final class C14929b extends WebViewClient {
        C14929b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            AbstractC19074t.m100208f(webView, "view");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            try {
                if (RegulationDisplayNameView.this.m83562gM() != null) {
                    RelativeLayout m83562gM = RegulationDisplayNameView.this.m83562gM();
                    AbstractC19074t.m100205c(m83562gM);
                    m83562gM.setVisibility(8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean m127120J;
            boolean m127120J2;
            ResolveInfo resolveInfo;
            PackageManager packageManager;
            AbstractC19074t.m100208f(webView, "view");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            m127120J = AbstractC24341v.m127120J(str, "http://", false, 2, null);
            if (!m127120J) {
                m127120J2 = AbstractC24341v.m127120J(str, "https://", false, 2, null);
                if (!m127120J2) {
                    try {
                        Intent parseUri = Intent.parseUri(str, 1);
                        AbstractC19074t.m100205c(parseUri);
                        Context m92648SI = RegulationDisplayNameView.this.m92648SI();
                        if (m92648SI != null && (packageManager = m92648SI.getPackageManager()) != null) {
                            resolveInfo = packageManager.resolveActivity(parseUri, 0);
                        } else {
                            resolveInfo = null;
                        }
                        if (resolveInfo == null) {
                            String str2 = parseUri.getPackage();
                            if (str2 == null) {
                                return false;
                            }
                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:" + str2));
                            intent.addCategory("android.intent.category.BROWSABLE");
                            RegulationDisplayNameView.this.m92641HK(intent);
                            return true;
                        }
                        parseUri.addCategory("android.intent.category.BROWSABLE");
                        parseUri.setComponent(null);
                        if (RegulationDisplayNameView.this.m92648SI() != null && (RegulationDisplayNameView.this.m92648SI() instanceof ZaloActivity)) {
                            RegulationDisplayNameView.this.m92641HK(parseUri);
                            return true;
                        }
                    } catch (ActivityNotFoundException | URISyntaxException unused) {
                    }
                }
            }
            return false;
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String string;
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && (string = m92642L3.getString("EXTRA_OPEN_URL")) != null) {
            AbstractC19074t.m100205c(string);
            this.f76892P0 = string;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        return layoutInflater.inflate(AbstractC7409c0.regulation_display_name_view, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            ZWebView zWebView = this.f76893Q0;
            if (zWebView != null) {
                AbstractC19074t.m100205c(zWebView);
                zWebView.stopLoading();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_regulation_display_name));
        }
    }

    /* renamed from: gM */
    public final RelativeLayout m83562gM() {
        return this.f76894R0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "RegulationDisplayNameView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        View view;
        View view2;
        super.mo37135xJ(bundle);
        View m92656bJ = this.f72421L0.m92656bJ();
        WebSettings webSettings = null;
        if (m92656bJ != null) {
            view = m92656bJ.findViewById(AbstractC6918a0.layoutloading);
        } else {
            view = null;
        }
        AbstractC19074t.m100206d(view, "null cannot be cast to non-null type android.widget.RelativeLayout");
        this.f76894R0 = (RelativeLayout) view;
        View m92656bJ2 = this.f72421L0.m92656bJ();
        if (m92656bJ2 != null) {
            view2 = m92656bJ2.findViewById(AbstractC6918a0.webview);
        } else {
            view2 = null;
        }
        AbstractC19074t.m100206d(view2, "null cannot be cast to non-null type com.zing.zalo.webview.ZWebView");
        ZWebView zWebView = (ZWebView) view2;
        this.f76893Q0 = zWebView;
        if (zWebView != null) {
            webSettings = zWebView.getSettings();
        }
        if (webSettings != null) {
            webSettings.setJavaScriptEnabled(true);
        }
        ZWebView zWebView2 = this.f76893Q0;
        if (zWebView2 != null) {
            zWebView2.setWebViewClient(new C14929b());
        }
        ZWebView zWebView3 = this.f76893Q0;
        AbstractC19074t.m100205c(zWebView3);
        zWebView3.loadUrl(this.f76892P0);
    }
}
