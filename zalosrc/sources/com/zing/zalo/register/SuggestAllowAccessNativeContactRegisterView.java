package com.zing.zalo.register;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bi0.AbstractC2810d;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.register.SuggestAllowAccessNativeContactRegisterView;
import com.zing.zalo.zdesign.component.Avatar;
import com.zing.zalo.zdesign.component.avatar.EnumC16949e;
import com.zing.zalo.zview.AbstractC17484n;
import fn0.AbstractC19074t;
import me0.AbstractC23034c6;
import me0.C23212s8;
import p248iy.AbstractC20887g;
import p542ub.InterfaceC27218a;
import p649xl.C29949nd;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class SuggestAllowAccessNativeContactRegisterView extends SlidableZaloView {

    /* renamed from: P0 */
    private C29949nd f49325P0;

    /* renamed from: jM */
    private final void m49935jM() {
        Context m92689tK = m92689tK();
        String[] strArr = AbstractC23034c6.f112032i;
        if (!AbstractC23034c6.m118116D(m92689tK, strArr)) {
            AbstractC20887g.m109217D(510080, null, 2, null);
            AbstractC23034c6.m118184v0(this.f72421L0, strArr, 108);
        }
    }

    /* renamed from: kM */
    private final void m49936kM() {
        C29949nd c29949nd = this.f49325P0;
        C29949nd c29949nd2 = null;
        if (c29949nd == null) {
            AbstractC19074t.m100223u("binding");
            c29949nd = null;
        }
        RelativeLayout root = c29949nd.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        root.setPadding(root.getPaddingLeft(), AbstractC17484n.Companion.m92931b(), root.getPaddingRight(), root.getPaddingBottom());
        C29949nd c29949nd3 = this.f49325P0;
        if (c29949nd3 == null) {
            AbstractC19074t.m100223u("binding");
            c29949nd3 = null;
        }
        c29949nd3.f138813r.setOnClickListener(new View.OnClickListener() { // from class: cz.x1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestAllowAccessNativeContactRegisterView.m49937lM(SuggestAllowAccessNativeContactRegisterView.this, view);
            }
        });
        C29949nd c29949nd4 = this.f49325P0;
        if (c29949nd4 == null) {
            AbstractC19074t.m100223u("binding");
            c29949nd4 = null;
        }
        c29949nd4.f138815t.setOnClickListener(new View.OnClickListener() { // from class: cz.y1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestAllowAccessNativeContactRegisterView.m49938mM(SuggestAllowAccessNativeContactRegisterView.this, view);
            }
        });
        C29949nd c29949nd5 = this.f49325P0;
        if (c29949nd5 == null) {
            AbstractC19074t.m100223u("binding");
            c29949nd5 = null;
        }
        Avatar avatar = c29949nd5.f138812q;
        int i11 = AbstractC2810d.zds_il_sync_contact_onboarding_dark_spot_1_1;
        int i12 = AbstractC2810d.zds_il_sync_contact_onboarding_light_spot_1_1;
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        if (C23212s8.m119603k()) {
            i11 = i12;
        }
        avatar.setImageDrawable(C27280g.m139658a(m92689tK, i11));
        Context context = avatar.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        avatar.m90481x(context, EnumC16949e.SIZE_128);
        C29949nd c29949nd6 = this.f49325P0;
        if (c29949nd6 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29949nd2 = c29949nd6;
        }
        c29949nd2.f138814s.setOnClickListener(new View.OnClickListener() { // from class: cz.z1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SuggestAllowAccessNativeContactRegisterView.m49939nM(SuggestAllowAccessNativeContactRegisterView.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public static final void m49937lM(SuggestAllowAccessNativeContactRegisterView suggestAllowAccessNativeContactRegisterView, View view) {
        AbstractC19074t.m100208f(suggestAllowAccessNativeContactRegisterView, "this$0");
        AbstractC20887g.m109217D(510082, null, 2, null);
        suggestAllowAccessNativeContactRegisterView.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static final void m49938mM(SuggestAllowAccessNativeContactRegisterView suggestAllowAccessNativeContactRegisterView, View view) {
        AbstractC19074t.m100208f(suggestAllowAccessNativeContactRegisterView, "this$0");
        suggestAllowAccessNativeContactRegisterView.m49935jM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public static final void m49939nM(SuggestAllowAccessNativeContactRegisterView suggestAllowAccessNativeContactRegisterView, View view) {
        AbstractC19074t.m100208f(suggestAllowAccessNativeContactRegisterView, "this$0");
        AbstractC20887g.m109217D(510081, null, 2, null);
        suggestAllowAccessNativeContactRegisterView.m49940oM();
    }

    /* renamed from: oM */
    private final void m49940oM() {
        if (MainTabView.m67645lM() != null) {
            MainTabView.m67645lM().m67701oN();
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putBoolean("EXTRA_REQUESTED_CONTACT_PERMISSION_REGISTER", true);
        bundle.putInt("SHOW_WITH_FLAGS", 50331648);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null) {
            m92676n2.mo35573l4(MainTabView.class, bundle, 1, true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29949nd m148296c = C29949nd.m148296c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148296c, "inflate(...)");
        this.f49325P0 = m148296c;
        m49936kM();
        C29949nd c29949nd = this.f49325P0;
        if (c29949nd == null) {
            AbstractC19074t.m100223u("binding");
            c29949nd = null;
        }
        RelativeLayout root = c29949nd.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SuggestAllowAccessNativeContactRegisterView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        int i12;
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 108) {
            if (AbstractC23034c6.m118116D(m92689tK(), strArr)) {
                i12 = 510083;
            } else {
                i12 = 510084;
            }
            AbstractC20887g.m109217D(i12, null, 2, null);
            m49940oM();
        }
    }
}
