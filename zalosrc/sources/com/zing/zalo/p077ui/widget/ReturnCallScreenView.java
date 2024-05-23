package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.zing.zalo.AbstractC7409c0;

/* loaded from: classes6.dex */
public class ReturnCallScreenView extends RelativeLayout {
    public ReturnCallScreenView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        try {
            LayoutInflater.from(context).inflate(AbstractC7409c0.return_call_screen_layout, this);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
