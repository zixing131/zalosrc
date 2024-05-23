package p670y5;

/* renamed from: y5.w1 */
/* loaded from: classes2.dex */
final class C30717w1 extends AbstractC30375e1 {

    /* renamed from: s */
    private final transient Object[] f141953s;

    /* renamed from: t */
    private final transient int f141954t;

    /* renamed from: u */
    private final transient int f141955u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C30717w1(Object[] objArr, int i11, int i12) {
        this.f141953s = objArr;
        this.f141954t = i11;
        this.f141955u = i12;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC30582p.m149598a(i11, this.f141955u, "index");
        Object obj = this.f141953s[i11 + i11 + this.f141954t];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f141955u;
    }
}
