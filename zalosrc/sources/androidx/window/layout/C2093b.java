package androidx.window.layout;

import android.app.Activity;
import fn0.AbstractC19074t;

/* renamed from: androidx.window.layout.b */
/* loaded from: classes2.dex */
public final class C2093b {

    /* renamed from: a */
    public static final C2093b f8959a = new C2093b();

    private C2093b() {
    }

    /* renamed from: a */
    public final boolean m11327a(Activity activity) {
        boolean isInMultiWindowMode;
        AbstractC19074t.m100208f(activity, "activity");
        isInMultiWindowMode = activity.isInMultiWindowMode();
        return isInMultiWindowMode;
    }
}
