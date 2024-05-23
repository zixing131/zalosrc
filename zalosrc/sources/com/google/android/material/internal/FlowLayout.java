package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1579n0;
import androidx.core.view.AbstractC1613w;
import p357n6.AbstractC23581f;
import p357n6.AbstractC23587l;

/* loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: p */
    private int f35439p;

    /* renamed from: q */
    private int f35440q;

    /* renamed from: r */
    private boolean f35441r;

    /* renamed from: s */
    private int f35442s;

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m32455a(int i11, int i12, int i13) {
        if (i12 != Integer.MIN_VALUE) {
            if (i12 != 1073741824) {
                return i13;
            }
            return i11;
        }
        return Math.min(i13, i11);
    }

    /* renamed from: d */
    private void m32456d(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC23587l.FlowLayout, 0, 0);
        this.f35439p = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.FlowLayout_lineSpacing, 0);
        this.f35440q = obtainStyledAttributes.getDimensionPixelSize(AbstractC23587l.FlowLayout_itemSpacing, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public int m32457b(View view) {
        Object tag = view.getTag(AbstractC23581f.row_index_key);
        if (!(tag instanceof Integer)) {
            return -1;
        }
        return ((Integer) tag).intValue();
    }

    /* renamed from: c */
    public boolean mo32075c() {
        return this.f35441r;
    }

    protected int getItemSpacing() {
        return this.f35440q;
    }

    protected int getLineSpacing() {
        return this.f35439p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int getRowCount() {
        return this.f35442s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        boolean z12;
        int paddingLeft;
        int paddingRight;
        int i15;
        int i16;
        if (getChildCount() == 0) {
            this.f35442s = 0;
            return;
        }
        this.f35442s = 1;
        if (AbstractC1579n0.m7812G(this) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            paddingLeft = getPaddingRight();
        } else {
            paddingLeft = getPaddingLeft();
        }
        if (z12) {
            paddingRight = getPaddingLeft();
        } else {
            paddingRight = getPaddingRight();
        }
        int paddingTop = getPaddingTop();
        int i17 = (i13 - i11) - paddingRight;
        int i18 = paddingLeft;
        int i19 = paddingTop;
        for (int i21 = 0; i21 < getChildCount(); i21++) {
            View childAt = getChildAt(i21);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(AbstractC23581f.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i16 = AbstractC1613w.m8235b(marginLayoutParams);
                    i15 = AbstractC1613w.m8234a(marginLayoutParams);
                } else {
                    i15 = 0;
                    i16 = 0;
                }
                int measuredWidth = i18 + i16 + childAt.getMeasuredWidth();
                if (!this.f35441r && measuredWidth > i17) {
                    i19 = this.f35439p + paddingTop;
                    this.f35442s++;
                    i18 = paddingLeft;
                }
                childAt.setTag(AbstractC23581f.row_index_key, Integer.valueOf(this.f35442s - 1));
                int i22 = i18 + i16;
                int measuredWidth2 = childAt.getMeasuredWidth() + i22;
                int measuredHeight = childAt.getMeasuredHeight() + i19;
                if (z12) {
                    childAt.layout(i17 - measuredWidth2, i19, (i17 - i18) - i16, measuredHeight);
                } else {
                    childAt.layout(i22, i19, measuredWidth2, measuredHeight);
                }
                i18 += i16 + i15 + childAt.getMeasuredWidth() + this.f35440q;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            i13 = Integer.MAX_VALUE;
        } else {
            i13 = size;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i13 - getPaddingRight();
        int i17 = paddingTop;
        int i18 = 0;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i11, i12);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin;
                    i15 = marginLayoutParams.rightMargin;
                } else {
                    i14 = 0;
                    i15 = 0;
                }
                int i21 = paddingLeft;
                if (paddingLeft + i14 + childAt.getMeasuredWidth() > paddingRight && !mo32075c()) {
                    i16 = getPaddingLeft();
                    i17 = this.f35439p + paddingTop;
                } else {
                    i16 = i21;
                }
                int measuredWidth = i16 + i14 + childAt.getMeasuredWidth();
                int measuredHeight = i17 + childAt.getMeasuredHeight();
                if (measuredWidth > i18) {
                    i18 = measuredWidth;
                }
                paddingLeft = i16 + i14 + i15 + childAt.getMeasuredWidth() + this.f35440q;
                if (i19 == getChildCount() - 1) {
                    i18 += i15;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m32455a(size, mode, i18 + getPaddingRight()), m32455a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setItemSpacing(int i11) {
        this.f35440q = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLineSpacing(int i11) {
        this.f35439p = i11;
    }

    public void setSingleLine(boolean z11) {
        this.f35441r = z11;
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f35441r = false;
        m32456d(context, attributeSet);
    }
}
