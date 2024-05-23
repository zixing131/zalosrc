package com.zing.zalo.p077ui.storage;

import ac.C0708i;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.text.AbstractC1463b;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zdesign.component.Button;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import hu.C20128b;
import j30.C20912a;
import k30.C21459a;
import me0.AbstractC23152n3;
import p163fl.C18989a;
import p227i3.C20218v;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import p645xh.C29628e;
import p649xl.C29842he;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ta0.C26613c;

/* loaded from: classes6.dex */
public final class WarningFullStorageView extends BaseZaloView implements View.OnClickListener {
    public static final C13311a Companion = new C13311a(null);

    /* renamed from: M0 */
    private C29842he f68407M0;

    /* renamed from: N0 */
    private final InterfaceC24854k f68408N0;

    /* renamed from: O0 */
    private final InterfaceC24854k f68409O0;

    /* renamed from: P0 */
    private final InterfaceC24854k f68410P0;

    /* renamed from: Q0 */
    private int f68411Q0;

    /* renamed from: com.zing.zalo.ui.storage.WarningFullStorageView$a */
    /* loaded from: classes6.dex */
    public static final class C13311a {
        private C13311a() {
        }

        public /* synthetic */ C13311a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningFullStorageView$b */
    /* loaded from: classes6.dex */
    static final class C13312b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13312b f68412q = new C13312b();

        C13312b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C21275a mo12V4() {
            return AbstractC23306f.m120583H();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningFullStorageView$c */
    /* loaded from: classes6.dex */
    static final class C13313c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13313c f68413q = new C13313c();

        C13313c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C20912a mo12V4() {
            return AbstractC23306f.m120732z1();
        }
    }

    /* renamed from: com.zing.zalo.ui.storage.WarningFullStorageView$d */
    /* loaded from: classes6.dex */
    static final class C13314d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13314d f68414q = new C13314d();

        C13314d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final C18989a mo12V4() {
            return AbstractC23306f.m120567B1();
        }
    }

    public WarningFullStorageView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C13312b.f68412q);
        this.f68408N0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C13313c.f68413q);
        this.f68409O0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C13314d.f68414q);
        this.f68410P0 = m129210a3;
    }

    /* renamed from: dM */
    private final C21275a m74730dM() {
        return (C21275a) this.f68408N0.getValue();
    }

    /* renamed from: eM */
    private final C20912a m74731eM() {
        return (C20912a) this.f68409O0.getValue();
    }

    /* renamed from: fM */
    private final C18989a m74732fM() {
        return (C18989a) this.f68410P0.getValue();
    }

    /* renamed from: gM */
    private final void m74733gM() {
        AbstractC23152n3.m119078x0(getContext());
        C26613c.f126018a.m136637c("storage_full_screen", "direct_os_manage_storage", this.f68411Q0);
    }

    /* renamed from: hM */
    private final void m74734hM() {
        AbstractC23152n3.m119050j0(m92689tK(), m74730dM().m110204g().m116311c());
        C26613c.f126018a.m136637c("storage_full_screen", "direct_help_center", this.f68411Q0);
    }

    /* renamed from: iM */
    private final void m74735iM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f68411Q0 = m92642L3.getInt("EXTRA_FREE_SIZE");
        }
        int i11 = this.f68411Q0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("parseViewArgs(): freeSize=");
        sb2.append(i11);
    }

    /* renamed from: jM */
    private final void m74736jM() {
        if (C21459a.m111034b(C20128b.m104764k()) >= m74731eM().m109400d()) {
            m74732fM().m99705j(false);
            finish();
        }
    }

    /* renamed from: kM */
    private final void m74737kM() {
        C29842he c29842he = this.f68407M0;
        C29842he c29842he2 = null;
        if (c29842he == null) {
            AbstractC19074t.m100223u("binding");
            c29842he = null;
        }
        c29842he.f138063q.setOnClickListener(this);
        C29842he c29842he3 = this.f68407M0;
        if (c29842he3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29842he2 = c29842he3;
        }
        c29842he2.f138064r.setOnClickListener(this);
    }

    /* renamed from: lM */
    private final void m74738lM() {
        String str;
        C29842he c29842he = this.f68407M0;
        C29842he c29842he2 = null;
        if (c29842he == null) {
            AbstractC19074t.m100223u("binding");
            c29842he = null;
        }
        c29842he.f138063q.setIdTracking("clean_device_storage_button");
        C29842he c29842he3 = this.f68407M0;
        if (c29842he3 == null) {
            AbstractC19074t.m100223u("binding");
            c29842he3 = null;
        }
        c29842he3.f138064r.setIdTracking("direct_to_clean_storage_help_center");
        C29842he c29842he4 = this.f68407M0;
        if (c29842he4 == null) {
            AbstractC19074t.m100223u("binding");
            c29842he4 = null;
        }
        Button button = c29842he4.f138064r;
        C0708i c0708i = new C0708i();
        C29842he c29842he5 = this.f68407M0;
        if (c29842he5 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29842he2 = c29842he5;
        }
        if (c29842he2.f138063q.isShown()) {
            str = "1";
        } else {
            str = "0";
        }
        c0708i.m1075f("show_free_storage_btn", str);
        button.setTrackingExtraData(c0708i);
        C26613c.f126018a.m136638d("block_full_storage_screen", this.f68411Q0);
    }

    /* renamed from: mM */
    private final void m74739mM() {
        int m109400d = m74731eM().m109400d() - this.f68411Q0;
        C29842he c29842he = this.f68407M0;
        C29842he c29842he2 = null;
        if (c29842he == null) {
            AbstractC19074t.m100223u("binding");
            c29842he = null;
        }
        c29842he.f138065s.setText(AbstractC1463b.m7440a(m92653YI(AbstractC8020f0.str_warning_full_storage_view_desc, Integer.valueOf(m109400d)), 0));
        if (AbstractC23152n3.m119051k(getContext())) {
            C29842he c29842he3 = this.f68407M0;
            if (c29842he3 == null) {
                AbstractC19074t.m100223u("binding");
                c29842he3 = null;
            }
            c29842he3.f138063q.setVisibility(0);
            C29842he c29842he4 = this.f68407M0;
            if (c29842he4 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29842he2 = c29842he4;
            }
            c29842he2.f138064r.m90539c(AbstractC2814h.ButtonLarge_TertiaryNeutral);
        }
    }

    /* renamed from: nM */
    private final void m74740nM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 0, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        C29628e.m147249E0().m147271Y0();
        super.mo37111CJ(bundle);
        m74735iM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29842he m148048c = C29842he.m148048c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148048c, "inflate(...)");
        this.f68407M0 = m148048c;
        m74739mM();
        m74738lM();
        m74737kM();
        C29842he c29842he = this.f68407M0;
        if (c29842he == null) {
            AbstractC19074t.m100223u("binding");
            c29842he = null;
        }
        RelativeLayout root = c29842he.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        C29628e.m147249E0().m147295x1();
        m74740nM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BlockUserFullStorageScreen";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        C29842he c29842he = this.f68407M0;
        C29842he c29842he2 = null;
        if (c29842he == null) {
            AbstractC19074t.m100223u("binding");
            c29842he = null;
        }
        if (AbstractC19074t.m100204b(view, c29842he.f138063q)) {
            m74733gM();
            return;
        }
        C29842he c29842he3 = this.f68407M0;
        if (c29842he3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29842he2 = c29842he3;
        }
        if (AbstractC19074t.m100204b(view, c29842he2.f138064r)) {
            m74734hM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        return true;
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m74736jM();
    }
}
