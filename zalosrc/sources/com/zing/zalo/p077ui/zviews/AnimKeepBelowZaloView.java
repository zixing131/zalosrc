package com.zing.zalo.p077ui.zviews;

import android.animation.Animator;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.zview.ZaloView;

/* loaded from: classes6.dex */
public abstract class AnimKeepBelowZaloView extends BaseZaloView implements ZaloView.InterfaceC17421f {

    /* renamed from: P0 */
    private boolean f72141P0;

    /* renamed from: M0 */
    private final Handler f72138M0 = new Handler(Looper.getMainLooper());

    /* renamed from: N0 */
    private long f72139N0 = 0;

    /* renamed from: O0 */
    private float f72140O0 = 0.0f;

    /* renamed from: Q0 */
    private Runnable f72142Q0 = null;

    /* renamed from: R0 */
    private Runnable f72143R0 = null;

    /* renamed from: S0 */
    private float f72144S0 = 0.0f;

    /* renamed from: T0 */
    private final DecelerateInterpolator f72145T0 = new DecelerateInterpolator(1.0f);

    /* renamed from: U0 */
    private int f72146U0 = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AnimKeepBelowZaloView$a */
    /* loaded from: classes6.dex */
    public class C14034a implements Animator.AnimatorListener {
        C14034a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AnimKeepBelowZaloView.super.finish();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.zviews.AnimKeepBelowZaloView$b */
    /* loaded from: classes6.dex */
    public class RunnableC14035b implements Runnable {

        /* renamed from: p */
        final /* synthetic */ boolean f72148p;

        /* renamed from: q */
        final /* synthetic */ boolean f72149q;

        /* renamed from: r */
        final /* synthetic */ View f72150r;

        /* renamed from: s */
        final /* synthetic */ int f72151s;

        /* renamed from: t */
        final /* synthetic */ Animator.AnimatorListener f72152t;

