package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import me0.AbstractC23136l9;
import p500s1.C26087b;

/* renamed from: com.zing.zalo.ui.widget.l2 */
/* loaded from: classes6.dex */
public class C13666l2 {

    /* renamed from: A */
    int f70568A;

    /* renamed from: B */
    int f70569B;

    /* renamed from: C */
    Animator f70570C;

    /* renamed from: a */
    View f70571a;

    /* renamed from: d */
    RectF f70574d;

    /* renamed from: e */
    int f70575e;

    /* renamed from: f */
    int f70576f;

    /* renamed from: g */
    Paint f70577g;

    /* renamed from: i */
    int f70579i;

    /* renamed from: p */
    RectF f70586p;

    /* renamed from: q */
    RectF f70587q;

    /* renamed from: r */
    RectF f70588r;

    /* renamed from: w */
    int f70593w;

    /* renamed from: x */
    int f70594x;

    /* renamed from: y */
    int f70595y;

    /* renamed from: z */
    int f70596z;

    /* renamed from: b */
    int f70572b = AbstractC23136l9.m118742r(25.0f);

    /* renamed from: c */
    int f70573c = AbstractC23136l9.m118742r(50.0f);

    /* renamed from: h */
    int f70578h = AbstractC23136l9.m118659K(AbstractC16802y.story_bar_item_roundrect_corner_radius);

    /* renamed from: j */
    int f70580j = 1;

    /* renamed from: k */
    int f70581k = 0;

    /* renamed from: l */
    int f70582l = AbstractC23136l9.m118742r(1.5f);

    /* renamed from: m */
    int f70583m = IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;

    /* renamed from: n */
    LinearGradient f70584n = null;

    /* renamed from: o */
    LinearGradient f70585o = null;

    /* renamed from: s */
    int f70589s = 0;

    /* renamed from: t */
    int f70590t = 0;

    /* renamed from: u */
    int f70591u = 0;

    /* renamed from: v */
    int f70592v = 0;

    public C13666l2(View view) {
        this.f70579i = -15738068;
        this.f70571a = view;
        m76362l(this.f70572b, this.f70573c);
        this.f70579i = -15623425;
        Paint paint = new Paint(1);
        this.f70577g = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f70577g.setStrokeWidth(this.f70582l);
        this.f70577g.setColor(this.f70579i);
    }

    /* renamed from: m */
    public /* synthetic */ void m76351m(ValueAnimator valueAnimator) {
        this.f70581k = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f70571a.invalidate();
    }

    /* renamed from: b */
    public void m76352b() {
        LinearGradient linearGradient;
        Paint paint = this.f70577g;
        if (paint != null && (linearGradient = this.f70585o) != null) {
            paint.setShader(linearGradient);
        }
    }

    /* renamed from: c */
    public void m76353c(Canvas canvas) {
        int i11 = this.f70581k;
        if (i11 < this.f70594x) {
            m76358h(canvas, i11);
            return;
        }
        if (i11 < this.f70595y) {
            m76358h(canvas, i11);
            m76356f(canvas, this.f70581k);
            return;
        }
        if (i11 < this.f70596z) {
            m76358h(canvas, i11);
            m76356f(canvas, this.f70581k);
            m76354d(canvas, this.f70581k);
        } else {
            if (i11 < this.f70593w) {
                m76358h(canvas, i11);
                m76356f(canvas, this.f70581k);
                m76354d(canvas, this.f70581k);
                m76355e(canvas, this.f70581k);
                return;
            }
            m76358h(canvas, i11);
            m76356f(canvas, this.f70581k);
            m76354d(canvas, this.f70581k);
            m76355e(canvas, this.f70581k);
            m76357g(canvas, this.f70581k);
        }
    }

