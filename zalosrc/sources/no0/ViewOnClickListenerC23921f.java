package no0;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* renamed from: no0.f */
/* loaded from: classes7.dex */
public class ViewOnClickListenerC23921f extends KeyEventCallbackC17462c implements View.OnClickListener {

    /* renamed from: I */
    private RobotoTextView f115584I;

    /* renamed from: J */
    private RobotoTextView f115585J;

    /* renamed from: K */
    private RobotoTextView f115586K;

    /* renamed from: L */
    private InterfaceC17463d.d f115587L;

    /* renamed from: M */
    private InterfaceC17463d.d f115588M;

    public ViewOnClickListenerC23921f(Context context) {
        super(context);
    }

    /* renamed from: L */
    public void m125043L(InterfaceC17463d.d dVar) {
        this.f115587L = dVar;
    }

    /* renamed from: M */
    public void m125044M(InterfaceC17463d.d dVar) {
        this.f115588M = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC17463d.d dVar;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.btn_left) {
            InterfaceC17463d.d dVar2 = this.f115587L;
            if (dVar2 != null) {
                dVar2.mo605K8(this, -1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.btn_right && (dVar = this.f115588M) != null) {
            dVar.mo605K8(this, -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92870v(1);
        m92850A(AbstractC7409c0.voip_boost_volume_dialog);
        this.f115584I = (RobotoTextView) m92864h(AbstractC6918a0.btn_left);
        this.f115585J = (RobotoTextView) m92864h(AbstractC6918a0.btn_right);
        this.f115586K = (RobotoTextView) m92864h(AbstractC6918a0.content);
        this.f115585J.setOnClickListener(this);
        this.f115586K.setText(Html.fromHtml(m92865i().getString(AbstractC8020f0.str_call_boost_volume_text)));
        this.f115584I.setVisibility(0);
        this.f115584I.setText(AbstractC8020f0.str_call_boost_left_button);
        this.f115585J.setText(AbstractC8020f0.str_call_boost_right_button);
        this.f115584I.setOnClickListener(this);
    }
}
