package p670y5;

import java.util.Set;

/* renamed from: y5.h1 */
/* loaded from: classes2.dex */
public abstract class AbstractC30432h1 extends AbstractC30754y0 implements Set {

    /* renamed from: q */
    private transient AbstractC30375e1 f141206q;

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
        return AbstractC30774z1.m149737a(this);
    }

    /* renamed from: k */
    public final AbstractC30375e1 m149526k() {
        AbstractC30375e1 abstractC30375e1 = this.f141206q;
        if (abstractC30375e1 == null) {
            AbstractC30375e1 mo149527l = mo149527l();
            this.f141206q = mo149527l;
            return mo149527l;
        }
        return abstractC30375e1;
    }

    /* renamed from: l */
    AbstractC30375e1 mo149527l() {
        Object[] array = toArray();
        int i11 = AbstractC30375e1.f140820r;
        return AbstractC30375e1.m149492l(array, array.length);
    }
}
