package com.zing.zalo.p077ui.settings.subsettings;

import ac.InterfaceC0733x;
import ag0.AbstractC0837p0;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.zviews.CodeLockMessageView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23136l9;
import me0.AbstractC23195r2;
import me0.AbstractC23217t2;
import mm0.AbstractC23350e;
import p248iy.AbstractC20887g;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import si.C26263i;
import u00.C26939u;

/* loaded from: classes6.dex */
public class SettingHiddenChatView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f68228P0;

    /* renamed from: Q0 */
    LinearLayout f68229Q0;

    /* renamed from: R0 */
    RobotoTextView f68230R0;

    /* renamed from: S0 */
    RobotoTextView f68231S0;

    /* renamed from: T0 */
    RobotoTextView f68232T0;

    /* renamed from: U0 */
    RobotoTextView f68233U0;

    /* renamed from: V0 */
    ScrollViewVisibleChildViewDetector f68234V0;

    /* renamed from: W0 */
    HightLightSettingView f68235W0;

    /* renamed from: X0 */
    int f68236X0 = -1;

    /* renamed from: Y0 */
    int f68237Y0 = 0;

    /* renamed from: Z0 */
    final sh0 f68238Z0 = new sh0();

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingHiddenChatView$a */
    /* loaded from: classes6.dex */
    public class RunnableC13261a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f68239p;

        RunnableC13261a(View view) {
            this.f68239p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingHiddenChatView.this.f68238Z0.m87411l(this.f68239p, this)) {
                    return;
                }
                SettingHiddenChatView settingHiddenChatView = SettingHiddenChatView.this;
                int i11 = settingHiddenChatView.f68236X0;
                if (i11 != 70) {
                    if (i11 != 71) {
                        linearLayout = null;
                    } else {
                        linearLayout = settingHiddenChatView.f68229Q0;
                    }
                } else {
                    linearLayout = settingHiddenChatView.f68228P0;
                }
                settingHiddenChatView.f68238Z0.m87409j(linearLayout, settingHiddenChatView.f68235W0, settingHiddenChatView.f68237Y0);
                SettingHiddenChatView.this.m74521MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingHiddenChatView$b */
    /* loaded from: classes6.dex */
    public class C13262b implements InterfaceC20094a {
        C13262b() {
        }

        /* renamed from: d */
        public /* synthetic */ void m74536d() {
            C21927m.m114302u().m114326b0();
            try {
                SettingHiddenChatView.this.m74534rM();
                AbstractC23647d.m123906p("22001335");
                AbstractC23647d.m123893c();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (Build.VERSION.SDK_INT >= 25) {
                C26939u.m138770q().m138781l();
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ToastUtils.showMess(c20096c.m104492d());
            SettingHiddenChatView.this.mo49315c4();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingHiddenChatView.this.mo49315c4();
            if (SettingHiddenChatView.this.m92676n2() != null) {
                SettingHiddenChatView.this.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.subsettings.g
                    public /* synthetic */ RunnableC13278g() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        SettingHiddenChatView.C13262b.this.m74536d();
                    }
                });
            }
        }
    }

    /* renamed from: MA */
    public void m74521MA() {
        this.f68236X0 = -1;
        this.f68237Y0 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m74522Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f68236X0 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f68237Y0 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* renamed from: mM */
    public void m74529mM() {
        try {
            AbstractC26084s.m134251H(this.f68228P0, 70);
            AbstractC26084s.m134251H(this.f68229Q0, 71);
            this.f68238Z0.m87405e(this, 69);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingHiddenChatView", e11);
        }
    }

    /* renamed from: nM */
    private void m74530nM(View view) {
        try {
            if (this.f68236X0 >= 0) {
                view.postDelayed(new RunnableC13261a(view), 300L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    public /* synthetic */ void m74531oM(View view) {
        this.f72421L0.removeDialog(1);
    }

    /* renamed from: pM */
    public /* synthetic */ void m74532pM() {
        RobotoTextView robotoTextView = this.f68233U0;
        if (robotoTextView != null) {
            try {
                robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.cancel_hidden_chat_desc));
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    /* renamed from: qM */
    public /* synthetic */ void m74533qM() {
        if (!C26263i.m135049p0()) {
            this.f72827B0.post(new Runnable() { // from class: oa0.d0
                public /* synthetic */ RunnableC24149d0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SettingHiddenChatView.this.m74532pM();
                }
            });
        }
    }

    /* renamed from: rM */
    public void m74534rM() {
        this.f68228P0.setClickable(false);
        this.f68229Q0.setClickable(false);
        this.f68228P0.setEnabled(false);
        this.f68229Q0.setEnabled(false);
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.hint_setting_hidden_chat_not_activated);
        int indexOf = m118743r0.indexOf("#x#");
        String replace = m118743r0.replace("#x#", " ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf + 1, replace.length(), 33);
        this.f68232T0.setText(spannableStringBuilder);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m74522Vp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:            if (me0.AbstractC23136l9.m118743r0(com.zing.zalo.AbstractC8020f0.cancel_hidden_chat_desc_new).equals(r5.f68233U0.getText().toString()) != false) goto L50;     */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        try {
            if (i11 != 1) {
                if (i11 != 2) {
                    return null;
                }
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43171t(AbstractC8020f0.str_title_resset_hidden_chat);
                try {
                    if (this.f68233U0 != null) {
                    }
                    i12 = AbstractC8020f0.confirm_cancel_hidden_chat;
                } catch (Exception e11) {
                    AbstractC20110a.m104545n(e11.getMessage(), new Object[0]);
                }
                aVar.m43162k(AbstractC23136l9.m118743r0(i12));
                aVar.m43159h(7);
                aVar.m43169r(AbstractC8020f0.str_btn_resset_hidden_chat, this);
                aVar.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
                C8009j m43152a = aVar.m43152a();
                m43152a.m92873y(false);
                return m43152a;
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            View inflate = LayoutInflater.from(this.f72421L0.m92648SI()).inflate(AbstractC7409c0.hidden_chat_dialog_layout, (ViewGroup) null);
            ImageView imageView = (ImageView) inflate.findViewById(AbstractC6918a0.btn_close);
            aVar2.m43177z(inflate);
            aVar2.m43174w(true);
            aVar2.m43172u(null);
            aVar2.m43154c(false);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: oa0.c0
                public /* synthetic */ ViewOnClickListenerC24147c0() {
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingHiddenChatView.this.m74531oM(view);
                }
            });
            C8009j m43152a2 = aVar2.m43152a();
            m43152a2.m92874z(false);
            return m43152a2;
            i12 = AbstractC8020f0.confirm_cancel_hidden_chat_new;
            aVar.m43162k(AbstractC23136l9.m118743r0(i12));
            aVar.m43159h(7);
            aVar.m43169r(AbstractC8020f0.str_btn_resset_hidden_chat, this);
            aVar.m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b());
            C8009j m43152a3 = aVar.m43152a();
            m43152a3.m92873y(false);
            return m43152a3;
        } catch (Exception e12) {
            e12.printStackTrace();
            return null;
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_hidden_chat_view, viewGroup, false);
        try {
            this.f68228P0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.rl_change_code);
            this.f68229Q0 = (LinearLayout) inflate.findViewById(AbstractC6918a0.rl_cancel_hidden_chat);
            this.f68230R0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_private_setting_change_code_title);
            this.f68231S0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_private_setting_cancel_hidden_chat_title);
            this.f68232T0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvHintSettingHiddenChat);
            this.f68233U0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_private_setting_cancel_hidden_chat_desc);
            this.f68228P0.setOnClickListener(this);
            this.f68229Q0.setOnClickListener(this);
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) inflate.findViewById(AbstractC6918a0.sv_private_settings_main);
            this.f68234V0 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f68235W0 = (HightLightSettingView) inflate.findViewById(AbstractC6918a0.hightLightView);
            this.f68238Z0.m87415u(this.f68234V0);
            m74530nM(inflate);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f68238Z0.m87408i());
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            if (interfaceC17463d.mo92862f() == 2 && i11 == -1) {
                interfaceC17463d.dismiss();
                AbstractC20887g.m109230h(70001, "reset hidden chat manual");
                mo49282B8("", false);
                AbstractC23195r2.m119523j(new C13262b());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                m87077NK.setMiddleTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.title_hidden_chat));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m74522Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m74530nM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f68238Z0.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m74529mM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f68234V0;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.rl_change_code) {
            return 70;
        }
        return i11 == AbstractC6918a0.rl_cancel_hidden_chat ? 71 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingHiddenChatView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.rl_change_code) {
                Bundle bundle = new Bundle();
                bundle.putInt("case_passcode_process", 1);
                this.f72421L0.m92662fJ().m93069k2(CodeLockMessageView.class, bundle, 1, true);
                AbstractC23647d.m123906p("22001332");
                AbstractC23647d.m123893c();
                AbstractC26084s.m134269q(0, 70);
            } else if (id2 == AbstractC6918a0.rl_cancel_hidden_chat) {
                this.f72421L0.showDialog(2);
                AbstractC23647d.m123906p("22001334");
                AbstractC23647d.m123893c();
                AbstractC26084s.m134269q(0, 71);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        try {
            if (TextUtils.isEmpty(AbstractC23309i.m122303q0())) {
                m74534rM();
            } else {
                this.f68228P0.setClickable(true);
                this.f68229Q0.setClickable(true);
                this.f68228P0.setEnabled(true);
                this.f68229Q0.setEnabled(true);
                this.f68232T0.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.hint_setting_hidden_chat));
            }
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: oa0.b0
                public /* synthetic */ RunnableC24145b0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SettingHiddenChatView.this.m74533qM();
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        this.f68238Z0.m87413s();
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: oa0.a0
                public /* synthetic */ RunnableC24143a0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SettingHiddenChatView.this.m74529mM();
                }
            });
        }
    }
}
