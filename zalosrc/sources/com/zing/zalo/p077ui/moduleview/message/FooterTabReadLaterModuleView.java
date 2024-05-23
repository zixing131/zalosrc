package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Layout;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17023o;
import fn0.AbstractC19074t;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class FooterTabReadLaterModuleView extends ModulesView {

    /* renamed from: K */
    private C12260j f64835K;

    /* renamed from: L */
    private final C16719g f64836L;

    /* renamed from: M */
    private final C16716d f64837M;

    /* renamed from: N */
    private final C22126c0 f64838N;

    /* renamed from: O */
    private final C17023o f64839O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FooterTabReadLaterModuleView(Context context, C12260j c12260j) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c12260j, "parent");
        this.f64835K = c12260j;
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89028L(-1, 1);
        c16719g.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f64836L = c16719g;
        C16716d c16716d = new C16716d(context);
        C16718f m89106L = c16716d.m89106L();
        m89106L.m89028L(-1, -2);
        int i11 = AbstractC23222t7.f112514B;
        m89106L.f84717m = i11;
        m89106L.f84719o = i11;
        m89106L.m89023G(c16719g);
        this.f64837M = c16716d;
        C22126c0 c22126c0 = new C22126c0(context);
        C16718f m89106L2 = c22126c0.m89106L();
        m89106L2.m89028L(-1, -2);
        int i12 = AbstractC23222t7.f112594x;
        m89106L2.f84720p = i12;
        m89106L2.f84722r = i12;
        c22126c0.mo111964L1(AbstractC23222t7.f112582r);
        c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cTextColor2));
        c22126c0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.footer_tab_read_later_desc));
        c22126c0.m111961I1(Layout.Alignment.ALIGN_CENTER);
        this.f64838N = c22126c0;
        C17023o c17023o = new C17023o(context, AbstractC2814h.ButtonMedium_Primary);
        C16718f m89106L3 = c17023o.m89106L();
        m89106L3.m89060k0(-2);
        m89106L3.m89029M(15);
        m89106L3.f84721q = AbstractC23222t7.f112586t;
        int i13 = AbstractC23222t7.f112514B;
        m89106L3.f84716l = i13;
        m89106L3.f84718n = i13;
        m89106L3.m89023G(c22126c0);
        m89106L3.m89026J(true);
        c17023o.m91115v1(AbstractC23136l9.m118743r0(AbstractC8020f0.footer_tab_read_later_button));
        this.f64839O = c17023o;
        mo69681L(c16719g);
        c16716d.m89001g1(c22126c0);
        c16716d.m89001g1(c17023o);
        mo69681L(c16716d);
        c17023o.setIdTracking("btn_footer_add_multi_conversation_label");
        c17023o.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.g
            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                FooterTabReadLaterModuleView.m69779W(FooterTabReadLaterModuleView.this, c16719g2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public static final void m69779W(FooterTabReadLaterModuleView footerTabReadLaterModuleView, C16719g c16719g) {
        AbstractC19074t.m100208f(footerTabReadLaterModuleView, "this$0");
        footerTabReadLaterModuleView.f64835K.f63847w.mo68332Nd();
    }

    @Override // android.view.View, android.view.ViewParent
    public final C12260j getParent() {
        return this.f64835K;
    }

    public final void setParent(C12260j c12260j) {
        AbstractC19074t.m100208f(c12260j, "<set-?>");
        this.f64835K = c12260j;
    }
}
