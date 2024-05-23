package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.settings.SettingDarkModeView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.AbstractC17466e;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23152n3;
import me0.AbstractC23193r0;
import me0.AbstractC23217t2;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;

/* loaded from: classes6.dex */
public class SettingDarkModeView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f67684P0;

    /* renamed from: Q0 */
    LinearLayout f67685Q0;

    /* renamed from: R0 */
    CheckBox f67686R0;

    /* renamed from: S0 */
    CheckBox f67687S0;

    /* renamed from: T0 */
    StencilSwitch f67688T0;

    /* renamed from: U0 */
    LinearLayout f67689U0;

    /* renamed from: V0 */
    RecyclingImageView f67690V0;

    /* renamed from: W0 */
    RecyclingImageView f67691W0;

    /* renamed from: X0 */
    ScrollViewVisibleChildViewDetector f67692X0;

    /* renamed from: Y0 */
    HightLightSettingView f67693Y0;

    /* renamed from: e1 */
    int f67699e1;

    /* renamed from: Z0 */
    int f67694Z0 = -1;

    /* renamed from: a1 */
    int f67695a1 = 0;

    /* renamed from: b1 */
    final sh0 f67696b1 = new sh0();

    /* renamed from: c1 */
    int f67697c1 = -1;

    /* renamed from: d1 */
    int f67698d1 = -1;

    /* renamed from: f1 */
    Handler f67700f1 = new Handler(Looper.getMainLooper());

    /* renamed from: g1 */
    boolean f67701g1 = false;

    /* renamed from: h1 */
    private final InterfaceC0765j f67702h1 = new C0766k();

    /* renamed from: i1 */
    private final InterfaceC20094a f67703i1 = new C13142a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingDarkModeView$a */
    /* loaded from: classes6.dex */
    public class C13142a implements InterfaceC20094a {
        C13142a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m73873d() {
            try {
                SettingDarkModeView settingDarkModeView = SettingDarkModeView.this;
                int i11 = settingDarkModeView.f67697c1;
                AbstractC23148n.m118851y(i11, settingDarkModeView.f67698d1, i11);
                try {
                    SettingDarkModeView settingDarkModeView2 = SettingDarkModeView.this;
                    if (settingDarkModeView2.f67697c1 == 31) {
                        settingDarkModeView2.f67699e1 = settingDarkModeView2.f67698d1;
                        C23212s8.m119595b(settingDarkModeView2.m92648SI());
                        if (Build.VERSION.SDK_INT < 23) {
                            AbstractC23152n3.m118985A0(null);
                            AbstractC23193r0.m119508q();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingDarkModeView.this.m73869nM();
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            try {
                try {
                    if (c20096c.m104491c() == 515) {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                    }
                    SettingDarkModeView.this.m73870oM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingDarkModeView settingDarkModeView = SettingDarkModeView.this;
                settingDarkModeView.f67701g1 = false;
                settingDarkModeView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingDarkModeView settingDarkModeView2 = SettingDarkModeView.this;
                settingDarkModeView2.f67701g1 = false;
                settingDarkModeView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingDarkModeView.this.f72421L0.m92676n2() != null) {
                        SettingDarkModeView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.u
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingDarkModeView.C13142a.this.m73873d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingDarkModeView settingDarkModeView = SettingDarkModeView.this;
                settingDarkModeView.f67701g1 = false;
                settingDarkModeView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingDarkModeView$b */
    /* loaded from: classes6.dex */
    public class RunnableC13143b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67705p;

        RunnableC13143b(View view) {
            this.f67705p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingDarkModeView.this.f67696b1.m87411l(this.f67705p, this)) {
                    return;
                }
                SettingDarkModeView settingDarkModeView = SettingDarkModeView.this;
                int i11 = settingDarkModeView.f67694Z0;
                if (i11 != 78) {
                    if (i11 != 106) {
                        linearLayout = null;
                    } else {
                        linearLayout = settingDarkModeView.f67689U0;
                    }
                } else {
                    linearLayout = settingDarkModeView.f67684P0;
                }
                settingDarkModeView.f67696b1.m87409j(linearLayout, settingDarkModeView.f67693Y0, settingDarkModeView.f67695a1);
                SettingDarkModeView.this.m73860MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m73860MA() {
        this.f67694Z0 = -1;
        this.f67695a1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m73861Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67694Z0 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67695a1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public void m73865jM() {
        try {
            AbstractC26084s.m134251H(this.f67684P0, 78);
            this.f67696b1.m87405e(this, 104);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingDarkModeView", e11);
        }
    }

    /* renamed from: kM */
    private void m73866kM(View view) {
        if (this.f67694Z0 >= 0) {
            view.postDelayed(new RunnableC13143b(view), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public static /* synthetic */ void m73867mM() {
        AbstractC23152n3.m118985A0(null);
        AbstractC23193r0.m119508q();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            m73861Vp();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_dark_mode_view, viewGroup, false);
        m73868lM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67696b1.m87408i());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m73861Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m73866kM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67696b1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m73865jM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67692X0;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_setting_theme_selector) {
            return 78;
        }
        return i11 == AbstractC6918a0.layout_temp_reddot ? 105 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingDarkModeView";
    }

    /* renamed from: lM */
    void m73868lM(View view) {
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67692X0 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67693Y0 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67696b1.m87415u(this.f67692X0);
            int i11 = 0;
            this.f67692X0.setScanMode(0);
            this.f67689U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_auto_theme);
            this.f67686R0 = (CheckBox) view.findViewById(AbstractC6918a0.checkbox_light);
            this.f67687S0 = (CheckBox) view.findViewById(AbstractC6918a0.checkbox_dark);
            this.f67690V0 = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_theme_light);
            this.f67691W0 = (RecyclingImageView) view.findViewById(AbstractC6918a0.img_theme_dark);
            this.f67688T0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_auto_theme);
            this.f67684P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_theme_selector);
            this.f67685Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.layout_temp_reddot);
            View findViewById = view.findViewById(AbstractC6918a0.layout_auto_theme);
            if (Build.VERSION.SDK_INT < 29) {
                i11 = 8;
            }
            findViewById.setVisibility(i11);
            this.f67689U0.setOnClickListener(this);
            this.f67688T0.setOnClickListener(this);
            this.f67684P0.setOnClickListener(this);
            AbstractC23309i.m121148L4();
            view.findViewById(AbstractC6918a0.ll_theme_light).setOnClickListener(this);
            view.findViewById(AbstractC6918a0.ll_theme_dark).setOnClickListener(this);
            m73866kM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: nM */
    public void m73869nM() {
        int i11;
        int i12;
        boolean z11;
        boolean z12;
        try {
            int m122165mb = AbstractC23309i.m122165mb();
            this.f67699e1 = m122165mb;
            boolean z13 = false;
            if (Build.VERSION.SDK_INT >= 29) {
                if (m122165mb < 0 || m122165mb > 2) {
                    this.f67699e1 = 2;
                }
            } else if (m122165mb < 0 || m122165mb > 1) {
                this.f67699e1 = 0;
            }
            int i13 = this.f67699e1;
            if (i13 == 2) {
                i13 = C23212s8.m119601h();
            }
            RecyclingImageView recyclingImageView = this.f67690V0;
            if (i13 == 0) {
                i11 = AbstractC16803z.bg_select_theme;
            } else {
                i11 = AbstractC17466e.transparent;
            }
            recyclingImageView.setBackgroundResource(i11);
            RecyclingImageView recyclingImageView2 = this.f67691W0;
            if (i13 == 1) {
                i12 = AbstractC16803z.bg_select_theme;
            } else {
                i12 = AbstractC17466e.transparent;
            }
            recyclingImageView2.setBackgroundResource(i12);
            StencilSwitch stencilSwitch = this.f67688T0;
            if (this.f67699e1 == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            stencilSwitch.setChecked(z11);
            CheckBox checkBox = this.f67686R0;
            if (i13 == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            checkBox.setChecked(z12);
            CheckBox checkBox2 = this.f67687S0;
            if (i13 == 1) {
                z13 = true;
            }
            checkBox2.setChecked(z13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m73870oM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.t
                @Override // java.lang.Runnable
                public final void run() {
                    SettingDarkModeView.this.m73869nM();
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.ll_auto_theme && id2 != AbstractC6918a0.sw_auto_theme) {
                if (id2 == AbstractC6918a0.ll_theme_light) {
                    AbstractC26084s.m134269q(0, 78);
                    AbstractC23647d.m123897g("37181");
                    if (this.f67699e1 != 0) {
                        this.f67686R0.setChecked(true);
                        this.f67687S0.setChecked(false);
                        m73871pM(0);
                    }
                    C0815e1.m2079N(78, 1, 0, 0, 0);
                    return;
                }
                if (id2 == AbstractC6918a0.ll_theme_dark) {
                    AbstractC26084s.m134269q(0, 78);
                    AbstractC23647d.m123897g("37180");
                    if (this.f67699e1 != 1) {
                        this.f67686R0.setChecked(false);
                        this.f67687S0.setChecked(true);
                        m73871pM(1);
                    }
                    C0815e1.m2079N(78, 1, 0, 0, 0);
                    return;
                }
                if (id2 == AbstractC6918a0.ll_setting_theme_selector) {
                    AbstractC26084s.m134269q(0, 78);
                    C0815e1.m2079N(78, 1, 0, 0, 0);
                    return;
                }
                return;
            }
            this.f67688T0.setChecked(!r5.isChecked());
            if (this.f67688T0.isChecked()) {
                AbstractC23647d.m123897g("37183");
                if (this.f67699e1 != 2) {
                    this.f67686R0.setChecked(false);
                    this.f67687S0.setChecked(false);
                    m73871pM(2);
                }
            } else {
                AbstractC23647d.m123897g("37184");
                if (C23212s8.m119603k()) {
                    this.f67686R0.setChecked(true);
                    this.f67687S0.setChecked(false);
                    m73871pM(0);
                } else if (C23212s8.m119602i()) {
                    this.f67686R0.setChecked(false);
                    this.f67687S0.setChecked(true);
                    m73871pM(1);
                }
            }
            C0815e1.m2079N(106, 1, 0, 0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f67696b1.m87413s();
        m73869nM();
    }

    /* renamed from: pM */
    void m73871pM(int i11) {
        try {
            if (CoreUtility.f89235k.get()) {
                AbstractC23304d.f113375d2 = true;
            }
            AbstractC23148n.m118851y(31, i11, 31);
            this.f67699e1 = i11;
            C23212s8.m119595b(m92648SI());
            if (Build.VERSION.SDK_INT < 23) {
                ToastUtils.showMess(true, AbstractC23136l9.m118743r0(AbstractC8020f0.str_app_need_restart_when_theme_change_android_5_message));
                this.f67700f1.postDelayed(new Runnable() { // from class: la0.o2
                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingDarkModeView.m73867mM();
                    }
                }, 2000L);
            }
            m73869nM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.p2
                @Override // java.lang.Runnable
                public final void run() {
                    SettingDarkModeView.this.m73865jM();
                }
            });
        }
    }
}
