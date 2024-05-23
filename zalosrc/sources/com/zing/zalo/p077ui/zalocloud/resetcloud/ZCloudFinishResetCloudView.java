package com.zing.zalo.p077ui.zalocloud.resetcloud;

import ac.C0732w;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1802w0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.resetcloud.C13946d;
import com.zing.zalo.p077ui.zalocloud.resetcloud.ZCloudFinishResetCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.ZCloudSetupContainerView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import p348mi.AbstractC23306f;
import p649xl.AbstractC30023rf;
import pg0.C24747a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class ZCloudFinishResetCloudView extends BaseZCloudView<AbstractC30023rf> {

    /* renamed from: R0 */
    private final InterfaceC24854k f71867R0;

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudFinishResetCloudView$a */
    /* loaded from: classes6.dex */
    static final class C13932a extends AbstractC19075u implements InterfaceC18494a {
        C13932a() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C13946d mo12V4() {
            ZaloView m92690uK = ZCloudFinishResetCloudView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C13946d) new C1802w0(m92690uK).m9378a(C13946d.class);
        }
    }

    public ZCloudFinishResetCloudView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13932a());
        this.f71867R0 = m129210a;
    }

    /* renamed from: tM */
    private final C13946d m77635tM() {
        return (C13946d) this.f71867R0.getValue();
    }

    /* renamed from: uM */
    public static final void m77636uM(ZCloudFinishResetCloudView zCloudFinishResetCloudView, View view) {
        AbstractC19074t.m100208f(zCloudFinishResetCloudView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_end_reset_cloud_accept", null, null, null, 14, null);
        zCloudFinishResetCloudView.m77637vM();
    }

    /* renamed from: vM */
    private final void m77637vM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_STILL_NOT_RESTORE_OLD_BACKUP", false);
        bundle.putBoolean("ARG_IS_RESTART_FLOW", false);
        bundle.putBoolean("ARG_IS_FROM_RESET_CLOUD_FLOW", true);
        if (AbstractC23306f.m120636Y1().m128533r()) {
            AbstractC23306f.m120636Y1().m128512D(false);
            bundle.putBoolean("ARG_IS_CLEAR_ALL_BACKSTACK", true);
            bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        } else {
            bundle.putInt("SHOW_WITH_FLAGS", 7340032);
        }
        if (m92650VI() instanceof ZaloCloudResetContainerView) {
            ZaloView m92650VI = m92650VI();
            AbstractC19074t.m100206d(m92650VI, "null cannot be cast to non-null type com.zing.zalo.ui.zalocloud.resetcloud.ZaloCloudResetContainerView");
            ((ZaloCloudResetContainerView) m92650VI).m77659tM(bundle);
        } else {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ZCloudSetupContainerView.class, bundle, 1, true);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudEndResetCloud";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zcloud_finish_reset_cloud_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        C24747a m120636Y1 = AbstractC23306f.m120636Y1();
        AbstractC19074t.m100207e(m120636Y1, "provideZaloCloudCriticalCaseManager(...)");
        m120636Y1.m128538x();
        m120636Y1.m128517I(false);
        m120636Y1.m128515G(false);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        ((AbstractC30023rf) m77756kM()).f139257P.setOnClickListener(new View.OnClickListener() { // from class: ec0.a
            public /* synthetic */ ViewOnClickListenerC18380a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudFinishResetCloudView.m77636uM(ZCloudFinishResetCloudView.this, view);
            }
        });
        if (m77635tM().m77676M() == C13946d.b.f71897p) {
            ((AbstractC30023rf) m77756kM()).f139259R.setText(m92652XI(AbstractC8020f0.str_zcloud_deleted_protection_code_title));
            ((AbstractC30023rf) m77756kM()).f139258Q.setText(m92652XI(AbstractC8020f0.str_zcloud_deleted_protection_code_description));
        } else {
            ((AbstractC30023rf) m77756kM()).f139259R.setText(m92652XI(AbstractC8020f0.str_zcloud_deleted_old_data));
            ((AbstractC30023rf) m77756kM()).f139258Q.setText(m92652XI(AbstractC8020f0.str_zcloud_re_setup_zcloud));
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
    }
}
