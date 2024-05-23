package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.AbstractC1388a;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC16802y;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zmedia.player.IMediaPlayer;
import l30.AbstractC22055v0;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p500s1.C26087b;

/* loaded from: classes6.dex */
public class StoryBarItemImageView extends StoryPreviewView {

    /* renamed from: F */
    int[] f69767F;

    /* renamed from: G */
    int f69768G;

    /* renamed from: H */
    int f69769H;

    /* renamed from: I */
    int f69770I;

    /* renamed from: J */
    Paint f69771J;

    /* renamed from: K */
    int f69772K;

    /* renamed from: L */
    Paint f69773L;

    /* renamed from: M */
    int f69774M;

    /* renamed from: N */
    PathEffect f69775N;

    /* renamed from: O */
    float f69776O;

    /* renamed from: P */
    RectF f69777P;

    /* renamed from: Q */
    boolean f69778Q;

    /* renamed from: R */
    boolean f69779R;

    /* renamed from: S */
    boolean f69780S;

    /* renamed from: T */
    RectF f69781T;

    /* renamed from: U */
    int f69782U;

    /* renamed from: V */
    int f69783V;

    /* renamed from: W */
    Drawable f69784W;

    /* renamed from: a0 */
    int f69785a0;

    /* renamed from: b0 */
    float f69786b0;

    /* renamed from: c0 */
    ValueAnimator f69787c0;

    /* renamed from: d0 */
    ValueAnimator f69788d0;

    /* renamed from: e0 */
    View.OnClickListener f69789e0;

    /* renamed from: f0 */
    private C13666l2 f69790f0;

    /* renamed from: g0 */
    private C13804v0 f69791g0;

    /* renamed from: h0 */
    LinearGradient f69792h0;

    /* renamed from: i0 */
    LinearGradient f69793i0;

    /* renamed from: j0 */
    boolean f69794j0;

    /* renamed from: k0 */
    boolean f69795k0;

    /* renamed from: l0 */
    Handler f69796l0;

    /* renamed from: m0 */
    Animator f69797m0;

