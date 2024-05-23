package p012a6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: a6.f1 */
/* loaded from: classes2.dex */
abstract class AbstractC0241f1 extends AbstractMap {

    /* renamed from: p */
    private transient Set f1118p;

    /* renamed from: q */
    private transient Collection f1119q;

    /* renamed from: a */
    abstract Set mo715a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f1118p;
        if (set == null) {
            Set mo715a = mo715a();
            this.f1118p = mo715a;
            return mo715a;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f1119q;
        if (collection == null) {
            C0222e1 c0222e1 = new C0222e1(this);
            this.f1119q = c0222e1;
            return c0222e1;
        }
        return collection;
    }
}
