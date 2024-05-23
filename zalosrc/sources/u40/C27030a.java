package u40;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: u40.a */
/* loaded from: classes5.dex */
public final class C27030a {

    /* renamed from: a */
    private final boolean f127673a;

    /* renamed from: b */
    private final boolean f127674b;

    /* renamed from: c */
    private final boolean f127675c;

    public C27030a(boolean z11, boolean z12, boolean z13) {
        this.f127673a = z11;
        this.f127674b = z12;
        this.f127675c = z13;
    }

    /* renamed from: b */
    public static /* synthetic */ C27030a m139171b(C27030a c27030a, boolean z11, boolean z12, boolean z13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = c27030a.f127673a;
        }
        if ((i11 & 2) != 0) {
            z12 = c27030a.f127674b;
        }
        if ((i11 & 4) != 0) {
            z13 = c27030a.f127675c;
        }
        return c27030a.m139172a(z11, z12, z13);
    }

    /* renamed from: a */
    public final C27030a m139172a(boolean z11, boolean z12, boolean z13) {
        return new C27030a(z11, z12, z13);
    }

    /* renamed from: c */
    public final boolean m139173c() {
        return this.f127673a;
    }

    /* renamed from: d */
    public final boolean m139174d() {
        return this.f127675c;
    }

    /* renamed from: e */
    public final boolean m139175e() {
        return this.f127674b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27030a)) {
            return false;
        }
        C27030a c27030a = (C27030a) obj;
        return this.f127673a == c27030a.f127673a && this.f127674b == c27030a.f127674b && this.f127675c == c27030a.f127675c;
    }

    public int hashCode() {
        return (((AbstractC2144f.m11520a(this.f127673a) * 31) + AbstractC2144f.m11520a(this.f127674b)) * 31) + AbstractC2144f.m11520a(this.f127675c);
    }

    public String toString() {
        return "InputBackupPasswordSetupZCloudViewState(isEnableContinueButton=" + this.f127673a + ", isWrongPassword=" + this.f127674b + ", isLoading=" + this.f127675c + ")";
    }

    public /* synthetic */ C27030a(boolean z11, boolean z12, boolean z13, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13);
    }
}
