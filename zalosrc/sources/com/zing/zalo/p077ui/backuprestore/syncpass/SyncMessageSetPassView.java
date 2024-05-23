package com.zing.zalo.p077ui.backuprestore.syncpass;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import am.AbstractC0924m0;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageSetPassView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import me0.AbstractC23136l9;
import p320ld.AbstractC22429a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import zl0.AbstractC32234k;

/* loaded from: classes5.dex */
public class SyncMessageSetPassView extends SyncMsgEditPwdBaseView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: R0 */
    private CustomEditText f56043R0;

    /* renamed from: S0 */
    private CustomEditText f56044S0;

    /* renamed from: T0 */
    private RobotoTextView f56045T0;

    /* renamed from: U0 */
    private RobotoTextView f56046U0;

    /* renamed from: V0 */
    private RobotoTextView f56047V0;

    /* renamed from: W0 */
    private RobotoTextView f56048W0;

    /* renamed from: X0 */
    private View f56049X0;

    /* renamed from: vM */
    private boolean m58315vM(String str, String str2) {
        if (!AbstractC22429a.m115863a(str)) {
            AbstractC23136l9.m118753u1(this.f56043R0, this.f56047V0);
            this.f56048W0.setVisibility(8);
            C0815e1.m2075D().m2105c(12, 0, 1, "-1000");
            return false;
        }
        AbstractC23136l9.m118756v1(this.f56043R0, this.f56047V0);
        if (!str.equals(str2)) {
            AbstractC23136l9.m118753u1(this.f56044S0, this.f56048W0);
            this.f56045T0.setEnabled(false);
            this.f56047V0.setVisibility(8);
            C0815e1.m2075D().m2105c(12, 0, 1, "-1001");
            return false;
        }
        AbstractC23136l9.m118756v1(this.f56044S0, this.f56048W0);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m58316wM(View view, boolean z11) {
        int i11;
        View view2 = this.f56049X0;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        view2.setBackgroundResource(i11);
        if (z11) {
            this.f56043R0.setRightDrawable(null);
            this.f56043R0.setEnableClearText(true);
            this.f56043R0.setTag(Boolean.TRUE);
            if (this.f56047V0.getVisibility() == 0) {
                this.f56047V0.setVisibility(8);
                return;
            }
            return;
        }
        if (((Boolean) this.f56043R0.getTag()).booleanValue()) {
            if (!AbstractC22429a.m115863a(this.f56043R0.getText().toString())) {
                AbstractC23136l9.m118753u1(this.f56043R0, this.f56047V0);
                this.f56048W0.setVisibility(8);
            } else {
                AbstractC23136l9.m118756v1(this.f56043R0, this.f56047V0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public /* synthetic */ void m58317xM(View view, boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        view.setBackgroundResource(i11);
        if (z11) {
            this.f56044S0.setEnableClearText(true);
            view.setTag(Boolean.TRUE);
            if (this.f56048W0.getVisibility() == 0) {
                this.f56048W0.setVisibility(8);
            }
        }
    }

    /* renamed from: yM */
    private boolean m58318yM(String str, String str2) {
        AbstractC2379w.m12430d(this.f56044S0);
        if (m58315vM(str, str2)) {
            this.f56047V0.setVisibility(8);
            this.f56048W0.setVisibility(8);
            AbstractC0924m0.m3641Zo(0);
            AbstractC0924m0.m3731cp(0);
            AbstractC23306f.m120668h().m132674O(str);
            m58331pM();
            return true;
        }
        AbstractC23647d.m123897g("711304");
        return false;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (m92642L3() != null) {
            m58332rM(m92642L3().getInt("EXTRA_SOURCE_ACTION", 0));
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        AbstractC2379w.m12430d(this.f56044S0);
        super.mo13886RJ();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncMessageSetPassView";
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: kM */
    protected void mo58266kM() {
        boolean z11;
        String obj = this.f56043R0.getText().toString();
        String obj2 = this.f56044S0.getText().toString();
        RobotoTextView robotoTextView = this.f56045T0;
        if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2)) {
            z11 = true;
        } else {
            z11 = false;
        }
        robotoTextView.setEnabled(z11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: lM */
    protected int mo58267lM() {
        return 10;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: mM */
    protected View mo58268mM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(AbstractC7409c0.setting_sync_mes_set_pass, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: nM */
    protected int mo58269nM() {
        return AbstractC8020f0.sync_set_pass_screen_title;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: oM */
    protected void mo58270oM(View view) {
        this.f56043R0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_enter_pass);
        CustomEditText customEditText = (CustomEditText) view.findViewById(AbstractC6918a0.et_reenter_pass);
        this.f56044S0 = customEditText;
        m58330jM(this.f56043R0, customEditText);
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_save_pass);
        this.f56045T0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        this.f56047V0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_pass_error);
        this.f56048W0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_repass_error);
        RobotoTextView robotoTextView2 = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_show_password);
        this.f56046U0 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        this.f56049X0 = view.findViewById(AbstractC6918a0.layout_enter_pass);
        AbstractC32234k.m155469a(this.f56043R0, AbstractC16803z.chat_bar_text_cursor);
        AbstractC32234k.m155469a(this.f56044S0, AbstractC16803z.chat_bar_text_cursor);
        this.f56043R0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.r
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                SyncMessageSetPassView.this.m58316wM(view2, z11);
            }
        });
        this.f56044S0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.s
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                SyncMessageSetPassView.this.m58317xM(view2, z11);
            }
        });
        ((RobotoTextView) view.findViewById(AbstractC6918a0.tv_notice_set_pass)).setText(m92652XI(AbstractC8020f0.sync_pass_warning) + " " + m92652XI(AbstractC8020f0.sync_set_pass_screen_notice));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_save_pass) {
            m58318yM(this.f56043R0.getText().toString(), this.f56044S0.getText().toString());
            return;
        }
        if (id2 == AbstractC6918a0.btn_show_password) {
            if (this.f56046U0.getText().toString().equals(m92652XI(AbstractC8020f0.startup_show_password))) {
                this.f56046U0.setText(m92652XI(AbstractC8020f0.startup_hide_password));
                AbstractC22429a.m115865c(this.f56043R0);
                AbstractC22429a.m115865c(this.f56044S0);
            } else {
                this.f56046U0.setText(m92652XI(AbstractC8020f0.startup_show_password));
                AbstractC22429a.m115864b(this.f56043R0);
                AbstractC22429a.m115864b(this.f56044S0);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: qM */
    protected void mo58271qM() {
        AbstractC2379w.m12432f(this.f56043R0);
    }
}
