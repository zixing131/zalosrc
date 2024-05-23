package com.zing.zalo.p077ui.settings.subsettings;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
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
import com.zing.zalo.p077ui.settings.subsettings.SettingVideoView;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.actionbar.ActionBar;
import hf0.C20048j;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23055e5;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SettingVideoView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f68254P0;

    /* renamed from: Q0 */
    LinearLayout f68255Q0;

    /* renamed from: R0 */
    LinearLayout f68256R0;

    /* renamed from: S0 */
    ImageView f68257S0;

    /* renamed from: T0 */
    ImageView f68258T0;

    /* renamed from: U0 */
    ImageView f68259U0;

    /* renamed from: V0 */
    boolean f68260V0 = false;

    /* renamed from: W0 */
    boolean f68261W0 = false;

    /* renamed from: X0 */
    private final InterfaceC0765j f68262X0 = new C0766k();

    /* renamed from: Y0 */
    private final InterfaceC20094a f68263Y0 = new C13270b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingVideoView$a */
    /* loaded from: classes6.dex */
    public class C13269a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ int f68264a;

        C13269a(int i11) {
            this.f68264a = i11;
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
                    SettingVideoView.this.m74595mM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingVideoView settingVideoView = SettingVideoView.this;
                settingVideoView.f68260V0 = false;
                settingVideoView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingVideoView settingVideoView2 = SettingVideoView.this;
                settingVideoView2.f68260V0 = false;
                settingVideoView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    C20048j.f98580a.m104106e(this.f68264a);
                    SettingVideoView.this.m74595mM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } finally {
                SettingVideoView settingVideoView = SettingVideoView.this;
                settingVideoView.f68260V0 = false;
                settingVideoView.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.settings.subsettings.SettingVideoView$b */
    /* loaded from: classes6.dex */
    class C13270b implements InterfaceC20094a {
        C13270b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingVideoView.this.f68261W0 = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            JSONObject optJSONObject;
            try {
                try {
                    JSONObject optJSONObject2 = ((JSONObject) obj).getJSONObject("data").optJSONObject("settings");
                    if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("auto_play_video")) != null) {
                        C20048j.f98580a.m104106e(optJSONObject.optInt("value"));
                    }
                    SettingVideoView.this.m74595mM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingVideoView.this.f68261W0 = false;
            } catch (Throwable th2) {
                SettingVideoView.this.f68261W0 = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m74590jM() {
        try {
            m74594lM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_video_view, viewGroup, false);
        m74592iM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_video_auto_play));
                this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
                this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SettingVideoView";
    }

    /* renamed from: hM */
    void m74591hM() {
        try {
            if (!this.f68261W0 && C23055e5.m118271f()) {
                this.f68261W0 = true;
                this.f68262X0.mo1704o8(this.f68263Y0);
                this.f68262X0.mo1589Z7(AbstractC23148n.m118835i());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iM */
    void m74592iM(View view) {
        try {
            this.f68254P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_enable_auto_play);
            this.f68255Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_enable_auto_play_with_wifi);
            this.f68256R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_disable_auto_play);
            this.f68257S0 = (ImageView) view.findViewById(AbstractC6918a0.ic_enable_auto_play);
            this.f68258T0 = (ImageView) view.findViewById(AbstractC6918a0.ic_enable_auto_play_with_wifi);
            this.f68259U0 = (ImageView) view.findViewById(AbstractC6918a0.ic_disable_auto_play);
            this.f68254P0.setOnClickListener(this);
            this.f68255Q0.setOnClickListener(this);
            this.f68256R0.setOnClickListener(this);
            m74591hM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kM */
    void m74593kM(int i11) {
        try {
            if (this.f68260V0) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f68260V0 = true;
                C0766k c0766k = new C0766k();
                c0766k.mo1704o8(new C13269a(i11));
                c0766k.mo1699o3(17, i11);
            } else {
                this.f68260V0 = false;
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
                this.f72421L0.mo78960q3();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: lM */
    void m74594lM() {
        try {
            int m104104c = C20048j.f98580a.m104104c();
            if (m104104c == 0) {
                this.f68257S0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f68259U0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                this.f68258T0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
            } else if (m104104c == 2) {
                this.f68257S0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f68259U0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f68258T0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
            } else {
                this.f68257S0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                this.f68259U0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f68258T0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: mM */
    void m74595mM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: oa0.v0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingVideoView.this.m74590jM();
                }
            });
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_enable_auto_play) {
                m74593kM(1);
            } else if (id2 == AbstractC6918a0.ll_enable_auto_play_with_wifi) {
                m74593kM(2);
            } else if (id2 == AbstractC6918a0.ll_disable_auto_play) {
                m74593kM(0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m74594lM();
    }
}
