package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p358n7.AbstractC23600d;

/* renamed from: com.google.common.collect.d */
/* loaded from: classes3.dex */
public abstract class AbstractC6520d extends AbstractC6519c implements List, RandomAccess {

    /* renamed from: q */
    private static final AbstractC6531o f36353q = new a(C6526j.f36363t, 0);

    /* renamed from: com.google.common.collect.d$a */
    /* loaded from: classes3.dex */
    public static class a extends AbstractC6517a {

        /* renamed from: r */
        private final AbstractC6520d f36354r;

        a(AbstractC6520d abstractC6520d, int i11) {
            super(abstractC6520d.size(), i11);
            this.f36354r = abstractC6520d;
        }

        @Override // com.google.common.collect.AbstractC6517a
        /* renamed from: a */
        protected Object mo33405a(int i11) {
            return this.f36354r.get(i11);
        }
    }

    /* renamed from: com.google.common.collect.d$b */
    /* loaded from: classes3.dex */
    static class b implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: p */
        final Object[] f36355p;

        public b(Object[] objArr) {
            this.f36355p = objArr;
        }

        Object readResolve() {
            return AbstractC6520d.m33415n(this.f36355p);
        }
    }

    /* renamed from: com.google.common.collect.d$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractC6520d {

        /* renamed from: r */
        final transient int f36356r;

        /* renamed from: s */
        final transient int f36357s;

        c(int i11, int i12) {
            this.f36356r = i11;
            this.f36357s = i12;
        }

        @Override // com.google.common.collect.AbstractC6519c
        /* renamed from: e */
        public Object[] mo33409e() {
            return AbstractC6520d.this.mo33409e();
        }

        @Override // com.google.common.collect.AbstractC6519c
        /* renamed from: g */
        int mo33410g() {
            return AbstractC6520d.this.mo33411j() + this.f36356r + this.f36357s;
        }

        @Override // java.util.List
        public Object get(int i11) {
            AbstractC23600d.m123734e(i11, this.f36357s);
            return AbstractC6520d.this.get(i11 + this.f36356r);
        }

        @Override // com.google.common.collect.AbstractC6520d, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.AbstractC6519c
        /* renamed from: j */
        public int mo33411j() {
            return AbstractC6520d.this.mo33411j() + this.f36356r;
        }

        @Override // com.google.common.collect.AbstractC6520d, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f36357s;
        }

        @Override // com.google.common.collect.AbstractC6520d, java.util.List
        /* renamed from: v */
        public AbstractC6520d subList(int i11, int i12) {
            AbstractC23600d.m123739j(i11, i12, this.f36357s);
            AbstractC6520d abstractC6520d = AbstractC6520d.this;
            int i13 = this.f36356r;
            return abstractC6520d.subList(i11 + i13, i12 + i13);
        }

        @Override // com.google.common.collect.AbstractC6520d, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i11) {
            return super.listIterator(i11);
        }
    }

    /* renamed from: k */
    static AbstractC6520d m33412k(Object[] objArr) {
        return m33413l(objArr, objArr.length);
    }

    /* renamed from: l */
    public static AbstractC6520d m33413l(Object[] objArr, int i11) {
        if (i11 == 0) {
            return m33416t();
        }
        return new C6526j(objArr, i11);
    }

    /* renamed from: m */
    private static AbstractC6520d m33414m(Object... objArr) {
        return m33412k(AbstractC6524h.m33441b(objArr));
    }

    /* renamed from: n */
    public static AbstractC6520d m33415n(Object[] objArr) {
        if (objArr.length == 0) {
            return m33416t();
        }
        return m33414m((Object[]) objArr.clone());
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: t */
    public static AbstractC6520d m33416t() {
        return C6526j.f36363t;
    }

    /* renamed from: u */
    public static AbstractC6520d m33417u(Object obj) {
        return m33414m(obj);
    }

    @Override // java.util.List
    public final void add(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractC6519c
    /* renamed from: d */
    int mo33408d(Object[] objArr, int i11) {
        int size = size();
        for (int i12 = 0; i12 < size; i12++) {
            objArr[i11 + i12] = get(i12);
        }
        return i11 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return AbstractC6523g.m33435a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i11 = 1;
        for (int i12 = 0; i12 < size; i12++) {
            i11 = ~(~((i11 * 31) + get(i12).hashCode()));
        }
        return i11;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC6523g.m33436b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return AbstractC6523g.m33438d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: p */
    public AbstractC6530n iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: r */
    public AbstractC6531o listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s */
    public AbstractC6531o listIterator(int i11) {
        AbstractC23600d.m123737h(i11, size());
        if (isEmpty()) {
            return f36353q;
        }
        return new a(this, i11);
    }

    @Override // java.util.List
    public final Object set(int i11, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: v */
    public AbstractC6520d subList(int i11, int i12) {
        AbstractC23600d.m123739j(i11, i12, size());
        int i13 = i12 - i11;
        if (i13 == size()) {
            return this;
        }
        if (i13 == 0) {
            return m33416t();
        }
        return m33422w(i11, i12);
    }

    /* renamed from: w */
    AbstractC6520d m33422w(int i11, int i12) {
        return new c(i11, i12 - i11);
    }

    @Override // com.google.common.collect.AbstractC6519c
    Object writeReplace() {
        return new b(toArray());
    }
}
