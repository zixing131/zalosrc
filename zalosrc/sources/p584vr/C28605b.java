package p584vr;

import fn0.AbstractC19074t;
import p619wr.InterfaceC29195b;

/* renamed from: vr.b */
/* loaded from: classes4.dex */
public final class C28605b implements InterfaceC28604a {

    /* renamed from: a */
    private final int f132629a;

    /* renamed from: b */
    private final InterfaceC29195b f132630b;

    public C28605b(int i11, InterfaceC29195b interfaceC29195b) {
        AbstractC19074t.m100208f(interfaceC29195b, "feedReactionData");
        this.f132629a = i11;
        this.f132630b = interfaceC29195b;
    }

    /* renamed from: a */
    public final InterfaceC29195b m143020a() {
        return this.f132630b;
    }

    /* renamed from: b */
    public final int m143021b() {
        return this.f132629a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28605b)) {
            return false;
        }
        C28605b c28605b = (C28605b) obj;
        return this.f132629a == c28605b.f132629a && AbstractC19074t.m100204b(this.f132630b, c28605b.f132630b);
    }

    public int hashCode() {
        return (this.f132629a * 31) + this.f132630b.hashCode();
    }

    public String toString() {
        return "OnAvatarClickEvent(position=" + this.f132629a + ", feedReactionData=" + this.f132630b + ")";
    }
}
