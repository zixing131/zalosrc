package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes6.dex */
public class ChangeableHeightView extends View {
    public ChangeableHeightView(Context context) {
        super(context);
    }

    public void setHeight(int i11) {
        if (getLayoutParams() != null) {
            if (i11 < 0) {
                i11 = 0;
            }
            getLayoutParams().height = i11;
            requestLayout();
        }
    }

    public ChangeableHeightView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
