package a10;

import com.zing.zalo.shortvideo.data.model.User;
import fn0.AbstractC19074t;

/* renamed from: a10.q */
/* loaded from: classes5.dex */
public final class C0052q {

    /* renamed from: a */
    private final String f194a;

    /* renamed from: b */
    private final User f195b;

    public C0052q(String str, User user) {
        AbstractC19074t.m100208f(str, "userId");
        this.f194a = str;
        this.f195b = user;
    }

    /* renamed from: a */
    public final User m152a() {
        return this.f195b;
    }

    /* renamed from: b */
    public final String m153b() {
        return this.f194a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0052q)) {
            return false;
        }
        C0052q c0052q = (C0052q) obj;
        return AbstractC19074t.m100204b(this.f194a, c0052q.f194a) && AbstractC19074t.m100204b(this.f195b, c0052q.f195b);
    }

    public int hashCode() {
        int hashCode = this.f194a.hashCode() * 31;
        User user = this.f195b;
        return hashCode + (user == null ? 0 : user.hashCode());
    }

    public String toString() {
        return "UserTable(userId=" + this.f194a + ", user=" + this.f195b + ")";
    }
}
