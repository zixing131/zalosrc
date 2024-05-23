package com.zing.zalo.uicontrol;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.zview.AbstractC17484n;

/* loaded from: classes4.dex */
public class MainTabFrameLayout extends FrameLayout {

    /* renamed from: p */
    private View f83194p;

    /* renamed from: q */
    private View f83195q;

    /* renamed from: r */
    private View f83196r;

    /* renamed from: s */
    boolean f83197s;

    /* renamed from: t */
    boolean f83198t;

    /* renamed from: u */
    boolean f83199u;

    /* renamed from: v */
    VelocityTracker f83200v;

    /* renamed from: w */
    boolean f83201w;

    /* renamed from: x */
    int f83202x;

    /* renamed from: y */
    ValueAnimator.AnimatorUpdateListener f83203y;

    /* renamed from: z */
    Runnable f83204z;

    /* renamed from: com.zing.zalo.uicontrol.MainTabFrameLayout$a */
    /* loaded from: classes4.dex */
    class C16460a implements ValueAnimator.AnimatorUpdateListener {
        C16460a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((Float) valueAnimator.getAnimatedValue()).floatValue();
            MainTabFrameLayout.this.getClass();
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MainTabFrameLayout$b */
    /* loaded from: classes4.dex */
    class RunnableC16461b implements Runnable {
        RunnableC16461b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MainTabFrameLayout mainTabFrameLayout = MainTabFrameLayout.this;
            mainTabFrameLayout.f83198t = false;
            mainTabFrameLayout.f83197s = false;
            mainTabFrameLayout.f83199u = false;
        }
    }

    /* renamed from: com.zing.zalo.uicontrol.MainTabFrameLayout$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC16462c {
    }

    public MainTabFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83201w = false;
        this.f83202x = 0;
        this.f83203y = new C16460a();
        this.f83204z = new RunnableC16461b();
    }

    public int getBottomSpacing() {
        return this.f83202x;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f83194p = findViewById(AbstractC6918a0.sliding_tabs);
        this.f83195q = findViewById(AbstractC6918a0.pager);
        this.f83196r = findViewById(AbstractC6918a0.zalo_action_bar);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f83199u && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0076  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int m92931b;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int childCount = getChildCount();
        if (this.f83196r.getVisibility() != 8) {
            m92931b = this.f83196r.getMeasuredHeight();
        } else {
            m92931b = AbstractC17484n.Companion.m92931b();
        }
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i23 = layoutParams.gravity;
                if (i23 == -1) {
                    i23 = 51;
                }
                int i24 = i23 & 112;
                int i25 = i23 & 7;
                if (i25 != 1) {
                    if (i25 != 5) {
                        i17 = layoutParams.leftMargin;
                        if (i24 == 16) {
                            if (i24 != 48) {
                                if (i24 != 80) {
                                    i21 = layoutParams.topMargin;
                                } else {
                                    i18 = (i14 - i12) - measuredHeight;
                                    i19 = layoutParams.bottomMargin;
                                }
                            } else {
                                i21 = layoutParams.topMargin;
                            }
                            if (childAt == this.f83194p) {
                                i21 = ((i14 - i12) - measuredHeight) - layoutParams.bottomMargin;
                            } else if (childAt == this.f83195q) {
                                i21 += m92931b;
                            }
                            childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                        } else {
                            i18 = (((i14 - i12) - measuredHeight) / 2) + layoutParams.topMargin;
                            i19 = layoutParams.bottomMargin;
                        }
                        i21 = i18 - i19;
                        if (childAt == this.f83194p) {
                        }
                        childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
                    } else {
                        i15 = i13 - measuredWidth;
                        i16 = layoutParams.rightMargin;
                    }
                } else {
                    i15 = (((i13 - i11) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i16 = layoutParams.rightMargin;
                }
                i17 = i15 - i16;
                if (i24 == 16) {
                }
                i21 = i18 - i19;
                if (childAt == this.f83194p) {
                }
                childAt.layout(i17, i21, measuredWidth + i17, measuredHeight + i21);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int m92931b;
        if (getChildCount() > 0) {
            int size = View.MeasureSpec.getSize(i11);
            int size2 = View.MeasureSpec.getSize(i12);
            setMeasuredDimension(size, size2);
            int childCount = getChildCount();
            View view = this.f83196r;
            if (view != null && view.getVisibility() != 8) {
                measureChildWithMargins(this.f83196r, i11, 0, i12, 0);
                m92931b = this.f83196r.getMeasuredHeight();
            } else {
                m92931b = AbstractC17484n.Companion.m92931b();
            }
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getVisibility() != 8 && childAt != this.f83196r) {
                    if (childAt == this.f83194p) {
                        measureChildWithMargins(childAt, i11, 0, i12, 0);
                    } else if (childAt == this.f83195q) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((size2 - m92931b) - getResources().getDimensionPixelSize(AbstractC16802y.height_tab_main)) - this.f83202x, 1073741824));
                    } else {
                        measureChildWithMargins(childAt, i11, 0, i12, 0);
                    }
                }
            }
            return;
        }
        super.onMeasure(i11, i12);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f83199u) {
            return false;
        }
        if (getChildCount() > 0) {
            this.f83197s = false;
            this.f83198t = false;
            VelocityTracker velocityTracker = this.f83200v;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f83200v = null;
            }
        }
        return this.f83198t;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z11) {
        onTouchEvent(null);
        super.requestDisallowInterceptTouchEvent(z11);
    }

    public void setBottomSpacing(int i11) {
        if (this.f83202x != i11) {
            this.f83202x = i11;
            requestLayout();
        }
    }

    public void setSlidingListener(InterfaceC16462c interfaceC16462c) {
    }
}
