package com.zing.zalo.p077ui.zviews;

import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import bp0.AbstractC3082b0;
import bp0.C3080a0;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.SettingCallFromStrangerView;
import com.zing.zalo.utils.ToastUtils;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23055e5;
import org.json.JSONObject;
import p348mi.AbstractC23309i;
import p361nb.C23648e;
import p542ub.InterfaceC27218a;

/* loaded from: classes6.dex */
public final class SettingCallFromStrangerView extends SlidableZaloView implements View.OnClickListener {

    /* renamed from: Q0 */
    private LinearLayout f77423Q0;

    /* renamed from: R0 */
    private LinearLayout f77424R0;

    /* renamed from: S0 */
    private LinearLayout f77425S0;

    /* renamed from: T0 */
    private ImageView f77426T0;

    /* renamed from: U0 */
    private ImageView f77427U0;

    /* renamed from: V0 */
    private ImageView f77428V0;

    /* renamed from: X0 */
    private boolean f77430X0;

    /* renamed from: P0 */
    private final String f77422P0 = "SettingCallFromStrangerView";

    /* renamed from: W0 */
    private int f77429W0 = -1;

    /* renamed from: Y0 */
    private String f77431Y0 = "";

    /* renamed from: Z0 */
    private final InterfaceC0765j f77432Z0 = new C0766k();

    /* renamed from: a1 */
    private final C15022b f77433a1 = new C15022b();

