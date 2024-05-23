package com.google.common.collect;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.k */
/* loaded from: classes3.dex */
public final class C6527k extends AbstractC6521e {

    /* renamed from: w */
    static final C6527k f36366w = new C6527k(new Object[0], 0, null, 0, 0);

    /* renamed from: r */
    final transient Object[] f36367r;

    /* renamed from: s */
    final transient Object[] f36368s;

    /* renamed from: t */
    private final transient int f36369t;

    /* renamed from: u */
    private final transient int f36370u;

    /* renamed from: v */
    private final transient int f36371v;

    public C6527k(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f36367r = objArr;
        this.f36368s = objArr2;
        this.f36369t = i12;
        this.f36370u = i11;
        this.f36371v = i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f36368s;
        if (obj == null || objArr == null) {
            return false;
        }
        int m33407b = AbstractC6518b.m33407b(obj);
        while (true) {
            int i11 = m33407b & this.f36369t;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m33407b = i11 + 1;
        }
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: d */
    int mo33408d(Object[] objArr, int i11) {
        System.arraycopy(this.f36367r, 0, objArr, i11, this.f36371v);
        return i11 + this.f36371v;
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: e */
    public Object[] mo33409e() {
        return this.f36367r;
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: g */
    int mo33410g() {
        return this.f36371v;
    }

    @Override // com.google.common.collect.AbstractC6521e, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f36370u;
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: j */
    public int mo33411j() {
        return 0;
    }

    @Override // com.google.common.collect.AbstractC6521e
    /* renamed from: p */
    AbstractC6520d mo33431p() {
        return AbstractC6520d.m33413l(this.f36367r, this.f36371v);
    }

    @Override // com.google.common.collect.AbstractC6521e
    /* renamed from: r */
    boolean mo33432r() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f36371v;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: w */
    public AbstractC6530n iterator() {
        return m33430k().iterator();
    }
}
