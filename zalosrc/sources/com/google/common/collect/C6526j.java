package com.google.common.collect;

import p358n7.AbstractC23600d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.common.collect.j */
/* loaded from: classes3.dex */
public class C6526j extends AbstractC6520d {

    /* renamed from: t */
    static final AbstractC6520d f36363t = new C6526j(new Object[0], 0);

    /* renamed from: r */
    final transient Object[] f36364r;

    /* renamed from: s */
    private final transient int f36365s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6526j(Object[] objArr, int i11) {
        this.f36364r = objArr;
        this.f36365s = i11;
    }

    @Override // com.google.common.collect.AbstractC6520d, com.google.common.collect.AbstractC6519c
    /* renamed from: d */
    int mo33408d(Object[] objArr, int i11) {
        System.arraycopy(this.f36364r, 0, objArr, i11, this.f36365s);
        return i11 + this.f36365s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: e */
    public Object[] mo33409e() {
        return this.f36364r;
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: g */
    int mo33410g() {
        return this.f36365s;
    }

    @Override // java.util.List
    public Object get(int i11) {
        AbstractC23600d.m123734e(i11, this.f36365s);
        return this.f36364r[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: j */
    public int mo33411j() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f36365s;
    }
}
