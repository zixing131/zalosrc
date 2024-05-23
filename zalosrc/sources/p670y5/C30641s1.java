package p670y5;

/* renamed from: y5.s1 */
/* loaded from: classes.dex */
public final class C30641s1 extends AbstractC30375e1 {

    /* renamed from: u */
    static final AbstractC30375e1 f141760u = new C30641s1(new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f141761s;

    /* renamed from: t */
    private final transient int f141762t;

    public C30641s1(Object[] objArr, int i11) {
        this.f141761s = objArr;
        this.f141762t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p670y5.AbstractC30375e1, p670y5.AbstractC30754y0
    /* renamed from: d */
    public final int mo149494d(Object[] objArr, int i11) {
        System.arraycopy(this.f141761s, 0, objArr, i11, this.f141762t);
        return i11 + this.f141762t;
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: e */
    final int mo149475e() {
        return this.f141762t;
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: g */
    public final int mo149476g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC30582p.m149598a(i11, this.f141762t, "index");
        Object obj = this.f141761s[i11];
        obj.getClass();
        return obj;
    }

    @Override // p670y5.AbstractC30754y0
    /* renamed from: j */
    public final Object[] mo149477j() {
        return this.f141761s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f141762t;
    }
}
