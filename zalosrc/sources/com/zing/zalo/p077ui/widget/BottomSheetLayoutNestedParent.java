package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C1547f0;

/* loaded from: classes6.dex */
public class BottomSheetLayoutNestedParent extends BottomSheetLayout {

    /* renamed from: T */
    final C1547f0 f68996T;

    /* renamed from: U */
    final int[] f68997U;

    /* renamed from: V */
    final int[] f68998V;

    public BottomSheetLayoutNestedParent(Context context) {
        super(context);
        this.f68997U = new int[2];
        this.f68998V = new int[2];
        this.f68996T = new C1547f0(this);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f68996T.m7761a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        if (i12 > 0) {
            float f11 = this.f68968E;
            if (f11 > 0.0f) {
                float f12 = i12;
                if (f12 > f11) {
                    iArr[1] = i12 - ((int) f11);
                } else {
                    iArr[1] = i12;
                }
                m75554i(getTranslationY() - f12);
            }
        }
        int[] iArr2 = this.f68997U;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        dispatchNestedScroll(i11, i12, i13, i14, this.f68998V);
        int i15 = i14 + this.f68998V[1];
        if (i15 < 0) {
            m75554i(getTranslationY() - i15);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        this.f68996T.m7762b(view, view2, i11);
        startNestedScroll(i11 & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        if (isEnabled() && (i11 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f68996T.m7764d(view);
        if (this.f68968E > 0.0f) {
            m75551d();
        }
        stopNestedScroll();
    }

    public BottomSheetLayoutNestedParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68997U = new int[2];
        this.f68998V = new int[2];
        this.f68996T = new C1547f0(this);
    }

    public BottomSheetLayoutNestedParent(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f68997U = new int[2];
        this.f68998V = new int[2];
        this.f68996T = new C1547f0(this);
    }
}