    /* renamed from: com.zing.zalo.ui.widget.StoryBarItemImageView$a */
    /* loaded from: classes6.dex */
    class HandlerC13541a extends Handler {
        HandlerC13541a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            StoryBarItemImageView storyBarItemImageView;
            View.OnClickListener onClickListener;
            int i11 = message.what;
            if (i11 != 10) {
                if (i11 == 11 && (onClickListener = (storyBarItemImageView = StoryBarItemImageView.this).f69789e0) != null) {
                    onClickListener.onClick(storyBarItemImageView);
                }
            } else {
                ValueAnimator valueAnimator = StoryBarItemImageView.this.f69787c0;
                if (valueAnimator != null && !valueAnimator.isRunning()) {
                    StoryBarItemImageView.this.f69787c0.setFloatValues(1.0f, 0.85f);
                    StoryBarItemImageView.this.f69787c0.start();
                }
            }
            super.handleMessage(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.StoryBarItemImageView$b */
    /* loaded from: classes6.dex */
    public class C13542b extends AnimatorListenerAdapter {
        C13542b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StoryBarItemImageView storyBarItemImageView = StoryBarItemImageView.this;
            ValueAnimator valueAnimator = storyBarItemImageView.f69788d0;
            if (valueAnimator != null && storyBarItemImageView.f69795k0) {
                valueAnimator.setFloatValues(storyBarItemImageView.getScaleX(), 1.0f);
                StoryBarItemImageView.this.f69788d0.start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.StoryBarItemImageView$c */
    /* loaded from: classes6.dex */
    public class C13543c extends AnimatorListenerAdapter {
        C13543c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StoryBarItemImageView storyBarItemImageView = StoryBarItemImageView.this;
            if (storyBarItemImageView.f69794j0) {
                storyBarItemImageView.f69796l0.removeMessages(11);
                StoryBarItemImageView.this.f69796l0.sendEmptyMessage(11);
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.StoryBarItemImageView$d */
    /* loaded from: classes6.dex */
    class C13544d extends AnimatorListenerAdapter {
        C13544d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            StoryBarItemImageView.this.setAnimProgress(100);
        }
    }

    public StoryBarItemImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69767F = new int[]{-16731905, -15828737, -4168705};
        this.f69768G = AbstractC23136l9.m118742r(1.5f);
        this.f69769H = AbstractC23136l9.m118742r(2.0f);
        this.f69770I = Color.parseColor("#9ff0ff");
        this.f69776O = 0.0f;
        this.f69778Q = true;
        this.f69782U = IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
        this.f69783V = 100;
        this.f69785a0 = 0;
        this.f69786b0 = 0.0f;
        this.f69796l0 = new HandlerC13541a(Looper.getMainLooper());
        m75950w(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ void m75935A(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void m75936B(ValueAnimator valueAnimator) {
        setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
        setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void m75942x(ValueAnimator valueAnimator) {
        setAnimProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m75943y(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f69786b0 = floatValue;
        this.f69785a0 = (int) (floatValue * 255.0f);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void m75944z(ValueAnimator valueAnimator) {
        invalidate();
    }

    /* renamed from: C */
    public void m75945C(boolean z11, boolean z12) {
        if (!z12) {
            ValueAnimator valueAnimator = this.f69787c0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f69788d0;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f69780S = z11;
        if (z11) {
            if (m75957k()) {
                this.f69771J.setPathEffect(this.f69775N);
            }
        } else if (m75957k()) {
            this.f69771J.setPathEffect(null);
        }
        invalidate();
    }

    /* renamed from: D */
    public void m75946D() {
        Animator animator = this.f69797m0;
        if (animator != null && animator.isRunning()) {
            this.f69797m0.end();
        }
        C13666l2 c13666l2 = this.f69790f0;
        if (c13666l2 != null) {
            c13666l2.m76367r();
        }
        invalidate();
    }

    public Animator getAnim() {
        this.f69778Q = true;
        m75946D();
        Animator animator = this.f69797m0;
        if (animator != null && animator.isRunning()) {
            this.f69797m0.end();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 100);
        ofInt.setDuration(this.f69782U);
        ofInt.setInterpolator(new C26087b());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.v2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryBarItemImageView.this.m75942x(valueAnimator);
            }
        });
        ofInt.addListener(new C13544d());
        this.f69785a0 = 0;
        this.f69786b0 = 0.0f;
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.w2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryBarItemImageView.this.m75943y(valueAnimator);
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
        ValueAnimator ofInt2 = ValueAnimator.ofInt(204, 0);
        ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.x2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StoryBarItemImageView.this.m75944z(valueAnimator);
            }
        });
        ofInt2.setDuration(250L);
        ofInt2.setInterpolator(new DecelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofInt, ofFloat, ofFloat2, ofInt2);
        this.f69797m0 = animatorSet;
        return animatorSet;
    }

    public int getRoundCorner() {
        if (m75957k()) {
            return (int) ((getMeasuredWidth() - this.f69768G) / 2.0f);
        }
        return AbstractC23136l9.m118659K(AbstractC16802y.story_bar_item_roundrect_corner_radius);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.StoryPreviewView, com.androidquery.util.RecyclingImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        m75947s(canvas);
        if (this.f69784W != null) {
            float intrinsicWidth = r2.getIntrinsicWidth() * this.f69786b0;
            float intrinsicHeight = this.f69784W.getIntrinsicHeight() * this.f69786b0;
            float f11 = measuredWidth;
            float f12 = measuredHeight;
            this.f69784W.setBounds((int) ((f11 - intrinsicWidth) / 2.0f), (int) ((f12 - intrinsicHeight) / 2.0f), (int) ((f11 + intrinsicWidth) / 2.0f), (int) ((f12 + intrinsicHeight) / 2.0f));
            this.f69784W.setAlpha(this.f69785a0);
            this.f69784W.draw(canvas);
        }
        if (this.f69778Q) {
            m75948u(canvas);
        }
        m75949v(canvas);
        if (this.f69780S) {
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.widget.StoryPreviewView, android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        try {
            this.f69790f0.m76366q(getMeasuredWidth() - (this.f69790f0.m76361k() * 2), getMeasuredHeight() - (this.f69790f0.m76361k() * 2));
            if (this.f69777P == null) {
                this.f69777P = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        try {
            float f11 = this.f69815B;
            int[] m115162v = AbstractC22055v0.m115162v(getContext());
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.f69793i0 = new LinearGradient(0.0f, 0.0f, 0.0f, f11, m115162v, (float[]) null, tileMode);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.f69815B, this.f69767F, (float[]) null, tileMode);
            this.f69792h0 = linearGradient;
            Paint paint = this.f69771J;
            if (paint != null) {
                if (this.f69779R) {
                    paint.setShader(this.f69793i0);
                } else {
                    paint.setShader(linearGradient);
                }
            }
            RectF rectF = this.f69781T;
            if (rectF == null) {
                int i15 = this.f69768G;
                this.f69781T = new RectF(i15 / 2.0f, i15 / 2.0f, i11 - (i15 / 2.0f), i12 - (i15 / 2.0f));
            } else {
                int i16 = this.f69768G;
                rectF.set(i16 / 2.0f, i16 / 2.0f, i11 - (i16 / 2.0f), i12 - (i16 / 2.0f));
            }
            RectF rectF2 = this.f69777P;
            if (rectF2 == null) {
                this.f69777P = new RectF(0.0f, 0.0f, i11, i12);
            } else {
                rectF2.set(0.0f, 0.0f, i11, i12);
            }
            C13666l2 c13666l2 = this.f69790f0;
            if (c13666l2 != null) {
                c13666l2.m76366q(i11 - (c13666l2.m76361k() * 2), i12 - (this.f69790f0.m76361k() * 2));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int action = motionEvent.getAction();
        if (action != 1 && action != 3) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f69795k0 = z11;
        if (action == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f69794j0 = z12;
        if (action == 0) {
            this.f69796l0.sendEmptyMessageDelayed(10, 300L);
            return true;
        }
        if (action == 3) {
            m75945C(false, true);
            if (this.f69796l0.hasMessages(10)) {
                this.f69796l0.removeMessages(10);
            }
            if (this.f69787c0 != null && (valueAnimator2 = this.f69788d0) != null && !valueAnimator2.isRunning()) {
                this.f69787c0.cancel();
                this.f69788d0.setFloatValues(getScaleX(), 1.0f);
                this.f69788d0.start();
            }
            return false;
        }
        if (action != 4 && action != 1) {
            return super.onTouchEvent(motionEvent);
        }
        if (this.f69796l0.hasMessages(10)) {
            m75945C(true, false);
            this.f69796l0.removeMessages(10);
            this.f69796l0.sendEmptyMessage(10);
        } else {
            ValueAnimator valueAnimator3 = this.f69787c0;
            if (valueAnimator3 != null && !valueAnimator3.isRunning() && (valueAnimator = this.f69788d0) != null && !valueAnimator.isRunning()) {
                this.f69788d0.setFloatValues(getScaleX(), 1.0f);
                this.f69788d0.start();
            }
        }
        return false;
    }

    /* renamed from: s */
    void m75947s(Canvas canvas) {
        if (m75957k()) {
            if (this.f69780S) {
                float f11 = (this.f69776O + 1.0f) % 360.0f;
                this.f69776O = f11;
                canvas.rotate(f11, this.f69814A / 2.0f, this.f69815B / 2.0f);
                return;
            }
            return;
        }
        if (this.f69780S) {
            this.f69791g0.m77067f((getWidth() / 2) - (this.f69791g0.m77064c() / 2), (getHeight() / 2) - (this.f69791g0.m77063b() / 2));
            this.f69791g0.m77062a(canvas);
        }
    }

    @Override // android.view.View
    public void setAlpha(float f11) {
        if (f11 < 0.0f) {
            f11 = 0.0f;
        } else if (f11 > 1.0f) {
            f11 = 1.0f;
        }
        int i11 = (int) ((1.0f - f11) * 255.0f);
        this.f69772K = i11;
        this.f69773L.setAlpha(i11);
        invalidate();
    }

    public void setAnimProgress(int i11) {
        if (i11 != this.f69783V) {
            this.f69783V = i11;
            this.f69790f0.f70581k = i11;
            invalidate();
        }
    }

    public void setHasSeenAll(boolean z11) {
        this.f69779R = z11;
        if (z11) {
            this.f69771J.setShader(this.f69793i0);
            C13666l2 c13666l2 = this.f69790f0;
            if (c13666l2 != null) {
                c13666l2.m76352b();
            }
        } else {
            this.f69771J.setShader(this.f69792h0);
            C13666l2 c13666l22 = this.f69790f0;
            if (c13666l22 != null) {
                c13666l22.m76359i();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f69789e0 = onClickListener;
    }

    public void setShouldDrawOutLine(boolean z11) {
        int i11;
        this.f69778Q = z11;
        if (z11) {
            i11 = 100;
        } else {
            i11 = 0;
        }
        this.f69783V = i11;
        invalidate();
    }

    /* renamed from: u */
    void m75948u(Canvas canvas) {
        try {
            if (m75957k()) {
                canvas.drawArc(this.f69781T, 270.0f, this.f69783V * 3.6f, false, this.f69771J);
            } else {
                C13666l2 c13666l2 = this.f69790f0;
                if (c13666l2 != null) {
                    c13666l2.m76353c(canvas);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: v */
    void m75949v(Canvas canvas) {
        try {
            if (m75957k()) {
                int i11 = this.f69772K;
                if (i11 > 0 && i11 < 256) {
                    canvas.drawCircle(this.f69814A / 2.0f, this.f69815B / 2.0f, r0 - this.f69768G, this.f69773L);
                }
            } else {
                RectF rectF = this.f69777P;
                int i12 = this.f69825v;
                canvas.drawRoundRect(rectF, i12, i12, this.f69773L);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: w */
    void m75950w(Context context) {
        try {
            this.f69778Q = true;
            Paint paint = new Paint(1);
            this.f69771J = paint;
            paint.setStrokeWidth(this.f69768G);
            this.f69771J.setColor(C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor));
            this.f69771J.setStyle(Paint.Style.STROKE);
            this.f69775N = new DashPathEffect(new float[]{AbstractC23136l9.m118742r(5.0f), AbstractC23136l9.m118742r(5.0f)}, 0.0f);
            this.f69774M = C23212s8.m119607o(context, AbstractC16781w.PrimaryBackgroundColor);
            Paint paint2 = new Paint(1);
            this.f69773L = paint2;
            paint2.setColor(this.f69774M);
            this.f69773L.setAlpha(this.f69772K);
            this.f69773L.setStyle(Paint.Style.FILL);
            this.f69784W = AbstractC1388a.m6964f(getContext(), AbstractC16803z.icon_story_feed_success2);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.85f);
            this.f69787c0 = ofFloat;
            ofFloat.setDuration(70L);
            this.f69787c0.setInterpolator(new C26087b());
            this.f69787c0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.t2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryBarItemImageView.this.m75935A(valueAnimator);
                }
            });
            this.f69787c0.addListener(new C13542b());
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.85f, 1.0f);
            this.f69788d0 = ofFloat2;
            ofFloat2.setDuration(70L);
            this.f69788d0.setInterpolator(new C26087b());
            this.f69788d0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.u2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    StoryBarItemImageView.this.m75936B(valueAnimator);
                }
            });
            this.f69788d0.addListener(new C13543c());
            C13666l2 c13666l2 = new C13666l2(this);
            this.f69790f0 = c13666l2;
            c13666l2.f70581k = 100;
            this.f69790f0.m76365p(c13666l2.m76361k(), this.f69790f0.m76361k());
            this.f69790f0.m76364o(AbstractC22055v0.m115162v(context));
            this.f69790f0.m76363n(AbstractC22055v0.m115163w(context));
            C13804v0 c13804v0 = new C13804v0(this);
            this.f69791g0 = c13804v0;
            c13804v0.m77066e(AbstractC23136l9.m118742r(18.0f), AbstractC23136l9.m118742r(18.0f));
            this.f69791g0.m77068g(AbstractC23136l9.m118742r(1.0f));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public StoryBarItemImageView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f69767F = new int[]{-16731905, -15828737, -4168705};
        this.f69768G = AbstractC23136l9.m118742r(1.5f);
        this.f69769H = AbstractC23136l9.m118742r(2.0f);
        this.f69770I = Color.parseColor("#9ff0ff");
        this.f69776O = 0.0f;
        this.f69778Q = true;
        this.f69782U = IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING;
        this.f69783V = 100;
        this.f69785a0 = 0;
        this.f69786b0 = 0.0f;
        this.f69796l0 = new HandlerC13541a(Looper.getMainLooper());
        m75950w(context);
    }
}
