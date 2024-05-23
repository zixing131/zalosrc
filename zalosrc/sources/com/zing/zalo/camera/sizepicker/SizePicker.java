package com.zing.zalo.camera.sizepicker;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes3.dex */
public final class SizePicker extends View {
    public static final C7735a Companion = new C7735a(null);

    /* renamed from: A */
    private final PointF f41533A;

    /* renamed from: B */
    private final PointF f41534B;

    /* renamed from: C */
    private final PointF f41535C;

    /* renamed from: D */
    private final PointF f41536D;

    /* renamed from: E */
    private float f41537E;

    /* renamed from: F */
    private float f41538F;

    /* renamed from: G */
    private float f41539G;

    /* renamed from: H */
    private boolean f41540H;

    /* renamed from: I */
    private float f41541I;

    /* renamed from: J */
    private float f41542J;

    /* renamed from: K */
    private int f41543K;

    /* renamed from: L */
    private int f41544L;

    /* renamed from: M */
    private int f41545M;

    /* renamed from: N */
    private int f41546N;

    /* renamed from: O */
    private int f41547O;

    /* renamed from: P */
    private int f41548P;

    /* renamed from: Q */
    private int f41549Q;

    /* renamed from: R */
    private int f41550R;

    /* renamed from: S */
    private final int f41551S;

    /* renamed from: T */
    private int f41552T;

    /* renamed from: p */
    private InterfaceC7736b f41553p;

    /* renamed from: q */
    private boolean f41554q;

    /* renamed from: r */
    private boolean f41555r;

    /* renamed from: s */
    private boolean f41556s;

    /* renamed from: t */
    private final OvershootInterpolator f41557t;

    /* renamed from: u */
    private final Paint f41558u;

    /* renamed from: v */
    private final Paint f41559v;

    /* renamed from: w */
    private final RectF f41560w;

    /* renamed from: x */
    private final RectF f41561x;

    /* renamed from: y */
    private final RectF f41562y;

    /* renamed from: z */
    private final RectF f41563z;

    /* renamed from: com.zing.zalo.camera.sizepicker.SizePicker$a */
    /* loaded from: classes3.dex */
    public static final class C7735a {
        private C7735a() {
        }

        public /* synthetic */ C7735a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.camera.sizepicker.SizePicker$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC7736b {
        /* renamed from: a */
        void mo39488a(boolean z11);

        /* renamed from: b */
        void mo39489b();

        /* renamed from: c */
        void mo39490c(float f11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int m118713h0;
        AbstractC19074t.m100208f(context, "context");
        this.f41557t = new OvershootInterpolator(1.02f);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.f41558u = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        this.f41559v = paint2;
        this.f41560w = new RectF();
        this.f41561x = new RectF();
        this.f41562y = new RectF();
        this.f41563z = new RectF();
        this.f41533A = new PointF();
        this.f41534B = new PointF();
        this.f41535C = new PointF();
        this.f41536D = new PointF();
        this.f41537E = 1.0f;
        this.f41538F = 0.27f;
        this.f41552T = 5;
        this.f41543K = AbstractC23136l9.m118742r(15.0f);
        if (AbstractC23136l9.m118656I0()) {
            m118713h0 = AbstractC23136l9.m118713h0() / 3;
        } else {
            m118713h0 = AbstractC23136l9.m118713h0() / 2;
        }
        this.f41544L = m118713h0;
        this.f41545M = AbstractC23136l9.m118742r(30.0f);
        this.f41548P = AbstractC23136l9.m118742r(10.0f);
        this.f41549Q = AbstractC23136l9.m118742r(50.0f);
        this.f41546N = AbstractC23136l9.m118742r(4.0f);
        this.f41547O = AbstractC23136l9.m118742r(1.0f);
        setWeight(this.f41537E);
        this.f41541I = 1 / (context.getResources().getDisplayMetrics().densityDpi / 160);
        this.f41542J = AbstractC23136l9.m118742r(5.0f);
        this.f41551S = AbstractC23136l9.m118742r(10.0f) + (AbstractC23136l9.m118742r(30.0f) / 2);
        setWillNotDraw(false);
    }

    /* renamed from: a */
    private final void m39487a(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, Paint paint) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        path.lineTo(pointF2.x, pointF2.y);
        path.lineTo(pointF3.x, pointF3.y);
        path.lineTo(pointF4.x, pointF4.y);
        path.lineTo(pointF.x, pointF.y);
        path.close();
        canvas.drawPath(path, paint);
    }

    public final InterfaceC7736b getDelegate() {
        return this.f41553p;
    }

    public final int getDistanceFromLeftEdgeToCenterOfPicker() {
        return this.f41551S;
    }

    public final boolean getDragging() {
        return this.f41540H;
    }

