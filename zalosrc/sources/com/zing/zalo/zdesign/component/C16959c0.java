package com.zing.zalo.zdesign.component;

import ac.C0708i;
import android.content.Context;
import android.text.TextUtils;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import bi0.AbstractC2810d;
import bi0.AbstractC2814h;
import bi0.AbstractC2816j;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import fn0.AbstractC19074t;
import java.lang.ref.WeakReference;
import kd0.C21693c;
import ki0.C21737e;
import ki0.C21740h;
import p193h0.AbstractC19694b;
import ri0.C25807a;
import ti0.C26705d;
import ti0.C26707f;
import ui0.C27276c;
import ui0.C27280g;

/* renamed from: com.zing.zalo.zdesign.component.c0 */
/* loaded from: classes7.dex */
public class C16959c0 extends C21737e implements InterfaceC16976f1 {

    /* renamed from: M0 */
    private C25807a f86579M0;

    /* renamed from: N0 */
    private C17073y f86580N0;

    /* renamed from: O0 */
    private C21693c f86581O0;

    /* renamed from: P0 */
    private C16977g f86582P0;

    /* renamed from: Q0 */
    private C16977g f86583Q0;

    /* renamed from: R0 */
    private C21737e f86584R0;

    /* renamed from: S0 */
    private C21737e f86585S0;

    /* renamed from: T0 */
    private C21737e f86586T0;

    /* renamed from: U0 */
    private C21737e f86587U0;

    /* renamed from: V0 */
    private C21737e f86588V0;

    /* renamed from: W0 */
    private C21737e f86589W0;

    /* renamed from: X0 */
    private C21737e f86590X0;

    /* renamed from: Y0 */
    private C21737e f86591Y0;

    /* renamed from: Z0 */
    private C21737e f86592Z0;

    /* renamed from: a1 */
    private C21740h f86593a1;

    /* renamed from: b1 */
    private C21737e f86594b1;

    /* renamed from: c1 */
    private C21740h f86595c1;

    /* renamed from: d1 */
    private C21737e f86596d1;

    /* renamed from: e1 */
    private C21740h f86597e1;

    /* renamed from: f1 */
    private C21737e f86598f1;

    /* renamed from: g1 */
    private C21737e f86599g1;

    /* renamed from: h1 */
    private C21737e f86600h1;

    /* renamed from: i1 */
    private C17075z f86601i1;

    /* renamed from: j1 */
    private final int f86602j1;

