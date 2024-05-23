package com.zing.zalo.zdesign.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class BoundedRecyclerView extends RecyclerView {

    /* renamed from: V0 */
    private int f87414V0;

    /* renamed from: W0 */
    private int f87415W0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    public final int getMaxHeight() {
        return this.f87415W0;
    }

    public final int getMaxWidth() {
        return this.f87414V0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f87414V0;
        if (1 <= i13 && i13 < size) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f87414V0, View.MeasureSpec.getMode(i11));
        }
        int size2 = View.MeasureSpec.getSize(i12);
        int i14 = this.f87415W0;
        if (1 <= i14 && i14 < size2) {
            i12 = View.MeasureSpec.makeMeasureSpec(this.f87415W0, View.MeasureSpec.getMode(i12));
        }
        super.onMeasure(i11, i12);
    }

    public final void setMaxHeight(int i11) {
        this.f87415W0 = i11;
        requestLayout();
    }

    public final void setMaxWidth(int i11) {
        this.f87414V0 = i11;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedRecyclerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
