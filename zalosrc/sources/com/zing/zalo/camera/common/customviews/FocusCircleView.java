package com.zing.zalo.camera.common.customviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.zing.zalo.camera.common.customviews.FocusCircleView;
import me0.AbstractC23136l9;

/* loaded from: classes3.dex */
public class FocusCircleView extends View {

    /* renamed from: p */
    Paint f41070p;

    /* renamed from: q */
    boolean f41071q;

    /* renamed from: r */
    Rect f41072r;

    /* renamed from: s */
    public boolean f41073s;

    /* renamed from: t */
    ValueAnimator f41074t;

    /* renamed from: u */
    boolean f41075u;

    /* renamed from: v */
    int f41076v;

    /* renamed from: w */
    int f41077w;

    /* renamed from: x */
    int f41078x;

    /* renamed from: y */
    boolean f41079y;

    /* renamed from: z */
    boolean f41080z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.camera.common.customviews.FocusCircleView$a */
    /* loaded from: classes3.dex */
    public class C7581a extends AnimatorListenerAdapter {
        C7581a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            FocusCircleView.this.setVisibility(8);
        }
    }

    public FocusCircleView(Context context) {
        super(context);
        this.f41073s = false;
        this.f41075u = false;
        this.f41076v = 0;
        this.f41077w = 25;
        this.f41078x = 35;
        this.f41079y = false;
        this.f41080z = false;
        Paint paint = new Paint();
        this.f41070p = paint;
        paint.setColor(-1);
        this.f41070p.setStyle(Paint.Style.STROKE);
        this.f41070p.setStrokeWidth(AbstractC23136l9.m118742r(1.0f));
        this.f41070p.setFlags(1);
        this.f41071q = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ void m39191c(ValueAnimator valueAnimator) {
        try {
            int i11 = this.f41076v;
            int i12 = this.f41078x;
            if (i11 < i12 && !this.f41075u) {
                for (int i13 = 0; i13 < 3; i13++) {
                    this.f41076v++;
                    invalidate();
                }
                if (this.f41076v >= this.f41078x) {
                    this.f41075u = true;
                }
            } else if (this.f41075u) {
                if (i11 >= i12 && !this.f41080z) {
                    this.f41080z = true;
                    this.f41079y = false;
                }
                if (i11 <= this.f41077w && !this.f41079y) {
                    this.f41080z = false;
                    this.f41079y = true;
                }
                if (this.f41080z) {
                    this.f41076v = i11 - 1;
                }
                if (this.f41079y) {
                    this.f41076v++;
                }
            }
            invalidate();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: b */
    public void m39192b(boolean z11) {
        m39194e();
        setVisibility(0);
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 10);
        this.f41074t = ofInt;
        ofInt.setDuration(3000L);
        this.f41074t.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: te.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                FocusCircleView.this.m39191c(valueAnimator);
            }
        });
        this.f41074t.addListener(new C7581a());
        this.f41074t.start();
    }

    /* renamed from: d */
    public void m39193d(boolean z11, Rect rect) {
        if (this.f41071q != z11 || !rect.equals(this.f41072r)) {
            invalidate();
        }
        this.f41071q = z11;
        this.f41072r = rect;
        if (!z11) {
            m39194e();
            this.f41075u = false;
        } else {
            m39192b(z11);
        }
    }

    /* renamed from: e */
    public void m39194e() {
        this.f41076v = 0;
        ValueAnimator valueAnimator = this.f41074t;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f41074t.cancel();
            this.f41074t = null;
        }
        setVisibility(8);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f41071q) {
            this.f41070p.setColor(-1);
            Rect rect = this.f41072r;
            canvas.drawCircle(rect.left + 50, rect.top + 50, AbstractC23136l9.m118742r(this.f41076v), this.f41070p);
            return;
        }
        canvas.drawColor(0);
    }
}
