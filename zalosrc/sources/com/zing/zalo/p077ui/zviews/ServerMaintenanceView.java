package com.zing.zalo.p077ui.zviews;

import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.zview.C17487o0;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import p348mi.AbstractC23306f;
import p363nh.C23744a;
import p649xl.C29821gb;
import p716zh.C32150v9;

/* loaded from: classes6.dex */
public final class ServerMaintenanceView extends BaseZaloView implements C23744a.c {

    /* renamed from: M0 */
    private C29821gb f77390M0;

    /* renamed from: eM */
    private final C29821gb m84038eM() {
        C29821gb c29821gb = this.f77390M0;
        AbstractC19074t.m100205c(c29821gb);
        return c29821gb;
    }

    /* renamed from: fM */
    private final void m84039fM() {
        AbstractC19444a.m101697e(new Runnable() { // from class: com.zing.zalo.ui.zviews.yg0
            @Override // java.lang.Runnable
            public final void run() {
                ServerMaintenanceView.m84040gM(ServerMaintenanceView.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: gM */
    public static final void m84040gM(ServerMaintenanceView serverMaintenanceView) {
        AbstractC19074t.m100208f(serverMaintenanceView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        C17487o0 m92662fJ = serverMaintenanceView.m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93069k2(MainTabView.class, bundle, 0, true);
        }
    }

    /* renamed from: hM */
    private final void m84041hM() {
        long m4131q5 = AbstractC0924m0.m4131q5();
        long mo124314i = AbstractC23306f.m120579F1().mo124314i();
        if (mo124314i < m4131q5) {
            m84038eM().f137886q.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.server_maintenance_subtext, AbstractC23160o0.m119198I0(mo124314i, m4131q5)));
        } else {
            m84038eM().f137886q.setText(AbstractC8020f0.server_maintenance_subtext_no_time);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f77390M0 = C29821gb.m147996c(layoutInflater, viewGroup, false);
        LinearLayout root = m84038eM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C23744a.Companion.m124119a().m124117e(this, 6050);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        C23744a.Companion.m124119a().m124115b(this, 6050);
        m84041hM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ServerMaintenanceView";
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m84041hM();
        if (!C32150v9.f148254a.m155132g()) {
            m84039fM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 6050) {
            m84039fM();
        }
    }
}
