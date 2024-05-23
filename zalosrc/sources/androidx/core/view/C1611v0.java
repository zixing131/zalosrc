package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: androidx.core.view.v0 */
/* loaded from: classes2.dex */
public final class C1611v0 {

    /* renamed from: a */
    private final WeakReference f6588a;

    /* renamed from: b */
    Runnable f6589b = null;

    /* renamed from: c */
    Runnable f6590c = null;

    /* renamed from: d */
    int f6591d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.v0$a */
    /* loaded from: classes2.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ InterfaceC1614w0 f6592p;

        /* renamed from: q */
        final /* synthetic */ View f6593q;

        a(InterfaceC1614w0 interfaceC1614w0, View view) {
            this.f6592p = interfaceC1614w0;
            this.f6593q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f6592p.mo5454a(this.f6593q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f6592p.mo4848b(this.f6593q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f6592p.mo4849c(this.f6593q);
        }
    }

    /* renamed from: androidx.core.view.v0$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static ViewPropertyAnimator m8229a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        /* renamed from: b */
        static ViewPropertyAnimator m8230b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        /* renamed from: c */
        static ViewPropertyAnimator m8231c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* renamed from: androidx.core.view.v0$c */
    /* loaded from: classes2.dex */
    static class c {
        /* renamed from: a */
        static ViewPropertyAnimator m8232a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1611v0(View view) {
        this.f6588a = new WeakReference(view);
    }

    /* renamed from: k */
    private void m8214k(View view, InterfaceC1614w0 interfaceC1614w0) {
        if (interfaceC1614w0 != null) {
            view.animate().setListener(new a(interfaceC1614w0, view));
        } else {
            view.animate().setListener(null);
        }
    }

    /* renamed from: b */
    public C1611v0 m8215b(float f11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    /* renamed from: c */
    public void m8216c() {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: d */
    public long m8217d() {
        View view = (View) this.f6588a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    /* renamed from: f */
    public C1611v0 m8218f(float f11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().scaleX(f11);
        }
        return this;
    }

    /* renamed from: g */
    public C1611v0 m8219g(float f11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().scaleY(f11);
        }
        return this;
    }

    /* renamed from: h */
    public C1611v0 m8220h(long j11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
        return this;
    }

    /* renamed from: i */
    public C1611v0 m8221i(Interpolator interpolator) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    /* renamed from: j */
    public C1611v0 m8222j(InterfaceC1614w0 interfaceC1614w0) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            m8214k(view, interfaceC1614w0);
        }
        return this;
    }

    /* renamed from: l */
    public C1611v0 m8223l(long j11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
        return this;
    }

    /* renamed from: m */
    public C1611v0 m8224m(final InterfaceC1620y0 interfaceC1620y0) {
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener;
        final View view = (View) this.f6588a.get();
        if (view != null) {
            if (interfaceC1620y0 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.u0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        InterfaceC1620y0.this.mo4953a(view);
                    }
                };
            } else {
                animatorUpdateListener = null;
            }
            c.m8232a(view.animate(), animatorUpdateListener);
        }
        return this;
    }

    /* renamed from: n */
    public void m8225n() {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    /* renamed from: o */
    public C1611v0 m8226o(float f11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().translationX(f11);
        }
        return this;
    }

    /* renamed from: p */
    public C1611v0 m8227p(float f11) {
        View view = (View) this.f6588a.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }

    /* renamed from: q */
    public C1611v0 m8228q() {
        View view = (View) this.f6588a.get();
        if (view != null) {
            b.m8230b(view.animate());
        }
        return this;
    }
}
