package p670y5;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: y5.t */
/* loaded from: classes2.dex */
final class C30658t extends AbstractC30508l1 {

    /* renamed from: p */
    final /* synthetic */ C30696v f141805p;

    public C30658t(C30696v c30696v) {
        this.f141805p = c30696v;
    }

    @Override // p670y5.AbstractC30508l1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f141805p.f141905r.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // p670y5.AbstractC30508l1
    /* renamed from: d */
    final Map mo149563d() {
        return this.f141805p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C30677u(this.f141805p);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        AbstractC30374e0.m149483l(this.f141805p.f141906s, entry.getKey());
        return true;
    }
}