    /* renamed from: com.zing.zalo.ui.zviews.SettingCallFromStrangerView$a */
    /* loaded from: classes6.dex */
    public static final class C15021a implements InterfaceC20094a {
        C15021a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m84079d(SettingCallFromStrangerView settingCallFromStrangerView) {
            AbstractC19074t.m100208f(settingCallFromStrangerView, "this$0");
            settingCallFromStrangerView.m84076rM();
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            String str;
            String str2 = SettingCallFromStrangerView.this.f77422P0;
            if (c20096c != null) {
                str = c20096c.m104492d();
            } else {
                str = null;
            }
            AbstractC3082b0.m15424f(str2, "fetchSetting error " + str);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                AbstractC19074t.m100206d(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                AbstractC23309i.m122552wr(System.currentTimeMillis());
                AbstractC23148n.m118844r(jSONObject);
                if (!jSONObject.isNull("privacy")) {
                    AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                }
                InterfaceC27218a m92676n2 = SettingCallFromStrangerView.this.f72421L0.m92676n2();
                if (m92676n2 != null) {
                    final SettingCallFromStrangerView settingCallFromStrangerView = SettingCallFromStrangerView.this;
                    m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.hh0
                        @Override // java.lang.Runnable
                        public final void run() {
                            SettingCallFromStrangerView.C15021a.m84079d(SettingCallFromStrangerView.this);
                        }
                    });
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingCallFromStrangerView$b */
    /* loaded from: classes6.dex */
    public static final class C15022b implements InterfaceC20094a {
        C15022b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m84082e(SettingCallFromStrangerView settingCallFromStrangerView) {
            AbstractC19074t.m100208f(settingCallFromStrangerView, "this$0");
            AbstractC23148n.m118848v(25, settingCallFromStrangerView.f77429W0);
            settingCallFromStrangerView.m84076rM();
            settingCallFromStrangerView.m84073oM();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m84083f(SettingCallFromStrangerView settingCallFromStrangerView, C20096c c20096c) {
            AbstractC19074t.m100208f(settingCallFromStrangerView, "this$0");
            settingCallFromStrangerView.m84076rM();
            if (c20096c != null && c20096c.m104491c() == 515) {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.WRONG_DATE_TIME_MSG));
            } else {
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            try {
                try {
                    InterfaceC27218a m92676n2 = SettingCallFromStrangerView.this.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        final SettingCallFromStrangerView settingCallFromStrangerView = SettingCallFromStrangerView.this;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.jh0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallFromStrangerView.C15022b.m84083f(SettingCallFromStrangerView.this, c20096c);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingCallFromStrangerView.this.f77430X0 = false;
                SettingCallFromStrangerView.this.f72421L0.mo78960q3();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r4v6, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r4v7 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    InterfaceC27218a m92676n2 = SettingCallFromStrangerView.this.f72421L0.m92676n2();
                    if (m92676n2 != null) {
                        final SettingCallFromStrangerView settingCallFromStrangerView = SettingCallFromStrangerView.this;
                        m92676n2.runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.ih0
                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingCallFromStrangerView.C15022b.m84082e(SettingCallFromStrangerView.this);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingCallFromStrangerView.this.f77430X0 = z11;
                SettingCallFromStrangerView.this.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: lM */
    private final void m84071lM() {
        try {
            if (!C23055e5.m118273h(false, 1, null)) {
                return;
            }
            C0766k c0766k = new C0766k();
            c0766k.mo1704o8(new C15021a());
            c0766k.mo1589Z7(AbstractC23148n.m118835i());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    private final void m84072mM() {
        if (m92642L3() != null) {
            Bundle m92642L3 = m92642L3();
            AbstractC19074t.m100205c(m92642L3);
            String string = m92642L3.getString("CALL_FROM_STRANGER_SETTING_ENTRY_POINT", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            this.f77431Y0 = string;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public final void m84073oM() {
        String str;
        int i11 = this.f77429W0;
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 4) {
                    str = "";
                } else {
                    str = "call_setting_stranger_strangers_contacted";
                }
            } else {
                str = "call_setting_stranger_everyone";
            }
        } else {
            str = "call_setting_stranger_friends";
        }
        C0815e1.m2075D().m2100V(new C23648e(19, this.f77431Y0, 0, str, new String[0]), false);
    }

    /* renamed from: pM */
    private final void m84074pM(int i11) {
        try {
            if (this.f77430X0) {
                return;
            }
            this.f77430X0 = true;
            if (C23055e5.m118272g(true)) {
                this.f77429W0 = i11;
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f77432Z0.mo1704o8(this.f77433a1);
                this.f77432Z0.mo1545U3(25, i11, "");
            } else {
                m84076rM();
                this.f77430X0 = false;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: qM */
    private final void m84075qM(ImageView imageView, boolean z11) {
        if (z11) {
            imageView.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
        } else {
            imageView.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: rM */
    public final void m84076rM() {
        int m15415f = C3080a0.f13112a.m15415f();
        ImageView imageView = null;
        if (m15415f != 2) {
            if (m15415f != 3) {
                if (m15415f != 4) {
                    ImageView imageView2 = this.f77426T0;
                    if (imageView2 == null) {
                        AbstractC19074t.m100223u("icCallFromFriends");
                        imageView2 = null;
                    }
                    m84075qM(imageView2, false);
                    ImageView imageView3 = this.f77427U0;
                    if (imageView3 == null) {
                        AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
                        imageView3 = null;
                    }
                    m84075qM(imageView3, false);
                    ImageView imageView4 = this.f77428V0;
                    if (imageView4 == null) {
                        AbstractC19074t.m100223u("icCallFromFriendsAll");
                    } else {
                        imageView = imageView4;
                    }
                    m84075qM(imageView, false);
                    return;
                }
                ImageView imageView5 = this.f77426T0;
                if (imageView5 == null) {
                    AbstractC19074t.m100223u("icCallFromFriends");
                    imageView5 = null;
                }
                m84075qM(imageView5, false);
                ImageView imageView6 = this.f77427U0;
                if (imageView6 == null) {
                    AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
                    imageView6 = null;
                }
                m84075qM(imageView6, true);
                ImageView imageView7 = this.f77428V0;
                if (imageView7 == null) {
                    AbstractC19074t.m100223u("icCallFromFriendsAll");
                } else {
                    imageView = imageView7;
                }
                m84075qM(imageView, false);
                return;
            }
            ImageView imageView8 = this.f77426T0;
            if (imageView8 == null) {
                AbstractC19074t.m100223u("icCallFromFriends");
                imageView8 = null;
            }
            m84075qM(imageView8, false);
            ImageView imageView9 = this.f77427U0;
            if (imageView9 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
                imageView9 = null;
            }
            m84075qM(imageView9, false);
            ImageView imageView10 = this.f77428V0;
            if (imageView10 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAll");
            } else {
                imageView = imageView10;
            }
            m84075qM(imageView, true);
            return;
        }
        ImageView imageView11 = this.f77426T0;
        if (imageView11 == null) {
            AbstractC19074t.m100223u("icCallFromFriends");
            imageView11 = null;
        }
        m84075qM(imageView11, true);
        ImageView imageView12 = this.f77427U0;
        if (imageView12 == null) {
            AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
            imageView12 = null;
        }
        m84075qM(imageView12, false);
        ImageView imageView13 = this.f77428V0;
        if (imageView13 == null) {
            AbstractC19074t.m100223u("icCallFromFriendsAll");
        } else {
            imageView = imageView13;
        }
        m84075qM(imageView, false);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_call_from_stranger_view, viewGroup, false);
        AbstractC19074t.m100207e(inflate, "inflate(...)");
        m84077nM(inflate);
        m84072mM();
        m84076rM();
        m84071lM();
        return inflate;
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingCallFromStrangerView";
    }

    /* renamed from: nM */
    public final void m84077nM(View view) {
        AbstractC19074t.m100208f(view, "view");
        View findViewById = view.findViewById(AbstractC6918a0.ll_call_from_friends);
        AbstractC19074t.m100207e(findViewById, "findViewById(...)");
        this.f77423Q0 = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(AbstractC6918a0.ic_call_from_friends);
        AbstractC19074t.m100207e(findViewById2, "findViewById(...)");
        this.f77426T0 = (ImageView) findViewById2;
        LinearLayout linearLayout = this.f77423Q0;
        LinearLayout linearLayout2 = null;
        if (linearLayout == null) {
            AbstractC19074t.m100223u("llCallFromFriends");
            linearLayout = null;
        }
        linearLayout.setOnClickListener(this);
        View findViewById3 = view.findViewById(AbstractC6918a0.ll_call_from_friends_more);
        AbstractC19074t.m100207e(findViewById3, "findViewById(...)");
        this.f77424R0 = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(AbstractC6918a0.ic_call_from_friends_more);
        AbstractC19074t.m100207e(findViewById4, "findViewById(...)");
        this.f77427U0 = (ImageView) findViewById4;
        LinearLayout linearLayout3 = this.f77424R0;
        if (linearLayout3 == null) {
            AbstractC19074t.m100223u("llCallFromFriendsAndRelation");
            linearLayout3 = null;
        }
        linearLayout3.setOnClickListener(this);
        View findViewById5 = view.findViewById(AbstractC6918a0.ll_call_from_all);
        AbstractC19074t.m100207e(findViewById5, "findViewById(...)");
        this.f77425S0 = (LinearLayout) findViewById5;
        View findViewById6 = view.findViewById(AbstractC6918a0.ic_call_from_all);
        AbstractC19074t.m100207e(findViewById6, "findViewById(...)");
        this.f77428V0 = (ImageView) findViewById6;
        LinearLayout linearLayout4 = this.f77425S0;
        if (linearLayout4 == null) {
            AbstractC19074t.m100223u("llCallFromAll");
        } else {
            linearLayout2 = linearLayout4;
        }
        linearLayout2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        ImageView imageView = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.ll_call_from_friends;
        if (num != null && num.intValue() == i11) {
            ImageView imageView2 = this.f77426T0;
            if (imageView2 == null) {
                AbstractC19074t.m100223u("icCallFromFriends");
                imageView2 = null;
            }
            m84075qM(imageView2, true);
            ImageView imageView3 = this.f77427U0;
            if (imageView3 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
                imageView3 = null;
            }
            m84075qM(imageView3, false);
            ImageView imageView4 = this.f77428V0;
            if (imageView4 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAll");
            } else {
                imageView = imageView4;
            }
            m84075qM(imageView, false);
            m84074pM(2);
            return;
        }
        int i12 = AbstractC6918a0.ll_call_from_friends_more;
        if (num != null && num.intValue() == i12) {
            ImageView imageView5 = this.f77426T0;
            if (imageView5 == null) {
                AbstractC19074t.m100223u("icCallFromFriends");
                imageView5 = null;
            }
            m84075qM(imageView5, false);
            ImageView imageView6 = this.f77427U0;
            if (imageView6 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
                imageView6 = null;
            }
            m84075qM(imageView6, true);
            ImageView imageView7 = this.f77428V0;
            if (imageView7 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAll");
            } else {
                imageView = imageView7;
            }
            m84075qM(imageView, false);
            m84074pM(4);
            return;
        }
        int i13 = AbstractC6918a0.ll_call_from_all;
        if (num != null && num.intValue() == i13) {
            ImageView imageView8 = this.f77426T0;
            if (imageView8 == null) {
                AbstractC19074t.m100223u("icCallFromFriends");
                imageView8 = null;
            }
            m84075qM(imageView8, false);
            ImageView imageView9 = this.f77427U0;
            if (imageView9 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAndRelation");
                imageView9 = null;
            }
            m84075qM(imageView9, false);
            ImageView imageView10 = this.f77428V0;
            if (imageView10 == null) {
                AbstractC19074t.m100223u("icCallFromFriendsAll");
            } else {
                imageView = imageView10;
            }
            m84075qM(imageView, true);
            m84074pM(3);
        }
    }
}