        RunnableC14035b(boolean z11, boolean z12, View view, int i11, Animator.AnimatorListener animatorListener) {
            this.f72148p = z11;
            this.f72149q = z12;
            this.f72150r = view;
            this.f72151s = i11;
            this.f72152t = animatorListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnimKeepBelowZaloView.this.f72142Q0 != this) {
                return;
            }
            if (this.f72148p) {
                if (this.f72149q) {
                    this.f72150r.setVisibility(0);
                }
                if (this.f72151s == 3) {
                    AnimKeepBelowZaloView.this.f72144S0 = this.f72150r.getTranslationY();
                }
            }
            AnimKeepBelowZaloView.this.f72142Q0 = null;
            long nanoTime = System.nanoTime() / 1000000;
            long j11 = nanoTime - AnimKeepBelowZaloView.this.f72139N0;
            if (j11 > 10) {
                j11 = 10;
            }
            AnimKeepBelowZaloView.this.f72139N0 = nanoTime;
            AnimKeepBelowZaloView.this.f72140O0 += ((float) j11) / 200.0f;
            if (AnimKeepBelowZaloView.this.f72140O0 > 1.0f) {
                AnimKeepBelowZaloView.this.f72140O0 = 1.0f;
            }
            float interpolation = AnimKeepBelowZaloView.this.f72145T0.getInterpolation(AnimKeepBelowZaloView.this.f72140O0);
            int i11 = this.f72151s;
            if (i11 == 1) {
                if (this.f72149q) {
                    AbstractC1579n0.m7815H0(this.f72150r, new Rect(0, 0, this.f72150r.getWidth(), (int) (interpolation * this.f72150r.getHeight())));
                } else {
                    AbstractC1579n0.m7815H0(this.f72150r, new Rect(0, 0, this.f72150r.getWidth(), (int) ((1.0f - interpolation) * this.f72150r.getHeight())));
                }
            } else if (i11 == 2) {
                if (this.f72149q) {
                    AbstractC1579n0.m7815H0(this.f72150r, new Rect(0, (int) (this.f72150r.getHeight() - (interpolation * this.f72150r.getHeight())), this.f72150r.getWidth(), this.f72150r.getHeight()));
                } else {
                    AbstractC1579n0.m7815H0(this.f72150r, new Rect(0, (int) (this.f72150r.getHeight() - ((1.0f - interpolation) * this.f72150r.getHeight())), this.f72150r.getWidth(), this.f72150r.getHeight()));
                }
            } else if (i11 == 3) {
                if (this.f72149q) {
                    AbstractC1579n0.m7857b1(this.f72150r, AnimKeepBelowZaloView.this.f72144S0 + ((1.0f - interpolation) * (AnimKeepBelowZaloView.this.mo78096vM().getHeight() - AnimKeepBelowZaloView.this.f72144S0)));
                } else {
                    AbstractC1579n0.m7857b1(this.f72150r, AnimKeepBelowZaloView.this.f72144S0 + (interpolation * (AnimKeepBelowZaloView.this.mo78096vM().getHeight() - AnimKeepBelowZaloView.this.f72144S0)));
                }
            }
            if (AnimKeepBelowZaloView.this.f72140O0 >= 1.0f) {
                AnimKeepBelowZaloView.this.f72141P0 = false;
                if (AnimKeepBelowZaloView.this.f72143R0 != null) {
                    AnimKeepBelowZaloView.this.f72143R0.run();
                    AnimKeepBelowZaloView.this.f72143R0 = null;
                    this.f72150r.setLayerType(0, null);
                    return;
                }
                return;
            }
            if (AnimKeepBelowZaloView.this.f72141P0) {
                AnimKeepBelowZaloView.this.m78093tM(this.f72150r, this.f72151s, this.f72149q, this.f72152t, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public void m78093tM(final View view, final int i11, final boolean z11, final Animator.AnimatorListener animatorListener, boolean z12) {
        Runnable runnable;
        if (view == null) {
            return;
        }
        if (i11 == 0) {
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(null);
                return;
            }
            return;
        }
        if (i11 == 3 && mo78096vM() == null) {
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(null);
                return;
            }
            return;
        }
        if (z12) {
            this.f72138M0.removeCallbacksAndMessages(null);
            this.f72142Q0 = null;
            if (this.f72141P0 && (runnable = this.f72143R0) != null) {
                runnable.run();
                this.f72143R0 = null;
                view.setLayerType(0, null);
            }
            this.f72141P0 = true;
            this.f72139N0 = System.nanoTime() / 1000000;
            this.f72140O0 = 0.0f;
            if (z11) {
                view.setVisibility(8);
            }
            this.f72143R0 = new Runnable() { // from class: com.zing.zalo.ui.zviews.h0
                @Override // java.lang.Runnable
                public final void run() {
                    AnimKeepBelowZaloView.this.m78094wM(i11, z11, view, animatorListener);
                }
            };
        } else if (!this.f72141P0) {
            return;
        }
        Handler handler = this.f72138M0;
        RunnableC14035b runnableC14035b = new RunnableC14035b(z12, z11, view, i11, animatorListener);
        this.f72142Q0 = runnableC14035b;
        handler.post(runnableC14035b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: wM */
    public /* synthetic */ void m78094wM(int i11, boolean z11, View view, Animator.AnimatorListener animatorListener) {
        this.f72143R0 = null;
        if (i11 == 1) {
            if (z11) {
                AbstractC1579n0.m7815H0(view, null);
            } else {
                AbstractC1579n0.m7815H0(view, new Rect(0, 0, view.getWidth(), 0));
            }
        } else if (i11 == 2) {
            if (z11) {
                AbstractC1579n0.m7815H0(view, null);
            } else {
                AbstractC1579n0.m7815H0(view, new Rect(0, view.getHeight(), view.getWidth(), view.getHeight()));
            }
        } else if (i11 == 3) {
            if (z11) {
                AbstractC1579n0.m7857b1(view, this.f72144S0);
            } else {
                AbstractC1579n0.m7857b1(view, mo78096vM().getHeight());
            }
        }
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: QJ */
    public boolean mo37491QJ(int i11) {
        if (i11 == 16908332 && !m92681pJ() && !m92677nJ()) {
            finish();
            return true;
        }
        return super.mo37491QJ(i11);
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void finish() {
        m78093tM(mo78095uM(), this.f72146U0, false, new C14034a(), true);
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            finish();
            return true;
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: uM */
    protected abstract View mo78095uM();

    /* renamed from: vM */
    protected abstract View mo78096vM();

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        m78093tM(mo78095uM(), this.f72146U0, true, null, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: xM */
    public void m78097xM(int i11) {
        this.f72146U0 = i11;
    }
}
