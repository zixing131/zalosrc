package com.zing.zalo.zdesign.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class BoundedScrollView extends ScrollView {

    /* renamed from: p */
    private int f87418p;

    /* renamed from: q */
    private int f87419q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int i13 = this.f87418p;
        if (1 <= i13 && i13 < size) {
            i11 = View.MeasureSpec.makeMeasureSpec(this.f87418p, View.MeasureSpec.getMode(i11));
        }
        int size2 = View.MeasureSpec.getSize(i12);
        int i14 = this.f87419q;
        if (1 <= i14 && i14 < size2) {
            i12 = View.MeasureSpec.makeMeasureSpec(this.f87419q, View.MeasureSpec.getMode(i12));
        }
        super.onMeasure(i11, i12);
    }

    public final void setMaxHeight(int i11) {
        this.f87419q = i11;
        requestLayout();
    }

    public final void setMaxWidth(int i11) {
        this.f87418p = i11;
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
