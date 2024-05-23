package com.zing.zalo.p077ui.settings.subsettings;

import ac.C0732w;
import am.AbstractC0924m0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.subsettings.SettingPreDownloadView;
import com.zing.zalo.p077ui.settings.subsettings.bottomsheet.SettingPreDownloadBottomSheetView;
import com.zing.zalo.p077ui.settings.widget.ListItemSetting;
import com.zing.zalo.p077ui.toolstorage.overview.ToolStorageView;
import com.zing.zalo.p077ui.toolstoragev1.summary.StorageSummaryView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zdesign.component.Switch;
import com.zing.zalo.zdesign.component.TrackingTextView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18494a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import fn0.C19067n0;
import java.util.Arrays;
import me0.AbstractC23152n3;
import me0.C23212s8;
import me0.C23225u;
import mm0.AbstractC23350e;
import ni.C23794a;
import p263jc.C21216s;
import p269jj.C21275a;
import p348mi.AbstractC23306f;
import p423pi.C24759a;
import p649xl.C29714ac;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import ti0.C26705d;
import ti0.C26708g;

/* loaded from: classes6.dex */
public final class SettingPreDownloadView extends SlidableZaloView {
    public static final C13264a Companion = new C13264a(null);

    /* renamed from: P0 */
    private final InterfaceC24854k f68244P0;

    /* renamed from: Q0 */
    private final InterfaceC24854k f68245Q0;

    /* renamed from: R0 */
    private final InterfaceC24854k f68246R0;

    /* renamed from: S0 */
    private C29714ac f68247S0;

    /* renamed from: T0 */
    private final C24759a f68248T0;

    /* renamed from: U0 */
    private boolean f68249U0;

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingPreDownloadView$a */
    /* loaded from: classes6.dex */
    public static final class C13264a {
        private C13264a() {
        }

        public /* synthetic */ C13264a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingPreDownloadView$b */
    /* loaded from: classes6.dex */
    static final class C13265b extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13265b f68250q = new C13265b();

