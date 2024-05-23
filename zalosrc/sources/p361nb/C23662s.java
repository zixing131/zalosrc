package p361nb;

import fn0.AbstractC19074t;

/* renamed from: nb.s */
/* loaded from: classes3.dex */
public final class C23662s {

    /* renamed from: a */
    private final EnumC23663t f114621a;

    /* renamed from: b */
    private final EnumC23654k f114622b;

    /* renamed from: c */
    private final int f114623c;

    public C23662s(EnumC23663t enumC23663t, EnumC23654k enumC23654k, int i11) {
        AbstractC19074t.m100208f(enumC23663t, "se");
        AbstractC19074t.m100208f(enumC23654k, "delType");
        this.f114621a = enumC23663t;
        this.f114622b = enumC23654k;
        this.f114623c = i11;
    }

    /* renamed from: a */
    public final EnumC23654k m123982a() {
        return this.f114622b;
    }

    /* renamed from: b */
    public final int m123983b() {
        return this.f114623c;
    }

    /* renamed from: c */
    public final EnumC23663t m123984c() {
        return this.f114621a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23662s)) {
            return false;
        }
        C23662s c23662s = (C23662s) obj;
        return this.f114621a == c23662s.f114621a && this.f114622b == c23662s.f114622b && this.f114623c == c23662s.f114623c;
    }

    public int hashCode() {
        return (((this.f114621a.hashCode() * 31) + this.f114622b.hashCode()) * 31) + this.f114623c;
    }

    public String toString() {
        return "MessageRemoveLogExtraParam(se=" + this.f114621a + ", delType=" + this.f114622b + ", numOfGroupMember=" + this.f114623c + ")";
    }
}
