package com.zing.zalo.uicontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.ListView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8923h0;

/* loaded from: classes4.dex */
public class DividerListView extends ListView {
    public DividerListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            m87735a(context, attributeSet, 0);
        }
    }

    /* renamed from: a */
    private void m87735a(Context context, AttributeSet attributeSet, int i11) {
        try {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.DividerListView, i11, 0);
            int resourceId = obtainStyledAttributes.getResourceId(AbstractC8923h0.DividerListView_dividerColor, AbstractC16801x.cLine1);
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC8923h0.DividerListView_dividerPaddingLeft, context.getResources().getDimensionPixelSize(AbstractC16802y.default_separate_line_padding));
            int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(AbstractC8923h0.DividerListView_dividerPaddingRight, context.getResources().getDimensionPixelSize(AbstractC16802y.default_separate_line_padding));
            obtainStyledAttributes.recycle();
            int color = getResources().getColor(resourceId);
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.getPaint().setColor(color);
            setDivider(new InsetDrawable((Drawable) shapeDrawable, dimensionPixelOffset, 0, dimensionPixelOffset2, 0));
            setDividerHeight(1);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
