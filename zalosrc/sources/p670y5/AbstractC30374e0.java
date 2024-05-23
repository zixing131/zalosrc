package p670y5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: y5.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC30374e0 extends AbstractC30412g0 implements Serializable {

    /* renamed from: r */
    private transient Map f140817r;

    /* renamed from: s */
    private transient int f140818s;

    public AbstractC30374e0(Map map) {
        if (map.isEmpty()) {
            this.f140817r = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: g */
    public static /* bridge */ /* synthetic */ int m149480g(AbstractC30374e0 abstractC30374e0) {
        return abstractC30374e0.f140818s;
    }

    /* renamed from: j */
    public static /* bridge */ /* synthetic */ Map m149481j(AbstractC30374e0 abstractC30374e0) {
        return abstractC30374e0.f140817r;
    }

    /* renamed from: k */
    public static /* bridge */ /* synthetic */ void m149482k(AbstractC30374e0 abstractC30374e0, int i11) {
        abstractC30374e0.f140818s = i11;
    }

    /* renamed from: l */
    public static /* bridge */ /* synthetic */ void m149483l(AbstractC30374e0 abstractC30374e0, Object obj) {
        Object obj2;
        Map map = abstractC30374e0.f140817r;
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
            abstractC30374e0.f140818s -= size;
        }
    }

    @Override // p670y5.InterfaceC30603q1
    /* renamed from: a */
    public final boolean mo149484a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f140817r.get(obj);
        if (collection == null) {
            Collection mo149487e = mo149487e();
            if (mo149487e.add(obj2)) {
                this.f140818s++;
                this.f140817r.put(obj, mo149487e);
                return true;
            }
            throw new AssertionError("New Collection violated the Collection spec");
        }
        if (collection.add(obj2)) {
            this.f140818s++;
            return true;
        }
        return false;
    }

    @Override // p670y5.AbstractC30412g0
    /* renamed from: c */
    final Map mo149485c() {
        return new C30696v(this, this.f140817r);
    }

    @Override // p670y5.AbstractC30412g0
    /* renamed from: d */
    final Set mo149486d() {
        return new C30734x(this, this.f140817r);
    }

    /* renamed from: e */
    public abstract Collection mo149487e();

    /* renamed from: f */
    public abstract Collection mo149488f(Object obj, Collection collection);

    /* renamed from: h */
    public final Collection m149489h(Object obj) {
        Collection collection = (Collection) this.f140817r.get(obj);
        if (collection == null) {
            collection = mo149487e();
        }
        return mo149488f(obj, collection);
    }

    /* renamed from: i */
    public final List m149490i(Object obj, List list, AbstractC30317b0 abstractC30317b0) {
        if (list instanceof RandomAccess) {
            return new C30753y(this, obj, list, abstractC30317b0);
        }
        return new C30355d0(this, obj, list, abstractC30317b0);
    }

    /* renamed from: m */
    public final void m149491m() {
        Iterator it = this.f140817r.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f140817r.clear();
        this.f140818s = 0;
    }
}
