package p633x5;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: x5.s */
/* loaded from: classes.dex */
public final class C29368s extends AbstractC29356m {

    /* renamed from: u */
    static final AbstractC29356m f135858u = new C29368s(new Object[0], 0);

    /* renamed from: s */
    final transient Object[] f135859s;

    /* renamed from: t */
    private final transient int f135860t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C29368s(Object[] objArr, int i11) {
        this.f135859s = objArr;
        this.f135860t = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p633x5.AbstractC29356m, p633x5.AbstractC29350j
    /* renamed from: d */
    public final int mo146489d(Object[] objArr, int i11) {
        System.arraycopy(this.f135859s, 0, objArr, 0, this.f135860t);
        return this.f135860t;
    }

    @Override // p633x5.AbstractC29350j
    /* renamed from: e */
    final int mo146490e() {
        return this.f135860t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p633x5.AbstractC29350j
    /* renamed from: g */
    public final int mo146491g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i11) {
        AbstractC29336c.m146471a(i11, this.f135860t, "index");
        Object obj = this.f135859s[i11];
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p633x5.AbstractC29350j
    /* renamed from: j */
    public final Object[] mo146492j() {
        return this.f135859s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f135860t;
    }
}
