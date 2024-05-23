package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* renamed from: androidx.core.view.k0 */
/* loaded from: classes2.dex */
public final class C1567k0 {

    /* renamed from: a */
    private final PointerIcon f6501a;

    /* renamed from: androidx.core.view.k0$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static PointerIcon m7787a(Bitmap bitmap, float f11, float f12) {
            return PointerIcon.create(bitmap, f11, f12);
        }

        /* renamed from: b */
        static PointerIcon m7788b(Context context, int i11) {
            return PointerIcon.getSystemIcon(context, i11);
        }

        /* renamed from: c */
        static PointerIcon m7789c(Resources resources, int i11) {
            return PointerIcon.load(resources, i11);
        }
    }

    private C1567k0(PointerIcon pointerIcon) {
        this.f6501a = pointerIcon;
    }

    /* renamed from: b */
    public static C1567k0 m7785b(Context context, int i11) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new C1567k0(a.m7788b(context, i11));
        }
        return new C1567k0(null);
    }

    /* renamed from: a */
    public Object m7786a() {
        return this.f6501a;
    }
}
