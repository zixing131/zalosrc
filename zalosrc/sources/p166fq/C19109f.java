package p166fq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.zing.zalo.feed.mvp.music.domain.entity.LyricRender;
import fn0.AbstractC19074t;
import me0.AbstractC23136l9;

/* renamed from: fq.f */
/* loaded from: classes4.dex */
public final class C19109f {

    /* renamed from: a */
    private final InterfaceC19110g f95103a;

    /* renamed from: b */
    private final InterfaceC19110g f95104b;

    /* renamed from: c */
    private final InterfaceC19110g f95105c;

    /* renamed from: d */
    private final float f95106d;

    /* renamed from: e */
    private ValueAnimator f95107e;

    /* renamed from: f */
    private ValueAnimator f95108f;

    /* renamed from: g */
    private ValueAnimator f95109g;

    /* renamed from: fq.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: q */
        final /* synthetic */ LyricRender f95111q;

        a(LyricRender lyricRender) {
            this.f95111q = lyricRender;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            C19109f.this.m100353k(this.f95111q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationStart(animator);
            C19109f.this.m100352j().mo97624i(this.f95111q.m45709f());
            C19109f.this.m100352j().mo97629q(0.0f);
            C19109f.this.m100351i().mo97629q(0.3f);
            C19109f.this.m100351i().mo97625j(0.8f);
            C19109f.this.m100351i().mo97627o(0.8f);
        }
    }

    public C19109f(InterfaceC19110g interfaceC19110g, InterfaceC19110g interfaceC19110g2, InterfaceC19110g interfaceC19110g3, float f11) {
        AbstractC19074t.m100208f(interfaceC19110g, "current");
        AbstractC19074t.m100208f(interfaceC19110g2, "next");
        AbstractC19074t.m100208f(interfaceC19110g3, "moving");
        this.f95103a = interfaceC19110g;
        this.f95104b = interfaceC19110g2;
        this.f95105c = interfaceC19110g3;
        this.f95106d = f11;
    }

    /* renamed from: e */
    private final void m100345e(LyricRender lyricRender) {
        this.f95103a.setTag(Long.valueOf(lyricRender.m45708e()));
        this.f95104b.setTag(Long.valueOf(lyricRender.m45710g()));
        ValueAnimator valueAnimator = this.f95107e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C19109f.m100346f(C19109f.this, valueAnimator2);
            }
        });
        ofFloat.addListener(new a(lyricRender));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(300L);
        ofFloat.start();
        this.f95107e = ofFloat;
        ValueAnimator valueAnimator2 = this.f95109g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.d
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                C19109f.m100347g(C19109f.this, valueAnimator3);
            }
        });
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(100L);
        ofFloat2.start();
        this.f95109g = ofFloat2;
        ValueAnimator valueAnimator3 = this.f95108f;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fq.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                C19109f.m100348h(C19109f.this, valueAnimator4);
            }
        });
        ofFloat3.setInterpolator(new LinearInterpolator());
        ofFloat3.setDuration(300L);
        ofFloat3.setStartDelay(0L);
        ofFloat3.start();
        this.f95108f = ofFloat3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m100346f(C19109f c19109f, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19109f, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        c19109f.f95103a.mo97618b((-AbstractC23136l9.m118742r(18.0f)) * animatedFraction);
        c19109f.f95104b.mo97629q(0.3f * animatedFraction);
        c19109f.f95105c.mo97618b(c19109f.f95106d * (1.0f - animatedFraction));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final void m100347g(C19109f c19109f, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19109f, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        float f11 = (0.2f * floatValue) + 0.8f;
        c19109f.f95103a.mo97625j(f11);
        c19109f.f95103a.mo97627o(f11);
        c19109f.f95103a.mo97629q(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m100348h(C19109f c19109f, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(c19109f, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        float animatedFraction = valueAnimator.getAnimatedFraction();
        c19109f.f95105c.mo97629q((0.7f * animatedFraction) + 0.3f);
        float f11 = (animatedFraction * 0.2f) + 0.8f;
        c19109f.f95105c.mo97625j(f11);
        c19109f.f95105c.mo97627o(f11);
    }

    /* renamed from: l */
    private final void m100349l() {
        this.f95103a.mo97625j(1.0f);
        this.f95103a.mo97627o(1.0f);
        this.f95103a.mo97629q(1.0f);
        this.f95103a.mo97618b(0.0f);
        this.f95104b.mo97629q(0.3f);
        this.f95104b.mo97625j(0.9f);
        this.f95104b.mo97627o(0.9f);
        this.f95104b.mo97618b(this.f95106d);
        this.f95105c.mo97629q(0.0f);
    }

    /* renamed from: d */
    public final void m100350d(LyricRender lyricRender) {
        ValueAnimator valueAnimator;
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        long m45708e = lyricRender.m45708e();
        Object tag = this.f95104b.getTag();
        if ((tag instanceof Long) && m45708e == ((Number) tag).longValue()) {
            m100345e(lyricRender);
            return;
        }
        long m45708e2 = lyricRender.m45708e();
        Object tag2 = this.f95103a.getTag();
        if ((tag2 instanceof Long) && m45708e2 == ((Number) tag2).longValue()) {
            long m45710g = lyricRender.m45710g();
            Object tag3 = this.f95104b.getTag();
            if ((tag3 instanceof Long) && m45710g == ((Number) tag3).longValue() && (valueAnimator = this.f95107e) != null && valueAnimator.isRunning()) {
                return;
            }
        }
        m100353k(lyricRender);
    }

    /* renamed from: i */
    public final InterfaceC19110g m100351i() {
        return this.f95105c;
    }

    /* renamed from: j */
    public final InterfaceC19110g m100352j() {
        return this.f95104b;
    }

    /* renamed from: k */
    public final void m100353k(LyricRender lyricRender) {
        AbstractC19074t.m100208f(lyricRender, "lyricRender");
        ValueAnimator valueAnimator = this.f95107e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f95109g;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.f95108f;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        this.f95103a.mo97624i(lyricRender.m45707d());
        this.f95103a.setTag(Long.valueOf(lyricRender.m45708e()));
        this.f95104b.mo97624i(lyricRender.m45709f());
        this.f95104b.setTag(Long.valueOf(lyricRender.m45710g()));
        this.f95105c.mo97624i(lyricRender.m45709f());
        m100349l();
    }
}
