package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.navigation.NavigationBarItemView;
import com.google.android.material.navigation.NavigationBarMenuView;

/* loaded from: classes3.dex */
public class NavigationRailMenuView extends NavigationBarMenuView {

    /* renamed from: K */
    private final FrameLayout.LayoutParams f35681K;

    public NavigationRailMenuView(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f35681K = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }

    /* renamed from: m */
    private int m32703m(int i11, int i12, int i13) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), i12 / Math.max(1, i13)), 0);
    }

    /* renamed from: n */
    private int m32704n(View view, int i11, int i12) {
        if (view.getVisibility() != 8) {
            view.measure(i11, i12);
            return view.getMeasuredHeight();
        }
        return 0;
    }

    /* renamed from: p */
    private int m32705p(int i11, int i12, int i13, View view) {
        int makeMeasureSpec;
        m32703m(i11, i12, i13);
        if (view == null) {
            makeMeasureSpec = m32703m(i11, i12, i13);
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt != view) {
                i14 += m32704n(childAt, i11, makeMeasureSpec);
            }
        }
        return i14;
    }

    /* renamed from: q */
    private int m32706q(int i11, int i12, int i13) {
        int i14;
        View childAt = getChildAt(getSelectedItemPosition());
        if (childAt != null) {
            i14 = m32704n(childAt, i11, m32703m(i11, i12, i13));
            i12 -= i14;
            i13--;
        } else {
            i14 = 0;
        }
        return i14 + m32705p(i11, i12, i13, childAt);
    }

    @Override // com.google.android.material.navigation.NavigationBarMenuView
    /* renamed from: e */
    protected NavigationBarItemView mo31819e(Context context) {
        return new C6373a(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMenuGravity() {
        return this.f35681K.gravity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean m32707l() {
        if ((this.f35681K.gravity & 112) == 48) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int childCount = getChildCount();
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                childAt.layout(0, i16, i15, measuredHeight);
                i16 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int m32705p;
        int size = View.MeasureSpec.getSize(i12);
        int size2 = getMenu().m5054G().size();
        if (size2 > 1 && m32675f(getLabelVisibilityMode(), size2)) {
            m32705p = m32706q(i11, size, size2);
        } else {
            m32705p = m32705p(i11, size, size2, null);
        }
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i11), i11, 0), View.resolveSizeAndState(m32705p, i12, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMenuGravity(int i11) {
        FrameLayout.LayoutParams layoutParams = this.f35681K;
        if (layoutParams.gravity != i11) {
            layoutParams.gravity = i11;
            setLayoutParams(layoutParams);
        }
    }
}
