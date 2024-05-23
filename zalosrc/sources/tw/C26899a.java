package tw;

import fn0.AbstractC19060k;

/* renamed from: tw.a */
/* loaded from: classes4.dex */
public final class C26899a {

    /* renamed from: a */
    private int f127297a;

    public C26899a(int i11) {
        this.f127297a = i11;
    }

    /* renamed from: a */
    public final int m138633a() {
        return this.f127297a;
    }

    /* renamed from: b */
    public final void m138634b(int i11) {
        this.f127297a = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C26899a) && this.f127297a == ((C26899a) obj).f127297a;
    }

    public int hashCode() {
        return this.f127297a;
    }

    public String toString() {
        return "CurrentIndex(value=" + this.f127297a + ")";
    }

    public /* synthetic */ C26899a(int i11, int i12, AbstractC19060k abstractC19060k) {
        this((i12 & 1) != 0 ? 0 : i11);
    }
}
