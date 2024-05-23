package com.zing.zalo.p077ui.zalocloud.resetcloud;

import ac.C0732w;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.InterfaceC1764d0;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.activity.ZaloActivity;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zalocloud.resetcloud.AbstractC13943a;
import com.zing.zalo.p077ui.zalocloud.resetcloud.C13946d;
import com.zing.zalo.p077ui.zalocloud.resetcloud.ZCloudStartResetCloudView;
import com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Snackbar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ec0.C18384e;
import ec0.C18385f;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import fn0.InterfaceC19066n;
import java.util.Arrays;
import k30.C21459a;
import mj0.AbstractC23322a;
import p205hc.C19965d;
import p297kd.C21688c;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p586vt.AbstractC28627l;
import p586vt.InterfaceC28625j;
import p649xl.AbstractC29952ng;
import pm0.AbstractC24856m;
import pm0.C24848g0;
import pm0.InterfaceC24847g;
import pm0.InterfaceC24854k;
import tb0.C26626l;
import ui0.C27280g;

/* loaded from: classes6.dex */
public final class ZCloudStartResetCloudView extends BaseZCloudView<AbstractC29952ng> {

    /* renamed from: R0 */
    private final InterfaceC24854k f71869R0;

    /* renamed from: S0 */
    private final InterfaceC24854k f71870S0;

    /* renamed from: T0 */
    private final C13933a f71871T0;

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$a */
    /* loaded from: classes6.dex */
    public static final class C13933a implements InterfaceC28625j {
        C13933a() {
        }

