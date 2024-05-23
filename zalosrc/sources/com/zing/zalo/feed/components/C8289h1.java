package com.zing.zalo.feed.components;

import android.content.Context;
import android.text.TextUtils;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3043u0;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8915g0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.custom.C11850a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zdesign.component.C16979g1;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import is.AbstractC20814p0;
import ki0.C21740h;
import l80.C22122a0;
import me0.AbstractC23022b5;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p361nb.AbstractC23647d;
import p379o3.C23999j;
import p615wn.C29105a;
import p716zh.C32002l4;
import tj.C26712d;
import vg.AbstractC28207v1;
import vg.AbstractC28236y3;

/* renamed from: com.zing.zalo.feed.components.h1 */
/* loaded from: classes4.dex */
public class C8289h1 extends C16979g1 {

    /* renamed from: N0 */
    private C11850a f45375N0;

    /* renamed from: O0 */
    private C21740h f45376O0;

    /* renamed from: P0 */
    private C21740h f45377P0;

    /* renamed from: Q0 */
    private C22122a0 f45378Q0;

    /* renamed from: R0 */
    private C21740h f45379R0;

    /* renamed from: S0 */
    private C16716d f45380S0;

    /* renamed from: T0 */
    private C16716d f45381T0;

    /* renamed from: U0 */
    private C23528a f45382U0;

    public C8289h1(Context context) {
        super(context);
        m44685s1(context);
    }

    /* renamed from: r1 */
    private C32002l4 m44684r1(int i11) {
        int i12;
        if (i11 == 1) {
            i12 = 10002;
        } else if (i11 == 2) {
            i12 = IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START;
        } else if (i11 == 3) {
            i12 = 10007;
        } else {
            i12 = 0;
        }
        return C32002l4.m154265h(i12, 32);
    }

