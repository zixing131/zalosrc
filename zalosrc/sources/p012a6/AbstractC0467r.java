package p012a6;

import java.util.Map;
import java.util.Set;

/* renamed from: a6.r */
/* loaded from: classes2.dex */
abstract class AbstractC0467r implements InterfaceC0279h1 {

    /* renamed from: p */
    private transient Set f1833p;

    /* renamed from: q */
    private transient Map f1834q;

    /* renamed from: c */
    abstract Map mo822c();

    /* renamed from: d */
    abstract Set mo823d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC0279h1)) {
            return false;
        }
        return zzn().equals(((InterfaceC0279h1) obj).zzn());
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    @Override // p012a6.InterfaceC0279h1
    public final Map zzn() {
        Map map = this.f1834q;
        if (map == null) {
            Map mo822c = mo822c();
            this.f1834q = mo822c;
            return mo822c;
        }
        return map;
    }

    @Override // p012a6.InterfaceC0279h1
    public final Set zzo() {
        Set set = this.f1833p;
        if (set == null) {
            Set mo823d = mo823d();
            this.f1833p = mo823d;
            return mo823d;
        }
        return set;
    }
}
