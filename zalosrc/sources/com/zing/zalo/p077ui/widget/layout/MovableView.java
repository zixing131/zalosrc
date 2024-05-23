package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: classes6.dex */
public class MovableView extends RelativeLayout {

    /* renamed from: p */
    public int f70610p;

    /* renamed from: q */
    public int f70611q;

    public MovableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70610p = 0;
        this.f70611q = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.f70610p, this.f70611q);
        super.draw(canvas);
        canvas.restore();
    }
}
