package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.ca */
/* loaded from: classes2.dex */
public final class C5324ca extends AbstractC5424i8 implements RandomAccess, InterfaceC5341da {

    /* renamed from: r */
    private static final C5324ca f32317r;

    /* renamed from: s */
    public static final InterfaceC5341da f32318s;

    /* renamed from: q */
    private final List f32319q;

    static {
        C5324ca c5324ca = new C5324ca(false);
        f32317r = c5324ca;
        f32318s = c5324ca;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5324ca(int i11) {
        super(true);
        ArrayList arrayList = new ArrayList(i11);
        this.f32319q = arrayList;
    }

    /* renamed from: g */
    private static String m28990g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5679x8) {
            return ((AbstractC5679x8) obj).m30023t(AbstractC5290aa.f32257b);
        }
        return AbstractC5290aa.m28885d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    /* renamed from: N */
    public final void mo28991N(AbstractC5679x8 abstractC5679x8) {
        m29211d();
        this.f32319q.add(abstractC5679x8);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, Object obj) {
        m29211d();
        this.f32319q.add(i11, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.List
    public final boolean addAll(int i11, Collection collection) {
        m29211d();
        if (collection instanceof InterfaceC5341da) {
            collection = ((InterfaceC5341da) collection).zzh();
        }
        boolean addAll = this.f32319q.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5714z9
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ InterfaceC5714z9 mo28992c(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.f32319q);
            return new C5324ca(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m29211d();
        this.f32319q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e */
    public final String get(int i11) {
        Object obj = this.f32319q.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC5679x8) {
            AbstractC5679x8 abstractC5679x8 = (AbstractC5679x8) obj;
            String m30023t = abstractC5679x8.m30023t(AbstractC5290aa.f32257b);
            if (abstractC5679x8.mo29634n()) {
                this.f32319q.set(i11, m30023t);
            }
            return m30023t;
        }
        byte[] bArr = (byte[]) obj;
        String m28885d = AbstractC5290aa.m28885d(bArr);
        if (AbstractC5292ac.m28889d(bArr)) {
            this.f32319q.set(i11, m28885d);
        }
        return m28885d;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i11) {
        m29211d();
        Object remove = this.f32319q.remove(i11);
        ((AbstractList) this).modCount++;
        return m28990g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i11, Object obj) {
        m29211d();
        return m28990g(this.f32319q.set(i11, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32319q.size();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    public final InterfaceC5341da zze() {
        if (zzc()) {
            return new C5563qb(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    public final Object zzf(int i11) {
        return this.f32319q.get(i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC5341da
    public final List zzh() {
        return Collections.unmodifiableList(this.f32319q);
    }

    private C5324ca(ArrayList arrayList) {
        super(true);
        this.f32319q = arrayList;
    }

    private C5324ca(boolean z11) {
        super(false);
        this.f32319q = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC5424i8, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
