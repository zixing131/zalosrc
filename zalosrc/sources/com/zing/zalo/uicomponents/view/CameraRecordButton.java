package com.zing.zalo.uicomponents.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import pc0.AbstractC24723a;
import pc0.AbstractC24724b;

/* loaded from: classes6.dex */
public class CameraRecordButton extends RecordButton {

    /* renamed from: A */
    private final float f82955A;

    /* renamed from: B */
    private final float f82956B;

    /* renamed from: C */
    private final int f82957C;

    /* renamed from: D */
    private final float f82958D;

    /* renamed from: E */
    private final int f82959E;

    /* renamed from: F */
    private final float f82960F;

    /* renamed from: G */
    private final int f82961G;

    /* renamed from: H */
    private final int f82962H;

    /* renamed from: I */
    private final int f82963I;

    /* renamed from: J */
    private final int f82964J;

    /* renamed from: K */
    private final int f82965K;

    /* renamed from: L */
    private final float f82966L;

    /* renamed from: M */
    private final int f82967M;

    /* renamed from: N */
    private final int f82968N;

    /* renamed from: O */
    private float f82969O;

    /* renamed from: P */
    private float f82970P;

    /* renamed from: Q */
    private float f82971Q;

    /* renamed from: R */
    private boolean f82972R;

    /* renamed from: S */
    private Drawable f82973S;

    /* renamed from: T */
    private float f82974T;

    /* renamed from: U */
    private Drawable f82975U;

    /* renamed from: V */
    private int f82976V;

    /* renamed from: W */
    private Shader f82977W;

    /* renamed from: a0 */
    private int f82978a0;

    /* renamed from: b0 */
    private int f82979b0;

    /* renamed from: c0 */
    private int f82980c0;

    /* renamed from: d0 */
    private int f82981d0;

    /* renamed from: e0 */
    private Paint f82982e0;

    /* renamed from: f0 */
    private Paint f82983f0;

    /* renamed from: g0 */
    private Paint f82984g0;

    /* renamed from: h0 */
    private Paint f82985h0;

    /* renamed from: i0 */
    private Paint f82986i0;

    /* renamed from: j0 */
    private float f82987j0;

    /* renamed from: k0 */
    private float f82988k0;

    /* renamed from: l0 */
    private float f82989l0;

    /* renamed from: m0 */
    private Paint f82990m0;

    /* renamed from: n0 */
    private float f82991n0;

    /* renamed from: o0 */
    private final RectF f82992o0;

    /* renamed from: p0 */
    float[] f82993p0;

    /* renamed from: q0 */
    float[] f82994q0;

    /* renamed from: r0 */
    int[] f82995r0;

    /* renamed from: s0 */
    int[] f82996s0;

    /* renamed from: t0 */
    Animator f82997t0;

    /* renamed from: u0 */
    Animator f82998u0;

    /* renamed from: v0 */
    boolean f82999v0;

    /* renamed from: w0 */
    private Paint f83000w0;

    /* renamed from: x0 */
    private Drawable f83001x0;

    /* renamed from: y0 */
    private float f83002y0;

    /* renamed from: com.zing.zalo.uicomponents.view.CameraRecordButton$a */
    /* loaded from: classes6.dex */
    class C16437a extends AnimatorListenerAdapter {
        C16437a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CameraRecordButton cameraRecordButton = CameraRecordButton.this;
            cameraRecordButton.f83013v = false;
            cameraRecordButton.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicomponents.view.CameraRecordButton$b */
    /* loaded from: classes6.dex */
    public class C16438b extends AnimatorListenerAdapter {
        C16438b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            try {
                int mo149042f = CameraRecordButton.this.f83007p.mo149042f(14.5f) + CameraRecordButton.this.f82968N;
                CameraRecordButton.this.setPadding(mo149042f, mo149042f, mo149042f, mo149042f);
                CameraRecordButton.this.f82991n0 = 0.0f;
                CameraRecordButton.this.invalidate();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicomponents.view.CameraRecordButton$c */
    /* loaded from: classes6.dex */
    public class C16439c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f83005p;

        C16439c(boolean z11) {
            this.f83005p = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            CameraRecordButton.this.f82997t0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            CameraRecordButton cameraRecordButton = CameraRecordButton.this;
            if (cameraRecordButton.f82997t0 == animator && !this.f83005p) {
                cameraRecordButton.f82972R = false;
                CameraRecordButton.this.f82974T = 0.0f;
                CameraRecordButton.this.f82976V = 0;
                CameraRecordButton.this.invalidate();
            }
        }
    }

