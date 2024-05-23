package p470r2;

/* renamed from: r2.c */
/* loaded from: classes2.dex */
public final class C25617c {

    /* renamed from: a */
    private final boolean f122470a;

    /* renamed from: b */
    private final boolean f122471b;

    /* renamed from: c */
    private final boolean f122472c;

    /* renamed from: d */
    private final boolean f122473d;

    public C25617c(boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f122470a = z11;
        this.f122471b = z12;
        this.f122472c = z13;
        this.f122473d = z14;
    }

    /* renamed from: a */
    public final boolean m132300a() {
        return this.f122470a;
    }

    /* renamed from: b */
    public final boolean m132301b() {
        return this.f122472c;
    }

    /* renamed from: c */
    public final boolean m132302c() {
        return this.f122473d;
    }

    /* renamed from: d */
    public final boolean m132303d() {
        return this.f122471b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25617c)) {
            return false;
        }
        C25617c c25617c = (C25617c) obj;
        return this.f122470a == c25617c.f122470a && this.f122471b == c25617c.f122471b && this.f122472c == c25617c.f122472c && this.f122473d == c25617c.f122473d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.f122470a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        ?? r22 = this.f122471b;
        int i12 = r22;
        if (r22 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        ?? r23 = this.f122472c;
        int i14 = r23;
        if (r23 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        boolean z12 = this.f122473d;
        return i15 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "NetworkState(isConnected=" + this.f122470a + ", isValidated=" + this.f122471b + ", isMetered=" + this.f122472c + ", isNotRoaming=" + this.f122473d + ')';
    }
}
