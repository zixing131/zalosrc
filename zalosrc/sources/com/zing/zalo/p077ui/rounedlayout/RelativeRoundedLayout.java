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
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class RelativeRoundedLayout extends TrackingRelativeLayout {

    /* renamed from: A */
    private Paint f67138A;

    /* renamed from: B */
    private boolean f67139B;

    /* renamed from: q */
    private final int f67140q;

    /* renamed from: r */
    private Path f67141r;

    /* renamed from: s */
    private float f67142s;

    /* renamed from: t */
    private float f67143t;

    /* renamed from: u */
    private float f67144u;

    /* renamed from: v */
    private float f67145v;

    /* renamed from: w */
    private int f67146w;

    /* renamed from: x */
    private int f67147x;

    /* renamed from: y */
    private float f67148y;

    /* renamed from: z */
    private int f67149z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeRoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f67140q = 1;
        this.f67146w = 1;
        this.f67147x = 1;
        this.f67149z = 1;
        m72883c(context, attributeSet);
    }

    /* renamed from: d */
    private final void m72882d() {
        boolean z11;
        if (this.f67149z != this.f67140q && this.f67148y > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f67139B = z11;
        if (!z11) {
            return;
        }
        Paint paint = new Paint();
        this.f67138A = paint;
        paint.setColor(this.f67149z);
        paint.setStrokeWidth(this.f67148y);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: c */
    public final void m72883c(Context context, AttributeSet attributeSet) {
        AbstractC19074t.m100208f(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC8923h0.RelativeRoundedLayout);
        AbstractC19074t.m100207e(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RelativeRoundedLayout_connerRadius, 0);
        this.f67142s = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RelativeRoundedLayout_topRight, dimensionPixelSize);
        this.f67143t = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RelativeRoundedLayout_topLeft, dimensionPixelSize);
        this.f67144u = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RelativeRoundedLayout_bottomRight, dimensionPixelSize);
        this.f67145v = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RelativeRoundedLayout_bottomLeft, dimensionPixelSize);
        this.f67146w = obtainStyledAttributes.getColor(AbstractC8923h0.RelativeRoundedLayout_backgroundPressColor, this.f67140q);
        this.f67147x = obtainStyledAttributes.getColor(AbstractC8923h0.RelativeRoundedLayout_normalBackgroundColor, this.f67140q);
        this.f67149z = obtainStyledAttributes.getColor(AbstractC8923h0.RelativeRoundedLayout_borderColor, this.f67140q);
        this.f67148y = obtainStyledAttributes.getDimensionPixelSize(AbstractC8923h0.RelativeRoundedLayout_borderWidth, 0);
        int i11 = this.f67147x;
        int i12 = this.f67140q;
        if (i11 == i12 || this.f67146w == i12) {
            this.f67147x = i12;
            this.f67146w = i12;
        }
        int i13 = this.f67147x;
        if (i13 != i12) {
            setBackgroundColor(i13);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z11) {
        int i11;
        super.dispatchSetPressed(z11);
        int i12 = this.f67146w;
        int i13 = this.f67140q;
        if (i12 != i13 && (i11 = this.f67147x) != i13) {
            if (!z11) {
                i12 = i11;
            }
            setBackgroundColor(i12);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f67141r != null) {
            canvas.save();
            Path path = this.f67141r;
            AbstractC19074t.m100205c(path);
            canvas.clipPath(path, Region.Op.INTERSECT);
            super.draw(canvas);
            if (this.f67139B && this.f67138A != null) {
                Path path2 = this.f67141r;
                AbstractC19074t.m100205c(path2);
                Paint paint = this.f67138A;
                AbstractC19074t.m100205c(paint);
                canvas.drawPath(path2, paint);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final Path getMPath() {
        return this.f67141r;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        RectF rectF = new RectF(0.0f, 0.0f, i11, i12);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f11 = this.f67143t;
        fArr[0] = f11;
        fArr[1] = f11;
        float f12 = this.f67142s;
        fArr[2] = f12;
        fArr[3] = f12;
        float f13 = this.f67144u;
        fArr[4] = f13;
        fArr[5] = f13;
        float f14 = this.f67145v;
        fArr[6] = f14;
        fArr[7] = f14;
        Path path = new Path();
        this.f67141r = path;
        AbstractC19074t.m100205c(path);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Path path2 = this.f67141r;
        AbstractC19074t.m100205c(path2);
        path2.close();
        m72882d();
    }

    public final void setCornerRadius(float f11) {
        this.f67142s = f11;
        this.f67143t = f11;
        this.f67144u = f11;
        this.f67145v = f11;
        invalidate();
    }

    public final void setMPath(Path path) {
        this.f67141r = path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeRoundedLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f67140q = 1;
        this.f67146w = 1;
        this.f67147x = 1;
        this.f67149z = 1;
        m72883c(context, attributeSet);
    }
}
