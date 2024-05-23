package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0809c1;
import ag0.C0815e1;
import am.AbstractC0939u;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.common.chat.label.C7860a;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.SettingNotificationView;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.SettingGroupView;
import com.zing.zalo.p077ui.zviews.SettingMutedCallersView;
import com.zing.zalo.p077ui.zviews.SettingTimeLineView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import en0.InterfaceC18505l;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23217t2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p248iy.AbstractC20887g;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p363nh.C23744a;
import p445qe.C25244a;
import pm0.C24848g0;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import th.AbstractC26683d;

/* loaded from: classes6.dex */
public class SettingNotificationView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: C1 */
    int f67775C1;

    /* renamed from: D1 */
    int f67776D1;

    /* renamed from: P0 */
    LinearLayout f67785P0;

    /* renamed from: Q0 */
    LinearLayout f67786Q0;

    /* renamed from: R0 */
    LinearLayout f67787R0;

    /* renamed from: S0 */
    LinearLayout f67788S0;

    /* renamed from: T0 */
    LinearLayout f67789T0;

    /* renamed from: U0 */
    LinearLayout f67790U0;

    /* renamed from: V0 */
    LinearLayout f67791V0;

    /* renamed from: W0 */
    LinearLayout f67792W0;

    /* renamed from: X0 */
    LinearLayout f67793X0;

    /* renamed from: Y0 */
    LinearLayout f67794Y0;

    /* renamed from: Z0 */
    LinearLayout f67795Z0;

    /* renamed from: a1 */
    LinearLayout f67796a1;

    /* renamed from: b1 */
    LinearLayout f67797b1;

    /* renamed from: c1 */
    LinearLayout f67798c1;

    /* renamed from: d1 */
    StencilSwitch f67799d1;

    /* renamed from: e1 */
    StencilSwitch f67800e1;

    /* renamed from: f1 */
    StencilSwitch f67801f1;

    /* renamed from: g1 */
    StencilSwitch f67802g1;

    /* renamed from: h1 */
    StencilSwitch f67803h1;

    /* renamed from: i1 */
    StencilSwitch f67804i1;

    /* renamed from: j1 */
    StencilSwitch f67805j1;

    /* renamed from: k1 */
    StencilSwitch f67806k1;

    /* renamed from: l1 */
    StencilSwitch f67807l1;

    /* renamed from: m1 */
    TextView f67808m1;

    /* renamed from: n1 */
    TextView f67809n1;

    /* renamed from: o1 */
    RobotoTextView f67810o1;

    /* renamed from: p1 */
    View f67811p1;

    /* renamed from: q1 */
    View f67812q1;

    /* renamed from: r1 */
    View f67813r1;

    /* renamed from: s1 */
    View f67814s1;

    /* renamed from: t1 */
    View f67815t1;

    /* renamed from: u1 */
    ScrollViewVisibleChildViewDetector f67816u1;

    /* renamed from: v1 */
    HightLightSettingView f67817v1;

    /* renamed from: w1 */
    int f67818w1 = -1;

    /* renamed from: x1 */
    int f67819x1 = 0;

    /* renamed from: y1 */
    final sh0 f67820y1 = new sh0();

    /* renamed from: z1 */
    boolean f67821z1 = false;

    /* renamed from: A1 */
    private final InterfaceC0765j f67773A1 = new C0766k();

    /* renamed from: B1 */
    private final InterfaceC20094a f67774B1 = new C13159f();

    /* renamed from: E1 */
    boolean f67777E1 = false;

    /* renamed from: F1 */
    private final InterfaceC0765j f67778F1 = new C0766k();

    /* renamed from: G1 */
    private final InterfaceC20094a f67779G1 = new C13160g();

    /* renamed from: H1 */
    int f67780H1 = -1;

    /* renamed from: I1 */
    int f67781I1 = -1;

    /* renamed from: J1 */
    boolean f67782J1 = false;

    /* renamed from: K1 */
    private final InterfaceC0765j f67783K1 = new C0766k();

    /* renamed from: L1 */
    private final InterfaceC20094a f67784L1 = new C13161h();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$a */
    /* loaded from: classes6.dex */
    public class RunnableC13154a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67822p;

        RunnableC13154a(View view) {
            this.f67822p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingNotificationView.this.f67820y1.m87411l(this.f67822p, this)) {
                    return;
                }
                SettingNotificationView settingNotificationView = SettingNotificationView.this;
                int i11 = settingNotificationView.f67818w1;
                if (i11 != 18) {
                    if (i11 != 19) {
                        if (i11 != 111) {
                            if (i11 != 131) {
                                if (i11 != 132) {
                                    switch (i11) {
                                        case 10:
                                            linearLayout = settingNotificationView.f67785P0;
                                            break;
                                        case 11:
                                            linearLayout = settingNotificationView.f67786Q0;
                                            break;
                                        case 12:
                                            linearLayout = settingNotificationView.f67792W0;
                                            break;
                                        case 13:
                                            linearLayout = settingNotificationView.f67793X0;
                                            break;
                                        case 14:
                                            linearLayout = settingNotificationView.f67794Y0;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 62:
                                                    linearLayout = settingNotificationView.f67790U0;
                                                    break;
                                                case 63:
                                                    linearLayout = settingNotificationView.f67795Z0;
                                                    break;
                                                case 64:
                                                    linearLayout = settingNotificationView.f67789T0;
                                                    break;
                                                default:
                                                    linearLayout = null;
                                                    break;
                                            }
                                    }
                                } else {
                                    linearLayout = settingNotificationView.f67798c1;
                                }
                            } else {
                                linearLayout = settingNotificationView.f67797b1;
                            }
                        } else {
                            linearLayout = settingNotificationView.f67796a1;
                        }
                    } else {
                        linearLayout = settingNotificationView.f67788S0;
                    }
                } else {
                    linearLayout = settingNotificationView.f67787R0;
                }
                settingNotificationView.f67820y1.m87409j(linearLayout, settingNotificationView.f67817v1, settingNotificationView.f67819x1);
                SettingNotificationView.this.m73989MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$b */
    /* loaded from: classes6.dex */
    class C13155b extends AbstractC0939u {
        C13155b() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC20887g.m109246x(19090, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$c */
    /* loaded from: classes6.dex */
    class C13156c extends AbstractC0939u {
        C13156c() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            if (SettingNotificationView.this.f67804i1.isChecked()) {
                i11 = 19092;
            } else {
                i11 = 19093;
            }
            AbstractC20887g.m109246x(i11, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$d */
    /* loaded from: classes6.dex */
    class C13157d extends AbstractC0939u {
        C13157d() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            int i11;
            if (SettingNotificationView.this.f67805j1.isChecked()) {
                i11 = 19094;
            } else {
                i11 = 19095;
            }
            AbstractC20887g.m109246x(i11, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$e */
    /* loaded from: classes6.dex */
    class C13158e extends AbstractC0939u {
        C13158e() {
        }

        @Override // p660xw.InterfaceC30214a
        /* renamed from: a */
        public void mo928a() {
            AbstractC20887g.m109246x(19091, System.currentTimeMillis());
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$f */
    /* loaded from: classes6.dex */
    class C13159f implements InterfaceC20094a {
        C13159f() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingNotificationView settingNotificationView = SettingNotificationView.this;
            settingNotificationView.f67821z1 = false;
            settingNotificationView.m74008uM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingNotificationView.this.f67821z1 = false;
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
            SettingNotificationView.this.m74008uM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$g */
    /* loaded from: classes6.dex */
    public class C13160g implements InterfaceC20094a {
        C13160g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74011d() {
            try {
                SettingNotificationView settingNotificationView = SettingNotificationView.this;
                AbstractC23148n.m118848v(settingNotificationView.f67775C1, settingNotificationView.f67776D1);
                SettingNotificationView.this.m74007tM();
            } catch (Exception e11) {
                e11.printStackTrace();
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
                    SettingNotificationView.this.m74008uM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingNotificationView settingNotificationView = SettingNotificationView.this;
                settingNotificationView.f67777E1 = false;
                settingNotificationView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingNotificationView settingNotificationView2 = SettingNotificationView.this;
                settingNotificationView2.f67777E1 = false;
                settingNotificationView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingNotificationView.this.f72421L0.m92676n2() != null) {
                        SettingNotificationView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.x
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingNotificationView.C13160g.this.m74011d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingNotificationView settingNotificationView = SettingNotificationView.this;
                settingNotificationView.f67777E1 = false;
                settingNotificationView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$h */
    /* loaded from: classes6.dex */
    public class C13161h implements InterfaceC20094a {
        C13161h() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74013d() {
            try {
                SettingNotificationView settingNotificationView = SettingNotificationView.this;
                int i11 = settingNotificationView.f67780H1;
                AbstractC23148n.m118851y(i11, settingNotificationView.f67781I1, i11);
                SettingNotificationView.this.m74007tM();
            } catch (Exception e11) {
                e11.printStackTrace();
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
                    SettingNotificationView.this.m74008uM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingNotificationView settingNotificationView = SettingNotificationView.this;
                settingNotificationView.f67782J1 = false;
                settingNotificationView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingNotificationView settingNotificationView2 = SettingNotificationView.this;
                settingNotificationView2.f67782J1 = false;
                settingNotificationView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    SettingNotificationView settingNotificationView = SettingNotificationView.this;
                    if (settingNotificationView.f67780H1 == 15 && settingNotificationView.f67781I1 == 0) {
                        C7860a.Companion.m40303b().m40260C0();
                    }
                    if (SettingNotificationView.this.f72421L0.m92676n2() != null) {
                        SettingNotificationView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.y
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingNotificationView.C13161h.this.m74013d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingNotificationView settingNotificationView2 = SettingNotificationView.this;
                settingNotificationView2.f67782J1 = false;
                settingNotificationView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingNotificationView settingNotificationView3 = SettingNotificationView.this;
                settingNotificationView3.f67782J1 = false;
                settingNotificationView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$i */
    /* loaded from: classes6.dex */
    public class C13162i implements InterfaceC20094a {
        C13162i() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC23148n.m118851y(15, 1, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingNotificationView$j */
    /* loaded from: classes6.dex */
    public class C13163j implements InterfaceC20094a {
        C13163j() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC23148n.m118851y(13, 1, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m73989MA() {
        this.f67818w1 = -1;
        this.f67819x1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m73990Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67818w1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67819x1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* renamed from: lM */
    public static void m73996lM() {
        if (AbstractC23309i.m122649zd() == 1 && !AbstractC23309i.m122413t() && System.currentTimeMillis() > AbstractC23309i.m121940gd() && C23055e5.m118272g(true)) {
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C13162i());
            c0766k.mo1699o3(15, 1);
        }
        if (AbstractC23309i.m120750Ad() == 1 && !AbstractC23309i.m122450u() && System.currentTimeMillis() > AbstractC23309i.m121978hd() && C23055e5.m118272g(true)) {
            C0766k c0766k2 = new C0766k();
            c0766k2.mo1704o8(new C13163j());
            c0766k2.mo1699o3(13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: mM */
    public void m73997mM() {
        try {
            AbstractC26084s.m134251H(this.f67785P0, 10);
            AbstractC26084s.m134251H(this.f67786Q0, 11);
            AbstractC26084s.m134251H(this.f67792W0, 12);
            AbstractC26084s.m134251H(this.f67793X0, 13);
            AbstractC26084s.m134251H(this.f67794Y0, 14);
            AbstractC26084s.m134251H(this.f67787R0, 18);
            AbstractC26084s.m134251H(this.f67788S0, 19);
            AbstractC26084s.m134251H(this.f67795Z0, 63);
            AbstractC26084s.m134251H(this.f67789T0, 64);
            AbstractC26084s.m134251H(this.f67790U0, 62);
            this.f67820y1.m87405e(this, 40);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingNotificationView", e11);
        }
    }

    /* renamed from: nM */
    private void m73998nM(View view) {
        if (this.f67818w1 >= 0) {
            view.postDelayed(new RunnableC13154a(view), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ C24848g0 m73999pM(Boolean bool) {
        mo49315c4();
        m74002sM();
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qM */
    public /* synthetic */ C24848g0 m74000qM(Boolean bool) {
        mo49315c4();
        m74002sM();
        return C24848g0.f119245a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public /* synthetic */ void m74001rM() {
        StencilSwitch stencilSwitch = this.f67807l1;
        if (stencilSwitch != null) {
            stencilSwitch.setChecked(C25244a.m130639q());
        }
        if (AbstractC23304d.f113347X1 && C25244a.m130639q()) {
            this.f67798c1.setVisibility(0);
            this.f67815t1.setVisibility(0);
        } else {
            this.f67798c1.setVisibility(8);
            this.f67815t1.setVisibility(8);
        }
    }

    /* renamed from: sM */
    private void m74002sM() {
        mo70710wy(new Runnable() { // from class: la0.e4
            @Override // java.lang.Runnable
            public final void run() {
                SettingNotificationView.this.m74001rM();
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m73990Vp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return null;
            }
            return new C8009j.a(getContext()).m43159h(7).m43172u(m92652XI(AbstractC8020f0.str_call_setting_notif_off_popup_title)).m43161j(AbstractC8020f0.str_call_setting_notif_off_popup_desc).m43169r(AbstractC8020f0.str_call_setting_notif_off_popup_confirm, this).m43164m(AbstractC8020f0.str_call_setting_notif_off_popup_cancel, new InterfaceC17463d.b()).m43152a();
        }
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_dialog_off_noti_msg));
        aVar.m43173v(2);
        aVar.m43161j(AbstractC8020f0.str_content_dialog_off_noti_msg_new);
        aVar.m43159h(7);
        aVar.m43165n(AbstractC23136l9.m118743r0(AbstractC8020f0.str_cancel), new InterfaceC17463d.b());
        aVar.m43170s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_dialog_off_noti_msg), this);
        return aVar.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_notification_view, viewGroup, false);
        m74006oM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67820y1.m87408i());
        }
    }

    /* renamed from: Ie */
    void m74003Ie(int i11, int i12) {
        try {
            if (this.f67777E1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67775C1 = i11;
                this.f67776D1 = i12;
                this.f67777E1 = true;
                this.f67778F1.mo1704o8(this.f67779G1);
                this.f67778F1.mo1545U3(i11, i12, "");
            } else {
                this.f67777E1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m74007tM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        try {
            int mo92862f = interfaceC17463d.mo92862f();
            if (mo92862f != 1) {
                if (mo92862f == 2 && i11 == -1) {
                    interfaceC17463d.dismiss();
                    if (C23055e5.m118272g(true)) {
                        mo46829Y();
                        C25244a.m130623Q(false, new InterfaceC18505l() { // from class: la0.h4
                            @Override // en0.InterfaceC18505l
                            /* renamed from: i9 */
                            public final Object mo205i9(Object obj) {
                                C24848g0 m74000qM;
                                m74000qM = SettingNotificationView.this.m74000qM((Boolean) obj);
                                return m74000qM;
                            }
                        });
                    }
                }
            } else if (i11 == -1) {
                interfaceC17463d.dismiss();
                this.f67799d1.setChecked(false);
                m74005o3(15, 0);
                AbstractC23309i.m120882Dy(System.currentTimeMillis() + 86400000);
                C0809c1.m2050b(new C13158e());
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
            m73990Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m73998nM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67820y1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m73997mM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67816u1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: Vx */
    void m74004Vx() {
        if (this.f67821z1) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f67821z1 = true;
            this.f67773A1.mo1704o8(this.f67774B1);
            this.f67773A1.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f67821z1 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m74008uM();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_notification_new_message) {
            return 10;
        }
        if (i11 == AbstractC6918a0.ll_preview_message) {
            return 11;
        }
        if (i11 == AbstractC6918a0.ll_notify_birthday) {
            return 12;
        }
        if (i11 == AbstractC6918a0.ll_sound_notify) {
            return 13;
        }
        if (i11 == AbstractC6918a0.ll_vibrate_notify) {
            return 14;
        }
        if (i11 == AbstractC6918a0.ll_use_popup_msg) {
            return 18;
        }
        if (i11 == AbstractC6918a0.ll_unlock_screen_for_popup) {
            return 19;
        }
        if (i11 == AbstractC6918a0.ll_in_app_notif) {
            return 63;
        }
        if (i11 == AbstractC6918a0.ll_notification_new_msg_group) {
            return 64;
        }
        if (i11 == AbstractC6918a0.ll_noti_new_feed) {
            return 62;
        }
        if (i11 == AbstractC6918a0.ll_allow_call_notification) {
            return 131;
        }
        return i11 == AbstractC6918a0.ll_muted_callers ? 132 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingNotificationView";
    }

    /* renamed from: o3 */
    void m74005o3(int i11, int i12) {
        try {
            if (this.f67782J1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67780H1 = i11;
                this.f67781I1 = i12;
                this.f67782J1 = true;
                this.f67783K1.mo1704o8(this.f67784L1);
                this.f67783K1.mo1699o3(i11, i12);
            } else {
                this.f67782J1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m74007tM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m74006oM(View view) {
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67816u1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67817v1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67820y1.m87415u(this.f67816u1);
            this.f67785P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_notification_new_message);
            this.f67786Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_preview_message);
            this.f67787R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_use_popup_msg);
            this.f67788S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_unlock_screen_for_popup);
            this.f67789T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_notification_new_msg_group);
            this.f67790U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_noti_new_feed);
            this.f67791V0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_noti_new_story);
            this.f67792W0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_notify_birthday);
            this.f67793X0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_sound_notify);
            this.f67794Y0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_vibrate_notify);
            this.f67795Z0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_in_app_notif);
            this.f67796a1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_manage_noti);
            this.f67797b1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_call_notification);
            this.f67798c1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_muted_callers);
            this.f67799d1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_notification_new_message);
            this.f67800e1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_preview_message);
            this.f67801f1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_use_popup_msg);
            this.f67802g1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_unlock_screen_for_popup);
            this.f67803h1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_notify_birthday);
            this.f67804i1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_sound_notify);
            this.f67805j1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_vibrate_notify);
            this.f67806k1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_in_app_notif);
            this.f67807l1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_call_notification);
            this.f67808m1 = (TextView) view.findViewById(AbstractC6918a0.tv_noti_new_feed_des);
            this.f67809n1 = (TextView) view.findViewById(AbstractC6918a0.tv_noti_new_story_des);
            this.f67811p1 = view.findViewById(AbstractC6918a0.preview_message_line);
            this.f67812q1 = view.findViewById(AbstractC6918a0.use_popup_msg_line);
            this.f67813r1 = view.findViewById(AbstractC6918a0.unlock_screen_for_popup_line);
            this.f67814s1 = view.findViewById(AbstractC6918a0.divider_allow_call_notification);
            this.f67815t1 = view.findViewById(AbstractC6918a0.line_notify_call);
            this.f67810o1 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_call);
            this.f67785P0.setOnClickListener(this);
            this.f67786Q0.setOnClickListener(this);
            this.f67787R0.setOnClickListener(this);
            this.f67788S0.setOnClickListener(this);
            this.f67789T0.setOnClickListener(this);
            this.f67790U0.setOnClickListener(this);
            this.f67791V0.setOnClickListener(this);
            this.f67792W0.setOnClickListener(this);
            this.f67793X0.setOnClickListener(this);
            this.f67794Y0.setOnClickListener(this);
            this.f67796a1.setOnClickListener(this);
            this.f67798c1.setOnClickListener(this);
            this.f67797b1.setOnClickListener(this);
            this.f67799d1.setOnClickListener(this);
            this.f67800e1.setOnClickListener(this);
            this.f67801f1.setOnClickListener(this);
            this.f67802g1.setOnClickListener(this);
            this.f67803h1.setOnClickListener(this);
            this.f67804i1.setOnClickListener(this);
            this.f67805j1.setOnClickListener(this);
            this.f67807l1.setOnClickListener(this);
            if (AbstractC26683d.f126399r) {
                this.f67795Z0.setVisibility(0);
                this.f67795Z0.setOnClickListener(this);
                this.f67806k1.setOnClickListener(this);
            } else {
                this.f67795Z0.setVisibility(8);
            }
            if (!AbstractC23304d.f113347X1) {
                this.f67797b1.setVisibility(8);
                this.f67810o1.setVisibility(8);
                this.f67798c1.setVisibility(8);
                this.f67814s1.setVisibility(8);
                this.f67815t1.setVisibility(8);
            }
            AbstractC23309i.m121148L4();
            m74007tM();
            if (Build.VERSION.SDK_INT < 26) {
                this.f67796a1.setVisibility(8);
                view.findViewById(AbstractC6918a0.line_manage_notif).setVisibility(8);
            }
            m74004Vx();
            m73998nM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        try {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.ll_notification_new_message && id2 != AbstractC6918a0.sw_notification_new_message) {
                if (id2 != AbstractC6918a0.ll_preview_message && id2 != AbstractC6918a0.sw_preview_message) {
                    if (id2 != AbstractC6918a0.ll_use_popup_msg && id2 != AbstractC6918a0.sw_use_popup_msg) {
                        if (id2 != AbstractC6918a0.ll_unlock_screen_for_popup && id2 != AbstractC6918a0.sw_unlock_screen_for_popup) {
                            if (id2 == AbstractC6918a0.ll_notification_new_msg_group) {
                                AbstractC26084s.m134269q(0, 64);
                                this.f72421L0.m92662fJ().m93069k2(SettingGroupView.class, null, 1, true);
                                C0815e1.m2079N(64, 1, 0, 0, 0);
                                return;
                            }
                            if (id2 == AbstractC6918a0.ll_noti_new_feed) {
                                this.f72421L0.m92662fJ().m93069k2(SettingTimeLineView.class, null, 1, true);
                                AbstractC26084s.m134269q(0, 62);
                                C0815e1.m2079N(62, 1, 0, 0, 0);
                                return;
                            }
                            if (id2 == AbstractC6918a0.ll_noti_new_story) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("EXTRA_SETTING_NOTI", 1);
                                this.f72421L0.m92662fJ().m93069k2(SettingTimeLineView.class, bundle, 1, true);
                                C0815e1.m2079N(40, 1, 0, 0, 0);
                                return;
                            }
                            if (id2 != AbstractC6918a0.ll_notify_birthday && id2 != AbstractC6918a0.sw_notify_birthday) {
                                if (id2 != AbstractC6918a0.ll_sound_notify && id2 != AbstractC6918a0.sw_sound_notify) {
                                    if (id2 != AbstractC6918a0.ll_vibrate_notify && id2 != AbstractC6918a0.sw_vibrate_notify) {
                                        if (id2 != AbstractC6918a0.ll_in_app_notif && id2 != AbstractC6918a0.sw_in_app_notif) {
                                            if (id2 == AbstractC6918a0.ll_manage_noti) {
                                                Intent intent = new Intent();
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                                                    intent.putExtra("android.provider.extra.APP_PACKAGE", MainApplication.getAppContext().getPackageName());
                                                } else {
                                                    intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                                                    intent.putExtra("app_package", MainApplication.getAppContext().getPackageName());
                                                    intent.putExtra("app_uid", MainApplication.getAppContext().getApplicationInfo().uid);
                                                }
                                                m92676n2().startActivity(intent);
                                                AbstractC23647d.m123897g("37207");
                                                return;
                                            }
                                            if (id2 != AbstractC6918a0.ll_allow_call_notification && id2 != AbstractC6918a0.sw_allow_call_notification) {
                                                if (id2 == AbstractC6918a0.ll_muted_callers) {
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "setting_call");
                                                    this.f72421L0.m92662fJ().m93069k2(SettingMutedCallersView.class, bundle2, 1, true);
                                                    return;
                                                }
                                                return;
                                            }
                                            if (C23055e5.m118272g(true)) {
                                                if (this.f67807l1.isChecked()) {
                                                    showDialog(2);
                                                    return;
                                                } else {
                                                    mo46829Y();
                                                    C25244a.m130623Q(true, new InterfaceC18505l() { // from class: la0.f4
                                                        @Override // en0.InterfaceC18505l
                                                        /* renamed from: i9 */
                                                        public final Object mo205i9(Object obj) {
                                                            C24848g0 m73999pM;
                                                            m73999pM = SettingNotificationView.this.m73999pM((Boolean) obj);
                                                            return m73999pM;
                                                        }
                                                    });
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        boolean isChecked = this.f67806k1.isChecked();
                                        this.f67806k1.setChecked(!isChecked);
                                        AbstractC26084s.m134269q(0, 63);
                                        AbstractC23309i.m121055Im(!isChecked);
                                        C0815e1.m2079N(63, 1, 0, 0, 0);
                                        return;
                                    }
                                    boolean isChecked2 = this.f67804i1.isChecked();
                                    this.f67805j1.setChecked(!r0.isChecked());
                                    AbstractC26084s.m134269q(0, 14);
                                    m74005o3(7, this.f67805j1.isChecked() ? 1 : 0);
                                    if (isChecked2) {
                                        str2 = "37203";
                                    } else {
                                        str2 = "37204";
                                    }
                                    AbstractC23647d.m123906p(str2);
                                    AbstractC23647d.m123893c();
                                    C0815e1.m2079N(14, 1, 0, 0, 0);
                                    C0809c1.m2050b(new C13157d());
                                    return;
                                }
                                boolean isChecked3 = this.f67804i1.isChecked();
                                this.f67804i1.setChecked(!r0.isChecked());
                                AbstractC26084s.m134269q(0, 13);
                                m74005o3(6, this.f67804i1.isChecked() ? 1 : 0);
                                if (isChecked3) {
                                    str = "37201";
                                } else {
                                    str = "37202";
                                }
                                AbstractC23647d.m123906p(str);
                                AbstractC23647d.m123893c();
                                C0815e1.m2079N(13, 1, 0, 0, 0);
                                C0809c1.m2050b(new C13156c());
                                return;
                            }
                            this.f67803h1.setChecked(!r6.isChecked());
                            AbstractC26084s.m134269q(0, 12);
                            m74003Ie(14, this.f67803h1.isChecked() ? 1 : 0);
                            C0815e1.m2079N(12, 1, 0, 0, 0);
                            return;
                        }
                        if (this.f67799d1.isChecked() && this.f67800e1.isChecked() && this.f67801f1.isChecked()) {
                            this.f67802g1.setChecked(!r6.isChecked());
                            m74005o3(5, this.f67802g1.isChecked() ? 1 : 0);
                        } else {
                            Toast.makeText(MainApplication.getAppContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_popup_unlock_reply), 1).show();
                        }
                        AbstractC26084s.m134269q(0, 19);
                        C0815e1.m2079N(19, 1, 0, 0, 0);
                        return;
                    }
                    if (this.f67799d1.isChecked() && this.f67800e1.isChecked()) {
                        this.f67801f1.setChecked(!r6.isChecked());
                        m74005o3(4, this.f67801f1.isChecked() ? 1 : 0);
                    } else {
                        Toast.makeText(MainApplication.getAppContext(), AbstractC23136l9.m118743r0(AbstractC8020f0.str_warning_popup_reply), 1).show();
                    }
                    AbstractC26084s.m134269q(0, 18);
                    C0815e1.m2079N(18, 1, 0, 0, 0);
                    return;
                }
                this.f67800e1.setChecked(!r6.isChecked());
                AbstractC26084s.m134269q(0, 11);
                m74003Ie(9, !this.f67800e1.isChecked() ? 1 : 0);
                C0815e1.m2079N(11, 1, 0, 0, 0);
                return;
            }
            if (this.f67799d1.isChecked()) {
                this.f72421L0.showDialog(1);
            } else {
                this.f67799d1.setChecked(!r6.isChecked());
                m74005o3(15, this.f67799d1.isChecked() ? 1 : 0);
                C0809c1.m2050b(new C13155b());
            }
            AbstractC26084s.m134269q(0, 10);
            C0815e1.m2079N(10, 1, 0, 0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        m74007tM();
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        StencilSwitch stencilSwitch = this.f67800e1;
        if (stencilSwitch != null) {
            stencilSwitch.setChecked(AbstractC23309i.m122126la());
            m74007tM();
        }
        m74009vM();
        this.f67820y1.m87413s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: tM */
    public void m74007tM() {
        try {
            this.f67801f1.setChecked(AbstractC23309i.m121416Sd());
            this.f67802g1.setChecked(AbstractC23309i.m121564Wd());
            this.f67804i1.setChecked(AbstractC23309i.m121825dc());
            this.f67805j1.setChecked(AbstractC23309i.m121827de());
            this.f67799d1.setChecked(AbstractC23309i.m122413t());
            this.f67800e1.setChecked(AbstractC23309i.m122126la());
            this.f67803h1.setChecked(AbstractC23309i.m121777c3());
            this.f67806k1.setChecked(AbstractC23309i.m122156m3());
            m74002sM();
            if (!this.f67799d1.isChecked()) {
                this.f67786Q0.setVisibility(8);
                this.f67811p1.setVisibility(8);
                this.f67787R0.setVisibility(8);
                this.f67812q1.setVisibility(8);
                this.f67788S0.setVisibility(8);
                this.f67813r1.setVisibility(8);
            } else {
                this.f67786Q0.setVisibility(0);
                this.f67811p1.setVisibility(0);
                if (!this.f67800e1.isChecked()) {
                    this.f67787R0.setVisibility(8);
                    this.f67812q1.setVisibility(8);
                    this.f67788S0.setVisibility(8);
                    this.f67813r1.setVisibility(8);
                } else {
                    this.f67787R0.setVisibility(0);
                    this.f67812q1.setVisibility(0);
                    if (!this.f67801f1.isChecked()) {
                        this.f67788S0.setVisibility(8);
                        this.f67813r1.setVisibility(8);
                    } else {
                        this.f67788S0.setVisibility(0);
                        this.f67813r1.setVisibility(0);
                    }
                }
            }
            if (AbstractC23309i.m121929g3() == 0) {
                LinearLayout linearLayout = this.f67787R0;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                }
                View view = this.f67812q1;
                if (view != null) {
                    view.setVisibility(8);
                }
                LinearLayout linearLayout2 = this.f67788S0;
                if (linearLayout2 != null) {
                    linearLayout2.setVisibility(8);
                }
                View view2 = this.f67813r1;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
            m74009vM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: uM */
    void m74008uM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.w
                @Override // java.lang.Runnable
                public final void run() {
                    SettingNotificationView.this.m74007tM();
                }
            });
        }
    }

    /* renamed from: vM */
    void m74009vM() {
        ContactProfile m98552o;
        JSONObject optJSONObject;
        try {
            String m120822Cb = AbstractC23309i.m120822Cb();
            if (!TextUtils.isEmpty(m120822Cb)) {
                JSONObject jSONObject = new JSONObject(m120822Cb);
                int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                if (optInt == 2) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("list_uid");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select));
                    sb2.append(": ");
                    if (optJSONArray.length() > 0 && (optJSONObject = optJSONArray.optJSONObject(0)) != null) {
                        ContactProfile m98552o2 = C18644n.m98531l().m98552o(optJSONObject.optString("userId"));
                        if (m98552o2 != null) {
                            sb2.append(m98552o2.m40383Q(true, false));
                        } else {
                            sb2.append(optJSONObject.optString("displayName"));
                        }
                        if (optJSONArray.length() > 1) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(1);
                            if (optJSONObject2 != null) {
                                ContactProfile m98552o3 = C18644n.m98531l().m98552o(optJSONObject2.optString("userId"));
                                if (m98552o3 != null) {
                                    sb2.append(", ");
                                    sb2.append(m98552o3.m40383Q(true, false));
                                } else {
                                    sb2.append(", ");
                                    sb2.append(optJSONObject2.optString("displayName"));
                                }
                            }
                            if (optJSONArray.length() > 2) {
                                sb2.append(" ");
                                sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select_n_friend), Integer.valueOf(optJSONArray.length() - 2)));
                            }
                        }
                    }
                    this.f67808m1.setText(sb2.toString());
                } else if (optInt == 1) {
                    this.f67808m1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_select_all));
                } else if (optInt == 0) {
                    this.f67808m1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_select_all));
                } else {
                    this.f67808m1.setVisibility(8);
                }
            } else {
                this.f67808m1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_select_all));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        try {
            String m120859Db = AbstractC23309i.m120859Db();
            if (!TextUtils.isEmpty(m120859Db)) {
                JSONObject jSONObject2 = new JSONObject(m120859Db);
                int optInt2 = jSONObject2.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
                if (optInt2 == 2) {
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("list_uid");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select));
                    sb3.append(": ");
                    if (optJSONArray2.length() > 0) {
                        ContactProfile m98552o4 = C18644n.m98531l().m98552o(optJSONArray2.optString(0));
                        if (m98552o4 != null) {
                            sb3.append(m98552o4.m40383Q(true, false));
                        }
                        if (optJSONArray2.length() > 1 && (m98552o = C18644n.m98531l().m98552o(optJSONArray2.optString(1))) != null) {
                            sb3.append(", ");
                            sb3.append(m98552o.m40383Q(true, false));
                        }
                        if (optJSONArray2.length() > 2) {
                            sb3.append(" ");
                            sb3.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select_n_friend), Integer.valueOf(optJSONArray2.length() - 2)));
                        }
                    }
                    this.f67809n1.setText(sb3.toString());
                    return;
                }
                if (optInt2 == 1) {
                    this.f67809n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_select_all));
                    return;
                } else if (optInt2 == 0) {
                    this.f67809n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_not_select_all));
                    return;
                } else {
                    this.f67809n1.setVisibility(8);
                    return;
                }
            }
            this.f67809n1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_select_all));
        } catch (Exception e12) {
            e12.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.g4
                @Override // java.lang.Runnable
                public final void run() {
                    SettingNotificationView.this.m73997mM();
                }
            });
        }
    }
}
