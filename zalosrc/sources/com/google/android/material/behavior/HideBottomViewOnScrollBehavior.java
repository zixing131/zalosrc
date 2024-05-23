package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p382o6.AbstractC24041a;

/* loaded from: classes3.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private int f34873a;

    /* renamed from: b */
    private int f34874b;

    /* renamed from: c */
    private int f34875c;

    /* renamed from: d */
    private ViewPropertyAnimator f34876d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.behavior.HideBottomViewOnScrollBehavior$a */
    /* loaded from: classes3.dex */
    public class C6237a extends AnimatorListenerAdapter {
        C6237a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f34876d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f34873a = 0;
        this.f34874b = 2;
        this.f34875c = 0;
    }

    /* renamed from: F */
    private void m31723F(View view, int i11, long j11, TimeInterpolator timeInterpolator) {
        this.f34876d = view.animate().translationY(i11).setInterpolator(timeInterpolator).setDuration(j11).setListener(new C6237a());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: A */
    public boolean mo6539A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i11, int i12) {
        return i11 == 2;
    }

    /* renamed from: G */
    public void m31724G(View view, int i11) {
        this.f34875c = i11;
        if (this.f34874b == 1) {
            view.setTranslationY(this.f34873a + i11);
        }
    }

    /* renamed from: H */
    public void m31725H(View view) {
        if (this.f34874b == 1) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34876d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f34874b = 1;
        m31723F(view, this.f34873a + this.f34875c, 175L, AbstractC24041a.f116360c);
    }

    /* renamed from: I */
    public void m31726I(View view) {
        if (this.f34874b == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f34876d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        this.f34874b = 2;
        m31723F(view, 0, 225L, AbstractC24041a.f116361d);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        this.f34873a = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        return super.mo6554l(coordinatorLayout, view, i11);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: t */
    public void mo6562t(CoordinatorLayout coordinatorLayout, View view, View view2, int i11, int i12, int i13, int i14, int i15, int[] iArr) {
        if (i12 > 0) {
            m31725H(view);
        } else if (i12 < 0) {
            m31726I(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34873a = 0;
        this.f34874b = 2;
        this.f34875c = 0;
    }
}