    public CameraRecordButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82955A = 3.0f;
        this.f82956B = 32.0f;
        this.f82957C = -1;
        this.f82958D = 24.0f;
        this.f82959E = -1;
        this.f82960F = 46.5f;
        int parseColor = Color.parseColor("#FF00A7FF");
        this.f82961G = parseColor;
        this.f82962H = Color.parseColor("#B4FFFFFF");
        this.f82963I = Color.parseColor("#CC00A7FF");
        int parseColor2 = Color.parseColor("#80FFFFFF");
        this.f82964J = parseColor2;
        this.f82965K = parseColor2 & 16777215;
        this.f82966L = 2.0f;
        this.f82967M = Color.argb(38, 0, 0, 0);
        this.f82968N = this.f83007p.mo149041e(5);
        this.f82969O = 0.0f;
        this.f82970P = 0.0f;
        this.f82971Q = 0.0f;
        this.f82972R = false;
        this.f82974T = 0.0f;
        this.f82976V = 0;
        this.f82977W = null;
        this.f82978a0 = parseColor & 16777215;
        this.f82979b0 = -1;
        this.f82980c0 = -1;
        this.f82981d0 = parseColor2 & 16777215;
        this.f82987j0 = 0.0f;
        this.f82988k0 = 1.0f;
        this.f82989l0 = 0.0f;
        this.f82991n0 = 0.0f;
        this.f82992o0 = new RectF();
        this.f82993p0 = new float[7];
        this.f82994q0 = new float[7];
        this.f82995r0 = new int[4];
        this.f82996s0 = new int[4];
        this.f82997t0 = null;
        this.f82998u0 = null;
        this.f82999v0 = false;
        this.f83001x0 = null;
        this.f83002y0 = 0.0f;
        m87630s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void m87623u(ValueAnimator valueAnimator) {
        try {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f82969O = m87635d(this.f82993p0, this.f82994q0, 0, floatValue);
            this.f82970P = m87635d(this.f82993p0, this.f82994q0, 1, floatValue);
            this.f82971Q = m87635d(this.f82993p0, this.f82994q0, 2, floatValue);
            this.f82974T = m87635d(this.f82993p0, this.f82994q0, 3, floatValue);
            this.f82988k0 = m87635d(this.f82993p0, this.f82994q0, 5, floatValue);
            this.f82987j0 = m87635d(this.f82993p0, this.f82994q0, 6, floatValue);
            this.f82980c0 = m87634c(this.f82995r0, this.f82996s0, 2, floatValue);
            this.f82978a0 = m87634c(this.f82995r0, this.f82996s0, 0, floatValue);
            this.f82979b0 = m87634c(this.f82995r0, this.f82996s0, 1, floatValue);
            this.f82981d0 = m87634c(this.f82995r0, this.f82996s0, 3, floatValue);
            m87633z();
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m87624v(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f82974T = m87635d(this.f82993p0, this.f82994q0, 3, floatValue);
        int m87635d = (int) m87635d(this.f82993p0, this.f82994q0, 4, floatValue);
        this.f82976V = m87635d;
        if (m87635d < 0) {
            this.f82976V = 0;
        } else if (m87635d > 255) {
            this.f82976V = 255;
        }
        m87633z();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public /* synthetic */ void m87625w(ValueAnimator valueAnimator) {
        if (!this.f83014w) {
            this.f82991n0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: a */
    public void mo87626a(Animator.AnimatorListener animatorListener) {
        if (this.f83010s) {
            m87632y(false, animatorListener);
        } else {
            m87631x(false, animatorListener);
        }
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: b */
    public void mo87627b(boolean z11) {
        try {
            if (z11) {
                m87632y(true, null);
            } else {
                m87631x(true, null);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Shader shader;
        int i11;
        Drawable drawable;
        Drawable drawable2;
        super.draw(canvas);
        if (getVisibility() == 0) {
            canvas.save();
            canvas.translate(0.0f, this.f82987j0);
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            float f11 = this.f82969O;
            float f12 = this.f82988k0;
            float f13 = f11 * f12;
            float f14 = this.f82970P * f12;
            float f15 = this.f82971Q * f12;
            float f16 = this.f82974T * f12;
            this.f82990m0.setColor(this.f82967M);
            canvas.drawCircle(width, height, this.f82989l0 + f13, this.f82990m0);
            float f17 = f14 / 2.0f;
            this.f82983f0.setStrokeWidth(f14);
            canvas.drawCircle(width, height, f13 - f17, this.f82983f0);
            canvas.drawCircle(width, height, f15, this.f82984g0);
            if (this.f82972R && (drawable2 = this.f82975U) != null) {
                drawable2.setBounds((int) (width - f15), (int) (height - f15), (int) (width + f15), (int) (f15 + height));
                this.f82975U.setAlpha(this.f82976V);
                this.f82975U.draw(canvas);
            } else {
                canvas.drawCircle(width, height, f15, this.f82984g0);
            }
            if (this.f82972R && (drawable = this.f82973S) != null && f16 > 0.0f) {
                float intrinsicWidth = (drawable.getIntrinsicWidth() * f16) / 2.0f;
                float intrinsicHeight = (this.f82973S.getIntrinsicHeight() * f16) / 2.0f;
                this.f82973S.setBounds((int) (width - intrinsicWidth), (int) (height - intrinsicHeight), (int) (intrinsicWidth + width), (int) (intrinsicHeight + height));
                int i12 = (int) (f16 * 255.0f);
                if (i12 < 0) {
                    i12 = 0;
                }
                if (i12 > 255) {
                    i12 = 255;
                }
                this.f82973S.setAlpha(i12);
                this.f82973S.draw(canvas);
            }
            this.f82992o0.set((width - f13) + f17, (height - f13) + f17, (width + f13) - f17, (height + f13) - f17);
            if (this.f83013v && (i11 = this.f83009r) > 0) {
                canvas.drawArc(this.f82992o0, ((i11 * 360.0f) / this.f83008q) - 90.0f, 2.0f, false, this.f82986i0);
            }
            this.f82982e0.setStrokeWidth(f14);
            if (this.f82972R && (shader = this.f82977W) != null) {
                this.f82982e0.setShader(shader);
            } else {
                this.f82982e0.setShader(null);
            }
            canvas.drawArc(this.f82992o0, -90.0f, this.f82991n0, false, this.f82982e0);
            canvas.restore();
        }
    }

    public Drawable getPromoteIcon() {
        return this.f83001x0;
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    protected RectF getTouchableRect() {
        float f11 = this.f82969O * this.f82988k0;
        float f12 = -f11;
        RectF rectF = new RectF(f12, f12, f11, f11);
        rectF.offset(getWidth() / 2.0f, (getHeight() / 2.0f) + this.f82987j0);
        return rectF;
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: h */
    public void mo87628h(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = this.f83012u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f83012u = null;
        }
        int i11 = this.f82968N;
        setPadding(i11, i11, i11, i11);
        this.f82991n0 = 0.0f;
        this.f83013v = true;
        this.f83014w = false;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicomponents.view.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CameraRecordButton.this.m87625w(valueAnimator);
            }
        });
        ofFloat.setDuration(this.f83008q);
        ofFloat.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f83012u = animatorSet2;
        animatorSet2.play(ofFloat);
        this.f83012u.addListener(new C16437a());
        if (animatorListener != null) {
            this.f83012u.addListener(animatorListener);
        }
        this.f83012u.start();
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: i */
    public void mo87629i(Animator.AnimatorListener animatorListener) {
        try {
            AnimatorSet animatorSet = this.f83012u;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f83012u = null;
            }
            mo87626a(animatorListener);
            this.f83014w = true;
            this.f83013v = false;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mo149042f = (this.f83007p.mo149042f(48.5f) * 2) + (this.f82968N * 2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mo149042f, 1073741824), View.MeasureSpec.makeMeasureSpec(mo149042f, 1073741824));
    }

    /* renamed from: s */
    void m87630s() {
        this.f82969O = this.f83007p.mo149042f(32.0f);
        this.f82970P = this.f83007p.mo149042f(3.0f);
        this.f82971Q = this.f83007p.mo149042f(24.0f);
        this.f82989l0 = this.f83007p.mo149042f(2.0f);
        this.f82991n0 = 0.0f;
        m87633z();
        int mo149042f = this.f83007p.mo149042f(14.5f) + this.f82968N;
        setPadding(mo149042f, mo149042f, mo149042f, mo149042f);
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    public void setBoomerangMode(boolean z11) {
        if (z11) {
            this.f82973S = this.f83007p.mo149037a(AbstractC24724b.icon_camera_loop2);
            this.f82975U = this.f83007p.mo149037a(AbstractC24724b.camera_loop_gradient_bg);
            int[] iArr = {Color.parseColor("#FF2C70"), Color.parseColor("#FF5661"), Color.parseColor("#FF5861"), Color.parseColor("#FF306F"), Color.parseColor("#FF2C70")};
            float mo149042f = this.f83007p.mo149042f(48.5f) + this.f82968N;
            this.f82977W = new SweepGradient(mo149042f, mo149042f, iArr, (float[]) null);
        }
        setSpecialMode(z11);
    }

    public void setSpecialMode(boolean z11) {
        int i11;
        Animator animator = this.f82997t0;
        if (animator != null && animator.isRunning()) {
            this.f82997t0.cancel();
        }
        if (z11) {
            this.f82972R = true;
            float[] fArr = this.f82993p0;
            float f11 = this.f82974T;
            fArr[3] = f11;
            float[] fArr2 = this.f82994q0;
            fArr2[3] = 1.0f;
            fArr[4] = this.f82976V;
            fArr2[4] = 255.0f;
            i11 = (int) ((1.0f - f11) * 300);
        } else {
            float[] fArr3 = this.f82993p0;
            float f12 = this.f82974T;
            fArr3[3] = f12;
            float[] fArr4 = this.f82994q0;
            fArr4[3] = 0.0f;
            fArr3[4] = this.f82976V;
            fArr4[4] = 0.0f;
            i11 = (int) (f12 * 300);
        }
        if (i11 < 0) {
            i11 = 0;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicomponents.view.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CameraRecordButton.this.m87624v(valueAnimator);
            }
        });
        ofFloat.addListener(new C16439c(z11));
        ofFloat.setDuration(i11);
        ofFloat.setInterpolator(new OvershootInterpolator());
        ofFloat.start();
        this.f82997t0 = ofFloat;
    }

    /* renamed from: x */
    void m87631x(boolean z11, Animator.AnimatorListener animatorListener) {
        try {
            Animator animator = this.f83011t;
            if (animator != null) {
                animator.cancel();
            }
            AnimatorSet animatorSet = new AnimatorSet();
            if (z11) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 0.9f), ObjectAnimator.ofFloat(this, "scaleY", 0.9f), ObjectAnimator.ofFloat(this, "alpha", 0.7f));
            } else {
                animatorSet.playTogether(ObjectAnimator.ofFloat(this, "scaleX", 1.0f), ObjectAnimator.ofFloat(this, "scaleY", 1.0f), ObjectAnimator.ofFloat(this, "alpha", 1.0f));
            }
            animatorSet.setDuration(150L);
            animatorSet.setInterpolator(this.f83016y);
            if (animatorListener != null) {
                animatorSet.addListener(animatorListener);
            }
            animatorSet.start();
            this.f83011t = animatorSet;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: y */
    void m87632y(boolean z11, Animator.AnimatorListener animatorListener) {
        try {
            Animator animator = this.f83011t;
            if (animator != null) {
                animator.cancel();
            }
            if (z11) {
                this.f82993p0[0] = this.f82969O;
                this.f82994q0[0] = this.f83007p.mo149042f(46.5f);
                this.f82993p0[1] = this.f82970P;
                this.f82994q0[1] = this.f83007p.mo149042f(5.0f);
                this.f82993p0[2] = this.f82971Q;
                this.f82994q0[2] = this.f83007p.mo149042f(22.5f);
                this.f82993p0[3] = this.f82974T;
                this.f82994q0[3] = 0.0f;
                int[] iArr = this.f82995r0;
                iArr[0] = this.f82978a0;
                int[] iArr2 = this.f82996s0;
                iArr2[0] = this.f82961G;
                iArr[1] = this.f82979b0;
                iArr2[1] = this.f82962H;
                iArr[2] = this.f82980c0;
                iArr2[2] = this.f82963I;
                iArr[3] = this.f82981d0;
                iArr2[3] = this.f82964J;
            } else {
                this.f82993p0[0] = this.f82969O;
                this.f82994q0[0] = this.f83007p.mo149042f(32.0f);
                this.f82993p0[1] = this.f82970P;
                this.f82994q0[1] = this.f83007p.mo149042f(3.0f);
                this.f82993p0[2] = this.f82971Q;
                this.f82994q0[2] = this.f83007p.mo149042f(24.0f);
                this.f82993p0[3] = this.f82974T;
                this.f82994q0[3] = 1.0f;
                int[] iArr3 = this.f82995r0;
                iArr3[0] = this.f82978a0;
                int[] iArr4 = this.f82996s0;
                iArr4[0] = this.f82961G & 16777215;
                iArr3[1] = this.f82979b0;
                iArr4[1] = -1;
                iArr3[2] = this.f82980c0;
                iArr4[2] = -1;
                iArr3[3] = this.f82981d0;
                iArr4[3] = this.f82965K;
            }
            this.f82999v0 = false;
            float[] fArr = this.f82993p0;
            fArr[5] = this.f82988k0;
            float[] fArr2 = this.f82994q0;
            fArr2[5] = 1.0f;
            fArr[6] = this.f82987j0;
            fArr2[6] = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicomponents.view.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CameraRecordButton.this.m87623u(valueAnimator);
                }
            });
            AnimatorSet animatorSet = new AnimatorSet();
            if (z11) {
                ofFloat.setDuration(300);
                animatorSet.play(ofFloat);
            } else {
                ofFloat.setDuration(300);
                animatorSet.play(ofFloat);
                animatorSet.addListener(new C16438b());
            }
            if (animatorListener != null) {
                animatorSet.addListener(animatorListener);
            }
            animatorSet.setInterpolator(this.f83016y);
            animatorSet.start();
            this.f83011t = animatorSet;
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: z */
    void m87633z() {
        if (this.f82982e0 == null) {
            Paint paint = new Paint(1);
            this.f82982e0 = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f82982e0.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f82982e0.setColor(this.f82978a0);
        this.f82982e0.setStrokeWidth(this.f82970P);
        if (this.f82986i0 == null) {
            Paint paint2 = new Paint(1);
            this.f82986i0 = paint2;
            paint2.setStyle(Paint.Style.STROKE);
        }
        this.f82986i0.setColor(this.f83007p.mo149040d(AbstractC24723a.cM1));
        this.f82986i0.setStrokeWidth(this.f82970P);
        if (this.f82983f0 == null) {
            Paint paint3 = new Paint(1);
            this.f82983f0 = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.f82983f0.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f82983f0.setColor(this.f82979b0);
        this.f82983f0.setStrokeWidth(this.f82970P);
        if (this.f82984g0 == null) {
            Paint paint4 = new Paint(1);
            this.f82984g0 = paint4;
            paint4.setStyle(Paint.Style.FILL);
        }
        this.f82984g0.setColor(this.f82980c0);
        if (this.f82985h0 == null) {
            Paint paint5 = new Paint(1);
            this.f82985h0 = paint5;
            paint5.setStyle(Paint.Style.FILL);
        }
        this.f82985h0.setColor(this.f82981d0);
        if (this.f82990m0 == null) {
            Paint paint6 = new Paint(1);
            this.f82990m0 = paint6;
            paint6.setStyle(Paint.Style.FILL);
        }
        this.f82990m0.setColor(this.f82967M);
        if (this.f83000w0 == null) {
            Paint paint7 = new Paint(1);
            this.f83000w0 = paint7;
            paint7.setStyle(Paint.Style.STROKE);
            this.f83000w0.setStrokeCap(Paint.Cap.ROUND);
        }
    }
}
