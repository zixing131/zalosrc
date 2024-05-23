package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class p93 extends c83 {

    /* renamed from: r */
    private final transient Object[] f26139r;

    /* renamed from: s */
    private final transient int f26140s;

    /* renamed from: t */
    private final transient int f26141t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p93(Object[] objArr, int i11, int i12) {
        this.f26139r = objArr;
        this.f26140s = i11;
        this.f26141t = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        j53.m23531a(i11, this.f26141t, "index");
        Object obj = this.f26139r[i11 + i11 + this.f26140s];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: l */
    public final boolean mo20436l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f26141t;
    }
}
