package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC8923h0;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;

/* loaded from: classes6.dex */
public final class StoryInfoCustomFrameLayout extends FrameLayout {

    /* renamed from: p */
    private int f69802p;

    /* renamed from: q */
    private int f69803q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryInfoCustomFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69802p = -1;
        this.f69803q = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.StoryInfoCustomFrameLayout);
        try {
            this.f69802p = obtainStyledAttributes.getResourceId(AbstractC8923h0.StoryInfoCustomFrameLayout_leftView, -1);
            this.f69803q = obtainStyledAttributes.getResourceId(AbstractC8923h0.StoryInfoCustomFrameLayout_rightView, -1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        FrameLayout.LayoutParams layoutParams;
        super.onMeasure(i11, i12);
        int i13 = this.f69802p;
        if (i13 != -1 && this.f69803q != -1) {
            View findViewById = findViewById(i13);
            View findViewById2 = findViewById(this.f69803q);
            if (findViewById != null && findViewById2 != null) {
                ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                    layoutParams = (FrameLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    layoutParams.rightMargin = findViewById2.getMeasuredWidth() + AbstractC23222t7.f112566j;
                }
            }
        }
    }
}
