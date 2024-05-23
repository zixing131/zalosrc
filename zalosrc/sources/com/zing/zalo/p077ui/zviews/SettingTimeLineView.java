package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalocore.CoreUtility;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import me0.AbstractC23136l9;
import me0.AbstractC23148n;
import me0.C23055e5;
import org.json.JSONArray;
import org.json.JSONObject;
import p142ey.C18644n;
import p304ks.AbstractC21935u;
import p348mi.AbstractC23309i;
import p716zh.C32002l4;
import p716zh.C32017m4;

/* loaded from: classes6.dex */
public class SettingTimeLineView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    LinearLayout f77555P0;

    /* renamed from: Q0 */
    LinearLayout f77556Q0;

    /* renamed from: R0 */
    LinearLayout f77557R0;

    /* renamed from: S0 */
    ImageView f77558S0;

    /* renamed from: T0 */
    ImageView f77559T0;

    /* renamed from: U0 */
    ImageView f77560U0;

    /* renamed from: V0 */
    ImageView f77561V0;

    /* renamed from: W0 */
    ImageView f77562W0;

    /* renamed from: X0 */
    TextView f77563X0;

    /* renamed from: d1 */
    int f77569d1;

    /* renamed from: e1 */
    int f77570e1;

    /* renamed from: Y0 */
    int f77564Y0 = 0;

    /* renamed from: Z0 */
    JSONArray f77565Z0 = new JSONArray();

    /* renamed from: a1 */
    boolean f77566a1 = false;

    /* renamed from: b1 */
    private final InterfaceC0765j f77567b1 = new C0766k();

    /* renamed from: c1 */
    private final InterfaceC20094a f77568c1 = new C15045a();

    /* renamed from: f1 */
    boolean f77571f1 = false;

    /* renamed from: g1 */
    private final InterfaceC0765j f77572g1 = new C0766k();

    /* renamed from: h1 */
    private final InterfaceC20094a f77573h1 = new C15046b();

    /* renamed from: com.zing.zalo.ui.zviews.SettingTimeLineView$a */
    /* loaded from: classes6.dex */
    class C15045a implements InterfaceC20094a {
        C15045a() {
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
                    SettingTimeLineView.this.m84231oM();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                SettingTimeLineView settingTimeLineView = SettingTimeLineView.this;
                settingTimeLineView.f77566a1 = false;
                settingTimeLineView.f72421L0.mo78960q3();
            } catch (Throwable th2) {
                SettingTimeLineView settingTimeLineView2 = SettingTimeLineView.this;
                settingTimeLineView2.f77566a1 = false;
                settingTimeLineView2.f72421L0.mo78960q3();
                throw th2;
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                try {
                    SettingTimeLineView settingTimeLineView = SettingTimeLineView.this;
                    int i11 = settingTimeLineView.f77569d1;
                    AbstractC23148n.m118851y(i11, settingTimeLineView.f77570e1, i11);
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                SettingTimeLineView.this.m84231oM();
            } finally {
                SettingTimeLineView settingTimeLineView2 = SettingTimeLineView.this;
                settingTimeLineView2.f77566a1 = false;
                settingTimeLineView2.f72421L0.mo78960q3();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.SettingTimeLineView$b */
    /* loaded from: classes6.dex */
    class C15046b implements InterfaceC20094a {
        C15046b() {
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            SettingTimeLineView.this.f77571f1 = false;
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
                } catch (Exception e11) {
                    try {
                        e11.printStackTrace();
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
                SettingTimeLineView.this.m84231oM();
            } finally {
                SettingTimeLineView.this.f77571f1 = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: jM */
    public /* synthetic */ void m84223jM() {
        try {
            m84229nM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: kM */
    private void m84224kM() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154284u(76)), false);
    }

    /* renamed from: lM */
    private void m84225lM() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154284u(77)), false);
    }

    /* renamed from: mM */
    private void m84226mM() {
        C0815e1.m2075D().m2100V(C32017m4.m154326S().m154347V(C32002l4.m154264g(IMediaPlayer.MEDIA_INFO_OPEN_INPUT).m154284u(75)), false);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (this.f72421L0.m92642L3() != null && this.f72421L0.m92642L3().containsKey("EXTRA_SETTING_NOTI")) {
            this.f77564Y0 = this.f72421L0.m92642L3().getInt("EXTRA_SETTING_NOTI");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mo37483GJ(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_timeline_view, viewGroup, false);
        m84228iM(inflate);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                if (this.f77564Y0 == 1) {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_story));
                } else {
                    actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_header_setting_timeline));
                }
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
        return "SettingTimeLineView";
    }

    /* renamed from: hM */
    void m84227hM() {
        try {
            if (!this.f77571f1 && C23055e5.m118271f()) {
                this.f77571f1 = true;
                this.f77572g1.mo1704o8(this.f77573h1);
                this.f77572g1.mo1589Z7(AbstractC23148n.m118835i());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: iM */
    void m84228iM(View view) {
        try {
            this.f77555P0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_select_all);
            this.f77556Q0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_not_select);
            this.f77557R0 = (LinearLayout) view.findViewById(AbstractC6918a0.ll_not_all);
            this.f77558S0 = (ImageView) view.findViewById(AbstractC6918a0.ic_select_all);
            this.f77559T0 = (ImageView) view.findViewById(AbstractC6918a0.ic_not_select);
            this.f77560U0 = (ImageView) view.findViewById(AbstractC6918a0.ic_not_all);
            this.f77561V0 = (ImageView) view.findViewById(AbstractC6918a0.setting_ic_list);
            this.f77562W0 = (ImageView) view.findViewById(AbstractC6918a0.ic_show_list_choose_friend);
            this.f77563X0 = (TextView) view.findViewById(AbstractC6918a0.tv_not_select_desc);
            this.f77555P0.setOnClickListener(this);
            this.f77556Q0.setOnClickListener(this);
            this.f77557R0.setOnClickListener(this);
            this.f77561V0.setOnClickListener(this);
            m84227hM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: nM */
    void m84229nM() {
        String m120822Cb;
        try {
            if (this.f77564Y0 == 1) {
                m120822Cb = AbstractC23309i.m120859Db();
            } else {
                m120822Cb = AbstractC23309i.m120822Cb();
            }
            if (TextUtils.isEmpty(m120822Cb)) {
                this.f77558S0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                this.f77560U0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f77559T0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f77563X0.setVisibility(8);
                return;
            }
            JSONObject jSONObject = new JSONObject(m120822Cb);
            int optInt = jSONObject.optInt(ZinstantMetaConstant.IMPRESSION_META_TYPE);
            if (optInt == 0) {
                this.f77558S0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f77560U0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                this.f77559T0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
            } else if (optInt == 2) {
                this.f77558S0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f77560U0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f77559T0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
            } else {
                this.f77558S0.setImageResource(AbstractC16803z.btn_radio_on_holo_light);
                this.f77560U0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
                this.f77559T0.setImageResource(AbstractC16803z.btn_radio_off_holo_light);
            }
            this.f77565Z0 = jSONObject.optJSONArray("list_uid");
            StringBuilder sb2 = new StringBuilder();
            JSONArray jSONArray = this.f77565Z0;
            if (jSONArray != null && jSONArray.length() > 0) {
                JSONObject optJSONObject = this.f77565Z0.optJSONObject(0);
                if (optJSONObject != null) {
                    ContactProfile m98552o = C18644n.m98531l().m98552o(optJSONObject.optString("userId"));
                    if (m98552o != null) {
                        sb2.append(m98552o.m40383Q(true, false));
                    } else {
                        sb2.append(optJSONObject.optString("displayName"));
                    }
                    if (this.f77565Z0.length() > 1) {
                        JSONObject optJSONObject2 = this.f77565Z0.optJSONObject(1);
                        if (optJSONObject2 != null) {
                            ContactProfile m98552o2 = C18644n.m98531l().m98552o(optJSONObject2.optString("userId"));
                            if (m98552o2 != null) {
                                sb2.append(", ");
                                sb2.append(m98552o2.m40383Q(true, false));
                            } else {
                                sb2.append(", ");
                                sb2.append(optJSONObject2.optString("displayName"));
                            }
                        }
                        if (this.f77565Z0.length() > 2) {
                            sb2.append(" ");
                            sb2.append(String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_noti_new_feed_not_select_n_friend), Integer.valueOf(this.f77565Z0.length() - 2)));
                        }
                    }
                }
                this.f77561V0.setVisibility(0);
                this.f77562W0.setVisibility(8);
            }
            if (sb2.length() > 0) {
                this.f77563X0.setText(sb2.toString());
                this.f77563X0.setVisibility(0);
            } else {
                this.f77563X0.setVisibility(8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: o3 */
    void m84230o3(int i11, int i12) {
        JSONArray jSONArray;
        ArrayList arrayList;
        try {
            if (this.f77566a1) {
                return;
            }
            this.f72421L0.mo78950cq(AbstractC23136l9.m118743r0(AbstractC8020f0.str_isProcessing));
            if (C23055e5.m118272g(true)) {
                this.f77569d1 = i11;
                this.f77570e1 = i12;
                this.f77566a1 = true;
                if ((i11 == 14 || i11 == 16) && i12 == 2 && (jSONArray = this.f77565Z0) != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i13 = 0; i13 < this.f77565Z0.length(); i13++) {
                        JSONObject optJSONObject = this.f77565Z0.optJSONObject(i13);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("userId");
                            if (!TextUtils.isEmpty(optString)) {
                                arrayList.add(optString);
                            }
                        }
                    }
                } else {
                    arrayList = null;
                }
                this.f77567b1.mo1704o8(this.f77568c1);
                this.f77567b1.mo1562W4(i11, i12, arrayList);
                return;
            }
            this.f77566a1 = false;
            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_update_failed));
            this.f72421L0.mo78960q3();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: oM */
    void m84231oM() {
        if (this.f72421L0.m92676n2() != null) {
            this.f72421L0.m92676n2().runOnUiThread(new Runnable() { // from class: com.zing.zalo.ui.zviews.zi0
                @Override // java.lang.Runnable
                public final void run() {
                    SettingTimeLineView.this.m84223jM();
                }
            });
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 1234 && i11 == -1) {
            m84229nM();
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        try {
            int id2 = view.getId();
            if (id2 == AbstractC6918a0.ll_select_all) {
                int i11 = this.f77564Y0;
                if (i11 == 1) {
                    m84230o3(16, 1);
                } else if (i11 == 0) {
                    m84230o3(14, 1);
                }
                m84226mM();
                return;
            }
            if (id2 == AbstractC6918a0.ll_not_all) {
                int i12 = this.f77564Y0;
                if (i12 == 1) {
                    m84230o3(16, 0);
                } else if (i12 == 0) {
                    m84230o3(14, 0);
                }
                m84225lM();
                return;
            }
            if (id2 == AbstractC6918a0.ll_not_select) {
                JSONArray jSONArray = this.f77565Z0;
                if (jSONArray != null && jSONArray.length() > 0) {
                    int i13 = this.f77564Y0;
                    if (i13 == 1) {
                        m84230o3(16, 2);
                    } else if (i13 == 0) {
                        m84230o3(14, 2);
                    }
                    m84224kM();
                    return;
                }
                Bundle bundle = new Bundle();
                int i14 = this.f77564Y0;
                if (i14 == 1) {
                    bundle.putBoolean("fromSettingMutedCallers", true);
                } else if (i14 == 0) {
                    bundle.putBoolean("fromSettingNotiFeed", true);
                }
                this.f72421L0.m92662fJ().m93066i2(ChooseMultiFriendsView.class, bundle, 1234, 1, true);
                return;
            }
            if (id2 == AbstractC6918a0.setting_ic_list) {
                ArrayList<String> arrayList = new ArrayList<>();
                if (this.f77565Z0 != null) {
                    for (int i15 = 0; i15 < this.f77565Z0.length(); i15++) {
                        JSONObject optJSONObject = this.f77565Z0.optJSONObject(i15);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optString("userId");
                            if (!CoreUtility.f89233i.equals(optString) && AbstractC21935u.m114558y(optString)) {
                                arrayList.add(optString);
                            }
                        }
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("extra_uid_selected_profile", arrayList);
                if (this.f77564Y0 == 1) {
                    bundle2.putInt("extra_mode", 4);
                } else {
                    bundle2.putInt("extra_mode", 3);
                }
                this.f72421L0.m92662fJ().m93066i2(PrivacyShareListView.class, bundle2, 1019, 2, true);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        m84229nM();
    }
}
