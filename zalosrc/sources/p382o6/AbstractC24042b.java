package p382o6;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* renamed from: o6.b */
/* loaded from: classes3.dex */
public abstract class AbstractC24042b {
    /* renamed from: a */
    public static void m125913a(AnimatorSet animatorSet, List list) {
        int size = list.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = (Animator) list.get(i11);
            j11 = Math.max(j11, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j11);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
