package com.zing.zalo.camera.videos.customviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import zl0.AbstractC32232i;

/* loaded from: classes3.dex */
public class VideoSpeedSeekBar extends View {

    /* renamed from: A */
    ValueAnimator f41685A;

    /* renamed from: B */
    float f41686B;

    /* renamed from: C */
    int f41687C;

    /* renamed from: D */
    float f41688D;

    /* renamed from: E */
    boolean f41689E;

    /* renamed from: F */
    String[] f41690F;

    /* renamed from: G */
    float[] f41691G;

    /* renamed from: H */
    InterfaceC7764c f41692H;

    /* renamed from: p */
    Paint f41693p;

    /* renamed from: q */
    Paint f41694q;

    /* renamed from: r */
    Paint f41695r;

    /* renamed from: s */
    Paint f41696s;

    /* renamed from: t */
    TextPaint f41697t;

    /* renamed from: u */
    ArrayList f41698u;

    /* renamed from: v */
    StaticLayout f41699v;

    /* renamed from: w */
    RectF f41700w;

    /* renamed from: x */
    float f41701x;

    /* renamed from: y */
    int f41702y;

    /* renamed from: z */
    ValueAnimator f41703z;

    /* renamed from: com.zing.zalo.camera.videos.customviews.VideoSpeedSeekBar$a */
    /* loaded from: classes3.dex */
    class C7762a extends AnimatorListenerAdapter {
        C7762a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ValueAnimator valueAnimator = VideoSpeedSeekBar.this.f41703z;
            if (valueAnimator != null && valueAnimator.equals(animator)) {
                VideoSpeedSeekBar.this.f41703z = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ValueAnimator valueAnimator = VideoSpeedSeekBar.this.f41703z;
            if (valueAnimator != null && valueAnimator.equals(animator)) {
                VideoSpeedSeekBar.this.f41703z = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.videos.customviews.VideoSpeedSeekBar$b */
    /* loaded from: classes3.dex */
    public class C7763b extends AnimatorListenerAdapter {
        C7763b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            ValueAnimator valueAnimator = VideoSpeedSeekBar.this.f41685A;
            if (valueAnimator != null && valueAnimator.equals(animator)) {
                VideoSpeedSeekBar.this.f41685A = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ValueAnimator valueAnimator = VideoSpeedSeekBar.this.f41685A;
            if (valueAnimator != null && valueAnimator.equals(animator)) {
                VideoSpeedSeekBar.this.f41685A = null;
            }
        }
    }

    /* renamed from: com.zing.zalo.camera.videos.customviews.VideoSpeedSeekBar$c */
    /* loaded from: classes3.dex */
    public interface InterfaceC7764c {
        /* renamed from: a */
        void mo39584a(float f11);
    }

    public VideoSpeedSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41693p = new Paint(1);
        this.f41694q = new Paint(1);
        this.f41695r = new Paint(1);
        this.f41696s = new Paint(1);
        this.f41697t = new TextPaint(1);
        this.f41698u = new ArrayList();
        this.f41700w = new RectF();
        this.f41701x = 0.0f;
        this.f41702y = 0;
        this.f41686B = 0.0f;
        this.f41687C = 2;
        this.f41688D = 0.0f;
        this.f41689E = false;
        this.f41690F = new String[]{"3x", "2x", "1x", "0.5x", "0.3x"};
        this.f41691G = new float[]{3.0f, 2.0f, 1.0f, 0.5f, 0.3f};
        this.f41693p.setColor(-16777216);
        this.f41693p.setAlpha(76);
        this.f41694q.setColor(1289213911);
        this.f41694q.setStyle(Paint.Style.STROKE);
        this.f41694q.setStrokeWidth(AbstractC32232i.m155453a(1.0f));
        this.f41695r.setColor(-1);
        this.f41695r.setAlpha(76);
        this.f41696s.setColor(-1);
        this.f41697t.setColor(-12696501);
        this.f41697t.setTextSize(AbstractC32232i.m155453a(10.0f));
        for (int i11 = 0; i11 < this.f41690F.length; i11++) {
            this.f41698u.add(new StaticLayout(this.f41690F[i11], this.f41697t, (int) Math.ceil(r2.measureText(r1)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
        }
        this.f41699v = (StaticLayout) this.f41698u.get(this.f41687C);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m39581c(ValueAnimator valueAnimator) {
        this.f41688D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m39582d(ValueAnimator valueAnimator) {
        this.f41686B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        invalidate();
    }

    /* renamed from: e */
    void m39583e(float f11) {
        ValueAnimator valueAnimator = this.f41685A;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41685A = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41686B, f11);
        this.f41685A = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.videos.customviews.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                VideoSpeedSeekBar.this.m39582d(valueAnimator2);
            }
        });
        this.f41685A.addListener(new C7763b());
        this.f41685A.setDuration(200L);
        this.f41685A.start();
    }

    public float getSpeed() {
        int i11;
        float[] fArr = this.f41691G;
        if (fArr != null && (i11 = this.f41687C) >= 0 && i11 < fArr.length) {
            return fArr[i11];
        }
        return -1.0f;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawRoundRect(this.f41700w, getMeasuredWidth() / 2.0f, getMeasuredWidth() / 2.0f, this.f41694q);
        canvas.drawRoundRect(this.f41700w, getMeasuredWidth() / 2.0f, getMeasuredWidth() / 2.0f, this.f41693p);
        for (int i11 = 0; i11 < 5; i11++) {
            canvas.save();
            canvas.translate(getMeasuredWidth() / 2.0f, AbstractC32232i.m155453a(16.0f) + (i11 * this.f41701x));
            canvas.drawCircle(0.0f, 0.0f, AbstractC32232i.m155453a(3.0f), this.f41695r);
            canvas.restore();
        }
        canvas.save();
        canvas.translate(getMeasuredWidth() / 2.0f, AbstractC32232i.m155453a(16.0f) + this.f41688D);
        canvas.drawCircle(0.0f, 0.0f, AbstractC32232i.m155453a(12.0f) + (this.f41686B * AbstractC32232i.m155453a(6.0f)), this.f41696s);
        canvas.restore();
        StaticLayout staticLayout = this.f41699v;
        canvas.translate((getMeasuredWidth() - staticLayout.getWidth()) / 2.0f, (AbstractC32232i.m155453a(16.0f) + this.f41688D) - (staticLayout.getHeight() / 2.0f));
        staticLayout.draw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        this.f41700w.set(AbstractC32232i.m155453a(4.0f), AbstractC32232i.m155453a(2.0f), getMeasuredWidth() - AbstractC32232i.m155453a(4.0f), getMeasuredHeight() - AbstractC32232i.m155453a(2.0f));
        float measuredHeight = (getMeasuredHeight() - AbstractC32232i.m155453a(32.0f)) / 4.0f;
        this.f41701x = measuredHeight;
        this.f41688D = this.f41687C * measuredHeight;
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int m155453a = AbstractC32232i.m155453a(220.0f);
        int i13 = this.f41702y;
        if (i13 > 0) {
            m155453a = Math.min(m155453a, i13);
        }
        setMeasuredDimension(AbstractC32232i.m155453a(36.0f), m155453a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00df  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC7764c interfaceC7764c;
        int action = motionEvent.getAction();
        if (action == 0) {
            m39583e(1.0f);
        } else {
            boolean z11 = false;
            if (action != 3 && action != 1 && action != 6) {
                if (action == 2) {
                    this.f41689E = true;
                    ValueAnimator valueAnimator = this.f41685A;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f41685A = null;
                        this.f41686B = 1.0f;
                    }
                    int y11 = (int) motionEvent.getY();
                    float f11 = y11;
                    float f12 = this.f41701x;
                    if (f11 <= f12 / 2.0f) {
                        if (this.f41687C != 0) {
                            this.f41687C = 0;
                            z11 = true;
                        }
                        if (!((StaticLayout) this.f41698u.get(this.f41687C)).equals(this.f41699v)) {
                            this.f41699v = (StaticLayout) this.f41698u.get(this.f41687C);
                        }
                        interfaceC7764c = this.f41692H;
                        if (interfaceC7764c != null && z11) {
                            interfaceC7764c.mo39584a(this.f41691G[this.f41687C]);
                        }
                        this.f41688D = f11;
                        if (f11 < AbstractC32232i.m155453a(2.0f)) {
                            this.f41688D = AbstractC32232i.m155453a(2.0f);
                        } else if (this.f41688D > getMeasuredHeight() - AbstractC32232i.m155453a(34.0f)) {
                            this.f41688D = getMeasuredHeight() - AbstractC32232i.m155453a(34.0f);
                        }
                        invalidate();
                    } else if (f11 > f12 / 2.0f && f11 <= (f12 / 2.0f) + f12) {
                        if (this.f41687C != 1) {
                            this.f41687C = 1;
                            z11 = true;
                        }
                        if (!((StaticLayout) this.f41698u.get(this.f41687C)).equals(this.f41699v)) {
                        }
                        interfaceC7764c = this.f41692H;
                        if (interfaceC7764c != null) {
                        }
                        this.f41688D = f11;
                        if (f11 < AbstractC32232i.m155453a(2.0f)) {
                        }
                        invalidate();
                    } else if (f11 > (f12 / 2.0f) + f12 && f11 <= (f12 / 2.0f) + (f12 * 2.0f)) {
                        if (this.f41687C != 2) {
                            this.f41687C = 2;
                            z11 = true;
                        }
                        if (!((StaticLayout) this.f41698u.get(this.f41687C)).equals(this.f41699v)) {
                        }
                        interfaceC7764c = this.f41692H;
                        if (interfaceC7764c != null) {
                        }
                        this.f41688D = f11;
                        if (f11 < AbstractC32232i.m155453a(2.0f)) {
                        }
                        invalidate();
                    } else if (f11 > (f12 / 2.0f) + (f12 * 2.0f) && f11 <= (f12 / 2.0f) + (f12 * 3.0f)) {
                        if (this.f41687C != 3) {
                            this.f41687C = 3;
                            z11 = true;
                        }
                        if (!((StaticLayout) this.f41698u.get(this.f41687C)).equals(this.f41699v)) {
                        }
                        interfaceC7764c = this.f41692H;
                        if (interfaceC7764c != null) {
                        }
                        this.f41688D = f11;
                        if (f11 < AbstractC32232i.m155453a(2.0f)) {
                        }
                        invalidate();
                    } else {
                        if (f11 > (f12 / 2.0f) + (f12 * 3.0f) && y11 <= getMeasuredHeight() && this.f41687C != 4) {
                            this.f41687C = 4;
                            z11 = true;
                        }
                        if (!((StaticLayout) this.f41698u.get(this.f41687C)).equals(this.f41699v)) {
                        }
                        interfaceC7764c = this.f41692H;
                        if (interfaceC7764c != null) {
                            interfaceC7764c.mo39584a(this.f41691G[this.f41687C]);
                        }
                        this.f41688D = f11;
                        if (f11 < AbstractC32232i.m155453a(2.0f)) {
                        }
                        invalidate();
                    }
                }
            } else {
                boolean z12 = this.f41689E;
                motionEvent.getX();
                if (!this.f41689E) {
                    motionEvent.getY();
                }
                if (z12) {
                    ValueAnimator valueAnimator2 = this.f41703z;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                        this.f41703z = null;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41688D, this.f41687C * this.f41701x);
                    this.f41703z = ofFloat;
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.camera.videos.customviews.b
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                            VideoSpeedSeekBar.this.m39581c(valueAnimator3);
                        }
                    });
                    this.f41703z.setDuration(100L);
                    this.f41703z.setInterpolator(new DecelerateInterpolator());
                    this.f41703z.addListener(new C7762a());
                    this.f41703z.start();
                } else {
                    this.f41686B = 1.0f;
                    this.f41688D = this.f41687C * this.f41701x;
                    invalidate();
                }
                m39583e(0.0f);
                this.f41689E = false;
            }
        }
        return true;
    }

    public void setAvailableHeight(int i11) {
        this.f41702y = i11;
        requestLayout();
    }

    public void setOnSpeedChangeListener(InterfaceC7764c interfaceC7764c) {
        this.f41692H = interfaceC7764c;
    }

    public void setSpeed(float f11) {
        int i11 = 0;
        while (true) {
            float[] fArr = this.f41691G;
            if (i11 < fArr.length) {
                if (fArr[i11] == f11) {
                    this.f41687C = i11;
                    this.f41699v = (StaticLayout) this.f41698u.get(i11);
                    requestLayout();
                    return;
                }
                i11++;
            } else {
                return;
            }
        }
    }
}
