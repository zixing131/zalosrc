package com.zing.zalo.zview.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class FrameLayoutFixed extends FrameLayout {

    /* renamed from: p */
    private final ArrayList f89215p;

    public FrameLayoutFixed(Context context) {
        super(context);
        this.f89215p = new ArrayList(1);
    }

    /* renamed from: b */
    public static int m93142b(int i11, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 1073741824) {
                i11 = size;
            }
        } else if (size < i11) {
            i11 = 16777216 | size;
        }
        return i11 | ((-16777216) & i13);
    }

    /* renamed from: a */
    public final int m93143a(View view) {
        return ((view.getMeasuredHeight() >> 16) & (-256)) | (view.getMeasuredWidth() & (-16777216));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0006, B:5:0x0012, B:9:0x001f, B:12:0x002b, B:14:0x0037, B:16:0x007a, B:18:0x007e, B:22:0x0082, B:21:0x008a, B:28:0x008f, B:30:0x00bd, B:31:0x00cd, B:35:0x00e6, B:37:0x00f8, B:38:0x0128, B:40:0x012c, B:41:0x015e, B:43:0x0147, B:44:0x0113), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:3:0x0006, B:5:0x0012, B:9:0x001f, B:12:0x002b, B:14:0x0037, B:16:0x007a, B:18:0x007e, B:22:0x0082, B:21:0x008a, B:28:0x008f, B:30:0x00bd, B:31:0x00cd, B:35:0x00e6, B:37:0x00f8, B:38:0x0128, B:40:0x012c, B:41:0x015e, B:43:0x0147, B:44:0x0113), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i11, int i12) {
        boolean z11;
        int i13;
        Drawable foreground;
        int size;
        int childMeasureSpec;
        int childMeasureSpec2;
        try {
            int childCount = getChildCount();
            if (View.MeasureSpec.getMode(i11) == 1073741824 && View.MeasureSpec.getMode(i12) == 1073741824) {
                z11 = false;
                this.f89215p.clear();
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                for (i13 = 0; i13 < childCount; i13++) {
                    View childAt = getChildAt(i13);
                    if (childAt.getVisibility() != 8) {
                        measureChildWithMargins(childAt, i11, 0, i12, 0);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        i16 = Math.max(i16, childAt.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin);
                        i15 = Math.max(i15, childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin);
                        i14 |= m93143a(childAt);
                        if (z11 && (layoutParams.width == -1 || layoutParams.height == -1)) {
                            this.f89215p.add(childAt);
                        }
                    }
                }
                int i17 = i14;
                int paddingLeft = i16 + getPaddingLeft() + getPaddingRight();
                int max = Math.max(i15 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
                int max2 = Math.max(paddingLeft, getSuggestedMinimumWidth());
                foreground = getForeground();
                if (foreground != null) {
                    max = Math.max(max, foreground.getMinimumHeight());
                    max2 = Math.max(max2, foreground.getMinimumWidth());
                }
                setMeasuredDimension(m93142b(max2, i11, i17), m93142b(max, i12, i17 << 16));
                size = this.f89215p.size();
                if (size <= 1) {
                    for (int i18 = 0; i18 < size; i18++) {
                        View view = (View) this.f89215p.get(i18);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        if (marginLayoutParams.width == -1) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec((((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin, 1073741824);
                        } else {
                            childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width);
                        }
                        if (marginLayoutParams.height == -1) {
                            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin, 1073741824);
                        } else {
                            childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
                        }
                        view.measure(childMeasureSpec, childMeasureSpec2);
                    }
                    return;
                }
                return;
            }
            z11 = true;
            this.f89215p.clear();
            int i142 = 0;
            int i152 = 0;
            int i162 = 0;
            while (i13 < childCount) {
            }
            int i172 = i142;
            int paddingLeft2 = i162 + getPaddingLeft() + getPaddingRight();
            int max3 = Math.max(i152 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
            int max22 = Math.max(paddingLeft2, getSuggestedMinimumWidth());
            foreground = getForeground();
            if (foreground != null) {
            }
            setMeasuredDimension(m93142b(max22, i11, i172), m93142b(max3, i12, i172 << 16));
            size = this.f89215p.size();
            if (size <= 1) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            super.onMeasure(i11, i12);
        }
    }

    public FrameLayoutFixed(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f89215p = new ArrayList(1);
    }

    public FrameLayoutFixed(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f89215p = new ArrayList(1);
    }
}
