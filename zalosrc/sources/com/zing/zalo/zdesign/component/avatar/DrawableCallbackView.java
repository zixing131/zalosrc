package com.zing.zalo.zdesign.component.avatar;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public class DrawableCallbackView extends View {
    public static final C16944a Companion = new C16944a(null);

    /* renamed from: p */
    private static Handler f86482p = new Handler(Looper.getMainLooper());

    /* renamed from: com.zing.zalo.zdesign.component.avatar.DrawableCallbackView$a */
    /* loaded from: classes7.dex */
    public static final class C16944a {
        private C16944a() {
        }

        public /* synthetic */ C16944a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    public DrawableCallbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        AbstractC19074t.m100208f(drawable, "drawable");
        invalidate();
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        AbstractC19074t.m100208f(drawable, "who");
        AbstractC19074t.m100208f(runnable, "what");
        f86482p.postAtTime(runnable, drawable, j11);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC19074t.m100208f(drawable, "who");
        AbstractC19074t.m100208f(runnable, "what");
        f86482p.removeCallbacks(runnable, drawable);
    }

    public DrawableCallbackView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
