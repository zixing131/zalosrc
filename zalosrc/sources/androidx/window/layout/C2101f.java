package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import fn0.AbstractC19074t;

/* renamed from: androidx.window.layout.f */
/* loaded from: classes2.dex */
public final class C2101f {

    /* renamed from: a */
    public static final C2101f f8971a = new C2101f();

    private C2101f() {
    }

    /* renamed from: a */
    public final void m11336a(Display display, Point point) {
        AbstractC19074t.m100208f(display, "display");
        AbstractC19074t.m100208f(point, "point");
        display.getRealSize(point);
    }
}
