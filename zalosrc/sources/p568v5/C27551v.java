package p568v5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v5.v */
/* loaded from: classes2.dex */
public final class C27551v extends AbstractC27550u {

    /* renamed from: t */
    static final AbstractC27550u f129513t = new C27551v(new Object[0], 0);

    /* renamed from: r */
    final transient Object[] f129514r;

    /* renamed from: s */
    private final transient int f129515s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C27551v(Object[] objArr, int i11) {
        this.f129514r = objArr;
        this.f129515s = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p568v5.AbstractC27547r
    /* renamed from: d */
    public final Object[] mo140753d() {
        return this.f129514r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p568v5.AbstractC27547r
    /* renamed from: e */
    public final int mo140754e() {
        return 0;
    }

    @Override // p568v5.AbstractC27547r
    /* renamed from: g */
    final int mo140755g() {
        return this.f129515s;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC27544o.m140747a(i11, this.f129515s, "index");
        return this.f129514r[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p568v5.AbstractC27547r
    /* renamed from: k */
    public final boolean mo140757k() {
        return false;
    }

    @Override // p568v5.AbstractC27550u, p568v5.AbstractC27547r
    /* renamed from: l */
    final int mo140758l(Object[] objArr, int i11) {
        System.arraycopy(this.f129514r, 0, objArr, 0, this.f129515s);
        return this.f129515s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f129515s;
    }
}
