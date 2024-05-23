package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16801x;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class PreviewCropOverlayView extends View {

    /* renamed from: p */
    Paint f69444p;

    public PreviewCropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75813a();
    }

    /* renamed from: a */
    void m75813a() {
        Paint paint = new Paint(1);
        this.f69444p = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }

    public Rect getHighlightCropRect() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = (getMeasuredHeight() - measuredWidth) / 2;
        return new Rect(0, measuredHeight, measuredWidth, measuredHeight + measuredWidth);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(AbstractC23136l9.m118641B(getContext(), AbstractC16801x.black_50));
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredWidth() / 2.0f) - 0.0f, this.f69444p);
    }

    public PreviewCropOverlayView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m75813a();
    }
}
