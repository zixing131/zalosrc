package com.zing.zalo.p077ui.moduleview.message;

import android.content.Context;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ti0.C26705d;
import ti0.C26707f;

/* loaded from: classes6.dex */
public final class SeeMoreSuggestAddChatLabelModuleView extends ModulesView {

    /* renamed from: K */
    private final C16719g f64984K;

    /* renamed from: L */
    private final C16716d f64985L;

    /* renamed from: M */
    private final C16719g f64986M;

    /* renamed from: N */
    private final C22126c0 f64987N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeMoreSuggestAddChatLabelModuleView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89028L(-1, 1);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64984K = c16719g;
        C16716d c16716d = new C16716d(context);
        C16718f m89106L = c16716d.m89106L();
        m89106L.m89028L(-1, AbstractC23222t7.f112539R);
        int i11 = AbstractC23222t7.f112586t;
        m89106L.f84716l = i11;
        m89106L.f84718n = i11;
        m89106L.m89023G(c16719g);
        setBackground(AbstractC23136l9.m118665N(context, AbstractC2810d.bg_list_item));
        this.f64985L = c16716d;
        C16719g c16719g2 = new C16719g(context);
        C16718f m89106L2 = c16719g2.m89106L();
        m89106L2.m89028L(-1, 1);
        m89106L2.m89023G(c16716d);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64986M = c16719g2;
        C22126c0 c22126c0 = new C22126c0(context);
        C16718f m89106L3 = c22126c0.m89106L();
        m89106L3.m89028L(-1, -2);
        m89106L3.m89027K(true);
        new C26707f(c22126c0).m137318a(C26705d.m137293a(context, AbstractC2814h.t_small));
        c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC2808b.f150821b60));
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.label_see_full_search_result));
        this.f64987N = c22126c0;
        c16716d.m89001g1(c22126c0);
        mo69681L(c16719g);
        mo69681L(c16716d);
        mo69681L(c16719g2);
    }
}
