package com.zing.zalo.p077ui.backuprestore.restore;

import ac.C0697c0;
import ag0.C0815e1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.backuprestore.restore.RestoreMessageStartupView;
import com.zing.zalo.p077ui.maintab.MainTabView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.t81;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import mm0.AbstractC23350e;
import nh0.C23793c;
import org.json.JSONObject;
import p227i3.C20218v;
import p320ld.C22436h;
import p320ld.C22438j;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p387oc.C24199c;
import p443qc.EnumC25220d;
import p525ti.C26701b;
import p542ub.InterfaceC27218a;
import p649xl.C30052ta;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24854k;
import sc.C26220b;
import si.C26263i;
import vg.AbstractC28207v1;

/* loaded from: classes5.dex */
public final class RestoreMessageStartupView extends SlidableZaloView implements View.OnClickListener {
    public static final C11114a Companion = new C11114a(null);

    /* renamed from: P0 */
    private C30052ta f55956P0;

    /* renamed from: Q0 */
    private C16972e0 f55957Q0;

    /* renamed from: R0 */
    private TargetBackupInfo f55958R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f55959S0;

    /* renamed from: com.zing.zalo.ui.backuprestore.restore.RestoreMessageStartupView$a */
    /* loaded from: classes5.dex */
    public static final class C11114a {
        private C11114a() {
        }

        public /* synthetic */ C11114a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.backuprestore.restore.RestoreMessageStartupView$b */
    /* loaded from: classes5.dex */
    static final class C11115b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11115b f55960q = new C11115b();

