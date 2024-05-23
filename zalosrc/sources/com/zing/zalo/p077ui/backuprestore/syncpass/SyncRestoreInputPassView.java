package com.zing.zalo.p077ui.backuprestore.syncpass;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import au.AbstractC2379w;
import c50.C3297h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreBaseView;
import com.zing.zalo.p077ui.backuprestore.syncpass.SyncRestoreInputPassView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.uicontrol.CustomEditText;
import ed0.AbstractC18391a;
import p320ld.AbstractC22429a;
import p348mi.AbstractC23306f;
import p361nb.AbstractC23647d;
import p479rc.C25724a;
import si.C26263i;

/* loaded from: classes5.dex */
public class SyncRestoreInputPassView extends SyncRestoreBaseView implements View.OnClickListener, InterfaceC0733x {

    /* renamed from: R0 */
    private RobotoTextView f56056R0;

    /* renamed from: S0 */
    private CustomEditText f56057S0;

    /* renamed from: T0 */
    private RobotoTextView f56058T0;

    /* renamed from: U0 */
    private RobotoTextView f56059U0;

    /* renamed from: V0 */
    private ViewGroup f56060V0;

    /* renamed from: W0 */
    private final C25724a f56061W0 = AbstractC23306f.m120668h();

    /* renamed from: com.zing.zalo.ui.backuprestore.syncpass.SyncRestoreInputPassView$a */
    /* loaded from: classes5.dex */
    class C11134a extends AbstractC18391a {
        C11134a() {
        }

        @Override // ed0.AbstractC18391a, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            SyncRestoreInputPassView.this.f56056R0.setEnabled(!TextUtils.isEmpty(editable.toString()));
        }
    }

    /* renamed from: mM */
    private boolean m58342mM(String str) {
        if (TextUtils.isEmpty(str) || !this.f56061W0.m132681W(str, 1)) {
            return false;
        }
        this.f56061W0.m132674O(str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: nM */
    public /* synthetic */ void m58343nM(View view) {
        this.f56059U0.setVisibility(8);
        AbstractC2379w.m12432f(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: oM */
    public /* synthetic */ void m58344oM(View view, boolean z11) {
        int i11;
        ViewGroup viewGroup = this.f56060V0;
        if (z11) {
            i11 = AbstractC16803z.edt_active;
        } else {
            i11 = AbstractC16803z.edt_normal;
        }
        viewGroup.setBackgroundResource(i11);
    }

    /* renamed from: pM */
    private void m58345pM(int i11) {
        if (i11 != 2) {
            if (i11 != 3) {
                if (i11 != 5) {
                    if (i11 != 13) {
                        if (i11 != 7) {
                            if (i11 == 8) {
                                AbstractC23647d.m123897g("711337");
                                return;
                            }
                            return;
                        }
                        AbstractC23647d.m123897g("711336");
                        return;
                    }
                    AbstractC23647d.m123897g("711334");
                    return;
                }
                AbstractC23647d.m123897g("711333");
                return;
            }
            AbstractC23647d.m123897g("711332");
            return;
        }
        AbstractC23647d.m123897g("711335");
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreBaseView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle == null && m92642L3() != null) {
            m58345pM(m58242hM());
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.setting_sync_restore_input_password, viewGroup, false);
        RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_confirm_pass);
        this.f56056R0 = robotoTextView;
        robotoTextView.setOnClickListener(this);
        this.f56060V0 = (ViewGroup) inflate.findViewById(AbstractC6918a0.layout_old_pass);
        CustomEditText customEditText = (CustomEditText) inflate.findViewById(AbstractC6918a0.et_sync_pass);
        this.f56057S0 = customEditText;
        customEditText.setDeleteClickListener(new View.OnClickListener() { // from class: b50.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SyncRestoreInputPassView.this.m58343nM(view);
            }
        });
        this.f56057S0.setFocusChangeListener(new View.OnFocusChangeListener() { // from class: b50.x
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z11) {
                SyncRestoreInputPassView.this.m58344oM(view, z11);
            }
        });
        this.f56057S0.addTextChangedListener(new C11134a());
        inflate.findViewById(AbstractC6918a0.sync_forgot_pass).setOnClickListener(this);
        RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_show_hide_password);
        this.f56058T0 = robotoTextView2;
        robotoTextView2.setOnClickListener(this);
        this.f56059U0 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tvError1);
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332) {
            Intent intent = new Intent();
            intent.putExtra("extra_entry_point", m58242hM());
            mo50035CK(0, intent);
            finish();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: TJ */
    public void mo37493TJ() {
        super.mo37493TJ();
        C3297h.m16742n(this.f88760a0);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: VJ */
    public void mo37712VJ() {
        AbstractC2379w.m12430d(this.f56057S0);
        super.mo37712VJ();
    }

    @Override // com.zing.zalo.p077ui.backuprestore.syncmessage.SyncRestoreBaseView, ac.InterfaceC0733x
    public String getTrackingKey() {
        return "SyncRestoreInputPassView";
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        if (i11 == 18052 && i12 == -1) {
            Intent intent2 = new Intent();
            intent2.putExtra("extra_entry_point", m58242hM());
            intent2.putExtra("extra_delete_data", true);
            mo50035CK(-1, intent2);
            finish();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_confirm_pass) {
            AbstractC2379w.m12430d(this.f56057S0);
            if (m58342mM(this.f56057S0.getText().toString())) {
                AbstractC23647d.m123897g("711340");
                this.f56059U0.setVisibility(8);
                Intent intent = new Intent();
                intent.putExtra("extra_entry_point", m58242hM());
                mo50035CK(-1, intent);
                finish();
                return;
            }
            AbstractC23647d.m123897g("711338");
            this.f56059U0.setVisibility(0);
            C0815e1.m2075D().m2105c(12, 0, 0, "-1002");
            return;
        }
        if (id2 == AbstractC6918a0.sync_forgot_pass) {
            Bundle bundle = new Bundle();
            bundle.putString("open_url", AbstractC23306f.m120583H().m110204g().m116319k());
            this.f72421L0.m92662fJ().m93069k2(SyncHelpView.class, bundle, 0, true);
            AbstractC23647d.m123897g("711342");
            AbstractC23647d.m123897g("711343");
            return;
        }
        if (id2 == AbstractC6918a0.tv_show_hide_password) {
            if (this.f56058T0.getText().toString().equals(m92652XI(AbstractC8020f0.startup_show_password))) {
                this.f56058T0.setText(m92652XI(AbstractC8020f0.startup_hide_password));
                AbstractC22429a.m115865c(this.f56057S0);
            } else {
                this.f56058T0.setText(m92652XI(AbstractC8020f0.startup_show_password));
                AbstractC22429a.m115864b(this.f56057S0);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            Intent intent = new Intent();
            intent.putExtra("extra_entry_point", m58242hM());
            mo50035CK(0, intent);
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    public void onResume() {
        super.onResume();
        if (C26263i.m135055u().m135071M()) {
            finish();
        } else {
            AbstractC2379w.m12432f(this.f56057S0);
        }
    }
}
