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
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.net.URISyntaxException;
import on0.AbstractC24341v;
import p649xl.C29914le;

/* loaded from: classes6.dex */
public final class WebInAppView extends SlidableZaloView {
    public static final C15373a Companion = new C15373a(null);

    /* renamed from: P0 */
    public C29914le f79481P0;

    /* renamed from: Q0 */
    private String f79482Q0 = "";

    /* renamed from: com.zing.zalo.ui.zviews.WebInAppView$a */
    /* loaded from: classes6.dex */
    public static final class C15373a {
        private C15373a() {
        }

        public /* synthetic */ C15373a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.WebInAppView$b */
    /* loaded from: classes6.dex */
    public static final class C15374b extends WebViewClient {
        C15374b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            ActionBar actionBar;
            AbstractC19074t.m100208f(webView, "view");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            try {
                WebInAppView.this.m86860gM().f138623r.setVisibility(8);
                String title = webView.getTitle();
                if (title != null && title.length() != 0 && (actionBar = WebInAppView.this.f88760a0) != null) {
                    actionBar.setTitle(webView.getTitle());
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
                        Context m92648SI = WebInAppView.this.f72421L0.m92648SI();
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
                            WebInAppView.this.f72421L0.m92641HK(intent);
                            return true;
                        }
                        parseUri.addCategory("android.intent.category.BROWSABLE");
                        parseUri.setComponent(null);
                        if (WebInAppView.this.f72421L0.m92648SI() != null && (WebInAppView.this.f72421L0.m92648SI() instanceof ZaloActivity)) {
                            WebInAppView.this.f72421L0.m92641HK(parseUri);
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
        String str;
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            Bundle m92642L3 = m92642L3();
            String str2 = "";
            if (m92642L3 != null) {
                str = m92642L3.getString("EXTRA_URL", "");
            } else {
                str = null;
            }
            if (str != null) {
                str2 = str;
            }
            this.f79482Q0 = str2;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m92637BK(true);
        C29914le m148219c = C29914le.m148219c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148219c, "inflate(...)");
        m86861hM(m148219c);
        LinearLayout root = m86860gM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            m86860gM().f138625t.stopLoading();
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
            this.f88760a0.setTitle("Zalo");
        }
    }

    /* renamed from: gM */
    public final C29914le m86860gM() {
        C29914le c29914le = this.f79481P0;
        if (c29914le != null) {
            return c29914le;
        }
        AbstractC19074t.m100223u("binding");
        return null;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "WebInAppView";
    }

    /* renamed from: hM */
    public final void m86861hM(C29914le c29914le) {
        AbstractC19074t.m100208f(c29914le, "<set-?>");
        this.f79481P0 = c29914le;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        String str = this.f79482Q0;
        if (str != null && str.length() != 0) {
            m86860gM().f138625t.getSettings().setJavaScriptEnabled(true);
            m86860gM().f138625t.setWebViewClient(new C15374b());
            m86860gM().f138625t.loadUrl(this.f79482Q0);
            return;
        }
        finish();
    }
}
