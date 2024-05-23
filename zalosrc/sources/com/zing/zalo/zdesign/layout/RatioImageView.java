package com.zing.zalo.zdesign.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2815i;
import com.androidquery.util.RecyclingImageView;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class RatioImageView extends RecyclingImageView {

    /* renamed from: p */
    private float f87423p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RatioImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        View.MeasureSpec.getSize(i12);
        float f11 = this.f87423p;
        if (f11 == 0.0f) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(size, (int) (size / f11));
        }
    }

    public final void setRatio(float f11) {
        this.f87423p = f11;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatioImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2815i.RatioImageView, i11, 0);
        AbstractC19074t.m100207e(obtainStyledAttributes, "context.obtainStyledAttr…          0\n            )");
        this.f87423p = obtainStyledAttributes.getFloat(AbstractC2815i.RatioImageView_ratio, 0.0f);
        obtainStyledAttributes.recycle();
    }
}
