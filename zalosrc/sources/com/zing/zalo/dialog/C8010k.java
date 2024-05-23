package com.zing.zalo.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.dialog.C8010k;
import com.zing.zalo.dialog.QRCodeResultViewDialog;

/* renamed from: com.zing.zalo.dialog.k */
/* loaded from: classes3.dex */
public class C8010k extends QRCodeResultViewDialog {

    /* renamed from: com.zing.zalo.dialog.k$a */
    /* loaded from: classes3.dex */
    public static class a extends QRCodeResultViewDialog.C7994a {
        public a(Context context) {
            super(context);
        }

        @Override // com.zing.zalo.dialog.QRCodeResultViewDialog.C7994a
        /* renamed from: b */
        protected QRCodeResultViewDialog mo43043b() {
            return new C8010k(this.f43694h);
        }
    }

    public C8010k(QRCodeResultViewDialog.InterfaceC7995b interfaceC7995b) {
        super(interfaceC7995b);
        this.f43686P0 = interfaceC7995b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: YK */
    public /* synthetic */ void m43180YK(View view) {
        QRCodeResultViewDialog.InterfaceC7995b interfaceC7995b = this.f43686P0;
        if (interfaceC7995b != null) {
            interfaceC7995b.mo43050b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public /* synthetic */ void m43181ZK(View view) {
        QRCodeResultViewDialog.InterfaceC7995b interfaceC7995b = this.f43686P0;
        if (interfaceC7995b != null) {
            interfaceC7995b.mo43051c(this);
        }
    }

    @Override // com.zing.zalo.dialog.QRCodeResultViewDialog, com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(AbstractC7409c0.confirm_dialog, viewGroup, false);
        if (this.f43678H0 != null) {
            ((TextView) inflate.findViewById(AbstractC6918a0.confirm_title)).setText(this.f43678H0);
        }
        if (this.f43679I0 != null) {
            ((TextView) inflate.findViewById(AbstractC6918a0.confirm_message)).setText(this.f43679I0);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: bn.o1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8010k.this.m43180YK(view);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: bn.p1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8010k.this.m43181ZK(view);
            }
        };
        Button button = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_no);
        Button button2 = (Button) inflate.findViewById(AbstractC6918a0.confirm_btn_yes);
        int i11 = this.f43681K0;
        if (i11 > 0 && this.f43682L0 > 0) {
            button.setText(i11);
            button.setOnClickListener(onClickListener);
            button2.setText(this.f43682L0);
            button2.setOnClickListener(onClickListener2);
        } else if (i11 > 0) {
            button.setVisibility(8);
            button2.setVisibility(0);
            button2.setText(this.f43681K0);
            button2.setOnClickListener(onClickListener);
        } else if (this.f43682L0 > 0) {
            button.setVisibility(8);
            button2.setVisibility(0);
            button2.setText(this.f43682L0);
            button2.setOnClickListener(onClickListener2);
        }
        return inflate;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        if (bundle != null) {
            try {
                dismiss();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
