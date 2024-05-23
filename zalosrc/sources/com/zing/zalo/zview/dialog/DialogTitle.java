package com.zing.zalo.zview.dialog;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import com.zing.zalo.zview.AbstractC17472h;

/* loaded from: classes7.dex */
public class DialogTitle extends TextView {
    public DialogTitle(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int lineCount;
        super.onMeasure(i11, i12);
        Layout layout = getLayout();
        if (layout != null && (lineCount = layout.getLineCount()) > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
            setSingleLine(false);
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC17472h.TextAppearance, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC17472h.TextAppearance_android_textSize, (int) (getResources().getDisplayMetrics().density * 20.0f));
            int color = obtainStyledAttributes.getColor(AbstractC17472h.TextAppearance_android_textColor, -1);
            obtainStyledAttributes.recycle();
            setTextSize(0, dimensionPixelSize);
            setTextColor(color);
            setMaxLines(2);
            super.onMeasure(i11, i12);
        }
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
