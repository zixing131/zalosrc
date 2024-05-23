package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AbstractC1579n0;
import java.util.List;
import p519t6.InterfaceC26491a;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    private int f36226a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes3.dex */
    class ViewTreeObserverOnPreDrawListenerC6462a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: p */
        final /* synthetic */ View f36227p;

        /* renamed from: q */
        final /* synthetic */ int f36228q;

        /* renamed from: r */
        final /* synthetic */ InterfaceC26491a f36229r;

        ViewTreeObserverOnPreDrawListenerC6462a(View view, int i11, InterfaceC26491a interfaceC26491a) {
            this.f36227p = view;
            this.f36228q = i11;
            this.f36229r = interfaceC26491a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f36227p.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f36226a == this.f36228q) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC26491a interfaceC26491a = this.f36229r;
                expandableBehavior.mo33296H((View) interfaceC26491a, this.f36227p, interfaceC26491a.mo32333a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f36226a = 0;
    }

    /* renamed from: F */
    private boolean m33294F(boolean z11) {
        if (!z11) {
            return this.f36226a == 1;
        }
        int i11 = this.f36226a;
        return i11 == 0 || i11 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: G */
    protected InterfaceC26491a m33295G(CoordinatorLayout coordinatorLayout, View view) {
        List m6536x = coordinatorLayout.m6536x(view);
        int size = m6536x.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view2 = (View) m6536x.get(i11);
            if (mo6547e(coordinatorLayout, view, view2)) {
                return (InterfaceC26491a) view2;
            }
        }
        return null;
    }

    /* renamed from: H */
    protected abstract boolean mo33296H(View view, View view2, boolean z11, boolean z12);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: e */
    public abstract boolean mo6547e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: h */
    public boolean mo6550h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i11;
        InterfaceC26491a interfaceC26491a = (InterfaceC26491a) view2;
        if (m33294F(interfaceC26491a.mo32333a())) {
            if (interfaceC26491a.mo32333a()) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            this.f36226a = i11;
            return mo33296H((View) interfaceC26491a, view, interfaceC26491a.mo32333a(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        InterfaceC26491a m33295G;
        int i12;
        if (!AbstractC1579n0.m7865e0(view) && (m33295G = m33295G(coordinatorLayout, view)) != null && m33294F(m33295G.mo32333a())) {
            if (m33295G.mo32333a()) {
                i12 = 1;
            } else {
                i12 = 2;
            }
            this.f36226a = i12;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC6462a(view, i12, m33295G));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36226a = 0;
    }
}
