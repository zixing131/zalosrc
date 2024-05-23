package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import ao.InterfaceC2259a;
import ao.InterfaceC2266h;
import bo.C2971f1;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.C13647i0;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17466e;
import is.AbstractC20809n;
import is.AbstractC20814p0;
import is.C20820s0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import p615wn.C29106b;
import th.AbstractC26683d;
import vg.AbstractC28245z3;

/* loaded from: classes4.dex */
public class FeedItemStickerModulesView extends FeedItemBaseModuleView {

    /* renamed from: q0 */
    private static final int f44694q0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left);

    /* renamed from: r0 */
    private static final int f44695r0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right);

    /* renamed from: s0 */
    private static final int f44696s0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_top);

    /* renamed from: t0 */
    private static final int f44697t0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom);

    /* renamed from: u0 */
    private static final int f44698u0 = AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding);

    /* renamed from: f0 */
    private C13647i0 f44699f0;

    /* renamed from: g0 */
    C16716d f44700g0;

    /* renamed from: h0 */
    protected C22126c0 f44701h0;

    /* renamed from: i0 */
    protected C22126c0 f44702i0;

    /* renamed from: j0 */
    protected C8362q0 f44703j0;

    /* renamed from: k0 */
    protected C22126c0 f44704k0;

    /* renamed from: l0 */
    C16716d f44705l0;

    /* renamed from: m0 */
    String f44706m0;

    /* renamed from: n0 */
    private C3020p0 f44707n0;

    /* renamed from: o0 */
    private InterfaceC2259a f44708o0;

    /* renamed from: p0 */
    String f44709p0;

    public FeedItemStickerModulesView(Context context) {
        this(context, null);
    }

    /* renamed from: p0 */
    private void m44084p0() {
        this.f44703j0 = new C8362q0(getContext());
        this.f44704k0 = new C22126c0(getContext());
        this.f44702i0 = new C22126c0(getContext());
        this.f44701h0 = new C22126c0(getContext());
        this.f44700g0 = new C16716d(this.f84675p);
        int m108558A = AbstractC20809n.m108558A(this.f44322M);
        C16718f m89030N = this.f44699f0.m89106L().m89060k0(m108558A).m89030N(m108558A);
        int i11 = f44698u0;
        m89030N.m89033Q(i11).m89034R(i11);
        this.f44699f0.m76266Z1(m108558A, m108558A);
        this.f44703j0.m89106L().m89060k0(-1).m89030N(-2).m89034R(f44694q0).m89020D(this.f44699f0).m89054h0(this.f44699f0);
        this.f44700g0.m89001g1(this.f44699f0);
        this.f44700g0.m89001g1(this.f44703j0);
        mo69681L(this.f44700g0);
    }

    /* renamed from: q0 */
    private void m44085q0() {
        C13647i0 c13647i0 = this.f44699f0;
        if (c13647i0 != null) {
            c13647i0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.g4
                public /* synthetic */ C8283g4() {
                }

                @Override // com.zing.zalo.uidrawing.C16719g.c
                /* renamed from: y */
                public final void mo929y(C16719g c16719g) {
                    FeedItemStickerModulesView.this.m44089w0(c16719g);
                }
            });
        }
    }

    /* renamed from: r0 */
    private void m44086r0(Context context, int i11) {
        m43704i0(context, i11);
        m44093t0();
        this.f44705l0.m89106L().m89023G(this.f44326Q);
    }

    /* renamed from: s0 */
    private void m44087s0() {
        m43706k0();
        m43701f0();
        m44084p0();
        this.f44700g0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left_profile_item)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right_profile_item));
        this.f44699f0.m89106L().m89033Q(0).m89034R(0);
        m43699d0(this.f44700g0, false);
    }

    /* renamed from: v0 */
    private void m44088v0(Context context, int i11) {
        m43704i0(context, i11);
        m44093t0();
        this.f44705l0.m89106L().m89042Z(AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_left), 0, AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_right), AbstractC23136l9.m118655I(AbstractC16802y.chat_feed_padding_bottom)).m89023G(this.f44326Q);
        setBackground(AbstractC23136l9.m118665N(context, AbstractC17466e.transparent));
        this.f44326Q.mo89161z0(AbstractC23136l9.m118641B(context, AbstractC16801x.transparent));
    }

    /* renamed from: w0 */
    public /* synthetic */ void m44089w0(C16719g c16719g) {
        try {
            if (this.f44708o0 != null && this.f44707n0 != null) {
                this.f44708o0.mo11952f1(this.f44707n0.f12023C.f12133x, 10, new TrackingSource.C7894b().m40694f(10).m40691c(this.f44707n0.f12057p).m40693e(this.f44707n0.f12058q).m40692d(this.f44707n0.m14465A()).m40689a(), 8);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.uidrawing.ModulesView
    /* renamed from: O */
    public void mo44090O() {
        C13647i0 c13647i0 = this.f44699f0;
        if (c13647i0 != null) {
            c13647i0.m76264X1();
        }
        m44095x0();
        super.mo44090O();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
        setFeedContent(c29106b.f134937a);
        m43696Y(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134941e, c29106b.f134942f);
        mo43698b0(c29106b.f134937a, 0, c29106b.f134939c, c29106b.f134941e, c29106b.f134942f, false, null, c29106b.f134940d);
        m44091n0(c29106b.f134937a, 0, c29106b.f134940d, c29106b.f134941e);
        m43700e0();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: b0 */
    public void mo43698b0(C3000l0 c3000l0, int i11, Context context, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f, boolean z11, InterfaceC2266h interfaceC2266h, boolean z12) {
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14324b0(i11) != null) {
                    C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                    int i12 = this.f44322M;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2 && i12 != 3) {
                                if (i12 == 4 || i12 == 6) {
                                    AbstractC20814p0.m108600D0(m14324b0, this.f44703j0, false, this.f44701h0, this.f44702i0, z11, interfaceC2266h, true, interfaceC10867f, z12, i12);
                                }
                            } else {
                                AbstractC20814p0.m108600D0(m14324b0, this.f44703j0, true, null, null, z11, interfaceC2266h, false, interfaceC10867f, z12, i12);
                            }
                        } else {
                            AbstractC20814p0.m108683z0(c3000l0, m14324b0, this.f44703j0, c3000l0.f11863L, this.f44701h0, c3000l0.f11864M, context, interfaceC10867f, z12, 7);
                        }
                    } else {
                        AbstractC20814p0.m108600D0(m14324b0, this.f44703j0, true, this.f44701h0, this.f44702i0, z11, interfaceC2266h, true, interfaceC10867f, z12, i12);
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        try {
            super.mo43705j0(context, i11);
            this.f44322M = i11;
            mo44090O();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            setLayoutParams(layoutParams);
            this.f44699f0 = new C13647i0(context);
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2 && i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 6) {
                                m44088v0(context, i11);
                            }
                        } else {
                            m44086r0(context, i11);
                        }
                    } else {
                        m44087s0();
                    }
                } else {
                    m44094u0();
                }
            } else {
                m44093t0();
            }
            m44085q0();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: n0 */
    public void m44091n0(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a) {
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14324b0(i11) != null) {
                    C3020p0 m14324b0 = c3000l0.m14324b0(i11);
                    if (!TextUtils.isEmpty(this.f44706m0)) {
                        if (!this.f44706m0.equals(m14324b0.f12057p)) {
                        }
                        String str = m14324b0.f12057p;
                        this.f44706m0 = str;
                        this.f44707n0 = m14324b0;
                        this.f44708o0 = interfaceC2259a;
                        C2971f1 c2971f1 = new C2971f1(m14324b0, null, z11, this.f44709p0, str);
                        int m108558A = AbstractC20809n.m108558A(this.f44322M);
                        this.f44699f0.m76266Z1(m108558A, m108558A);
                        C20820s0.m108741o(this.f44699f0, c2971f1, this.f44324O);
                    }
                    this.f44699f0.m76265Y1();
                    this.f44699f0.invalidate();
                    String str2 = m14324b0.f12057p;
                    this.f44706m0 = str2;
                    this.f44707n0 = m14324b0;
                    this.f44708o0 = interfaceC2259a;
                    C2971f1 c2971f12 = new C2971f1(m14324b0, null, z11, this.f44709p0, str2);
                    int m108558A2 = AbstractC20809n.m108558A(this.f44322M);
                    this.f44699f0.m76266Z1(m108558A2, m108558A2);
                    C20820s0.m108741o(this.f44699f0, c2971f12, this.f44324O);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: o0 */
    public void m44092o0(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, String str) {
        this.f44709p0 = str;
        m44091n0(c3000l0, i11, z11, interfaceC2259a);
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C13647i0 c13647i0 = this.f44699f0;
        if (c13647i0 != null) {
            c13647i0.m76264X1();
        }
        m44095x0();
        super.onDetachedFromWindow();
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    public void setOpenFeedDetailListener(C16719g.c cVar) {
        super.setOpenFeedDetailListener(cVar);
        C8362q0 c8362q0 = this.f44703j0;
        if (c8362q0 != null) {
            c8362q0.mo89109M0(cVar);
            C22126c0 c22126c0 = this.f44703j0.f45580N0;
            if (c22126c0 != null) {
                c22126c0.mo89109M0(cVar);
            }
        }
    }

    public void setStickerPrefixId(String str) {
        this.f44709p0 = str;
    }

    /* renamed from: t0 */
    void m44093t0() {
        try {
            setBackground(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
            this.f44703j0 = new C8362q0(getContext());
            this.f44702i0 = new C22126c0(getContext());
            this.f44701h0 = new C22126c0(getContext());
            C16716d c16716d = new C16716d(getContext());
            this.f44705l0 = c16716d;
            c16716d.m89106L().m89028L(-1, -2).m89042Z(f44694q0, 0, f44695r0, f44697t0);
            int m108558A = AbstractC20809n.m108558A(this.f44322M);
            this.f44699f0.m89106L().m89060k0(m108558A).m89030N(m108558A).m89026J(true);
            C16718f m89026J = this.f44703j0.m89106L().m89060k0(-2).m89030N(-2).m89026J(true);
            int i11 = f44696s0;
            m89026J.m89036T(i11).m89023G(this.f44699f0);
            this.f44701h0.m89106L().m89060k0(-1).m89030N(-2).m89026J(true).m89036T(i11).m89023G(this.f44703j0);
            this.f44701h0.mo44614b1(8);
            this.f44701h0.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f44701h0.m111982x1(false);
            this.f44701h0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f44701h0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
            this.f44702i0.m89106L().m89060k0(-1).m89030N(-2).m89026J(true).m89036T(i11).m89023G(this.f44701h0);
            this.f44702i0.mo44614b1(8);
            this.f44702i0.m111984z1(AbstractC23136l9.m118655I(AbstractC16802y.feed_linespacing_extra), 1.0f);
            this.f44702i0.m111982x1(true);
            this.f44702i0.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            mo69681L(this.f44705l0);
            this.f44705l0.m89001g1(this.f44699f0);
            this.f44705l0.m89001g1(this.f44703j0);
            this.f44705l0.m89001g1(this.f44701h0);
            this.f44705l0.m89001g1(this.f44702i0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: u0 */
    void m44094u0() {
        try {
            m43702g0();
            m43704i0(getContext(), 1);
            m43703h0(1);
            this.f44703j0 = new C8362q0(getContext());
            this.f44702i0 = new C22126c0(getContext());
            this.f44701h0 = new C22126c0(getContext());
            C8406v1 c8406v1 = this.f44326Q;
            c8406v1.m44938y1(c8406v1.f45790f1, c8406v1.f45788d1);
            int m108558A = AbstractC20809n.m108558A(this.f44322M);
            C16718f m89030N = this.f44699f0.m89106L().m89060k0(m108558A).m89030N(m108558A);
            int i11 = f44698u0;
            m89030N.m89033Q(i11).m89034R(i11).m89023G(this.f44326Q);
            this.f44703j0.m89106L().m89060k0(-1).m89030N(-2).m89020D(this.f44699f0).m89023G(this.f44326Q).m89054h0(this.f44699f0);
            this.f44703j0.m44802G1(FeedItemBaseModuleView.f44318d0);
            this.f44701h0.m89106L().m89060k0(-1).m89030N(-2).m89034R(i11).m89035S(i11).m89054h0(this.f44699f0).m89023G(this.f44703j0);
            this.f44701h0.m111962J1(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.cMtxt2));
            this.f44701h0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
            mo69681L(this.f44699f0);
            mo69681L(this.f44703j0);
            mo69681L(this.f44701h0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x0 */
    void m44095x0() {
        C8362q0 c8362q0;
        try {
            if (AbstractC26683d.f126393l) {
                int i11 = this.f44322M;
                if ((i11 == 0 || i11 == 1) && (c8362q0 = this.f44703j0) != null && c8362q0.m44809s1() != null) {
                    AbstractC28245z3.m142218a(this.f44703j0.m44809s1().m111973m1(), this.f44703j0.m44809s1());
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public FeedItemStickerModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44706m0 = "";
        this.f44709p0 = "";
    }
}
