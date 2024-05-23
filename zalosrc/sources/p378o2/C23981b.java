package p378o2;

import android.graphics.Rect;
import fn0.AbstractC19074t;

/* renamed from: o2.b */
/* loaded from: classes2.dex */
public final class C23981b {

    /* renamed from: a */
    private final int f116057a;

    /* renamed from: b */
    private final int f116058b;

    /* renamed from: c */
    private final int f116059c;

    /* renamed from: d */
    private final int f116060d;

    public C23981b(int i11, int i12, int i13, int i14) {
        this.f116057a = i11;
        this.f116058b = i12;
        this.f116059c = i13;
        this.f116060d = i14;
    }

    /* renamed from: a */
    public final int m125486a() {
        return this.f116060d - this.f116058b;
    }

    /* renamed from: b */
    public final int m125487b() {
        return this.f116057a;
    }

    /* renamed from: c */
    public final int m125488c() {
        return this.f116058b;
    }

    /* renamed from: d */
    public final int m125489d() {
        return this.f116059c - this.f116057a;
    }

    /* renamed from: e */
    public final boolean m125490e() {
        if (m125486a() == 0 && m125489d() == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            cls = null;
        } else {
            cls = obj.getClass();
        }
        if (!AbstractC19074t.m100204b(C23981b.class, cls)) {
            return false;
        }
        if (obj != null) {
            C23981b c23981b = (C23981b) obj;
            if (this.f116057a == c23981b.f116057a && this.f116058b == c23981b.f116058b && this.f116059c == c23981b.f116059c && this.f116060d == c23981b.f116060d) {
                return true;
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
    }

    /* renamed from: f */
    public final Rect m125491f() {
        return new Rect(this.f116057a, this.f116058b, this.f116059c, this.f116060d);
    }

    public int hashCode() {
        return (((((this.f116057a * 31) + this.f116058b) * 31) + this.f116059c) * 31) + this.f116060d;
    }

    public String toString() {
        return ((Object) C23981b.class.getSimpleName()) + " { [" + this.f116057a + ',' + this.f116058b + ',' + this.f116059c + ',' + this.f116060d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C23981b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        AbstractC19074t.m100208f(rect, "rect");
    }
}