    /* renamed from: com.zing.zalo.zdesign.component.c0$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f86603a;

        static {
            int[] iArr = new int[EnumC16952b0.values().length];
            try {
                iArr[EnumC16952b0.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC16952b0.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC16952b0.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86603a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16959c0(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        int m139649b = C27276c.m139649b(context2, 16);
        this.f86602j1 = m139649b;
        m89106L().m89028L(-1, -2);
        C21737e c21737e = new C21737e(context);
        c21737e.m89106L().m89028L(-1, -2);
        c21737e.mo44614b1(0);
        c21737e.m89007n1(false);
        this.f86584R0 = c21737e;
        C21737e c21737e2 = new C21737e(context);
        C16718f m89028L = c21737e2.m89106L().m89028L(-1, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89018B(bool);
        c21737e2.mo44614b1(8);
        this.f86591Y0 = c21737e2;
        C21737e c21737e3 = new C21737e(context);
        c21737e3.m89106L().m89028L(-1, -2).m89023G(this.f86591Y0);
        c21737e3.m89007n1(false);
        this.f86585S0 = c21737e3;
        C17073y c17073y = new C17073y(context);
        c17073y.m89106L().m89073z(bool).m89027K(true).m89035S(m139649b);
        c17073y.mo44614b1(8);
        this.f86580N0 = c17073y;
        C21737e c21737e4 = new C21737e(context);
        c21737e4.m89106L().m89028L(-2, -2).m89035S(m139649b).m89054h0(this.f86580N0).m89027K(true);
        c21737e4.mo44614b1(8);
        c21737e4.m89007n1(false);
        this.f86586T0 = c21737e4;
        C21693c c21693c = new C21693c(context);
        c21693c.m89106L().m89017A(bool).m89034R(C27276c.m139649b(context, 8)).m89027K(true);
        c21693c.mo111925v1(C27280g.m139660c(context, AbstractC2810d.zds_ic_chevron_right_line_16, AbstractC2807a.icon_02));
        c21693c.mo44614b1(8);
        this.f86581O0 = c21693c;
        C21737e c21737e5 = new C21737e(context);
        c21737e5.m89106L().m89028L(-2, -2).m89049e0(this.f86581O0).m89034R(m139649b).m89027K(true);
        c21737e5.mo44614b1(8);
        this.f86600h1 = c21737e5;
        C21737e c21737e6 = new C21737e(context);
        c21737e6.m89106L().m89028L(-2, -2).m89054h0(this.f86586T0).m89049e0(this.f86600h1).m89027K(true);
        c21737e6.m89007n1(false);
        this.f86587U0 = c21737e6;
        C21737e c21737e7 = new C21737e(context);
        c21737e7.m89106L().m89028L(-2, -2);
        this.f86589W0 = c21737e7;
        C21737e c21737e8 = new C21737e(context);
        c21737e8.m89106L().m89028L(-1, -2).m89023G(this.f86589W0);
        this.f86588V0 = c21737e8;
        C21737e c21737e9 = new C21737e(context);
        c21737e9.m89106L().m89028L(-2, -2).m89017A(bool);
        this.f86598f1 = c21737e9;
        C21737e c21737e10 = new C21737e(context);
        c21737e10.m89106L().m89028L(-2, -2).m89073z(bool).m89049e0(this.f86598f1).m89029M(13);
        C21737e c21737e11 = new C21737e(context);
        c21737e11.m89106L().m89028L(-2, -2).m89027K(true).m89073z(bool);
        c21737e11.mo44614b1(8);
        this.f86594b1 = c21737e11;
        C21740h c21740h = new C21740h(context);
        c21740h.mo44614b1(0);
        new C26707f(c21740h).m137318a(C26705d.m137293a(context, AbstractC2814h.t_large));
        c21740h.m111963K1(AbstractC19694b.m103335c(context, AbstractC2808b.color_title_list_item));
        c21740h.m89106L().m89028L(-2, -2).m89054h0(this.f86594b1).m89027K(true);
        this.f86593a1 = c21740h;
        C21737e c21737e12 = new C21737e(context);
        c21737e12.m89106L().m89028L(-2, -2);
        c21737e12.m89001g1(this.f86594b1);
        c21737e12.m89001g1(this.f86593a1);
        C21740h c21740h2 = new C21740h(context);
        new C26707f(c21740h2).m137318a(C26705d.m137293a(context, AbstractC2814h.t_normal));
        c21740h2.m111962J1(AbstractC2816j.Companion.m13592a(context, AbstractC2807a.list_item_bracket_content));
        c21740h2.m89106L().m89028L(-2, -2);
        c21740h2.mo44614b1(8);
        this.f86597e1 = c21740h2;
        C16977g c16977g = new C16977g(context);
        c16977g.m89106L().m89028L(-2, -2).m89027K(true).m89054h0(this.f86597e1).m89034R(C27276c.m139649b(context, 4));
        c16977g.mo44614b1(8);
        this.f86582P0 = c16977g;
        C21737e c21737e13 = new C21737e(context);
        c21737e13.m89106L().m89028L(-2, -2).m89034R(C27276c.m139649b(context, 4)).m89017A(bool).m89027K(true);
        c21737e13.m89001g1(this.f86597e1);
        c21737e13.m89001g1(this.f86582P0);
        c21737e13.m89007n1(false);
        c21737e12.m89106L().m89049e0(c21737e13);
        c21737e12.m89001g1(this.f86594b1);
        c21737e12.m89001g1(this.f86593a1);
        c21737e10.m89001g1(c21737e13);
        c21737e10.m89001g1(c21737e12);
        C21737e c21737e14 = new C21737e(context);
        c21737e14.m89106L().m89028L(-2, -2).m89017A(bool).m89023G(c21737e10).m89036T(C27276c.m139649b(context, 2));
        this.f86599g1 = c21737e14;
        C21737e c21737e15 = new C21737e(context);
        c21737e15.m89106L().m89028L(-2, -2).m89049e0(this.f86599g1).m89023G(c21737e10).m89073z(bool).m89029M(13).m89036T(C27276c.m139649b(context, 2));
        C21737e c21737e16 = new C21737e(context);
        c21737e16.m89106L().m89028L(-2, -2).m89029M(12);
        C21737e c21737e17 = new C21737e(context);
        c21737e17.m89106L().m89028L(-2, -2).m89027K(true).m89033Q(C27276c.m139649b(context, -1));
        c21737e17.mo44614b1(8);
        this.f86596d1 = c21737e17;
        C21740h c21740h3 = new C21740h(context);
        new C26707f(c21740h3).m137318a(C26705d.m137293a(context, AbstractC2814h.t_small));
        c21740h3.m111963K1(AbstractC19694b.m103335c(context, AbstractC2808b.color_subtitle_list_item));
        c21740h3.m89106L().m89028L(-2, -2).m89054h0(this.f86596d1).m89027K(true);
        c21740h3.mo44614b1(8);
        c21740h3.m111968P1(true);
        this.f86595c1 = c21740h3;
        c21737e16.m89001g1(this.f86596d1);
        c21737e16.m89001g1(this.f86595c1);
        C16977g c16977g2 = new C16977g(context);
        c16977g2.m89106L().m89028L(-2, -2).m89027K(true).m89034R(C27276c.m139649b(context, 8));
        c16977g2.mo44614b1(8);
        this.f86583Q0 = c16977g2;
        C16716d c16716d = new C16716d(context);
        c16716d.m89106L().m89028L(-2, -2).m89017A(bool).m89027K(true);
        c16716d.m89007n1(false);
        c16716d.m89001g1(this.f86583Q0);
        c21737e16.m89106L().m89049e0(c16716d);
        c21737e15.m89001g1(c16716d);
        c21737e15.m89001g1(c21737e16);
        this.f86588V0.m89001g1(this.f86598f1);
        this.f86588V0.m89001g1(c21737e10);
        this.f86588V0.m89001g1(this.f86599g1);
        this.f86588V0.m89001g1(c21737e15);
        C21737e c21737e18 = new C21737e(context);
        this.f86590X0 = c21737e18;
        c21737e18.m89106L().m89023G(this.f86588V0).m89028L(-2, -2);
        this.f86587U0.m89001g1(this.f86589W0);
        this.f86587U0.m89001g1(this.f86588V0);
        this.f86587U0.m89001g1(this.f86590X0);
        this.f86585S0.m89001g1(this.f86580N0);
        this.f86585S0.m89001g1(this.f86581O0);
        this.f86585S0.m89001g1(this.f86586T0);
        this.f86585S0.m89001g1(this.f86600h1);
        this.f86585S0.m89001g1(this.f86587U0);
        C21737e c21737e19 = new C21737e(context);
        c21737e19.m89106L().m89028L(-1, -2).m89023G(this.f86585S0);
        c21737e19.mo44614b1(8);
        this.f86592Z0 = c21737e19;
        C17075z c17075z = new C17075z(context);
        c17075z.m89106L().m89028L(-1, -2).m89023G(this.f86584R0);
        this.f86601i1 = c17075z;
        this.f86584R0.m89001g1(this.f86591Y0);
        this.f86584R0.m89001g1(this.f86585S0);
        this.f86584R0.m89001g1(this.f86592Z0);
        m89001g1(this.f86584R0);
        m89001g1(this.f86601i1);
        m89007n1(false);
        m90798u1();
        this.f86579M0 = new C25807a(new WeakReference(this));
    }

    /* renamed from: u1 */
    private final void m90798u1() {
        m89007n1(false);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        m89085A0(C27280g.m139658a(context, AbstractC2810d.bg_list_item));
        m90807I1(1);
        m90802D1(1);
        m90812N1(true);
        C16718f m89106L = m89106L();
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        m89106L.m89041Y(C27276c.m139649b(context2, 16));
        m90799A1(0, 0, 0, 0);
    }

