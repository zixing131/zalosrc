package i40;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: i40.f */
/* loaded from: classes5.dex */
public abstract class AbstractC20276f {
    /* renamed from: a */
    public static void m105888a(View view, float f11, long j11, long j12, Animator.AnimatorListener animatorListener) {
        ObjectAnimator[] objectAnimatorArr = new ObjectAnimator[10];
        objectAnimatorArr[0] = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f, f11, 0.6f, 1.0f);
        objectAnimatorArr[1] = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.5f, f11, 0.6f, 1.0f);
        objectAnimatorArr[2] = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        objectAnimatorArr[3] = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        objectAnimatorArr[4] = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.5f, f11, 0.6f, 1.0f);
        objectAnimatorArr[5] = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.5f, f11, 0.6f, 1.0f);
        objectAnimatorArr[0].setDuration(j11);
        objectAnimatorArr[1].setDuration(j11);
        objectAnimatorArr[2].setDuration(j12);
        objectAnimatorArr[3].setDuration(j12);
        objectAnimatorArr[4].setDuration(j11);
        objectAnimatorArr[5].setDuration(j11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorArr[0]).with(objectAnimatorArr[1]);
        animatorSet.play(objectAnimatorArr[0]).before(objectAnimatorArr[2]);
        animatorSet.play(objectAnimatorArr[2]).with(objectAnimatorArr[3]);
        animatorSet.play(objectAnimatorArr[2]).before(objectAnimatorArr[4]);
        animatorSet.play(objectAnimatorArr[4]).with(objectAnimatorArr[5]);
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.start();
    }

    /* renamed from: b */
    public static void m105889b(View view, long j11) {
        ObjectAnimator[] objectAnimatorArr = {ObjectAnimator.ofFloat(view, "scaleX", 0.4f, 0.6f, 0.8f, 1.0f, 0.4f), ObjectAnimator.ofFloat(view, "scaleY", 0.4f, 0.6f, 0.8f, 1.0f, 0.4f)};
        objectAnimatorArr[0].setRepeatCount(-1);
        objectAnimatorArr[1].setRepeatCount(-1);
        objectAnimatorArr[0].setDuration(j11);
        objectAnimatorArr[1].setDuration(j11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(objectAnimatorArr[0]).with(objectAnimatorArr[1]);
        animatorSet.start();
    }

    /* renamed from: c */
    public static void m105890c(View view, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        animatorSet.play(AbstractC20271a.m105845c(view));
        animatorSet.start();
    }

    /* renamed from: d */
    public static void m105891d(View view, float f11, long j11, boolean z11) {
        try {
            m105892e(view, f11, j11, z11, null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: e */
    public static void m105892e(View view, float f11, long j11, boolean z11, Animator.AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f11);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f11);
        ofFloat.setDuration(j11);
        ofFloat2.setDuration(j11);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f);
        ofFloat3.setDuration(j11);
        ofFloat4.setDuration(j11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.play(ofFloat).before(ofFloat3);
        animatorSet.play(ofFloat3).with(ofFloat4);
        if (animatorListener != null) {
            animatorSet.addListener(animatorListener);
        }
        if (z11) {
            animatorSet.play(ofFloat3).before(AbstractC20271a.m105845c(view));
        }
        animatorSet.start();
    }
}
