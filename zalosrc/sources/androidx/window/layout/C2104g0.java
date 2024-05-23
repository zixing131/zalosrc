package androidx.window.layout;

import android.graphics.Rect;
import fn0.AbstractC19074t;
import p378o2.C23981b;

/* renamed from: androidx.window.layout.g0 */
/* loaded from: classes2.dex */
public final class C2104g0 {

    /* renamed from: a */
    private final C23981b f8973a;

    public C2104g0(C23981b c23981b) {
        AbstractC19074t.m100208f(c23981b, "_bounds");
        this.f8973a = c23981b;
    }

    /* renamed from: a */
    public final Rect m11339a() {
        return this.f8973a.m125491f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC19074t.m100204b(C2104g0.class, obj.getClass())) {
            return AbstractC19074t.m100204b(this.f8973a, ((C2104g0) obj).f8973a);
        }
        return false;
    }

    public int hashCode() {
        return this.f8973a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + m11339a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2104g0(Rect rect) {
        this(new C23981b(rect));
        AbstractC19074t.m100208f(rect, "bounds");
    }
}
