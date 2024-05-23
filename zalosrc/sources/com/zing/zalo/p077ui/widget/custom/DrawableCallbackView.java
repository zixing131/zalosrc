package com.zing.zalo.p077ui.widget.custom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes6.dex */
public class DrawableCallbackView extends View {

    /* renamed from: p */
    static Handler f70195p = new Handler(Looper.getMainLooper());

    public DrawableCallbackView(Context context) {
        super(context);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        f70195p.postAtTime(runnable, drawable, j11);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        f70195p.removeCallbacks(runnable, drawable);
    }

    public DrawableCallbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
