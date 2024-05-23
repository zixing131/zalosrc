package com.zing.zalo.p077ui.widget.imageview;

import android.view.View;
import android.widget.ImageView;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes6.dex */
public class RatioImageView extends RecyclingImageView {
    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        try {
            float intrinsicWidth = getDrawable().getIntrinsicWidth();
            float intrinsicHeight = getDrawable().getIntrinsicHeight();
            float f11 = (intrinsicWidth * 1.0f) / intrinsicHeight;
            float f12 = size;
            float f13 = size2;
            if (f11 < (f12 * 1.0f) / f13) {
                size = (int) (f11 * f13);
            } else {
                size2 = (int) (((intrinsicHeight * 1.0f) / intrinsicWidth) * f12);
            }
            setScaleType(ImageView.ScaleType.FIT_CENTER);
            setMeasuredDimension(size, size2);
        } catch (Exception e11) {
            e11.printStackTrace();
            super.onMeasure(i11, i12);
        }
    }
}
