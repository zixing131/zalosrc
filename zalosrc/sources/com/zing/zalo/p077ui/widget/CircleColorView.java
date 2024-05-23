package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class CircleColorView extends View {

    /* renamed from: s */
    private static final int f69045s = AbstractC23136l9.m118742r(13.0f);

    /* renamed from: t */
    private static final int f69046t = AbstractC23136l9.m118742r(10.0f);

    /* renamed from: p */
    private Paint f69047p;

    /* renamed from: q */
    private Paint f69048q;

    /* renamed from: r */
    private int f69049r;

    public CircleColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75624a();
    }

    /* renamed from: a */
    private void m75624a() {
        setWillNotDraw(false);
        this.f69049r = 0;
        Paint paint = new Paint();
        this.f69047p = paint;
        paint.setAntiAlias(true);
        this.f69047p.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f69048q = paint2;
        paint2.setAntiAlias(true);
        this.f69048q.setStyle(Paint.Style.STROKE);
        this.f69048q.setStrokeWidth(1.0f);
        this.f69048q.setShadowLayer(AbstractC23136l9.m118742r(1.0f), 1.0f, 1.0f, 1275068416);
        this.f69048q.setColor(-7498594);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        int i11 = this.f69049r;
        if (i11 == 0) {
            i11 = getWidth() / 2;
        }
        canvas.drawCircle(width, height, i11, this.f69047p);
    }

    public void setRadius(int i11) {
        this.f69049r = i11;
        invalidate();
    }
}
