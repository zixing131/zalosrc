package p012a6;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: a6.f */
/* loaded from: classes2.dex */
final class C0239f extends AbstractC0184c1 {

    /* renamed from: p */
    final /* synthetic */ C0277h f1107p;

    public C0239f(C0277h c0277h) {
        this.f1107p = c0277h;
    }

    @Override // p012a6.AbstractC0184c1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f1107p.f1439r.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // p012a6.AbstractC0184c1
    /* renamed from: d */
    final Map mo626d() {
        return this.f1107p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0258g(this.f1107p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC0429p.m821l(this.f1107p.f1440s, entry.getKey());
        return true;
    }
}
