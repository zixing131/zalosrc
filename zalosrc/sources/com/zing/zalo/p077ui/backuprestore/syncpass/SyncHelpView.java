package com.zing.zalo.p077ui.backuprestore.syncpass;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.webview.ZWebView;
import com.zing.zalo.zmedia.player.ZMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;

/* loaded from: classes5.dex */
public final class SyncHelpView extends SlidableZaloView {

    /* renamed from: P0 */
    private ZWebView f56015P0;

    /* renamed from: Q0 */
    private RelativeLayout f56016Q0;

    /* renamed from: R0 */
    private String f56017R0;

    /* renamed from: com.zing.zalo.ui.backuprestore.syncpass.SyncHelpView$a */
    /* loaded from: classes5.dex */
    public static final class C11130a extends WebViewClient {
        C11130a() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            AbstractC19074t.m100208f(webView, "view");
            AbstractC19074t.m100208f(str, ZMediaPlayer.OnNativeInvokeListener.ARG_URL);
            try {
                if (SyncHelpView.this.m58257gM() != null) {
                    RelativeLayout m58257gM = SyncHelpView.this.m58257gM();
                    AbstractC19074t.m100205c(m58257gM);
                    m58257gM.setVisibility(8);
                }
            } catch (Exception e11) {
                AbstractC20110a.f98889a.mo104552e(e11);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f56017R0 = m92642L3.getString("open_url");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.policy_zview, viewGroup, false);
        this.f56016Q0 = (RelativeLayout) inflate.findViewById(AbstractC6918a0.layoutloading);
        this.f56015P0 = (ZWebView) inflate.findViewById(AbstractC6918a0.webview);
        return inflate;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        try {
            ZWebView zWebView = this.f56015P0;
            if (zWebView != null) {
                AbstractC19074t.m100205c(zWebView);
                zWebView.stopLoading();
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
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
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.sync_pass_input_pass_help));
        }
    }

    /* renamed from: gM */
    public final RelativeLayout m58257gM() {
        return this.f56016Q0;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncHelpView";
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        ZWebView zWebView = this.f56015P0;
        AbstractC19074t.m100205c(zWebView);
        zWebView.getSettings().setJavaScriptEnabled(true);
        ZWebView zWebView2 = this.f56015P0;
        AbstractC19074t.m100205c(zWebView2);
        zWebView2.setWebViewClient(new C11130a());
        ZWebView zWebView3 = this.f56015P0;
        AbstractC19074t.m100205c(zWebView3);
        String str = this.f56017R0;
        AbstractC19074t.m100205c(str);
        zWebView3.loadUrl(str);
    }
}