    /* renamed from: A1 */
    public final void m90799A1(int i11, int i12, int i13, int i14) {
        this.f86601i1.m89106L().m89032P(i11 - getPaddingLeft(), i12, i13 - getPaddingRight(), i14);
        this.f86601i1.m89132a1(getPaddingBottom());
    }

    /* renamed from: B1 */
    public final void m90800B1(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86595c1.m111959G1(charSequence);
        C21740h c21740h = this.f86595c1;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c21740h.mo44614b1(i11);
    }

    /* renamed from: C1 */
    public final void m90801C1(int i11) {
        this.f86595c1.m111962J1(i11);
    }

    /* renamed from: D1 */
    public final void m90802D1(int i11) {
        this.f86595c1.m111980v1(TextUtils.TruncateAt.END);
        if (i11 <= 1) {
            this.f86595c1.m111957E1(true);
            this.f86595c1.m111953A1(1);
        } else {
            this.f86595c1.m111957E1(false);
            this.f86595c1.m111953A1(i11);
        }
    }

    /* renamed from: E1 */
    public final void m90803E1(C16719g c16719g) {
        if (c16719g == null) {
            this.f86596d1.mo44614b1(8);
        } else {
            this.f86596d1.mo44614b1(0);
            this.f86596d1.m89001g1(c16719g);
        }
    }

