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
import com.zing.zalo.zdesign.component.TrackingFrameLayout;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class FrameRoundedLayout extends TrackingFrameLayout {

    /* renamed from: A */
    private Paint f67114A;

    /* renamed from: B */
    private boolean f67115B;

    /* renamed from: q */
    private final int f67116q;

    /* renamed from: r */
    private Path f67117r;

    /* renamed from: s */
    private float f67118s;

    /* renamed from: t */
    private float f67119t;

    /* renamed from: u */
    private float f67120u;

    /* renamed from: v */
    private float f67121v;

    /* renamed from: w */
    private int f67122w;

    /* renamed from: x */
    private int f67123x;

    /* renamed from: y */
    private float f67124y;

    /* renamed from: z */
    private int f67125z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameRoundedLayout(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f67116q = 1;
        this.f67122w = 1;
        this.f67123x = 1;
        this.f67125z = 1;
    }

    /* renamed from: d */
    private final void m72877d() {
        boolean z11;
        if (this.f67125z != this.f67116q && this.f67124y > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f67115B = z11;
        if (!z11) {
            return;
        }
        Paint paint = new Paint();
        this.f67114A = paint;
        paint.setColor(this.f67125z);
        paint.setStrokeWidth(this.f67124y);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: c */
    public final void m72878c(Context context, AttributeSet attributeSet) {
        AbstractC19074t.m100208f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.FrameRoundedLayout);
        AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FrameRoundedLayout_connerRadius, 0);
        this.f67118s = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FrameRoundedLayout_topRight, dimensionPixelSize);
        this.f67119t = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FrameRoundedLayout_topLeft, dimensionPixelSize);
        this.f67120u = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FrameRoundedLayout_bottomRight, dimensionPixelSize);
        this.f67121v = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.FrameRoundedLayout_bottomLeft, dimensionPixelSize);
        this.f67122w = obtainStyledAttributes.getColor(AbstractC8923h0.FrameRoundedLayout_backgroundPressColor, this.f67116q);
        this.f67123x = obtainStyledAttributes.getColor(AbstractC8923h0.FrameRoundedLayout_normalBackgroundColor, this.f67116q);
        this.f67125z = obtainStyledAttributes.getColor(AbstractC8923h0.FrameRoundedLayout_borderColor, this.f67116q);
        this.f67124y = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.LinearRoundedLayout_borderWidth, 0);
        int i11 = this.f67123x;
        int i12 = this.f67116q;
        if (i11 == i12 || this.f67122w == i12) {
            this.f67123x = i12;
            this.f67122w = i12;
        }
        int i13 = this.f67123x;
        if (i13 != i12) {
            setBackgroundColor(i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z11) {
        int i11;
        super.dispatchSetPressed(z11);
        int i12 = this.f67122w;
        int i13 = this.f67116q;
        if (i12 != i13 && (i11 = this.f67123x) != i13) {
            if (!z11) {
                i12 = i11;
            }
            setBackgroundColor(i12);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f67117r != null) {
            canvas.save();
            Path path = this.f67117r;
            AbstractC19074t.m100205c(path);
            canvas.clipPath(path, Region.Op.INTERSECT);
            super.draw(canvas);
            if (this.f67115B && this.f67114A != null) {
                Path path2 = this.f67117r;
                AbstractC19074t.m100205c(path2);
                Paint paint = this.f67114A;
                AbstractC19074t.m100205c(paint);
                canvas.drawPath(path2, paint);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final Path getMPath() {
        return this.f67117r;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        RectF rectF = new RectF(0.0f, 0.0f, i11, i12);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f11 = this.f67119t;
        fArr[0] = f11;
        fArr[1] = f11;
        float f12 = this.f67118s;
        fArr[2] = f12;
        fArr[3] = f12;
        float f13 = this.f67120u;
        fArr[4] = f13;
        fArr[5] = f13;
        float f14 = this.f67121v;
        fArr[6] = f14;
        fArr[7] = f14;
        Path path = new Path();
        this.f67117r = path;
        AbstractC19074t.m100205c(path);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Path path2 = this.f67117r;
        AbstractC19074t.m100205c(path2);
        path2.close();
        m72877d();
    }

    public final void setCornerRadius(float f11) {
        this.f67118s = f11;
        this.f67119t = f11;
        this.f67120u = f11;
        this.f67121v = f11;
        invalidate();
    }

    public final void setMPath(Path path) {
        this.f67117r = path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameRoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f67116q = 1;
        this.f67122w = 1;
        this.f67123x = 1;
        this.f67125z = 1;
        m72878c(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameRoundedLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f67116q = 1;
        this.f67122w = 1;
        this.f67123x = 1;
        this.f67125z = 1;
        m72878c(context, attributeSet);
    }
}
