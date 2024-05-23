package com.zing.zalo.p077ui.widget.imageview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.AbstractC8923h0;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public class RoundCornerImageView extends RecyclingImageView {

    /* renamed from: C */
    public static final int f70443C = AbstractC23136l9.m118742r(5.0f);

    /* renamed from: A */
    private int f70444A;

    /* renamed from: B */
    private Drawable f70445B;

    /* renamed from: p */
    public int f70446p;

    /* renamed from: q */
    private RoundRectShape f70447q;

    /* renamed from: r */
    private Paint f70448r;

    /* renamed from: s */
    private int f70449s;

    /* renamed from: t */
    private boolean f70450t;

    /* renamed from: u */
    private int f70451u;

    /* renamed from: v */
    private int f70452v;

    /* renamed from: w */
    private Paint f70453w;

    /* renamed from: x */
    private RectF f70454x;

    /* renamed from: y */
    private RectF f70455y;

    /* renamed from: z */
    private Paint f70456z;

    public RoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70446p = f70443C;
        this.f70449s = -1;
        this.f70450t = false;
        this.f70452v = -1;
        this.f70444A = 0;
        m76286j(context, attributeSet);
    }

    /* renamed from: i */
    private void m76285i(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        this.f70448r.setColor(this.f70449s);
        RoundRectShape roundRectShape = this.f70447q;
        if (roundRectShape != null) {
            roundRectShape.resize(width, height);
        }
        canvas.save();
        canvas.translate(0.0f, -1.0f);
        int i11 = this.f70446p;
        canvas.clipRect(0, 0, i11, i11);
        RoundRectShape roundRectShape2 = this.f70447q;
        if (roundRectShape2 != null) {
            roundRectShape2.draw(canvas, this.f70448r);
        }
        canvas.restore();
        canvas.save();
        canvas.translate(0.0f, -1.0f);
        int i12 = this.f70446p;
        canvas.clipRect(width - i12, 0, width, i12);
        RoundRectShape roundRectShape3 = this.f70447q;
        if (roundRectShape3 != null) {
            roundRectShape3.draw(canvas, this.f70448r);
        }
        canvas.restore();
        canvas.save();
        int i13 = this.f70446p;
        canvas.clipRect(0, height - i13, i13, height);
        RoundRectShape roundRectShape4 = this.f70447q;
        if (roundRectShape4 != null) {
            roundRectShape4.draw(canvas, this.f70448r);
        }
        canvas.restore();
        canvas.save();
        int i14 = this.f70446p;
        canvas.clipRect(width - i14, height - i14, width, height);
        RoundRectShape roundRectShape5 = this.f70447q;
        if (roundRectShape5 != null) {
            roundRectShape5.draw(canvas, this.f70448r);
        }
        canvas.restore();
    }

    /* renamed from: j */
    private void m76286j(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC8923h0.RoundCornerImageView, 0, 0);
            try {
                this.f70446p = (int) obtainStyledAttributes.getDimension(AbstractC8923h0.RoundCornerImageView_round_radius, f70443C);
                if (obtainStyledAttributes.hasValue(AbstractC8923h0.RoundCornerImageView_stroke_width)) {
                    this.f70450t = true;
                    this.f70451u = (int) obtainStyledAttributes.getDimension(AbstractC8923h0.RoundCornerImageView_stroke_width, AbstractC23136l9.m118742r(1.0f));
                    this.f70452v = obtainStyledAttributes.getColor(AbstractC8923h0.RoundCornerImageView_stroke_color, -1);
                    Paint paint = new Paint(1);
                    this.f70453w = paint;
                    paint.setStrokeWidth(this.f70451u);
                    this.f70453w.setColor(this.f70452v);
                    this.f70453w.setStyle(Paint.Style.STROKE);
                    this.f70454x = new RectF();
                }
                if (Build.VERSION.SDK_INT < 23 && obtainStyledAttributes.hasValue(AbstractC8923h0.RoundCornerImageView_android_foreground)) {
                    this.f70445B = obtainStyledAttributes.getDrawable(AbstractC8923h0.RoundCornerImageView_android_foreground);
                }
                obtainStyledAttributes.recycle();
                setRoundRadius(this.f70446p);
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        }
        this.f70448r = new Paint(1);
        this.f70455y = new RectF();
        Paint paint2 = new Paint(1);
        this.f70456z = paint2;
        paint2.setColor(this.f70449s);
        this.f70456z.setAlpha(this.f70444A);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        Drawable drawable;
        super.drawableStateChanged();
        if (Build.VERSION.SDK_INT < 23 && (drawable = this.f70445B) != null && drawable.isStateful()) {
            this.f70445B.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        Drawable drawable;
        super.jumpDrawablesToCurrentState();
        if (Build.VERSION.SDK_INT < 23 && (drawable = this.f70445B) != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        super.onDraw(canvas);
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        m76285i(canvas);
        if (this.f70450t) {
            float f11 = this.f70451u / 2.0f;
            this.f70454x.set(f11, f11, width - f11, height - f11);
            RectF rectF = this.f70454x;
            int i11 = this.f70446p;
            canvas.drawRoundRect(rectF, i11, i11, this.f70453w);
        }
        int i12 = this.f70444A;
        if (i12 > 0 && i12 < 256) {
            this.f70455y.set(0.0f, 0.0f, width, height);
            RectF rectF2 = this.f70455y;
            int i13 = this.f70446p;
            canvas.drawRoundRect(rectF2, i13, i13, this.f70456z);
        }
        if (Build.VERSION.SDK_INT < 23 && (drawable = this.f70445B) != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        Drawable drawable;
        super.onMeasure(i11, i12);
        if (Build.VERSION.SDK_INT < 23 && (drawable = this.f70445B) != null) {
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        Drawable drawable;
        super.onSizeChanged(i11, i12, i13, i14);
        if (Build.VERSION.SDK_INT < 23 && (drawable = this.f70445B) != null) {
            drawable.setBounds(0, 0, i11, i12);
            invalidate();
        }
    }

    @Override // android.view.View
    public void setAlpha(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        int i11 = (int) ((1.0f - f11) * 255.0f);
        this.f70444A = i11;
        this.f70456z.setAlpha(i11);
        invalidate();
    }

    @Override // com.androidquery.util.RecyclingImageView
    public void setDrawStroke(boolean z11) {
        this.f70450t = z11;
    }

    public void setForegroundCompat(Drawable drawable) {
        Drawable drawable2;
        try {
            if (Build.VERSION.SDK_INT >= 23 || (drawable2 = this.f70445B) == drawable) {
                return;
            }
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f70445B);
            }
            this.f70445B = drawable;
            if (drawable != null) {
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
            }
            requestLayout();
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public void setForegroundResourceCompat(int i11) {
        setForegroundCompat(AbstractC1388a.m6964f(getContext(), i11));
    }

    public void setRoundCornerColor(int i11) {
        this.f70449s = i11;
        Paint paint = this.f70456z;
        if (paint != null) {
            paint.setColor(i11);
        }
        invalidate();
    }

    public void setRoundRadius(int i11) {
        this.f70446p = i11;
        RectF rectF = new RectF(0.1f, 0.1f, 0.1f, 0.1f);
        int i12 = this.f70446p;
        this.f70447q = new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}, rectF, new float[]{i12, i12, i12, i12, i12, i12, i12, i12});
    }

    @Override // com.androidquery.util.RecyclingImageView
    public void setStrokeColor(int i11) {
        this.f70452v = i11;
        Paint paint = this.f70453w;
        if (paint != null) {
            paint.setColor(i11);
        }
        invalidate();
    }
}
