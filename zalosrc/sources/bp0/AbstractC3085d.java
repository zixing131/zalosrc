package bp0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import p500s1.C26088c;

/* renamed from: bp0.d */
/* loaded from: classes7.dex */
public abstract class AbstractC3085d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$a */
    /* loaded from: classes7.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ m f13126p;

        a(m mVar) {
            this.f13126p = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13126p;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m mVar = this.f13126p;
            if (mVar != null) {
                mVar.mo15465a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13126p;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$b */
    /* loaded from: classes7.dex */
    public class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ m f13127p;

        b(m mVar) {
            this.f13127p = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13127p;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m mVar = this.f13127p;
            if (mVar != null) {
                mVar.mo15465a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13127p;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$c */
    /* loaded from: classes7.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ m f13128p;

        c(m mVar) {
            this.f13128p = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13128p;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m mVar = this.f13128p;
            if (mVar != null) {
                mVar.mo15465a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13128p;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$d */
    /* loaded from: classes7.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13129p;

        /* renamed from: q */
        final /* synthetic */ m f13130q;

        d(View view, m mVar) {
            this.f13129p = view;
            this.f13130q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13130q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13129p, this.f13130q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13130q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$e */
    /* loaded from: classes7.dex */
    public class e extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13131p;

        /* renamed from: q */
        final /* synthetic */ m f13132q;

        e(View view, m mVar) {
            this.f13131p = view;
            this.f13132q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13132q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13131p, this.f13132q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13132q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$f */
    /* loaded from: classes7.dex */
    public class f extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13133p;

        /* renamed from: q */
        final /* synthetic */ m f13134q;

        f(View view, m mVar) {
            this.f13133p = view;
            this.f13134q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13134q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13133p, this.f13134q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13134q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$g */
    /* loaded from: classes7.dex */
    public class g extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13135p;

        /* renamed from: q */
        final /* synthetic */ m f13136q;

        g(View view, m mVar) {
            this.f13135p = view;
            this.f13136q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13136q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13135p, this.f13136q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13136q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$h */
    /* loaded from: classes7.dex */
    public class h extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13137p;

        /* renamed from: q */
        final /* synthetic */ m f13138q;

        h(View view, m mVar) {
            this.f13137p = view;
            this.f13138q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13138q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13137p, this.f13138q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13138q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$i */
    /* loaded from: classes7.dex */
    public class i extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13139p;

        /* renamed from: q */
        final /* synthetic */ m f13140q;

        i(View view, m mVar) {
            this.f13139p = view;
            this.f13140q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13140q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13139p, this.f13140q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13140q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$j */
    /* loaded from: classes7.dex */
    public class j extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13141p;

        /* renamed from: q */
        final /* synthetic */ m f13142q;

        j(View view, m mVar) {
            this.f13141p = view;
            this.f13142q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13142q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13141p, this.f13142q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13142q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$k */
    /* loaded from: classes7.dex */
    public class k extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View f13143p;

        /* renamed from: q */
        final /* synthetic */ m f13144q;

        k(View view, m mVar) {
            this.f13143p = view;
            this.f13144q = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13144q;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC3085d.m15456r(this.f13143p, this.f13144q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13144q;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bp0.d$l */
    /* loaded from: classes7.dex */
    public class l extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ m f13145p;

        l(m mVar) {
            this.f13145p = mVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m mVar = this.f13145p;
            if (mVar != null) {
                mVar.mo15467c();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m mVar = this.f13145p;
            if (mVar != null) {
                mVar.mo15465a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m mVar = this.f13145p;
            if (mVar != null) {
                mVar.mo15466b();
            }
        }
    }

    /* renamed from: bp0.d$m */
    /* loaded from: classes7.dex */
    public interface m {
        /* renamed from: a */
        void mo15465a();

        /* renamed from: b */
        void mo15466b();

        /* renamed from: c */
        void mo15467c();
    }

    /* renamed from: d */
    public static void m15442d(View view, boolean z11) {
        m15445g(view, z11, null);
    }

    /* renamed from: e */
    public static void m15443e(View view, boolean z11, long j11) {
        m15444f(view, z11, j11, null);
    }

    /* renamed from: f */
    public static void m15444f(View view, boolean z11, long j11, m mVar) {
        m15455q(view, 1, z11, 0.0f, 0.0f, 1.0f, 1.0f, j11, mVar);
    }

    /* renamed from: g */
    public static void m15445g(View view, boolean z11, m mVar) {
        m15444f(view, z11, 300L, mVar);
    }

    /* renamed from: h */
    public static void m15446h(View view, boolean z11, float f11, float f12) {
        m15448j(view, z11, f11, f12, 300L, null);
    }

    /* renamed from: i */
    public static void m15447i(View view, boolean z11, float f11, float f12, long j11) {
        m15448j(view, z11, f11, f12, j11, null);
    }

    /* renamed from: j */
    public static void m15448j(View view, boolean z11, float f11, float f12, long j11, m mVar) {
        m15455q(view, 3, z11, f11, f12, 1.0f, 1.0f, j11, mVar);
    }

    /* renamed from: k */
    public static void m15449k(View view, boolean z11, float f11, float f12, m mVar) {
        m15448j(view, z11, f11, f12, 300L, mVar);
    }

    /* renamed from: l */
    public static void m15450l(View view, boolean z11, float f11, long j11) {
        m15455q(view, 7, z11, -1.0f, f11, 1.0f, 1.0f, j11, null);
    }

    /* renamed from: m */
    public static void m15451m(View view, float f11, float f12, long j11, m mVar) {
        m15455q(view, 2, true, f11, f12, 1.0f, 1.0f, j11, mVar);
    }

    /* renamed from: n */
    public static void m15452n(View view, float f11, float f12, float f13, float f14, long j11, m mVar) {
        m15455q(view, 6, true, f11, f12, f13, f14, j11, mVar);
    }

    /* renamed from: o */
    public static void m15453o(View view, float f11, float f12, float f13, float f14, m mVar) {
        m15452n(view, f11, f12, f13, f14, 300L, mVar);
    }

    /* renamed from: p */
    public static void m15454p(View view, float f11, long j11) {
        m15451m(view, -1.0f, f11, j11, null);
    }

    /* renamed from: q */
    private static void m15455q(View view, int i11, boolean z11, float f11, float f12, float f13, float f14, long j11, m mVar) {
        if (view == null) {
            return;
        }
        view.animate().setListener(null).cancel();
        if (i11 == 1) {
            if (view.getVisibility() == 0 && z11 && view.getAlpha() == 1.0f) {
                view.setVisibility(0);
                view.setAlpha(1.0f);
                if (mVar != null) {
                    mVar.mo15465a();
                    return;
                }
                return;
            }
            if ((view.getVisibility() == 8 || view.getVisibility() == 4) && !z11 && view.getAlpha() == 0.0f) {
                view.setVisibility(8);
                view.setAlpha(0.0f);
                if (mVar != null) {
                    mVar.mo15465a();
                    return;
                }
                return;
            }
            if ((view.getVisibility() == 8 || view.getVisibility() == 4) && i11 == 1) {
                view.setAlpha(0.0f);
            }
            view.setVisibility(0);
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        if (i11 != 6) {
                            if (i11 == 7) {
                                m15462x(view, z11, f12, j11, mVar);
                                return;
                            }
                            return;
                        }
                        m15464z(view, f11, f12, f13, f14, j11, mVar);
                        return;
                    }
                    m15460v(view, z11, f13, f14, j11, mVar);
                    return;
                }
                m15461w(view, z11, f11, f12, j11, mVar);
                return;
            }
            m15463y(view, f11, f12, j11, mVar);
            return;
        }
        m15459u(view, z11, j11, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static void m15456r(View view, m mVar) {
        if (view != null) {
            if (view.getAlpha() == 1.0f) {
                view.setVisibility(0);
            } else if (view.getAlpha() == 0.0f) {
                view.setVisibility(8);
            }
        }
        if (mVar != null) {
            mVar.mo15465a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static /* synthetic */ void m15457s(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.setPivotX(floatValue);
        view.setPivotY((1.0f - floatValue) * view.getMeasuredHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m15458t(View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        view.setPivotX(floatValue);
        view.setPivotY(floatValue * view.getMeasuredHeight());
    }

    /* renamed from: u */
    private static void m15459u(View view, boolean z11, long j11, m mVar) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.animate().setInterpolator(new AccelerateInterpolator()).alpha(1.0f).setDuration(Math.max((1.0f - view.getAlpha()) * ((float) j11), 0L)).setListener(new d(view, mVar)).start();
        } else {
            view.animate().setInterpolator(new AccelerateInterpolator()).alpha(0.0f).setDuration(Math.max(view.getAlpha() * ((float) j11), 0L)).setListener(new e(view, mVar)).start();
        }
    }

    /* renamed from: v */
    private static void m15460v(final View view, boolean z11, float f11, float f12, long j11, m mVar) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.animate().setInterpolator(new AccelerateInterpolator()).alpha(1.0f).scaleX(f11).scaleY(f12).setDuration(Math.max((1.0f - view.getAlpha()) * ((float) j11), 0L)).setListener(new f(view, mVar)).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bp0.b
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC3085d.m15457s(view, valueAnimator);
                }
            }).start();
        } else {
            view.animate().setInterpolator(new DecelerateInterpolator()).alpha(0.0f).scaleX(f11).scaleY(f12).setDuration(Math.max(view.getAlpha() * ((float) j11), 0L)).setListener(new g(view, mVar)).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bp0.c
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    AbstractC3085d.m15458t(view, valueAnimator);
                }
            }).start();
        }
    }

    /* renamed from: w */
    private static void m15461w(View view, boolean z11, float f11, float f12, long j11, m mVar) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.animate().setInterpolator(new C26088c()).alpha(1.0f).translationX(f11).translationY(f12).setDuration(j11).setListener(new h(view, mVar)).start();
        } else {
            view.animate().setInterpolator(new C26088c()).alpha(0.0f).translationX(f11).translationY(f12).setDuration(j11).setListener(new i(view, mVar)).start();
        }
    }

    /* renamed from: x */
    private static void m15462x(View view, boolean z11, float f11, long j11, m mVar) {
        if (view == null) {
            return;
        }
        if (z11) {
            view.animate().setInterpolator(new C26088c()).alpha(1.0f).translationY(f11).setDuration(j11).setListener(new j(view, mVar)).start();
        } else {
            view.animate().setInterpolator(new C26088c()).alpha(0.0f).translationY(f11).setDuration(j11).setListener(new k(view, mVar)).start();
        }
    }

    /* renamed from: y */
    private static void m15463y(View view, float f11, float f12, long j11, m mVar) {
        if (view == null) {
            return;
        }
        view.animate().setListener(null).cancel();
        view.setVisibility(0);
        if (f11 == -1.0f) {
            view.animate().setInterpolator(new C26088c()).translationY(f12).setDuration(j11).setListener(new a(mVar)).start();
        } else if (f12 == -1.0f) {
            view.animate().setInterpolator(new C26088c()).translationX(f11).setDuration(j11).setListener(new b(mVar)).start();
        } else {
            view.animate().setInterpolator(new C26088c()).translationX(f11).translationY(f12).setDuration(j11).setListener(new c(mVar)).start();
        }
    }

    /* renamed from: z */
    private static void m15464z(View view, float f11, float f12, float f13, float f14, long j11, m mVar) {
        if (view == null) {
            return;
        }
        view.animate().setListener(null).cancel();
        view.setVisibility(0);
        view.animate().setInterpolator(new AccelerateInterpolator()).translationX(f11).translationY(f12).scaleX(f13).scaleY(f14).setDuration(j11).setListener(new l(mVar)).start();
    }
}
