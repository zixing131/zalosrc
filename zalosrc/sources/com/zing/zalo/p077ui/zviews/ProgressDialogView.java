package com.zing.zalo.p077ui.zviews;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* loaded from: classes6.dex */
public class ProgressDialogView extends DialogView {

    /* renamed from: H0 */
    private TextView f76505H0;

    /* renamed from: I0 */
    private CharSequence f76506I0;

    /* renamed from: J0 */
    private View f76507J0;

    public ProgressDialogView() {
        m92601SK(0, AbstractC8915g0.alertdialog);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.progress_dialog, viewGroup, false);
        this.f76507J0 = inflate;
        return inflate;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: TK */
    public void mo83093TK(C17487o0 c17487o0) {
        super.m92602UK(c17487o0, "ProgressDialogView");
    }

    /* renamed from: WK */
    public final void m83097WK(CharSequence charSequence) {
        this.f76506I0 = charSequence;
        TextView textView = this.f76505H0;
        if (textView != null) {
            if (charSequence == null) {
                textView.setVisibility(8);
            }
            this.f76505H0.setText(this.f76506I0);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        super.mo37125ZJ(view, bundle);
        TextView textView = (TextView) this.f76507J0.findViewById(AbstractC6918a0.progress_dialog_msg);
        this.f76505H0 = textView;
        CharSequence charSequence = this.f76506I0;
        if (charSequence != null) {
            textView.setText(charSequence);
        } else {
            textView.setVisibility(8);
        }
        KeyEventCallbackC17462c m92594JK = m92594JK();
        if (m92594JK != null) {
            m92594JK.m92874z(false);
        }
    }
}
