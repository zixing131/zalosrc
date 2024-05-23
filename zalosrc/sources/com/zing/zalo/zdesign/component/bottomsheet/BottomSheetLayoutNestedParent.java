package com.zing.zalo.zdesign.component.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.C1547f0;
import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class BottomSheetLayoutNestedParent extends BottomSheetLayout {

    /* renamed from: c0 */
    private final C1547f0 f86574c0;

    /* renamed from: d0 */
    private final int[] f86575d0;

    /* renamed from: e0 */
    private final int[] f86576e0;

    /* renamed from: f0 */
    private float f86577f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayoutNestedParent(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f86575d0 = new int[2];
        this.f86576e0 = new int[2];
        this.f86574c0 = new C1547f0(this);
    }

    public final C1547f0 getMNestedScrollingParentHelper() {
        return this.f86574c0;
    }

    public final int[] getMParentOffsetInWindow() {
        return this.f86576e0;
    }

    public final int[] getMParentScrollConsumed() {
        return this.f86575d0;
    }

    public final float getMTotalUnconsumed() {
        return this.f86577f0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f86574c0.m7761a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i11, int i12, int[] iArr) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        AbstractC19074t.m100208f(iArr, "consumed");
        if (i12 > 0 && getTotalTranslationY() > 0.0f) {
            float f11 = i12;
            if (f11 > getTotalTranslationY()) {
                iArr[1] = i12 - ((int) getTotalTranslationY());
            } else {
                iArr[1] = i12;
            }
            m90793j(getTranslationY() - f11);
        }
        int[] iArr2 = this.f86575d0;
        if (dispatchNestedPreScroll(i11 - iArr[0], i12 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i11, int i12, int i13, int i14) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        dispatchNestedScroll(i11, i12, i13, i14, this.f86576e0);
        int i15 = i14 + this.f86576e0[1];
        if (i15 < 0) {
            m90793j(getTranslationY() - i15);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        this.f86574c0.m7762b(view, view2, i11);
        startNestedScroll(i11 & 2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i11) {
        AbstractC19074t.m100208f(view, "child");
        AbstractC19074t.m100208f(view2, ZinstantMetaConstant.TARGET_VIEWPORT);
        if (isEnabled() && (i11 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        AbstractC19074t.m100208f(view, ZinstantMetaConstant.TARGET_VIEWPORT);
        this.f86574c0.m7764d(view);
        if (getTotalTranslationY() > 0.0f) {
            m90791g(-1.0f);
        }
        stopNestedScroll();
    }

    public final void setMTotalUnconsumed(float f11) {
        this.f86577f0 = f11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayoutNestedParent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f86575d0 = new int[2];
        this.f86576e0 = new int[2];
        this.f86574c0 = new C1547f0(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetLayoutNestedParent(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f86575d0 = new int[2];
        this.f86576e0 = new int[2];
        this.f86574c0 = new C1547f0(this);
    }
}
