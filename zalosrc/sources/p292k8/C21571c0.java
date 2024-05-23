package p292k8;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: k8.c0 */
/* loaded from: classes.dex */
public final class C21571c0 implements List, RandomAccess {

    /* renamed from: p */
    private final List f104761p;

    private C21571c0(List list) {
        this.f104761p = Collections.unmodifiableList(list);
    }

    /* renamed from: d */
    public static C21571c0 m111495d(List list) {
        return new C21571c0(list);
    }

    /* renamed from: e */
    public static C21571c0 m111496e(Object... objArr) {
        return new C21571c0(Arrays.asList(objArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f104761p.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.f104761p.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f104761p.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f104761p.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f104761p.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f104761p.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i11) {
        return this.f104761p.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f104761p.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f104761p.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f104761p.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f104761p.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f104761p.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f104761p.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f104761p.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.f104761p.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.f104761p.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i11, Object obj) {
        return this.f104761p.set(i11, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f104761p.size();
    }

    @Override // java.util.List
    public List subList(int i11, int i12) {
        return this.f104761p.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f104761p.toArray();
    }

    @Override // java.util.List
    public void add(int i11, Object obj) {
        this.f104761p.add(i11, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection collection) {
        return this.f104761p.addAll(i11, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i11) {
        return this.f104761p.listIterator(i11);
    }

    @Override // java.util.List
    public Object remove(int i11) {
        return this.f104761p.remove(i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f104761p.toArray(objArr);
    }
}
