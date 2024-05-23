package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import bn.C2874g1;
import bn.C2880i1;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.uidrawing.ModulesView;
import kd0.C21693c;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* loaded from: classes4.dex */
public class DefaultProfileActionItemView extends ModulesView {

    /* renamed from: K */
    C21693c f44196K;

    /* renamed from: L */
    C22126c0 f44197L;

    public DefaultProfileActionItemView(Context context) {
        super(context);
        m43598W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public static /* synthetic */ void m43597X(C2874g1.b bVar, C2880i1 c2880i1, View view) {
        if (bVar != null) {
            bVar.mo13802a(c2880i1.f11474c);
        }
    }

    /* renamed from: W */
    public void m43598W() {
        try {
            this.f44196K = new C21693c(getContext());
            this.f44197L = new C22126c0(getContext());
            int m118742r = AbstractC23136l9.m118742r(24.0f);
            setLayoutParams(new ViewGroup.LayoutParams(-1, AbstractC23136l9.m118742r(48.0f)));
            setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.material_button_dialog_bg));
            setPadding(m118742r, 0, m118742r, 0);
            this.f44196K.m89106L().m89060k0(AbstractC23136l9.m118742r(26.0f)).m89030N(AbstractC23136l9.m118742r(26.0f)).m89027K(true);
            this.f44197L.m89106L().m89060k0(-1).m89030N(-2).m89054h0(this.f44196K).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89027K(true);
            this.f44197L.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f44197L.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85295f2));
            this.f44197L.m111953A1(1);
            this.f44197L.m111980v1(TextUtils.TruncateAt.END);
            this.f44197L.m111982x1(false);
            mo69681L(this.f44196K);
            mo69681L(this.f44197L);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Y */
    public void m43599Y(final C2880i1 c2880i1, final C2874g1.b bVar) {
        if (c2880i1 != null) {
            C21693c c21693c = this.f44196K;
            if (c21693c != null) {
                c21693c.mo111925v1(c2880i1.f11472a);
            }
            C22126c0 c22126c0 = this.f44197L;
            if (c22126c0 != null) {
                c22126c0.m111959G1(c2880i1.f11473b);
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.feed.components.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    DefaultProfileActionItemView.m43597X(C2874g1.b.this, c2880i1, view);
                }
            });
        }
    }
}
