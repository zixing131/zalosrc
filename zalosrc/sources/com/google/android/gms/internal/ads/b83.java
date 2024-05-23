package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class b83 extends c83 {

    /* renamed from: r */
    final transient int f17668r;

    /* renamed from: s */
    final transient int f17669s;

    /* renamed from: t */
    final /* synthetic */ c83 f17670t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b83(c83 c83Var, int i11, int i12) {
        this.f17670t = c83Var;
        this.f17668r = i11;
        this.f17669s = i12;
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: e */
    final int mo20434e() {
        return this.f17670t.mo20435g() + this.f17668r + this.f17669s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: g */
    public final int mo20435g() {
        return this.f17670t.mo20435g() + this.f17668r;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        j53.m23531a(i11, this.f17669s, "index");
        return this.f17670t.get(i11 + this.f17668r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: l */
    public final boolean mo20436l() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: m */
    public final Object[] mo20437m() {
        return this.f17670t.mo20437m();
    }

    @Override // com.google.android.gms.internal.ads.c83
    /* renamed from: n */
    public final c83 subList(int i11, int i12) {
        j53.m23537g(i11, i12, this.f17669s);
        c83 c83Var = this.f17670t;
        int i13 = this.f17668r;
        return c83Var.subList(i11 + i13, i12 + i13);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f17669s;
    }

    @Override // com.google.android.gms.internal.ads.c83, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i11, int i12) {
        return subList(i11, i12);
    }
}
