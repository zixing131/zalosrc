package com.zing.zalo.shortvideo.p072ui.widget.tv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class BlinkTextView extends SimpleShadowTextView {

    /* renamed from: B */
    private boolean f54701B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f54701B = true;
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, "event");
        if (this.f54701B) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    setAlpha(1.0f);
                }
            } else {
                setAlpha(0.5f);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setBlinkEnable(boolean z11) {
        this.f54701B = z11;
    }
}
