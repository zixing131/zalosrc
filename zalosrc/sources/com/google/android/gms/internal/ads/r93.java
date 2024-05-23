package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r93 extends h83 {

    /* renamed from: w */
    private static final Object[] f27143w;

    /* renamed from: x */
    static final r93 f27144x;

    /* renamed from: r */
    final transient Object[] f27145r;

    /* renamed from: s */
    private final transient int f27146s;

    /* renamed from: t */
    final transient Object[] f27147t;

    /* renamed from: u */
    private final transient int f27148u;

    /* renamed from: v */
    private final transient int f27149v;

    static {
        Object[] objArr = new Object[0];
        f27143w = objArr;
        f27144x = new r93(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r93(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f27145r = objArr;
        this.f27146s = i11;
        this.f27147t = objArr2;
        this.f27148u = i12;
        this.f27149v = i13;
    }

    @Override // com.google.android.gms.internal.ads.x73, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Object[] objArr = this.f27147t;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int m26864b = u73.m26864b(obj);
        while (true) {
            int i11 = m26864b & this.f27148u;
            Object obj2 = objArr[i11];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            m26864b = i11 + 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: d */
    public final int mo20836d(Object[] objArr, int i11) {
        System.arraycopy(this.f27145r, 0, objArr, i11, this.f27149v);
        return i11 + this.f27149v;
    }

    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: e */
    final int mo20434e() {
        return this.f27149v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: g */
    public final int mo20435g() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.h83, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27146s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return mo20837j().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.h83, com.google.android.gms.internal.ads.x73
    /* renamed from: k */
    public final ba3 mo20838k() {
        return mo20837j().listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.x73
    /* renamed from: m */
    public final Object[] mo20437m() {
        return this.f27145r;
    }

    @Override // com.google.android.gms.internal.ads.h83
    /* renamed from: p */
    final c83 mo22738p() {
        return c83.m20828s(this.f27145r, this.f27149v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f27149v;
    }

    @Override // com.google.android.gms.internal.ads.h83
    /* renamed from: w */
    final boolean mo22739w() {
        return true;
    }
}
