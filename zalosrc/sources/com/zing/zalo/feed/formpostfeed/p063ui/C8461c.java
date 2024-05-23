package com.zing.zalo.feed.formpostfeed.p063ui;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.androidquery.util.C3979l;
import com.androidquery.util.InterfaceC3968a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.feed.formpostfeed.data.Gradient;
import com.zing.zalo.feed.formpostfeed.data.Lottie;
import com.zing.zalo.feed.formpostfeed.p063ui.C8461c;
import com.zing.zalo.lottie.LottieConfig;
import com.zing.zalo.zlottie.widget.C17291a;
import com.zing.zalo.zlottie.widget.LottieImageView;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import ho0.AbstractC20110a;
import me0.AbstractC23006a0;
import me0.AbstractC23136l9;
import me0.AbstractC23193r0;
import me0.C23278z2;
import p354n3.C23528a;
import p379o3.C23995f;
import p379o3.C23999j;
import p379o3.C24003n;
import p494rv.C25979a;
import tg.C26657h;
import tg.C26663n;
import tg.C26674y;

/* renamed from: com.zing.zalo.feed.formpostfeed.ui.c */
/* loaded from: classes4.dex */
public final class C8461c {

    /* renamed from: a */
    private final C23528a f45941a;

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.c$a */
    /* loaded from: classes4.dex */
    public interface a {
        /* renamed from: b */
        void mo45038b();
    }

    /* renamed from: com.zing.zalo.feed.formpostfeed.ui.c$b */
    /* loaded from: classes4.dex */
    public static final class b extends C23999j {

        /* renamed from: l1 */
        final /* synthetic */ a f45942l1;

        /* renamed from: m1 */
        final /* synthetic */ int f45943m1;

        /* renamed from: n1 */
        final /* synthetic */ RecyclingImageView f45944n1;

        b(a aVar, int i11, RecyclingImageView recyclingImageView) {
            this.f45942l1 = aVar;
            this.f45943m1 = i11;
            this.f45944n1 = recyclingImageView;
        }

        /* renamed from: I3 */
        public static final void m45078I3(int i11, RecyclingImageView recyclingImageView) {
            AbstractC19074t.m100208f(recyclingImageView, "$view");
            if (i11 != 0) {
                recyclingImageView.setBackground(AbstractC23136l9.m118665N(recyclingImageView.getContext(), i11));
            }
        }

        /* renamed from: J3 */
        public static final void m45079J3(RecyclingImageView recyclingImageView) {
            AbstractC19074t.m100208f(recyclingImageView, "$view");
            recyclingImageView.setBackground(null);
        }

