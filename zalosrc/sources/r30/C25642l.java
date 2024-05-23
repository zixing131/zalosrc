package r30;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import p716zh.C31874cb;

/* renamed from: r30.l */
/* loaded from: classes5.dex */
public class C25642l extends ArrayList {

    /* renamed from: p */
    private final HashMap f122614p = new HashMap();

    /* renamed from: k */
    private boolean m132529k(Collection collection) {
        Iterator it = collection.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            C31874cb c31874cb = (C31874cb) it.next();
            if (c31874cb != null && this.f122614p.put(c31874cb.f146385a, c31874cb) == null) {
                z11 = super.add(c31874cb);
            }
        }
        return z11;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return m132529k(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f122614p.clear();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean add(C31874cb c31874cb) {
        if (this.f122614p.put(c31874cb.f146385a, c31874cb) == null) {
            return super.add(c31874cb);
        }
        return false;
    }

    /* renamed from: g */
    public boolean m132531g(String str) {
        return this.f122614p.containsKey(str);
    }

    /* renamed from: j */
    public C31874cb m132532j(String str) {
        return (C31874cb) this.f122614p.get(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C31874cb remove(int i11) {
        this.f122614p.remove(((C31874cb) get(i11)).f146385a);
        return (C31874cb) super.remove(i11);
    }

    /* renamed from: m */
    public boolean m132534m(String str) {
        if (!TextUtils.isEmpty(str) && this.f122614p.containsKey(str)) {
            return super.remove((C31874cb) this.f122614p.remove(str));
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        if (obj instanceof C31874cb) {
            this.f122614p.remove(((C31874cb) obj).f146385a);
        }
        return super.remove(obj);
    }
}
