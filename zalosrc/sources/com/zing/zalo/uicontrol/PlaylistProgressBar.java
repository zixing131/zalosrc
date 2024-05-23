package com.zing.zalo.uicontrol;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16801x;
import me0.AbstractC23136l9;

/* loaded from: classes4.dex */
public class PlaylistProgressBar extends View {

    /* renamed from: A */
    private int f83286A;

    /* renamed from: B */
    private float f83287B;

    /* renamed from: C */
    private final int f83288C;

    /* renamed from: p */
    public boolean f83289p;

    /* renamed from: q */
    public int f83290q;

    /* renamed from: r */
    public int f83291r;

    /* renamed from: s */
    public int f83292s;

    /* renamed from: t */
    public int f83293t;

    /* renamed from: u */
    private Paint f83294u;

    /* renamed from: v */
    private Paint f83295v;

    /* renamed from: w */
    private Paint f83296w;

    /* renamed from: x */
    public float f83297x;

    /* renamed from: y */
    private final float f83298y;

    /* renamed from: z */
    private int f83299z;

    public PlaylistProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83289p = false;
        this.f83297x = 3.0f;
        this.f83298y = 1.0f;
        this.f83299z = 0;
        this.f83286A = 0;
        this.f83287B = 0.0f;
        this.f83288C = 50;
        m87781a();
    }

    /* renamed from: a */
    private void m87781a() {
        this.f83290q = getResources().getColor(AbstractC16801x.white_40);
        this.f83291r = getResources().getColor(AbstractC16801x.zingnews_blue);
        this.f83292s = getResources().getColor(AbstractC16801x.facebook_blue);
        this.f83293t = getResources().getColor(AbstractC16801x.white);
        Paint paint = new Paint(1);
        this.f83294u = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f83294u;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        Paint paint3 = new Paint(1);
        this.f83295v = paint3;
        paint3.setStyle(style);
        this.f83295v.setStrokeCap(cap);
        Paint paint4 = new Paint(1);
        this.f83296w = paint4;
        paint4.setStyle(style);
        this.f83296w.setStrokeCap(cap);
    }

    /* renamed from: b */
    public void m87782b(int i11) {
        if (i11 >= 0 && i11 < this.f83299z && i11 != this.f83286A) {
            this.f83286A = i11;
            this.f83287B = 0.0f;
            invalidate();
        }
    }

    public float getProgress() {
        return this.f83287B;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f11;
        float f12;
        float f13;
        float f14;
        if (this.f83299z > 0) {
            this.f83294u.setColor(this.f83290q);
            this.f83294u.setStrokeWidth(AbstractC23136l9.m118742r(this.f83297x));
            this.f83295v.setStrokeWidth(AbstractC23136l9.m118742r(this.f83297x));
            this.f83296w.setColor(this.f83293t);
            this.f83296w.setStrokeWidth(AbstractC23136l9.m118742r(this.f83297x));
            int i11 = (this.f83286A / 50) * 50;
            int min = Math.min(50, this.f83299z - i11);
            int m118742r = AbstractC23136l9.m118742r(this.f83297x);
            float m118742r2 = AbstractC23136l9.m118742r(1.0f);
            float width = ((((canvas.getWidth() - getPaddingLeft()) - getPaddingRight()) - ((min - 1) * m118742r2)) * 1.0f) / min;
            float f15 = m118742r;
            float f16 = f15 / 2.0f;
            float f17 = f15;
            for (int i12 = 0; i12 < min; i12++) {
                int i13 = i11 + i12;
                float f18 = (f17 + width) - f15;
                int i14 = this.f83286A;
                if (i13 < i14) {
                    if (this.f83289p) {
                        canvas.drawLine(f17, f16, f18, f16, this.f83294u);
                    } else {
                        canvas.drawLine(f17, f16, f18, f16, this.f83296w);
                    }
                } else if (i13 == i14) {
                    float f19 = ((this.f83287B * 1.0f) / 100.0f) * (width - f15);
                    if (this.f83289p) {
                        f12 = f19 + f17;
                        f11 = f18;
                    } else {
                        f11 = f19 + f17;
                        f12 = f17;
                    }
                    if (f12 > f18) {
                        f13 = f18;
                    } else {
                        f13 = f12;
                    }
                    if (f11 > f18) {
                        f14 = f18;
                    } else {
                        f14 = f11;
                    }
                    canvas.drawLine(f17, f16, f18, f16, this.f83294u);
                    canvas.drawLine(f13, f16, f14, f16, this.f83296w);
                } else if (i13 > i14) {
                    if (this.f83289p) {
                        canvas.drawLine(f17, f16, f18, f16, this.f83296w);
                    } else {
                        canvas.drawLine(f17, f16, f18, f16, this.f83294u);
                    }
                }
                f17 = f18 + m118742r2 + f15;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(AbstractC23136l9.m118742r(this.f83297x) + getPaddingLeft() + getPaddingRight(), 1073741824));
    }

    public void setProgress(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 100.0f) {
            f11 = 100.0f;
        }
        this.f83287B = f11;
        invalidate();
    }

    public void setTotalCount(int i11) {
        if (i11 < 0) {
            i11 = 0;
        }
        this.f83299z = i11;
        requestLayout();
    }
}
