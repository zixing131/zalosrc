package p407ox;

import android.view.View;

/* renamed from: ox.a */
/* loaded from: classes4.dex */
public abstract class AbstractC24576a {
    /* renamed from: a */
    public static int m128005a(int i11) {
        return m128006b(i11);
    }

    /* renamed from: b */
    private static int m128006b(int i11) {
        return (i11 & 65280) >> 8;
    }

    /* renamed from: c */
    public static void m128007c(View view, Runnable runnable) {
        m128008d(view, runnable);
    }

    /* renamed from: d */
    private static void m128008d(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }
}
