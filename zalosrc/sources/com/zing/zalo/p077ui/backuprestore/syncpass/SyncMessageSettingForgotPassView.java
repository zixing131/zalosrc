package com.zing.zalo.p077ui.backuprestore.syncpass;

import ac.InterfaceC0733x;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncMessageSettingForgotPassView;
import com.zing.zalo.p077ui.backuprestore.widget.SyncBackupInfoV2View;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import ho0.AbstractC20110a;
import p320ld.C22447s;
import p361nb.AbstractC23647d;
import p525ti.C26701b;
import si.C26263i;

/* loaded from: classes5.dex */
public class SyncMessageSettingForgotPassView extends SyncPassDeleteView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: Q0 */
    private SyncBackupInfoV2View f56050Q0;

    /* renamed from: R0 */
    private C8009j f56051R0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m58321nM(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        AbstractC23647d.m123897g("711330");
        m58338hM();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public static /* synthetic */ void m58322oM(InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC23647d.m123897g("5811301");
        if (interfaceC17463d != null) {
            try {
                interfaceC17463d.dismiss();
            } catch (Exception unused) {
            }
        }
        AbstractC23647d.m123897g("711331");
    }

    /* renamed from: pM */
    private void m58323pM() {
        C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
        aVar.m43159h(1).m43172u(m92652XI(AbstractC8020f0.sync_pass_forgot_pass_dialog_title)).m43173v(3).m43162k(m92652XI(AbstractC8020f0.sync_pass_forgot_pass_dialog_message));
        aVar.m43170s(m92652XI(AbstractC8020f0.str_yes), new InterfaceC17463d.d() { // from class: b50.t
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SyncMessageSettingForgotPassView.this.m58321nM(interfaceC17463d, i11);
            }
        });
        aVar.m43165n(m92652XI(AbstractC8020f0.sync_pass_popup_promt_pass_cancel), new InterfaceC17463d.d() { // from class: b50.u
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                SyncMessageSettingForgotPassView.m58322oM(interfaceC17463d, i11);
            }
        });
        C8009j m43152a = aVar.m43152a();
        this.f56051R0 = m43152a;
        m43152a.mo13822K();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_sync_password_remove, viewGroup, false);
        this.f56050Q0 = (SyncBackupInfoV2View) inflate.findViewById(AbstractC6918a0.sync_backup_info_view);
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_remove_backup_pass);
        RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_warning_forgot_pass_sync_del);
        String m92652XI = m92652XI(AbstractC8020f0.sync_pass_forgot_pass_warning_remove_2);
        int indexOf = m92652XI.indexOf("#x#");
        String replace = m92652XI.replace("#x#", " ");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m92651WI().getColor(AbstractC16801x.cNotify5)), indexOf + 1, replace.length(), 33);
        robotoTextView2.setText(spannableStringBuilder);
        robotoTextView.setOnClickListener(this);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("711328");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncPassDeleteView, com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        C8009j c8009j = this.f56051R0;
        if (c8009j != null && c8009j.m92868m()) {
            try {
                this.f56051R0.dismiss();
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
        super.mo13886RJ();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(m92652XI(AbstractC8020f0.sync_pass_forgot_pass_title));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        C26701b m137265a = C26701b.m137265a();
        C22447s.m116032f(C26263i.m135058w(), m137265a);
        this.f56050Q0.m58384V(m137265a);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncMessageSettingForgotPassView";
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncPassDeleteView
    /* renamed from: iM */
    public int mo58324iM() {
        return 2;
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncpass.SyncPassDeleteView
    /* renamed from: kM */
    public void mo58325kM() {
        mo50035CK(-1, null);
        finish();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == AbstractC6918a0.btn_remove_backup_pass) {
            AbstractC23647d.m123897g("711329");
            m58323pM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("711328");
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
