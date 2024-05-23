package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private C6232f f34826a;

    /* renamed from: b */
    private int f34827b;

    /* renamed from: c */
    private int f34828c;

    public ViewOffsetBehavior() {
        this.f34827b = 0;
        this.f34828c = 0;
    }

    /* renamed from: E */
    public int mo31589E() {
        C6232f c6232f = this.f34826a;
        if (c6232f != null) {
            return c6232f.m31649c();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: F */
    public void mo31631F(CoordinatorLayout coordinatorLayout, View view, int i11) {
        coordinatorLayout.m6524O(view, i11);
    }

    /* renamed from: G */
    public boolean mo31590G(int i11) {
        C6232f c6232f = this.f34826a;
        if (c6232f != null) {
            return c6232f.m31652f(i11);
        }
        this.f34827b = i11;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: l */
    public boolean mo6554l(CoordinatorLayout coordinatorLayout, View view, int i11) {
        mo31631F(coordinatorLayout, view, i11);
        if (this.f34826a == null) {
            this.f34826a = new C6232f(view);
        }
        this.f34826a.m31650d();
        this.f34826a.m31647a();
        int i12 = this.f34827b;
        if (i12 != 0) {
            this.f34826a.m31652f(i12);
            this.f34827b = 0;
        }
        int i13 = this.f34828c;
        if (i13 != 0) {
            this.f34826a.m31651e(i13);
            this.f34828c = 0;
            return true;
        }
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34827b = 0;
        this.f34828c = 0;
    }
}
