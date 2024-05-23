package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.AbstractC1298f;

/* loaded from: classes2.dex */
public class MotionTelltales extends MockView {

    /* renamed from: A */
    private Paint f5444A;

    /* renamed from: B */
    MotionLayout f5445B;

    /* renamed from: C */
    float[] f5446C;

    /* renamed from: D */
    Matrix f5447D;

    /* renamed from: E */
    int f5448E;

    /* renamed from: F */
    int f5449F;

    /* renamed from: G */
    float f5450G;

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5444A = new Paint();
        this.f5446C = new float[2];
        this.f5447D = new Matrix();
        this.f5448E = 0;
        this.f5449F = -65281;
        this.f5450G = 0.25f;
        m6355a(context, attributeSet);
    }

    /* renamed from: a */
    private void m6355a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1298f.MotionTelltales);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == AbstractC1298f.MotionTelltales_telltales_tailColor) {
                    this.f5449F = obtainStyledAttributes.getColor(index, this.f5449F);
                } else if (index == AbstractC1298f.MotionTelltales_telltales_velocityMode) {
                    this.f5448E = obtainStyledAttributes.getInt(index, this.f5448E);
                } else if (index == AbstractC1298f.MotionTelltales_telltales_tailScale) {
                    this.f5450G = obtainStyledAttributes.getFloat(index, this.f5450G);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f5444A.setColor(this.f5449F);
        this.f5444A.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.f5447D);
        if (this.f5445B == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.f5445B = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i11 = 0; i11 < 5; i11++) {
            float f11 = fArr[i11];
            for (int i12 = 0; i12 < 5; i12++) {
                float f12 = fArr[i12];
                this.f5445B.m6011q0(this, f12, f11, this.f5446C, this.f5448E);
                this.f5447D.mapVectors(this.f5446C);
                float f13 = width * f12;
                float f14 = height * f11;
                float[] fArr2 = this.f5446C;
                float f15 = fArr2[0];
                float f16 = this.f5450G;
                float f17 = f14 - (fArr2[1] * f16);
                this.f5447D.mapVectors(fArr2);
                canvas.drawLine(f13, f14, f13 - (f15 * f16), f17, this.f5444A);
            }
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        postInvalidate();
    }

    public void setText(CharSequence charSequence) {
        this.f5382u = charSequence.toString();
        requestLayout();
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f5444A = new Paint();
        this.f5446C = new float[2];
        this.f5447D = new Matrix();
        this.f5448E = 0;
        this.f5449F = -65281;
        this.f5450G = 0.25f;
        m6355a(context, attributeSet);
    }
}
