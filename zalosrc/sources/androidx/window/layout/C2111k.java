package androidx.window.layout;

import android.view.DisplayCutout;
import fn0.AbstractC19074t;

/* renamed from: androidx.window.layout.k */
/* loaded from: classes2.dex */
public final class C2111k {

    /* renamed from: a */
    public static final C2111k f8978a = new C2111k();

    private C2111k() {
    }

    /* renamed from: a */
    public final int m11348a(DisplayCutout displayCutout) {
        int safeInsetBottom;
        AbstractC19074t.m100208f(displayCutout, "displayCutout");
        safeInsetBottom = displayCutout.getSafeInsetBottom();
        return safeInsetBottom;
    }

    /* renamed from: b */
    public final int m11349b(DisplayCutout displayCutout) {
        int safeInsetLeft;
        AbstractC19074t.m100208f(displayCutout, "displayCutout");
        safeInsetLeft = displayCutout.getSafeInsetLeft();
        return safeInsetLeft;
    }

    /* renamed from: c */
    public final int m11350c(DisplayCutout displayCutout) {
        int safeInsetRight;
        AbstractC19074t.m100208f(displayCutout, "displayCutout");
        safeInsetRight = displayCutout.getSafeInsetRight();
        return safeInsetRight;
    }

    /* renamed from: d */
    public final int m11351d(DisplayCutout displayCutout) {
        int safeInsetTop;
        AbstractC19074t.m100208f(displayCutout, "displayCutout");
        safeInsetTop = displayCutout.getSafeInsetTop();
        return safeInsetTop;
    }
}
