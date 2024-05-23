package com.zing.zalo.p077ui.widget.imageview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;

/* loaded from: classes6.dex */
public class ReplyThumbImageView extends RecyclingImageView {
    public ReplyThumbImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        if (getDrawable() != null) {
            getDrawable().setAlpha(255);
        }
        super.onDraw(canvas);
    }

    public ReplyThumbImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
