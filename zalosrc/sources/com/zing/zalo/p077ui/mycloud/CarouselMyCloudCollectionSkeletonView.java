package com.zing.zalo.p077ui.mycloud;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2808b;
import com.zing.zalo.p077ui.mycloud.CarouselMyCloudCollectionSkeletonView;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;

/* loaded from: classes6.dex */
public final class CarouselMyCloudCollectionSkeletonView extends LinearLayout {

    /* renamed from: A */
    private final int f65234A;

    /* renamed from: B */
    private final int f65235B;

    /* renamed from: C */
    private final int f65236C;

    /* renamed from: D */
    private final int f65237D;

    /* renamed from: E */
    private ModulesView f65238E;

    /* renamed from: F */
    private ArrayList f65239F;

    /* renamed from: G */
    private C16658t0 f65240G;

    /* renamed from: H */
    private final int[] f65241H;

    /* renamed from: I */
    private final RectF f65242I;

    /* renamed from: J */
    private final Matrix f65243J;

    /* renamed from: K */
    private final C16658t0.b f65244K;

    /* renamed from: p */
    private final int f65245p;

    /* renamed from: q */
    private final int f65246q;

    /* renamed from: r */
    private final int f65247r;

    /* renamed from: s */
    private final int f65248s;

    /* renamed from: t */
    private final int f65249t;

    /* renamed from: u */
    private final int f65250u;

    /* renamed from: v */
    private final int f65251v;

    /* renamed from: w */
    private final int f65252w;

    /* renamed from: x */
    private final int f65253x;

    /* renamed from: y */
    private final int f65254y;

