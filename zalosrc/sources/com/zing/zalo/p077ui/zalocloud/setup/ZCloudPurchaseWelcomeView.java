package com.zing.zalo.p077ui.zalocloud.setup;

import ac.C0732w;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch0.AbstractC3489d;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zalocloud.configs.C16805b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23138m0;
import p649xl.C29790eg;
import tb0.C26626l;
import tg0.C26676b;
import wg0.C28989l;

/* loaded from: classes6.dex */
public final class ZCloudPurchaseWelcomeView extends SlidableZaloView implements View.OnClickListener {
    public static final C13997a Companion = new C13997a(null);

    /* renamed from: P0 */
    private C29790eg f72002P0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.ZCloudPurchaseWelcomeView$a */
    /* loaded from: classes6.dex */
    public static final class C13997a {
        private C13997a() {
        }

        public /* synthetic */ C13997a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: gM */
    private final void m77870gM() {
        C29790eg c29790eg = this.f72002P0;
        if (c29790eg == null) {
            AbstractC19074t.m100223u("binding");
            c29790eg = null;
        }
        c29790eg.f137710q.setOnClickListener(this);
    }

    /* renamed from: hM */
    private final void m77871hM() {
        C26626l.m136689z(C26626l.Companion.m136712a(), false, true, 1, null);
    }

    /* renamed from: iM */
    private final void m77872iM() {
        String m89800f = C16805b.Companion.m89811a().m89800f();
        C29790eg c29790eg = this.f72002P0;
        C29790eg c29790eg2 = null;
        if (c29790eg == null) {
            AbstractC19074t.m100223u("binding");
            c29790eg = null;
        }
        c29790eg.f137713t.setText(m92653YI(AbstractC8020f0.str_title_grateful_user_purchase_zcloud, m89800f));
        C29790eg c29790eg3 = this.f72002P0;
        if (c29790eg3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29790eg2 = c29790eg3;
        }
        c29790eg2.f137712s.setText(m92653YI(AbstractC8020f0.str_description_grateful_user_purchase_zcloud, m89800f));
    }

    /* renamed from: jM */
    private final void m77873jM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null && m92642L3.getInt("KEY_ENTRY_POINT") == 1) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_notif_transition_tap", null, null, null, 14, null);
        }
        C26676b.f126324a.m136993f0();
    }

    /* renamed from: kM */
    private final void m77874kM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        C26626l.Companion.m136712a().m136708u();
        if (!AbstractC3489d.m17501i() && !C28989l.Companion.m144770b(AbstractC23138m0.Companion.m118775b()).m144766u()) {
            return;
        }
        m77874kM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29790eg m147916c = C29790eg.m147916c(LayoutInflater.from(getContext()));
        AbstractC19074t.m100207e(m147916c, "inflate(...)");
        this.f72002P0 = m147916c;
        if (m147916c == null) {
            AbstractC19074t.m100223u("binding");
            m147916c = null;
        }
        LinearLayout root = m147916c.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return false;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m77872iM();
        m77873jM();
        m77870gM();
        AbstractC0924m0.m3734cs(true);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudWelcome";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        C29790eg c29790eg = this.f72002P0;
        if (c29790eg == null) {
            AbstractC19074t.m100223u("binding");
            c29790eg = null;
        }
        if (AbstractC19074t.m100204b(view, c29790eg.f137710q)) {
            m77871hM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        C26626l.Companion.m136712a().m136708u();
    }
}
