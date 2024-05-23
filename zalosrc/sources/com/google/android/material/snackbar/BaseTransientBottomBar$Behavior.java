package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes3.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: j */
    private final C6402a f35862j = new C6402a(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    /* renamed from: E */
    public boolean mo31732E(View view) {
        return this.f35862j.m32932a(view);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: k */
    public boolean mo6553k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.f35862j.m32933b(coordinatorLayout, view, motionEvent);
        return super.mo6553k(coordinatorLayout, view, motionEvent);
    }
}
