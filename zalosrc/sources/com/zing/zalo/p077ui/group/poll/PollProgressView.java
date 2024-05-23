package com.zing.zalo.p077ui.group.poll;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.p077ui.group.poll.PollProgressView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;
import me0.C23212s8;

/* loaded from: classes5.dex */
public final class PollProgressView extends View {

    /* renamed from: p */
    private int f62420p;

    /* renamed from: q */
    private float f62421q;

    /* renamed from: r */
    private final Paint f62422r;

    /* renamed from: s */
    private final float f62423s;

    /* renamed from: t */
    private final int f62424t;

    /* renamed from: u */
    private Animator f62425u;

    public PollProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(1);
        this.f62422r = paint;
        this.f62423s = AbstractC23136l9.m118742r(8.0f);
        paint.setStyle(Paint.Style.FILL);
        this.f62424t = C23212s8.m119607o(getContext(), AbstractC16781w.ImagePlaceHolderColor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m66616b(PollProgressView pollProgressView, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(pollProgressView, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        pollProgressView.set_progress(((Float) animatedValue).floatValue());
    }

    private final void set_progress(float f11) {
        if (0.0f <= f11 && f11 <= 1.0f && f11 != this.f62421q) {
            this.f62421q = f11;
            invalidate();
        }
    }

    public final int getProgressColor() {
        return this.f62420p;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        this.f62422r.setColor(this.f62424t);
        float width = getWidth();
        float height = getHeight();
        float f11 = this.f62423s;
        canvas.drawRoundRect(0.0f, 0.0f, width, height, f11, f11, this.f62422r);
        float width2 = this.f62421q * getWidth();
        this.f62422r.setColor(getProgressColor());
        float height2 = getHeight();
        float f12 = this.f62423s;
        canvas.drawRoundRect(0.0f, 0.0f, width2, height2, f12, f12, this.f62422r);
    }

    public final void setProgress(float f11) {
        Animator animator = this.f62425u;
        if (animator != null) {
            animator.end();
        }
        set_progress(f11);
    }

    public final void setProgressColor(int i11) {
        if (i11 != this.f62420p) {
            this.f62420p = i11;
            invalidate();
        }
    }

    public final void setProgressWithAnimation(float f11) {
        Animator animator = this.f62425u;
        if (animator != null) {
            animator.end();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f62421q, f11);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h70.m
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PollProgressView.m66616b(PollProgressView.this, valueAnimator);
            }
        });
        ofFloat.setDuration(200L);
        this.f62425u = ofFloat;
        ofFloat.start();
    }

    public PollProgressView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Paint paint = new Paint(1);
        this.f62422r = paint;
        this.f62423s = AbstractC23136l9.m118742r(8.0f);
        paint.setStyle(Paint.Style.FILL);
        this.f62424t = C23212s8.m119607o(getContext(), AbstractC16781w.ImagePlaceHolderColor);
    }
}
