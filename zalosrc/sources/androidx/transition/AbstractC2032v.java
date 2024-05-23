package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;
import p286k2.AbstractC21441e;

/* renamed from: androidx.transition.v */
/* loaded from: classes2.dex */
abstract class AbstractC2032v {

    /* renamed from: androidx.transition.v$a */
    /* loaded from: classes2.dex */
    private static class a extends AnimatorListenerAdapter implements Transition.InterfaceC1995f {

        /* renamed from: p */
        private final View f8622p;

        /* renamed from: q */
        private final View f8623q;

        /* renamed from: r */
        private final int f8624r;

        /* renamed from: s */
        private final int f8625s;

        /* renamed from: t */
        private int[] f8626t;

        /* renamed from: u */
        private float f8627u;

        /* renamed from: v */
        private float f8628v;

        /* renamed from: w */
        private final float f8629w;

        /* renamed from: x */
        private final float f8630x;

        a(View view, View view2, int i11, int i12, float f11, float f12) {
            this.f8623q = view;
            this.f8622p = view2;
            this.f8624r = i11 - Math.round(view.getTranslationX());
            this.f8625s = i12 - Math.round(view.getTranslationY());
            this.f8629w = f11;
            this.f8630x = f12;
            int[] iArr = (int[]) view2.getTag(AbstractC21441e.transition_position);
            this.f8626t = iArr;
            if (iArr != null) {
                view2.setTag(AbstractC21441e.transition_position, null);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: a */
        public void mo10834a(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: b */
        public void mo10939b(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: c */
        public void mo10835c(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: d */
        public void mo10836d(Transition transition) {
            this.f8623q.setTranslationX(this.f8629w);
            this.f8623q.setTranslationY(this.f8630x);
            transition.mo10910b0(this);
        }

        @Override // androidx.transition.Transition.InterfaceC1995f
        /* renamed from: e */
        public void mo10837e(Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f8626t == null) {
                this.f8626t = new int[2];
            }
            this.f8626t[0] = Math.round(this.f8624r + this.f8623q.getTranslationX());
            this.f8626t[1] = Math.round(this.f8625s + this.f8623q.getTranslationY());
            this.f8622p.setTag(AbstractC21441e.transition_position, this.f8626t);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f8627u = this.f8623q.getTranslationX();
            this.f8628v = this.f8623q.getTranslationY();
            this.f8623q.setTranslationX(this.f8629w);
            this.f8623q.setTranslationY(this.f8630x);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f8623q.setTranslationX(this.f8627u);
            this.f8623q.setTranslationY(this.f8628v);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Animator m11033a(View view, C2030t c2030t, int i11, int i12, float f11, float f12, float f13, float f14, TimeInterpolator timeInterpolator, Transition transition) {
        float f15;
        float f16;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c2030t.f8616b.getTag(AbstractC21441e.transition_position)) != null) {
            f15 = (r4[0] - i11) + translationX;
            f16 = (r4[1] - i12) + translationY;
        } else {
            f15 = f11;
            f16 = f12;
        }
        int round = i11 + Math.round(f15 - translationX);
        int round2 = i12 + Math.round(f16 - translationY);
        view.setTranslationX(f15);
        view.setTranslationY(f16);
        if (f15 == f13 && f16 == f14) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f15, f13), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f16, f14));
        a aVar = new a(view, c2030t.f8616b, round, round2, translationX, translationY);
        transition.mo10907a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        AbstractC2001a.m10961a(ofPropertyValuesHolder, aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
