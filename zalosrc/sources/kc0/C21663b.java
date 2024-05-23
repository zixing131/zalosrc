package kc0;

import androidx.work.AbstractC2144f;
import fn0.AbstractC19060k;

/* renamed from: kc0.b */
/* loaded from: classes6.dex */
public final class C21663b {

    /* renamed from: a */
    private final boolean f105115a;

    public C21663b(boolean z11) {
        this.f105115a = z11;
    }

    /* renamed from: a */
    public final C21663b m111655a(boolean z11) {
        return new C21663b(z11);
    }

    /* renamed from: b */
    public final boolean m111656b() {
        return this.f105115a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C21663b) && this.f105115a == ((C21663b) obj).f105115a;
    }

    public int hashCode() {
        return AbstractC2144f.m11520a(this.f105115a);
    }

    public String toString() {
        return "KeepBackupDataZCloudUiState(isLoading=" + this.f105115a + ")";
    }

    public /* synthetic */ C21663b(boolean z11, int i11, AbstractC19060k abstractC19060k) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
