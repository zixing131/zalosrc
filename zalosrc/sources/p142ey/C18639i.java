package p142ey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p716zh.C32178x9;

/* renamed from: ey.i */
/* loaded from: classes.dex */
public class C18639i extends ArrayList {

    /* renamed from: p */
    private final HashMap f93805p = new HashMap();

    /* renamed from: j */
    private boolean m98512j(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            C32178x9 c32178x9 = (C32178x9) it.next();
            if (c32178x9 != null && this.f93805p.put(Integer.valueOf(c32178x9.f148384r), c32178x9) == null) {
                z11 = super.add(c32178x9);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return m98512j(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f93805p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(C32178x9 c32178x9) {
        if (this.f93805p.put(Integer.valueOf(c32178x9.f148384r), c32178x9) == null) {
            return super.add(c32178x9);
        }
        return false;
    }

    /* renamed from: g */
    public C32178x9 m98514g(int i11) {
        return (C32178x9) this.f93805p.get(Integer.valueOf(i11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C32178x9 remove(int i11) {
        this.f93805p.remove(Integer.valueOf(((C32178x9) get(i11)).f148384r));
        return (C32178x9) super.remove(i11);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof C32178x9) {
            this.f93805p.remove(Integer.valueOf(((C32178x9) obj).f148384r));
        }
        return super.remove(obj);
    }
}
