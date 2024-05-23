package com.zing.zalo.p077ui.zviews;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.zvdialog.ZVDialogViewMaterial;
import me0.AbstractC23136l9;
import sb0.AbstractC26218b;
import wl0.InterfaceC29091d;

/* loaded from: classes6.dex */
public class ZVDialogConfirmLockAccount extends ZVDialogViewMaterial {

    /* renamed from: H0 */
    private CharSequence f79514H0;

    /* renamed from: I0 */
    private CharSequence f79515I0;

    /* renamed from: J0 */
    private InterfaceC29091d.b f79516J0;

    /* renamed from: K0 */
    private InterfaceC29091d.b f79517K0;

    /* renamed from: L0 */
    private RobotoTextView f79518L0;

    /* renamed from: M0 */
    private CheckBox f79519M0;

    /* renamed from: N0 */
    private int f79520N0;

    /* renamed from: com.zing.zalo.ui.zviews.ZVDialogConfirmLockAccount$a */
    /* loaded from: classes6.dex */
    public static class C15378a extends ZVDialogViewMaterial.C13824a {

        /* renamed from: j */
        private CharSequence f79521j;

        /* renamed from: k */
        private CharSequence f79522k;

        /* renamed from: l */
        private int f79523l;

        /* renamed from: m */
        private InterfaceC29091d.b f79524m;

        /* renamed from: n */
        private InterfaceC29091d.b f79525n;

        /* renamed from: s */
        public ZVDialogConfirmLockAccount m86906s() {
            return new ZVDialogConfirmLockAccount(this);
        }

        /* renamed from: t */
        public C15378a m86907t(CharSequence charSequence, InterfaceC29091d.b bVar) {
            this.f79522k = charSequence;
            this.f79524m = bVar;
            return this;
        }

        /* renamed from: u */
        public C15378a m86908u(CharSequence charSequence, InterfaceC29091d.b bVar) {
            this.f79521j = charSequence;
            this.f79525n = bVar;
            return this;
        }

        /* renamed from: v */
        public C15378a m86909v(int i11) {
            this.f79523l = i11;
            return this;
        }
    }

    public ZVDialogConfirmLockAccount() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: TK */
    public /* synthetic */ void m86899TK(View view) {
        this.f79519M0.setChecked(!r2.isChecked());
    }

    @Override // com.zing.zalo.p077ui.widget.zvdialog.ZVDialogViewMaterial
    /* renamed from: PK */
    protected View mo77078PK(LayoutInflater layoutInflater) {
        int i11;
        View inflate = layoutInflater.inflate(AbstractC7409c0.dialog_lock_account, (ViewGroup) null);
        try {
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.tv_content);
            if (this.f79520N0 == 1) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_notice_dialog_confirm_lock_account);
                String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_des_dialog_confirm_lock_account, m118743r0);
                int indexOf = m118746s0.indexOf(m118743r0);
                SpannableString spannableString = new SpannableString(m118746s0);
                spannableString.setSpan(new StyleSpan(1), indexOf, m118743r0.length() + indexOf, 33);
                textView.setText(spannableString);
            } else {
                textView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_confirm_lock_account));
            }
            View findViewById = inflate.findViewById(AbstractC6918a0.ll_checkbox);
            if (this.f79520N0 == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            findViewById.setVisibility(i11);
            this.f79519M0 = (CheckBox) inflate.findViewById(AbstractC6918a0.checkbox);
            inflate.findViewById(AbstractC6918a0.ll_checkbox).setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.p51
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ZVDialogConfirmLockAccount.this.m86899TK(view);
                }
            });
            RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_lock);
            if (robotoTextView != null) {
                if (!TextUtils.isEmpty(this.f79514H0)) {
                    robotoTextView.setVisibility(0);
                    robotoTextView.setText(this.f79514H0);
                } else {
                    robotoTextView.setVisibility(8);
                }
                AbstractC26218b.m134778b(robotoTextView, this, this.f79516J0, 0);
            }
            RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_close);
            this.f79518L0 = robotoTextView2;
            if (robotoTextView2 != null) {
                if (!TextUtils.isEmpty(this.f79515I0)) {
                    this.f79518L0.setVisibility(0);
                    this.f79518L0.setText(this.f79515I0);
                } else {
                    this.f79518L0.setVisibility(8);
                }
                AbstractC26218b.m134778b(this.f79518L0, this, this.f79517K0, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    /* renamed from: SK */
    public boolean m86900SK() {
        CheckBox checkBox = this.f79519M0;
        if (checkBox != null) {
            return checkBox.isChecked();
        }
        return true;
    }

    public ZVDialogConfirmLockAccount(C15378a c15378a) {
        super(c15378a);
        this.f79520N0 = c15378a.f79523l;
        this.f79514H0 = c15378a.f79521j;
        this.f79515I0 = c15378a.f79522k;
        this.f79516J0 = c15378a.f79525n;
        this.f79517K0 = c15378a.f79524m;
    }
}
