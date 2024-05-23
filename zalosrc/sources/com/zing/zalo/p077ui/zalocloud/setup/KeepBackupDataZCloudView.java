package com.zing.zalo.p077ui.zalocloud.setup;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.data.backuprestore.model.C7924a;
import com.zing.zalo.data.backuprestore.model.TargetBackupInfo;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.setup.KeepBackupDataZCloudView;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.zalocloud.configs.C16805b;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import hc0.EnumC19985o;
import java.util.Arrays;
import kc0.AbstractC21662a;
import kc0.C21663b;
import kc0.C21664c;
import kc0.C21665d;
import mj0.AbstractC23322a;
import p205hc.C19965d;
import p297kd.C21688c;
import p320ld.C22441m;
import p320ld.C22447s;
import p525ti.C26701b;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p649xl.AbstractC29735bf;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import si.C26263i;
import tg0.C26676b;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class KeepBackupDataZCloudView extends BaseSetupZaloCloudView<AbstractC29735bf> {
    public static final C13975a Companion = new C13975a(null);

    /* renamed from: U0 */
    private final InterfaceC24854k f71966U0;

    /* renamed from: V0 */
    private boolean f71967V0;

    /* renamed from: W0 */
    private final C13976b f71968W0;

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$a */
    /* loaded from: classes6.dex */
    public static final class C13975a {
        private C13975a() {
        }

        public /* synthetic */ C13975a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$b */
    /* loaded from: classes6.dex */
    public static final class C13976b implements InterfaceC28625j {
        C13976b() {
        }

        @Override // p586vt.InterfaceC28625j
        /* renamed from: lk */
        public void mo57172lk(AbstractC28627l abstractC28627l) {
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (bVar != null && bVar.f132722a == 22) {
                KeepBackupDataZCloudView.this.m77796FM().m111668X();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$c */
    /* loaded from: classes6.dex */
    static final class C13977c extends AbstractC19075u implements InterfaceC18494a {
        C13977c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21664c mo12V4() {
            return (C21664c) new C1802w0(KeepBackupDataZCloudView.this, new C21665d()).m9378a(C21664c.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$d */
    /* loaded from: classes6.dex */
    static final class C13978d extends AbstractC19075u implements InterfaceC18505l {
        C13978d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77808a(C21663b c21663b) {
            if (c21663b.m111656b()) {
                KeepBackupDataZCloudView.this.mo46829Y();
            } else {
                KeepBackupDataZCloudView.this.mo49315c4();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77808a((C21663b) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$e */
    /* loaded from: classes6.dex */
    static final class C13979e extends AbstractC19075u implements InterfaceC18505l {
        C13979e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77809a(AbstractC21662a abstractC21662a) {
            AbstractC19074t.m100208f(abstractC21662a, "event");
            if (AbstractC19074t.m100204b(abstractC21662a, AbstractC21662a.a.f105110a)) {
                KeepBackupDataZCloudView.this.m77796FM().m111661P();
                return;
            }
            if (AbstractC19074t.m100204b(abstractC21662a, AbstractC21662a.e.f105114a)) {
                KeepBackupDataZCloudView.this.m77800KM();
                return;
            }
            if (AbstractC19074t.m100204b(abstractC21662a, AbstractC21662a.b.f105111a)) {
                KeepBackupDataZCloudView.this.m77748tM().m77921R(false, true);
                return;
            }
            if (AbstractC19074t.m100204b(abstractC21662a, AbstractC21662a.c.f105112a)) {
                C26676b.f126324a.m137012z(((AbstractC29735bf) KeepBackupDataZCloudView.this.m77756kM()).f137360Q.getId(), false);
                KeepBackupDataZCloudView.this.m77748tM().m77921R(true, true);
                return;
            }
            if (AbstractC19074t.m100204b(abstractC21662a, AbstractC21662a.d.f105113a)) {
                C26676b.f126324a.m137012z(((AbstractC29735bf) KeepBackupDataZCloudView.this.m77756kM()).f137360Q.getId(), true);
                TargetBackupInfo m135058w = C26263i.m135058w();
                if (m135058w != null) {
                    int m40953i = m135058w.m40953i();
                    KeepBackupDataZCloudView keepBackupDataZCloudView = KeepBackupDataZCloudView.this;
                    if (m40953i != 1) {
                        if (m40953i != 2) {
                            if (m40953i == 3) {
                                EnumC19985o enumC19985o = EnumC19985o.f98294w;
                                Bundle bundle = new Bundle();
                                bundle.putString("KEY_TRACKING_FLOW_PASSPHRASE", "VERIFY_CLOUD_ONBOARDING_SETUP");
                                C24848g0 c24848g0 = C24848g0.f119245a;
                                keepBackupDataZCloudView.m77750wM(enumC19985o, bundle);
                                return;
                            }
                            return;
                        }
                        EnumC19985o enumC19985o2 = EnumC19985o.f98293v;
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("KEY_TRACKING_FLOW_PIN", "VERIFY_CLOUD_ONBOARDING_SETUP");
                        C24848g0 c24848g02 = C24848g0.f119245a;
                        keepBackupDataZCloudView.m77750wM(enumC19985o2, bundle2);
                        return;
                    }
                    BaseSetupZaloCloudView.m77746xM(keepBackupDataZCloudView, EnumC19985o.f98292u, null, 2, null);
                }
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77809a((AbstractC21662a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$f */
    /* loaded from: classes6.dex */
    static final class C13980f extends AbstractC19075u implements InterfaceC18505l {
        C13980f() {
            super(1);
        }

        /* renamed from: a */
        public final void m77810a(C7924a c7924a) {
            C26701b m137270a = C26701b.Companion.m137270a();
            C22447s.m116032f(c7924a.f42886u, m137270a);
            RobotoTextView robotoTextView = ((AbstractC29735bf) KeepBackupDataZCloudView.this.m77756kM()).f137361R;
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = KeepBackupDataZCloudView.this.m92652XI(AbstractC8020f0.str_zcloud_setup_keep_old_backup_unrestored_data_device);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{m137270a.m137266b()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            robotoTextView.setText(format);
            RobotoTextView robotoTextView2 = ((AbstractC29735bf) KeepBackupDataZCloudView.this.m77756kM()).f137363T;
            String m92652XI2 = KeepBackupDataZCloudView.this.m92652XI(AbstractC8020f0.str_zcloud_setup_keep_old_backup_unrestored_data_time);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{m137270a.m137267c()}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            robotoTextView2.setText(format2);
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77810a((C7924a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.setup.KeepBackupDataZCloudView$g */
    /* loaded from: classes6.dex */
    static final class C13981g implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71974p;

        C13981g(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71974p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71974p;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof InterfaceC1764d0) && (obj instanceof InterfaceC19066n)) {
                return AbstractC19074t.m100204b(mo9368c(), ((InterfaceC19066n) obj).mo9368c());
            }
            return false;
        }

        public final int hashCode() {
            return mo9368c().hashCode();
        }

        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final /* synthetic */ void mo8524qp(Object obj) {
            this.f71974p.mo205i9(obj);
        }
    }

    public KeepBackupDataZCloudView() {
        InterfaceC24854k m129210a;
        m129210a = AbstractC24856m.m129210a(new C13977c());
        this.f71966U0 = m129210a;
        this.f71968W0 = new C13976b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: FM */
    public final C21664c m77796FM() {
        return (C21664c) this.f71966U0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m77797GM(KeepBackupDataZCloudView keepBackupDataZCloudView, View view) {
        AbstractC19074t.m100208f(keepBackupDataZCloudView, "this$0");
        C26676b.m136950A(C26676b.f126324a, view.getId(), false, 2, null);
        keepBackupDataZCloudView.m77796FM().m111667W(view.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m77798HM(KeepBackupDataZCloudView keepBackupDataZCloudView, View view) {
        AbstractC19074t.m100208f(keepBackupDataZCloudView, "this$0");
        keepBackupDataZCloudView.m77796FM().m111667W(view.getId());
    }

    /* renamed from: IM */
    private final void m77799IM() {
        if (!m77748tM().m77932f0()) {
            return;
        }
        ((AbstractC29735bf) m77756kM()).f137362S.setText(m92652XI(AbstractC8020f0.str_title_transfer_backup_storage_to_zcloud));
        ((AbstractC29735bf) m77756kM()).f137360Q.setText(m92652XI(AbstractC8020f0.tv_title_transfer_to_zcloud));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final void m77800KM() {
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90931h = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90920D(inflate).m90931h("ZCloudRestoreDeleteBackupPopup");
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_dialog_delete_unrestored_data_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        C16972e0.a m90918B = m90931h.m90918B(m92652XI);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_setup_dialog_delete_unrestored_data_description);
        AbstractC19074t.m100207e(m92652XI2, "getString(...)");
        C16972e0.a m90921E = m90918B.m90949z(m92652XI2).m90921E(true);
        String m92652XI3 = m92652XI(AbstractC8020f0.str_popup_story_delete_confirm);
        AbstractC19074t.m100207e(m92652XI3, "getString(...)");
        C16972e0.a m90943t = m90921E.m90943t(m92652XI3, new InterfaceC17463d.d() { // from class: hc0.l
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                KeepBackupDataZCloudView.m77801LM(KeepBackupDataZCloudView.this, interfaceC17463d, i11);
            }
        });
        if (m77748tM().m77932f0()) {
            m90943t.m90933j(AbstractC8020f0.tv_title_transfer_to_zcloud, new InterfaceC17463d.d() { // from class: hc0.m
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    KeepBackupDataZCloudView.m77802MM(KeepBackupDataZCloudView.this, interfaceC17463d, i11);
                }
            });
        } else {
            m90943t.m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: hc0.n
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    KeepBackupDataZCloudView.m77803NM(interfaceC17463d, i11);
                }
            });
        }
        m90943t.m90927d().mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public static final void m77801LM(KeepBackupDataZCloudView keepBackupDataZCloudView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(keepBackupDataZCloudView, "this$0");
        try {
            C26676b.f126324a.m137006t(true);
            if (keepBackupDataZCloudView.m77748tM().m77932f0()) {
                keepBackupDataZCloudView.m77796FM().m111665U();
            } else {
                keepBackupDataZCloudView.m77796FM().m111659N();
            }
        } catch (Exception e11) {
            C26676b.m136953c(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MM */
    public static final void m77802MM(KeepBackupDataZCloudView keepBackupDataZCloudView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(keepBackupDataZCloudView, "this$0");
        keepBackupDataZCloudView.m77796FM().m111664T();
        keepBackupDataZCloudView.m77748tM().m77940n0();
        C26676b.f126324a.m137006t(false);
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NM */
    public static final void m77803NM(InterfaceC17463d interfaceC17463d, int i11) {
        C26676b.f126324a.m137006t(false);
        interfaceC17463d.dismiss();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C21688c.Companion.m111854a().m111851x(this.f71968W0, "SYNC_MES");
    }

    /* renamed from: JM */
    public final boolean m77806JM() {
        return this.f71967V0;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.zview.SlideAnimationLayout.InterfaceC17409d
    /* renamed from: Li */
    public boolean mo37488Li() {
        return this.f71967V0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        ActionBar actionBar;
        Context context;
        super.mo37493TJ();
        if (!this.f71967V0 || (actionBar = this.f88760a0) == null || (context = getContext()) == null) {
            return;
        }
        actionBar.setBackButtonDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_arrow_left_line_24, AbstractC2807a.icon_primary));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ZCloudRestoreIntro";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseSetupZaloCloudView, com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: iM */
    public void mo57631iM() {
        super.mo57631iM();
        Bundle m92642L3 = m92642L3();
        boolean z11 = false;
        if (m92642L3 != null) {
            z11 = m92642L3.getBoolean("ARG_BACK_BUTTON", false);
        }
        this.f71967V0 = z11;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.z_cloud_keep_backup_data;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        C21688c.Companion.m111854a().m111849u(this.f71968W0, "SYNC_MES");
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        RobotoTextView robotoTextView = ((AbstractC29735bf) m77756kM()).f137362S;
        C19067n0 c19067n0 = C19067n0.f94947a;
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_setup_keep_old_backup_title);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C16805b.Companion.m89811a().m89800f()}, 1));
        AbstractC19074t.m100207e(format, "format(...)");
        robotoTextView.setText(format);
        ((AbstractC29735bf) m77756kM()).f137359P.setOnClickListener(new View.OnClickListener() { // from class: hc0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepBackupDataZCloudView.m77797GM(KeepBackupDataZCloudView.this, view);
            }
        });
        ((AbstractC29735bf) m77756kM()).f137360Q.setOnClickListener(new View.OnClickListener() { // from class: hc0.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                KeepBackupDataZCloudView.m77798HM(KeepBackupDataZCloudView.this, view);
            }
        });
        m77799IM();
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView, com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 18061 && i12 == -1) {
            m77796FM().m111666V();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        AbstractC19074t.m100208f(strArr, "permissions");
        AbstractC19074t.m100208f(iArr, "grantResults");
        if (i11 == 150) {
            BaseZaloView baseZaloView = this.f72421L0;
            AbstractC19074t.m100207e(baseZaloView, "mThis");
            if (C22441m.m115982a(baseZaloView)) {
                m77796FM().m111658M();
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77796FM().m111663S().m9219j(m92657cJ(), new C13981g(new C13978d()));
        m77796FM().m111662R().m9219j(m92657cJ(), new C19965d(new C13979e()));
        m77796FM().m111660O().m9219j(m92657cJ(), new C13981g(new C13980f()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        if (!this.f71967V0) {
            return;
        }
        m77748tM().m77922T();
    }
}
