package com.zing.zalo.p077ui.zviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import ho0.AbstractC20110a;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* loaded from: classes6.dex */
public class TimelineSkeletonView extends LinearLayout {

    /* renamed from: A */
    final int f78307A;

    /* renamed from: B */
    final int f78308B;

    /* renamed from: C */
    final int f78309C;

    /* renamed from: D */
    final int f78310D;

    /* renamed from: E */
    final int f78311E;

    /* renamed from: F */
    final int f78312F;

    /* renamed from: G */
    final int f78313G;

    /* renamed from: H */
    final int f78314H;

    /* renamed from: I */
    final int f78315I;

    /* renamed from: J */
    final int f78316J;

    /* renamed from: K */
    final int f78317K;

    /* renamed from: L */
    final int f78318L;

    /* renamed from: M */
    final int f78319M;

    /* renamed from: N */
    final int f78320N;

    /* renamed from: O */
    final int f78321O;

    /* renamed from: P */
    final int f78322P;

    /* renamed from: Q */
    final int f78323Q;

    /* renamed from: R */
    final int f78324R;

    /* renamed from: S */
    final int f78325S;

    /* renamed from: T */
    final int f78326T;

    /* renamed from: U */
    final int f78327U;

    /* renamed from: V */
    final int f78328V;

    /* renamed from: W */
    final int f78329W;

    /* renamed from: a0 */
    final int f78330a0;

    /* renamed from: b0 */
    final int f78331b0;

    /* renamed from: c0 */
    final int f78332c0;

    /* renamed from: d0 */
    final int f78333d0;

    /* renamed from: e0 */
    final int f78334e0;

    /* renamed from: f0 */
    private int f78335f0;

    /* renamed from: g0 */
    final int f78336g0;

    /* renamed from: h0 */
    final int[] f78337h0;

    /* renamed from: i0 */
    final int[] f78338i0;

    /* renamed from: j0 */
    final int[] f78339j0;

    /* renamed from: k0 */
    final int[][] f78340k0;

    /* renamed from: l0 */
    C16658t0 f78341l0;

    /* renamed from: m0 */
    int[] f78342m0;

    /* renamed from: n0 */
    RectF f78343n0;

    /* renamed from: o0 */
    Matrix f78344o0;

    /* renamed from: p */
    int f78345p;

    /* renamed from: p0 */
    C16658t0.b f78346p0;

    /* renamed from: q */
    ModulesView f78347q;

    /* renamed from: r */
    List f78348r;

    /* renamed from: s */
    final int f78349s;

    /* renamed from: t */
    final int f78350t;

    /* renamed from: u */
    final int f78351u;

    /* renamed from: v */
    final int f78352v;

    /* renamed from: w */
    final int f78353w;

    /* renamed from: x */
    final int f78354x;

    /* renamed from: y */
    final int f78355y;

