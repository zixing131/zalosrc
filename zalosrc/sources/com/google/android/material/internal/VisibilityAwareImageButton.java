package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: p */
    private int f35467p;

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public final void m32470b(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f35467p = i11;
        }
    }

    public final int getUserSetVisibility() {
        return this.f35467p;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        m32470b(i11, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f35467p = getVisibility();
    }
}
