package com.zing.zalo.p077ui.widget.reaction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.zing.zalo.p077ui.widget.reaction.ReactionPickerView;
import p500s1.C26086a;
import p500s1.C26088c;
import zl0.AbstractC32226c;

/* loaded from: classes6.dex */
public class ReactionPickerContainerView extends RelativeLayout implements View.OnClickListener {

    /* renamed from: p */
    ReactionPickerView f71115p;

    /* renamed from: q */
    Animator f71116q;

    /* renamed from: r */
    boolean f71117r;

    /* renamed from: s */
    boolean f71118s;

    /* renamed from: t */
    boolean f71119t;

    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionPickerContainerView$a */
    /* loaded from: classes6.dex */
    class ViewTreeObserverOnPreDrawListenerC13744a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ Point f71120p;

        /* renamed from: q */
        final /* synthetic */ boolean f71121q;

        ViewTreeObserverOnPreDrawListenerC13744a(Point point, boolean z11) {
            this.f71120p = point;
            this.f71121q = z11;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            int i11;
            ReactionPickerContainerView.this.f71115p.getViewTreeObserver().removeOnPreDrawListener(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            int i12 = this.f71120p.y;
            if (this.f71121q) {
                i11 = 0;
            } else {
                i11 = ReactionPickerView.f71134f0;
            }
            layoutParams.topMargin = i12 - i11;
            View rootView = ReactionPickerContainerView.this.f71115p.getRootView();
            layoutParams.topMargin -= AbstractC32226c.m155407f(rootView).top;
            int[] iArr = new int[2];
            rootView.getLocationOnScreen(iArr);
            layoutParams.topMargin -= iArr[1];
            ReactionPickerContainerView.this.f71115p.setLayoutParams(layoutParams);
            return false;
        }
    }

    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionPickerContainerView$b */
    /* loaded from: classes6.dex */
    class C13745b extends AnimatorListenerAdapter {
        C13745b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ReactionPickerContainerView.this.setAlpha(1.0f);
            ReactionPickerContainerView.this.f71117r = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ReactionPickerContainerView.this.f71117r = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.ui.widget.reaction.ReactionPickerContainerView$c */
    /* loaded from: classes6.dex */
    public class C13746c extends AnimatorListenerAdapter {
        C13746c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ReactionPickerContainerView reactionPickerContainerView = ReactionPickerContainerView.this;
            reactionPickerContainerView.f71118s = false;
            if (reactionPickerContainerView.f71115p.getListener() != null) {
                ReactionPickerContainerView.this.f71115p.getListener().mo62730p2();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ReactionPickerContainerView reactionPickerContainerView = ReactionPickerContainerView.this;
            reactionPickerContainerView.f71118s = false;
            if (reactionPickerContainerView.f71115p.getListener() != null) {
                ReactionPickerContainerView.this.f71115p.getListener().mo62730p2();
            }
        }
    }

    public ReactionPickerContainerView(Context context, Point point, boolean z11, ReactionPickerView.InterfaceC13747a interfaceC13747a, String str, String str2) {
        super(context);
        this.f71117r = false;
        this.f71118s = false;
        this.f71119t = true;
        ReactionPickerInContextMenuView reactionPickerInContextMenuView = new ReactionPickerInContextMenuView(context, -1, z11, str, interfaceC13747a, str2);
        this.f71115p = reactionPickerInContextMenuView;
        addView(reactionPickerInContextMenuView);
        this.f71115p.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC13744a(point, z11));
        setOnClickListener(this);
    }

    /* renamed from: a */
    public void m76800a(int i11) {
        if (this.f71118s) {
            this.f71119t = true;
            Animator animator = this.f71116q;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f);
            ofFloat.setDuration(100L);
            ofFloat.setInterpolator(new C26086a());
            ofFloat.addListener(new C13746c());
            ofFloat.setStartDelay(i11);
            ofFloat.start();
        }
    }

    /* renamed from: b */
    public void m76801b() {
        if (!this.f71118s) {
            this.f71119t = false;
            setAlpha(0.0f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "alpha", 1.0f);
            this.f71116q = ofFloat;
            ofFloat.setDuration(120L);
            this.f71116q.setInterpolator(new C26088c());
            this.f71116q.addListener(new C13745b());
            this.f71116q.start();
            this.f71118s = true;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (this.f71117r) {
            this.f71117r = false;
            m76800a(0);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        if (motionEvent.getAction() == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        requestDisallowInterceptTouchEvent(z11);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
