package com.google.common.collect;

import p358n7.AbstractC23600d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.m */
/* loaded from: classes3.dex */
public final class C6529m extends AbstractC6521e {

    /* renamed from: r */
    final transient Object f36372r;

    /* renamed from: s */
    private transient int f36373s;

    public C6529m(Object obj) {
        this.f36372r = AbstractC23600d.m123736g(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f36372r.equals(obj);
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: d */
    int mo33408d(Object[] objArr, int i11) {
        objArr[i11] = this.f36372r;
        return i11 + 1;
    }

    @Override // com.google.common.collect.AbstractC6521e, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i11 = this.f36373s;
        if (i11 == 0) {
            int hashCode = this.f36372r.hashCode();
            this.f36373s = hashCode;
            return hashCode;
        }
        return i11;
    }

    @Override // com.google.common.collect.AbstractC6521e
    /* renamed from: p */
    AbstractC6520d mo33431p() {
        return AbstractC6520d.m33417u(this.f36372r);
    }

    @Override // com.google.common.collect.AbstractC6521e
    /* renamed from: r */
    boolean mo33432r() {
        return this.f36373s != 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f36372r.toString() + ']';
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: w */
    public AbstractC6530n iterator() {
        return AbstractC6522f.m33434b(this.f36372r);
    }

    public C6529m(Object obj, int i11) {
        this.f36372r = obj;
        this.f36373s = i11;
    }
}
