package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.C1072e;
import androidx.core.view.AbstractC1579n0;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;
import p357n6.AbstractC23579d;

/* loaded from: classes3.dex */
public class BottomNavigationMenuView extends NavigationBarMenuView {

    /* renamed from: K */
    private final int f34947K;

    /* renamed from: L */
    private final int f34948L;

    /* renamed from: M */
    private final int f34949M;

    /* renamed from: N */
    private final int f34950N;

    /* renamed from: O */
    private final int f34951O;

    /* renamed from: P */
    private boolean f34952P;

    /* renamed from: Q */
    private int[] f34953Q;

    public BottomNavigationMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f34947K = resources.getDimensionPixelSize(AbstractC23579d.design_bottom_navigation_item_max_width);
        this.f34948L = resources.getDimensionPixelSize(AbstractC23579d.design_bottom_navigation_item_min_width);
        this.f34949M = resources.getDimensionPixelSize(AbstractC23579d.design_bottom_navigation_active_item_max_width);
        this.f34950N = resources.getDimensionPixelSize(AbstractC23579d.design_bottom_navigation_active_item_min_width);
        this.f34951O = resources.getDimensionPixelSize(AbstractC23579d.design_bottom_navigation_height);
        this.f34953Q = new int[5];
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    /* renamed from: e */
    protected NavigationBarItemView mo31819e(Context context) {
        return new BottomNavigationItemView(context);
    }

    /* renamed from: l */
    public boolean m31820l() {
        return this.f34952P;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                if (AbstractC1579n0.m7812G(this) == 1) {
                    int i19 = i15 - i17;
                    childAt.layout(i19 - childAt.getMeasuredWidth(), 0, i19, i16);
                } else {
                    childAt.layout(i17, 0, childAt.getMeasuredWidth() + i17, i16);
                }
                i17 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        C1072e menu = getMenu();
        int size = View.MeasureSpec.getSize(i11);
        int size2 = menu.m5054G().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f34951O, 1073741824);
        int i16 = 1;
        if (m32675f(getLabelVisibilityMode(), size2) && m31820l()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int i17 = this.f34950N;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f34949M, Integer.MIN_VALUE), makeMeasureSpec);
                i17 = Math.max(i17, childAt.getMeasuredWidth());
            }
            if (childAt.getVisibility() != 8) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            int i18 = size2 - i13;
            int min = Math.min(size - (this.f34948L * i18), Math.min(i17, this.f34949M));
            int i19 = size - min;
            if (i18 == 0) {
                i14 = 1;
            } else {
                i14 = i18;
            }
            int min2 = Math.min(i19 / i14, this.f34947K);
            int i21 = i19 - (i18 * min2);
            for (int i22 = 0; i22 < childCount; i22++) {
                if (getChildAt(i22).getVisibility() != 8) {
                    int[] iArr = this.f34953Q;
                    if (i22 == getSelectedItemPosition()) {
                        i15 = min;
                    } else {
                        i15 = min2;
                    }
                    iArr[i22] = i15;
                    if (i21 > 0) {
                        int[] iArr2 = this.f34953Q;
                        iArr2[i22] = iArr2[i22] + 1;
                        i21--;
                    }
                } else {
                    this.f34953Q[i22] = 0;
                }
            }
        } else {
            if (size2 != 0) {
                i16 = size2;
            }
            int min3 = Math.min(size / i16, this.f34949M);
            int i23 = size - (size2 * min3);
            for (int i24 = 0; i24 < childCount; i24++) {
                if (getChildAt(i24).getVisibility() != 8) {
                    int[] iArr3 = this.f34953Q;
                    iArr3[i24] = min3;
                    if (i23 > 0) {
                        iArr3[i24] = min3 + 1;
                        i23--;
                    }
                } else {
                    this.f34953Q[i24] = 0;
                }
            }
        }
        int i25 = 0;
        for (int i26 = 0; i26 < childCount; i26++) {
            View childAt2 = getChildAt(i26);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f34953Q[i26], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i25 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i25, View.MeasureSpec.makeMeasureSpec(i25, 1073741824), 0), View.resolveSizeAndState(this.f34951O, makeMeasureSpec, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z11) {
        this.f34952P = z11;
    }
}
