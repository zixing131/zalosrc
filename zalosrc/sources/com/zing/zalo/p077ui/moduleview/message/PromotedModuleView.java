package com.zing.zalo.p077ui.moduleview.message;

import android.annotation.SuppressLint;
import android.content.Context;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.maintab.msg.AbstractC12211a;
import com.zing.zalo.p077ui.maintab.msg.C12260j;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16959c0;
import com.zing.zalo.zdesign.component.C16971e;
import fn0.AbstractC19074t;
import java.util.Locale;
import l80.C22126c0;
import me0.AbstractC23136l9;
import nh0.C23793c;
import p132ej.C18451m;
import p132ej.C18452n;
import p604wb.C28905e;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public final class PromotedModuleView extends TabMsgCommonItemModuleView {

    /* renamed from: i0 */
    private final C22126c0 f64970i0;

    /* renamed from: j0 */
    private final C22126c0 f64971j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotedModuleView(Context context, C12260j c12260j) {
        super(context, c12260j);
        AbstractC19074t.m100208f(context, "context");
        C22126c0 c22126c0 = new C22126c0(context);
        this.f64970i0 = c22126c0;
        c22126c0.mo111965M1(0);
        c22126c0.mo111964L1(AbstractC23136l9.m118742r(11.0f));
        c22126c0.m111958F1(AbstractC8020f0.str_hint_float_sticky_msg);
        c22126c0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.gray_color1));
        C16718f m89028L = c22126c0.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89034R(AbstractC23136l9.m118742r(5.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f));
        getMLine2RightSide().m89001g1(c22126c0);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64971j0 = c22126c02;
        c22126c02.m89087B0(AbstractC16803z.bg_btn_type2_medium);
        c22126c02.mo111965M1(0);
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(13.0f));
        c22126c02.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.bg_btn_type2_text));
        c22126c02.m89106L().m89029M(15).m89028L(-2, AbstractC23136l9.m118742r(30.0f)).m89017A(bool).m89023G(c22126c0).m89046b0(AbstractC23136l9.m118742r(8.0f)).m89047c0(AbstractC23136l9.m118742r(8.0f)).m89033Q(AbstractC23136l9.m118742r(6.0f));
        getMLine2RightSide().m89001g1(c22126c02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w0 */
    public static final void m69832w0(PromotedModuleView promotedModuleView, int i11, C16719g c16719g) {
        AbstractC12211a.b bVar;
        AbstractC19074t.m100208f(promotedModuleView, "this$0");
        C12260j parent = promotedModuleView.getParent();
        if (parent != null && (bVar = parent.f63847w) != null) {
            bVar.mo68372n0(i11);
        }
    }

    /* renamed from: x0 */
    private final void m69833x0(C18452n c18452n) {
        int i11;
        int i12 = c18452n.f92995f;
        if (i12 != 13) {
            if (i12 != 14) {
                i11 = 1;
            } else {
                i11 = 6;
            }
        } else {
            i11 = 4;
        }
        C28905e m144373n = C28905e.m144373n();
        long m137372b = c18452n.m97771q().m137372b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m137372b);
        m144373n.m144402x(sb2.toString(), 10, i11, C23793c.Companion.m124321a().mo124311f(), c18452n.m97769o().f146757t);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView, com.zing.zalo.p077ui.moduleview.message.InterfaceC12431b
    /* renamed from: C */
    public void mo69822C(C18451m c18451m, final int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69822C(c18451m, i11);
        C18452n c18452n = (C18452n) c18451m;
        m69833x0(c18452n);
        if (c18452n.f92995f == 13) {
            if (c18452n.m97770p().length() > 0) {
                C22126c0 c22126c0 = this.f64971j0;
                String upperCase = c18452n.m97770p().toUpperCase(Locale.ROOT);
                AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
                c22126c0.m111959G1(upperCase);
                this.f64971j0.mo44614b1(0);
                this.f64971j0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.ui.moduleview.message.m
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        PromotedModuleView.m69832w0(PromotedModuleView.this, i11, c16719g);
                    }
                });
            } else {
                this.f64971j0.mo44614b1(8);
            }
            this.f64970i0.mo44614b1(0);
            return;
        }
        this.f64971j0.mo44614b1(8);
        this.f64970i0.mo44614b1(8);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: e0 */
    public void mo69764e0(C18451m c18451m, int i11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69764e0(c18451m, i11);
        C16971e mAvatar = getMAvatar();
        String m153493n = ((C18452n) c18451m).m97769o().m153493n();
        AbstractC19074t.m100207e(m153493n, "getThumb(...)");
        mAvatar.m90886N1(m153493n);
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: j0 */
    public void mo69767j0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "tabMsgItem");
        super.mo69767j0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        String m153486g = ((C18452n) c18451m).m97769o().m153486g();
        AbstractC19074t.m100207e(m153486g, "getDesc(...)");
        mListItemModule.m90800B1(m153486g);
        getMListItemModule().m90801C1(TabMsgCommonItemModuleView.Companion.m69861a());
    }

    @Override // com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView
    /* renamed from: k0 */
    public void mo69768k0(C18451m c18451m, boolean z11) {
        AbstractC19074t.m100208f(c18451m, "item");
        super.mo69768k0(c18451m, z11);
        C16959c0 mListItemModule = getMListItemModule();
        String m153494o = ((C18452n) c18451m).m97769o().m153494o();
        AbstractC19074t.m100207e(m153494o, "getTitle(...)");
        mListItemModule.m90805G1(m153494o);
        getMListItemModule().m90809K1(true);
    }
}
