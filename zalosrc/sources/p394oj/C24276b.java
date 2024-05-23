package p394oj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: oj.b */
/* loaded from: classes3.dex */
public class C24276b extends ArrayList {
    private static final long serialVersionUID = -1651354340534056755L;

    /* renamed from: p */
    private final HashMap f117239p = new HashMap();

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            C24275a c24275a = (C24275a) it.next();
            if (c24275a != null && this.f117239p.put(c24275a.m126771h(), c24275a) == null) {
                z11 = super.add(c24275a);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f117239p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(C24275a c24275a) {
        if (this.f117239p.put(c24275a.m126771h(), c24275a) == null) {
            return super.add(c24275a);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m126780g(C24275a c24275a) {
        return this.f117239p.containsKey(c24275a.m126771h());
    }

    /* renamed from: j */
    public C24275a m126781j(String str) {
        return (C24275a) this.f117239p.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C24275a remove(int i11) {
        this.f117239p.remove(((C24275a) get(i11)).m126771h());
        return (C24275a) super.remove(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof C24275a) {
            this.f117239p.remove(((C24275a) obj).m126771h());
        }
        return super.remove(obj);
    }
}
