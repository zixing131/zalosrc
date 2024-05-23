package jc0;

import fn0.AbstractC19074t;
import og0.EnumC24251b;

/* renamed from: jc0.b */
/* loaded from: classes6.dex */
public final class C21221b {

    /* renamed from: a */
    private final EnumC24251b f103456a;

    /* renamed from: b */
    private final int f103457b;

    /* renamed from: c */
    private final int f103458c;

    public C21221b(EnumC24251b enumC24251b, int i11, int i12) {
        AbstractC19074t.m100208f(enumC24251b, "feature");
        this.f103456a = enumC24251b;
        this.f103457b = i11;
        this.f103458c = i12;
    }

    /* renamed from: a */
    public final int m109964a() {
        return this.f103458c;
    }

    /* renamed from: b */
    public final EnumC24251b m109965b() {
        return this.f103456a;
    }

    /* renamed from: c */
    public final int m109966c() {
        return this.f103457b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21221b)) {
            return false;
        }
        C21221b c21221b = (C21221b) obj;
        return this.f103456a == c21221b.f103456a && this.f103457b == c21221b.f103457b && this.f103458c == c21221b.f103458c;
    }

    public int hashCode() {
        return (((this.f103456a.hashCode() * 31) + this.f103457b) * 31) + this.f103458c;
    }

    public String toString() {
        return "ZCloudConnectItem(feature=" + this.f103456a + ", titleId=" + this.f103457b + ", descriptionId=" + this.f103458c + ")";
    }
}
