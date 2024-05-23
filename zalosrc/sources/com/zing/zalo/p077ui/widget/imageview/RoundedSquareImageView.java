package com.zing.zalo.p077ui.widget.imageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes6.dex */
public class RoundedSquareImageView extends RecyclingImageView {
    public RoundedSquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i12), 1073741824));
    }
}
