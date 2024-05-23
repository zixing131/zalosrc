package com.zing.zalo.feed.components.suggestitems;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import com.androidquery.util.C3979l;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemBaseModuleView;
import com.zing.zalo.feed.uicontrols.C8870b;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.util.List;
import l80.C22122a0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import org.json.JSONObject;
import p041bu.C3142a;
import p248iy.AbstractC20887g;
import p262jb.AbstractC21196a;
import p304ks.C21927m;
import p348mi.AbstractC23304d;
import p348mi.AbstractC23306f;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p489rn.C25866f0;
import p552un.AbstractC27321d;
import p552un.C27318a;
import p552un.C27319b;
import p552un.C27320c;
import p615wn.C29106b;
import p716zh.C32145v4;
import qm0.AbstractC25368s;

/* loaded from: classes4.dex */
public final class SuggestItemOAPhotoModulesView extends FeedItemBaseModuleView {

    /* renamed from: f0 */
    private final C8870b f45686f0;

    /* renamed from: g0 */
    private final C22126c0 f45687g0;

    /* renamed from: h0 */
    private final C22126c0 f45688h0;

    /* renamed from: i0 */
    private final C22126c0 f45689i0;

    /* renamed from: j0 */
    private final C16716d f45690j0;

    /* renamed from: k0 */
    private final C27318a f45691k0;

    /* renamed from: l0 */
    private final C27318a f45692l0;

    /* renamed from: m0 */
    private final C27318a f45693m0;

    /* renamed from: n0 */
    private final C16719g f45694n0;

    /* renamed from: o0 */
    private final C16716d f45695o0;

    /* renamed from: p0 */
    private final C16716d f45696p0;

    /* renamed from: q0 */
    private final C16716d f45697q0;

    /* renamed from: r0 */
    private C16719g f45698r0;

    /* renamed from: s0 */
    private final C27319b f45699s0;

    /* renamed from: com.zing.zalo.feed.components.suggestitems.SuggestItemOAPhotoModulesView$a */
    /* loaded from: classes4.dex */
    public static final class C8385a extends C22122a0.d {
        C8385a() {
        }

