package zm.voip.dialog;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.adapters.C7035d;
import com.zing.zalo.zview.DialogView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import p348mi.AbstractC23309i;
import zm.voip.dialog.CallSettingsDialog;

/* loaded from: classes7.dex */
public class CallSettingsDialog extends DialogView implements View.OnClickListener {

    /* renamed from: K0 */
    private static KeyEventCallbackC17462c f148685K0;

    /* renamed from: H0 */
    int f148686H0 = 0;

    /* renamed from: I0 */
    int f148687I0 = 0;

    /* renamed from: J0 */
    int f148688J0 = 0;

    /* renamed from: zm.voip.dialog.CallSettingsDialog$a */
    /* loaded from: classes7.dex */
    class C32240a implements AdapterView.OnItemSelectedListener {
        C32240a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i11, long j11) {
            CallSettingsDialog.this.f148688J0 = i11;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ZK */
    public static /* synthetic */ boolean m155492ZK(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            f148685K0.dismiss();
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: aL */
    public /* synthetic */ void m155493aL(CompoundButton compoundButton, boolean z11) {
        this.f148686H0 = z11 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bL */
    public /* synthetic */ void m155494bL(CompoundButton compoundButton, boolean z11) {
        this.f148687I0 = z11 ? 1 : 0;
    }

    @Override // com.zing.zalo.zview.DialogView
    /* renamed from: LK */
    public KeyEventCallbackC17462c mo13885LK(Bundle bundle) {
        boolean z11;
        LayoutInflater layoutInflater = (LayoutInflater) m92648SI().getSystemService("layout_inflater");
        this.f148686H0 = AbstractC23309i.m121814d2();
        View inflate = layoutInflater.inflate(AbstractC7409c0.settings_call_layout, (ViewGroup) null);
        KeyEventCallbackC17462c keyEventCallbackC17462c = new KeyEventCallbackC17462c(m92648SI(), AbstractC8915g0.Call_Theme_Dialog_Translucent);
        f148685K0 = keyEventCallbackC17462c;
        boolean z12 = true;
        keyEventCallbackC17462c.m92870v(1);
        f148685K0.m92851B(inflate);
        f148685K0.m92873y(true);
        f148685K0.m92874z(true);
        f148685K0.m92856G(new InterfaceC17463d.f() { // from class: no0.a
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.f
            /* renamed from: Tx */
            public final boolean mo87296Tx(InterfaceC17463d interfaceC17463d, int i11, KeyEvent keyEvent) {
                boolean m155492ZK;
                m155492ZK = CallSettingsDialog.m155492ZK(interfaceC17463d, i11, keyEvent);
                return m155492ZK;
            }
        });
        inflate.findViewById(AbstractC6918a0.btn_ok).setOnClickListener(this);
        inflate.findViewById(AbstractC6918a0.btn_cancel).setOnClickListener(this);
        Spinner spinner = (Spinner) inflate.findViewById(AbstractC6918a0.ui_style_spinner);
        C7035d m35949c = C7035d.m35949c(getContext(), AbstractC16775v.call_ui_style, R.layout.simple_spinner_item);
        m35949c.m35956h(R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter((SpinnerAdapter) m35949c);
        spinner.setSelection(this.f148688J0);
        spinner.setOnItemSelectedListener(new C32240a());
        Switch r02 = (Switch) inflate.findViewById(AbstractC6918a0.enable_new_accept_end_btn_switch);
        if (this.f148686H0 == 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        r02.setChecked(z11);
        r02.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: no0.b
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                CallSettingsDialog.this.m155493aL(compoundButton, z13);
            }
        });
        Switch r62 = (Switch) inflate.findViewById(AbstractC6918a0.enable_text_support);
        if (this.f148687I0 != 1) {
            z12 = false;
        }
        r62.setChecked(z12);
        r62.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: no0.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z13) {
                CallSettingsDialog.this.m155494bL(compoundButton, z13);
            }
        });
        return f148685K0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_ok) {
            AbstractC23309i.m122360rk(this.f148687I0);
            f148685K0.dismiss();
        } else if (id2 == AbstractC6918a0.btn_cancel) {
            f148685K0.dismiss();
        }
    }
}