    public final float getDraggingFactor() {
        return this.f41539G;
    }

    public final float getLocation() {
        return this.f41537E;
    }

    public final int getMaxSize() {
        return this.f41549Q;
    }

    public final AnimatorSet getOpenSizePickerAnimator() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", -this.f41551S);
        AbstractC19074t.m100207e(ofFloat, "ofFloat(...)");
        ofFloat.setStartDelay(500L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        return animatorSet;
    }

    public final float getWeight() {
        return this.f41538F;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        AbstractC19074t.m100208f(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        int i11 = configuration.orientation;
        if (i11 != 1) {
            if (i11 == 2) {
                this.f41544L = AbstractC23136l9.m118713h0() / 2;
            }
        } else {
            this.f41544L = AbstractC23136l9.m118713h0() / 3;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        this.f41559v.setColor(-1728053248);
        this.f41559v.setStrokeWidth(AbstractC23136l9.m118742r(this.f41541I));
        float f11 = 5;
        float f12 = 2;
        float width = (this.f41562y.width() / f11) / f12;
        PointF pointF = this.f41533A;
        RectF rectF = this.f41562y;
        pointF.x = rectF.left;
        PointF pointF2 = this.f41536D;
        pointF2.x = rectF.right;
        float f13 = rectF.top;
        pointF2.y = f13;
        pointF.y = f13;
        this.f41534B.x = rectF.centerX() - width;
        this.f41535C.x = this.f41562y.centerX() + width;
        PointF pointF3 = this.f41535C;
        float f14 = this.f41562y.bottom;
        pointF3.y = f14;
        PointF pointF4 = this.f41534B;
        pointF4.y = f14;
        m39487a(canvas, this.f41533A, pointF4, pointF3, this.f41536D, this.f41559v);
        this.f41558u.setColor(1694498815);
        float width2 = (this.f41561x.width() / f11) / f12;
        PointF pointF5 = this.f41533A;
        RectF rectF2 = this.f41561x;
        pointF5.x = rectF2.left;
        PointF pointF6 = this.f41536D;
        pointF6.x = rectF2.right;
        float f15 = rectF2.top;
        pointF6.y = f15;
        pointF5.y = f15;
        this.f41534B.x = rectF2.centerX() - width2;
        this.f41535C.x = this.f41561x.centerX() + width2;
        PointF pointF7 = this.f41535C;
        float f16 = this.f41561x.bottom;
        pointF7.y = f16;
        PointF pointF8 = this.f41534B;
        pointF8.y = f16;
        m39487a(canvas, this.f41533A, pointF8, pointF7, this.f41536D, this.f41558u);
        this.f41558u.setColor(-1);
        float height = this.f41561x.height();
        float width3 = (this.f41561x.width() / f12) - width2;
        RectF rectF3 = this.f41560w;
        RectF rectF4 = this.f41561x;
        float f17 = rectF4.left;
        float f18 = this.f41537E;
        rectF3.set(f17 + (width3 * f18), rectF4.top + (height * f18), rectF4.right - (width3 * f18), rectF4.bottom);
        PointF pointF9 = this.f41533A;
        RectF rectF5 = this.f41560w;
        pointF9.x = rectF5.left;
        PointF pointF10 = this.f41536D;
        pointF10.x = rectF5.right;
        float f19 = rectF5.top;
        pointF10.y = f19;
        pointF9.y = f19;
        m39487a(canvas, pointF9, this.f41534B, this.f41535C, pointF10, this.f41558u);
        int centerX = (int) (this.f41561x.centerX() + (this.f41539G * AbstractC23136l9.m118742r(95.0f)));
        RectF rectF6 = this.f41561x;
        int height2 = (int) ((rectF6.top - this.f41545M) + (rectF6.height() * this.f41537E));
        int i11 = this.f41545M;
        int i12 = height2 + i11;
        float f21 = 1;
        float f22 = (i11 * (f21 - this.f41539G)) / f12;
        float floor = (((float) Math.floor(AbstractC23136l9.m118742r(3.0f) + ((AbstractC23136l9.m118742r(15.0f) - AbstractC23136l9.m118742r(3.0f)) * this.f41538F))) * (f21 - this.f41539G)) / f12;
        RectF rectF7 = this.f41563z;
        float f23 = centerX;
        int i13 = this.f41546N;
        float f24 = i12;
        rectF7.set((f23 - f22) - i13, (f24 - f22) - i13, f23 + f22 + (i13 * 3), f24 + f22 + i13);
        this.f41558u.setColor(1711276032);
        canvas.drawCircle(f23, AbstractC23136l9.m118742r(1.0f) + f24, f22, this.f41558u);
        this.f41558u.setColor(-1);
        canvas.drawCircle(f23, f24, f22, this.f41558u);
        this.f41559v.setColor(-9145228);
        this.f41559v.setStrokeWidth(this.f41547O);
        canvas.drawCircle(f23, f24, floor, this.f41559v);
        float floor2 = ((float) (Math.floor(AbstractC23136l9.m118742r(10.0f) + ((AbstractC23136l9.m118742r(50.0f) - AbstractC23136l9.m118742r(10.0f)) * this.f41538F)) * this.f41539G)) / f12;
        this.f41558u.setColor(1711276032);
        canvas.drawCircle(f23, AbstractC23136l9.m118742r(1.0f) + f24, floor2, this.f41558u);
        this.f41558u.setColor(-1);
        canvas.drawCircle(f23, f24, floor2, this.f41558u);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int m118742r = (i14 - i12) - AbstractC23136l9.m118742r(56.0f);
        float m118742r2 = AbstractC23136l9.m118742r(10.0f) + AbstractC23136l9.m118742r((30 - (15 + (this.f41541I * 2))) / 2.0f);
        float m118742r3 = AbstractC23136l9.m118742r(26.0f);
        this.f41561x.set(m118742r2, m118742r3, this.f41543K + m118742r2, m118742r + m118742r3);
        int m118742r4 = AbstractC23136l9.m118742r(this.f41541I);
        RectF rectF = this.f41562y;
        RectF rectF2 = this.f41561x;
        float f11 = m118742r4;
        rectF.set(rectF2.left - f11, rectF2.top - f11, rectF2.right + f11, rectF2.bottom + f11);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AbstractC23136l9.m118742r(200.0f), 1073741824);
        int m118742r = AbstractC23136l9.m118742r((this.f41541I * 2) + 26 + 30) + this.f41544L;
        int i13 = this.f41550R;
        if (1 <= i13 && i13 < m118742r) {
            m118742r = i13;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(m118742r, 1073741824));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:            if (r8 != 6) goto L42;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "event");
        boolean z12 = true;
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        float x11 = motionEvent.getX();
        float y11 = motionEvent.getY();
        float f11 = y11 - this.f41561x.top;
        RectF rectF = this.f41563z;
        if (x11 >= rectF.left && x11 <= rectF.right && y11 >= rectF.top && y11 <= rectF.bottom) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!this.f41554q && !z11) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                    }
                }
            }
            if (this.f41554q) {
                InterfaceC7736b interfaceC7736b = this.f41553p;
                if (interfaceC7736b != null) {
                    interfaceC7736b.mo39490c(this.f41538F);
                }
                InterfaceC7736b interfaceC7736b2 = this.f41553p;
                if (interfaceC7736b2 != null) {
                    if (this.f41552T > 0) {
                        z12 = false;
                    }
                    interfaceC7736b2.mo39488a(z12);
                }
            }
            this.f41554q = false;
            this.f41556s = this.f41555r;
            this.f41555r = false;
            setDragging(false);
            this.f41552T = 5;
            return false;
        }
        if (!this.f41554q) {
            this.f41554q = true;
            InterfaceC7736b interfaceC7736b3 = this.f41553p;
            if (interfaceC7736b3 != null) {
                interfaceC7736b3.mo39489b();
            }
        }
        if (actionMasked == 0) {
            this.f41552T = 5;
        } else {
            this.f41552T--;
        }
        setLocation(Math.max(0.0f, Math.min(1.0f, f11 / this.f41561x.height())));
        setDragging(true);
        return true;
    }

    public final void setDelegate(InterfaceC7736b interfaceC7736b) {
        this.f41553p = interfaceC7736b;
    }

    public final void setDragging(boolean z11) {
        float f11;
        if (this.f41540H == z11) {
            return;
        }
        this.f41540H = z11;
        if (z11) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "draggingFactor", this.f41539G, f11);
        AbstractC19074t.m100207e(ofFloat, "ofFloat(...)");
        ofFloat.setInterpolator(this.f41557t);
        int i11 = 300;
        if (this.f41556s) {
            i11 = 300 + ((int) (this.f41538F * 75));
        }
        ofFloat.setDuration(i11);
        ofFloat.start();
    }

    public final void setDraggingFactor(float f11) {
        this.f41539G = f11;
        invalidate();
    }

    public final void setLocation(float f11) {
        this.f41537E = f11;
        setWeight(f11);
        invalidate();
    }

    public final void setMaxSize(int i11) {
        this.f41549Q = i11;
    }

    public final void setWeight(float f11) {
        float f12 = 1 - f11;
        this.f41538F = f12;
        InterfaceC7736b interfaceC7736b = this.f41553p;
        if (interfaceC7736b != null) {
            interfaceC7736b.mo39490c(f12);
        }
        invalidate();
    }
}
