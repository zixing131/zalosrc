package p451qk;

import com.zing.zalo.zinstant.zom.meta.ZinstantMetaConstant;
import fn0.AbstractC19074t;

/* renamed from: qk.a */
/* loaded from: classes3.dex */
public final class C25304a {

    /* renamed from: a */
    private final String f121359a;

    /* renamed from: b */
    private final String f121360b;

    public C25304a(String str, String str2) {
        AbstractC19074t.m100208f(str, ZinstantMetaConstant.IMPRESSION_META_TYPE);
        AbstractC19074t.m100208f(str2, "subType");
        this.f121359a = str;
        this.f121360b = str2;
    }

    /* renamed from: a */
    public final String m130960a() {
        return this.f121360b;
    }

    /* renamed from: b */
    public final String m130961b() {
        return this.f121359a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25304a)) {
            return false;
        }
        C25304a c25304a = (C25304a) obj;
        return AbstractC19074t.m100204b(this.f121359a, c25304a.f121359a) && AbstractC19074t.m100204b(this.f121360b, c25304a.f121360b);
    }

    public int hashCode() {
        return (this.f121359a.hashCode() * 31) + this.f121360b.hashCode();
    }

    public String toString() {
        return "NotificationId(type=" + this.f121359a + ", subType=" + this.f121360b + ")";
    }
}