        @Override // p586vt.InterfaceC28625j
        /* renamed from: lk */
        public void mo57172lk(AbstractC28627l abstractC28627l) {
            C21688c.b bVar = (C21688c.b) abstractC28627l;
            if (bVar != null && bVar.f132722a == 22) {
                ZCloudStartResetCloudView.this.m77651zM().m77671V();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$b */
    /* loaded from: classes6.dex */
    static final class C13934b extends AbstractC19075u implements InterfaceC18494a {
        C13934b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13946d mo12V4() {
            ZaloView m92690uK = ZCloudStartResetCloudView.this.m92690uK();
            AbstractC19074t.m100207e(m92690uK, "requireParentZaloView(...)");
            return (C13946d) new C1802w0(m92690uK).m9378a(C13946d.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$c */
    /* loaded from: classes6.dex */
    static final class C13935c extends AbstractC19075u implements InterfaceC18494a {
        C13935c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C13944b mo12V4() {
            return (C13944b) new C1802w0(ZCloudStartResetCloudView.this, new C18384e()).m9378a(C13944b.class);
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$d */
    /* loaded from: classes6.dex */
    static final class C13936d extends AbstractC19075u implements InterfaceC18505l {
        C13936d() {
            super(1);
        }

        /* renamed from: a */
        public final void m77654a(AbstractC13943a abstractC13943a) {
            C17487o0 m92662fJ;
            AbstractC19074t.m100208f(abstractC13943a, "event");
            if (AbstractC19074t.m100204b(abstractC13943a, AbstractC13943a.a.f71883a)) {
                ZCloudStartResetCloudView.this.m77651zM().m77668R();
                return;
            }
            if (AbstractC19074t.m100204b(abstractC13943a, AbstractC13943a.c.f71885a)) {
                ZCloudStartResetCloudView.this.m77643EM();
            } else if (AbstractC19074t.m100204b(abstractC13943a, AbstractC13943a.b.f71884a) && (m92662fJ = ZCloudStartResetCloudView.this.m92662fJ()) != null) {
                m92662fJ.m93069k2(ZCloudFinishResetCloudView.class, new Bundle(), 1, true);
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77654a((AbstractC13943a) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$e */
    /* loaded from: classes6.dex */
    static final class C13937e extends AbstractC19075u implements InterfaceC18505l {
        C13937e() {
            super(1);
        }

        /* renamed from: a */
        public final void m77655a(C18385f c18385f) {
            if (c18385f.m97384d()) {
                ZCloudStartResetCloudView.this.mo49282B8("", false);
            } else {
                ZCloudStartResetCloudView.this.mo49315c4();
            }
            if (c18385f.m97383c() != null && c18385f.m97383c().m41253k() != 0) {
                RobotoTextView robotoTextView = ZCloudStartResetCloudView.m77647vM(ZCloudStartResetCloudView.this).f138836W;
                C19067n0 c19067n0 = C19067n0.f94947a;
                String m92652XI = ZCloudStartResetCloudView.this.m92652XI(AbstractC8020f0.str_zcloud_total_data_size);
                AbstractC19074t.m100207e(m92652XI, "getString(...)");
                String format = String.format(m92652XI, Arrays.copyOf(new Object[]{C21459a.m111038f(c18385f.m97383c().m41253k(), 0, 2, null)}, 1));
                AbstractC19074t.m100207e(format, "format(...)");
                robotoTextView.setText(format);
                return;
            }
            ZCloudStartResetCloudView.m77647vM(ZCloudStartResetCloudView.this).f138836W.setText(ZCloudStartResetCloudView.this.m92652XI(AbstractC8020f0.str_my_cloud_quota_calculting_state));
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77655a((C18385f) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$f */
    /* loaded from: classes6.dex */
    static final class C13938f implements InterfaceC1764d0, InterfaceC19066n {

        /* renamed from: p */
        private final /* synthetic */ InterfaceC18505l f71877p;

        C13938f(InterfaceC18505l interfaceC18505l) {
            AbstractC19074t.m100208f(interfaceC18505l, "function");
            this.f71877p = interfaceC18505l;
        }

        @Override // fn0.InterfaceC19066n
        /* renamed from: c */
        public final InterfaceC24847g mo9368c() {
            return this.f71877p;
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
            this.f71877p.mo205i9(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$g */
    /* loaded from: classes6.dex */
    public static final class C13939g extends AbstractC19075u implements InterfaceC18505l {
        C13939g() {
            super(1);
        }

        /* renamed from: a */
        public final void m77656a(int i11) {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_reset_cloud_no_system_security", null, null, null, 14, null);
            ZCloudStartResetCloudView.this.m77651zM().m77672W();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m77656a(((Number) obj).intValue());
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zalocloud.resetcloud.ZCloudStartResetCloudView$h */
    /* loaded from: classes6.dex */
    public static final class C13940h extends AbstractC19075u implements InterfaceC18494a {
        C13940h() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: V4 */
        public /* bridge */ /* synthetic */ Object mo12V4() {
            m77657a();
            return C24848g0.f119245a;
        }

        /* renamed from: a */
        public final void m77657a() {
            C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_reset_cloud_biometric_checked", null, null, null, 14, null);
            ZCloudStartResetCloudView.this.m77651zM().m77672W();
        }
    }

    public ZCloudStartResetCloudView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        m129210a = AbstractC24856m.m129210a(new C13935c());
        this.f71869R0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(new C13934b());
        this.f71870S0 = m129210a2;
        this.f71871T0 = new C13933a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m77639AM(ZCloudStartResetCloudView zCloudStartResetCloudView, View view) {
        AbstractC19074t.m100208f(zCloudStartResetCloudView, "this$0");
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_start_reset_cloud_accept", "ZCloudStartResetCloud", null, null, 12, null);
        zCloudStartResetCloudView.m77640BM();
    }

    /* renamed from: BM */
    private final void m77640BM() {
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_delete_all_data_dialog_title);
        String m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_delete_all_data_dialog_description);
        int i11 = AbstractC8020f0.str_zcloud_delete_data;
        if (m77650yM().m77676M() == C13946d.b.f71897p) {
            m92652XI = m92652XI(AbstractC8020f0.str_zcloud_delete_protection_code_title);
            m92652XI2 = m92652XI(AbstractC8020f0.str_zcloud_delete_protection_code_description);
            i11 = AbstractC8020f0.str_zcloud_delete_protection_code;
        }
        Context m92689tK = m92689tK();
        AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
        C16972e0.a m90931h = new C16972e0.a(m92689tK).m90932i(C16972e0.b.DIALOG_INFORMATION).m90931h("ZCloudConfirmResetCloud");
        AbstractC19074t.m100205c(m92652XI);
        C16972e0.a m90918B = m90931h.m90918B(m92652XI);
        AbstractC19074t.m100205c(m92652XI2);
        m90918B.m90949z(m92652XI2).m90921E(true).m90937n("zcloud_confirm_reset_cloud_dismiss").m90947x("zcloud_confirm_reset_cloud_accept").m90942s(i11, new InterfaceC17463d.d() { // from class: ec0.c
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ZCloudStartResetCloudView.m77641CM(ZCloudStartResetCloudView.this, interfaceC17463d, i12);
            }
        }).m90933j(AbstractC8020f0.str_cancel, new InterfaceC17463d.d() { // from class: ec0.d
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i12) {
                ZCloudStartResetCloudView.m77642DM(interfaceC17463d, i12);
            }
        }).m90927d().mo13822K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m77641CM(ZCloudStartResetCloudView zCloudStartResetCloudView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(zCloudStartResetCloudView, "this$0");
        InterfaceC27218a m92676n2 = zCloudStartResetCloudView.m92676n2();
        if (m92676n2 == null) {
            return;
        }
        C26626l m136712a = C26626l.Companion.m136712a();
        Context context = m92676n2.getContext();
        AbstractC19074t.m100205c(context);
        C26626l.m136649G(m136712a, m92676n2, context, new C13939g(), new C13940h(), null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static final void m77642DM(InterfaceC17463d interfaceC17463d, int i11) {
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public final void m77643EM() {
        Snackbar.C16925c c16925c = Snackbar.Companion;
        View view = ((AbstractC29952ng) m77756kM()).f138834U;
        AbstractC19074t.m100207e(view, "snackBarContainer");
        String m92652XI = m92652XI(AbstractC8020f0.str_zcloud_error_reset_cloud_key_toast);
        AbstractC19074t.m100207e(m92652XI, "getString(...)");
        Snackbar m90669d = c16925c.m90669d(view, m92652XI, -1);
        Context context = ((AbstractC29952ng) m77756kM()).f138834U.getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        m90669d.m90644J(C27280g.m139659b(context, AbstractC23322a.zds_ic_close_circle_solid_24, AbstractC2808b.f150830r60));
        m90669d.m90648N();
    }

    /* renamed from: vM */
    public static final /* synthetic */ AbstractC29952ng m77647vM(ZCloudStartResetCloudView zCloudStartResetCloudView) {
        return (AbstractC29952ng) zCloudStartResetCloudView.m77756kM();
    }

    /* renamed from: yM */
    private final C13946d m77650yM() {
        return (C13946d) this.f71870S0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public final C13944b m77651zM() {
        return (C13944b) this.f71869R0.getValue();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        C21688c.Companion.m111854a().m111851x(this.f71871T0, "SYNC_MES");
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: KJ */
    public void mo40200KJ() {
        super.mo40200KJ();
        C23744a.Companion.m124119a().m124117e(this, 150804);
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
        return "ZCloudStartResetCloud";
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: jM */
    public int mo57575jM() {
        return AbstractC7409c0.zcloud_start_reset_cloud_view;
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: nM */
    public void mo57729nM() {
        super.mo57729nM();
        C21688c.Companion.m111854a().m111849u(this.f71871T0, "SYNC_MES");
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: oM */
    public void mo57577oM() {
        super.mo57577oM();
        ((AbstractC29952ng) m77756kM()).f138829P.setOnClickListener(new View.OnClickListener() { // from class: ec0.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZCloudStartResetCloudView.m77639AM(ZCloudStartResetCloudView.this, view);
            }
        });
        if (m77650yM().m77676M() == C13946d.b.f71897p) {
            ((AbstractC29952ng) m77756kM()).f138831R.setVisibility(8);
            ((AbstractC29952ng) m77756kM()).f138829P.setText(m92652XI(AbstractC8020f0.str_zcloud_btn_delete_and_resetup));
            ((AbstractC29952ng) m77756kM()).f138835V.setText(m92652XI(AbstractC8020f0.str_zcloud_start_connect_empty_description));
        } else {
            ((AbstractC29952ng) m77756kM()).f138831R.setVisibility(0);
            ((AbstractC29952ng) m77756kM()).f138829P.setText(m92652XI(AbstractC8020f0.str_zcloud_delete_data_and_set_up_again));
            ((AbstractC29952ng) m77756kM()).f138835V.setText(m92652XI(AbstractC8020f0.str_title_you_can_delete_data_zcloud_setup_again));
        }
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: pM */
    public void mo57605pM() {
        super.mo57605pM();
        m77651zM().m77669T().m9219j(m92657cJ(), new C19965d(new C13936d()));
        m77651zM().m77670U().m9219j(m92657cJ(), new C13938f(new C13937e()));
    }

    @Override // com.zing.zalo.p077ui.zalocloud.setup.BaseZCloudView
    /* renamed from: qM */
    public void mo57606qM() {
        C0732w.m1177r(C0732w.Companion.m1189a(), "zcloud_start_reset_cloud_accept", null, null, null, 14, null);
        ZaloView m92650VI = m92650VI();
        if (m92650VI != null) {
            m92650VI.finish();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        AbstractC19074t.m100208f(objArr, "args");
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
        if (i11 == 150804) {
            m77651zM().m77668R();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: zJ */
    public void mo40210zJ(ZaloActivity zaloActivity) {
        super.mo40210zJ(zaloActivity);
        C23744a.Companion.m124119a().m124115b(this, 150804);
    }
}
