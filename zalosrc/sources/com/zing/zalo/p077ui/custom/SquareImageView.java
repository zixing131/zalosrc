package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC16801x;

/* loaded from: classes5.dex */
public class SquareImageView extends RecyclingImageView {

    /* renamed from: p */
    private int f61714p;

    /* renamed from: q */
    public boolean f61715q;

    /* renamed from: r */
    private final Paint f61716r;

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f61715q = false;
        this.f61716r = new Paint();
        m65860i(context);
    }

    /* renamed from: i */
    private void m65860i(Context context) {
        this.f61714p = context.getResources().getColor(AbstractC16801x.black_15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f61715q) {
            this.f61716r.setAntiAlias(true);
            this.f61716r.setStyle(Paint.Style.STROKE);
            this.f61716r.setColor(this.f61714p);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.f61716r);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
    }
}
