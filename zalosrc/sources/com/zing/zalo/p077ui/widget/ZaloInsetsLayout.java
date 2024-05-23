package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.zing.zalo.zview.widget.InsetsLayout;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes.dex */
public final class ZaloInsetsLayout extends InsetsLayout {

    /* renamed from: u */
    private int f69860u;

    public ZaloInsetsLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.widget.InsetsLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12 + this.f69860u);
    }

    public final void setBottomMarginView(int i11) {
        this.f69860u = i11;
        requestLayout();
    }

    public /* synthetic */ ZaloInsetsLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZaloInsetsLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100205c(context);
    }
}
