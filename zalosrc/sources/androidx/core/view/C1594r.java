package androidx.core.view;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.util.AbstractC1482d;
import java.util.List;

/* renamed from: androidx.core.view.r */
/* loaded from: classes2.dex */
public final class C1594r {

    /* renamed from: a */
    private final DisplayCutout f6566a;

    /* renamed from: androidx.core.view.r$a */
    /* loaded from: classes2.dex */
    static class a {
        /* renamed from: a */
        static DisplayCutout m8162a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        /* renamed from: b */
        static List<Rect> m8163b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        /* renamed from: c */
        static int m8164c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        /* renamed from: d */
        static int m8165d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        /* renamed from: e */
        static int m8166e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        /* renamed from: f */
        static int m8167f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    private C1594r(DisplayCutout displayCutout) {
        this.f6566a = displayCutout;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static C1594r m8157e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C1594r(displayCutout);
    }

    /* renamed from: a */
    public int m8158a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m8164c(this.f6566a);
        }
        return 0;
    }

    /* renamed from: b */
    public int m8159b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m8165d(this.f6566a);
        }
        return 0;
    }

    /* renamed from: c */
    public int m8160c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m8166e(this.f6566a);
        }
        return 0;
    }

    /* renamed from: d */
    public int m8161d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.m8167f(this.f6566a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1594r.class == obj.getClass()) {
            return AbstractC1482d.m7475a(this.f6566a, ((C1594r) obj).f6566a);
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f6566a;
        if (displayCutout != null) {
            hashCode = displayCutout.hashCode();
            return hashCode;
        }
        return 0;
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f6566a + "}";
    }
}