        @Override // p379o3.C23999j
        /* renamed from: O1 */
        public void mo473O1(String str, InterfaceC3968a interfaceC3968a, C3979l c3979l, C23995f c23995f) {
            super.mo473O1(str, interfaceC3968a, c3979l, c23995f);
            if (c23995f != null) {
                a aVar = this.f45942l1;
                final int i11 = this.f45943m1;
                final RecyclingImageView recyclingImageView = this.f45944n1;
                if (c23995f.m125657h() != -101 && c23995f.m125657h() != -104) {
                    AbstractC19444a.m101695c(new Runnable() { // from class: yn.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8461c.b.m45079J3(RecyclingImageView.this);
                        }
                    });
                    return;
                }
                try {
                    AbstractC19444a.m101695c(new Runnable() { // from class: yn.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            C8461c.b.m45078I3(i11, recyclingImageView);
                        }
                    });
                } catch (Exception e11) {
                    AbstractC20110a.f98889a.mo104552e(e11);
                }
                if (aVar != null) {
                    aVar.mo45038b();
                }
            }
        }
    }

    public C8461c(Context context) {
        AbstractC19074t.m100208f(context, "context");
        this.f45941a = new C23528a(context);
    }

    /* renamed from: d */
    private final void m45066d(final Lottie lottie, final LottieImageView lottieImageView, final int i11, final a aVar) {
        final String value = lottie.getId().getValue();
        new C26663n(null, 0).m136827c(value, new C26674y.b() { // from class: yn.c
            @Override // tg.C26674y.b
            /* renamed from: a */
            public final void mo15759a(int i12, String str, String str2, C26657h c26657h) {
                C8461c.m45067e(value, aVar, lottieImageView, lottie, i11, i12, str, str2, c26657h);
            }
        }, true);
    }

    /* renamed from: e */
    public static final void m45067e(String str, a aVar, final LottieImageView lottieImageView, final Lottie lottie, final int i11, int i12, final String str2, final String str3, C26657h c26657h) {
        LottieConfig lottieConfig;
        AbstractC19074t.m100208f(str, "$effectIDLottie");
        AbstractC19074t.m100208f(lottieImageView, "$lottieImageView");
        AbstractC19074t.m100208f(lottie, "$lottie");
        if (c26657h != null) {
            lottieConfig = c26657h.f126162g;
        } else {
            lottieConfig = null;
        }
        final LottieConfig lottieConfig2 = lottieConfig;
        if (AbstractC19074t.m100204b(str2, str) && i12 == 0 && str3 != null && c26657h != null && c26657h.f126157b > 0 && lottieConfig2 != null) {
            AbstractC19444a.m101695c(new Runnable() { // from class: yn.d
                @Override // java.lang.Runnable
                public final void run() {
                    C8461c.m45068f(LottieImageView.this, str3, str2, lottieConfig2, lottie);
                }
            });
            return;
        }
        try {
            AbstractC19444a.m101695c(new Runnable() { // from class: yn.e
                @Override // java.lang.Runnable
                public final void run() {
                    C8461c.m45069g(i11, lottieImageView);
                }
            });
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
        if (aVar != null) {
            aVar.mo45038b();
        }
    }

    /* renamed from: f */
    public static final void m45068f(LottieImageView lottieImageView, String str, String str2, LottieConfig lottieConfig, Lottie lottie) {
        AbstractC19074t.m100208f(lottieImageView, "$lottieImageView");
        AbstractC19074t.m100208f(lottie, "$lottie");
        lottieImageView.setBackground(null);
        lottieImageView.m92147B(str + "/data.json", "fullscreen_lottie_effect_" + str2, !AbstractC23193r0.m119506o(), false);
        C25979a.m133810a(lottieImageView, lottieConfig);
        if (lottie.isLoop()) {
            lottieImageView.setAutoRepeatMode(C17291a.g.INFINITE);
        } else {
            lottieImageView.setAutoRepeatMode(C17291a.g.LIMIT);
            lottieImageView.setMaxRepeatCount(lottie.getNumberRepeat());
        }
        lottieImageView.m92155v();
    }

    /* renamed from: g */
    public static final void m45069g(int i11, LottieImageView lottieImageView) {
        AbstractC19074t.m100208f(lottieImageView, "$lottieImageView");
        if (i11 != 0) {
            lottieImageView.setBackground(AbstractC23136l9.m118665N(lottieImageView.getContext(), i11));
        }
    }

    /* renamed from: h */
    private final GradientDrawable.Orientation m45070h(Gradient gradient) {
        switch (gradient.getDirection()) {
            case 0:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            case 1:
                return GradientDrawable.Orientation.TR_BL;
            case 2:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 3:
                return GradientDrawable.Orientation.BR_TL;
            case 4:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 5:
                return GradientDrawable.Orientation.BL_TR;
            case 6:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 7:
                return GradientDrawable.Orientation.TL_BR;
            default:
                return GradientDrawable.Orientation.TOP_BOTTOM;
        }
    }

    /* renamed from: k */
    public static /* synthetic */ void m45071k(C8461c c8461c, RecyclingImageView recyclingImageView, String str, C24003n c24003n, int i11, a aVar, int i12, Object obj) {
        int i13;
        if ((i12 & 4) != 0) {
            c24003n = C23278z2.m120162x();
        }
        C24003n c24003n2 = c24003n;
        if ((i12 & 8) != 0) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        if ((i12 & 16) != 0) {
            aVar = null;
        }
        c8461c.m45074j(recyclingImageView, str, c24003n2, i13, aVar);
    }

    /* renamed from: m */
    public static /* synthetic */ void m45072m(C8461c c8461c, LottieImageView lottieImageView, Lottie lottie, int i11, a aVar, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        if ((i12 & 8) != 0) {
            aVar = null;
        }
        c8461c.m45075l(lottieImageView, lottie, i11, aVar);
    }

    /* renamed from: i */
    public final void m45073i(View view, Gradient gradient) {
        AbstractC19074t.m100208f(view, "view");
        AbstractC19074t.m100208f(gradient, "gradient");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(m45070h(gradient));
        gradientDrawable.setColors(new int[]{gradient.getColor().getStart().getValue(), gradient.getColor().getEnd().getValue()});
        view.setBackground(gradientDrawable);
    }

    /* renamed from: j */
    public final void m45074j(RecyclingImageView recyclingImageView, String str, C24003n c24003n, int i11, a aVar) {
        AbstractC19074t.m100208f(recyclingImageView, "view");
        AbstractC19074t.m100208f(str, "imageUrl");
        AbstractC19074t.m100208f(c24003n, "imageOptions");
        ((C23528a) this.f45941a.m123612r(recyclingImageView)).m123579C(str, c24003n, new b(aVar, i11, recyclingImageView).m125762H1(AbstractC23006a0.f111912c).m125764I1(100));
    }

    /* renamed from: l */
    public final void m45075l(LottieImageView lottieImageView, Lottie lottie, int i11, a aVar) {
        AbstractC19074t.m100208f(lottieImageView, "view");
        AbstractC19074t.m100208f(lottie, "lottie");
        m45066d(lottie, lottieImageView, i11, aVar);
    }
}
