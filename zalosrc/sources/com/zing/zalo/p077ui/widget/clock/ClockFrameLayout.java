package com.zing.zalo.p077ui.widget.clock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.widget.FrameLayout;
import db0.EnumC17866b;

/* loaded from: classes6.dex */
public class ClockFrameLayout extends FrameLayout {

    /* renamed from: p */
    private EnumC17866b f70188p;

    /* renamed from: com.zing.zalo.ui.widget.clock.ClockFrameLayout$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC13607a {
    }

    public ClockFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected void onAnimationEnd() {
        super.onAnimationEnd();
        EnumC17866b enumC17866b = this.f70188p;
        if (enumC17866b != null) {
            if (enumC17866b == EnumC17866b.OUT) {
                setVisibility(8);
            } else {
                setVisibility(0);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
    }

    public void setLayoutChangedListener(InterfaceC13607a interfaceC13607a) {
    }

    @Override // android.view.View
    public void startAnimation(Animation animation) {
        this.f70188p = null;
        super.startAnimation(animation);
        getRootView().postInvalidate();
    }
}
