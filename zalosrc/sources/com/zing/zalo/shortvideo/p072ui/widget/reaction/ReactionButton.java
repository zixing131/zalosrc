package com.zing.zalo.shortvideo.p072ui.widget.reaction;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.AppCompatImageView;
import com.zing.zalo.shortvideo.p072ui.widget.reaction.ReactionButton;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.Arrays;
import java.util.Iterator;
import ln0.C22537f;
import pm0.C24860q;
import qm0.AbstractC25351j0;
import qm0.AbstractC25358n;
import s20.AbstractC26099a;
import s20.AbstractC26112n;
import v00.AbstractC27406a;
import v00.AbstractC27407b;
import v00.AbstractC27408c;

/* loaded from: classes5.dex */
public final class ReactionButton extends AppCompatImageView {

    /* renamed from: p */
    private final Drawable f54520p;

    /* renamed from: q */
    private final float f54521q;

    /* renamed from: r */
    private final float f54522r;

    /* renamed from: s */
    private SparseArray f54523s;

    /* renamed from: t */
    private final Paint f54524t;

    /* renamed from: u */
    private Animator f54525u;

    /* renamed from: v */
    private C10803c f54526v;

    /* renamed from: w */
    private float f54527w;

    /* renamed from: x */
    private int f54528x;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionButton$a */
    /* loaded from: classes5.dex */
    public static final class C10801a extends LinearGradient {
        public C10801a(float f11, int i11, int i12) {
            super(0.0f, 0.0f, f11, f11, new int[]{i11, i12}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionButton$b */
    /* loaded from: classes5.dex */
    private static final class InterpolatorC10802b implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (((float) Math.sin((f11 + 0.5d) * 6.283185307179586d)) / 10.0f) + 1.0f;
        }
    }

    /* renamed from: com.zing.zalo.shortvideo.ui.widget.reaction.ReactionButton$c */
    /* loaded from: classes5.dex */
    private static final class C10803c {

        /* renamed from: a */
        private final long f54529a;

        /* renamed from: b */
        private final float f54530b;

        /* renamed from: c */
        private final float f54531c;

        /* renamed from: d */
        private final float[] f54532d;

        /* renamed from: e */
        private final float[] f54533e;

        /* renamed from: f */
        private final float[] f54534f;

        /* renamed from: g */
        private ObjectAnimator f54535g;

        /* renamed from: h */
        private ObjectAnimator f54536h;

        /* renamed from: i */
        private ObjectAnimator f54537i;

        public C10803c(View view) {
            C22537f m131358F;
            C22537f m131358F2;
            C22537f m131358F3;
            AbstractC19074t.m100208f(view, "view");
            this.f54529a = 500L;
            this.f54530b = 5.0f;
            this.f54531c = view.getContext().getResources().getDisplayMetrics().density * 1.5f;
            float[] fArr = {1.0f, -1.0f, -3.0f, 3.0f, 1.0f, -1.0f, -3.0f, 3.0f, -1.0f, 1.0f, 1.0f};
            m131358F = AbstractC25358n.m131358F(fArr);
            Iterator it = m131358F.iterator();
            while (it.hasNext()) {
                int mo116552a = ((AbstractC25351j0) it).mo116552a();
                fArr[mo116552a] = fArr[mo116552a] * this.f54531c;
            }
            this.f54532d = fArr;
            float[] fArr2 = {1.0f, -2.0f, 0.0f, 2.0f, -1.0f, 2.0f, 1.0f, 1.0f, -1.0f, 2.0f, -2.0f};
            m131358F2 = AbstractC25358n.m131358F(fArr2);
            Iterator it2 = m131358F2.iterator();
            while (it2.hasNext()) {
                int mo116552a2 = ((AbstractC25351j0) it2).mo116552a();
                fArr2[mo116552a2] = fArr2[mo116552a2] * this.f54531c;
            }
            this.f54533e = fArr2;
            float[] fArr3 = {0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, -1.0f};
            m131358F3 = AbstractC25358n.m131358F(fArr3);
            Iterator it3 = m131358F3.iterator();
            while (it3.hasNext()) {
                int mo116552a3 = ((AbstractC25351j0) it3).mo116552a();
                fArr3[mo116552a3] = fArr3[mo116552a3] * this.f54530b;
            }
            this.f54534f = fArr3;
            float[] fArr4 = this.f54532d;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", Arrays.copyOf(fArr4, fArr4.length));
            ofFloat.setRepeatCount(-1);
            ofFloat.setDuration(this.f54529a);
            AbstractC19074t.m100207e(ofFloat, "apply(...)");
            this.f54535g = ofFloat;
            float[] fArr5 = this.f54533e;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationY", Arrays.copyOf(fArr5, fArr5.length));
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setDuration(this.f54529a);
            AbstractC19074t.m100207e(ofFloat2, "apply(...)");
            this.f54536h = ofFloat2;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "rotation", Arrays.copyOf(fArr3, fArr3.length));
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setDuration(this.f54529a);
            AbstractC19074t.m100207e(ofFloat3, "apply(...)");
            this.f54537i = ofFloat3;
        }

        /* renamed from: a */
        public final void m56062a() {
            this.f54535g.end();
            this.f54536h.end();
            this.f54537i.end();
        }

