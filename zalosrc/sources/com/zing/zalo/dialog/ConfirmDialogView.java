package com.zing.zalo.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.social.controls.CustomMovementMethod;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.AbstractC17464e;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* loaded from: classes3.dex */
public class ConfirmDialogView extends DialogView {

    /* renamed from: H0 */
    private String f43436H0;

    /* renamed from: I0 */
    private CharSequence f43437I0;

    /* renamed from: J0 */
    private String f43438J0;

    /* renamed from: K0 */
    private String f43439K0;

    /* renamed from: L0 */
    InterfaceC17463d.d f43440L0;

    /* renamed from: M0 */
    InterfaceC17463d.d f43441M0;

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        TextView textView;
        LayoutInflater layoutInflater = (LayoutInflater) m92648SI().getSystemService("layout_inflater");
        KeyEventCallbackC17462c keyEventCallbackC17462c = new KeyEventCallbackC17462c(m92648SI(), AbstractC8915g0.Theme_Dialog_Translucent);
        keyEventCallbackC17462c.m92870v(1);
        View inflate = layoutInflater.inflate(AbstractC7409c0.confirm_dialog, (ViewGroup) null);
        keyEventCallbackC17462c.m92859c(inflate, new ViewGroup.LayoutParams(-1, -2));
        ((TextView) inflate.findViewById(AbstractC6918a0.confirm_title)).setText(this.f43436H0);
        Button button = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
        String str = this.f43438J0;
        if (str != null) {
            button.setText(str.toUpperCase());
            InterfaceC17463d.d dVar = this.f43440L0;
            if (dVar != null) {
                AbstractC17464e.m92876b(button, keyEventCallbackC17462c, dVar, -1);
            }
        } else {
            button.setVisibility(8);
        }
        Button button2 = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_no);
        String str2 = this.f43439K0;
        if (str2 != null) {
            button2.setText(str2.toUpperCase());
            InterfaceC17463d.d dVar2 = this.f43441M0;
            if (dVar2 != null) {
                AbstractC17464e.m92876b(button2, keyEventCallbackC17462c, dVar2, -2);
            }
        } else {
            button2.setVisibility(8);
        }
        if (this.f43437I0 != null && (textView = (TextView) inflate.findViewById(AbstractC6918a0.confirm_message)) != null) {
            textView.setText(this.f43437I0);
            textView.setMovementMethod(CustomMovementMethod.m56305e());
        }
        keyEventCallbackC17462c.m92851B(inflate);
        return keyEventCallbackC17462c;
    }

    /* renamed from: WK */
    public ConfirmDialogView m42849WK(int i11) {
        this.f43437I0 = getContext().getText(i11);
        return this;
    }

    /* renamed from: XK */
    public ConfirmDialogView m42850XK(CharSequence charSequence) {
        this.f43437I0 = charSequence;
        return this;
    }

    /* renamed from: YK */
    public ConfirmDialogView m42851YK(int i11, InterfaceC17463d.d dVar) {
        this.f43439K0 = (String) getContext().getText(i11);
        this.f43441M0 = dVar;
        return this;
    }

    /* renamed from: ZK */
    public ConfirmDialogView m42852ZK(int i11, InterfaceC17463d.d dVar) {
        this.f43438J0 = (String) getContext().getText(i11);
        this.f43440L0 = dVar;
        return this;
    }

    /* renamed from: aL */
    public ConfirmDialogView m42853aL(int i11) {
        this.f43436H0 = (String) getContext().getText(i11);
        return this;
    }

    /* renamed from: bL */
    public ConfirmDialogView m42854bL(String str) {
        this.f43436H0 = str;
        return this;
    }
}
