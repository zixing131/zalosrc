package com.zing.zalo.p077ui.settings.devtool;

import ag0.AbstractC0837p0;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC7306b;
import com.zing.zalo.p077ui.settings.devtool.BuildInfoView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalocore.CoreUtility;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import p542ub.InterfaceC27218a;
import p649xl.C29847i1;

/* loaded from: classes6.dex */
public final class BuildInfoView extends BaseZaloView {
    public static final C13214a Companion = new C13214a(null);

    /* renamed from: M0 */
    private C29847i1 f68124M0;

    /* renamed from: com.zing.zalo.ui.settings.devtool.BuildInfoView$a */
    /* loaded from: classes6.dex */
    public static final class C13214a {
        private C13214a() {
        }

        public /* synthetic */ C13214a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final void m74412a(InterfaceC27218a interfaceC27218a) {
            AbstractC19074t.m100208f(interfaceC27218a, "zaloActivity");
            interfaceC27218a.mo35579p().m93069k2(BuildInfoView.class, null, 0, true);
        }
    }

    /* renamed from: hM */
    private final void m74403hM() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ma0.b
            public /* synthetic */ RunnableC22966b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BuildInfoView.m74404iM(BuildInfoView.this);
            }
        });
    }

    /* renamed from: iM */
    public static final void m74404iM(BuildInfoView buildInfoView) {
        AbstractC19074t.m100208f(buildInfoView, "this$0");
        AbstractC19444a.m101697e(new Runnable() { // from class: ma0.d

            /* renamed from: q */
            public final /* synthetic */ int f111710q;

            /* renamed from: r */
            public final /* synthetic */ int f111711r;

            public /* synthetic */ RunnableC22968d(int i11, int i12) {
                r2 = i11;
                r3 = i12;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BuildInfoView.m74405jM(BuildInfoView.this, r2, r3);
            }
        });
    }

    /* renamed from: jM */
    public static final void m74405jM(BuildInfoView buildInfoView, int i11, int i12) {
        AbstractC19074t.m100208f(buildInfoView, "this$0");
        buildInfoView.m74409nM().f138103B.setVisibility(0);
        buildInfoView.m74409nM().f138103B.setText("Chat DB: " + i11 + " conversations, " + i12 + " messages.");
    }

    /* renamed from: kM */
    private final void m74406kM() {
        AbstractC0837p0.Companion.m2237f().mo2040a(new Runnable() { // from class: ma0.a
            public /* synthetic */ RunnableC22965a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                BuildInfoView.m74407lM(BuildInfoView.this);
            }
        });
    }

    /* renamed from: lM */
    public static final void m74407lM(BuildInfoView buildInfoView) {
        AbstractC19074t.m100208f(buildInfoView, "this$0");
        AbstractC19444a.m101697e(new Runnable() { // from class: ma0.c

            /* renamed from: q */
            public final /* synthetic */ String f111707q;

            /* renamed from: r */
            public final /* synthetic */ String f111708r;

            public /* synthetic */ RunnableC22967c(String str, String str2) {
                r2 = str;
                r3 = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                BuildInfoView.m74408mM(BuildInfoView.this, r2, r3);
            }
        });
    }

    /* renamed from: mM */
    public static final void m74408mM(BuildInfoView buildInfoView, String str, String str2) {
        AbstractC19074t.m100208f(buildInfoView, "this$0");
        AbstractC19074t.m100208f(str2, "$installedModules");
        buildInfoView.m74409nM().f138106q.setText("ABI: " + str);
        buildInfoView.m74409nM().f138107r.setText("Build ID: " + AbstractC7306b.f40031a);
        buildInfoView.m74409nM().f138115z.setText("Version code: " + CoreUtility.f89236l);
        buildInfoView.m74409nM().f138108s.setText("Build time: " + AbstractC7306b.f40032b);
        buildInfoView.m74409nM().f138112w.setText("Installed modules: " + str2);
        if (buildInfoView.m74410oM()) {
            buildInfoView.m74409nM().f138110u.setVisibility(0);
            buildInfoView.m74409nM().f138110u.setText("Git branch: " + AbstractC7306b.f40033c);
            buildInfoView.m74409nM().f138111v.setVisibility(0);
            buildInfoView.m74409nM().f138111v.setText("Git commit: " + AbstractC7306b.f40034d);
            buildInfoView.m74409nM().f138109t.setVisibility(0);
            buildInfoView.m74409nM().f138109t.setText("Builder: " + AbstractC7306b.f40035e);
        }
        buildInfoView.m74409nM().f138114y.setVisibility(0);
        buildInfoView.m74409nM().f138114y.setText("Pipeline ID: " + AbstractC7306b.f40036f);
    }

    /* renamed from: nM */
    private final C29847i1 m74409nM() {
        C29847i1 c29847i1 = this.f68124M0;
        AbstractC19074t.m100205c(c29847i1);
        return c29847i1;
    }

    /* renamed from: oM */
    private final boolean m74410oM() {
        return false;
    }

    /* renamed from: pM */
    private final void m74411pM() {
        m74406kM();
        if (m74410oM()) {
            m74403hM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        this.f68124M0 = C29847i1.m148057c(LayoutInflater.from(getContext()), viewGroup, false);
        m74411pM();
        LinearLayout root = m74409nM().getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BuildInfoView";
    }
}
