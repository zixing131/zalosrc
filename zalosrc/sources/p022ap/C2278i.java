package p022ap;

import bo.InterfaceC3058y;
import fn0.AbstractC19074t;

/* renamed from: ap.i */
/* loaded from: classes4.dex */
public final class C2278i implements InterfaceC3058y {

    /* renamed from: a */
    private final String f9631a;

    public C2278i(String str) {
        AbstractC19074t.m100208f(str, "text");
        this.f9631a = str;
    }

    /* renamed from: a */
    public final String m12005a() {
        return this.f9631a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2278i) && AbstractC19074t.m100204b(this.f9631a, ((C2278i) obj).f9631a);
    }

    public int hashCode() {
        return this.f9631a.hashCode();
    }

    public String toString() {
        return "EventSearchNameMoveTabUser(text=" + this.f9631a + ")";
    }
}
