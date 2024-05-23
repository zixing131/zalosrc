package com.zing.zalo.p077ui.searchdiscovery.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17023o;
import fn0.AbstractC19074t;
import kd0.C21697g;
import l80.C22122a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p262jb.AbstractC21196a;

/* loaded from: classes6.dex */
public final class ErrorLoadZInstantView extends ModulesView {
    public ErrorLoadZInstantView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m73042V();
    }

    /* renamed from: V */
    private final void m73042V() {
        setClickable(true);
        setFocusable(true);
        setBackgroundColor(C23212s8.m119607o(getContext(), AbstractC2807a.ui_background));
        m88987U(-1, -1);
        int m118712h = AbstractC23136l9.m118712h(getContext(), 16.0f);
        C22122a0 c22122a0 = new C22122a0(getContext());
        c22122a0.mo111926w1(AbstractC16803z.emptystate_discovery_presearch);
        c22122a0.m89106L().m89028L(AbstractC23136l9.m118712h(c22122a0.getContext(), 56.0f), AbstractC23136l9.m118712h(c22122a0.getContext(), 56.0f)).m89031O(AbstractC23136l9.m118712h(c22122a0.getContext(), 64.0f)).m89026J(true);
        mo69681L(c22122a0);
        C21697g c21697g = new C21697g(getContext());
        c21697g.m111958F1(AbstractC8020f0.str_global_search_presearch_tab_recovery_error_text);
        c21697g.mo111964L1(AbstractC23136l9.m118712h(c21697g.getContext(), 15.0f));
        c21697g.m111962J1(C23212s8.m119607o(c21697g.getContext(), AbstractC21196a.TextColor1));
        c21697g.m89106L().m89028L(-1, -2).m89032P(m118712h, AbstractC23136l9.m118712h(c21697g.getContext(), 136.0f), m118712h, 0);
        c21697g.m111961I1(Layout.Alignment.ALIGN_CENTER);
        mo69681L(c21697g);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonSmall_Tertiary);
        c17023o.setIdTracking("search_discovery_full_zinstant_btn_retry");
        c17023o.m91114u1(AbstractC8020f0.str_try_again_button);
        c17023o.m91111q1(AbstractC23322a.zds_ic_retry_line_16);
        c17023o.m89106L().m89036T(AbstractC23136l9.m118712h(c17023o.getContext(), 4.0f)).m89026J(true).m89033Q(AbstractC23136l9.m118712h(c17023o.getContext(), 64.0f)).m89023G(c21697g);
        mo69681L(c17023o);
    }

    public ErrorLoadZInstantView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m73042V();
    }
}
