package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
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
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class DeactivateAccountView extends SlidableZaloView implements InterfaceC0733x {

    /* renamed from: com.zing.zalo.ui.zviews.DeactivateAccountView$a */
    /* loaded from: classes6.dex */
    class C14217a extends ZdsActionBar.AbstractC16987c {
        C14217a() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            AbstractC2379w.m12430d(DeactivateAccountView.this.f72421L0.m92676n2().getCurrentFocus());
            if (!DeactivateAccountView.this.f72421L0.m92649TI().mo92703Q0()) {
                DeactivateAccountView.this.finish();
            }
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
        if (super.mo37488Li() && (this.f72421L0.m92649TI().m93012K0() instanceof DeactivateAccountIntroView)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setLeadingFunctionCallback(new C14217a());
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.deactivate_account_activity_title));
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
            this.f72421L0.m92649TI().m93062f2(AbstractC6918a0.deactivate_container, DeactivateAccountIntroView.class, null, 0, true);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "DeactivateAccountView";
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (super.onKeyUp(i11, keyEvent)) {
            return true;
        }
        if (i11 == 4) {
            return this.f72421L0.m92649TI().mo92703Q0();
        }
        return false;
    }
}
