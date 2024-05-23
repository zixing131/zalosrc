package p633x5;

/* renamed from: x5.w */
/* loaded from: classes2.dex */
final class C29376w extends AbstractC29356m {

    /* renamed from: s */
    private final transient Object[] f135871s;

    /* renamed from: t */
    private final transient int f135872t;

    /* renamed from: u */
    private final transient int f135873u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29376w(Object[] objArr, int i11, int i12) {
        this.f135871s = objArr;
        this.f135872t = i11;
        this.f135873u = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC29336c.m146471a(i11, this.f135873u, "index");
        Object obj = this.f135871s[i11 + i11 + this.f135872t];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f135873u;
    }
}
