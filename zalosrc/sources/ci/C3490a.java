package ci;

import androidx.work.AbstractC2144f;
import au.EnumC2382z;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;

/* renamed from: ci.a */
/* loaded from: classes3.dex */
public final class C3490a {

    /* renamed from: a */
    private final EnumC2382z f14619a;

    /* renamed from: b */
    private final boolean f14620b;

    public C3490a(EnumC2382z enumC2382z, boolean z11) {
        AbstractC19074t.m100208f(enumC2382z, "dataType");
        this.f14619a = enumC2382z;
        this.f14620b = z11;
    }

    /* renamed from: a */
    public final EnumC2382z m17520a() {
        return this.f14619a;
    }

    /* renamed from: b */
    public final boolean m17521b() {
        return this.f14620b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3490a)) {
            return false;
        }
        C3490a c3490a = (C3490a) obj;
        return this.f14619a == c3490a.f14619a && this.f14620b == c3490a.f14620b;
    }

    public int hashCode() {
        return (this.f14619a.hashCode() * 31) + AbstractC2144f.m11520a(this.f14620b);
    }

    public String toString() {
        return "LoadMediaStoreDataParam(dataType=" + this.f14619a + ", isLoadingMore=" + this.f14620b + ")";
    }

    public /* synthetic */ C3490a(EnumC2382z enumC2382z, boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? EnumC2382z.f9945r : enumC2382z, (i11 & 2) != 0 ? false : z11);
    }
}
