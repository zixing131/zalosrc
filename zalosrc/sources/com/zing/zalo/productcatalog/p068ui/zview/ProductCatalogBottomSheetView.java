package com.zing.zalo.productcatalog.p068ui.zview;

import ac.InterfaceC0733x;
import ag0.C0815e1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.C1802w0;
import androidx.lifecycle.C1808z0;
import androidx.lifecycle.InterfaceC1756a1;
import androidx.lifecycle.InterfaceC1764d0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.p077ui.zviews.BottomSheetZaloViewWithAnim;
import com.zing.zalo.productcatalog.p068ui.zview.ProductCatalogBottomSheetView;
import com.zing.zalo.productcatalog.utils.AddCatalogSource;
import com.zing.zalo.productcatalog.utils.AddProductSource;
import com.zing.zalo.productcatalog.utils.SendProductSource;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.C16972e0;
import com.zing.zalo.zview.AbstractC17501r0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import en0.InterfaceC18494a;
import en0.InterfaceC18505l;
import fn0.AbstractC19060k;
import fn0.AbstractC19061k0;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import gg0.AbstractC19444a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import mj0.AbstractC23322a;
import mm0.AbstractC23350e;
import p024ay.AbstractC2421j;
import p115dy.AbstractC18081b1;
import p115dy.AbstractC18088e;
import p115dy.AbstractC18129y0;
import p115dy.C18076a;
import p115dy.C18096i;
import p115dy.C18113q0;
import p115dy.C18127x0;
import p361nb.C23648e;
import p363nh.C23744a;
import p542ub.InterfaceC27218a;
import p624wx.AbstractC29263f;
import p624wx.C29259b;
import p649xl.C29945n9;
import p661xx.AbstractC30215a;
import p661xx.AbstractC30220f;
import p661xx.InterfaceC30216b;
import p661xx.InterfaceC30221g;
import p696yx.C31089a;
import p696yx.C31099k;
import pm0.C24848g0;
import pm0.C24860q;
import pm0.InterfaceC24854k;

/* loaded from: classes4.dex */
public final class ProductCatalogBottomSheetView extends BottomSheetZaloViewWithAnim implements ZaloView.InterfaceC17421f, InterfaceC30216b, InterfaceC30221g, InterfaceC0733x {
    public static final C9106a Companion = new C9106a(null);

    /* renamed from: W0 */
    private C29945n9 f48655W0;

    /* renamed from: X0 */
    private C31089a f48656X0;

    /* renamed from: Y0 */
    private LinearLayoutManager f48657Y0;

    /* renamed from: a1 */
    private C31099k f48659a1;

    /* renamed from: b1 */
    private LinearLayoutManager f48660b1;

    /* renamed from: d1 */
    private boolean f48662d1;

    /* renamed from: j1 */
    private List f48668j1;

    /* renamed from: l1 */
    private Animator f48670l1;

    /* renamed from: m1 */
    private Animator f48671m1;

    /* renamed from: Z0 */
    private final ArrayList f48658Z0 = new ArrayList();

    /* renamed from: c1 */
    private final ArrayList f48661c1 = new ArrayList();

