package com.zing.zalo.webview.miniapp.webview_bottomsheet.p079ui;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.ZaloWebView;
import com.zing.zalo.webview.ZWebView;
import fn0.AbstractC19074t;
import p227i3.C20218v;
import p278jv.C21367a;
import p278jv.C21369c;
import p663xz.InterfaceC30225a;
import tf0.InterfaceC26647a;

/* loaded from: classes5.dex */
public final class WebContentView extends ZaloWebView {

    /* renamed from: h2 */
    private InterfaceC26647a f85228h2;

    /* renamed from: i2 */
    private InterfaceC30225a f85229i2;

    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.zview.ZaloView
    /* renamed from: BJ */
    public boolean mo87132BJ(MenuItem menuItem) {
        AbstractC19074t.m100208f(menuItem, "item");
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        m87142ZR(false);
        View mo37483GJ = super.mo37483GJ(layoutInflater, viewGroup, bundle);
        RelativeLayout m86813xO = m86813xO();
        if (m86813xO != null) {
            m86813xO.setVisibility(8);
        }
        return mo37483GJ;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: IJ */
    public void mo39024IJ() {
        super.mo39024IJ();
        InterfaceC26647a interfaceC26647a = this.f85228h2;
        if (interfaceC26647a != null) {
            interfaceC26647a.mo89720a();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.p077ui.zviews.WebBaseView, com.zing.zalo.p077ui.zviews.RotatableZaloView, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        ZWebView m86724FO = m86724FO();
        if (m86724FO != null) {
            m86724FO.setOnCreateContextMenuListener(this);
        }
        m86816yO().m150328d2(false);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: aR */
    public void mo86759aR(C21369c c21369c) {
        AbstractC19074t.m100208f(c21369c, "loadingViewState");
        super.mo86759aR(c21369c);
        InterfaceC26647a interfaceC26647a = this.f85228h2;
        if (interfaceC26647a != null) {
            interfaceC26647a.mo89721b(c21369c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.p077ui.zviews.WebBaseView
    /* renamed from: fQ */
    public boolean mo81389fQ() {
        String str;
        super.mo81389fQ();
        C21367a c21367a = (C21367a) m86816yO().m150354r0().mo9215f();
        String str2 = null;
        if (c21367a != null) {
            str = c21367a.m110738e();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0 || m86800sO() < 0 || m86800sO() >= 400) {
            InterfaceC30225a interfaceC30225a = this.f85229i2;
            if (interfaceC30225a != null) {
                str = interfaceC30225a.getString(AbstractC8020f0.app_name);
            } else {
                str = null;
            }
        }
        InterfaceC26647a interfaceC26647a = this.f85228h2;
        if (interfaceC26647a != null) {
            if (str == null) {
                InterfaceC30225a interfaceC30225a2 = this.f85229i2;
                if (interfaceC30225a2 != null) {
                    str2 = interfaceC30225a2.getString(AbstractC8020f0.app_name);
                }
                if (str2 == null) {
                    str = "";
                } else {
                    str = str2;
                }
            }
            interfaceC26647a.mo89722c(str);
            return true;
        }
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloWebView, com.zing.zalo.zview.ZaloView, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        AbstractC19074t.m100208f(contextMenu, "menu");
        AbstractC19074t.m100208f(view, C20218v.f100059b);
    }

    /* renamed from: sS */
    public final void m89713sS(InterfaceC30225a interfaceC30225a) {
        this.f85229i2 = interfaceC30225a;
    }

    /* renamed from: tS */
    public final void m89714tS(InterfaceC26647a interfaceC26647a) {
        this.f85228h2 = interfaceC26647a;
    }
}
