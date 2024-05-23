package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes6.dex */
public class DumpChatImageView extends RecyclingImageView {
    public DumpChatImageView(Context context) {
        super(context);
        setWillNotDraw(true);
    }

    public DumpChatImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(true);
    }
}