    /* renamed from: e1 */
    private final InterfaceC24854k f48663e1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18096i.class), new C9121p(new C9120o(this)), C9109d.f48675q);

    /* renamed from: f1 */
    private final InterfaceC1764d0 f48664f1 = new InterfaceC1764d0() { // from class: ay.t0
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            ProductCatalogBottomSheetView.m48754EM(ProductCatalogBottomSheetView.this, (List) obj);
        }
    };

    /* renamed from: g1 */
    private final InterfaceC24854k f48665g1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18127x0.class), new C9123r(new C9122q(this)), C9110e.f48676q);

    /* renamed from: h1 */
    private final InterfaceC1764d0 f48666h1 = new InterfaceC1764d0() { // from class: ay.u0
        @Override // androidx.lifecycle.InterfaceC1764d0
        /* renamed from: qp */
        public final void mo8524qp(Object obj) {
            ProductCatalogBottomSheetView.m48778cN(ProductCatalogBottomSheetView.this, (List) obj);
        }
    };

    /* renamed from: i1 */
    private final InterfaceC24854k f48667i1 = AbstractC17501r0.m93124a(this, AbstractC19061k0.m100169b(C18076a.class), new C9125t(new C9124s(this)), C9108c.f48674q);

    /* renamed from: k1 */
    private AbstractC9107b f48669k1 = AbstractC9107b.a.f48672a;

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$a */
    /* loaded from: classes4.dex */
    public static final class C9106a {
        private C9106a() {
        }

        public /* synthetic */ C9106a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$b */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC9107b {

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC9107b {

            /* renamed from: a */
            public static final a f48672a = new a();

            private a() {
                super(null);
            }
        }

        /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$b$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC9107b {

            /* renamed from: a */
            private final C29259b f48673a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C29259b c29259b) {
                super(null);
                AbstractC19074t.m100208f(c29259b, "catalog");
                this.f48673a = c29259b;
            }

            /* renamed from: a */
            public final C29259b m48799a() {
                return this.f48673a;
            }
        }

        private AbstractC9107b() {
        }

        public /* synthetic */ AbstractC9107b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$c */
    /* loaded from: classes4.dex */
    static final class C9108c extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9108c f48674q = new C9108c();

        C9108c() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C18076a.c();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$d */
    /* loaded from: classes4.dex */
    static final class C9109d extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9109d f48675q = new C9109d();

        C9109d() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C18096i.b();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$e */
    /* loaded from: classes4.dex */
    static final class C9110e extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        public static final C9110e f48676q = new C9110e();

        C9110e() {
            super(0);
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1802w0.b mo12V4() {
            return new C18127x0.a();
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$f */
    /* loaded from: classes4.dex */
    public static final class C9111f extends AnimatorListenerAdapter {
        C9111f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            if (AbstractC19074t.m100204b(ProductCatalogBottomSheetView.this.f48670l1, animator) && (ProductCatalogBottomSheetView.this.f48669k1 instanceof AbstractC9107b.a)) {
                C29945n9 c29945n9 = ProductCatalogBottomSheetView.this.f48655W0;
                C29945n9 c29945n92 = null;
                if (c29945n9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29945n9 = null;
                }
                c29945n9.f138788v.setVisibility(0);
                C29945n9 c29945n93 = ProductCatalogBottomSheetView.this.f48655W0;
                if (c29945n93 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29945n92 = c29945n93;
                }
                c29945n92.f138789w.setVisibility(8);
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$g */
    /* loaded from: classes4.dex */
    public static final class C9112g extends AnimatorListenerAdapter {
        C9112g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            if (AbstractC19074t.m100204b(ProductCatalogBottomSheetView.this.f48670l1, animator) && (ProductCatalogBottomSheetView.this.f48669k1 instanceof AbstractC9107b.b)) {
                C29945n9 c29945n9 = ProductCatalogBottomSheetView.this.f48655W0;
                C29945n9 c29945n92 = null;
                if (c29945n9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29945n9 = null;
                }
                c29945n9.f138788v.setVisibility(8);
                C29945n9 c29945n93 = ProductCatalogBottomSheetView.this.f48655W0;
                if (c29945n93 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29945n92 = c29945n93;
                }
                c29945n92.f138789w.setVisibility(0);
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$h */
    /* loaded from: classes4.dex */
    public static final class C9113h extends RecyclerView.AbstractC1887n {
        C9113h() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                i11 = layoutManager.m10127i();
            } else {
                i11 = 0;
            }
            if (m9817A0 == i11 - 1) {
                rect.bottom = AbstractC23222t7.f112591v0;
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$i */
    /* loaded from: classes4.dex */
    public static final class C9114i extends RecyclerView.AbstractC1892s {
        C9114i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i11 != 0 || i12 != 0) {
                try {
                    LinearLayoutManager linearLayoutManager = ProductCatalogBottomSheetView.this.f48657Y0;
                    if (linearLayoutManager == null) {
                        AbstractC19074t.m100223u("catalogListLayoutManager");
                        linearLayoutManager = null;
                    }
                    int m9745c2 = linearLayoutManager.m9745c2();
                    C31089a c31089a = ProductCatalogBottomSheetView.this.f48656X0;
                    if (c31089a == null) {
                        AbstractC19074t.m100223u("catalogListAdapter");
                        c31089a = null;
                    }
                    AbstractC18088e m151073L = c31089a.m151073L(m9745c2);
                    LinearLayoutManager linearLayoutManager2 = ProductCatalogBottomSheetView.this.f48657Y0;
                    if (linearLayoutManager2 == null) {
                        AbstractC19074t.m100223u("catalogListLayoutManager");
                        linearLayoutManager2 = null;
                    }
                    if (m9745c2 >= linearLayoutManager2.m10127i() - 1 && (m151073L instanceof AbstractC18088e.c)) {
                        C18096i.m96267o0(ProductCatalogBottomSheetView.this.m48760KM(), false, 1, null);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$j */
    /* loaded from: classes4.dex */
    public static final class C9115j extends RecyclerView.AbstractC1887n {
        C9115j() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1887n
        /* renamed from: g */
        public void mo10066g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1899z c1899z) {
            int i11;
            AbstractC19074t.m100208f(rect, "outRect");
            AbstractC19074t.m100208f(view, "view");
            AbstractC19074t.m100208f(recyclerView, "parent");
            AbstractC19074t.m100208f(c1899z, "state");
            int m9817A0 = recyclerView.m9817A0(view);
            RecyclerView.AbstractC1888o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                i11 = layoutManager.m10127i();
            } else {
                i11 = 0;
            }
            if (m9817A0 == i11 - 1) {
                rect.bottom = AbstractC23222t7.f112591v0;
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$k */
    /* loaded from: classes4.dex */
    public static final class C9116k extends RecyclerView.AbstractC1892s {
        C9116k() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1892s
        /* renamed from: d */
        public void mo10176d(RecyclerView recyclerView, int i11, int i12) {
            AbstractC19074t.m100208f(recyclerView, "recyclerView");
            super.mo10176d(recyclerView, i11, i12);
            if (i11 != 0 || i12 != 0) {
                try {
                    LinearLayoutManager linearLayoutManager = ProductCatalogBottomSheetView.this.f48660b1;
                    if (linearLayoutManager == null) {
                        AbstractC19074t.m100223u("productListLayoutManager");
                        linearLayoutManager = null;
                    }
                    int m9745c2 = linearLayoutManager.m9745c2();
                    C31099k c31099k = ProductCatalogBottomSheetView.this.f48659a1;
                    if (c31099k == null) {
                        AbstractC19074t.m100223u("productListAdapter");
                        c31099k = null;
                    }
                    AbstractC18129y0 m151100L = c31099k.m151100L(m9745c2);
                    LinearLayoutManager linearLayoutManager2 = ProductCatalogBottomSheetView.this.f48660b1;
                    if (linearLayoutManager2 == null) {
                        AbstractC19074t.m100223u("productListLayoutManager");
                        linearLayoutManager2 = null;
                    }
                    if (m9745c2 >= linearLayoutManager2.m10127i() - 1 && (m151100L instanceof AbstractC18129y0.i)) {
                        C18113q0.m96331K0(ProductCatalogBottomSheetView.this.m48761LM(), false, 1, null);
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$l */
    /* loaded from: classes4.dex */
    public static final class C9117l extends AbstractC19075u implements InterfaceC18505l {
        C9117l() {
            super(1);
        }

        /* renamed from: a */
        public final void m48803a(AbstractC18081b1 abstractC18081b1) {
            AbstractC19074t.m100208f(abstractC18081b1, "state");
            if (abstractC18081b1 instanceof AbstractC18081b1.b) {
                ProductCatalogBottomSheetView.this.close();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48803a((AbstractC18081b1) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$m */
    /* loaded from: classes4.dex */
    public static final class C9118m extends AbstractC19075u implements InterfaceC18505l {
        C9118m() {
            super(1);
        }

        /* renamed from: a */
        public final void m48804a(AbstractC18081b1 abstractC18081b1) {
            AbstractC19074t.m100208f(abstractC18081b1, "state");
            if (abstractC18081b1 instanceof AbstractC18081b1.b) {
                ProductCatalogBottomSheetView.this.close();
            }
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m48804a((AbstractC18081b1) obj);
            return C24848g0.f119245a;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$n */
    /* loaded from: classes4.dex */
    public static final class C9119n extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f48683p;

        /* renamed from: q */
        final /* synthetic */ ProductCatalogBottomSheetView f48684q;

        C9119n(boolean z11, ProductCatalogBottomSheetView productCatalogBottomSheetView) {
            this.f48683p = z11;
            this.f48684q = productCatalogBottomSheetView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (!this.f48683p) {
                C29945n9 c29945n9 = this.f48684q.f48655W0;
                C29945n9 c29945n92 = null;
                if (c29945n9 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29945n9 = null;
                }
                c29945n9.f138783q.setVisibility(8);
                C29945n9 c29945n93 = this.f48684q.f48655W0;
                if (c29945n93 == null) {
                    AbstractC19074t.m100223u("binding");
                } else {
                    c29945n92 = c29945n93;
                }
                c29945n92.f138783q.setAlpha(0.0f);
                this.f48684q.m48753DM();
            }
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$o */
    /* loaded from: classes4.dex */
    public static final class C9120o extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48685q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9120o(ZaloView zaloView) {
            super(0);
            this.f48685q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f48685q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$p */
    /* loaded from: classes4.dex */
    public static final class C9121p extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48686q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9121p(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48686q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48686q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$q */
    /* loaded from: classes4.dex */
    public static final class C9122q extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48687q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9122q(ZaloView zaloView) {
            super(0);
            this.f48687q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f48687q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$r */
    /* loaded from: classes4.dex */
    public static final class C9123r extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48688q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9123r(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48688q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48688q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$s */
    /* loaded from: classes4.dex */
    public static final class C9124s extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ ZaloView f48689q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9124s(ZaloView zaloView) {
            super(0);
            this.f48689q = zaloView;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ZaloView mo12V4() {
            return this.f48689q;
        }
    }

    /* renamed from: com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView$t */
    /* loaded from: classes4.dex */
    public static final class C9125t extends AbstractC19075u implements InterfaceC18494a {

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f48690q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9125t(InterfaceC18494a interfaceC18494a) {
            super(0);
            this.f48690q = interfaceC18494a;
        }

        @Override // en0.InterfaceC18494a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1808z0 mo12V4() {
            C1808z0 mo4644Oc = ((InterfaceC1756a1) this.f48690q.mo12V4()).mo4644Oc();
            AbstractC19074t.m100207e(mo4644Oc, "ownerProducer().viewModelStore");
            return mo4644Oc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: DM */
    public final void m48753DM() {
        C29945n9 c29945n9 = null;
        if (m48761LM().m96355I0()) {
            C29945n9 c29945n92 = this.f48655W0;
            if (c29945n92 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29945n9 = c29945n92;
            }
            c29945n9.f138785s.setText(AbstractC8020f0.product_catalog_send_catalog);
            return;
        }
        if (m48761LM().m96350B0() == 1) {
            C29945n9 c29945n93 = this.f48655W0;
            if (c29945n93 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29945n9 = c29945n93;
            }
            c29945n9.f138785s.setText(m92653YI(AbstractC8020f0.product_catalog_send_single_product, Integer.valueOf(m48761LM().m96350B0())));
            return;
        }
        C29945n9 c29945n94 = this.f48655W0;
        if (c29945n94 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29945n9 = c29945n94;
        }
        c29945n9.f138785s.setText(m92653YI(AbstractC8020f0.product_catalog_send_multiple_products, Integer.valueOf(m48761LM().m96350B0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: EM */
    public static final void m48754EM(ProductCatalogBottomSheetView productCatalogBottomSheetView, List list) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        productCatalogBottomSheetView.f48658Z0.clear();
        productCatalogBottomSheetView.f48658Z0.addAll(list);
        if (productCatalogBottomSheetView.f48662d1) {
            productCatalogBottomSheetView.m48780eN();
        }
    }

    /* renamed from: FM */
    private final void m48755FM() {
        Animator animator = this.f48670l1;
        if (animator != null) {
            animator.cancel();
        }
        this.f48670l1 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        C29945n9 c29945n9 = this.f48655W0;
        if (c29945n9 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n9 = null;
        }
        float width = c29945n9.getRoot().getWidth();
        AbstractC9107b abstractC9107b = this.f48669k1;
        if (AbstractC19074t.m100204b(abstractC9107b, AbstractC9107b.a.f48672a)) {
            C29945n9 c29945n92 = this.f48655W0;
            if (c29945n92 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n92 = null;
            }
            RecyclerView recyclerView = c29945n92.f138789w;
            float[] fArr = new float[2];
            C29945n9 c29945n93 = this.f48655W0;
            if (c29945n93 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n93 = null;
            }
            fArr[0] = c29945n93.f138789w.getTranslationX();
            fArr[1] = width;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(recyclerView, "translationX", fArr);
            ofFloat.setDuration(200L);
            C29945n9 c29945n94 = this.f48655W0;
            if (c29945n94 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n94 = null;
            }
            RecyclerView recyclerView2 = c29945n94.f138788v;
            float[] fArr2 = new float[2];
            C29945n9 c29945n95 = this.f48655W0;
            if (c29945n95 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n95 = null;
            }
            fArr2[0] = c29945n95.f138788v.getTranslationX();
            fArr2[1] = 0.0f;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(recyclerView2, "translationX", fArr2);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(100L);
            C29945n9 c29945n96 = this.f48655W0;
            if (c29945n96 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n96 = null;
            }
            if (c29945n96.f138789w.getTranslationX() == 0.0f) {
                C29945n9 c29945n97 = this.f48655W0;
                if (c29945n97 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29945n97 = null;
                }
                c29945n97.f138789w.setTranslationX(width);
            }
            animatorSet.playTogether(ofFloat2, ofFloat);
            animatorSet.addListener(new C9111f());
        } else if (abstractC9107b instanceof AbstractC9107b.b) {
            C29945n9 c29945n98 = this.f48655W0;
            if (c29945n98 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n98 = null;
            }
            RecyclerView recyclerView3 = c29945n98.f138788v;
            float[] fArr3 = new float[2];
            C29945n9 c29945n99 = this.f48655W0;
            if (c29945n99 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n99 = null;
            }
            fArr3[0] = c29945n99.f138788v.getTranslationX();
            fArr3[1] = -width;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(recyclerView3, "translationX", fArr3);
            ofFloat3.setDuration(200L);
            C29945n9 c29945n910 = this.f48655W0;
            if (c29945n910 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n910 = null;
            }
            if (c29945n910.f138789w.getTranslationX() == 0.0f) {
                C29945n9 c29945n911 = this.f48655W0;
                if (c29945n911 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29945n911 = null;
                }
                c29945n911.f138789w.setTranslationX(width);
            }
            C29945n9 c29945n912 = this.f48655W0;
            if (c29945n912 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n912 = null;
            }
            RecyclerView recyclerView4 = c29945n912.f138789w;
            float[] fArr4 = new float[2];
            C29945n9 c29945n913 = this.f48655W0;
            if (c29945n913 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n913 = null;
            }
            fArr4[0] = c29945n913.f138789w.getTranslationX();
            fArr4[1] = 0.0f;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(recyclerView4, "translationX", fArr4);
            ofFloat4.setDuration(200L);
            ofFloat4.setStartDelay(100L);
            animatorSet.playTogether(ofFloat3, ofFloat4);
            animatorSet.addListener(new C9112g());
        }
        this.f48670l1 = animatorSet;
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: GM */
    public static final void m48756GM(ProductCatalogBottomSheetView productCatalogBottomSheetView) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        productCatalogBottomSheetView.m48763NM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: HM */
    public static final void m48757HM(ProductCatalogBottomSheetView productCatalogBottomSheetView) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        productCatalogBottomSheetView.m48763NM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IM */
    public static final void m48758IM(ProductCatalogBottomSheetView productCatalogBottomSheetView, AbstractC29263f abstractC29263f) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        AbstractC19074t.m100208f(abstractC29263f, "$localEvent");
        if (productCatalogBottomSheetView.f48669k1 instanceof AbstractC9107b.b) {
            List m146188c = ((AbstractC29263f.e) abstractC29263f).m146188c();
            AbstractC9107b abstractC9107b = productCatalogBottomSheetView.f48669k1;
            AbstractC19074t.m100206d(abstractC9107b, "null cannot be cast to non-null type com.zing.zalo.productcatalog.ui.zview.ProductCatalogBottomSheetView.ScreenState.ScreenStateProductList");
            if (m146188c.contains(Long.valueOf(((AbstractC9107b.b) abstractC9107b).m48799a().m146158m()))) {
                productCatalogBottomSheetView.m48782gN(AbstractC9107b.a.f48672a);
                if (abstractC29263f.m146183a()) {
                    ToastUtils.showMess(productCatalogBottomSheetView.m92652XI(AbstractC8020f0.product_catalog_toast_catalog_deleted_sync));
                } else {
                    ToastUtils.showMess(productCatalogBottomSheetView.m92652XI(AbstractC8020f0.product_catalog_toast_catalog_deleted));
                }
            }
        }
    }

    /* renamed from: JM */
    private final C18076a m48759JM() {
        return (C18076a) this.f48667i1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: KM */
    public final C18096i m48760KM() {
        return (C18096i) this.f48663e1.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public final C18127x0 m48761LM() {
        return (C18127x0) this.f48665g1.getValue();
    }

    /* renamed from: MM */
    private final List m48762MM() {
        ArrayList arrayList = new ArrayList();
        C29945n9 c29945n9 = this.f48655W0;
        if (c29945n9 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n9 = null;
        }
        RelativeLayout relativeLayout = c29945n9.f138783q;
        AbstractC19074t.m100207e(relativeLayout, "bottomViewContainer");
        arrayList.add(relativeLayout);
        return arrayList;
    }

    /* renamed from: NM */
    private final void m48763NM(boolean z11) {
        int m96350B0 = m48761LM().m96350B0();
        if (z11 || m96350B0 > 0) {
            m48753DM();
        }
        if (z11 && m96350B0 == 1) {
            m48777bN(true);
        } else if (!z11 && m96350B0 == 0) {
            m48777bN(false);
        }
    }

    /* renamed from: OM */
    private final void m48764OM(boolean z11) {
        if (z11) {
            m48753DM();
        }
        if (z11) {
            m48777bN(true);
        } else {
            m48777bN(false);
        }
    }

    /* renamed from: PM */
    private final void m48765PM() {
        C31089a c31089a = new C31089a(false, this);
        this.f48656X0 = c31089a;
        c31089a.m9999J(true);
        C29945n9 c29945n9 = this.f48655W0;
        C29945n9 c29945n92 = null;
        if (c29945n9 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n9 = null;
        }
        RecyclerView recyclerView = c29945n9.f138788v;
        C31089a c31089a2 = this.f48656X0;
        if (c31089a2 == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31089a2 = null;
        }
        recyclerView.setAdapter(c31089a2);
        this.f48657Y0 = new LinearLayoutManager(getContext(), 1, false);
        C29945n9 c29945n93 = this.f48655W0;
        if (c29945n93 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n93 = null;
        }
        RecyclerView recyclerView2 = c29945n93.f138788v;
        LinearLayoutManager linearLayoutManager = this.f48657Y0;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("catalogListLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C29945n9 c29945n94 = this.f48655W0;
        if (c29945n94 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n94 = null;
        }
        c29945n94.f138788v.m9816A(new C9113h());
        C29945n9 c29945n95 = this.f48655W0;
        if (c29945n95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29945n92 = c29945n95;
        }
        c29945n92.f138788v.m9826E(new C9114i());
    }

    /* renamed from: QM */
    private final void m48766QM() {
        C31099k c31099k = new C31099k(false, this);
        this.f48659a1 = c31099k;
        c31099k.m9999J(true);
        C29945n9 c29945n9 = this.f48655W0;
        C29945n9 c29945n92 = null;
        if (c29945n9 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n9 = null;
        }
        RecyclerView recyclerView = c29945n9.f138789w;
        C31099k c31099k2 = this.f48659a1;
        if (c31099k2 == null) {
            AbstractC19074t.m100223u("productListAdapter");
            c31099k2 = null;
        }
        recyclerView.setAdapter(c31099k2);
        this.f48660b1 = new LinearLayoutManager(getContext(), 1, false);
        C29945n9 c29945n93 = this.f48655W0;
        if (c29945n93 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n93 = null;
        }
        RecyclerView recyclerView2 = c29945n93.f138789w;
        LinearLayoutManager linearLayoutManager = this.f48660b1;
        if (linearLayoutManager == null) {
            AbstractC19074t.m100223u("productListLayoutManager");
            linearLayoutManager = null;
        }
        recyclerView2.setLayoutManager(linearLayoutManager);
        C29945n9 c29945n94 = this.f48655W0;
        if (c29945n94 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n94 = null;
        }
        c29945n94.f138789w.m9816A(new C9115j());
        C29945n9 c29945n95 = this.f48655W0;
        if (c29945n95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29945n92 = c29945n95;
        }
        c29945n92.f138789w.m9826E(new C9116k());
    }

    /* renamed from: RM */
    private final void m48767RM(AddCatalogSource addCatalogSource) {
        List list = this.f48668j1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        C24860q m96139Q = m48759JM().m96139Q();
        if (!((Boolean) m96139Q.m129215c()).booleanValue()) {
            if (((CharSequence) m96139Q.m129216d()).length() > 0) {
                ToastUtils.showMess((String) m96139Q.m129216d());
            }
            C0815e1.m2075D().m2100V(new C23648e(49, String.valueOf(addCatalogSource.m48909a()), 0, "catalog_limit_reach", new String[0]), false);
            return;
        }
        this.f48668j1 = AbstractC2421j.m12468k(this, m48759JM(), null, addCatalogSource);
    }

    /* renamed from: SM */
    private final void m48768SM() {
        C17487o0 mo35579p;
        C29259b m96380u0 = m48761LM().m96380u0();
        if (m96380u0 == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("EXTRA_CATALOG_ID", m96380u0.m146158m());
        bundle.putParcelable("EXTRA_TRACKING_SOURCE", AddProductSource.ProductBottomSheetEmptyView.f48748q);
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(ProductAddEditView.class, bundle, 2, true);
        }
    }

    /* renamed from: TM */
    private final void m48769TM() {
        m48761LM().mo96362W();
        m48763NM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: UM */
    public static final void m48770UM(ProductCatalogBottomSheetView productCatalogBottomSheetView, View view) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        if (productCatalogBottomSheetView.f48669k1 instanceof AbstractC9107b.a) {
            productCatalogBottomSheetView.close();
        } else {
            productCatalogBottomSheetView.m48782gN(AbstractC9107b.a.f48672a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: VM */
    public static final void m48771VM(ProductCatalogBottomSheetView productCatalogBottomSheetView, View view) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        if (productCatalogBottomSheetView.m48761LM().m96355I0()) {
            productCatalogBottomSheetView.m48774YM(SendProductSource.ProductBottomSheet.f48781q);
        } else {
            productCatalogBottomSheetView.m48775ZM(SendProductSource.ProductBottomSheet.f48781q);
        }
    }

    /* renamed from: WM */
    private final void m48772WM() {
        C17487o0 mo35579p;
        Bundle bundle = new Bundle();
        InterfaceC27218a m92676n2 = m92676n2();
        if (m92676n2 != null && (mo35579p = m92676n2.mo35579p()) != null) {
            mo35579p.m93069k2(CatalogsManageView.class, bundle, 2, true);
        }
    }

    /* renamed from: XM */
    private final void m48773XM(AbstractC18129y0.i iVar) {
        boolean m96368f0 = m48761LM().m96368f0(iVar);
        m48763NM(iVar.m96422i());
        if (m96368f0) {
            C31099k c31099k = this.f48659a1;
            if (c31099k == null) {
                AbstractC19074t.m100223u("productListAdapter");
                c31099k = null;
            }
            c31099k.m10008p();
        }
    }

    /* renamed from: YM */
    private final void m48774YM(SendProductSource sendProductSource) {
        String str;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("extra_conversation_id");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            m48761LM().m96370h0(str, sendProductSource, new C9117l());
        }
    }

    /* renamed from: ZM */
    private final void m48775ZM(SendProductSource sendProductSource) {
        String str;
        Bundle m92642L3 = m92642L3();
        if (m92642L3 != null) {
            str = m92642L3.getString("extra_conversation_id");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            m48761LM().m96371i0(str, sendProductSource, new C9118m());
        }
    }

    /* renamed from: aN */
    private final void m48776aN(AbstractC18129y0.j jVar) {
        boolean m96369g0 = m48761LM().m96369g0(jVar);
        m48764OM(jVar.m96424h());
        if (m96369g0) {
            C31099k c31099k = this.f48659a1;
            if (c31099k == null) {
                AbstractC19074t.m100223u("productListAdapter");
                c31099k = null;
            }
            c31099k.m10008p();
        }
    }

    /* renamed from: bN */
    private final void m48777bN(boolean z11) {
        Animator animator = this.f48671m1;
        if (animator != null) {
            animator.cancel();
        }
        float f11 = 0.0f;
        C29945n9 c29945n9 = null;
        if (z11) {
            C29945n9 c29945n92 = this.f48655W0;
            if (c29945n92 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n92 = null;
            }
            if (c29945n92.f138783q.getVisibility() == 8) {
                C29945n9 c29945n93 = this.f48655W0;
                if (c29945n93 == null) {
                    AbstractC19074t.m100223u("binding");
                    c29945n93 = null;
                }
                c29945n93.f138783q.setAlpha(0.0f);
            }
            C29945n9 c29945n94 = this.f48655W0;
            if (c29945n94 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n94 = null;
            }
            c29945n94.f138783q.setVisibility(0);
        }
        C29945n9 c29945n95 = this.f48655W0;
        if (c29945n95 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29945n9 = c29945n95;
        }
        RelativeLayout relativeLayout = c29945n9.f138783q;
        AbstractC19074t.m100207e(relativeLayout, "bottomViewContainer");
        if (z11) {
            f11 = 1.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(relativeLayout, "alpha", relativeLayout.getAlpha(), f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(150L);
        animatorSet.playTogether(ofFloat);
        animatorSet.addListener(new C9119n(z11, this));
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cN */
    public static final void m48778cN(ProductCatalogBottomSheetView productCatalogBottomSheetView, List list) {
        AbstractC19074t.m100208f(productCatalogBottomSheetView, "this$0");
        AbstractC19074t.m100208f(list, "items");
        productCatalogBottomSheetView.f48661c1.clear();
        productCatalogBottomSheetView.f48661c1.addAll(list);
        productCatalogBottomSheetView.m48781fN();
    }

    /* renamed from: dN */
    private final void m48779dN() {
        C23744a.Companion.m124119a().m124115b(this, 5300);
    }

    /* renamed from: eN */
    private final void m48780eN() {
        C31089a c31089a = this.f48656X0;
        C31089a c31089a2 = null;
        if (c31089a == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31089a = null;
        }
        int mo10003k = c31089a.mo10003k();
        C31089a c31089a3 = this.f48656X0;
        if (c31089a3 == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31089a3 = null;
        }
        c31089a3.m151076O(this.f48658Z0);
        if (mo10003k == 0) {
            C31089a c31089a4 = this.f48656X0;
            if (c31089a4 == null) {
                AbstractC19074t.m100223u("catalogListAdapter");
                c31089a4 = null;
            }
            C31089a c31089a5 = this.f48656X0;
            if (c31089a5 == null) {
                AbstractC19074t.m100223u("catalogListAdapter");
            } else {
                c31089a2 = c31089a5;
            }
            c31089a4.m10015w(0, c31089a2.mo10003k());
            return;
        }
        C31089a c31089a6 = this.f48656X0;
        if (c31089a6 == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
        } else {
            c31089a2 = c31089a6;
        }
        c31089a2.m10008p();
    }

    /* renamed from: fN */
    private final void m48781fN() {
        C31099k c31099k = this.f48659a1;
        C31099k c31099k2 = null;
        if (c31099k == null) {
            AbstractC19074t.m100223u("productListAdapter");
            c31099k = null;
        }
        int mo10003k = c31099k.mo10003k();
        C31099k c31099k3 = this.f48659a1;
        if (c31099k3 == null) {
            AbstractC19074t.m100223u("productListAdapter");
            c31099k3 = null;
        }
        c31099k3.m151103O(this.f48661c1);
        if (mo10003k == 0) {
            C31099k c31099k4 = this.f48659a1;
            if (c31099k4 == null) {
                AbstractC19074t.m100223u("productListAdapter");
                c31099k4 = null;
            }
            C31099k c31099k5 = this.f48659a1;
            if (c31099k5 == null) {
                AbstractC19074t.m100223u("productListAdapter");
            } else {
                c31099k2 = c31099k5;
            }
            c31099k4.m10015w(0, c31099k2.mo10003k());
            return;
        }
        C31099k c31099k6 = this.f48659a1;
        if (c31099k6 == null) {
            AbstractC19074t.m100223u("productListAdapter");
        } else {
            c31099k2 = c31099k6;
        }
        c31099k2.m10008p();
    }

    /* renamed from: gN */
    private final void m48782gN(AbstractC9107b abstractC9107b) {
        if (AbstractC19074t.m100204b(this.f48669k1, abstractC9107b)) {
            return;
        }
        this.f48669k1 = abstractC9107b;
        C29945n9 c29945n9 = null;
        if (AbstractC19074t.m100204b(abstractC9107b, AbstractC9107b.a.f48672a)) {
            C29945n9 c29945n92 = this.f48655W0;
            if (c29945n92 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n92 = null;
            }
            c29945n92.f138788v.setVisibility(0);
            C29945n9 c29945n93 = this.f48655W0;
            if (c29945n93 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n93 = null;
            }
            c29945n93.f138790x.setText(m92652XI(AbstractC8020f0.product_catalog_bottom_sheet_catalog_list_title));
            C29945n9 c29945n94 = this.f48655W0;
            if (c29945n94 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29945n9 = c29945n94;
            }
            c29945n9.f138784r.setImageResource(AbstractC23322a.zds_ic_close_line_24);
            m48769TM();
            m48761LM().m96375m0();
            m48755FM();
            return;
        }
        if (abstractC9107b instanceof AbstractC9107b.b) {
            C29945n9 c29945n95 = this.f48655W0;
            if (c29945n95 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n95 = null;
            }
            c29945n95.f138789w.setVisibility(0);
            C29259b m48799a = ((AbstractC9107b.b) abstractC9107b).m48799a();
            C29945n9 c29945n96 = this.f48655W0;
            if (c29945n96 == null) {
                AbstractC19074t.m100223u("binding");
                c29945n96 = null;
            }
            c29945n96.f138790x.setText(m48799a.m146160o());
            C29945n9 c29945n97 = this.f48655W0;
            if (c29945n97 == null) {
                AbstractC19074t.m100223u("binding");
            } else {
                c29945n9 = c29945n97;
            }
            c29945n9.f138784r.setImageResource(AbstractC23322a.zds_ic_arrow_left_line_24);
            m48761LM().m96353E0(m48799a.m146158m());
            m48755FM();
        }
    }

    /* renamed from: hN */
    private final void m48783hN() {
        C23744a.Companion.m124119a().m124117e(this, 5300);
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: JJ */
    public void mo37484JJ() {
        super.mo37484JJ();
        m48769TM();
        m48760KM().m96276b0().mo9222o(this.f48664f1);
        m48761LM().m96385z0().mo9222o(this.f48666h1);
        AbstractC2421j.m12467j(this, m48759JM());
        List list = this.f48668j1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C16972e0) it.next()).dismiss();
            }
        }
        m48783hN();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: P2 */
    public View mo37117P2() {
        C29945n9 c29945n9 = this.f48655W0;
        if (c29945n9 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n9 = null;
        }
        RelativeLayout root = c29945n9.getRoot();
        AbstractC19074t.m100207e(root, "getRoot(...)");
        return root;
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: T2 */
    public void mo42955T2(float f11) {
        boolean z11;
        super.mo42955T2(f11);
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        if (bottomSheetLayout.getTranslationY() == this.f72454M0.f68983q) {
            z11 = true;
        } else {
            z11 = false;
        }
        bottomSheetLayout.setEnableScrollY(z11);
        Iterator it = m48762MM().iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationY(-f11);
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar, com.zing.zalo.zview.ZaloView
    /* renamed from: ZJ */
    public void mo37125ZJ(View view, Bundle bundle) {
        AbstractC19074t.m100208f(view, "view");
        super.mo37125ZJ(view, bundle);
        m48760KM().m96276b0().m9219j(this, this.f48664f1);
        C18096i.m96265k0(m48760KM(), false, 1, null);
        m48761LM().m96385z0().m9219j(this, this.f48666h1);
        m48779dN();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: eM */
    public int mo37128eM() {
        return AbstractC23136l9.m118742r(300.0f);
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: fM */
    protected void mo37129fM(LinearLayout linearLayout) {
        AbstractC19074t.m100208f(linearLayout, "llContainer");
        C29945n9 m148284c = C29945n9.m148284c(LayoutInflater.from(getContext()), linearLayout, true);
        AbstractC19074t.m100207e(m148284c, "inflate(...)");
        this.f48655W0 = m148284c;
        C29945n9 c29945n9 = null;
        if (m148284c == null) {
            AbstractC19074t.m100223u("binding");
            m148284c = null;
        }
        m148284c.f138784r.setOnClickListener(new View.OnClickListener() { // from class: ay.y0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductCatalogBottomSheetView.m48770UM(ProductCatalogBottomSheetView.this, view);
            }
        });
        C29945n9 c29945n92 = this.f48655W0;
        if (c29945n92 == null) {
            AbstractC19074t.m100223u("binding");
            c29945n92 = null;
        }
        c29945n92.f138785s.setIdTracking("product_catalog_send");
        C29945n9 c29945n93 = this.f48655W0;
        if (c29945n93 == null) {
            AbstractC19074t.m100223u("binding");
        } else {
            c29945n9 = c29945n93;
        }
        c29945n9.f138785s.setOnClickListener(new View.OnClickListener() { // from class: ay.z0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProductCatalogBottomSheetView.m48771VM(ProductCatalogBottomSheetView.this, view);
            }
        });
        m48765PM();
        m48766QM();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: gM */
    public void mo37132gM() {
        super.mo37132gM();
        m78539iM(true);
        this.f72454M0.setEnableScrollY(false);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "ProductBottomSheetView";
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView
    /* renamed from: hM */
    public void mo37567hM() {
        super.mo37567hM();
        this.f48662d1 = true;
        C31089a c31089a = this.f48656X0;
        if (c31089a == null) {
            AbstractC19074t.m100223u("catalogListAdapter");
            c31089a = null;
        }
        if (c31089a.mo10003k() == 0 && (true ^ this.f48658Z0.isEmpty())) {
            m48780eN();
        }
    }

    @Override // p661xx.InterfaceC30221g
    /* renamed from: ne */
    public void mo48798ne(AbstractC30220f abstractC30220f) {
        AbstractC19074t.m100208f(abstractC30220f, "action");
        if (abstractC30220f instanceof AbstractC30220f.a) {
            m48768SM();
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.b) {
            m48768SM();
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.e) {
            AbstractC30220f.e eVar = (AbstractC30220f.e) abstractC30220f;
            if (eVar.m149004a().m96422i()) {
                eVar.m149004a().m96423j(false);
                m48773XM(eVar.m149004a());
                return;
            } else {
                if (m48761LM().m96379t0()) {
                    eVar.m149004a().m96423j(true);
                    m48773XM(eVar.m149004a());
                    return;
                }
                return;
            }
        }
        if (abstractC30220f instanceof AbstractC30220f.h) {
            AbstractC30220f.h hVar = (AbstractC30220f.h) abstractC30220f;
            hVar.m149006a().m96425i(!hVar.m149006a().m96424h());
            m48776aN(hVar.m149006a());
            return;
        }
        if (abstractC30220f instanceof AbstractC30220f.f) {
            m48761LM().m96366a0();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4 && (this.f48669k1 instanceof AbstractC9107b.b)) {
            m48782gN(AbstractC9107b.a.f48672a);
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // p661xx.InterfaceC30216b
    /* renamed from: vf */
    public void mo48669vf(AbstractC30215a abstractC30215a) {
        AbstractC19074t.m100208f(abstractC30215a, "action");
        if (abstractC30215a instanceof AbstractC30215a.a) {
            m48767RM(AddCatalogSource.CatalogBottomSheetEmptyView.f48742q);
            return;
        }
        if (abstractC30215a instanceof AbstractC30215a.d) {
            m48782gN(new AbstractC9107b.b(((AbstractC30215a.d) abstractC30215a).m149000a().m96249d()));
        } else if (abstractC30215a instanceof AbstractC30215a.f) {
            m48760KM().m96272V();
        } else if (abstractC30215a instanceof AbstractC30215a.e) {
            m48772WM();
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, p363nh.C23744a.c
    /* renamed from: x */
    public void mo17795x(int i11, Object... objArr) {
        final AbstractC29263f abstractC29263f;
        AbstractC19074t.m100208f(objArr, "args");
        if (i11 == 5300) {
            Object obj = objArr[0];
            if (obj instanceof AbstractC29263f) {
                abstractC29263f = (AbstractC29263f) obj;
            } else {
                abstractC29263f = null;
            }
            if (abstractC29263f == null) {
                return;
            }
            m48760KM().m96282i0(abstractC29263f);
            m48761LM().m96352D0(abstractC29263f);
            if (abstractC29263f instanceof AbstractC29263f.g) {
                if (!((AbstractC29263f.g) abstractC29263f).m146189c()) {
                    close();
                    return;
                }
                return;
            }
            long j11 = 0;
            if (abstractC29263f instanceof AbstractC29263f.i) {
                C29259b m96380u0 = m48761LM().m96380u0();
                if (m96380u0 != null) {
                    j11 = m96380u0.m146158m();
                }
                if (j11 == ((AbstractC29263f.i) abstractC29263f).m146191c()) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: ay.v0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProductCatalogBottomSheetView.m48756GM(ProductCatalogBottomSheetView.this);
                        }
                    });
                    return;
                }
                return;
            }
            if (abstractC29263f instanceof AbstractC29263f.k) {
                C29259b m96380u02 = m48761LM().m96380u0();
                if (m96380u02 != null) {
                    j11 = m96380u02.m146158m();
                }
                if (j11 == ((AbstractC29263f.k) abstractC29263f).m146196e()) {
                    AbstractC19444a.m101697e(new Runnable() { // from class: ay.w0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ProductCatalogBottomSheetView.m48757HM(ProductCatalogBottomSheetView.this);
                        }
                    });
                    return;
                }
                return;
            }
            if (abstractC29263f instanceof AbstractC29263f.e) {
                AbstractC19444a.m101697e(new Runnable() { // from class: ay.x0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ProductCatalogBottomSheetView.m48758IM(ProductCatalogBottomSheetView.this, abstractC29263f);
                    }
                });
                return;
            }
            return;
        }
        super.mo17795x(i11, Arrays.copyOf(objArr, objArr.length));
    }
}
