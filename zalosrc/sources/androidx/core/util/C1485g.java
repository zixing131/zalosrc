package androidx.core.util;

/* renamed from: androidx.core.util.g */
/* loaded from: classes.dex */
public class C1485g implements InterfaceC1484f {

    /* renamed from: a */
    private final Object[] f6376a;

    /* renamed from: b */
    private int f6377b;

    public C1485g(int i11) {
        if (i11 > 0) {
            this.f6376a = new Object[i11];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    /* renamed from: c */
    private boolean m7485c(Object obj) {
        for (int i11 = 0; i11 < this.f6377b; i11++) {
            if (this.f6376a[i11] == obj) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.util.InterfaceC1484f
    /* renamed from: a */
    public boolean mo7483a(Object obj) {
        if (!m7485c(obj)) {
            int i11 = this.f6377b;
            Object[] objArr = this.f6376a;
            if (i11 < objArr.length) {
                objArr[i11] = obj;
                this.f6377b = i11 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override // androidx.core.util.InterfaceC1484f
    /* renamed from: b */
    public Object mo7484b() {
        int i11 = this.f6377b;
        if (i11 <= 0) {
            return null;
        }
        int i12 = i11 - 1;
        Object[] objArr = this.f6376a;
        Object obj = objArr[i12];
        objArr[i12] = null;
        this.f6377b = i11 - 1;
        return obj;
    }
}
