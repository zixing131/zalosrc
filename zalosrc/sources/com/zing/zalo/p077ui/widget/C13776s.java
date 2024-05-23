package com.zing.zalo.p077ui.widget;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import fn0.AbstractC19075u;

/* renamed from: com.zing.zalo.ui.widget.s */
/* loaded from: classes6.dex */
final class C13776s extends AbstractC19075u implements InterfaceC18494a {

    /* renamed from: q */
    final /* synthetic */ ClippedFrameLayout f71302q;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13776s(ClippedFrameLayout clippedFrameLayout) {
        super(0);
        this.f71302q = clippedFrameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m76957c(ClippedFrameLayout clippedFrameLayout, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(clippedFrameLayout, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "animation");
        Object animatedValue = valueAnimator.getAnimatedValue();
        AbstractC19074t.m100206d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        clippedFrameLayout.setCurrentWidth(((Integer) animatedValue).intValue());
    }

    @Override // en0.InterfaceC18494a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ValueAnimator mo12V4() {
        ValueAnimator valueAnimator = new ValueAnimator();
        final ClippedFrameLayout clippedFrameLayout = this.f71302q;
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.zing.zalo.ui.widget.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                C13776s.m76957c(ClippedFrameLayout.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }
}