    /* renamed from: d */
    void m76354d(Canvas canvas, int i11) {
        if (i11 >= this.f70596z) {
            this.f70591u = 0;
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            int i12 = this.f70572b;
            int i13 = this.f70578h;
            float f11 = i12 - i13;
            int i14 = this.f70573c;
            canvas.drawLine(f11, i14, i13, i14, this.f70577g);
            canvas.drawArc(this.f70588r, 90.0f, 90.0f, false, this.f70577g);
            canvas.restore();
            return;
        }
        int i15 = (((i11 * this.f70580j) / 100) - (this.f70572b / 2)) - this.f70573c;
        if (i15 > this.f70578h) {
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            int i16 = this.f70572b - i15;
            int i17 = this.f70578h;
            if (i16 > i17) {
                int i18 = this.f70573c;
                canvas.drawLine(r0 - i17, i18, r0 - i15, i18, this.f70577g);
            } else {
                this.f70591u++;
                int i19 = this.f70573c;
                canvas.drawLine(r0 - i17, i19, i17, i19, this.f70577g);
                canvas.translate(0.0f, this.f70573c - (this.f70578h * 2));
                canvas.drawArc(this.f70574d, 90.0f, this.f70591u * this.f70569B, false, this.f70577g);
            }
            canvas.restore();
        }
    }

    /* renamed from: e */
    void m76355e(Canvas canvas, int i11) {
        int i12 = this.f70572b / 2;
        if (i11 >= this.f70593w) {
            this.f70589s = 0;
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            int i13 = this.f70573c;
            canvas.drawLine(0.0f, i13 - r2, 0.0f, this.f70578h, this.f70577g);
            canvas.drawArc(this.f70574d, 180.0f, 90.0f, false, this.f70577g);
            canvas.restore();
            return;
        }
        int i14 = (((i11 * this.f70580j) / 100) - this.f70573c) - (i12 * 3);
        if (i14 > this.f70578h) {
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            int i15 = this.f70573c - i14;
            int i16 = this.f70578h;
            if (i15 > i16) {
                canvas.drawLine(0.0f, r1 - i16, 0.0f, r1 - i14, this.f70577g);
            } else {
                this.f70589s++;
                canvas.drawLine(0.0f, r1 - i16, 0.0f, i16, this.f70577g);
                canvas.drawArc(this.f70574d, 180.0f, this.f70589s * this.f70569B, false, this.f70577g);
            }
            canvas.restore();
        }
    }

    /* renamed from: f */
    void m76356f(Canvas canvas, int i11) {
        if (i11 >= this.f70595y) {
            this.f70592v = 0;
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            int i12 = this.f70572b;
            canvas.drawLine(i12, this.f70578h, i12, this.f70573c - r0, this.f70577g);
            canvas.drawArc(this.f70587q, 0.0f, 90.0f, false, this.f70577g);
            canvas.restore();
            return;
        }
        int i13 = ((i11 * this.f70580j) / 100) - (this.f70572b / 2);
        if (i13 > this.f70578h) {
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            int i14 = this.f70573c;
            int i15 = this.f70578h;
            if (i13 < i14 - i15) {
                int i16 = this.f70572b;
                canvas.drawLine(i16, i15, i16, i13, this.f70577g);
            } else {
                this.f70592v++;
                int i17 = this.f70572b;
                canvas.drawLine(i17, i15, i17, i14 - i15, this.f70577g);
                int i18 = this.f70572b;
                int i19 = this.f70578h;
                canvas.translate(i18 - (i19 * 2), this.f70573c - (i19 * 2));
                canvas.drawArc(this.f70574d, 0.0f, this.f70592v * this.f70569B, false, this.f70577g);
            }
            canvas.restore();
        }
    }

    /* renamed from: g */
    void m76357g(Canvas canvas, int i11) {
        int i12 = (((i11 * this.f70580j) / 100) - (this.f70573c * 2)) - ((this.f70572b / 2) * 3);
        if (i12 > this.f70578h) {
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            canvas.drawLine(this.f70578h, 0.0f, i12, 0.0f, this.f70577g);
            canvas.restore();
        }
    }

