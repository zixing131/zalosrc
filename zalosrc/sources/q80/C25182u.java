package q80;

import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.p077ui.moduleview.message.TabMsgCommonItemModuleView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import ga0.C19322f1;
import hd0.C20003a;
import kd0.C21693c;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import p133ek.AbstractC18458a;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* renamed from: q80.u */
/* loaded from: classes6.dex */
public final class C25182u extends C16716d {

    /* renamed from: M0 */
    private final C23528a f120810M0;

    /* renamed from: N0 */
    private final C16716d f120811N0;

    /* renamed from: O0 */
    private final C22129e f120812O0;

    /* renamed from: P0 */
    private final C22126c0 f120813P0;

    /* renamed from: Q0 */
    private final C16977g f120814Q0;

    /* renamed from: R0 */
    private final C21693c f120815R0;

    /* renamed from: S0 */
    private final C16716d f120816S0;

    /* renamed from: T0 */
    private final C22126c0 f120817T0;

    /* renamed from: U0 */
    private final C22126c0 f120818U0;

    /* renamed from: V0 */
    private final C22126c0 f120819V0;

    /* renamed from: W0 */
    private final C16719g f120820W0;

    /* renamed from: X0 */
    private final C16719g f120821X0;

    /* renamed from: Y0 */
    private final C16719g f120822Y0;

    /* renamed from: Z0 */
    private final C22126c0 f120823Z0;

    /* renamed from: a1 */
    private final C16716d f120824a1;

    /* renamed from: b1 */
    private final C22126c0 f120825b1;

    /* renamed from: c1 */
    private final C21693c f120826c1;

    /* renamed from: d1 */
    private final C21693c f120827d1;

    /* renamed from: e1 */
    private final C21693c f120828e1;

    /* renamed from: f1 */
    private final C16716d f120829f1;

    /* renamed from: g1 */
    private final C22126c0 f120830g1;

    /* renamed from: h1 */
    private final C16719g f120831h1;

    /* renamed from: i1 */
    private final int f120832i1;

    /* renamed from: j1 */
    private final int f120833j1;

    /* renamed from: k1 */
    private final int f120834k1;

    /* renamed from: l1 */
    private final int f120835l1;

    /* renamed from: m1 */
    private final int f120836m1;

    /* renamed from: n1 */
    private final InterfaceC24854k f120837n1;

    /* renamed from: o1 */
    private final int f120838o1;

