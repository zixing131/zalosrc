package p398oo;

import fn0.AbstractC19074t;
import java.util.List;

/* renamed from: oo.z */
/* loaded from: classes4.dex */
public final class C24385z {

    /* renamed from: a */
    private final List f117747a;

    /* renamed from: b */
    private final int f117748b;

    public C24385z(List list, int i11) {
        AbstractC19074t.m100208f(list, "listUsers");
        this.f117747a = list;
        this.f117748b = i11;
    }

    /* renamed from: a */
    public final int m127538a() {
        return this.f117748b;
    }

    /* renamed from: b */
    public final List m127539b() {
        return this.f117747a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24385z)) {
            return false;
        }
        C24385z c24385z = (C24385z) obj;
        return AbstractC19074t.m100204b(this.f117747a, c24385z.f117747a) && this.f117748b == c24385z.f117748b;
    }

    public int hashCode() {
        return (this.f117747a.hashCode() * 31) + this.f117748b;
    }

    public String toString() {
        return "ResultApiGetSuggestUsersTabOther(listUsers=" + this.f117747a + ", expiredTime=" + this.f117748b + ")";
    }
}
