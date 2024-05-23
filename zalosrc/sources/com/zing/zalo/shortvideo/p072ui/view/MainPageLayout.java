package com.zing.zalo.shortvideo.p072ui.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.zing.zalo.shortvideo.p072ui.widget.NonSwipeableViewPager;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.Iterator;
import q10.C25006f2;
import s20.AbstractC26112n;
import v00.AbstractC27407b;

/* loaded from: classes5.dex */
public final class MainPageLayout extends FrameLayout {

    /* renamed from: p */
    private final int f52984p;

    /* renamed from: q */
    private final int f52985q;

    /* renamed from: r */
    private C25006f2 f52986r;

    /* renamed from: s */
    private ArrayList f52987s;

    /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageLayout$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC10301a {

        /* renamed from: com.zing.zalo.shortvideo.ui.view.MainPageLayout$a$a */
        /* loaded from: classes5.dex */
        public static final class a {
            /* renamed from: a */
            public static void m54523a(InterfaceC10301a interfaceC10301a, int i11) {
            }
        }

        /* renamed from: Yz */
        void mo54521Yz(int i11);

        /* renamed from: al */
        void mo54522al(int i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainPageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f52984p = AbstractC26112n.m134365F(this);
        this.f52985q = AbstractC26112n.m134433y(this, AbstractC27407b.zch_page_header_height);
        this.f52987s = new ArrayList();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        C25006f2 m129812a = C25006f2.m129812a(this);
        AbstractC19074t.m100207e(m129812a, "bind(...)");
        View view = m129812a.f119909x;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{1711276032, 436207616, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        view.setBackground(gradientDrawable);
        this.f52986r = m129812a;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        C25006f2 c25006f2 = this.f52986r;
        if (c25006f2 == null) {
            AbstractC19074t.m100223u("binding");
            c25006f2 = null;
        }
        NonSwipeableViewPager nonSwipeableViewPager = c25006f2.f119910y;
        AbstractC19074t.m100207e(nonSwipeableViewPager, "viePager");
        AbstractC26112n.m134383X(nonSwipeableViewPager, 0, 0);
        View view = c25006f2.f119909x;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134383X(view, 0, 0);
        int i15 = this.f52984p;
        LinearLayout linearLayout = c25006f2.f119907v;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        AbstractC26112n.m134383X(linearLayout, i15, 0);
        for (View view2 : this.f52987s) {
            AbstractC26112n.m134383X(view2, (getMeasuredHeight() - view2.getMeasuredHeight()) / 2, (getMeasuredWidth() - view2.getMeasuredWidth()) / 2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        C25006f2 c25006f2 = this.f52986r;
        if (c25006f2 == null) {
            AbstractC19074t.m100223u("binding");
            c25006f2 = null;
        }
        NonSwipeableViewPager nonSwipeableViewPager = c25006f2.f119910y;
        AbstractC19074t.m100207e(nonSwipeableViewPager, "viePager");
        AbstractC26112n.m134387a0(nonSwipeableViewPager, size, 1073741824, size2, 1073741824);
        View view = c25006f2.f119909x;
        AbstractC19074t.m100207e(view, "vieOverlay");
        AbstractC26112n.m134387a0(view, size, 1073741824, size2, 1073741824);
        LinearLayout linearLayout = c25006f2.f119907v;
        AbstractC19074t.m100207e(linearLayout, "lytHeader");
        AbstractC26112n.m134387a0(linearLayout, size, 1073741824, this.f52985q, 1073741824);
        Iterator it = this.f52987s.iterator();
        while (it.hasNext()) {
            ((View) it.next()).measure(i11, i12);
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f52986r != null) {
            this.f52987s.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        AbstractC19074t.m100208f(view, "child");
        if (this.f52986r != null) {
            this.f52987s.remove(view);
        }
    }
}
