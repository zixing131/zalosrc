package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.webview.ZWebView;
import java.net.URISyntaxException;
import me0.AbstractC23136l9;
import p348mi.AbstractC23306f;

/* loaded from: classes6.dex */
public class PolicyZView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    ZWebView f76022P0;

    /* renamed from: Q0 */
    RelativeLayout f76023Q0;

    /* renamed from: com.zing.zalo.ui.zviews.PolicyZView$a */
    /* loaded from: classes6.dex */
    class C14763a extends WebViewClient {
        C14763a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            try {
                RelativeLayout relativeLayout = PolicyZView.this.f76023Q0;
                if (relativeLayout != null) {
                    relativeLayout.setVisibility(8);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (PolicyZView.this.f72421L0.m92648SI().getPackageManager().resolveActivity(parseUri, 0) == null) {
                        String str2 = parseUri.getPackage();
                        if (str2 == null) {
                            return false;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:" + str2));
                        intent.addCategory("android.intent.category.BROWSABLE");
                        PolicyZView.this.f72421L0.m92641HK(intent);
                        return true;
                    }
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent(null);
                    try {
                        if (PolicyZView.this.f72421L0.m92648SI() != null && (PolicyZView.this.f72421L0.m92648SI() instanceof ZaloActivity)) {
                            PolicyZView.this.f72421L0.m92641HK(parseUri);
                            return true;
                        }
                    } catch (ActivityNotFoundException unused) {
                    }
                    return false;
                } catch (URISyntaxException e11) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Bad URI ");
                    sb2.append(str);
                    sb2.append(": ");
                    sb2.append(e11.getMessage());
                }
            }
            return false;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.policy_zview, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            ZWebView zWebView = this.f76022P0;
            if (zWebView != null) {
                zWebView.stopLoading();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo39024IJ();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PolicyZView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f76023Q0 = (RelativeLayout) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.layoutloading);
        ZWebView zWebView = (ZWebView) this.f72421L0.m92656bJ().findViewById(AbstractC6918a0.webview);
        this.f76022P0 = zWebView;
        zWebView.getSettings().setJavaScriptEnabled(true);
        this.f76022P0.setWebViewClient(new C14763a());
        if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().getString("open_url") != null) {
            this.f76022P0.loadUrl(this.f72421L0.m92642L3().getString("open_url"));
            if (m87077NK() != null) {
                m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_faq));
                return;
            }
            return;
        }
        this.f76022P0.loadUrl(AbstractC23306f.m120583H().m110204g().m116323o());
    }
}
