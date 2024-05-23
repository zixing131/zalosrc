package com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.backuprestore.encryption.setup.passphrase.SecretPhaseView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19074t;
import java.util.List;
import me0.AbstractC23222t7;
import me0.C23212s8;
import on0.AbstractC24344y;
import pm0.C24848g0;
import qm0.AbstractC25332a0;
import ti0.C26705d;
import ti0.C26708g;
import ui0.C27280g;

/* loaded from: classes5.dex */
public final class SecretPhaseView extends LinearLayout {

    /* renamed from: p */
    private InterfaceC11043a f55726p;

    /* renamed from: com.zing.zalo.ui.backuprestore.encryption.setup.passphrase.SecretPhaseView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11043a {
        /* renamed from: a */
        void mo57632a();
    }

    public SecretPhaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        setGravity(3);
    }

    /* renamed from: b */
    private final void m57651b() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        RobotoTextView robotoTextView = new RobotoTextView(context);
        Context context2 = robotoTextView.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        robotoTextView.setCompoundDrawablesWithIntrinsicBounds(C27280g.m139660c(context2, AbstractC2810d.zds_ic_copy_line_16, AbstractC2807a.icon_tertiary), (Drawable) null, (Drawable) null, (Drawable) null);
        robotoTextView.setCompoundDrawablePadding(AbstractC23222t7.f112556e);
        robotoTextView.setText(robotoTextView.getContext().getString(AbstractC8020f0.str_zcloud_copy));
        Context context3 = robotoTextView.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26708g(robotoTextView).m137319a(C26705d.m137293a(context3, AbstractC2814h.t_xxsmall));
        robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_tertiary));
        robotoTextView.setGravity(17);
        robotoTextView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, AbstractC23222t7.f112586t, 0, 0);
        layoutParams.gravity = 17;
        C24848g0 c24848g0 = C24848g0.f119245a;
        addView(robotoTextView, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m57652d(SecretPhaseView secretPhaseView, View view) {
        AbstractC19074t.m100208f(secretPhaseView, "this$0");
        InterfaceC11043a interfaceC11043a = secretPhaseView.f55726p;
        if (interfaceC11043a != null) {
            interfaceC11043a.mo57632a();
        }
    }

    /* renamed from: c */
    public final void m57653c(int i11, String str) {
        List m127201Z0;
        List<List> m131195U;
        AbstractC19074t.m100208f(str, "key");
        removeAllViews();
        m127201Z0 = AbstractC24344y.m127201Z0(str, 4);
        m131195U = AbstractC25332a0.m131195U(m127201Z0, i11);
        for (List<String> list : m131195U) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(i11);
            for (String str2 : list) {
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                RobotoTextView robotoTextView = new RobotoTextView(context);
                robotoTextView.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                Context context2 = robotoTextView.getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                new C26708g(robotoTextView).m137319a(C26705d.m137293a(context2, AbstractC8915g0.Passphrase));
                robotoTextView.setTextColor(C23212s8.m119607o(robotoTextView.getContext(), AbstractC2807a.text_01));
                robotoTextView.setText(str2);
                robotoTextView.setGravity(15);
                robotoTextView.setTextAlignment(4);
                linearLayout.addView(robotoTextView);
            }
            addView(linearLayout);
        }
        m57651b();
        setOnClickListener(new View.OnClickListener() { // from class: q40.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SecretPhaseView.m57652d(SecretPhaseView.this, view);
            }
        });
    }

    public final void setListener(InterfaceC11043a interfaceC11043a) {
        AbstractC19074t.m100208f(interfaceC11043a, "listener");
        this.f55726p = interfaceC11043a;
    }

    public SecretPhaseView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setOrientation(1);
        setGravity(3);
    }
}
