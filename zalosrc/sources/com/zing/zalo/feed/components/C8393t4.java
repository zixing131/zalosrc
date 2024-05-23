package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3047v0;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17466e;
import is.AbstractC20814p0;
import is.AbstractC20826v0;
import kd0.C21693c;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p604wb.C28905e;

/* renamed from: com.zing.zalo.feed.components.t4 */
/* loaded from: classes4.dex */
public class C8393t4 extends C16716d {

    /* renamed from: M0 */
    protected C22122a0 f45725M0;

    /* renamed from: N0 */
    protected C22122a0 f45726N0;

    /* renamed from: O0 */
    protected C22122a0 f45727O0;

    /* renamed from: P0 */
    C22126c0 f45728P0;

    /* renamed from: Q0 */
    C22126c0 f45729Q0;

    /* renamed from: R0 */
    C22126c0 f45730R0;

    /* renamed from: S0 */
    C22126c0 f45731S0;

    /* renamed from: T0 */
    C22126c0 f45732T0;

    /* renamed from: U0 */
    C22126c0 f45733U0;

    /* renamed from: V0 */
    C16719g f45734V0;

    /* renamed from: W0 */
    C16719g f45735W0;

    /* renamed from: X0 */
    C16716d f45736X0;

    /* renamed from: Y0 */
    C16716d f45737Y0;

    /* renamed from: Z0 */
    protected C23528a f45738Z0;

    /* renamed from: a1 */
    protected int f45739a1;

    public C8393t4(Context context) {
        super(context);
    }

    /* renamed from: A1 */
    private void m44876A1(C3020p0 c3020p0) {
        if (!TextUtils.isEmpty(c3020p0.f12061t)) {
            this.f45734V0.mo44614b1(0);
            this.f45728P0.mo44614b1(0);
            C22126c0 c22126c0 = this.f45728P0;
            if (c22126c0 != null) {
                c22126c0.m111959G1(c3020p0.f12061t);
                return;
            }
            return;
        }
        this.f45734V0.mo44614b1(8);
        this.f45728P0.mo44614b1(8);
        C22126c0 c22126c02 = this.f45728P0;
        if (c22126c02 != null) {
            c22126c02.m111959G1("");
        }
    }

    /* renamed from: w1 */
    private void m44877w1(C3020p0 c3020p0) {
        C3047v0 c3047v0;
        if (this.f45726N0 != null && (c3047v0 = c3020p0.f12022B) != null) {
            int i11 = c3047v0.f12279a;
            if (ContactProfile.m40347T0(i11) && ContactProfile.m40345C0(i11)) {
                this.f45726N0.mo44614b1(0);
            } else {
                this.f45726N0.mo44614b1(4);
            }
        }
    }

    /* renamed from: x1 */
    private void m44878x1(C3020p0 c3020p0) {
        C16716d c16716d = this.f45736X0;
        if (c16716d != null) {
            if (c3020p0.f12023C.f12111b != null) {
                c16716d.mo44614b1(0);
            } else {
                c16716d.mo44614b1(8);
            }
        }
    }

    /* renamed from: y1 */
    private void m44879y1(C3020p0 c3020p0) {
        if (this.f45733U0 != null) {
            if (!TextUtils.isEmpty(c3020p0.f12022B.f12292n)) {
                this.f45733U0.m111959G1(c3020p0.f12022B.f12292n);
                this.f45733U0.mo44614b1(0);
            } else {
                this.f45733U0.mo44614b1(8);
            }
        }
    }

    /* renamed from: z1 */
    private void m44880z1(C3000l0 c3000l0, int i11, InterfaceC10867f interfaceC10867f) {
        AbstractC20814p0.m108612J0(c3000l0, i11, this.f45729Q0, this.f45735W0, interfaceC10867f);
    }

