package com.zing.zalo.uicomponents.imageview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.BounceInterpolator;
import androidx.core.content.AbstractC1388a;
import com.androidquery.util.RecyclingImageView;
import com.zing.zalo.uicomponents.imageview.ActiveImageColorButton;
import p500s1.C26087b;
import p663xz.C30226b;
import p663xz.InterfaceC30225a;
import pc0.AbstractC24724b;

/* loaded from: classes6.dex */
public class ActiveImageColorButton extends RecyclingImageView {

    /* renamed from: A */
    RectF f82925A;

    /* renamed from: B */
    float f82926B;

    /* renamed from: C */
    float[] f82927C;

    /* renamed from: D */
    int[] f82928D;

    /* renamed from: E */
    float[] f82929E;

    /* renamed from: F */
    Animator f82930F;

    /* renamed from: G */
    Animator f82931G;

    /* renamed from: H */
    ArgbEvaluator f82932H;

    /* renamed from: I */
    int f82933I;

    /* renamed from: J */
    int f82934J;

    /* renamed from: K */
    float f82935K;

    /* renamed from: p */
    private final InterfaceC30225a f82936p;

    /* renamed from: q */
    Bitmap f82937q;

    /* renamed from: r */
    Paint f82938r;

    /* renamed from: s */
    Paint f82939s;

    /* renamed from: t */
    float f82940t;

    /* renamed from: u */
    int f82941u;

    /* renamed from: v */
    int f82942v;

    /* renamed from: w */
    boolean f82943w;

    /* renamed from: x */
    boolean f82944x;

    /* renamed from: y */
    Drawable f82945y;

    /* renamed from: z */
    Rect f82946z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.uicomponents.imageview.ActiveImageColorButton$a */
    /* loaded from: classes6.dex */
    public class C16436a extends AnimatorListenerAdapter {

        /* renamed from: p */
        boolean f82947p = false;

        /* renamed from: q */
        final /* synthetic */ boolean f82948q;

