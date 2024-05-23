package com.zing.zalo.p077ui.widget.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import p667y2.C30268e;

/* loaded from: classes6.dex */
public final class CustomFrameLayout extends FrameLayout {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CustomFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        AbstractC19074t.m100208f(motionEvent, C30268e.f140632a);
        int action = motionEvent.getAction();
        if (action != 0) {
            if ((action == 1 || action == 3) && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public /* synthetic */ CustomFrameLayout(Context context, AttributeSet attributeSet, int i11, int i12, AbstractC19060k abstractC19060k) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomFrameLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        AbstractC19074t.m100208f(context, "context");
    }
}
