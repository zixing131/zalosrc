package com.zing.zalo.uicomponents.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import p500s1.C26087b;

/* loaded from: classes6.dex */
public class VideoRecordButton extends RecordButton {

    /* renamed from: A */
    private final int f83018A;

    /* renamed from: B */
    private final int f83019B;

    /* renamed from: C */
    private final int f83020C;

    /* renamed from: D */
    private final float f83021D;

    /* renamed from: E */
    private final float f83022E;

    /* renamed from: F */
    private final int f83023F;

    /* renamed from: G */
    private final float f83024G;

    /* renamed from: H */
    private final float f83025H;

    /* renamed from: I */
    private final float f83026I;

    /* renamed from: J */
    private final int f83027J;

    /* renamed from: K */
    private final float f83028K;

    /* renamed from: L */
    private final int f83029L;

    /* renamed from: M */
    private final float f83030M;

    /* renamed from: N */
    private final int f83031N;

    /* renamed from: O */
    private final int f83032O;

    /* renamed from: P */
    private float f83033P;

    /* renamed from: Q */
    private float f83034Q;

    /* renamed from: R */
    private int f83035R;

    /* renamed from: S */
    private int f83036S;

    /* renamed from: T */
    private Paint f83037T;

    /* renamed from: U */
    private Paint f83038U;

    /* renamed from: V */
    private Paint f83039V;

    /* renamed from: W */
    private float f83040W;

    /* renamed from: a0 */
    private float f83041a0;

    /* renamed from: b0 */
    private int f83042b0;

    /* renamed from: c0 */
    private Paint f83043c0;

    /* renamed from: d0 */
    private boolean f83044d0;

    /* renamed from: e0 */
    private Shader f83045e0;

    /* renamed from: f0 */
    private Shader f83046f0;

    /* renamed from: g0 */
    private float f83047g0;

    /* renamed from: h0 */
    private Paint f83048h0;

    /* renamed from: i0 */
    private float f83049i0;

    /* renamed from: j0 */
    private final RectF f83050j0;

    /* renamed from: k0 */
    private final RectF f83051k0;

    /* renamed from: l0 */
    float f83052l0;

    /* renamed from: m0 */
    float[] f83053m0;

