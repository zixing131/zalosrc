package com.zing.zalo.p077ui.searchdiscovery.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import fn0.AbstractC19074t;

/* loaded from: classes6.dex */
public final class TouchMonitorFrameLayout extends FrameLayout {

    /* renamed from: p */
    private InterfaceC13005a f67219p;

    /* renamed from: q */
    private boolean f67220q;

    /* renamed from: r */
    private float f67221r;

    /* renamed from: s */
    private final int f67222s;

    /* renamed from: com.zing.zalo.ui.searchdiscovery.widget.TouchMonitorFrameLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13005a {
        /* renamed from: a */
        void mo13124a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TouchMonitorFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC19074t.m100208f(context, "context");
        this.f67222s = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Integer num;
        if (motionEvent != null) {
            num = Integer.valueOf(motionEvent.getActionMasked());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            this.f67220q = false;
            this.f67221r = motionEvent.getRawY();
        } else if ((num != null && num.intValue() == 3) || (num != null && num.intValue() == 1)) {
            this.f67220q = false;
        } else if (num != null && num.intValue() == 2 && !this.f67220q && Math.abs(this.f67221r - motionEvent.getRawY()) > this.f67222s) {
            InterfaceC13005a interfaceC13005a = this.f67219p;
            if (interfaceC13005a != null) {
                interfaceC13005a.mo13124a();
            }
            this.f67220q = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final InterfaceC13005a getGestureListener() {
        return this.f67219p;
    }

    public final void setGestureListener(InterfaceC13005a interfaceC13005a) {
        this.f67219p = interfaceC13005a;
    }
}