        @Override // l80.C22122a0.d
        /* renamed from: h */
        public void mo43943h(String str, C22122a0 c22122a0, C3979l c3979l, C23995f c23995f, boolean z11) {
            long j11;
            super.mo43943h(str, c22122a0, c3979l, c23995f, z11);
            if (c3979l != null) {
                if (c23995f != null) {
                    j11 = c23995f.m125661l();
                } else {
                    j11 = 0;
                }
                AbstractC20887g.m109247y(500067, 0L, 0L, j11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuggestItemOAPhotoModulesView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f45686f0 = new C8870b(context);
        this.f45687g0 = new C22126c0(context);
        this.f45688h0 = new C22126c0(context);
        this.f45689i0 = new C22126c0(context);
        this.f45690j0 = new C16716d(context);
        this.f45691k0 = new C27318a(context);
        this.f45692l0 = new C27318a(context);
        this.f45693m0 = new C27318a(context);
        this.f45694n0 = new C16719g(context);
        this.f45695o0 = new C16716d(context);
        this.f45696p0 = new C16716d(context);
        this.f45697q0 = new C16716d(context);
        this.f45698r0 = new C16719g(context);
        this.f45699s0 = new C27319b(context);
    }

    /* renamed from: m0 */
    private final void m44861m0(C16716d c16716d) {
        c16716d.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89048d0(AbstractC23136l9.m118742r(7.0f)).m89044a0(AbstractC23136l9.m118742r(7.0f)).m89046b0(AbstractC23136l9.m118742r(16.0f)).m89047c0(AbstractC23136l9.m118742r(16.0f)).m89029M(15);
    }

    /* renamed from: n0 */
    private final void m44862n0(C22126c0 c22126c0) {
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f45687g0);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor2));
        c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f71));
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        c22126c0.m111953A1(1);
        c22126c0.m111982x1(false);
    }

    /* renamed from: o0 */
    private final void m44863o0(C16716d c16716d) {
        c16716d.m89106L().m89060k0(-2).m89030N(-2).m89049e0(this.f45693m0).m89070w(this.f45693m0);
    }

    /* renamed from: p0 */
    private final void m44864p0(C22126c0 c22126c0) {
        c22126c0.m89106L().m89060k0(-2).m89030N(-2);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor2));
        c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f71));
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        c22126c0.m111953A1(1);
        c22126c0.m111982x1(false);
    }

    /* renamed from: q0 */
    private final void m44865q0(C16719g c16719g) {
        c16719g.m89106L().m89060k0(-1).m89030N(1);
        c16719g.mo89161z0(C23212s8.m119607o(c16719g.getContext(), AbstractC16781w.SeparatorColor1));
    }

    /* renamed from: r0 */
    private final void m44866r0(C16716d c16716d) {
        c16716d.m89106L().m89060k0(-2).m89030N(-2).m89036T(AbstractC23136l9.m118742r(6.0f));
        c16716d.m89106L().m89023G(this.f45688h0);
    }

    /* renamed from: s0 */
    private final void m44867s0(C22126c0 c22126c0) {
        c22126c0.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f45689i0).m89029M(12);
        c22126c0.m111962J1(C23212s8.m119607o(c22126c0.getContext(), AbstractC21196a.TextColor1));
        c22126c0.mo111965M1(1);
        c22126c0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
        c22126c0.m111980v1(TextUtils.TruncateAt.END);
        c22126c0.m111953A1(2);
        c22126c0.m111982x1(false);
    }

    /* renamed from: u0 */
    private final void m44868u0(C3025q0.d dVar, String str) {
        int i11;
        float f11;
        try {
            C22126c0 c22126c0 = this.f45689i0;
            String str2 = dVar.f12173d;
            AbstractC19074t.m100207e(str2, "mInfo");
            AbstractC27321d.m139865c(c22126c0, str2);
            C22126c0 c22126c02 = this.f45687g0;
            String str3 = dVar.f12172c;
            AbstractC19074t.m100207e(str3, "mHeading");
            AbstractC27321d.m139865c(c22126c02, str3);
            C22126c0 c22126c03 = this.f45688h0;
            String str4 = dVar.f12171b;
            AbstractC19074t.m100207e(str4, "mSlogan");
            AbstractC27321d.m139865c(c22126c03, str4);
            this.f45695o0.m89003j1();
            C16716d c16716d = this.f45695o0;
            if (dVar.f12186q.isEmpty()) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            c16716d.mo44614b1(i11);
            List list = dVar.f12186q;
            AbstractC19074t.m100207e(list, "listInfo");
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    AbstractC25368s.m131509q();
                }
                C3025q0.a aVar = (C3025q0.a) obj;
                Context context = getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                C27320c c27320c = new C27320c(context);
                C16718f m89023G = c27320c.m89106L().m89023G(this.f45695o0.m89004k1(r15.m89005l1() - 1));
                if (i12 != 0) {
                    f11 = 8.0f;
                } else {
                    f11 = 0.0f;
                }
                m89023G.m89036T(AbstractC23136l9.m118742r(f11));
                this.f45695o0.m89001g1(c27320c);
                String str5 = aVar.f12136a;
                AbstractC19074t.m100207e(str5, "text");
                String str6 = aVar.f12137b;
                AbstractC19074t.m100207e(str6, "urlIcon");
                C23528a c23528a = this.f44324O;
                AbstractC19074t.m100207e(c23528a, "mAQ");
                c27320c.m139861o1(str5, str6, c23528a);
                i12 = i13;
            }
            if (dVar.f12187r == null) {
                this.f45696p0.mo44614b1(8);
            } else {
                this.f45696p0.mo44614b1(0);
                C27319b c27319b = this.f45699s0;
                String str7 = dVar.f12187r.f12136a;
                AbstractC19074t.m100207e(str7, "text");
                String str8 = dVar.f12187r.f12137b;
                AbstractC19074t.m100207e(str8, "urlIcon");
                C23528a c23528a2 = this.f44324O;
                AbstractC19074t.m100207e(c23528a2, "mAQ");
                c27319b.m139859o1(str7, str8, c23528a2);
            }
            this.f45687g0.m89106L().m89033Q(AbstractC23136l9.m118742r(2.0f));
            int i14 = dVar.f12185p;
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        if (i14 != 4) {
                            this.f45689i0.mo44614b1(8);
                            this.f45696p0.mo44614b1(8);
                            this.f45691k0.mo44614b1(0);
                            this.f45692l0.mo44614b1(8);
                            this.f45693m0.mo44614b1(8);
                            C27318a c27318a = this.f45691k0;
                            C23528a c23528a3 = this.f44324O;
                            AbstractC19074t.m100207e(c23528a3, "mAQ");
                            c27318a.m139857o1(dVar, str, c23528a3);
                            return;
                        }
                        this.f45691k0.mo44614b1(8);
                        this.f45692l0.mo44614b1(0);
                        this.f45693m0.mo44614b1(8);
                        this.f45687g0.m89106L().m89033Q(AbstractC23136l9.m118742r(8.0f));
                        C27318a c27318a2 = this.f45692l0;
                        C23528a c23528a4 = this.f44324O;
                        AbstractC19074t.m100207e(c23528a4, "mAQ");
                        c27318a2.m139857o1(dVar, str, c23528a4);
                        return;
                    }
                    this.f45691k0.mo44614b1(8);
                    this.f45692l0.mo44614b1(8);
                    this.f45693m0.mo44614b1(0);
                    this.f45687g0.m89106L().m89033Q(AbstractC23136l9.m118742r(8.0f));
                    C27318a c27318a3 = this.f45693m0;
                    C23528a c23528a5 = this.f44324O;
                    AbstractC19074t.m100207e(c23528a5, "mAQ");
                    c27318a3.m139857o1(dVar, str, c23528a5);
                    return;
                }
                this.f45691k0.mo44614b1(8);
                this.f45692l0.mo44614b1(0);
                this.f45693m0.mo44614b1(8);
                C27318a c27318a4 = this.f45692l0;
                C23528a c23528a6 = this.f44324O;
                AbstractC19074t.m100207e(c23528a6, "mAQ");
                c27318a4.m139857o1(dVar, str, c23528a6);
                return;
            }
            this.f45691k0.mo44614b1(0);
            this.f45692l0.mo44614b1(8);
            this.f45693m0.mo44614b1(8);
            C27318a c27318a5 = this.f45691k0;
            C23528a c23528a7 = this.f44324O;
            AbstractC19074t.m100207e(c23528a7, "mAQ");
            c27318a5.m139857o1(dVar, str, c23528a7);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
        AbstractC19074t.m100208f(c29106b, "dataObject");
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        AbstractC19074t.m100208f(context, "context");
        try {
            C16716d c16716d = new C16716d(context);
            this.f45694n0.m89106L().m89060k0(-1);
            this.f45694n0.m89106L().m89030N(-1);
            this.f45694n0.m89087B0(AbstractC16803z.bg_feed_group);
            mo69681L(this.f45694n0);
            this.f45686f0.m89106L().m89060k0(-1);
            this.f45686f0.m89106L().m89030N(-2);
            this.f45686f0.m89106L().m89034R(AbstractC23136l9.m118742r(2.0f));
            this.f45686f0.m89106L().m89035S(AbstractC23136l9.m118742r(2.0f));
            this.f45686f0.m111921r1(true);
            this.f45686f0.mo44614b1(0);
            this.f45686f0.m111929z1(5);
            this.f45686f0.m47328Z1(1.91f);
            mo69681L(this.f45686f0);
            c16716d.m89106L().m89060k0(-2);
            c16716d.m89106L().m89030N(-2);
            c16716d.m89106L().m89023G(this.f45686f0);
            c16716d.m89106L().m89029M(12);
            mo69681L(c16716d);
            C16716d c16716d2 = this.f45691k0;
            m44861m0(c16716d2);
            C16718f m89034R = c16716d2.m89106L().m89060k0(-2).m89030N(-2).m89034R(0);
            Boolean bool = Boolean.TRUE;
            m89034R.m89017A(bool).m89027K(true);
            c16716d2.m89087B0(AbstractC16803z.bg_btn_suggest_feed);
            c16716d.m89001g1(this.f45691k0);
            C16716d c16716d3 = this.f45692l0;
            m44861m0(c16716d3);
            c16716d3.m89106L().m89060k0(-1).m89030N(-2).m89033Q(AbstractC23136l9.m118742r(16.0f)).m89023G(this.f45696p0);
            c16716d.m89001g1(this.f45692l0);
            this.f45690j0.m89106L().m89060k0(-1).m89030N(-2).m89046b0(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89047c0(AbstractC23136l9.m118742r(12.0f)).m89048d0(AbstractC23136l9.m118742r(12.0f)).m89044a0(AbstractC23136l9.m118742r(12.0f)).m89073z(bool).m89018B(bool).m89049e0(this.f45691k0).m89029M(12);
            c16716d.m89001g1(this.f45690j0);
            m44864p0(this.f45689i0);
            this.f45690j0.m89001g1(this.f45689i0);
            m44867s0(this.f45687g0);
            this.f45687g0.m89106L().m89033Q(AbstractC23136l9.m118742r(2.0f));
            this.f45690j0.m89001g1(this.f45687g0);
            m44862n0(this.f45688h0);
            this.f45690j0.m89001g1(this.f45688h0);
            m44866r0(this.f45695o0);
            this.f45690j0.m89001g1(this.f45695o0);
            this.f45696p0.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89040X(AbstractC23136l9.m118742r(120.0f)).m89023G(this.f45690j0);
            c16716d.m89001g1(this.f45696p0);
            m44865q0(this.f45698r0);
            this.f45696p0.m89001g1(this.f45698r0);
            this.f45697q0.m89106L().m89060k0(-1).m89030N(-2).m89023G(this.f45698r0);
            this.f45696p0.m89001g1(this.f45697q0);
            C16716d c16716d4 = this.f45693m0;
            m44861m0(c16716d4);
            c16716d4.m89106L().m89060k0(-2).m89030N(-2).m89017A(bool).m89036T(AbstractC23136l9.m118742r(12.0f)).m89033Q(AbstractC23136l9.m118742r(16.0f));
            this.f45697q0.m89001g1(this.f45693m0);
            m44863o0(this.f45699s0);
            this.f45697q0.m89001g1(this.f45699s0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43705j0(context, i11);
    }

    public final void setSuggestBackground(Drawable drawable) {
        this.f45694n0.m89085A0(drawable);
    }

    /* renamed from: t0 */
    public final void m44869t0(C3000l0 c3000l0, C3025q0.d dVar, boolean z11, InterfaceC2259a interfaceC2259a, boolean z12) {
        C24003n m120106Y;
        String str;
        String str2;
        C3047v0 c3047v0;
        if (c3000l0 != null && dVar != null) {
            try {
                C3020p0 m14322a0 = c3000l0.m14322a0();
                String str3 = dVar.f12176g;
                TrackingSource trackingSource = new TrackingSource(225);
                C32145v4 c32145v4 = dVar.f12174e;
                if (c32145v4 != null) {
                    trackingSource.m40677a("campaignId", c32145v4.f148248a);
                    trackingSource.m40677a("srcId", Integer.valueOf(dVar.f12174e.f148249b));
                    trackingSource.m40677a("tracking_src", dVar.f12174e.f148250c);
                }
                boolean z13 = AbstractC23304d.m120536g().f147980a;
                if (z12) {
                    m120106Y = C23278z2.m120088P();
                } else {
                    m120106Y = C23278z2.m120106Y();
                }
                C24003n c24003n = m120106Y;
                C3142a m120703q = AbstractC23306f.m120703q();
                AbstractC19074t.m100205c(str3);
                Bitmap m15819d = m120703q.m15819d(str3);
                boolean m125696L2 = C23999j.m125696L2(str3, c24003n);
                this.f45686f0.mo111925v1(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed));
                if (!z11 || !z13 || m15819d != null || m125696L2) {
                    if (m15819d != null && !m15819d.isRecycled()) {
                        this.f45686f0.mo111924u1(m15819d);
                    } else {
                        this.f45686f0.mo65956I1(this.f44324O, str3, c24003n, 10, C3979l.b.UNKNOWN, new C8385a());
                    }
                }
                if (m14322a0 != null && (c3047v0 = m14322a0.f12022B) != null) {
                    str = c3047v0.f12280b;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
                m44868u0(dVar, str);
                String str4 = dVar.f12179j;
                String str5 = dVar.f12181l;
                if (AbstractC19074t.m100204b(str4, "action.follow.oa") && C21927m.m114302u().m114318P(str)) {
                    str4 = "action.unfollow.oa";
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("uid", str);
                    str2 = jSONObject.toString();
                } else {
                    str2 = str5;
                }
                C25866f0.m133493w(this.f45686f0, getContext(), m14322a0, dVar.f12177h, dVar.f12178i, dVar, interfaceC2259a, trackingSource);
                C25866f0.m133493w(this.f45690j0, getContext(), m14322a0, dVar.f12177h, dVar.f12178i, dVar, interfaceC2259a, trackingSource);
                C25866f0.m133493w(this.f45691k0, getContext(), m14322a0, str4, str2, dVar, interfaceC2259a, trackingSource);
                C25866f0.m133493w(this.f45692l0, getContext(), m14322a0, str4, str2, dVar, interfaceC2259a, trackingSource);
                C25866f0.m133493w(this.f45693m0, getContext(), m14322a0, str4, str2, dVar, interfaceC2259a, trackingSource);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }
}
