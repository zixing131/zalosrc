package zl0;

import android.animation.Animator;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.activity.ZaloActivity;

/* renamed from: zl0.l */
/* loaded from: classes.dex */
public abstract class AbstractC32235l {

    /* renamed from: a */
    static long f148652a;

    /* renamed from: b */
    static float f148653b;

    /* renamed from: c */
    static boolean f148654c;

    /* renamed from: d */
    static Runnable f148655d;

    /* renamed from: e */
    static Runnable f148656e;

    /* renamed from: f */
    static Handler f148657f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    static DecelerateInterpolator f148658g = new DecelerateInterpolator(1.0f);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zl0.l$a */
    /* loaded from: classes7.dex */
    public class a implements Runnable {

        /* renamed from: p */
        final /* synthetic */ View f148659p;

        /* renamed from: q */
        final /* synthetic */ int f148660q;

        /* renamed from: r */
        final /* synthetic */ boolean f148661r;

        /* renamed from: s */
        final /* synthetic */ Animator.AnimatorListener f148662s;

        a(View view, int i11, boolean z11, Animator.AnimatorListener animatorListener) {
            this.f148659p = view;
            this.f148660q = i11;
            this.f148661r = z11;
            this.f148662s = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC32235l.f148656e = null;
            AbstractC32227d.m155417a("AspectZAM", "applyAnimationInternal END, topView= " + this.f148659p + ", animation= " + this.f148660q + ", isOpening= " + this.f148661r);
            Animator.AnimatorListener animatorListener = this.f148662s;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: zl0.l$b */
    /* loaded from: classes7.dex */
    public class b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ int f148663p;

        /* renamed from: q */
        final /* synthetic */ boolean f148664q;

        /* renamed from: r */
        final /* synthetic */ View f148665r;

        /* renamed from: s */
        final /* synthetic */ View f148666s;

        /* renamed from: t */
        final /* synthetic */ Animator.AnimatorListener f148667t;

        b(int i11, boolean z11, View view, View view2, Animator.AnimatorListener animatorListener) {
            this.f148663p = i11;
            this.f148664q = z11;
            this.f148665r = view;
            this.f148666s = view2;
            this.f148667t = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC32235l.f148655d != this) {
                AbstractC32227d.m155417a("AspectZAM", "applyAnimationInternal Invalid runnable return. mAnimRunnable= " + AbstractC32235l.f148655d + ", this= " + this);
                return;
            }
            AbstractC32235l.f148655d = null;
            long nanoTime = System.nanoTime() / 1000000;
            long j11 = nanoTime - AbstractC32235l.f148652a;
            if (j11 > 18) {
                j11 = 18;
            }
            AbstractC32235l.f148652a = nanoTime;
            float f11 = AbstractC32235l.f148653b + (((float) j11) / 200.0f);
            AbstractC32235l.f148653b = f11;
            if (f11 > 1.0f) {
                AbstractC32235l.f148653b = 1.0f;
            }
            AbstractC32232i.m155453a(48.0f);
            float interpolation = AbstractC32235l.f148658g.getInterpolation(AbstractC32235l.f148653b);
            int i11 = this.f148663p;
            if (i11 == 1) {
                if (this.f148664q) {
                    AbstractC1579n0.m7805C0(this.f148665r, interpolation);
                } else {
                    AbstractC1579n0.m7805C0(this.f148665r, 1.0f - interpolation);
                }
            } else if (i11 == 2 || i11 == 3) {
                if (this.f148664q) {
                    AbstractC1579n0.m7805C0(this.f148665r, interpolation);
                } else {
                    AbstractC1579n0.m7805C0(this.f148665r, 1.0f - interpolation);
                }
            }
            if (AbstractC32235l.f148653b < 1.0f) {
                if (AbstractC32235l.f148654c) {
                    AbstractC32235l.m155470a(this.f148665r, this.f148666s, this.f148663p, this.f148667t, this.f148664q, false);
                    return;
                }
                return;
            }
            AbstractC32235l.f148654c = false;
            Runnable runnable = AbstractC32235l.f148656e;
            if (runnable != null) {
                runnable.run();
                AbstractC32235l.f148656e = null;
                this.f148665r.setLayerType(0, null);
                View view = this.f148666s;
                if (view != null) {
                    view.setLayerType(0, null);
                }
            }
        }
    }

    /* renamed from: a */
    static void m155470a(View view, View view2, int i11, Animator.AnimatorListener animatorListener, boolean z11, boolean z12) {
        if (view == null) {
            return;
        }
        if (z12) {
            AbstractC32227d.m155417a("AspectZAM", "applyAnimationInternal START, topView= " + view + ", animation= " + i11 + ", isOpening= " + z11);
            f148657f.removeCallbacksAndMessages(null);
            f148655d = null;
            if (f148654c && f148656e != null) {
                AbstractC32227d.m155417a("AspectZAM", "applyAnimationInternal Finish running animation");
                f148656e.run();
                f148656e = null;
                view.setLayerType(0, null);
                if (view2 != null) {
                    view2.setLayerType(0, null);
                }
            }
            f148654c = true;
            if (!ZaloActivity.f37906Q) {
                view.setLayerType(2, null);
                if (view2 != null) {
                    view2.setLayerType(2, null);
                }
            }
            f148652a = System.nanoTime() / 1000000;
            f148653b = 0.0f;
            if (z11) {
                if (i11 == 1 || i11 == 3 || i11 == 2) {
                    AbstractC1579n0.m7805C0(view, 0.0f);
                }
                if (i11 == 1) {
                    AbstractC1579n0.m7854a1(view, 0);
                }
            } else {
                if (i11 == 1 || i11 == 3 || i11 == 2) {
                    AbstractC1579n0.m7805C0(view, 1.0f);
                }
                if (i11 == 1) {
                    AbstractC1579n0.m7854a1(view, 0.0f);
                }
            }
            f148656e = new a(view, i11, z11, animatorListener);
        } else if (!f148654c) {
            return;
        }
        Handler handler = f148657f;
        b bVar = new b(i11, z11, view, view2, animatorListener);
        f148655d = bVar;
        handler.post(bVar);
    }

    /* renamed from: b */
    public static void m155471b() {
        Runnable runnable;
        Runnable runnable2 = f148655d;
        if (runnable2 != null) {
            f148657f.removeCallbacks(runnable2);
            f148655d = null;
        }
        if (f148654c && (runnable = f148656e) != null) {
            runnable.run();
            f148656e = null;
        }
        f148654c = false;
    }

    /* renamed from: c */
    public static final void m155472c(View view, View view2, int i11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        m155470a(view, view2, i11, animatorListener, false, true);
    }

    /* renamed from: d */
    public static boolean m155473d() {
        return f148654c;
    }

    /* renamed from: e */
    public static final void m155474e(View view, View view2, int i11, Animator.AnimatorListener animatorListener) {
        if (view == null) {
            return;
        }
        m155470a(view, view2, i11, animatorListener, true, true);
    }
}
