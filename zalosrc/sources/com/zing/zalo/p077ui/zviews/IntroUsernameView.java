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
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.zview.actionbar.ActionBar;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class IntroUsernameView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    private View f74424M0;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.intro_username_view, viewGroup, false);
        m80899dM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123906p("783001");
            AbstractC23647d.m123893c();
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(m92652XI(AbstractC8020f0.str_header_create_username));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: dM */
    void m80899dM(View view) {
        View findViewById = view.findViewById(AbstractC6918a0.btnNext);
        this.f74424M0 = findViewById;
        findViewById.setOnClickListener(this);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "IntroUsernameView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btnNext) {
            AbstractC23647d.m123906p("783002");
            AbstractC23647d.m123893c();
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            m92662fJ().m93069k2(UpdateUsernameView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123906p("783001");
            AbstractC23647d.m123893c();
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
