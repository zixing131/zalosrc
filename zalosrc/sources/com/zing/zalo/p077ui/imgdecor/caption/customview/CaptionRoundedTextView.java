package com.zing.zalo.p077ui.imgdecor.caption.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;

/* loaded from: classes5.dex */
public final class CaptionRoundedTextView extends RobotoTextView {
    public static final C12099a Companion = new C12099a(null);

    /* renamed from: K */
    private static int f63153K = AbstractC23222t7.f112562h;

    /* renamed from: A */
    private final RectF f63154A;

    /* renamed from: B */
    private LinearGradient f63155B;

    /* renamed from: C */
    private int f63156C;

    /* renamed from: D */
    private int f63157D;

    /* renamed from: E */
    private int f63158E;

    /* renamed from: F */
    private boolean f63159F;

    /* renamed from: G */
    private boolean f63160G;

    /* renamed from: H */
    private boolean f63161H;

    /* renamed from: I */
    private final Paint f63162I;

    /* renamed from: J */
    private final Paint f63163J;

    /* renamed from: com.zing.zalo.ui.imgdecor.caption.customview.CaptionRoundedTextView$a */
    /* loaded from: classes5.dex */
    public static final class C12099a {
        private C12099a() {
        }

        public /* synthetic */ C12099a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptionRoundedTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f63154A = new RectF();
        this.f63158E = f63153K;
        this.f63159F = true;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(null);
        this.f63162I = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(AbstractC23222t7.f112550b);
        this.f63163J = paint2;
        setLayerType(1, null);
    }

    public final boolean getDrawBackground() {
        return this.f63159F;
    }

    public final boolean getDrawStroke() {
        return this.f63160G;
    }

    public final boolean getIncludePadding() {
        return this.f63161H;
    }

    public final int getRadius() {
        return this.f63158E;
    }

    /* renamed from: i */
    public final void m67501i(int i11, int i12) {
        this.f63155B = null;
        this.f63156C = 0;
        this.f63157D = 0;
        Paint paint = this.f63162I;
        paint.setShader(null);
        paint.setColor(i11);
        paint.setAlpha(i12);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.RobotoTextView, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        if (this.f63161H && this.f63159F) {
            this.f63154A.set(AbstractC23222t7.f112550b + getPaddingLeft(), AbstractC23222t7.f112550b + getPaddingTop(), (getWidth() - AbstractC23222t7.f112550b) - getPaddingRight(), (getHeight() - AbstractC23222t7.f112550b) - getPaddingBottom());
        } else {
            RectF rectF = this.f63154A;
            int i11 = AbstractC23222t7.f112550b;
            rectF.set(i11, i11, getWidth() - AbstractC23222t7.f112550b, getHeight() - AbstractC23222t7.f112550b);
        }
        if (this.f63155B == null && this.f63156C != 0 && this.f63157D != 0) {
            float centerX = this.f63154A.centerX();
            RectF rectF2 = this.f63154A;
            LinearGradient linearGradient = new LinearGradient(centerX, rectF2.top, rectF2.centerX(), this.f63154A.bottom, this.f63156C, this.f63157D, Shader.TileMode.CLAMP);
            this.f63155B = linearGradient;
            this.f63162I.setShader(linearGradient);
        }
        if (this.f63159F) {
            RectF rectF3 = this.f63154A;
            int i12 = this.f63158E;
            canvas.drawRoundRect(rectF3, i12, i12, this.f63162I);
        } else if (this.f63160G) {
            RectF rectF4 = this.f63154A;
            int i13 = this.f63158E;
            canvas.drawRoundRect(rectF4, i13, i13, this.f63163J);
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        m67501i(i11, 255);
    }

    public final void setDrawBackground(boolean z11) {
        this.f63159F = z11;
    }

    public final void setDrawStroke(boolean z11) {
        this.f63160G = z11;
    }

    public final void setIncludePadding(boolean z11) {
        this.f63161H = z11;
    }

    public final void setRadius(int i11) {
        this.f63158E = i11;
    }

    public final void setStrokeColor(int i11) {
        this.f63163J.setColor(i11);
    }
}
