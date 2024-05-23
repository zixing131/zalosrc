package com.zing.zalo.p077ui.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes5.dex */
public class SeparateLineView extends View {

    /* renamed from: p */
    private int f61710p;

    /* renamed from: q */
    private int f61711q;

    /* renamed from: r */
    private Paint f61712r;

    /* renamed from: s */
    private RectF f61713s;

    public SeparateLineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65859a(context, attributeSet);
    }

    /* renamed from: a */
    private void m65859a(Context context, AttributeSet attributeSet) {
        this.f61710p = 0;
        this.f61711q = 0;
        int m119607o = C23212s8.m119607o(context, AbstractC16781w.ItemSeparatorColor);
        Paint paint = new Paint(1);
        this.f61712r = paint;
        paint.setColor(m119607o);
        this.f61712r.setStyle(Paint.Style.FILL);
        this.f61713s = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.translate(this.f61710p, 0.0f);
        canvas.drawRect(this.f61713s, this.f61712r);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        int size2 = View.MeasureSpec.getSize(i12);
        this.f61711q = size;
        RectF rectF = this.f61713s;
        rectF.right = size;
        rectF.bottom = size2;
        setMeasuredDimension(size, size2);
    }

    public void setMarginLeftPerformance(int i11) {
        this.f61710p = AbstractC23136l9.m118655I(i11);
        this.f61713s.right = this.f61711q - r3;
        invalidate();
    }

    public SeparateLineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m65859a(context, attributeSet);
    }
}
