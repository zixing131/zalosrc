package p705z5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: z5.wc */
/* loaded from: classes2.dex */
public final class C31616wc extends AbstractC31504oc {

    /* renamed from: u */
    static final AbstractC31504oc f145370u = new C31616wc(null, new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f145371s;

    /* renamed from: t */
    private final transient int f145372t;

    private C31616wc(Object obj, Object[] objArr, int i11) {
        this.f145371s = objArr;
        this.f145372t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static C31616wc m152363g(int i11, Object[] objArr, AbstractC31490nc abstractC31490nc) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        AbstractC31415i7.m152250a(obj, obj2);
        return new C31616wc(null, objArr, 1);
    }

    @Override // p705z5.AbstractC31504oc
    /* renamed from: a */
    final AbstractC31460la mo152331a() {
        return new C31602vc(this.f145371s, 1, this.f145372t);
    }

    @Override // p705z5.AbstractC31504oc
    /* renamed from: d */
    final AbstractC31518pc mo152333d() {
        return new C31574tc(this, this.f145371s, 0, this.f145372t);
    }

    @Override // p705z5.AbstractC31504oc
    /* renamed from: e */
    final AbstractC31518pc mo152334e() {
        return new C31588uc(this, new C31602vc(this.f145371s, 0, this.f145372t));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x001f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020 A[RETURN] */
    @Override // p705z5.AbstractC31504oc, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        Object[] objArr = this.f145371s;
        int i11 = this.f145372t;
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
        return this.f145372t;
    }
}
