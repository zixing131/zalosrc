package com.zing.zalo.dialog;

import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.dialog.ConfirmChangePhoneDialogView;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import wl0.InterfaceC29091d;

/* loaded from: classes3.dex */
public class ConfirmChangePhoneDialogView extends ZaloView implements InterfaceC29091d, ZaloView.InterfaceC17421f {

    /* renamed from: w0 */
    InterfaceC17463d.d f43432w0;

    /* renamed from: x0 */
    InterfaceC17463d.d f43433x0;

    /* renamed from: y0 */
    String f43434y0;

    /* renamed from: z0 */
    Spannable f43435z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OK */
    public /* synthetic */ void m42839OK(View view) {
        m42843NK();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PK */
    public static /* synthetic */ void m42840PK(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QK */
    public /* synthetic */ void m42841QK(View view) {
        InterfaceC17463d.d dVar = this.f43433x0;
        if (dVar != null) {
            dVar.mo605K8(null, -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RK */
    public /* synthetic */ void m42842RK(View view) {
        InterfaceC17463d.d dVar = this.f43432w0;
        if (dVar != null) {
            dVar.mo605K8(null, -1);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.confirm_change_phone_dialog, viewGroup, false);
        try {
            inflate.findViewById(AbstractC6918a0.root_dialog).setOnClickListener(new View.OnClickListener() { // from class: bn.m
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmChangePhoneDialogView.this.m42839OK(view);
                }
            });
            inflate.findViewById(AbstractC6918a0.ll_content).setOnClickListener(new View.OnClickListener() { // from class: bn.n
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmChangePhoneDialogView.m42840PK(view);
                }
            });
            inflate.findViewById(AbstractC6918a0.confirm_btn_no).setOnClickListener(new View.OnClickListener() { // from class: bn.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmChangePhoneDialogView.this.m42841QK(view);
                }
            });
            inflate.findViewById(AbstractC6918a0.confirm_btn_yes).setOnClickListener(new View.OnClickListener() { // from class: bn.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ConfirmChangePhoneDialogView.this.m42842RK(view);
                }
            });
            if (!TextUtils.isEmpty(this.f43434y0)) {
                ((TextView) inflate.findViewById(AbstractC6918a0.tv_title)).setText(this.f43434y0);
            }
            Spannable spannable = this.f43435z0;
            if (spannable != null && spannable.length() > 0) {
                ((TextView) inflate.findViewById(AbstractC6918a0.tv_msg)).setText(this.f43435z0);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return inflate;
    }

    /* renamed from: NK */
    public void m42843NK() {
        dismiss();
    }

    /* renamed from: SK */
    public void m42844SK(Spannable spannable) {
        this.f43435z0 = spannable;
    }

    /* renamed from: TK */
    public void m42845TK(InterfaceC17463d.d dVar) {
        this.f43433x0 = dVar;
    }

    /* renamed from: UK */
    public void m42846UK(InterfaceC17463d.d dVar) {
        this.f43432w0 = dVar;
    }

    /* renamed from: VK */
    public void m42847VK(String str) {
        this.f43434y0 = str;
    }

    /* renamed from: WK */
    public void m42848WK(C17487o0 c17487o0, String str, int i11) {
        if (c17487o0 != null) {
            c17487o0.m93060e2(i11, this, str, 2, true);
        }
    }

    @Override // wl0.InterfaceC29091d
    public void dismiss() {
        try {
            m92662fJ().mo92702G1(this, this.f88756W);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            m42843NK();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }
}
