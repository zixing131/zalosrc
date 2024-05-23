package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import p175g0.AbstractC19183f;
import p175g0.AbstractC19187j;

/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: p */
    private boolean f4115p;

    /* renamed from: q */
    private View f4116q;

    /* renamed from: r */
    private View f4117r;

    /* renamed from: s */
    private View f4118s;

    /* renamed from: t */
    Drawable f4119t;

    /* renamed from: u */
    Drawable f4120u;

    /* renamed from: v */
    Drawable f4121v;

    /* renamed from: w */
    boolean f4122w;

    /* renamed from: x */
    boolean f4123x;

    /* renamed from: y */
    private int f4124y;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1579n0.m7807D0(this, new C1153b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.ActionBar);
        this.f4119t = obtainStyledAttributes.getDrawable(AbstractC19187j.ActionBar_background);
        this.f4120u = obtainStyledAttributes.getDrawable(AbstractC19187j.ActionBar_backgroundStacked);
        this.f4124y = obtainStyledAttributes.getDimensionPixelSize(AbstractC19187j.ActionBar_height, -1);
        boolean z11 = true;
        if (getId() == AbstractC19183f.split_action_bar) {
            this.f4122w = true;
            this.f4121v = obtainStyledAttributes.getDrawable(AbstractC19187j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.f4122w ? this.f4119t != null || this.f4120u != null : this.f4121v != null) {
            z11 = false;
        }
        setWillNotDraw(z11);
    }

    /* renamed from: a */
    private int m5150a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: b */
    private boolean m5151b(View view) {
        if (view != null && view.getVisibility() != 8 && view.getMeasuredHeight() != 0) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4119t;
        if (drawable != null && drawable.isStateful()) {
            this.f4119t.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4120u;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4120u.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4121v;
        if (drawable3 != null && drawable3.isStateful()) {
            this.f4121v.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.f4116q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4119t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4120u;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4121v;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4117r = findViewById(AbstractC19183f.action_bar);
        this.f4118s = findViewById(AbstractC19183f.action_context_bar);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f4115p && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        Drawable drawable;
        super.onLayout(z11, i11, i12, i13, i14);
        View view = this.f4116q;
        boolean z13 = true;
        if (view != null && view.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i15 = layoutParams.bottomMargin;
            view.layout(i11, measuredHeight2 - i15, i13, measuredHeight - i15);
        }
        if (this.f4122w) {
            Drawable drawable2 = this.f4121v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                return;
            }
        } else {
            if (this.f4119t != null) {
                if (this.f4117r.getVisibility() == 0) {
                    this.f4119t.setBounds(this.f4117r.getLeft(), this.f4117r.getTop(), this.f4117r.getRight(), this.f4117r.getBottom());
                } else {
                    View view2 = this.f4118s;
                    if (view2 != null && view2.getVisibility() == 0) {
                        this.f4119t.setBounds(this.f4118s.getLeft(), this.f4118s.getTop(), this.f4118s.getRight(), this.f4118s.getBottom());
                    } else {
                        this.f4119t.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z13 = false;
            }
            this.f4123x = z12;
            if (z12 && (drawable = this.f4120u) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else if (!z13) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        if (this.f4117r == null && View.MeasureSpec.getMode(i12) == Integer.MIN_VALUE && (i15 = this.f4124y) >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i15, View.MeasureSpec.getSize(i12)), Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
        if (this.f4117r == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i12);
        View view = this.f4116q;
        if (view != null && view.getVisibility() != 8 && mode != 1073741824) {
            if (!m5151b(this.f4117r)) {
                i13 = m5150a(this.f4117r);
            } else if (!m5151b(this.f4118s)) {
                i13 = m5150a(this.f4118s);
            } else {
                i13 = 0;
            }
            if (mode == Integer.MIN_VALUE) {
                i14 = View.MeasureSpec.getSize(i12);
            } else {
                i14 = Integer.MAX_VALUE;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(i13 + m5150a(this.f4116q), i14));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4119t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4119t);
        }
        this.f4119t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4117r;
            if (view != null) {
                this.f4119t.setBounds(view.getLeft(), this.f4117r.getTop(), this.f4117r.getRight(), this.f4117r.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f4122w ? !(this.f4119t != null || this.f4120u != null) : this.f4121v == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4121v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4121v);
        }
        this.f4121v = drawable;
        boolean z11 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4122w && (drawable2 = this.f4121v) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4122w ? !(this.f4119t != null || this.f4120u != null) : this.f4121v == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4120u;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4120u);
        }
        this.f4120u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4123x && (drawable2 = this.f4120u) != null) {
                drawable2.setBounds(this.f4116q.getLeft(), this.f4116q.getTop(), this.f4116q.getRight(), this.f4116q.getBottom());
            }
        }
        boolean z11 = false;
        if (!this.f4122w ? !(this.f4119t != null || this.f4120u != null) : this.f4121v == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.f4116q;
        if (view != null) {
            removeView(view);
        }
        this.f4116q = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z11) {
        int i11;
        this.f4115p = z11;
        if (z11) {
            i11 = 393216;
        } else {
            i11 = 262144;
        }
        setDescendantFocusability(i11);
    }

    @Override // android.view.View
    public void setVisibility(int i11) {
        boolean z11;
        super.setVisibility(i11);
        if (i11 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Drawable drawable = this.f4119t;
        if (drawable != null) {
            drawable.setVisible(z11, false);
        }
        Drawable drawable2 = this.f4120u;
        if (drawable2 != null) {
            drawable2.setVisible(z11, false);
        }
        Drawable drawable3 = this.f4121v;
        if (drawable3 != null) {
            drawable3.setVisible(z11, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if ((drawable == this.f4119t && !this.f4122w) || ((drawable == this.f4120u && this.f4123x) || ((drawable == this.f4121v && this.f4122w) || super.verifyDrawable(drawable)))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i11) {
        if (i11 != 0) {
            return super.startActionModeForChild(view, callback, i11);
        }
        return null;
    }
}
