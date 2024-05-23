package p012a6;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: a6.p */
/* loaded from: classes2.dex */
public abstract class AbstractC0429p extends AbstractC0467r implements Serializable {

    /* renamed from: r */
    private transient Map f1743r;

    /* renamed from: s */
    private transient int f1744s;

    public AbstractC0429p(Map map) {
        if (map.isEmpty()) {
            this.f1743r = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ int m818g(AbstractC0429p abstractC0429p) {
        return abstractC0429p.f1744s;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ Map m819j(AbstractC0429p abstractC0429p) {
        return abstractC0429p.f1743r;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ void m820k(AbstractC0429p abstractC0429p, int i11) {
        abstractC0429p.f1744s = i11;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m821l(AbstractC0429p abstractC0429p, Object obj) {
        Object obj2;
        Map map = abstractC0429p.f1743r;
        map.getClass();
        try {
            obj2 = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            abstractC0429p.f1744s -= size;
        }
    }

    @Override // p012a6.InterfaceC0279h1
    /* renamed from: a */
    public final boolean mo743a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f1743r.get(obj);
        if (collection == null) {
            Collection mo824e = mo824e();
            if (mo824e.add(obj2)) {
                this.f1744s++;
                this.f1743r.put(obj, mo824e);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.f1744s++;
            return true;
        }
        return false;
    }

    @Override // p012a6.AbstractC0467r
    /* renamed from: c */
    final Map mo822c() {
        return new C0277h(this, this.f1743r);
    }

    @Override // p012a6.AbstractC0467r
    /* renamed from: d */
    final Set mo823d() {
        return new C0315j(this, this.f1743r);
    }

    /* renamed from: e */
    public abstract Collection mo824e();

    /* renamed from: f */
    public abstract Collection mo661f(Object obj, Collection collection);

    /* renamed from: h */
    public final Collection m825h(Object obj) {
        Collection collection = (Collection) this.f1743r.get(obj);
        if (collection == null) {
            collection = mo824e();
        }
        return mo661f(obj, collection);
    }

    /* renamed from: i */
    public final List m826i(Object obj, List list, AbstractC0372m abstractC0372m) {
        if (list instanceof RandomAccess) {
            return new C0334k(this, obj, list, abstractC0372m);
        }
        return new C0410o(this, obj, list, abstractC0372m);
    }

    /* renamed from: m */
    public final void m827m() {
        Iterator it = this.f1743r.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f1743r.clear();
        this.f1744s = 0;
    }
}
