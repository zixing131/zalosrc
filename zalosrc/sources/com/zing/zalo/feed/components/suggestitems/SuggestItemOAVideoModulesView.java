package com.zing.zalo.feed.components.suggestitems;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import bo.C3047v0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemSuggestBaseModulesView;
import com.zing.zalo.feed.components.suggestitems.SuggestItemOAVideoModulesView;
import com.zing.zalo.feed.uicontrols.C8870b;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zmedia.view.C17391z;
import ig0.AbstractC20550a;
import is.AbstractC20814p0;
import l80.C22126c0;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import me0.C23278z2;
import p262jb.AbstractC21196a;
import p379o3.C23999j;
import p489rn.C25866f0;
import p615wn.C29106b;
import p716zh.C32145v4;

/* loaded from: classes4.dex */
public class SuggestItemOAVideoModulesView extends FeedItemSuggestBaseModulesView {

    /* renamed from: k0 */
    private C8870b f45704k0;

    /* renamed from: l0 */
    private C22126c0 f45705l0;

    /* renamed from: m0 */
    private C22126c0 f45706m0;

    /* renamed from: n0 */
    private C22126c0 f45707n0;

    /* renamed from: o0 */
    private C16716d f45708o0;

    /* renamed from: p0 */
    private C16719g f45709p0;

    /* renamed from: q0 */
    InterfaceC8387a f45710q0;

    /* renamed from: com.zing.zalo.feed.components.suggestitems.SuggestItemOAVideoModulesView$a */
    /* loaded from: classes4.dex */
    public interface InterfaceC8387a {
        /* renamed from: a */
        void mo44874a(C17391z c17391z);

        /* renamed from: b */
        void mo44875b(String str);
    }

