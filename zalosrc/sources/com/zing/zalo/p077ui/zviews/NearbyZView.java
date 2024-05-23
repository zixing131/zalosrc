package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.CustomTypefaceSpan;
import com.zing.zalo.p077ui.zviews.NearbyZView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.actionbar.ActionBarMenu;
import com.zing.zalo.zview.actionbar.ActionBarMenuItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23059e9;
import me0.AbstractC23136l9;
import me0.C23055e5;
import mm0.AbstractC23350e;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class NearbyZView extends SlidableZaloView implements InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: T0 */
    public static final String f75608T0 = "NearbyZView";

    /* renamed from: P0 */
    boolean f75609P0;

    /* renamed from: Q0 */
    ActionBarMenuItem f75610Q0;

    /* renamed from: R0 */
    TextView f75611R0;

    /* renamed from: S0 */
    Handler f75612S0 = new Handler();

    /* renamed from: com.zing.zalo.ui.zviews.NearbyZView$a */
    /* loaded from: classes6.dex */
    public class C14690a implements InterfaceC20094a {
        C14690a() {
        }

        /* renamed from: d */
        public /* synthetic */ void m82310d() {
            try {
                AbstractC23309i.m121177Lx(false);
                NearbyZView.this.finish();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.m89265m(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            Handler handler = NearbyZView.this.f75612S0;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.zing.zalo.ui.zviews.u10
                    public /* synthetic */ u10() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        NearbyZView.C14690a.this.m82310d();
                    }
                });
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        boolean z11;
        super.mo37111CJ(bundle);
        AbstractC23059e9.m118318G(80);
        if (m92642L3() != null && m92642L3().getBoolean("EXTRA_DISABLE_SWIPE_TO_CLOSE")) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f75609P0 = z11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            try {
                C8009j.a aVar = new C8009j.a(m92648SI());
                aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_titleDlg2)).m43159h(3);
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_contentDlg2));
                aVar.m43154c(false);
                aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_no), new InterfaceC17463d.b());
                aVar.m43169r(AbstractC8020f0.str_yes, this);
                return aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: FJ */
    public void mo37482FJ(ActionBarMenu actionBarMenu) {
        Typeface createFromAsset;
        super.mo37482FJ(actionBarMenu);
        if (m92648SI() != null && m92674mJ() && !m92681pJ()) {
            actionBarMenu.m92750r();
            ActionBarMenuItem m92738e = actionBarMenu.m92738e(AbstractC6918a0.action_bar_menu_more, AbstractC16803z.icn_header_menu_more_white);
            this.f75610Q0 = m92738e;
            this.f75611R0 = (TextView) m92738e.m92774j(AbstractC23136l9.m118724l(getContext(), AbstractC6918a0.menu_hide_location, AbstractC8020f0.str_btn_hide_location));
            try {
                if (AbstractC23309i.m122089kb() == 0 && m92648SI() != null && (createFromAsset = Typeface.createFromAsset(m92648SI().getAssets(), "fonts/Roboto-Regular.ttf")) != null) {
                    SpannableString spannableString = new SpannableString(this.f75611R0.getText());
                    spannableString.setSpan(new CustomTypefaceSpan("", createFromAsset), 0, spannableString.length(), 33);
                    this.f75611R0.setText(spannableString);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.nearby_view, viewGroup, false);
        m92637BK(true);
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 1 && i11 == -1) {
                m82307gM();
                interfaceC17463d.dismiss();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && !this.f75609P0 && (m92649TI().m93012K0() instanceof UserOANearbyZView)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == AbstractC6918a0.menu_hide_location) {
            try {
                AbstractC23647d.m123907q("5340", "");
                showDialog(1);
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                AbstractC23350e.m122776f(f75608T0, e11);
            }
            return true;
        }
        if (i11 == 16908332 && m92649TI().mo92703Q0()) {
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            if (m92648SI() != null && m92674mJ()) {
                ActionBar actionBar = this.f88760a0;
                if (actionBar != null) {
                    actionBar.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                    this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                    this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
                    this.f88760a0.setSubtitle(null);
                    ZaloView m93012K0 = m92649TI().m93012K0();
                    if (m93012K0 == null) {
                        this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.usernearby_title));
                    } else if (m93012K0 instanceof UserNearbyListView) {
                        this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_user));
                    } else if (m93012K0 instanceof OANearbyZView) {
                        this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_place));
                    } else {
                        this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.usernearby_title));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: gM */
    void m82307gM() {
        if (C23055e5.m118272g(true)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C14690a());
            c0766k.mo1385A4();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return f75608T0;
    }

    /* renamed from: hM */
    public void m82308hM(String str) {
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(str);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        m92643OI(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            return m92649TI().mo92703Q0();
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle == null) {
            m92649TI().m93062f2(AbstractC6918a0.content_container, UserOANearbyZView.class, null, 0, true);
        }
    }
}
