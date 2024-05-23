package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import en0.InterfaceC18505l;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;
import java.util.Arrays;
import pm0.C24848g0;
import s20.AbstractC26100b;
import v00.AbstractC27414i;

/* loaded from: classes5.dex */
public final class FlexBoxLayout extends FrameLayout {

    /* renamed from: p */
    private int f54069p;

    /* renamed from: q */
    private int f54070q;

    /* renamed from: r */
    private int f54071r;

    /* renamed from: s */
    private boolean f54072s;

    /* renamed from: t */
    private boolean f54073t;

    /* renamed from: u */
    private int[] f54074u;

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.FlexBoxLayout$a */
    /* loaded from: classes5.dex */
    static final class C10679a extends AbstractC19075u implements InterfaceC18505l {
        C10679a() {
            super(1);
        }

        /* renamed from: a */
        public final void m55739a(TypedArray typedArray) {
            AbstractC19074t.m100208f(typedArray, "$this$obtain");
            FlexBoxLayout.this.f54069p = AbstractC26100b.m134296b(typedArray, AbstractC27414i.ZchFlexBoxLayout_zchFlexBoxHorizontalPadding, 0, 2, null);
            FlexBoxLayout.this.f54070q = AbstractC26100b.m134296b(typedArray, AbstractC27414i.ZchFlexBoxLayout_zchFlexBoxVerticalPadding, 0, 2, null);
            FlexBoxLayout.this.f54071r = typedArray.getInteger(AbstractC27414i.ZchFlexBoxLayout_zchFlexBoxMaxRow, 10);
            FlexBoxLayout.this.f54072s = typedArray.getBoolean(AbstractC27414i.ZchFlexBoxLayout_zchFlexBoxCenterHorizontal, false);
            FlexBoxLayout.this.f54073t = typedArray.getBoolean(AbstractC27414i.ZchFlexBoxLayout_zchFlexBoxIsFromRecyclerView, false);
            FlexBoxLayout flexBoxLayout = FlexBoxLayout.this;
            flexBoxLayout.f54074u = new int[flexBoxLayout.f54071r];
            FlexBoxLayout.this.requestLayout();
        }

        @Override // en0.InterfaceC18505l
        /* renamed from: i9 */
        public /* bridge */ /* synthetic */ Object mo205i9(Object obj) {
            m55739a((TypedArray) obj);
            return C24848g0.f119245a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexBoxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54071r = 10;
        this.f54074u = new int[10];
        int[] iArr = AbstractC27414i.ZchFlexBoxLayout;
        AbstractC19074t.m100207e(iArr, "ZchFlexBoxLayout");
        AbstractC26100b.m134297c(attributeSet, context, iArr, new C10679a());
    }

    /* renamed from: h */
    private final void m55738h(View view, int i11, int i12) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i13 = layoutParams.width;
        if (i13 == -2) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE);
        } else if (i13 == -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
        }
        int i14 = layoutParams.height;
        if (i14 == -2) {
            if (i12 > 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
            } else {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 0);
            }
        } else if (i14 == -1) {
            if (i12 > 0) {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 0);
            }
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(makeMeasureSpec, makeMeasureSpec2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int paddingTop = getPaddingTop();
        int i17 = i13 - i11;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - getPaddingRight()) - getPaddingLeft();
        int paddingLeft = getPaddingLeft();
        if (this.f54072s) {
            i15 = (paddingRight2 - this.f54074u[0]) / 2;
        } else {
            i15 = 0;
        }
        int i18 = paddingLeft + i15;
        int childCount = getChildCount();
        int i19 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                if (childAt.getMeasuredWidth() + i18 > paddingRight) {
                    i19++;
                    int paddingLeft2 = getPaddingLeft();
                    if (this.f54072s) {
                        i16 = (paddingRight2 - this.f54074u[i19]) / 2;
                    } else {
                        i16 = 0;
                    }
                    i18 = paddingLeft2 + i16;
                    paddingTop += i21 + this.f54070q;
                    i21 = 0;
                }
                childAt.layout(i18, paddingTop, childAt.getMeasuredWidth() + i18, childAt.getMeasuredHeight() + paddingTop);
                i21 = Math.max(i21, childAt.getMeasuredHeight());
                i18 += childAt.getMeasuredWidth() + this.f54069p;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int measuredWidth;
        int size = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i12);
        int paddingLeft = size - (getPaddingLeft() + getPaddingRight());
        int paddingTop = size2 - (getPaddingTop() + getPaddingBottom());
        Arrays.fill(this.f54074u, 0);
        int childCount = getChildCount();
        boolean z11 = true;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (i13 < this.f54071r) {
                AbstractC19074t.m100205c(childAt);
                m55738h(childAt, paddingLeft, paddingTop);
                if (z11) {
                    measuredWidth = childAt.getMeasuredWidth();
                } else {
                    measuredWidth = childAt.getMeasuredWidth() + this.f54069p;
                }
                int i18 = this.f54074u[i13];
                if (i18 + measuredWidth > paddingLeft) {
                    i16 = Math.max(i16, i18);
                    i14 += i15;
                    i13++;
                    if (i13 < this.f54071r) {
                        childAt.setVisibility(0);
                        i14 += this.f54070q;
                        this.f54074u[i13] = childAt.getMeasuredWidth();
                        i15 = childAt.getMeasuredHeight();
                    } else {
                        childAt.setVisibility(8);
                    }
                } else {
                    childAt.setVisibility(0);
                    int[] iArr = this.f54074u;
                    iArr[i13] = iArr[i13] + measuredWidth;
                    i15 = Math.max(i15, childAt.getMeasuredHeight());
                }
                z11 = false;
            } else {
                childAt.setVisibility(8);
            }
        }
        if (i13 < this.f54071r) {
            i14 += i15;
            i16 = Math.max(i16, this.f54074u[i13]);
        }
        if (mode == Integer.MIN_VALUE) {
            paddingLeft = Math.min(i16, paddingLeft);
        }
        if (paddingTop != 0) {
            if (this.f54073t) {
                paddingTop = Math.min(i14, paddingTop);
            } else if (mode2 == Integer.MIN_VALUE) {
                paddingTop = Math.min(i14, paddingTop);
            }
        } else {
            paddingTop = i14;
        }
        setMeasuredDimension(paddingLeft + getPaddingLeft() + getPaddingRight(), paddingTop + getPaddingTop() + getPaddingBottom());
    }

    public final void setMaxRow(int i11) {
        this.f54071r = i11;
        requestLayout();
    }
}