    /* renamed from: F1 */
    public final void m90804F1(boolean z11) {
        if (z11) {
            this.f86595c1.mo111965M1(1);
        } else {
            this.f86595c1.mo111965M1(0);
        }
    }

    /* renamed from: G1 */
    public final void m90805G1(CharSequence charSequence) {
        int i11;
        AbstractC19074t.m100208f(charSequence, "value");
        this.f86593a1.m111959G1(charSequence);
        C21740h c21740h = this.f86593a1;
        if (charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        c21740h.mo44614b1(i11);
    }

    @Override // ki0.C21737e, com.zing.zalo.uidrawing.C16719g
    /* renamed from: H0 */
    public void mo89099H0(boolean z11) {
        float f11;
        super.mo89099H0(z11);
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.7f;
        }
        mo89158x0(f11);
        C21740h c21740h = this.f86595c1;
        if (c21740h == null) {
            return;
        }
        if (z11) {
            AbstractC2816j.a aVar = AbstractC2816j.Companion;
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            c21740h.m111962J1(aVar.m13592a(context, AbstractC2807a.list_item_subtitle));
            return;
        }
        AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        c21740h.m111962J1(aVar2.m13592a(context2, AbstractC2807a.list_item_subtitle_disable));
    }

    /* renamed from: H1 */
    public final void m90806H1(int i11) {
        this.f86593a1.m111962J1(i11);
    }

    /* renamed from: I1 */
    public final void m90807I1(int i11) {
        this.f86593a1.m111980v1(TextUtils.TruncateAt.END);
        if (i11 <= 1) {
            this.f86593a1.m111957E1(true);
            this.f86593a1.m111953A1(1);
        } else {
            this.f86593a1.m111957E1(false);
            this.f86593a1.m111953A1(i11);
        }
    }

    /* renamed from: J1 */
    public final void m90808J1(C16719g c16719g) {
        if (c16719g == null) {
            this.f86594b1.mo44614b1(8);
        } else {
            this.f86594b1.mo44614b1(0);
            this.f86594b1.m89001g1(c16719g);
        }
    }

    /* renamed from: K1 */
    public final void m90809K1(boolean z11) {
        if (z11) {
            this.f86593a1.mo111965M1(1);
        } else {
            this.f86593a1.mo111965M1(0);
        }
    }

