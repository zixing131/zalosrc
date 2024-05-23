package p705z5;

/* renamed from: z5.vc */
/* loaded from: classes2.dex */
final class C31602vc extends AbstractC31476mc {

    /* renamed from: r */
    private final transient Object[] f145313r;

    /* renamed from: s */
    private final transient int f145314s;

    /* renamed from: t */
    private final transient int f145315t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C31602vc(Object[] objArr, int i11, int i12) {
        this.f145313r = objArr;
        this.f145314s = i11;
        this.f145315t = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC31370f4.m152224a(i11, this.f145315t, "index");
        Object obj = this.f145313r[i11 + i11 + this.f145314s];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f145315t;
    }
}
