package p598w5;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: w5.v */
/* loaded from: classes2.dex */
public final class C28764v extends AbstractC28761s {

    /* renamed from: w */
    private static final Object[] f133293w;

    /* renamed from: x */
    static final C28764v f133294x;

    /* renamed from: r */
    final transient Object[] f133295r;

    /* renamed from: s */
    private final transient int f133296s;

    /* renamed from: t */
    final transient Object[] f133297t;

    /* renamed from: u */
    private final transient int f133298u;

    /* renamed from: v */
    private final transient int f133299v;

    static {
        Object[] objArr = new Object[0];
        f133293w = objArr;
        f133294x = new C28764v(objArr, 0, objArr, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C28764v(Object[] objArr, int i11, Object[] objArr2, int i12, int i13) {
        this.f133295r = objArr;
        this.f133296s = i11;
        this.f133297t = objArr2;
        this.f133298u = i12;
        this.f133299v = i13;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f133297t;
            if (objArr.length != 0) {
                int m143888a = AbstractC28755m.m143888a(obj.hashCode());
                while (true) {
                    int i11 = m143888a & this.f133298u;
                    Object obj2 = objArr[i11];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    m143888a = i11 + 1;
                }
            }
        }
        return false;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: d */
    final int mo143889d(Object[] objArr, int i11) {
        System.arraycopy(this.f133295r, 0, objArr, 0, this.f133299v);
        return this.f133299v;
    }

    @Override // p598w5.AbstractC28756n
    /* renamed from: e */
    final int mo143890e() {
        return this.f133299v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p598w5.AbstractC28756n
    /* renamed from: g */
    public final int mo143891g() {
        return 0;
    }

    @Override // p598w5.AbstractC28761s, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f133296s;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return m143899l().listIterator(0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p598w5.AbstractC28756n
    /* renamed from: j */
    public final Object[] mo143892j() {
        return this.f133295r;
    }

    @Override // p598w5.AbstractC28761s
    /* renamed from: m */
    final AbstractC28759q mo143900m() {
        return AbstractC28759q.m143894l(this.f133295r, this.f133299v);
    }

    @Override // p598w5.AbstractC28761s
    /* renamed from: p */
    final boolean mo143901p() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f133299v;
    }
}