        /* renamed from: b */
        public final void m56063b() {
            this.f54535g.start();
            this.f54536h.start();
            this.f54537i.start();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    /* renamed from: h */
    public static /* synthetic */ void m56054h(ReactionButton reactionButton, Drawable drawable, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            drawable = reactionButton.f54520p;
        }
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        reactionButton.m56057g(drawable, i11);
    }

    /* renamed from: j */
    public static /* synthetic */ void m56055j(ReactionButton reactionButton, float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 1.0f;
        }
        reactionButton.m56058i(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m56056l(ReactionButton reactionButton, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(reactionButton, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        reactionButton.setScaleX(reactionButton.f54527w * floatValue);
        reactionButton.setScaleY(floatValue * reactionButton.f54527w);
    }

    /* renamed from: g */
    public final void m56057g(Drawable drawable, int i11) {
        Drawable drawable2;
        Drawable mutate;
        Drawable.ConstantState constantState;
        Paint paint = this.f54524t;
        C24860q c24860q = (C24860q) this.f54523s.get(i11);
        paint.setShader(new C10801a(this.f54521q, ((Number) c24860q.m129215c()).intValue(), ((Number) c24860q.m129216d()).intValue()));
        if (drawable != null && (mutate = drawable.mutate()) != null && (constantState = mutate.getConstantState()) != null) {
            drawable2 = constantState.newDrawable();
        } else {
            drawable2 = null;
        }
        setImageDrawable(drawable2);
    }

    /* renamed from: i */
    public final void m56058i(float f11, float f12) {
        this.f54527w = f11;
        setAlpha(f12);
        if (f11 == 0.0f) {
            AbstractC26112n.m134367H(this);
            return;
        }
        Animator animator = this.f54525u;
        if (animator == null || !animator.isRunning()) {
            setScaleX(f11);
            setScaleY(f11);
        }
        AbstractC26112n.m134431w0(this);
    }

    /* renamed from: k */
    public final void m56059k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        AbstractC19074t.m100205c(ofFloat);
        Context context = getContext();
        AbstractC19074t.m100207e(context, "getContext(...)");
        AbstractC26099a.m134294a(ofFloat, context, 300L);
        ofFloat.setInterpolator(new InterpolatorC10802b());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p20.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ReactionButton.m56056l(ReactionButton.this, valueAnimator);
            }
        });
        ofFloat.start();
        Animator animator = this.f54525u;
        if (animator != null) {
            animator.cancel();
        }
        this.f54525u = ofFloat;
    }

    /* renamed from: m */
    public final void m56060m() {
        C10803c c10803c = new C10803c(this);
        C10803c c10803c2 = this.f54526v;
        if (c10803c2 != null) {
            c10803c2.m56062a();
        }
        this.f54526v = c10803c;
        c10803c.m56063b();
    }

    /* renamed from: n */
    public final void m56061n() {
        C10803c c10803c = this.f54526v;
        if (c10803c != null) {
            c10803c.m56062a();
        }
        this.f54526v = null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        Animator animator = this.f54525u;
        if (animator != null) {
            animator.end();
        }
        C10803c c10803c = this.f54526v;
        if (c10803c != null) {
            c10803c.m56062a();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        AbstractC19074t.m100208f(canvas, "canvas");
        super.onDraw(canvas);
        float f11 = 2;
        canvas.drawArc((getWidth() - this.f54521q) / f11, (getHeight() - this.f54521q) / f11, (getWidth() + this.f54521q) / f11, (getHeight() + this.f54521q) / f11, -90.0f, this.f54528x * 3.6f, false, this.f54524t);
    }

    public final void setCount(int i11) {
        int min = Math.min(Math.max(0, i11), 100);
        int i12 = this.f54528x;
        if (i12 > min) {
            m56055j(this, (((this.f54527w - 1.0f) * min) / i12) + 1.0f, 0.0f, 2, null);
        }
        if (this.f54528x < min) {
            m56055j(this, Math.min(this.f54527w + 0.03f, 1.3f), 0.0f, 2, null);
        }
        this.f54528x = min;
        invalidate();
    }

    public /* synthetic */ ReactionButton(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactionButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f54520p = AbstractC26112n.m134434z(this, AbstractC27408c.zch_ic_heart_livestream_reaction);
        float m134433y = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_button_border_size);
        this.f54521q = m134433y;
        float m134433y2 = AbstractC26112n.m134433y(this, AbstractC27407b.zch_layout_reaction_button_border_width);
        this.f54522r = m134433y2;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(1, new C24860q(Integer.valueOf(AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r55)), Integer.valueOf(AbstractC26112n.m134426u(this, AbstractC27406a.zch_red_r55))));
        this.f54523s = sparseArray;
        Paint paint = new Paint();
        paint.setFlags(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        paint.setStrokeWidth(m134433y2);
        C24860q c24860q = (C24860q) this.f54523s.get(1);
        paint.setShader(new C10801a(m134433y, ((Number) c24860q.m129215c()).intValue(), ((Number) c24860q.m129216d()).intValue()));
        this.f54524t = paint;
        this.f54527w = 1.0f;
    }
}
