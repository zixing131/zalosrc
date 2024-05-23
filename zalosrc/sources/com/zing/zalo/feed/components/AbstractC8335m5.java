package com.zing.zalo.feed.components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import fn0.AbstractC19074t;

/* renamed from: com.zing.zalo.feed.components.m5 */
/* loaded from: classes4.dex */
public abstract class AbstractC8335m5 {

    /* renamed from: com.zing.zalo.feed.components.m5$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f45519p;

        /* renamed from: q */
        final /* synthetic */ Animator.AnimatorListener f45520q;

        a(View view, Animator.AnimatorListener animatorListener) {
            this.f45519p = view;
            this.f45520q = animatorListener;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            Animator.AnimatorListener animatorListener = this.f45520q;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            Animator.AnimatorListener animatorListener = this.f45520q;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            this.f45519p.setVisibility(0);
            this.f45519p.setAlpha(0.0f);
            Animator.AnimatorListener animatorListener = this.f45520q;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: com.zing.zalo.feed.components.m5$b */
    /* loaded from: classes4.dex */
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f45521p;

        b(View view) {
            this.f45521p = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            this.f45521p.setVisibility(8);
        }
    }

    /* renamed from: a */
    public static final void m44782a(View view, Animator.AnimatorListener animatorListener) {
        AbstractC19074t.m100208f(view, "<this>");
        view.animate().cancel();
        if (view.getVisibility() == 0) {
            return;
        }
        view.animate().alpha(1.0f).setDuration(300L).setListener(new a(view, animatorListener)).start();
    }

    /* renamed from: b */
    public static /* synthetic */ void m44783b(View view, Animator.AnimatorListener animatorListener, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            animatorListener = null;
        }
        m44782a(view, animatorListener);
    }

    /* renamed from: c */
    public static final void m44784c(View view) {
        AbstractC19074t.m100208f(view, "<this>");
        view.animate().cancel();
        if (view.getVisibility() == 8) {
            return;
        }
        view.setAlpha(1.0f);
        view.animate().alpha(0.0f).setDuration(300L).setListener(new b(view)).start();
    }
}