    /* renamed from: n0 */
    float[] f83054n0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicomponents.view.VideoRecordButton$a */
    /* loaded from: classes6.dex */
    public class C16440a extends AnimatorListenerAdapter {
        C16440a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            int mo149042f = VideoRecordButton.this.f83007p.mo149042f(14.5f) + VideoRecordButton.this.f83032O;
            VideoRecordButton.this.setPadding(mo149042f, mo149042f, mo149042f, mo149042f);
            VideoRecordButton videoRecordButton = VideoRecordButton.this;
            videoRecordButton.f83013v = false;
            videoRecordButton.invalidate();
        }
    }

    /* renamed from: com.zing.zalo.uicomponents.view.VideoRecordButton$b */
    /* loaded from: classes6.dex */
    class C16441b extends AnimatorListenerAdapter {
        C16441b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            VideoRecordButton videoRecordButton = VideoRecordButton.this;
            videoRecordButton.f83013v = false;
            videoRecordButton.invalidate();
        }
    }

    public VideoRecordButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ void m87643p(ValueAnimator valueAnimator) {
        this.f83040W = m87635d(this.f83053m0, this.f83054n0, 1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f83041a0 = m87635d(this.f83053m0, this.f83054n0, 2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f83033P = m87635d(this.f83053m0, this.f83054n0, 3, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f83034Q = m87635d(this.f83053m0, this.f83054n0, 4, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        m87647s();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void m87644q(ValueAnimator valueAnimator) {
        this.f83040W = m87635d(this.f83053m0, this.f83054n0, 1, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f83041a0 = m87635d(this.f83053m0, this.f83054n0, 2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f83033P = m87635d(this.f83053m0, this.f83054n0, 3, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        this.f83034Q = m87635d(this.f83053m0, this.f83054n0, 4, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        m87647s();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m87645r(ValueAnimator valueAnimator) {
        if (!this.f83014w) {
            this.f83049i0 = m87635d(this.f83053m0, this.f83054n0, 0, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            invalidate();
        }
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: a */
    public void mo87626a(Animator.AnimatorListener animatorListener) {
        Animator animator = this.f83011t;
        if (animator != null) {
            animator.cancel();
        }
        this.f83049i0 = 2.0f;
        this.f83053m0[1] = this.f83040W;
        this.f83054n0[1] = this.f83007p.mo149042f(24.0f);
        this.f83053m0[2] = this.f83041a0;
        this.f83054n0[2] = this.f83007p.mo149042f(24.0f);
        this.f83053m0[3] = this.f83033P;
        this.f83054n0[3] = this.f83007p.mo149042f(32.0f);
        this.f83053m0[4] = this.f83034Q;
        this.f83054n0[4] = this.f83007p.mo149042f(3.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicomponents.view.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoRecordButton.this.m87643p(valueAnimator);
            }
        });
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new C26087b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat);
        animatorSet.addListener(new C16440a());
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
        this.f83011t = animatorSet;
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: b */
    public void mo87627b(boolean z11) {
        Animator animator = this.f83011t;
        if (animator != null) {
            animator.cancel();
        }
        this.f83053m0[1] = this.f83040W;
        this.f83054n0[1] = this.f83007p.mo149042f(22.5f);
        this.f83053m0[2] = this.f83041a0;
        this.f83054n0[2] = this.f83007p.mo149042f(8.0f);
        this.f83053m0[3] = this.f83033P;
        this.f83054n0[3] = this.f83007p.mo149042f(46.5f);
        this.f83053m0[4] = this.f83034Q;
        this.f83054n0[4] = this.f83007p.mo149042f(5.0f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicomponents.view.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoRecordButton.this.m87644q(valueAnimator);
            }
        });
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new C26087b());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat);
        animatorSet.setInterpolator(this.f83016y);
        animatorSet.start();
        this.f83011t = animatorSet;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i11;
        Shader shader;
        Shader shader2;
        super.draw(canvas);
        if (getVisibility() == 0) {
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            canvas.drawCircle(width, height, this.f83033P + this.f83047g0, this.f83048h0);
            if (this.f83044d0 && (shader2 = this.f83045e0) != null) {
                this.f83043c0.setShader(shader2);
            } else {
                this.f83043c0.setShader(null);
            }
            RectF rectF = this.f83051k0;
            float f11 = this.f83040W;
            rectF.set(width - f11, height - f11, width + f11, f11 + height);
            RectF rectF2 = this.f83051k0;
            float f12 = this.f83041a0;
            canvas.drawRoundRect(rectF2, f12, f12, this.f83043c0);
            float f13 = this.f83034Q / 2.0f;
            this.f83052l0 = f13;
            canvas.drawCircle(width, height, this.f83033P - f13, this.f83037T);
            float f14 = this.f83034Q / 2.0f;
            this.f83052l0 = f14;
            RectF rectF3 = this.f83050j0;
            float f15 = this.f83033P;
            rectF3.set((width - f15) + f14, (height - f15) + f14, (width + f15) - f14, (height + f15) - f14);
            if (this.f83013v) {
                this.f83036S = this.f83020C;
            } else {
                this.f83036S = this.f83019B;
            }
            this.f83038U.setColor(this.f83036S);
            if (this.f83044d0 && (shader = this.f83046f0) != null) {
                this.f83038U.setShader(shader);
            } else {
                this.f83038U.setShader(null);
            }
            canvas.drawArc(this.f83050j0, -90.0f, this.f83049i0, false, this.f83038U);
            if (this.f83013v && (i11 = this.f83009r) > 0) {
                canvas.drawArc(this.f83050j0, ((i11 * 360.0f) / this.f83008q) - 90.0f, 2.0f, false, this.f83039V);
            }
        }
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    protected RectF getTouchableRect() {
        float f11 = this.f83033P;
        float f12 = -f11;
        RectF rectF = new RectF(f12, f12, f11, f11);
        rectF.offset(getWidth() / 2.0f, getHeight() / 2.0f);
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
        int i11 = this.f83032O;
        setPadding(i11, i11, i11, i11);
        this.f83014w = false;
        this.f83049i0 = 2.0f;
        this.f83013v = true;
        this.f83053m0[0] = 2.0f;
        this.f83054n0[0] = 360.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.uicomponents.view.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                VideoRecordButton.this.m87645r(valueAnimator);
            }
        });
        ofFloat.setDuration(this.f83008q);
        ofFloat.setInterpolator(new LinearInterpolator());
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f83012u = animatorSet2;
        animatorSet2.play(ofFloat);
        this.f83012u.addListener(new C16441b());
        if (animatorListener != null) {
            this.f83012u.addListener(animatorListener);
        }
        this.f83012u.start();
    }

    @Override // com.zing.zalo.uicomponents.view.RecordButton
    /* renamed from: i */
    public void mo87629i(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = this.f83012u;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f83012u = null;
        }
        mo87626a(animatorListener);
        this.f83014w = true;
        this.f83013v = false;
    }

    /* renamed from: n */
    void m87646n() {
        this.f83033P = this.f83007p.mo149042f(32.0f);
        this.f83034Q = this.f83007p.mo149042f(3.0f);
        this.f83035R = -1;
        this.f83040W = this.f83007p.mo149042f(24.0f);
        this.f83041a0 = this.f83007p.mo149042f(24.0f);
        this.f83042b0 = this.f83027J;
        this.f83036S = this.f83019B;
        this.f83047g0 = this.f83007p.mo149042f(2.0f);
        this.f83049i0 = 2.0f;
        m87647s();
        int mo149042f = this.f83007p.mo149042f(14.5f) + this.f83032O;
        setPadding(mo149042f, mo149042f, mo149042f, mo149042f);
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int mo149042f = (this.f83007p.mo149042f(48.5f) * 2) + (this.f83032O * 2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(mo149042f, 1073741824), View.MeasureSpec.makeMeasureSpec(mo149042f, 1073741824));
    }

    /* renamed from: s */
    void m87647s() {
        if (this.f83037T == null) {
            Paint paint = new Paint(1);
            this.f83037T = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f83037T.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f83037T.setColor(this.f83035R);
        this.f83037T.setStrokeWidth(this.f83034Q);
        if (this.f83043c0 == null) {
            Paint paint2 = new Paint(1);
            this.f83043c0 = paint2;
            paint2.setStyle(Paint.Style.FILL);
        }
        this.f83043c0.setColor(this.f83042b0);
        if (this.f83038U == null) {
            Paint paint3 = new Paint(1);
            this.f83038U = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.f83038U.setStrokeCap(Paint.Cap.ROUND);
        }
        this.f83038U.setColor(this.f83036S);
        this.f83038U.setStrokeWidth(this.f83034Q);
        if (this.f83039V == null) {
            Paint paint4 = new Paint(1);
            this.f83039V = paint4;
            paint4.setStyle(Paint.Style.STROKE);
        }
        this.f83039V.setColor(this.f83018A);
        this.f83039V.setStrokeWidth(this.f83034Q);
        if (this.f83048h0 == null) {
            Paint paint5 = new Paint(1);
            this.f83048h0 = paint5;
            paint5.setStyle(Paint.Style.FILL);
        }
        this.f83048h0.setColor(this.f83029L);
    }

    public void setDrawGradientCircle(boolean z11) {
        this.f83044d0 = z11;
        if (z11) {
            int[] iArr = {Color.parseColor("#FF0000"), Color.parseColor("#FF2C00"), Color.parseColor("#FF3900"), Color.parseColor("#FF5400")};
            float mo149042f = this.f83007p.mo149042f(48.5f) + this.f83032O;
            LinearGradient linearGradient = new LinearGradient(((float) (Math.cos(0.7853981633974483d) * 24.0d)) + mo149042f, ((float) (Math.sin(0.7853981633974483d) * 24.0d)) + mo149042f, ((float) (Math.cos(3.9269908169872414d) * 24.0d)) + mo149042f, mo149042f + ((float) (Math.sin(3.9269908169872414d) * 24.0d)), iArr, (float[]) null, Shader.TileMode.CLAMP);
            this.f83046f0 = linearGradient;
            this.f83045e0 = linearGradient;
        }
    }

    public VideoRecordButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        int parseColor = Color.parseColor("#FF0000");
        this.f83018A = parseColor;
        this.f83019B = parseColor;
        this.f83020C = parseColor;
        this.f83021D = 3.0f;
        this.f83022E = 32.0f;
        this.f83023F = -1;
        this.f83024G = 46.5f;
        this.f83025H = 24.0f;
        this.f83026I = 24.0f;
        this.f83027J = parseColor;
        this.f83028K = 2.0f;
        this.f83029L = Color.argb(38, 0, 0, 0);
        this.f83030M = 2.0f;
        this.f83031N = 250;
        this.f83032O = this.f83007p.mo149041e(5);
        this.f83033P = 0.0f;
        this.f83034Q = 0.0f;
        this.f83035R = -1;
        this.f83036S = parseColor;
        this.f83040W = 0.0f;
        this.f83041a0 = 0.0f;
        this.f83042b0 = parseColor;
        this.f83044d0 = false;
        this.f83045e0 = null;
        this.f83046f0 = null;
        this.f83047g0 = 0.0f;
        this.f83049i0 = 0.0f;
        this.f83050j0 = new RectF();
        this.f83051k0 = new RectF();
        this.f83052l0 = 0.0f;
        this.f83053m0 = new float[5];
        this.f83054n0 = new float[5];
        m87646n();
    }
}
