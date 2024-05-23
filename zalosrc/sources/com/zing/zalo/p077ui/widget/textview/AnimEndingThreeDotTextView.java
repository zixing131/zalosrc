package com.zing.zalo.p077ui.widget.textview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import l80.C22130e0;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class AnimEndingThreeDotTextView extends ModulesView {

    /* renamed from: K */
    C22130e0 f71382K;

    /* renamed from: L */
    C22126c0 f71383L;

    public AnimEndingThreeDotTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setText(CharSequence charSequence) {
        this.f71383L.m111959G1(charSequence);
    }

    public void setThreeDotVisibility(int i11) {
        this.f71382K.mo44614b1(i11);
        if (i11 == 0) {
            this.f71383L.m111980v1(null);
        } else {
            this.f71383L.m111980v1(TextUtils.TruncateAt.END);
        }
    }

    public AnimEndingThreeDotTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f84675p = context;
        m88987U(-2, -2);
        int m118712h = AbstractC23136l9.m118712h(getContext(), 0.0f);
        int m118712h2 = AbstractC23136l9.m118712h(getContext(), 3.0f);
        int m118712h3 = AbstractC23136l9.m118712h(getContext(), 6.0f);
        int m118712h4 = AbstractC23136l9.m118712h(getContext(), 3.0f);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f71383L = c22126c0;
        c22126c0.mo111965M1(0);
        this.f71383L.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        this.f71383L.m111982x1(false);
        this.f71383L.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cMtxt2));
        this.f71383L.m111980v1(TextUtils.TruncateAt.END);
        this.f71383L.m89106L().m89028L(-2, -2).m89042Z(0, m118712h2, m118712h3, m118712h4).m89034R(m118712h).m89073z(Boolean.TRUE).m89027K(true);
        this.f71383L.m111953A1(1);
        C22130e0 c22130e0 = new C22130e0(context);
        this.f71382K = c22130e0;
        c22130e0.m89106L().m89028L(-2, -2).m89054h0(this.f71383L).m89034R(AbstractC23136l9.m118742r(2.0f)).m89027K(true);
        this.f71382K.m115445g1(AbstractC23136l9.m118641B(context, AbstractC16801x.cMtxt2));
        mo69681L(this.f71383L);
        mo69681L(this.f71382K);
    }
}
