package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    private AnimatorSet f36231b;

    /* renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$a */
    /* loaded from: classes3.dex */
    class C6463a extends AnimatorListenerAdapter {
        C6463a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f36231b = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo33296H(View view, View view2, boolean z11, boolean z12) {
        boolean z13;
        AnimatorSet animatorSet = this.f36231b;
        if (animatorSet != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            animatorSet.cancel();
        }
        AnimatorSet mo33298J = mo33298J(view, view2, z11, z13);
        this.f36231b = mo33298J;
        mo33298J.addListener(new C6463a());
        this.f36231b.start();
        if (!z12) {
            this.f36231b.end();
        }
        return true;
    }

    /* renamed from: J */
    protected abstract AnimatorSet mo33298J(View view, View view2, boolean z11, boolean z12);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
