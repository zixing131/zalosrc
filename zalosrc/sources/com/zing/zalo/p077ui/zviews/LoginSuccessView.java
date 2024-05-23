package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import me0.AbstractC23136l9;
import p320ld.C22438j;

/* loaded from: classes6.dex */
public class LoginSuccessView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    private View f74731M0;

    /* renamed from: N0 */
    private View f74732N0;

    /* renamed from: fM */
    private void m81203fM(View view) {
        View findViewById = view.findViewById(AbstractC6918a0.btnNext);
        this.f74731M0 = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = view.findViewById(AbstractC6918a0.btnCancel);
        this.f74732N0 = findViewById2;
        findViewById2.setOnClickListener(this);
    }

    /* renamed from: gM */
    public /* synthetic */ void m81204gM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("password_mode", 2);
            bundle.putBoolean("isForceUpdatePassword", true);
            this.f72421L0.m92662fJ().m93069k2(ChangePasswordView.class, bundle, 1, true);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: hM */
    public /* synthetic */ void m81205hM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        try {
            if (C22438j.m115939f(m92693xK())) {
                return;
            }
            m81206iM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iM */
    private void m81206iM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        this.f72421L0.m92662fJ().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
            aVar.m43159h(3).m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.confirm)).m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.dialog_confirm_create_pass)).m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.tv_titleABS_setPass), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.pu
                public /* synthetic */ C16032pu() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    LoginSuccessView.this.m81204gM(interfaceC17463d, i12);
                }
            }).m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cap_skip), new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.qu
                public /* synthetic */ C16069qu() {
                }

                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                    LoginSuccessView.this.m81205hM(interfaceC17463d, i12);
                }
            });
            return aVar.m43152a();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.login_success_view, viewGroup, false);
        m81203fM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.header_success));
                this.f88760a0.setBackButtonImage(0);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "LoginSuccessView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btnNext) {
            Bundle bundle = new Bundle();
            bundle.putInt("password_mode", 2);
            bundle.putBoolean("isForceUpdatePassword", true);
            this.f72421L0.m92662fJ().m93069k2(ChangePasswordView.class, bundle, 1, true);
            return;
        }
        if (id2 == AbstractC6918a0.btnCancel) {
            this.f72421L0.showDialog(1);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
