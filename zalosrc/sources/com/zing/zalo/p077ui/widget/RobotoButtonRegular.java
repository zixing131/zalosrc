package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;

/* loaded from: classes6.dex */
public class RobotoButtonRegular extends RobotoButton {
    public RobotoButtonRegular(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.zing.zalo.p077ui.widget.RobotoButton
    /* renamed from: a */
    protected void mo75848a(Context context, AttributeSet attributeSet, int i11) {
        if (isInEditMode() || !C13778s1.m76960a()) {
            return;
        }
        setTypeface(C13718q1.m76694c(getContext(), 5));
    }

    public RobotoButtonRegular(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
