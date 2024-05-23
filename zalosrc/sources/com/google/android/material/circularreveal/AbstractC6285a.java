package com.google.android.material.circularreveal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import com.google.android.material.circularreveal.InterfaceC6287c;

/* renamed from: com.google.android.material.circularreveal.a */
/* loaded from: classes3.dex */
public abstract class AbstractC6285a {

    /* renamed from: com.google.android.material.circularreveal.a$a */
    /* loaded from: classes3.dex */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC6287c f35220p;

        a(InterfaceC6287c interfaceC6287c) {
            this.f35220p = interfaceC6287c;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f35220p.mo32221b();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f35220p.mo32220a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static Animator m32224a(InterfaceC6287c interfaceC6287c, float f11, float f12, float f13) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(interfaceC6287c, (Property<InterfaceC6287c, V>) InterfaceC6287c.c.f35233a, InterfaceC6287c.b.f35231b, new InterfaceC6287c.e(f11, f12, f13));
        InterfaceC6287c.e revealInfo = interfaceC6287c.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) interfaceC6287c, (int) f11, (int) f12, revealInfo.f35237c, f13);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(ofObject, createCircularReveal);
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }

    /* renamed from: b */
    public static Animator.AnimatorListener m32225b(InterfaceC6287c interfaceC6287c) {
        return new a(interfaceC6287c);
    }
}
