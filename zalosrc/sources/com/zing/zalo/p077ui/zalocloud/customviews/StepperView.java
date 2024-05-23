package com.zing.zalo.p077ui.zalocloud.customviews;

import android.content.Context;
import bi0.AbstractC2807a;
import bi0.AbstractC2814h;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.p077ui.zalocloud.customviews.C13835a;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.ModulesView;
import com.zing.zalo.zdesign.component.C16974f;
import com.zing.zalo.zdesign.component.C16977g;
import com.zing.zalo.zdesign.component.EnumC16980h;
import com.zing.zalo.zdesign.component.EnumC16991i;
import fn0.AbstractC19074t;
import kd0.C21693c;
import kd0.C21697g;
import me0.AbstractC23222t7;
import me0.C23212s8;
import ti0.C26705d;
import ti0.C26707f;

/* loaded from: classes6.dex */
public final class StepperView extends ModulesView {

    /* renamed from: K */
    private final C16716d f71526K;

    /* renamed from: L */
    private C16716d f71527L;

    /* renamed from: M */
    private C21697g f71528M;

    /* renamed from: N */
    private C21697g f71529N;

    /* renamed from: O */
    private C16977g f71530O;

    /* renamed from: P */
    private C21693c f71531P;

    /* renamed from: com.zing.zalo.ui.zalocloud.customviews.StepperView$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C13834a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71532a;

        static {
            int[] iArr = new int[C13835a.a.values().length];
            try {
                iArr[C13835a.a.f71538p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C13835a.a.f71539q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C13835a.a.f71540r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C13835a.a.f71541s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[C13835a.a.f71542t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f71532a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepperView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        setClickable(false);
        m88987U(-1, -2);
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-1, -2);
        this.f71526K = c16716d;
        m77117V();
        mo69681L(c16716d);
    }

    /* renamed from: V */
    private final void m77117V() {
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        C16977g c16977g = new C16977g(context);
        C16718f m89106L = c16977g.m89106L();
        int i11 = AbstractC23222t7.f112514B;
        m89106L.m89028L(i11, i11);
        this.f71530O = c16977g;
        this.f71526K.m89001g1(c16977g);
        C16716d c16716d = new C16716d(getContext());
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        C16977g c16977g2 = this.f71530O;
        C16977g c16977g3 = null;
        if (c16977g2 == null) {
            AbstractC19074t.m100223u("stepNumberModule");
            c16977g2 = null;
        }
        m89028L.m89054h0(c16977g2).m89034R(AbstractC23222t7.f112576o).m89039W(AbstractC23222t7.f112532K);
        this.f71527L = c16716d;
        C21697g c21697g = new C21697g(getContext());
        c21697g.m89106L().m89028L(-2, -2);
        Context context2 = c21697g.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        new C26707f(c21697g).m137318a(C26705d.m137293a(context2, AbstractC2814h.t_large_m));
        this.f71528M = c21697g;
        C21697g c21697g2 = new C21697g(getContext());
        C16718f m89028L2 = c21697g2.m89106L().m89028L(-2, -2);
        C21697g c21697g3 = this.f71528M;
        if (c21697g3 == null) {
            AbstractC19074t.m100223u("titleModule");
            c21697g3 = null;
        }
        m89028L2.m89023G(c21697g3).m89036T(AbstractC23222t7.f112558f).m89044a0(AbstractC23222t7.f112514B);
        Context context3 = c21697g2.getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        new C26707f(c21697g2).m137318a(C26705d.m137293a(context3, AbstractC2814h.t_small));
        this.f71529N = c21697g2;
        C16716d c16716d2 = this.f71527L;
        if (c16716d2 == null) {
            AbstractC19074t.m100223u("bodyContainer");
            c16716d2 = null;
        }
        C21697g c21697g4 = this.f71528M;
        if (c21697g4 == null) {
            AbstractC19074t.m100223u("titleModule");
            c21697g4 = null;
        }
        c16716d2.m89001g1(c21697g4);
        C16716d c16716d3 = this.f71527L;
        if (c16716d3 == null) {
            AbstractC19074t.m100223u("bodyContainer");
            c16716d3 = null;
        }
        C21697g c21697g5 = this.f71529N;
        if (c21697g5 == null) {
            AbstractC19074t.m100223u("descriptionModule");
            c21697g5 = null;
        }
        c16716d3.m89001g1(c21697g5);
        C16716d c16716d4 = this.f71526K;
        C16716d c16716d5 = this.f71527L;
        if (c16716d5 == null) {
            AbstractC19074t.m100223u("bodyContainer");
            c16716d5 = null;
        }
        c16716d4.m89001g1(c16716d5);
        C21693c c21693c = new C21693c(getContext());
        C16718f m89028L3 = c21693c.m89106L().m89028L(AbstractC23222t7.f112534M, -1);
        C16977g c16977g4 = this.f71530O;
        if (c16977g4 == null) {
            AbstractC19074t.m100223u("stepNumberModule");
            c16977g4 = null;
        }
        C16718f m89023G = m89028L3.m89023G(c16977g4);
        C16977g c16977g5 = this.f71530O;
        if (c16977g5 == null) {
            AbstractC19074t.m100223u("stepNumberModule");
        } else {
            c16977g3 = c16977g5;
        }
        m89023G.m89069v(c16977g3).m89072y(Boolean.TRUE).m89036T(AbstractC23222t7.f112556e);
        c21693c.mo44614b1(0);
        this.f71531P = c21693c;
        this.f71526K.m89001g1(c21693c);
    }

