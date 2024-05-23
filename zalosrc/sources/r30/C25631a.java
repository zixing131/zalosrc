package r30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: r30.a */
/* loaded from: classes5.dex */
public class C25631a extends ArrayList {

    /* renamed from: p */
    private final Set f122581p = new HashSet();

    /* renamed from: g */
    private boolean m132453g(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str != null && this.f122581p.add(str)) {
                z11 = super.add(str);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return m132453g(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f122581p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (obj instanceof String) {
            return this.f122581p.contains(obj);
        }
        return super.contains(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(String str) {
        if (this.f122581p.add(str)) {
            return super.add(str);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String remove(int i11) {
        this.f122581p.remove(get(i11));
        return (String) super.remove(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof String) {
            this.f122581p.remove(obj);
        }
        return super.remove(obj);
    }
}
