package com.zing.zalo.feed.components;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import bo.C3000l0;
import bo.C3020p0;
import com.androidquery.util.C3977j;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.feed.components.C8406v1;
import com.zing.zalo.feed.uicontrols.C8888s;
import kd0.C21697g;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p615wn.C29106b;

/* loaded from: classes4.dex */
public class FeedItemDateDividerModuleView extends FeedItemBaseModuleView {

    /* renamed from: f0 */
    public String f44375f0;

    /* renamed from: g0 */
    public boolean f44376g0;

    /* renamed from: h0 */
    private final Context f44377h0;

    /* renamed from: i0 */
    C8088a f44378i0;

    /* renamed from: com.zing.zalo.feed.components.FeedItemDateDividerModuleView$a */
    /* loaded from: classes4.dex */
    public static class C8088a extends AbstractC8370r0 {

        /* renamed from: X0 */
        public boolean f44379X0;

        /* renamed from: Y0 */
        private C3977j f44380Y0;

        /* renamed from: Z0 */
        C8888s f44381Z0;

        /* renamed from: a1 */
        protected C22126c0 f44382a1;

        /* renamed from: b1 */
        C8406v1.a f44383b1;

        /* renamed from: c1 */
        C8406v1.a f44384c1;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.zing.zalo.feed.components.FeedItemDateDividerModuleView$a$a */
        /* loaded from: classes4.dex */
        public class a extends C23999j {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // p379o3.C23999j
            /* renamed from: O1 */
            public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
                super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
                C8888s c8888s = C8088a.this.f44381Z0;
                if (c8888s != null && c3979l != null) {
                    c8888s.f47546R0 = c3979l.m18839c();
                    C8088a.this.f44381Z0.invalidate();
                }
            }
        }

        public C8088a(Context context) {
            super(context);
            m43734u1();
        }

        /* renamed from: q1 */
        private void m43732q1() {
            C8888s c8888s = this.f44381Z0;
            if (c8888s != null) {
                c8888s.m89106L().m89028L(this.f45646T0 - this.f45643Q0, this.f45641O0 + AbstractC23136l9.m118742r(10.0f)).m89032P(this.f45643Q0, 0, 0, 0);
                C8888s c8888s2 = this.f44381Z0;
                c8888s2.f47543O0 = false;
                c8888s2.f47542N0 = this.f45641O0 / 2;
                c8888s2.f47546R0 = null;
                c8888s2.f47545Q0 = C23212s8.m119607o(c8888s2.getContext(), AbstractC16781w.ProfileLineColor);
                C8888s c8888s3 = this.f44381Z0;
                c8888s3.f47544P0 = C23212s8.m119607o(c8888s3.getContext(), AbstractC16781w.ProfileLineColor);
            }
        }

        /* renamed from: r1 */
        private void m43733r1() {
            m43735w1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            m43736x1(m43737s1());
        }

