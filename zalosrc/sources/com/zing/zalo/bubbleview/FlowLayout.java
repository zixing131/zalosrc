package com.zing.zalo.bubbleview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.zing.zalo.AbstractC8923h0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: p */
    int f40197p;

    /* renamed from: q */
    int f40198q;

    /* renamed from: r */
    int f40199r;

    /* renamed from: s */
    List f40200s;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40197p = 0;
        this.f40198q = 0;
        this.f40199r = 0;
        this.f40200s = new ArrayList();
        m37533f(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    int m37531d(LayoutParams layoutParams) {
        if (layoutParams.m37534a()) {
            return layoutParams.f40204c;
        }
        return this.f40197p;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j11) {
        return super.drawChild(canvas, view, j11);
    }

    /* renamed from: e */
    int m37532e(LayoutParams layoutParams) {
        if (layoutParams.m37537d()) {
            return layoutParams.f40205d;
        }
        return this.f40198q;
    }

    /* renamed from: f */
    void m37533f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.FlowLayout);
        try {
            this.f40197p = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FlowLayout_horizontalSpacing, 0);
            this.f40198q = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FlowLayout_verticalSpacing, 0);
            this.f40199r = obtainStyledAttributes.getInteger(AbstractC8923h0.FlowLayout_orientation, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public Integer[] getRowHeights() {
        List list = this.f40200s;
        return (Integer[]) list.toArray(new Integer[list.size()]);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int i16 = layoutParams.f40202a;
            childAt.layout(i16, layoutParams.f40203b, childAt.getMeasuredWidth() + i16, layoutParams.f40203b + childAt.getMeasuredHeight());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        int paddingLeft;
        int paddingTop;
        this.f40200s.clear();
        int size = (View.MeasureSpec.getSize(i11) - getPaddingRight()) - getPaddingLeft();
        int size2 = (View.MeasureSpec.getSize(i12) - getPaddingRight()) - getPaddingLeft();
        int mode = View.MeasureSpec.getMode(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (this.f40199r == 0) {
            i13 = size;
            i14 = mode;
        } else {
            i13 = size2;
            i14 = mode2;
        }
        int childCount = getChildCount();
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        while (i22 < childCount) {
            int i31 = childCount;
            View childAt = getChildAt(i22);
            int i32 = i23;
            if (childAt.getVisibility() == 8) {
                i17 = size;
                i19 = size2;
                i23 = i32;
            } else {
                if (mode == 1073741824) {
                    i15 = Integer.MIN_VALUE;
                } else {
                    i15 = mode;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, i15);
                if (mode2 == 1073741824) {
                    i16 = Integer.MIN_VALUE;
                } else {
                    i16 = mode2;
                }
                childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(size2, i16));
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int m37531d = m37531d(layoutParams);
                int m37532e = m37532e(layoutParams);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                i17 = size;
                if (this.f40199r == 0) {
                    i18 = measuredHeight;
                } else {
                    i18 = measuredWidth;
                    measuredWidth = measuredHeight;
                    m37532e = m37531d;
                    m37531d = m37532e;
                }
                int i33 = i25 + measuredWidth;
                int i34 = i33 + m37531d;
                i19 = size2;
                if (!layoutParams.f40206e && (i14 == 0 || i33 <= i13)) {
                    i21 = i28;
                } else {
                    i26++;
                    i29 += i27;
                    i27 = i18 + m37532e;
                    i34 = measuredWidth + m37531d;
                    i21 = i18;
                    i33 = measuredWidth;
                }
                int max = Math.max(i27, i18 + m37532e);
                int max2 = Math.max(i21, i18);
                if (i26 >= this.f40200s.size()) {
                    this.f40200s.add(Integer.valueOf(max));
                } else {
                    List list = this.f40200s;
                    list.set(i26, Integer.valueOf(Math.max(((Integer) list.get(i26)).intValue(), max)));
                }
                if (this.f40199r == 0) {
                    paddingLeft = (getPaddingLeft() + i33) - measuredWidth;
                    paddingTop = getPaddingTop() + i29;
                } else {
                    paddingLeft = getPaddingLeft() + i29;
                    paddingTop = (getPaddingTop() + i33) - measuredHeight;
                }
                layoutParams.m37536c(paddingLeft, paddingTop);
                i24 = Math.max(i24, i33);
                i28 = max2;
                i27 = max;
                i25 = i34;
                i23 = i29 + max2;
            }
            i22++;
            childCount = i31;
            size = i17;
            size2 = i19;
        }
        int i35 = i23;
        if (this.f40199r == 0) {
            setMeasuredDimension(View.resolveSize(i24, i11), View.resolveSize(i35, i12));
        } else {
            setMeasuredDimension(View.resolveSize(i35, i11), View.resolveSize(i24, i12));
        }
    }

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {

        /* renamed from: f */
        static int f40201f = -1;

        /* renamed from: a */
        int f40202a;

        /* renamed from: b */
        int f40203b;

        /* renamed from: c */
        int f40204c;

        /* renamed from: d */
        int f40205d;

        /* renamed from: e */
        boolean f40206e;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i11 = f40201f;
            this.f40204c = i11;
            this.f40205d = i11;
            this.f40206e = false;
            m37535b(context, attributeSet);
        }

        /* renamed from: a */
        public boolean m37534a() {
            return this.f40204c != f40201f;
        }

        /* renamed from: b */
        void m37535b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.FlowLayout_LayoutParams);
            try {
                this.f40204c = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FlowLayout_LayoutParams_layout_horizontalSpacing, f40201f);
                this.f40205d = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FlowLayout_LayoutParams_layout_verticalSpacing, f40201f);
                this.f40206e = obtainStyledAttributes.getBoolean(AbstractC8923h0.FlowLayout_LayoutParams_layout_newLine, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        /* renamed from: c */
        public void m37536c(int i11, int i12) {
            this.f40202a = i11;
            this.f40203b = i12;
        }

        /* renamed from: d */
        public boolean m37537d() {
            return this.f40205d != f40201f;
        }

        public LayoutParams(int i11, int i12) {
            super(i11, i12);
            int i13 = f40201f;
            this.f40204c = i13;
            this.f40205d = i13;
            this.f40206e = false;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            int i11 = f40201f;
            this.f40204c = i11;
            this.f40205d = i11;
            this.f40206e = false;
        }
    }
}
