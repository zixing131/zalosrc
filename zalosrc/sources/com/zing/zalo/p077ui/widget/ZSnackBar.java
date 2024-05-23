package com.zing.zalo.p077ui.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.zview.C17487o0;
import dg0.AbstractC17927b;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import me0.AbstractC23222t7;
import p348mi.AbstractC23309i;
import p649xl.C29745c7;

/* loaded from: classes6.dex */
public final class ZSnackBar extends RelativeLayout {
    public static final C13550a Companion = new C13550a(null);

    /* renamed from: p */
    private C17487o0 f69855p;

    /* renamed from: q */
    private Animator f69856q;

    /* renamed from: r */
    private boolean f69857r;

    /* renamed from: s */
    private final C29745c7 f69858s;

    /* renamed from: com.zing.zalo.ui.widget.ZSnackBar$a */
    /* loaded from: classes6.dex */
    public static final class C13550a {
        private C13550a() {
        }

        public /* synthetic */ C13550a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final ZSnackBar m75985a(Context context, CharSequence charSequence, CharSequence charSequence2, Runnable runnable) {
            AbstractC19074t.m100208f(context, "context");
            AbstractC19074t.m100208f(charSequence, "message");
            ZSnackBar zSnackBar = new ZSnackBar(context);
            zSnackBar.setMessage(charSequence);
            zSnackBar.m75983h(charSequence2, runnable);
            return zSnackBar;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.ZSnackBar$b */
    /* loaded from: classes6.dex */
    public static final class C13551b extends AnimatorListenerAdapter {
        C13551b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC19074t.m100208f(animator, "animation");
            super.onAnimationEnd(animator);
            C17487o0 c17487o0 = ZSnackBar.this.f69855p;
            if (c17487o0 != null) {
                c17487o0.m93000F1(ZSnackBar.this);
            }
        }
    }

