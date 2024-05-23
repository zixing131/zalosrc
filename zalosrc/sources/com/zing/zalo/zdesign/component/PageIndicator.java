package com.zing.zalo.zdesign.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import bi0.AbstractC2807a;
import bi0.AbstractC2816j;
import fn0.AbstractC19074t;
import ui0.C27276c;

/* loaded from: classes7.dex */
public class PageIndicator extends View {

    /* renamed from: p */
    private int f86334p;

    /* renamed from: q */
    private int f86335q;

    /* renamed from: r */
    private Paint f86336r;

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f86336r = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f86335q >= this.f86334p) {
            return;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        float m139649b = C27276c.m139649b(context, 2);
        Context context2 = getContext();
        AbstractC19074t.m100207e(context2, "context");
        float m139649b2 = C27276c.m139649b(context2, 2);
        for (int i11 = 0; i11 < this.f86334p; i11++) {
            if (i11 == this.f86335q) {
                Paint paint = this.f86336r;
                AbstractC2816j.a aVar = AbstractC2816j.Companion;
                Context context3 = getContext();
                AbstractC19074t.m100207e(context3, "context");
                paint.setColor(aVar.m13592a(context3, AbstractC2807a.page_indicator_selected));
            } else {
                Paint paint2 = this.f86336r;
                AbstractC2816j.a aVar2 = AbstractC2816j.Companion;
                Context context4 = getContext();
                AbstractC19074t.m100207e(context4, "context");
                paint2.setColor(aVar2.m13592a(context4, AbstractC2807a.page_indicator_normal));
            }
            AbstractC19074t.m100207e(getContext(), "context");
            canvas.drawCircle(m139649b, m139649b2, C27276c.m139649b(r5, 2), this.f86336r);
            AbstractC19074t.m100207e(getContext(), "context");
            m139649b += C27276c.m139649b(r5, 10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13;
        int i14 = this.f86334p;
        if (i14 >= 2) {
            Context context = getContext();
            AbstractC19074t.m100207e(context, "context");
            int m139649b = i14 * C27276c.m139649b(context, 4);
            int i15 = this.f86334p - 1;
            Context context2 = getContext();
            AbstractC19074t.m100207e(context2, "context");
            i13 = m139649b + (i15 * C27276c.m139649b(context2, 8));
        } else {
            i13 = 0;
        }
        Context context3 = getContext();
        AbstractC19074t.m100207e(context3, "context");
        setMeasuredDimension(i13, C27276c.m139648a(context3, 4.5f));
    }

    public final void setDotNumber(int i11) {
        this.f86334p = i11;
    }

    public final void setIndexSelectedDot(int i11) {
        this.f86335q = i11;
        invalidate();
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint(1);
        this.f86336r = paint;
        paint.setStyle(Paint.Style.FILL);
    }
}
