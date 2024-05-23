package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public class RobotoTextViewStateAware extends RobotoTextView {

    /* renamed from: A */
    private int f69573A;

    /* renamed from: B */
    private int f69574B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextViewStateAware(Context context) {
        super(context);
        AbstractC19074t.m100208f(context, "context");
        this.f69573A = 5;
        this.f69574B = 7;
    }

    /* renamed from: i */
    public final void m75863i() {
        if (isInEditMode() || !C13778s1.m76960a()) {
            return;
        }
        int i11 = this.f69573A;
        if (isSelected()) {
            i11 = this.f69574B;
        }
        Context context = getContext();
        AbstractC19074t.m100207e(context, "context");
        Typeface m76694c = C13718q1.m76694c(context, i11);
        if (m76694c != null) {
            setTypeface(m76694c);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z11) {
        super.setSelected(z11);
        m75863i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextViewStateAware(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f69573A = 5;
        this.f69574B = 7;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotoTextViewStateAware(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
        this.f69573A = 5;
        this.f69574B = 7;
    }
}
