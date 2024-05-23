package com.zing.zalo.p077ui.mycloud;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zing.zalo.p077ui.widget.ScrollView;

/* loaded from: classes6.dex */
public final class TextScrollView extends ScrollView {

    /* renamed from: q */
    private float f65415q;

    public TextScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final float getLastY() {
        return this.f65415q;
    }

    @Override // com.zing.zalo.p077ui.widget.ScrollView, android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f11;
        float f12;
        if (motionEvent != null) {
            f11 = motionEvent.getY();
        } else {
            f11 = 0.0f;
        }
        float f13 = f11 - this.f65415q;
        if (motionEvent != null) {
            f12 = motionEvent.getY();
        } else {
            f12 = 0.0f;
        }
        this.f65415q = f12;
        if (motionEvent != null && motionEvent.getAction() == 2 && f13 > 0.0f && !canScrollVertically(-1)) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setLastY(float f11) {
        this.f65415q = f11;
    }
}
