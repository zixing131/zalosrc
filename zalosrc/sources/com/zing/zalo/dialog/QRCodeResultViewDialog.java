package com.zing.zalo.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* loaded from: classes3.dex */
public class QRCodeResultViewDialog extends DialogView implements View.OnClickListener {

    /* renamed from: H0 */
    protected String f43678H0;

    /* renamed from: I0 */
    protected String f43679I0;

    /* renamed from: J0 */
    protected int f43680J0;

    /* renamed from: K0 */
    protected int f43681K0;

    /* renamed from: L0 */
    protected int f43682L0;

    /* renamed from: M0 */
    protected int f43683M0;

    /* renamed from: N0 */
    protected int f43684N0;

    /* renamed from: O0 */
    private boolean f43685O0;

    /* renamed from: P0 */
    protected InterfaceC7995b f43686P0;

    /* renamed from: com.zing.zalo.dialog.QRCodeResultViewDialog$a */
    /* loaded from: classes3.dex */
    public static class C7994a {

        /* renamed from: a */
        private final Context f43687a;

        /* renamed from: b */
        private String f43688b;

        /* renamed from: c */
        private String f43689c;

        /* renamed from: d */
        private int f43690d;

        /* renamed from: e */
        private int f43691e;

        /* renamed from: f */
        private int f43692f;

        /* renamed from: g */
        private int f43693g;

        /* renamed from: h */
        protected InterfaceC7995b f43694h;

        public C7994a(Context context) {
            this.f43687a = context;
        }

        /* renamed from: a */
        public QRCodeResultViewDialog m43042a() {
            int i11;
            QRCodeResultViewDialog mo43043b = mo43043b();
            Bundle bundle = new Bundle();
            int i12 = 0;
            if (this.f43690d > 0) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (this.f43691e > 0) {
                i12 = 1;
            }
            bundle.putInt("iButtonCount", i11 + i12);
            bundle.putInt("leftButtonTextRes", this.f43690d);
            bundle.putInt("rightButtonTextRes", this.f43691e);
            bundle.putInt("icoBtnLeftRes", this.f43692f);
            bundle.putInt("icoBtnRightRes", this.f43693g);
            bundle.putString("title", this.f43688b);
            bundle.putString("message", this.f43689c);
            mo43043b.mo60305zK(bundle);
            return mo43043b;
        }

        /* renamed from: b */
        protected abstract QRCodeResultViewDialog mo43043b();

        /* renamed from: c */
        public C7994a m43044c(InterfaceC7995b interfaceC7995b) {
            this.f43694h = interfaceC7995b;
            return this;
        }

        /* renamed from: d */
        public C7994a m43045d(int i11) {
            this.f43690d = i11;
            return this;
        }

        /* renamed from: e */
        public C7994a m43046e(String str) {
            this.f43689c = str;
            return this;
        }

        /* renamed from: f */
        public C7994a m43047f(int i11) {
            this.f43691e = i11;
            return this;
        }

        /* renamed from: g */
        public C7994a m43048g(int i11) {
            this.f43688b = (String) this.f43687a.getText(i11);
            return this;
        }
    }

    /* renamed from: com.zing.zalo.dialog.QRCodeResultViewDialog$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7995b {
        /* renamed from: a */
        void mo43049a(DialogView dialogView);

        /* renamed from: b */
        void mo43050b(DialogView dialogView);