        C13265b() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21216s mo12V4() {
            return AbstractC23306f.m120652d();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingPreDownloadView$c */
    /* loaded from: classes6.dex */
    static final class C13266c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13266c f68251q = new C13266c();

        C13266c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C23794a mo12V4() {
            return AbstractC23306f.m120660f();
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingPreDownloadView$d */
    /* loaded from: classes6.dex */
    static final class C13267d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C13267d f68252q = new C13267d();

        C13267d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C21275a mo12V4() {
            return AbstractC23306f.m120583H();
        }
    }

    public SettingPreDownloadView() {
        InterfaceC24854k m129210a;
        InterfaceC24854k m129210a2;
        InterfaceC24854k m129210a3;
        m129210a = AbstractC24856m.m129210a(C13266c.f68251q);
        this.f68244P0 = m129210a;
        m129210a2 = AbstractC24856m.m129210a(C13267d.f68252q);
        this.f68245Q0 = m129210a2;
        m129210a3 = AbstractC24856m.m129210a(C13265b.f68250q);
        this.f68246R0 = m129210a3;
        this.f68248T0 = AbstractC23306f.m120652d().m109886m0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static final void m74552AM(SettingPreDownloadView settingPreDownloadView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        settingPreDownloadView.m74569uM();
        interfaceC17463d.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public static final void m74553BM(SettingPreDownloadView settingPreDownloadView, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        C29714ac c29714ac = settingPreDownloadView.f68247S0;
        if (c29714ac == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac = null;
        }
        Switch r12 = c29714ac.f137252s.getSwitch();
        if (r12 != null) {
            r12.setChecked(true);
        }
        if (!settingPreDownloadView.m74563oM().m124326d()) {
            settingPreDownloadView.m74563oM().m124328f(true);
            settingPreDownloadView.m74562nM().m109862P();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public static final void m74554CM(SettingPreDownloadView settingPreDownloadView, View view) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        settingPreDownloadView.f68249U0 = true;
        AbstractC23152n3.m119050j0(settingPreDownloadView.m92689tK(), settingPreDownloadView.m74564pM().m110204g().m116309a());
    }

    /* renamed from: nM */
    private final C21216s m74562nM() {
        return (C21216s) this.f68246R0.getValue();
    }

    /* renamed from: oM */
    private final C23794a m74563oM() {
        return (C23794a) this.f68244P0.getValue();
    }

    /* renamed from: pM */
    private final C21275a m74564pM() {
        return (C21275a) this.f68245Q0.getValue();
    }

    /* renamed from: qM */
    private final void m74565qM() {
        C29714ac c29714ac = this.f68247S0;
        C29714ac c29714ac2 = null;
        if (c29714ac == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac = null;
        }
        c29714ac.f137253t.setMiddleTitle(this.f68248T0.m128657s());
        C29714ac c29714ac3 = this.f68247S0;
        if (c29714ac3 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac3 = null;
        }
        ListItemSetting listItemSetting = c29714ac3.f137252s;
        listItemSetting.setSwitch(m74563oM().m124326d());
        listItemSetting.setTitle(this.f68248T0.m128657s());
        Switch r32 = listItemSetting.getSwitch();
        if (r32 != null) {
            r32.setOnClickListener(new View.OnClickListener() { // from class: oa0.n0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingPreDownloadView.m74566rM(SettingPreDownloadView.this, view);
                }
            });
        }
        listItemSetting.setBackground(C23212s8.m119608p(AbstractC2807a.ui_background));
        C29714ac c29714ac4 = this.f68247S0;
        if (c29714ac4 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac4 = null;
        }
        ListItemSetting listItemSetting2 = c29714ac4.f137250q;
        listItemSetting2.setShowChevronRight(true);
        listItemSetting2.setOnClickListener(new View.OnClickListener() { // from class: oa0.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingPreDownloadView.m74567sM(SettingPreDownloadView.this, view);
            }
        });
        C29714ac c29714ac5 = this.f68247S0;
        if (c29714ac5 == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac5 = null;
        }
        RobotoTextView robotoTextView = c29714ac5.f137251r;
        AbstractC19074t.m100207e(robotoTextView, "headerText");
        C23225u.m119699c(robotoTextView, AbstractC8020f0.str_pre_download_setting_header_description, AbstractC8020f0.str_view_details, null, new Runnable() { // from class: oa0.p0
            @Override // java.lang.Runnable
            public final void run() {
                SettingPreDownloadView.m74568tM(SettingPreDownloadView.this);
            }
        }, 8, null);
        if (AbstractC23306f.m120691m2().m2461l()) {
            C29714ac c29714ac6 = this.f68247S0;
            if (c29714ac6 == null) {
                AbstractC19074t.m100223u("mBinding");
            } else {
                c29714ac2 = c29714ac6;
            }
            RobotoTextView robotoTextView2 = c29714ac2.f137251r;
            AbstractC19074t.m100207e(robotoTextView2, "headerText");
            robotoTextView2.setVisibility(8);
            return;
        }
        C29714ac c29714ac7 = this.f68247S0;
        if (c29714ac7 == null) {
            AbstractC19074t.m100223u("mBinding");
        } else {
            c29714ac2 = c29714ac7;
        }
        RobotoTextView robotoTextView3 = c29714ac2.f137251r;
        AbstractC19074t.m100207e(robotoTextView3, "headerText");
        robotoTextView3.setVisibility(0);
        if (AbstractC0924m0.m3482Ua()) {
            AbstractC0924m0.m4234ti(false);
            m74573yM(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public static final void m74566rM(SettingPreDownloadView settingPreDownloadView, View view) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        AbstractC19074t.m100205c(view);
        settingPreDownloadView.m74571wM(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m74567sM(SettingPreDownloadView settingPreDownloadView, View view) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        settingPreDownloadView.m74570vM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m74568tM(SettingPreDownloadView settingPreDownloadView) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        settingPreDownloadView.m74573yM(false);
    }

    /* renamed from: uM */
    private final void m74569uM() {
        m74562nM().m109897y();
        C29714ac c29714ac = this.f68247S0;
        if (c29714ac == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac = null;
        }
        Switch r02 = c29714ac.f137252s.getSwitch();
        if (r02 != null) {
            r02.setChecked(false);
        }
        m74563oM().m124328f(false);
        C0732w.m1177r(C0732w.Companion.m1189a(), "settings_ad_turnoff", null, null, null, 14, null);
    }

    /* renamed from: vM */
    private final void m74570vM() {
        if (AbstractC23306f.m120732z1().m109405l()) {
            C17487o0 m92662fJ = m92662fJ();
            if (m92662fJ != null) {
                m92662fJ.m93069k2(ToolStorageView.class, null, 1, true);
                return;
            }
            return;
        }
        C17487o0 m92662fJ2 = m92662fJ();
        if (m92662fJ2 != null) {
            m92662fJ2.m93069k2(StorageSummaryView.class, null, 1, true);
        }
    }

    /* renamed from: wM */
    private final void m74571wM(View view) {
        C29714ac c29714ac = this.f68247S0;
        if (c29714ac == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac = null;
        }
        Switch r02 = c29714ac.f137252s.getSwitch();
        if (r02 != null && r02.isChecked()) {
            if (AbstractC23306f.m120691m2().m2461l()) {
                m74569uM();
                return;
            } else {
                view.post(new Runnable() { // from class: oa0.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingPreDownloadView.m74572xM(SettingPreDownloadView.this);
                    }
                });
                showDialog(2);
                return;
            }
        }
        m74563oM().m124328f(true);
        m74562nM().m109862P();
        C0732w.m1177r(C0732w.Companion.m1189a(), "settings_ad_turnon", null, null, null, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m74572xM(SettingPreDownloadView settingPreDownloadView) {
        AbstractC19074t.m100208f(settingPreDownloadView, "this$0");
        C29714ac c29714ac = settingPreDownloadView.f68247S0;
        if (c29714ac == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac = null;
        }
        c29714ac.f137252s.setSwitch(true);
    }

    /* renamed from: yM */
    private final void m74573yM(boolean z11) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ARG_IS_FIRST_TIME", z11);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.mo89694j2(SettingPreDownloadBottomSheetView.class, bundle, 0, "SettingPreDownloadBottomSheetView", 1, true);
        }
    }

    /* renamed from: zM */
    private final KeyEventCallbackC17462c m74574zM() {
        String str;
        String str2;
        try {
            View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.warning_popup_top_view_red, (ViewGroup) null);
            Context context = getContext();
            AbstractC19074t.m100205c(context);
            TrackingTextView trackingTextView = new TrackingTextView(context);
            Context context2 = getContext();
            AbstractC19074t.m100205c(context2);
            new C26708g(trackingTextView).m137319a(C26705d.m137293a(context2, AbstractC2814h.t_normal_m));
            trackingTextView.setIdTracking("settings_ad_help");
            Context context3 = getContext();
            if (context3 != null) {
                str = context3.getString(AbstractC8020f0.str_learn_more);
            } else {
                str = null;
            }
            trackingTextView.setText(str);
            trackingTextView.setTextColor(C23212s8.m119606n(AbstractC2807a.link_01));
            trackingTextView.setOnClickListener(new View.OnClickListener() { // from class: oa0.k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingPreDownloadView.m74554CM(SettingPreDownloadView.this, view);
                }
            });
            Context m92689tK = m92689tK();
            AbstractC19074t.m100207e(m92689tK, "requireContext(...)");
            C16972e0.a aVar = new C16972e0.a(m92689tK);
            aVar.m90931h("settings_ad_confirm");
            aVar.m90932i(C16972e0.b.DIALOG_INFORMATION);
            C19067n0 c19067n0 = C19067n0.f94947a;
            String m92652XI = m92652XI(AbstractC8020f0.str_pre_download_setting_dialog_caution_title);
            AbstractC19074t.m100207e(m92652XI, "getString(...)");
            String format = String.format(m92652XI, Arrays.copyOf(new Object[]{this.f68248T0.m128656r()}, 1));
            AbstractC19074t.m100207e(format, "format(...)");
            aVar.m90918B(format);
            Context context4 = getContext();
            if (context4 == null || (str2 = context4.getString(AbstractC8020f0.str_pre_download_setting_dialog_caution_description)) == null) {
                str2 = "";
            }
            AbstractC19074t.m100205c(str2);
            aVar.m90949z(str2);
            aVar.m90929f(trackingTextView);
            aVar.m90920D(inflate);
            aVar.m90922F(true);
            aVar.m90921E(true);
            String m92652XI2 = m92652XI(AbstractC8020f0.str_pre_download_setting_dialog_caution_turn_off_pre_download);
            AbstractC19074t.m100207e(m92652XI2, "getString(...)");
            String format2 = String.format(m92652XI2, Arrays.copyOf(new Object[]{this.f68248T0.m128656r()}, 1));
            AbstractC19074t.m100207e(format2, "format(...)");
            aVar.m90943t(format2, new InterfaceC17463d.d() { // from class: oa0.l0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    SettingPreDownloadView.m74552AM(SettingPreDownloadView.this, interfaceC17463d, i11);
                }
            });
            String m92652XI3 = m92652XI(AbstractC8020f0.cancel);
            AbstractC19074t.m100207e(m92652XI3, "getString(...)");
            aVar.m90934k(m92652XI3, new InterfaceC17463d.d() { // from class: oa0.m0
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    SettingPreDownloadView.m74553BM(SettingPreDownloadView.this, interfaceC17463d, i11);
                }
            });
            return aVar.m90927d();
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingPreDownloadView", e11);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 2) {
            return m74574zM();
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C29714ac m147735c = C29714ac.m147735c(layoutInflater, viewGroup, false);
        AbstractC19074t.m100207e(m147735c, "inflate(...)");
        this.f68247S0 = m147735c;
        m74565qM();
        C29714ac c29714ac = this.f68247S0;
        if (c29714ac == null) {
            AbstractC19074t.m100223u("mBinding");
            c29714ac = null;
        }
        LinearLayout root = c29714ac.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        if (this.f68249U0) {
            this.f68249U0 = false;
            showDialog(2);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "settings_ad_detail";
    }
}
