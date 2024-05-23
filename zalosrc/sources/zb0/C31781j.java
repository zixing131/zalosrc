package zb0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: zb0.j */
/* loaded from: classes6.dex */
public final class C31781j {

    /* renamed from: a */
    private final boolean f145917a;

    public C31781j(boolean z11) {
        this.f145917a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C31781j) && this.f145917a == ((C31781j) obj).f145917a;
    }

    public int hashCode() {
        return AbstractC2144f.m11520a(this.f145917a);
    }

    public String toString() {
        return "ZCloudGPProcessingDataViewState(isLoading=" + this.f145917a + ")";
    }

    public /* synthetic */ C31781j(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
