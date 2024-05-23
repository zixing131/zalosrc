package com.zing.zalo.p077ui.widget.layout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public class DrawableCallbackFrameLayout extends FrameLayout {

    /* renamed from: p */
    static Handler f70599p = new Handler(Looper.getMainLooper());

    public DrawableCallbackFrameLayout(Context context) {
        super(context);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        f70599p.postAtTime(runnable, drawable, j11);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        f70599p.removeCallbacks(runnable, drawable);
    }

    public DrawableCallbackFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
