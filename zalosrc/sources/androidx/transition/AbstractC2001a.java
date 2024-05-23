package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.transition.a */
/* loaded from: classes2.dex */
abstract class AbstractC2001a {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m10961a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m10962b(Animator animator) {
        animator.pause();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m10963c(Animator animator) {
        animator.resume();
    }
}
