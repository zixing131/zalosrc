package com.zing.zalo.shortvideo.p072ui.widget.crop;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class OverlayView extends View {

    /* renamed from: p */
    private int f54247p;

    /* renamed from: q */
    private int f54248q;

    /* renamed from: r */
    private final Paint f54249r;

    /* renamed from: s */
    private RectF f54250s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint(1);
        this.f54249r = paint;
        this.f54250s = new RectF();
        setLayerType(1, null);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public final RectF getViewport() {
        return this.f54250s;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawColor(this.f54247p);
        if (this.f54248q == 0) {
            canvas.drawOval(this.f54250s, this.f54249r);
        } else {
            canvas.drawRect(this.f54250s, this.f54249r);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        if (this.f54250s.isEmpty()) {
            RectF rectF = this.f54250s;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = size;
            rectF.bottom = size2;
        }
        super.onMeasure(i11, i12);
    }

    public final void setOverlayColor(int i11) {
        this.f54247p = i11;
        invalidate();
    }

    public final void setOverlayShape(int i11) {
        this.f54248q = i11;
        invalidate();
    }

    public final void setViewport(RectF rectF) {
        AbstractC19074t.m100208f(rectF, "<set-?>");
        this.f54250s = rectF;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverlayView(Context context, int i11) {
        this(context);
        AbstractC19074t.m100208f(context, "context");
        this.f54248q = i11;
    }
}
