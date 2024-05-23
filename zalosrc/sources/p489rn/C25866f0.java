package p489rn;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import ao.InterfaceC2259a;
import ao.InterfaceC2260b;
import ao.InterfaceC2262d;
import au.C2370r0;
import bo.C3000l0;
import bo.C3020p0;
import bo.C3025q0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.feed.components.FeedItemGroupHorizontal;
import com.zing.zalo.feed.utils.FeedActionZUtils;
import com.zing.zalo.social.controls.C10866e;
import com.zing.zalo.social.controls.InterfaceC10867f;
import com.zing.zalo.uidrawing.C16719g;
import is.AbstractC20814p0;
import l30.AbstractC22055v0;
import me0.AbstractC23152n3;
import p361nb.AbstractC23647d;
import p615wn.C29105a;
import p716zh.C31980jc;
import p716zh.C32002l4;

/* renamed from: rn.f0 */
/* loaded from: classes4.dex */
public class C25866f0 {

    /* renamed from: a */
    InterfaceC2259a f123392a;

    /* renamed from: b */
    InterfaceC2262d f123393b;

    /* renamed from: c */
    boolean f123394c = false;

    /* renamed from: G */
    public static C10866e.a m133447G(Context context, String str, double d11, double d12) {
        return new C10866e.a() { // from class: rn.y

            /* renamed from: a */
            public final /* synthetic */ Context f123644a;

            /* renamed from: b */
            public final /* synthetic */ String f123645b;

            /* renamed from: c */
            public final /* synthetic */ double f123646c;

            /* renamed from: d */
            public final /* synthetic */ double f123647d;

            public /* synthetic */ C25929y(Context context2, String str2, double d112, double d122) {
                r1 = context2;
                r2 = str2;
                r3 = d112;
                r5 = d122;
            }

            @Override // com.zing.zalo.social.controls.C10866e.a
            /* renamed from: a */
            public final void mo44545a(int i11) {
                C25866f0.m133462b0(r1, r2, r3, r5, i11);
            }
        };
    }

    /* renamed from: H */
    public static C10866e.a m133448H(InterfaceC10867f interfaceC10867f, String str, double d11, double d12) {
        return new C10866e.a() { // from class: rn.k

            /* renamed from: b */
            public final /* synthetic */ String f123494b;

            /* renamed from: c */
            public final /* synthetic */ double f123495c;

            /* renamed from: d */
            public final /* synthetic */ double f123496d;

            public /* synthetic */ C25885k(String str2, double d112, double d122) {
                r2 = str2;
                r3 = d112;
                r5 = d122;
            }

            @Override // com.zing.zalo.social.controls.C10866e.a
            /* renamed from: a */
            public final void mo44545a(int i11) {
                C25866f0.m133464c0(C2370r0.this, r2, r3, r5, i11);
            }
        };
    }

