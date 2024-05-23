package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.C1211t1;
import com.google.android.material.internal.AbstractC6355v;
import com.google.android.material.navigation.NavigationBarView;
import p357n6.AbstractC23577b;
import p357n6.AbstractC23579d;
import p357n6.AbstractC23586k;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class NavigationRailView extends NavigationBarView {

    /* renamed from: u */
    private final int f35682u;

    /* renamed from: v */
    private View f35683v;

    public NavigationRailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC23577b.navigationRailStyle);
    }

    private NavigationRailMenuView getNavigationRailMenuView() {
        return (NavigationRailMenuView) getMenuView();
    }

    /* renamed from: j */
    private boolean m32708j() {
        View view = this.f35683v;
        if (view != null && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    private int m32709k(int i11) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumWidth > 0) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), suggestedMinimumWidth + getPaddingLeft() + getPaddingRight()), 1073741824);
        }
        return i11;
    }

    /* renamed from: g */
    public void m32710g(int i11) {
        m32711h(LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) this, false));
    }

    public View getHeaderView() {
        return this.f35683v;
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    /* renamed from: h */
    public void m32711h(View view) {
        m32713l();
        this.f35683v = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f35682u;
        addView(view, 0, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public NavigationRailMenuView mo31823e(Context context) {
        return new NavigationRailMenuView(context);
    }

    /* renamed from: l */
    public void m32713l() {
        View view = this.f35683v;
        if (view != null) {
            removeView(view);
            this.f35683v = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        NavigationRailMenuView navigationRailMenuView = getNavigationRailMenuView();
        int i15 = 0;
        if (m32708j()) {
            int bottom = this.f35683v.getBottom() + this.f35682u;
            int top = navigationRailMenuView.getTop();
            if (top < bottom) {
                i15 = bottom - top;
            }
        } else if (navigationRailMenuView.m32707l()) {
            i15 = this.f35682u;
        }
        if (i15 > 0) {
            navigationRailMenuView.layout(navigationRailMenuView.getLeft(), navigationRailMenuView.getTop() + i15, navigationRailMenuView.getRight(), navigationRailMenuView.getBottom() + i15);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m32709k = m32709k(i11);
        super.onMeasure(m32709k, i12);
        if (m32708j()) {
            measureChild(getNavigationRailMenuView(), m32709k, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f35683v.getMeasuredHeight()) - this.f35682u, Integer.MIN_VALUE));
        }
    }

    public void setMenuGravity(int i11) {
        getNavigationRailMenuView().setMenuGravity(i11);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, AbstractC23586k.Widget_MaterialComponents_NavigationRailView);
    }

    public NavigationRailView(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.f35682u = getResources().getDimensionPixelSize(AbstractC23579d.mtrl_navigation_rail_margin);
        C1211t1 m32640i = AbstractC6355v.m32640i(getContext(), attributeSet, AbstractC23587l.NavigationRailView, i11, i12, new int[0]);
        int m5730n = m32640i.m5730n(AbstractC23587l.NavigationRailView_headerLayout, 0);
        if (m5730n != 0) {
            m32710g(m5730n);
        }
        setMenuGravity(m32640i.m5727k(AbstractC23587l.NavigationRailView_menuGravity, 49));
        m32640i.m5736w();
    }
}
