package com.zing.zalo.shortvideo.p072ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import fn0.AbstractC19074t;

/* loaded from: classes5.dex */
public final class ScrollStateNestedScrollView extends NestedScrollView {

    /* renamed from: T */
    private boolean f54136T;

    /* renamed from: U */
    private boolean f54137U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollStateNestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z11;
        AbstractC19074t.m100208f(motionEvent, "ev");
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 2) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f54136T = z11;
        if (!z11) {
            this.f54137U = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        boolean z11;
        if (this.f54136T && Math.abs(i13 - i14) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f54137U = z11;
        super.onScrollChanged(i11, i12, i13, i14);
    }
}
