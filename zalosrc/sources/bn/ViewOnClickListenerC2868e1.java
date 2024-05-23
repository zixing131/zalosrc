package bn;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import gw.C19669z;
import me0.AbstractC23136l9;
import p348mi.AbstractC23309i;
import p361nb.AbstractC23647d;

/* renamed from: bn.e1 */
/* loaded from: classes3.dex */
public class ViewOnClickListenerC2868e1 extends KeyEventCallbackC17462c implements View.OnClickListener {

    /* renamed from: I */
    private final int f11431I;

    /* renamed from: J */
    private TextView f11432J;

    public ViewOnClickListenerC2868e1(Context context, int i11) {
        this(context, R.style.Theme.Translucent.NoTitleBar, i11);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 == AbstractC6918a0.tvHide) {
            AbstractC23309i.m122187mx(false);
            C19669z.f97569Q.set(false);
            C19669z.m103146Y().m103198O0();
            dismiss();
            AbstractC23647d.m123906p("290105");
            AbstractC23647d.m123893c();
            return;
        }
        if (id2 == AbstractC6918a0.main_layout) {
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92870v(1);
        m92867k().m92895b(67108864);
        try {
            m92850A(AbstractC7409c0.menu_suggest_chat_layout);
            TextView textView = (TextView) m92864h(AbstractC6918a0.tvHide);
            this.f11432J = textView;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
            layoutParams.setMargins(0, this.f11431I, AbstractC23136l9.m118742r(4.0f), 0);
            this.f11432J.setLayoutParams(layoutParams);
            this.f11432J.setOnClickListener(this);
            m92864h(AbstractC6918a0.main_layout).setOnClickListener(this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public ViewOnClickListenerC2868e1(Context context, int i11, int i12) {
        super(context, i11);
        this.f11431I = i12;
    }
}
