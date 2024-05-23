package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.ZaloView;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class ChangePhoneNumberView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: P0 */
    private boolean f72684P0 = false;

    /* renamed from: Q0 */
    private boolean f72685Q0 = false;

    /* renamed from: R0 */
    private boolean f72686R0 = true;

    /* renamed from: S0 */
    private int f72687S0 = 1;

    /* renamed from: com.zing.zalo.ui.zviews.ChangePhoneNumberView$a */
    /* loaded from: classes6.dex */
    class C14147a extends ZdsActionBar.AbstractC16987c {

        /* renamed from: a */
        final /* synthetic */ ZdsActionBar f72688a;

        C14147a(ZdsActionBar zdsActionBar) {
            this.f72688a = zdsActionBar;
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC2379w.m12430d(ChangePhoneNumberView.this.f72421L0.m92676n2().getCurrentFocus());
            try {
                if (ChangePhoneNumberView.this.m92649TI().m93012K0() != null && (ChangePhoneNumberView.this.m92649TI().m93012K0() instanceof ChangePhoneAccountExistView)) {
                    C0815e1.m2075D().m2099U(3, 0, 29, "2");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (ChangePhoneNumberView.this.f72421L0.m92649TI().mo92703Q0()) {
                this.f72688a.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title));
            } else {
                ChangePhoneNumberView.this.finish();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f72684P0 = m92642L3.getBoolean("showChangePhoneNumberSuccess");
            this.f72685Q0 = m92642L3.getBoolean("is_unmap_profile", false);
            this.f72686R0 = m92642L3.getBoolean("is_bypass_password", false);
            this.f72687S0 = m92642L3.getInt("source_type_change_phone", 1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(AbstractC7409c0.deactivate_account_view, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        if (super.mo37488Li() && (this.f72421L0.m92649TI().m93012K0() instanceof ChangePhoneNumberIntroView)) {
            return true;
        }
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setLeadingFunctionCallback(new C14147a(m87077NK));
                m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("is_unmap_profile", this.f72685Q0);
            bundle2.putBoolean("is_bypass_password", this.f72686R0);
            bundle2.putInt("source_type_change_phone", this.f72687S0);
            this.f72421L0.m92649TI().m93062f2(AbstractC6918a0.deactivate_container, ChangePhoneNumberIntroView.class, bundle2, 0, true);
        }
    }

    /* renamed from: gM */
    public void m78769gM() {
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangePhoneNumberView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        ZaloView zaloView;
        try {
            super.onActivityResult(i11, i12, intent);
            if (this.f72421L0.m92649TI() != null) {
                zaloView = this.f72421L0.m92649TI().m93012K0();
            } else {
                zaloView = null;
            }
            if (zaloView != null && (zaloView instanceof ChangePhoneNumberInputView)) {
                zaloView.onActivityResult(i11, i12, intent);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            try {
                if (m92649TI().m93012K0() != null && (m92649TI().m93012K0() instanceof ChangePhoneAccountExistView)) {
                    C0815e1.m2075D().m2099U(3, 0, 29, "2");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (this.f72421L0.m92649TI().mo92703Q0()) {
                if (m87077NK() != null) {
                    m87077NK().setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title));
                }
                return true;
            }
        }
        return false;
    }
}