        /* renamed from: c */
        void mo43051c(DialogView dialogView);
    }

    public QRCodeResultViewDialog(InterfaceC7995b interfaceC7995b) {
        this.f43686P0 = interfaceC7995b;
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.ZaloView
    /* renamed from: CJ */
    public void mo37111CJ(Bundle bundle) {
        super.mo37111CJ(bundle);
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            this.f43680J0 = m92642L3.getInt("iButtonCount", 0);
            this.f43681K0 = m92642L3.getInt("leftButtonTextRes", 0);
            this.f43682L0 = m92642L3.getInt("rightButtonTextRes", 0);
            this.f43683M0 = m92642L3.getInt("icoBtnLeftRes", 0);
            this.f43684N0 = m92642L3.getInt("icoBtnRightRes", 0);
            this.f43678H0 = m92642L3.getString("title");
            this.f43679I0 = m92642L3.getString("message");
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate;
        m92594JK().m92867k().m92913w(new ColorDrawable(0));
        if (this.f43680J0 == 1) {
            inflate = layoutInflater.inflate(AbstractC7409c0.qrcode_result_one_button_dialog, viewGroup, false);
        } else {
            inflate = layoutInflater.inflate(AbstractC7409c0.qrcode_result_two_button_dialog, viewGroup, false);
        }
        if (this.f43678H0 != null) {
            ((TextView) inflate.findViewById(AbstractC6918a0.str_titledlg)).setText(this.f43678H0);
        }
        if (this.f43679I0 != null) {
            ((TextView) inflate.findViewById(AbstractC6918a0.content_text)).setText(this.f43679I0);
        }
        View findViewById = inflate.findViewById(AbstractC6918a0.layout_btnLeft);
        if (findViewById != null && this.f43681K0 > 0) {
            TextView textView = (TextView) inflate.findViewById(AbstractC6918a0.str_btnLeft);
            textView.setText(this.f43681K0);
            if (this.f43683M0 > 0) {
                textView.setCompoundDrawables(m92648SI().getResources().getDrawable(this.f43683M0), null, null, null);
            } else {
                textView.setCompoundDrawables(null, null, null, null);
            }
            findViewById.setOnClickListener(this);
        }
        View findViewById2 = inflate.findViewById(AbstractC6918a0.layout_btnRight);
        if (findViewById2 != null && this.f43682L0 > 0) {
            TextView textView2 = (TextView) inflate.findViewById(AbstractC6918a0.str_btnRight);
            textView2.setText(this.f43682L0);
            if (this.f43684N0 > 0) {
                textView2.setCompoundDrawables(m92648SI().getResources().getDrawable(this.f43684N0), null, null, null);
            } else {
                textView2.setCompoundDrawables(null, null, null, null);
            }
            findViewById2.setOnClickListener(this);
        }
        inflate.findViewById(AbstractC6918a0.btn_close).setOnClickListener(this);
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        KeyEventCallbackC17462c mo13885LK = super.mo13885LK(bundle);
        mo13885LK.m92870v(1);
        return mo13885LK;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: MK */
    public void mo43041MK(boolean z11) {
        this.f43685O0 = z11;
        if (m92594JK() != null) {
            m92594JK().m92873y(z11);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: RJ */
    public void mo13886RJ() {
        super.mo13886RJ();
        try {
            dismiss();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC7995b interfaceC7995b;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.layout_btnLeft) {
            InterfaceC7995b interfaceC7995b2 = this.f43686P0;
            if (interfaceC7995b2 != null) {
                interfaceC7995b2.mo43050b(this);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.layout_btnRight) {
            InterfaceC7995b interfaceC7995b3 = this.f43686P0;
            if (interfaceC7995b3 != null) {
                interfaceC7995b3.mo43051c(this);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_close && (interfaceC7995b = this.f43686P0) != null) {
            interfaceC7995b.mo43049a(this);
        }
    }

    @Override // com.zing.zalo.zview.DialogView, com.zing.zalo.zview.dialog.InterfaceC17463d.c
    /* renamed from: p7 */
    public void mo13013p7(InterfaceC17463d interfaceC17463d) {
        super.mo13013p7(interfaceC17463d);
        InterfaceC7995b interfaceC7995b = this.f43686P0;
        if (interfaceC7995b != null) {
            interfaceC7995b.mo43049a(this);
        }
    }

    public QRCodeResultViewDialog() {
    }
}
