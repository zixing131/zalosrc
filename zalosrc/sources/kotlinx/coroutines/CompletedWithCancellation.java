package kotlinx.coroutines;

import en0.InterfaceC18505l;
import fn0.AbstractC19074t;

/* loaded from: classes7.dex */
public final class CompletedWithCancellation {

    /* renamed from: a */
    public final Object f105829a;

    /* renamed from: b */
    public final InterfaceC18505l f105830b;

    public CompletedWithCancellation(Object obj, InterfaceC18505l interfaceC18505l) {
        this.f105829a = obj;
        this.f105830b = interfaceC18505l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedWithCancellation)) {
            return false;
        }
        CompletedWithCancellation completedWithCancellation = (CompletedWithCancellation) obj;
        return AbstractC19074t.m100204b(this.f105829a, completedWithCancellation.f105829a) && AbstractC19074t.m100204b(this.f105830b, completedWithCancellation.f105830b);
    }

    public int hashCode() {
        Object obj = this.f105829a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f105830b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f105829a + ", onCancellation=" + this.f105830b + ')';
    }
}
