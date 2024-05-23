package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class DisableTouchFrameLayout extends InterceptTouchFrameLayout {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisableTouchFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        return false;
    }
}
