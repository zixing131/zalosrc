package com.zing.zalo.camera.colorpalette.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.AbstractC23222t7;

/* loaded from: classes3.dex */
public final class ColorFillButton extends ColorButton {

    /* renamed from: A */
    private static final int f41051A;

    /* renamed from: B */
    private static Paint f41052B;
    public static final C7579a Companion = new C7579a(null);

    /* renamed from: z */
    private static final int f41053z = AbstractC23222t7.f112558f;

    /* renamed from: w */
    private boolean f41054w;

    /* renamed from: x */
    private int f41055x;

    /* renamed from: y */
    private Paint f41056y;

    /* renamed from: com.zing.zalo.camera.colorpalette.customview.ColorFillButton$a */
    /* loaded from: classes3.dex */
    public static final class C7579a {
        private C7579a() {
        }

        public /* synthetic */ C7579a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    static {
        int m118742r = AbstractC23136l9.m118742r(0.5f);
        f41051A = m118742r;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(m118742r);
        paint.setColor(-12763843);
        f41052B = paint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ColorFillButton(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(null);
        paint.setColor(-1);
        this.f41056y = paint;
        this.f41054w = false;
        this.f41055x = f41053z;
    }

    /* renamed from: b */
    public final void m39183b(int i11, int i12) {
        int i13;
        LinearGradient linearGradient;
        Paint paint = this.f41056y;
        if (i11 != i12) {
            i13 = -1;
        } else {
            i13 = i11;
        }
        paint.setColor(i13);
        if (i11 != i12) {
            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, getViewSize(), i11, i12, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        paint.setShader(linearGradient);
    }

    public final boolean getShowInnerStroke() {
        return this.f41054w;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i11;
        AbstractC19074t.m100208f(canvas, "canvas");
        Paint paintStroke = getPaintStroke();
        if (m39182a()) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        paintStroke.setColor(i11);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        canvas.drawCircle(width, height, getRadius() - getStrokePadding(), getPaintStroke());
        canvas.drawCircle(width, height, getRadius() - this.f41055x, this.f41056y);
        if (this.f41054w) {
            canvas.drawCircle(width, height, r0 - (f41051A / 2), f41052B);
        }
    }

    public final void setPaintCircleColor(int i11) {
        Paint paint = this.f41056y;
        paint.setColor(i11);
        paint.setShader(null);
    }

    public final void setShowInnerStroke(boolean z11) {
        this.f41054w = z11;
    }
}
