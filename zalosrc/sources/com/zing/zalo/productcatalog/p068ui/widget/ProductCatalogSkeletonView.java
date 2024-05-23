package com.zing.zalo.productcatalog.p068ui.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import bi0.AbstractC2807a;
import bi0.AbstractC2809c;
import com.zing.zalo.MainApplication;
import com.zing.zalo.productcatalog.p068ui.widget.ProductCatalogSkeletonView;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16718f;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import zl0.AbstractC32232i;

/* loaded from: classes4.dex */
public final class ProductCatalogSkeletonView extends LinearLayout {
    public static final C9064a Companion = new C9064a(null);

    /* renamed from: A */
    private int[] f48545A;

    /* renamed from: B */
    private RectF f48546B;

    /* renamed from: C */
    private Matrix f48547C;

    /* renamed from: D */
    private C16658t0.b f48548D;

    /* renamed from: p */
    private int f48549p;

    /* renamed from: q */
    private ModulesView f48550q;

    /* renamed from: r */
    private List f48551r;

    /* renamed from: s */
    private final int f48552s;

    /* renamed from: t */
    private final int f48553t;

    /* renamed from: u */
    private final int f48554u;

    /* renamed from: v */
    private final int f48555v;

    /* renamed from: w */
    private final int f48556w;

    /* renamed from: x */
    private final int f48557x;

    /* renamed from: y */
    private final int f48558y;

    /* renamed from: z */
    private C16658t0 f48559z;

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.ProductCatalogSkeletonView$a */
    /* loaded from: classes4.dex */
    public static final class C9064a {
        private C9064a() {
        }