    /* renamed from: h */
    void m76358h(Canvas canvas, int i11) {
        int i12 = this.f70572b / 2;
        if (i11 >= this.f70594x) {
            this.f70590t = 0;
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            canvas.drawLine(i12, 0.0f, this.f70572b - this.f70578h, 0.0f, this.f70577g);
            canvas.drawArc(this.f70586p, 270.0f, 90.0f, false, this.f70577g);
            canvas.restore();
            return;
        }
        int i13 = (i11 * this.f70580j) / 100;
        if (i13 > 0) {
            canvas.save();
            canvas.translate(this.f70576f, this.f70575e);
            if (i12 - i13 > this.f70578h) {
                canvas.drawLine(i12, 0.0f, i12 + i13, 0.0f, this.f70577g);
            } else {
                this.f70590t++;
                canvas.drawLine(i12, 0.0f, this.f70572b - r3, 0.0f, this.f70577g);
                canvas.translate(this.f70572b - (this.f70578h * 2), 0.0f);
                canvas.drawArc(this.f70574d, 270.0f, this.f70590t * this.f70569B, false, this.f70577g);
            }
            canvas.restore();
        }
    }

    /* renamed from: i */
    public void m76359i() {
        LinearGradient linearGradient;
        Paint paint = this.f70577g;
        if (paint != null && (linearGradient = this.f70584n) != null) {
            paint.setShader(linearGradient);
        }
    }

    /* renamed from: j */
    public Animator m76360j() {
        Animator animator = this.f70570C;
        if (animator != null && animator.isRunning()) {
            this.f70570C.end();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        ofInt.setDuration(this.f70583m);
        ofInt.setInterpolator(new C26087b());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.k2
            public /* synthetic */ C13661k2() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C13666l2.this.m76351m(valueAnimator);
            }
        });
        this.f70570C = ofInt;
        return ofInt;
    }

    /* renamed from: k */
    public int m76361k() {
        return this.f70582l;
    }

    /* renamed from: l */
    void m76362l(int i11, int i12) {
        this.f70580j = (i11 * 2) + (i12 * 2);
        int i13 = this.f70578h;
        this.f70574d = new RectF(0.0f, 0.0f, i13 * 2, i13 * 2);
        RectF rectF = this.f70574d;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f70586p = rectF2;
        rectF2.offset(i11 - (this.f70578h * 2), 0.0f);
        RectF rectF3 = this.f70574d;
        RectF rectF4 = new RectF(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom);
        this.f70587q = rectF4;
        int i14 = this.f70578h;
        rectF4.offset(i11 - (i14 * 2), i12 - (i14 * 2));
        RectF rectF5 = this.f70574d;
        RectF rectF6 = new RectF(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom);
        this.f70588r = rectF6;
        rectF6.offset(0.0f, i12 - (this.f70578h * 2));
        int i15 = this.f70578h;
        int i16 = this.f70580j;
        this.f70594x = (int) (((((i11 * 1.0f) / 2.0f) + i15) / i16) * 100.0f);
        this.f70595y = (int) ((((((i11 / 2) + i12) + i15) * 1.0f) / i16) * 100.0f);
        int i17 = (i11 * 3) / 2;
        this.f70596z = (int) (((((i12 + i17) + i15) * 1.0f) / i16) * 100.0f);
        this.f70593w = (int) (((((i17 + r1) + i15) * 1.0f) / i16) * 100.0f);
        int i18 = (int) (((i15 * 2.0f) / i16) * 100.0f);
        this.f70568A = i18;
        if (i18 <= 0) {
            i18 = 1;
        }
        this.f70568A = i18;
        this.f70569B = 90 / i18;
    }

    /* renamed from: n */
    public void m76363n(int[] iArr) {
        this.f70584n = new LinearGradient(0.0f, 0.0f, 0.0f, this.f70573c, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    /* renamed from: o */
    public void m76364o(int[] iArr) {
        this.f70585o = new LinearGradient(0.0f, 0.0f, 0.0f, this.f70573c, iArr, (float[]) null, Shader.TileMode.CLAMP);
    }

    /* renamed from: p */
    public void m76365p(int i11, int i12) {
        this.f70576f = i11;
        this.f70575e = i12;
    }

    /* renamed from: q */
    public void m76366q(int i11, int i12) {
        this.f70572b = i11;
        this.f70573c = i12;
        m76362l(i11, i12);
    }

    /* renamed from: r */
    public void m76367r() {
        Animator animator = this.f70570C;
        if (animator != null && animator.isRunning()) {
            this.f70570C.end();
        }
        this.f70571a.invalidate();
    }
}
