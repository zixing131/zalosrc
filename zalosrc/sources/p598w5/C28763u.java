package p598w5;

/* renamed from: w5.u */
/* loaded from: classes2.dex */
public final class C28763u extends AbstractC28759q {

    /* renamed from: u */
    static final AbstractC28759q f133290u = new C28763u(new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f133291s;

    /* renamed from: t */
    private final transient int f133292t;

    public C28763u(Object[] objArr, int i11) {
        this.f133291s = objArr;
        this.f133292t = i11;
    }

    @Override // p598w5.AbstractC28759q, p598w5.AbstractC28756n
    /* renamed from: d */
    final int mo143889d(Object[] objArr, int i11) {
        System.arraycopy(this.f133291s, 0, objArr, 0, this.f133292t);
        return this.f133292t;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: e */
    final int mo143890e() {
        return this.f133292t;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: g */
    public final int mo143891g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC28752j.m143882a(i11, this.f133292t, "index");
        Object obj = this.f133291s[i11];
        obj.getClass();
        return obj;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: j */
    public final Object[] mo143892j() {
        return this.f133291s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f133292t;
    }
}
