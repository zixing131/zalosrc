package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.AbstractC0837p0;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.HightLightSettingView;
import com.zing.zalo.p077ui.widget.ScrollView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.SettingFriendRequestView;
import com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import ho0.AbstractC20110a;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.AbstractC23217t2;
import me0.C23055e5;
import me0.C23212s8;
import mm0.AbstractC23350e;
import org.json.JSONObject;
import p262jb.AbstractC21196a;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p363nh.C23744a;
import p588vw.C28647m;
import p588vw.C28655u;
import s00.AbstractC26084s;
import s00.InterfaceC26066a;

/* loaded from: classes6.dex */
public class SettingFriendRequestView extends SlidableZaloView implements View.OnClickListener, C23744a.c, InterfaceC26066a, ScrollViewVisibleChildViewDetector.InterfaceC9358b, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f77444P0;

    /* renamed from: Q0 */
    LinearLayout f77445Q0;

    /* renamed from: R0 */
    LinearLayout f77446R0;

    /* renamed from: S0 */
    LinearLayout f77447S0;

    /* renamed from: T0 */
    LinearLayout f77448T0;

    /* renamed from: U0 */
    LinearLayout f77449U0;

    /* renamed from: V0 */
    StencilSwitch f77450V0;

    /* renamed from: W0 */
    StencilSwitch f77451W0;

    /* renamed from: X0 */
    StencilSwitch f77452X0;

    /* renamed from: Y0 */
    StencilSwitch f77453Y0;

    /* renamed from: Z0 */
    StencilSwitch f77454Z0;

    /* renamed from: a1 */
    StencilSwitch f77455a1;

    /* renamed from: b1 */
    TextView f77456b1;

    /* renamed from: c1 */
    ScrollViewVisibleChildViewDetector f77457c1;

    /* renamed from: d1 */
    HightLightSettingView f77458d1;

    /* renamed from: h1 */
    int f77462h1;

    /* renamed from: l1 */
    int f77466l1;

    /* renamed from: m1 */
    int f77467m1;

    /* renamed from: e1 */
    int f77459e1 = -1;

    /* renamed from: f1 */
    int f77460f1 = 0;

    /* renamed from: g1 */
    final sh0 f77461g1 = new sh0();

    /* renamed from: i1 */
    boolean f77463i1 = false;

    /* renamed from: j1 */
    InterfaceC0765j f77464j1 = new C0766k();

    /* renamed from: k1 */
    InterfaceC20094a f77465k1 = new C15025a();

    /* renamed from: n1 */
    boolean f77468n1 = false;

    /* renamed from: o1 */
    private final InterfaceC0765j f77469o1 = new C0766k();

    /* renamed from: p1 */
    private final InterfaceC20094a f77470p1 = new C15026b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingFriendRequestView$a */
    /* loaded from: classes6.dex */
    public class C15025a implements InterfaceC20094a {
        C15025a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m84103d() {
            try {
                SettingFriendRequestView settingFriendRequestView = SettingFriendRequestView.this;
                AbstractC23148n.m118848v(settingFriendRequestView.f77466l1, settingFriendRequestView.f77467m1);
                SettingFriendRequestView.this.m84100qM();
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
                    SettingFriendRequestView.this.m84101rM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingFriendRequestView settingFriendRequestView = SettingFriendRequestView.this;
                settingFriendRequestView.f77463i1 = false;
                settingFriendRequestView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingFriendRequestView settingFriendRequestView2 = SettingFriendRequestView.this;
                settingFriendRequestView2.f77463i1 = false;
                settingFriendRequestView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    if (SettingFriendRequestView.this.f72421L0.m92676n2() != null) {
                        SettingFriendRequestView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.oh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingFriendRequestView.C15025a.this.m84103d();
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingFriendRequestView settingFriendRequestView = SettingFriendRequestView.this;
                settingFriendRequestView.f77463i1 = false;
                settingFriendRequestView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingFriendRequestView$b */
    /* loaded from: classes6.dex */
    class C15026b implements InterfaceC20094a {
        C15026b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingFriendRequestView settingFriendRequestView = SettingFriendRequestView.this;
            settingFriendRequestView.f77468n1 = false;
            settingFriendRequestView.m84101rM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            SettingFriendRequestView.this.f77468n1 = false;
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
            SettingFriendRequestView.this.m84101rM();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.SettingFriendRequestView$c */
    /* loaded from: classes6.dex */
    public class RunnableC15027c implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f77473p;

        RunnableC15027c(View view) {
            this.f77473p = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            LinearLayout linearLayout;
            try {
                if (SettingFriendRequestView.this.f77461g1.m87411l(this.f77473p, this)) {
                    return;
                }
                SettingFriendRequestView settingFriendRequestView = SettingFriendRequestView.this;
                int i11 = settingFriendRequestView.f77459e1;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    if (i11 != 27) {
                                        linearLayout = null;
                                    } else {
                                        linearLayout = settingFriendRequestView.f77449U0;
                                    }
                                } else {
                                    linearLayout = settingFriendRequestView.f77448T0;
                                }
                            } else {
                                linearLayout = settingFriendRequestView.f77447S0;
                            }
                        } else {
                            linearLayout = settingFriendRequestView.f77446R0;
                        }
                    } else {
                        linearLayout = settingFriendRequestView.f77445Q0;
                    }
                } else {
                    linearLayout = settingFriendRequestView.f77444P0;
                }
                settingFriendRequestView.f77461g1.m87409j(linearLayout, settingFriendRequestView.f77458d1, settingFriendRequestView.f77460f1);
                SettingFriendRequestView.this.m84086MA();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MA */
    public void m84086MA() {
        this.f77459e1 = -1;
        this.f77460f1 = 0;
        AbstractC23217t2.m119650b(this.f72421L0.m92642L3());
    }

    /* renamed from: Vp */
    private void m84087Vp() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f77459e1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_ID", -1);
            this.f77460f1 = m92642L3.getInt("EXTRA_HIGHTLIGHT_SETTING_TYPE", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kM */
    public void m84092kM() {
        try {
            AbstractC26084s.m134251H(this.f77444P0, 0);
            AbstractC26084s.m134251H(this.f77445Q0, 1);
            AbstractC26084s.m134251H(this.f77446R0, 2);
            AbstractC26084s.m134251H(this.f77447S0, 3);
            AbstractC26084s.m134251H(this.f77448T0, 4);
            AbstractC26084s.m134251H(this.f77449U0, 27);
            this.f77461g1.m87405e(this, 49);
        } catch (Exception e11) {
            AbstractC23350e.m122776f("SettingFriendRequestView", e11);
        }
    }

    /* renamed from: lM */
    private void m84093lM() {
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            this.f77462h1 = m92642L3.getInt("EXTRA_INT_SOURCE_VIEW", -1);
        }
    }

    /* renamed from: mM */
    private void m84094mM(View view) {
        if (this.f77459e1 >= 0) {
            view.postDelayed(new RunnableC15027c(view), 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m84095oM(String str) {
        if (this.f77456b1 != null) {
            if (!TextUtils.isEmpty(str)) {
                SpannableString spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_me_phone) + " " + str);
                spannableString.setSpan(new ForegroundColorSpan(C23212s8.m119607o(this.f77456b1.getContext(), AbstractC21196a.TextColor1)), spannableString.length() - str.length(), spannableString.length(), 33);
                this.f77456b1.setText(spannableString);
                return;
            }
            this.f77456b1.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_find_me_phone));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pM */
    public /* synthetic */ void m84096pM() {
        String str;
        String str2;
        ContactProfile contactProfile;
        final String str3 = "";
        try {
            if (TextUtils.isEmpty(AbstractC23304d.f113394i0)) {
                str = "";
            } else {
                str = AbstractC23304d.f113394i0;
            }
            if (TextUtils.isEmpty(str) && (contactProfile = AbstractC23304d.f113368c0) != null && !TextUtils.isEmpty(contactProfile.f42455y)) {
                str = AbstractC23304d.f113368c0.f42455y;
            }
            if (!TextUtils.isEmpty(str)) {
                String m121704a5 = AbstractC23309i.m121704a5();
                if (!TextUtils.isEmpty(m121704a5)) {
                    Iterator it = C28647m.m143325c().m143327a().iterator();
                    while (it.hasNext()) {
                        C28655u c28655u = (C28655u) it.next();
                        if (m121704a5.equalsIgnoreCase(c28655u.f132864b)) {
                            str2 = "+" + c28655u.f132865c;
                            break;
                        }
                    }
                }
                str2 = "";
                str3 = String.format("%s ******%s", str2, str.substring(str.length() - 3));
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.nh0
            @Override // java.lang.Runnable
            public final void run() {
                SettingFriendRequestView.this.m84095oM(str3);
            }
        });
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        m84087Vp();
        m84093lM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_friend_request_view, viewGroup, false);
        m84099nM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.settingreminder.ScrollViewVisibleChildViewDetector.InterfaceC9358b
    /* renamed from: HE */
    public void mo50491HE(ScrollView scrollView, boolean z11) {
        if (z11) {
            AbstractC26084s.m134267o(this.f77461g1.m87408i());
        }
    }

    /* renamed from: Ie */
    void m84097Ie(int i11, int i12) {
        try {
            if (this.f77463i1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f77466l1 = i11;
                this.f77467m1 = i12;
                this.f77463i1 = true;
                this.f77464j1.mo1704o8(this.f77465k1);
                this.f77464j1.mo1545U3(i11, i12, TrackingSource.m40665d(this.f77462h1));
            } else {
                this.f77463i1 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
                m84100qM();
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
            m84087Vp();
            if (this.f72421L0.m92656bJ() != null) {
                m84094mM(this.f72421L0.m92656bJ());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        this.f77461g1.m87414t();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_get_friend_request_title_new));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: UJ */
    public void mo37584UJ() {
        super.mo37584UJ();
        m84092kM();
        AbstractC26084s.m134256d(this);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        super.mo37712VJ();
        AbstractC26084s.m134247D(this);
        ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = this.f77457c1;
        if (scrollViewVisibleChildViewDetector != null) {
            AbstractC26084s.m134268p(1, AbstractC26084s.m134263k(this, scrollViewVisibleChildViewDetector.getArrayChildViewVisible(), m92656bJ()), true);
        }
    }

    /* renamed from: Vx */
    void m84098Vx() {
        if (this.f77468n1) {
            return;
        }
        if (C23055e5.m118271f()) {
            this.f77468n1 = true;
            this.f77469o1.mo1704o8(this.f77470p1);
            this.f77469o1.mo1589Z7(AbstractC23148n.m118835i());
            return;
        }
        this.f77468n1 = false;
        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_getPrivacySettings_fromServer_fail));
        m84101rM();
    }

    @Override // s00.InterfaceC26066a
    /* renamed from: bb */
    public int mo57170bb(int i11) {
        if (i11 == AbstractC6918a0.ll_friend_request_phone_number) {
            return 0;
        }
        if (i11 == AbstractC6918a0.ll_friend_request_username) {
            return 1;
        }
        if (i11 == AbstractC6918a0.ll_friend_request_qrcode) {
            return 2;
        }
        if (i11 == AbstractC6918a0.ll_friend_request_group) {
            return 3;
        }
        if (i11 == AbstractC6918a0.ll_friend_request_contact) {
            return 4;
        }
        return i11 == AbstractC6918a0.ll_friend_suggest ? 27 : -10;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingFriendRequestView";
    }

    /* renamed from: nM */
    void m84099nM(View view) {
        try {
            ScrollViewVisibleChildViewDetector scrollViewVisibleChildViewDetector = (ScrollViewVisibleChildViewDetector) view.findViewById(AbstractC6918a0.scroll_main_layout);
            this.f77457c1 = scrollViewVisibleChildViewDetector;
            scrollViewVisibleChildViewDetector.setOnScrollStateChangedListener(this);
            this.f77458d1 = (HightLightSettingView) view.findViewById(AbstractC6918a0.hightLightView);
            this.f77461g1.m87415u(this.f77457c1);
            this.f77444P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_friend_request_phone_number);
            this.f77445Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_friend_request_username);
            this.f77446R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_friend_request_qrcode);
            this.f77447S0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_friend_request_group);
            this.f77448T0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_friend_request_contact);
            this.f77449U0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_friend_suggest);
            this.f77450V0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_friend_request_phone_number);
            this.f77451W0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_friend_request_username);
            this.f77452X0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_friend_request_qrcode);
            this.f77453Y0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_friend_request_group);
            this.f77454Z0 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_friend_request_contact);
            this.f77455a1 = (StencilSwitch) view.findViewById(AbstractC6918a0.sw_friend_suggest);
            this.f77444P0.setOnClickListener(this);
            if (AbstractC23309i.m122577xf()) {
                this.f77445Q0.setVisibility(0);
                this.f77445Q0.setOnClickListener(this);
            } else {
                this.f77445Q0.setVisibility(8);
            }
            this.f77446R0.setOnClickListener(this);
            this.f77447S0.setOnClickListener(this);
            this.f77448T0.setOnClickListener(this);
            this.f77449U0.setOnClickListener(this);
            this.f77450V0.setOnClickListener(this);
            this.f77451W0.setOnClickListener(this);
            this.f77452X0.setOnClickListener(this);
            this.f77453Y0.setOnClickListener(this);
            this.f77454Z0.setOnClickListener(this);
            this.f77455a1.setOnClickListener(this);
            m84100qM();
            view.findViewById(AbstractC6918a0.layout_setting_friend_suggest).setVisibility(8);
            if (AbstractC23309i.m120777B3() == 0 && view.findViewById(AbstractC6918a0.ll_friend_suggest) != null) {
                view.findViewById(AbstractC6918a0.ll_friend_suggest).setVisibility(8);
            }
            this.f77456b1 = (TextView) view.findViewById(AbstractC6918a0.tv_friend_request_phone_number_des);
            AbstractC0837p0.m2225f().mo2040a(new Runnable() { // from class: com.zing.zalo.ui.zviews.mh0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingFriendRequestView.this.m84096pM();
                }
            });
            m84098Vx();
            m84094mM(view);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 != AbstractC6918a0.ll_friend_request_phone_number && id2 != AbstractC6918a0.sw_friend_request_phone_number) {
                if (id2 != AbstractC6918a0.ll_friend_request_username && id2 != AbstractC6918a0.sw_friend_request_username) {
                    if (id2 != AbstractC6918a0.ll_friend_request_qrcode && id2 != AbstractC6918a0.sw_friend_request_qrcode) {
                        if (id2 != AbstractC6918a0.ll_friend_request_group && id2 != AbstractC6918a0.sw_friend_request_group) {
                            if (id2 != AbstractC6918a0.ll_friend_request_contact && id2 != AbstractC6918a0.sw_friend_request_contact) {
                                if (id2 != AbstractC6918a0.ll_friend_suggest) {
                                    if (id2 == AbstractC6918a0.sw_friend_suggest) {
                                    }
                                }
                                this.f77455a1.setChecked(!r4.isChecked());
                                AbstractC26084s.m134269q(0, 27);
                                m84097Ie(24, this.f77455a1.isChecked() ? 1 : 0);
                            }
                            this.f77454Z0.setChecked(!r4.isChecked());
                            AbstractC26084s.m134269q(0, 4);
                            m84097Ie(20, this.f77454Z0.isChecked() ? 1 : 0);
                        }
                        this.f77453Y0.setChecked(!r4.isChecked());
                        AbstractC26084s.m134269q(0, 3);
                        m84097Ie(22, this.f77453Y0.isChecked() ? 1 : 0);
                    }
                    this.f77452X0.setChecked(!r4.isChecked());
                    AbstractC26084s.m134269q(0, 2);
                    m84097Ie(19, this.f77452X0.isChecked() ? 1 : 0);
                }
                this.f77451W0.setChecked(!r4.isChecked());
                AbstractC26084s.m134269q(0, 1);
                m84097Ie(18, this.f77451W0.isChecked() ? 1 : 0);
            }
            this.f77450V0.setChecked(!r4.isChecked());
            AbstractC26084s.m134269q(0, 0);
            m84097Ie(17, this.f77450V0.isChecked() ? 1 : 0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        this.f77461g1.m87413s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: qM */
    public void m84100qM() {
        try {
            this.f77450V0.setChecked(AbstractC23309i.m122461ua());
            this.f77451W0.setChecked(AbstractC23309i.m122535wa());
            this.f77452X0.setChecked(AbstractC23309i.m122498va());
            this.f77453Y0.setChecked(AbstractC23309i.m122424ta());
            this.f77454Z0.setChecked(AbstractC23309i.m122387sa());
            this.f77455a1.setChecked(AbstractC23309i.m122572xa());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: rM */
    void m84101rM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.lh0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingFriendRequestView.this.m84100qM();
                }
            });
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        if (i11 == 6000 && m92676n2() != null) {
            m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.kh0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingFriendRequestView.this.m84092kM();
                }
            });
        }
    }
}
