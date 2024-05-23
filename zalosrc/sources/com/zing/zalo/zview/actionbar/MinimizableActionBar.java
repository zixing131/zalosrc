package com.zing.zalo.zview.actionbar;

import android.app.Service;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.zview.AbstractC17452c;
import com.zing.zalo.zview.AbstractC17468f;
import com.zing.zalo.zview.AbstractC17484n;
import zl0.AbstractC32226c;

/* loaded from: classes7.dex */
public class MinimizableActionBar extends FrameLayout {

    /* renamed from: p */
    private final ActionBar f88879p;

    /* renamed from: q */
    private View f88880q;

    /* renamed from: r */
    int f88881r;

    public MinimizableActionBar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m92793a() {
        int i11 = this.f88881r;
        int m155409h = AbstractC32226c.m155409h(getRootView());
        this.f88881r = m155409h;
        if (m155409h != i11) {
            requestLayout();
        }
    }

    public ActionBar getActionBar() {
        return this.f88879p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m92793a();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        View view = this.f88880q;
        if (view != null && view.getVisibility() != 8) {
            View view2 = this.f88880q;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.f88880q.getMeasuredHeight());
            i15 = this.f88880q.getMeasuredHeight();
        } else {
            i15 = 0;
        }
        ActionBar actionBar = this.f88879p;
        if (actionBar != null && actionBar.getVisibility() != 8) {
            ActionBar actionBar2 = this.f88879p;
            actionBar2.layout(0, i15, actionBar2.getMeasuredWidth(), this.f88879p.getMeasuredHeight() + i15);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int size = View.MeasureSpec.getSize(i11);
        View view = this.f88880q;
        if (view != null && view.getVisibility() != 8) {
            this.f88880q.measure(i11, View.MeasureSpec.makeMeasureSpec(this.f88881r, 1073741824));
            i13 = this.f88880q.getMeasuredHeight();
        } else {
            i13 = 0;
        }
        ActionBar actionBar = this.f88879p;
        if (actionBar != null && actionBar.getVisibility() != 8) {
            measureChildWithMargins(this.f88879p, i11, 0, i12, 0);
            i13 += this.f88879p.getMeasuredHeight();
        }
        setMeasuredDimension(size, i13);
    }

    public void setStatusBarVisibility(boolean z11) {
        int i11;
        View view = this.f88880q;
        if (view != null) {
            if (z11) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    public MinimizableActionBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MinimizableActionBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f88881r = AbstractC17484n.Companion.m92931b();
        View view = new View(context);
        this.f88880q = view;
        if (context instanceof Service) {
            view.setBackgroundColor(getResources().getColor(AbstractC17452c.statusBarColor));
        }
        addView(this.f88880q);
        ActionBar actionBar = new ActionBar(context);
        this.f88879p = actionBar;
        actionBar.setId(AbstractC17468f.zalo_action_bar);
        actionBar.setOccupyStatusBar(false);
        addView(actionBar);
    }
}
