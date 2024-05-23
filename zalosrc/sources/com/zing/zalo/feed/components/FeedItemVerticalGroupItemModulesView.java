package com.zing.zalo.feed.components;

import android.content.Context;
import ao.InterfaceC2259a;
import bo.C3000l0;
import bo.C3020p0;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zview.AbstractC17466e;
import is.AbstractC20814p0;
import l80.C22126c0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;
import th.AbstractC26683d;
import vg.AbstractC28245z3;

/* loaded from: classes4.dex */
public class FeedItemVerticalGroupItemModulesView extends ModulesView {

    /* renamed from: K */
    C8406v1 f44831K;

    /* renamed from: L */
    C22126c0 f44832L;

    /* renamed from: M */
    C8323l1 f44833M;

    /* renamed from: N */
    C16716d f44834N;

    /* renamed from: O */
    C16719g f44835O;

    /* renamed from: P */
    C16719g f44836P;

    public FeedItemVerticalGroupItemModulesView(Context context) {
        super(context);
    }

    /* renamed from: V */
    public void m44161V() {
        try {
            this.f44834N = new C16716d(getContext());
            this.f44831K = new C8406v1(getContext());
            this.f44832L = new C22126c0(getContext());
            this.f44833M = new C8323l1(getContext());
            this.f44835O = new C16719g(getContext());
            C16719g c16719g = new C16719g(getContext());
            this.f44836P = c16719g;
            c16719g.m89106L().m89060k0(-1).m89030N(-1);
            this.f44836P.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC17466e.white));
            this.f44834N.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89033Q(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_bottom));
            this.f44835O.m89106L().m89060k0(-1).m89030N(-2).m89034R(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_left)).m89035S(AbstractC23136l9.m118655I(AbstractC16802y.feed_padding_right)).m89018B(Boolean.TRUE).m89067t(this.f44833M);
            this.f44835O.m89085A0(AbstractC23136l9.m118665N(getContext(), AbstractC16803z.bg_feed_group));
            this.f44831K.m44915A1(getContext(), 0);
            C8406v1 c8406v1 = this.f44831K;
            c8406v1.m44937l2(c8406v1.f45771M0, c8406v1.f45772N0, c8406v1.f45773O0, c8406v1.f45775Q0, c8406v1.f45777S0);
            C8406v1 c8406v12 = this.f44831K;
            c8406v12.m44938y1(c8406v12.f45790f1, c8406v12.f45788d1, c8406v12.f45791g1, c8406v12.f45789e1);
            this.f44832L.m89106L().m89060k0(-2).m89030N(-2).m89033Q(AbstractC23136l9.m118742r(12.0f)).m89034R(AbstractC23136l9.m118742r(12.0f)).m89035S(AbstractC23136l9.m118742r(12.0f)).m89029M(12).m89023G(this.f44831K);
            this.f44832L.mo111964L1(AbstractC23136l9.m118655I(AbstractC16802y.f85297f4));
            this.f44832L.m111962J1(C23212s8.m119607o(getContext(), AbstractC21196a.TextColor1));
            this.f44832L.m111982x1(false);
            this.f44833M.m44778w1(getContext(), 12);
            this.f44833M.m89106L().m89023G(this.f44832L);
            this.f44834N.m89001g1(this.f44831K);
            this.f44834N.m89001g1(this.f44832L);
            this.f44834N.m89001g1(this.f44833M);
            mo69681L(this.f44836P);
            mo69681L(this.f44834N);
            mo69681L(this.f44835O);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: W */
    public void m44162W(C3000l0 c3000l0, int i11, InterfaceC2259a interfaceC2259a, boolean z11) {
        C8323l1 c8323l1 = this.f44833M;
        if (c8323l1 != null) {
            c8323l1.m44767T1(c3000l0, i11, interfaceC2259a, z11);
            this.f44833M.m44773Z1(true);
        }
    }

    /* renamed from: X */
    public void m44163X(C3000l0 c3000l0, int i11, boolean z11, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        C8406v1 c8406v1 = this.f44831K;
        if (c8406v1 != null) {
            c8406v1.m44928b2(c3000l0, i11, z11, interfaceC2259a, interfaceC10867f);
        }
    }

    /* renamed from: Y */
    public void m44164Y(C3000l0 c3000l0, C3020p0 c3020p0, boolean z11, Context context, InterfaceC2259a interfaceC2259a, InterfaceC10867f interfaceC10867f) {
        int i11;
        C22126c0 c22126c0 = this.f44832L;
        if (c22126c0 != null) {
            AbstractC20814p0.m108604F0(c3020p0, c22126c0, z11, true, context, interfaceC10867f);
        }
        if (c3020p0 != null) {
            if (c3020p0.f12038R) {
                i11 = AbstractC23136l9.m118742r(12.0f);
            } else {
                i11 = 0;
            }
            setPadding(0, 0, 0, i11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        C22126c0 c22126c0;
        super.onDetachedFromWindow();
        if (AbstractC26683d.f126393l && (c22126c0 = this.f44832L) != null) {
            AbstractC28245z3.m142218a(c22126c0.m111973m1(), this.f44832L);
        }
    }

    public void setOnAvatarClickListener(C16719g.c cVar) {
        C8406v1 c8406v1 = this.f44831K;
        if (c8406v1 != null) {
            c8406v1.m44933g2(cVar);
        }
    }

    public void setOnFeedMenuClickListener(C16719g.c cVar) {
        C8323l1 c8323l1 = this.f44833M;
        if (c8323l1 != null) {
            c8323l1.m44770W1(cVar);
        }
        C8406v1 c8406v1 = this.f44831K;
        if (c8406v1 != null) {
            c8406v1.m44934h2(cVar);
        }
    }

    public void setOnFooterClickListener(C16719g.c cVar) {
        C8323l1 c8323l1 = this.f44833M;
        if (c8323l1 != null) {
            c8323l1.mo89109M0(cVar);
            this.f44833M.m44769V1(cVar);
        }
    }

    public void setOnProfileClickListener(C16719g.c cVar) {
        C8406v1 c8406v1 = this.f44831K;
        if (c8406v1 != null) {
            c8406v1.m44935i2(cVar);
        }
    }

    public void setOnRecentlyLikeClickListener(C16719g.c cVar) {
        C8323l1 c8323l1 = this.f44833M;
        if (c8323l1 != null) {
            c8323l1.m44771X1(cVar);
        }
    }
}
