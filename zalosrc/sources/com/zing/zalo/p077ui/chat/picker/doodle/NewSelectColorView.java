package com.zing.zalo.p077ui.chat.picker.doodle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public class NewSelectColorView extends View {

    /* renamed from: A */
    private int f60589A;

    /* renamed from: B */
    private float f60590B;

    /* renamed from: p */
    private InterfaceC11656a f60591p;

    /* renamed from: q */
    private int f60592q;

    /* renamed from: r */
    private int f60593r;

    /* renamed from: s */
    private float f60594s;

    /* renamed from: t */
    private Paint f60595t;

    /* renamed from: u */
    private int[] f60596u;

    /* renamed from: v */
    private int f60597v;

    /* renamed from: w */
    private int f60598w;

    /* renamed from: x */
    private int f60599x;

    /* renamed from: y */
    private float f60600y;

    /* renamed from: z */
    private float f60601z;

    /* renamed from: com.zing.zalo.ui.chat.picker.doodle.NewSelectColorView$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC11656a {
        /* renamed from: a */
        void mo64960a(int i11);
    }

    public NewSelectColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f60592q = -1;
        this.f60597v = 0;
        this.f60589A = -1;
        m64959b(context);
    }

    /* renamed from: a */
    private void m64958a(Canvas canvas, float f11, float f12, int i11) {
        this.f60595t.setColor(i11);
        int i12 = (int) f11;
        int i13 = this.f60599x;
        int i14 = (int) f12;
        RectF rectF = new RectF(i12 - i13, i14 - i13, i13 + f11, i13 + f12);
        float f13 = this.f60590B;
        canvas.drawRoundRect(rectF, f13, f13, this.f60595t);
        if (this.f60593r == i11) {
            this.f60595t.setColor(-1);
            canvas.drawCircle(f11, f12, this.f60594s / 2.0f, this.f60595t);
        }
        int i15 = this.f60599x;
        RectF rectF2 = new RectF((i12 - 0.0f) - i15, (i14 - 0.0f) - i15, f11 + i15 + 0.0f, f12 + i15 + 0.0f);
        boolean contains = rectF2.contains((int) this.f60600y, (int) this.f60601z);
        if (contains || this.f60593r == i11) {
            int color = this.f60595t.getColor();
            this.f60595t.setStyle(Paint.Style.STROKE);
            this.f60595t.setColor(this.f60592q);
            float f14 = this.f60590B;
            canvas.drawRoundRect(rectF2, f14, f14, this.f60595t);
            this.f60595t.setStyle(Paint.Style.FILL);
            this.f60595t.setColor(color);
            if (contains && this.f60589A == 1) {
                this.f60593r = i11;
                InterfaceC11656a interfaceC11656a = this.f60591p;
                if (interfaceC11656a != null) {
                    interfaceC11656a.mo64960a(i11);
                }
            }
        }
    }

    /* renamed from: b */
    private void m64959b(Context context) {
        this.f60599x = (int) (16.0f * context.getResources().getDisplayMetrics().density);
        this.f60598w = 0;
        this.f60590B = 0.0f;
        this.f60596u = new int[]{-16398602};
        this.f60597v = 1;
        this.f60593r = -16398602;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((int) (5.0f * r4));
        Paint paint2 = new Paint(1);
        this.f60595t = paint2;
        paint2.setColor(this.f60593r);
        this.f60595t.setStrokeWidth((int) (r4 * 2.0f));
    }

    public int getCurrentColor() {
        return this.f60593r;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i11 = 0; i11 < this.f60596u.length; i11++) {
            int i12 = this.f60599x;
            m64958a(canvas, i12 + (((i12 * 2) + this.f60598w) * i11) + getPaddingLeft(), this.f60599x + getPaddingTop(), this.f60596u[i11]);
        }
        if (this.f60589A == 1) {
            this.f60600y = -1.0f;
            this.f60601z = -1.0f;
            this.f60589A = -1;
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = this.f60597v;
        setMeasuredDimension(getPaddingLeft() + (i13 * 2 * this.f60599x) + ((i13 - 1) * this.f60598w) + getPaddingRight(), getPaddingTop() + (this.f60599x * 2) + getPaddingBottom());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:            if (r0 != 6) goto L17;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                        }
                    }
                } else {
                    this.f60589A = 2;
                    this.f60600y = motionEvent.getX();
                    this.f60601z = motionEvent.getY();
                    invalidate();
                }
                return true;
            }
            this.f60589A = 1;
            invalidate();
            return true;
        }
        this.f60589A = 0;
        this.f60600y = motionEvent.getX();
        this.f60601z = motionEvent.getY();
        invalidate();
        return true;
    }

    public void setColorList(int[] iArr) {
        this.f60596u = iArr;
        this.f60597v = iArr.length;
        this.f60593r = iArr[0];
        requestLayout();
    }

    public void setCurrentSize(float f11) {
        this.f60594s = f11;
    }

    public void setOnColorChangedListener(InterfaceC11656a interfaceC11656a) {
        this.f60591p = interfaceC11656a;
    }

    public void setStrokeColor(int i11) {
        this.f60592q = i11;
    }
}
