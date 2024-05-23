package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* renamed from: androidx.core.view.z0 */
/* loaded from: classes2.dex */
public abstract class AbstractC1623z0 {

    /* renamed from: androidx.core.view.z0$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static void m8282a(Window window, boolean z11) {
            int i11;
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z11) {
                i11 = systemUiVisibility & (-1793);
            } else {
                i11 = systemUiVisibility | 1792;
            }
            decorView.setSystemUiVisibility(i11);
        }
    }

    /* renamed from: androidx.core.view.z0$b */
    /* loaded from: classes2.dex */
    static class b {
        /* renamed from: a */
        static void m8283a(Window window, boolean z11) {
            window.setDecorFitsSystemWindows(z11);
        }
    }

    /* renamed from: a */
    public static C1593q2 m8280a(Window window, View view) {
        return new C1593q2(window, view);
    }

    /* renamed from: b */
    public static void m8281b(Window window, boolean z11) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.m8283a(window, z11);
        } else {
            a.m8282a(window, z11);
        }
    }
}
