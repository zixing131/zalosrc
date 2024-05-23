package com.zing.zalo.p077ui.settings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import b40.C2526d;
import bo.C3006m1;
import bp0.C3080a0;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.settings.SettingPrivateView;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.BlackListView;
import com.zing.zalo.p077ui.zviews.FrameLayoutKeepBtmSheetZaloView;
import com.zing.zalo.p077ui.zviews.HiddenListView;
import com.zing.zalo.p077ui.zviews.JumpLinkListSettingView;
import com.zing.zalo.p077ui.zviews.SettingAllowViewSocialView;
import com.zing.zalo.p077ui.zviews.SettingCallFromStrangerView;
import com.zing.zalo.p077ui.zviews.SettingFriendRequestView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.p077ui.zviews.StoryBlockedListView;
import com.zing.zalo.p077ui.zviews.sh0;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.uicontrol.Snackbar;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zvideoutil.ZAbstractBase;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.HashMap;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23160o0;
import me0.AbstractC23217t2;
import me0.C23055e5;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;
import p361nb.C23648e;
import p363nh.C23744a;
import p492rr.C25959b;
import p492rr.C25973p;
import p716zh.C32002l4;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;
import t00.C26446c;

/* loaded from: classes6.dex */
public class SettingPrivateView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: A1 */
    View f67883A1;

    /* renamed from: B1 */
    View f67884B1;

    /* renamed from: C1 */
    View f67885C1;

    /* renamed from: D1 */
    View f67886D1;

    /* renamed from: E1 */
    View f67887E1;

    /* renamed from: F1 */
    TextView f67888F1;

    /* renamed from: G1 */
    TextView f67889G1;

    /* renamed from: H1 */
    TextView f67890H1;

    /* renamed from: I1 */
    TextView f67891I1;

    /* renamed from: J1 */
    TextView f67892J1;

    /* renamed from: K1 */
    TextView f67893K1;

    /* renamed from: L1 */
    View f67894L1;

    /* renamed from: M1 */
    View f67895M1;

    /* renamed from: N1 */
    View f67896N1;

    /* renamed from: O1 */
    LinearLayout f67897O1;

    /* renamed from: P0 */
    String[] f67898P0;

    /* renamed from: P1 */
    ScrollViewVisibleChildViewDetector f67899P1;

    /* renamed from: Q0 */
    String[] f67900Q0;

    /* renamed from: Q1 */
    HightLightSettingView f67901Q1;

    /* renamed from: R0 */
    int f67902R0;

    /* renamed from: S0 */
    int f67904S0;

    /* renamed from: T0 */
    int f67906T0;

    /* renamed from: U0 */
    LinearLayout f67908U0;

    /* renamed from: U1 */
    int f67909U1;

    /* renamed from: V0 */
    LinearLayout f67910V0;

    /* renamed from: V1 */
    int f67911V1;

    /* renamed from: W0 */
    LinearLayout f67912W0;

    /* renamed from: W1 */
    int f67913W1;

    /* renamed from: X0 */
    LinearLayout f67914X0;

    /* renamed from: X1 */
    int f67915X1;

    /* renamed from: Y0 */
    LinearLayout f67916Y0;

    /* renamed from: Z0 */
    LinearLayout f67918Z0;

    /* renamed from: a1 */
    LinearLayout f67920a1;

    /* renamed from: b1 */
    LinearLayout f67922b1;

    /* renamed from: c1 */
    LinearLayout f67924c1;

    /* renamed from: d1 */
    LinearLayout f67926d1;

    /* renamed from: e1 */
    LinearLayout f67928e1;

    /* renamed from: f1 */
    LinearLayout f67930f1;

    /* renamed from: g1 */
    LinearLayout f67932g1;

    /* renamed from: h1 */
    LinearLayout f67934h1;

    /* renamed from: i1 */
    LinearLayout f67936i1;

    /* renamed from: j1 */
    LinearLayout f67938j1;

    /* renamed from: k1 */
    LinearLayout f67939k1;

    /* renamed from: l1 */
    LinearLayout f67940l1;

    /* renamed from: m1 */
    LinearLayout f67941m1;

    /* renamed from: n1 */
    LinearLayout f67942n1;

    /* renamed from: o1 */
    LinearLayout f67943o1;

    /* renamed from: p1 */
    TextView f67944p1;

    /* renamed from: q1 */
    StencilSwitch f67945q1;

    /* renamed from: r1 */
    StencilSwitch f67946r1;

    /* renamed from: s1 */
    StencilSwitch f67947s1;

    /* renamed from: t1 */
    StencilSwitch f67948t1;

    /* renamed from: u1 */
    StencilSwitch f67949u1;

    /* renamed from: v1 */
    StencilSwitch f67950v1;

    /* renamed from: w1 */
    StencilSwitch f67951w1;

    /* renamed from: x1 */
    StencilSwitch f67952x1;

    /* renamed from: y1 */
    StencilSwitch f67953y1;

    /* renamed from: z1 */
    TextView f67954z1;

    /* renamed from: R1 */
    int f67903R1 = -1;

    /* renamed from: S1 */
    int f67905S1 = 0;

    /* renamed from: T1 */
    final sh0 f67907T1 = new sh0();

    /* renamed from: Y1 */
    boolean f67917Y1 = false;

    /* renamed from: Z1 */
    InterfaceC0765j f67919Z1 = new C0766k();

    /* renamed from: a2 */
    InterfaceC20094a f67921a2 = new C13170b();

    /* renamed from: b2 */
    boolean f67923b2 = false;

    /* renamed from: c2 */
    InterfaceC0765j f67925c2 = new C0766k();

    /* renamed from: d2 */
    InterfaceC20094a f67927d2 = new C13171c();

    /* renamed from: e2 */
    private View.OnClickListener f67929e2 = new View.OnClickListener() { // from class: la0.g5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            SettingPrivateView.this.m74104vM(view);
        }
    };

    /* renamed from: f2 */
    boolean f67931f2 = false;

    /* renamed from: g2 */
    private final InterfaceC0765j f67933g2 = new C0766k();

    /* renamed from: h2 */
    private final InterfaceC20094a f67935h2 = new C13172d();

    /* renamed from: i2 */
    int f67937i2 = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingPrivateView$a */
    /* loaded from: classes6.dex */
    public class RunnableC13169a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f67955p;

        RunnableC13169a(View view) {
            this.f67955p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingPrivateView.this.f67907T1.m87411l(this.f67955p, this)) {
                    return;
                }
                SettingPrivateView settingPrivateView = SettingPrivateView.this;
                int i11 = settingPrivateView.f67903R1;
                if (i11 != 49) {
                    if (i11 != 89) {
                        if (i11 != 108) {
                            if (i11 != 115) {
                                if (i11 != 136) {
                                    switch (i11) {
                                        case 5:
                                            linearLayout = settingPrivateView.f67916Y0;
                                            break;
                                        case 6:
                                            linearLayout = settingPrivateView.f67918Z0;
                                            break;
                                        case 7:
                                            linearLayout = settingPrivateView.f67920a1;
                                            break;
                                        case 8:
                                            linearLayout = settingPrivateView.f67922b1;
                                            break;
                                        case 9:
                                            linearLayout = settingPrivateView.f67934h1;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 23:
                                                    linearLayout = settingPrivateView.f67914X0;
                                                    break;
                                                case 24:
                                                    linearLayout = settingPrivateView.f67910V0;
                                                    break;
                                                case 25:
                                                    linearLayout = settingPrivateView.f67938j1;
                                                    break;
                                                default:
                                                    switch (i11) {
                                                        case 117:
                                                            if (settingPrivateView.f67926d1.getVisibility() == 0) {
                                                                linearLayout = SettingPrivateView.this.f67926d1;
                                                                break;
                                                            }
                                                            linearLayout = null;
                                                            break;
                                                        case 118:
                                                            if (settingPrivateView.f67928e1.getVisibility() == 0) {
                                                                linearLayout = SettingPrivateView.this.f67928e1;
                                                                break;
                                                            }
                                                            linearLayout = null;
                                                            break;
                                                        case 119:
                                                            if (settingPrivateView.f67930f1.getVisibility() == 0) {
                                                                linearLayout = SettingPrivateView.this.f67930f1;
                                                                break;
                                                            }
                                                            linearLayout = null;
                                                            break;
                                                        case 120:
                                                            linearLayout = settingPrivateView.f67942n1;
                                                            break;
                                                        default:
                                                            linearLayout = null;
                                                            break;
                                                    }
                                            }
                                    }
                                } else {
                                    linearLayout = settingPrivateView.f67943o1;
                                }
                            } else {
                                linearLayout = settingPrivateView.f67924c1;
                            }
                        } else {
                            linearLayout = settingPrivateView.f67908U0;
                        }
                    } else {
                        linearLayout = settingPrivateView.f67939k1;
                    }
                } else {
                    linearLayout = settingPrivateView.f67912W0;
                }
                SettingPrivateView settingPrivateView2 = SettingPrivateView.this;
                settingPrivateView2.f67907T1.m87409j(linearLayout, settingPrivateView2.f67901Q1, settingPrivateView2.f67905S1);
                SettingPrivateView.this.m74087MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingPrivateView$b */
    /* loaded from: classes6.dex */
    public class C13170b implements InterfaceC20094a {
        C13170b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74122d() {
            try {
                SettingPrivateView settingPrivateView = SettingPrivateView.this;
                AbstractC23148n.m118850x(settingPrivateView.f67913W1, settingPrivateView.f67915X1);
                SettingPrivateView.this.m74110HM();
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
                    SettingPrivateView.this.m74111IM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingPrivateView settingPrivateView = SettingPrivateView.this;
                settingPrivateView.f67917Y1 = false;
                settingPrivateView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingPrivateView settingPrivateView2 = SettingPrivateView.this;
                settingPrivateView2.f67917Y1 = false;
                settingPrivateView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingPrivateView.this.f72421L0.m92676n2() != null) {
                        SettingPrivateView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.g0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingPrivateView.C13170b.this.m74122d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingPrivateView settingPrivateView = SettingPrivateView.this;
                settingPrivateView.f67917Y1 = false;
                settingPrivateView.f72421L0.mo78960q3();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.SettingPrivateView$c */
    /* loaded from: classes6.dex */
    public class C13171c implements InterfaceC20094a {
        C13171c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m74124d() {
            try {
                SettingPrivateView.this.m74113JM();
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
                    SettingPrivateView.this.m74114KM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingPrivateView settingPrivateView = SettingPrivateView.this;
                settingPrivateView.f67923b2 = false;
                settingPrivateView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingPrivateView settingPrivateView2 = SettingPrivateView.this;
                settingPrivateView2.f67923b2 = false;
                settingPrivateView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    SettingPrivateView settingPrivateView = SettingPrivateView.this;
                    AbstractC23148n.m118848v(settingPrivateView.f67909U1, settingPrivateView.f67911V1);
                    if (SettingPrivateView.this.f67909U1 == 27) {
                        C21927m.m114302u().m114336h0();
                        AbstractC23309i.m121282Or(0L);
                    }
                    if (SettingPrivateView.this.f72421L0.m92676n2() != null) {
                        SettingPrivateView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.h0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingPrivateView.C13171c.this.m74124d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingPrivateView settingPrivateView2 = SettingPrivateView.this;
                settingPrivateView2.f67923b2 = false;
                settingPrivateView2.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingPrivateView settingPrivateView3 = SettingPrivateView.this;
                settingPrivateView3.f67923b2 = false;
                settingPrivateView3.f72421L0.mo78960q3();
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.SettingPrivateView$d */
    /* loaded from: classes6.dex */
    class C13172d implements InterfaceC20094a {
        C13172d() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingPrivateView settingPrivateView = SettingPrivateView.this;
            settingPrivateView.f67931f2 = false;
            settingPrivateView.m74114KM();
            SettingPrivateView.this.m74111IM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingPrivateView.this.f67931f2 = false;
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
            SettingPrivateView.this.m74114KM();
            SettingPrivateView.this.m74111IM();
            C3080a0.f13112a.m15414e(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: AM */
    public static /* synthetic */ boolean m74080AM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(AbstractC23136l9.m118665N(view.getContext(), ((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: BM */
    public /* synthetic */ void m74081BM(int i11, int i12) {
        if (i11 == 2) {
            m74119o3(21, i12);
        } else if (i11 == 3) {
            m74119o3(22, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CM */
    public /* synthetic */ void m74082CM(int i11, final int i12, InterfaceC17463d interfaceC17463d, final int i13) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f72421L0.m92676n2() != null && i11 != i13) {
            if (i12 == 2) {
                this.f67904S0 = i13;
            } else if (i12 == 3) {
                this.f67906T0 = i13;
            }
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: la0.f5
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivateView.this.m74081BM(i12, i13);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public static /* synthetic */ void m74083DM(KeyEventCallbackC17462c keyEventCallbackC17462c, InterfaceC17463d interfaceC17463d) {
        int identifier;
        try {
            if (AbstractC23309i.m122089kb() == 0 && (identifier = Resources.getSystem().getIdentifier("alertTitle", "id", "android")) > 0) {
                View m92864h = keyEventCallbackC17462c.m92864h(identifier);
                if (m92864h instanceof TextView) {
                    ((TextView) m92864h).setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 5));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingPrivateView", e11);
        }
    }

    /* renamed from: EM */
    private void m74084EM() {
        C0815e1.m2075D().m2100V(new C23648e(26, "", 0, "social_visibletime_setting", new String[0]), false);
    }

    /* renamed from: FM */
    private void m74085FM() {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 7);
        bundle.putString("extra_entry_point_flow", C32002l4.m154264g(6).m154277l());
        this.f72421L0.m92676n2().mo35579p().m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, 1001, 1, true);
    }

    /* renamed from: LM */
    private void m74086LM() {
        TextView textView = this.f67891I1;
        if (textView != null) {
            textView.setText(C3080a0.f13112a.m15416g());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m74087MA() {
        this.f67903R1 = -1;
        this.f67905S1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: NM */
    private void m74088NM() {
        int m2893A1 = AbstractC0924m0.m2893A1();
        String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_zalo);
        if (m2893A1 != 0) {
            if (m2893A1 == 1) {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_zalo);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_jump_link_open_with_web);
        }
        this.f67944p1.setText(m118743r0);
    }

    /* renamed from: Vp */
    private void m74089Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f67903R1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f67905S1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public void m74101rM() {
        try {
            AbstractC26084s.m134251H(this.f67916Y0, 5);
            AbstractC26084s.m134251H(this.f67918Z0, 6);
            AbstractC26084s.m134251H(this.f67920a1, 7);
            AbstractC26084s.m134251H(this.f67922b1, 8);
            AbstractC26084s.m134251H(this.f67934h1, 9);
            AbstractC26084s.m134251H(this.f67914X0, 23);
            AbstractC26084s.m134251H(this.f67910V0, 24);
            AbstractC26084s.m134251H(this.f67938j1, 25);
            AbstractC26084s.m134251H(this.f67912W0, 49);
            AbstractC26084s.m134251H(this.f67939k1, 89);
            AbstractC26084s.m134251H(this.f67908U0, 108);
            AbstractC26084s.m134251H(this.f67926d1, 117);
            AbstractC26084s.m134251H(this.f67928e1, 118);
            AbstractC26084s.m134251H(this.f67930f1, 119);
            AbstractC26084s.m134251H(this.f67942n1, 120);
            AbstractC26084s.m134251H(this.f67943o1, 136);
            this.f67907T1.m87405e(this, 37);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingPrivateView", e11);
        }
    }

    /* renamed from: sM */
    private void m74102sM(View view) {
        if (this.f67903R1 >= 0) {
            view.postDelayed(new RunnableC13169a(view), 300L);
        }
    }

    /* renamed from: tM */
    private void m74103tM(Intent intent) {
        if (intent != null && intent.hasExtra("is_update_limit_feed_success")) {
            boolean booleanExtra = intent.getBooleanExtra("is_update_limit_feed_success", false);
            if (booleanExtra) {
                m74116OM();
                C3006m1 c3006m1 = new C3006m1();
                C25959b c25959b = C25959b.f123885a;
                c3006m1.m14416g(c25959b.m133733b());
                c3006m1.m14415f(c25959b.m133732a());
                C25973p.f123927a.m133796i(c3006m1);
                C23744a.m124114c().m124116d(6022, new Object[0]);
            }
            Snackbar m133792e = C25973p.f123927a.m133792e(this.f67897O1, this.f67929e2, booleanExtra);
            if (m133792e != null) {
                View m88025i = m133792e.m88025i();
                if (m88025i.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) m88025i.getLayoutParams();
                    layoutParams.setMargins(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(12.0f));
                    m88025i.setLayoutParams(layoutParams);
                }
                m133792e.m88019B();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: vM */
    public /* synthetic */ void m74104vM(View view) {
        m74085FM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public static /* synthetic */ boolean m74105wM(View view, Object obj, String str) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(AbstractC23136l9.m118665N(view.getContext(), ((Integer) obj).intValue()));
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m74106xM(int i11) {
        if (this.f67902R0 != i11) {
            this.f67902R0 = i11;
            m74112Ie(7, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public /* synthetic */ void m74107yM(InterfaceC17463d interfaceC17463d, final int i11) {
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: la0.e5
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivateView.this.m74106xM(i11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zM */
    public static /* synthetic */ void m74108zM(KeyEventCallbackC17462c keyEventCallbackC17462c, InterfaceC17463d interfaceC17463d) {
        int identifier;
        try {
            if (AbstractC23309i.m122089kb() == 0 && (identifier = Resources.getSystem().getIdentifier("alertTitle", "id", "android")) > 0) {
                View m92864h = keyEventCallbackC17462c.m92864h(identifier);
                if (m92864h instanceof TextView) {
                    ((TextView) m92864h).setTypeface(C13718q1.m76694c(MainApplication.getAppContext(), 5));
                }
            }
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingPrivateView", e11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m74089Vp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        int i12;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                return m74109GM(i11, this.f67906T0);
            }
            return m74109GM(i11, this.f67904S0);
        }
        int length = this.f67898P0.length;
        int i13 = this.f67902R0;
        if (i13 < 0 || i13 > length - 1) {
            this.f67902R0 = 0;
        }
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != this.f67902R0) {
                i12 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i12 = AbstractC16803z.btn_radio_on_holo_light;
            }
            iArr[i14] = i12;
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f67898P0[i14]);
            hashMap.put("icon", Integer.valueOf(iArr[i14]));
            arrayList.add(hashMap);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
        simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: la0.h5
            @Override // android.widget.SimpleAdapter.ViewBinder
            public final boolean setViewValue(View view, Object obj, String str) {
                boolean m74105wM;
                m74105wM = SettingPrivateView.m74105wM(view, obj, str);
                return m74105wM;
            }
        });
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_allowViewDoB));
        aVar.m43173v(1000);
        aVar.m43155d(true);
        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: la0.i5
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                SettingPrivateView.this.m74107yM(interfaceC17463d, i15);
            }
        });
        final C8009j m43152a = aVar.m43152a();
        m43152a.mo88280H(new InterfaceC17463d.g() { // from class: la0.j5
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
            /* renamed from: a */
            public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                SettingPrivateView.m74108zM(KeyEventCallbackC17462c.this, interfaceC17463d);
            }
        });
        return m43152a;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.settings_private_view, viewGroup, false);
        m74120uM(inflate);
        return inflate;
    }

    /* renamed from: GM */
    KeyEventCallbackC17462c m74109GM(final int i11, final int i12) {
        int i13;
        int length = this.f67900Q0.length;
        if (i12 < 0 || i12 > length - 1) {
            i12 = 0;
        }
        int[] iArr = new int[length];
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < length; i14++) {
            if (i14 != i12) {
                i13 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i13 = AbstractC16803z.btn_radio_on_holo_light;
            }
            iArr[i14] = i13;
            HashMap hashMap = new HashMap();
            hashMap.put("name", this.f67900Q0[i14]);
            hashMap.put("icon", Integer.valueOf(iArr[i14]));
            arrayList.add(hashMap);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(this.f72421L0.m92648SI(), arrayList, AbstractC7409c0.active_passcode_time_menu_item, new String[]{"name", "icon"}, new int[]{AbstractC6918a0.tv_active_time_passcode, AbstractC6918a0.ic_choose_or_not});
        simpleAdapter.setViewBinder(new SimpleAdapter.ViewBinder() { // from class: la0.l5
            @Override // android.widget.SimpleAdapter.ViewBinder
            public final boolean setViewValue(View view, Object obj, String str) {
                boolean m74080AM;
                m74080AM = SettingPrivateView.m74080AM(view, obj, str);
                return m74080AM;
            }
        });
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        if (i11 == 2) {
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_allowViewEmail));
        } else if (i11 == 3) {
            aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_allowViewUserDetails));
        }
        aVar.m43173v(1000);
        aVar.m43155d(true);
        aVar.m43153b(simpleAdapter, new InterfaceC17463d.d() { // from class: la0.m5
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i15) {
                SettingPrivateView.this.m74082CM(i12, i11, interfaceC17463d, i15);
            }
        });
        final C8009j m43152a = aVar.m43152a();
        m43152a.mo88280H(new InterfaceC17463d.g() { // from class: la0.n5
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.g
            /* renamed from: a */
            public final void mo12456a(InterfaceC17463d interfaceC17463d) {
                SettingPrivateView.m74083DM(KeyEventCallbackC17462c.this, interfaceC17463d);
            }
        });
        return m43152a;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f67907T1.m87408i());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: HM */
    public void m74110HM() {
        this.f67904S0 = AbstractC23309i.m120747Aa();
        this.f67906T0 = AbstractC23309i.m120858Da();
        this.f67889G1.setText(this.f67900Q0[this.f67904S0]);
        this.f67890H1.setText(this.f67900Q0[this.f67906T0]);
    }

    /* renamed from: IM */
    void m74111IM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.e0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivateView.this.m74110HM();
                }
            });
        }
    }

    /* renamed from: Ie */
    void m74112Ie(int i11, int i12) {
        try {
            if (this.f67923b2) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67909U1 = i11;
                this.f67911V1 = i12;
                this.f67923b2 = true;
                this.f67925c2.mo1704o8(this.f67927d2);
                this.f67925c2.mo1545U3(i11, i12, "");
            } else {
                this.f67923b2 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m74113JM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: JM */
    public void m74113JM() {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i11;
        try {
            boolean m122313qa = AbstractC23309i.m122313qa();
            this.f67950v1.setChecked(m122313qa);
            this.f67952x1.setChecked(AbstractC23309i.m121308Pg());
            this.f67945q1.setChecked(AbstractC23309i.m121490Ud());
            StencilSwitch stencilSwitch = this.f67946r1;
            int i12 = 0;
            boolean z15 = true;
            if (AbstractC23309i.m122609ya() == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            stencilSwitch.setChecked(z11);
            this.f67953y1.setChecked(AbstractC0924m0.m3776ea());
            StencilSwitch stencilSwitch2 = this.f67948t1;
            if (AbstractC23309i.m120784Ba() == 1) {
                z12 = true;
            } else {
                z12 = false;
            }
            stencilSwitch2.setChecked(z12);
            StencilSwitch stencilSwitch3 = this.f67947s1;
            if (AbstractC23309i.m122350ra() == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            stencilSwitch3.setChecked(z13);
            this.f67949u1.setChecked(AbstractC23309i.m120821Ca());
            this.f67951w1.setChecked(C3080a0.f13112a.m15417j());
            if (AbstractC23304d.f113263C1) {
                m74086LM();
            }
            int m122646za = AbstractC23309i.m122646za();
            this.f67902R0 = m122646za;
            this.f67888F1.setText(this.f67898P0[m122646za]);
            m74116OM();
            if (AbstractC23309i.m121256O1() == 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (C26446c.m136326b().m136330e() && (!z14 || m122313qa)) {
                this.f67939k1.setVisibility(0);
                this.f67883A1.setVisibility(0);
                m74115MM();
            } else {
                this.f67939k1.setVisibility(8);
                this.f67883A1.setVisibility(8);
            }
            if (AbstractC23309i.m122194n3() != 1) {
                z15 = false;
            }
            LinearLayout linearLayout = this.f67908U0;
            if (linearLayout != null) {
                if (z15) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                linearLayout.setVisibility(i11);
            }
            View view = this.f67884B1;
            if (view != null) {
                if (!z15) {
                    i12 = 8;
                }
                view.setVisibility(i12);
            }
            m74088NM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: KM */
    void m74114KM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.settings.f0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivateView.this.m74113JM();
                }
            });
        }
    }

    /* renamed from: MM */
    void m74115MM() {
        int i11;
        LinearLayout linearLayout = this.f67939k1;
        if (linearLayout != null && linearLayout.getVisibility() == 0) {
            if (!AbstractC23034c6.m118116D(MainApplication.getAppContext(), AbstractC23034c6.f112032i)) {
                i11 = AbstractC8020f0.str_setting_no_permission_view_social;
            } else if (AbstractC23309i.m122276pa() == 1) {
                i11 = AbstractC8020f0.str_des_setting_allow_view_social;
            } else {
                i11 = AbstractC8020f0.str_setting_dont_allow_view_social;
            }
            this.f67954z1.setText(i11);
        }
    }

    /* renamed from: OM */
    void m74116OM() {
        String m118743r0;
        C25959b c25959b = C25959b.f123885a;
        c25959b.m133735e();
        int m133733b = c25959b.m133733b();
        long m133732a = c25959b.m133732a();
        int m133790b = C25973p.f123927a.m133790b(m133733b, m133732a);
        if (m133790b != 1) {
            if (m133790b != 2) {
                if (m133790b != 3) {
                    if (m133790b != 4) {
                        if (m133790b != 5) {
                            m118743r0 = "";
                        } else {
                            m118743r0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_limit_feed_visible_option_custom_desc_allow, AbstractC23160o0.m119288s0(m133732a));
                        }
                    } else {
                        m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_6_months);
                    }
                } else {
                    m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_1_month);
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_7_days);
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_limit_feed_visible_option_allow_all);
        }
        this.f67893K1.setText(m118743r0);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: PJ */
    public void mo39032PJ() {
        super.mo39032PJ();
        try {
            m74089Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m74102sM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: PM */
    void m74117PM() {
        int i11;
        if (AbstractC0924m0.m4075o9()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f67894L1.setVisibility(i11);
        this.f67926d1.setVisibility(i11);
        this.f67895M1.setVisibility(i11);
        this.f67928e1.setVisibility(i11);
        this.f67896N1.setVisibility(i11);
        this.f67930f1.setVisibility(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f67907T1.m87414t();
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m74101rM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f67899P1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: Vx */
    void m74118Vx() {
        if (this.f67931f2) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f67931f2 = true;
            this.f67933g2.mo1704o8(this.f67935h2);
            this.f67933g2.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f67931f2 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m74114KM();
        m74111IM();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_already_seen) {
            return 5;
        }
        if (i11 == AbstractC6918a0.ll_allow_comment) {
            return 6;
        }
        if (i11 == AbstractC6918a0.ll_allow_view_photo) {
            return 7;
        }
        if (i11 == AbstractC6918a0.ll_allow_view_timeline) {
            return 8;
        }
        if (i11 == AbstractC6918a0.ll_limit_visible_feed) {
            return 115;
        }
        if (i11 == AbstractC6918a0.ll_timeline_blocked_list) {
            return 117;
        }
        if (i11 == AbstractC6918a0.ll_timeline_hided_list) {
            return 118;
        }
        if (i11 == AbstractC6918a0.ll_story_blocked_list) {
            return 119;
        }
        if (i11 == AbstractC6918a0.ll_allow_view_dob) {
            return 9;
        }
        if (i11 == AbstractC6918a0.ll_receive_messsage) {
            return 23;
        }
        if (i11 == AbstractC6918a0.ll_auto_add_friend) {
            return 24;
        }
        if (i11 == AbstractC6918a0.ll_get_friend_request) {
            return 49;
        }
        if (i11 == AbstractC6918a0.ll_allow_incomming_calls || i11 == AbstractC6918a0.layout_allow_incomming_calls) {
            return 25;
        }
        if (i11 == AbstractC6918a0.ll_alow_view_social_title) {
            return 89;
        }
        if (i11 == AbstractC6918a0.ll_show_online_status) {
            return 108;
        }
        if (i11 == AbstractC6918a0.ll_show_scan_qr_status) {
            return 120;
        }
        return i11 == AbstractC6918a0.ll_show_jump_link_setting ? 136 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "PrivacySettingView";
    }

    /* renamed from: o3 */
    void m74119o3(int i11, int i12) {
        try {
            if (this.f67917Y1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f67913W1 = i11;
                this.f67915X1 = i12;
                this.f67917Y1 = true;
                this.f67919Z1.mo1704o8(this.f67921a2);
                this.f67919Z1.mo1699o3(i11, i12);
            } else {
                this.f67917Y1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m74110HM();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        switch (i11) {
            case 1000:
                m74115MM();
                return;
            case 1001:
                if (i12 == -1 && intent != null) {
                    m74103tM(intent);
                    return;
                }
                return;
            case ZAbstractBase.ZVU_BLEND_PERCENTAGE /* 1002 */:
                m74086LM();
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i11;
        String str;
        try {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.ll_show_online_status && id2 != AbstractC6918a0.sw_show_online_status) {
                if (id2 == AbstractC6918a0.ll_alow_view_social_title) {
                    this.f72421L0.m92662fJ().m93066i2(SettingAllowViewSocialView.class, null, 1000, 1, true);
                    AbstractC26084s.m134269q(0, 89);
                    C0815e1.m2079N(89, 1, 0, 0, 0);
                } else {
                    if (id2 != AbstractC6918a0.ll_auto_add_friend && id2 != AbstractC6918a0.sw_auto_add_friend) {
                        if (id2 == AbstractC6918a0.ll_get_friend_request) {
                            AbstractC26084s.m134269q(0, 49);
                            Bundle bundle = new Bundle();
                            bundle.putInt("EXTRA_INT_SOURCE_VIEW", 31);
                            this.f72421L0.m92662fJ().m93069k2(SettingFriendRequestView.class, bundle, 1, true);
                            AbstractC23647d.m123897g("5901189");
                            C0815e1.m2079N(49, 1, 0, 0, 0);
                        } else {
                            if (id2 != AbstractC6918a0.ll_already_seen && id2 != AbstractC6918a0.sw_already_seen) {
                                int i12 = 2;
                                if (id2 != AbstractC6918a0.ll_receive_messsage && id2 != AbstractC6918a0.sw_receive_messsage) {
                                    if (id2 != AbstractC6918a0.ll_allow_comment && id2 != AbstractC6918a0.sw_allow_comment) {
                                        if (id2 != AbstractC6918a0.ll_allow_view_photo && id2 != AbstractC6918a0.sw_allow_view_photo) {
                                            if (id2 != AbstractC6918a0.ll_allow_view_timeline && id2 != AbstractC6918a0.sw_allow_view_timeline) {
                                                if (id2 == AbstractC6918a0.ll_allow_view_dob) {
                                                    this.f72421L0.showDialog(1);
                                                    AbstractC26084s.m134269q(0, 9);
                                                    C0815e1.m2079N(9, 1, 0, 0, 0);
                                                } else if (id2 == AbstractC6918a0.ll_allow_view_email) {
                                                    this.f72421L0.showDialog(2);
                                                } else if (id2 == AbstractC6918a0.ll_allow_view_user_details) {
                                                    this.f72421L0.showDialog(3);
                                                } else {
                                                    if (id2 != AbstractC6918a0.ll_allow_incomming_calls && id2 != AbstractC6918a0.sw_allow_incomming_calls) {
                                                        if (id2 == AbstractC6918a0.ll_limit_visible_feed) {
                                                            m74084EM();
                                                            m74085FM();
                                                        } else if (id2 == AbstractC6918a0.ll_timeline_blocked_list) {
                                                            AbstractC26084s.m134269q(0, 117);
                                                            C0815e1.m2079N(117, 1, 0, 0, 0);
                                                            Bundle bundle2 = new Bundle();
                                                            bundle2.putInt("int_extra_source_open", 2);
                                                            m92662fJ().m93069k2(BlackListView.class, bundle2, 1, true);
                                                        } else if (id2 == AbstractC6918a0.ll_timeline_hided_list) {
                                                            AbstractC26084s.m134269q(0, 118);
                                                            C0815e1.m2079N(118, 1, 0, 0, 0);
                                                            Bundle bundle3 = new Bundle();
                                                            bundle3.putInt("int_extra_source_open", 2);
                                                            m92662fJ().m93069k2(HiddenListView.class, bundle3, 1, true);
                                                        } else if (id2 == AbstractC6918a0.ll_story_blocked_list) {
                                                            AbstractC26084s.m134269q(0, 119);
                                                            C0815e1.m2079N(119, 1, 0, 0, 0);
                                                            Bundle bundle4 = new Bundle();
                                                            bundle4.putInt("int_extra_source_open", 2);
                                                            m92662fJ().m93069k2(StoryBlockedListView.class, bundle4, 1, true);
                                                        } else {
                                                            if (id2 != AbstractC6918a0.ll_show_scan_qr_status && id2 != AbstractC6918a0.sw_show_scan_qr_status) {
                                                                if (id2 == AbstractC6918a0.ll_show_jump_link_setting && m92662fJ() != null) {
                                                                    C0815e1.m2079N(136, 1, 0, 0, 0);
                                                                    AbstractC26084s.m134269q(0, 136);
                                                                    m92662fJ().m93069k2(JumpLinkListSettingView.class, null, 1, true);
                                                                    C2526d.f10270a.m12723o0("setting_privacy", "0");
                                                                }
                                                            }
                                                            boolean isChecked = this.f67953y1.isChecked();
                                                            this.f67953y1.setChecked(!isChecked);
                                                            AbstractC26084s.m134269q(0, 120);
                                                            AbstractC0924m0.m3604Yg(!isChecked);
                                                        }
                                                    }
                                                    if (AbstractC23304d.f113263C1) {
                                                        Bundle bundle5 = new Bundle();
                                                        bundle5.putString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "setting_privacy");
                                                        this.f72421L0.m92662fJ().m93066i2(SettingCallFromStrangerView.class, bundle5, ZAbstractBase.ZVU_BLEND_PERCENTAGE, 1, true);
                                                    } else {
                                                        this.f67951w1.setChecked(!r11.isChecked());
                                                        AbstractC26084s.m134269q(0, 25);
                                                        m74112Ie(25, this.f67951w1.isChecked() ? 1 : 0);
                                                        if (this.f67951w1.isChecked()) {
                                                            str = "37026";
                                                        } else {
                                                            str = "37025";
                                                        }
                                                        AbstractC23647d.m123906p(str);
                                                        AbstractC23647d.m123893c();
                                                        C0815e1.m2079N(25, 1, 0, 0, 0);
                                                    }
                                                }
                                            }
                                            this.f67949u1.setChecked(!r11.isChecked());
                                            AbstractC26084s.m134269q(0, 8);
                                            m74112Ie(21, this.f67949u1.isChecked() ? 1 : 0);
                                            C0815e1.m2079N(8, 1, 0, 0, 0);
                                        }
                                        this.f67948t1.setChecked(!r11.isChecked());
                                        AbstractC26084s.m134269q(0, 7);
                                        if (this.f67948t1.isChecked()) {
                                            i11 = 1;
                                        } else {
                                            i11 = 2;
                                        }
                                        m74112Ie(2, i11);
                                        C0815e1.m2079N(7, 1, 0, 0, 0);
                                    }
                                    this.f67947s1.setChecked(!r11.isChecked());
                                    AbstractC26084s.m134269q(0, 6);
                                    if (this.f67947s1.isChecked()) {
                                        i12 = 1;
                                    }
                                    m74112Ie(4, i12);
                                    C0815e1.m2079N(6, 1, 0, 0, 0);
                                }
                                this.f67946r1.setChecked(!r11.isChecked());
                                AbstractC26084s.m134269q(0, 23);
                                if (this.f67946r1.isChecked()) {
                                    i12 = 1;
                                }
                                m74112Ie(1, i12);
                                C0815e1.m2079N(23, 1, 0, 0, 0);
                            }
                            this.f67945q1.setChecked(!r11.isChecked());
                            AbstractC26084s.m134269q(0, 5);
                            m74112Ie(11, this.f67945q1.isChecked() ? 1 : 0);
                            C0815e1.m2079N(5, 1, 0, 0, 0);
                        }
                    }
                    this.f67950v1.setChecked(!r11.isChecked());
                    AbstractC26084s.m134269q(0, 24);
                    m74112Ie(23, this.f67950v1.isChecked() ? 1 : 0);
                    C0815e1.m2079N(24, 1, 0, 0, 0);
                }
            }
            this.f67952x1.setChecked(!r11.isChecked());
            AbstractC26084s.m134269q(0, 108);
            m74112Ie(27, this.f67952x1.isChecked() ? 1 : 0);
            C0815e1.m2079N(108, 1, 0, 0, 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f67907T1.m87413s();
        m74088NM();
    }

    /* renamed from: uM */
    void m74120uM(View view) {
        int i11;
        int i12;
        try {
            this.f67897O1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_swipeable_view);
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f67899P1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f67901Q1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f67907T1.m87415u(this.f67899P1);
            this.f67908U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_show_online_status);
            this.f67884B1 = view.findViewById(AbstractC6918a0.sep_ll_show_online_status);
            this.f67910V0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_auto_add_friend);
            this.f67912W0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_get_friend_request);
            this.f67916Y0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_already_seen);
            this.f67914X0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_receive_messsage);
            this.f67918Z0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_comment);
            this.f67920a1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_view_photo);
            this.f67922b1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_view_timeline);
            this.f67924c1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_limit_visible_feed);
            this.f67926d1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_timeline_blocked_list);
            this.f67928e1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_timeline_hided_list);
            this.f67930f1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_story_blocked_list);
            this.f67894L1 = view.findViewById(AbstractC6918a0.v_separate_line_timeline_blocked_list);
            this.f67895M1 = view.findViewById(AbstractC6918a0.v_separate_line_timeline_hided_list);
            this.f67896N1 = view.findViewById(AbstractC6918a0.v_separate_line_story_blocked_list);
            this.f67932g1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_share_story);
            this.f67934h1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_view_dob);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_view_email);
            this.f67940l1 = linearLayout;
            int i13 = 8;
            AbstractC23136l9.m118744r1(linearLayout, 8);
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_view_user_details);
            this.f67941m1 = linearLayout2;
            AbstractC23136l9.m118744r1(linearLayout2, 8);
            this.f67936i1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_show_status);
            this.f67938j1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow_incomming_calls);
            this.f67952x1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_show_online_status);
            this.f67950v1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_auto_add_friend);
            this.f67945q1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_already_seen);
            this.f67946r1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_receive_messsage);
            this.f67947s1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_comment);
            this.f67948t1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_view_photo);
            this.f67949u1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_view_timeline);
            this.f67951w1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_allow_incomming_calls);
            this.f67888F1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_view_dob_des);
            this.f67954z1 = (TextView) view.findViewById(AbstractC6918a0.hint_alow_view_social_title);
            this.f67939k1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_alow_view_social_title);
            this.f67883A1 = view.findViewById(AbstractC6918a0.line_allow_view_social);
            this.f67889G1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_view_email_des);
            this.f67890H1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_view_user_details_des);
            this.f67892J1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_incoming_calls);
            this.f67891I1 = (TextView) view.findViewById(AbstractC6918a0.tv_allow_incoming_call_des);
            this.f67893K1 = (TextView) view.findViewById(AbstractC6918a0.tv_limit_visible_feed_des);
            this.f67942n1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_show_scan_qr_status);
            this.f67953y1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_show_scan_qr_status);
            this.f67885C1 = view.findViewById(AbstractC6918a0.line_allow_comment);
            this.f67886D1 = view.findViewById(AbstractC6918a0.line_allow_view_photo);
            this.f67887E1 = view.findViewById(AbstractC6918a0.line_allow_view_timeline);
            this.f67943o1 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_show_jump_link_setting);
            this.f67944p1 = (TextView) view.findViewById(AbstractC6918a0.tv_jum_link_setting_des);
            this.f67908U0.setOnClickListener(this);
            this.f67910V0.setOnClickListener(this);
            this.f67912W0.setOnClickListener(this);
            this.f67916Y0.setOnClickListener(this);
            this.f67914X0.setOnClickListener(this);
            this.f67918Z0.setOnClickListener(this);
            this.f67920a1.setOnClickListener(this);
            this.f67922b1.setOnClickListener(this);
            this.f67932g1.setOnClickListener(this);
            this.f67934h1.setOnClickListener(this);
            this.f67924c1.setOnClickListener(this);
            this.f67926d1.setOnClickListener(this);
            this.f67928e1.setOnClickListener(this);
            this.f67930f1.setOnClickListener(this);
            this.f67940l1.setOnClickListener(this);
            this.f67941m1.setOnClickListener(this);
            this.f67936i1.setOnClickListener(this);
            this.f67938j1.setOnClickListener(this);
            this.f67952x1.setOnClickListener(this);
            this.f67950v1.setOnClickListener(this);
            this.f67945q1.setOnClickListener(this);
            this.f67946r1.setOnClickListener(this);
            this.f67947s1.setOnClickListener(this);
            this.f67948t1.setOnClickListener(this);
            this.f67949u1.setOnClickListener(this);
            this.f67951w1.setOnClickListener(this);
            this.f67939k1.setOnClickListener(this);
            this.f67942n1.setOnClickListener(this);
            this.f67953y1.setOnClickListener(this);
            this.f67943o1.setOnClickListener(this);
            this.f67898P0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_dob_mode);
            this.f67900Q0 = AbstractC23136l9.m118755v0(AbstractC16775v.array_privacy_show_mode);
            if (AbstractC23304d.f113263C1) {
                this.f67951w1.setVisibility(8);
                this.f67892J1.setText(AbstractC8020f0.str_call_who_can_call_you);
                this.f67891I1.setVisibility(0);
            } else {
                this.f67892J1.setText(AbstractC8020f0.str_call_allow_stranger_call_title);
                this.f67891I1.setVisibility(8);
                this.f67951w1.setVisibility(0);
            }
            m74113JM();
            m74110HM();
            m74118Vx();
            boolean z11 = true;
            if (AbstractC23309i.m121256O1() == 1) {
                this.f67910V0.setVisibility(0);
            } else {
                this.f67910V0.setVisibility(8);
                if (C26446c.m136326b().m136330e()) {
                    this.f67939k1.setVisibility(0);
                    this.f67883A1.setVisibility(0);
                    m74115MM();
                } else {
                    this.f67939k1.setVisibility(8);
                    this.f67883A1.setVisibility(8);
                }
            }
            this.f67938j1.setVisibility(0);
            View findViewById = view.findViewById(AbstractC6918a0.divider_auto_add_friend);
            if (AbstractC23309i.m121256O1() == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            findViewById.setVisibility(i11);
            view.findViewById(AbstractC6918a0.layout_allow_incomming_calls).setVisibility(0);
            if (AbstractC0924m0.m4332x0() != 1) {
                z11 = false;
            }
            LinearLayout linearLayout3 = this.f67942n1;
            if (z11) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            linearLayout3.setVisibility(i12);
            View findViewById2 = view.findViewById(AbstractC6918a0.v_separate_line_jump_link_setting);
            if (z11) {
                i13 = 0;
            }
            findViewById2.setVisibility(i13);
            m74117PM();
            m74102sM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: la0.k5
                @Override // java.lang.Runnable
                public final void run() {
                    SettingPrivateView.this.m74101rM();
                }
            });
        }
    }
}
