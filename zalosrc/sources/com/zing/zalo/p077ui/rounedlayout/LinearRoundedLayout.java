package com.zing.zalo.p077ui.rounedlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import com.zing.zalo.AbstractC8923h0;
import com.zing.zalo.zdesign.component.TrackingLinearLayout;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class LinearRoundedLayout extends TrackingLinearLayout {

    /* renamed from: A */
    private Paint f67126A;

    /* renamed from: B */
    private boolean f67127B;

    /* renamed from: q */
    private final int f67128q;

    /* renamed from: r */
    private Path f67129r;

    /* renamed from: s */
    private float f67130s;

    /* renamed from: t */
    private float f67131t;

    /* renamed from: u */
    private float f67132u;

    /* renamed from: v */
    private float f67133v;

    /* renamed from: w */
    private int f67134w;

    /* renamed from: x */
    private int f67135x;

    /* renamed from: y */
    private float f67136y;

    /* renamed from: z */
    private int f67137z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearRoundedLayout(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f67128q = 1;
        this.f67134w = 1;
        this.f67135x = 1;
        this.f67137z = 1;
    }

    /* renamed from: e */
    private final void m72879e() {
        boolean z11;
        if (this.f67137z != this.f67128q && this.f67136y > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f67127B = z11;
        if (!z11) {
            return;
        }
        Paint paint = new Paint();
        this.f67126A = paint;
        paint.setColor(this.f67137z);
        paint.setStrokeWidth(this.f67136y);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: c */
    public final void m72880c(Context context, AttributeSet attributeSet) {
        AbstractC19074t.m100208f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.LinearRoundedLayout);
        AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_connerRadius, 0);
        this.f67130s = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_topRight, dimensionPixelSize);
        this.f67131t = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_topLeft, dimensionPixelSize);
        this.f67132u = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_bottomRight, dimensionPixelSize);
        this.f67133v = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_bottomLeft, dimensionPixelSize);
        this.f67134w = obtainStyledAttributes.getColor(AbstractC8923h0.LinearRoundedLayout_backgroundPressColor, this.f67128q);
        this.f67135x = obtainStyledAttributes.getColor(AbstractC8923h0.LinearRoundedLayout_normalBackgroundColor, this.f67128q);
        this.f67137z = obtainStyledAttributes.getColor(AbstractC8923h0.LinearRoundedLayout_borderColor, this.f67128q);
        this.f67136y = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_borderWidth, 0);
        int i11 = this.f67135x;
        int i12 = this.f67128q;
        if (i11 == i12 || this.f67134w == i12) {
            this.f67135x = i12;
            this.f67134w = i12;
        }
        int i13 = this.f67135x;
        if (i13 != i12) {
            setBackgroundColor(i13);
        }
    }

    /* renamed from: d */
    public final void m72881d(int i11, int i12) {
        this.f67135x = i11;
        this.f67134w = i12;
        setBackgroundColor(i11);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z11) {
        int i11;
        super.dispatchSetPressed(z11);
        int i12 = this.f67134w;
        int i13 = this.f67128q;
        if (i12 != i13 && (i11 = this.f67135x) != i13) {
            if (!z11) {
                i12 = i11;
            }
            setBackgroundColor(i12);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f67129r != null) {
            canvas.save();
            Path path = this.f67129r;
            AbstractC19074t.m100205c(path);
            canvas.clipPath(path, Region.Op.INTERSECT);
            super.draw(canvas);
            if (this.f67127B && this.f67126A != null) {
                Path path2 = this.f67129r;
                AbstractC19074t.m100205c(path2);
                Paint paint = this.f67126A;
                AbstractC19074t.m100205c(paint);
                canvas.drawPath(path2, paint);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final Path getMPath() {
        return this.f67129r;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        RectF rectF = new RectF(0.0f, 0.0f, i11, i12);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f11 = this.f67131t;
        fArr[0] = f11;
        fArr[1] = f11;
        float f12 = this.f67130s;
        fArr[2] = f12;
        fArr[3] = f12;
        float f13 = this.f67132u;
        fArr[4] = f13;
        fArr[5] = f13;
        float f14 = this.f67133v;
        fArr[6] = f14;
        fArr[7] = f14;
        Path path = new Path();
        this.f67129r = path;
        AbstractC19074t.m100205c(path);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Path path2 = this.f67129r;
        AbstractC19074t.m100205c(path2);
        path2.close();
        m72879e();
    }

    public final void setCornerRadius(float f11) {
        this.f67130s = f11;
        this.f67131t = f11;
        this.f67132u = f11;
        this.f67133v = f11;
        invalidate();
    }

    public final void setMPath(Path path) {
        this.f67129r = path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearRoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f67128q = 1;
        this.f67134w = 1;
        this.f67135x = 1;
        this.f67137z = 1;
        m72880c(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearRoundedLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f67128q = 1;
        this.f67134w = 1;
        this.f67135x = 1;
        this.f67137z = 1;
        m72880c(context, attributeSet);
    }
}
