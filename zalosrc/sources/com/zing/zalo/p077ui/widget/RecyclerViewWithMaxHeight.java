package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC8923h0;

/* loaded from: classes6.dex */
public class RecyclerViewWithMaxHeight extends RecyclerView {

    /* renamed from: V0 */
    int f69515V0;

    public RecyclerViewWithMaxHeight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69515V0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.RecyclerViewWithMaxHeight);
        try {
            this.f69515V0 = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RecyclerViewWithMaxHeight_maxHeightView, -1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13 = this.f69515V0;
        if (i13 >= 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i13, Integer.MIN_VALUE);
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxHeight(int i11) {
        this.f69515V0 = i11;
    }
}
