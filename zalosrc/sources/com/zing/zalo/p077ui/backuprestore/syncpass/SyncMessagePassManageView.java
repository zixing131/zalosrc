package com.zing.zalo.p077ui.backuprestore.syncpass;

import ac.InterfaceC0733x;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.p077ui.zviews.SlidableZaloView;
import com.zing.zalo.zview.actionbar.ActionBar;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import ho0.AbstractC20110a;
import p320ld.C22447s;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import si.C26263i;

/* loaded from: classes5.dex */
public class SyncMessagePassManageView extends SlidableZaloView implements View.OnClickListener, InterfaceC17463d.d, InterfaceC0733x {

    /* renamed from: P0 */
    private StencilSwitch f56042P0;

    /* renamed from: gM */
    private void m58310gM() {
        SyncMsgEditPwdBaseView.m58329sM(this.f72421L0.m92662fJ(), SyncMessageChangePassView.class, 18041);
    }

    /* renamed from: hM */
    private void m58311hM() {
        SyncMsgEditPwdBaseView.m58329sM(this.f72421L0.m92662fJ(), SyncMessageOffPassView.class, 18043);
    }

    /* renamed from: iM */
    private boolean m58312iM() {
        if (AbstractC23306f.m120676j().m128398O() && C22447s.m116043k0(C26263i.m135058w())) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    return null;
                }
                C8009j.a aVar = new C8009j.a(this.f72421L0.m92648SI());
                aVar.m43159h(4).m43172u(m92652XI(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(m92652XI(AbstractC8020f0.str_dialog_desc_restore_before_backup_off_pwd)).m43165n(m92652XI(AbstractC8020f0.str_dialog_negative_btn_restore_before_backup_pwd), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_dialog_positive_btn_restore_before_backup_pwd), this);
                return aVar.m43152a();
            }
            C8009j.a aVar2 = new C8009j.a(this.f72421L0.m92648SI());
            aVar2.m43159h(4).m43172u(m92652XI(AbstractC8020f0.str_dialog_confirm_backup_overwrite_title)).m43173v(3).m43162k(m92652XI(AbstractC8020f0.str_dialog_desc_restore_before_backup_change_pwd)).m43165n(m92652XI(AbstractC8020f0.str_dialog_negative_btn_restore_before_backup_pwd), new InterfaceC17463d.b()).m43170s(m92652XI(AbstractC8020f0.str_dialog_positive_btn_restore_before_backup_pwd), this);
            return aVar2.m43152a();
        }
        C8009j.a aVar3 = new C8009j.a(this.f72421L0.m92648SI());
        aVar3.m43159h(8);
        aVar3.m43172u(m92652XI(AbstractC8020f0.str_sync_title_warning_off_pass));
        aVar3.m43173v(3);
        aVar3.m43162k(m92652XI(AbstractC8020f0.str_sync_desc_warning_off_pass));
        aVar3.m43165n(m92652XI(AbstractC8020f0.cancel), new InterfaceC17463d.b());
        aVar3.m43170s(m92652XI(AbstractC8020f0.str_sync_warning_off_pass_turn_off), this);
        return aVar3.m43152a();
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC20110a.m104543l("SMLPassManageView").mo104548a("onCreateView", new Object[0]);
        View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.setting_sync_message_pass_manage, viewGroup, false);
        inflate.findViewById(AbstractC6918a0.setting_pass_on_off).setOnClickListener(this);
        inflate.findViewById(AbstractC6918a0.setting_change_pass).setOnClickListener(this);
        inflate.findViewById(AbstractC6918a0.setting_remove_pass).setOnClickListener(this);
        StencilSwitch stencilSwitch = (StencilSwitch) inflate.findViewById(AbstractC6918a0.switch_pass);
        this.f56042P0 = stencilSwitch;
        stencilSwitch.setOnClickListener(this);
        inflate.findViewById(AbstractC6918a0.layout_delete_backup).setOnClickListener(this);
        return inflate;
    }

    @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
    /* renamed from: K8 */
    public void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
        if (interfaceC17463d.mo92862f() == 1) {
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                if (!m58312iM()) {
                    m58311hM();
                    return;
                } else {
                    showDialog(3);
                    return;
                }
            }
            return;
        }
        if (interfaceC17463d.mo92862f() == 2) {
            if (i11 == -1) {
                interfaceC17463d.dismiss();
                m58310gM();
                return;
            }
            return;
        }
        if (interfaceC17463d.mo92862f() == 3 && i11 == -1) {
            interfaceC17463d.dismiss();
            m58311hM();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            AbstractC23647d.m123897g("711310");
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        AbstractC20110a.m104543l("SMLPassManageView").mo104548a("onPause", new Object[0]);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        ActionBar actionBar = this.f88760a0;
        if (actionBar != null) {
            actionBar.setTitle(m92652XI(AbstractC8020f0.sync_pass_manage_title));
            this.f88760a0.setBackButtonImage(AbstractC16803z.stencils_ic_head_back_white);
            this.f88760a0.setBackgroundResource(AbstractC16803z.stencil_bg_action_bar);
        }
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncMessagePassManageView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        AbstractC20110a.m104543l("SMLPassManageView").mo104548a("onActivityResult", new Object[0]);
        super.onActivityResult(i11, i12, intent);
        switch (i11) {
            case 18041:
                if (i12 == -1) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("extra_action", 2);
                    mo50035CK(-1, intent2);
                    this.f88756W = 0;
                    finish();
                    return;
                }
                return;
            case 18042:
                if (i12 == -1) {
                    Intent intent3 = new Intent();
                    intent3.putExtra("extra_action", 3);
                    mo50035CK(-1, intent3);
                    this.f88756W = 0;
                    finish();
                    return;
                }
                return;
            case 18043:
                if (i12 == -1) {
                    Intent intent4 = new Intent();
                    intent4.putExtra("extra_action", 1);
                    mo50035CK(-1, intent4);
                    this.f88756W = 0;
                    finish();
                    return;
                }
                this.f56042P0.setChecked(C26263i.m135053s());
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.setting_change_pass) {
            if (!m58312iM()) {
                m58310gM();
            } else {
                showDialog(2);
            }
            AbstractC23647d.m123897g("711312");
            return;
        }
        if (id2 != AbstractC6918a0.setting_remove_pass && id2 != AbstractC6918a0.layout_delete_backup) {
            if (id2 == AbstractC6918a0.setting_pass_on_off || id2 == AbstractC6918a0.switch_pass) {
                showDialog(1);
                AbstractC23647d.m123897g("711311");
                return;
            }
            return;
        }
        AbstractC23647d.m123897g("711327");
        this.f72421L0.m92662fJ().m93066i2(SyncMessageSettingForgotPassView.class, null, 18042, 1, true);
        AbstractC23647d.m123897g("711313");
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            AbstractC23647d.m123897g("711310");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        AbstractC20110a.m104543l("SMLPassManageView").mo104548a("onResume", new Object[0]);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        AbstractC20110a.m104543l("SMLPassManageView").mo104548a("onActivityCreated", new Object[0]);
    }
}
