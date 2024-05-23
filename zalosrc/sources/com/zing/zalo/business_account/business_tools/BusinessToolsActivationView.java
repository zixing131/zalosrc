package com.zing.zalo.business_account.business_tools;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.business_account.business_tools.BusinessToolsActivationView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.Button;
import fn0.AbstractC19074t;
import p542ub.InterfaceC27218a;
import p624wx.C29264g;
import p649xl.C29755d;
import p732zy.C32592h;
import ss.C26373e;

/* loaded from: classes3.dex */
public final class BusinessToolsActivationView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29755d f40226P0;

    /* renamed from: hM */
    private final void m37569hM() {
        int i11;
        int i12;
        C29755d c29755d = this.f40226P0;
        C29755d c29755d2 = null;
        if (c29755d == null) {
            AbstractC19074t.m100223u("binding");
            c29755d = null;
        }
        LinearLayout linearLayout = c29755d.f137462s;
        int i13 = 8;
        if (C29264g.f135604a.m146199c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        C29755d c29755d3 = this.f40226P0;
        if (c29755d3 == null) {
            AbstractC19074t.m100223u("binding");
            c29755d3 = null;
        }
        LinearLayout linearLayout2 = c29755d3.f137463t;
        if (C32592h.f150598a.m157755b()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        linearLayout2.setVisibility(i12);
        C29755d c29755d4 = this.f40226P0;
        if (c29755d4 == null) {
            AbstractC19074t.m100223u("binding");
            c29755d4 = null;
        }
        LinearLayout linearLayout3 = c29755d4.f137461r;
        if (C26373e.f125282a.m135794c()) {
            i13 = 0;
        }
        linearLayout3.setVisibility(i13);
        C29755d c29755d5 = this.f40226P0;
        if (c29755d5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29755d2 = c29755d5;
        }
        Button button = c29755d2.f137460q;
        button.setIdTracking("btn_ba_tools_activation");
        button.setOnClickListener(new View.OnClickListener() { // from class: de.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BusinessToolsActivationView.m37570iM(BusinessToolsActivationView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: iM */
    public static final void m37570iM(BusinessToolsActivationView businessToolsActivationView, View view) {
        AbstractC19074t.m100208f(businessToolsActivationView, "this$0");
        businessToolsActivationView.m37571jM();
    }

    /* renamed from: jM */
    private final void m37571jM() {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("SHOW_WITH_FLAGS", 33554432);
            InterfaceC27218a m92676n2 = m92676n2();
            if (m92676n2 != null) {
                m92676n2.mo35573l4(BusinessToolsView.class, bundle, 1, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29755d m147830c = C29755d.m147830c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147830c, "inflate(...)");
        this.f40226P0 = m147830c;
        m37569hM();
        C29755d c29755d = this.f40226P0;
        if (c29755d == null) {
            AbstractC19074t.m100223u("binding");
            c29755d = null;
        }
        LinearLayout root = c29755d.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BusinessToolsActivationView";
    }
}
