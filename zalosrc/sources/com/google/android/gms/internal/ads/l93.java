package com.google.android.gms.internal.ads;

import java.util.AbstractMap;

/* loaded from: classes2.dex */
final class l93 extends c83 {

    /* renamed from: r */
    final /* synthetic */ m93 f23797r;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l93(m93 m93Var) {
        this.f23797r = m93Var;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i11) {
        int i12;
        Object[] objArr;
        Object[] objArr2;
        i12 = this.f23797r.f24442t;
        j53.m23531a(i11, i12, "index");
        m93 m93Var = this.f23797r;
        int i13 = i11 + i11;
        objArr = m93Var.f24441s;
        Object obj = objArr[i13];
        obj.getClass();
        objArr2 = m93Var.f24441s;
        Object obj2 = objArr2[i13 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: l */
    public final boolean mo20436l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i11;
        i11 = this.f23797r.f24442t;
        return i11;
    }
}
