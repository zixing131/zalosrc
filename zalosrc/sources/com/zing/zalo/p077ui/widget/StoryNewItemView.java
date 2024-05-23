package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes6.dex */
public class StoryNewItemView extends SquareLoadingContainerView {

    /* renamed from: A */
    float f69804A;

    /* renamed from: B */
    int f69805B;

    /* renamed from: C */
    Animator f69806C;

    /* renamed from: t */
    int f69807t;

    /* renamed from: u */
    int f69808u;

    /* renamed from: v */
    int f69809v;

    /* renamed from: w */
    int f69810w;

    /* renamed from: x */
    RectF f69811x;

    /* renamed from: y */
    Paint f69812y;

    /* renamed from: z */
    Drawable f69813z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m75953e(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f69804A = floatValue;
        this.f69805B = (int) (floatValue * 255.0f);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public /* synthetic */ void m75954f(ValueAnimator valueAnimator) {
        this.f69810w = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    @Override // com.zing.zalo.p077ui.widget.SquareLoadingContainerView
    /* renamed from: b */
    public void mo75902b() {
        if (this.f69657s) {
            Animator animator = this.f69806C;
            if (animator != null && animator.isRunning()) {
                this.f69806C.end();
            }
            super.mo75902b();
            return;
        }
        super.mo75902b();
    }

    @Override // com.zing.zalo.p077ui.widget.SquareLoadingContainerView
    public Animator getProgressAnim() {
        Animator progressAnim = super.getProgressAnim();
        this.f69810w = 204;
        this.f69805B = 0;
        this.f69804A = 0.0f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.y2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryNewItemView.this.m75953e(valueAnimator);
            }
        };
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(animatorUpdateListener);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setStartDelay(100L);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(animatorUpdateListener);
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(new DecelerateInterpolator());
        ofFloat2.setStartDelay(500L);
        ValueAnimator ofInt = ValueAnimator.ofInt(204, 0);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.z2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryNewItemView.this.m75954f(valueAnimator);
            }
        });
        ofInt.setDuration(250L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(progressAnim, ofFloat, ofFloat2, ofInt);
        this.f69806C = animatorSet;
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.SquareLoadingContainerView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f69657s) {
            float width = canvas.getWidth() / 2.0f;
            float height = canvas.getHeight() / 2.0f;
            this.f69812y.setAlpha(this.f69810w);
            RectF rectF = this.f69811x;
            int i11 = this.f69807t;
            int i12 = this.f69808u;
            rectF.set(width - (i11 / 2.0f), height - (i12 / 2.0f), (i11 / 2.0f) + width, (i12 / 2.0f) + height);
            RectF rectF2 = this.f69811x;
            int i13 = this.f69809v;
            canvas.drawRoundRect(rectF2, i13, i13, this.f69812y);
            if (this.f69813z != null) {
                float intrinsicWidth = (r3.getIntrinsicWidth() * this.f69804A) / 2.0f;
                float intrinsicHeight = (this.f69813z.getIntrinsicHeight() * this.f69804A) / 2.0f;
                this.f69813z.setBounds((int) (width - intrinsicWidth), (int) (height - intrinsicHeight), (int) (width + intrinsicWidth), (int) (height + intrinsicHeight));
                this.f69813z.setAlpha(this.f69805B);
                this.f69813z.draw(canvas);
            }
        }
    }
}
