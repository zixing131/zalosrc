package com.zing.zalo.libbubbleview.p066ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import com.zing.zalo.zdesign.component.TrackingRelativeLayout;
import fn0.AbstractC19074t;

/* loaded from: classes4.dex */
public class FloatingRoundedLayout extends TrackingRelativeLayout {

    /* renamed from: A */
    private Paint f47835A;

    /* renamed from: B */
    private boolean f47836B;

    /* renamed from: q */
    private final int f47837q;

    /* renamed from: r */
    private Path f47838r;

    /* renamed from: s */
    private float f47839s;

    /* renamed from: t */
    private float f47840t;

    /* renamed from: u */
    private float f47841u;

    /* renamed from: v */
    private float f47842v;

    /* renamed from: w */
    private int f47843w;

    /* renamed from: x */
    private int f47844x;

    /* renamed from: y */
    private float f47845y;

    /* renamed from: z */
    private int f47846z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingRoundedLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f47837q = 1;
        this.f47843w = 1;
        this.f47844x = 1;
        this.f47846z = 1;
    }

    /* renamed from: d */
    private final void m47821d() {
        boolean z11;
        if (this.f47846z != this.f47837q && this.f47845y > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47836B = z11;
        if (!z11) {
            return;
        }
        Paint paint = new Paint();
        this.f47835A = paint;
        paint.setColor(this.f47846z);
        paint.setStrokeWidth(this.f47845y);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: c */
    public final void m47822c(float f11, int i11) {
        if (this.f47836B) {
            return;
        }
        this.f47836B = true;
        this.f47846z = i11;
        this.f47845y = f11;
        m47821d();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSetPressed(boolean z11) {
        int i11;
        super.dispatchSetPressed(z11);
        int i12 = this.f47843w;
        int i13 = this.f47837q;
        if (i12 != i13 && (i11 = this.f47844x) != i13) {
            if (!z11) {
                i12 = i11;
            }
            setBackgroundColor(i12);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f47838r != null) {
            canvas.save();
            Path path = this.f47838r;
            AbstractC19074t.m100205c(path);
            canvas.clipPath(path, Region.Op.INTERSECT);
            super.draw(canvas);
            if (this.f47836B && this.f47835A != null) {
                Path path2 = this.f47838r;
                AbstractC19074t.m100205c(path2);
                Paint paint = this.f47835A;
                AbstractC19074t.m100205c(paint);
                canvas.drawPath(path2, paint);
            }
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final Path getPath() {
        return this.f47838r;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        RectF rectF = new RectF(0.0f, 0.0f, i11, i12);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        float f11 = this.f47840t;
        fArr[0] = f11;
        fArr[1] = f11;
        float f12 = this.f47839s;
        fArr[2] = f12;
        fArr[3] = f12;
        float f13 = this.f47841u;
        fArr[4] = f13;
        fArr[5] = f13;
        float f14 = this.f47842v;
        fArr[6] = f14;
        fArr[7] = f14;
        Path path = new Path();
        this.f47838r = path;
        AbstractC19074t.m100205c(path);
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        Path path2 = this.f47838r;
        AbstractC19074t.m100205c(path2);
        path2.close();
        m47821d();
    }

    public final void setCornerRadius(float f11) {
        this.f47839s = f11;
        this.f47840t = f11;
        this.f47841u = f11;
        this.f47842v = f11;
        invalidate();
    }

    public final void setPath(Path path) {
        this.f47838r = path;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingRoundedLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f47837q = 1;
        this.f47843w = 1;
        this.f47844x = 1;
        this.f47846z = 1;
    }
}