    /* renamed from: Q */
    public static /* synthetic */ void m133449Q(Context context, C3020p0 c3020p0, String str, String str2, C3025q0.d dVar, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource, View view) {
        try {
            C29105a c29105a = new C29105a(context, c3020p0, str, str2, dVar, interfaceC2259a, trackingSource);
            c29105a.m145358a(C32002l4.m154265h(10002, 29));
            AbstractC20814p0.m108620O(c29105a);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: R */
    public static /* synthetic */ void m133450R(Context context, C3020p0 c3020p0, String str, String str2, C3025q0.d dVar, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource, C16719g c16719g) {
        try {
            AbstractC20814p0.m108620O(new C29105a(context, c3020p0, str, str2, dVar, interfaceC2259a, trackingSource));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: S */
    public /* synthetic */ void m133451S(C3020p0 c3020p0, int i11) {
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11917Bz(c3020p0, i11);
        }
    }

    /* renamed from: T */
    public /* synthetic */ void m133452T(C3020p0 c3020p0, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle, View view) {
        InterfaceC2259a interfaceC2259a;
        if (!c3020p0.m14493X() && (interfaceC2259a = this.f123392a) != null) {
            interfaceC2259a.mo11960kf(view, c3000l0, i11, z11, bundle);
        }
    }

    /* renamed from: U */
    public /* synthetic */ void m133453U(C3020p0 c3020p0, C3000l0 c3000l0, int i11, boolean z11, Bundle bundle, C16719g c16719g) {
        InterfaceC2259a interfaceC2259a;
        if (!c3020p0.m14493X() && (interfaceC2259a = this.f123392a) != null) {
            interfaceC2259a.mo11936Tt(c16719g, c3000l0, i11, z11, bundle);
        }
    }

    /* renamed from: V */
    public /* synthetic */ void m133454V(C3000l0 c3000l0, int i11, boolean z11, Bundle bundle, View view) {
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11960kf(view, c3000l0, i11, z11, bundle);
        }
    }

    /* renamed from: W */
    public /* synthetic */ void m133455W(C3000l0 c3000l0, int i11, boolean z11, Bundle bundle, C16719g c16719g) {
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11936Tt(c16719g, c3000l0, i11, z11, bundle);
        }
    }

    /* renamed from: X */
    public /* synthetic */ void m133456X(C3000l0 c3000l0, C3020p0 c3020p0, View view) {
        InterfaceC2262d interfaceC2262d = this.f123393b;
        if (interfaceC2262d != null) {
            interfaceC2262d.mo11978a(c3000l0, c3020p0.f12057p);
        }
    }

    /* renamed from: Y */
    public /* synthetic */ void m133457Y(C3000l0 c3000l0, C3020p0 c3020p0, C16719g c16719g) {
        InterfaceC2262d interfaceC2262d = this.f123393b;
        if (interfaceC2262d != null) {
            interfaceC2262d.mo11978a(c3000l0, c3020p0.f12057p);
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void m133458Z(C3000l0 c3000l0, C3020p0 c3020p0, View view) {
        if (c3000l0 != null && c3020p0 != null && !c3000l0.m14285C0()) {
            FeedActionZUtils.m47529Q(this.f123392a, c3000l0, c3020p0.f12057p, this.f123394c);
        }
    }

    /* renamed from: a0 */
    public /* synthetic */ void m133460a0(C3000l0 c3000l0, C3020p0 c3020p0, C16719g c16719g) {
        if (c3000l0 != null && c3020p0 != null) {
            FeedActionZUtils.m47529Q(this.f123392a, c3000l0, c3020p0.f12057p, this.f123394c);
        }
    }

    /* renamed from: b0 */
    public static /* synthetic */ void m133462b0(Context context, String str, double d11, double d12, int i11) {
        if (i11 == 106) {
            AbstractC23647d.m123906p("490101");
            AbstractC23647d.m123893c();
            AbstractC23152n3.m119042f0(context, str, d11, d12);
        }
    }

    /* renamed from: c0 */
    public static /* synthetic */ void m133464c0(C2370r0 c2370r0, String str, double d11, double d12, int i11) {
        if (i11 == 106) {
            AbstractC23647d.m123906p("490101");
            AbstractC23647d.m123893c();
            if (c2370r0 != null && c2370r0.m12394a() != null) {
                ((InterfaceC10867f) c2370r0.m12394a()).mo43564Fj(str, d11, d12);
            }
        }
    }

    /* renamed from: d0 */
    public /* synthetic */ void m133466d0(C3000l0 c3000l0, int i11, View view) {
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11939We(view, c3000l0, i11);
        }
    }

    /* renamed from: e0 */
    public /* synthetic */ void m133468e0(C3000l0 c3000l0, int i11, C16719g c16719g) {
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11945af(c16719g, c3000l0, i11);
        }
    }

    /* renamed from: f0 */
    public /* synthetic */ void m133470f0(C3020p0 c3020p0, AbstractC22055v0.l lVar, C3000l0 c3000l0, int i11, View view) {
        C31980jc m115161u;
        if (AbstractC22055v0.m115114D(c3020p0.f12022B.f12280b, false) && (m115161u = AbstractC22055v0.m115161u(c3020p0.f12022B.f12280b)) != null) {
            if (lVar != null) {
                lVar.mo47172c(m115161u, null, 346);
            }
        } else {
            InterfaceC2259a interfaceC2259a = this.f123392a;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11939We(view, c3000l0, i11);
            }
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void m133472g0(C3020p0 c3020p0, AbstractC22055v0.l lVar, C3000l0 c3000l0, int i11, C16719g c16719g) {
        C31980jc m115161u;
        if (AbstractC22055v0.m115114D(c3020p0.f12022B.f12280b, false) && (m115161u = AbstractC22055v0.m115161u(c3020p0.f12022B.f12280b)) != null) {
            if (lVar != null) {
                lVar.mo47172c(m115161u, null, 346);
            }
        } else {
            InterfaceC2259a interfaceC2259a = this.f123392a;
            if (interfaceC2259a != null) {
                interfaceC2259a.mo11945af(c16719g, c3000l0, i11);
            }
        }
    }

    /* renamed from: h0 */
    public /* synthetic */ void m133474h0(C3000l0 c3000l0, int i11, C3020p0 c3020p0, View view) {
        AbstractC23647d.m123907q(FeedActionZUtils.m47562t("40103%d%d", c3000l0, i11), "");
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11974wp(c3020p0);
        }
        FeedActionZUtils.m47520H(c3020p0, 20);
        AbstractC23647d.m123893c();
    }

    /* renamed from: i0 */
    public /* synthetic */ void m133476i0(C3000l0 c3000l0, int i11, C3020p0 c3020p0, C16719g c16719g) {
        AbstractC23647d.m123907q(FeedActionZUtils.m47562t("40103%d%d", c3000l0, i11), "");
        InterfaceC2259a interfaceC2259a = this.f123392a;
        if (interfaceC2259a != null) {
            interfaceC2259a.mo11974wp(c3020p0);
        }
        FeedActionZUtils.m47520H(c3020p0, 20);
        AbstractC23647d.m123893c();
    }

    /* renamed from: j0 */
    public /* synthetic */ void m133478j0(C3020p0 c3020p0, View view) {
        InterfaceC2259a interfaceC2259a;
        if (c3020p0 != null && (interfaceC2259a = this.f123392a) != null) {
            interfaceC2259a.mo11955gn(c3020p0);
        }
    }

    /* renamed from: k0 */
    public /* synthetic */ void m133480k0(C3020p0 c3020p0, C16719g c16719g) {
        InterfaceC2259a interfaceC2259a;
        if (c3020p0 != null && (interfaceC2259a = this.f123392a) != null) {
            interfaceC2259a.mo11955gn(c3020p0);
        }
    }

    /* renamed from: n0 */
    public static void m133484n0(FeedItemGroupHorizontal feedItemGroupHorizontal, InterfaceC2262d interfaceC2262d) {
        if (feedItemGroupHorizontal != null) {
            feedItemGroupHorizontal.setMenuClickListener(interfaceC2262d);
        }
    }

    /* renamed from: v */
    public static void m133492v(View view, Context context, C3020p0 c3020p0, String str, String str2, C3025q0.d dVar, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource) {
        view.setOnClickListener(new View.OnClickListener() { // from class: rn.v

            /* renamed from: p */
            public final /* synthetic */ Context f123607p;

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123608q;

            /* renamed from: r */
            public final /* synthetic */ String f123609r;

            /* renamed from: s */
            public final /* synthetic */ String f123610s;

            /* renamed from: t */
            public final /* synthetic */ C3025q0.d f123611t;

            /* renamed from: u */
            public final /* synthetic */ InterfaceC2259a f123612u;

            /* renamed from: v */
            public final /* synthetic */ TrackingSource f123613v;

            public /* synthetic */ ViewOnClickListenerC25920v(Context context2, C3020p0 c3020p02, String str3, String str22, C3025q0.d dVar2, InterfaceC2259a interfaceC2259a2, TrackingSource trackingSource2) {
                r1 = context2;
                r2 = c3020p02;
                r3 = str3;
                r4 = str22;
                r5 = dVar2;
                r6 = interfaceC2259a2;
                r7 = trackingSource2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C25866f0.m133449Q(r1, r2, r3, r4, r5, r6, r7, view2);
            }
        });
    }

    /* renamed from: w */
    public static void m133493w(C16719g c16719g, Context context, C3020p0 c3020p0, String str, String str2, C3025q0.d dVar, InterfaceC2259a interfaceC2259a, TrackingSource trackingSource) {
        c16719g.mo89109M0(new C16719g.c() { // from class: rn.x

            /* renamed from: p */
            public final /* synthetic */ Context f123626p;

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123627q;

            /* renamed from: r */
            public final /* synthetic */ String f123628r;

            /* renamed from: s */
            public final /* synthetic */ String f123629s;

            /* renamed from: t */
            public final /* synthetic */ C3025q0.d f123630t;

            /* renamed from: u */
            public final /* synthetic */ InterfaceC2259a f123631u;

            /* renamed from: v */
            public final /* synthetic */ TrackingSource f123632v;

            public /* synthetic */ C25926x(Context context2, C3020p0 c3020p02, String str3, String str22, C3025q0.d dVar2, InterfaceC2259a interfaceC2259a2, TrackingSource trackingSource2) {
                r1 = context2;
                r2 = c3020p02;
                r3 = str3;
                r4 = str22;
                r5 = dVar2;
                r6 = interfaceC2259a2;
                r7 = trackingSource2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g2) {
                C25866f0.m133450R(r1, r2, r3, r4, r5, r6, r7, c16719g2);
            }
        });
    }

    /* renamed from: A */
    public View.OnClickListener m133494A(C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        return new View.OnClickListener() { // from class: rn.b0

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123357q;

            /* renamed from: r */
            public final /* synthetic */ int f123358r;

            /* renamed from: s */
            public final /* synthetic */ boolean f123359s;

            /* renamed from: t */
            public final /* synthetic */ Bundle f123360t;

            public /* synthetic */ ViewOnClickListenerC25850b0(C3000l0 c3000l02, int i112, boolean z112, Bundle bundle2) {
                r2 = c3000l02;
                r3 = i112;
                r4 = z112;
                r5 = bundle2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133454V(r2, r3, r4, r5, view);
            }
        };
    }

    /* renamed from: B */
    public C16719g.c m133495B(C3000l0 c3000l0, int i11, boolean z11, Bundle bundle) {
        return new C16719g.c() { // from class: rn.d0

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123375q;

            /* renamed from: r */
            public final /* synthetic */ int f123376r;

            /* renamed from: s */
            public final /* synthetic */ boolean f123377s;

            /* renamed from: t */
            public final /* synthetic */ Bundle f123378t;

            public /* synthetic */ C25858d0(C3000l0 c3000l02, int i112, boolean z112, Bundle bundle2) {
                r2 = c3000l02;
                r3 = i112;
                r4 = z112;
                r5 = bundle2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133455W(r2, r3, r4, r5, c16719g);
            }
        };
    }

    /* renamed from: C */
    public View.OnClickListener m133496C(C3000l0 c3000l0, C3020p0 c3020p0) {
        return new View.OnClickListener() { // from class: rn.u

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123601q;

            /* renamed from: r */
            public final /* synthetic */ C3020p0 f123602r;

            public /* synthetic */ ViewOnClickListenerC25917u(C3000l0 c3000l02, C3020p0 c3020p02) {
                r2 = c3000l02;
                r3 = c3020p02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133456X(r2, r3, view);
            }
        };
    }

    /* renamed from: D */
    public C16719g.c m133497D(C3000l0 c3000l0, C3020p0 c3020p0) {
        return new C16719g.c() { // from class: rn.p

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123563q;

            /* renamed from: r */
            public final /* synthetic */ C3020p0 f123564r;

            public /* synthetic */ C25902p(C3000l0 c3000l02, C3020p0 c3020p02) {
                r2 = c3000l02;
                r3 = c3020p02;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133457Y(r2, r3, c16719g);
            }
        };
    }

    /* renamed from: E */
    public View.OnClickListener m133498E(C3000l0 c3000l0, C3020p0 c3020p0) {
        return new View.OnClickListener() { // from class: rn.e0

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123385q;

            /* renamed from: r */
            public final /* synthetic */ C3020p0 f123386r;

            public /* synthetic */ ViewOnClickListenerC25862e0(C3000l0 c3000l02, C3020p0 c3020p02) {
                r2 = c3000l02;
                r3 = c3020p02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133458Z(r2, r3, view);
            }
        };
    }

    /* renamed from: F */
    public C16719g.c m133499F(C3000l0 c3000l0, C3020p0 c3020p0) {
        return new C16719g.c() { // from class: rn.l

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123506q;

            /* renamed from: r */
            public final /* synthetic */ C3020p0 f123507r;

            public /* synthetic */ C25889l(C3000l0 c3000l02, C3020p0 c3020p02) {
                r2 = c3000l02;
                r3 = c3020p02;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133460a0(r2, r3, c16719g);
            }
        };
    }

    /* renamed from: I */
    public View.OnClickListener m133500I(C3000l0 c3000l0, int i11) {
        return new View.OnClickListener() { // from class: rn.c0

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123367q;

            /* renamed from: r */
            public final /* synthetic */ int f123368r;

            public /* synthetic */ ViewOnClickListenerC25854c0(C3000l0 c3000l02, int i112) {
                r2 = c3000l02;
                r3 = i112;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133466d0(r2, r3, view);
            }
        };
    }

    /* renamed from: J */
    public C16719g.c m133501J(C3000l0 c3000l0, int i11) {
        return new C16719g.c() { // from class: rn.a0

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123283q;

            /* renamed from: r */
            public final /* synthetic */ int f123284r;

            public /* synthetic */ C25846a0(C3000l0 c3000l02, int i112) {
                r2 = c3000l02;
                r3 = i112;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133468e0(r2, r3, c16719g);
            }
        };
    }

    /* renamed from: K */
    public View.OnClickListener m133502K(C3000l0 c3000l0, C3020p0 c3020p0, int i11, AbstractC22055v0.l lVar) {
        return new View.OnClickListener() { // from class: rn.q

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123569q;

            /* renamed from: r */
            public final /* synthetic */ AbstractC22055v0.l f123570r;

            /* renamed from: s */
            public final /* synthetic */ C3000l0 f123571s;

            /* renamed from: t */
            public final /* synthetic */ int f123572t;

            public /* synthetic */ ViewOnClickListenerC25905q(C3020p0 c3020p02, AbstractC22055v0.l lVar2, C3000l0 c3000l02, int i112) {
                r2 = c3020p02;
                r3 = lVar2;
                r4 = c3000l02;
                r5 = i112;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133470f0(r2, r3, r4, r5, view);
            }
        };
    }

    /* renamed from: L */
    public C16719g.c m133503L(C3000l0 c3000l0, C3020p0 c3020p0, int i11, AbstractC22055v0.l lVar) {
        return new C16719g.c() { // from class: rn.w

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123619q;

            /* renamed from: r */
            public final /* synthetic */ AbstractC22055v0.l f123620r;

            /* renamed from: s */
            public final /* synthetic */ C3000l0 f123621s;

            /* renamed from: t */
            public final /* synthetic */ int f123622t;

            public /* synthetic */ C25923w(C3020p0 c3020p02, AbstractC22055v0.l lVar2, C3000l0 c3000l02, int i112) {
                r2 = c3020p02;
                r3 = lVar2;
                r4 = c3000l02;
                r5 = i112;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133472g0(r2, r3, r4, r5, c16719g);
            }
        };
    }

    /* renamed from: M */
    public View.OnClickListener m133504M(C3000l0 c3000l0, int i11, C3020p0 c3020p0) {
        return new View.OnClickListener() { // from class: rn.n

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123533q;

            /* renamed from: r */
            public final /* synthetic */ int f123534r;

            /* renamed from: s */
            public final /* synthetic */ C3020p0 f123535s;

            public /* synthetic */ ViewOnClickListenerC25896n(C3000l0 c3000l02, int i112, C3020p0 c3020p02) {
                r2 = c3000l02;
                r3 = i112;
                r4 = c3020p02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133474h0(r2, r3, r4, view);
            }
        };
    }

    /* renamed from: N */
    public C16719g.c m133505N(C3000l0 c3000l0, int i11, C3020p0 c3020p0) {
        return new C16719g.c() { // from class: rn.m

            /* renamed from: q */
            public final /* synthetic */ C3000l0 f123523q;

            /* renamed from: r */
            public final /* synthetic */ int f123524r;

            /* renamed from: s */
            public final /* synthetic */ C3020p0 f123525s;

            public /* synthetic */ C25893m(C3000l0 c3000l02, int i112, C3020p0 c3020p02) {
                r2 = c3000l02;
                r3 = i112;
                r4 = c3020p02;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133476i0(r2, r3, r4, c16719g);
            }
        };
    }

    /* renamed from: O */
    public View.OnClickListener m133506O(C3020p0 c3020p0) {
        return new View.OnClickListener() { // from class: rn.r

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123578q;

            public /* synthetic */ ViewOnClickListenerC25908r(C3020p0 c3020p02) {
                r2 = c3020p02;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133478j0(r2, view);
            }
        };
    }

    /* renamed from: P */
    public C16719g.c m133507P(C3020p0 c3020p0) {
        return new C16719g.c() { // from class: rn.o

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123559q;

            public /* synthetic */ C25899o(C3020p0 c3020p02) {
                r2 = c3020p02;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133480k0(r2, c16719g);
            }
        };
    }

    /* renamed from: l0 */
    public void m133508l0(InterfaceC2259a interfaceC2259a) {
        this.f123392a = interfaceC2259a;
    }

    /* renamed from: m0 */
    public void m133509m0(InterfaceC2262d interfaceC2262d) {
        this.f123393b = interfaceC2262d;
    }

    /* renamed from: o0 */
    public void m133510o0(boolean z11) {
        this.f123394c = z11;
    }

    /* renamed from: x */
    public InterfaceC2260b m133511x() {
        return new InterfaceC2260b() { // from class: rn.z
            public /* synthetic */ C25932z() {
            }

            @Override // ao.InterfaceC2260b
            /* renamed from: a */
            public final void mo11977a(C3020p0 c3020p0, int i11) {
                C25866f0.this.m133451S(c3020p0, i11);
            }
        };
    }

    /* renamed from: y */
    public View.OnClickListener m133512y(C3000l0 c3000l0, int i11, C3020p0 c3020p0, boolean z11, Bundle bundle) {
        return new View.OnClickListener() { // from class: rn.s

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123583q;

            /* renamed from: r */
            public final /* synthetic */ C3000l0 f123584r;

            /* renamed from: s */
            public final /* synthetic */ int f123585s;

            /* renamed from: t */
            public final /* synthetic */ boolean f123586t;

            /* renamed from: u */
            public final /* synthetic */ Bundle f123587u;

            public /* synthetic */ ViewOnClickListenerC25911s(C3020p0 c3020p02, C3000l0 c3000l02, int i112, boolean z112, Bundle bundle2) {
                r2 = c3020p02;
                r3 = c3000l02;
                r4 = i112;
                r5 = z112;
                r6 = bundle2;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C25866f0.this.m133452T(r2, r3, r4, r5, r6, view);
            }
        };
    }

    /* renamed from: z */
    public C16719g.c m133513z(C3000l0 c3000l0, int i11, C3020p0 c3020p0, boolean z11, Bundle bundle) {
        return new C16719g.c() { // from class: rn.t

            /* renamed from: q */
            public final /* synthetic */ C3020p0 f123592q;

            /* renamed from: r */
            public final /* synthetic */ C3000l0 f123593r;

            /* renamed from: s */
            public final /* synthetic */ int f123594s;

            /* renamed from: t */
            public final /* synthetic */ boolean f123595t;

            /* renamed from: u */
            public final /* synthetic */ Bundle f123596u;

            public /* synthetic */ C25914t(C3020p0 c3020p02, C3000l0 c3000l02, int i112, boolean z112, Bundle bundle2) {
                r2 = c3020p02;
                r3 = c3000l02;
                r4 = i112;
                r5 = z112;
                r6 = bundle2;
            }

            @Override // com.zing.zalo.uidrawing.C16719g.c
            /* renamed from: y */
            public final void mo929y(C16719g c16719g) {
                C25866f0.this.m133453U(r2, r3, r4, r5, r6, c16719g);
            }
        };
    }
}
