package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class dr0 implements View.OnAttachStateChangeListener {

    /* renamed from: p */
    final /* synthetic */ yh0 f19393p;

    /* renamed from: q */
    final /* synthetic */ ir0 f19394q;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dr0(ir0 ir0Var, yh0 yh0Var) {
        this.f19394q = ir0Var;
        this.f19393p = yh0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f19394q.m23353z(view, this.f19393p, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
