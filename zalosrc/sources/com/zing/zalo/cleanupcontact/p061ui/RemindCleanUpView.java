package com.zing.zalo.cleanupcontact.p061ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.zing.zalo.cleanupcontact.p061ui.RemindCleanUpView;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.Button;
import com.zing.zalo.zdesign.component.avatar.C16948d;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import p304ks.C21932r;
import p542ub.InterfaceC27218a;
import p649xl.C29946na;
import qm0.AbstractC25370t;

/* loaded from: classes3.dex */
public final class RemindCleanUpView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29946na f42096P0;

    /* renamed from: jM */
    private final void m39868jM() {
        C29946na c29946na = this.f42096P0;
        C29946na c29946na2 = null;
        if (c29946na == null) {
            AbstractC19074t.m100223u("binding");
            c29946na = null;
        }
        Button button = c29946na.f138793r;
        button.setIdTracking("suggest_cleanup_relation_list_click");
        button.setOnClickListener(new View.OnClickListener() { // from class: rg.a
            public /* synthetic */ ViewOnClickListenerC25771a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemindCleanUpView.m39869kM(RemindCleanUpView.this, view);
            }
        });
        C29946na c29946na3 = this.f42096P0;
        if (c29946na3 == null) {
            AbstractC19074t.m100223u("binding");
            c29946na3 = null;
        }
        c29946na3.f138794s.setOnClickListener(new View.OnClickListener() { // from class: rg.b
            public /* synthetic */ ViewOnClickListenerC25772b() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemindCleanUpView.m39870lM(RemindCleanUpView.this, view);
            }
        });
        C29946na c29946na4 = this.f42096P0;
        if (c29946na4 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29946na2 = c29946na4;
        }
        c29946na2.f138792q.setOnClickListener(new View.OnClickListener() { // from class: rg.c
            public /* synthetic */ ViewOnClickListenerC25773c() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RemindCleanUpView.m39871mM(RemindCleanUpView.this, view);
            }
        });
    }

    /* renamed from: kM */
    public static final void m39869kM(RemindCleanUpView remindCleanUpView, View view) {
        AbstractC19074t.m100208f(remindCleanUpView, "this$0");
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
        InterfaceC27218a m92676n2 = remindCleanUpView.f72421L0.m92676n2();
        AbstractC19074t.m100205c(m92676n2);
        m92676n2.mo35579p().m93069k2(SelectMultiLeastInteractFriendView.class, bundle, 0, true);
    }

    /* renamed from: lM */
    public static final void m39870lM(RemindCleanUpView remindCleanUpView, View view) {
        AbstractC19074t.m100208f(remindCleanUpView, "this$0");
        remindCleanUpView.finish();
    }

    /* renamed from: mM */
    public static final void m39871mM(RemindCleanUpView remindCleanUpView, View view) {
        AbstractC19074t.m100208f(remindCleanUpView, "this$0");
        remindCleanUpView.finish();
    }

    /* renamed from: nM */
    private final void m39872nM() {
        ArrayList arrayList;
        int m131511r;
        List m114400e = C21932r.f107858a.m114400e();
        C29946na c29946na = null;
        if (m114400e != null) {
            List<ContactProfile> list = m114400e;
            m131511r = AbstractC25370t.m131511r(list, 10);
            arrayList = new ArrayList(m131511r);
            for (ContactProfile contactProfile : list) {
                arrayList.add(new C16948d(2, contactProfile.f42434r, contactProfile.m40418n0(), contactProfile.f42446v));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            C29946na c29946na2 = this.f42096P0;
            if (c29946na2 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29946na = c29946na2;
            }
            c29946na.f138795t.m90578d(arrayList, arrayList.size());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29946na m148287c = C29946na.m148287c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148287c, "inflate(...)");
        this.f42096P0 = m148287c;
        if (m148287c == null) {
            AbstractC19074t.m100223u("binding");
            m148287c = null;
        }
        RelativeLayout root = m148287c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m39872nM();
        m39868jM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "suggest_cleanup_relation_popup";
    }
}
