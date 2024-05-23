package com.zing.zalo.p077ui.moduleview.contact;

import am.AbstractC0924m0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import cd0.C3431j;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.adapters.C7232u9;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.ZaloListItemModuleView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalocore.CoreUtility;
import kd0.C21693c;
import l30.AbstractC22055v0;
import l30.C22013a0;
import l80.C22124b0;
import l80.C22126c0;
import l80.C22129e;
import me0.AbstractC23136l9;
import me0.C23212s8;
import mj0.AbstractC23322a;
import p055ce.C3432a;
import p055ce.C3442k;
import p262jb.AbstractC21196a;
import p266jg.AbstractC21244b;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p461qu.AbstractC25495a;
import p542ub.InterfaceC27218a;
import p716zh.C31980jc;
import ui0.C27280g;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes6.dex */
public class ZaloListItemModuleView extends ModulesView {

    /* renamed from: K */
    C16716d f64642K;

    /* renamed from: L */
    C22129e f64643L;

    /* renamed from: M */
    C21693c f64644M;

    /* renamed from: N */
    C21693c f64645N;

    /* renamed from: O */
    C16716d f64646O;

    /* renamed from: P */
    C22124b0 f64647P;

    /* renamed from: Q */
    C22124b0 f64648Q;

    /* renamed from: R */
    C22126c0 f64649R;

    /* renamed from: S */
    C22126c0 f64650S;

    /* renamed from: T */
    C16716d f64651T;

    /* renamed from: U */
    C21693c f64652U;

    /* renamed from: V */
    C21693c f64653V;

    /* renamed from: W */
    C23528a f64654W;

    /* renamed from: a0 */
    C3431j f64655a0;

    /* renamed from: b0 */
    C7232u9 f64656b0;

    /* renamed from: c0 */
    final int f64657c0;

    /* renamed from: d0 */
    final int f64658d0;

    /* renamed from: e0 */
    C7232u9.c f64659e0;

    /* renamed from: f0 */
    AbstractC22055v0.l f64660f0;

    /* renamed from: g0 */
    InterfaceC27218a f64661g0;

    /* renamed from: h0 */
    ContactProfile f64662h0;

    /* renamed from: i0 */
    int f64663i0;

    /* renamed from: j0 */
    int f64664j0;

