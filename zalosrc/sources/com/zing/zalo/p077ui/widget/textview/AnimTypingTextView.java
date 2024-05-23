package com.zing.zalo.p077ui.widget.textview;

import android.content.Context;
import android.text.TextUtils;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.ModulesView;
import l80.C22126c0;
import l80.C22130e0;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class AnimTypingTextView extends ModulesView {

    /* renamed from: K */
    C22130e0 f71384K;

    /* renamed from: L */
    C22126c0 f71385L;

    public AnimTypingTextView(Context context) {
        super(context);
        m88987U(-2, -2);
        int m118712h = AbstractC23136l9.m118712h(getContext(), 6.0f);
        int m118712h2 = AbstractC23136l9.m118712h(getContext(), 3.0f);
        int m118712h3 = AbstractC23136l9.m118712h(getContext(), 6.0f);
        int m118712h4 = AbstractC23136l9.m118712h(getContext(), 3.0f);
        C22130e0 c22130e0 = new C22130e0(context);
        this.f71384K = c22130e0;
        c22130e0.m89106L().m89028L(-2, -2).m89035S(AbstractC23136l9.m118742r(6.0f)).m89034R(m118712h).m89027K(true).m89073z(Boolean.TRUE);
        C22126c0 c22126c0 = new C22126c0(context);
        this.f71385L = c22126c0;
        c22126c0.mo111965M1(0);
        this.f71385L.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        this.f71385L.m111982x1(false);
        this.f71385L.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.chat_typing));
        this.f71385L.m111958F1(AbstractC8020f0.str_typing_text);
        this.f71385L.m111980v1(TextUtils.TruncateAt.END);
        this.f71385L.m89106L().m89028L(-2, -2).m89042Z(0, m118712h2, m118712h3, m118712h4).m89027K(true).m89054h0(this.f71384K);
        mo69681L(this.f71384K);
        mo69681L(this.f71385L);
        AbstractC23136l9.m118696b1(this, AbstractC23136l9.m118665N(context, AbstractC16803z.bg_chat_typing));
    }

    public void setText(CharSequence charSequence) {
        this.f71385L.m111959G1(charSequence);
    }
}
