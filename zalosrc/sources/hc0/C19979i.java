package hc0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: hc0.i */
/* loaded from: classes6.dex */
public final class C19979i {

    /* renamed from: a */
    private final boolean f98278a;

    public C19979i(boolean z11) {
        this.f98278a = z11;
    }

    /* renamed from: a */
    public final C19979i m103751a(boolean z11) {
        return new C19979i(z11);
    }

    /* renamed from: b */
    public final boolean m103752b() {
        return this.f98278a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C19979i) && this.f98278a == ((C19979i) obj).f98278a;
    }

    public int hashCode() {
        return AbstractC2144f.m11520a(this.f98278a);
    }

    public String toString() {
        return "CheckListSetupZCloudViewState(isLoading=" + this.f98278a + ")";
    }

    public /* synthetic */ C19979i(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
