package com.zing.zalo.feed.mvp.profile;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.feed.mvp.profile.DiscoverySkeletonView;
import com.zing.zalo.uicontrol.C16658t0;
import com.zing.zalo.uicontrol.C16666v0;
import com.zing.zalo.uidrawing.C16716d;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.uidrawing.ModulesView;
import fn0.AbstractC19074t;
import is.AbstractC20826v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;
import me0.C23212s8;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;
import qm0.AbstractC25370t;

/* loaded from: classes4.dex */
public final class DiscoverySkeletonView extends FrameLayout {

    /* renamed from: p */
    private ModulesView f46459p;

    /* renamed from: q */
    private final List f46460q;

    /* renamed from: r */
    private final float f46461r;

    /* renamed from: s */
    private final InterfaceC24854k f46462s;

    /* renamed from: t */
    private final int[] f46463t;

    /* renamed from: u */
    private final RectF f46464u;

    /* renamed from: v */
    private final Matrix f46465v;

    /* renamed from: w */
    private final C16658t0.b f46466w;

    /* renamed from: com.zing.zalo.feed.mvp.profile.DiscoverySkeletonView$a */
    /* loaded from: classes4.dex */
    public static final class ViewTreeObserverOnPreDrawListenerC8633a implements ViewTreeObserver.OnPreDrawListener {
        ViewTreeObserverOnPreDrawListenerC8633a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int min;
            DiscoverySkeletonView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            DiscoverySkeletonView discoverySkeletonView = DiscoverySkeletonView.this;
            discoverySkeletonView.getLocationOnScreen(discoverySkeletonView.getLocationOnScreen());
            int i11 = DiscoverySkeletonView.this.getLocationOnScreen()[1];
            int m118713h0 = AbstractC23136l9.m118713h0();
            Iterator<C16666v0> it = DiscoverySkeletonView.this.getSkeletonModules().iterator();
            while (true) {
                int i12 = 0;
                if (!it.hasNext()) {
                    return false;
                }
                C16666v0 next = it.next();
                int m88806g1 = next.m88806g1();
                int m89098H = next.m89098H() + i11;
                if (next.f84500H0 == 1) {
                    min = (int) Math.min(255.0f, 30 + (((m89098H * 255) * 1.0f) / m118713h0));
                } else {
                    min = Math.min(255, ((int) (255 * (1 - ((m89098H * 1.0f) / m118713h0)))) + 30);
                }
                if (min >= 0) {
                    i12 = min;
                }
                next.m88811l1(Color.argb(i12, Color.red(m88806g1), Color.green(m88806g1), Color.blue(m88806g1)));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiscoverySkeletonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        this.f46460q = new ArrayList();
        this.f46461r = AbstractC23222t7.f112566j;
        m129210a = AbstractC24856m.m129210a(new C8661a(this));
        this.f46462s = m129210a;
        this.f46463t = new int[2];
        this.f46464u = new RectF();
        this.f46465v = new Matrix();
        this.f46466w = new C16658t0.b() { // from class: iq.k
            @Override // com.zing.zalo.uicontrol.C16658t0.b
            /* renamed from: a */
            public final void mo44637a(C16658t0 c16658t0, RectF rectF) {
                DiscoverySkeletonView.m45972d(DiscoverySkeletonView.this, c16658t0, rectF);
            }
        };
        m45973b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m45972d(DiscoverySkeletonView discoverySkeletonView, C16658t0 c16658t0, RectF rectF) {
        AbstractC19074t.m100208f(discoverySkeletonView, "this$0");
        discoverySkeletonView.getLocationOnScreen(discoverySkeletonView.f46463t);
        discoverySkeletonView.f46464u.setEmpty();
        discoverySkeletonView.f46465v.reset();
        Matrix matrix = discoverySkeletonView.f46465v;
        int[] iArr = discoverySkeletonView.f46463t;
        matrix.setTranslate(-iArr[0], -iArr[1]);
        discoverySkeletonView.f46465v.mapRect(discoverySkeletonView.f46464u, rectF);
        Iterator it = discoverySkeletonView.f46460q.iterator();
        while (it.hasNext()) {
            ((C16666v0) it.next()).m88810k1(discoverySkeletonView.f46464u, discoverySkeletonView.getShimmerHelper().m88776b());
        }
        if (!AbstractC20826v0.m108836t0(discoverySkeletonView)) {
            discoverySkeletonView.getShimmerHelper().m88785k();
        }
    }

    /* renamed from: b */
    public final void m45973b() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        setBackgroundColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
        this.f46459p = new ModulesView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        ModulesView modulesView = this.f46459p;
        if (modulesView == null) {
            AbstractC19074t.m100223u("modulesView");
            modulesView = null;
        }
        addView(modulesView, layoutParams);
        m45974c();
        Rect rect = new Rect();
        int m118722k0 = AbstractC23136l9.m118722k0();
        getShimmerHelper().m88783i(m118722k0);
        rect.set((-m118722k0) / 2, 0, AbstractC23136l9.m118722k0() + (m118722k0 / 2), AbstractC23136l9.m118713h0());
        getShimmerHelper().m88777c((int) (((m118722k0 / AbstractC23136l9.m118722k0()) + 1.0f) * 1200), 200);
        getShimmerHelper().m88778d(rect);
        getShimmerHelper().m88782h(this.f46466w);
        getShimmerHelper().mo88784j();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC8633a());
        getShimmerHelper().m88780f(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public final void m45974c() {
        ModulesView modulesView;
        int m131511r;
        int m119607o = C23212s8.m119607o(getContext(), AbstractC16781w.TabDiscoveryLoadingColor);
        Context context = getContext();
        C16666v0 c16666v0 = new C16666v0(context);
        c16666v0.m89106L().m89060k0(-1).m89030N(AbstractC23136l9.m118742r(56.0f)).m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112598z, AbstractC23222t7.f112586t, AbstractC23222t7.f112566j);
        c16666v0.m88807h1(this.f46461r);
        this.f46460q.add(c16666v0);
        ModulesView modulesView2 = this.f46459p;
        if (modulesView2 == null) {
            AbstractC19074t.m100223u("modulesView");
            modulesView2 = null;
        }
        modulesView2.mo69681L(c16666v0);
        ArrayList<C16716d> arrayList = new ArrayList();
        int i11 = 4;
        int m118722k0 = (AbstractC23136l9.m118722k0() - (AbstractC23222t7.f112534M * 4)) / 5;
        int i12 = 0;
        while (i12 < 2) {
            C16716d c16716d = new C16716d(context);
            c16716d.m89106L().m89060k0(-2).m89030N(-2).m89032P(0, AbstractC23222t7.f112594x, 0, 0).m89023G(c16666v0);
            arrayList.add(c16716d);
            int i13 = 0;
            C16666v0 c16666v02 = null;
            while (i13 < i11) {
                C16666v0 c16666v03 = new C16666v0(context);
                c16666v03.m89106L().m89060k0(AbstractC23222t7.f112534M).m89030N(AbstractC23222t7.f112534M).m89054h0(c16666v02).m89032P(m118722k0, 0, 0, 0);
                c16666v03.m88807h1(AbstractC23222t7.f112534M / 2);
                c16716d.m89001g1(c16666v03);
                C16666v0 c16666v04 = new C16666v0(context);
                c16666v04.m89106L().m89060k0(AbstractC23222t7.f112526H).m89030N(AbstractC23222t7.f112566j).m89023G(c16666v03).m89069v(c16666v03).m89032P(0, AbstractC23222t7.f112576o, 0, 0);
                c16666v04.m88807h1(this.f46461r);
                c16716d.m89001g1(c16666v04);
                i13++;
                c16666v02 = c16666v03;
                i11 = 4;
            }
            i12++;
            c16666v0 = c16716d;
            i11 = 4;
        }
        int i14 = 1;
        while (i14 < 3) {
            C16716d c16716d2 = new C16716d(context);
            c16716d2.m89106L().m89060k0(-1).m89030N(-2).m89032P(AbstractC23222t7.f112586t, AbstractC23222t7.f112534M, AbstractC23222t7.f112586t, AbstractC23222t7.f112534M).m89023G(c16666v0);
            arrayList.add(c16716d2);
            C16666v0 c16666v05 = new C16666v0(context);
            c16666v05.m89106L().m89060k0(AbstractC23222t7.f112549a0).m89030N(AbstractC23222t7.f112566j);
            c16666v05.m88807h1(this.f46461r);
            c16716d2.m89001g1(c16666v05);
            C16666v0 c16666v06 = new C16666v0(context);
            c16666v06.m89106L().m89060k0(AbstractC23222t7.f112514B).m89030N(AbstractC23222t7.f112566j).m89032P(AbstractC23222t7.f112572m, 0, 0, 0).m89054h0(c16666v05);
            c16666v06.m88807h1(this.f46461r);
            c16716d2.m89001g1(c16666v06);
            C16666v0 c16666v07 = new C16666v0(context);
            c16666v07.m89106L().m89060k0(-1).m89030N(AbstractC23222t7.f112591v0).m89023G(c16666v05).m89032P(0, AbstractC23222t7.f112514B, 0, 0);
            c16666v07.m88807h1(this.f46461r);
            c16716d2.m89001g1(c16666v07);
            i14++;
            c16666v0 = c16716d2;
        }
        for (C16716d c16716d3 : arrayList) {
            List list = this.f46460q;
            List modules = c16716d3.getModules();
            AbstractC19074t.m100207e(modules, "getModules(...)");
            List<C16719g> list2 = modules;
            m131511r = AbstractC25370t.m131511r(list2, 10);
            ArrayList arrayList2 = new ArrayList(m131511r);
            for (C16719g c16719g : list2) {
                AbstractC19074t.m100206d(c16719g, "null cannot be cast to non-null type com.zing.zalo.uicontrol.SkeletonModule");
                C16666v0 c16666v08 = (C16666v0) c16719g;
                c16666v08.m88811l1(m119607o);
                arrayList2.add(c16666v08);
            }
            list.addAll(arrayList2);
        }
        ModulesView modulesView3 = this.f46459p;
        if (modulesView3 == null) {
            AbstractC19074t.m100223u("modulesView");
            modulesView = null;
        } else {
            modulesView = modulesView3;
        }
        modulesView.mo69682M(arrayList);
    }

    public final float getCornerRadius() {
        return this.f46461r;
    }

    public final int[] getLocationOnScreen() {
        return this.f46463t;
    }

    public final C16658t0 getShimmerHelper() {
        return (C16658t0) this.f46462s.getValue();
    }

    public final C16658t0.b getShimmerListener() {
        return this.f46466w;
    }

    public final RectF getShimmerRect() {
        return this.f46464u;
    }

    public final Matrix getShimmerRectTransformMatrix() {
        return this.f46465v;
    }

    public final List<C16666v0> getSkeletonModules() {
        return this.f46460q;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getShimmerHelper().mo88784j();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getShimmerHelper().m88785k();
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
        if (i11 != 0) {
            getShimmerHelper().m88785k();
        } else {
            getShimmerHelper().mo88784j();
        }
    }
}
