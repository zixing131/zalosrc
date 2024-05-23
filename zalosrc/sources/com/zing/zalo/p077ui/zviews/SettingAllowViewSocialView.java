package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.zviews.SettingAllowViewSocialView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23034c6;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23055e5;
import org.json.JSONObject;
import p348mi.AbstractC23309i;

/* loaded from: classes6.dex */
public class SettingAllowViewSocialView extends SlidableZaloView implements ZaloView.InterfaceC17426k, View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f77410P0;

    /* renamed from: Q0 */
    LinearLayout f77411Q0;

    /* renamed from: R0 */
    ImageView f77412R0;

    /* renamed from: S0 */
    ImageView f77413S0;

    /* renamed from: T0 */
    View f77414T0;

    /* renamed from: U0 */
    View f77415U0;

    /* renamed from: V0 */
    boolean f77416V0 = false;

    /* renamed from: W0 */
    boolean f77417W0 = false;

    /* renamed from: com.zing.zalo.ui.zviews.SettingAllowViewSocialView$a */
    /* loaded from: classes6.dex */
    public class C15019a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f77418a;

        /* renamed from: b */
        final /* synthetic */ int f77419b;

        C15019a(int i11, int i12) {
            this.f77418a = i11;
            this.f77419b = i12;
        }

        /* renamed from: d */
        public /* synthetic */ void m84065d(int i11, int i12) {
            try {
                AbstractC23148n.m118848v(i11, i12);
                SettingAllowViewSocialView.this.m84063lM(AbstractC23309i.m122276pa());
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
                    SettingAllowViewSocialView.this.m84063lM(AbstractC23309i.m122276pa());
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingAllowViewSocialView settingAllowViewSocialView = SettingAllowViewSocialView.this;
                settingAllowViewSocialView.f77416V0 = false;
                settingAllowViewSocialView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingAllowViewSocialView settingAllowViewSocialView2 = SettingAllowViewSocialView.this;
                settingAllowViewSocialView2.f77416V0 = false;
                settingAllowViewSocialView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
        /* JADX WARN: Type inference failed for: r5v4, types: [com.zing.zalo.ui.zviews.CommonZaloview, com.zing.zalo.ui.zviews.BaseZaloView] */
        /* JADX WARN: Type inference failed for: r5v5 */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            boolean z11 = 0;
            z11 = 0;
            try {
                try {
                    if (SettingAllowViewSocialView.this.f72421L0.m92676n2() != null) {
                        SettingAllowViewSocialView.this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.gh0

                            /* renamed from: q */
                            public final /* synthetic */ int f80468q;

                            /* renamed from: r */
                            public final /* synthetic */ int f80469r;

                            public /* synthetic */ gh0(int i11, int i12) {
                                r2 = i11;
                                r3 = i12;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                SettingAllowViewSocialView.C15019a.this.m84065d(r2, r3);
                            }
                        });
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingAllowViewSocialView settingAllowViewSocialView = SettingAllowViewSocialView.this;
                settingAllowViewSocialView.f77416V0 = z11;
                settingAllowViewSocialView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingAllowViewSocialView$b */
    /* loaded from: classes6.dex */
    public class C15020b implements InterfaceC20094a {
        C15020b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingAllowViewSocialView settingAllowViewSocialView = SettingAllowViewSocialView.this;
            settingAllowViewSocialView.f77417W0 = false;
            settingAllowViewSocialView.m84063lM(AbstractC23309i.m122276pa());
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                    AbstractC23148n.m118844r(jSONObject);
                    if (!jSONObject.isNull("privacy")) {
                        AbstractC23309i.m122593xv("GET_SUCCESSFUL");
                    }
                    SettingAllowViewSocialView.this.m84063lM(AbstractC23309i.m122276pa());
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                SettingAllowViewSocialView.this.f77417W0 = false;
            } catch (Throwable th2) {
                SettingAllowViewSocialView.this.f77417W0 = false;
                throw th2;
            }
        }
    }

    /* renamed from: hM */
    private void m84058hM() {
        if (AbstractC23034c6.m118116D(MainApplication.getAppContext(), AbstractC23034c6.f112032i)) {
            m84063lM(AbstractC23309i.m122276pa());
            View view = this.f77414T0;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f77415U0;
            if (view2 != null) {
                view2.setVisibility(0);
                return;
            }
            return;
        }
        View view3 = this.f77414T0;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.f77415U0;
        if (view4 != null) {
            view4.setVisibility(8);
        }
    }

    /* renamed from: kM */
    public /* synthetic */ void m84059kM(int i11) {
        int i12;
        int i13;
        boolean z11 = true;
        if (i11 != 1) {
            z11 = false;
        }
        try {
            ImageView imageView = this.f77412R0;
            if (z11) {
                i12 = AbstractC16803z.btn_radio_on_holo_light;
            } else {
                i12 = AbstractC16803z.btn_radio_off_holo_light;
            }
            imageView.setImageResource(i12);
            ImageView imageView2 = this.f77413S0;
            if (z11) {
                i13 = AbstractC16803z.btn_radio_off_holo_light;
            } else {
                i13 = AbstractC16803z.btn_radio_on_holo_light;
            }
            imageView2.setImageResource(i13);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_alow_view_social_view, viewGroup, false);
        m84062jM(inflate);
        return inflate;
    }

    /* renamed from: Ie */
    void m84060Ie(int i11, int i12) {
        try {
            if (this.f77416V0) {
                return;
            }
            if (C23055e5.m118271f()) {
                this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
                this.f77416V0 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C15019a(i11, i12));
                c0766k.mo1545U3(i11, i12, "");
            } else {
                this.f77416V0 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                m84063lM(AbstractC23309i.m122276pa());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_setting_allow_view_social));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
                this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingAllowViewSocialView";
    }

    /* renamed from: iM */
    void m84061iM() {
        try {
            if (this.f77417W0) {
                return;
            }
            C0766k c0766k = new C0766k();
            if (C23055e5.m118271f()) {
                this.f77417W0 = true;
                c0766k.mo1704o8(new C15020b());
                c0766k.mo1589Z7(AbstractC23148n.m118835i());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: jM */
    void m84062jM(View view) {
        try {
            this.f77410P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_allow);
            this.f77411Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_not_allow);
            this.f77412R0 = (ImageView) view.findViewById(AbstractC6918a0.ic_allow);
            this.f77413S0 = (ImageView) view.findViewById(AbstractC6918a0.ic_not_allow);
            this.f77414T0 = view.findViewById(AbstractC6918a0.layout_privacy_error);
            this.f77415U0 = view.findViewById(AbstractC6918a0.ll_setting);
            this.f77410P0.setOnClickListener(this);
            this.f77411Q0.setOnClickListener(this);
            view.findViewById(AbstractC6918a0.tv_list_block_view_social).setOnClickListener(this);
            view.findViewById(AbstractC6918a0.btn_sync_phonebook_error).setOnClickListener(this);
            m84061iM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m84063lM(int i11) {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.fh0

                /* renamed from: q */
                public final /* synthetic */ int f80359q;

                public /* synthetic */ fh0(int i112) {
                    r2 = i112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SettingAllowViewSocialView.this.m84059kM(r2);
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_allow) {
                m84063lM(1);
                m84060Ie(26, 1);
            } else if (id2 == AbstractC6918a0.ll_not_allow) {
                m84063lM(0);
                m84060Ie(26, 0);
            } else if (id2 == AbstractC6918a0.tv_list_block_view_social) {
                this.f72421L0.m92662fJ().m93069k2(BlackListView.class, null, 1, true);
            } else if (id2 == AbstractC6918a0.btn_sync_phonebook_error) {
                AbstractC23034c6.m118184v0(this.f72421L0, AbstractC23034c6.f112032i, 108);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i11, strArr, iArr);
        if (i11 == 108) {
            m84058hM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m84058hM();
    }
}
