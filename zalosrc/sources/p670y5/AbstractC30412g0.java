package p670y5;

import java.util.Map;
import java.util.Set;

/* renamed from: y5.g0 */
/* loaded from: classes2.dex */
abstract class AbstractC30412g0 implements InterfaceC30603q1 {

    /* renamed from: p */
    private transient Set f141158p;

    /* renamed from: q */
    private transient Map f141159q;

    /* renamed from: c */
    abstract Map mo149485c();

    /* renamed from: d */
    abstract Set mo149486d();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC30603q1)) {
            return false;
        }
        return zzn().equals(((InterfaceC30603q1) obj).zzn());
    }

    public final int hashCode() {
        return zzn().hashCode();
    }

    public final String toString() {
        return zzn().toString();
    }

    @Override // p670y5.InterfaceC30603q1
    public final Map zzn() {
        Map map = this.f141159q;
        if (map == null) {
            Map mo149485c = mo149485c();
            this.f141159q = mo149485c;
            return mo149485c;
        }
        return map;
    }

    @Override // p670y5.InterfaceC30603q1
    public final Set zzo() {
        Set set = this.f141158p;
        if (set == null) {
            Set mo149486d = mo149486d();
            this.f141158p = mo149486d;
            return mo149486d;
        }
        return set;
    }
}
