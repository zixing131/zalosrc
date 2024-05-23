package com.zing.zalo.p077ui.zviews;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import com.zing.zalo.p077ui.widget.BottomSheetLayout;
import com.zing.zalo.zview.C17487o0;
import p500s1.C26086a;
import p500s1.C26088c;

/* loaded from: classes6.dex */
public abstract class BottomSheetZaloViewWithAnim extends BottomSheetZaloView {

    /* renamed from: P0 */
    protected InterfaceC14117c f72458P0;

    /* renamed from: Q0 */
    private boolean f72459Q0 = false;

    /* renamed from: R0 */
    protected int f72460R0 = 250;

    /* renamed from: S0 */
    protected int f72461S0 = 250;

    /* renamed from: T0 */
    private AnimatorSet f72462T0;

    /* renamed from: U0 */
    protected AnimatorSet f72463U0;

    /* renamed from: V0 */
    AnimatorSet f72464V0;

    /* renamed from: com.zing.zalo.ui.zviews.BottomSheetZaloViewWithAnim$a */
    /* loaded from: classes6.dex */
    class C14115a extends AnimatorListenerAdapter {
        C14115a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            BottomSheetZaloViewWithAnim.this.f72454M0.f68975L = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            BottomSheetLayout bottomSheetLayout = BottomSheetZaloViewWithAnim.this.f72454M0;
            bottomSheetLayout.f68975L = false;
            bottomSheetLayout.setViewTranslationY(bottomSheetLayout.getTranslationY());
            InterfaceC14117c interfaceC14117c = BottomSheetZaloViewWithAnim.this.f72458P0;
            if (interfaceC14117c != null) {
                interfaceC14117c.mo78543a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            BottomSheetZaloViewWithAnim.this.f72454M0.f68975L = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.BottomSheetZaloViewWithAnim$b */
    /* loaded from: classes6.dex */
    public class C14116b extends AnimatorListenerAdapter {
        C14116b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            InterfaceC14117c interfaceC14117c = BottomSheetZaloViewWithAnim.this.f72458P0;
            if (interfaceC14117c != null) {
                interfaceC14117c.mo78544b();
            }
            BottomSheetZaloViewWithAnim.this.f72454M0.f68975L = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            InterfaceC14117c interfaceC14117c = BottomSheetZaloViewWithAnim.this.f72458P0;
            if (interfaceC14117c != null) {
                interfaceC14117c.mo78544b();
            }
            BottomSheetZaloViewWithAnim.this.f72454M0.f68975L = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            BottomSheetZaloViewWithAnim.this.f72454M0.f68975L = true;
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.BottomSheetZaloViewWithAnim$c */
    /* loaded from: classes6.dex */
    public interface InterfaceC14117c {
        /* renamed from: a */
        void mo78543a();

        /* renamed from: b */
        void mo78544b();

        /* renamed from: c */
        C17487o0 mo78545c();
    }

    public void close() {
        AnimatorSet animatorSet = this.f72463U0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.f72462T0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        if (bottomSheetLayout != null) {
            bottomSheetLayout.m75555j();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f72464V0 = animatorSet3;
        animatorSet3.playTogether(ObjectAnimator.ofFloat(this.f72454M0, "translationY", mo37127dM()));
        this.f72464V0.setDuration(this.f72461S0);
        this.f72464V0.setInterpolator(new C26086a());
        this.f72464V0.addListener(new C14116b());
        this.f72464V0.start();
    }

    /* renamed from: iM */
    public void m78539iM(boolean z11) {
        this.f72459Q0 = z11;
    }

    /* renamed from: jM */
    public void m78540jM(int i11) {
        this.f72456O0.setVisibility(i11);
    }

    /* renamed from: kM */
    public void m78541kM(InterfaceC14117c interfaceC14117c) {
        this.f72458P0 = interfaceC14117c;
    }

    /* renamed from: lM */
    public void m78542lM() {
        float minTranslationY;
        this.f72454M0.setViewTranslationY(mo37127dM());
        AnimatorSet animatorSet = new AnimatorSet();
        this.f72463U0 = animatorSet;
        BottomSheetLayout bottomSheetLayout = this.f72454M0;
        float[] fArr = new float[1];
        if (bottomSheetLayout.m75553g()) {
            minTranslationY = mo37128eM();
        } else {
            minTranslationY = this.f72454M0.getMinTranslationY();
        }
        fArr[0] = minTranslationY;
        animatorSet.play(ObjectAnimator.ofFloat(bottomSheetLayout, "translationY", fArr));
        this.f72463U0.setDuration(this.f72460R0);
        this.f72463U0.setInterpolator(new C26088c());
        this.f72463U0.addListener(new C14115a());
        this.f72463U0.start();
    }

    @Override // com.zing.zalo.p077ui.zviews.BottomSheetZaloView, com.zing.zalo.p077ui.widget.BottomSheetLayout.InterfaceC13470b
    /* renamed from: x3 */
    public void mo72543x3() {
        if (this.f72459Q0) {
            close();
        }
    }
}