    /* renamed from: W */
    private final C13835a.a m77118W(C13835a c13835a, int i11, boolean z11) {
        int m77124d = c13835a.m77124d();
        if (m77124d < i11) {
            return C13835a.a.f71539q;
        }
        if (i11 == m77124d) {
            if (z11) {
                return C13835a.a.f71542t;
            }
            return C13835a.a.f71538p;
        }
        if (z11) {
            return C13835a.a.f71541s;
        }
        return C13835a.a.f71540r;
    }

    /* renamed from: X */
    private final void m77119X(C13835a c13835a, C13835a.a aVar) {
        int i11 = C13834a.f71532a[aVar.ordinal()];
        C16977g c16977g = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 5) {
                    C16977g c16977g2 = this.f71530O;
                    if (c16977g2 == null) {
                        AbstractC19074t.m100223u("stepNumberModule");
                        c16977g2 = null;
                    }
                    Context context = getContext();
                    AbstractC19074t.m100207e(context, "getContext(...)");
                    C16974f c16974f = new C16974f(context);
                    c16974f.m90974x(EnumC16991i.CUSTOM);
                    c16974f.m90971u(EnumC16980h.SIZE_24);
                    c16974f.m90972v(String.valueOf(c13835a.m77124d()));
                    c16974f.m90973w(C23212s8.m119606n(AbstractC2807a.text_tertiary));
                    c16977g2.m90983u1(c16974f);
                    C16977g c16977g3 = this.f71530O;
                    if (c16977g3 == null) {
                        AbstractC19074t.m100223u("stepNumberModule");
                    } else {
                        c16977g = c16977g3;
                    }
                    c16977g.m89087B0(AbstractC16803z.layer_background_subtle);
                    return;
                }
            } else {
                C16977g c16977g4 = this.f71530O;
                if (c16977g4 == null) {
                    AbstractC19074t.m100223u("stepNumberModule");
                } else {
                    c16977g = c16977g4;
                }
                Context context2 = getContext();
                AbstractC19074t.m100207e(context2, "getContext(...)");
                C16974f c16974f2 = new C16974f(context2);
                c16974f2.m90974x(EnumC16991i.SYSTEM_STATUS_SUCCESS);
                c16974f2.m90971u(EnumC16980h.SIZE_24);
                c16977g.m90983u1(c16974f2);
                return;
            }
        }
        C16977g c16977g5 = this.f71530O;
        if (c16977g5 == null) {
            AbstractC19074t.m100223u("stepNumberModule");
            c16977g5 = null;
        }
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "getContext(...)");
        C16974f c16974f3 = new C16974f(context3);
        c16974f3.m90974x(EnumC16991i.CUSTOM);
        c16974f3.m90971u(EnumC16980h.SIZE_24);
        c16974f3.m90972v(String.valueOf(c13835a.m77124d()));
        c16974f3.m90973w(C23212s8.m119606n(AbstractC2807a.text_inverse));
        c16977g5.m90983u1(c16974f3);
        C16977g c16977g6 = this.f71530O;
        if (c16977g6 == null) {
            AbstractC19074t.m100223u("stepNumberModule");
        } else {
            c16977g = c16977g6;
        }
        c16977g.m89087B0(AbstractC16803z.layer_background_inverse);
    }

    /* renamed from: Y */
    public final void m77120Y(C13835a c13835a, int i11, boolean z11) {
        AbstractC19074t.m100208f(c13835a, "step");
        C16977g c16977g = this.f71530O;
        C21693c c21693c = null;
        if (c16977g == null) {
            AbstractC19074t.m100223u("stepNumberModule");
            c16977g = null;
        }
        c16977g.m90982t1(String.valueOf(c13835a.m77124d()));
        C13835a.a m77118W = m77118W(c13835a, i11, z11);
        m77119X(c13835a, m77118W);
        int i12 = C13834a.f71532a[m77118W.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 == 5) {
                            C21697g c21697g = this.f71528M;
                            if (c21697g == null) {
                                AbstractC19074t.m100223u("titleModule");
                                c21697g = null;
                            }
                            c21697g.m111959G1(c13835a.m77125e());
                            C21697g c21697g2 = this.f71529N;
                            if (c21697g2 == null) {
                                AbstractC19074t.m100223u("descriptionModule");
                                c21697g2 = null;
                            }
                            c21697g2.m111959G1(c13835a.m77121a());
                            C21697g c21697g3 = this.f71528M;
                            if (c21697g3 == null) {
                                AbstractC19074t.m100223u("titleModule");
                                c21697g3 = null;
                            }
                            c21697g3.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_primary));
                            C21697g c21697g4 = this.f71529N;
                            if (c21697g4 == null) {
                                AbstractC19074t.m100223u("descriptionModule");
                                c21697g4 = null;
                            }
                            c21697g4.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_secondary));
                            C21693c c21693c2 = this.f71531P;
                            if (c21693c2 == null) {
                                AbstractC19074t.m100223u("stepNumberDividerModule");
                            } else {
                                c21693c = c21693c2;
                            }
                            c21693c.mo44614b1(4);
                            return;
                        }
                        return;
                    }
                    C21697g c21697g5 = this.f71528M;
                    if (c21697g5 == null) {
                        AbstractC19074t.m100223u("titleModule");
                        c21697g5 = null;
                    }
                    c21697g5.m111959G1(c13835a.m77125e());
                    C21697g c21697g6 = this.f71529N;
                    if (c21697g6 == null) {
                        AbstractC19074t.m100223u("descriptionModule");
                        c21697g6 = null;
                    }
                    c21697g6.m111959G1(c13835a.m77121a());
                    C21697g c21697g7 = this.f71528M;
                    if (c21697g7 == null) {
                        AbstractC19074t.m100223u("titleModule");
                        c21697g7 = null;
                    }
                    c21697g7.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_primary));
                    C21697g c21697g8 = this.f71529N;
                    if (c21697g8 == null) {
                        AbstractC19074t.m100223u("descriptionModule");
                        c21697g8 = null;
                    }
                    c21697g8.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_secondary));
                    C21693c c21693c3 = this.f71531P;
                    if (c21693c3 == null) {
                        AbstractC19074t.m100223u("stepNumberDividerModule");
                    } else {
                        c21693c = c21693c3;
                    }
                    c21693c.mo44614b1(4);
                    return;
                }
                C21697g c21697g9 = this.f71528M;
                if (c21697g9 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c21697g9 = null;
                }
                c21697g9.m111959G1(c13835a.m77125e());
                C21697g c21697g10 = this.f71529N;
                if (c21697g10 == null) {
                    AbstractC19074t.m100223u("descriptionModule");
                    c21697g10 = null;
                }
                c21697g10.m111959G1(c13835a.m77121a());
                C21697g c21697g11 = this.f71528M;
                if (c21697g11 == null) {
                    AbstractC19074t.m100223u("titleModule");
                    c21697g11 = null;
                }
                c21697g11.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_primary));
                C21697g c21697g12 = this.f71529N;
                if (c21697g12 == null) {
                    AbstractC19074t.m100223u("descriptionModule");
                    c21697g12 = null;
                }
                c21697g12.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_secondary));
                C21693c c21693c4 = this.f71531P;
                if (c21693c4 == null) {
                    AbstractC19074t.m100223u("stepNumberDividerModule");
                } else {
                    c21693c = c21693c4;
                }
                c21693c.m89087B0(AbstractC16803z.divider_subtle);
                return;
            }
            C21697g c21697g13 = this.f71528M;
            if (c21697g13 == null) {
                AbstractC19074t.m100223u("titleModule");
                c21697g13 = null;
            }
            c21697g13.m111959G1(c13835a.m77123c());
            C21697g c21697g14 = this.f71529N;
            if (c21697g14 == null) {
                AbstractC19074t.m100223u("descriptionModule");
                c21697g14 = null;
            }
            c21697g14.m111959G1(c13835a.m77122b());
            C21697g c21697g15 = this.f71528M;
            if (c21697g15 == null) {
                AbstractC19074t.m100223u("titleModule");
                c21697g15 = null;
            }
            c21697g15.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_primary));
            C21697g c21697g16 = this.f71529N;
            if (c21697g16 == null) {
                AbstractC19074t.m100223u("descriptionModule");
                c21697g16 = null;
            }
            c21697g16.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_secondary));
            C21693c c21693c5 = this.f71531P;
            if (c21693c5 == null) {
                AbstractC19074t.m100223u("stepNumberDividerModule");
            } else {
                c21693c = c21693c5;
            }
            c21693c.m89087B0(AbstractC16803z.divider_subtle);
            return;
        }
        C21697g c21697g17 = this.f71528M;
        if (c21697g17 == null) {
            AbstractC19074t.m100223u("titleModule");
            c21697g17 = null;
        }
        c21697g17.m111959G1(c13835a.m77125e());
        C21697g c21697g18 = this.f71529N;
        if (c21697g18 == null) {
            AbstractC19074t.m100223u("descriptionModule");
            c21697g18 = null;
        }
        c21697g18.m111959G1(c13835a.m77121a());
        C21697g c21697g19 = this.f71528M;
        if (c21697g19 == null) {
            AbstractC19074t.m100223u("titleModule");
            c21697g19 = null;
        }
        c21697g19.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_primary));
        C21697g c21697g20 = this.f71529N;
        if (c21697g20 == null) {
            AbstractC19074t.m100223u("descriptionModule");
            c21697g20 = null;
        }
        c21697g20.m111962J1(C23212s8.m119607o(getContext(), AbstractC2807a.text_secondary));
        C21693c c21693c6 = this.f71531P;
        if (c21693c6 == null) {
            AbstractC19074t.m100223u("stepNumberDividerModule");
        } else {
            c21693c = c21693c6;
        }
        c21693c.m89087B0(AbstractC16803z.divider_subtle);
    }
}
