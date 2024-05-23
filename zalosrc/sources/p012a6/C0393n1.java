package p012a6;

/* renamed from: a6.n1 */
/* loaded from: classes2.dex */
final class C0393n1 extends AbstractC0430p0 {

    /* renamed from: s */
    private final transient Object[] f1656s;

    /* renamed from: t */
    private final transient int f1657t;

    /* renamed from: u */
    private final transient int f1658u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0393n1(Object[] objArr, int i11, int i12) {
        this.f1656s = objArr;
        this.f1657t = i11;
        this.f1658u = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC0163b.m617a(i11, this.f1658u, "index");
        Object obj = this.f1656s[i11 + i11 + this.f1657t];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1658u;
    }
}
