package p012a6;

import java.util.Set;

/* renamed from: a6.s0 */
/* loaded from: classes2.dex */
public abstract class AbstractC0487s0 extends AbstractC0335k0 implements Set {

    /* renamed from: q */
    private transient AbstractC0430p0 f1870q;

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
        return AbstractC0450q1.m843a(this);
    }

    /* renamed from: k */
    public final AbstractC0430p0 m871k() {
        AbstractC0430p0 abstractC0430p0 = this.f1870q;
        if (abstractC0430p0 == null) {
            AbstractC0430p0 mo781l = mo781l();
            this.f1870q = mo781l;
            return mo781l;
        }
        return abstractC0430p0;
    }

    /* renamed from: l */
    AbstractC0430p0 mo781l() {
        Object[] array = toArray();
        int i11 = AbstractC0430p0.f1746r;
        return AbstractC0430p0.m828l(array, array.length);
    }
}
