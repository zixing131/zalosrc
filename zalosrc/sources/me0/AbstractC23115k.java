package me0;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* renamed from: me0.k */
/* loaded from: classes4.dex */
public abstract class AbstractC23115k {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: me0.k$a */
    /* loaded from: classes4.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ View f112206p;

        a(View view) {
            this.f112206p = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f112206p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            Animation animation = this.f112206p.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
                animation.cancel();
            }
            this.f112206p.setAnimation(null);
        }
    }

    /* renamed from: me0.k$b */
    /* loaded from: classes4.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ View f112207p;

        /* renamed from: q */
        final /* synthetic */ int f112208q;

        /* renamed from: me0.k$b$a */
        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                b.this.f112207p.setVisibility(8);
                AbstractC23115k.m118572c(b.this.f112207p);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        b(View view, int i11) {
            this.f112207p = view;
            this.f112208q = i11;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f112207p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f112207p.getContext(), this.f112208q);
            loadAnimation.setAnimationListener(new a());
            this.f112207p.startAnimation(loadAnimation);
        }
    }

    /* renamed from: me0.k$c */
    /* loaded from: classes4.dex */
    class c implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: p */
        final /* synthetic */ View f112210p;

        /* renamed from: q */
        final /* synthetic */ int f112211q;

        /* renamed from: me0.k$c$a */
        /* loaded from: classes4.dex */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                AbstractC23115k.m118572c(c.this.f112210p);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }

        c(View view, int i11) {
            this.f112210p = view;
            this.f112211q = i11;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            this.f112210p.getViewTreeObserver().removeGlobalOnLayoutListener(this);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.f112210p.getContext(), this.f112211q);
            loadAnimation.setAnimationListener(new a());
            this.f112210p.startAnimation(loadAnimation);
        }
    }

    /* renamed from: a */
    public static void m118570a(View view, int i11) {
        view.setVisibility(8);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new b(view, i11));
    }

    /* renamed from: b */
    public static void m118571b(View view, int i11) {
        view.setVisibility(0);
        view.getViewTreeObserver().addOnGlobalLayoutListener(new c(view, i11));
    }

    /* renamed from: c */
    public static void m118572c(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(new a(view));
    }
}
