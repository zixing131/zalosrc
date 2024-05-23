package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.z */
/* loaded from: classes2.dex */
abstract class AbstractC5874z extends AbstractList implements InterfaceC5798m1 {

    /* renamed from: p */
    private boolean f33458p;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC5874z(boolean z11) {
        this.f33458p = z11;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        m30580d();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract boolean addAll(int i11, Collection collection);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: d */
    public final void m30580d() {
        if (this.f33458p) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i11 = 0; i11 < size; i11++) {
            if (!get(i11).equals(list.get(i11))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = (i11 * 31) + get(i12).hashCode();
        }
        return i11;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract Object remove(int i11);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m30580d();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m30580d();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m30580d();
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5798m1
    public final void zzb() {
        if (this.f33458p) {
            this.f33458p = false;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5798m1
    public final boolean zzc() {
        return this.f33458p;
    }
}
