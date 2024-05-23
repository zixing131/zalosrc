package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1785o;
import androidx.lifecycle.C1805y;
import androidx.lifecycle.InterfaceC1801w;

/* loaded from: classes6.dex */
public class LifecycleOwnerFrameLayout extends FrameLayout implements InterfaceC1801w {

    /* renamed from: p */
    private final C1805y f70606p;

    public LifecycleOwnerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C1805y c1805y = new C1805y(this);
        this.f70606p = c1805y;
        c1805y.m9400i(AbstractC1785o.a.ON_CREATE);
    }

    @Override // androidx.lifecycle.InterfaceC1801w
    public AbstractC1785o getLifecycle() {
        return this.f70606p;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70606p.m9400i(AbstractC1785o.a.ON_START);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f70606p.m9400i(AbstractC1785o.a.ON_DESTROY);
        super.onDetachedFromWindow();
    }

    public LifecycleOwnerFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        C1805y c1805y = new C1805y(this);
        this.f70606p = c1805y;
        c1805y.m9400i(AbstractC1785o.a.ON_CREATE);
    }
}
