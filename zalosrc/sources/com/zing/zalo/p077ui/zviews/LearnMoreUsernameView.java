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
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.settings.subsettings.SettingManageSourceFriendView;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zview.actionbar.ActionBar;
import java.net.URISyntaxException;
import me0.C23055e5;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class LearnMoreUsernameView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    ZWebView f74573P0;

    /* renamed from: Q0 */
    View f74574Q0;

    /* renamed from: R0 */
    View f74575R0;

    /* renamed from: S0 */
    View f74576S0;

    /* renamed from: T0 */
    View f74577T0;

    /* renamed from: com.zing.zalo.ui.zviews.LearnMoreUsernameView$a */
    /* loaded from: classes6.dex */
    class C14503a extends WebViewClient {
        C14503a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            View view = LearnMoreUsernameView.this.f74576S0;
            if (view != null) {
                view.setVisibility(8);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (!str.startsWith("http://") && !str.startsWith("https://")) {
                try {
                    Intent parseUri = Intent.parseUri(str, 1);
                    if (LearnMoreUsernameView.this.m92648SI().getPackageManager().resolveActivity(parseUri, 0) == null) {
                        String str2 = parseUri.getPackage();
                        if (str2 == null) {
                            return false;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:" + str2));
                        intent.addCategory("android.intent.category.BROWSABLE");
                        LearnMoreUsernameView.this.f72421L0.m92641HK(intent);
                        return true;
                    }
                    parseUri.addCategory("android.intent.category.BROWSABLE");
                    parseUri.setComponent(null);
                    try {
                        if (LearnMoreUsernameView.this.m92648SI() != null && (LearnMoreUsernameView.this.m92648SI() instanceof ZaloActivity)) {
                            LearnMoreUsernameView.this.f72421L0.m92641HK(parseUri);
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
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.learn_more_username_view, viewGroup, false);
        this.f74574Q0 = inflate.findViewById(AbstractC6918a0.btnSetting);
        this.f74575R0 = inflate.findViewById(AbstractC6918a0.layout_network_error);
        this.f74576S0 = inflate.findViewById(AbstractC6918a0.layoutloading);
        this.f74577T0 = inflate.findViewById(AbstractC6918a0.btn_retry);
        ZWebView zWebView = (ZWebView) inflate.findViewById(AbstractC6918a0.webview);
        this.f74573P0 = zWebView;
        zWebView.getSettings().setJavaScriptEnabled(true);
        this.f74574Q0.setOnClickListener(this);
        this.f74577T0.setOnClickListener(this);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            ZWebView zWebView = this.f74573P0;
            if (zWebView != null) {
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
            this.f88760a0.setTitle(m92652XI(AbstractC8020f0.str_learn_more_username));
        }
    }

    /* renamed from: gM */
    void m81058gM(boolean z11) {
        try {
            if (C23055e5.m118272g(z11)) {
                this.f74575R0.setVisibility(8);
                this.f74576S0.setVisibility(0);
                this.f74573P0.setVisibility(0);
                if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().getString("open_url") != null) {
                    this.f74573P0.loadUrl(this.f72421L0.m92642L3().getString("open_url"));
                }
            } else {
                this.f74576S0.setVisibility(8);
                this.f74575R0.setVisibility(0);
                this.f74573P0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LearnMoreUsernameView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnSetting) {
            AbstractC23647d.m123906p("78320021");
            AbstractC23647d.m123893c();
            m92662fJ().m93069k2(SettingManageSourceFriendView.class, null, 1, true);
        } else if (id2 == AbstractC6918a0.btn_retry) {
            m81058gM(true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        this.f74573P0.setWebViewClient(new C14503a());
        m81058gM(false);
    }
}
