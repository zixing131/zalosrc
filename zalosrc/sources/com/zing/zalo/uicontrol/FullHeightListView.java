package com.zing.zalo.uicontrol;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC8923h0;

/* loaded from: classes4.dex */
public class FullHeightListView extends ListView {
    public FullHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.DividerListView, 0, 0);
        int resourceId = obtainStyledAttributes.getResourceId(AbstractC8923h0.DividerListView_dividerColor, AbstractC16801x.stencils_line_vertical_divider);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(AbstractC8923h0.DividerListView_dividerPaddingLeft, context.getResources().getDimensionPixelSize(AbstractC16802y.default_separate_line_padding));
        int dimensionPixelOffset2 = obtainStyledAttributes.getDimensionPixelOffset(AbstractC8923h0.DividerListView_dividerPaddingRight, context.getResources().getDimensionPixelSize(AbstractC16802y.default_separate_line_padding));
        obtainStyledAttributes.recycle();
        int color = getResources().getColor(resourceId);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.getPaint().setColor(color);
        setDivider(new InsetDrawable((Drawable) shapeDrawable, dimensionPixelOffset, 0, dimensionPixelOffset2, 0));
        setDividerHeight(1);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i11, int i12) {
        try {
            if (getLayoutParams().height == -2) {
                i12 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
            }
            super.onMeasure(i11, i12);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