    /* renamed from: z */
    private final int f65255z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CarouselMyCloudCollectionSkeletonView(Context context) {
        super(context);
        int i11;
        AbstractC19074t.m100208f(context, "context");
        this.f65245p = 100;
        if (C23212s8.m119603k()) {
            i11 = AbstractC2808b.ng20;
        } else {
            i11 = AbstractC2808b.ng90;
        }
        this.f65246q = AbstractC23136l9.m118641B(context, i11);
        this.f65247r = C23212s8.m119607o(context, AbstractC2807a.ui_background);
        this.f65248s = AbstractC23222t7.f112591v0;
        this.f65249t = AbstractC23222t7.f112579p0;
        this.f65250u = AbstractC23222t7.f112549a0;
        int i12 = AbstractC23222t7.f112576o;
        this.f65251v = i12;
        this.f65252w = i12;
        this.f65253x = AbstractC23222t7.f112586t;
        this.f65254y = AbstractC23222t7.f112576o;
        int i13 = AbstractC23222t7.f112566j;
        this.f65255z = i13;
        this.f65234A = i13;
        this.f65235B = AbstractC23222t7.f112549a0;
        this.f65236C = AbstractC23222t7.f112566j;
        this.f65237D = AbstractC23222t7.f112556e;
        this.f65239F = new ArrayList();
        this.f65241H = new int[2];
        this.f65242I = new RectF();
        this.f65243J = new Matrix();
        this.f65244K = new C16658t0.b() { // from class: u80.a
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                CarouselMyCloudCollectionSkeletonView.m69976e(CarouselMyCloudCollectionSkeletonView.this, c16658t0, rectF);
            }
        };
    }

    /* renamed from: b */
    private final void m69974b(Context context, C16719g c16719g) {
        int i11;
        int m118722k0 = ((int) ((AbstractC23136l9.m118722k0() * 1.0f) / this.f65248s)) + 1;
        C16666v0 c16666v0 = null;
        int i12 = 0;
        while (i12 < m118722k0) {
            if (c16666v0 == null) {
                i11 = this.f65253x;
            } else {
                i11 = this.f65234A;
            }
            C16666v0 c16666v02 = new C16666v0(context);
            c16666v02.m89106L().m89060k0(this.f65248s).m89030N(this.f65235B).m89023G(c16719g).m89054h0(c16666v0).m89032P(i11, this.f65254y, 0, this.f65255z);
            c16666v02.m88807h1(this.f65236C);
            c16666v02.m88811l1(this.f65246q);
            C16666v0 c16666v03 = new C16666v0(context);
            c16666v03.m89106L().m89060k0(this.f65249t).m89030N(this.f65251v).m89023G(c16719g).m89054h0(c16666v0).m89032P(this.f65252w + i11, this.f65254y + AbstractC23222t7.f112582r, 0, 0);
            c16666v03.m88807h1(this.f65237D);
            c16666v03.m88811l1(this.f65247r);
            C16666v0 c16666v04 = new C16666v0(context);
            c16666v04.m89106L().m89060k0(this.f65250u).m89030N(this.f65251v).m89023G(c16666v03).m89054h0(c16666v0).m89032P(i11 + this.f65252w, AbstractC23222t7.f112566j, 0, 0);
            c16666v04.m88807h1(this.f65237D);
            c16666v04.m88811l1(this.f65247r);
            this.f65239F.add(c16666v02);
            ModulesView modulesView = this.f65238E;
            if (modulesView != null) {
                modulesView.mo69681L(c16666v02);
            }
            this.f65239F.add(c16666v03);
            ModulesView modulesView2 = this.f65238E;
            if (modulesView2 != null) {
                modulesView2.mo69681L(c16666v03);
            }
            this.f65239F.add(c16666v04);
            ModulesView modulesView3 = this.f65238E;
            if (modulesView3 != null) {
                modulesView3.mo69681L(c16666v04);
            }
            i12++;
            c16666v0 = c16666v02;
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m69975c(CarouselMyCloudCollectionSkeletonView carouselMyCloudCollectionSkeletonView, Context context, C16719g c16719g, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            c16719g = null;
        }
        carouselMyCloudCollectionSkeletonView.m69974b(context, c16719g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m69976e(CarouselMyCloudCollectionSkeletonView carouselMyCloudCollectionSkeletonView, C16658t0 c16658t0, RectF rectF) {
        Paint paint;
        AbstractC19074t.m100208f(carouselMyCloudCollectionSkeletonView, "this$0");
        try {
            carouselMyCloudCollectionSkeletonView.getLocationOnScreen(carouselMyCloudCollectionSkeletonView.f65241H);
            carouselMyCloudCollectionSkeletonView.f65242I.setEmpty();
            carouselMyCloudCollectionSkeletonView.f65243J.reset();
            Matrix matrix = carouselMyCloudCollectionSkeletonView.f65243J;
            int[] iArr = carouselMyCloudCollectionSkeletonView.f65241H;
            matrix.setTranslate(-iArr[0], -iArr[1]);
            carouselMyCloudCollectionSkeletonView.f65243J.mapRect(carouselMyCloudCollectionSkeletonView.f65242I, rectF);
            Iterator it = carouselMyCloudCollectionSkeletonView.f65239F.iterator();
            while (it.hasNext()) {
                C16666v0 c16666v0 = (C16666v0) it.next();
                RectF rectF2 = carouselMyCloudCollectionSkeletonView.f65242I;
                C16658t0 c16658t02 = carouselMyCloudCollectionSkeletonView.f65240G;
                if (c16658t02 != null) {
                    paint = c16658t02.m88776b();
                } else {
                    paint = null;
                }
                c16666v0.m88810k1(rectF2, paint);
            }
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: d */
    public final void m69977d() {
        setOrientation(0);
        if (this.f65238E == null) {
            this.f65238E = new ModulesView(getContext());
            addView(this.f65238E, new LinearLayout.LayoutParams(-2, -2));
        }
        ModulesView modulesView = this.f65238E;
        if (modulesView != null) {
            modulesView.mo44090O();
        }
        this.f65239F.clear();
        m69975c(this, getContext(), null, 2, null);
        requestLayout();
        if (this.f65240G == null) {
            C16658t0 c16658t0 = new C16658t0(getContext());
            Rect rect = new Rect();
            rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
            c16658t0.m88778d(rect);
            c16658t0.m88782h(this.f65244K);
            c16658t0.m88779e(this.f65245p);
            this.f65240G = c16658t0;
        }
        C16658t0 c16658t02 = this.f65240G;
        if (c16658t02 != null) {
            c16658t02.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16658t0 c16658t0 = this.f65240G;
        if (c16658t0 != null) {
            c16658t0.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16658t0 c16658t0 = this.f65240G;
        if (c16658t0 != null) {
            c16658t0.m88785k();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 != 0) {
            C16658t0 c16658t0 = this.f65240G;
            if (c16658t0 != null) {
                c16658t0.m88785k();
                return;
            }
            return;
        }
        C16658t0 c16658t02 = this.f65240G;
        if (c16658t02 != null) {
            c16658t02.mo88784j();
        }
    }
}
