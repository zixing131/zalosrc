package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* renamed from: androidx.core.widget.f */
/* loaded from: classes2.dex */
public abstract class AbstractC1634f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.widget.f$a */
    /* loaded from: classes2.dex */
    public static class a {
        /* renamed from: a */
        static void m8385a(EdgeEffect edgeEffect, float f11, float f12) {
            edgeEffect.onPull(f11, f12);
        }
    }

    /* renamed from: androidx.core.widget.f$b */
    /* loaded from: classes2.dex */
    private static class b {
        /* renamed from: a */
        public static EdgeEffect m8386a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        /* renamed from: b */
        public static float m8387b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        /* renamed from: c */
        public static float m8388c(EdgeEffect edgeEffect, float f11, float f12) {
            try {
                return edgeEffect.onPullDistance(f11, f12);
            } catch (Throwable unused) {
                edgeEffect.onPull(f11, f12);
                return 0.0f;
            }
        }
    }

    /* renamed from: a */
    public static EdgeEffect m8381a(Context context, AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m8386a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    /* renamed from: b */
    public static float m8382b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m8387b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static void m8383c(EdgeEffect edgeEffect, float f11, float f12) {
        a.m8385a(edgeEffect, f11, f12);
    }

    /* renamed from: d */
    public static float m8384d(EdgeEffect edgeEffect, float f11, float f12) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b.m8388c(edgeEffect, f11, f12);
        }
        m8383c(edgeEffect, f11, f12);
        return f11;
    }
}
