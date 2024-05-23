package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class gv3 extends ws3 implements RandomAccess, hv3 {

    /* renamed from: r */
    private static final gv3 f20921r;

    /* renamed from: s */
    public static final hv3 f20922s;

    /* renamed from: q */
    private final List f20923q;

    static {
        gv3 gv3Var = new gv3(10);
        f20921r = gv3Var;
        gv3Var.zzb();
        f20922s = gv3Var;
    }

    public gv3(int i11) {
        this.f20923q = new ArrayList(i11);
    }

    /* renamed from: g */
    private static String m22618g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof mt3) {
            return ((mt3) obj).m24735d(dv3.f19426b);
        }
        return dv3.m21553h((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.hv3
    /* renamed from: R */
    public final void mo21565R(mt3 mt3Var) {
        m27712d();
        this.f20923q.add(mt3Var);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        m27712d();
        this.f20923q.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        m27712d();
        if (collection instanceof hv3) {
            collection = ((hv3) collection).zzh();
        }
        boolean addAll = this.f20923q.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.cv3
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ cv3 mo21159c(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.f20923q);
            return new gv3(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m27712d();
        this.f20923q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i11) {
        Object obj = this.f20923q.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof mt3) {
            mt3 mt3Var = (mt3) obj;
            String m24735d = mt3Var.m24735d(dv3.f19426b);
            if (mt3Var.mo23394C()) {
                this.f20923q.set(i11, m24735d);
            }
            return m24735d;
        }
        byte[] bArr = (byte[]) obj;
        String m21553h = dv3.m21553h(bArr);
        if (dv3.m21554i(bArr)) {
            this.f20923q.set(i11, m21553h);
        }
        return m21553h;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m27712d();
        Object remove = this.f20923q.remove(i11);
        ((AbstractList) this).modCount++;
        return m22618g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        m27712d();
        return m22618g(this.f20923q.set(i11, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f20923q.size();
    }

    @Override // com.google.android.gms.internal.ads.hv3
    public final hv3 zze() {
        if (zzc()) {
            return new dx3(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.hv3
    public final Object zzf(int i11) {
        return this.f20923q.get(i11);
    }

    @Override // com.google.android.gms.internal.ads.hv3
    public final List zzh() {
        return Collections.unmodifiableList(this.f20923q);
    }

    private gv3(ArrayList arrayList) {
        this.f20923q = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.ws3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
