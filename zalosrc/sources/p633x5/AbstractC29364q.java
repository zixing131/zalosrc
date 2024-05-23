package p633x5;

import java.util.Set;

/* renamed from: x5.q */
/* loaded from: classes2.dex */
public abstract class AbstractC29364q extends AbstractC29350j implements Set {

    /* renamed from: q */
    private transient AbstractC29356m f135855q;

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
        return AbstractC29380y.m146520a(this);
    }

    /* renamed from: k */
    public final AbstractC29356m m146509k() {
        AbstractC29356m abstractC29356m = this.f135855q;
        if (abstractC29356m == null) {
            AbstractC29356m mo146510l = mo146510l();
            this.f135855q = mo146510l;
            return mo146510l;
        }
        return abstractC29356m;
    }

    /* renamed from: l */
    AbstractC29356m mo146510l() {
        Object[] array = toArray();
        int i11 = AbstractC29356m.f135831r;
        return AbstractC29356m.m146495l(array, array.length);
    }
}
