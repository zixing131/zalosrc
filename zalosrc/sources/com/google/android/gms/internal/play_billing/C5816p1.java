package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.play_billing.p1 */
/* loaded from: classes2.dex */
public final class C5816p1 extends AbstractC5874z implements RandomAccess, InterfaceC5822q1 {

    /* renamed from: r */
    private static final C5816p1 f33405r;

    /* renamed from: s */
    public static final InterfaceC5822q1 f33406s;

    /* renamed from: q */
    private final List f33407q;

    static {
        C5816p1 c5816p1 = new C5816p1(false);
        f33405r = c5816p1;
        f33406s = c5816p1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5816p1(int i11) {
        super(true);
        ArrayList arrayList = new ArrayList(i11);
        this.f33407q = arrayList;
    }

    /* renamed from: g */
    private static String m30426g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5803n0) {
            return ((AbstractC5803n0) obj).m30374t(AbstractC5804n1.f33376b);
        }
        return AbstractC5804n1.m30378d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        m30580d();
        this.f33407q.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5874z, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        m30580d();
        if (collection instanceof InterfaceC5822q1) {
            collection = ((InterfaceC5822q1) collection).zzh();
        }
        boolean addAll = this.f33407q.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5798m1
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC5798m1 mo30360c(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.f33407q);
            return new C5816p1(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m30580d();
        this.f33407q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i11) {
        Object obj = this.f33407q.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5803n0) {
            AbstractC5803n0 abstractC5803n0 = (AbstractC5803n0) obj;
            String m30374t = abstractC5803n0.m30374t(AbstractC5804n1.f33376b);
            if (abstractC5803n0.mo30312n()) {
                this.f33407q.set(i11, m30374t);
            }
            return m30374t;
        }
        byte[] bArr = (byte[]) obj;
        String m30378d = AbstractC5804n1.m30378d(bArr);
        if (AbstractC5800m3.m30365d(bArr)) {
            this.f33407q.set(i11, m30378d);
        }
        return m30378d;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC5874z, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m30580d();
        Object remove = this.f33407q.remove(i11);
        ((AbstractList) this).modCount++;
        return m30426g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        m30580d();
        return m30426g(this.f33407q.set(i11, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33407q.size();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5822q1
    public final InterfaceC5822q1 zze() {
        if (zzc()) {
            return new C5739c3(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5822q1
    public final Object zzf(int i11) {
        return this.f33407q.get(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5822q1
    public final List zzh() {
        return Collections.unmodifiableList(this.f33407q);
    }

    private C5816p1(ArrayList arrayList) {
        super(true);
        this.f33407q = arrayList;
    }

    private C5816p1(boolean z11) {
        super(false);
        this.f33407q = Collections.emptyList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