    /* renamed from: p1 */
    private boolean f120839p1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q80.u$a */
    /* loaded from: classes6.dex */
    public static final class a extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ Context f120840q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f120840q = context;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a */
        public final Integer mo12V4() {
            return Integer.valueOf(AbstractC23136l9.m118712h(this.f120840q, 80.0f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25182u(Context context, C23528a c23528a) {
        super(context);
        InterfaceC24854k m129210a;
        String str;
        C22126c0 c22126c0;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(c23528a, "aQ");
        this.f120810M0 = c23528a;
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_image_size_default);
        this.f120832i1 = m118655I;
        int m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_l_r);
        this.f120833j1 = m118655I2;
        int m118655I3 = AbstractC23136l9.m118655I(AbstractC16802y.msg_item_padding_tb_ui4);
        this.f120834k1 = m118655I3;
        int m119607o = C23212s8.m119607o(context, AbstractC21196a.TextColor2);
        this.f120835l1 = m119607o;
        int m119607o2 = C23212s8.m119607o(context, AbstractC16781w.SearchGlobalTitleItemSearch);
        this.f120836m1 = m119607o2;
        m129210a = AbstractC24856m.m129210a(new a(context));
        this.f120837n1 = m129210a;
        int m118712h = AbstractC23136l9.m118712h(context, 4.0f);
        this.f120838o1 = m118712h;
        int m118712h2 = AbstractC23136l9.m118712h(context, 8.0f);
        m89106L().m89028L(-1, -2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(m118655I + m118712h2, m118655I + m118712h2).m89034R(m118655I2 - m118712h).m89035S(m118655I2 - m118712h).m89033Q(m118655I3 - m118712h).m89036T(m118655I3 - m118712h);
        this.f120811N0 = c16716d;
        C22129e c22129e = new C22129e(context, m118655I + m118712h2);
        this.f120812O0 = c22129e;
        C22126c0 c22126c02 = new C22126c0(context);
        c22126c02.m115422R1();
        c22126c02.mo111965M1(1);
        c22126c02.mo111964L1(AbstractC23136l9.m118742r(10.0f));
        c22126c02.m111962J1(AbstractC23136l9.m118639A(AbstractC16801x.white));
        c22126c02.m89087B0(AbstractC16803z.stencils_bg_number_notif);
        C16718f m89039W = c22126c02.m89106L().m89028L(-2, -2).m89029M(15).m89040X(AbstractC23136l9.m118742r(16.0f)).m89039W(AbstractC23136l9.m118742r(16.0f));
        Boolean bool = Boolean.TRUE;
        m89039W.m89017A(bool).m89018B(bool).m89035S(m118712h).m89036T(m118712h);
        this.f120813P0 = c22126c02;
        C16977g c16977g = new C16977g(context);
        c16977g.m89106L().m89028L(-2, -2).m89018B(bool).m89017A(bool).m89035S(AbstractC23222t7.f112560g).m89036T(AbstractC23222t7.f112560g);
        c16977g.mo44614b1(8);
        this.f120814Q0 = c16977g;
        C16974f c16974f = new C16974f(context);
        c16974f.m90971u(EnumC16980h.SIZE_8);
        c16974f.m90974x(EnumC16991i.CUSTOM);
        c16974f.m90970t(true);
        c16974f.m90966p(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        c16974f.m90965o(C23212s8.m119607o(context, AbstractC2807a.badge_background_red));
        c16977g.m90983u1(c16974f);
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89028L(-2, -2).m89017A(bool).m89072y(bool).m89035S(m118712h).m89033Q(m118712h);
        this.f120815R0 = c21693c;
        c16716d.m89001g1(c22129e);
        c16716d.m89001g1(c22126c02);
        c16716d.m89001g1(c21693c);
        c16716d.m89001g1(c16977g);
        C16719g c16719g = new C16719g(context);
        c16719g.m89106L().m89017A(bool).m89028L(m118655I2, -2);
        c16719g.mo44614b1(4);
        C16716d c16716d2 = new C16716d(context);
        this.f120829f1 = c16716d2;
        c16716d2.m89106L().m89028L(-2, -2).m89049e0(c16719g).m89027K(true);
        c16716d2.mo44614b1(8);
        C16716d c16716d3 = new C16716d(context);
        c16716d3.m89106L().m89017A(bool).m89034R(TabMsgCommonItemModuleView.Companion.m69863c()).m89035S(0).m89028L(-2, -2);
        this.f120820W0 = c16716d3;
        C22126c0 c22126c03 = new C22126c0(context);
        c22126c03.mo111964L1(AbstractC23136l9.m118742r(12.0f));
        c22126c03.m111962J1(m119607o);
        c22126c03.m111953A1(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c03.m111980v1(truncateAt);
        c22126c03.m89106L().m89025I(true).m89028L(-2, -2).m89017A(bool);
        c16716d3.m89001g1(c22126c03);
        this.f120830g1 = c22126c03;
        C21693c c21693c2 = new C21693c(context);
        c21693c2.mo44614b1(8);
        c21693c2.m89087B0(AbstractC16803z.stencils_contact_bg);
        c21693c2.m89106L().m89028L(-2, -1).m89041Y(m118655I3).m89029M(15).m89049e0(c16716d2);
        this.f120828e1 = c21693c2;
        C21693c c21693c3 = new C21693c(context);
        c21693c3.mo44614b1(8);
        c21693c3.m89087B0(AbstractC16803z.stencils_contact_bg);
        c21693c3.m89106L().m89028L(-2, -1).m89041Y(m118655I3).m89029M(15).m89049e0(c21693c2);
        this.f120827d1 = c21693c3;
        C21693c c21693c4 = new C21693c(context);
        c21693c4.mo44614b1(8);
        c21693c4.m89106L().m89028L(-2, -2).m89027K(true).m89046b0(m118655I2).m89047c0(m118655I2).m89049e0(c21693c3);
        this.f120826c1 = c21693c4;
        C16716d c16716d4 = new C16716d(context);
        this.f120824a1 = c16716d4;
        c16716d4.m89106L().m89028L(-2, -2).m89027K(true).m89049e0(c21693c4);
        C22126c0 c22126c04 = new C22126c0(context);
        c22126c04.mo44614b1(8);
        c22126c04.mo111965M1(1);
        c22126c04.m89106L().m89060k0(-2).m89029M(15).m89040X(AbstractC23136l9.m118742r(94.0f)).m89046b0(m118655I3).m89047c0(m118655I3);
        this.f120825b1 = c22126c04;
        AbstractC23022b5.m118023a(c22126c04, AbstractC8915g0.btnType1_medium_standard);
        c16716d4.m89001g1(c22126c04);
        C16716d c16716d5 = new C16716d(context);
        c16716d5.m89106L().m89028L(-1, -2).m89049e0(c16716d3);
        this.f120821X0 = c16716d5;
        C16716d c16716d6 = new C16716d(context);
        c16716d6.mo44614b1(8);
        c16716d6.m89106L().m89028L(-2, -2).m89017A(bool).m89034R(AbstractC23136l9.m118742r(4.0f)).m89027K(true);
        this.f120822Y0 = c16716d6;
        c16716d5.m89001g1(c16716d6);
        C22126c0 c22126c05 = new C22126c0(context);
        c22126c05.m111953A1(1);
        c22126c05.m111957E1(true);
        c22126c05.m111980v1(truncateAt);
        c22126c05.m111962J1(m119607o2);
        c22126c05.mo111964L1(AbstractC23136l9.m118742r(15.0f));
        c22126c05.m89106L().m89028L(-1, -2);
        this.f120817T0 = c22126c05;
        c16716d5.m89001g1(c22126c05);
        C22126c0 c22126c06 = new C22126c0(context);
        c22126c06.m111953A1(1);
        c22126c06.m111957E1(true);
        c22126c06.m111980v1(truncateAt);
        c22126c06.mo44614b1(8);
        c22126c06.m111962J1(m119607o);
        c22126c06.mo111964L1(AbstractC23136l9.m118742r(14.0f));
        c22126c06.m89106L().m89028L(-1, -2).m89023G(c16716d5).m89050f0(new C20003a(true, c16716d3));
        this.f120818U0 = c22126c06;
        C22126c0 c22126c07 = new C22126c0(context);
        c22126c07.m111953A1(1);
        c22126c07.m111957E1(true);
        c22126c07.m111980v1(truncateAt);
        if (AbstractC19074t.m100204b("vi", AbstractC18458a.f93019a)) {
            str = "QC";
        } else {
            str = "AD";
        }
        c22126c07.m111959G1(str);
        c22126c07.m111962J1(m119607o);
        c22126c07.mo111964L1(AbstractC23136l9.m118742r(11.0f));
        int m118742r = AbstractC23136l9.m118742r(5.0f);
        int m118742r2 = AbstractC23136l9.m118742r(2.0f);
        c22126c07.m89106L().m89028L(-2, -2).m89032P(m118742r, m118742r2, m118742r, m118742r2);
        c16716d6.m89001g1(c22126c07);
        this.f120823Z0 = c22126c07;
        if (C19322f1.f95953d) {
            c22126c0 = new C22126c0(context);
            c22126c0.m111953A1(3);
            c22126c0.m111962J1(-1);
            c22126c0.mo111964L1(AbstractC23136l9.m118759w1(10));
            c22126c0.mo111965M1(1);
            c22126c0.m89087B0(AbstractC16803z.roundedcorneredview_male);
            c22126c0.m89106L().m89028L(-2, -2).m89042Z(AbstractC23136l9.m118742r(4.0f), 0, AbstractC23136l9.m118742r(4.0f), 0).m89023G(c22126c06);
        } else {
            c22126c0 = null;
        }
        this.f120819V0 = c22126c0;
        C16716d c16716d7 = new C16716d(context);
        c16716d7.m89106L().m89028L(-1, -2).m89049e0(c16716d4).m89054h0(c16716d).m89027K(true);
        c16716d7.m89001g1(c16716d5);
        c16716d7.m89001g1(c22126c06);
        if (c22126c0 != null) {
            c16716d7.m89001g1(c22126c0);
        }
        c16716d7.m89001g1(c16716d3);
        this.f120816S0 = c16716d7;
        C16719g c16719g2 = new C16719g(context);
        c16719g2.m89106L().m89028L(-1, 1).m89072y(bool);
        c16719g2.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
        this.f120831h1 = c16719g2;
        m89001g1(c16716d);
        m89001g1(c16719g);
        m89001g1(c16716d2);
        m89001g1(c21693c2);
        m89001g1(c21693c3);
        m89001g1(c21693c4);
        m89001g1(c16716d4);
        m89001g1(c16716d7);
        m89001g1(c16719g2);
        m89087B0(AbstractC16803z.search_global_bg_rect_white_with_press_state);
    }

    /* renamed from: A1 */
    public final C22126c0 m130341A1() {
        return this.f120823Z0;
    }

    /* renamed from: B1 */
    public final C22126c0 m130342B1() {
        return this.f120825b1;
    }

    /* renamed from: C1 */
    public final int m130343C1() {
        return this.f120835l1;
    }

    /* renamed from: D1 */
    public final C22126c0 m130344D1() {
        return this.f120830g1;
    }

    /* renamed from: E1 */
    public final void m130345E1(boolean z11) {
        if (this.f120839p1 != z11) {
            this.f120839p1 = z11;
            if (z11) {
                this.f120821X0.m89106L().m89060k0(-2).m89049e0(null).m89047c0(this.f120838o1);
                this.f120817T0.m89106L().m89060k0(-2).m89049e0(this.f120822Y0);
                this.f120822Y0.mo44614b1(0);
            } else {
                this.f120821X0.m89106L().m89060k0(-1).m89050f0(new C20003a(true, this.f120820W0)).m89047c0(0);
                this.f120817T0.m89106L().m89060k0(-1).m89049e0(null);
                this.f120822Y0.mo44614b1(8);
            }
        }
    }

    /* renamed from: o1 */
    public final C21693c m130346o1() {
        return this.f120815R0;
    }

    /* renamed from: p1 */
    public final C16719g m130347p1() {
        return this.f120831h1;
    }

    /* renamed from: q1 */
    public final C22126c0 m130348q1() {
        return this.f120819V0;
    }

    /* renamed from: r1 */
    public final C22129e m130349r1() {
        return this.f120812O0;
    }

    /* renamed from: s1 */
    public final C21693c m130350s1() {
        return this.f120827d1;
    }

    /* renamed from: t1 */
    public final C21693c m130351t1() {
        return this.f120828e1;
    }

    /* renamed from: u1 */
    public final int m130352u1() {
        return ((Number) this.f120837n1.getValue()).intValue();
    }

    /* renamed from: v1 */
    public final C22126c0 m130353v1() {
        return this.f120817T0;
    }

    /* renamed from: w1 */
    public final C22126c0 m130354w1() {
        return this.f120813P0;
    }

    /* renamed from: x1 */
    public final C16977g m130355x1() {
        return this.f120814Q0;
    }

    /* renamed from: y1 */
    public final C22126c0 m130356y1() {
        return this.f120818U0;
    }

    /* renamed from: z1 */
    public final C16719g m130357z1() {
        return this.f120822Y0;
    }
}
