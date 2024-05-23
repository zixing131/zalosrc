package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.biometric.AbstractC7356u0;
import com.zing.zalo.zview.actionbar.ActionBar;
import me0.AbstractC23136l9;
import mm0.AbstractC23350e;
import p361nb.AbstractC23647d;
import sx.C26400b;

/* loaded from: classes6.dex */
public class JoinSecurityQuestionView extends BaseZaloView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: M0 */
    C26400b f74538M0;

    /* renamed from: N0 */
    Button f74539N0;

    /* renamed from: O0 */
    TextView f74540O0;

    /* renamed from: P0 */
    View f74541P0;

    /* renamed from: Q0 */
    String f74542Q0 = "";

    /* renamed from: R0 */
    String f74543R0 = "";

    /* renamed from: S0 */
    String f74544S0 = "";

    /* renamed from: T0 */
    String f74545T0 = "";

    /* renamed from: U0 */
    String f74546U0 = "";

    /* renamed from: V0 */
    int f74547V0 = 0;

    /* renamed from: W0 */
    int f74548W0;

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f74541P0 = layoutInflater.inflate(AbstractC7409c0.join_security_question_view, (ViewGroup) null);
        if (bundle != null) {
            if (bundle.containsKey("KEY_CURRENT_QUESTION")) {
                this.f74538M0 = (C26400b) bundle.getSerializable("KEY_CURRENT_QUESTION");
            }
            this.f74543R0 = bundle.getString("KEY_ACCOUNT", "");
            this.f74542Q0 = bundle.getString("KEY_PASSWORD", "");
            this.f74544S0 = bundle.getString("KEY_PWD_TOKEN", "");
            this.f74547V0 = bundle.getInt("KEY_SWITCH_ACCOUNT", 0);
            this.f74548W0 = bundle.getInt("KEY_SOURCE_SWITCH", 0);
            this.f74545T0 = bundle.getString("KEY_CAPTCHA_VALUE", "");
            this.f74546U0 = bundle.getString("KEY_CAPTCHA_TOKEN", "");
        }
        Bundle m92642L3 = this.f72421L0.m92642L3();
        if (m92642L3 != null) {
            if (this.f74538M0 == null && m92642L3.containsKey("EXTRA_QUESTION")) {
                try {
                    this.f74538M0 = (C26400b) m92642L3.getSerializable("EXTRA_QUESTION");
                } catch (Exception e11) {
                    AbstractC23350e.m122776f("JoinSecurityQuestionView", e11);
                }
            }
            if (TextUtils.isEmpty(this.f74543R0) && m92642L3.containsKey("EXTRA_ACCOUNT")) {
                this.f74543R0 = m92642L3.getString("EXTRA_ACCOUNT", "");
            }
            if (TextUtils.isEmpty(this.f74542Q0) && m92642L3.containsKey("EXTRA_PASSWORD")) {
                this.f74542Q0 = m92642L3.getString("EXTRA_PASSWORD", "");
            }
            if (TextUtils.isEmpty(this.f74544S0) && m92642L3.containsKey("EXTRA_PWD_TOKEN")) {
                this.f74544S0 = m92642L3.getString("EXTRA_PWD_TOKEN", "");
            }
            this.f74547V0 = m92642L3.getInt("EXTRA_FROM_SWITCH_ACCOUNT", 0);
            this.f74548W0 = m92642L3.getInt("EXTRA_SOURCE_SWITCH_ACCOUNT", 0);
            if (TextUtils.isEmpty(this.f74545T0) && m92642L3.containsKey("EXTRA_CAPTCHA_VALUE")) {
                this.f74545T0 = m92642L3.getString("EXTRA_CAPTCHA_VALUE", "");
            }
            if (TextUtils.isEmpty(this.f74546U0) && m92642L3.containsKey("EXTRA_CAPTCHA_TOKEN")) {
                this.f74546U0 = m92642L3.getString("EXTRA_CAPTCHA_TOKEN", "");
            }
        }
        this.f74540O0 = (TextView) this.f74541P0.findViewById(AbstractC6918a0.tv_note);
        C26400b c26400b = this.f74538M0;
        if (c26400b != null && !TextUtils.isEmpty(c26400b.m136128d())) {
            this.f74540O0.setText(this.f74538M0.m136128d());
        }
        Button button = (Button) this.f74541P0.findViewById(AbstractC6918a0.btn_next);
        this.f74539N0 = button;
        button.setOnClickListener(this);
        return this.f74541P0;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putSerializable("KEY_CURRENT_QUESTION", this.f74538M0);
        bundle.putString("KEY_ACCOUNT", this.f74543R0);
        bundle.putString("KEY_PASSWORD", this.f74542Q0);
        bundle.putString("KEY_PWD_TOKEN", this.f74544S0);
        bundle.putInt("KEY_SWITCH_ACCOUNT", this.f74547V0);
        bundle.putInt("KEY_SOURCE_SWITCH", this.f74548W0);
        bundle.putString("KEY_CAPTCHA_VALUE", this.f74545T0);
        bundle.putString("KEY_CAPTCHA_TOKEN", this.f74546U0);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        try {
            ActionBar actionBar = this.f88760a0;
            if (actionBar != null) {
                actionBar.setTitle(AbstractC23136l9.m118743r0(AbstractC8020f0.security_question_activity_title));
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
        return "JoinSecurityQuestionView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 1001) {
            mo50035CK(i12, intent);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_next && this.f74538M0 != null) {
            AbstractC23647d.m123906p("19901");
            Bundle bundle = new Bundle();
            bundle.putSerializable("EXTRA_QUESTION", this.f74538M0);
            bundle.putString("EXTRA_ACCOUNT", this.f74543R0);
            bundle.putString("EXTRA_PASSWORD", this.f74542Q0);
            bundle.putString("EXTRA_PWD_TOKEN", this.f74544S0);
            bundle.putString("EXTRA_CAPTCHA_VALUE", this.f74545T0);
            bundle.putString("EXTRA_CAPTCHA_TOKEN", this.f74546U0);
            bundle.putInt("EXTRA_FROM_SWITCH_ACCOUNT", this.f74547V0);
            bundle.putInt("EXTRA_SOURCE_SWITCH_ACCOUNT", this.f74548W0);
            if (this.f72421L0.m92648SI() != null) {
                this.f72421L0.m92662fJ().m93066i2(SecurityQuestionView.class, bundle, 1001, 1, true);
            }
            AbstractC23647d.m123893c();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123906p("19900");
            AbstractC23647d.m123893c();
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