        C11115b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C24199c mo12V4() {
            return AbstractC23306f.m120684l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.restore.RestoreMessageStartupView$c */
    /* loaded from: classes5.dex */
    public static final class C11116c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11116c f55961q = new C11116c();

        C11116c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m58069a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m58069a() {
            AbstractC23306f.m120692n().m133040U(EnumC25220d.f120982s);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.restore.RestoreMessageStartupView$d */
    /* loaded from: classes5.dex */
    public static final class C11117d extends AbstractC19075u implements InterfaceC18494a {
        C11117d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m58070a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m58070a() {
            RestoreMessageStartupView.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.backuprestore.restore.RestoreMessageStartupView$e */
    /* loaded from: classes5.dex */
    public static final class C11118e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C11118e f55963q = new C11118e();

        C11118e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m58071a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m58071a() {
            AbstractC23306f.m120692n().m133040U(EnumC25220d.f120981r);
        }
    }

    public RestoreMessageStartupView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(C11115b.f55960q);
        this.f55959S0 = m129210a;
    }

    /* renamed from: AM */
    private final void m58047AM(InterfaceC18494a interfaceC18494a) {
        try {
            String m128414i = AbstractC23306f.m120676j().m128414i();
            if (m128414i != null && m128414i.length() != 0) {
                JSONObject jSONObject = new JSONObject(m128414i);
                InterfaceC27218a m92676n2 = m92676n2();
                AbstractC19074t.m100205c(m92676n2);
                AbstractC28207v1.m141875H0(jSONObject, m92676n2, null, null, null, 69888, new t81());
                return;
            }
            interfaceC18494a.mo12V4();
        } catch (Exception e11) {
            interfaceC18494a.mo12V4();
            AbstractC23350e.m122776f("SMLRestoreMessageStartupView", e11);
        }
    }

    /* renamed from: jM */
    private final void m58051jM(TargetBackupInfo targetBackupInfo) {
        C26701b m137270a = C26701b.Companion.m137270a();
        C22447s.m116032f(targetBackupInfo, m137270a);
        C30052ta c30052ta = this.f55956P0;
        if (c30052ta == null) {
            AbstractC19074t.m100223u("binding");
            c30052ta = null;
        }
        c30052ta.f139466q.m58384V(m137270a);
    }

    /* renamed from: kM */
    private final void m58052kM(TargetBackupInfo targetBackupInfo) {
        String m92652XI;
        if (!C22447s.m116057s(targetBackupInfo)) {
            m92652XI = m92652XI(AbstractC8020f0.str_title_restore_login_msg);
        } else {
            m92652XI = m92652XI(AbstractC8020f0.str_title_restore_login_msg_media);
        }
        C30052ta c30052ta = this.f55956P0;
        if (c30052ta == null) {
            AbstractC19074t.m100223u("binding");
            c30052ta = null;
        }
        c30052ta.f139469t.setText(m92652XI);
    }

    /* renamed from: lM */
    private final void m58053lM() {
        C16972e0 c16972e0 = this.f55957Q0;
        if (c16972e0 != null && c16972e0.m92868m()) {
            c16972e0.dismiss();
            this.f55957Q0 = null;
        }
    }

    /* renamed from: mM */
    private final String m58054mM() {
        return "{\"flow\":\"has_new_backup_after_login\"}";
    }

    /* renamed from: nM */
    private final C24199c m58055nM() {
        return (C24199c) this.f55959S0.getValue();
    }

    /* renamed from: oM */
    private final void m58056oM() {
        m58064wM();
        AbstractC23647d.m123897g("5580113");
        C0815e1.m2075D().m2099U(3, 4, 34, new String[0]);
    }

    /* renamed from: pM */
    private final void m58057pM() {
        C17487o0 m92693xK = m92693xK();
        AbstractC19074t.m100207e(m92693xK, "requireZaloViewManager(...)");
        TargetBackupInfo targetBackupInfo = this.f55958R0;
        AbstractC19074t.m100205c(targetBackupInfo);
        C22438j.m115936J(m92693xK, 3, targetBackupInfo);
        AbstractC23647d.m123897g("5580112");
        C0815e1.m2075D().m2099U(3, 3, 34, new String[0]);
        m58055nM().m126154d(C11116c.f55961q);
    }

    /* renamed from: qM */
    private final void m58058qM() {
        C26220b.m134826i("SMLRestoreMessageStartupView", "doIgnoreRestore(): " + this.f55958R0, null, 4, null);
        C22436h.f109760a.m115918n().mo13474a(new Runnable() { // from class: y40.c
            @Override // java.lang.Runnable
            public final void run() {
                RestoreMessageStartupView.m58059rM();
            }
        });
        C22447s.f109797a.m116071J0();
        AbstractC23647d.m123897g("5580114");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m58059rM() {
        AbstractC23306f.m120692n().m133035O(C23793c.Companion.m124321a().mo124314i());
        C22436h.f109760a.m115911A(1, false);
    }

    /* renamed from: sM */
    private final void m58060sM() {
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f55958R0 = (TargetBackupInfo) m92642L3.getParcelable("EXTRA_BACKUP_INFO");
        }
        TargetBackupInfo targetBackupInfo = this.f55958R0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("parseViewArgs(): backupInfo=");
        sb2.append(targetBackupInfo);
        C22447s.f109797a.m116074e(this.f55958R0, "SMLRestoreMessageStartupView");
    }

    /* renamed from: tM */
    private final void m58061tM() {
        C30052ta c30052ta = this.f55956P0;
        C30052ta c30052ta2 = null;
        if (c30052ta == null) {
            AbstractC19074t.m100223u("binding");
            c30052ta = null;
        }
        c30052ta.f139468s.setOnClickListener(this);
        C30052ta c30052ta3 = this.f55956P0;
        if (c30052ta3 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c30052ta2 = c30052ta3;
        }
        c30052ta2.f139467r.setOnClickListener(this);
    }

    /* renamed from: uM */
    private final void m58062uM() {
        C0697c0.Companion.m1052f(this, "funnel", m58054mM());
        C30052ta c30052ta = this.f55956P0;
        if (c30052ta == null) {
            AbstractC19074t.m100223u("binding");
            c30052ta = null;
        }
        c30052ta.f139468s.setIdTracking("restore_backup_button");
    }

    /* renamed from: vM */
    private final void m58063vM() {
        TargetBackupInfo targetBackupInfo = this.f55958R0;
        if (targetBackupInfo != null) {
            m58052kM(targetBackupInfo);
            m58051jM(targetBackupInfo);
        }
    }

    /* renamed from: wM */
    private final void m58064wM() {
        int i11;
        int i12;
        boolean z11 = !C22447s.m116057s(this.f55958R0);
        if (z11) {
            i11 = AbstractC8020f0.str_restore_skip_popup_title;
        } else {
            i11 = AbstractC8020f0.str_restore_skip_popup_title_media;
        }
        if (z11) {
            i12 = AbstractC8020f0.str_restore_skip_popup_desc;
        } else {
            i12 = AbstractC8020f0.str_restore_skip_popup_desc_media;
        }
        String m92652XI = m92652XI(i12);
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90917A = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("dialog_no_restore_with_new_backup").m90917A(i11);
        AbstractC19074t.m100205c(m92652XI);
        this.f55957Q0 = m90917A.m90949z(m92652XI).m90920D(inflate).m90921E(true).m90922F(false).m90942s(AbstractC8020f0.str_restore_skip_popup_skip_btn, new InterfaceC17463d.d() { // from class: y40.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RestoreMessageStartupView.m58065xM(RestoreMessageStartupView.this, interfaceC17463d, i13);
            }
        }).m90933j(AbstractC8020f0.str_btn_back, new InterfaceC17463d.d() { // from class: y40.b
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i13) {
                RestoreMessageStartupView.m58066yM(interfaceC17463d, i13);
            }
        }).m90947x("no_restore_button").m90937n("dialog_no_restore_with_new_backup_cancel").m90923G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m58065xM(RestoreMessageStartupView restoreMessageStartupView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(restoreMessageStartupView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        restoreMessageStartupView.m58058qM();
        restoreMessageStartupView.m58047AM(new C11117d());
        restoreMessageStartupView.m58055nM().m126154d(C11118e.f55963q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m58066yM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        AbstractC23647d.m123897g("5580115");
    }

    /* renamed from: zM */
    private final void m58067zM() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EXTRA_FROM_ACTIVE_LOGIN_FLOW", true);
        bundle.putInt("SHOW_WITH_FLAGS", 67108864);
        m92693xK().m93069k2(MainTabView.class, bundle, 1, true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m58060sM();
        AbstractC23309i.m121656Yv(true);
        C0815e1.m2075D().m2099U(3, 1, 34, new String[0]);
        if (bundle == null) {
            C26263i.m135055u().m135077j0(true);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30052ta m148537c = C30052ta.m148537c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m148537c, "inflate(...)");
        this.f55956P0 = m148537c;
        m58063vM();
        m58062uM();
        m58061tM();
        C30052ta c30052ta = this.f55956P0;
        if (c30052ta == null) {
            AbstractC19074t.m100223u("binding");
            c30052ta = null;
        }
        LinearLayout root = c30052ta.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        m58053lM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        AbstractC23306f.m120676j().m128408Z(false);
        m58067zM();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "BackupLoginScreen";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 != 1807) {
            if (i11 == 69888) {
                m58058qM();
                finish();
                return;
            }
            return;
        }
        if (i12 == -1) {
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        AbstractC19074t.m100208f(view, C20218v.f100059b);
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_restore) {
            m58057pM();
        } else if (id2 == AbstractC6918a0.btn_ignore) {
            m58056oM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        AbstractC19074t.m100208f(keyEvent, "event");
        if (i11 == 4) {
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
