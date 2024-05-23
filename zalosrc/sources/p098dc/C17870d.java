package p098dc;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import ho0.AbstractC20110a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p454qn.AbstractC25385b;
import p500s1.C26088c;
import qm0.AbstractC25358n;

/* renamed from: dc.d */
/* loaded from: classes3.dex */
public final class C17870d {
    public static final a Companion = new a(null);

    /* renamed from: dc.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: dc.d$b */
    /* loaded from: classes3.dex */
    public static final class b extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ View[] f90315p;

        /* renamed from: q */
        final /* synthetic */ int f90316q;

        b(View[] viewArr, int i11) {
            this.f90315p = viewArr;
            this.f90316q = i11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            List m131353A;
            AbstractC19074t.m100208f(animator, "animation");
            m131353A = AbstractC25358n.m131353A(this.f90315p);
            int i11 = this.f90316q;
            Iterator it = m131353A.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setVisibility(i11);
            }
        }
    }

    /* renamed from: d */
    private final void m94399d(int i11, View... viewArr) {
        List<View> m131353A;
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            m131353A = AbstractC25358n.m131353A(viewArr);
            for (View view : m131353A) {
                AbstractC25385b.m131572a(view);
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 0.0f));
            }
            animatorSet.addListener(new b(viewArr, i11));
            animatorSet.setInterpolator(new C26088c());
            animatorSet.setDuration(250L);
            animatorSet.start();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: a */
    public final void m94400a(View... viewArr) {
        AbstractC19074t.m100208f(viewArr, "views");
        try {
            AnimatorSet animatorSet = new AnimatorSet();
            for (View view : viewArr) {
                AbstractC25385b.m131572a(view);
                view.setVisibility(0);
                view.setAlpha(0.0f);
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f));
            }
            animatorSet.setInterpolator(new C26088c());
            animatorSet.setDuration(250L);
            animatorSet.start();
        } catch (Exception e11) {
            AbstractC20110a.f98889a.mo104552e(e11);
        }
    }

    /* renamed from: b */
    public final void m94401b(View... viewArr) {
        AbstractC19074t.m100208f(viewArr, "views");
        m94399d(8, (View[]) Arrays.copyOf(viewArr, viewArr.length));
    }

    /* renamed from: c */
    public final void m94402c(View... viewArr) {
        AbstractC19074t.m100208f(viewArr, "views");
        m94399d(4, (View[]) Arrays.copyOf(viewArr, viewArr.length));
    }
}