    /* renamed from: s1 */
    private void m44685s1(Context context) {
        try {
            this.f45382U0 = new C23528a(context);
            this.f45375N0 = new C11850a(context);
            this.f45376O0 = new C21740h(context);
            this.f45377P0 = new C21740h(context);
            this.f45379R0 = new C21740h(context);
            this.f45378Q0 = new C22122a0(context);
            this.f45380S0 = new C16716d(context);
            this.f45381T0 = new C16716d(context);
            this.f45375N0.m89106L().m89060k0(AbstractC23136l9.m118742r(24.0f)).m89030N(AbstractC23136l9.m118742r(24.0f)).m89027K(true).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding)).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding)).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding));
            this.f45375N0.m111929z1(5);
            this.f45375N0.m65869e2(1);
            this.f45375N0.mo111927x1(AbstractC23136l9.m118742r(6.0f));
            this.f45380S0.m89106L().m89060k0(-1).m89030N(-2).m89039W(AbstractC23136l9.m118742r(24.0f)).m89034R(AbstractC23136l9.m118742r(12.0f)).m89036T(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding)).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.oa_padding)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89049e0(this.f45381T0).m89054h0(this.f45375N0);
            this.f45376O0.m89106L().m89060k0(-2).m89030N(-2);
            this.f45376O0.setMaxScaledTextRatioIndex(3);
            this.f45376O0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f45376O0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45376O0.m111957E1(true);
            C21740h c21740h = this.f45376O0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c21740h.m111980v1(truncateAt);
            this.f45376O0.mo111965M1(1);
            this.f45377P0.m89106L().m89060k0(-2).m89030N(-2).m89023G(this.f45376O0);
            this.f45377P0.setMaxScaledTextRatioIndex(3);
            this.f45377P0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85300f7));
            this.f45377P0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f45377P0.m111953A1(2);
            this.f45377P0.m111980v1(truncateAt);
            this.f45381T0.m89106L().m89060k0(-2).m89030N(-2).m89027K(true).m89017A(Boolean.TRUE);
            this.f45379R0.m89106L().m89060k0(-2).m89027K(true).m89046b0(AbstractC23136l9.m118742r(12.0f)).m89047c0(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89040X(AbstractC23136l9.m118742r(70.0f)).m89029M(15);
            this.f45379R0.m111962J1(AbstractC23136l9.m118641B(context, AbstractC16801x.cMTitle1));
            this.f45379R0.setMaxScaledTextRatioIndex(3);
            AbstractC23022b5.m118023a(this.f45379R0, AbstractC8915g0.btnType3_xsmall);
            this.f45378Q0.m89106L().m89060k0(AbstractC23136l9.m118742r(16.0f)).m89030N(AbstractC23136l9.m118742r(16.0f)).m89027K(true).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
            this.f45378Q0.mo111926w1(AbstractC16803z.ic_chevronright_line_16);
            this.f45380S0.m89001g1(this.f45376O0);
            this.f45380S0.m89001g1(this.f45377P0);
            this.f45381T0.m89001g1(this.f45379R0);
            this.f45381T0.m89001g1(this.f45378Q0);
            m89001g1(this.f45375N0);
            m89001g1(this.f45381T0);
            m89001g1(this.f45380S0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: t1 */
    public /* synthetic */ void m44686t1(C3020p0 c3020p0, C26712d c26712d, InterfaceC2259a interfaceC2259a, int i11, C16719g c16719g) {
        TrackingSource trackingSource = new TrackingSource(16);
        try {
            trackingSource.m40677a("feedid", Long.valueOf(Long.parseLong(c3020p0.f12057p)));
            trackingSource.m40677a("feedtype", Integer.valueOf(c3020p0.f12058q));
            trackingSource.m40677a("feedOwner", c3020p0.m14465A());
            trackingSource.m40677a("footerType", Integer.valueOf(c26712d.m137344l()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C29105a c29105a = new C29105a(getContext(), c3020p0, c26712d.m137334b(), c26712d.m137333a(), null, interfaceC2259a, trackingSource, i11);
        c29105a.m145358a(m44684r1(i11));
        AbstractC20814p0.m108620O(c29105a);
        AbstractC23647d.m123897g("49170002");
    }

    /* renamed from: u1 */
    public /* synthetic */ void m44687u1(C3020p0 c3020p0, C26712d c26712d, InterfaceC2259a interfaceC2259a, int i11, C16719g c16719g) {
        TrackingSource trackingSource = new TrackingSource(16);
        try {
            trackingSource.m40677a("feedid", Long.valueOf(Long.parseLong(c3020p0.f12057p)));
            trackingSource.m40677a("feedtype", Integer.valueOf(c3020p0.f12058q));
            trackingSource.m40677a("feedOwner", c3020p0.m14465A());
            trackingSource.m40677a("footerType", Integer.valueOf(c26712d.m137344l()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        C29105a c29105a = new C29105a(getContext(), c3020p0, c26712d.m137338f(), c26712d.m137337e(), null, interfaceC2259a, trackingSource, i11);
        c29105a.m145358a(m44684r1(i11));
        AbstractC20814p0.m108620O(c29105a);
        AbstractC23647d.m123897g("49170001");
    }

    /* renamed from: q1 */
    void m44688q1(C26712d c26712d, boolean z11) {
        int i11;
        if (c26712d == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(c26712d.m137343k()) && !TextUtils.isEmpty(c26712d.m137336d())) {
                i11 = 0;
            } else {
                i11 = 12;
            }
            this.f45380S0.m89106L().m89029M(i11);
            if (!TextUtils.isEmpty(c26712d.m137343k())) {
                this.f45376O0.mo44614b1(0);
                this.f45376O0.m111959G1(c26712d.m137343k());
            } else {
                this.f45376O0.mo44614b1(8);
            }
            if (!TextUtils.isEmpty(c26712d.m137336d())) {
                this.f45377P0.mo44614b1(0);
                this.f45377P0.m111959G1(c26712d.m137336d());
            } else {
                this.f45377P0.mo44614b1(8);
            }
            if (c26712d.m137345m()) {
                this.f45378Q0.mo44614b1(0);
                this.f45379R0.mo44614b1(8);
            } else {
                this.f45378Q0.mo44614b1(8);
                boolean m142074z0 = AbstractC28207v1.m142074z0(c26712d.m137334b(), c26712d.m137333a());
                if (!TextUtils.isEmpty(c26712d.m137335c()) && m142074z0) {
                    this.f45379R0.mo44614b1(0);
                    this.f45379R0.m111959G1(c26712d.m137335c());
                } else {
                    this.f45379R0.mo44614b1(8);
                }
            }
            this.f45375N0.mo111925v1(AbstractC28236y3.m142202m(getContext()));
            if (!z11 || C23999j.m125696L2(c26712d.m137339g(), C23278z2.m120123e0())) {
                this.f45375N0.m115376H1(this.f45382U0, c26712d.m137339g(), C23278z2.m120123e0(), 10);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v1 */
    public void m44689v1(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, int i12) {
        if (c3000l0 != null) {
            try {
                if (c3000l0.m14324b0(i11) != null) {
                    m44691x1(c3000l0.m14324b0(i11), z11, interfaceC2259a, i12);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: w1 */
    public void m44690w1(C3020p0 c3020p0, InterfaceC2259a interfaceC2259a, int i11) {
        try {
            m44691x1(c3020p0, false, interfaceC2259a, i11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: x1 */
    public void m44691x1(C3020p0 c3020p0, boolean z11, InterfaceC2259a interfaceC2259a, int i11) {
        try {
            C3043u0 c3043u0 = c3020p0.f12024D;
            if (c3043u0 != null && c3043u0.m14617b() != null) {
                C26712d m14617b = c3020p0.f12024D.m14617b();
                m44688q1(m14617b, z11);
                this.f45378Q0.mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.f1

                    /* renamed from: q */
                    public final /* synthetic */ C3020p0 f45337q;

                    /* renamed from: r */
                    public final /* synthetic */ C26712d f45338r;

                    /* renamed from: s */
                    public final /* synthetic */ InterfaceC2259a f45339s;

                    /* renamed from: t */
                    public final /* synthetic */ int f45340t;

                    public /* synthetic */ C8271f1(C3020p0 c3020p02, C26712d m14617b2, InterfaceC2259a interfaceC2259a2, int i112) {
                        r2 = c3020p02;
                        r3 = m14617b2;
                        r4 = interfaceC2259a2;
                        r5 = i112;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C8289h1.this.m44686t1(r2, r3, r4, r5, c16719g);
                    }
                });
                mo89109M0(new C16719g.c() { // from class: com.zing.zalo.feed.components.g1

                    /* renamed from: q */
                    public final /* synthetic */ C3020p0 f45359q;

                    /* renamed from: r */
                    public final /* synthetic */ C26712d f45360r;

                    /* renamed from: s */
                    public final /* synthetic */ InterfaceC2259a f45361s;

                    /* renamed from: t */
                    public final /* synthetic */ int f45362t;

                    public /* synthetic */ C8280g1(C3020p0 c3020p02, C26712d m14617b2, InterfaceC2259a interfaceC2259a2, int i112) {
                        r2 = c3020p02;
                        r3 = m14617b2;
                        r4 = interfaceC2259a2;
                        r5 = i112;
                    }

                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        C8289h1.this.m44687u1(r2, r3, r4, r5, c16719g);
                    }
                });
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
