package me0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.zing.zalo.qrcode.util.ScanQRUIUtils;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import p500s1.C26087b;

/* renamed from: me0.o9 */
/* loaded from: classes4.dex */
public final class C23169o9 {

    /* renamed from: a */
    public static final C23169o9 f112346a = new C23169o9();

    /* renamed from: b */
    private static final DecelerateInterpolator f112347b;

    /* renamed from: c */
    private static final DecelerateInterpolator f112348c;

    /* renamed from: me0.o9$a */
    /* loaded from: classes4.dex */
    public static final class a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f112349p;

        /* renamed from: q */
        final /* synthetic */ View f112350q;

        /* renamed from: r */
        final /* synthetic */ Runnable f112351r;

        a(boolean z11, View view, Runnable runnable) {
            this.f112349p = z11;
            this.f112350q = view;
            this.f112351r = runnable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (this.f112349p) {
                this.f112350q.setLayerType(0, null);
            }
            Runnable runnable = this.f112351r;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            if (this.f112349p) {
                this.f112350q.setLayerType(2, null);
            }
        }
    }

    static {
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(1.78f);
        f112347b = decelerateInterpolator;
        f112348c = decelerateInterpolator;
    }

    private C23169o9() {
    }

    /* renamed from: b */
    public static /* synthetic */ AnimatorSet m119340b(C23169o9 c23169o9, ZaloView zaloView, boolean z11, Runnable runnable, boolean z12, long j11, int i11, Object obj) {
        boolean z13;
        long j12;
        if ((i11 & 4) != 0) {
            z13 = true;
        } else {
            z13 = z12;
        }
        if ((i11 & 8) != 0) {
            if (z11) {
                j12 = 425;
            } else {
                j12 = 400;
            }
            j11 = j12;
        }
        return c23169o9.m119342a(zaloView, z11, runnable, z13, j11);
    }

    /* renamed from: c */
    private final int m119341c(ZaloView zaloView) {
        View mo35570g0 = zaloView.m92692wK().mo35570g0();
        Integer num = null;
        if (mo35570g0 != null) {
            Integer valueOf = Integer.valueOf(mo35570g0.getHeight());
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                return valueOf.intValue();
            }
        }
        Integer valueOf2 = Integer.valueOf(zaloView.m92691vK().getHeight());
        if (valueOf2.intValue() > 0) {
            num = valueOf2;
        }
        if (num != null) {
            return num.intValue();
        }
        return AbstractC23136l9.m118716i0(zaloView.m92689tK());
    }

    /* renamed from: a */
    public final AnimatorSet m119342a(ZaloView zaloView, boolean z11, Runnable runnable, boolean z12, long j11) {
        int i11;
        int m119341c;
        boolean z13;
        AbstractC19074t.m100208f(zaloView, "<this>");
        if (z11) {
            i11 = m119341c(zaloView);
        } else {
            i11 = 0;
        }
        if (z11) {
            m119341c = 0;
        } else {
            m119341c = m119341c(zaloView);
        }
        View m92691vK = zaloView.m92691vK();
        AbstractC19074t.m100207e(m92691vK, "requireView(...)");
        if (z12 && ScanQRUIUtils.f49155a.m49639x()) {
            z13 = true;
        } else {
            z13 = false;
        }
        m92691vK.setTranslationY(i11);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(m92691vK, "translationY", m119341c));
        animatorSet.setDuration(j11);
        animatorSet.setInterpolator(new C26087b());
        animatorSet.addListener(new a(z13, m92691vK, runnable));
        return animatorSet;
    }
}
