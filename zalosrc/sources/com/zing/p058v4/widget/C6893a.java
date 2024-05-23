package com.zing.p058v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.AbstractC1579n0;

/* renamed from: com.zing.v4.widget.a */
/* loaded from: classes3.dex */
class C6893a extends AppCompatImageView {

    /* renamed from: p */
    Animation.AnimationListener f37796p;

    /* renamed from: q */
    int f37797q;

    /* renamed from: com.zing.v4.widget.a$a */
    /* loaded from: classes3.dex */
    private class a extends OvalShape {

        /* renamed from: p */
        RadialGradient f37798p;

        /* renamed from: q */
        Paint f37799q = new Paint();

        /* renamed from: r */
        int f37800r;

        public a(int i11, int i12) {
            C6893a.this.f37797q = i11;
            this.f37800r = i12;
            int i13 = this.f37800r;
            RadialGradient radialGradient = new RadialGradient(i13 / 2, i13 / 2, C6893a.this.f37797q, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.f37798p = radialGradient;
            this.f37799q.setShader(radialGradient);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = C6893a.this.getWidth() / 2;
            float height = C6893a.this.getHeight() / 2;
            canvas.drawCircle(width, height, (this.f37800r / 2) + C6893a.this.f37797q, this.f37799q);
            canvas.drawCircle(width, height, this.f37800r / 2, paint);
        }
    }

    public C6893a(Context context, int i11, float f11) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f12 = getContext().getResources().getDisplayMetrics().density;
        int i12 = (int) (f11 * f12 * 2.0f);
        int i13 = (int) (1.75f * f12);
        int i14 = (int) (0.0f * f12);
        this.f37797q = (int) (3.5f * f12);
        if (m35378f()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC1579n0.m7817I0(this, f12 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new a(this.f37797q, i12));
            AbstractC1579n0.m7829O0(this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer(this.f37797q, i14, i13, 503316480);
            int i15 = this.f37797q;
            setPadding(i15, i15, i15, i15);
        }
        shapeDrawable.getPaint().setColor(i11);
        setBackgroundDrawable(shapeDrawable);
    }

    /* renamed from: f */
    boolean m35378f() {
        return true;
    }

    /* renamed from: g */
    public void m35379g(Animation.AnimationListener animationListener) {
        this.f37796p = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f37796p;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f37796p;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!m35378f()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f37797q * 2), getMeasuredHeight() + (this.f37797q * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i11);
        }
    }
}
