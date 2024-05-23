package p267jh;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: jh.b */
/* loaded from: classes.dex */
public class C21253b extends AbstractSet implements Set {

    /* renamed from: p */
    private final WeakHashMap f103558p = new WeakHashMap();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        if (this.f103558p.containsKey(obj)) {
            return false;
        }
        this.f103558p.put(obj, null);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f103558p.keySet().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f103558p.containsKey(obj)) {
            return false;
        }
        this.f103558p.remove(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f103558p.size();
    }
}
