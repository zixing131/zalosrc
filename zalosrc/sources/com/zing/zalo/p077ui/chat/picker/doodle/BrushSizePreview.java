package com.zing.zalo.p077ui.chat.picker.doodle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes5.dex */
public class BrushSizePreview extends View {

    /* renamed from: A */
    private float f60508A;

    /* renamed from: B */
    private Paint f60509B;

    /* renamed from: C */
    private int f60510C;

    /* renamed from: p */
    private float f60511p;

    /* renamed from: q */
    public int f60512q;

    /* renamed from: r */
    public int f60513r;

    /* renamed from: s */
    private final int f60514s;

    /* renamed from: t */
    public int f60515t;

    /* renamed from: u */
    private Paint f60516u;

    /* renamed from: v */
    private float f60517v;

    /* renamed from: w */
    private float f60518w;

    /* renamed from: x */
    private float f60519x;

    /* renamed from: y */
    private Paint f60520y;

    /* renamed from: z */
    private float f60521z;

    public BrushSizePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60514s = -1;
        this.f60515t = -8878190;
        m64876b(context);
    }

    /* renamed from: a */
    private void m64875a() {
        float f11 = this.f60510C;
        float f12 = this.f60511p;
        this.f60521z = f11 * f12;
        int i11 = this.f60512q;
        this.f60508A = (i11 - 1) * f12;
        float f13 = i11 * f12;
        this.f60519x = f13;
        this.f60517v = f13 / 2.0f;
        this.f60518w = f13 / 2.0f;
    }

    /* renamed from: b */
    private void m64876b(Context context) {
        this.f60511p = context.getResources().getDisplayMetrics().density;
        this.f60512q = 20;
        this.f60513r = 4;
        this.f60510C = 4;
        m64875a();
        Paint paint = new Paint();
        this.f60516u = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f60516u.setAntiAlias(true);
        this.f60516u.setColor(this.f60515t);
        Paint paint2 = new Paint();
        this.f60520y = paint2;
        paint2.setStyle(style);
        this.f60520y.setColor(this.f60515t);
        this.f60520y.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f60509B = paint3;
        paint3.setStyle(style);
        this.f60509B.setColor(-1);
        this.f60509B.setAntiAlias(true);
    }

    public float getCurrentBrushSize() {
        return this.f60510C * this.f60511p;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = this.f60516u;
        if (paint != null) {
            canvas.drawCircle(this.f60517v, this.f60518w, this.f60519x / 2.0f, paint);
        }
        Paint paint2 = this.f60509B;
        if (paint2 != null) {
            canvas.drawCircle(this.f60517v, this.f60518w, this.f60508A / 2.0f, paint2);
        }
        Paint paint3 = this.f60520y;
        if (paint3 != null) {
            canvas.drawCircle(this.f60517v, this.f60518w, this.f60521z / 2.0f, paint3);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        float f11 = this.f60519x;
        setMeasuredDimension((int) f11, (int) f11);
    }

    public void setCurrentSize(int i11) {
        this.f60510C = i11;
        m64875a();
        invalidate();
    }

    public void setSelectedColor(int i11) {
        this.f60515t = i11;
        this.f60516u.setColor(i11);
        this.f60520y.setColor(this.f60515t);
        invalidate();
    }
}
