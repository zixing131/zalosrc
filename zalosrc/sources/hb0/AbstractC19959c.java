package hb0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import com.zing.zalo.uicomponents.framelayout.DragToCloseLayout;
import fn0.AbstractC19074t;

/* renamed from: hb0.c */
/* loaded from: classes6.dex */
public abstract class AbstractC19959c implements DragToCloseLayout.InterfaceC16432a {

    /* renamed from: p */
    private final DragToCloseLayout f98258p;

    /* renamed from: q */
    private ValueAnimator f98259q;

    /* renamed from: hb0.c$a */
    /* loaded from: classes6.dex */
    public static final class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            AbstractC19959c.this.mo81702f(false);
        }
    }

    /* renamed from: hb0.c$b */
    /* loaded from: classes6.dex */
    public static final class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            AbstractC19959c.this.mo81702f(true);
        }
    }

    public AbstractC19959c(DragToCloseLayout dragToCloseLayout) {
        AbstractC19074t.m100208f(dragToCloseLayout, "dragToCloseLayout");
        this.f98258p = dragToCloseLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static final void m103739d(AbstractC19959c abstractC19959c, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(abstractC19959c, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        AbstractC19074t.m100206d(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        abstractC19959c.f98258p.setTranslationY(((Integer) r2).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m103740e(AbstractC19959c abstractC19959c, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(abstractC19959c, "this$0");
        AbstractC19074t.m100208f(valueAnimator, "valueAnimator");
        AbstractC19074t.m100206d(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        abstractC19959c.f98258p.setTranslationY(((Integer) r2).intValue());
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: Dg */
    public void mo38328Dg(float f11) {
        View mo81701c = mo81701c();
        if (mo81701c != null) {
            mo81701c.setAlpha(1.0f - (f11 / this.f98258p.getMeasuredHeight()));
        }
    }

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: EC */
    public void mo38329EC(boolean z11) {
        if (!z11) {
            int translationY = (int) this.f98258p.getTranslationY();
            int height = this.f98258p.getHeight();
            if (translationY < 0) {
                height = -height;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(translationY, height);
            this.f98259q = ofInt;
            if (ofInt != null) {
                ofInt.setDuration(300L);
            }
            ValueAnimator valueAnimator = this.f98259q;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hb0.a
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        AbstractC19959c.m103739d(AbstractC19959c.this, valueAnimator2);
                    }
                });
            }
            ValueAnimator valueAnimator2 = this.f98259q;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new a());
            }
        } else {
            ValueAnimator ofInt2 = ValueAnimator.ofInt((int) this.f98258p.getTranslationY(), 0);
            this.f98259q = ofInt2;
            if (ofInt2 != null) {
                ofInt2.setDuration(300L);
            }
            ValueAnimator valueAnimator3 = this.f98259q;
            if (valueAnimator3 != null) {
                valueAnimator3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hb0.b
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        AbstractC19959c.m103740e(AbstractC19959c.this, valueAnimator4);
                    }
                });
            }
            ValueAnimator valueAnimator4 = this.f98259q;
            if (valueAnimator4 != null) {
                valueAnimator4.addListener(new b());
            }
        }
        ValueAnimator valueAnimator5 = this.f98259q;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }

    /* renamed from: c */
    public abstract View mo81701c();

    /* renamed from: f */
    public abstract void mo81702f(boolean z11);

    @Override // com.zing.zalo.uicomponents.framelayout.DragToCloseLayout.InterfaceC16432a
    /* renamed from: f2 */
    public void mo38330f2() {
        ValueAnimator valueAnimator = this.f98259q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }
}
