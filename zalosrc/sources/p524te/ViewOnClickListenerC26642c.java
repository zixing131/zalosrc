package p524te;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;

/* renamed from: te.c */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC26642c extends KeyEventCallbackC17462c implements View.OnClickListener {

    /* renamed from: I */
    private final InterfaceC17463d.d f126104I;

    /* renamed from: J */
    private final InterfaceC17463d.d f126105J;

    public ViewOnClickListenerC26642c(Context context, InterfaceC17463d.d dVar, InterfaceC17463d.d dVar2) {
        super(context, AbstractC8915g0.Theme_Dialog_Translucent);
        this.f126104I = dVar;
        this.f126105J = dVar2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        InterfaceC17463d.d dVar;
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.button1) {
            InterfaceC17463d.d dVar2 = this.f126104I;
            if (dVar2 != null) {
                dVar2.mo605K8(this, -1);
                return;
            }
            return;
        }
        if (id2 == AbstractC6918a0.button2 && (dVar = this.f126105J) != null) {
            dVar.mo605K8(this, -2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        m92870v(1);
        super.mo13765p(bundle);
        m92850A(AbstractC7409c0.location_filter_gps_prompt_popup);
        m92864h(AbstractC6918a0.button1).setOnClickListener(this);
        m92864h(AbstractC6918a0.button2).setOnClickListener(this);
    }
}
