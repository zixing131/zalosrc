package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;
import pm0.AbstractC24856m;
import pm0.InterfaceC24854k;

/* loaded from: classes6.dex */
public final class ClippedFrameLayout extends FrameLayout {

    /* renamed from: p */
    private int f69074p;

    /* renamed from: q */
    private int f69075q;

    /* renamed from: r */
    private int f69076r;

    /* renamed from: s */
    private final InterfaceC24854k f69077s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC24854k m129210a;
        AbstractC19074t.m100208f(context, "context");
        AbstractC19074t.m100208f(attributeSet, "attrs");
        this.f69076r = -1;
        m129210a = AbstractC24856m.m129210a(new C13776s(this));
        this.f69077s = m129210a;
    }

    /* renamed from: c */
    private final void m75639c(int i11, int i12, long j11, Animator.AnimatorListener animatorListener) {
        Animation animation = getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        ValueAnimator mAnimator = getMAnimator();
        mAnimator.setDuration(j11);
        mAnimator.setIntValues(i11, i12);
        mAnimator.removeAllListeners();
        mAnimator.addListener(animatorListener);
        mAnimator.start();
    }

    private final ValueAnimator getMAnimator() {
        return (ValueAnimator) this.f69077s.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentWidth(int i11) {
        this.f69075q = i11;
        getLayoutParams().width = this.f69075q;
        requestLayout();
    }

    /* renamed from: b */
    public final void m75640b() {
        if (getMAnimator().isRunning()) {
            getMAnimator().end();
        }
        setCurrentWidth(this.f69074p);
    }

    /* renamed from: d */
    public final void m75641d(Animator.AnimatorListener animatorListener) {
        AbstractC19074t.m100208f(animatorListener, "listener");
        m75639c(this.f69074p, this.f69076r, 1000L, animatorListener);
    }

    /* renamed from: e */
    public final void m75642e(Animator.AnimatorListener animatorListener) {
        AbstractC19074t.m100208f(animatorListener, "listener");
        m75639c(this.f69076r, this.f69074p, 1000L, animatorListener);
    }

    public final void setClippedWidth(int i11) {
        this.f69074p = i11;
    }

    public final void setMaxWidth(int i11) {
        this.f69076r = i11;
    }
}
