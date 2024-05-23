package com.zing.zalo.feed.mvp.feed.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import bo.C3000l0;
import bo.InterfaceC3045u2;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.feed.mvp.feed.view.UndoTabRowView;
import com.zing.zalo.p077ui.widget.C13814x1;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C17023o;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.C20832y0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p022ap.C2276g;
import p022ap.C2277h;
import p304ks.AbstractC21935u;
import p688yo.EnumC31036b;
import ui0.C27280g;

/* loaded from: classes4.dex */
public final class UndoTabRowView extends ModulesView {
    public static final C8568a Companion = new C8568a(null);

    /* renamed from: K */
    public C16716d f46274K;

    /* renamed from: L */
    public C16716d f46275L;

    /* renamed from: M */
    public C16716d f46276M;

    /* renamed from: N */
    public C16716d f46277N;

    /* renamed from: O */
    public C22126c0 f46278O;

    /* renamed from: P */
    public C17023o f46279P;

    /* renamed from: Q */
    public C17023o f46280Q;

    /* renamed from: R */
    private int f46281R;

    /* renamed from: S */
    private int f46282S;

    /* renamed from: com.zing.zalo.feed.mvp.feed.view.UndoTabRowView$a */
    /* loaded from: classes4.dex */
    public static final class C8568a {
        private C8568a() {
        }

        public /* synthetic */ C8568a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoTabRowView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        m45672b0(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public static final void m45669Y(InterfaceC3045u2 interfaceC3045u2, C3000l0 c3000l0, C16719g c16719g) {
        AbstractC19074t.m100208f(interfaceC3045u2, "$listener");
        AbstractC19074t.m100208f(c3000l0, "$feedContent");
        interfaceC3045u2.mo14631rG(new C2276g(c3000l0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m45670a0(InterfaceC3045u2 interfaceC3045u2, C3000l0 c3000l0, C16719g c16719g) {
        AbstractC19074t.m100208f(interfaceC3045u2, "$listener");
        AbstractC19074t.m100208f(c3000l0, "$feedContent");
        interfaceC3045u2.mo14631rG(new C2277h(c3000l0));
    }

    private final int getTextWidthAvailable() {
        int i11;
        int m118722k0 = (AbstractC23136l9.m118722k0() / 2) - AbstractC23136l9.m118742r(36.0f);
        if (getButtonModule().m89136d0() == 0) {
            i11 = this.f46281R;
        } else {
            i11 = this.f46282S;
        }
        float f11 = 16.0f;
        int m118742r = AbstractC23136l9.m118742r(16.0f) * 2;
        int m118742r2 = AbstractC23136l9.m118742r(6.0f) * 2;
        int m118742r3 = AbstractC23136l9.m118742r(16.0f) * 2;
        if (getButtonModule().m89136d0() == 0) {
            f11 = 12.0f;
        }
        int m118722k02 = ((((AbstractC23136l9.m118722k0() - m118742r3) - m118742r) - m118742r2) - i11) - AbstractC23136l9.m118742r(f11);
        if (m118722k02 > 0) {
            return m118722k02;
        }
        return m118722k0;
    }

    /* renamed from: X */
    public final void m45671X(final C3000l0 c3000l0, final InterfaceC3045u2 interfaceC3045u2) {
        int i11;
        AbstractC19074t.m100208f(c3000l0, "feedContent");
        AbstractC19074t.m100208f(interfaceC3045u2, "listener");
        String m114542i = AbstractC21935u.m114542i(c3000l0.f11883f0, c3000l0.f11884g0);
        Boolean bool = c3000l0.f11885h0;
        AbstractC19074t.m100207e(bool, "enableUndoMoveTab");
        if (bool.booleanValue()) {
            getCloseButton().mo44614b1(8);
            getButtonModule().mo44614b1(0);
            getButtonModule().mo89109M0(new C16719g.c() { // from class: xo.i
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    UndoTabRowView.m45669Y(InterfaceC3045u2.this, c3000l0, c16719g);
                }
            });
        } else {
            getCloseButton().mo44614b1(0);
            getButtonModule().mo44614b1(8);
            getCloseButton().mo89109M0(new C16719g.c() { // from class: xo.j
                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    UndoTabRowView.m45670a0(InterfaceC3045u2.this, c3000l0, c16719g);
                }
            });
        }
        if (c3000l0.f11896q0 == EnumC31036b.f143137p.m150864c()) {
            i11 = AbstractC8020f0.str_feed_item_option_moved_tab_other_title;
        } else {
            i11 = AbstractC8020f0.str_feed_item_option_moved_tab_main_title;
        }
        String m118746s0 = AbstractC23136l9.m118746s0(i11, m114542i);
        AbstractC19074t.m100207e(m118746s0, "getString(...)");
        int textWidthAvailable = getTextWidthAvailable();
        C20832y0 c20832y0 = C20832y0.f102396a;
        C20832y0.a aVar = new C20832y0.a(m118746s0, getTitleTextView().m111977q1(), null, 4, null);
        AbstractC19074t.m100205c(m114542i);
        getTitleTextView().m111959G1(c20832y0.m108877e(aVar, m114542i, textWidthAvailable, 3, C20832y0.b.f102402q));
    }

    /* renamed from: b0 */
    public final void m45672b0(Context context) {
        AbstractC19074t.m100208f(context, "context");
        setBackgroundView(new C16716d(context));
        getBackgroundView().m89106L().m89031O(AbstractC23136l9.m118742r(16.0f));
        getBackgroundView().m89085A0(new C13814x1("515151", 255, 0, new float[]{24.0f, 24.0f, 24.0f, 24.0f, 24.0f, 24.0f, 24.0f, 24.0f}, C13814x1.Companion.m77075a()).m77073c());
        setContentContainerView(new C16716d(context));
        int m118742r = AbstractC23136l9.m118742r(6.0f);
        getContentContainerView().m89106L().m89034R(m118742r).m89035S(m118742r).m89041Y(AbstractC23222t7.f112586t);
        getContentContainerView().m89087B0(AbstractC16803z.background_feed_item_option);
        setActionView(new C16716d(context));
        C16718f m89030N = getActionView().m89106L().m89060k0(-2).m89030N(-2);
        Boolean bool = Boolean.TRUE;
        m89030N.m89017A(bool).m89027K(true);
        getContentContainerView().m89001g1(getActionView());
        setContentView(new C16716d(context));
        getContentView().m89106L().m89060k0(-1).m89073z(bool).m89049e0(getActionView()).m89027K(true);
        getContentContainerView().m89001g1(getContentView());
        getBackgroundView().m89001g1(getContentContainerView());
        mo69681L(getBackgroundView());
        setButtonModule(new C17023o(context));
        getButtonModule().m89106L().m89034R(AbstractC23222t7.f112576o);
        getButtonModule().m91110o1(AbstractC2814h.ButtonSmall_SecondaryNeutral);
        getButtonModule().m91115v1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_social_setting_undo));
        getButtonModule().setIdTracking("timeline_undo_move_tab");
        getActionView().m89001g1(getButtonModule());
        getButtonModule().m89150n0(AbstractC23136l9.m118722k0(), 0, AbstractC23136l9.m118713h0(), 0);
        this.f46281R = getButtonModule().m89114P();
        setCloseButton(new C17023o(context));
        getCloseButton().m89106L().m89034R(AbstractC23222t7.f112586t);
        getCloseButton().m91110o1(AbstractC2814h.ButtonSmall);
        getCloseButton().m91112r1(C27280g.m139660c(context, AbstractC23322a.zds_ic_close_line_16, AbstractC2807a.icon_01));
        getCloseButton().setIdTracking("timeline_undo_move_tab_close");
        getActionView().m89001g1(getCloseButton());
        getCloseButton().m89150n0(AbstractC23136l9.m118722k0(), 0, AbstractC23136l9.m118713h0(), 0);
        this.f46282S = getCloseButton().m89114P();
        setTitleTextView(new C22126c0(context));
        getTitleTextView().m89106L().m89060k0(-1).m89030N(-2);
        getTitleTextView().m111953A1(3);
        getTitleTextView().m111980v1(TextUtils.TruncateAt.END);
        getTitleTextView().mo111964L1(AbstractC23136l9.m118742r(15.0f) * 1.0f);
        getTitleTextView().m111962J1(C23212s8.m119607o(context, AbstractC2807a.text_02));
        getContentView().m89001g1(getTitleTextView());
    }

