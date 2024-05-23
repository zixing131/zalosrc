package com.zing.zalo.p077ui.zalocloud.setup;

import android.content.Context;
import android.view.View;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.setup.ZaloCloudEncryptionSetupIntroView;
import com.zing.zalo.zview.actionbar.ActionBar;
import fn0.AbstractC19074t;
import hc0.EnumC19985o;
import mj0.AbstractC23322a;
import p649xl.AbstractC29879jf;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZaloCloudEncryptionSetupIntroView extends BaseSetupZaloCloudView<AbstractC29879jf> {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m77901AM(ZaloCloudEncryptionSetupIntroView zaloCloudEncryptionSetupIntroView, View view) {
        AbstractC19074t.m100208f(zaloCloudEncryptionSetupIntroView, "this$0");
        C26676b.f126324a.m136968G();
        BaseSetupZaloCloudView.m77746xM(zaloCloudEncryptionSetupIntroView, EnumC19985o.f98291t, null, 2, null);
    }

    /* renamed from: zM */
    private final void m77903zM() {
        if (m77748tM().m77929b0()) {
            ((AbstractC29879jf) m77756kM()).f138351Q.setText(m92652XI(AbstractC8020f0.str_title_create_new_protect_code));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        Context context;
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudSetUpPwdIntro";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zalo_cloud_encryption_setup_intro_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        ((AbstractC29879jf) m77756kM()).f138350P.setOnClickListener(new View.OnClickListener() { // from class: hc0.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZaloCloudEncryptionSetupIntroView.m77901AM(ZaloCloudEncryptionSetupIntroView.this, view);
            }
        });
        m77903zM();
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (m77748tM().m77929b0()) {
            m77748tM().m77940n0();
        } else {
            super.mo57606qM();
        }
    }
}