    /* renamed from: z */
    final int f78356z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.TimelineSkeletonView$a */
    /* loaded from: classes6.dex */
    public class ViewTreeObserverOnPreDrawListenerC15181a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC15181a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            TimelineSkeletonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            TimelineSkeletonView timelineSkeletonView = TimelineSkeletonView.this;
            timelineSkeletonView.getLocationOnScreen(timelineSkeletonView.f78342m0);
            int i11 = TimelineSkeletonView.this.f78342m0[1];
            int m118713h0 = AbstractC23136l9.m118713h0();
            Iterator it = TimelineSkeletonView.this.f78348r.iterator();
            while (true) {
                int i12 = 0;
                if (!it.hasNext()) {
                    return false;
                }
                C16666v0 c16666v0 = (C16666v0) it.next();
                int min = Math.min(255, ((int) ((1.0f - (((c16666v0.m89098H() + i11) * 1.0f) / m118713h0)) * 255.0f)) + 100);
                if (min >= 0) {
                    i12 = min;
                }
                c16666v0.m88811l1(Color.argb(i12, Color.red(TimelineSkeletonView.this.f78336g0), Color.green(TimelineSkeletonView.this.f78336g0), Color.blue(TimelineSkeletonView.this.f78336g0)));
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.TimelineSkeletonView$b */
    /* loaded from: classes6.dex */
    class C15182b implements C16658t0.b {
        C15182b() {
        }

        @Override // com.zing.zalo.uicontrol.C16658t0.b
        /* renamed from: a */
        public void mo44637a(C16658t0 c16658t0, RectF rectF) {
            C16658t0 c16658t02;
            try {
                TimelineSkeletonView timelineSkeletonView = TimelineSkeletonView.this;
                timelineSkeletonView.getLocationOnScreen(timelineSkeletonView.f78342m0);
                TimelineSkeletonView.this.f78343n0.setEmpty();
                TimelineSkeletonView.this.f78344o0.reset();
                TimelineSkeletonView timelineSkeletonView2 = TimelineSkeletonView.this;
                Matrix matrix = timelineSkeletonView2.f78344o0;
                int[] iArr = timelineSkeletonView2.f78342m0;
                matrix.setTranslate(-iArr[0], -iArr[1]);
                TimelineSkeletonView timelineSkeletonView3 = TimelineSkeletonView.this;
                timelineSkeletonView3.f78344o0.mapRect(timelineSkeletonView3.f78343n0, rectF);
                for (C16666v0 c16666v0 : TimelineSkeletonView.this.f78348r) {
                    TimelineSkeletonView timelineSkeletonView4 = TimelineSkeletonView.this;
                    c16666v0.m88810k1(timelineSkeletonView4.f78343n0, timelineSkeletonView4.f78341l0.m88776b());
                }
                if (!AbstractC20826v0.m108836t0(TimelineSkeletonView.this) && (c16658t02 = TimelineSkeletonView.this.f78341l0) != null) {
                    c16658t02.m88785k();
                }
            } catch (Exception e11) {
                AbstractC20110a.m104539h(e11);
            }
        }
    }

    public TimelineSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f78345p = 0;
        this.f78348r = new ArrayList();
        this.f78349s = AbstractC32232i.m155453a(8.0f);
        this.f78350t = AbstractC32232i.m155453a(10.0f);
        this.f78351u = AbstractC32232i.m155453a(12.0f);
        this.f78352v = AbstractC32232i.m155453a(10.0f);
        this.f78353w = AbstractC32232i.m155453a(8.0f);
        this.f78354x = AbstractC32232i.m155453a(100.0f);
        this.f78355y = AbstractC32232i.m155453a(150.0f);
        this.f78356z = AbstractC32232i.m155453a(40.0f);
        this.f78307A = AbstractC32232i.m155453a(4.0f);
        this.f78308B = AbstractC32232i.m155453a(70.0f);
        this.f78309C = AbstractC32232i.m155453a(8.0f);
        this.f78310D = AbstractC32232i.m155453a(2.0f);
        this.f78311E = AbstractC32232i.m155453a(40.0f);
        this.f78312F = AbstractC32232i.m155453a(40.0f);
        this.f78313G = AbstractC32232i.m155453a(17.0f);
        this.f78314H = AbstractC32232i.m155453a(17.0f);
        this.f78315I = AbstractC32232i.m155453a(12.0f);
        this.f78316J = AbstractC32232i.m155453a(180.0f);
        this.f78317K = AbstractC32232i.m155453a(40.0f);
        this.f78318L = AbstractC32232i.m155453a(60.0f);
        this.f78319M = AbstractC32232i.m155453a(178.0f);
        this.f78320N = AbstractC32232i.m155453a(30.0f);
        this.f78321O = AbstractC32232i.m155453a(30.0f);
        this.f78322P = AbstractC32232i.m155453a(12.0f);
        this.f78323Q = AbstractC32232i.m155453a(12.0f);
        this.f78324R = AbstractC32232i.m155453a(10.0f);
        this.f78325S = AbstractC32232i.m155453a(18.0f);
        this.f78326T = AbstractC32232i.m155453a(3.0f);
        this.f78327U = AbstractC32232i.m155453a(50.0f);
        this.f78328V = AbstractC32232i.m155453a(3.0f);
        this.f78329W = AbstractC32232i.m155453a(80.0f);
        this.f78330a0 = AbstractC32232i.m155453a(12.0f);
        this.f78331b0 = AbstractC32232i.m155453a(70.0f);
        this.f78332c0 = AbstractC32232i.m155453a(270.0f);
        this.f78333d0 = AbstractC32232i.m155453a(320.0f);
        this.f78334e0 = AbstractC32232i.m155453a(180.0f);
        this.f78335f0 = 0;
        int[] iArr = {AbstractC23136l9.m118742r(98.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(243.0f), AbstractC23136l9.m118742r(32.0f), AbstractC23136l9.m118742r(134.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(172.0f), AbstractC23136l9.m118742r(48.0f)};
        this.f78337h0 = iArr;
        int[] iArr2 = {AbstractC23136l9.m118742r(110.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(154.0f), AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(64.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(239.0f), AbstractC23136l9.m118742r(32.0f)};
        this.f78338i0 = iArr2;
        int[] iArr3 = {AbstractC23136l9.m118742r(123.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(219.0f), AbstractC23136l9.m118742r(48.0f), AbstractC23136l9.m118742r(76.0f), AbstractC23136l9.m118742r(16.0f), AbstractC23136l9.m118742r(172.0f), AbstractC23136l9.m118742r(48.0f)};
        this.f78339j0 = iArr3;
        this.f78340k0 = new int[][]{iArr, iArr2, iArr3};
        this.f78342m0 = new int[2];
        this.f78343n0 = new RectF();
        this.f78344o0 = new Matrix();
        this.f78346p0 = new C15182b();
        this.f78336g0 = C23212s8.m119607o(context, AbstractC16781w.ImagePlaceHolderColor);
    }

    /* renamed from: b */
    private C16666v0 m85145b(Context context, C16666v0 c16666v0) {
        int i11;
        C16666v0 c16666v02 = new C16666v0(context);
        C16718f m89023G = c16666v02.m89106L().m89060k0(this.f78311E).m89030N(this.f78312F).m89023G(c16666v0);
        int i12 = this.f78313G;
        int i13 = this.f78315I;
        m89023G.m89032P(i12, i13, this.f78314H, i13);
        c16666v02.m88807h1(this.f78311E / 2);
        this.f78348r.add(c16666v02);
        this.f78347q.mo69681L(c16666v02);
        C16666v0 c16666v03 = new C16666v0(context);
        c16666v03.m89106L().m89060k0(this.f78316J).m89030N(this.f78349s).m89054h0(c16666v02).m89020D(c16666v02).m89032P(0, (this.f78312F - this.f78349s) / 2, 0, 0);
        int i14 = this.f78310D;
        c16666v03.m88808i1(i14, i14, i14, i14);
        this.f78348r.add(c16666v03);
        this.f78347q.mo69681L(c16666v03);
        C16666v0 c16666v04 = new C16666v0(context);
        c16666v04.m88811l1(this.f78336g0);
        c16666v04.m89106L().m89060k0(-1).m89030N(this.f78317K).m89023G(c16666v02).m89032P(0, 0, 0, 0);
        c16666v04.m88807h1(0.0f);
        this.f78347q.mo69681L(c16666v04);
        int m118742r = AbstractC23136l9.m118742r(1.0f);
        int m118722k0 = (AbstractC23136l9.m118722k0() - (m118742r * 2)) / 3;
        C16666v0 c16666v05 = null;
        int i15 = 0;
        while (i15 < 3) {
            C16666v0 c16666v06 = new C16666v0(context);
            c16666v06.m88811l1(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
            C16718f m89054h0 = c16666v06.m89106L().m89060k0(m118722k0).m89030N(-1).m89020D(c16666v04).m89067t(c16666v04).m89054h0(c16666v05);
            if (c16666v05 != null) {
                i11 = m118742r;
            } else {
                i11 = 0;
            }
            m89054h0.m89032P(i11, m118742r, 0, 0);
            c16666v06.m88807h1(0.0f);
            this.f78347q.mo69681L(c16666v06);
            C16666v0 c16666v07 = new C16666v0(context);
            c16666v07.m89106L().m89060k0(this.f78318L).m89030N(this.f78349s).m89069v(c16666v06).m89070w(c16666v06);
            int i16 = this.f78310D;
            c16666v07.m88808i1(i16, i16, i16, i16);
            this.f78348r.add(c16666v07);
            this.f78347q.mo69681L(c16666v07);
            i15++;
            c16666v05 = c16666v06;
        }
        return c16666v04;
    }

    /* renamed from: a */
    public void m85146a(int i11) {
        if (this.f78345p == 4 && this.f78335f0 == i11) {
            return;
        }
        this.f78345p = 4;
        this.f78335f0 = i11;
        m85148d();
    }

    /* renamed from: c */
    C16666v0 m85147c(Context context, C16719g c16719g) {
        int i11;
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f78354x)) + 1;
        int m118742r = AbstractC23136l9.m118742r(1.0f);
        C16666v0 c16666v0 = null;
        int i12 = 0;
        while (i12 < m118722k0) {
            if (c16666v0 == null) {
                i11 = this.f78350t;
            } else {
                i11 = this.f78353w;
            }
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89060k0(this.f78354x).m89030N(this.f78355y).m89023G(c16719g).m89054h0(c16666v0).m89032P(i11, this.f78351u, 0, this.f78352v);
            c16666v02.m88807h1(this.f78307A);
            this.f78348r.add(c16666v02);
            this.f78347q.mo69681L(c16666v02);
            C16666v0 c16666v03 = new C16666v0(context);
            c16666v03.m88811l1(0);
            c16666v03.m89106L().m89060k0(-1).m89030N(this.f78356z).m89071x(c16666v02).m89019C(c16666v02).m89067t(c16666v02).m89032P(m118742r, 0, m118742r, m118742r);
            int i13 = this.f78307A;
            c16666v03.m88808i1(0.0f, 0.0f, i13, i13);
            this.f78347q.mo69681L(c16666v03);
            C16666v0 c16666v04 = new C16666v0(context);
            c16666v04.m89106L().m89060k0(this.f78308B).m89030N(this.f78349s).m89069v(c16666v03).m89070w(c16666v03);
            int i14 = this.f78310D;
            c16666v04.m88808i1(i14, i14, i14, i14);
            this.f78348r.add(c16666v04);
            this.f78347q.mo69681L(c16666v04);
            int i15 = -AbstractC23136l9.m118742r(10.0f);
            C16666v0 c16666v05 = new C16666v0(context);
            c16666v05.m88811l1(0);
            c16666v05.m89106L().m89060k0(this.f78311E).m89030N(this.f78312F).m89069v(c16666v03).m89066s(c16666v03).m89032P(0, 0, 0, i15);
            c16666v05.m88807h1(this.f78311E / 2);
            this.f78347q.mo69681L(c16666v05);
            int m118742r2 = AbstractC23136l9.m118742r(6.0f);
            int i16 = this.f78311E - m118742r2;
            C16666v0 c16666v06 = new C16666v0(context);
            c16666v06.m89106L().m89060k0(i16).m89030N(i16).m89069v(c16666v03).m89066s(c16666v03).m89032P(0, 0, 0, i15 + (m118742r2 / 2));
            c16666v06.m88807h1(i16 / 2);
            this.f78348r.add(c16666v06);
            this.f78347q.mo69681L(c16666v06);
            i12++;
            c16666v0 = c16666v02;
        }
        C16666v0 c16666v07 = new C16666v0(context);
        c16666v07.m88811l1(this.f78336g0);
        c16666v07.m89106L().m89060k0(-1).m89030N(this.f78349s).m89023G(c16666v0).m89032P(0, 0, 0, 0);
        c16666v07.m88807h1(0.0f);
        this.f78347q.mo69681L(c16666v07);
        return c16666v07;
    }

    /* renamed from: d */
    void m85148d() {
        setOrientation(1);
        if (this.f78347q == null) {
            this.f78347q = new ModulesView(getContext());
            addView(this.f78347q, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f78347q.mo44090O();
        this.f78348r.clear();
        int i11 = this.f78345p;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        m85152h();
                    }
                } else {
                    m85150f();
                }
            } else {
                m85149e();
            }
        } else {
            m85151g();
        }
        requestLayout();
        if (this.f78341l0 == null) {
            this.f78341l0 = new C16658t0(getContext());
            Rect rect = new Rect();
            rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
            this.f78341l0.m88778d(rect);
            this.f78341l0.m88782h(this.f78346p0);
            this.f78341l0.m88779e(100);
        }
        this.f78341l0.mo88784j();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC15181a());
    }

    /* renamed from: e */
    void m85149e() {
        try {
            Context context = getContext();
            int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.avt_S);
            int m118742r = AbstractC23136l9.m118742r(12.0f);
            int i11 = AbstractC23222t7.f112586t;
            C16666v0 c16666v0 = new C16666v0(context);
            C16718f m89028L = c16666v0.m89106L().m89028L(AbstractC23136l9.m118742r(84.0f), AbstractC23136l9.m118742r(16.0f));
            Boolean bool = Boolean.TRUE;
            m89028L.m89018B(bool).m89073z(bool).m89032P(AbstractC23136l9.m118742r(12.0f), AbstractC23136l9.m118742r(16.0f), 0, AbstractC23136l9.m118742r(16.0f));
            float f11 = m118742r;
            c16666v0.m88807h1(f11);
            this.f78348r.add(c16666v0);
            this.f78347q.mo69681L(c16666v0);
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89028L(AbstractC23136l9.m118742r(116.0f), AbstractC23136l9.m118742r(16.0f)).m89020D(c16666v0).m89017A(bool).m89032P(0, 0, AbstractC23136l9.m118742r(12.0f), 0);
            c16666v02.m88807h1(f11);
            this.f78348r.add(c16666v02);
            this.f78347q.mo69681L(c16666v02);
            C16666v0 c16666v03 = new C16666v0(context);
            c16666v03.m89106L().m89028L(-1, AbstractC23136l9.m118742r(1.0f)).m89023G(c16666v0);
            c16666v03.m88807h1(0.0f);
            this.f78348r.add(c16666v03);
            this.f78347q.mo69681L(c16666v03);
            int[] iArr = this.f78340k0[(int) (Math.random() * 3.0d)];
            C16666v0 c16666v04 = new C16666v0(context);
            C16718f m89023G = c16666v04.m89106L().m89028L(m118655I, m118655I).m89023G(c16666v03);
            int i12 = AbstractC23222t7.f112576o;
            m89023G.m89032P(i12, i11, i12, 0);
            float f12 = m118655I / 2.0f;
            c16666v04.m88807h1(f12);
            this.f78348r.add(c16666v04);
            this.f78347q.mo69681L(c16666v04);
            C16666v0 c16666v05 = new C16666v0(context);
            c16666v05.m89106L().m89028L(iArr[0], iArr[1]).m89020D(c16666v04).m89054h0(c16666v04);
            c16666v05.m88807h1(f11);
            this.f78348r.add(c16666v05);
            this.f78347q.mo69681L(c16666v05);
            C16666v0 c16666v06 = new C16666v0(context);
            c16666v06.m89106L().m89028L(iArr[2], iArr[3]).m89071x(c16666v05).m89023G(c16666v05).m89036T(AbstractC23136l9.m118742r(8.0f));
            c16666v06.m88807h1(f11);
            this.f78348r.add(c16666v06);
            this.f78347q.mo69681L(c16666v06);
            C16666v0 c16666v07 = new C16666v0(context);
            C16718f m89023G2 = c16666v07.m89106L().m89028L(m118655I, m118655I).m89023G(c16666v06);
            int i13 = AbstractC23222t7.f112576o;
            m89023G2.m89032P(i13, i11, i13, 0);
            c16666v07.m88807h1(f12);
            this.f78348r.add(c16666v07);
            this.f78347q.mo69681L(c16666v07);
            C16666v0 c16666v08 = new C16666v0(context);
            c16666v08.m89106L().m89028L(iArr[4], iArr[5]).m89020D(c16666v07).m89054h0(c16666v07);
            c16666v08.m88807h1(f11);
            this.f78348r.add(c16666v08);
            this.f78347q.mo69681L(c16666v08);
            C16666v0 c16666v09 = new C16666v0(context);
            c16666v09.m89106L().m89028L(iArr[6], iArr[7]).m89071x(c16666v08).m89023G(c16666v08).m89036T(AbstractC23136l9.m118742r(8.0f));
            c16666v09.m88807h1(f11);
            this.f78348r.add(c16666v09);
            this.f78347q.mo69681L(c16666v09);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: f */
    void m85150f() {
        try {
            Context context = getContext();
            int m118655I = AbstractC23136l9.m118655I(AbstractC16802y.story_archive_card_spacing);
            int m118722k0 = (int) (((AbstractC23136l9.m118722k0() - (m118655I * 2)) * 1.0f) / 3);
            int m118655I2 = AbstractC23136l9.m118655I(AbstractC16802y.story_archive_card_height);
            C16666v0 c16666v0 = null;
            int i11 = 0;
            while (i11 < 9) {
                C16666v0 c16666v02 = new C16666v0(context);
                c16666v02.m89106L().m89028L(m118722k0, m118655I2);
                c16666v02.m88807h1(0.0f);
                if (c16666v0 == null) {
                    C16718f m89106L = c16666v02.m89106L();
                    Boolean bool = Boolean.TRUE;
                    m89106L.m89073z(bool).m89018B(bool);
                } else if (i11 % 3 == 0) {
                    c16666v02.m89106L().m89073z(Boolean.TRUE).m89023G(c16666v0).m89036T(m118655I);
                } else {
                    c16666v02.m89106L().m89054h0(c16666v0).m89020D(c16666v0).m89034R(m118655I);
                }
                this.f78348r.add(c16666v02);
                this.f78347q.mo69681L(c16666v02);
                i11++;
                c16666v0 = c16666v02;
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: g */
    void m85151g() {
        C16666v0 m85147c;
        boolean z11;
        int i11;
        try {
            Context context = getContext();
            if (AbstractC20826v0.m108753D() == 0) {
                m85147c = m85145b(context, m85147c(context, null));
            } else {
                m85147c = m85147c(context, m85145b(context, null));
            }
            int m118713h0 = ((int) ((AbstractC23136l9.m118713h0() * 1.0f) / this.f78319M)) - 1;
            for (int i12 = 0; i12 < m118713h0; i12++) {
                C16666v0 c16666v0 = new C16666v0(context);
                c16666v0.m89106L().m89060k0(this.f78320N).m89030N(this.f78321O).m89023G(m85147c).m89032P(this.f78322P, this.f78323Q, this.f78324R, this.f78325S);
                c16666v0.m88807h1(this.f78320N);
                this.f78348r.add(c16666v0);
                this.f78347q.mo69681L(c16666v0);
                C16666v0 c16666v02 = new C16666v0(context);
                c16666v02.m89106L().m89060k0(this.f78327U).m89030N(this.f78349s).m89054h0(c16666v0).m89020D(c16666v0).m89032P(0, this.f78326T, 0, 0);
                c16666v02.m88807h1(this.f78310D);
                this.f78348r.add(c16666v02);
                this.f78347q.mo69681L(c16666v02);
                C16666v0 c16666v03 = new C16666v0(context);
                c16666v03.m89106L().m89060k0(this.f78329W).m89030N(this.f78349s).m89054h0(c16666v0).m89067t(c16666v0).m89032P(0, 0, 0, this.f78328V);
                c16666v03.m88807h1(this.f78310D);
                this.f78348r.add(c16666v03);
                this.f78347q.mo69681L(c16666v03);
                ArrayList arrayList = new ArrayList(Arrays.asList(Integer.valueOf(this.f78332c0), Integer.valueOf(this.f78333d0), Integer.valueOf(this.f78334e0)));
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (i13 == arrayList.size() - 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    C16666v0 c16666v04 = new C16666v0(context);
                    C16718f m89071x = c16666v04.m89106L().m89060k0(((Integer) arrayList.get(i13)).intValue()).m89030N(this.f78349s).m89023G(c16666v0).m89071x(c16666v0);
                    if (z11) {
                        i11 = this.f78331b0;
                    } else {
                        i11 = this.f78330a0;
                    }
                    m89071x.m89032P(0, 0, 0, i11);
                    c16666v04.m88807h1(this.f78310D);
                    this.f78348r.add(c16666v04);
                    this.f78347q.mo69681L(c16666v04);
                    i13++;
                    c16666v0 = c16666v04;
                }
                m85147c = new C16666v0(context);
                m85147c.m89106L().m89060k0(-1).m89030N(this.f78349s).m89023G(c16666v0);
                m85147c.m88807h1(0.0f);
                this.f78348r.add(m85147c);
                this.f78347q.mo69681L(m85147c);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    void m85152h() {
        if (this.f78335f0 == 0) {
            return;
        }
        Context context = getContext();
        int m118742r = AbstractC23136l9.m118742r(8.0f);
        int i11 = this.f78335f0;
        int i12 = (i11 * 2) / 3;
        int m119606n = C23212s8.m119606n(AbstractC16781w.TimelineSectionVideoChannelSkeletonElementColor);
        C16716d c16716d = new C16716d(context);
        C16718f m89028L = c16716d.m89106L().m89028L(-1, -2);
        Boolean bool = Boolean.TRUE;
        m89028L.m89018B(bool).m89073z(bool);
        c16716d.mo89161z0(C23212s8.m119606n(AbstractC2807a.ui_background));
        C16666v0 c16666v0 = null;
        int i13 = 0;
        while (i13 < 4) {
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89028L(i12, i11);
            c16666v02.m88807h1(20.0f);
            c16666v02.m88811l1(m119606n);
            if (c16666v0 == null) {
                c16666v02.m89106L().m89073z(Boolean.TRUE).m89034R(AbstractC23136l9.m118742r(16.0f));
            } else {
                c16666v02.m89106L().m89054h0(c16666v0).m89020D(c16666v0).m89034R(m118742r);
            }
            this.f78348r.add(c16666v02);
            c16716d.m89001g1(c16666v02);
            i13++;
            c16666v0 = c16666v02;
        }
        this.f78347q.mo69681L(c16716d);
    }

    /* renamed from: i */
    public void m85153i() {
        C16658t0 c16658t0 = this.f78341l0;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    /* renamed from: j */
    public void m85154j() {
        C16658t0 c16658t0 = this.f78341l0;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16658t0 c16658t0 = this.f78341l0;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16658t0 c16658t0 = this.f78341l0;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    public void setSkeletonLayoutType(int i11) {
        if (this.f78345p != i11) {
            this.f78345p = i11;
            m85148d();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 != 0) {
            C16658t0 c16658t0 = this.f78341l0;
            if (c16658t0 != null) {
                c16658t0.m88785k();
                return;
            }
            return;
        }
        C16658t0 c16658t02 = this.f78341l0;
        if (c16658t02 != null) {
            c16658t02.mo88784j();
        }
    }
}
