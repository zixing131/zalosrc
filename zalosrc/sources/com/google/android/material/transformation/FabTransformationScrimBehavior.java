package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p382o6.AbstractC24042b;
import p382o6.C24049i;

@Deprecated
/* loaded from: classes3.dex */
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final C24049i f36252c;

    /* renamed from: d */
    private final C24049i f36253d;

    /* renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$a */
    /* loaded from: classes3.dex */
    class C6469a extends AnimatorListenerAdapter {

        /* renamed from: p */
        final /* synthetic */ boolean f36254p;

        /* renamed from: q */
        final /* synthetic */ View f36255q;

        C6469a(boolean z11, View view) {
            this.f36254p = z11;
            this.f36255q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f36254p) {
                this.f36255q.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f36254p) {
                this.f36255q.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f36252c = new C24049i(75L, 150L);
        this.f36253d = new C24049i(0L, 150L);
    }

    /* renamed from: K */
    private void m33321K(View view, boolean z11, boolean z12, List list, List list2) {
        C24049i c24049i;
        ObjectAnimator ofFloat;
        if (z11) {
            c24049i = this.f36252c;
        } else {
            c24049i = this.f36253d;
        }
        if (z11) {
            if (!z12) {
                view.setAlpha(0.0f);
            }
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c24049i.m125937a(ofFloat);
        list.add(ofFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: D */
    public boolean mo6542D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.mo6542D(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* renamed from: J */
    protected AnimatorSet mo33298J(View view, View view2, boolean z11, boolean z12) {
        ArrayList arrayList = new ArrayList();
        m33321K(view2, z11, z12, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        AbstractC24042b.m125913a(animatorSet, arrayList);
        animatorSet.addListener(new C6469a(z11, view2));
        return animatorSet;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: e */
    public boolean mo6547e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36252c = new C24049i(75L, 150L);
        this.f36253d = new C24049i(0L, 150L);
    }
}
