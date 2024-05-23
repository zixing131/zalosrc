package p670y5;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: y5.o1 */
/* loaded from: classes2.dex */
abstract class AbstractC30565o1 extends AbstractMap {

    /* renamed from: p */
    private transient Set f141572p;

    /* renamed from: q */
    private transient Collection f141573q;

    /* renamed from: a */
    abstract Set mo149592a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f141572p;
        if (set == null) {
            Set mo149592a = mo149592a();
            this.f141572p = mo149592a;
            return mo149592a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f141573q;
        if (collection == null) {
            C30546n1 c30546n1 = new C30546n1(this);
            this.f141573q = c30546n1;
            return c30546n1;
        }
        return collection;
    }
}
