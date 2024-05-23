package com.zing.zalo.p077ui.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import androidx.appcompat.widget.AppCompatImageView;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* loaded from: classes6.dex */
public final class ScanQrButton extends AppCompatImageView {

    /* renamed from: p */
    private final float f69575p;

    /* renamed from: q */
    private final float f69576q;

    /* renamed from: r */
    private float f69577r;

    /* renamed from: s */
    private final Paint f69578s;

    /* renamed from: t */
    private final Paint f69579t;

    /* renamed from: u */
    private final ValueAnimator f69580u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanQrButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69575p = AbstractC23136l9.m118742r(82.0f) / 2.0f;
        this.f69576q = AbstractC23136l9.m118742r(62.0f) / 2.0f;
        this.f69577r = 1.0f;
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#1194FF"));
        this.f69578s = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor("#B3FFFFFF"));
        this.f69579t = paint2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.75f);
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(9);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.t1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ScanQrButton.m75865g(ScanQrButton.this, valueAnimator);
            }
        });
        this.f69580u = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m75865g(ScanQrButton scanQrButton, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(scanQrButton, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        scanQrButton.f69577r = ((Float) animatedValue).floatValue();
        scanQrButton.invalidate();
    }

    /* renamed from: h */
    public final void m75866h() {
        if (getVisibility() == 0) {
            if (this.f69580u.isRunning()) {
                this.f69580u.cancel();
            }
            this.f69577r = 1.0f;
            this.f69580u.setStartDelay(500L);
            this.f69580u.start();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f69577r * this.f69575p, this.f69579t);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.f69576q, this.f69578s);
        super.onDraw(canvas);
    }
}
