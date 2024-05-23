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
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageChangePassView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import me0.AbstractC23136l9;
import p320ld.AbstractC22429a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p479rc.C25724a;
import zl0.AbstractC32234k;

/* loaded from: classes5.dex */
public class SyncMessageChangePassView extends SyncMsgEditPwdBaseView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: R0 */
    RobotoTextView f56019R0;

    /* renamed from: S0 */
    RobotoTextView f56020S0;

    /* renamed from: T0 */
    RobotoTextView f56021T0;

    /* renamed from: U0 */
    CustomEditText f56022U0;

    /* renamed from: V0 */
    CustomEditText f56023V0;

    /* renamed from: W0 */
    CustomEditText f56024W0;

    /* renamed from: X0 */
    RobotoTextView f56025X0;

    /* renamed from: Y0 */
    RobotoTextView f56026Y0;

    /* renamed from: Z0 */
    RobotoTextView f56027Z0;

    /* renamed from: a1 */
    ViewGroup f56028a1;

    /* renamed from: b1 */
    private final C25724a f56029b1 = AbstractC23306f.m120668h();

    /* renamed from: AM */
    private void m58258AM(String str, String str2, String str3) {
        AbstractC2379w.m12430d(this.f56022U0);
        if (m58262wM(str, str2, str3)) {
            this.f56019R0.setVisibility(8);
            this.f56020S0.setVisibility(8);
            this.f56021T0.setVisibility(8);
            AbstractC23306f.m120668h().m132674O(str2);
            m58331pM();
            return;
        }
        AbstractC23647d.m123897g("711323");
    }

    /* renamed from: wM */
    private boolean m58262wM(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && this.f56029b1.m132681W(str, 1)) {
            AbstractC23136l9.m118756v1(this.f56022U0, this.f56019R0);
            if (!AbstractC22429a.m115863a(str2)) {
                this.f56019R0.setVisibility(8);
                this.f56021T0.setVisibility(8);
                AbstractC23136l9.m118753u1(this.f56023V0, this.f56020S0);
                C0815e1.m2075D().m2105c(12, 0, 2, "-1000");
                return false;
            }
            AbstractC23136l9.m118756v1(this.f56023V0, this.f56020S0);
            if (!str2.equals(str3)) {
                this.f56019R0.setVisibility(8);
                this.f56020S0.setVisibility(8);
                AbstractC23136l9.m118753u1(this.f56024W0, this.f56021T0);
                C0815e1.m2075D().m2105c(12, 0, 2, "-1001");
                return false;
            }
            AbstractC23136l9.m118756v1(this.f56024W0, this.f56021T0);
            return true;
        }
        this.f56020S0.setVisibility(8);
        this.f56021T0.setVisibility(8);
        AbstractC23136l9.m118753u1(this.f56022U0, this.f56019R0);
        C0815e1.m2075D().m2105c(12, 0, 2, "-1002");
        return false;
    }

    /* renamed from: xM */
    public /* synthetic */ void m58263xM(View view, boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        view.setBackgroundResource(i11);
        if (z11) {
            this.f56022U0.setRightDrawable(null);
            this.f56022U0.setEnableClearText(true);
            view.setTag(Boolean.TRUE);
            this.f56019R0.setVisibility(8);
            return;
        }
        if (((Boolean) view.getTag()).booleanValue()) {
            String obj = this.f56022U0.getText().toString();
            if (!TextUtils.isEmpty(obj) && this.f56029b1.m132681W(obj, 1)) {
                AbstractC23136l9.m118756v1(this.f56022U0, this.f56019R0);
            } else {
                AbstractC23136l9.m118753u1(this.f56022U0, this.f56019R0);
            }
        }
    }

    /* renamed from: yM */
    public /* synthetic */ void m58264yM(View view, boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        view.setBackgroundResource(i11);
        if (z11) {
            this.f56023V0.setRightDrawable(null);
            this.f56023V0.setEnableClearText(true);
            view.setTag(Boolean.TRUE);
            this.f56020S0.setVisibility(8);
            return;
        }
        if (((Boolean) view.getTag()).booleanValue()) {
            if (!AbstractC22429a.m115863a(this.f56023V0.getText().toString())) {
                AbstractC23136l9.m118753u1(this.f56023V0, this.f56020S0);
            } else {
                AbstractC23136l9.m118756v1(this.f56023V0, this.f56020S0);
            }
        }
    }

    /* renamed from: zM */
    public /* synthetic */ void m58265zM(View view, boolean z11) {
        int i11;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        view.setBackgroundResource(i11);
        if (z11) {
            this.f56024W0.setRightDrawable(null);
            this.f56024W0.setEnableClearText(true);
            view.setTag(Boolean.TRUE);
            this.f56021T0.setVisibility(8);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        AbstractC2379w.m12430d(this.f56022U0);
        super.mo37712VJ();
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncMessageChangePassView";
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: kM */
    protected void mo58266kM() {
        boolean z11;
        String obj = this.f56022U0.getText().toString();
        String obj2 = this.f56023V0.getText().toString();
        String obj3 = this.f56024W0.getText().toString();
        RobotoTextView robotoTextView = this.f56025X0;
        if (!TextUtils.isEmpty(obj) && !TextUtils.isEmpty(obj2) && !TextUtils.isEmpty(obj3)) {
            z11 = true;
        } else {
            z11 = false;
        }
        robotoTextView.setEnabled(z11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: lM */
    protected int mo58267lM() {
        return 11;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: mM */
    protected View mo58268mM(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(AbstractC7409c0.setting_sync_message_change_pass, viewGroup, false);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: nM */
    protected int mo58269nM() {
        return AbstractC8020f0.sync_pass_change_pass_title;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: oM */
    protected void mo58270oM(View view) {
        this.f56028a1 = (ViewGroup) view.findViewById(AbstractC6918a0.rootView);
        this.f56019R0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvError1);
        this.f56020S0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvError2);
        this.f56021T0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tvError3);
        this.f56022U0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_oldpass);
        this.f56023V0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_newpass);
        this.f56024W0 = (CustomEditText) view.findViewById(AbstractC6918a0.et_newpass_confirm);
        try {
            AbstractC32234k.m155469a(this.f56022U0, AbstractC16803z.chat_bar_text_cursor);
            AbstractC32234k.m155469a(this.f56023V0, AbstractC16803z.chat_bar_text_cursor);
            AbstractC32234k.m155469a(this.f56024W0, AbstractC16803z.chat_bar_text_cursor);
        } catch (Exception unused) {
        }
        m58330jM(this.f56023V0, this.f56022U0, this.f56024W0);
        this.f56022U0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.f
            public /* synthetic */ ViewOnFocusChangeListenerC2558f() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                SyncMessageChangePassView.this.m58263xM(view2, z11);
            }
        });
        this.f56023V0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.g
            public /* synthetic */ ViewOnFocusChangeListenerC2559g() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                SyncMessageChangePassView.this.m58264yM(view2, z11);
            }
        });
        this.f56024W0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.h
            public /* synthetic */ ViewOnFocusChangeListenerC2560h() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                SyncMessageChangePassView.this.m58265zM(view2, z11);
            }
        });
        RobotoTextView robotoTextView = (RobotoTextView) view.findViewById(AbstractC6918a0.layout_dochangepass);
        this.f56025X0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        this.f56027Z0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_show_hide_new_password);
        this.f56026Y0 = (RobotoTextView) view.findViewById(AbstractC6918a0.tv_show_hide_old_password);
        this.f56027Z0.setOnClickListener(this);
        this.f56026Y0.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.layout_dochangepass) {
            m58258AM(this.f56022U0.getText().toString(), this.f56023V0.getText().toString(), this.f56024W0.getText().toString());
            return;
        }
        if (id2 == AbstractC6918a0.tv_show_hide_old_password) {
            if (this.f56026Y0.getText().toString().equals(m92652XI(AbstractC8020f0.startup_show_password))) {
                this.f56026Y0.setText(m92652XI(AbstractC8020f0.startup_hide_password));
                AbstractC22429a.m115865c(this.f56022U0);
                return;
            } else {
                this.f56026Y0.setText(m92652XI(AbstractC8020f0.startup_show_password));
                AbstractC22429a.m115864b(this.f56022U0);
                return;
            }
        }
        if (id2 == AbstractC6918a0.tv_show_hide_new_password) {
            if (this.f56027Z0.getText().toString().equals(m92652XI(AbstractC8020f0.startup_show_password))) {
                this.f56027Z0.setText(m92652XI(AbstractC8020f0.startup_hide_password));
                AbstractC22429a.m115865c(this.f56023V0);
                AbstractC22429a.m115865c(this.f56024W0);
            } else {
                this.f56027Z0.setText(m92652XI(AbstractC8020f0.startup_show_password));
                AbstractC22429a.m115864b(this.f56023V0);
                AbstractC22429a.m115864b(this.f56024W0);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncMsgEditPwdBaseView
    /* renamed from: qM */
    protected void mo58271qM() {
        AbstractC2379w.m12432f(this.f56022U0);
    }
}
