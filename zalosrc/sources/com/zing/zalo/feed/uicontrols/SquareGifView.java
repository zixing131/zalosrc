package com.zing.zalo.feed.uicontrols;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.uicontrol.ZSimpleGIFView;

/* loaded from: classes4.dex */
public class SquareGifView extends ZSimpleGIFView {
    public SquareGifView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int max;
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i11, i12);
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            setMeasuredDimension(min, min);
        } else {
            if (size != 0 && size2 != 0) {
                max = Math.min(size, size2);
            } else {
                max = Math.max(size, size2);
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
            super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        }
    }
}
