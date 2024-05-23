package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.p077ui.settings.SettingAccountAndSecurityV2View;
import com.zing.zalo.p077ui.widget.GroupAvatarView;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.share.ShareView;
import com.zing.zalo.zview.actionbar.ActionBar;
import me0.AbstractC23056e6;
import me0.AbstractC23136l9;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* loaded from: classes6.dex */
public class ChangePhoneNumberSuccessView extends SlidableZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: P0 */
    private TextView f72676P0;

    /* renamed from: Q0 */
    private View f72677Q0;

    /* renamed from: U0 */
    View f72681U0;

    /* renamed from: V0 */
    StencilSwitch f72682V0;

    /* renamed from: R0 */
    private String f72678R0 = "";

    /* renamed from: S0 */
    private String f72679S0 = "";

    /* renamed from: T0 */
    int f72680T0 = 1;

    /* renamed from: W0 */
    private boolean f72683W0 = false;

    /* renamed from: gM */
    private void m78768gM() {
        Bundle bundle = new Bundle();
        bundle.putInt("SHOW_WITH_FLAGS", 16777216);
        if (m92676n2() != null) {
            m92676n2().mo35579p().m93066i2(SettingAccountAndSecurityV2View.class, bundle, 0, 0, true);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        String str;
        super.mo37111CJ(bundle);
        if (this.f72421L0.m92676n2() != null) {
            AbstractC2379w.m12430d(this.f72421L0.m92676n2().getCurrentFocus());
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            String str2 = "";
            if (!m92642L3.containsKey("STR_EXTRA_NEW_PHONE_NUMBER")) {
                str = "";
            } else {
                str = m92642L3.getString("STR_EXTRA_NEW_PHONE_NUMBER");
            }
            this.f72678R0 = str;
            if (m92642L3.containsKey("STR_EXTRA_OLD_PHONE_NUMBER")) {
                str2 = m92642L3.getString("STR_EXTRA_OLD_PHONE_NUMBER");
            }
            this.f72679S0 = str2;
            boolean z11 = false;
            if (m92642L3.containsKey("STR_EXTRA_CHANGE_BYPASS_WAY") && m92642L3.getBoolean("STR_EXTRA_CHANGE_BYPASS_WAY", false)) {
                z11 = true;
            }
            this.f72683W0 = z11;
            this.f72680T0 = m92642L3.getInt("source_type_change_phone", 1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String m118281g;
        View inflate = layoutInflater.inflate(AbstractC7409c0.change_phone_number_success_view, viewGroup, false);
        this.f72677Q0 = inflate;
        try {
            this.f72676P0 = (TextView) inflate.findViewById(AbstractC6918a0.btn_next);
            this.f72681U0 = this.f72677Q0.findViewById(AbstractC6918a0.share_to_friend_layout);
            this.f72682V0 = (StencilSwitch) this.f72677Q0.findViewById(AbstractC6918a0.switch_notify_to_friend);
            this.f72676P0.setOnClickListener(this);
            this.f72681U0.setOnClickListener(this);
            TextView textView = (TextView) this.f72677Q0.findViewById(AbstractC6918a0.tv_title);
            GroupAvatarView groupAvatarView = (GroupAvatarView) this.f72677Q0.findViewById(AbstractC6918a0.img_avt);
            TextView textView2 = (TextView) this.f72677Q0.findViewById(AbstractC6918a0.tv_name);
            textView.setText(AbstractC23136l9.m118746s0(AbstractC8020f0.str_title_change_phone_success, AbstractC23304d.f113368c0.f42437s));
            groupAvatarView.m75732d(AbstractC23304d.f113368c0.f42446v);
            textView2.setText(AbstractC23304d.f113368c0.f42437s);
            m118281g = AbstractC23056e6.m118281g(AbstractC23304d.f113368c0.f42455y, AbstractC23309i.m121742b5());
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (!TextUtils.isEmpty(m118281g)) {
            if (m118281g.equalsIgnoreCase(AbstractC23056e6.f112062a)) {
            }
            ((TextView) this.f72677Q0.findViewById(AbstractC6918a0.tv_phone)).setText(m118281g);
            return this.f72677Q0;
        }
        m118281g = AbstractC23304d.f113368c0.f42455y;
        ((TextView) this.f72677Q0.findViewById(AbstractC6918a0.tv_phone)).setText(m118281g);
        return this.f72677Q0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        if (bundle != null) {
            try {
                bundle.putString("mNewPhoneNumber", this.f72678R0);
                bundle.putString("mOldPhoneNumber", this.f72679S0);
                bundle.putBoolean("mByPassWay", this.f72683W0);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setItemsBackground(AbstractC7356u0.item_actionbar_background_ripple);
            this.f88760a0.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.str_change_phone_title));
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ChangePhoneNumberSuccessView";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_next) {
            if (!this.f72683W0) {
                if (this.f72682V0.isChecked()) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("bol_share_in_app", true);
                    bundle.putString("extra_change_phone_number_new_num", this.f72678R0);
                    bundle.putString("extra_change_phone_number_old_num", this.f72679S0);
                    bundle.putBoolean("EXTRA_CONFIG_ENABLE_HIDE_GROUP", true);
                    bundle.putBoolean("EXTRA_CONFIG_SHOW_CREATE_GROUP_ENTRY_POINT", false);
                    bundle.putBoolean("EXTRA_ONLY_SHOW_ZALO_FRIEND", true);
                    if (this.f72680T0 == 4) {
                        m78768gM();
                    } else {
                        bundle.putInt("SHOW_WITH_FLAGS", 33554432);
                    }
                    this.f72421L0.m92662fJ().m93069k2(ShareView.class, bundle, 2, true);
                    AbstractC23647d.m123906p("60002");
                    AbstractC23647d.m123893c();
                    return;
                }
                AbstractC23647d.m123906p("60003");
                AbstractC23647d.m123893c();
                finish();
                return;
            }
            if (this.f72680T0 == 4) {
                m78768gM();
                return;
            } else {
                finish();
                return;
            }
        }
        if (id2 == AbstractC6918a0.share_to_friend_layout) {
            this.f72682V0.setChecked(!r5.isChecked());
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        String str;
        boolean z11;
        super.mo37135xJ(bundle);
        int i11 = 0;
        if (bundle != null) {
            try {
                String str2 = "";
                if (!bundle.containsKey("mNewPhoneNumber")) {
                    str = "";
                } else {
                    str = bundle.getString("mNewPhoneNumber");
                }
                this.f72678R0 = str;
                if (bundle.containsKey("mOldPhoneNumber")) {
                    str2 = bundle.getString("mOldPhoneNumber");
                }
                this.f72679S0 = str2;
                if (bundle.containsKey("mByPassWay") && bundle.getBoolean("mByPassWay")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                this.f72683W0 = z11;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        View findViewById = m92656bJ().findViewById(AbstractC6918a0.share_to_friend_layout);
        if (this.f72683W0) {
            i11 = 8;
        }
        findViewById.setVisibility(i11);
    }
}
