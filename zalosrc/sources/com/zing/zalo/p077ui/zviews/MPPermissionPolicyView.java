package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class MPPermissionPolicyView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: p */
    private InterfaceC14534a f74823p;

    /* renamed from: com.zing.zalo.ui.zviews.MPPermissionPolicyView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC14534a {
        /* renamed from: J */
        void mo81293J();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPPermissionPolicyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.mp_permission_policy_view, this);
        ((ImageButton) findViewById(AbstractC6918a0.mp_dialog_close_bt)).setOnClickListener(this);
    }

    public final InterfaceC14534a getPermissionPolicyListener() {
        return this.f74823p;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        InterfaceC14534a interfaceC14534a;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.mp_dialog_close_bt;
        if (num != null && num.intValue() == i11 && (interfaceC14534a = this.f74823p) != null) {
            interfaceC14534a.mo81293J();
        }
    }

    public final void setPermissionPolicyListener(InterfaceC14534a interfaceC14534a) {
        this.f74823p = interfaceC14534a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MPPermissionPolicyView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        LayoutInflater.from(getContext()).inflate(AbstractC7409c0.mp_permission_policy_view, this);
        ((ImageButton) findViewById(AbstractC6918a0.mp_dialog_close_bt)).setOnClickListener(this);
    }
}
