package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import androidx.core.view.C1580n1;
import java.util.List;
import p252j1.AbstractC20900a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d */
    final Rect f34818d;

    /* renamed from: e */
    final Rect f34819e;

    /* renamed from: f */
    private int f34820f;

    /* renamed from: g */
    private int f34821g;

    public HeaderScrollingViewBehavior() {
        this.f34818d = new Rect();
        this.f34819e = new Rect();
        this.f34820f = 0;
    }

    /* renamed from: N */
    private static int m31630N(int i11) {
        if (i11 == 0) {
            return 8388659;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    /* renamed from: F */
    public void mo31631F(CoordinatorLayout coordinatorLayout, View view, int i11) {
        View mo31597H = mo31597H(coordinatorLayout.m6536x(view));
        if (mo31597H != null) {
            CoordinatorLayout.C1306e c1306e = (CoordinatorLayout.C1306e) view.getLayoutParams();
            Rect rect = this.f34818d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c1306e).leftMargin, mo31597H.getBottom() + ((ViewGroup.MarginLayoutParams) c1306e).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c1306e).rightMargin, ((coordinatorLayout.getHeight() + mo31597H.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c1306e).bottomMargin);
            C1580n1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && AbstractC1579n0.m7806D(coordinatorLayout) && !AbstractC1579n0.m7806D(view)) {
                rect.left += lastWindowInsets.m8059k();
                rect.right -= lastWindowInsets.m8060l();
            }
            Rect rect2 = this.f34819e;
            AbstractC1602t.m8181a(m31630N(c1306e.f5815c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i11);
            int m31632I = m31632I(mo31597H);
            view.layout(rect2.left, rect2.top - m31632I, rect2.right, rect2.bottom - m31632I);
            this.f34820f = rect2.top - mo31597H.getBottom();
            return;
        }
        super.mo31631F(coordinatorLayout, view, i11);
        this.f34820f = 0;
    }

    /* renamed from: H */
    abstract View mo31597H(List list);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public final int m31632I(View view) {
        if (this.f34821g == 0) {
            return 0;
        }
        float mo31598J = mo31598J(view);
        int i11 = this.f34821g;
        return AbstractC20900a.m109345b((int) (mo31598J * i11), 0, i11);
    }

    /* renamed from: J */
    float mo31598J(View view) {
        return 1.0f;
    }

    /* renamed from: K */
    public final int m31633K() {
        return this.f34821g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo31599L(View view) {
        return view.getMeasuredHeight();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public final int m31634M() {
        return this.f34820f;
    }

    /* renamed from: O */
    public final void m31635O(int i11) {
        this.f34821g = i11;
    }

    /* renamed from: P */
    protected boolean m31636P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: m */
    public boolean mo6555m(CoordinatorLayout coordinatorLayout, View view, int i11, int i12, int i13, int i14) {
        View mo31597H;
        int i15;
        C1580n1 lastWindowInsets;
        int i16 = view.getLayoutParams().height;
        if ((i16 == -1 || i16 == -2) && (mo31597H = mo31597H(coordinatorLayout.m6536x(view))) != null) {
            int size = View.MeasureSpec.getSize(i13);
            if (size > 0) {
                if (AbstractC1579n0.m7806D(mo31597H) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.m8061m() + lastWindowInsets.m8058j();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int mo31599L = size + mo31599L(mo31597H);
            int measuredHeight = mo31597H.getMeasuredHeight();
            if (m31636P()) {
                view.setTranslationY(-measuredHeight);
            } else {
                mo31599L -= measuredHeight;
            }
            if (i16 == -1) {
                i15 = 1073741824;
            } else {
                i15 = Integer.MIN_VALUE;
            }
            coordinatorLayout.m6525P(view, i11, i12, View.MeasureSpec.makeMeasureSpec(mo31599L, i15), i14);
            return true;
        }
        return false;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34818d = new Rect();
        this.f34819e = new Rect();
        this.f34820f = 0;
    }
}