    public SuggestItemOAVideoModulesView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m44871n0(String str, C3025q0.d dVar, C3020p0 c3020p0, C16719g c16719g) {
        try {
            if (!TextUtils.isEmpty(str)) {
                InterfaceC8387a interfaceC8387a = this.f45710q0;
                if (interfaceC8387a != null) {
                    interfaceC8387a.mo44875b(dVar.f12176g);
                }
            } else if (!TextUtils.isEmpty(dVar.f12176g) && this.f45710q0 != null) {
                this.f45710q0.mo44874a(new C17391z(c3020p0.f12057p, "", dVar.f12176g, "", dVar.f12170a, AbstractC23006a0.m117875E(), false, 9, 1.91f, 1, null, "", 0));
            }
            FeedActionZUtils.m47521I(c3020p0, dVar, 20);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: p0 */
    private void m44872p0(C3025q0.d dVar, C3020p0 c3020p0) {
        C3047v0 c3047v0;
        try {
            String str = "";
            if (this.f45705l0 != null) {
                if (!TextUtils.isEmpty(dVar.f12172c)) {
                    this.f45705l0.mo44614b1(0);
                    this.f45705l0.m111959G1(dVar.f12172c);
                } else {
                    this.f45705l0.m111959G1("");
                    this.f45705l0.mo44614b1(8);
                }
            }
            if (this.f45706m0 != null) {
                if (!TextUtils.isEmpty(dVar.f12171b)) {
                    this.f45706m0.mo44614b1(0);
                    this.f45706m0.m111959G1(dVar.f12171b);
                } else {
                    this.f45706m0.m111959G1("");
                    this.f45706m0.mo44614b1(8);
                }
            }
            if (c3020p0 != null && (c3047v0 = c3020p0.f12022B) != null) {
                str = c3047v0.f12280b;
            }
            AbstractC20814p0.m108608H0(this.f45707n0, str, dVar.f12180k, dVar.f12179j);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: W */
    public void mo43694W(C29106b c29106b) {
    }

    @Override // com.zing.zalo.feed.components.FeedItemSuggestBaseModulesView, com.zing.zalo.feed.components.FeedItemBaseModuleView
    /* renamed from: j0 */
    public void mo43705j0(Context context, int i11) {
        try {
            this.f45709p0 = new C16719g(context);
            this.f45704k0 = new C8870b(context);
            this.f45708o0 = new C16716d(context);
            this.f45705l0 = new C22126c0(context);
            this.f45706m0 = new C22126c0(context);
            this.f45707n0 = new C22126c0(context);
            C16719g c16719g = new C16719g(context);
            C16716d c16716d = new C16716d(context);
            this.f45709p0.m89106L().m89060k0(-1);
            this.f45709p0.m89106L().m89030N(-1);
            this.f45709p0.m89087B0(AbstractC16803z.bg_feed_group);
            mo69681L(this.f45709p0);
            this.f45704k0.m89106L().m89060k0(-1);
            this.f45704k0.m89106L().m89030N(-2);
            this.f45704k0.m89106L().m89034R(AbstractC23136l9.m118742r(2.0f));
            this.f45704k0.m89106L().m89035S(AbstractC23136l9.m118742r(2.0f));
            this.f45704k0.m111921r1(true);
            this.f45704k0.mo44614b1(0);
            this.f45704k0.m111929z1(5);
            this.f45704k0.m47327Y1(AbstractC23136l9.m118665N(context, AbstractC16803z.bg_btn_slide_play));
            this.f45704k0.m47328Z1(1.91f);
            mo69681L(this.f45704k0);
            c16716d.m89106L().m89060k0(-2);
            c16716d.m89106L().m89030N(-2);
            c16716d.m89106L().m89023G(this.f45704k0);
            c16716d.m89106L().m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding));
            c16716d.m89106L().m89029M(12);
            mo69681L(c16716d);
            this.f45707n0.m89106L().m89030N(AbstractC23136l9.m118655I(AbstractC16802y.mat_btn_style_small_h));
            this.f45707n0.m89087B0(AbstractC16803z.bg_btn_type2_small);
            this.f45707n0.m89106L().m89060k0(-2);
            this.f45707n0.m89106L().m89017A(Boolean.TRUE);
            this.f45707n0.m89106L().m89033Q(AbstractC23136l9.m118742r(3.0f));
            this.f45707n0.m89106L().m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
            this.f45707n0.m89106L().m89036T(AbstractC23136l9.m118742r(3.0f));
            this.f45707n0.m89106L().m89029M(15);
            this.f45707n0.m89106L().m89040X(AbstractC23136l9.m118742r(69.0f));
            this.f45707n0.m89106L().m89046b0(AbstractC23136l9.m118742r(8.0f));
            this.f45707n0.m89106L().m89047c0(AbstractC23136l9.m118742r(8.0f));
            this.f45707n0.m111963K1(AbstractC23136l9.m118645D(context, AbstractC16803z.bg_btn_type2_text));
            this.f45707n0.mo111964L1(AbstractC23136l9.m118742r(13.0f));
            this.f45707n0.mo111965M1(1);
            c16716d.m89001g1(this.f45707n0);
            this.f45708o0.m89106L().m89060k0(-1);
            this.f45708o0.m89106L().m89030N(-2);
            this.f45708o0.m89106L().m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left));
            this.f45708o0.m89106L().m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right));
            this.f45708o0.m89106L().m89049e0(this.f45707n0);
            this.f45708o0.m89106L().m89029M(12);
            c16716d.m89001g1(this.f45708o0);
            this.f45705l0.m111982x1(false);
            this.f45705l0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor1));
            this.f45705l0.mo111965M1(1);
            this.f45705l0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85293f0));
            this.f45705l0.m89106L().m89060k0(-2);
            this.f45705l0.m89106L().m89030N(-2);
            this.f45705l0.m89087B0(AbstractC16803z.bg_btn_transparent);
            C22126c0 c22126c0 = this.f45705l0;
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            c22126c0.m111980v1(truncateAt);
            this.f45705l0.m89106L().m89029M(12);
            this.f45705l0.m111953A1(2);
            this.f45708o0.m89001g1(this.f45705l0);
            this.f45706m0.m111962J1(C23212s8.m119607o(context, AbstractC21196a.TextColor2));
            this.f45706m0.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f71));
            this.f45706m0.m89106L().m89060k0(-2);
            this.f45706m0.m89106L().m89030N(-2);
            this.f45706m0.m111980v1(truncateAt);
            this.f45706m0.m89106L().m89029M(12);
            this.f45706m0.m111953A1(1);
            this.f45706m0.m89106L().m89023G(this.f45705l0);
            this.f45708o0.m89001g1(this.f45706m0);
            c16719g.m89106L().m89060k0(1);
            c16719g.m89106L().m89030N(1);
            c16719g.m89106L().m89023G(this.f45708o0);
            c16719g.m89106L().m89036T(AbstractC23136l9.m118655I(AbstractC16802y.feed_content_padding));
            mo69681L(c16719g);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        super.mo43705j0(context, i11);
    }

    /* renamed from: o0 */
    public void m44873o0(C3000l0 c3000l0, final C3025q0.d dVar, boolean z11, InterfaceC2259a interfaceC2259a) {
        if (c3000l0 != null && dVar != null) {
            try {
                final C3020p0 m14322a0 = c3000l0.m14322a0();
                TrackingSource trackingSource = new TrackingSource(225);
                C32145v4 c32145v4 = dVar.f12174e;
                if (c32145v4 != null) {
                    trackingSource.m40677a("campaignId", c32145v4.f148248a);
                    trackingSource.m40677a("srcId", Integer.valueOf(dVar.f12174e.f148249b));
                    trackingSource.m40677a("tracking_src", dVar.f12174e.f148250c);
                }
                C8870b c8870b = this.f45704k0;
                c8870b.mo111925v1(AbstractC23136l9.m118665N(c8870b.getContext(), AbstractC16803z.bg_feed));
                if (!z11 || C23999j.m125696L2(dVar.f12170a, C23278z2.m120126f0())) {
                    this.f45704k0.m115376H1(this.f44755h0, dVar.f12170a, C23278z2.m120126f0(), 10);
                }
                final String m106804a = AbstractC20550a.m106804a(dVar.f12176g);
                this.f45704k0.mo89109M0(new C16719g.c() { // from class: un.e
                    @Override // com.zing.zalo.uidrawing.C16719g.c
                    /* renamed from: y */
                    public final void mo929y(C16719g c16719g) {
                        SuggestItemOAVideoModulesView.this.m44871n0(m106804a, dVar, m14322a0, c16719g);
                    }
                });
                m44872p0(dVar, m14322a0);
                C16716d c16716d = this.f45708o0;
                if (c16716d != null) {
                    C25866f0.m133493w(c16716d, getContext(), m14322a0, dVar.f12177h, dVar.f12178i, dVar, interfaceC2259a, trackingSource);
                }
                C22126c0 c22126c0 = this.f45707n0;
                if (c22126c0 != null) {
                    C25866f0.m133493w(c22126c0, getContext(), m14322a0, dVar.f12179j, dVar.f12181l, dVar, interfaceC2259a, trackingSource);
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public void setOnVideoViewClickListener(InterfaceC8387a interfaceC8387a) {
        this.f45710q0 = interfaceC8387a;
    }

    public void setSuggestBackground(Drawable drawable) {
        C16719g c16719g = this.f45709p0;
        if (c16719g != null) {
            c16719g.m89085A0(drawable);
        }
    }

    public SuggestItemOAVideoModulesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
