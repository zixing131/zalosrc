package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* renamed from: com.google.android.material.internal.h */
/* loaded from: classes3.dex */
public final class C6341h {

    /* renamed from: a */
    private final ArrayList f35567a = new ArrayList();

    /* renamed from: b */
    private b f35568b = null;

    /* renamed from: c */
    ValueAnimator f35569c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f35570d = new a();

    /* renamed from: com.google.android.material.internal.h$a */
    /* loaded from: classes3.dex */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C6341h c6341h = C6341h.this;
            if (c6341h.f35569c == animator) {
                c6341h.f35569c = null;
            }
        }
    }

    /* renamed from: com.google.android.material.internal.h$b */
    /* loaded from: classes3.dex */
    static class b {

        /* renamed from: a */
        final int[] f35572a;

        /* renamed from: b */
        final ValueAnimator f35573b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f35572a = iArr;
            this.f35573b = valueAnimator;
        }
    }

    /* renamed from: a */
    public void m32601a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f35570d);
        this.f35567a.add(bVar);
    }
}
