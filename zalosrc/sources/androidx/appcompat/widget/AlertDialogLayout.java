package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1602t;
import p175g0.AbstractC19183f;

/* loaded from: classes2.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: C */
    private void m5241C(View view, int i11, int i12, int i13, int i14) {
        view.layout(i11, i12, i13 + i11, i14 + i12);
    }

    /* renamed from: D */
    private static int m5242D(View view) {
        int m7814H = AbstractC1579n0.m7814H(view);
        if (m7814H > 0) {
            return m7814H;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return m5242D(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* renamed from: E */
    private boolean m5243E(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int makeMeasureSpec;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == AbstractC19183f.topPanel) {
                    view = childAt;
                } else if (id2 == AbstractC19183f.buttonPanel) {
                    view2 = childAt;
                } else {
                    if ((id2 != AbstractC19183f.contentPanel && id2 != AbstractC19183f.customPanel) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i11);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i11, 0);
            paddingTop += view.getMeasuredHeight();
            i13 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i13 = 0;
        }
        if (view2 != null) {
            view2.measure(i11, 0);
            i14 = m5242D(view2);
            i15 = view2.getMeasuredHeight() - i14;
            paddingTop += i14;
            i13 = View.combineMeasuredStates(i13, view2.getMeasuredState());
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
            }
            view3.measure(i11, makeMeasureSpec);
            i16 = view3.getMeasuredHeight();
            paddingTop += i16;
            i13 = View.combineMeasuredStates(i13, view3.getMeasuredState());
        } else {
            i16 = 0;
        }
        int i18 = size - paddingTop;
        if (view2 != null) {
            int i19 = paddingTop - i14;
            int min = Math.min(i18, i15);
            if (min > 0) {
                i18 -= min;
                i14 += min;
            }
            view2.measure(i11, View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
            paddingTop = i19 + view2.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i13, view2.getMeasuredState());
        }
        if (view3 != null && i18 > 0) {
            view3.measure(i11, View.MeasureSpec.makeMeasureSpec(i16 + i18, mode));
            paddingTop = (paddingTop - i16) + view3.getMeasuredHeight();
            i13 = View.combineMeasuredStates(i13, view3.getMeasuredState());
        }
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                i21 = Math.max(i21, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i21 + getPaddingLeft() + getPaddingRight(), i11, i13), View.resolveSizeAndState(paddingTop, i12, 0));
        if (mode2 != 1073741824) {
            m5244l(childCount, i12);
            return true;
        }
        return true;
    }

    /* renamed from: l */
    private void m5244l(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i13 = 0; i13 < i11; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).width == -1) {
                    int i14 = ((ViewGroup.MarginLayoutParams) layoutParams).height;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i12, 0);
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i14;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int paddingTop;
        int intrinsicHeight;
        int i15;
        int i16;
        int i17;
        int paddingLeft = getPaddingLeft();
        int i18 = i13 - i11;
        int paddingRight = i18 - getPaddingRight();
        int paddingRight2 = (i18 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i19 = gravity & 112;
        int i21 = gravity & 8388615;
        if (i19 != 16) {
            if (i19 != 80) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((getPaddingTop() + i14) - i12) - measuredHeight;
            }
        } else {
            paddingTop = getPaddingTop() + (((i14 - i12) - measuredHeight) / 2);
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        } else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                int i23 = layoutParams.f4340b;
                if (i23 < 0) {
                    i23 = i21;
                }
                int m8182b = AbstractC1602t.m8182b(i23, AbstractC1579n0.m7812G(this)) & 7;
                if (m8182b != 1) {
                    if (m8182b != 5) {
                        i17 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                        if (m5284v(i22)) {
                            paddingTop += intrinsicHeight;
                        }
                        int i24 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        m5241C(childAt, i17, i24, measuredWidth, measuredHeight2);
                        paddingTop = i24 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    } else {
                        i15 = paddingRight - measuredWidth;
                        i16 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    }
                } else {
                    i15 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    i16 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                }
                i17 = i15 - i16;
                if (m5284v(i22)) {
                }
                int i242 = paddingTop + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                m5241C(childAt, i17, i242, measuredWidth, measuredHeight2);
                paddingTop = i242 + measuredHeight2 + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i11, int i12) {
        if (!m5243E(i11, i12)) {
            super.onMeasure(i11, i12);
        }
    }
}
