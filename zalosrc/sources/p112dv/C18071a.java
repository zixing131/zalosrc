package p112dv;

import androidx.work.AbstractC2147g0;

/* renamed from: dv.a */
/* loaded from: classes4.dex */
public final class C18071a {

    /* renamed from: a */
    private final int f91475a;

    /* renamed from: b */
    private final long f91476b;

    public C18071a(int i11, long j11) {
        this.f91475a = i11;
        this.f91476b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18071a)) {
            return false;
        }
        C18071a c18071a = (C18071a) obj;
        return this.f91475a == c18071a.f91475a && this.f91476b == c18071a.f91476b;
    }

    public int hashCode() {
        return (this.f91475a * 31) + AbstractC2147g0.m11521a(this.f91476b);
    }

    public String toString() {
        return this.f91475a + "," + this.f91476b;
    }
}
