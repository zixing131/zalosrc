package p487rl;

import androidx.work.AbstractC2144f;

/* renamed from: rl.g */
/* loaded from: classes3.dex */
public final class C25826g {

    /* renamed from: a */
    private boolean f123215a;

    public C25826g(boolean z11) {
        this.f123215a = z11;
    }

    /* renamed from: a */
    public final boolean m133200a() {
        return this.f123215a;
    }

    /* renamed from: b */
    public final void m133201b(boolean z11) {
        this.f123215a = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25826g) && this.f123215a == ((C25826g) obj).f123215a;
    }

    public int hashCode() {
        return AbstractC2144f.m11520a(this.f123215a);
    }

    public String toString() {
        return "ZCloudConnectItemStatus(isChecked=" + this.f123215a + ")";
    }
}