    public ZSnackBar(Context context) {
        super(context);
        C29745c7 m147808b = C29745c7.m147808b(LayoutInflater.from(getContext()), this);
        AbstractC19074t.m100207e(m147808b, "inflate(...)");
        this.f69858s = m147808b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        int i11 = AbstractC23222t7.f112576o;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        layoutParams.bottomMargin = AbstractC23222t7.f112549a0;
        setLayoutParams(layoutParams);
        setBackgroundResource(AbstractC16803z.bg_snackbar);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZSnackBar.m75976e(ZSnackBar.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static final void m75976e(ZSnackBar zSnackBar, View view) {
        AbstractC19074t.m100208f(zSnackBar, "this$0");
        zSnackBar.m75982g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final void m75978i(Runnable runnable, ZSnackBar zSnackBar, View view) {
        AbstractC19074t.m100208f(zSnackBar, "this$0");
        if (runnable != null) {
            runnable.run();
        }
        zSnackBar.m75982g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final WindowInsets m75979k(ZSnackBar zSnackBar, View view, WindowInsets windowInsets) {
        AbstractC19074t.m100208f(zSnackBar, "this$0");
        AbstractC19074t.m100208f(view, "<anonymous parameter 0>");
        AbstractC19074t.m100208f(windowInsets, "insets");
        zSnackBar.m75981m();
        return windowInsets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public static final void m75980l(ZSnackBar zSnackBar) {
        AbstractC19074t.m100208f(zSnackBar, "this$0");
        zSnackBar.m75982g();
    }

    /* renamed from: m */
    private final void m75981m() {
        AbstractC2379w.a aVar = new AbstractC2379w.a();
        AbstractC2379w.m12429c(this, aVar, AbstractC23309i.m122007i5(getContext()));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        AbstractC19074t.m100206d(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = AbstractC23222t7.f112549a0 + aVar.f9930e;
        setLayoutParams(marginLayoutParams);
    }

    /* renamed from: g */
    public final void m75982g() {
        if (!this.f69857r) {
            return;
        }
        Animator animator = this.f69856q;
        if (animator != null) {
            animator.cancel();
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", 0.0f).setDuration(200L);
        this.f69856q = duration;
        AbstractC19074t.m100205c(duration);
        duration.addListener(new C13551b());
        Animator animator2 = this.f69856q;
        AbstractC19074t.m100205c(animator2);
        animator2.start();
        this.f69857r = false;
    }

    public final CharSequence getMessage() {
        CharSequence text = this.f69858s.f137405r.getText();
        AbstractC19074t.m100207e(text, "getText(...)");
        return text;
    }

    /* renamed from: h */
    public final void m75983h(CharSequence charSequence, final Runnable runnable) {
        int i11;
        C29745c7 c29745c7 = this.f69858s;
        c29745c7.f137404q.setText(charSequence);
        RobotoTextView robotoTextView = c29745c7.f137404q;
        if (charSequence != null && charSequence.length() == 0) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        robotoTextView.setVisibility(i11);
        c29745c7.f137404q.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.g3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZSnackBar.m75978i(runnable, this, view);
            }
        });
    }

    /* renamed from: j */
    public final void m75984j(C17487o0 c17487o0) {
        AbstractC19074t.m100208f(c17487o0, "zaloViewManager");
        if (this.f69857r || c17487o0.m93021N0().mo35576n3()) {
            return;
        }
        setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.zing.zalo.ui.widget.e3
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets m75979k;
                m75979k = ZSnackBar.m75979k(ZSnackBar.this, view, windowInsets);
                return m75979k;
            }
        });
        this.f69855p = c17487o0;
        c17487o0.m93086w(this, 998, null);
        m75981m();
        setAlpha(0.0f);
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "alpha", 1.0f).setDuration(200L);
        AbstractC19074t.m100207e(duration, "setDuration(...)");
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(this, "translationY", AbstractC23222t7.f112526H, 0.0f).setDuration(300L);
        AbstractC19074t.m100207e(duration2, "setDuration(...)");
        duration2.setInterpolator(new OvershootInterpolator(1.5f));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2);
        this.f69856q = animatorSet;
        AbstractC19074t.m100205c(animatorSet);
        animatorSet.start();
        this.f69857r = true;
        AbstractC17927b.Companion.m94536b().mo94530d("HIDE SNACK_BAR " + this, new Runnable() { // from class: com.zing.zalo.ui.widget.f3
            @Override // java.lang.Runnable
            public final void run() {
                ZSnackBar.m75980l(ZSnackBar.this);
            }
        }, 5000L);
    }

    public final void setMessage(CharSequence charSequence) {
        AbstractC19074t.m100208f(charSequence, "value");
        this.f69858s.f137405r.setText(charSequence);
    }

    public ZSnackBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C29745c7 m147808b = C29745c7.m147808b(LayoutInflater.from(getContext()), this);
        AbstractC19074t.m100207e(m147808b, "inflate(...)");
        this.f69858s = m147808b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        int i11 = AbstractC23222t7.f112576o;
        layoutParams.leftMargin = i11;
        layoutParams.rightMargin = i11;
        layoutParams.bottomMargin = AbstractC23222t7.f112549a0;
        setLayoutParams(layoutParams);
        setBackgroundResource(AbstractC16803z.bg_snackbar);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZSnackBar.m75976e(ZSnackBar.this, view);
            }
        });
    }

    public ZSnackBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C29745c7 m147808b = C29745c7.m147808b(LayoutInflater.from(getContext()), this);
        AbstractC19074t.m100207e(m147808b, "inflate(...)");
        this.f69858s = m147808b;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 81;
        int i12 = AbstractC23222t7.f112576o;
        layoutParams.leftMargin = i12;
        layoutParams.rightMargin = i12;
        layoutParams.bottomMargin = AbstractC23222t7.f112549a0;
        setLayoutParams(layoutParams);
        setBackgroundResource(AbstractC16803z.bg_snackbar);
        setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.widget.d3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ZSnackBar.m75976e(ZSnackBar.this, view);
            }
        });
    }
}
