package sg;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1579n0;
import com.zing.zalo.zdesign.component.ListItem;
import fn0.AbstractC19074t;
import gg0.AbstractC19444a;
import me0.AbstractC23136l9;

/* renamed from: sg.d */
/* loaded from: classes3.dex */
public final class C26244d {

    /* renamed from: a */
    public static final C26244d f124646a = new C26244d();

    /* renamed from: sg.d$a */
    /* loaded from: classes3.dex */
    public static final class a implements View.OnLayoutChangeListener {

        /* renamed from: p */
        final /* synthetic */ FrameLayout f124647p;

        public a(FrameLayout frameLayout) {
            this.f124647p = frameLayout;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            AbstractC19074t.m100208f(view, "view");
            view.removeOnLayoutChangeListener(this);
            this.f124647p.setTranslationY(r1.getHeight());
            this.f124647p.animate().translationY(0.0f).setDuration(175L).setInterpolator(new DecelerateInterpolator(1.78f)).withLayer();
        }
    }

    /* renamed from: sg.d$b */
    /* loaded from: classes3.dex */
    public static final class b implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ ListItem f124648p;

        /* renamed from: q */
        final /* synthetic */ int[] f124649q;

        /* renamed from: r */
        final /* synthetic */ int f124650r;

        public b(ListItem listItem, int[] iArr, int i11) {
            this.f124648p = listItem;
            this.f124649q = iArr;
            this.f124650r = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f124648p.setTranslationX(this.f124649q[1]);
            this.f124648p.getCheckbox().setVisibility(8);
            this.f124648p.setTrailingItemVisibility(0);
            this.f124648p.m90591l(this.f124650r - this.f124649q[1], 0, 0, 0);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }
    }

    /* renamed from: sg.d$c */
    /* loaded from: classes3.dex */
    public static final class c implements Animator.AnimatorListener {

        /* renamed from: p */
        final /* synthetic */ ListItem f124651p;

        /* renamed from: q */
        final /* synthetic */ int[] f124652q;

        /* renamed from: r */
        final /* synthetic */ int f124653r;

        public c(ListItem listItem, int[] iArr, int i11) {
            this.f124651p = listItem;
            this.f124652q = iArr;
            this.f124653r = i11;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC19074t.m100208f(animator, "animator");
            this.f124651p.setTranslationX(this.f124652q[0]);
            this.f124651p.getCheckbox().setVisibility(0);
            this.f124651p.setTrailingItemVisibility(8);
            this.f124651p.m90591l(this.f124653r - this.f124652q[0], 0, 0, 0);
        }
    }

    private C26244d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m134934e(boolean z11, final FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "$this_setBottomPanelVisibility");
        if (z11) {
            frameLayout.setVisibility(0);
            if (AbstractC1579n0.m7865e0(frameLayout) && !frameLayout.isLayoutRequested()) {
                frameLayout.setTranslationY(frameLayout.getHeight());
                frameLayout.animate().translationY(0.0f).setDuration(175L).setInterpolator(new DecelerateInterpolator(1.78f)).withLayer();
                return;
            } else {
                frameLayout.addOnLayoutChangeListener(new a(frameLayout));
                return;
            }
        }
        frameLayout.animate().translationY(frameLayout.getHeight()).setDuration(175L).withEndAction(new Runnable() { // from class: sg.b
            @Override // java.lang.Runnable
            public final void run() {
                C26244d.m134935f(frameLayout);
            }
        }).withLayer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m134935f(FrameLayout frameLayout) {
        AbstractC19074t.m100208f(frameLayout, "$footer");
        frameLayout.setTranslationY(0.0f);
        frameLayout.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m134936h(ListItem listItem, ValueAnimator valueAnimator) {
        AbstractC19074t.m100208f(listItem, "$this_setCheckBoxVisibility");
        AbstractC19074t.m100208f(valueAnimator, "value");
        AbstractC19074t.m100206d(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        listItem.setTranslationX(((Integer) r2).intValue());
    }

    /* renamed from: d */
    public final void m134937d(final FrameLayout frameLayout, final boolean z11) {
        AbstractC19074t.m100208f(frameLayout, "<this>");
        AbstractC19444a.m101697e(new Runnable() { // from class: sg.a
            @Override // java.lang.Runnable
            public final void run() {
                C26244d.m134934e(z11, frameLayout);
            }
        });
    }

    /* renamed from: g */
    public final void m134938g(final ListItem listItem, boolean z11) {
        int i11;
        int i12;
        AbstractC19074t.m100208f(listItem, "<this>");
        int[] iArr = {AbstractC23136l9.m118712h(listItem.getContext(), 40.0f) * (-1), 0};
        int m118712h = AbstractC23136l9.m118712h(listItem.getContext(), 80.0f);
        int[] iArr2 = new int[2];
        if (z11) {
            i11 = iArr[0];
        } else {
            i11 = iArr[1];
        }
        iArr2[0] = i11;
        if (z11) {
            i12 = iArr[1];
        } else {
            i12 = iArr[0];
        }
        iArr2[1] = i12;
        ValueAnimator ofInt = ValueAnimator.ofInt(iArr2);
        ofInt.setDuration(200L);
        ofInt.setInterpolator(new DecelerateInterpolator(1.78f));
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: sg.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C26244d.m134936h(ListItem.this, valueAnimator);
            }
        });
        if (z11) {
            AbstractC19074t.m100205c(ofInt);
            ofInt.addListener(new c(listItem, iArr, m118712h));
        } else {
            AbstractC19074t.m100205c(ofInt);
            ofInt.addListener(new b(listItem, iArr, m118712h));
        }
        ofInt.start();
    }
}
