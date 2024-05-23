package com.google.android.material.floatingactionbutton;

import android.animation.Animator;

/* renamed from: com.google.android.material.floatingactionbutton.a */
/* loaded from: classes3.dex */
class C6320a {

    /* renamed from: a */
    private Animator f35329a;

    /* renamed from: a */
    public void m32360a() {
        Animator animator = this.f35329a;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: b */
    public void m32361b() {
        this.f35329a = null;
    }

    /* renamed from: c */
    public void m32362c(Animator animator) {
        m32360a();
        this.f35329a = animator;
    }
}