    public final C16716d getActionView() {
        C16716d c16716d = this.f46275L;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("actionView");
        return null;
    }

    public final C16716d getBackgroundView() {
        C16716d c16716d = this.f46277N;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("backgroundView");
        return null;
    }

    public final C17023o getButtonModule() {
        C17023o c17023o = this.f46279P;
        if (c17023o != null) {
            return c17023o;
        }
        AbstractC19074t.m100223u("buttonModule");
        return null;
    }

    public final C17023o getCloseButton() {
        C17023o c17023o = this.f46280Q;
        if (c17023o != null) {
            return c17023o;
        }
        AbstractC19074t.m100223u("closeButton");
        return null;
    }

    public final C16716d getContentContainerView() {
        C16716d c16716d = this.f46276M;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("contentContainerView");
        return null;
    }

    public final C16716d getContentView() {
        C16716d c16716d = this.f46274K;
        if (c16716d != null) {
            return c16716d;
        }
        AbstractC19074t.m100223u("contentView");
        return null;
    }

    public final C22126c0 getTitleTextView() {
        C22126c0 c22126c0 = this.f46278O;
        if (c22126c0 != null) {
            return c22126c0;
        }
        AbstractC19074t.m100223u("titleTextView");
        return null;
    }

    public final void setActionView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f46275L = c16716d;
    }

    public final void setBackgroundView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f46277N = c16716d;
    }

    public final void setButtonModule(C17023o c17023o) {
        AbstractC19074t.m100208f(c17023o, "<set-?>");
        this.f46279P = c17023o;
    }

    public final void setCloseButton(C17023o c17023o) {
        AbstractC19074t.m100208f(c17023o, "<set-?>");
        this.f46280Q = c17023o;
    }

    public final void setContentContainerView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f46276M = c16716d;
    }

    public final void setContentView(C16716d c16716d) {
        AbstractC19074t.m100208f(c16716d, "<set-?>");
        this.f46274K = c16716d;
    }

    public final void setTitleTextView(C22126c0 c22126c0) {
        AbstractC19074t.m100208f(c22126c0, "<set-?>");
        this.f46278O = c22126c0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UndoTabRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        m45672b0(context);
    }
}
