package com.zing.zalo.p077ui.backuprestore.syncpass;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageOffPassView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import ho0.AbstractC20110a;
import p320ld.AbstractC22429a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import zl0.AbstractC32234k;

/* loaded from: classes5.dex */
public class SyncMessageOffPassView extends SyncMsgEditPwdBaseView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: R0 */
    RobotoTextView f56038R0;

    /* renamed from: S0 */
    CustomEditText f56039S0;

    /* renamed from: T0 */
    RobotoTextView f56040T0;

    /* renamed from: U0 */
    RobotoTextView f56041U0;

    /* renamed from: uM */
    private boolean m58307uM(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return AbstractC23306f.m120668h().m132681W(str, 1);
    }

    /* renamed from: vM */
    public static /* synthetic */ void m58308vM(View view, boolean z11) {
        int i11;
        AbstractC20110a.m104535d("OnFocuschange", new Object[0]);
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        view.setBackgroundResource(i11);
    }

    /* renamed from: wM */
    private void m58309wM() {
        AbstractC23306f.m120668h().m132688g();
        m58331pM();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        AbstractC2379w.m12430d(this.f56039S0);
        super.mo13886RJ();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncMessageOffPassView";
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: kM */
    protected void mo58266kM() {
        this.f56040T0.setEnabled(!TextUtils.isEmpty(this.f56039S0.getText().toString()));
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: lM */
    protected int mo58267lM() {
        return 12;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: mM */
    protected View mo58268mM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(AbstractC7409c0.setting_sync_messgae_off_pass, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: nM */
    protected int mo58269nM() {
        return AbstractC8020f0.sync_pass_manage_set_pass_off;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: oM */
    protected void mo58270oM(View view) {
        this.f56038R0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvError1);
        CustomEditText customEditText = (CustomEditText) view.findViewById(AbstractC6918a0.et_oldpass);
        this.f56039S0 = customEditText;
        try {
            AbstractC32234k.m155469a(customEditText, AbstractC16803z.chat_bar_text_cursor);
        } catch (Exception unused) {
        }
        m58330jM(this.f56039S0);
        this.f56039S0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.q
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                SyncMessageOffPassView.m58308vM(view2, z11);
            }
        });
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_off_pass);
        this.f56040T0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        RobotoTextView robotoTextView2 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_show_hide_old_password);
        this.f56041U0 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_off_pass) {
            if (m58307uM(this.f56039S0.getText().toString())) {
                AbstractC2379w.m12430d(this.f56039S0);
                this.f56038R0.setVisibility(8);
                m58309wM();
                return;
            } else {
                this.f56038R0.setVisibility(0);
                AbstractC23647d.m123897g("711316");
                C0815e1.m2075D().m2105c(12, 0, 3, "-1002");
                return;
            }
        }
        if (id2 == AbstractC6918a0.tv_show_hide_old_password) {
            if (this.f56041U0.getText().toString().equals(m92652XI(AbstractC8020f0.startup_show_password))) {
                this.f56041U0.setText(m92652XI(AbstractC8020f0.startup_hide_password));
                AbstractC22429a.m115865c(this.f56039S0);
            } else {
                this.f56041U0.setText(m92652XI(AbstractC8020f0.startup_show_password));
                AbstractC22429a.m115864b(this.f56039S0);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: qM */
    protected void mo58271qM() {
        AbstractC2379w.m12432f(this.f56039S0);
    }
}
