package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8923h0;
import vg.AbstractRunnableC28185s6;

/* loaded from: classes6.dex */
public class AvatarImageView extends RecyclingImageView implements AbstractRunnableC28185s6.b {
    public AvatarImageView(Context context) {
        super(context);
    }

    /* renamed from: i */
    private void m75539i(Context context, AttributeSet attributeSet) {
        try {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.AvatarImageView, 0, 0);
            setStrokeColor(obtainStyledAttributes.getColor(AbstractC8923h0.AvatarImageView_aiv_stroke_color, getStrokeColor()));
            setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.AvatarImageView_aiv_stroke_width, getStrokeWidth()));
            setDrawStroke(obtainStyledAttributes.getBoolean(AbstractC8923h0.AvatarImageView_aiv_draw_stroke, isDrawStroke()));
            setStrokeCircle(obtainStyledAttributes.getBoolean(AbstractC8923h0.AvatarImageView_aiv_stroke_circle, isStrokeCircle()));
            obtainStyledAttributes.recycle();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75539i(context, attributeSet);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m75539i(context, attributeSet);
    }
}
