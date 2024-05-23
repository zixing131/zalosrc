package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class CustomTabStrip extends FrameLayout {

    /* renamed from: p */
    List f69113p;

    /* renamed from: q */
    public boolean f69114q;

    /* loaded from: classes6.dex */
    public static class CustomScrollView extends HorizontalScrollView {
        @Override // android.widget.HorizontalScrollView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return false;
        }
    }

    public CustomTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f69113p = new ArrayList();
        this.f69114q = false;
    }
}
