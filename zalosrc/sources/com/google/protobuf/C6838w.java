package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.w */
/* loaded from: classes3.dex */
public class C6838w extends AbstractC6790c implements InterfaceC6840x, RandomAccess {

    /* renamed from: r */
    private static final C6838w f37507r;

    /* renamed from: s */
    public static final InterfaceC6840x f37508s;

    /* renamed from: q */
    private final List f37509q;

    static {
        C6838w c6838w = new C6838w();
        f37507r = c6838w;
        c6838w.mo34740o();
        f37508s = c6838w;
    }

    public C6838w() {
        this(10);
    }

    /* renamed from: g */
    private static String m35154g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6799f) {
            return ((AbstractC6799f) obj).m34809z();
        }
        return AbstractC6830s.m35138j((byte[]) obj);
    }

    @Override // com.google.protobuf.AbstractC6790c, com.google.protobuf.AbstractC6830s.e
    /* renamed from: O */
    public /* bridge */ /* synthetic */ boolean mo34738O() {
        return super.mo34738O();
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m34739d();
        this.f37509q.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void add(int i11, String str) {
        m34739d();
        this.f37509q.add(i11, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String get(int i11) {
        Object obj = this.f37509q.get(i11);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC6799f) {
            AbstractC6799f abstractC6799f = (AbstractC6799f) obj;
            String m34809z = abstractC6799f.m34809z();
            if (abstractC6799f.mo34801n()) {
                this.f37509q.set(i11, m34809z);
            }
            return m34809z;
        }
        byte[] bArr = (byte[]) obj;
        String m35138j = AbstractC6830s.m35138j(bArr);
        if (AbstractC6830s.m35135g(bArr)) {
            this.f37509q.set(i11, m35138j);
        }
        return m35138j;
    }

    @Override // com.google.protobuf.AbstractC6830s.e, com.google.protobuf.AbstractC6830s.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public C6838w mo35124h(int i11) {
        if (i11 >= size()) {
            ArrayList arrayList = new ArrayList(i11);
            arrayList.addAll(this.f37509q);
            return new C6838w(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String remove(int i11) {
        m34739d();
        Object remove = this.f37509q.remove(i11);
        ((AbstractList) this).modCount++;
        return m35154g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public String set(int i11, String str) {
        m34739d();
        return m35154g(this.f37509q.set(i11, str));
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: q */
    public void mo34820q(AbstractC6799f abstractC6799f) {
        m34739d();
        this.f37509q.add(abstractC6799f);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: r0 */
    public InterfaceC6840x mo34821r0() {
        if (mo34738O()) {
            return new C6801f1(this);
        }
        return this;
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37509q.size();
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: y */
    public List mo34822y() {
        return Collections.unmodifiableList(this.f37509q);
    }

    @Override // com.google.protobuf.InterfaceC6840x
    /* renamed from: z0 */
    public Object mo34823z0(int i11) {
        return this.f37509q.get(i11);
    }

    public C6838w(int i11) {
        this(new ArrayList(i11));
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractList, java.util.List
    public boolean addAll(int i11, Collection collection) {
        m34739d();
        if (collection instanceof InterfaceC6840x) {
            collection = ((InterfaceC6840x) collection).mo34822y();
        }
        boolean addAll = this.f37509q.addAll(i11, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.protobuf.AbstractC6790c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    private C6838w(ArrayList arrayList) {
        this.f37509q = arrayList;
    }
}
