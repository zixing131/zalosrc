package ci;

import androidx.work.AbstractC2144f;

/* renamed from: ci.s */
/* loaded from: classes3.dex */
public final class C3524s {

    /* renamed from: a */
    private final boolean f14797a;

    /* renamed from: b */
    private final boolean f14798b;

    /* renamed from: c */
    private final boolean f14799c;

    public C3524s(boolean z11, boolean z12, boolean z13) {
        this.f14797a = z11;
        this.f14798b = z12;
        this.f14799c = z13;
    }

    /* renamed from: a */
    public final boolean m17833a() {
        return this.f14798b || this.f14797a;
    }

    /* renamed from: b */
    public final boolean m17834b() {
        return this.f14798b;
    }

    /* renamed from: c */
    public final boolean m17835c() {
        return this.f14797a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3524s)) {
            return false;
        }
        C3524s c3524s = (C3524s) obj;
        return this.f14797a == c3524s.f14797a && this.f14798b == c3524s.f14798b && this.f14799c == c3524s.f14799c;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f14797a) * 31) + AbstractC2144f.m11520a(this.f14798b)) * 31) + AbstractC2144f.m11520a(this.f14799c);
    }

    public String toString() {
        return "MSRemoveItemPolicy(deleteForMeOnlyEnabled=" + this.f14797a + ", deleteForEveryOneEnabled=" + this.f14798b + ", mayShowDeleteForEveryOneDescription=" + this.f14799c + ")";
    }
}
