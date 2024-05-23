package p705z5;

import java.util.Set;

/* renamed from: z5.pc */
/* loaded from: classes2.dex */
public abstract class AbstractC31518pc extends AbstractC31460la implements Set {

    /* renamed from: q */
    private transient AbstractC31476mc f145043q;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC31309b.m152216a(this);
    }

    /* renamed from: k */
    public final AbstractC31476mc m152338k() {
        AbstractC31476mc abstractC31476mc = this.f145043q;
        if (abstractC31476mc == null) {
            AbstractC31476mc mo152339l = mo152339l();
            this.f145043q = mo152339l;
            return mo152339l;
        }
        return abstractC31476mc;
    }

    /* renamed from: l */
    AbstractC31476mc mo152339l() {
        return AbstractC31476mc.m152318l(toArray());
    }
}
