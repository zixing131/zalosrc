package p167fs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import en0.InterfaceC18494a;
import fn0.AbstractC19074t;
import id0.C20516b;
import id0.C20517c;

/* renamed from: fs.a */
/* loaded from: classes4.dex */
public final class C19136a {

    /* renamed from: a */
    public static final C19136a f95164a = new C19136a();

    /* renamed from: fs.a$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f95165p;

        /* renamed from: q */
        final /* synthetic */ InterfaceC18494a f95166q;

        a(View view, InterfaceC18494a interfaceC18494a) {
            this.f95165p = view;
            this.f95166q = interfaceC18494a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationCancel(animator);
            this.f95165p.setScaleX(1.0f);
            this.f95165p.setScaleY(1.0f);
            InterfaceC18494a interfaceC18494a = this.f95166q;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            this.f95165p.setScaleX(1.0f);
            this.f95165p.setScaleY(1.0f);
            InterfaceC18494a interfaceC18494a = this.f95166q;
            if (interfaceC18494a != null) {
                interfaceC18494a.mo12V4();
            }
        }
    }

    private C19136a() {
    }

    /* renamed from: d */
    public static /* synthetic */ void m100435d(C19136a c19136a, View view, float f11, InterfaceC18494a interfaceC18494a, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f11 = 0.9f;
        }
        if ((i11 & 4) != 0) {
            interfaceC18494a = null;
        }
        c19136a.m100438c(view, f11, interfaceC18494a);
    }

    /* renamed from: a */
    public final C20517c m100436a() {
        C20517c m106598o = new C20517c().m106598o(new C20516b().m106588d(1.0f).m106595l(0.9f).m106589e(1.0f).m106596m(0.9f).m106593j(150L)).m106598o(new C20516b().m106588d(0.9f).m106595l(1.0f).m106589e(0.9f).m106596m(1.0f).m106593j(150L));
        AbstractC19074t.m100207e(m106598o, "addAnim(...)");
        return m106598o;
    }

    /* renamed from: b */
    public final void m100437b(View view) {
        AbstractC19074t.m100208f(view, "viewToScale");
        m100435d(this, view, 0.0f, null, 6, null);
    }

    /* renamed from: c */
    public final void m100438c(View view, float f11, InterfaceC18494a interfaceC18494a) {
        AbstractC19074t.m100208f(view, "viewToScale");
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, f11);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, f11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(100L);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "scaleX", f11, 1.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "scaleY", f11, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setDuration(100L);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.addListener(new a(view, interfaceC18494a));
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }
}
