package p278jv;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: jv.c */
/* loaded from: classes4.dex */
public final class C21369c {

    /* renamed from: a */
    private final boolean f104223a;

    /* renamed from: b */
    private final int f104224b;

    /* renamed from: c */
    private final boolean f104225c;

    /* renamed from: d */
    private final int f104226d;

    public C21369c(boolean z11, int i11, boolean z12, int i12) {
        this.f104223a = z11;
        this.f104224b = i11;
        this.f104225c = z12;
        this.f104226d = i12;
    }

    /* renamed from: b */
    public static /* synthetic */ C21369c m110759b(C21369c c21369c, boolean z11, int i11, boolean z12, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z11 = c21369c.f104223a;
        }
        if ((i13 & 2) != 0) {
            i11 = c21369c.f104224b;
        }
        if ((i13 & 4) != 0) {
            z12 = c21369c.f104225c;
        }
        if ((i13 & 8) != 0) {
            i12 = c21369c.f104226d;
        }
        return c21369c.m110760a(z11, i11, z12, i12);
    }

    /* renamed from: a */
    public final C21369c m110760a(boolean z11, int i11, boolean z12, int i12) {
        return new C21369c(z11, i11, z12, i12);
    }

    /* renamed from: c */
    public final int m110761c() {
        return this.f104226d;
    }

    /* renamed from: d */
    public final int m110762d() {
        return this.f104224b;
    }

    /* renamed from: e */
    public final boolean m110763e() {
        return this.f104225c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21369c)) {
            return false;
        }
        C21369c c21369c = (C21369c) obj;
        return this.f104223a == c21369c.f104223a && this.f104224b == c21369c.f104224b && this.f104225c == c21369c.f104225c && this.f104226d == c21369c.f104226d;
    }

    /* renamed from: f */
    public final boolean m110764f() {
        return this.f104223a;
    }

    public int hashCode() {
        return (((((AbstractC2144f.m11520a(this.f104223a) * 31) + this.f104224b) * 31) + AbstractC2144f.m11520a(this.f104225c)) * 31) + this.f104226d;
    }

    public String toString() {
        return "LoadingViewState(isLoading=" + this.f104223a + ", progress=" + this.f104224b + ", isError=" + this.f104225c + ", errorCode=" + this.f104226d + ")";
    }

    public /* synthetic */ C21369c(boolean z11, int i11, boolean z12, int i12, int i13, AbstractC19060k abstractC19060k) {
        this((i13 & 1) != 0 ? false : z11, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? 0 : i12);
    }
}
