package p012a6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.j1 */
/* loaded from: classes.dex */
public final class C0317j1 extends AbstractC0430p0 {

    /* renamed from: u */
    static final AbstractC0430p0 f1515u = new C0317j1(new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f1516s;

    /* renamed from: t */
    private final transient int f1517t;

    public C0317j1(Object[] objArr, int i11) {
        this.f1516s = objArr;
        this.f1517t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p012a6.AbstractC0430p0, p012a6.AbstractC0335k0
    /* renamed from: d */
    public final int mo768d(Object[] objArr, int i11) {
        System.arraycopy(this.f1516s, 0, objArr, 0, this.f1517t);
        return this.f1517t;
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: e */
    final int mo769e() {
        return this.f1517t;
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: g */
    public final int mo770g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC0163b.m617a(i11, this.f1517t, "index");
        Object obj = this.f1516s[i11];
        obj.getClass();
        return obj;
    }

    @Override // p012a6.AbstractC0335k0
    /* renamed from: j */
    public final Object[] mo771j() {
        return this.f1516s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1517t;
    }
}
