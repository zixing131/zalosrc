package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowMetrics;
import fn0.AbstractC19074t;

/* renamed from: androidx.window.layout.e */
/* loaded from: classes2.dex */
public final class C2099e {

    /* renamed from: a */
    public static final C2099e f8970a = new C2099e();

    private C2099e() {
    }

    /* renamed from: a */
    public final Rect m11335a(Activity activity) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        AbstractC19074t.m100208f(activity, "activity");
        currentWindowMetrics = activity.getWindowManager().getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        AbstractC19074t.m100207e(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
