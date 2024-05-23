package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.widget.zvdialog.ZVDialogViewMaterial;
import me0.AbstractC23136l9;
import sb0.AbstractC26218b;
import wl0.InterfaceC29091d;

/* loaded from: classes6.dex */
public class ZVDialogLockAccountSuccess extends ZVDialogViewMaterial {

    /* renamed from: H0 */
    private CharSequence f79526H0;

    /* renamed from: I0 */
    public boolean f79527I0;

    /* renamed from: J0 */
    private InterfaceC29091d.b f79528J0;

    /* renamed from: K0 */
    private RobotoTextView f79529K0;

    /* renamed from: com.zing.zalo.ui.zviews.ZVDialogLockAccountSuccess$a */
    /* loaded from: classes6.dex */
    public static class C15379a extends ZVDialogViewMaterial.C13824a {

        /* renamed from: j */
        private CharSequence f79530j;

        /* renamed from: k */
        private boolean f79531k;

        /* renamed from: l */
        private InterfaceC29091d.b f79532l;

        /* renamed from: q */
        public ZVDialogLockAccountSuccess m86913q() {
            return new ZVDialogLockAccountSuccess(this);
        }

        /* renamed from: r */
        public C15379a m86914r(CharSequence charSequence, InterfaceC29091d.b bVar) {
            this.f79530j = charSequence;
            this.f79532l = bVar;
            return this;
        }

        /* renamed from: s */
        public C15379a m86915s(boolean z11) {
            this.f79531k = z11;
            return this;
        }
    }

    public ZVDialogLockAccountSuccess() {
        this.f79527I0 = true;
    }

    @Override // com.zing.zalo.zview.ZVDialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        if (bundle != null) {
            this.f79527I0 = bundle.getBoolean("isResetPass", true);
        }
    }

    @Override // com.zing.zalo.p077ui.widget.zvdialog.ZVDialogViewMaterial
    /* renamed from: PK */
    protected View mo77078PK(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.dialog_lock_account_success, (ViewGroup) null);
        try {
            RobotoTextView robotoTextView = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_content);
            if (robotoTextView != null) {
                if (this.f79527I0) {
                    String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_text_get_password);
                    String m118746s0 = AbstractC23136l9.m118746s0(AbstractC8020f0.str_des_dialog_lock_account_success_reset, m118743r0);
                    int indexOf = m118746s0.indexOf(m118743r0);
                    SpannableString spannableString = new SpannableString(m118746s0);
                    spannableString.setSpan(new StyleSpan(1), indexOf, m118743r0.length() + indexOf, 33);
                    robotoTextView.setText(spannableString);
                } else {
                    robotoTextView.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_des_dialog_lock_account_success));
                }
            }
            RobotoTextView robotoTextView2 = (RobotoTextView) inflate.findViewById(AbstractC6918a0.btn_close);
            this.f79529K0 = robotoTextView2;
            if (robotoTextView2 != null) {
                if (!TextUtils.isEmpty(this.f79526H0)) {
                    this.f79529K0.setVisibility(0);
                    this.f79529K0.setText(this.f79526H0);
                } else {
                    this.f79529K0.setVisibility(8);
                }
                AbstractC26218b.m134778b(this.f79529K0, this, this.f79528J0, 0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.ZVDialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: SJ */
    public void mo37118SJ(Bundle bundle) {
        super.mo37118SJ(bundle);
        bundle.putBoolean("isResetPass", this.f79527I0);
    }

    public ZVDialogLockAccountSuccess(C15379a c15379a) {
        super(c15379a);
        this.f79527I0 = true;
        this.f79527I0 = c15379a.f79531k;
        this.f79526H0 = c15379a.f79530j;
        this.f79528J0 = c15379a.f79532l;
    }
}
