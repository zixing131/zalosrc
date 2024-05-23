package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: com.google.android.material.snackbar.a */
/* loaded from: classes3.dex */
public class C6402a {
    public C6402a(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.m31734K(0.1f);
        swipeDismissBehavior.m31733J(0.6f);
        swipeDismissBehavior.m31735L(0);
    }

    /* renamed from: a */
    public boolean m32932a(View view) {
        return view instanceof BaseTransientBottomBar$SnackbarBaseLayout;
    }

    /* renamed from: b */
    public void m32933b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C6405d.m32935b().m32939f(null);
                return;
            }
            return;
        }
        if (coordinatorLayout.m6521H(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C6405d.m32935b().m32938e(null);
        }
    }
}