    /* renamed from: o1 */
    public void m44881o1(Context context, int i11) {
        this.f45738Z0 = new C23528a(context);
        this.f45739a1 = i11;
        try {
            m89085A0(AbstractC23136l9.m118665N(context, AbstractC17466e.white));
            C22126c0 c22126c0 = new C22126c0(getContext());
            this.f45728P0 = c22126c0;
            c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118742r(35.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89029M(13).m89033Q(AbstractC23136l9.m118742r(8.0f));
            this.f45728P0.m111962J1(C23212s8.m119607o(context, AbstractC16781w.suggest_header_text_color));
            this.f45728P0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85298f5));
            this.f45728P0.mo111965M1(1);
            this.f45728P0.m111982x1(false);
            m89001g1(this.f45728P0);
            C16719g c16719g = new C16719g(getContext());
            this.f45734V0 = c16719g;
            c16719g.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(1.0f)).m89023G(this.f45728P0);
            this.f45734V0.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            m89001g1(this.f45734V0);
            C22126c0 c22126c02 = new C22126c0(getContext());
            this.f45729Q0 = c22126c02;
            c22126c02.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f45734V0).m89033Q(AbstractC23136l9.m118742r(8.0f)).m89034R(AbstractC23136l9.m118742r(10.0f)).m89035S(AbstractC23136l9.m118742r(10.0f)).m89036T(AbstractC23136l9.m118742r(8.0f)).m89029M(13).m89033Q(AbstractC23136l9.m118742r(8.0f));
            this.f45729Q0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f45729Q0.m111953A1(2);
            this.f45729Q0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
            m89001g1(this.f45729Q0);
            C16719g c16719g2 = new C16719g(getContext());
            this.f45735W0 = c16719g2;
            c16719g2.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(1.0f)).m89023G(this.f45729Q0);
            this.f45735W0.mo89161z0(C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor));
            m89001g1(this.f45735W0);
            C16716d c16716d = new C16716d(getContext());
            c16716d.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45735W0).m89048d0(AbstractC23136l9.m118655I(AbstractC16802y.feed_avatar_margin_top));
            m89001g1(c16716d);
            C16716d c16716d2 = new C16716d(context);
            this.f45737Y0 = c16716d2;
            c16716d2.m89106L().m89028L(AbstractC23136l9.m118655I(AbstractC16802y.avt_S), AbstractC23136l9.m118655I(AbstractC16802y.avt_S)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_avatar_margin_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_avatar_margin_right)).m89027K(true);
            c16716d.m89001g1(this.f45737Y0);
            C22122a0 c22122a0 = new C22122a0(context);
            this.f45725M0 = c22122a0;
            c22122a0.m89106L().m89060k0(AbstractC23136l9.m118655I(AbstractC16802y.avt_S)).m89030N(AbstractC23136l9.m118655I(AbstractC16802y.avt_S));
            this.f45725M0.m111929z1(5);
            this.f45737Y0.m89001g1(this.f45725M0);
            C22122a0 c22122a02 = new C22122a0(context);
            this.f45726N0 = c22122a02;
            C16718f m89030N = c22122a02.m89106L().m89060k0(AbstractC23136l9.m118742r(12.0f)).m89030N(AbstractC23136l9.m118742r(12.0f));
            Boolean bool = Boolean.TRUE;
            m89030N.m89072y(bool).m89017A(bool);
            this.f45726N0.mo111926w1(AbstractC16803z.ic_oa_verify);
            this.f45726N0.mo44614b1(4);
            this.f45737Y0.m89001g1(this.f45726N0);
            C22122a0 c22122a03 = new C22122a0(context);
            this.f45727O0 = c22122a03;
            c22122a03.m89106L().m89060k0(-2).m89030N(-2).m89017A(bool).m89035S(AbstractC23136l9.m118742r(6.0f)).m89020D(this.f45737Y0).m89067t(this.f45737Y0).m89041Y(AbstractC23136l9.m118742r(6.0f));
            this.f45727O0.m89087B0(AbstractC16803z.bg_btn_postfeed);
            this.f45727O0.mo111926w1(AbstractC16803z.ic_more_feed);
            c16716d.m89001g1(this.f45727O0);
            C16716d c16716d3 = new C16716d(getContext());
            c16716d3.m89106L().m89060k0(-2).m89030N(-2).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89049e0(this.f45727O0).m89054h0(this.f45737Y0).m89027K(true);
            c16716d.m89001g1(c16716d3);
            C22126c0 c22126c03 = new C22126c0(getContext());
            this.f45730R0 = c22126c03;
            c22126c03.m89106L().m89060k0(-2).m89030N(-2);
            C22126c0 c22126c04 = this.f45730R0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c04.m111980v1(truncateAt);
            this.f45730R0.m111957E1(true);
            this.f45730R0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85296f3));
            this.f45730R0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45730R0.mo111965M1(1);
            c16716d3.m89001g1(this.f45730R0);
            C22126c0 c22126c05 = new C22126c0(getContext());
            this.f45733U0 = c22126c05;
            c22126c05.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f45730R0);
            this.f45733U0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f45733U0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            c16716d3.m89001g1(this.f45733U0);
            C16716d c16716d4 = new C16716d(getContext());
            this.f45736X0 = c16716d4;
            c16716d4.m89106L().m89060k0(-2).m89030N(-2).m89054h0(this.f45733U0);
            c16716d3.m89001g1(this.f45736X0);
            C21693c c21693c = new C21693c(getContext());
            c21693c.m89106L().m89060k0(-2).m89030N(-2).m89047c0(AbstractC23136l9.m118742r(4.0f)).m89029M(12).m89027K(true);
            c21693c.mo111926w1(AbstractC16803z.ic_location_adv);
            this.f45736X0.m89001g1(c21693c);
            C22126c0 c22126c06 = new C22126c0(getContext());
            this.f45731S0 = c22126c06;
            c22126c06.m89106L().m89060k0(-2).m89030N(-2).m89054h0(c21693c);
            this.f45731S0.m111980v1(truncateAt);
            this.f45731S0.m111957E1(true);
            this.f45731S0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f71));
            this.f45731S0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f45731S0.m111959G1(AbstractC23136l9.m118743r0(AbstractC8020f0.str_feed_ads_location));
            this.f45736X0.m89001g1(this.f45731S0);
            C22126c0 c22126c07 = new C22126c0(getContext());
            this.f45732T0 = c22126c07;
            c22126c07.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89036T(AbstractC23136l9.m118742r(12.0f)).m89023G(c16716d).m89029M(12);
            this.f45732T0.m111982x1(true);
            this.f45732T0.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f45732T0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
            this.f45732T0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45732T0.m111953A1(4);
            this.f45732T0.m111980v1(truncateAt);
            m89001g1(this.f45732T0);
            C16719g c16719g3 = new C16719g(context);
            c16719g3.m89106L().m89060k0(-1).m89030N(1).m89023G(this.f45732T0).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top));
            m89001g1(c16719g3);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p1 */
    public void m44882p1(C3000l0 c3000l0, int i11, boolean z11, InterfaceC10867f interfaceC10867f) {
        try {
            AbstractC20814p0.m108655l0(c3000l0, i11, null, this.f45730R0, this.f45725M0, null, z11, this.f45738Z0, interfaceC10867f, this.f45739a1);
            if (c3000l0 == null) {
                return;
            }
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            int i12 = this.f45739a1;
            int i13 = 8;
            if (i12 != 0 && i12 != 1) {
                this.f45727O0.mo44614b1(8);
                this.f45728P0.mo44614b1(8);
                this.f45734V0.mo44614b1(8);
                this.f45729Q0.mo44614b1(8);
                this.f45735W0.mo44614b1(8);
                m44878x1(m14324b0);
                m44879y1(m14324b0);
                m44877w1(m14324b0);
            }
            C22122a0 c22122a0 = this.f45727O0;
            if (C28905e.f133812l == 1) {
                i13 = 0;
            }
            c22122a0.mo44614b1(i13);
            m44876A1(m14324b0);
            m44880z1(c3000l0, i11, interfaceC10867f);
            m44878x1(m14324b0);
            m44879y1(m14324b0);
            m44877w1(m14324b0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: q1 */
    public void m44883q1(int i11) {
        C22126c0 c22126c0 = this.f45729Q0;
        if (c22126c0 != null) {
            c22126c0.mo44614b1(i11);
        }
        C16719g c16719g = this.f45735W0;
        if (c16719g != null) {
            c16719g.mo44614b1(i11);
        }
    }

    /* renamed from: r1 */
    public void m44884r1(int i11) {
        C22126c0 c22126c0 = this.f45728P0;
        if (c22126c0 != null) {
            c22126c0.mo44614b1(i11);
        }
    }

    /* renamed from: s1 */
    public void m44885s1(Context context, C3000l0 c3000l0, int i11, InterfaceC10867f interfaceC10867f) {
        boolean z11;
        C22126c0 c22126c0;
        if (c3000l0 == null) {
            return;
        }
        try {
            C3020p0 m14324b0 = c3000l0.m14324b0(i11);
            if (m14324b0 == null) {
                return;
            }
            C22126c0 c22126c02 = this.f45732T0;
            if (this.f45739a1 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            AbstractC20814p0.m108679x0(m14324b0, c22126c02, false, z11, context, interfaceC10867f);
            if (this.f45739a1 == 1 && (c22126c0 = this.f45732T0) != null) {
                c22126c0.m89106L().m89030N(c3000l0.f11861J);
                if (c3000l0.f11861J > 0) {
                    this.f45732T0.mo44614b1(0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t1 */
    public void m44886t1(View.OnClickListener onClickListener) {
        C22122a0 c22122a0 = this.f45727O0;
        if (c22122a0 != null) {
            c22122a0.mo89109M0(AbstractC20826v0.m108807f(onClickListener));
        }
    }

    /* renamed from: u1 */
    public void m44887u1(C16719g.c cVar) {
        C22122a0 c22122a0 = this.f45725M0;
        if (c22122a0 != null) {
            c22122a0.mo89109M0(cVar);
        }
        C22126c0 c22126c0 = this.f45730R0;
        if (c22126c0 != null) {
            c22126c0.mo89109M0(cVar);
        }
    }

    /* renamed from: v1 */
    public void m44888v1(C16719g.c cVar) {
        C16716d c16716d = this.f45736X0;
        if (c16716d != null) {
            c16716d.mo89109M0(cVar);
        }
    }
}
