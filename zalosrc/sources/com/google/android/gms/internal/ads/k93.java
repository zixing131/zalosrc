package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class k93 extends c83 {

    /* renamed from: t */
    static final c83 f23194t = new k93(new Object[0], 0);

    /* renamed from: r */
    final transient Object[] f23195r;

    /* renamed from: s */
    private final transient int f23196s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k93(Object[] objArr, int i11) {
        this.f23195r = objArr;
        this.f23196s = i11;
    }

    @Override // com.google.android.gms.internal.ads.c83, com.google.android.gms.internal.ads.x73
    /* renamed from: d */
    final int mo20836d(Object[] objArr, int i11) {
        System.arraycopy(this.f23195r, 0, objArr, i11, this.f23196s);
        return i11 + this.f23196s;
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: e */
    final int mo20434e() {
        return this.f23196s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: g */
    public final int mo20435g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        j53.m23531a(i11, this.f23196s, "index");
        Object obj = this.f23195r[i11];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: l */
    public final boolean mo20436l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: m */
    public final Object[] mo20437m() {
        return this.f23195r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23196s;
    }
}
