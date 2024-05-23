package com.zing.zalo.webview.miniapp.webview_bottomsheet.p079ui;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout;
import fn0.AbstractC19074t;
import p278jv.C21369c;
import p649xl.C29836h8;
import p663xz.C30226b;
import p729zu.InterfaceC32557a;
import pm0.C24848g0;
import sf0.C26240b;
import tf0.InterfaceC26647a;
import tf0.ViewOnClickListenerC26649c;

/* loaded from: classes5.dex */
public final class WebViewBS extends BottomSheet implements InterfaceC32557a {

    /* renamed from: b1 */
    private C29836h8 f85230b1;

    /* renamed from: c1 */
    private WebContentView f85231c1;

    /* renamed from: d1 */
    private C26240b f85232d1;

    /* renamed from: com.zing.zalo.webview.miniapp.webview_bottomsheet.ui.WebViewBS$a */
    /* loaded from: classes5.dex */
    public static final class C16796a implements InterfaceC26647a {
        C16796a() {
        }

        @Override // tf0.InterfaceC26647a
        /* renamed from: a */
        public void mo89720a() {
            WebViewBS.this.close();
        }

        @Override // tf0.InterfaceC26647a
        /* renamed from: b */
        public void mo89721b(C21369c c21369c) {
            AbstractC19074t.m100208f(c21369c, "loadingViewState");
            C26240b c26240b = WebViewBS.this.f85232d1;
            if (c26240b != null) {
                c26240b.m134930f(c21369c);
            }
        }

        @Override // tf0.InterfaceC26647a
        /* renamed from: c */
        public void mo89722c(String str) {
            AbstractC19074t.m100208f(str, "newTitle");
            C26240b c26240b = WebViewBS.this.f85232d1;
            if (c26240b != null) {
                c26240b.m134927c(str);
            }
        }
    }

    /* renamed from: JL */
    private final InterfaceC26647a m89716JL() {
        return new C16796a();
    }

    /* renamed from: KL */
    private final void m89717KL(Bundle bundle) {
        WebContentView webContentView = new WebContentView();
        this.f85231c1 = webContentView;
        AbstractC19074t.m100205c(webContentView);
        webContentView.m89714tS(m89716JL());
        WebContentView webContentView2 = this.f85231c1;
        AbstractC19074t.m100205c(webContentView2);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        webContentView2.m89713sS(new C30226b(m92689tK));
        m92649TI().m92995E(this.f85231c1, false).m93138e(AbstractC6918a0.web_base_view_container).m93139f(bundle).m93137d(0).m93136a();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: P2 */
    public View mo45941P2() {
        C29836h8 c29836h8 = this.f85230b1;
        if (c29836h8 != null) {
            return c29836h8.getRoot();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        String str;
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C26240b c26240b = new C26240b(this);
        this.f85232d1 = c26240b;
        AbstractC19074t.m100205c(c26240b);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 == null || (str = m92642L3.getString("BUNDLE_EXTRA_CONFIG")) == null) {
            str = "{}";
        }
        c26240b.m134929e(str);
        m90524sL(0.9f);
        BottomSheetLayout m90518hL = m90518hL();
        if (m90518hL != null) {
            m90518hL.setNestedScrollingEnabled(true);
        }
        C29836h8 c29836h8 = this.f85230b1;
        AbstractC19074t.m100205c(c29836h8);
        ViewOnClickListenerC26649c viewOnClickListenerC26649c = new ViewOnClickListenerC26649c(c29836h8, this);
        InterfaceC1801w m92657cJ = m92657cJ();
        AbstractC19074t.m100207e(m92657cJ, "getViewLifecycleOwner(...)");
        C26240b c26240b2 = this.f85232d1;
        AbstractC19074t.m100205c(c26240b2);
        viewOnClickListenerC26649c.m136789h(m92657cJ, c26240b2);
        Bundle m92642L32 = m92642L3();
        if (m92642L32 == null) {
            m92642L32 = new Bundle();
        }
        m89717KL(m92642L32);
    }

    @Override // p729zu.InterfaceC32557a
    /* renamed from: cG */
    public void mo89718cG() {
        close();
    }

    @Override // p729zu.InterfaceC32557a
    public boolean canGoBack() {
        WebContentView webContentView = this.f85231c1;
        if (webContentView != null) {
            return webContentView.canGoBack();
        }
        return false;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f85230b1 = C29836h8.m148033c(layoutInflater, linearLayout, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            C26240b c26240b = this.f85232d1;
            if (c26240b != null) {
                c26240b.m134928d();
            }
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // p729zu.InterfaceC32557a
    /* renamed from: ra */
    public void mo89719ra() {
        WebContentView webContentView = this.f85231c1;
        if (webContentView != null) {
            webContentView.m86799ra();
            C24848g0 c24848g0 = C24848g0.f119245a;
        }
    }
}
