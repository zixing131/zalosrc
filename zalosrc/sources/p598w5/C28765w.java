package p598w5;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w5.w */
/* loaded from: classes2.dex */
public final class C28765w extends AbstractC28761s {

    /* renamed from: r */
    final transient Object f133300r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28765w(Object obj) {
        obj.getClass();
        this.f133300r = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f133300r.equals(obj);
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: d */
    final int mo143889d(Object[] objArr, int i11) {
        objArr[0] = this.f133300r;
        return 1;
    }

    @Override // p598w5.AbstractC28761s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f133300r.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C28762t(this.f133300r);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f133300r.toString() + "]";
    }
}
