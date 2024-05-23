package p670y5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: y5.x1 */
/* loaded from: classes2.dex */
public final class C30736x1 extends AbstractC30413g1 {

    /* renamed from: u */
    static final AbstractC30413g1 f141981u = new C30736x1(null, new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f141982s;

    /* renamed from: t */
    private final transient int f141983t;

    private C30736x1(Object obj, Object[] objArr, int i11) {
        this.f141982s = objArr;
        this.f141983t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C30736x1 m149686g(int i11, Object[] objArr, AbstractC30394f1 abstractC30394f1) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC30469j0.m149552b(obj, obj2);
        return new C30736x1(null, objArr, 1);
    }

    @Override // p670y5.AbstractC30413g1
    /* renamed from: a */
    final AbstractC30754y0 mo149506a() {
        return new C30717w1(this.f141982s, 1, this.f141983t);
    }

    @Override // p670y5.AbstractC30413g1
    /* renamed from: d */
    final AbstractC30432h1 mo149508d() {
        return new C30679u1(this, this.f141982s, 0, this.f141983t);
    }

    @Override // p670y5.AbstractC30413g1
    /* renamed from: e */
    final AbstractC30432h1 mo149509e() {
        return new C30698v1(this, new C30717w1(this.f141982s, 0, this.f141983t));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // p670y5.AbstractC30413g1, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f141982s;
        int i11 = this.f141983t;
        if (obj != null && i11 == 1) {
            Object obj3 = objArr[0];
            obj3.getClass();
            if (obj3.equals(obj)) {
                obj2 = objArr[1];
                obj2.getClass();
                if (obj2 != null) {
                    return null;
                }
                return obj2;
            }
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f141983t;
    }
}
