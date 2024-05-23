package org.apache.commons.collections4.queue;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: org.apache.commons.collections4.queue.a */
/* loaded from: classes7.dex */
public class C24418a extends AbstractCollection implements Queue, Collection, Serializable {
    static final long serialVersionUID = -8423413834657610406L;

    /* renamed from: p */
    transient Object[] f117913p;

    /* renamed from: q */
    transient int f117914q = 0;

    /* renamed from: r */
    transient int f117915r = 0;

    /* renamed from: s */
    transient boolean f117916s = false;

    /* renamed from: t */
    final int f117917t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.apache.commons.collections4.queue.a$a */
    /* loaded from: classes7.dex */
    public class a implements Iterator {

        /* renamed from: p */
        int f117918p;

        /* renamed from: q */
        int f117919q = -1;

        /* renamed from: r */
        boolean f117920r;

        a() {
            this.f117918p = C24418a.this.f117914q;
            this.f117920r = C24418a.this.f117916s;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (!this.f117920r && this.f117918p == C24418a.this.f117915r) {
                return false;
            }
            return true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                this.f117920r = false;
                int i11 = this.f117918p;
                this.f117919q = i11;
                this.f117918p = C24418a.this.m127710e(i11);
                return C24418a.this.f117913p[this.f117919q];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            int i11;
            int i12 = this.f117919q;
            if (i12 != -1) {
                C24418a c24418a = C24418a.this;
                int i13 = c24418a.f117914q;
                if (i12 == i13) {
                    c24418a.remove();
                    this.f117919q = -1;
                    return;
                }
                int i14 = i12 + 1;
                if (i13 >= i12 || i14 >= (i11 = c24418a.f117915r)) {
                    while (true) {
                        C24418a c24418a2 = C24418a.this;
                        if (i14 == c24418a2.f117915r) {
                            break;
                        }
                        if (i14 >= c24418a2.f117917t) {
                            Object[] objArr = c24418a2.f117913p;
                            objArr[i14 - 1] = objArr[0];
                            i14 = 0;
                        } else {
                            Object[] objArr2 = c24418a2.f117913p;
                            int m127709d = c24418a2.m127709d(i14);
                            C24418a c24418a3 = C24418a.this;
                            objArr2[m127709d] = c24418a3.f117913p[i14];
                            i14 = c24418a3.m127710e(i14);
                        }
                    }
                } else {
                    Object[] objArr3 = c24418a.f117913p;
                    System.arraycopy(objArr3, i14, objArr3, i12, i11 - i14);
                }
                this.f117919q = -1;
                C24418a c24418a4 = C24418a.this;
                c24418a4.f117915r = c24418a4.m127709d(c24418a4.f117915r);
                C24418a c24418a5 = C24418a.this;
                c24418a5.f117913p[c24418a5.f117915r] = null;
                c24418a5.f117916s = false;
                this.f117918p = c24418a5.m127709d(this.f117918p);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C24418a(int i11) {
        if (i11 > 0) {
            Object[] objArr = new Object[i11];
            this.f117913p = objArr;
            this.f117917t = objArr.length;
            return;
        }
        throw new IllegalArgumentException("The size must be greater than 0");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        boolean z11;
        objectInputStream.defaultReadObject();
        this.f117913p = new Object[this.f117917t];
        int readInt = objectInputStream.readInt();
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f117913p[i11] = objectInputStream.readObject();
        }
        this.f117914q = 0;
        if (readInt == this.f117917t) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f117916s = z11;
        if (z11) {
            this.f117915r = 0;
        } else {
            this.f117915r = readInt;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Queue
    public boolean add(Object obj) {
        if (obj != null) {
            if (m127711g()) {
                remove();
            }
            Object[] objArr = this.f117913p;
            int i11 = this.f117915r;
            int i12 = i11 + 1;
            this.f117915r = i12;
            objArr[i11] = obj;
            if (i12 >= this.f117917t) {
                this.f117915r = 0;
            }
            if (this.f117915r == this.f117914q) {
                this.f117916s = true;
            }
            return true;
        }
        throw new NullPointerException("Attempted to add null object to queue");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f117916s = false;
        this.f117914q = 0;
        this.f117915r = 0;
        Arrays.fill(this.f117913p, (Object) null);
    }

    /* renamed from: d */
    int m127709d(int i11) {
        int i12 = i11 - 1;
        return i12 < 0 ? this.f117917t - 1 : i12;
    }

    /* renamed from: e */
    int m127710e(int i11) {
        int i12 = i11 + 1;
        if (i12 >= this.f117917t) {
            return 0;
        }
        return i12;
    }

    @Override // java.util.Queue
    public Object element() {
        if (!isEmpty()) {
            return peek();
        }
        throw new NoSuchElementException("queue is empty");
    }

    /* renamed from: g */
    boolean m127711g() {
        if (size() == this.f117917t) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // java.util.Queue
    public boolean offer(Object obj) {
        return add(obj);
    }

    @Override // java.util.Queue
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return this.f117913p[this.f117914q];
    }

    @Override // java.util.Queue
    public Object poll() {
        if (isEmpty()) {
            return null;
        }
        return remove();
    }

    @Override // java.util.Queue
    public Object remove() {
        if (!isEmpty()) {
            Object[] objArr = this.f117913p;
            int i11 = this.f117914q;
            Object obj = objArr[i11];
            if (obj != null) {
                int i12 = i11 + 1;
                this.f117914q = i12;
                objArr[i11] = null;
                if (i12 >= this.f117917t) {
                    this.f117914q = 0;
                }
                this.f117916s = false;
            }
            return obj;
        }
        throw new NoSuchElementException("queue is empty");
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        int i11 = this.f117915r;
        int i12 = this.f117914q;
        if (i11 < i12) {
            return (this.f117917t - i12) + i11;
        }
        if (i11 != i12) {
            return i11 - i12;
        }
        if (this.f117916s) {
            return this.f117917t;
        }
        return 0;
    }
}
