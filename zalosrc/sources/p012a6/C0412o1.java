package p012a6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: a6.o1 */
/* loaded from: classes2.dex */
public final class C0412o1 extends AbstractC0468r0 {

    /* renamed from: u */
    static final AbstractC0468r0 f1693u = new C0412o1(null, new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f1694s;

    /* renamed from: t */
    private final transient int f1695t;

    private C0412o1(Object obj, Object[] objArr, int i11) {
        this.f1694s = objArr;
        this.f1695t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C0412o1 m791g(int i11, Object[] objArr, AbstractC0449q0 abstractC0449q0) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC0524u.m877b(obj, obj2);
        return new C0412o1(null, objArr, 1);
    }

    @Override // p012a6.AbstractC0468r0
    /* renamed from: a */
    final AbstractC0335k0 mo792a() {
        return new C0393n1(this.f1694s, 1, this.f1695t);
    }

    @Override // p012a6.AbstractC0468r0
    /* renamed from: d */
    final AbstractC0487s0 mo793d() {
        return new C0355l1(this, this.f1694s, 0, this.f1695t);
    }

    @Override // p012a6.AbstractC0468r0
    /* renamed from: e */
    final AbstractC0487s0 mo794e() {
        return new C0374m1(this, new C0393n1(this.f1694s, 0, this.f1695t));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // p012a6.AbstractC0468r0, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f1694s;
        int i11 = this.f1695t;
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
        return this.f1695t;
    }
}
