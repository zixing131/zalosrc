package com.zing.zalo.p077ui.zalocloud.graceperiod;

import ac.C0708i;
import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1802w0;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zalocloud.graceperiod.ZCloudGPDownloadCompleteDataView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.zalocloud.recover.ZaloCloudRecoverCloudMediaWorker;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mj0.AbstractC23322a;
import p348mi.AbstractC23306f;
import p649xl.AbstractC30056te;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import tg0.C26676b;
import ui0.C27280g;
import yg0.EnumC30980a;
import zb0.C31774c;

/* loaded from: classes6.dex */
public final class ZCloudGPDownloadCompleteDataView extends BaseZCloudView<AbstractC30056te> {
    public static final C13841a Companion = new C13841a(null);

    /* renamed from: R0 */
    private final InterfaceC24854k f71554R0;

    /* renamed from: S0 */
    private int f71555S0;

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadCompleteDataView$a */
    /* loaded from: classes6.dex */
    public static final class C13841a {
        private C13841a() {
        }

        public /* synthetic */ C13841a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.graceperiod.ZCloudGPDownloadCompleteDataView$b */
    /* loaded from: classes6.dex */
    static final class C13842b extends AbstractC19075u implements InterfaceC18494a {
        C13842b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C31774c mo12V4() {
            ZaloView m92690uK = ZCloudGPDownloadCompleteDataView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C31774c) new C1802w0(m92690uK).m9378a(C31774c.class);
        }
    }

    public ZCloudGPDownloadCompleteDataView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13842b());
        this.f71554R0 = m129210a;
        this.f71555S0 = 3;
    }

    /* renamed from: tM */
    private final C31774c m77148tM() {
        return (C31774c) this.f71554R0.getValue();
    }

    /* renamed from: uM */
    public static final void m77149uM(ZCloudGPDownloadCompleteDataView zCloudGPDownloadCompleteDataView, View view) {
        AbstractC19074t.m100208f(zCloudGPDownloadCompleteDataView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_done_check_media", null, null, null, 14, null);
        zCloudGPDownloadCompleteDataView.m77148tM().m152788b0(zCloudGPDownloadCompleteDataView.f71555S0);
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        AbstractC0924m0.m4330wr(EnumC30980a.f142927s.m150597c());
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
        return "ZCloudGraceDownloadFullscreen";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        int i11;
        super.mo57631iM();
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            i11 = m92642L3.getInt("ARG_MODE", this.f71555S0);
        } else {
            i11 = this.f71555S0;
        }
        this.f71555S0 = i11;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_gp_download_complete_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        C0732w m1189a = C0732w.Companion.m1189a();
        C0708i c0708i = new C0708i();
        c0708i.m1073d("ts_analyze_start", AbstractC0924m0.m4074o8());
        c0708i.m1073d("ts_analyze_end", AbstractC0924m0.m4044n8());
        c0708i.m1073d("ts_dl_start", AbstractC0924m0.m4104p8());
        c0708i.m1073d("ts_dl_end", m77757mM().mo124314i());
        C24848g0 c24848g0 = C24848g0.f119245a;
        C0732w.m1177r(m1189a, "zcloud_download_end", null, c0708i, null, 10, null);
        if (this.f71555S0 == 1) {
            C26676b.m136957g("CommonZaloview", "onFinishGracePeriod() - empty media", null, 4, null);
            AbstractC23306f.m120627V1().m90251v(new ZaloCloudRecoverCloudMediaWorker.AbstractC16884f.d(5));
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        int i11 = this.f71555S0;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    ((AbstractC30056te) m77756kM()).f139510S.setText(m92652XI(AbstractC8020f0.str_media_messages_downloaded_successfully));
                }
            } else {
                ((AbstractC30056te) m77756kM()).f139510S.setText(m92652XI(AbstractC8020f0.str_msg_download_has_ended));
                ((AbstractC30056te) m77756kM()).f139509R.setText(m92652XI(AbstractC8020f0.str_msg_download_has_ended_description));
            }
        } else {
            ((AbstractC30056te) m77756kM()).f139510S.setText(m92652XI(AbstractC8020f0.str_all_media_available));
        }
        ((AbstractC30056te) m77756kM()).f139507P.setOnClickListener(new View.OnClickListener() { // from class: yb0.c
            public /* synthetic */ ViewOnClickListenerC30893c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudGPDownloadCompleteDataView.m77149uM(ZCloudGPDownloadCompleteDataView.this, view);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        C24848g0 c24848g0;
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_grace_done_back", null, null, null, 14, null);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
            c24848g0 = C24848g0.f119245a;
        } else {
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            finish();
        }
    }
}
