package bn;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.widget.StencilSwitch;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import p304ks.C21927m;

/* renamed from: bn.r1 */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC2907r1 extends KeyEventCallbackC17462c implements View.OnClickListener {

    /* renamed from: I */
    private String f11517I;

    /* renamed from: J */
    private String f11518J;

    /* renamed from: K */
    private a f11519K;

    /* renamed from: L */
    private StencilSwitch f11520L;

    /* renamed from: bn.r1$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: a */
        void mo13859a();

        /* renamed from: b */
        void mo13860b(boolean z11);
    }

    public ViewOnClickListenerC2907r1(Context context) {
        super(context, AbstractC8915g0.Dialog_Translucent);
        this.f11517I = "";
        this.f11518J = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static final void m13854N(View view) {
    }

    /* renamed from: M */
    public final StencilSwitch m13855M() {
        return this.f11520L;
    }

    /* renamed from: O */
    public final void m13856O(a aVar) {
        this.f11519K = aVar;
    }

    /* renamed from: P */
    public final void m13857P(String str) {
        this.f11518J = str;
    }

    /* renamed from: Q */
    public final void m13858Q(String str) {
        this.f11517I = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i11 = AbstractC6918a0.layoutReport;
        if (num != null && num.intValue() == i11) {
            a aVar = this.f11519K;
            if (aVar != null) {
                aVar.mo13859a();
                return;
            }
            return;
        }
        int i12 = AbstractC6918a0.layoutBlockMsg;
        if (num == null || num.intValue() != i12) {
            int i13 = AbstractC6918a0.sw_block_msg;
            if (num == null || num.intValue() != i13) {
                int i14 = AbstractC6918a0.root_backgroundmain;
                if (num != null && num.intValue() == i14) {
                    dismiss();
                    return;
                }
                return;
            }
        }
        StencilSwitch stencilSwitch = this.f11520L;
        if (stencilSwitch != null) {
            stencilSwitch.setChecked(!stencilSwitch.isChecked());
            a aVar2 = this.f11519K;
            if (aVar2 != null) {
                aVar2.mo13860b(stencilSwitch.isChecked());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.dialog.KeyEventCallbackC17462c
    /* renamed from: p */
    public void mo13765p(Bundle bundle) {
        super.mo13765p(bundle);
        m92850A(AbstractC7409c0.reject_friend_dialog_view);
        try {
            if (TextUtils.isEmpty(this.f11518J)) {
                View m92864h = m92864h(AbstractC6918a0.item_line);
                if (m92864h != null) {
                    m92864h.setVisibility(8);
                }
                View m92864h2 = m92864h(AbstractC6918a0.layout_info);
                if (m92864h2 != null) {
                    m92864h2.setVisibility(8);
                }
            } else {
                View m92864h3 = m92864h(AbstractC6918a0.item_line);
                if (m92864h3 != null) {
                    m92864h3.setVisibility(0);
                }
                View m92864h4 = m92864h(AbstractC6918a0.layout_info);
                if (m92864h4 != null) {
                    m92864h4.setVisibility(0);
                }
                TextView textView = (TextView) m92864h(AbstractC6918a0.tvInfo);
                if (textView != null) {
                    textView.setText(this.f11518J);
                }
            }
            View m92864h5 = m92864h(AbstractC6918a0.root_backgroundmain);
            if (m92864h5 != null) {
                m92864h5.setOnClickListener(this);
            }
            View m92864h6 = m92864h(AbstractC6918a0.layout_info);
            if (m92864h6 != null) {
                m92864h6.setOnClickListener(new View.OnClickListener() { // from class: bn.q1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ViewOnClickListenerC2907r1.m13854N(view);
                    }
                });
            }
            View m92864h7 = m92864h(AbstractC6918a0.layoutReport);
            if (m92864h7 != null) {
                m92864h7.setOnClickListener(this);
            }
            View m92864h8 = m92864h(AbstractC6918a0.layoutBlockMsg);
            if (m92864h8 != null) {
                m92864h8.setOnClickListener(this);
            }
            StencilSwitch stencilSwitch = (StencilSwitch) m92864h(AbstractC6918a0.sw_block_msg);
            this.f11520L = stencilSwitch;
            if (stencilSwitch != null) {
                stencilSwitch.setOnClickListener(this);
            }
            StencilSwitch stencilSwitch2 = this.f11520L;
            if (stencilSwitch2 != null) {
                stencilSwitch2.setChecked(C21927m.m114302u().m114312J().m153137g(this.f11517I));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