    public ZaloListItemModuleView(Context context, C23528a c23528a, C7232u9 c7232u9) {
        super(context);
        this.f64654W = c23528a;
        this.f64656b0 = c7232u9;
        setId(AbstractC6918a0.cel_contact_tab_contact_cell);
        this.f64657c0 = C23212s8.m119607o(context, AbstractC21196a.TextColor1);
        this.f64658d0 = C23212s8.m119607o(context, AbstractC16781w.AppPrimaryColor);
        m88987U(-1, -2);
        int m118742r = AbstractC23136l9.m118742r(2.0f);
        int m118742r2 = AbstractC23136l9.m118742r(4.0f);
        int m118742r3 = AbstractC23136l9.m118742r(6.0f);
        int m118742r4 = AbstractC23136l9.m118742r(8.0f);
        int m118742r5 = AbstractC23136l9.m118742r(10.0f);
        int m118742r6 = AbstractC23136l9.m118742r(12.0f);
        int m118742r7 = AbstractC23136l9.m118742r(13.0f);
        int m118742r8 = AbstractC23136l9.m118742r(14.0f);
        int m118742r9 = AbstractC23136l9.m118742r(18.0f);
        this.f64664j0 = AbstractC23136l9.m118742r(16.0f);
        int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.f13);
        int m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.f85295f2);
        int m118742r10 = AbstractC23136l9.m118742r(56.0f);
        C16716d c16716d = new C16716d(context);
        this.f64642K = c16716d;
        c16716d.m89106L().m89028L(m118742r10, m118742r10).m89033Q(ZaloListView.m86977gN() ? m118742r4 : m118742r5).m89034R(m118742r6).m89035S(m118742r6).m89036T(ZaloListView.m86977gN() ? m118742r4 : m118742r5);
        C22129e c22129e = new C22129e(context, m118742r10);
        this.f64643L = c22129e;
        c22129e.m115441y1(C23212s8.m119609q(context, AbstractC16781w.default_avatar));
        C21693c c21693c = new C21693c(context);
        this.f64644M = c21693c;
        C16718f m89028L = c21693c.m89106L().m89028L(-2, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89017A(bool).m89072y(bool).m89029M(10);
        this.f64644M.mo111926w1(AbstractC16803z.ic_banned);
        this.f64645N = new C21693c(context);
        if (ZaloListView.m86977gN()) {
            this.f64645N.m89106L().m89028L(m118742r6, m118742r6).m89017A(bool).m89072y(bool).m89029M(10);
            this.f64645N.m89087B0(AbstractC16803z.online_status_green_ic_with_stroke);
        } else {
            this.f64645N.m89106L().m89028L(m118742r7, m118742r7).m89017A(bool).m89072y(bool).m89029M(10);
            this.f64645N.m89087B0(AbstractC16803z.online_status_green_ic_with_stroke_one);
        }
        this.f64642K.m89001g1(this.f64643L);
        this.f64642K.m89001g1(this.f64644M);
        this.f64642K.m89001g1(this.f64645N);
        C21693c c21693c2 = new C21693c(context);
        this.f64653V = c21693c2;
        c21693c2.m89106L().m89028L(-2, -1).m89029M(15).m89017A(bool).m89035S(ZaloListView.m86977gN() ? m118742r9 : m118742r8).m89041Y(ZaloListView.m86977gN() ? m118742r8 : m118742r6);
        this.f64653V.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f64653V.mo111925v1(C27280g.m139660c(getContext(), AbstractC23322a.zds_ic_video_line_24, AbstractC2807a.icon_secondary));
        C21693c c21693c3 = new C21693c(context);
        this.f64652U = c21693c3;
        c21693c3.m89106L().m89028L(-2, -1).m89029M(15).m89049e0(this.f64653V).m89041Y(ZaloListView.m86977gN() ? m118742r8 : m118742r6);
        this.f64652U.m89087B0(AbstractC16803z.stencils_contact_bg);
        this.f64652U.mo111925v1(C27280g.m139660c(getContext(), AbstractC23322a.zds_ic_call_line_24, AbstractC2807a.icon_secondary));
        C16716d c16716d2 = new C16716d(context);
        this.f64651T = c16716d2;
        c16716d2.m89106L().m89028L(-2, -2).m89049e0(this.f64652U).m89035S(this.f64664j0).m89027K(true);
        this.f64651T.mo44614b1(8);
        C16716d c16716d3 = new C16716d(context);
        this.f64646O = c16716d3;
        c16716d3.m89106L().m89028L(-1, -2).m89027K(true).m89036T(m118742r4).m89033Q(m118742r4).m89035S(m118742r6).m89054h0(this.f64642K).m89049e0(this.f64651T);
        C22124b0 c22124b0 = new C22124b0(context);
        this.f64647P = c22124b0;
        c22124b0.m89106L().m89028L(-2, -2);
        this.f64647P.f108888M0.m111953A1(1);
        this.f64647P.f108888M0.mo111964L1(m118655I2);
        this.f64647P.f108888M0.m111957E1(true);
        C22126c0 c22126c0 = this.f64647P.f108888M0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        c22126c0.m111980v1(truncateAt);
        this.f64647P.f108888M0.m111963K1(AbstractC23136l9.m118645D(context, AbstractC16801x.itemlist_text));
        this.f64647P.m115399p1(m118742r3);
        C22124b0 c22124b02 = new C22124b0(context);
        this.f64648Q = c22124b02;
        c22124b02.m89106L().m89028L(-2, -2).m89023G(this.f64647P).m89036T(m118742r);
        this.f64648Q.f108888M0.m111957E1(true);
        this.f64648Q.f108888M0.m111953A1(1);
        this.f64648Q.f108888M0.m111980v1(truncateAt);
        float f11 = m118655I;
        this.f64648Q.f108888M0.mo111964L1(f11);
        this.f64648Q.f108888M0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        this.f64648Q.m115399p1(m118742r3);
        C22126c0 c22126c02 = new C22126c0(context);
        this.f64649R = c22126c02;
        c22126c02.m89106L().m89028L(-2, -2).m89029M(12).m89023G(this.f64648Q).m89036T(m118742r);
        this.f64649R.m111953A1(1);
        this.f64649R.m111980v1(truncateAt);
        this.f64649R.mo111964L1(f11);
        this.f64649R.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
        C22126c0 c22126c03 = new C22126c0(context);
        this.f64650S = c22126c03;
        c22126c03.m89106L().m89028L(-2, -2).m89029M(15).m89023G(this.f64649R).m89036T(m118742r).m89042Z(m118742r2, 0, m118742r2, 0);
        this.f64650S.m111953A1(1);
        this.f64650S.mo111964L1(AbstractC23136l9.m118742r(10.0f));
        this.f64650S.m111962J1(AbstractC23136l9.m118641B(context, AbstractC2808b.f150822b70));
        this.f64650S.m89087B0(AbstractC16803z.bg_label_business_account);
        this.f64646O.m89001g1(this.f64647P);
        this.f64646O.m89001g1(this.f64648Q);
        this.f64646O.m89001g1(this.f64649R);
        this.f64646O.m89001g1(this.f64650S);
        mo69681L(this.f64642K);
        mo69681L(this.f64653V);
        mo69681L(this.f64652U);
        mo69681L(this.f64651T);
        mo69681L(this.f64646O);
        setBackgroundResource(AbstractC16803z.stencils_contact_bg);
    }

    /* renamed from: b0 */
    public /* synthetic */ void m69730b0(int i11, C16719g c16719g) {
        boolean z11;
        if (this.f64659e0 != null) {
            if (i11 >= C21927m.m114302u().f107788H && i11 <= C21927m.m114302u().f107789I) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean m114317O = C21927m.m114302u().m114317O(i11);
            C7232u9.c cVar = this.f64659e0;
            ContactProfile contactProfile = this.f64662h0;
            cVar.mo36935U7(contactProfile.f42434r, 0, contactProfile.f42430p1, z11, m114317O);
        }
    }

    /* renamed from: c0 */
    public /* synthetic */ void m69731c0(int i11, C16719g c16719g) {
        boolean z11;
        if (this.f64659e0 != null) {
            if (i11 >= C21927m.m114302u().f107788H && i11 <= C21927m.m114302u().f107789I) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean m114317O = C21927m.m114302u().m114317O(i11);
            C7232u9.c cVar = this.f64659e0;
            ContactProfile contactProfile = this.f64662h0;
            cVar.mo36935U7(contactProfile.f42434r, 1, contactProfile.f42430p1, z11, m114317O);
        }
    }

    /* renamed from: d0 */
    public /* synthetic */ void m69732d0(ContactProfile contactProfile, C16719g c16719g) {
        Context context;
        try {
            if (this.f64659e0 != null) {
                String str = contactProfile.f42434r;
                InterfaceC27218a interfaceC27218a = this.f64661g0;
                if (interfaceC27218a != null) {
                    context = interfaceC27218a.getContext();
                } else {
                    context = null;
                }
                if (AbstractC22055v0.m115114D(str, AbstractC21244b.m110054d(context))) {
                    this.f64659e0.mo36934Pm(this.f64662h0.f42434r);
                } else {
                    this.f64659e0.mo36933Gd(this.f64663i0);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e0 */
    public /* synthetic */ void m69733e0(C16719g c16719g) {
        C31980jc m115161u;
        if (this.f64660f0 != null && (m115161u = AbstractC22055v0.m115161u(this.f64662h0.f42434r)) != null) {
            this.f64660f0.mo47172c(m115161u, this.f64655a0, 332);
            AbstractC23647d.m123906p("4915410");
            AbstractC23647d.m123893c();
        }
    }

    /* renamed from: a0 */
    public void m69734a0(ContactProfile contactProfile, boolean z11, int i11) {
        String str;
        C16716d c16716d;
        C7232u9 c7232u9 = this.f64656b0;
        if (c7232u9 != null) {
            this.f64659e0 = c7232u9.f39714C;
            this.f64660f0 = c7232u9.f39713B;
            this.f64661g0 = c7232u9.f39716E;
        } else {
            this.f64659e0 = null;
            this.f64660f0 = null;
            this.f64661g0 = null;
        }
        this.f64662h0 = contactProfile;
        this.f64663i0 = i11;
        C3431j c3431j = this.f64655a0;
        if (c3431j != null && (c16716d = c3431j.f14383p) != null) {
            c16716d.mo44614b1(8);
        }
        if (contactProfile.f42434r.equals("-1")) {
            this.f64643L.mo89109M0(null);
            this.f64643L.m115429C1(false, false);
            this.f64643L.m115440x1(AbstractC16803z.icn_add_item);
            this.f64647P.f108888M0.m111959G1(contactProfile.f42437s);
            this.f64647P.f108888M0.m111962J1(this.f64658d0);
            this.f64644M.mo44614b1(8);
            this.f64649R.mo44614b1(8);
            this.f64648Q.mo44614b1(8);
            this.f64645N.mo44614b1(8);
            this.f64652U.mo44614b1(8);
            this.f64653V.mo44614b1(8);
            this.f64647P.m115401r1(0, 0, 0, 0);
            this.f64648Q.m115401r1(0, 0, 0, 0);
            return;
        }
        C22124b0 c22124b0 = this.f64648Q;
        if (c22124b0 != null) {
            c22124b0.mo44614b1(8);
            this.f64648Q.m115401r1(0, 0, 0, 0);
        }
        C21693c c21693c = this.f64644M;
        if (c21693c != null) {
            c21693c.mo44614b1(8);
        }
        if (contactProfile.f42403c1) {
            C22124b0 c22124b02 = this.f64647P;
            c22124b02.m115402s1(null, null, C23212s8.m119609q(c22124b02.getContext(), AbstractC16781w.icn_msg_new), null);
        } else {
            this.f64647P.m115401r1(0, 0, 0, 0);
        }
        boolean z12 = AbstractC25495a.m132086k(contactProfile.f42434r) || contactProfile.m40372J0() || contactProfile.f42434r.equals("-1") || contactProfile.f42434r.equals("-3") || contactProfile.f42434r.equals("-2") || contactProfile.f42434r.equals("-4") || contactProfile.f42434r.equals("-7") || contactProfile.f42434r.equals("-9") || contactProfile.f42434r.equals("-10") || contactProfile.f42434r.equals("-11") || contactProfile.f42434r.equals("-12") || contactProfile.f42434r.equals("-5");
        if (AbstractC23309i.m120823Cc() == 1 && (str = CoreUtility.f89233i) != null && !str.equals(contactProfile.f42434r) && !z12) {
            this.f64652U.mo44614b1(0);
            this.f64652U.mo89109M0(new C16719g.c() { // from class: h80.i

                /* renamed from: q */
                public final /* synthetic */ int f98210q;

                public /* synthetic */ C19933i(int i112) {
                    r2 = i112;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ZaloListItemModuleView.this.m69730b0(r2, c16719g);
                }
            });
            this.f64653V.mo44614b1(0);
            this.f64653V.mo89109M0(new C16719g.c() { // from class: h80.j

                /* renamed from: q */
                public final /* synthetic */ int f98212q;

                public /* synthetic */ C19934j(int i112) {
                    r2 = i112;
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    ZaloListItemModuleView.this.m69731c0(r2, c16719g);
                }
            });
        } else {
            this.f64652U.mo44614b1(8);
            this.f64653V.mo44614b1(8);
        }
        this.f64649R.mo44614b1(8);
        this.f64650S.mo44614b1(Boolean.valueOf(C3432a.f14402a.m17234c() && contactProfile.m40357A0() && C3442k.f14460a.m17299d(contactProfile.f42434r)).booleanValue() ? 0 : 8);
        this.f64650S.m111959G1(C3442k.f14460a.m17296a(contactProfile.f42434r));
        this.f64647P.f108888M0.m111959G1(contactProfile.m40383Q(true, false));
        this.f64647P.f108888M0.m111962J1(this.f64657c0);
        C22129e c22129e = this.f64643L;
        c22129e.m115441y1(C23212s8.m119609q(c22129e.getContext(), AbstractC16781w.default_avatar));
        C22129e c22129e2 = this.f64643L;
        c22129e2.f108931U0 = z11;
        c22129e2.m115427A1(AbstractC22055v0.m115162v(c22129e2.getContext()));
        C22129e c22129e3 = this.f64643L;
        String str2 = contactProfile.f42434r;
        InterfaceC27218a interfaceC27218a = this.f64661g0;
        boolean m115116F = AbstractC22055v0.m115116F(str2, AbstractC21244b.m110054d(interfaceC27218a != null ? interfaceC27218a.getContext() : null));
        String str3 = contactProfile.f42434r;
        InterfaceC27218a interfaceC27218a2 = this.f64661g0;
        c22129e3.m115429C1(m115116F, AbstractC22055v0.m115115E(str3, AbstractC21244b.m110054d(interfaceC27218a2 != null ? interfaceC27218a2.getContext() : null)));
        this.f64643L.m115442z1(AbstractC22055v0.m115112B(contactProfile.f42434r));
        this.f64643L.m115433q1(contactProfile);
        this.f64643L.mo89109M0(new C16719g.c() { // from class: h80.k

            /* renamed from: q */
            public final /* synthetic */ ContactProfile f98214q;

            public /* synthetic */ C19935k(ContactProfile contactProfile2) {
                r2 = contactProfile2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                ZaloListItemModuleView.this.m69732d0(r2, c16719g);
            }
        });
        if (contactProfile2.m40384Q0()) {
            C21693c c21693c2 = this.f64644M;
            if (c21693c2 != null) {
                c21693c2.mo111926w1(AbstractC16803z.ic_oa_verify);
                this.f64644M.mo44614b1(0);
            }
        } else if (contactProfile2.f42430p1) {
            C21693c c21693c3 = this.f64644M;
            if (c21693c3 != null) {
                c21693c3.mo44614b1(8);
            }
        } else {
            this.f64644M.mo44614b1(C21927m.m114302u().m114312J().m153137g(contactProfile2.f42434r) ? 0 : 8);
            if (this.f64648Q != null && !TextUtils.isEmpty(contactProfile2.f42460z1) && AbstractC0924m0.m3833g7() == 1) {
                String format = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.prefix_username), contactProfile2.f42460z1);
                String charSequence = this.f64648Q.f108888M0.m111973m1().toString();
                if (!TextUtils.isEmpty(charSequence)) {
                    format = String.format(AbstractC23136l9.m118743r0(AbstractC8020f0.str_name_with_dot_separate), charSequence, format);
                }
                this.f64648Q.f108888M0.m111959G1(format);
                this.f64648Q.mo44614b1(0);
            }
        }
        this.f64645N.mo44614b1(contactProfile2.f42430p1 ? 0 : 8);
        int m115432p1 = this.f64643L.m115432p1();
        this.f64645N.m89106L().m89032P(m115432p1, m115432p1, m115432p1, m115432p1);
        if (C22013a0.m114928g() && C22013a0.m114924c().m114932h(3)) {
            C31980jc m115161u = AbstractC22055v0.m115161u(contactProfile2.f42434r);
            if (AbstractC22055v0.m115113C(m115161u)) {
                if (this.f64655a0 == null) {
                    C3431j m17231c = C3431j.m17231c(this.f64651T);
                    this.f64655a0 = m17231c;
                    m17231c.m17195b(2);
                }
                C3431j c3431j2 = this.f64655a0;
                if (c3431j2 != null) {
                    c3431j2.f14383p.mo44614b1(0);
                    C3431j c3431j3 = this.f64655a0;
                    c3431j3.f14401x = z11;
                    c3431j3.mo17230p(m115161u, this.f64654W);
                    this.f64655a0.f14383p.mo89109M0(new C16719g.c() { // from class: h80.l
                        public /* synthetic */ C19936l() {
                        }

                        @Override // com.zing.zalo.uidrawing.C16719g.c
                        /* renamed from: y */
                        public final void mo929y(C16719g c16719g) {
                            ZaloListItemModuleView.this.m69733e0(c16719g);
                        }
                    });
                    C21693c c21693c4 = this.f64652U;
                    boolean z13 = c21693c4 != null && c21693c4.m89136d0() == 0;
                    C21693c c21693c5 = this.f64653V;
                    boolean z14 = c21693c5 != null && c21693c5.m89136d0() == 0;
                    C16718f m89106L = this.f64655a0.f14383p.m89106L();
                    if (m89106L != null) {
                        if (!z13 && !z14) {
                            m89106L.f84722r = this.f64664j0;
                        } else {
                            m89106L.f84722r = 0;
                        }
                    }
                }
            }
        }
    }
}