        /* renamed from: u1 */
        private void m43734u1() {
            this.f44381Z0 = new C8888s(this.f84786r);
            this.f44382a1 = new C22126c0(this.f84786r);
            this.f44383b1 = new C8406v1.a(this.f84786r);
            this.f44384c1 = new C8406v1.a(this.f84786r);
            this.f44380Y0 = new C3977j(this.f84786r);
            this.f44383b1.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_timebar_marginleft));
            m89001g1(this.f44383b1);
            this.f44384c1.m89106L().m89072y(Boolean.TRUE).m89020D(this.f44382a1).m89036T(AbstractC23136l9.m118742r(12.0f)).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_profile_timebar_marginleft));
            m89001g1(this.f44384c1);
            this.f44381Z0.m89106L().m89070w(this.f44382a1);
            this.f44381Z0.m47437t1(1);
            this.f44381Z0.mo44614b1(0);
            this.f44381Z0.mo89161z0(C23212s8.m119607o(this.f84786r, AbstractC16781w.ProfilePrimaryBackgroundColor));
            m89001g1(this.f44381Z0);
            this.f44382a1.m89106L().m89028L(-2, AbstractC23136l9.m118742r(24.0f)).m89034R(this.f45646T0).m89035S(this.f45647U0).m89036T(AbstractC23136l9.m118736p(AbstractC16802y.feed_spacing_date_divider_profile)).m89033Q(AbstractC23136l9.m118736p(AbstractC16802y.feed_spacing_item_profile)).m89042Z(AbstractC23136l9.m118742r(12.0f), 0, AbstractC23136l9.m118742r(12.0f), 0).m89029M(15);
            this.f44382a1.m111982x1(false);
            this.f44382a1.m111953A1(1);
            this.f44382a1.m111980v1(TextUtils.TruncateAt.END);
            this.f44382a1.mo111964L1(AbstractC23136l9.m118742r(14.0f));
            this.f44382a1.mo111965M1(1);
            this.f44382a1.m89085A0(m43738t1());
            this.f44382a1.mo44614b1(0);
            m89001g1(this.f44382a1);
        }

        /* renamed from: w1 */
        private void m43735w1(int i11) {
            C22126c0 c22126c0 = this.f44382a1;
            if (c22126c0 != null) {
                c22126c0.m111962J1(i11);
            }
        }

        /* renamed from: x1 */
        private void m43736x1(int i11) {
            Drawable m89094F;
            C22126c0 c22126c0 = this.f44382a1;
            if (c22126c0 != null && (m89094F = c22126c0.m89094F()) != null && (m89094F instanceof GradientDrawable)) {
                ((GradientDrawable) m89094F).setColor(i11);
            }
        }

        /* renamed from: s1 */
        int m43737s1() {
            return C23212s8.m119607o(getContext(), AbstractC16781w.ProfileLineColor);
        }

        /* renamed from: t1 */
        public GradientDrawable m43738t1() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(m43737s1());
            gradientDrawable.setCornerRadius(AbstractC23136l9.m118742r(4.0f));
            return gradientDrawable;
        }

        /* renamed from: v1 */
        public void m43739v1(String str, C21697g c21697g) {
            int i11;
            if (c21697g != null) {
                try {
                    if (!str.isEmpty()) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    c21697g.mo44614b1(i11);
                    if (!str.isEmpty()) {
                        c21697g.m111959G1(str);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
        }

        /* renamed from: y1 */
        public void m43740y1(C23528a c23528a, C3000l0 c3000l0, String str, boolean z11) {
            int i11;
            m43732q1();
            m43733r1();
            int i12 = 8;
            if (c3000l0 != null) {
                C3020p0 m14322a0 = c3000l0.m14322a0();
                int m44852o1 = m44852o1(c3000l0);
                int m44853p1 = m44853p1(c3000l0);
                boolean z12 = !TextUtils.isEmpty(c3000l0.f11872U);
                C8888s c8888s = this.f44381Z0;
                if (c8888s != null) {
                    if (m14322a0 != null && m14322a0.f12043W) {
                        c8888s.mo44614b1(0);
                        if (z12) {
                            m43735w1(Color.parseColor(c3000l0.f11873V));
                            C8888s c8888s2 = this.f44381Z0;
                            c8888s2.f47544P0 = m44853p1;
                            c8888s2.f47545Q0 = m44852o1;
                            c8888s2.m89106L().m89028L(this.f45646T0 - this.f45644R0, this.f45642P0 + (this.f45645S0 * 2)).m89032P(this.f45644R0, 0, 0, 0);
                            C8888s c8888s3 = this.f44381Z0;
                            c8888s3.f47542N0 = this.f45642P0 / 2;
                            c8888s3.f47543O0 = true;
                            ((C23528a) c23528a.m123612r(this.f44380Y0)).m123579C(c3000l0.f11872U, C23278z2.m120090Q(), new a());
                        }
                    } else {
                        c8888s.mo44614b1(8);
                    }
                }
                if (this.f44382a1 != null && m14322a0 != null && z12 && m14322a0.f12043W) {
                    m43736x1(m44852o1);
                }
            }
            m43739v1(str, this.f44382a1);
            C8406v1.a aVar = this.f44383b1;
            if (aVar != null) {
                if (this.f44379X0) {
                    i11 = 8;
                } else {
                    i11 = 0;
                }
                aVar.mo44614b1(i11);
                C8406v1.a aVar2 = this.f44384c1;
                if (this.f44379X0) {
                    i12 = 0;
                }
                aVar2.mo44614b1(i12);
            }
        }
    }

    public FeedItemDateDividerModuleView(Context context) {
        super(context);
        this.f44377h0 = context;
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        super.mo43705j0(context, this.f44322M);
        this.f44322M = i11;
        try {
            setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.ProfilePrimaryBackgroundColor));
            C8088a c8088a = new C8088a(this.f44377h0);
            this.f44378i0 = c8088a;
            c8088a.m89106L().m89028L(-1, -2);
            mo69681L(this.f44378i0);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m0 */
    public void m43731m0(C3000l0 c3000l0, boolean z11) {
        try {
            C8088a c8088a = this.f44378i0;
            if (c8088a != null) {
                c8088a.f44379X0 = this.f44376g0;
                c8088a.m43740y1(this.f44324O, c3000l0, this.f44375f0, z11);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