    /* renamed from: L1 */
    public final void m90810L1(EnumC16952b0 enumC16952b0) {
        AbstractC19074t.m100208f(enumC16952b0, "gravity");
        int i11 = a.f86603a[enumC16952b0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f86600h1.m89106L().m89072y(Boolean.TRUE);
                    return;
                }
                return;
            }
            this.f86600h1.m89106L().m89027K(true);
            return;
        }
        this.f86600h1.m89106L().m89018B(Boolean.TRUE);
    }

    @Override // com.zing.zalo.uidrawing.C16719g
    /* renamed from: M0 */
    public void mo89109M0(C16719g.c cVar) {
        C25807a c25807a = this.f86579M0;
        if (c25807a == null || !c25807a.m133070c(cVar)) {
            super.mo89109M0(cVar);
        }
    }

    /* renamed from: M1 */
    public final void m90811M1(int i11) {
        if (i11 != 0 && i11 != 4 && i11 != 8) {
            return;
        }
        this.f86600h1.mo44614b1(i11);
    }

    /* renamed from: N1 */
    public final void m90812N1(boolean z11) {
        if (z11) {
            this.f86601i1.mo44614b1(0);
        } else {
            this.f86601i1.mo44614b1(8);
        }
    }

    /* renamed from: o1 */
    public final void m90813o1(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "bottomItem");
        this.f86590X0.mo44614b1(0);
        this.f86590X0.m89003j1();
        this.f86590X0.m89001g1(c16719g);
    }

    /* renamed from: p1 */
    public final void m90814p1(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "leadingItem");
        this.f86586T0.mo44614b1(0);
        this.f86586T0.m89003j1();
        this.f86586T0.m89001g1(c16719g);
    }

    /* renamed from: q1 */
    public final void m90815q1(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "topItem");
        this.f86589W0.mo44614b1(0);
        this.f86589W0.m89003j1();
        this.f86589W0.m89001g1(c16719g);
    }

    /* renamed from: r1 */
    public final void m90816r1(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "trailingItem");
        this.f86600h1.mo44614b1(0);
        this.f86600h1.m89003j1();
        this.f86600h1.m89001g1(c16719g);
    }

    /* renamed from: s1 */
    public final void m90817s1(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "item");
        this.f86598f1.mo44614b1(0);
        this.f86598f1.m89003j1();
        this.f86598f1.m89001g1(c16719g);
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setIdTracking(String str) {
        AbstractC19074t.m100208f(str, "id");
        C25807a c25807a = this.f86579M0;
        if (c25807a != null) {
            c25807a.m133069b(str);
        }
    }

    @Override // com.zing.zalo.zdesign.component.InterfaceC16976f1
    public void setTrackingExtraData(C0708i c0708i) {
        C25807a c25807a = this.f86579M0;
        if (c25807a != null) {
            c25807a.m133071d(c0708i);
        }
    }

    /* renamed from: t1 */
    public final void m90818t1(C16719g c16719g) {
        AbstractC19074t.m100208f(c16719g, "item");
        this.f86599g1.mo44614b1(0);
        this.f86599g1.m89003j1();
        this.f86599g1.m89001g1(c16719g);
    }

    /* renamed from: v1 */
    public final C16977g m90819v1() {
        return this.f86582P0;
    }

    /* renamed from: w1 */
    public final C17073y m90820w1() {
        return this.f86580N0;
    }

    /* renamed from: x1 */
    public final C17075z m90821x1() {
        return this.f86601i1;
    }

    /* renamed from: y1 */
    public final C16719g m90822y1() {
        if (this.f86600h1.getModules().size() > 0) {
            return this.f86600h1.m89004k1(0);
        }
        return null;
    }

    /* renamed from: z1 */
    public final void m90823z1(EnumC16952b0 enumC16952b0) {
        AbstractC19074t.m100208f(enumC16952b0, "gravity");
        int i11 = a.f86603a[enumC16952b0.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    this.f86586T0.m89106L().m89072y(Boolean.TRUE);
                    return;
                }
                return;
            }
            this.f86586T0.m89106L().m89027K(true);
            return;
        }
        this.f86586T0.m89106L().m89018B(Boolean.TRUE);
    }
}
