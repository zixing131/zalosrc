package p705z5;

/* renamed from: z5.rc */
/* loaded from: classes.dex */
public final class C31546rc extends AbstractC31476mc {

    /* renamed from: t */
    static final AbstractC31476mc f145099t = new C31546rc(new Object[0], 0);

    /* renamed from: r */
    final transient Object[] f145100r;

    /* renamed from: s */
    private final transient int f145101s;

    public C31546rc(Object[] objArr, int i11) {
        this.f145100r = objArr;
        this.f145101s = i11;
    }

    @Override // p705z5.AbstractC31476mc, p705z5.AbstractC31460la
    /* renamed from: d */
    public final int mo152300d(Object[] objArr, int i11) {
        System.arraycopy(this.f145100r, 0, objArr, 0, this.f145101s);
        return this.f145101s;
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: e */
    final int mo152301e() {
        return this.f145101s;
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: g */
    public final int mo152302g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC31370f4.m152224a(i11, this.f145101s, "index");
        Object obj = this.f145100r[i11];
        obj.getClass();
        return obj;
    }

    @Override // p705z5.AbstractC31460la
    /* renamed from: j */
    public final Object[] mo152303j() {
        return this.f145100r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f145101s;
    }
}
