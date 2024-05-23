package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.adtima.Adtima;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.SettingMessageView;
import com.zing.zalo.p077ui.settings.subsettings.BlockContactsView;
import com.zing.zalo.p077ui.settings.subsettings.SettingDisplayMessage;
import com.zing.zalo.p077ui.settings.subsettings.SettingHiddenChatView;
import com.zing.zalo.p077ui.settings.subsettings.SettingVideoView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.AutoReplyListingView;
import com.zing.zalo.p077ui.zviews.QuickMessageListingFullView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zmedia.player.ZMediaPlayerSettings;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23165o5;
import me0.AbstractC23217t2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p161fg.C18922m;
import p162fh.C18932a;
import p348mi.AbstractC23306f;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p732zy.C32592h;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import ss.C26373e;
import th.AbstractC26681b;
import th.AbstractC26683d;
import th.AbstractC26684e;
import vg.AbstractC28207v1;

/* loaded from: classes6.dex */
public class SettingMessageView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f67724P0;

    /* renamed from: Q0 */
    LinearLayout f67725Q0;

    /* renamed from: R0 */
    LinearLayout f67726R0;

    /* renamed from: S0 */
    LinearLayout f67727S0;

    /* renamed from: T0 */
    LinearLayout f67728T0;

    /* renamed from: U0 */
    LinearLayout f67729U0;

    /* renamed from: V0 */
    LinearLayout f67730V0;

    /* renamed from: W0 */
    LinearLayout f67731W0;

    /* renamed from: X0 */
    LinearLayout f67732X0;

    /* renamed from: Y0 */
    LinearLayout f67733Y0;

    /* renamed from: Z0 */
    LinearLayout f67734Z0;

    /* renamed from: a1 */
    LinearLayout f67735a1;

    /* renamed from: b1 */
    LinearLayout f67736b1;

    /* renamed from: c1 */
    LinearLayout f67737c1;

    /* renamed from: d1 */
    StencilSwitch f67738d1;

    /* renamed from: e1 */
    StencilSwitch f67739e1;

    /* renamed from: f1 */
    StencilSwitch f67740f1;

    /* renamed from: g1 */
    StencilSwitch f67741g1;

    /* renamed from: h1 */
    StencilSwitch f67742h1;

    /* renamed from: i1 */
    RobotoTextView f67743i1;

    /* renamed from: j1 */
    View f67744j1;

    /* renamed from: k1 */
    View f67745k1;

    /* renamed from: l1 */
    View f67746l1;

    /* renamed from: m1 */
    View f67747m1;

    /* renamed from: n1 */
    View f67748n1;

    /* renamed from: o1 */
    View f67749o1;

    /* renamed from: p1 */
    View f67750p1;

    /* renamed from: q1 */
    ScrollViewVisibleChildViewDetector f67751q1;

    /* renamed from: r1 */
    HightLightSettingView f67752r1;

    /* renamed from: y1 */
    int f67759y1;

    /* renamed from: z1 */
    int f67760z1;

    /* renamed from: s1 */
    int f67753s1 = -1;

    /* renamed from: t1 */
    int f67754t1 = 0;

    /* renamed from: u1 */
    final sh0 f67755u1 = new sh0();

    /* renamed from: v1 */
    boolean f67756v1 = false;

    /* renamed from: w1 */
    private final InterfaceC0765j f67757w1 = new C0766k();

    /* renamed from: x1 */
    private final InterfaceC20094a f67758x1 = new C13144a();

    /* renamed from: A1 */
    boolean f67716A1 = false;

    /* renamed from: B1 */
    private final InterfaceC0765j f67717B1 = new C0766k();

    /* renamed from: C1 */
    private final InterfaceC20094a f67718C1 = new C13145b();

    /* renamed from: D1 */
    int f67719D1 = -1;

    /* renamed from: E1 */
    int f67720E1 = -1;

    /* renamed from: F1 */
    boolean f67721F1 = false;

    /* renamed from: G1 */
    private final InterfaceC0765j f67722G1 = new C0766k();

    /* renamed from: H1 */
    private final InterfaceC20094a f67723H1 = new C13146c();

    /* renamed from: com.zing.zalo.ui.settings.SettingMessageView$a */
    /* loaded from: classes6.dex */
    class C13144a implements InterfaceC20094a {
        C13144a() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingMessageView settingMessageView = SettingMessageView.this;
            settingMessageView.f67756v1 = false;
            settingMessageView.m73951rM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingMessageView.this.f67756v1 = false;
            AbstractC23309i.m122552wr(System.currentTimeMillis());
            try {
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                AbstractC23148n.m118844r(jSONObject);
                if (!jSONObject.isNull("privacy")) {
                    AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            SettingMessageView.this.m73951rM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingMessageView$b */
    /* loaded from: classes6.dex */
    public class C13145b implements InterfaceC20094a {
        C13145b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m73953d() {
            try {
                SettingMessageView settingMessageView = SettingMessageView.this;
                AbstractC23148n.m118848v(settingMessageView.f67759y1, settingMessageView.f67760z1);
                SettingMessageView.this.m73950qM();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
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
                    SettingMessageView.this.m73951rM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingMessageView settingMessageView = SettingMessageView.this;
                settingMessageView.f67716A1 = false;
                settingMessageView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingMessageView settingMessageView2 = SettingMessageView.this;
                settingMessageView2.f67716A1 = false;
                settingMessageView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingMessageView.this.f72421L0.m92676n2() != null) {
                        SettingMessageView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.v
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingMessageView.C13145b.this.m73953d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingMessageView settingMessageView = SettingMessageView.this;
                settingMessageView.f67716A1 = false;
                settingMessageView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingMessageView$c */
    /* loaded from: classes6.dex */
    class C13146c implements InterfaceC20094a {
        C13146c() {
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
                    SettingMessageView.this.m73951rM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingMessageView settingMessageView = SettingMessageView.this;
                settingMessageView.f67721F1 = false;
                settingMessageView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingMessageView settingMessageView2 = SettingMessageView.this;
                settingMessageView2.f67721F1 = false;
                settingMessageView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingMessageView settingMessageView;
            try {
                try {
                    SettingMessageView settingMessageView2 = SettingMessageView.this;
                    int i11 = settingMessageView2.f67719D1;
                    AbstractC23148n.m118851y(i11, settingMessageView2.f67720E1, i11);
                    SettingMessageView.this.m73951rM();
                    SettingMessageView settingMessageView3 = SettingMessageView.this;
                    settingMessageView3.f67721F1 = false;
                    settingMessageView3.f72421L0.mo78960q3();
                    settingMessageView = SettingMessageView.this;
                    if (settingMessageView.f67719D1 != 38 || settingMessageView.f67720E1 != 1) {
                        return;
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                    SettingMessageView settingMessageView4 = SettingMessageView.this;
                    settingMessageView4.f67721F1 = false;
                    settingMessageView4.f72421L0.mo78960q3();
                    settingMessageView = SettingMessageView.this;
                    if (settingMessageView.f67719D1 != 38 || settingMessageView.f67720E1 != 1) {
                        return;
                    }
                }
                settingMessageView.m73940kM();
                AbstractC0924m0.m3820fo(true);
            } catch (Throwable th2) {
                SettingMessageView settingMessageView5 = SettingMessageView.this;
                settingMessageView5.f67721F1 = false;
                settingMessageView5.f72421L0.mo78960q3();
                SettingMessageView settingMessageView6 = SettingMessageView.this;
                if (settingMessageView6.f67719D1 == 38 && settingMessageView6.f67720E1 == 1) {
                    settingMessageView6.m73940kM();
                    AbstractC0924m0.m3820fo(true);
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingMessageView$d */
    /* loaded from: classes6.dex */
    public class RunnableC13147d implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67764p;

        RunnableC13147d(View view) {
            this.f67764p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            if (SettingMessageView.this.f67755u1.m87411l(this.f67764p, this)) {
                return;
            }
            SettingMessageView settingMessageView = SettingMessageView.this;
            int i11 = settingMessageView.f67753s1;
            if (i11 != 15) {
                if (i11 != 16) {
                    if (i11 != 21) {
                        if (i11 != 22) {
                            if (i11 != 92) {
                                if (i11 != 93) {
                                    if (i11 != 113) {
                                        if (i11 != 114) {
                                            if (i11 != 122) {
                                                if (i11 != 127) {
                                                    if (i11 != 130) {
                                                        switch (i11) {
                                                            case Adtima.SDK_PRODUCT_VERSION_CODE /* 67 */:
                                                                linearLayout = settingMessageView.f67728T0;
                                                                break;
                                                            case 68:
                                                                linearLayout = settingMessageView.f67731W0;
                                                                break;
                                                            case 69:
                                                                linearLayout = settingMessageView.f67733Y0;
                                                                break;
                                                            default:
                                                                linearLayout = null;
                                                                break;
                                                        }
                                                    } else {
                                                        linearLayout = settingMessageView.f67729U0;
                                                    }
                                                } else {
                                                    linearLayout = settingMessageView.f67730V0;
                                                }
                                            } else {
                                                linearLayout = settingMessageView.f67737c1;
                                            }
                                        } else {
                                            linearLayout = settingMessageView.f67736b1;
                                        }
                                    } else {
                                        linearLayout = settingMessageView.f67735a1;
                                    }
                                } else {
                                    linearLayout = settingMessageView.f67732X0;
                                }
                            } else {
                                linearLayout = settingMessageView.f67734Z0;
                            }
                        } else {
                            linearLayout = settingMessageView.f67726R0;
                        }
                    } else {
                        linearLayout = settingMessageView.f67725Q0;
                    }
                    SettingMessageView settingMessageView2 = SettingMessageView.this;
                    settingMessageView2.f67755u1.m87409j(linearLayout, settingMessageView2.f67752r1, settingMessageView2.f67754t1);
                    SettingMessageView.this.m73934MA();
                    return;
                }
                if (settingMessageView.f67727S0.getVisibility() == 0) {
                    linearLayout = SettingMessageView.this.f67727S0;
                    SettingMessageView settingMessageView22 = SettingMessageView.this;
                    settingMessageView22.f67755u1.m87409j(linearLayout, settingMessageView22.f67752r1, settingMessageView22.f67754t1);
                    SettingMessageView.this.m73934MA();
                    return;
                }
                linearLayout = null;
                SettingMessageView settingMessageView222 = SettingMessageView.this;
                settingMessageView222.f67755u1.m87409j(linearLayout, settingMessageView222.f67752r1, settingMessageView222.f67754t1);
                SettingMessageView.this.m73934MA();
                return;
            }
            if (settingMessageView.f67724P0.getVisibility() == 0) {
                linearLayout = SettingMessageView.this.f67724P0;
                SettingMessageView settingMessageView2222 = SettingMessageView.this;
                settingMessageView2222.f67755u1.m87409j(linearLayout, settingMessageView2222.f67752r1, settingMessageView2222.f67754t1);
                SettingMessageView.this.m73934MA();
                return;
            }
            linearLayout = null;
            SettingMessageView settingMessageView22222 = SettingMessageView.this;
            settingMessageView22222.f67755u1.m87409j(linearLayout, settingMessageView22222.f67752r1, settingMessageView22222.f67754t1);
            SettingMessageView.this.m73934MA();
            return;
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m73934MA() {
        this.f67753s1 = -1;
        this.f67754t1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m73935Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67753s1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67754t1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public void m73940kM() {
        if (!AbstractC0924m0.m4078oc()) {
            String m3916j0 = AbstractC0924m0.m3916j0();
            if (!TextUtils.isEmpty(m3916j0)) {
                AbstractC28207v1.m141984g3("action.open.zinstantview", 3, this.f72421L0.m92676n2(), this.f72421L0, m3916j0, null, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lM */
    public void m73941lM() {
        try {
            AbstractC26084s.m134251H(this.f67724P0, 15);
            AbstractC26084s.m134251H(this.f67727S0, 16);
            AbstractC26084s.m134251H(this.f67725Q0, 21);
            AbstractC26084s.m134251H(this.f67726R0, 22);
            AbstractC26084s.m134251H(this.f67728T0, 67);
            AbstractC26084s.m134251H(this.f67732X0, 93);
            AbstractC26084s.m134251H(this.f67729U0, 130);
            AbstractC26084s.m134251H(this.f67730V0, 127);
            AbstractC26084s.m134251H(this.f67731W0, 68);
            AbstractC26084s.m134251H(this.f67733Y0, 69);
            AbstractC26084s.m134251H(this.f67734Z0, 92);
            this.f67755u1.m87405e(this, 41);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingMessageView", e11);
        }
    }

    /* renamed from: mM */
    private void m73942mM(View view) {
        if (this.f67753s1 >= 0) {
            view.postDelayed(new RunnableC13147d(view), 300L);
        }
    }

    /* renamed from: nM */
    private void m73943nM() {
        try {
            if (AbstractC23165o5.m119333b()) {
                this.f72421L0.removeDialog(1);
                this.f72421L0.showDialog(1);
            } else {
                boolean isChecked = this.f67742h1.isChecked();
                if (isChecked) {
                    this.f67742h1.setChecked(!isChecked);
                    AbstractC23647d.m123897g("22001404");
                    AbstractC23309i.m122545wk(!isChecked);
                    C18922m.m99141t().m99156p();
                } else if (AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                    this.f67742h1.setChecked(!isChecked);
                    AbstractC23309i.m122545wk(!isChecked);
                    AbstractC23647d.m123897g("22001403");
                } else {
                    AbstractC23034c6.m118182u0(this.f72421L0.m92662fJ(), 11121);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m73944pM() {
        try {
            m73950qM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: sM */
    private void m73945sM() {
        int i11;
        RobotoTextView robotoTextView = this.f67743i1;
        C18932a c18932a = C18932a.f94442a;
        if (c18932a.m99187k(c18932a.m99181e())) {
            i11 = AbstractC8020f0.str_state_setting_off_chat_label;
        } else {
            i11 = AbstractC8020f0.str_state_setting_on_chat_label;
        }
        robotoTextView.setText(AbstractC23136l9.m118743r0(i11));
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        try {
            m73935Vp();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            try {
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(4);
                aVar.m43155d(true);
                aVar.m43162k(AbstractC23136l9.m118743r0(AbstractC8020f0.str_announce_unable_chat_head_when_use_passcode));
                aVar.m43169r(AbstractC8020f0.ls_ok, new InterfaceC17463d.b());
                return aVar.m43152a();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_message_view, viewGroup, false);
        m73949oM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67755u1.m87408i());
        }
    }

    /* renamed from: Ie */
    void m73946Ie(int i11, int i12) {
        try {
            if (this.f67716A1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67759y1 = i11;
                this.f67760z1 = i12;
                this.f67716A1 = true;
                this.f67717B1.mo1704o8(this.f67718C1);
                this.f67717B1.mo1545U3(i11, i12, "");
            } else {
                this.f67716A1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m73950qM();
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
            m73935Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m73942mM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67755u1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m73941lM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67751q1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: Vx */
    void m73947Vx() {
        if (this.f67756v1) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f67756v1 = true;
            this.f67757w1.mo1704o8(this.f67758x1);
            this.f67757w1.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f67756v1 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m73951rM();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_auto_receive_voice) {
            return 15;
        }
        if (i11 == AbstractC6918a0.ll_suggest_sticker_chat) {
            return 16;
        }
        if (i11 == AbstractC6918a0.ll_sms_integration) {
            return 21;
        }
        if (i11 == AbstractC6918a0.ll_enter_to_send_chat) {
            return 22;
        }
        if (i11 == AbstractC6918a0.ll_setting_video_auto_play) {
            return 67;
        }
        if (i11 == AbstractC6918a0.ll_display_msg) {
            return 93;
        }
        if (i11 == AbstractC6918a0.ll_auto_reply) {
            return 130;
        }
        if (i11 == AbstractC6918a0.ll_quick_message) {
            return 127;
        }
        if (i11 == AbstractC6918a0.ll_block_message) {
            return 68;
        }
        if (i11 == AbstractC6918a0.ll_hidden_chat) {
            return 69;
        }
        if (i11 == AbstractC6918a0.ll_setting_chat_head) {
            return 92;
        }
        if (i11 == AbstractC6918a0.ll_setting_chat_label) {
            return ZVideoUtilMetadata.FF_PROFILE_H264_HIGH_422;
        }
        return -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingMessageView";
    }

    /* renamed from: o3 */
    void m73948o3(int i11, int i12) {
        try {
            if (this.f67721F1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67719D1 = i11;
                this.f67720E1 = i12;
                this.f67721F1 = true;
                this.f67722G1.mo1704o8(this.f67723H1);
                this.f67722G1.mo1699o3(i11, i12);
            } else {
                this.f67721F1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m73950qM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m73949oM(View view) {
        int i11;
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67751q1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67752r1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67755u1.m87415u(this.f67751q1);
            this.f67724P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_auto_receive_voice);
            this.f67725Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_sms_integration);
            this.f67726R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_enter_to_send_chat);
            this.f67727S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_suggest_sticker_chat);
            this.f67728T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_video_auto_play);
            this.f67732X0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_display_msg);
            this.f67729U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_auto_reply);
            this.f67730V0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_quick_message);
            this.f67731W0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_block_message);
            this.f67733Y0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_hidden_chat);
            this.f67734Z0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_chat_head);
            this.f67735a1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_undo_delete_conversation);
            this.f67736b1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_bubble_chat);
            this.f67737c1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_setting_chat_label);
            this.f67738d1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_auto_receive_voice);
            this.f67739e1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_sms_integration);
            this.f67740f1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_enter_to_send_chat);
            this.f67741g1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_suggest_sticker_chat);
            this.f67742h1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_setting_chat_head);
            this.f67743i1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_state_setting_chat_label);
            this.f67744j1 = view.findViewById(AbstractC6918a0.setting_chat_head_separate_line);
            this.f67745k1 = view.findViewById(AbstractC6918a0.separate_setting_video_auto_play);
            this.f67746l1 = view.findViewById(AbstractC6918a0.v_display_msg_separate_line);
            this.f67747m1 = view.findViewById(AbstractC6918a0.v_chat_label_separate_line);
            this.f67748n1 = view.findViewById(AbstractC6918a0.v_auto_reply_separate_line);
            this.f67749o1 = view.findViewById(AbstractC6918a0.v_quick_message_separate_line);
            this.f67750p1 = view.findViewById(AbstractC6918a0.v_block_message_separate_line);
            this.f67724P0.setOnClickListener(this);
            this.f67725Q0.setOnClickListener(this);
            this.f67726R0.setOnClickListener(this);
            this.f67727S0.setOnClickListener(this);
            this.f67728T0.setOnClickListener(this);
            this.f67732X0.setOnClickListener(this);
            this.f67729U0.setOnClickListener(this);
            this.f67730V0.setOnClickListener(this);
            this.f67731W0.setOnClickListener(this);
            this.f67733Y0.setOnClickListener(this);
            this.f67734Z0.setOnClickListener(this);
            this.f67735a1.setOnClickListener(this);
            this.f67736b1.setOnClickListener(this);
            this.f67737c1.setOnClickListener(this);
            this.f67738d1.setOnClickListener(this);
            this.f67739e1.setOnClickListener(this);
            this.f67740f1.setOnClickListener(this);
            this.f67741g1.setOnClickListener(this);
            this.f67742h1.setOnClickListener(this);
            LinearLayout linearLayout = this.f67727S0;
            int i12 = 0;
            if (AbstractC23309i.m121234Ng()) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            linearLayout.setVisibility(i11);
            this.f67737c1.setVisibility(0);
            this.f67747m1.setVisibility(0);
            boolean z11 = AbstractC26684e.f126408a;
            this.f67725Q0.setVisibility(8);
            view.findViewById(AbstractC6918a0.ll_sms_integration_padding).setVisibility(8);
            if (AbstractC26683d.f126391B) {
                this.f67744j1.setVisibility(0);
                this.f67736b1.setVisibility(0);
                this.f67734Z0.setVisibility(8);
            } else if (AbstractC23309i.m122004i2() && AbstractC26681b.f126356a) {
                this.f67734Z0.setVisibility(0);
                this.f67744j1.setVisibility(0);
            } else {
                this.f67734Z0.setVisibility(8);
                this.f67744j1.setVisibility(8);
            }
            if (ZMediaPlayerSettings.getVideoConfig(0).getPlayInline() == 1) {
                this.f67728T0.setVisibility(0);
                this.f67745k1.setVisibility(0);
            } else {
                this.f67728T0.setVisibility(8);
                this.f67745k1.setVisibility(8);
            }
            LinearLayout linearLayout2 = this.f67735a1;
            if (!AbstractC0924m0.m3194Kc()) {
                i12 = 8;
            }
            linearLayout2.setVisibility(i12);
            if (!AbstractC23306f.m120562A().m2526U()) {
                this.f67732X0.setVisibility(8);
                this.f67746l1.setVisibility(8);
            }
            if (!C26373e.f125282a.m135794c()) {
                this.f67729U0.setVisibility(8);
                this.f67748n1.setVisibility(8);
            }
            if (!C32592h.f150598a.m157755b()) {
                this.f67730V0.setVisibility(8);
                this.f67749o1.setVisibility(8);
            }
            AbstractC23309i.m121148L4();
            m73950qM();
            m73947Vx();
            m73942mM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 != 11121) {
            if (i11 == 11123 && i12 == -1) {
                m73945sM();
            }
        } else if (AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
            this.f67742h1.setChecked(true);
            AbstractC23647d.m123897g("22001403");
            AbstractC23309i.m122545wk(true);
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_setting_chat_label) {
                Bundle bundle = new Bundle();
                bundle.putString("STR_SOURCE_START_VIEW", "setting");
                if (this.f72421L0.m92662fJ() != null) {
                    this.f72421L0.m92662fJ().m93066i2(ManageConversationLabelSetting.class, bundle, 11123, 1, true);
                    return;
                }
                return;
            }
            if (id2 != AbstractC6918a0.ll_setting_chat_head && id2 != AbstractC6918a0.sw_setting_chat_head) {
                if (id2 == AbstractC6918a0.ll_setting_bubble_chat) {
                    InterfaceC27218a m92676n2 = m92676n2();
                    if (m92676n2 != null) {
                        AbstractC23034c6.m118176r0(m92676n2.mo35575n1(), (int) System.currentTimeMillis());
                        return;
                    }
                    return;
                }
                if (id2 != AbstractC6918a0.ll_auto_receive_voice && id2 != AbstractC6918a0.sw_auto_receive_voice) {
                    if (id2 != AbstractC6918a0.ll_sms_integration && id2 != AbstractC6918a0.sw_sms_integration) {
                        if (id2 != AbstractC6918a0.ll_enter_to_send_chat && id2 != AbstractC6918a0.sw_enter_to_send_chat) {
                            if (id2 != AbstractC6918a0.ll_suggest_sticker_chat && id2 != AbstractC6918a0.sw_suggest_sticker_chat) {
                                if (id2 == AbstractC6918a0.ll_display_msg) {
                                    this.f72421L0.m92662fJ().m93069k2(SettingDisplayMessage.class, null, 1, true);
                                    AbstractC26084s.m134269q(0, 93);
                                    C0815e1.m2079N(93, 1, 0, 0, 0);
                                    return;
                                }
                                if (id2 == AbstractC6918a0.ll_auto_reply) {
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("STR_SOURCE_START_VIEW", "setting");
                                    this.f72421L0.m92662fJ().m93069k2(AutoReplyListingView.class, bundle2, 1, true);
                                    AbstractC26084s.m134269q(0, 130);
                                    C0815e1.m2079N(130, 1, 0, 0, 0);
                                    return;
                                }
                                if (id2 == AbstractC6918a0.ll_quick_message) {
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putString("STR_SOURCE_START_VIEW", "setting");
                                    this.f72421L0.m92662fJ().m93069k2(QuickMessageListingFullView.class, bundle3, 1, true);
                                    AbstractC26084s.m134269q(0, 127);
                                    C0815e1.m2079N(127, 1, 0, 0, 0);
                                    return;
                                }
                                if (id2 == AbstractC6918a0.ll_block_message) {
                                    this.f72421L0.m92662fJ().m93069k2(BlockContactsView.class, null, 1, true);
                                    AbstractC26084s.m134269q(0, 68);
                                    C0815e1.m2079N(68, 1, 0, 0, 0);
                                    return;
                                } else {
                                    if (id2 == AbstractC6918a0.ll_hidden_chat) {
                                        this.f72421L0.m92662fJ().m93069k2(SettingHiddenChatView.class, null, 1, true);
                                        AbstractC26084s.m134269q(0, 69);
                                        C0815e1.m2079N(69, 1, 0, 0, 0);
                                        AbstractC23647d.m123897g("22001331");
                                        return;
                                    }
                                    if (id2 == AbstractC6918a0.ll_setting_video_auto_play) {
                                        this.f72421L0.m92662fJ().m93069k2(SettingVideoView.class, null, 1, true);
                                        AbstractC26084s.m134269q(0, 67);
                                        C0815e1.m2079N(67, 1, 0, 0, 0);
                                        return;
                                    }
                                    return;
                                }
                            }
                            this.f67741g1.setChecked(!r10.isChecked());
                            AbstractC26084s.m134269q(0, 16);
                            m73948o3(19, this.f67741g1.isChecked() ? 1 : 0);
                            C0815e1.m2079N(16, 1, 0, 0, 0);
                            return;
                        }
                        this.f67740f1.setChecked(!r10.isChecked());
                        AbstractC26084s.m134269q(0, 22);
                        m73948o3(3, this.f67740f1.isChecked() ? 1 : 0);
                        C0815e1.m2079N(22, 1, 0, 0, 0);
                        return;
                    }
                    AbstractC26084s.m134269q(0, 21);
                    if (this.f67739e1.isChecked()) {
                        this.f67739e1.setChecked(false);
                        m73946Ie(10, 2);
                    } else {
                        this.f67739e1.setChecked(!r0.isChecked());
                        m73946Ie(10, 1);
                    }
                    C0815e1.m2079N(21, 1, 0, 0, 0);
                    return;
                }
                this.f67738d1.setChecked(!r10.isChecked());
                AbstractC26084s.m134269q(0, 15);
                m73948o3(1, this.f67738d1.isChecked() ? 1 : 0);
                C0815e1.m2079N(15, 1, 0, 0, 0);
                return;
            }
            m73943nM();
            AbstractC26084s.m134269q(0, 92);
            C0815e1.m2079N(92, 1, 0, 0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        m73950qM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f67755u1.m87413s();
    }

    /* renamed from: qM */
    void m73950qM() {
        boolean z11;
        try {
            this.f67738d1.setChecked(AbstractC23309i.m121106K());
            StencilSwitch stencilSwitch = this.f67739e1;
            boolean z12 = true;
            if (AbstractC23309i.m121787cc() == 1 && AbstractC23034c6.m118116D(MainApplication.getAppContext(), AbstractC23034c6.f112024a)) {
                z11 = true;
            } else {
                z11 = false;
            }
            stencilSwitch.setChecked(z11);
            StencilSwitch stencilSwitch2 = this.f67742h1;
            if (AbstractC23165o5.m119333b() || !AbstractC23309i.m121966h2() || !AbstractC23034c6.m118126L(MainApplication.getAppContext())) {
                z12 = false;
            }
            stencilSwitch2.setChecked(z12);
            AbstractC26683d.m137045e();
            boolean z13 = AbstractC26684e.f126408a;
            this.f67739e1.setEnabled(false);
            this.f67725Q0.setEnabled(false);
            this.f67740f1.setChecked(AbstractC23309i.m121699a0());
            this.f67741g1.setChecked(AbstractC23309i.m121527Vd());
            m73945sM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m73951rM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: la0.n3
                @Override // java.lang.Runnable
                public final void run() {
                    SettingMessageView.this.m73944pM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.o3
                @Override // java.lang.Runnable
                public final void run() {
                    SettingMessageView.this.m73941lM();
                }
            });
        }
    }
}
