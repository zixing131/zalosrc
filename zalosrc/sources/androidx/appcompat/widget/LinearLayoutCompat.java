package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import p175g0.AbstractC19187j;

/* loaded from: classes2.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: A */
    private int f4324A;

    /* renamed from: B */
    private int f4325B;

    /* renamed from: C */
    private int f4326C;

    /* renamed from: D */
    private int f4327D;

    /* renamed from: p */
    private boolean f4328p;

    /* renamed from: q */
    private int f4329q;

    /* renamed from: r */
    private int f4330r;

    /* renamed from: s */
    private int f4331s;

    /* renamed from: t */
    private int f4332t;

    /* renamed from: u */
    private int f4333u;

    /* renamed from: v */
    private float f4334v;

    /* renamed from: w */
    private boolean f4335w;

    /* renamed from: x */
    private int[] f4336x;

    /* renamed from: y */
    private int[] f4337y;

    /* renamed from: z */
    private Drawable f4338z;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: C */
    private void m5271C(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    /* renamed from: k */
    private void m5272k(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i13 = 0; i13 < i11; i13++) {
            View m5283u = m5283u(i13);
            if (m5283u.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).width;
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = m5283u.getMeasuredWidth();
                    measureChildWithMargins(m5283u, i12, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i14;
                }
            }
        }
    }

    /* renamed from: l */
    private void m5273l(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i13 = 0; i13 < i11; i13++) {
            View m5283u = m5283u(i13);
            if (m5283u.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = m5283u.getMeasuredHeight();
                    measureChildWithMargins(m5283u, makeMeasureSpec, 0, i12, 0);
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i14;
                }
            }
        }
    }

    /* renamed from: A */
    int m5274A(int i11) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x031b, code lost:            if (((android.view.ViewGroup.MarginLayoutParams) r14).width == (-1)) goto L148;     */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m5275B(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z11;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i31;
        View view;
        int i32;
        boolean z12;
        this.f4333u = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int i33 = this.f4329q;
        boolean z13 = this.f4335w;
        float f11 = 0.0f;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        boolean z14 = false;
        boolean z15 = true;
        boolean z16 = false;
        while (true) {
            int i41 = 8;
            int i42 = i37;
            if (i39 < virtualChildCount) {
                View m5283u = m5283u(i39);
                if (m5283u == null) {
                    this.f4333u += m5274A(i39);
                    i26 = mode2;
                    i37 = i42;
                    i28 = virtualChildCount;
                } else {
                    int i43 = i34;
                    if (m5283u.getVisibility() == 8) {
                        i39 += m5280q(m5283u, i39);
                        i37 = i42;
                        i34 = i43;
                        i28 = virtualChildCount;
                        i26 = mode2;
                    } else {
                        if (m5284v(i39)) {
                            this.f4333u += this.f4325B;
                        }
                        LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                        float f12 = layoutParams.f4339a;
                        float f13 = f11 + f12;
                        if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) layoutParams).height == 0 && f12 > 0.0f) {
                            int i44 = this.f4333u;
                            this.f4333u = Math.max(i44, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + i44 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                            i32 = i36;
                            view = m5283u;
                            i29 = i38;
                            i24 = i43;
                            i25 = i35;
                            z14 = true;
                            i26 = mode2;
                            i27 = i42;
                            i28 = virtualChildCount;
                            i31 = i39;
                        } else {
                            int i45 = i35;
                            if (((ViewGroup.MarginLayoutParams) layoutParams).height == 0 && f12 > 0.0f) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                                i22 = 0;
                            } else {
                                i22 = Integer.MIN_VALUE;
                            }
                            if (f13 == 0.0f) {
                                i23 = this.f4333u;
                            } else {
                                i23 = 0;
                            }
                            i24 = i43;
                            int i46 = i22;
                            i25 = i45;
                            int i47 = i36;
                            i26 = mode2;
                            i27 = i42;
                            i28 = virtualChildCount;
                            i29 = i38;
                            i31 = i39;
                            m5287y(m5283u, i39, i11, 0, i12, i23);
                            if (i46 != Integer.MIN_VALUE) {
                                ((ViewGroup.MarginLayoutParams) layoutParams).height = i46;
                            }
                            int measuredHeight = m5283u.getMeasuredHeight();
                            int i48 = this.f4333u;
                            view = m5283u;
                            this.f4333u = Math.max(i48, i48 + measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + m5282s(view));
                            if (z13) {
                                i32 = Math.max(measuredHeight, i47);
                            } else {
                                i32 = i47;
                            }
                        }
                        if (i33 >= 0 && i33 == i31 + 1) {
                            this.f4330r = this.f4333u;
                        }
                        if (i31 < i33 && layoutParams.f4339a > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        if (mode != 1073741824 && ((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                            z12 = true;
                            z16 = true;
                        } else {
                            z12 = false;
                        }
                        int i49 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        int measuredWidth = view.getMeasuredWidth() + i49;
                        int max = Math.max(i25, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i24, view.getMeasuredState());
                        if (z15 && ((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (layoutParams.f4339a > 0.0f) {
                            if (!z12) {
                                i49 = measuredWidth;
                            }
                            i37 = Math.max(i27, i49);
                        } else {
                            if (!z12) {
                                i49 = measuredWidth;
                            }
                            i29 = Math.max(i29, i49);
                            i37 = i27;
                        }
                        int m5280q = m5280q(view, i31) + i31;
                        i36 = i32;
                        i35 = max;
                        f11 = f13;
                        i38 = i29;
                        i39 = m5280q;
                        i34 = combineMeasuredStates;
                    }
                }
                i39++;
                virtualChildCount = i28;
                mode2 = i26;
            } else {
                int i51 = i34;
                int i52 = i36;
                int i53 = i38;
                int i54 = mode2;
                int i55 = i35;
                int i56 = virtualChildCount;
                if (this.f4333u > 0) {
                    i13 = i56;
                    if (m5284v(i13)) {
                        this.f4333u += this.f4325B;
                    }
                } else {
                    i13 = i56;
                }
                if (z13 && (i54 == Integer.MIN_VALUE || i54 == 0)) {
                    this.f4333u = 0;
                    int i57 = 0;
                    while (i57 < i13) {
                        View m5283u2 = m5283u(i57);
                        if (m5283u2 == null) {
                            this.f4333u += m5274A(i57);
                        } else if (m5283u2.getVisibility() == i41) {
                            i57 += m5280q(m5283u2, i57);
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) m5283u2.getLayoutParams();
                            int i58 = this.f4333u;
                            this.f4333u = Math.max(i58, i58 + i52 + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + m5282s(m5283u2));
                        }
                        i57++;
                        i41 = 8;
                    }
                }
                int paddingTop = this.f4333u + getPaddingTop() + getPaddingBottom();
                this.f4333u = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, 0);
                int i59 = (16777215 & resolveSizeAndState) - this.f4333u;
                if (!z14 && (i59 == 0 || f11 <= 0.0f)) {
                    i16 = Math.max(i53, i42);
                    if (z13 && i54 != 1073741824) {
                        for (int i61 = 0; i61 < i13; i61++) {
                            View m5283u3 = m5283u(i61);
                            if (m5283u3 != null && m5283u3.getVisibility() != 8 && ((LayoutParams) m5283u3.getLayoutParams()).f4339a > 0.0f) {
                                m5283u3.measure(View.MeasureSpec.makeMeasureSpec(m5283u3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i52, 1073741824));
                            }
                        }
                    }
                    i15 = i11;
                    i14 = i51;
                } else {
                    float f14 = this.f4334v;
                    if (f14 > 0.0f) {
                        f11 = f14;
                    }
                    this.f4333u = 0;
                    int i62 = i59;
                    int i63 = i53;
                    i14 = i51;
                    int i64 = 0;
                    while (i64 < i13) {
                        View m5283u4 = m5283u(i64);
                        if (m5283u4.getVisibility() == 8) {
                            i17 = i62;
                        } else {
                            LayoutParams layoutParams3 = (LayoutParams) m5283u4.getLayoutParams();
                            float f15 = layoutParams3.f4339a;
                            if (f15 > 0.0f) {
                                int i65 = (int) ((i62 * f15) / f11);
                                float f16 = f11 - f15;
                                i17 = i62 - i65;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).width);
                                if (((ViewGroup.MarginLayoutParams) layoutParams3).height == 0) {
                                    i21 = 1073741824;
                                    if (i54 == 1073741824) {
                                        if (i65 <= 0) {
                                            i65 = 0;
                                        }
                                        m5283u4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i65, 1073741824));
                                        i14 = View.combineMeasuredStates(i14, m5283u4.getMeasuredState() & (-256));
                                        f11 = f16;
                                    }
                                } else {
                                    i21 = 1073741824;
                                }
                                int measuredHeight2 = m5283u4.getMeasuredHeight() + i65;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                m5283u4.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i21));
                                i14 = View.combineMeasuredStates(i14, m5283u4.getMeasuredState() & (-256));
                                f11 = f16;
                            } else {
                                i17 = i62;
                            }
                            int i66 = ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin;
                            int measuredWidth2 = m5283u4.getMeasuredWidth() + i66;
                            i55 = Math.max(i55, measuredWidth2);
                            float f17 = f11;
                            if (mode != 1073741824) {
                                i18 = i14;
                                i19 = -1;
                            } else {
                                i18 = i14;
                                i19 = -1;
                            }
                            i66 = measuredWidth2;
                            int max2 = Math.max(i63, i66);
                            if (z15 && ((ViewGroup.MarginLayoutParams) layoutParams3).width == i19) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int i67 = this.f4333u;
                            this.f4333u = Math.max(i67, m5283u4.getMeasuredHeight() + i67 + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin + m5282s(m5283u4));
                            z15 = z11;
                            i14 = i18;
                            i63 = max2;
                            f11 = f17;
                        }
                        i64++;
                        i62 = i17;
                    }
                    i15 = i11;
                    this.f4333u += getPaddingTop() + getPaddingBottom();
                    i16 = i63;
                }
                if (z15 || mode == 1073741824) {
                    i16 = i55;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i16 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i15, i14), resolveSizeAndState);
                if (z16) {
                    m5273l(i13, i12);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: f */
    void m5276f(Canvas canvas) {
        int right;
        int left;
        int i11;
        int left2;
        int virtualChildCount = getVirtualChildCount();
        boolean m5459b = AbstractC1152a2.m5459b(this);
        for (int i12 = 0; i12 < virtualChildCount; i12++) {
            View m5283u = m5283u(i12);
            if (m5283u != null && m5283u.getVisibility() != 8 && m5284v(i12)) {
                LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                if (m5459b) {
                    left2 = m5283u.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                } else {
                    left2 = (m5283u.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f4324A;
                }
                m5279j(canvas, left2);
            }
        }
        if (m5284v(virtualChildCount)) {
            View m5283u2 = m5283u(virtualChildCount - 1);
            if (m5283u2 == null) {
                if (m5459b) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i11 = this.f4324A;
                    right = left - i11;
                }
            } else {
                LayoutParams layoutParams2 = (LayoutParams) m5283u2.getLayoutParams();
                if (m5459b) {
                    left = m5283u2.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin;
                    i11 = this.f4324A;
                    right = left - i11;
                } else {
                    right = m5283u2.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                }
            }
            m5279j(canvas, right);
        }
    }

    /* renamed from: g */
    void m5277g(Canvas canvas) {
        int bottom;
        int virtualChildCount = getVirtualChildCount();
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View m5283u = m5283u(i11);
            if (m5283u != null && m5283u.getVisibility() != 8 && m5284v(i11)) {
                m5278i(canvas, (m5283u.getTop() - ((ViewGroup.MarginLayoutParams) ((LayoutParams) m5283u.getLayoutParams())).topMargin) - this.f4325B);
            }
        }
        if (m5284v(virtualChildCount)) {
            View m5283u2 = m5283u(virtualChildCount - 1);
            if (m5283u2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.f4325B;
            } else {
                bottom = m5283u2.getBottom() + ((ViewGroup.MarginLayoutParams) ((LayoutParams) m5283u2.getLayoutParams())).bottomMargin;
            }
            m5278i(canvas, bottom);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i11;
        if (this.f4329q < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i12 = this.f4329q;
        if (childCount > i12) {
            View childAt = getChildAt(i12);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f4329q == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i13 = this.f4330r;
            if (this.f4331s == 1 && (i11 = this.f4332t & 112) != 48) {
                if (i11 != 16) {
                    if (i11 == 80) {
                        i13 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f4333u;
                    }
                } else {
                    i13 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f4333u) / 2;
                }
            }
            return i13 + ((ViewGroup.MarginLayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f4329q;
    }

    public Drawable getDividerDrawable() {
        return this.f4338z;
    }

    public int getDividerPadding() {
        return this.f4327D;
    }

    public int getDividerWidth() {
        return this.f4324A;
    }

    public int getGravity() {
        return this.f4332t;
    }

    public int getOrientation() {
        return this.f4331s;
    }

    public int getShowDividers() {
        return this.f4326C;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f4334v;
    }

    /* renamed from: i */
    void m5278i(Canvas canvas, int i11) {
        this.f4338z.setBounds(getPaddingLeft() + this.f4327D, i11, (getWidth() - getPaddingRight()) - this.f4327D, this.f4325B + i11);
        this.f4338z.draw(canvas);
    }

    /* renamed from: j */
    void m5279j(Canvas canvas, int i11) {
        this.f4338z.setBounds(i11, getPaddingTop() + this.f4327D, this.f4324A + i11, (getHeight() - getPaddingBottom()) - this.f4327D);
        this.f4338z.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        int i11 = this.f4331s;
        if (i11 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i11 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f4338z == null) {
            return;
        }
        if (this.f4331s == 1) {
            m5277g(canvas);
        } else {
            m5276f(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f4331s == 1) {
            m5286x(i11, i12, i13, i14);
        } else {
            m5285w(i11, i12, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        if (this.f4331s == 1) {
            m5275B(i11, i12);
        } else {
            m5288z(i11, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: q */
    int m5280q(View view, int i11) {
        return 0;
    }

    /* renamed from: r */
    int m5281r(View view) {
        return 0;
    }

    /* renamed from: s */
    int m5282s(View view) {
        return 0;
    }

    public void setBaselineAligned(boolean z11) {
        this.f4328p = z11;
    }

    public void setBaselineAlignedChildIndex(int i11) {
        if (i11 >= 0 && i11 < getChildCount()) {
            this.f4329q = i11;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f4338z) {
            return;
        }
        this.f4338z = drawable;
        boolean z11 = false;
        if (drawable != null) {
            this.f4324A = drawable.getIntrinsicWidth();
            this.f4325B = drawable.getIntrinsicHeight();
        } else {
            this.f4324A = 0;
            this.f4325B = 0;
        }
        if (drawable == null) {
            z11 = true;
        }
        setWillNotDraw(z11);
        requestLayout();
    }

    public void setDividerPadding(int i11) {
        this.f4327D = i11;
    }

    public void setGravity(int i11) {
        if (this.f4332t != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= 8388611;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f4332t = i11;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i11) {
        int i12 = i11 & 8388615;
        int i13 = this.f4332t;
        if ((8388615 & i13) != i12) {
            this.f4332t = i12 | ((-8388616) & i13);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z11) {
        this.f4335w = z11;
    }

    public void setOrientation(int i11) {
        if (this.f4331s != i11) {
            this.f4331s = i11;
            requestLayout();
        }
    }

    public void setShowDividers(int i11) {
        if (i11 != this.f4326C) {
            requestLayout();
        }
        this.f4326C = i11;
    }

    public void setVerticalGravity(int i11) {
        int i12 = i11 & 112;
        int i13 = this.f4332t;
        if ((i13 & 112) != i12) {
            this.f4332t = i12 | (i13 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f11) {
        this.f4334v = Math.max(0.0f, f11);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    View m5283u(int i11) {
        return getChildAt(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: v */
    public boolean m5284v(int i11) {
        if (i11 == 0) {
            if ((this.f4326C & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i11 == getChildCount()) {
            if ((this.f4326C & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.f4326C & 2) == 0) {
            return false;
        }
        for (int i12 = i11 - 1; i12 >= 0; i12--) {
            if (getChildAt(i12).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ec  */
    /* renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m5285w(int i11, int i12, int i13, int i14) {
        int paddingLeft;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean m5459b = AbstractC1152a2.m5459b(this);
        int paddingTop = getPaddingTop();
        int i25 = i14 - i12;
        int paddingBottom = i25 - getPaddingBottom();
        int paddingBottom2 = (i25 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i26 = this.f4332t;
        int i27 = i26 & 112;
        boolean z11 = this.f4328p;
        int[] iArr = this.f4336x;
        int[] iArr2 = this.f4337y;
        int m8182b = AbstractC1602t.m8182b(8388615 & i26, AbstractC1579n0.m7812G(this));
        if (m8182b != 1) {
            if (m8182b != 5) {
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = ((getPaddingLeft() + i13) - i11) - this.f4333u;
            }
        } else {
            paddingLeft = getPaddingLeft() + (((i13 - i11) - this.f4333u) / 2);
        }
        if (m5459b) {
            i15 = virtualChildCount - 1;
            i16 = -1;
        } else {
            i15 = 0;
            i16 = 1;
        }
        int i28 = 0;
        while (i28 < virtualChildCount) {
            int i29 = i15 + (i16 * i28);
            View m5283u = m5283u(i29);
            if (m5283u == null) {
                paddingLeft += m5274A(i29);
            } else if (m5283u.getVisibility() != 8) {
                int measuredWidth = m5283u.getMeasuredWidth();
                int measuredHeight = m5283u.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                int i31 = i28;
                if (z11) {
                    i17 = virtualChildCount;
                    if (((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                        i18 = m5283u.getBaseline();
                        i19 = layoutParams.f4340b;
                        if (i19 < 0) {
                            i19 = i27;
                        }
                        i21 = i19 & 112;
                        i22 = i27;
                        if (i21 == 16) {
                            if (i21 != 48) {
                                if (i21 != 80) {
                                    i23 = paddingTop;
                                } else {
                                    i23 = (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                                    if (i18 != -1) {
                                        i23 -= iArr2[2] - (m5283u.getMeasuredHeight() - i18);
                                    }
                                }
                            } else {
                                i23 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                                if (i18 != -1) {
                                    i23 += iArr[1] - i18;
                                }
                            }
                        } else {
                            i23 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        if (m5284v(i29)) {
                            paddingLeft += this.f4324A;
                        }
                        int i32 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                        i24 = paddingTop;
                        m5271C(m5283u, i32 + m5281r(m5283u), i23, measuredWidth, measuredHeight);
                        int m5282s = i32 + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + m5282s(m5283u);
                        i28 = i31 + m5280q(m5283u, i29);
                        paddingLeft = m5282s;
                        i28++;
                        virtualChildCount = i17;
                        i27 = i22;
                        paddingTop = i24;
                    }
                } else {
                    i17 = virtualChildCount;
                }
                i18 = -1;
                i19 = layoutParams.f4340b;
                if (i19 < 0) {
                }
                i21 = i19 & 112;
                i22 = i27;
                if (i21 == 16) {
                }
                if (m5284v(i29)) {
                }
                int i322 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                i24 = paddingTop;
                m5271C(m5283u, i322 + m5281r(m5283u), i23, measuredWidth, measuredHeight);
                int m5282s2 = i322 + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + m5282s(m5283u);
                i28 = i31 + m5280q(m5283u, i29);
                paddingLeft = m5282s2;
                i28++;
                virtualChildCount = i17;
                i27 = i22;
                paddingTop = i24;
            }
            i24 = paddingTop;
            i17 = virtualChildCount;
            i22 = i27;
            i28++;
            virtualChildCount = i17;
            i27 = i22;
            paddingTop = i24;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m5286x(int i11, int i12, int i13, int i14) {
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i13 - i11;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i19 = this.f4332t;
        int i21 = i19 & 112;
        int i22 = i19 & 8388615;
        if (i21 != 16) {
            if (i21 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i14) - i12) - this.f4333u;
            }
        } else {
            paddingTop = getPaddingTop() + (((i14 - i12) - this.f4333u) / 2);
        }
        int i23 = 0;
        while (i23 < virtualChildCount) {
            View m5283u = m5283u(i23);
            if (m5283u == null) {
                paddingTop += m5274A(i23);
            } else if (m5283u.getVisibility() != 8) {
                int measuredWidth = m5283u.getMeasuredWidth();
                int measuredHeight = m5283u.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                int i24 = layoutParams.f4340b;
                if (i24 < 0) {
                    i24 = i22;
                }
                int m8182b = AbstractC1602t.m8182b(i24, AbstractC1579n0.m7812G(this)) & 7;
                if (m8182b != 1) {
                    if (m8182b != 5) {
                        i17 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                        int i25 = i17;
                        if (m5284v(i23)) {
                            paddingTop += this.f4325B;
                        }
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        m5271C(m5283u, i25, i26 + m5281r(m5283u), measuredWidth, measuredHeight);
                        int m5282s = i26 + measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + m5282s(m5283u);
                        i23 += m5280q(m5283u, i23);
                        paddingTop = m5282s;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    }
                } else {
                    i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    i16 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                i17 = i15 - i16;
                int i252 = i17;
                if (m5284v(i23)) {
                }
                int i262 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                m5271C(m5283u, i252, i262 + m5281r(m5283u), measuredWidth, measuredHeight);
                int m5282s2 = i262 + measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + m5282s(m5283u);
                i23 += m5280q(m5283u, i23);
                paddingTop = m5282s2;
            }
            i23++;
        }
    }

    /* renamed from: y */
    void m5287y(View view, int i11, int i12, int i13, int i14, int i15) {
        measureChildWithMargins(view, i12, i13, i14, i15);
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d5  */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void m5288z(int i11, int i12) {
        boolean z11;
        int[] iArr;
        int i13;
        int max;
        int i14;
        int i15;
        int i16;
        int max2;
        int i17;
        int i18;
        int i19;
        float f11;
        boolean z12;
        int i21;
        boolean z13;
        int baseline;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        boolean z14;
        boolean z15;
        View view;
        int i28;
        boolean z16;
        int measuredHeight;
        int m5280q;
        int baseline2;
        int i29;
        this.f4333u = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (this.f4336x == null || this.f4337y == null) {
            this.f4336x = new int[4];
            this.f4337y = new int[4];
        }
        int[] iArr2 = this.f4336x;
        int[] iArr3 = this.f4337y;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z17 = this.f4328p;
        boolean z18 = this.f4335w;
        int i31 = 1073741824;
        if (mode == 1073741824) {
            z11 = true;
        } else {
            z11 = false;
        }
        float f12 = 0.0f;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        boolean z19 = false;
        int i37 = 0;
        boolean z21 = true;
        boolean z22 = false;
        while (true) {
            iArr = iArr3;
            if (i32 >= virtualChildCount) {
                break;
            }
            View m5283u = m5283u(i32);
            if (m5283u == null) {
                this.f4333u += m5274A(i32);
            } else if (m5283u.getVisibility() == 8) {
                i32 += m5280q(m5283u, i32);
            } else {
                if (m5284v(i32)) {
                    this.f4333u += this.f4324A;
                }
                LayoutParams layoutParams = (LayoutParams) m5283u.getLayoutParams();
                float f13 = layoutParams.f4339a;
                float f14 = f12 + f13;
                if (mode == i31 && ((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && f13 > 0.0f) {
                    if (z11) {
                        this.f4333u += ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    } else {
                        int i38 = this.f4333u;
                        this.f4333u = Math.max(i38, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + i38 + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    }
                    if (z17) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        m5283u.measure(makeMeasureSpec, makeMeasureSpec);
                        i27 = i32;
                        z14 = z18;
                        z15 = z17;
                        view = m5283u;
                    } else {
                        i27 = i32;
                        z14 = z18;
                        z15 = z17;
                        view = m5283u;
                        i28 = 1073741824;
                        z19 = true;
                        if (mode2 == i28 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                            z16 = true;
                            z22 = true;
                        } else {
                            z16 = false;
                        }
                        int i39 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i39;
                        i37 = View.combineMeasuredStates(i37, view.getMeasuredState());
                        if (z15 && (baseline2 = view.getBaseline()) != -1) {
                            i29 = layoutParams.f4340b;
                            if (i29 < 0) {
                                i29 = this.f4332t;
                            }
                            int i41 = (((i29 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i41] = Math.max(iArr2[i41], baseline2);
                            iArr[i41] = Math.max(iArr[i41], measuredHeight - baseline2);
                        }
                        i34 = Math.max(i34, measuredHeight);
                        if (!z21 && ((ViewGroup.MarginLayoutParams) layoutParams).height == -1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (layoutParams.f4339a <= 0.0f) {
                            if (!z16) {
                                i39 = measuredHeight;
                            }
                            i36 = Math.max(i36, i39);
                        } else {
                            int i42 = i36;
                            if (!z16) {
                                i39 = measuredHeight;
                            }
                            i35 = Math.max(i35, i39);
                            i36 = i42;
                        }
                        int i43 = i27;
                        m5280q = m5280q(view, i43) + i43;
                        f12 = f14;
                        i32 = m5280q + 1;
                        iArr3 = iArr;
                        z18 = z14;
                        z17 = z15;
                        i31 = 1073741824;
                    }
                } else {
                    if (((ViewGroup.MarginLayoutParams) layoutParams).width == 0 && f13 > 0.0f) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                        i25 = 0;
                    } else {
                        i25 = Integer.MIN_VALUE;
                    }
                    if (f14 == 0.0f) {
                        i26 = this.f4333u;
                    } else {
                        i26 = 0;
                    }
                    i27 = i32;
                    int i44 = i25;
                    z14 = z18;
                    z15 = z17;
                    m5287y(m5283u, i27, i11, i26, i12, 0);
                    if (i44 != Integer.MIN_VALUE) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i44;
                    }
                    int measuredWidth = m5283u.getMeasuredWidth();
                    if (z11) {
                        view = m5283u;
                        this.f4333u += ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + m5282s(view);
                    } else {
                        view = m5283u;
                        int i45 = this.f4333u;
                        this.f4333u = Math.max(i45, i45 + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + m5282s(view));
                    }
                    if (z14) {
                        i33 = Math.max(measuredWidth, i33);
                    }
                }
                i28 = 1073741824;
                if (mode2 == i28) {
                }
                z16 = false;
                int i392 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i392;
                i37 = View.combineMeasuredStates(i37, view.getMeasuredState());
                if (z15) {
                    i29 = layoutParams.f4340b;
                    if (i29 < 0) {
                    }
                    int i412 = (((i29 & 112) >> 4) & (-2)) >> 1;
                    iArr2[i412] = Math.max(iArr2[i412], baseline2);
                    iArr[i412] = Math.max(iArr[i412], measuredHeight - baseline2);
                }
                i34 = Math.max(i34, measuredHeight);
                if (!z21) {
                }
                z21 = false;
                if (layoutParams.f4339a <= 0.0f) {
                }
                int i432 = i27;
                m5280q = m5280q(view, i432) + i432;
                f12 = f14;
                i32 = m5280q + 1;
                iArr3 = iArr;
                z18 = z14;
                z17 = z15;
                i31 = 1073741824;
            }
            m5280q = i32;
            z14 = z18;
            z15 = z17;
            i32 = m5280q + 1;
            iArr3 = iArr;
            z18 = z14;
            z17 = z15;
            i31 = 1073741824;
        }
        boolean z23 = z18;
        boolean z24 = z17;
        int i46 = i34;
        int i47 = i35;
        int i48 = i36;
        int i49 = i37;
        if (this.f4333u > 0 && m5284v(virtualChildCount)) {
            this.f4333u += this.f4324A;
        }
        int i51 = iArr2[1];
        if (i51 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
            max = i46;
            i13 = i49;
        } else {
            i13 = i49;
            max = Math.max(i46, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i51, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        }
        if (z23 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f4333u = 0;
            int i52 = 0;
            while (i52 < virtualChildCount) {
                View m5283u2 = m5283u(i52);
                if (m5283u2 == null) {
                    this.f4333u += m5274A(i52);
                } else if (m5283u2.getVisibility() == 8) {
                    i52 += m5280q(m5283u2, i52);
                } else {
                    LayoutParams layoutParams2 = (LayoutParams) m5283u2.getLayoutParams();
                    if (z11) {
                        this.f4333u += ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + i33 + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + m5282s(m5283u2);
                    } else {
                        int i53 = this.f4333u;
                        i24 = max;
                        this.f4333u = Math.max(i53, i53 + i33 + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin + m5282s(m5283u2));
                        i52++;
                        max = i24;
                    }
                }
                i24 = max;
                i52++;
                max = i24;
            }
        }
        int i54 = max;
        int paddingLeft = this.f4333u + getPaddingLeft() + getPaddingRight();
        this.f4333u = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, 0);
        int i55 = (16777215 & resolveSizeAndState) - this.f4333u;
        if (!z19 && (i55 == 0 || f12 <= 0.0f)) {
            i17 = Math.max(i47, i48);
            if (z23 && mode != 1073741824) {
                for (int i56 = 0; i56 < virtualChildCount; i56++) {
                    View m5283u3 = m5283u(i56);
                    if (m5283u3 != null && m5283u3.getVisibility() != 8 && ((LayoutParams) m5283u3.getLayoutParams()).f4339a > 0.0f) {
                        m5283u3.measure(View.MeasureSpec.makeMeasureSpec(i33, 1073741824), View.MeasureSpec.makeMeasureSpec(m5283u3.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = i12;
            i16 = virtualChildCount;
            i14 = i13;
        } else {
            float f15 = this.f4334v;
            if (f15 > 0.0f) {
                f12 = f15;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.f4333u = 0;
            int i57 = i47;
            i14 = i13;
            int i58 = -1;
            int i59 = 0;
            while (i59 < virtualChildCount) {
                View m5283u4 = m5283u(i59);
                if (m5283u4 == null || m5283u4.getVisibility() == 8) {
                    i18 = i55;
                    i19 = virtualChildCount;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) m5283u4.getLayoutParams();
                    float f16 = layoutParams3.f4339a;
                    if (f16 > 0.0f) {
                        int i61 = (int) ((i55 * f16) / f12);
                        float f17 = f12 - f16;
                        int i62 = i55 - i61;
                        i19 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams3).height);
                        if (((ViewGroup.MarginLayoutParams) layoutParams3).width == 0) {
                            i23 = 1073741824;
                            if (mode == 1073741824) {
                                if (i61 <= 0) {
                                    i61 = 0;
                                }
                                m5283u4.measure(View.MeasureSpec.makeMeasureSpec(i61, 1073741824), childMeasureSpec);
                                i14 = View.combineMeasuredStates(i14, m5283u4.getMeasuredState() & (-16777216));
                                f12 = f17;
                                i18 = i62;
                            }
                        } else {
                            i23 = 1073741824;
                        }
                        int measuredWidth2 = m5283u4.getMeasuredWidth() + i61;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        m5283u4.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i23), childMeasureSpec);
                        i14 = View.combineMeasuredStates(i14, m5283u4.getMeasuredState() & (-16777216));
                        f12 = f17;
                        i18 = i62;
                    } else {
                        i18 = i55;
                        i19 = virtualChildCount;
                    }
                    if (z11) {
                        this.f4333u += m5283u4.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin + m5282s(m5283u4);
                        f11 = f12;
                    } else {
                        int i63 = this.f4333u;
                        f11 = f12;
                        this.f4333u = Math.max(i63, m5283u4.getMeasuredWidth() + i63 + ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin + m5282s(m5283u4));
                    }
                    if (mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) layoutParams3).height == -1) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    int i64 = ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = m5283u4.getMeasuredHeight() + i64;
                    i58 = Math.max(i58, measuredHeight2);
                    if (!z12) {
                        i64 = measuredHeight2;
                    }
                    int max3 = Math.max(i57, i64);
                    if (z21) {
                        i21 = -1;
                        if (((ViewGroup.MarginLayoutParams) layoutParams3).height == -1) {
                            z13 = true;
                            if (z24 && (baseline = m5283u4.getBaseline()) != i21) {
                                i22 = layoutParams3.f4340b;
                                if (i22 < 0) {
                                    i22 = this.f4332t;
                                }
                                int i65 = (((i22 & 112) >> 4) & (-2)) >> 1;
                                iArr2[i65] = Math.max(iArr2[i65], baseline);
                                iArr[i65] = Math.max(iArr[i65], measuredHeight2 - baseline);
                            }
                            z21 = z13;
                            i57 = max3;
                            f12 = f11;
                        }
                    } else {
                        i21 = -1;
                    }
                    z13 = false;
                    if (z24) {
                        i22 = layoutParams3.f4340b;
                        if (i22 < 0) {
                        }
                        int i652 = (((i22 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i652] = Math.max(iArr2[i652], baseline);
                        iArr[i652] = Math.max(iArr[i652], measuredHeight2 - baseline);
                    }
                    z21 = z13;
                    i57 = max3;
                    f12 = f11;
                }
                i59++;
                i55 = i18;
                virtualChildCount = i19;
            }
            i15 = i12;
            i16 = virtualChildCount;
            this.f4333u += getPaddingLeft() + getPaddingRight();
            int i66 = iArr2[1];
            if (i66 == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) {
                max2 = i58;
            } else {
                max2 = Math.max(i58, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(i66, iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            }
            i54 = max2;
            i17 = i57;
        }
        if (z21 || mode2 == 1073741824) {
            i17 = i54;
        }
        setMeasuredDimension(resolveSizeAndState | ((-16777216) & i14), View.resolveSizeAndState(Math.max(i17 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i15, i14 << 16));
        if (z22) {
            m5272k(i16, i11);
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f4328p = true;
        this.f4329q = -1;
        this.f4330r = 0;
        this.f4332t = 8388659;
        C1211t1 m5716v = C1211t1.m5716v(context, attributeSet, AbstractC19187j.LinearLayoutCompat, i11, 0);
        AbstractC1579n0.m7912y0(this, context, AbstractC19187j.LinearLayoutCompat, attributeSet, m5716v.m5734r(), i11, 0);
        int m5727k = m5716v.m5727k(AbstractC19187j.LinearLayoutCompat_android_orientation, -1);
        if (m5727k >= 0) {
            setOrientation(m5727k);
        }
        int m5727k2 = m5716v.m5727k(AbstractC19187j.LinearLayoutCompat_android_gravity, -1);
        if (m5727k2 >= 0) {
            setGravity(m5727k2);
        }
        boolean m5717a = m5716v.m5717a(AbstractC19187j.LinearLayoutCompat_android_baselineAligned, true);
        if (!m5717a) {
            setBaselineAligned(m5717a);
        }
        this.f4334v = m5716v.m5725i(AbstractC19187j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f4329q = m5716v.m5727k(AbstractC19187j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f4335w = m5716v.m5717a(AbstractC19187j.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(m5716v.m5723g(AbstractC19187j.LinearLayoutCompat_divider));
        this.f4326C = m5716v.m5727k(AbstractC19187j.LinearLayoutCompat_showDividers, 0);
        this.f4327D = m5716v.m5722f(AbstractC19187j.LinearLayoutCompat_dividerPadding, 0);
        m5716v.m5736w();
    }

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public float f4339a;

        /* renamed from: b */
        public int f4340b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4340b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC19187j.LinearLayoutCompat_Layout);
            this.f4339a = obtainStyledAttributes.getFloat(AbstractC19187j.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.f4340b = obtainStyledAttributes.getInt(AbstractC19187j.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            this.f4340b = -1;
            this.f4339a = 0.0f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4340b = -1;
        }
    }
}
