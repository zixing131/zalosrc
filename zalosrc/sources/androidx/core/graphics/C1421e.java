package androidx.core.graphics;

import android.graphics.Insets;
import android.graphics.Rect;

/* renamed from: androidx.core.graphics.e */
/* loaded from: classes.dex */
public final class C1421e {

    /* renamed from: e */
    public static final C1421e f6229e = new C1421e(0, 0, 0, 0);

    /* renamed from: a */
    public final int f6230a;

    /* renamed from: b */
    public final int f6231b;

    /* renamed from: c */
    public final int f6232c;

    /* renamed from: d */
    public final int f6233d;

    /* renamed from: androidx.core.graphics.e$a */
    /* loaded from: classes.dex */
    static class a {
        /* renamed from: a */
        static Insets m7235a(int i11, int i12, int i13, int i14) {
            return Insets.of(i11, i12, i13, i14);
        }
    }

    private C1421e(int i11, int i12, int i13, int i14) {
        this.f6230a = i11;
        this.f6231b = i12;
        this.f6232c = i13;
        this.f6233d = i14;
    }

    /* renamed from: a */
    public static C1421e m7229a(C1421e c1421e, C1421e c1421e2) {
        return m7230b(Math.max(c1421e.f6230a, c1421e2.f6230a), Math.max(c1421e.f6231b, c1421e2.f6231b), Math.max(c1421e.f6232c, c1421e2.f6232c), Math.max(c1421e.f6233d, c1421e2.f6233d));
    }

    /* renamed from: b */
    public static C1421e m7230b(int i11, int i12, int i13, int i14) {
        if (i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return f6229e;
        }
        return new C1421e(i11, i12, i13, i14);
    }

    /* renamed from: c */
    public static C1421e m7231c(Rect rect) {
        return m7230b(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: d */
    public static C1421e m7232d(C1421e c1421e, C1421e c1421e2) {
        return m7230b(c1421e.f6230a - c1421e2.f6230a, c1421e.f6231b - c1421e2.f6231b, c1421e.f6232c - c1421e2.f6232c, c1421e.f6233d - c1421e2.f6233d);
    }

    /* renamed from: e */
    public static C1421e m7233e(Insets insets) {
        int i11;
        int i12;
        int i13;
        int i14;
        i11 = insets.left;
        i12 = insets.top;
        i13 = insets.right;
        i14 = insets.bottom;
        return m7230b(i11, i12, i13, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1421e.class != obj.getClass()) {
            return false;
        }
        C1421e c1421e = (C1421e) obj;
        if (this.f6233d == c1421e.f6233d && this.f6230a == c1421e.f6230a && this.f6232c == c1421e.f6232c && this.f6231b == c1421e.f6231b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public Insets m7234f() {
        return a.m7235a(this.f6230a, this.f6231b, this.f6232c, this.f6233d);
    }

    public int hashCode() {
        return (((((this.f6230a * 31) + this.f6231b) * 31) + this.f6232c) * 31) + this.f6233d;
    }

    public String toString() {
        return "Insets{left=" + this.f6230a + ", top=" + this.f6231b + ", right=" + this.f6232c + ", bottom=" + this.f6233d + '}';
    }
}
