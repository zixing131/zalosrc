package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.core.view.AbstractC1579n0;
import p226i2.AbstractC20187a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* loaded from: classes2.dex */
class C1956a extends ImageView {

    /* renamed from: p */
    private Animation.AnimationListener f8328p;

    /* renamed from: q */
    private int f8329q;

    /* renamed from: r */
    private int f8330r;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* loaded from: classes2.dex */
    private static class a extends OvalShape {

        /* renamed from: p */
        private Paint f8331p = new Paint();

        /* renamed from: q */
        private int f8332q;

        /* renamed from: r */
        private C1956a f8333r;

        a(C1956a c1956a, int i11) {
            this.f8333r = c1956a;
            this.f8332q = i11;
            m10767a((int) rect().width());
        }

        /* renamed from: a */
        private void m10767a(int i11) {
            float f11 = i11 / 2;
            this.f8331p.setShader(new RadialGradient(f11, f11, this.f8332q, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            float width = this.f8333r.getWidth() / 2;
            float height = this.f8333r.getHeight() / 2;
            canvas.drawCircle(width, height, width, this.f8331p);
            canvas.drawCircle(width, height, r0 - this.f8332q, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        protected void onResize(float f11, float f12) {
            super.onResize(f11, f12);
            m10767a((int) f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1956a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f11 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f11);
        int i12 = (int) (0.0f * f11);
        this.f8329q = (int) (3.5f * f11);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(AbstractC20187a.SwipeRefreshLayout);
        this.f8330r = obtainStyledAttributes.getColor(AbstractC20187a.f99725xaa980688, -328966);
        obtainStyledAttributes.recycle();
        if (m10765a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            AbstractC1579n0.m7817I0(this, f11 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.f8329q));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.f8329q, i12, i11, 503316480);
            int i13 = this.f8329q;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f8330r);
        AbstractC1579n0.m7807D0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m10765a() {
        return true;
    }

    /* renamed from: b */
    public void m10766b(Animation.AnimationListener animationListener) {
        this.f8328p = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f8328p;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f8328p;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!m10765a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f8329q * 2), getMeasuredHeight() + (this.f8329q * 2));
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i11);
            this.f8330r = i11;
        }
    }
}
