package me0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.p077ui.widget.TouchInterceptionFrameLayout;
import java.util.ArrayList;

/* renamed from: me0.r9 */
/* loaded from: classes4.dex */
public abstract class AbstractC23202r9 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m119535c(View view, ValueAnimator valueAnimator) {
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ void m119536d(View view, ValueAnimator valueAnimator) {
        view.getLayoutParams().height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        view.requestLayout();
    }

    /* renamed from: e */
    public static void m119537e(TouchInterceptionFrameLayout touchInterceptionFrameLayout, View view, long j11, View view2, float f11, int i11, View view3, float f12, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (touchInterceptionFrameLayout != null) {
            arrayList.add(ObjectAnimator.ofFloat(touchInterceptionFrameLayout, "position", touchInterceptionFrameLayout.getPosition(), f11));
        }
        if (view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, "alpha", AbstractC1579n0.m7903u(view), 1.0f));
        }
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofInt(view2, "height", view2.getHeight(), i11));
        }
        if (view3 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view3, "translationY", AbstractC1579n0.m7836S(view3), f12));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new DecelerateInterpolator(2.0f));
        animatorSet.addListener(animatorListener);
        animatorSet.setDuration(j11);
        animatorSet.start();
    }

    /* renamed from: f */
    public static void m119538f(final View view, int i11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, i11);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: me0.p9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC23202r9.m119535c(view, valueAnimator);
                }
            });
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(150L);
            ofInt.addListener(animatorListener);
            ofInt.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public static void m119539g(View view, long j11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(((float) j11) * (1.0f - view.getAlpha()));
            ofFloat.setAutoCancel(true);
            if (animatorListener != null) {
                ofFloat.addListener(animatorListener);
            }
            ofFloat.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: h */
    public static void m119540h(View view, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(150L);
            if (animatorListener != null) {
                ofFloat.addListener(animatorListener);
            }
            ofFloat.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: i */
    public static void m119541i(View view, long j11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", view.getAlpha(), 0.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(((float) j11) * view.getAlpha());
            ofFloat.setAutoCancel(true);
            if (animatorListener != null) {
                ofFloat.addListener(animatorListener);
            }
            ofFloat.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: j */
    public static void m119542j(View view, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(150L);
            if (animatorListener != null) {
                ofFloat.addListener(animatorListener);
            }
            ofFloat.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: k */
    public static void m119543k(View view, int i11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(view, "height", i11, 1);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(150L);
            ofInt.addListener(animatorListener);
            ofInt.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: l */
    public static void m119544l(final View view, int i11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        try {
            ValueAnimator ofInt = ValueAnimator.ofInt(i11, 0);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: me0.q9
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC23202r9.m119536d(view, valueAnimator);
                }
            });
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.setDuration(150L);
            ofInt.addListener(animatorListener);
            ofInt.start();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: m */
    public static void m119545m(TouchInterceptionFrameLayout touchInterceptionFrameLayout, View view, float f11, int i11, View view2, float f12, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        if (touchInterceptionFrameLayout != null) {
            arrayList.add(ObjectAnimator.ofFloat(touchInterceptionFrameLayout, "position", touchInterceptionFrameLayout.getPosition(), f11));
        }
        if (view != null) {
            arrayList.add(ObjectAnimator.ofInt(view, "height", view.getHeight(), i11));
        }
        if (view2 != null) {
            arrayList.add(ObjectAnimator.ofFloat(view2, "translationY", AbstractC1579n0.m7836S(view2), f12));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setInterpolator(new DecelerateInterpolator(2.0f));
        animatorSet.addListener(animatorListener);
        animatorSet.setDuration(150L);
        animatorSet.start();
    }

    /* renamed from: n */
    public static void m119546n(View view, float f11, long j11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", AbstractC1579n0.m7836S(view), f11);
        ofFloat.addListener(animatorListener);
        ofFloat.setDuration(j11);
        ofFloat.start();
    }

    /* renamed from: o */
    public static void m119547o(View view, float f11, Animator.AnimatorListener animatorListener) {
        m119546n(view, f11, 300L, animatorListener);
    }
}
