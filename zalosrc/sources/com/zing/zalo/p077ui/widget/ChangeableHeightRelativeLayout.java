package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes6.dex */
public class ChangeableHeightRelativeLayout extends RelativeLayout {
    public ChangeableHeightRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setHeight(int i11) {
        if (getLayoutParams() != null && i11 >= 0) {
            getLayoutParams().height = i11;
            requestLayout();
        }
    }
}