        public /* synthetic */ C9064a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.widget.ProductCatalogSkeletonView$b */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC9065b implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC9065b() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int min;
            ProductCatalogSkeletonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ProductCatalogSkeletonView productCatalogSkeletonView = ProductCatalogSkeletonView.this;
            productCatalogSkeletonView.getLocationOnScreen(productCatalogSkeletonView.f48545A);
            int i11 = ProductCatalogSkeletonView.this.f48545A[1];
            int m118713h0 = AbstractC23136l9.m118713h0();
            Iterator it = ProductCatalogSkeletonView.this.f48551r.iterator();
            while (true) {
                int i12 = 0;
                if (!it.hasNext()) {
                    return false;
                }
                C16666v0 c16666v0 = (C16666v0) it.next();
                int m88806g1 = c16666v0.m88806g1();
                int m89098H = c16666v0.m89098H() + i11;
                if (c16666v0.f84500H0 == 1) {
                    min = (int) Math.min(255.0f, 30 + (((m89098H * 255) * 1.0f) / m118713h0));
                } else {
                    min = Math.min(255, ((int) (255 * (1 - ((m89098H * 1.0f) / m118713h0)))) + 30);
                }
                if (min >= 0) {
                    i12 = min;
                }
                c16666v0.m88811l1(Color.argb(i12, Color.red(m88806g1), Color.green(m88806g1), Color.blue(m88806g1)));
            }
        }
    }

    public ProductCatalogSkeletonView(Context context) {
        super(context);
        this.f48551r = new ArrayList();
        MainApplication.C6895a c6895a = MainApplication.Companion;
        this.f48552s = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC2809c.f11267u4);
        this.f48553t = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC2809c.f11265u2);
        this.f48554u = AbstractC32232i.m155453a(80.0f);
        this.f48555v = AbstractC32232i.m155453a(48.0f);
        this.f48556w = AbstractC32232i.m155453a(12.0f);
        this.f48557x = AbstractC32232i.m155453a(128.0f);
        this.f48558y = AbstractC32232i.m155453a(12.0f);
        this.f48545A = new int[2];
        this.f48546B = new RectF();
        this.f48547C = new Matrix();
        this.f48548D = new C16658t0.b() { // from class: zx.k
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                ProductCatalogSkeletonView.m48551f(ProductCatalogSkeletonView.this, c16658t0, rectF);
            }
        };
    }

    /* renamed from: d */
    private final void m48549d() {
        setOrientation(1);
        if (this.f48550q == null) {
            this.f48550q = new ModulesView(getContext());
            addView(this.f48550q, new LinearLayout.LayoutParams(-1, -2));
        }
        ModulesView modulesView = this.f48550q;
        AbstractC19074t.m100205c(modulesView);
        modulesView.mo44090O();
        if (this.f48549p == 6) {
            m48550e();
        }
        requestLayout();
        if (this.f48559z == null) {
            C16658t0 c16658t0 = new C16658t0(getContext());
            Rect rect = new Rect();
            rect.set(0, 0, AbstractC23136l9.m118722k0(), AbstractC23136l9.m118713h0());
            c16658t0.m88778d(rect);
            c16658t0.m88782h(this.f48548D);
            this.f48559z = c16658t0;
        }
        C16658t0 c16658t02 = this.f48559z;
        AbstractC19074t.m100205c(c16658t02);
        c16658t02.mo88784j();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC9065b());
    }

    /* renamed from: e */
    private final void m48550e() {
        for (int i11 = 0; i11 < 10; i11++) {
            int i12 = this.f48554u;
            int i13 = i12 * i11;
            int i14 = (i12 - this.f48555v) / 2;
            int i15 = (i12 - ((this.f48556w + this.f48553t) + this.f48558y)) / 2;
            C16666v0 c16666v0 = new C16666v0(getContext());
            C16718f m89073z = c16666v0.m89106L().m89060k0(this.f48555v).m89030N(this.f48555v).m89073z(Boolean.TRUE);
            int i16 = this.f48552s;
            m89073z.m89032P(i16, i14 + i13, i16, 0);
            c16666v0.m88807h1(AbstractC23222t7.f112562h);
            this.f48551r.add(c16666v0);
            ModulesView modulesView = this.f48550q;
            AbstractC19074t.m100205c(modulesView);
            modulesView.mo69681L(c16666v0);
            C16666v0 c16666v02 = new C16666v0(getContext());
            int i17 = i15 + i13;
            c16666v02.m89106L().m89060k0(-1).m89030N(this.f48556w).m89054h0(c16666v0).m89032P(0, i17, this.f48552s, 0);
            c16666v02.m88807h1(AbstractC23222t7.f112556e);
            this.f48551r.add(c16666v02);
            ModulesView modulesView2 = this.f48550q;
            AbstractC19074t.m100205c(modulesView2);
            modulesView2.mo69681L(c16666v02);
            C16666v0 c16666v03 = new C16666v0(getContext());
            c16666v03.m89106L().m89060k0(this.f48557x).m89030N(this.f48558y).m89054h0(c16666v0).m89032P(0, i17 + this.f48556w + this.f48553t, this.f48552s, 0);
            c16666v03.m88807h1(AbstractC23222t7.f112556e);
            this.f48551r.add(c16666v03);
            ModulesView modulesView3 = this.f48550q;
            AbstractC19074t.m100205c(modulesView3);
            modulesView3.mo69681L(c16666v03);
            C16719g c16719g = new C16719g(getContext());
            C16718f m89030N = c16719g.m89106L().m89060k0(-1).m89030N(1);
            int i18 = this.f48552s;
            m89030N.m89032P(this.f48555v + i18 + i18, i13 + this.f48554u, 0, 0);
            c16719g.mo89161z0(C23212s8.m119607o(c16719g.getContext(), AbstractC2807a.divider_01));
            ModulesView modulesView4 = this.f48550q;
            AbstractC19074t.m100205c(modulesView4);
            modulesView4.mo69681L(c16719g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m48551f(ProductCatalogSkeletonView productCatalogSkeletonView, C16658t0 c16658t0, RectF rectF) {
        AbstractC19074t.m100208f(productCatalogSkeletonView, "this$0");
        productCatalogSkeletonView.getLocationOnScreen(productCatalogSkeletonView.f48545A);
        productCatalogSkeletonView.f48546B.setEmpty();
        productCatalogSkeletonView.f48547C.reset();
        Matrix matrix = productCatalogSkeletonView.f48547C;
        int[] iArr = productCatalogSkeletonView.f48545A;
        matrix.setTranslate(-iArr[0], -iArr[1]);
        productCatalogSkeletonView.f48547C.mapRect(productCatalogSkeletonView.f48546B, rectF);
        for (C16666v0 c16666v0 : productCatalogSkeletonView.f48551r) {
            RectF rectF2 = productCatalogSkeletonView.f48546B;
            C16658t0 c16658t02 = productCatalogSkeletonView.f48559z;
            AbstractC19074t.m100205c(c16658t02);
            c16666v0.m88810k1(rectF2, c16658t02.m88776b());
        }
    }

    public final C16658t0.b getMShimmerListener() {
        return this.f48548D;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C16658t0 c16658t0 = this.f48559z;
        if (c16658t0 != null) {
            AbstractC19074t.m100205c(c16658t0);
            c16658t0.mo88784j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C16658t0 c16658t0 = this.f48559z;
        if (c16658t0 != null) {
            AbstractC19074t.m100205c(c16658t0);
            c16658t0.m88785k();
        }
    }

    public final void setMShimmerListener(C16658t0.b bVar) {
        AbstractC19074t.m100208f(bVar, "<set-?>");
        this.f48548D = bVar;
    }

    public final void setSkeletonLayoutType(int i11) {
        if (this.f48549p != i11) {
            this.f48549p = i11;
            m48549d();
        }
    }

    public ProductCatalogSkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48551r = new ArrayList();
        MainApplication.C6895a c6895a = MainApplication.Companion;
        this.f48552s = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC2809c.f11267u4);
        this.f48553t = c6895a.m35500c().getResources().getDimensionPixelSize(AbstractC2809c.f11265u2);
        this.f48554u = AbstractC32232i.m155453a(80.0f);
        this.f48555v = AbstractC32232i.m155453a(48.0f);
        this.f48556w = AbstractC32232i.m155453a(12.0f);
        this.f48557x = AbstractC32232i.m155453a(128.0f);
        this.f48558y = AbstractC32232i.m155453a(12.0f);
        this.f48545A = new int[2];
        this.f48546B = new RectF();
        this.f48547C = new Matrix();
        this.f48548D = new C16658t0.b() { // from class: zx.k
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                ProductCatalogSkeletonView.m48551f(ProductCatalogSkeletonView.this, c16658t0, rectF);
            }
        };
    }
}