        C16436a(boolean z11) {
            this.f82948q = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f82947p = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f82947p && !this.f82948q) {
                ActiveImageColorButton activeImageColorButton = ActiveImageColorButton.this;
                activeImageColorButton.f82943w = false;
                activeImageColorButton.invalidate();
            }
        }
    }

    public ActiveImageColorButton(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ void m87606m(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f82927C;
        float f11 = fArr[0];
        this.f82940t = f11 + ((fArr[1] - f11) * floatValue);
        this.f82941u = ((Integer) this.f82932H.evaluate(floatValue, Integer.valueOf(this.f82928D[0]), Integer.valueOf(this.f82928D[1]))).intValue();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ void m87607n(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float[] fArr = this.f82929E;
        float f11 = fArr[0];
        this.f82926B = f11 + ((fArr[1] - f11) * floatValue);
        invalidate();
    }

    /* renamed from: k */
    void m87608k(boolean z11) {
        Animator animator = this.f82930F;
        if (animator != null && animator.isStarted()) {
            this.f82930F.cancel();
        }
        this.f82943w = true;
        if (z11) {
            float[] fArr = this.f82927C;
            fArr[0] = this.f82940t;
            fArr[1] = this.f82935K;
            int[] iArr = this.f82928D;
            iArr[0] = this.f82941u;
            iArr[1] = this.f82942v;
        } else {
            float[] fArr2 = this.f82927C;
            fArr2[0] = this.f82940t;
            fArr2[1] = 0.0f;
            int[] iArr2 = this.f82928D;
            iArr2[0] = this.f82941u;
            iArr2[1] = this.f82942v & 16777215;
        }
        if (!isShown()) {
            this.f82940t = this.f82927C[1];
            this.f82941u = this.f82928D[1];
            invalidate();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qc0.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActiveImageColorButton.this.m87606m(valueAnimator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(new C26087b());
        ofFloat.start();
        ofFloat.addListener(new C16436a(z11));
        this.f82930F = ofFloat;
    }

    /* renamed from: l */
    void m87609l() {
        Paint paint = new Paint(1);
        this.f82939s = paint;
        paint.setColor(this.f82942v);
        this.f82938r = new Paint(4);
        this.f82945y = AbstractC1388a.m6964f(getContext(), AbstractC24724b.icon_red_dot);
        setLayerType(1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawable;
        float width = canvas.getWidth() / 2.0f;
        float height = canvas.getHeight() / 2.0f;
        this.f82939s.setColor(this.f82941u);
        if (this.f82943w) {
            if (this.f82937q != null) {
                RectF rectF = this.f82925A;
                float f11 = this.f82935K;
                rectF.set(width - f11, height - f11, width + f11, f11 + height);
                canvas.drawBitmap(this.f82937q, (Rect) null, this.f82925A, this.f82938r);
            } else {
                canvas.drawCircle(width, height, this.f82940t, this.f82939s);
            }
        }
        Drawable drawable2 = getDrawable();
        if (drawable2 != null) {
            drawable2.setState(getDrawableState());
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i11 = this.f82933I;
            if (intrinsicWidth > i11 || intrinsicHeight > i11) {
                if (intrinsicWidth > intrinsicHeight) {
                    intrinsicHeight = (drawable2.getIntrinsicHeight() * i11) / drawable2.getIntrinsicWidth();
                    intrinsicWidth = i11;
                } else {
                    intrinsicWidth = (drawable2.getIntrinsicWidth() * i11) / drawable2.getIntrinsicHeight();
                    intrinsicHeight = i11;
                }
            }
            float f12 = this.f82926B;
            int i12 = (int) (intrinsicWidth * f12);
            int i13 = (int) (intrinsicHeight * f12);
            int width2 = (canvas.getWidth() - i12) / 2;
            int height2 = (canvas.getHeight() - i13) / 2;
            drawable2.setBounds(width2, height2, i12 + width2, i13 + height2);
            drawable2.draw(canvas);
        }
        if (this.f82944x && (drawable = this.f82945y) != null) {
            drawable.setState(getDrawableState());
            int i14 = this.f82934J;
            if (i14 == -1) {
                i14 = this.f82945y.getIntrinsicWidth();
            }
            int i15 = this.f82934J;
            if (i15 == -1) {
                i15 = this.f82945y.getIntrinsicHeight();
            }
            Rect rect = this.f82946z;
            int i16 = this.f82933I;
            rect.left = (int) ((i16 / 2.0f) + width);
            rect.top = (int) ((height - (i16 / 2.0f)) - i15);
            int i17 = (int) (width + (i16 / 2.0f) + i14);
            rect.right = i17;
            rect.bottom = (int) (height - (i16 / 2.0f));
            if (i17 > canvas.getWidth()) {
                this.f82946z.offset(canvas.getWidth() - this.f82946z.right, 0);
            }
            Rect rect2 = this.f82946z;
            int i18 = rect2.top;
            if (i18 < 0) {
                rect2.offset(0, 0 - i18);
            }
            this.f82945y.setBounds(this.f82946z);
            this.f82945y.draw(canvas);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f82942v == 0) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    m87610p(false);
                }
            } else {
                m87610p(true);
            }
        } else if (this.f82926B != 1.0f) {
            this.f82926B = 1.0f;
            invalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: p */
    void m87610p(boolean z11) {
        Animator animator = this.f82931G;
        if (animator != null && animator.isStarted()) {
            this.f82931G.cancel();
        }
        if (z11) {
            float[] fArr = this.f82929E;
            fArr[0] = this.f82926B;
            fArr[1] = 1.4f;
        } else {
            float[] fArr2 = this.f82929E;
            fArr2[0] = this.f82926B;
            fArr2[1] = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: qc0.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ActiveImageColorButton.this.m87607n(valueAnimator);
            }
        });
        ofFloat.setDuration(500L);
        ofFloat.setInterpolator(new BounceInterpolator());
        ofFloat.start();
        this.f82931G = ofFloat;
    }

    public void setBitmap(Bitmap bitmap) {
        if (bitmap != this.f82937q) {
            this.f82942v = 0;
            this.f82941u = 0;
            this.f82937q = bitmap;
            invalidate();
        }
    }

    public void setCircleColor(int i11) {
        if (i11 != this.f82942v) {
            Animator animator = this.f82930F;
            if (animator != null && animator.isStarted()) {
                this.f82930F.end();
            }
            this.f82942v = i11;
            this.f82941u = i11;
            this.f82937q = null;
            invalidate();
        }
    }

    public void setMaxIconSize(int i11) {
        this.f82933I = i11;
        invalidate();
    }

    public void setRedDotSize(int i11) {
        this.f82934J = i11;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z11) {
        if (z11 != isSelected()) {
            m87608k(z11);
        }
        super.setSelected(z11);
    }

    public void setShowRedDot(boolean z11) {
        if (z11 != this.f82944x) {
            this.f82944x = z11;
            invalidate();
        }
    }

    public ActiveImageColorButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C30226b c30226b = new C30226b(getContext());
        this.f82936p = c30226b;
        this.f82941u = 0;
        this.f82942v = 0;
        this.f82943w = false;
        this.f82944x = false;
        this.f82945y = null;
        this.f82946z = new Rect();
        this.f82925A = new RectF();
        this.f82926B = 1.0f;
        this.f82927C = new float[2];
        this.f82928D = new int[2];
        this.f82929E = new float[2];
        this.f82932H = new ArgbEvaluator();
        this.f82933I = c30226b.mo149041e(22);
        this.f82934J = -1;
        this.f82935K = c30226b.mo149041e(18);
        m87609l();
    }
}
